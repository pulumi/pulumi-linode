// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides information about a Linode MongoDB Database.
//
// ## Example Usage
//
// Get information about a MongoDB database:
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
//			_, err := linode.LookupDatabaseMongodb(ctx, &linode.LookupDatabaseMongodbArgs{
//				DatabaseId: 12345,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
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
func LookupDatabaseMongodb(ctx *pulumi.Context, args *LookupDatabaseMongodbArgs, opts ...pulumi.InvokeOption) (*LookupDatabaseMongodbResult, error) {
	var rv LookupDatabaseMongodbResult
	err := ctx.Invoke("linode:index/getDatabaseMongodb:getDatabaseMongodb", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDatabaseMongodb.
type LookupDatabaseMongodbArgs struct {
	// The ID of the MongoDB database.
	DatabaseId int `pulumi:"databaseId"`
}

// A collection of values returned by getDatabaseMongodb.
type LookupDatabaseMongodbResult struct {
	// A list of IP addresses that can access the Managed Database. Each item can be a single IP address or a range in CIDR format.
	AllowLists []string `pulumi:"allowLists"`
	// The base64-encoded SSL CA certificate for the Managed Database instance.
	CaCert string `pulumi:"caCert"`
	// The number of Linode Instance nodes deployed to the Managed Database.
	ClusterSize int `pulumi:"clusterSize"`
	// The type of data compression for this Database. (`none`, `snappy`, `zlib`)
	CompressionType string `pulumi:"compressionType"`
	// When this Managed Database was created.
	Created    string `pulumi:"created"`
	DatabaseId int    `pulumi:"databaseId"`
	// Whether the Managed Databases is encrypted.
	Encrypted bool `pulumi:"encrypted"`
	// The Managed Database engine. (e.g. `mongodb`)
	Engine string `pulumi:"engine"`
	// The Managed Database engine in engine/version format. (e.g. `mongodb/4.4.10`)
	EngineId string `pulumi:"engineId"`
	// The primary host for the Managed Database.
	HostPrimary string `pulumi:"hostPrimary"`
	// The secondary/private network host for the Managed Database.
	HostSecondary string `pulumi:"hostSecondary"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A unique, user-defined string referring to the Managed Database.
	Label string `pulumi:"label"`
	// A set of peer addresses for this Database.
	Peers []string `pulumi:"peers"`
	// The access port for this Managed Database.
	Port int `pulumi:"port"`
	// The region that hosts this Linode Managed Database.
	Region string `pulumi:"region"`
	// Label for configuring a MongoDB replica set. Choose the same label on multiple Databases to include them in the same replica set.
	ReplicaSet string `pulumi:"replicaSet"`
	// The randomly-generated root password for the Managed Database instance.
	RootPassword string `pulumi:"rootPassword"`
	// The root username for the Managed Database instance.
	RootUsername string `pulumi:"rootUsername"`
	// Whether to require SSL credentials to establish a connection to the Managed Database.
	SslConnection bool `pulumi:"sslConnection"`
	// The operating status of the Managed Database.
	Status string `pulumi:"status"`
	// The type of storage engine for this Database. (`mmapv1`, `wiredtiger`)
	StorageEngine string `pulumi:"storageEngine"`
	// The Linode Instance type used for the nodes of the  Managed Database instance.
	Type string `pulumi:"type"`
	// When this Managed Database was last updated.
	Updated string                     `pulumi:"updated"`
	Updates []GetDatabaseMongodbUpdate `pulumi:"updates"`
	// The Managed Database engine version. (e.g. `v8.0.26`)
	Version string `pulumi:"version"`
}

func LookupDatabaseMongodbOutput(ctx *pulumi.Context, args LookupDatabaseMongodbOutputArgs, opts ...pulumi.InvokeOption) LookupDatabaseMongodbResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupDatabaseMongodbResult, error) {
			args := v.(LookupDatabaseMongodbArgs)
			r, err := LookupDatabaseMongodb(ctx, &args, opts...)
			var s LookupDatabaseMongodbResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupDatabaseMongodbResultOutput)
}

// A collection of arguments for invoking getDatabaseMongodb.
type LookupDatabaseMongodbOutputArgs struct {
	// The ID of the MongoDB database.
	DatabaseId pulumi.IntInput `pulumi:"databaseId"`
}

func (LookupDatabaseMongodbOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDatabaseMongodbArgs)(nil)).Elem()
}

// A collection of values returned by getDatabaseMongodb.
type LookupDatabaseMongodbResultOutput struct{ *pulumi.OutputState }

func (LookupDatabaseMongodbResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDatabaseMongodbResult)(nil)).Elem()
}

func (o LookupDatabaseMongodbResultOutput) ToLookupDatabaseMongodbResultOutput() LookupDatabaseMongodbResultOutput {
	return o
}

func (o LookupDatabaseMongodbResultOutput) ToLookupDatabaseMongodbResultOutputWithContext(ctx context.Context) LookupDatabaseMongodbResultOutput {
	return o
}

// A list of IP addresses that can access the Managed Database. Each item can be a single IP address or a range in CIDR format.
func (o LookupDatabaseMongodbResultOutput) AllowLists() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupDatabaseMongodbResult) []string { return v.AllowLists }).(pulumi.StringArrayOutput)
}

// The base64-encoded SSL CA certificate for the Managed Database instance.
func (o LookupDatabaseMongodbResultOutput) CaCert() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseMongodbResult) string { return v.CaCert }).(pulumi.StringOutput)
}

// The number of Linode Instance nodes deployed to the Managed Database.
func (o LookupDatabaseMongodbResultOutput) ClusterSize() pulumi.IntOutput {
	return o.ApplyT(func(v LookupDatabaseMongodbResult) int { return v.ClusterSize }).(pulumi.IntOutput)
}

// The type of data compression for this Database. (`none`, `snappy`, `zlib`)
func (o LookupDatabaseMongodbResultOutput) CompressionType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseMongodbResult) string { return v.CompressionType }).(pulumi.StringOutput)
}

// When this Managed Database was created.
func (o LookupDatabaseMongodbResultOutput) Created() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseMongodbResult) string { return v.Created }).(pulumi.StringOutput)
}

func (o LookupDatabaseMongodbResultOutput) DatabaseId() pulumi.IntOutput {
	return o.ApplyT(func(v LookupDatabaseMongodbResult) int { return v.DatabaseId }).(pulumi.IntOutput)
}

// Whether the Managed Databases is encrypted.
func (o LookupDatabaseMongodbResultOutput) Encrypted() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupDatabaseMongodbResult) bool { return v.Encrypted }).(pulumi.BoolOutput)
}

// The Managed Database engine. (e.g. `mongodb`)
func (o LookupDatabaseMongodbResultOutput) Engine() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseMongodbResult) string { return v.Engine }).(pulumi.StringOutput)
}

// The Managed Database engine in engine/version format. (e.g. `mongodb/4.4.10`)
func (o LookupDatabaseMongodbResultOutput) EngineId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseMongodbResult) string { return v.EngineId }).(pulumi.StringOutput)
}

// The primary host for the Managed Database.
func (o LookupDatabaseMongodbResultOutput) HostPrimary() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseMongodbResult) string { return v.HostPrimary }).(pulumi.StringOutput)
}

// The secondary/private network host for the Managed Database.
func (o LookupDatabaseMongodbResultOutput) HostSecondary() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseMongodbResult) string { return v.HostSecondary }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupDatabaseMongodbResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseMongodbResult) string { return v.Id }).(pulumi.StringOutput)
}

// A unique, user-defined string referring to the Managed Database.
func (o LookupDatabaseMongodbResultOutput) Label() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseMongodbResult) string { return v.Label }).(pulumi.StringOutput)
}

// A set of peer addresses for this Database.
func (o LookupDatabaseMongodbResultOutput) Peers() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupDatabaseMongodbResult) []string { return v.Peers }).(pulumi.StringArrayOutput)
}

// The access port for this Managed Database.
func (o LookupDatabaseMongodbResultOutput) Port() pulumi.IntOutput {
	return o.ApplyT(func(v LookupDatabaseMongodbResult) int { return v.Port }).(pulumi.IntOutput)
}

// The region that hosts this Linode Managed Database.
func (o LookupDatabaseMongodbResultOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseMongodbResult) string { return v.Region }).(pulumi.StringOutput)
}

// Label for configuring a MongoDB replica set. Choose the same label on multiple Databases to include them in the same replica set.
func (o LookupDatabaseMongodbResultOutput) ReplicaSet() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseMongodbResult) string { return v.ReplicaSet }).(pulumi.StringOutput)
}

// The randomly-generated root password for the Managed Database instance.
func (o LookupDatabaseMongodbResultOutput) RootPassword() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseMongodbResult) string { return v.RootPassword }).(pulumi.StringOutput)
}

// The root username for the Managed Database instance.
func (o LookupDatabaseMongodbResultOutput) RootUsername() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseMongodbResult) string { return v.RootUsername }).(pulumi.StringOutput)
}

// Whether to require SSL credentials to establish a connection to the Managed Database.
func (o LookupDatabaseMongodbResultOutput) SslConnection() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupDatabaseMongodbResult) bool { return v.SslConnection }).(pulumi.BoolOutput)
}

// The operating status of the Managed Database.
func (o LookupDatabaseMongodbResultOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseMongodbResult) string { return v.Status }).(pulumi.StringOutput)
}

// The type of storage engine for this Database. (`mmapv1`, `wiredtiger`)
func (o LookupDatabaseMongodbResultOutput) StorageEngine() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseMongodbResult) string { return v.StorageEngine }).(pulumi.StringOutput)
}

// The Linode Instance type used for the nodes of the  Managed Database instance.
func (o LookupDatabaseMongodbResultOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseMongodbResult) string { return v.Type }).(pulumi.StringOutput)
}

// When this Managed Database was last updated.
func (o LookupDatabaseMongodbResultOutput) Updated() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseMongodbResult) string { return v.Updated }).(pulumi.StringOutput)
}

func (o LookupDatabaseMongodbResultOutput) Updates() GetDatabaseMongodbUpdateArrayOutput {
	return o.ApplyT(func(v LookupDatabaseMongodbResult) []GetDatabaseMongodbUpdate { return v.Updates }).(GetDatabaseMongodbUpdateArrayOutput)
}

// The Managed Database engine version. (e.g. `v8.0.26`)
func (o LookupDatabaseMongodbResultOutput) Version() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDatabaseMongodbResult) string { return v.Version }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupDatabaseMongodbResultOutput{})
}
