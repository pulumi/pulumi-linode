// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-linode/sdk/v4/go/linode/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Provides details about the networking configuration of an Instance.
//
// ## Example Usage
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
//			_, err := linode.GetInstanceNetworking(ctx, &linode.GetInstanceNetworkingArgs{
//				LinodeId: 123,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetInstanceNetworking(ctx *pulumi.Context, args *GetInstanceNetworkingArgs, opts ...pulumi.InvokeOption) (*GetInstanceNetworkingResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetInstanceNetworkingResult
	err := ctx.Invoke("linode:index/getInstanceNetworking:getInstanceNetworking", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getInstanceNetworking.
type GetInstanceNetworkingArgs struct {
	// The Linode instance's ID.
	LinodeId int `pulumi:"linodeId"`
}

// A collection of values returned by getInstanceNetworking.
type GetInstanceNetworkingResult struct {
	Id    string                      `pulumi:"id"`
	Ipv4s []GetInstanceNetworkingIpv4 `pulumi:"ipv4s"`
	Ipv6s []GetInstanceNetworkingIpv6 `pulumi:"ipv6s"`
	// The ID of the Linode this address currently belongs to.
	LinodeId int `pulumi:"linodeId"`
}

func GetInstanceNetworkingOutput(ctx *pulumi.Context, args GetInstanceNetworkingOutputArgs, opts ...pulumi.InvokeOption) GetInstanceNetworkingResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetInstanceNetworkingResult, error) {
			args := v.(GetInstanceNetworkingArgs)
			r, err := GetInstanceNetworking(ctx, &args, opts...)
			var s GetInstanceNetworkingResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetInstanceNetworkingResultOutput)
}

// A collection of arguments for invoking getInstanceNetworking.
type GetInstanceNetworkingOutputArgs struct {
	// The Linode instance's ID.
	LinodeId pulumi.IntInput `pulumi:"linodeId"`
}

func (GetInstanceNetworkingOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetInstanceNetworkingArgs)(nil)).Elem()
}

// A collection of values returned by getInstanceNetworking.
type GetInstanceNetworkingResultOutput struct{ *pulumi.OutputState }

func (GetInstanceNetworkingResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetInstanceNetworkingResult)(nil)).Elem()
}

func (o GetInstanceNetworkingResultOutput) ToGetInstanceNetworkingResultOutput() GetInstanceNetworkingResultOutput {
	return o
}

func (o GetInstanceNetworkingResultOutput) ToGetInstanceNetworkingResultOutputWithContext(ctx context.Context) GetInstanceNetworkingResultOutput {
	return o
}

func (o GetInstanceNetworkingResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetInstanceNetworkingResult] {
	return pulumix.Output[GetInstanceNetworkingResult]{
		OutputState: o.OutputState,
	}
}

func (o GetInstanceNetworkingResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstanceNetworkingResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetInstanceNetworkingResultOutput) Ipv4s() GetInstanceNetworkingIpv4ArrayOutput {
	return o.ApplyT(func(v GetInstanceNetworkingResult) []GetInstanceNetworkingIpv4 { return v.Ipv4s }).(GetInstanceNetworkingIpv4ArrayOutput)
}

func (o GetInstanceNetworkingResultOutput) Ipv6s() GetInstanceNetworkingIpv6ArrayOutput {
	return o.ApplyT(func(v GetInstanceNetworkingResult) []GetInstanceNetworkingIpv6 { return v.Ipv6s }).(GetInstanceNetworkingIpv6ArrayOutput)
}

// The ID of the Linode this address currently belongs to.
func (o GetInstanceNetworkingResultOutput) LinodeId() pulumi.IntOutput {
	return o.ApplyT(func(v GetInstanceNetworkingResult) int { return v.LinodeId }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(GetInstanceNetworkingResultOutput{})
}
