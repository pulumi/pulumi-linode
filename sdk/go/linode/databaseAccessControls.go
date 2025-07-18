// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-linode/sdk/v5/go/linode/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages the access control for a Linode Database. Only one `DatabaseAccessControls` resource should be defined per-database.
// For more information, see the Linode APIv4 docs for [MySQL](https://techdocs.akamai.com/linode-api/reference/put-databases-mysql-instance) and [PostgreSQL](https://techdocs.akamai.com/linode-api/reference/put-databases-postgre-sql-instance).
//
// ## Example Usage
//
// Grant a Linode access to a database:
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
//			my_instance, err := linode.NewInstance(ctx, "my-instance", &linode.InstanceArgs{
//				Label:  pulumi.String("myinstance"),
//				Region: pulumi.String("us-southeast"),
//				Type:   pulumi.String("g6-nanode-1"),
//				Image:  pulumi.String("linode/alpine3.19"),
//			})
//			if err != nil {
//				return err
//			}
//			my_db, err := linode.NewDatabaseMysql(ctx, "my-db", &linode.DatabaseMysqlArgs{
//				Label:    pulumi.String("mydatabase"),
//				EngineId: pulumi.String("mysql/8.0.30"),
//				Region:   pulumi.String("us-southeast"),
//				Type:     pulumi.String("g6-nanode-1"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = linode.NewDatabaseAccessControls(ctx, "my-access", &linode.DatabaseAccessControlsArgs{
//				DatabaseId:   my_db.ID(),
//				DatabaseType: pulumi.String("mysql"),
//				AllowLists: pulumi.StringArray{
//					my_instance.IpAddress,
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
type DatabaseAccessControls struct {
	pulumi.CustomResourceState

	// A list of IP addresses that can access the Managed Database. Each item can be a single IP address or a range in CIDR format.
	AllowLists pulumi.StringArrayOutput `pulumi:"allowLists"`
	// The unique ID of the target database.
	DatabaseId pulumi.IntOutput `pulumi:"databaseId"`
	// The unique type of the target database. (`mysql`, `postgresql`)
	DatabaseType pulumi.StringOutput `pulumi:"databaseType"`
}

// NewDatabaseAccessControls registers a new resource with the given unique name, arguments, and options.
func NewDatabaseAccessControls(ctx *pulumi.Context,
	name string, args *DatabaseAccessControlsArgs, opts ...pulumi.ResourceOption) (*DatabaseAccessControls, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AllowLists == nil {
		return nil, errors.New("invalid value for required argument 'AllowLists'")
	}
	if args.DatabaseId == nil {
		return nil, errors.New("invalid value for required argument 'DatabaseId'")
	}
	if args.DatabaseType == nil {
		return nil, errors.New("invalid value for required argument 'DatabaseType'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource DatabaseAccessControls
	err := ctx.RegisterResource("linode:index/databaseAccessControls:DatabaseAccessControls", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDatabaseAccessControls gets an existing DatabaseAccessControls resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDatabaseAccessControls(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DatabaseAccessControlsState, opts ...pulumi.ResourceOption) (*DatabaseAccessControls, error) {
	var resource DatabaseAccessControls
	err := ctx.ReadResource("linode:index/databaseAccessControls:DatabaseAccessControls", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DatabaseAccessControls resources.
type databaseAccessControlsState struct {
	// A list of IP addresses that can access the Managed Database. Each item can be a single IP address or a range in CIDR format.
	AllowLists []string `pulumi:"allowLists"`
	// The unique ID of the target database.
	DatabaseId *int `pulumi:"databaseId"`
	// The unique type of the target database. (`mysql`, `postgresql`)
	DatabaseType *string `pulumi:"databaseType"`
}

type DatabaseAccessControlsState struct {
	// A list of IP addresses that can access the Managed Database. Each item can be a single IP address or a range in CIDR format.
	AllowLists pulumi.StringArrayInput
	// The unique ID of the target database.
	DatabaseId pulumi.IntPtrInput
	// The unique type of the target database. (`mysql`, `postgresql`)
	DatabaseType pulumi.StringPtrInput
}

func (DatabaseAccessControlsState) ElementType() reflect.Type {
	return reflect.TypeOf((*databaseAccessControlsState)(nil)).Elem()
}

type databaseAccessControlsArgs struct {
	// A list of IP addresses that can access the Managed Database. Each item can be a single IP address or a range in CIDR format.
	AllowLists []string `pulumi:"allowLists"`
	// The unique ID of the target database.
	DatabaseId int `pulumi:"databaseId"`
	// The unique type of the target database. (`mysql`, `postgresql`)
	DatabaseType string `pulumi:"databaseType"`
}

// The set of arguments for constructing a DatabaseAccessControls resource.
type DatabaseAccessControlsArgs struct {
	// A list of IP addresses that can access the Managed Database. Each item can be a single IP address or a range in CIDR format.
	AllowLists pulumi.StringArrayInput
	// The unique ID of the target database.
	DatabaseId pulumi.IntInput
	// The unique type of the target database. (`mysql`, `postgresql`)
	DatabaseType pulumi.StringInput
}

func (DatabaseAccessControlsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*databaseAccessControlsArgs)(nil)).Elem()
}

type DatabaseAccessControlsInput interface {
	pulumi.Input

	ToDatabaseAccessControlsOutput() DatabaseAccessControlsOutput
	ToDatabaseAccessControlsOutputWithContext(ctx context.Context) DatabaseAccessControlsOutput
}

func (*DatabaseAccessControls) ElementType() reflect.Type {
	return reflect.TypeOf((**DatabaseAccessControls)(nil)).Elem()
}

func (i *DatabaseAccessControls) ToDatabaseAccessControlsOutput() DatabaseAccessControlsOutput {
	return i.ToDatabaseAccessControlsOutputWithContext(context.Background())
}

func (i *DatabaseAccessControls) ToDatabaseAccessControlsOutputWithContext(ctx context.Context) DatabaseAccessControlsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DatabaseAccessControlsOutput)
}

// DatabaseAccessControlsArrayInput is an input type that accepts DatabaseAccessControlsArray and DatabaseAccessControlsArrayOutput values.
// You can construct a concrete instance of `DatabaseAccessControlsArrayInput` via:
//
//	DatabaseAccessControlsArray{ DatabaseAccessControlsArgs{...} }
type DatabaseAccessControlsArrayInput interface {
	pulumi.Input

	ToDatabaseAccessControlsArrayOutput() DatabaseAccessControlsArrayOutput
	ToDatabaseAccessControlsArrayOutputWithContext(context.Context) DatabaseAccessControlsArrayOutput
}

type DatabaseAccessControlsArray []DatabaseAccessControlsInput

func (DatabaseAccessControlsArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DatabaseAccessControls)(nil)).Elem()
}

func (i DatabaseAccessControlsArray) ToDatabaseAccessControlsArrayOutput() DatabaseAccessControlsArrayOutput {
	return i.ToDatabaseAccessControlsArrayOutputWithContext(context.Background())
}

func (i DatabaseAccessControlsArray) ToDatabaseAccessControlsArrayOutputWithContext(ctx context.Context) DatabaseAccessControlsArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DatabaseAccessControlsArrayOutput)
}

// DatabaseAccessControlsMapInput is an input type that accepts DatabaseAccessControlsMap and DatabaseAccessControlsMapOutput values.
// You can construct a concrete instance of `DatabaseAccessControlsMapInput` via:
//
//	DatabaseAccessControlsMap{ "key": DatabaseAccessControlsArgs{...} }
type DatabaseAccessControlsMapInput interface {
	pulumi.Input

	ToDatabaseAccessControlsMapOutput() DatabaseAccessControlsMapOutput
	ToDatabaseAccessControlsMapOutputWithContext(context.Context) DatabaseAccessControlsMapOutput
}

type DatabaseAccessControlsMap map[string]DatabaseAccessControlsInput

func (DatabaseAccessControlsMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DatabaseAccessControls)(nil)).Elem()
}

func (i DatabaseAccessControlsMap) ToDatabaseAccessControlsMapOutput() DatabaseAccessControlsMapOutput {
	return i.ToDatabaseAccessControlsMapOutputWithContext(context.Background())
}

func (i DatabaseAccessControlsMap) ToDatabaseAccessControlsMapOutputWithContext(ctx context.Context) DatabaseAccessControlsMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DatabaseAccessControlsMapOutput)
}

type DatabaseAccessControlsOutput struct{ *pulumi.OutputState }

func (DatabaseAccessControlsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DatabaseAccessControls)(nil)).Elem()
}

func (o DatabaseAccessControlsOutput) ToDatabaseAccessControlsOutput() DatabaseAccessControlsOutput {
	return o
}

func (o DatabaseAccessControlsOutput) ToDatabaseAccessControlsOutputWithContext(ctx context.Context) DatabaseAccessControlsOutput {
	return o
}

// A list of IP addresses that can access the Managed Database. Each item can be a single IP address or a range in CIDR format.
func (o DatabaseAccessControlsOutput) AllowLists() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *DatabaseAccessControls) pulumi.StringArrayOutput { return v.AllowLists }).(pulumi.StringArrayOutput)
}

// The unique ID of the target database.
func (o DatabaseAccessControlsOutput) DatabaseId() pulumi.IntOutput {
	return o.ApplyT(func(v *DatabaseAccessControls) pulumi.IntOutput { return v.DatabaseId }).(pulumi.IntOutput)
}

// The unique type of the target database. (`mysql`, `postgresql`)
func (o DatabaseAccessControlsOutput) DatabaseType() pulumi.StringOutput {
	return o.ApplyT(func(v *DatabaseAccessControls) pulumi.StringOutput { return v.DatabaseType }).(pulumi.StringOutput)
}

type DatabaseAccessControlsArrayOutput struct{ *pulumi.OutputState }

func (DatabaseAccessControlsArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DatabaseAccessControls)(nil)).Elem()
}

func (o DatabaseAccessControlsArrayOutput) ToDatabaseAccessControlsArrayOutput() DatabaseAccessControlsArrayOutput {
	return o
}

func (o DatabaseAccessControlsArrayOutput) ToDatabaseAccessControlsArrayOutputWithContext(ctx context.Context) DatabaseAccessControlsArrayOutput {
	return o
}

func (o DatabaseAccessControlsArrayOutput) Index(i pulumi.IntInput) DatabaseAccessControlsOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DatabaseAccessControls {
		return vs[0].([]*DatabaseAccessControls)[vs[1].(int)]
	}).(DatabaseAccessControlsOutput)
}

type DatabaseAccessControlsMapOutput struct{ *pulumi.OutputState }

func (DatabaseAccessControlsMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DatabaseAccessControls)(nil)).Elem()
}

func (o DatabaseAccessControlsMapOutput) ToDatabaseAccessControlsMapOutput() DatabaseAccessControlsMapOutput {
	return o
}

func (o DatabaseAccessControlsMapOutput) ToDatabaseAccessControlsMapOutputWithContext(ctx context.Context) DatabaseAccessControlsMapOutput {
	return o
}

func (o DatabaseAccessControlsMapOutput) MapIndex(k pulumi.StringInput) DatabaseAccessControlsOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DatabaseAccessControls {
		return vs[0].(map[string]*DatabaseAccessControls)[vs[1].(string)]
	}).(DatabaseAccessControlsOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DatabaseAccessControlsInput)(nil)).Elem(), &DatabaseAccessControls{})
	pulumi.RegisterInputType(reflect.TypeOf((*DatabaseAccessControlsArrayInput)(nil)).Elem(), DatabaseAccessControlsArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DatabaseAccessControlsMapInput)(nil)).Elem(), DatabaseAccessControlsMap{})
	pulumi.RegisterOutputType(DatabaseAccessControlsOutput{})
	pulumi.RegisterOutputType(DatabaseAccessControlsArrayOutput{})
	pulumi.RegisterOutputType(DatabaseAccessControlsMapOutput{})
}
