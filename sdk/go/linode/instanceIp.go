// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// > **NOTICE:** You may need to contact support to increase your instance IP limit before you can allocate additional IPs.
// **NOTICE:** This resource will reboot the specified instance following IP allocation.
//
// Manages a Linode instance IP.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-linode/sdk/v3/go/linode"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		fooInstance, err := linode.NewInstance(ctx, "fooInstance", &linode.InstanceArgs{
// 			Image:  pulumi.String("linode/alpine3.12"),
// 			Label:  pulumi.String("foobar-test"),
// 			Type:   pulumi.String("g6-nanode-1"),
// 			Region: pulumi.String("us-east"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = linode.NewInstanceIp(ctx, "fooInstanceIp", &linode.InstanceIpArgs{
// 			LinodeId: fooInstance.ID(),
// 			Public:   pulumi.Bool(true),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
type InstanceIp struct {
	pulumi.CustomResourceState

	// The resulting IPv4 address.
	Address pulumi.StringOutput `pulumi:"address"`
	// If true, the instance will be rebooted to update network interfaces.
	ApplyImmediately pulumi.BoolPtrOutput `pulumi:"applyImmediately"`
	// The default gateway for this address
	Gateway pulumi.StringOutput `pulumi:"gateway"`
	// The ID of the Linode to allocate an IPv4 address for.
	LinodeId pulumi.IntOutput `pulumi:"linodeId"`
	// The number of bits set in the subnet mask.
	Prefix pulumi.IntOutput `pulumi:"prefix"`
	// Whether the IPv4 address is public or private. Defaults to true.
	Public pulumi.BoolPtrOutput `pulumi:"public"`
	// The reverse DNS assigned to this address.
	Rdns pulumi.StringOutput `pulumi:"rdns"`
	// The region this IP resides in.
	Region pulumi.StringOutput `pulumi:"region"`
	// The mask that separates host bits from network bits for this address.
	SubnetMask pulumi.StringOutput `pulumi:"subnetMask"`
	// The type of IP address. (`ipv4`, `ipv6`, `ipv6/pool`, `ipv6/range`)
	Type pulumi.StringOutput `pulumi:"type"`
}

// NewInstanceIp registers a new resource with the given unique name, arguments, and options.
func NewInstanceIp(ctx *pulumi.Context,
	name string, args *InstanceIpArgs, opts ...pulumi.ResourceOption) (*InstanceIp, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.LinodeId == nil {
		return nil, errors.New("invalid value for required argument 'LinodeId'")
	}
	var resource InstanceIp
	err := ctx.RegisterResource("linode:index/instanceIp:InstanceIp", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetInstanceIp gets an existing InstanceIp resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetInstanceIp(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *InstanceIpState, opts ...pulumi.ResourceOption) (*InstanceIp, error) {
	var resource InstanceIp
	err := ctx.ReadResource("linode:index/instanceIp:InstanceIp", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering InstanceIp resources.
type instanceIpState struct {
	// The resulting IPv4 address.
	Address *string `pulumi:"address"`
	// If true, the instance will be rebooted to update network interfaces.
	ApplyImmediately *bool `pulumi:"applyImmediately"`
	// The default gateway for this address
	Gateway *string `pulumi:"gateway"`
	// The ID of the Linode to allocate an IPv4 address for.
	LinodeId *int `pulumi:"linodeId"`
	// The number of bits set in the subnet mask.
	Prefix *int `pulumi:"prefix"`
	// Whether the IPv4 address is public or private. Defaults to true.
	Public *bool `pulumi:"public"`
	// The reverse DNS assigned to this address.
	Rdns *string `pulumi:"rdns"`
	// The region this IP resides in.
	Region *string `pulumi:"region"`
	// The mask that separates host bits from network bits for this address.
	SubnetMask *string `pulumi:"subnetMask"`
	// The type of IP address. (`ipv4`, `ipv6`, `ipv6/pool`, `ipv6/range`)
	Type *string `pulumi:"type"`
}

type InstanceIpState struct {
	// The resulting IPv4 address.
	Address pulumi.StringPtrInput
	// If true, the instance will be rebooted to update network interfaces.
	ApplyImmediately pulumi.BoolPtrInput
	// The default gateway for this address
	Gateway pulumi.StringPtrInput
	// The ID of the Linode to allocate an IPv4 address for.
	LinodeId pulumi.IntPtrInput
	// The number of bits set in the subnet mask.
	Prefix pulumi.IntPtrInput
	// Whether the IPv4 address is public or private. Defaults to true.
	Public pulumi.BoolPtrInput
	// The reverse DNS assigned to this address.
	Rdns pulumi.StringPtrInput
	// The region this IP resides in.
	Region pulumi.StringPtrInput
	// The mask that separates host bits from network bits for this address.
	SubnetMask pulumi.StringPtrInput
	// The type of IP address. (`ipv4`, `ipv6`, `ipv6/pool`, `ipv6/range`)
	Type pulumi.StringPtrInput
}

func (InstanceIpState) ElementType() reflect.Type {
	return reflect.TypeOf((*instanceIpState)(nil)).Elem()
}

type instanceIpArgs struct {
	// If true, the instance will be rebooted to update network interfaces.
	ApplyImmediately *bool `pulumi:"applyImmediately"`
	// The ID of the Linode to allocate an IPv4 address for.
	LinodeId int `pulumi:"linodeId"`
	// Whether the IPv4 address is public or private. Defaults to true.
	Public *bool `pulumi:"public"`
	// The reverse DNS assigned to this address.
	Rdns *string `pulumi:"rdns"`
}

// The set of arguments for constructing a InstanceIp resource.
type InstanceIpArgs struct {
	// If true, the instance will be rebooted to update network interfaces.
	ApplyImmediately pulumi.BoolPtrInput
	// The ID of the Linode to allocate an IPv4 address for.
	LinodeId pulumi.IntInput
	// Whether the IPv4 address is public or private. Defaults to true.
	Public pulumi.BoolPtrInput
	// The reverse DNS assigned to this address.
	Rdns pulumi.StringPtrInput
}

func (InstanceIpArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*instanceIpArgs)(nil)).Elem()
}

type InstanceIpInput interface {
	pulumi.Input

	ToInstanceIpOutput() InstanceIpOutput
	ToInstanceIpOutputWithContext(ctx context.Context) InstanceIpOutput
}

func (*InstanceIp) ElementType() reflect.Type {
	return reflect.TypeOf((**InstanceIp)(nil)).Elem()
}

func (i *InstanceIp) ToInstanceIpOutput() InstanceIpOutput {
	return i.ToInstanceIpOutputWithContext(context.Background())
}

func (i *InstanceIp) ToInstanceIpOutputWithContext(ctx context.Context) InstanceIpOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceIpOutput)
}

// InstanceIpArrayInput is an input type that accepts InstanceIpArray and InstanceIpArrayOutput values.
// You can construct a concrete instance of `InstanceIpArrayInput` via:
//
//          InstanceIpArray{ InstanceIpArgs{...} }
type InstanceIpArrayInput interface {
	pulumi.Input

	ToInstanceIpArrayOutput() InstanceIpArrayOutput
	ToInstanceIpArrayOutputWithContext(context.Context) InstanceIpArrayOutput
}

type InstanceIpArray []InstanceIpInput

func (InstanceIpArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*InstanceIp)(nil)).Elem()
}

func (i InstanceIpArray) ToInstanceIpArrayOutput() InstanceIpArrayOutput {
	return i.ToInstanceIpArrayOutputWithContext(context.Background())
}

func (i InstanceIpArray) ToInstanceIpArrayOutputWithContext(ctx context.Context) InstanceIpArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceIpArrayOutput)
}

// InstanceIpMapInput is an input type that accepts InstanceIpMap and InstanceIpMapOutput values.
// You can construct a concrete instance of `InstanceIpMapInput` via:
//
//          InstanceIpMap{ "key": InstanceIpArgs{...} }
type InstanceIpMapInput interface {
	pulumi.Input

	ToInstanceIpMapOutput() InstanceIpMapOutput
	ToInstanceIpMapOutputWithContext(context.Context) InstanceIpMapOutput
}

type InstanceIpMap map[string]InstanceIpInput

func (InstanceIpMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*InstanceIp)(nil)).Elem()
}

func (i InstanceIpMap) ToInstanceIpMapOutput() InstanceIpMapOutput {
	return i.ToInstanceIpMapOutputWithContext(context.Background())
}

func (i InstanceIpMap) ToInstanceIpMapOutputWithContext(ctx context.Context) InstanceIpMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceIpMapOutput)
}

type InstanceIpOutput struct{ *pulumi.OutputState }

func (InstanceIpOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**InstanceIp)(nil)).Elem()
}

func (o InstanceIpOutput) ToInstanceIpOutput() InstanceIpOutput {
	return o
}

func (o InstanceIpOutput) ToInstanceIpOutputWithContext(ctx context.Context) InstanceIpOutput {
	return o
}

type InstanceIpArrayOutput struct{ *pulumi.OutputState }

func (InstanceIpArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*InstanceIp)(nil)).Elem()
}

func (o InstanceIpArrayOutput) ToInstanceIpArrayOutput() InstanceIpArrayOutput {
	return o
}

func (o InstanceIpArrayOutput) ToInstanceIpArrayOutputWithContext(ctx context.Context) InstanceIpArrayOutput {
	return o
}

func (o InstanceIpArrayOutput) Index(i pulumi.IntInput) InstanceIpOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *InstanceIp {
		return vs[0].([]*InstanceIp)[vs[1].(int)]
	}).(InstanceIpOutput)
}

type InstanceIpMapOutput struct{ *pulumi.OutputState }

func (InstanceIpMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*InstanceIp)(nil)).Elem()
}

func (o InstanceIpMapOutput) ToInstanceIpMapOutput() InstanceIpMapOutput {
	return o
}

func (o InstanceIpMapOutput) ToInstanceIpMapOutputWithContext(ctx context.Context) InstanceIpMapOutput {
	return o
}

func (o InstanceIpMapOutput) MapIndex(k pulumi.StringInput) InstanceIpOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *InstanceIp {
		return vs[0].(map[string]*InstanceIp)[vs[1].(string)]
	}).(InstanceIpOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*InstanceIpInput)(nil)).Elem(), &InstanceIp{})
	pulumi.RegisterInputType(reflect.TypeOf((*InstanceIpArrayInput)(nil)).Elem(), InstanceIpArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*InstanceIpMapInput)(nil)).Elem(), InstanceIpMap{})
	pulumi.RegisterOutputType(InstanceIpOutput{})
	pulumi.RegisterOutputType(InstanceIpArrayOutput{})
	pulumi.RegisterOutputType(InstanceIpMapOutput{})
}
