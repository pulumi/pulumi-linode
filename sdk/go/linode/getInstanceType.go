// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides information about a Linode instance type
//
// ## Example Usage
//
// The following example shows how one might use this data source to access information about a Linode Instance type.
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
//			_, err := linode.GetInstanceType(ctx, &GetInstanceTypeArgs{
//				Id: "g6-standard-2",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetInstanceType(ctx *pulumi.Context, args *GetInstanceTypeArgs, opts ...pulumi.InvokeOption) (*GetInstanceTypeResult, error) {
	var rv GetInstanceTypeResult
	err := ctx.Invoke("linode:index/getInstanceType:getInstanceType", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getInstanceType.
type GetInstanceTypeArgs struct {
	// Label used to identify instance type
	Id string `pulumi:"id"`
	// The Linode Type's label is for display purposes only
	Label *string `pulumi:"label"`
}

// A collection of values returned by getInstanceType.
type GetInstanceTypeResult struct {
	Addons GetInstanceTypeAddons `pulumi:"addons"`
	// The class of the Linode Type. See all classes [here](https://www.linode.com/docs/api/linode-types/#type-view__responses).
	Class string `pulumi:"class"`
	// The Disk size, in MB, of the Linode Type
	Disk int `pulumi:"disk"`
	// The ID representing the Linode Type
	Id string `pulumi:"id"`
	// The Linode Type's label is for display purposes only
	Label string `pulumi:"label"`
	// The amount of RAM included in this Linode Type.
	Memory int `pulumi:"memory"`
	// The Mbits outbound bandwidth allocation.
	NetworkOut int                  `pulumi:"networkOut"`
	Price      GetInstanceTypePrice `pulumi:"price"`
	// The monthly outbound transfer amount, in MB.
	Transfer int `pulumi:"transfer"`
	// The number of VCPU cores this Linode Type offers.
	Vcpus int `pulumi:"vcpus"`
}

func GetInstanceTypeOutput(ctx *pulumi.Context, args GetInstanceTypeOutputArgs, opts ...pulumi.InvokeOption) GetInstanceTypeResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetInstanceTypeResult, error) {
			args := v.(GetInstanceTypeArgs)
			r, err := GetInstanceType(ctx, &args, opts...)
			var s GetInstanceTypeResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetInstanceTypeResultOutput)
}

// A collection of arguments for invoking getInstanceType.
type GetInstanceTypeOutputArgs struct {
	// Label used to identify instance type
	Id pulumi.StringInput `pulumi:"id"`
	// The Linode Type's label is for display purposes only
	Label pulumi.StringPtrInput `pulumi:"label"`
}

func (GetInstanceTypeOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetInstanceTypeArgs)(nil)).Elem()
}

// A collection of values returned by getInstanceType.
type GetInstanceTypeResultOutput struct{ *pulumi.OutputState }

func (GetInstanceTypeResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetInstanceTypeResult)(nil)).Elem()
}

func (o GetInstanceTypeResultOutput) ToGetInstanceTypeResultOutput() GetInstanceTypeResultOutput {
	return o
}

func (o GetInstanceTypeResultOutput) ToGetInstanceTypeResultOutputWithContext(ctx context.Context) GetInstanceTypeResultOutput {
	return o
}

func (o GetInstanceTypeResultOutput) Addons() GetInstanceTypeAddonsOutput {
	return o.ApplyT(func(v GetInstanceTypeResult) GetInstanceTypeAddons { return v.Addons }).(GetInstanceTypeAddonsOutput)
}

// The class of the Linode Type. See all classes [here](https://www.linode.com/docs/api/linode-types/#type-view__responses).
func (o GetInstanceTypeResultOutput) Class() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstanceTypeResult) string { return v.Class }).(pulumi.StringOutput)
}

// The Disk size, in MB, of the Linode Type
func (o GetInstanceTypeResultOutput) Disk() pulumi.IntOutput {
	return o.ApplyT(func(v GetInstanceTypeResult) int { return v.Disk }).(pulumi.IntOutput)
}

// The ID representing the Linode Type
func (o GetInstanceTypeResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstanceTypeResult) string { return v.Id }).(pulumi.StringOutput)
}

// The Linode Type's label is for display purposes only
func (o GetInstanceTypeResultOutput) Label() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstanceTypeResult) string { return v.Label }).(pulumi.StringOutput)
}

// The amount of RAM included in this Linode Type.
func (o GetInstanceTypeResultOutput) Memory() pulumi.IntOutput {
	return o.ApplyT(func(v GetInstanceTypeResult) int { return v.Memory }).(pulumi.IntOutput)
}

// The Mbits outbound bandwidth allocation.
func (o GetInstanceTypeResultOutput) NetworkOut() pulumi.IntOutput {
	return o.ApplyT(func(v GetInstanceTypeResult) int { return v.NetworkOut }).(pulumi.IntOutput)
}

func (o GetInstanceTypeResultOutput) Price() GetInstanceTypePriceOutput {
	return o.ApplyT(func(v GetInstanceTypeResult) GetInstanceTypePrice { return v.Price }).(GetInstanceTypePriceOutput)
}

// The monthly outbound transfer amount, in MB.
func (o GetInstanceTypeResultOutput) Transfer() pulumi.IntOutput {
	return o.ApplyT(func(v GetInstanceTypeResult) int { return v.Transfer }).(pulumi.IntOutput)
}

// The number of VCPU cores this Linode Type offers.
func (o GetInstanceTypeResultOutput) Vcpus() pulumi.IntOutput {
	return o.ApplyT(func(v GetInstanceTypeResult) int { return v.Vcpus }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(GetInstanceTypeResultOutput{})
}
