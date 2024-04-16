// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-linode/sdk/v4/go/linode/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Linode PostgreSQL Database resource. This can be used to create, modify, and delete Linode PostgreSQL Databases.
// For more information, see the [Linode APIv4 docs](https://www.linode.com/docs/api/databases/).
//
// Please keep in mind that Managed Databases can take up to an hour to provision.
//
// ## Example Usage
//
// Creating a simple PostgreSQL database instance:
//
// <!--Start PulumiCodeChooser -->
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
//			_, err := linode.NewDatabasePostgresql(ctx, "foobar", &linode.DatabasePostgresqlArgs{
//				Label:    pulumi.String("mydatabase"),
//				EngineId: pulumi.String("postgresql/13.2"),
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
// <!--End PulumiCodeChooser -->
//
// Creating a complex PostgreSQL database instance:
//
// <!--Start PulumiCodeChooser -->
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
//			_, err := linode.NewDatabasePostgresql(ctx, "foobar", &linode.DatabasePostgresqlArgs{
//				Label:    pulumi.String("mydatabase"),
//				EngineId: pulumi.String("postgresql/13.2"),
//				Region:   pulumi.String("us-southeast"),
//				Type:     pulumi.String("g6-nanode-1"),
//				AllowLists: pulumi.StringArray{
//					pulumi.String("0.0.0.0/0"),
//				},
//				ClusterSize:           pulumi.Int(3),
//				Encrypted:             pulumi.Bool(true),
//				ReplicationType:       pulumi.String("semi_synch"),
//				ReplicationCommitType: pulumi.String("remote_write"),
//				SslConnection:         pulumi.Bool(true),
//				Updates: &linode.DatabasePostgresqlUpdatesArgs{
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
// <!--End PulumiCodeChooser -->
//
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
// Linode PostgreSQL Databases can be imported using the `id`, e.g.
//
// ```sh
// $ pulumi import linode:index/databasePostgresql:DatabasePostgresql foobar 1234567
// ```
type DatabasePostgresql struct {
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
	// The Managed Database engine. (e.g. `postgresql`)
	Engine pulumi.StringOutput `pulumi:"engine"`
	// The Managed Database engine in engine/version format. (e.g. `postgresql/13.2`)
	EngineId pulumi.StringOutput `pulumi:"engineId"`
	// The primary host for the Managed Database.
	HostPrimary pulumi.StringOutput `pulumi:"hostPrimary"`
	// The secondary/private network host for the Managed Database.
	HostSecondary pulumi.StringOutput `pulumi:"hostSecondary"`
	// A unique, user-defined string referring to the Managed Database.
	Label pulumi.StringOutput `pulumi:"label"`
	// The access port for this Managed Database.
	Port pulumi.IntOutput `pulumi:"port"`
	// The region to use for the Managed Database.
	Region pulumi.StringOutput `pulumi:"region"`
	// The synchronization level of the replicating server. (`on`, `local`, `remoteWrite`, `remoteApply`, `off`; default `off`)
	//
	// * Must be `local` or `off` for the `asynch` replication type.
	//
	// * Must be `on`, `remoteWrite`, or `remoteApply` for the `semiSynch` replication type.
	ReplicationCommitType pulumi.StringPtrOutput `pulumi:"replicationCommitType"`
	// The replication method used for the Managed Database. (`none`, `asynch`, `semiSynch`; default `none`)
	//
	// * Must be `none` for a single node cluster.
	//
	// * Must be `asynch` or `semiSynch` for a high availability cluster.
	ReplicationType pulumi.StringPtrOutput `pulumi:"replicationType"`
	// The randomly-generated root password for the Managed Database instance.
	RootPassword pulumi.StringOutput `pulumi:"rootPassword"`
	// The root username for the Managed Database instance.
	RootUsername pulumi.StringOutput `pulumi:"rootUsername"`
	// Whether to require SSL credentials to establish a connection to the Managed Database. (default `false`)
	//
	// * `updates` - (Optional) Configuration settings for automated patch update maintenance for the Managed Database.
	SslConnection pulumi.BoolPtrOutput `pulumi:"sslConnection"`
	// The operating status of the Managed Database.
	Status pulumi.StringOutput `pulumi:"status"`
	// The Linode Instance type used for the nodes of the  Managed Database instance.
	//
	// ***
	Type pulumi.StringOutput `pulumi:"type"`
	// When this Managed Database was last updated.
	Updated pulumi.StringOutput `pulumi:"updated"`
	// Configuration settings for automated patch update maintenance for the Managed Database.
	Updates DatabasePostgresqlUpdatesOutput `pulumi:"updates"`
	// The Managed Database engine version. (e.g. `13.2`)
	Version pulumi.StringOutput `pulumi:"version"`
}

// NewDatabasePostgresql registers a new resource with the given unique name, arguments, and options.
func NewDatabasePostgresql(ctx *pulumi.Context,
	name string, args *DatabasePostgresqlArgs, opts ...pulumi.ResourceOption) (*DatabasePostgresql, error) {
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
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"caCert",
		"rootPassword",
		"rootUsername",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource DatabasePostgresql
	err := ctx.RegisterResource("linode:index/databasePostgresql:DatabasePostgresql", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDatabasePostgresql gets an existing DatabasePostgresql resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDatabasePostgresql(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DatabasePostgresqlState, opts ...pulumi.ResourceOption) (*DatabasePostgresql, error) {
	var resource DatabasePostgresql
	err := ctx.ReadResource("linode:index/databasePostgresql:DatabasePostgresql", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DatabasePostgresql resources.
type databasePostgresqlState struct {
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
	// The Managed Database engine. (e.g. `postgresql`)
	Engine *string `pulumi:"engine"`
	// The Managed Database engine in engine/version format. (e.g. `postgresql/13.2`)
	EngineId *string `pulumi:"engineId"`
	// The primary host for the Managed Database.
	HostPrimary *string `pulumi:"hostPrimary"`
	// The secondary/private network host for the Managed Database.
	HostSecondary *string `pulumi:"hostSecondary"`
	// A unique, user-defined string referring to the Managed Database.
	Label *string `pulumi:"label"`
	// The access port for this Managed Database.
	Port *int `pulumi:"port"`
	// The region to use for the Managed Database.
	Region *string `pulumi:"region"`
	// The synchronization level of the replicating server. (`on`, `local`, `remoteWrite`, `remoteApply`, `off`; default `off`)
	//
	// * Must be `local` or `off` for the `asynch` replication type.
	//
	// * Must be `on`, `remoteWrite`, or `remoteApply` for the `semiSynch` replication type.
	ReplicationCommitType *string `pulumi:"replicationCommitType"`
	// The replication method used for the Managed Database. (`none`, `asynch`, `semiSynch`; default `none`)
	//
	// * Must be `none` for a single node cluster.
	//
	// * Must be `asynch` or `semiSynch` for a high availability cluster.
	ReplicationType *string `pulumi:"replicationType"`
	// The randomly-generated root password for the Managed Database instance.
	RootPassword *string `pulumi:"rootPassword"`
	// The root username for the Managed Database instance.
	RootUsername *string `pulumi:"rootUsername"`
	// Whether to require SSL credentials to establish a connection to the Managed Database. (default `false`)
	//
	// * `updates` - (Optional) Configuration settings for automated patch update maintenance for the Managed Database.
	SslConnection *bool `pulumi:"sslConnection"`
	// The operating status of the Managed Database.
	Status *string `pulumi:"status"`
	// The Linode Instance type used for the nodes of the  Managed Database instance.
	//
	// ***
	Type *string `pulumi:"type"`
	// When this Managed Database was last updated.
	Updated *string `pulumi:"updated"`
	// Configuration settings for automated patch update maintenance for the Managed Database.
	Updates *DatabasePostgresqlUpdates `pulumi:"updates"`
	// The Managed Database engine version. (e.g. `13.2`)
	Version *string `pulumi:"version"`
}

type DatabasePostgresqlState struct {
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
	// The Managed Database engine. (e.g. `postgresql`)
	Engine pulumi.StringPtrInput
	// The Managed Database engine in engine/version format. (e.g. `postgresql/13.2`)
	EngineId pulumi.StringPtrInput
	// The primary host for the Managed Database.
	HostPrimary pulumi.StringPtrInput
	// The secondary/private network host for the Managed Database.
	HostSecondary pulumi.StringPtrInput
	// A unique, user-defined string referring to the Managed Database.
	Label pulumi.StringPtrInput
	// The access port for this Managed Database.
	Port pulumi.IntPtrInput
	// The region to use for the Managed Database.
	Region pulumi.StringPtrInput
	// The synchronization level of the replicating server. (`on`, `local`, `remoteWrite`, `remoteApply`, `off`; default `off`)
	//
	// * Must be `local` or `off` for the `asynch` replication type.
	//
	// * Must be `on`, `remoteWrite`, or `remoteApply` for the `semiSynch` replication type.
	ReplicationCommitType pulumi.StringPtrInput
	// The replication method used for the Managed Database. (`none`, `asynch`, `semiSynch`; default `none`)
	//
	// * Must be `none` for a single node cluster.
	//
	// * Must be `asynch` or `semiSynch` for a high availability cluster.
	ReplicationType pulumi.StringPtrInput
	// The randomly-generated root password for the Managed Database instance.
	RootPassword pulumi.StringPtrInput
	// The root username for the Managed Database instance.
	RootUsername pulumi.StringPtrInput
	// Whether to require SSL credentials to establish a connection to the Managed Database. (default `false`)
	//
	// * `updates` - (Optional) Configuration settings for automated patch update maintenance for the Managed Database.
	SslConnection pulumi.BoolPtrInput
	// The operating status of the Managed Database.
	Status pulumi.StringPtrInput
	// The Linode Instance type used for the nodes of the  Managed Database instance.
	//
	// ***
	Type pulumi.StringPtrInput
	// When this Managed Database was last updated.
	Updated pulumi.StringPtrInput
	// Configuration settings for automated patch update maintenance for the Managed Database.
	Updates DatabasePostgresqlUpdatesPtrInput
	// The Managed Database engine version. (e.g. `13.2`)
	Version pulumi.StringPtrInput
}

func (DatabasePostgresqlState) ElementType() reflect.Type {
	return reflect.TypeOf((*databasePostgresqlState)(nil)).Elem()
}

type databasePostgresqlArgs struct {
	// A list of IP addresses that can access the Managed Database. Each item can be a single IP address or a range in CIDR format. Use `DatabaseAccessControls` to manage your allow list separately.
	AllowLists []string `pulumi:"allowLists"`
	// The number of Linode Instance nodes deployed to the Managed Database. (default `1`)
	ClusterSize *int `pulumi:"clusterSize"`
	// Whether the Managed Databases is encrypted. (default `false`)
	Encrypted *bool `pulumi:"encrypted"`
	// The Managed Database engine in engine/version format. (e.g. `postgresql/13.2`)
	EngineId string `pulumi:"engineId"`
	// A unique, user-defined string referring to the Managed Database.
	Label string `pulumi:"label"`
	// The region to use for the Managed Database.
	Region string `pulumi:"region"`
	// The synchronization level of the replicating server. (`on`, `local`, `remoteWrite`, `remoteApply`, `off`; default `off`)
	//
	// * Must be `local` or `off` for the `asynch` replication type.
	//
	// * Must be `on`, `remoteWrite`, or `remoteApply` for the `semiSynch` replication type.
	ReplicationCommitType *string `pulumi:"replicationCommitType"`
	// The replication method used for the Managed Database. (`none`, `asynch`, `semiSynch`; default `none`)
	//
	// * Must be `none` for a single node cluster.
	//
	// * Must be `asynch` or `semiSynch` for a high availability cluster.
	ReplicationType *string `pulumi:"replicationType"`
	// Whether to require SSL credentials to establish a connection to the Managed Database. (default `false`)
	//
	// * `updates` - (Optional) Configuration settings for automated patch update maintenance for the Managed Database.
	SslConnection *bool `pulumi:"sslConnection"`
	// The Linode Instance type used for the nodes of the  Managed Database instance.
	//
	// ***
	Type string `pulumi:"type"`
	// Configuration settings for automated patch update maintenance for the Managed Database.
	Updates *DatabasePostgresqlUpdates `pulumi:"updates"`
}

// The set of arguments for constructing a DatabasePostgresql resource.
type DatabasePostgresqlArgs struct {
	// A list of IP addresses that can access the Managed Database. Each item can be a single IP address or a range in CIDR format. Use `DatabaseAccessControls` to manage your allow list separately.
	AllowLists pulumi.StringArrayInput
	// The number of Linode Instance nodes deployed to the Managed Database. (default `1`)
	ClusterSize pulumi.IntPtrInput
	// Whether the Managed Databases is encrypted. (default `false`)
	Encrypted pulumi.BoolPtrInput
	// The Managed Database engine in engine/version format. (e.g. `postgresql/13.2`)
	EngineId pulumi.StringInput
	// A unique, user-defined string referring to the Managed Database.
	Label pulumi.StringInput
	// The region to use for the Managed Database.
	Region pulumi.StringInput
	// The synchronization level of the replicating server. (`on`, `local`, `remoteWrite`, `remoteApply`, `off`; default `off`)
	//
	// * Must be `local` or `off` for the `asynch` replication type.
	//
	// * Must be `on`, `remoteWrite`, or `remoteApply` for the `semiSynch` replication type.
	ReplicationCommitType pulumi.StringPtrInput
	// The replication method used for the Managed Database. (`none`, `asynch`, `semiSynch`; default `none`)
	//
	// * Must be `none` for a single node cluster.
	//
	// * Must be `asynch` or `semiSynch` for a high availability cluster.
	ReplicationType pulumi.StringPtrInput
	// Whether to require SSL credentials to establish a connection to the Managed Database. (default `false`)
	//
	// * `updates` - (Optional) Configuration settings for automated patch update maintenance for the Managed Database.
	SslConnection pulumi.BoolPtrInput
	// The Linode Instance type used for the nodes of the  Managed Database instance.
	//
	// ***
	Type pulumi.StringInput
	// Configuration settings for automated patch update maintenance for the Managed Database.
	Updates DatabasePostgresqlUpdatesPtrInput
}

func (DatabasePostgresqlArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*databasePostgresqlArgs)(nil)).Elem()
}

type DatabasePostgresqlInput interface {
	pulumi.Input

	ToDatabasePostgresqlOutput() DatabasePostgresqlOutput
	ToDatabasePostgresqlOutputWithContext(ctx context.Context) DatabasePostgresqlOutput
}

func (*DatabasePostgresql) ElementType() reflect.Type {
	return reflect.TypeOf((**DatabasePostgresql)(nil)).Elem()
}

func (i *DatabasePostgresql) ToDatabasePostgresqlOutput() DatabasePostgresqlOutput {
	return i.ToDatabasePostgresqlOutputWithContext(context.Background())
}

func (i *DatabasePostgresql) ToDatabasePostgresqlOutputWithContext(ctx context.Context) DatabasePostgresqlOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DatabasePostgresqlOutput)
}

// DatabasePostgresqlArrayInput is an input type that accepts DatabasePostgresqlArray and DatabasePostgresqlArrayOutput values.
// You can construct a concrete instance of `DatabasePostgresqlArrayInput` via:
//
//	DatabasePostgresqlArray{ DatabasePostgresqlArgs{...} }
type DatabasePostgresqlArrayInput interface {
	pulumi.Input

	ToDatabasePostgresqlArrayOutput() DatabasePostgresqlArrayOutput
	ToDatabasePostgresqlArrayOutputWithContext(context.Context) DatabasePostgresqlArrayOutput
}

type DatabasePostgresqlArray []DatabasePostgresqlInput

func (DatabasePostgresqlArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DatabasePostgresql)(nil)).Elem()
}

func (i DatabasePostgresqlArray) ToDatabasePostgresqlArrayOutput() DatabasePostgresqlArrayOutput {
	return i.ToDatabasePostgresqlArrayOutputWithContext(context.Background())
}

func (i DatabasePostgresqlArray) ToDatabasePostgresqlArrayOutputWithContext(ctx context.Context) DatabasePostgresqlArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DatabasePostgresqlArrayOutput)
}

// DatabasePostgresqlMapInput is an input type that accepts DatabasePostgresqlMap and DatabasePostgresqlMapOutput values.
// You can construct a concrete instance of `DatabasePostgresqlMapInput` via:
//
//	DatabasePostgresqlMap{ "key": DatabasePostgresqlArgs{...} }
type DatabasePostgresqlMapInput interface {
	pulumi.Input

	ToDatabasePostgresqlMapOutput() DatabasePostgresqlMapOutput
	ToDatabasePostgresqlMapOutputWithContext(context.Context) DatabasePostgresqlMapOutput
}

type DatabasePostgresqlMap map[string]DatabasePostgresqlInput

func (DatabasePostgresqlMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DatabasePostgresql)(nil)).Elem()
}

func (i DatabasePostgresqlMap) ToDatabasePostgresqlMapOutput() DatabasePostgresqlMapOutput {
	return i.ToDatabasePostgresqlMapOutputWithContext(context.Background())
}

func (i DatabasePostgresqlMap) ToDatabasePostgresqlMapOutputWithContext(ctx context.Context) DatabasePostgresqlMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DatabasePostgresqlMapOutput)
}

type DatabasePostgresqlOutput struct{ *pulumi.OutputState }

func (DatabasePostgresqlOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DatabasePostgresql)(nil)).Elem()
}

func (o DatabasePostgresqlOutput) ToDatabasePostgresqlOutput() DatabasePostgresqlOutput {
	return o
}

func (o DatabasePostgresqlOutput) ToDatabasePostgresqlOutputWithContext(ctx context.Context) DatabasePostgresqlOutput {
	return o
}

// A list of IP addresses that can access the Managed Database. Each item can be a single IP address or a range in CIDR format. Use `DatabaseAccessControls` to manage your allow list separately.
func (o DatabasePostgresqlOutput) AllowLists() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *DatabasePostgresql) pulumi.StringArrayOutput { return v.AllowLists }).(pulumi.StringArrayOutput)
}

// The base64-encoded SSL CA certificate for the Managed Database instance.
func (o DatabasePostgresqlOutput) CaCert() pulumi.StringOutput {
	return o.ApplyT(func(v *DatabasePostgresql) pulumi.StringOutput { return v.CaCert }).(pulumi.StringOutput)
}

// The number of Linode Instance nodes deployed to the Managed Database. (default `1`)
func (o DatabasePostgresqlOutput) ClusterSize() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *DatabasePostgresql) pulumi.IntPtrOutput { return v.ClusterSize }).(pulumi.IntPtrOutput)
}

// When this Managed Database was created.
func (o DatabasePostgresqlOutput) Created() pulumi.StringOutput {
	return o.ApplyT(func(v *DatabasePostgresql) pulumi.StringOutput { return v.Created }).(pulumi.StringOutput)
}

// Whether the Managed Databases is encrypted. (default `false`)
func (o DatabasePostgresqlOutput) Encrypted() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *DatabasePostgresql) pulumi.BoolPtrOutput { return v.Encrypted }).(pulumi.BoolPtrOutput)
}

// The Managed Database engine. (e.g. `postgresql`)
func (o DatabasePostgresqlOutput) Engine() pulumi.StringOutput {
	return o.ApplyT(func(v *DatabasePostgresql) pulumi.StringOutput { return v.Engine }).(pulumi.StringOutput)
}

// The Managed Database engine in engine/version format. (e.g. `postgresql/13.2`)
func (o DatabasePostgresqlOutput) EngineId() pulumi.StringOutput {
	return o.ApplyT(func(v *DatabasePostgresql) pulumi.StringOutput { return v.EngineId }).(pulumi.StringOutput)
}

// The primary host for the Managed Database.
func (o DatabasePostgresqlOutput) HostPrimary() pulumi.StringOutput {
	return o.ApplyT(func(v *DatabasePostgresql) pulumi.StringOutput { return v.HostPrimary }).(pulumi.StringOutput)
}

// The secondary/private network host for the Managed Database.
func (o DatabasePostgresqlOutput) HostSecondary() pulumi.StringOutput {
	return o.ApplyT(func(v *DatabasePostgresql) pulumi.StringOutput { return v.HostSecondary }).(pulumi.StringOutput)
}

// A unique, user-defined string referring to the Managed Database.
func (o DatabasePostgresqlOutput) Label() pulumi.StringOutput {
	return o.ApplyT(func(v *DatabasePostgresql) pulumi.StringOutput { return v.Label }).(pulumi.StringOutput)
}

// The access port for this Managed Database.
func (o DatabasePostgresqlOutput) Port() pulumi.IntOutput {
	return o.ApplyT(func(v *DatabasePostgresql) pulumi.IntOutput { return v.Port }).(pulumi.IntOutput)
}

// The region to use for the Managed Database.
func (o DatabasePostgresqlOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v *DatabasePostgresql) pulumi.StringOutput { return v.Region }).(pulumi.StringOutput)
}

// The synchronization level of the replicating server. (`on`, `local`, `remoteWrite`, `remoteApply`, `off`; default `off`)
//
// * Must be `local` or `off` for the `asynch` replication type.
//
// * Must be `on`, `remoteWrite`, or `remoteApply` for the `semiSynch` replication type.
func (o DatabasePostgresqlOutput) ReplicationCommitType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *DatabasePostgresql) pulumi.StringPtrOutput { return v.ReplicationCommitType }).(pulumi.StringPtrOutput)
}

// The replication method used for the Managed Database. (`none`, `asynch`, `semiSynch`; default `none`)
//
// * Must be `none` for a single node cluster.
//
// * Must be `asynch` or `semiSynch` for a high availability cluster.
func (o DatabasePostgresqlOutput) ReplicationType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *DatabasePostgresql) pulumi.StringPtrOutput { return v.ReplicationType }).(pulumi.StringPtrOutput)
}

// The randomly-generated root password for the Managed Database instance.
func (o DatabasePostgresqlOutput) RootPassword() pulumi.StringOutput {
	return o.ApplyT(func(v *DatabasePostgresql) pulumi.StringOutput { return v.RootPassword }).(pulumi.StringOutput)
}

// The root username for the Managed Database instance.
func (o DatabasePostgresqlOutput) RootUsername() pulumi.StringOutput {
	return o.ApplyT(func(v *DatabasePostgresql) pulumi.StringOutput { return v.RootUsername }).(pulumi.StringOutput)
}

// Whether to require SSL credentials to establish a connection to the Managed Database. (default `false`)
//
// * `updates` - (Optional) Configuration settings for automated patch update maintenance for the Managed Database.
func (o DatabasePostgresqlOutput) SslConnection() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *DatabasePostgresql) pulumi.BoolPtrOutput { return v.SslConnection }).(pulumi.BoolPtrOutput)
}

// The operating status of the Managed Database.
func (o DatabasePostgresqlOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *DatabasePostgresql) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// The Linode Instance type used for the nodes of the  Managed Database instance.
//
// ***
func (o DatabasePostgresqlOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *DatabasePostgresql) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

// When this Managed Database was last updated.
func (o DatabasePostgresqlOutput) Updated() pulumi.StringOutput {
	return o.ApplyT(func(v *DatabasePostgresql) pulumi.StringOutput { return v.Updated }).(pulumi.StringOutput)
}

// Configuration settings for automated patch update maintenance for the Managed Database.
func (o DatabasePostgresqlOutput) Updates() DatabasePostgresqlUpdatesOutput {
	return o.ApplyT(func(v *DatabasePostgresql) DatabasePostgresqlUpdatesOutput { return v.Updates }).(DatabasePostgresqlUpdatesOutput)
}

// The Managed Database engine version. (e.g. `13.2`)
func (o DatabasePostgresqlOutput) Version() pulumi.StringOutput {
	return o.ApplyT(func(v *DatabasePostgresql) pulumi.StringOutput { return v.Version }).(pulumi.StringOutput)
}

type DatabasePostgresqlArrayOutput struct{ *pulumi.OutputState }

func (DatabasePostgresqlArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DatabasePostgresql)(nil)).Elem()
}

func (o DatabasePostgresqlArrayOutput) ToDatabasePostgresqlArrayOutput() DatabasePostgresqlArrayOutput {
	return o
}

func (o DatabasePostgresqlArrayOutput) ToDatabasePostgresqlArrayOutputWithContext(ctx context.Context) DatabasePostgresqlArrayOutput {
	return o
}

func (o DatabasePostgresqlArrayOutput) Index(i pulumi.IntInput) DatabasePostgresqlOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DatabasePostgresql {
		return vs[0].([]*DatabasePostgresql)[vs[1].(int)]
	}).(DatabasePostgresqlOutput)
}

type DatabasePostgresqlMapOutput struct{ *pulumi.OutputState }

func (DatabasePostgresqlMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DatabasePostgresql)(nil)).Elem()
}

func (o DatabasePostgresqlMapOutput) ToDatabasePostgresqlMapOutput() DatabasePostgresqlMapOutput {
	return o
}

func (o DatabasePostgresqlMapOutput) ToDatabasePostgresqlMapOutputWithContext(ctx context.Context) DatabasePostgresqlMapOutput {
	return o
}

func (o DatabasePostgresqlMapOutput) MapIndex(k pulumi.StringInput) DatabasePostgresqlOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DatabasePostgresql {
		return vs[0].(map[string]*DatabasePostgresql)[vs[1].(string)]
	}).(DatabasePostgresqlOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DatabasePostgresqlInput)(nil)).Elem(), &DatabasePostgresql{})
	pulumi.RegisterInputType(reflect.TypeOf((*DatabasePostgresqlArrayInput)(nil)).Elem(), DatabasePostgresqlArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DatabasePostgresqlMapInput)(nil)).Elem(), DatabasePostgresqlMap{})
	pulumi.RegisterOutputType(DatabasePostgresqlOutput{})
	pulumi.RegisterOutputType(DatabasePostgresqlArrayOutput{})
	pulumi.RegisterOutputType(DatabasePostgresqlMapOutput{})
}
