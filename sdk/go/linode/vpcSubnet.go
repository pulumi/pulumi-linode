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

// Manages a Linode VPC subnet.
// For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/post-vpc-subnet).
//
// ## Example Usage
//
// Create a VPC subnet:
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
//			_, err := linode.NewVpcSubnet(ctx, "test", &linode.VpcSubnetArgs{
//				VpcId: pulumi.Int(123),
//				Label: pulumi.String("test-subnet"),
//				Ipv4:  pulumi.String("10.0.0.0/24"),
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
// Linode Virtual Private Cloud (VPC) Subnet can be imported using the `vpc_id` followed by the subnet `id` separated by a comma, e.g.
//
// ```sh
// $ pulumi import linode:index/vpcSubnet:VpcSubnet my_subnet_duplicated 1234567,7654321
// ```
type VpcSubnet struct {
	pulumi.CustomResourceState

	// The date and time when the VPC was created.
	Created pulumi.StringOutput `pulumi:"created"`
	// The IPv4 range of this subnet in CIDR format.
	Ipv4 pulumi.StringOutput `pulumi:"ipv4"`
	// The label of the VPC. Only contains ASCII letters, digits and dashes.
	Label pulumi.StringOutput `pulumi:"label"`
	// A list of Linode IDs that added to this subnet.
	Linodes VpcSubnetLinodeArrayOutput `pulumi:"linodes"`
	// The date and time when the VPC was last updated.
	Updated pulumi.StringOutput `pulumi:"updated"`
	// The id of the parent VPC for this VPC Subnet.
	VpcId pulumi.IntOutput `pulumi:"vpcId"`
}

// NewVpcSubnet registers a new resource with the given unique name, arguments, and options.
func NewVpcSubnet(ctx *pulumi.Context,
	name string, args *VpcSubnetArgs, opts ...pulumi.ResourceOption) (*VpcSubnet, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Ipv4 == nil {
		return nil, errors.New("invalid value for required argument 'Ipv4'")
	}
	if args.Label == nil {
		return nil, errors.New("invalid value for required argument 'Label'")
	}
	if args.VpcId == nil {
		return nil, errors.New("invalid value for required argument 'VpcId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource VpcSubnet
	err := ctx.RegisterResource("linode:index/vpcSubnet:VpcSubnet", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetVpcSubnet gets an existing VpcSubnet resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetVpcSubnet(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *VpcSubnetState, opts ...pulumi.ResourceOption) (*VpcSubnet, error) {
	var resource VpcSubnet
	err := ctx.ReadResource("linode:index/vpcSubnet:VpcSubnet", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering VpcSubnet resources.
type vpcSubnetState struct {
	// The date and time when the VPC was created.
	Created *string `pulumi:"created"`
	// The IPv4 range of this subnet in CIDR format.
	Ipv4 *string `pulumi:"ipv4"`
	// The label of the VPC. Only contains ASCII letters, digits and dashes.
	Label *string `pulumi:"label"`
	// A list of Linode IDs that added to this subnet.
	Linodes []VpcSubnetLinode `pulumi:"linodes"`
	// The date and time when the VPC was last updated.
	Updated *string `pulumi:"updated"`
	// The id of the parent VPC for this VPC Subnet.
	VpcId *int `pulumi:"vpcId"`
}

type VpcSubnetState struct {
	// The date and time when the VPC was created.
	Created pulumi.StringPtrInput
	// The IPv4 range of this subnet in CIDR format.
	Ipv4 pulumi.StringPtrInput
	// The label of the VPC. Only contains ASCII letters, digits and dashes.
	Label pulumi.StringPtrInput
	// A list of Linode IDs that added to this subnet.
	Linodes VpcSubnetLinodeArrayInput
	// The date and time when the VPC was last updated.
	Updated pulumi.StringPtrInput
	// The id of the parent VPC for this VPC Subnet.
	VpcId pulumi.IntPtrInput
}

func (VpcSubnetState) ElementType() reflect.Type {
	return reflect.TypeOf((*vpcSubnetState)(nil)).Elem()
}

type vpcSubnetArgs struct {
	// The IPv4 range of this subnet in CIDR format.
	Ipv4 string `pulumi:"ipv4"`
	// The label of the VPC. Only contains ASCII letters, digits and dashes.
	Label string `pulumi:"label"`
	// The id of the parent VPC for this VPC Subnet.
	VpcId int `pulumi:"vpcId"`
}

// The set of arguments for constructing a VpcSubnet resource.
type VpcSubnetArgs struct {
	// The IPv4 range of this subnet in CIDR format.
	Ipv4 pulumi.StringInput
	// The label of the VPC. Only contains ASCII letters, digits and dashes.
	Label pulumi.StringInput
	// The id of the parent VPC for this VPC Subnet.
	VpcId pulumi.IntInput
}

func (VpcSubnetArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*vpcSubnetArgs)(nil)).Elem()
}

type VpcSubnetInput interface {
	pulumi.Input

	ToVpcSubnetOutput() VpcSubnetOutput
	ToVpcSubnetOutputWithContext(ctx context.Context) VpcSubnetOutput
}

func (*VpcSubnet) ElementType() reflect.Type {
	return reflect.TypeOf((**VpcSubnet)(nil)).Elem()
}

func (i *VpcSubnet) ToVpcSubnetOutput() VpcSubnetOutput {
	return i.ToVpcSubnetOutputWithContext(context.Background())
}

func (i *VpcSubnet) ToVpcSubnetOutputWithContext(ctx context.Context) VpcSubnetOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VpcSubnetOutput)
}

// VpcSubnetArrayInput is an input type that accepts VpcSubnetArray and VpcSubnetArrayOutput values.
// You can construct a concrete instance of `VpcSubnetArrayInput` via:
//
//	VpcSubnetArray{ VpcSubnetArgs{...} }
type VpcSubnetArrayInput interface {
	pulumi.Input

	ToVpcSubnetArrayOutput() VpcSubnetArrayOutput
	ToVpcSubnetArrayOutputWithContext(context.Context) VpcSubnetArrayOutput
}

type VpcSubnetArray []VpcSubnetInput

func (VpcSubnetArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*VpcSubnet)(nil)).Elem()
}

func (i VpcSubnetArray) ToVpcSubnetArrayOutput() VpcSubnetArrayOutput {
	return i.ToVpcSubnetArrayOutputWithContext(context.Background())
}

func (i VpcSubnetArray) ToVpcSubnetArrayOutputWithContext(ctx context.Context) VpcSubnetArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VpcSubnetArrayOutput)
}

// VpcSubnetMapInput is an input type that accepts VpcSubnetMap and VpcSubnetMapOutput values.
// You can construct a concrete instance of `VpcSubnetMapInput` via:
//
//	VpcSubnetMap{ "key": VpcSubnetArgs{...} }
type VpcSubnetMapInput interface {
	pulumi.Input

	ToVpcSubnetMapOutput() VpcSubnetMapOutput
	ToVpcSubnetMapOutputWithContext(context.Context) VpcSubnetMapOutput
}

type VpcSubnetMap map[string]VpcSubnetInput

func (VpcSubnetMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*VpcSubnet)(nil)).Elem()
}

func (i VpcSubnetMap) ToVpcSubnetMapOutput() VpcSubnetMapOutput {
	return i.ToVpcSubnetMapOutputWithContext(context.Background())
}

func (i VpcSubnetMap) ToVpcSubnetMapOutputWithContext(ctx context.Context) VpcSubnetMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VpcSubnetMapOutput)
}

type VpcSubnetOutput struct{ *pulumi.OutputState }

func (VpcSubnetOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**VpcSubnet)(nil)).Elem()
}

func (o VpcSubnetOutput) ToVpcSubnetOutput() VpcSubnetOutput {
	return o
}

func (o VpcSubnetOutput) ToVpcSubnetOutputWithContext(ctx context.Context) VpcSubnetOutput {
	return o
}

// The date and time when the VPC was created.
func (o VpcSubnetOutput) Created() pulumi.StringOutput {
	return o.ApplyT(func(v *VpcSubnet) pulumi.StringOutput { return v.Created }).(pulumi.StringOutput)
}

// The IPv4 range of this subnet in CIDR format.
func (o VpcSubnetOutput) Ipv4() pulumi.StringOutput {
	return o.ApplyT(func(v *VpcSubnet) pulumi.StringOutput { return v.Ipv4 }).(pulumi.StringOutput)
}

// The label of the VPC. Only contains ASCII letters, digits and dashes.
func (o VpcSubnetOutput) Label() pulumi.StringOutput {
	return o.ApplyT(func(v *VpcSubnet) pulumi.StringOutput { return v.Label }).(pulumi.StringOutput)
}

// A list of Linode IDs that added to this subnet.
func (o VpcSubnetOutput) Linodes() VpcSubnetLinodeArrayOutput {
	return o.ApplyT(func(v *VpcSubnet) VpcSubnetLinodeArrayOutput { return v.Linodes }).(VpcSubnetLinodeArrayOutput)
}

// The date and time when the VPC was last updated.
func (o VpcSubnetOutput) Updated() pulumi.StringOutput {
	return o.ApplyT(func(v *VpcSubnet) pulumi.StringOutput { return v.Updated }).(pulumi.StringOutput)
}

// The id of the parent VPC for this VPC Subnet.
func (o VpcSubnetOutput) VpcId() pulumi.IntOutput {
	return o.ApplyT(func(v *VpcSubnet) pulumi.IntOutput { return v.VpcId }).(pulumi.IntOutput)
}

type VpcSubnetArrayOutput struct{ *pulumi.OutputState }

func (VpcSubnetArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*VpcSubnet)(nil)).Elem()
}

func (o VpcSubnetArrayOutput) ToVpcSubnetArrayOutput() VpcSubnetArrayOutput {
	return o
}

func (o VpcSubnetArrayOutput) ToVpcSubnetArrayOutputWithContext(ctx context.Context) VpcSubnetArrayOutput {
	return o
}

func (o VpcSubnetArrayOutput) Index(i pulumi.IntInput) VpcSubnetOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *VpcSubnet {
		return vs[0].([]*VpcSubnet)[vs[1].(int)]
	}).(VpcSubnetOutput)
}

type VpcSubnetMapOutput struct{ *pulumi.OutputState }

func (VpcSubnetMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*VpcSubnet)(nil)).Elem()
}

func (o VpcSubnetMapOutput) ToVpcSubnetMapOutput() VpcSubnetMapOutput {
	return o
}

func (o VpcSubnetMapOutput) ToVpcSubnetMapOutputWithContext(ctx context.Context) VpcSubnetMapOutput {
	return o
}

func (o VpcSubnetMapOutput) MapIndex(k pulumi.StringInput) VpcSubnetOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *VpcSubnet {
		return vs[0].(map[string]*VpcSubnet)[vs[1].(string)]
	}).(VpcSubnetOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*VpcSubnetInput)(nil)).Elem(), &VpcSubnet{})
	pulumi.RegisterInputType(reflect.TypeOf((*VpcSubnetArrayInput)(nil)).Elem(), VpcSubnetArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*VpcSubnetMapInput)(nil)).Elem(), VpcSubnetMap{})
	pulumi.RegisterOutputType(VpcSubnetOutput{})
	pulumi.RegisterOutputType(VpcSubnetArrayOutput{})
	pulumi.RegisterOutputType(VpcSubnetMapOutput{})
}
