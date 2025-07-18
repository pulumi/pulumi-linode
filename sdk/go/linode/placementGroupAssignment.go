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

// Manages a single assignment between a Linode and a Placement Group.
// For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/post-group-add-linode).
//
// To prevent update conflicts, Linodes managed through the `Instance` resource should specify `placementGroupExternallyManaged`:
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
//			_, err := linode.NewInstance(ctx, "my-instance", &linode.InstanceArgs{
//				PlacementGroupExternallyManaged: pulumi.Bool(true),
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
// ## Example Usage
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
//			my_pg, err := linode.NewPlacementGroup(ctx, "my-pg", &linode.PlacementGroupArgs{
//				Label:              pulumi.String("my-pg"),
//				Region:             pulumi.String("us-east"),
//				PlacementGroupType: pulumi.String("anti_affinity:local"),
//			})
//			if err != nil {
//				return err
//			}
//			my_inst, err := linode.NewInstance(ctx, "my-inst", &linode.InstanceArgs{
//				Label:                           pulumi.String("my-inst"),
//				Region:                          pulumi.String("us-east"),
//				Type:                            pulumi.String("g6-nanode-1"),
//				PlacementGroupExternallyManaged: pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = linode.NewPlacementGroupAssignment(ctx, "my-assignment", &linode.PlacementGroupAssignmentArgs{
//				PlacementGroupId: my_pg.ID(),
//				LinodeId:         my_inst.ID(),
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
// ## Import
//
// Placement Group assignments can be imported using the Placement Group's ID followed by the Linode's ID separated by a comma, e.g.
//
// ```sh
// $ pulumi import linode:index/placementGroupAssignment:PlacementGroupAssignment my-assignment 1234567,7654321
// ```
type PlacementGroupAssignment struct {
	pulumi.CustomResourceState

	CompliantOnly pulumi.BoolPtrOutput `pulumi:"compliantOnly"`
	// The unique ID of the Linode to assign.
	LinodeId pulumi.IntOutput `pulumi:"linodeId"`
	// The unique ID of the target Placement Group.
	PlacementGroupId pulumi.IntOutput `pulumi:"placementGroupId"`
}

// NewPlacementGroupAssignment registers a new resource with the given unique name, arguments, and options.
func NewPlacementGroupAssignment(ctx *pulumi.Context,
	name string, args *PlacementGroupAssignmentArgs, opts ...pulumi.ResourceOption) (*PlacementGroupAssignment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.LinodeId == nil {
		return nil, errors.New("invalid value for required argument 'LinodeId'")
	}
	if args.PlacementGroupId == nil {
		return nil, errors.New("invalid value for required argument 'PlacementGroupId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource PlacementGroupAssignment
	err := ctx.RegisterResource("linode:index/placementGroupAssignment:PlacementGroupAssignment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPlacementGroupAssignment gets an existing PlacementGroupAssignment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPlacementGroupAssignment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PlacementGroupAssignmentState, opts ...pulumi.ResourceOption) (*PlacementGroupAssignment, error) {
	var resource PlacementGroupAssignment
	err := ctx.ReadResource("linode:index/placementGroupAssignment:PlacementGroupAssignment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering PlacementGroupAssignment resources.
type placementGroupAssignmentState struct {
	CompliantOnly *bool `pulumi:"compliantOnly"`
	// The unique ID of the Linode to assign.
	LinodeId *int `pulumi:"linodeId"`
	// The unique ID of the target Placement Group.
	PlacementGroupId *int `pulumi:"placementGroupId"`
}

type PlacementGroupAssignmentState struct {
	CompliantOnly pulumi.BoolPtrInput
	// The unique ID of the Linode to assign.
	LinodeId pulumi.IntPtrInput
	// The unique ID of the target Placement Group.
	PlacementGroupId pulumi.IntPtrInput
}

func (PlacementGroupAssignmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*placementGroupAssignmentState)(nil)).Elem()
}

type placementGroupAssignmentArgs struct {
	CompliantOnly *bool `pulumi:"compliantOnly"`
	// The unique ID of the Linode to assign.
	LinodeId int `pulumi:"linodeId"`
	// The unique ID of the target Placement Group.
	PlacementGroupId int `pulumi:"placementGroupId"`
}

// The set of arguments for constructing a PlacementGroupAssignment resource.
type PlacementGroupAssignmentArgs struct {
	CompliantOnly pulumi.BoolPtrInput
	// The unique ID of the Linode to assign.
	LinodeId pulumi.IntInput
	// The unique ID of the target Placement Group.
	PlacementGroupId pulumi.IntInput
}

func (PlacementGroupAssignmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*placementGroupAssignmentArgs)(nil)).Elem()
}

type PlacementGroupAssignmentInput interface {
	pulumi.Input

	ToPlacementGroupAssignmentOutput() PlacementGroupAssignmentOutput
	ToPlacementGroupAssignmentOutputWithContext(ctx context.Context) PlacementGroupAssignmentOutput
}

func (*PlacementGroupAssignment) ElementType() reflect.Type {
	return reflect.TypeOf((**PlacementGroupAssignment)(nil)).Elem()
}

func (i *PlacementGroupAssignment) ToPlacementGroupAssignmentOutput() PlacementGroupAssignmentOutput {
	return i.ToPlacementGroupAssignmentOutputWithContext(context.Background())
}

func (i *PlacementGroupAssignment) ToPlacementGroupAssignmentOutputWithContext(ctx context.Context) PlacementGroupAssignmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PlacementGroupAssignmentOutput)
}

// PlacementGroupAssignmentArrayInput is an input type that accepts PlacementGroupAssignmentArray and PlacementGroupAssignmentArrayOutput values.
// You can construct a concrete instance of `PlacementGroupAssignmentArrayInput` via:
//
//	PlacementGroupAssignmentArray{ PlacementGroupAssignmentArgs{...} }
type PlacementGroupAssignmentArrayInput interface {
	pulumi.Input

	ToPlacementGroupAssignmentArrayOutput() PlacementGroupAssignmentArrayOutput
	ToPlacementGroupAssignmentArrayOutputWithContext(context.Context) PlacementGroupAssignmentArrayOutput
}

type PlacementGroupAssignmentArray []PlacementGroupAssignmentInput

func (PlacementGroupAssignmentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PlacementGroupAssignment)(nil)).Elem()
}

func (i PlacementGroupAssignmentArray) ToPlacementGroupAssignmentArrayOutput() PlacementGroupAssignmentArrayOutput {
	return i.ToPlacementGroupAssignmentArrayOutputWithContext(context.Background())
}

func (i PlacementGroupAssignmentArray) ToPlacementGroupAssignmentArrayOutputWithContext(ctx context.Context) PlacementGroupAssignmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PlacementGroupAssignmentArrayOutput)
}

// PlacementGroupAssignmentMapInput is an input type that accepts PlacementGroupAssignmentMap and PlacementGroupAssignmentMapOutput values.
// You can construct a concrete instance of `PlacementGroupAssignmentMapInput` via:
//
//	PlacementGroupAssignmentMap{ "key": PlacementGroupAssignmentArgs{...} }
type PlacementGroupAssignmentMapInput interface {
	pulumi.Input

	ToPlacementGroupAssignmentMapOutput() PlacementGroupAssignmentMapOutput
	ToPlacementGroupAssignmentMapOutputWithContext(context.Context) PlacementGroupAssignmentMapOutput
}

type PlacementGroupAssignmentMap map[string]PlacementGroupAssignmentInput

func (PlacementGroupAssignmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PlacementGroupAssignment)(nil)).Elem()
}

func (i PlacementGroupAssignmentMap) ToPlacementGroupAssignmentMapOutput() PlacementGroupAssignmentMapOutput {
	return i.ToPlacementGroupAssignmentMapOutputWithContext(context.Background())
}

func (i PlacementGroupAssignmentMap) ToPlacementGroupAssignmentMapOutputWithContext(ctx context.Context) PlacementGroupAssignmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PlacementGroupAssignmentMapOutput)
}

type PlacementGroupAssignmentOutput struct{ *pulumi.OutputState }

func (PlacementGroupAssignmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**PlacementGroupAssignment)(nil)).Elem()
}

func (o PlacementGroupAssignmentOutput) ToPlacementGroupAssignmentOutput() PlacementGroupAssignmentOutput {
	return o
}

func (o PlacementGroupAssignmentOutput) ToPlacementGroupAssignmentOutputWithContext(ctx context.Context) PlacementGroupAssignmentOutput {
	return o
}

func (o PlacementGroupAssignmentOutput) CompliantOnly() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *PlacementGroupAssignment) pulumi.BoolPtrOutput { return v.CompliantOnly }).(pulumi.BoolPtrOutput)
}

// The unique ID of the Linode to assign.
func (o PlacementGroupAssignmentOutput) LinodeId() pulumi.IntOutput {
	return o.ApplyT(func(v *PlacementGroupAssignment) pulumi.IntOutput { return v.LinodeId }).(pulumi.IntOutput)
}

// The unique ID of the target Placement Group.
func (o PlacementGroupAssignmentOutput) PlacementGroupId() pulumi.IntOutput {
	return o.ApplyT(func(v *PlacementGroupAssignment) pulumi.IntOutput { return v.PlacementGroupId }).(pulumi.IntOutput)
}

type PlacementGroupAssignmentArrayOutput struct{ *pulumi.OutputState }

func (PlacementGroupAssignmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PlacementGroupAssignment)(nil)).Elem()
}

func (o PlacementGroupAssignmentArrayOutput) ToPlacementGroupAssignmentArrayOutput() PlacementGroupAssignmentArrayOutput {
	return o
}

func (o PlacementGroupAssignmentArrayOutput) ToPlacementGroupAssignmentArrayOutputWithContext(ctx context.Context) PlacementGroupAssignmentArrayOutput {
	return o
}

func (o PlacementGroupAssignmentArrayOutput) Index(i pulumi.IntInput) PlacementGroupAssignmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *PlacementGroupAssignment {
		return vs[0].([]*PlacementGroupAssignment)[vs[1].(int)]
	}).(PlacementGroupAssignmentOutput)
}

type PlacementGroupAssignmentMapOutput struct{ *pulumi.OutputState }

func (PlacementGroupAssignmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PlacementGroupAssignment)(nil)).Elem()
}

func (o PlacementGroupAssignmentMapOutput) ToPlacementGroupAssignmentMapOutput() PlacementGroupAssignmentMapOutput {
	return o
}

func (o PlacementGroupAssignmentMapOutput) ToPlacementGroupAssignmentMapOutputWithContext(ctx context.Context) PlacementGroupAssignmentMapOutput {
	return o
}

func (o PlacementGroupAssignmentMapOutput) MapIndex(k pulumi.StringInput) PlacementGroupAssignmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *PlacementGroupAssignment {
		return vs[0].(map[string]*PlacementGroupAssignment)[vs[1].(string)]
	}).(PlacementGroupAssignmentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PlacementGroupAssignmentInput)(nil)).Elem(), &PlacementGroupAssignment{})
	pulumi.RegisterInputType(reflect.TypeOf((*PlacementGroupAssignmentArrayInput)(nil)).Elem(), PlacementGroupAssignmentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PlacementGroupAssignmentMapInput)(nil)).Elem(), PlacementGroupAssignmentMap{})
	pulumi.RegisterOutputType(PlacementGroupAssignmentOutput{})
	pulumi.RegisterOutputType(PlacementGroupAssignmentArrayOutput{})
	pulumi.RegisterOutputType(PlacementGroupAssignmentMapOutput{})
}
