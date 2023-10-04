// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-linode/sdk/v4/go/linode/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// > **Beta Notice** IPv6 sharing is currently available through early access.
// To use early access resources, the `apiVersion` provider argument must be set to `v4beta`.
// To learn more, see the early access documentation.
//
// > **Notice** This resource should only be defined once per-instance and should not be used alongside the `sharedIpv4` field in `Instance`.
//
// Manages IPs shared to a Linode instance.
type InstanceSharedIps struct {
	pulumi.CustomResourceState

	// The set of IPs to share with the Linode.
	Addresses pulumi.StringArrayOutput `pulumi:"addresses"`
	// The ID of the Linode to share the IPs to.
	LinodeId pulumi.IntOutput `pulumi:"linodeId"`
}

// NewInstanceSharedIps registers a new resource with the given unique name, arguments, and options.
func NewInstanceSharedIps(ctx *pulumi.Context,
	name string, args *InstanceSharedIpsArgs, opts ...pulumi.ResourceOption) (*InstanceSharedIps, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Addresses == nil {
		return nil, errors.New("invalid value for required argument 'Addresses'")
	}
	if args.LinodeId == nil {
		return nil, errors.New("invalid value for required argument 'LinodeId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource InstanceSharedIps
	err := ctx.RegisterResource("linode:index/instanceSharedIps:InstanceSharedIps", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetInstanceSharedIps gets an existing InstanceSharedIps resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetInstanceSharedIps(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *InstanceSharedIpsState, opts ...pulumi.ResourceOption) (*InstanceSharedIps, error) {
	var resource InstanceSharedIps
	err := ctx.ReadResource("linode:index/instanceSharedIps:InstanceSharedIps", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering InstanceSharedIps resources.
type instanceSharedIpsState struct {
	// The set of IPs to share with the Linode.
	Addresses []string `pulumi:"addresses"`
	// The ID of the Linode to share the IPs to.
	LinodeId *int `pulumi:"linodeId"`
}

type InstanceSharedIpsState struct {
	// The set of IPs to share with the Linode.
	Addresses pulumi.StringArrayInput
	// The ID of the Linode to share the IPs to.
	LinodeId pulumi.IntPtrInput
}

func (InstanceSharedIpsState) ElementType() reflect.Type {
	return reflect.TypeOf((*instanceSharedIpsState)(nil)).Elem()
}

type instanceSharedIpsArgs struct {
	// The set of IPs to share with the Linode.
	Addresses []string `pulumi:"addresses"`
	// The ID of the Linode to share the IPs to.
	LinodeId int `pulumi:"linodeId"`
}

// The set of arguments for constructing a InstanceSharedIps resource.
type InstanceSharedIpsArgs struct {
	// The set of IPs to share with the Linode.
	Addresses pulumi.StringArrayInput
	// The ID of the Linode to share the IPs to.
	LinodeId pulumi.IntInput
}

func (InstanceSharedIpsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*instanceSharedIpsArgs)(nil)).Elem()
}

type InstanceSharedIpsInput interface {
	pulumi.Input

	ToInstanceSharedIpsOutput() InstanceSharedIpsOutput
	ToInstanceSharedIpsOutputWithContext(ctx context.Context) InstanceSharedIpsOutput
}

func (*InstanceSharedIps) ElementType() reflect.Type {
	return reflect.TypeOf((**InstanceSharedIps)(nil)).Elem()
}

func (i *InstanceSharedIps) ToInstanceSharedIpsOutput() InstanceSharedIpsOutput {
	return i.ToInstanceSharedIpsOutputWithContext(context.Background())
}

func (i *InstanceSharedIps) ToInstanceSharedIpsOutputWithContext(ctx context.Context) InstanceSharedIpsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceSharedIpsOutput)
}

func (i *InstanceSharedIps) ToOutput(ctx context.Context) pulumix.Output[*InstanceSharedIps] {
	return pulumix.Output[*InstanceSharedIps]{
		OutputState: i.ToInstanceSharedIpsOutputWithContext(ctx).OutputState,
	}
}

// InstanceSharedIpsArrayInput is an input type that accepts InstanceSharedIpsArray and InstanceSharedIpsArrayOutput values.
// You can construct a concrete instance of `InstanceSharedIpsArrayInput` via:
//
//	InstanceSharedIpsArray{ InstanceSharedIpsArgs{...} }
type InstanceSharedIpsArrayInput interface {
	pulumi.Input

	ToInstanceSharedIpsArrayOutput() InstanceSharedIpsArrayOutput
	ToInstanceSharedIpsArrayOutputWithContext(context.Context) InstanceSharedIpsArrayOutput
}

type InstanceSharedIpsArray []InstanceSharedIpsInput

func (InstanceSharedIpsArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*InstanceSharedIps)(nil)).Elem()
}

func (i InstanceSharedIpsArray) ToInstanceSharedIpsArrayOutput() InstanceSharedIpsArrayOutput {
	return i.ToInstanceSharedIpsArrayOutputWithContext(context.Background())
}

func (i InstanceSharedIpsArray) ToInstanceSharedIpsArrayOutputWithContext(ctx context.Context) InstanceSharedIpsArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceSharedIpsArrayOutput)
}

func (i InstanceSharedIpsArray) ToOutput(ctx context.Context) pulumix.Output[[]*InstanceSharedIps] {
	return pulumix.Output[[]*InstanceSharedIps]{
		OutputState: i.ToInstanceSharedIpsArrayOutputWithContext(ctx).OutputState,
	}
}

// InstanceSharedIpsMapInput is an input type that accepts InstanceSharedIpsMap and InstanceSharedIpsMapOutput values.
// You can construct a concrete instance of `InstanceSharedIpsMapInput` via:
//
//	InstanceSharedIpsMap{ "key": InstanceSharedIpsArgs{...} }
type InstanceSharedIpsMapInput interface {
	pulumi.Input

	ToInstanceSharedIpsMapOutput() InstanceSharedIpsMapOutput
	ToInstanceSharedIpsMapOutputWithContext(context.Context) InstanceSharedIpsMapOutput
}

type InstanceSharedIpsMap map[string]InstanceSharedIpsInput

func (InstanceSharedIpsMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*InstanceSharedIps)(nil)).Elem()
}

func (i InstanceSharedIpsMap) ToInstanceSharedIpsMapOutput() InstanceSharedIpsMapOutput {
	return i.ToInstanceSharedIpsMapOutputWithContext(context.Background())
}

func (i InstanceSharedIpsMap) ToInstanceSharedIpsMapOutputWithContext(ctx context.Context) InstanceSharedIpsMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceSharedIpsMapOutput)
}

func (i InstanceSharedIpsMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*InstanceSharedIps] {
	return pulumix.Output[map[string]*InstanceSharedIps]{
		OutputState: i.ToInstanceSharedIpsMapOutputWithContext(ctx).OutputState,
	}
}

type InstanceSharedIpsOutput struct{ *pulumi.OutputState }

func (InstanceSharedIpsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**InstanceSharedIps)(nil)).Elem()
}

func (o InstanceSharedIpsOutput) ToInstanceSharedIpsOutput() InstanceSharedIpsOutput {
	return o
}

func (o InstanceSharedIpsOutput) ToInstanceSharedIpsOutputWithContext(ctx context.Context) InstanceSharedIpsOutput {
	return o
}

func (o InstanceSharedIpsOutput) ToOutput(ctx context.Context) pulumix.Output[*InstanceSharedIps] {
	return pulumix.Output[*InstanceSharedIps]{
		OutputState: o.OutputState,
	}
}

// The set of IPs to share with the Linode.
func (o InstanceSharedIpsOutput) Addresses() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *InstanceSharedIps) pulumi.StringArrayOutput { return v.Addresses }).(pulumi.StringArrayOutput)
}

// The ID of the Linode to share the IPs to.
func (o InstanceSharedIpsOutput) LinodeId() pulumi.IntOutput {
	return o.ApplyT(func(v *InstanceSharedIps) pulumi.IntOutput { return v.LinodeId }).(pulumi.IntOutput)
}

type InstanceSharedIpsArrayOutput struct{ *pulumi.OutputState }

func (InstanceSharedIpsArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*InstanceSharedIps)(nil)).Elem()
}

func (o InstanceSharedIpsArrayOutput) ToInstanceSharedIpsArrayOutput() InstanceSharedIpsArrayOutput {
	return o
}

func (o InstanceSharedIpsArrayOutput) ToInstanceSharedIpsArrayOutputWithContext(ctx context.Context) InstanceSharedIpsArrayOutput {
	return o
}

func (o InstanceSharedIpsArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*InstanceSharedIps] {
	return pulumix.Output[[]*InstanceSharedIps]{
		OutputState: o.OutputState,
	}
}

func (o InstanceSharedIpsArrayOutput) Index(i pulumi.IntInput) InstanceSharedIpsOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *InstanceSharedIps {
		return vs[0].([]*InstanceSharedIps)[vs[1].(int)]
	}).(InstanceSharedIpsOutput)
}

type InstanceSharedIpsMapOutput struct{ *pulumi.OutputState }

func (InstanceSharedIpsMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*InstanceSharedIps)(nil)).Elem()
}

func (o InstanceSharedIpsMapOutput) ToInstanceSharedIpsMapOutput() InstanceSharedIpsMapOutput {
	return o
}

func (o InstanceSharedIpsMapOutput) ToInstanceSharedIpsMapOutputWithContext(ctx context.Context) InstanceSharedIpsMapOutput {
	return o
}

func (o InstanceSharedIpsMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*InstanceSharedIps] {
	return pulumix.Output[map[string]*InstanceSharedIps]{
		OutputState: o.OutputState,
	}
}

func (o InstanceSharedIpsMapOutput) MapIndex(k pulumi.StringInput) InstanceSharedIpsOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *InstanceSharedIps {
		return vs[0].(map[string]*InstanceSharedIps)[vs[1].(string)]
	}).(InstanceSharedIpsOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*InstanceSharedIpsInput)(nil)).Elem(), &InstanceSharedIps{})
	pulumi.RegisterInputType(reflect.TypeOf((*InstanceSharedIpsArrayInput)(nil)).Elem(), InstanceSharedIpsArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*InstanceSharedIpsMapInput)(nil)).Elem(), InstanceSharedIpsMap{})
	pulumi.RegisterOutputType(InstanceSharedIpsOutput{})
	pulumi.RegisterOutputType(InstanceSharedIpsArrayOutput{})
	pulumi.RegisterOutputType(InstanceSharedIpsMapOutput{})
}
