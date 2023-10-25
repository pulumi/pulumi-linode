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

// Provides information about a Linode IPv6 Range.
//
// ## Example Usage
//
// Get information about an IPv6 range assigned to a Linode:
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
//			_, err := linode.LookupIpv6Range(ctx, &linode.LookupIpv6RangeArgs{
//				Range: "2001:0db8::",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupIpv6Range(ctx *pulumi.Context, args *LookupIpv6RangeArgs, opts ...pulumi.InvokeOption) (*LookupIpv6RangeResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupIpv6RangeResult
	err := ctx.Invoke("linode:index/getIpv6Range:getIpv6Range", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getIpv6Range.
type LookupIpv6RangeArgs struct {
	// The IPv6 range to retrieve information about.
	Range string `pulumi:"range"`
}

// A collection of values returned by getIpv6Range.
type LookupIpv6RangeResult struct {
	Id    string `pulumi:"id"`
	IsBgp bool   `pulumi:"isBgp"`
	// A set of Linodes targeted by this IPv6 range. Includes Linodes with IP sharing.
	Linodes []int `pulumi:"linodes"`
	// The prefix length of the address, denoting how many addresses can be assigned from this range.
	Prefix int    `pulumi:"prefix"`
	Range  string `pulumi:"range"`
	// The region for this range of IPv6 addresses.
	Region string `pulumi:"region"`
}

func LookupIpv6RangeOutput(ctx *pulumi.Context, args LookupIpv6RangeOutputArgs, opts ...pulumi.InvokeOption) LookupIpv6RangeResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupIpv6RangeResult, error) {
			args := v.(LookupIpv6RangeArgs)
			r, err := LookupIpv6Range(ctx, &args, opts...)
			var s LookupIpv6RangeResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupIpv6RangeResultOutput)
}

// A collection of arguments for invoking getIpv6Range.
type LookupIpv6RangeOutputArgs struct {
	// The IPv6 range to retrieve information about.
	Range pulumi.StringInput `pulumi:"range"`
}

func (LookupIpv6RangeOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupIpv6RangeArgs)(nil)).Elem()
}

// A collection of values returned by getIpv6Range.
type LookupIpv6RangeResultOutput struct{ *pulumi.OutputState }

func (LookupIpv6RangeResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupIpv6RangeResult)(nil)).Elem()
}

func (o LookupIpv6RangeResultOutput) ToLookupIpv6RangeResultOutput() LookupIpv6RangeResultOutput {
	return o
}

func (o LookupIpv6RangeResultOutput) ToLookupIpv6RangeResultOutputWithContext(ctx context.Context) LookupIpv6RangeResultOutput {
	return o
}

func (o LookupIpv6RangeResultOutput) ToOutput(ctx context.Context) pulumix.Output[LookupIpv6RangeResult] {
	return pulumix.Output[LookupIpv6RangeResult]{
		OutputState: o.OutputState,
	}
}

func (o LookupIpv6RangeResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupIpv6RangeResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupIpv6RangeResultOutput) IsBgp() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupIpv6RangeResult) bool { return v.IsBgp }).(pulumi.BoolOutput)
}

// A set of Linodes targeted by this IPv6 range. Includes Linodes with IP sharing.
func (o LookupIpv6RangeResultOutput) Linodes() pulumi.IntArrayOutput {
	return o.ApplyT(func(v LookupIpv6RangeResult) []int { return v.Linodes }).(pulumi.IntArrayOutput)
}

// The prefix length of the address, denoting how many addresses can be assigned from this range.
func (o LookupIpv6RangeResultOutput) Prefix() pulumi.IntOutput {
	return o.ApplyT(func(v LookupIpv6RangeResult) int { return v.Prefix }).(pulumi.IntOutput)
}

func (o LookupIpv6RangeResultOutput) Range() pulumi.StringOutput {
	return o.ApplyT(func(v LookupIpv6RangeResult) string { return v.Range }).(pulumi.StringOutput)
}

// The region for this range of IPv6 addresses.
func (o LookupIpv6RangeResultOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v LookupIpv6RangeResult) string { return v.Region }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupIpv6RangeResultOutput{})
}
