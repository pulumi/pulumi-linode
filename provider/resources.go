// Copyright 2016-2018, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package linode

import (
	"context"
	"fmt"
	"path/filepath"
	"regexp"
	"unicode"

	// embed is used to store bridge-metadata.json in the compiled binary
	_ "embed"

	"github.com/linode/terraform-provider-linode/linode"

	pfbridge "github.com/pulumi/pulumi-terraform-bridge/pf/tfbridge"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	tfbridgetokens "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge/tokens"
	shimv2 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v2"
	"github.com/pulumi/pulumi/sdk/v3/go/common/tokens"

	"github.com/pulumi/pulumi-linode/provider/v4/pkg/version"
)

// all of the token components used below.
const (
	// packages:
	mainPkg = "linode"
	// modules:
	mainMod = "index" // the y module
)

// makeMember manufactures a type token for the package and the given module and type.
func makeMember(mod string, mem string) tokens.ModuleMember {
	return tokens.ModuleMember(mainPkg + ":" + mod + ":" + mem)
}

// makeType manufactures a type token for the package and the given module and type.
func makeType(mod string, typ string) tokens.Type {
	return tokens.Type(makeMember(mod, typ))
}

// makeDataSource manufactures a standard resource token given a module and resource name.  It
// automatically uses the main package and names the file by simply lower casing the data source's
// first character.
func makeDataSource(mod string, res string) tokens.ModuleMember {
	fn := string(unicode.ToLower(rune(res[0]))) + res[1:]
	return makeMember(mod+"/"+fn, res)
}

// makeResource manufactures a standard resource token given a module and resource name.  It
// automatically uses the main package and names the file by simply lower casing the resource's
// first character.
func makeResource(mod string, res string) tokens.Type {
	fn := string(unicode.ToLower(rune(res[0]))) + res[1:]
	return makeType(mod+"/"+fn, res)
}

func stripTfFromDocs() tfbridge.DocsEdit {
	// Lots of docs have a "The Linode Guide, [Deploy a ... Using Terraform](...)" line. We
	// don't want to include those blocks in our documentation, since they link to a TF guide
	// which won't help our users.
	linodeGuide := regexp.MustCompile("The Linode Guide[^\n]*[tT]erraform[^\n]*\n\n?")

	// There are also a bunch of phrases that appear in the downstream docs that we
	// know how to replace.
	state := regexp.MustCompile("in [tT]erraform state")
	thisProvider := regexp.MustCompile("this Terraform Provider")
	provisioners := regexp.MustCompile("Linode Instances can also use provisioners.\n\n?")
	suchAs := regexp.MustCompile(", such as [tT]erraform,")
	inTf := regexp.MustCompile("in Terraform.")
	itself := regexp.MustCompile("for Terraform itself")
	return tfbridge.DocsEdit{
		Path: "*",
		Edit: func(_ string, b []byte) ([]byte, error) {
			b = linodeGuide.ReplaceAllLiteral(b, nil)
			b = provisioners.ReplaceAllLiteral(b, nil)
			b = thisProvider.ReplaceAllLiteral(b, []byte("this provider"))
			b = state.ReplaceAllLiteral(b, []byte("in Pulumi state"))
			b = suchAs.ReplaceAllLiteral(b, []byte(", such as Pulumi,"))
			b = inTf.ReplaceAllLiteral(b, []byte("in the provider"))
			b = itself.ReplaceAllLiteral(b, []byte("for the provider itself"))
			return b, nil
		},
	}
}

// Provider returns additional overlaid schema and metadata associated with the provider..
func Provider() tfbridge.ProviderInfo {
	// Instantiate the Terraform provider
	p := pfbridge.MuxShimWithPF(context.Background(),
		shimv2.NewProvider(linode.Provider()),
		linode.CreateFrameworkProvider(version.Version),
	)

	// Create a Pulumi provider mapping
	prov := tfbridge.ProviderInfo{
		P:                p,
		Name:             "linode",
		Description:      "A Pulumi package for creating and managing linode cloud resources.",
		Keywords:         []string{"pulumi", "linode"},
		License:          "Apache-2.0",
		Homepage:         "https://pulumi.io",
		Repository:       "https://github.com/pulumi/pulumi-linode",
		GitHubOrg:        "linode",
		UpstreamRepoPath: "./upstream",
		Version:          version.Version,
		DocRules: &tfbridge.DocRuleInfo{
			EditRules: func(defaults []tfbridge.DocsEdit) []tfbridge.DocsEdit {
				return append(defaults, stripTfFromDocs())
			},
		},

		Config: map[string]*tfbridge.SchemaInfo{
			"url": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"LINODE_URL"},
				},
			},
			"ua_prefix": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"LINODE_UA_PREFIX"},
				},
			},
			"api_version": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"LINODE_API_VERSION"},
				},
			},
		},
		IgnoreMappings: []string{
			"linode_instance_config", // Mapping causes a panic due to duplicate types
		},
		Resources: map[string]*tfbridge.ResourceInfo{
			"linode_domain": {
				Fields: map[string]*tfbridge.SchemaInfo{
					"domain": {
						CSharpName: "DomainName",
					},
				},
			},
			"linode_nodebalancer": {
				Tok: makeResource(mainMod, "NodeBalancer"),
			},
			"linode_nodebalancer_config": {
				Tok: makeResource(mainMod, "NodeBalancerConfig"),
			},
			"linode_nodebalancer_node": {
				Tok: makeResource(mainMod, "NodeBalancerNode"),
			},
			"linode_rdns": {
				Fields: map[string]*tfbridge.SchemaInfo{
					"rdns": {CSharpName: "RdnsName"},
				},
			},
			"linode_sshkey": {
				Tok: makeResource(mainMod, "SshKey"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"ssh_key": {CSharpName: "SshKeyName"},
				},
			},
			"linode_stackscript": {
				Tok: makeResource(mainMod, "StackScript"),
			},
			"linode_token": {
				Fields: map[string]*tfbridge.SchemaInfo{
					"token": {CSharpName: "ApiToken"},
				},
			},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			"linode_sshkey":              {Tok: makeDataSource(mainMod, "getSshKey")},
			"linode_stackscript":         {Tok: makeDataSource(mainMod, "getStackScript")},
			"linode_nodebalancer":        {Tok: makeDataSource(mainMod, "getNodeBalancer")},
			"linode_nodebalancer_config": {Tok: makeDataSource(mainMod, "getNodeBalancerConfig")},
			"linode_nodebalancer_node":   {Tok: makeDataSource(mainMod, "getNodeBalancerNode")},
			"linode_stackscripts":        {Tok: makeDataSource(mainMod, "getStackScripts")},
			"linode_object_storage_bucket": {
				Tok:  makeDataSource(mainMod, "getLinodeObjectStorageBucket"),
				Docs: &tfbridge.DocInfo{Markdown: []byte{' '}},
			},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			Dependencies: map[string]string{
				"@pulumi/pulumi": "^3.0.0",
			},
			DevDependencies: map[string]string{
				"@types/node": "^10.0.0", // so we can access strongly typed node definitions.
				"@types/mime": "^2.0.0",
			},
		},
		Python: (func() *tfbridge.PythonInfo {
			i := &tfbridge.PythonInfo{
				Requires: map[string]string{
					"pulumi": ">=3.0.0,<4.0.0",
				}}
			i.PyProject.Enabled = true
			return i
		})(),

		Golang: &tfbridge.GolangInfo{
			ImportBasePath: filepath.Join(
				fmt.Sprintf("github.com/pulumi/pulumi-%[1]s/sdk/", mainPkg),
				tfbridge.GetModuleMajorVersion(version.Version),
				"go",
				mainPkg,
			),
			GenerateResourceContainerTypes: true,
		},
		CSharp: &tfbridge.CSharpInfo{
			PackageReferences: map[string]string{
				"Pulumi": "3.*",
			},
			Namespaces: map[string]string{
				mainPkg: "Linode",
			},
		},
		MetadataInfo: tfbridge.NewProviderMetadata(metadata),
	}

	prov.MustComputeTokens(tfbridgetokens.SingleModule(
		"linode_", mainMod, tfbridgetokens.MakeStandard(mainPkg)))
	prov.MustApplyAutoAliases()

	return prov
}

//go:embed cmd/pulumi-resource-linode/bridge-metadata.json
var metadata []byte
