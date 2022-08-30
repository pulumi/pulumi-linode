// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Linode MySQL Database resource. This can be used to create, modify, and delete Linode MySQL Databases.
// For more information, see the [Linode APIv4 docs](https://www.linode.com/docs/api/databases/).
//
// Please keep in mind that Managed Databases can take up to an hour to provision.
//
// ## Example Usage
//
// Creating a simple MySQL database instance:
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-linode/sdk/v3/go/linode"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := linode.NewDatabaseMysql(ctx, "foobar", &linode.DatabaseMysqlArgs{
//				EngineId: pulumi.String("mysql/8.0.26"),
//				Label:    pulumi.String("mydatabase"),
//				Region:   pulumi.String("us-southeast"),
//				Type:     pulumi.String("g6-nanode-1"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// Creating a complex MySQL database instance:
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-linode/sdk/v3/go/linode"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := linode.NewDatabaseMysql(ctx, "foobar", &linode.DatabaseMysqlArgs{
//				AllowLists: pulumi.StringArray{
//					pulumi.String("0.0.0.0/0"),
//				},
//				ClusterSize:     pulumi.Int(3),
//				Encrypted:       pulumi.Bool(true),
//				EngineId:        pulumi.String("mysql/8.0.26"),
//				Label:           pulumi.String("mydatabase"),
//				Region:          pulumi.String("us-southeast"),
//				ReplicationType: pulumi.String("asynch"),
//				SslConnection:   pulumi.Bool(true),
//				Type:            pulumi.String("g6-nanode-1"),
//				Updates: &DatabaseMysqlUpdatesArgs{
//					DayOfWeek:   pulumi.String("saturday"),
//					Duration:    pulumi.Int(1),
//					Frequency:   pulumi.String("monthly"),
//					HourOfDay:   pulumi.Int(22),
//					WeekOfMonth: pulumi.Int(2),
//				},
//			})
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
// The following arguments are supported in the `updates` specification block:
//
// * `dayOfWeek` - (Required) The day to perform maintenance. (`monday`, `tuesday`, ...)
//
// * `duration` - (Required) The maximum maintenance window time in hours. (`1`..`3`)
//
// * `frequency` - (Required) Whether maintenance occurs on a weekly or monthly basis. (`weekly`, `monthly`)
//
// * `hourOfDay` - (Required) The hour to begin maintenance based in UTC time. (`0`..`23`)
//
// * `weekOfMonth` - (Optional) The week of the month to perform monthly frequency updates. Required for `monthly` frequency updates. (`1`..`4`)
//
// ## Import
//
// Linode MySQL Databases can be imported using the `id`, e.g.
//
// ```sh
//
//	$ pulumi import linode:index/databaseMysql:DatabaseMysql foobar 1234567
//
// ```
type DatabaseMysql struct {
	pulumi.CustomResourceState

	// A list of IP addresses that can access the Managed Database. Each item can be a single IP address or a range in CIDR format. Use `DatabaseAccessControls` to manage your allow list separately.
	AllowLists pulumi.StringArrayOutput `pulumi:"allowLists"`
	// The base64-encoded SSL CA certificate for the Managed Database instance.
	CaCert pulumi.StringOutput `pulumi:"caCert"`
	// The number of Linode Instance nodes deployed to the Managed Database. (default `1`)
	ClusterSize pulumi.IntPtrOutput `pulumi:"clusterSize"`
	// When this Managed Database was created.
	Created pulumi.StringOutput `pulumi:"created"`
	// Whether the Managed Databases is encrypted. (default `false`)
	Encrypted pulumi.BoolPtrOutput `pulumi:"encrypted"`
	// The Managed Database engine. (e.g. `mysql`)
	Engine pulumi.StringOutput `pulumi:"engine"`
	// The Managed Database engine in engine/version format. (e.g. `mysql/8.0.26`)
	EngineId pulumi.StringOutput `pulumi:"engineId"`
	// The primary host for the Managed Database.
	HostPrimary pulumi.StringOutput `pulumi:"hostPrimary"`
	// The secondary/private network host for the Managed Database.
	HostSecondary pulumi.StringOutput `pulumi:"hostSecondary"`
	// A unique, user-defined string referring to the Managed Database.
	Label pulumi.StringOutput `pulumi:"label"`
	// The region to use for the Managed Database.
	Region pulumi.StringOutput `pulumi:"region"`
	// The replication method used for the Managed Database. (`none`, `asynch`, `semiSynch`; default `none`)
	ReplicationType pulumi.StringPtrOutput `pulumi:"replicationType"`
	// The randomly-generated root password for the Managed Database instance.
	RootPassword pulumi.StringOutput `pulumi:"rootPassword"`
	// The root username for the Managed Database instance.
	RootUsername pulumi.StringOutput `pulumi:"rootUsername"`
	// Whether to require SSL credentials to establish a connection to the Managed Database. (default `false`)
	SslConnection pulumi.BoolPtrOutput `pulumi:"sslConnection"`
	// The operating status of the Managed Database.
	Status pulumi.StringOutput `pulumi:"status"`
	// The Linode Instance type used for the nodes of the  Managed Database instance.
	Type pulumi.StringOutput `pulumi:"type"`
	// When this Managed Database was last updated.
	Updated pulumi.StringOutput `pulumi:"updated"`
	// Configuration settings for automated patch update maintenance for the Managed Database.
	Updates DatabaseMysqlUpdatesOutput `pulumi:"updates"`
	// The Managed Database engine version. (e.g. `v8.0.26`)
	Version pulumi.StringOutput `pulumi:"version"`
}

// NewDatabaseMysql registers a new resource with the given unique name, arguments, and options.
func NewDatabaseMysql(ctx *pulumi.Context,
	name string, args *DatabaseMysqlArgs, opts ...pulumi.ResourceOption) (*DatabaseMysql, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.EngineId == nil {
		return nil, errors.New("invalid value for required argument 'EngineId'")
	}
	if args.Label == nil {
		return nil, errors.New("invalid value for required argument 'Label'")
	}
	if args.Region == nil {
		return nil, errors.New("invalid value for required argument 'Region'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	var resource DatabaseMysql
	err := ctx.RegisterResource("linode:index/databaseMysql:DatabaseMysql", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDatabaseMysql gets an existing DatabaseMysql resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDatabaseMysql(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DatabaseMysqlState, opts ...pulumi.ResourceOption) (*DatabaseMysql, error) {
	var resource DatabaseMysql
	err := ctx.ReadResource("linode:index/databaseMysql:DatabaseMysql", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DatabaseMysql resources.
type databaseMysqlState struct {
	// A list of IP addresses that can access the Managed Database. Each item can be a single IP address or a range in CIDR format. Use `DatabaseAccessControls` to manage your allow list separately.
	AllowLists []string `pulumi:"allowLists"`
	// The base64-encoded SSL CA certificate for the Managed Database instance.
	CaCert *string `pulumi:"caCert"`
	// The number of Linode Instance nodes deployed to the Managed Database. (default `1`)
	ClusterSize *int `pulumi:"clusterSize"`
	// When this Managed Database was created.
	Created *string `pulumi:"created"`
	// Whether the Managed Databases is encrypted. (default `false`)
	Encrypted *bool `pulumi:"encrypted"`
	// The Managed Database engine. (e.g. `mysql`)
	Engine *string `pulumi:"engine"`
	// The Managed Database engine in engine/version format. (e.g. `mysql/8.0.26`)
	EngineId *string `pulumi:"engineId"`
	// The primary host for the Managed Database.
	HostPrimary *string `pulumi:"hostPrimary"`
	// The secondary/private network host for the Managed Database.
	HostSecondary *string `pulumi:"hostSecondary"`
	// A unique, user-defined string referring to the Managed Database.
	Label *string `pulumi:"label"`
	// The region to use for the Managed Database.
	Region *string `pulumi:"region"`
	// The replication method used for the Managed Database. (`none`, `asynch`, `semiSynch`; default `none`)
	ReplicationType *string `pulumi:"replicationType"`
	// The randomly-generated root password for the Managed Database instance.
	RootPassword *string `pulumi:"rootPassword"`
	// The root username for the Managed Database instance.
	RootUsername *string `pulumi:"rootUsername"`
	// Whether to require SSL credentials to establish a connection to the Managed Database. (default `false`)
	SslConnection *bool `pulumi:"sslConnection"`
	// The operating status of the Managed Database.
	Status *string `pulumi:"status"`
	// The Linode Instance type used for the nodes of the  Managed Database instance.
	Type *string `pulumi:"type"`
	// When this Managed Database was last updated.
	Updated *string `pulumi:"updated"`
	// Configuration settings for automated patch update maintenance for the Managed Database.
	Updates *DatabaseMysqlUpdates `pulumi:"updates"`
	// The Managed Database engine version. (e.g. `v8.0.26`)
	Version *string `pulumi:"version"`
}

type DatabaseMysqlState struct {
	// A list of IP addresses that can access the Managed Database. Each item can be a single IP address or a range in CIDR format. Use `DatabaseAccessControls` to manage your allow list separately.
	AllowLists pulumi.StringArrayInput
	// The base64-encoded SSL CA certificate for the Managed Database instance.
	CaCert pulumi.StringPtrInput
	// The number of Linode Instance nodes deployed to the Managed Database. (default `1`)
	ClusterSize pulumi.IntPtrInput
	// When this Managed Database was created.
	Created pulumi.StringPtrInput
	// Whether the Managed Databases is encrypted. (default `false`)
	Encrypted pulumi.BoolPtrInput
	// The Managed Database engine. (e.g. `mysql`)
	Engine pulumi.StringPtrInput
	// The Managed Database engine in engine/version format. (e.g. `mysql/8.0.26`)
	EngineId pulumi.StringPtrInput
	// The primary host for the Managed Database.
	HostPrimary pulumi.StringPtrInput
	// The secondary/private network host for the Managed Database.
	HostSecondary pulumi.StringPtrInput
	// A unique, user-defined string referring to the Managed Database.
	Label pulumi.StringPtrInput
	// The region to use for the Managed Database.
	Region pulumi.StringPtrInput
	// The replication method used for the Managed Database. (`none`, `asynch`, `semiSynch`; default `none`)
	ReplicationType pulumi.StringPtrInput
	// The randomly-generated root password for the Managed Database instance.
	RootPassword pulumi.StringPtrInput
	// The root username for the Managed Database instance.
	RootUsername pulumi.StringPtrInput
	// Whether to require SSL credentials to establish a connection to the Managed Database. (default `false`)
	SslConnection pulumi.BoolPtrInput
	// The operating status of the Managed Database.
	Status pulumi.StringPtrInput
	// The Linode Instance type used for the nodes of the  Managed Database instance.
	Type pulumi.StringPtrInput
	// When this Managed Database was last updated.
	Updated pulumi.StringPtrInput
	// Configuration settings for automated patch update maintenance for the Managed Database.
	Updates DatabaseMysqlUpdatesPtrInput
	// The Managed Database engine version. (e.g. `v8.0.26`)
	Version pulumi.StringPtrInput
}

func (DatabaseMysqlState) ElementType() reflect.Type {
	return reflect.TypeOf((*databaseMysqlState)(nil)).Elem()
}

type databaseMysqlArgs struct {
	// A list of IP addresses that can access the Managed Database. Each item can be a single IP address or a range in CIDR format. Use `DatabaseAccessControls` to manage your allow list separately.
	AllowLists []string `pulumi:"allowLists"`
	// The number of Linode Instance nodes deployed to the Managed Database. (default `1`)
	ClusterSize *int `pulumi:"clusterSize"`
	// Whether the Managed Databases is encrypted. (default `false`)
	Encrypted *bool `pulumi:"encrypted"`
	// The Managed Database engine in engine/version format. (e.g. `mysql/8.0.26`)
	EngineId string `pulumi:"engineId"`
	// A unique, user-defined string referring to the Managed Database.
	Label string `pulumi:"label"`
	// The region to use for the Managed Database.
	Region string `pulumi:"region"`
	// The replication method used for the Managed Database. (`none`, `asynch`, `semiSynch`; default `none`)
	ReplicationType *string `pulumi:"replicationType"`
	// Whether to require SSL credentials to establish a connection to the Managed Database. (default `false`)
	SslConnection *bool `pulumi:"sslConnection"`
	// The Linode Instance type used for the nodes of the  Managed Database instance.
	Type string `pulumi:"type"`
	// Configuration settings for automated patch update maintenance for the Managed Database.
	Updates *DatabaseMysqlUpdates `pulumi:"updates"`
}

// The set of arguments for constructing a DatabaseMysql resource.
type DatabaseMysqlArgs struct {
	// A list of IP addresses that can access the Managed Database. Each item can be a single IP address or a range in CIDR format. Use `DatabaseAccessControls` to manage your allow list separately.
	AllowLists pulumi.StringArrayInput
	// The number of Linode Instance nodes deployed to the Managed Database. (default `1`)
	ClusterSize pulumi.IntPtrInput
	// Whether the Managed Databases is encrypted. (default `false`)
	Encrypted pulumi.BoolPtrInput
	// The Managed Database engine in engine/version format. (e.g. `mysql/8.0.26`)
	EngineId pulumi.StringInput
	// A unique, user-defined string referring to the Managed Database.
	Label pulumi.StringInput
	// The region to use for the Managed Database.
	Region pulumi.StringInput
	// The replication method used for the Managed Database. (`none`, `asynch`, `semiSynch`; default `none`)
	ReplicationType pulumi.StringPtrInput
	// Whether to require SSL credentials to establish a connection to the Managed Database. (default `false`)
	SslConnection pulumi.BoolPtrInput
	// The Linode Instance type used for the nodes of the  Managed Database instance.
	Type pulumi.StringInput
	// Configuration settings for automated patch update maintenance for the Managed Database.
	Updates DatabaseMysqlUpdatesPtrInput
}

func (DatabaseMysqlArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*databaseMysqlArgs)(nil)).Elem()
}

type DatabaseMysqlInput interface {
	pulumi.Input

	ToDatabaseMysqlOutput() DatabaseMysqlOutput
	ToDatabaseMysqlOutputWithContext(ctx context.Context) DatabaseMysqlOutput
}

func (*DatabaseMysql) ElementType() reflect.Type {
	return reflect.TypeOf((**DatabaseMysql)(nil)).Elem()
}

func (i *DatabaseMysql) ToDatabaseMysqlOutput() DatabaseMysqlOutput {
	return i.ToDatabaseMysqlOutputWithContext(context.Background())
}

func (i *DatabaseMysql) ToDatabaseMysqlOutputWithContext(ctx context.Context) DatabaseMysqlOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DatabaseMysqlOutput)
}

// DatabaseMysqlArrayInput is an input type that accepts DatabaseMysqlArray and DatabaseMysqlArrayOutput values.
// You can construct a concrete instance of `DatabaseMysqlArrayInput` via:
//
//	DatabaseMysqlArray{ DatabaseMysqlArgs{...} }
type DatabaseMysqlArrayInput interface {
	pulumi.Input

	ToDatabaseMysqlArrayOutput() DatabaseMysqlArrayOutput
	ToDatabaseMysqlArrayOutputWithContext(context.Context) DatabaseMysqlArrayOutput
}

type DatabaseMysqlArray []DatabaseMysqlInput

func (DatabaseMysqlArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DatabaseMysql)(nil)).Elem()
}

func (i DatabaseMysqlArray) ToDatabaseMysqlArrayOutput() DatabaseMysqlArrayOutput {
	return i.ToDatabaseMysqlArrayOutputWithContext(context.Background())
}

func (i DatabaseMysqlArray) ToDatabaseMysqlArrayOutputWithContext(ctx context.Context) DatabaseMysqlArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DatabaseMysqlArrayOutput)
}

// DatabaseMysqlMapInput is an input type that accepts DatabaseMysqlMap and DatabaseMysqlMapOutput values.
// You can construct a concrete instance of `DatabaseMysqlMapInput` via:
//
//	DatabaseMysqlMap{ "key": DatabaseMysqlArgs{...} }
type DatabaseMysqlMapInput interface {
	pulumi.Input

	ToDatabaseMysqlMapOutput() DatabaseMysqlMapOutput
	ToDatabaseMysqlMapOutputWithContext(context.Context) DatabaseMysqlMapOutput
}

type DatabaseMysqlMap map[string]DatabaseMysqlInput

func (DatabaseMysqlMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DatabaseMysql)(nil)).Elem()
}

func (i DatabaseMysqlMap) ToDatabaseMysqlMapOutput() DatabaseMysqlMapOutput {
	return i.ToDatabaseMysqlMapOutputWithContext(context.Background())
}

func (i DatabaseMysqlMap) ToDatabaseMysqlMapOutputWithContext(ctx context.Context) DatabaseMysqlMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DatabaseMysqlMapOutput)
}

type DatabaseMysqlOutput struct{ *pulumi.OutputState }

func (DatabaseMysqlOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DatabaseMysql)(nil)).Elem()
}

func (o DatabaseMysqlOutput) ToDatabaseMysqlOutput() DatabaseMysqlOutput {
	return o
}

func (o DatabaseMysqlOutput) ToDatabaseMysqlOutputWithContext(ctx context.Context) DatabaseMysqlOutput {
	return o
}

// A list of IP addresses that can access the Managed Database. Each item can be a single IP address or a range in CIDR format. Use `DatabaseAccessControls` to manage your allow list separately.
func (o DatabaseMysqlOutput) AllowLists() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *DatabaseMysql) pulumi.StringArrayOutput { return v.AllowLists }).(pulumi.StringArrayOutput)
}

// The base64-encoded SSL CA certificate for the Managed Database instance.
func (o DatabaseMysqlOutput) CaCert() pulumi.StringOutput {
	return o.ApplyT(func(v *DatabaseMysql) pulumi.StringOutput { return v.CaCert }).(pulumi.StringOutput)
}

// The number of Linode Instance nodes deployed to the Managed Database. (default `1`)
func (o DatabaseMysqlOutput) ClusterSize() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *DatabaseMysql) pulumi.IntPtrOutput { return v.ClusterSize }).(pulumi.IntPtrOutput)
}

// When this Managed Database was created.
func (o DatabaseMysqlOutput) Created() pulumi.StringOutput {
	return o.ApplyT(func(v *DatabaseMysql) pulumi.StringOutput { return v.Created }).(pulumi.StringOutput)
}

// Whether the Managed Databases is encrypted. (default `false`)
func (o DatabaseMysqlOutput) Encrypted() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *DatabaseMysql) pulumi.BoolPtrOutput { return v.Encrypted }).(pulumi.BoolPtrOutput)
}

// The Managed Database engine. (e.g. `mysql`)
func (o DatabaseMysqlOutput) Engine() pulumi.StringOutput {
	return o.ApplyT(func(v *DatabaseMysql) pulumi.StringOutput { return v.Engine }).(pulumi.StringOutput)
}

// The Managed Database engine in engine/version format. (e.g. `mysql/8.0.26`)
func (o DatabaseMysqlOutput) EngineId() pulumi.StringOutput {
	return o.ApplyT(func(v *DatabaseMysql) pulumi.StringOutput { return v.EngineId }).(pulumi.StringOutput)
}

// The primary host for the Managed Database.
func (o DatabaseMysqlOutput) HostPrimary() pulumi.StringOutput {
	return o.ApplyT(func(v *DatabaseMysql) pulumi.StringOutput { return v.HostPrimary }).(pulumi.StringOutput)
}

// The secondary/private network host for the Managed Database.
func (o DatabaseMysqlOutput) HostSecondary() pulumi.StringOutput {
	return o.ApplyT(func(v *DatabaseMysql) pulumi.StringOutput { return v.HostSecondary }).(pulumi.StringOutput)
}

// A unique, user-defined string referring to the Managed Database.
func (o DatabaseMysqlOutput) Label() pulumi.StringOutput {
	return o.ApplyT(func(v *DatabaseMysql) pulumi.StringOutput { return v.Label }).(pulumi.StringOutput)
}

// The region to use for the Managed Database.
func (o DatabaseMysqlOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v *DatabaseMysql) pulumi.StringOutput { return v.Region }).(pulumi.StringOutput)
}

// The replication method used for the Managed Database. (`none`, `asynch`, `semiSynch`; default `none`)
func (o DatabaseMysqlOutput) ReplicationType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *DatabaseMysql) pulumi.StringPtrOutput { return v.ReplicationType }).(pulumi.StringPtrOutput)
}

// The randomly-generated root password for the Managed Database instance.
func (o DatabaseMysqlOutput) RootPassword() pulumi.StringOutput {
	return o.ApplyT(func(v *DatabaseMysql) pulumi.StringOutput { return v.RootPassword }).(pulumi.StringOutput)
}

// The root username for the Managed Database instance.
func (o DatabaseMysqlOutput) RootUsername() pulumi.StringOutput {
	return o.ApplyT(func(v *DatabaseMysql) pulumi.StringOutput { return v.RootUsername }).(pulumi.StringOutput)
}

// Whether to require SSL credentials to establish a connection to the Managed Database. (default `false`)
func (o DatabaseMysqlOutput) SslConnection() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *DatabaseMysql) pulumi.BoolPtrOutput { return v.SslConnection }).(pulumi.BoolPtrOutput)
}

// The operating status of the Managed Database.
func (o DatabaseMysqlOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *DatabaseMysql) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// The Linode Instance type used for the nodes of the  Managed Database instance.
func (o DatabaseMysqlOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *DatabaseMysql) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

// When this Managed Database was last updated.
func (o DatabaseMysqlOutput) Updated() pulumi.StringOutput {
	return o.ApplyT(func(v *DatabaseMysql) pulumi.StringOutput { return v.Updated }).(pulumi.StringOutput)
}

// Configuration settings for automated patch update maintenance for the Managed Database.
func (o DatabaseMysqlOutput) Updates() DatabaseMysqlUpdatesOutput {
	return o.ApplyT(func(v *DatabaseMysql) DatabaseMysqlUpdatesOutput { return v.Updates }).(DatabaseMysqlUpdatesOutput)
}

// The Managed Database engine version. (e.g. `v8.0.26`)
func (o DatabaseMysqlOutput) Version() pulumi.StringOutput {
	return o.ApplyT(func(v *DatabaseMysql) pulumi.StringOutput { return v.Version }).(pulumi.StringOutput)
}

type DatabaseMysqlArrayOutput struct{ *pulumi.OutputState }

func (DatabaseMysqlArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DatabaseMysql)(nil)).Elem()
}

func (o DatabaseMysqlArrayOutput) ToDatabaseMysqlArrayOutput() DatabaseMysqlArrayOutput {
	return o
}

func (o DatabaseMysqlArrayOutput) ToDatabaseMysqlArrayOutputWithContext(ctx context.Context) DatabaseMysqlArrayOutput {
	return o
}

func (o DatabaseMysqlArrayOutput) Index(i pulumi.IntInput) DatabaseMysqlOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DatabaseMysql {
		return vs[0].([]*DatabaseMysql)[vs[1].(int)]
	}).(DatabaseMysqlOutput)
}

type DatabaseMysqlMapOutput struct{ *pulumi.OutputState }

func (DatabaseMysqlMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DatabaseMysql)(nil)).Elem()
}

func (o DatabaseMysqlMapOutput) ToDatabaseMysqlMapOutput() DatabaseMysqlMapOutput {
	return o
}

func (o DatabaseMysqlMapOutput) ToDatabaseMysqlMapOutputWithContext(ctx context.Context) DatabaseMysqlMapOutput {
	return o
}

func (o DatabaseMysqlMapOutput) MapIndex(k pulumi.StringInput) DatabaseMysqlOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DatabaseMysql {
		return vs[0].(map[string]*DatabaseMysql)[vs[1].(string)]
	}).(DatabaseMysqlOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DatabaseMysqlInput)(nil)).Elem(), &DatabaseMysql{})
	pulumi.RegisterInputType(reflect.TypeOf((*DatabaseMysqlArrayInput)(nil)).Elem(), DatabaseMysqlArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DatabaseMysqlMapInput)(nil)).Elem(), DatabaseMysqlMap{})
	pulumi.RegisterOutputType(DatabaseMysqlOutput{})
	pulumi.RegisterOutputType(DatabaseMysqlArrayOutput{})
	pulumi.RegisterOutputType(DatabaseMysqlMapOutput{})
}
