// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-linode/sdk/v5/go/linode/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// > **DEPRECATION NOTICE:** This data source has been deprecated. Please use DatabaseMysqlV2 for all future implementations.
//
// Provides information about a Linode MySQL Database.
// For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-databases-instances).
//
// ## Example Usage
//
// Get information about a MySQL database:
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-linode/sdk/v5/go/linode"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := linode.LookupDatabaseMysql(ctx, &linode.LookupDatabaseMysqlArgs{
//				Id: pulumi.IntRef(12345),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## updates
//
// The following arguments are exported by the `updates` specification block:
//
// * `dayOfWeek` - The day to perform maintenance. (`monday`, `tuesday`, ...)
//
// * `duration` - The maximum maintenance window time in hours. (`1`..`3`)
//
// * `frequency` - Whether maintenance occurs on a weekly or monthly basis. (`weekly`, `monthly`)
//
// * `hourOfDay` - The hour to begin maintenance based in UTC time. (`0`..`23`)
//
// * `weekOfMonth` - The week of the month to perform monthly frequency updates. Required for `monthly` frequency updates. (`1`..`4`)
func LookupDatabaseMysql(ctx *pulumi.Context, args *LookupDatabaseMysqlArgs, opts ...pulumi.InvokeOption) (*LookupDatabaseMysqlResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupDatabaseMysqlResult
	err := ctx.Invoke("linode:index/getDatabaseMysql:getDatabaseMysql", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDatabaseMysql.
type LookupDatabaseMysqlArgs struct {
	// The ID of the MySQL database. Deprecated: Use id instead.
	//
	// Deprecated: Configure `id` instead. This attribute will be removed in the next major version of the provider.
	DatabaseId *int `pulumi:"databaseId"`
	// The ID of the MySQL database. Mutually exclusive with `databaseId`.
	Id *int `pulumi:"id"`
}

// A collection of values returned by getDatabaseMysql.
type LookupDatabaseMysqlResult struct {
	// A list of IP addresses that can access the Managed Database. Each item can be a single IP address or a range in CIDR format.
	AllowLists []string `pulumi:"allowLists"`
	// The base64-encoded SSL CA certificate for the Managed Database instance.
	CaCert string `pulumi:"caCert"`
	// The number of Linode Instance nodes deployed to the Managed Database.
	ClusterSize int `pulumi:"clusterSize"`
	// When this Managed Database was created.
	Created string `pulumi:"created"`
	// Deprecated: Configure `id` instead. This attribute will be removed in the next major version of the provider.
	DatabaseId *int `pulumi:"databaseId"`
	// Whether the Managed Databases is encrypted.
	Encrypted bool `pulumi:"encrypted"`
	// The Managed Database engine. (e.g. `mysql`)
	Engine string `pulumi:"engine"`
	// The Managed Database engine in engine/version format. (e.g. `mysql/8.0.30`)
	EngineId string `pulumi:"engineId"`
	// The primary host for the Managed Database.
	HostPrimary string `pulumi:"hostPrimary"`
	// The secondary/private network host for the Managed Database.
	HostSecondary string `pulumi:"hostSecondary"`
	Id            *int   `pulumi:"id"`
	// A unique, user-defined string referring to the Managed Database.
	Label string `pulumi:"label"`
	// The region that hosts this Linode Managed Database.
	Region string `pulumi:"region"`
	// The replication method used for the Managed Database. (`none`, `asynch`, `semiSynch`)
	ReplicationType string `pulumi:"replicationType"`
	// The randomly-generated root password for the Managed Database instance.
	RootPassword string `pulumi:"rootPassword"`
	// The root username for the Managed Database instance.
	RootUsername string `pulumi:"rootUsername"`
	// Whether to require SSL credentials to establish a connection to the Managed Database.
	SslConnection bool `pulumi:"sslConnection"`
	// The operating status of the Managed Database.
	Status string `pulumi:"status"`
	// The Linode Instance type used for the nodes of the  Managed Database instance.
	Type string `pulumi:"type"`
	// When this Managed Database was last updated.
	Updated string                   `pulumi:"updated"`
	Updates []GetDatabaseMysqlUpdate `pulumi:"updates"`
	// The Managed Database engine version. (e.g. `v8.0.26`)
	Version string `pulumi:"version"`
}

func LookupDatabaseMysqlOutput(ctx *pulumi.Context, args LookupDatabaseMysqlOutputArgs, opts ...pulumi.InvokeOption) LookupDatabaseMysqlResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupDatabaseMysqlResultOutput, error) {
			args := v.(LookupDatabaseMysqlArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("linode:index/getDatabaseMysql:getDatabaseMysql", args, LookupDatabaseMysqlResultOutput{}, options).(LookupDatabaseMysqlResultOutput), nil
		}).(LookupDatabaseMysqlResultOutput)
}

// A collection of arguments for invoking getDatabaseMysql.
type LookupDatabaseMysqlOutputArgs struct {
	// The ID of the MySQL database. Deprecated: Use id instead.
	//
	// Deprecated: Configure `id` instead. This attribute will be removed in the next major version of the provider.
	DatabaseId pulumi.IntPtrInput `pulumi:"databaseId"`
	// The ID of the MySQL database. Mutually exclusive with `databaseId`.
	Id pulumi.IntPtrInput `pulumi:"id"`
}

func (LookupDatabaseMysqlOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDatabaseMysqlArgs)(nil)).Elem()
}

// A collection of values returned by getDatabaseMysql.
type LookupDatabaseMysqlResultOutput struct{ *pulumi.OutputState }

func (LookupDatabaseMysqlResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDatabaseMysqlResult)(nil)).Elem()
}

func (o LookupDatabaseMysqlResultOutput) ToLookupDatabaseMysqlResultOutput() LookupDatabaseMysqlResultOutput {
	return o
}

func (o LookupDatabaseMysqlResultOutput) ToLookupDatabaseMysqlResultOutputWithContext(ctx context.Context) LookupDatabaseMysqlResultOutput {
	return o
}

// A list of IP addresses that can access the Managed Database. Each item can be a single IP address or a range in CIDR format.
func (o LookupDatabaseMysqlResultOutput) AllowLists() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupDatabaseMysqlResult) []string { return v.AllowLists }).(pulumi.StringArrayOutput)
}

// The base64-encoded SSL CA certificate for the Managed Database instance.
func (o LookupDatabaseMysqlResultOutput) CaCert() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseMysqlResult) string { return v.CaCert }).(pulumi.StringOutput)
}

// The number of Linode Instance nodes deployed to the Managed Database.
func (o LookupDatabaseMysqlResultOutput) ClusterSize() pulumi.IntOutput {
	return o.ApplyT(func(v LookupDatabaseMysqlResult) int { return v.ClusterSize }).(pulumi.IntOutput)
}

// When this Managed Database was created.
func (o LookupDatabaseMysqlResultOutput) Created() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseMysqlResult) string { return v.Created }).(pulumi.StringOutput)
}

// Deprecated: Configure `id` instead. This attribute will be removed in the next major version of the provider.
func (o LookupDatabaseMysqlResultOutput) DatabaseId() pulumi.IntPtrOutput {
	return o.ApplyT(func(v LookupDatabaseMysqlResult) *int { return v.DatabaseId }).(pulumi.IntPtrOutput)
}

// Whether the Managed Databases is encrypted.
func (o LookupDatabaseMysqlResultOutput) Encrypted() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupDatabaseMysqlResult) bool { return v.Encrypted }).(pulumi.BoolOutput)
}

// The Managed Database engine. (e.g. `mysql`)
func (o LookupDatabaseMysqlResultOutput) Engine() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseMysqlResult) string { return v.Engine }).(pulumi.StringOutput)
}

// The Managed Database engine in engine/version format. (e.g. `mysql/8.0.30`)
func (o LookupDatabaseMysqlResultOutput) EngineId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseMysqlResult) string { return v.EngineId }).(pulumi.StringOutput)
}

// The primary host for the Managed Database.
func (o LookupDatabaseMysqlResultOutput) HostPrimary() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseMysqlResult) string { return v.HostPrimary }).(pulumi.StringOutput)
}

// The secondary/private network host for the Managed Database.
func (o LookupDatabaseMysqlResultOutput) HostSecondary() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseMysqlResult) string { return v.HostSecondary }).(pulumi.StringOutput)
}

func (o LookupDatabaseMysqlResultOutput) Id() pulumi.IntPtrOutput {
	return o.ApplyT(func(v LookupDatabaseMysqlResult) *int { return v.Id }).(pulumi.IntPtrOutput)
}

// A unique, user-defined string referring to the Managed Database.
func (o LookupDatabaseMysqlResultOutput) Label() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseMysqlResult) string { return v.Label }).(pulumi.StringOutput)
}

// The region that hosts this Linode Managed Database.
func (o LookupDatabaseMysqlResultOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseMysqlResult) string { return v.Region }).(pulumi.StringOutput)
}

// The replication method used for the Managed Database. (`none`, `asynch`, `semiSynch`)
func (o LookupDatabaseMysqlResultOutput) ReplicationType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseMysqlResult) string { return v.ReplicationType }).(pulumi.StringOutput)
}

// The randomly-generated root password for the Managed Database instance.
func (o LookupDatabaseMysqlResultOutput) RootPassword() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseMysqlResult) string { return v.RootPassword }).(pulumi.StringOutput)
}

// The root username for the Managed Database instance.
func (o LookupDatabaseMysqlResultOutput) RootUsername() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseMysqlResult) string { return v.RootUsername }).(pulumi.StringOutput)
}

// Whether to require SSL credentials to establish a connection to the Managed Database.
func (o LookupDatabaseMysqlResultOutput) SslConnection() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupDatabaseMysqlResult) bool { return v.SslConnection }).(pulumi.BoolOutput)
}

// The operating status of the Managed Database.
func (o LookupDatabaseMysqlResultOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseMysqlResult) string { return v.Status }).(pulumi.StringOutput)
}

// The Linode Instance type used for the nodes of the  Managed Database instance.
func (o LookupDatabaseMysqlResultOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseMysqlResult) string { return v.Type }).(pulumi.StringOutput)
}

// When this Managed Database was last updated.
func (o LookupDatabaseMysqlResultOutput) Updated() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseMysqlResult) string { return v.Updated }).(pulumi.StringOutput)
}

func (o LookupDatabaseMysqlResultOutput) Updates() GetDatabaseMysqlUpdateArrayOutput {
	return o.ApplyT(func(v LookupDatabaseMysqlResult) []GetDatabaseMysqlUpdate { return v.Updates }).(GetDatabaseMysqlUpdateArrayOutput)
}

// The Managed Database engine version. (e.g. `v8.0.26`)
func (o LookupDatabaseMysqlResultOutput) Version() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseMysqlResult) string { return v.Version }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupDatabaseMysqlResultOutput{})
}
