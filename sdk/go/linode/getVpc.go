// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-linode/sdk/v4/go/linode/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides information about a Linode VPC.
//
// ## Example Usage
//
// The following example shows how one might use this data source to access information about a Linode VPC.
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
//			foo, err := linode.LookupVpc(ctx, &linode.LookupVpcArgs{
//				Id: "123",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("vpc", foo)
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
func LookupVpc(ctx *pulumi.Context, args *LookupVpcArgs, opts ...pulumi.InvokeOption) (*LookupVpcResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupVpcResult
	err := ctx.Invoke("linode:index/getVpc:getVpc", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getVpc.
type LookupVpcArgs struct {
	// The unique id of this VPC.
	Id string `pulumi:"id"`
}

// A collection of values returned by getVpc.
type LookupVpcResult struct {
	// The date and time when the VPC was created.
	Created string `pulumi:"created"`
	// The user-defined description of this VPC.
	Description string `pulumi:"description"`
	Id          string `pulumi:"id"`
	// The label of the VPC.
	Label string `pulumi:"label"`
	// The region where the VPC is deployed.
	Region string `pulumi:"region"`
	// The date and time when the VPC was last updated.
	Updated string `pulumi:"updated"`
}

func LookupVpcOutput(ctx *pulumi.Context, args LookupVpcOutputArgs, opts ...pulumi.InvokeOption) LookupVpcResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupVpcResult, error) {
			args := v.(LookupVpcArgs)
			r, err := LookupVpc(ctx, &args, opts...)
			var s LookupVpcResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupVpcResultOutput)
}

// A collection of arguments for invoking getVpc.
type LookupVpcOutputArgs struct {
	// The unique id of this VPC.
	Id pulumi.StringInput `pulumi:"id"`
}

func (LookupVpcOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupVpcArgs)(nil)).Elem()
}

// A collection of values returned by getVpc.
type LookupVpcResultOutput struct{ *pulumi.OutputState }

func (LookupVpcResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupVpcResult)(nil)).Elem()
}

func (o LookupVpcResultOutput) ToLookupVpcResultOutput() LookupVpcResultOutput {
	return o
}

func (o LookupVpcResultOutput) ToLookupVpcResultOutputWithContext(ctx context.Context) LookupVpcResultOutput {
	return o
}

// The date and time when the VPC was created.
func (o LookupVpcResultOutput) Created() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVpcResult) string { return v.Created }).(pulumi.StringOutput)
}

// The user-defined description of this VPC.
func (o LookupVpcResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVpcResult) string { return v.Description }).(pulumi.StringOutput)
}

func (o LookupVpcResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVpcResult) string { return v.Id }).(pulumi.StringOutput)
}

// The label of the VPC.
func (o LookupVpcResultOutput) Label() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVpcResult) string { return v.Label }).(pulumi.StringOutput)
}

// The region where the VPC is deployed.
func (o LookupVpcResultOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVpcResult) string { return v.Region }).(pulumi.StringOutput)
}

// The date and time when the VPC was last updated.
func (o LookupVpcResultOutput) Updated() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVpcResult) string { return v.Updated }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupVpcResultOutput{})
}
