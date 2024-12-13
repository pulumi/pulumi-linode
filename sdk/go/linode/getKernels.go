// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-linode/sdk/v4/go/linode/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides information about Linode Kernels that match a set of filters.
// For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-kernels).
//
// ## Example Usage
//
// The following example shows how one might use this data source to access information about a Linode Kernel.
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
//			_, err := linode.GetKernels(ctx, &linode.GetKernelsArgs{
//				Filters: []linode.GetKernelsFilter{
//					{
//						Name: "label",
//						Values: []string{
//							"my-kernel",
//						},
//					},
//					{
//						Name: "architecture",
//						Values: []string{
//							"x86_64",
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
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
// * `architecture`
//
// * `deprecated`
//
// * `kvm`
//
// * `label`
//
// * `pvops`
//
// * `version`
//
// * `xen`
func GetKernels(ctx *pulumi.Context, args *GetKernelsArgs, opts ...pulumi.InvokeOption) (*GetKernelsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetKernelsResult
	err := ctx.Invoke("linode:index/getKernels:getKernels", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getKernels.
type GetKernelsArgs struct {
	Filters []GetKernelsFilter `pulumi:"filters"`
	Kernels []GetKernelsKernel `pulumi:"kernels"`
	// The order in which results should be returned. (`asc`, `desc`; default `asc`)
	Order *string `pulumi:"order"`
	// The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
	OrderBy *string `pulumi:"orderBy"`
}

// A collection of values returned by getKernels.
type GetKernelsResult struct {
	Filters []GetKernelsFilter `pulumi:"filters"`
	// The unique ID of this Kernel.
	Id      string             `pulumi:"id"`
	Kernels []GetKernelsKernel `pulumi:"kernels"`
	Order   *string            `pulumi:"order"`
	OrderBy *string            `pulumi:"orderBy"`
}

func GetKernelsOutput(ctx *pulumi.Context, args GetKernelsOutputArgs, opts ...pulumi.InvokeOption) GetKernelsResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetKernelsResultOutput, error) {
			args := v.(GetKernelsArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("linode:index/getKernels:getKernels", args, GetKernelsResultOutput{}, options).(GetKernelsResultOutput), nil
		}).(GetKernelsResultOutput)
}

// A collection of arguments for invoking getKernels.
type GetKernelsOutputArgs struct {
	Filters GetKernelsFilterArrayInput `pulumi:"filters"`
	Kernels GetKernelsKernelArrayInput `pulumi:"kernels"`
	// The order in which results should be returned. (`asc`, `desc`; default `asc`)
	Order pulumi.StringPtrInput `pulumi:"order"`
	// The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
	OrderBy pulumi.StringPtrInput `pulumi:"orderBy"`
}

func (GetKernelsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetKernelsArgs)(nil)).Elem()
}

// A collection of values returned by getKernels.
type GetKernelsResultOutput struct{ *pulumi.OutputState }

func (GetKernelsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetKernelsResult)(nil)).Elem()
}

func (o GetKernelsResultOutput) ToGetKernelsResultOutput() GetKernelsResultOutput {
	return o
}

func (o GetKernelsResultOutput) ToGetKernelsResultOutputWithContext(ctx context.Context) GetKernelsResultOutput {
	return o
}

func (o GetKernelsResultOutput) Filters() GetKernelsFilterArrayOutput {
	return o.ApplyT(func(v GetKernelsResult) []GetKernelsFilter { return v.Filters }).(GetKernelsFilterArrayOutput)
}

// The unique ID of this Kernel.
func (o GetKernelsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetKernelsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetKernelsResultOutput) Kernels() GetKernelsKernelArrayOutput {
	return o.ApplyT(func(v GetKernelsResult) []GetKernelsKernel { return v.Kernels }).(GetKernelsKernelArrayOutput)
}

func (o GetKernelsResultOutput) Order() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetKernelsResult) *string { return v.Order }).(pulumi.StringPtrOutput)
}

func (o GetKernelsResultOutput) OrderBy() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetKernelsResult) *string { return v.OrderBy }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetKernelsResultOutput{})
}
