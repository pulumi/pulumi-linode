// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-linode/sdk/v5/go/linode/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides information about a list of Linode VPCs that match a set of filters.
// For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-vpcs).
//
// ## Example Usage
//
// The following example shows how one might use this data source to list VPCs.
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
//			filtered_vpcs, err := linode.GetVpcs(ctx, &linode.GetVpcsArgs{
//				Filters: []linode.GetVpcsFilter{
//					{
//						Name: "label",
//						Values: []string{
//							"test",
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("vpcs", filtered_vpcs.Vpcs)
//			return nil
//		})
//	}
//
// ```
//
// ## Filterable Fields
//
// * `id`
//
// * `label`
//
// * `description`
//
// * `region`
func GetVpcs(ctx *pulumi.Context, args *GetVpcsArgs, opts ...pulumi.InvokeOption) (*GetVpcsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetVpcsResult
	err := ctx.Invoke("linode:index/getVpcs:getVpcs", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getVpcs.
type GetVpcsArgs struct {
	Filters []GetVpcsFilter `pulumi:"filters"`
	Vpcs    []GetVpcsVpc    `pulumi:"vpcs"`
}

// A collection of values returned by getVpcs.
type GetVpcsResult struct {
	Filters []GetVpcsFilter `pulumi:"filters"`
	// The unique id of this VPC.
	Id   string       `pulumi:"id"`
	Vpcs []GetVpcsVpc `pulumi:"vpcs"`
}

func GetVpcsOutput(ctx *pulumi.Context, args GetVpcsOutputArgs, opts ...pulumi.InvokeOption) GetVpcsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetVpcsResultOutput, error) {
			args := v.(GetVpcsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("linode:index/getVpcs:getVpcs", args, GetVpcsResultOutput{}, options).(GetVpcsResultOutput), nil
		}).(GetVpcsResultOutput)
}

// A collection of arguments for invoking getVpcs.
type GetVpcsOutputArgs struct {
	Filters GetVpcsFilterArrayInput `pulumi:"filters"`
	Vpcs    GetVpcsVpcArrayInput    `pulumi:"vpcs"`
}

func (GetVpcsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetVpcsArgs)(nil)).Elem()
}

// A collection of values returned by getVpcs.
type GetVpcsResultOutput struct{ *pulumi.OutputState }

func (GetVpcsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetVpcsResult)(nil)).Elem()
}

func (o GetVpcsResultOutput) ToGetVpcsResultOutput() GetVpcsResultOutput {
	return o
}

func (o GetVpcsResultOutput) ToGetVpcsResultOutputWithContext(ctx context.Context) GetVpcsResultOutput {
	return o
}

func (o GetVpcsResultOutput) Filters() GetVpcsFilterArrayOutput {
	return o.ApplyT(func(v GetVpcsResult) []GetVpcsFilter { return v.Filters }).(GetVpcsFilterArrayOutput)
}

// The unique id of this VPC.
func (o GetVpcsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetVpcsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetVpcsResultOutput) Vpcs() GetVpcsVpcArrayOutput {
	return o.ApplyT(func(v GetVpcsResult) []GetVpcsVpc { return v.Vpcs }).(GetVpcsVpcArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetVpcsResultOutput{})
}
