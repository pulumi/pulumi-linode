// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-linode/sdk/v4/go/linode/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// > **DEPRECATION NOTICE:** This data source has been deprecated. Please use DatabasePostgresqlV2 for all future implementations.
//
// Provides information about a Linode PostgreSQL Database.
// For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-databases-postgre-sql-instance-backups).
//
// ## Example Usage
//
// Get information about a PostgreSQL database:
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-linode/sdk/v4/go/linode"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := linode.LookupDatabasePostgresql(ctx, &linode.LookupDatabasePostgresqlArgs{
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
func LookupDatabasePostgresql(ctx *pulumi.Context, args *LookupDatabasePostgresqlArgs, opts ...pulumi.InvokeOption) (*LookupDatabasePostgresqlResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupDatabasePostgresqlResult
	err := ctx.Invoke("linode:index/getDatabasePostgresql:getDatabasePostgresql", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDatabasePostgresql.
type LookupDatabasePostgresqlArgs struct {
	// The ID of the PostgreSQL database. Deprecated: Use id instead.
	//
	// Deprecated: Configure `id` instead. This attribute will be removed in the next major version of the provider.
	DatabaseId *int `pulumi:"databaseId"`
	// The ID of the PostgreSQL database. Mutually exclusive with `databaseId`.
	Id *int `pulumi:"id"`
}

// A collection of values returned by getDatabasePostgresql.
type LookupDatabasePostgresqlResult struct {
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
	// The Managed Database engine. (e.g. `postgresql`)
	Engine string `pulumi:"engine"`
	// The Managed Database engine in engine/version format. (e.g. `postgresql/13.2`)
	EngineId string `pulumi:"engineId"`
	// The primary host for the Managed Database.
	HostPrimary string `pulumi:"hostPrimary"`
	// The secondary/private network host for the Managed Database.
	HostSecondary string `pulumi:"hostSecondary"`
	Id            *int   `pulumi:"id"`
	// A unique, user-defined string referring to the Managed Database.
	Label string `pulumi:"label"`
	Port  int    `pulumi:"port"`
	// The region that hosts this Linode Managed Database.
	Region string `pulumi:"region"`
	// (Optional) The synchronization level of the replicating server. (`on`, `local`, `remoteWrite`, `remoteApply`, `off`)
	ReplicationCommitType string `pulumi:"replicationCommitType"`
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
	Updated string                        `pulumi:"updated"`
	Updates []GetDatabasePostgresqlUpdate `pulumi:"updates"`
	// The Managed Database engine version. (e.g. `v8.0.26`)
	Version string `pulumi:"version"`
}

func LookupDatabasePostgresqlOutput(ctx *pulumi.Context, args LookupDatabasePostgresqlOutputArgs, opts ...pulumi.InvokeOption) LookupDatabasePostgresqlResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupDatabasePostgresqlResultOutput, error) {
			args := v.(LookupDatabasePostgresqlArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("linode:index/getDatabasePostgresql:getDatabasePostgresql", args, LookupDatabasePostgresqlResultOutput{}, options).(LookupDatabasePostgresqlResultOutput), nil
		}).(LookupDatabasePostgresqlResultOutput)
}

// A collection of arguments for invoking getDatabasePostgresql.
type LookupDatabasePostgresqlOutputArgs struct {
	// The ID of the PostgreSQL database. Deprecated: Use id instead.
	//
	// Deprecated: Configure `id` instead. This attribute will be removed in the next major version of the provider.
	DatabaseId pulumi.IntPtrInput `pulumi:"databaseId"`
	// The ID of the PostgreSQL database. Mutually exclusive with `databaseId`.
	Id pulumi.IntPtrInput `pulumi:"id"`
}

func (LookupDatabasePostgresqlOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDatabasePostgresqlArgs)(nil)).Elem()
}

// A collection of values returned by getDatabasePostgresql.
type LookupDatabasePostgresqlResultOutput struct{ *pulumi.OutputState }

func (LookupDatabasePostgresqlResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDatabasePostgresqlResult)(nil)).Elem()
}

func (o LookupDatabasePostgresqlResultOutput) ToLookupDatabasePostgresqlResultOutput() LookupDatabasePostgresqlResultOutput {
	return o
}

func (o LookupDatabasePostgresqlResultOutput) ToLookupDatabasePostgresqlResultOutputWithContext(ctx context.Context) LookupDatabasePostgresqlResultOutput {
	return o
}

// A list of IP addresses that can access the Managed Database. Each item can be a single IP address or a range in CIDR format.
func (o LookupDatabasePostgresqlResultOutput) AllowLists() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupDatabasePostgresqlResult) []string { return v.AllowLists }).(pulumi.StringArrayOutput)
}

// The base64-encoded SSL CA certificate for the Managed Database instance.
func (o LookupDatabasePostgresqlResultOutput) CaCert() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabasePostgresqlResult) string { return v.CaCert }).(pulumi.StringOutput)
}

// The number of Linode Instance nodes deployed to the Managed Database.
func (o LookupDatabasePostgresqlResultOutput) ClusterSize() pulumi.IntOutput {
	return o.ApplyT(func(v LookupDatabasePostgresqlResult) int { return v.ClusterSize }).(pulumi.IntOutput)
}

// When this Managed Database was created.
func (o LookupDatabasePostgresqlResultOutput) Created() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabasePostgresqlResult) string { return v.Created }).(pulumi.StringOutput)
}

// Deprecated: Configure `id` instead. This attribute will be removed in the next major version of the provider.
func (o LookupDatabasePostgresqlResultOutput) DatabaseId() pulumi.IntPtrOutput {
	return o.ApplyT(func(v LookupDatabasePostgresqlResult) *int { return v.DatabaseId }).(pulumi.IntPtrOutput)
}

// Whether the Managed Databases is encrypted.
func (o LookupDatabasePostgresqlResultOutput) Encrypted() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupDatabasePostgresqlResult) bool { return v.Encrypted }).(pulumi.BoolOutput)
}

// The Managed Database engine. (e.g. `postgresql`)
func (o LookupDatabasePostgresqlResultOutput) Engine() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabasePostgresqlResult) string { return v.Engine }).(pulumi.StringOutput)
}

// The Managed Database engine in engine/version format. (e.g. `postgresql/13.2`)
func (o LookupDatabasePostgresqlResultOutput) EngineId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabasePostgresqlResult) string { return v.EngineId }).(pulumi.StringOutput)
}

// The primary host for the Managed Database.
func (o LookupDatabasePostgresqlResultOutput) HostPrimary() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabasePostgresqlResult) string { return v.HostPrimary }).(pulumi.StringOutput)
}

// The secondary/private network host for the Managed Database.
func (o LookupDatabasePostgresqlResultOutput) HostSecondary() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabasePostgresqlResult) string { return v.HostSecondary }).(pulumi.StringOutput)
}

func (o LookupDatabasePostgresqlResultOutput) Id() pulumi.IntPtrOutput {
	return o.ApplyT(func(v LookupDatabasePostgresqlResult) *int { return v.Id }).(pulumi.IntPtrOutput)
}

// A unique, user-defined string referring to the Managed Database.
func (o LookupDatabasePostgresqlResultOutput) Label() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabasePostgresqlResult) string { return v.Label }).(pulumi.StringOutput)
}

func (o LookupDatabasePostgresqlResultOutput) Port() pulumi.IntOutput {
	return o.ApplyT(func(v LookupDatabasePostgresqlResult) int { return v.Port }).(pulumi.IntOutput)
}

// The region that hosts this Linode Managed Database.
func (o LookupDatabasePostgresqlResultOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabasePostgresqlResult) string { return v.Region }).(pulumi.StringOutput)
}

// (Optional) The synchronization level of the replicating server. (`on`, `local`, `remoteWrite`, `remoteApply`, `off`)
func (o LookupDatabasePostgresqlResultOutput) ReplicationCommitType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabasePostgresqlResult) string { return v.ReplicationCommitType }).(pulumi.StringOutput)
}

// The replication method used for the Managed Database. (`none`, `asynch`, `semiSynch`)
func (o LookupDatabasePostgresqlResultOutput) ReplicationType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabasePostgresqlResult) string { return v.ReplicationType }).(pulumi.StringOutput)
}

// The randomly-generated root password for the Managed Database instance.
func (o LookupDatabasePostgresqlResultOutput) RootPassword() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabasePostgresqlResult) string { return v.RootPassword }).(pulumi.StringOutput)
}

// The root username for the Managed Database instance.
func (o LookupDatabasePostgresqlResultOutput) RootUsername() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabasePostgresqlResult) string { return v.RootUsername }).(pulumi.StringOutput)
}

// Whether to require SSL credentials to establish a connection to the Managed Database.
func (o LookupDatabasePostgresqlResultOutput) SslConnection() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupDatabasePostgresqlResult) bool { return v.SslConnection }).(pulumi.BoolOutput)
}

// The operating status of the Managed Database.
func (o LookupDatabasePostgresqlResultOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabasePostgresqlResult) string { return v.Status }).(pulumi.StringOutput)
}

// The Linode Instance type used for the nodes of the  Managed Database instance.
func (o LookupDatabasePostgresqlResultOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabasePostgresqlResult) string { return v.Type }).(pulumi.StringOutput)
}

// When this Managed Database was last updated.
func (o LookupDatabasePostgresqlResultOutput) Updated() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabasePostgresqlResult) string { return v.Updated }).(pulumi.StringOutput)
}

func (o LookupDatabasePostgresqlResultOutput) Updates() GetDatabasePostgresqlUpdateArrayOutput {
	return o.ApplyT(func(v LookupDatabasePostgresqlResult) []GetDatabasePostgresqlUpdate { return v.Updates }).(GetDatabasePostgresqlUpdateArrayOutput)
}

// The Managed Database engine version. (e.g. `v8.0.26`)
func (o LookupDatabasePostgresqlResultOutput) Version() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabasePostgresqlResult) string { return v.Version }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupDatabasePostgresqlResultOutput{})
}
