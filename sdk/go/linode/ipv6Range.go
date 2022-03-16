// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Linode IPv6 range.
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
// 		foobarInstance, err := linode.NewInstance(ctx, "foobarInstance", &linode.InstanceArgs{
// 			Label:  pulumi.String("my-linode"),
// 			Image:  pulumi.String("linode/alpine3.14"),
// 			Type:   pulumi.String("g6-nanode-1"),
// 			Region: pulumi.String("us-southeast"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = linode.NewIpv6Range(ctx, "foobarIpv6Range", &linode.Ipv6RangeArgs{
// 			LinodeId:     foobarInstance.ID(),
// 			PrefixLength: pulumi.Int(64),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
type Ipv6Range struct {
	pulumi.CustomResourceState

	// Whether this IPv6 range is shared.
	IsBgp pulumi.BoolOutput `pulumi:"isBgp"`
	// The ID of the Linode to assign this range to.
	LinodeId pulumi.IntPtrOutput `pulumi:"linodeId"`
	// A list of Linodes targeted by this IPv6 range. Includes Linodes with IP sharing.
	Linodes pulumi.IntArrayOutput `pulumi:"linodes"`
	// The prefix length of the IPv6 range.
	PrefixLength pulumi.IntOutput `pulumi:"prefixLength"`
	// The IPv6 range of addresses in this pool.
	Range pulumi.StringOutput `pulumi:"range"`
	// The region for this range of IPv6 addresses.
	Region pulumi.StringOutput `pulumi:"region"`
	// The IPv6 SLAAC address to assign this range to.
	RouteTarget pulumi.StringPtrOutput `pulumi:"routeTarget"`
}

// NewIpv6Range registers a new resource with the given unique name, arguments, and options.
func NewIpv6Range(ctx *pulumi.Context,
	name string, args *Ipv6RangeArgs, opts ...pulumi.ResourceOption) (*Ipv6Range, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.PrefixLength == nil {
		return nil, errors.New("invalid value for required argument 'PrefixLength'")
	}
	var resource Ipv6Range
	err := ctx.RegisterResource("linode:index/ipv6Range:Ipv6Range", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetIpv6Range gets an existing Ipv6Range resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetIpv6Range(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *Ipv6RangeState, opts ...pulumi.ResourceOption) (*Ipv6Range, error) {
	var resource Ipv6Range
	err := ctx.ReadResource("linode:index/ipv6Range:Ipv6Range", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Ipv6Range resources.
type ipv6RangeState struct {
	// Whether this IPv6 range is shared.
	IsBgp *bool `pulumi:"isBgp"`
	// The ID of the Linode to assign this range to.
	LinodeId *int `pulumi:"linodeId"`
	// A list of Linodes targeted by this IPv6 range. Includes Linodes with IP sharing.
	Linodes []int `pulumi:"linodes"`
	// The prefix length of the IPv6 range.
	PrefixLength *int `pulumi:"prefixLength"`
	// The IPv6 range of addresses in this pool.
	Range *string `pulumi:"range"`
	// The region for this range of IPv6 addresses.
	Region *string `pulumi:"region"`
	// The IPv6 SLAAC address to assign this range to.
	RouteTarget *string `pulumi:"routeTarget"`
}

type Ipv6RangeState struct {
	// Whether this IPv6 range is shared.
	IsBgp pulumi.BoolPtrInput
	// The ID of the Linode to assign this range to.
	LinodeId pulumi.IntPtrInput
	// A list of Linodes targeted by this IPv6 range. Includes Linodes with IP sharing.
	Linodes pulumi.IntArrayInput
	// The prefix length of the IPv6 range.
	PrefixLength pulumi.IntPtrInput
	// The IPv6 range of addresses in this pool.
	Range pulumi.StringPtrInput
	// The region for this range of IPv6 addresses.
	Region pulumi.StringPtrInput
	// The IPv6 SLAAC address to assign this range to.
	RouteTarget pulumi.StringPtrInput
}

func (Ipv6RangeState) ElementType() reflect.Type {
	return reflect.TypeOf((*ipv6RangeState)(nil)).Elem()
}

type ipv6RangeArgs struct {
	// The ID of the Linode to assign this range to.
	LinodeId *int `pulumi:"linodeId"`
	// The prefix length of the IPv6 range.
	PrefixLength int `pulumi:"prefixLength"`
	// The IPv6 SLAAC address to assign this range to.
	RouteTarget *string `pulumi:"routeTarget"`
}

// The set of arguments for constructing a Ipv6Range resource.
type Ipv6RangeArgs struct {
	// The ID of the Linode to assign this range to.
	LinodeId pulumi.IntPtrInput
	// The prefix length of the IPv6 range.
	PrefixLength pulumi.IntInput
	// The IPv6 SLAAC address to assign this range to.
	RouteTarget pulumi.StringPtrInput
}

func (Ipv6RangeArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*ipv6RangeArgs)(nil)).Elem()
}

type Ipv6RangeInput interface {
	pulumi.Input

	ToIpv6RangeOutput() Ipv6RangeOutput
	ToIpv6RangeOutputWithContext(ctx context.Context) Ipv6RangeOutput
}

func (*Ipv6Range) ElementType() reflect.Type {
	return reflect.TypeOf((**Ipv6Range)(nil)).Elem()
}

func (i *Ipv6Range) ToIpv6RangeOutput() Ipv6RangeOutput {
	return i.ToIpv6RangeOutputWithContext(context.Background())
}

func (i *Ipv6Range) ToIpv6RangeOutputWithContext(ctx context.Context) Ipv6RangeOutput {
	return pulumi.ToOutputWithContext(ctx, i).(Ipv6RangeOutput)
}

// Ipv6RangeArrayInput is an input type that accepts Ipv6RangeArray and Ipv6RangeArrayOutput values.
// You can construct a concrete instance of `Ipv6RangeArrayInput` via:
//
//          Ipv6RangeArray{ Ipv6RangeArgs{...} }
type Ipv6RangeArrayInput interface {
	pulumi.Input

	ToIpv6RangeArrayOutput() Ipv6RangeArrayOutput
	ToIpv6RangeArrayOutputWithContext(context.Context) Ipv6RangeArrayOutput
}

type Ipv6RangeArray []Ipv6RangeInput

func (Ipv6RangeArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Ipv6Range)(nil)).Elem()
}

func (i Ipv6RangeArray) ToIpv6RangeArrayOutput() Ipv6RangeArrayOutput {
	return i.ToIpv6RangeArrayOutputWithContext(context.Background())
}

func (i Ipv6RangeArray) ToIpv6RangeArrayOutputWithContext(ctx context.Context) Ipv6RangeArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(Ipv6RangeArrayOutput)
}

// Ipv6RangeMapInput is an input type that accepts Ipv6RangeMap and Ipv6RangeMapOutput values.
// You can construct a concrete instance of `Ipv6RangeMapInput` via:
//
//          Ipv6RangeMap{ "key": Ipv6RangeArgs{...} }
type Ipv6RangeMapInput interface {
	pulumi.Input

	ToIpv6RangeMapOutput() Ipv6RangeMapOutput
	ToIpv6RangeMapOutputWithContext(context.Context) Ipv6RangeMapOutput
}

type Ipv6RangeMap map[string]Ipv6RangeInput

func (Ipv6RangeMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Ipv6Range)(nil)).Elem()
}

func (i Ipv6RangeMap) ToIpv6RangeMapOutput() Ipv6RangeMapOutput {
	return i.ToIpv6RangeMapOutputWithContext(context.Background())
}

func (i Ipv6RangeMap) ToIpv6RangeMapOutputWithContext(ctx context.Context) Ipv6RangeMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(Ipv6RangeMapOutput)
}

type Ipv6RangeOutput struct{ *pulumi.OutputState }

func (Ipv6RangeOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Ipv6Range)(nil)).Elem()
}

func (o Ipv6RangeOutput) ToIpv6RangeOutput() Ipv6RangeOutput {
	return o
}

func (o Ipv6RangeOutput) ToIpv6RangeOutputWithContext(ctx context.Context) Ipv6RangeOutput {
	return o
}

type Ipv6RangeArrayOutput struct{ *pulumi.OutputState }

func (Ipv6RangeArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Ipv6Range)(nil)).Elem()
}

func (o Ipv6RangeArrayOutput) ToIpv6RangeArrayOutput() Ipv6RangeArrayOutput {
	return o
}

func (o Ipv6RangeArrayOutput) ToIpv6RangeArrayOutputWithContext(ctx context.Context) Ipv6RangeArrayOutput {
	return o
}

func (o Ipv6RangeArrayOutput) Index(i pulumi.IntInput) Ipv6RangeOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Ipv6Range {
		return vs[0].([]*Ipv6Range)[vs[1].(int)]
	}).(Ipv6RangeOutput)
}

type Ipv6RangeMapOutput struct{ *pulumi.OutputState }

func (Ipv6RangeMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Ipv6Range)(nil)).Elem()
}

func (o Ipv6RangeMapOutput) ToIpv6RangeMapOutput() Ipv6RangeMapOutput {
	return o
}

func (o Ipv6RangeMapOutput) ToIpv6RangeMapOutputWithContext(ctx context.Context) Ipv6RangeMapOutput {
	return o
}

func (o Ipv6RangeMapOutput) MapIndex(k pulumi.StringInput) Ipv6RangeOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Ipv6Range {
		return vs[0].(map[string]*Ipv6Range)[vs[1].(string)]
	}).(Ipv6RangeOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*Ipv6RangeInput)(nil)).Elem(), &Ipv6Range{})
	pulumi.RegisterInputType(reflect.TypeOf((*Ipv6RangeArrayInput)(nil)).Elem(), Ipv6RangeArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*Ipv6RangeMapInput)(nil)).Elem(), Ipv6RangeMap{})
	pulumi.RegisterOutputType(Ipv6RangeOutput{})
	pulumi.RegisterOutputType(Ipv6RangeArrayOutput{})
	pulumi.RegisterOutputType(Ipv6RangeMapOutput{})
}
