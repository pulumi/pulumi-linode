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

	// embed is used to store bridge-metadata.json in the compiled binary
	_ "embed"
	"path/filepath"
	"unicode"

	"github.com/linode/terraform-provider-linode/linode"
	"github.com/pulumi/pulumi-linode/provider/v4/pkg/version"
	pfbridge "github.com/pulumi/pulumi-terraform-bridge/pf/tfbridge"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	tfbridgetokens "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge/tokens"
	shim "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim"
	shimv2 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v2"
	"github.com/pulumi/pulumi/sdk/v3/go/common/resource"
	"github.com/pulumi/pulumi/sdk/v3/go/common/tokens"
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
func preConfigureCallback(vars resource.PropertyMap, c shim.ResourceConfig) error {
	return nil
}

func ref[T any](b T) *T {
	return &b
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
		PreConfigureCallback: preConfigureCallback,
		IgnoreMappings: []string{
			"linode_instance_config", // Mapping causes a panic due to duplicate types
		},
		Resources: map[string]*tfbridge.ResourceInfo{
			// Map each resource in the Terraform provider to a Pulumi type. An example
			// is below.
			"linode_image": {
				Tok: makeResource(mainMod, "Image"),
			},
			"linode_instance": {
				Tok: makeResource(mainMod, "Instance"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"specs": {
						MaxItemsOne: ref(true),
					},
					"backups": {
						MaxItemsOne: ref(true),
						Elem: &tfbridge.SchemaInfo{
							Fields: map[string]*tfbridge.SchemaInfo{
								"schedule": {
									MaxItemsOne: ref(true),
								},
							},
						},
					},
				},
			},
			"linode_domain": {
				Tok: makeResource(mainMod, "Domain"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"domain": {
						CSharpName: "DomainName",
					},
				},
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
				Fields: map[string]*tfbridge.SchemaInfo{
					"rdns": {
						CSharpName: "RdnsName",
					},
				},
			},
			"linode_sshkey": {
				Tok: makeResource(mainMod, "SshKey"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"ssh_key": {
						CSharpName: "SshKeyName",
					},
				},
			},
			"linode_stackscript": {
				Tok: makeResource(mainMod, "StackScript"),
			},
			"linode_volume": {
				Tok: makeResource(mainMod, "Volume"),
			},
			"linode_object_storage_bucket": {
				Tok: makeResource(mainMod, "ObjectStorageBucket"),
			},
			"linode_object_storage_key": {
				Tok: makeResource(mainMod, "ObjectStorageKey"),
			},
			"linode_lke_cluster":              {Tok: makeResource(mainMod, "LkeCluster")},
			"linode_firewall":                 {Tok: makeResource(mainMod, "Firewall")},
			"linode_object_storage_object":    {Tok: makeResource(mainMod, "ObjectStorageObject")},
			"linode_instance_ip":              {Tok: makeResource(mainMod, "InstanceIp")},
			"linode_user":                     {Tok: makeResource(mainMod, "User")},
			"linode_firewall_device":          {Tok: makeResource(mainMod, "FirewallDevice")},
			"linode_ipv6_range":               {Tok: makeResource(mainMod, "Ipv6Range")},
			"linode_database_mysql":           {Tok: makeResource(mainMod, "DatabaseMysql")},
			"linode_database_postgresql":      {Tok: makeResource(mainMod, "DatabasePostgresql")},
			"linode_database_access_controls": {Tok: makeResource(mainMod, "DatabaseAccessControls")},
			"linode_instance_shared_ips":      {Tok: makeResource(mainMod, "InstanceSharedIps")},
			"linode_instance_disk":            {Tok: makeResource(mainMod, "InstanceDisk")},
			"linode_token": {
				Tok: makeResource(mainMod, "Token"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"token": {CSharpName: "ApiToken"},
				},
			},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			"linode_vlans":   {Tok: makeDataSource(mainMod, "getVlans")},
			"linode_account": {Tok: makeDataSource(mainMod, "getAccount")},
			"linode_domain":  {Tok: makeDataSource(mainMod, "getDomain")},
			"linode_image":   {Tok: makeDataSource(mainMod, "getImage")},
			"linode_instance_type": {
				Tok: makeDataSource(mainMod, "getInstanceType"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"price": {
						MaxItemsOne: ref(true),
					},
					"addons": {
						MaxItemsOne: ref(true),
						Elem: &tfbridge.SchemaInfo{
							Fields: map[string]*tfbridge.SchemaInfo{
								"backups": {
									MaxItemsOne: ref(true),
									Elem: &tfbridge.SchemaInfo{
										Fields: map[string]*tfbridge.SchemaInfo{
											"price": {
												MaxItemsOne: ref(true),
											},
										},
									},
								},
							},
						},
					},
				},
			},
			"linode_networking_ip": {Tok: makeDataSource(mainMod, "getNetworkingIp")},
			"linode_profile": {
				Tok: makeDataSource(mainMod, "getProfile"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"referrals": {
						MaxItemsOne: ref(true),
					},
				},
			},
			"linode_region": {Tok: makeDataSource(mainMod, "getRegion")},
			"linode_sshkey": {Tok: makeDataSource(mainMod, "getSshKey")},
			"linode_user":   {Tok: makeDataSource(mainMod, "getUser")},
			"linode_object_storage_cluster": {
				Tok: makeDataSource(mainMod, "getObjectStorageCluster"),
			},
			"linode_stackscript":            {Tok: makeDataSource(mainMod, "getStackScript")},
			"linode_domain_record":          {Tok: makeDataSource(mainMod, "getDomainRecord")},
			"linode_volume":                 {Tok: makeDataSource(mainMod, "getVolume")},
			"linode_lke_cluster":            {Tok: makeDataSource(mainMod, "getLkeCluster")},
			"linode_firewall":               {Tok: makeDataSource(mainMod, "getFirewall")},
			"linode_images":                 {Tok: makeDataSource(mainMod, "getImages")},
			"linode_instance_backups":       {Tok: makeDataSource(mainMod, "getInstanceBackups")},
			"linode_instances":              {Tok: makeDataSource(mainMod, "getInstances")},
			"linode_kernel":                 {Tok: makeDataSource(mainMod, "getKernel")},
			"linode_nodebalancer":           {Tok: makeDataSource(mainMod, "getNodeBalancer")},
			"linode_nodebalancer_config":    {Tok: makeDataSource(mainMod, "getNodeBalancerConfig")},
			"linode_nodebalancer_node":      {Tok: makeDataSource(mainMod, "getNodeBalancerNode")},
			"linode_instance_types":         {Tok: makeDataSource(mainMod, "getInstanceTypes")},
			"linode_stackscripts":           {Tok: makeDataSource(mainMod, "getStackScripts")},
			"linode_database_engines":       {Tok: makeDataSource(mainMod, "getDatabaseEngines")},
			"linode_database_mysql_backups": {Tok: makeDataSource(mainMod, "getDatabaseMysqlBackups")},
			"linode_databases":              {Tok: makeDataSource(mainMod, "getDatabases")},
			"linode_database_backups":       {Tok: makeDataSource(mainMod, "getDatabaseBackups")},
			"linode_database_mysql":         {Tok: makeDataSource(mainMod, "getDatabaseMysql")},
			"linode_database_postgresql":    {Tok: makeDataSource(mainMod, "getDatabasePostgresql")},
			"linode_ipv6_range":             {Tok: makeDataSource(mainMod, "getIpv6Range")},
			"linode_domain_zonefile":        {Tok: makeDataSource(mainMod, "getDomainZonefile")},
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
