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
	"path"
	"regexp"

	// embed is used to store bridge-metadata.json in the compiled binary
	_ "embed"

	"github.com/linode/terraform-provider-linode/v2/linode"

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

func makeDataSource(name string) tokens.ModuleMember {
	return tfbridge.MakeDataSource(mainPkg, mainMod, name)
}

func makeResource(name string) tokens.Type {
	return tfbridge.MakeResource(mainPkg, mainMod, name)
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
		P:                       p,
		Name:                    "linode",
		Description:             "A Pulumi package for creating and managing linode cloud resources.",
		Keywords:                []string{"pulumi", "linode"},
		License:                 "Apache-2.0",
		Homepage:                "https://pulumi.io",
		Repository:              "https://github.com/pulumi/pulumi-linode",
		GitHubOrg:               "linode",
		TFProviderModuleVersion: "v2",
		Version:                 version.Version,
		MetadataInfo:            tfbridge.NewProviderMetadata(metadata),
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
				Tok: makeResource("NodeBalancer"),
			},
			"linode_nodebalancer_config": {
				Tok: makeResource("NodeBalancerConfig"),
			},
			"linode_nodebalancer_node": {
				Tok: makeResource("NodeBalancerNode"),
			},
			"linode_rdns": {
				Fields: map[string]*tfbridge.SchemaInfo{
					"rdns": {CSharpName: "RdnsName"},
				},
			},
			"linode_sshkey": {
				Tok: makeResource("SshKey"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"ssh_key": {CSharpName: "SshKeyName"},
				},
			},
			"linode_stackscript": {
				Tok: makeResource("StackScript"),
			},
			"linode_token": {
				Fields: map[string]*tfbridge.SchemaInfo{
					"token": {CSharpName: "ApiToken"},
				},
			},

			"linode_lke_node_pool": {Docs: &tfbridge.DocInfo{AllowMissing: true}},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			"linode_sshkey":              {Tok: makeDataSource("getSshKey")},
			"linode_stackscript":         {Tok: makeDataSource("getStackScript")},
			"linode_nodebalancer":        {Tok: makeDataSource("getNodeBalancer")},
			"linode_nodebalancer_config": {Tok: makeDataSource("getNodeBalancerConfig")},
			"linode_nodebalancer_node":   {Tok: makeDataSource("getNodeBalancerNode")},
			"linode_stackscripts":        {Tok: makeDataSource("getStackScripts")},
			"linode_object_storage_bucket": {
				Tok:  makeDataSource("getLinodeObjectStorageBucket"),
				Docs: &tfbridge.DocInfo{AllowMissing: true},
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
		Python: &tfbridge.PythonInfo{
			Requires: map[string]string{
				"pulumi": ">=3.0.0,<4.0.0",
			},
			PyProject: struct{ Enabled bool }{true},
		},

		Golang: &tfbridge.GolangInfo{
			ImportBasePath: path.Join(
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
	}

	prov.MustComputeTokens(tfbridgetokens.SingleModule(
		"linode_", mainMod, tfbridgetokens.MakeStandard(mainPkg)))
	prov.MustApplyAutoAliases()

	return prov
}

//go:embed cmd/pulumi-resource-linode/bridge-metadata.json
var metadata []byte
