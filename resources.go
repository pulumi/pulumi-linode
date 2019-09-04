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
	"unicode"

	"github.com/hashicorp/terraform/helper/schema"
	"github.com/hashicorp/terraform/terraform"
	"github.com/pulumi/pulumi-terraform/pkg/tfbridge"
	"github.com/pulumi/pulumi/pkg/resource"
	"github.com/pulumi/pulumi/pkg/tokens"
	"github.com/terraform-providers/terraform-provider-linode/linode"
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

// preConfigureCallback is called before the providerConfigure function of the underlying provider.
// It should validate that the provider can be configured, and provide actionable errors in the case
// it cannot be. Configuration variables can be read from `vars` using the `stringValue` function -
// for example `stringValue(vars, "accessKey")`.
func preConfigureCallback(vars resource.PropertyMap, c *terraform.ResourceConfig) error {
	return nil
}

// Provider returns additional overlaid schema and metadata associated with the provider..
func Provider() tfbridge.ProviderInfo {
	// Instantiate the Terraform provider
	p := linode.Provider().(*schema.Provider)

	// Create a Pulumi provider mapping
	prov := tfbridge.ProviderInfo{
		P:           p,
		Name:        "linode",
		Description: "A Pulumi package for creating and managing linode cloud resources.",
		Keywords:    []string{"pulumi", "linode"},
		License:     "Apache-2.0",
		Homepage:    "https://pulumi.io",
		Repository:  "https://github.com/pulumi/pulumi-linode",
		Config: map[string]*tfbridge.SchemaInfo{
			"token": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"LINODE_TOKEN", "LINODE_API_TOKEN"},
				},
			},
		},
		PreConfigureCallback: preConfigureCallback,
		Resources: map[string]*tfbridge.ResourceInfo{
			// Map each resource in the Terraform provider to a Pulumi type. An example
			// is below.

			"linode_image": {
				Tok: makeResource(mainMod, "Image"),
			},
			"linode_instance": {
				Tok: makeResource(mainMod, "Instance"),
			},
			"linode_domain": {
				Tok: makeResource(mainMod, "Domain"),
			},
			"linode_domain_record": {
				Tok: makeResource(mainMod, "DomainRecord"),
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
				Tok: makeResource(mainMod, "Rdns"),
			},
			"linode_sshkey": {
				Tok: makeResource(mainMod, "SshKey"),
			},
			"linode_stackscript": {
				Tok: makeResource(mainMod, "StackScript"),
			},
			"linode_token": {
				Tok: makeResource(mainMod, "Token"),
			},
			"linode_volume": {
				Tok: makeResource(mainMod, "Volume"),
			},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			"linode_account":       {Tok: makeDataSource(mainMod, "getAccount")},
			"linode_domain":        {Tok: makeDataSource(mainMod, "getDomain")},
			"linode_image":         {Tok: makeDataSource(mainMod, "getImage")},
			"linode_instance_type": {Tok: makeDataSource(mainMod, "getInstanceType")},
			"linode_networking_ip": {Tok: makeDataSource(mainMod, "getNetworkingIp")},
			"linode_profile":       {Tok: makeDataSource(mainMod, "getProfile")},
			"linode_region":        {Tok: makeDataSource(mainMod, "getRegion")},
			"linode_sshkey":        {Tok: makeDataSource(mainMod, "getSshKey")},
			"linode_user":          {Tok: makeDataSource(mainMod, "getUser")},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			// List any npm dependencies and their versions
			Dependencies: map[string]string{
				"@pulumi/pulumi": "^1.0.0",
			},
			DevDependencies: map[string]string{
				"@types/node": "^8.0.25", // so we can access strongly typed node definitions.
				"@types/mime": "^2.0.0",
			},
			// See the documentation for tfbridge.OverlayInfo for how to lay out this
			// section, or refer to the AWS provider. Delete this section if there are
			// no overlay files.
			//Overlay: &tfbridge.OverlayInfo{},
		},
		Python: &tfbridge.PythonInfo{
			// List any Python dependencies and their version ranges
			Requires: map[string]string{
				"pulumi": ">=1.0.0,<2.0.0",
			},
		},
	}

	return prov
}
