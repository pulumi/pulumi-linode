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

// Provides information about Linode Instance types that match a set of filters.
//
// ## Example Usage
//
// Get information about all Linode Instance types with a certain number of VCPUs:
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
//			specific_types, err := linode.GetInstanceTypes(ctx, &linode.GetInstanceTypesArgs{
//				Filters: []linode.GetInstanceTypesFilter{
//					{
//						Name: "vcpus",
//						Values: []string{
//							"2",
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			var splat0 []*string
//			for _, val0 := range specific_types.Types {
//				splat0 = append(splat0, val0.Id)
//			}
//			ctx.Export("typeIds", splat0)
//			return nil
//		})
//	}
//
// ```
//
// Get information about all Linode Instance types:
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
//			all_types, err := linode.GetInstanceTypes(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			var splat0 []*string
//			for _, val0 := range all_types.Types {
//				splat0 = append(splat0, val0.Id)
//			}
//			ctx.Export("typeIds", splat0)
//			return nil
//		})
//	}
//
// ```
// ## Filterable Fields
//
// * `class`
//
// * `disk`
//
// * `gpus`
//
// * `label`
//
// * `memory`
//
// * `networkOut`
//
// * `transfer`
//
// * `vcpus`
func GetInstanceTypes(ctx *pulumi.Context, args *GetInstanceTypesArgs, opts ...pulumi.InvokeOption) (*GetInstanceTypesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetInstanceTypesResult
	err := ctx.Invoke("linode:index/getInstanceTypes:getInstanceTypes", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getInstanceTypes.
type GetInstanceTypesArgs struct {
	Filters []GetInstanceTypesFilter `pulumi:"filters"`
	// The order in which results should be returned. (`asc`, `desc`; default `asc`)
	Order *string `pulumi:"order"`
	// The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
	OrderBy *string                `pulumi:"orderBy"`
	Types   []GetInstanceTypesType `pulumi:"types"`
}

// A collection of values returned by getInstanceTypes.
type GetInstanceTypesResult struct {
	Filters []GetInstanceTypesFilter `pulumi:"filters"`
	// The ID representing the Linode Type.
	Id      string                 `pulumi:"id"`
	Order   *string                `pulumi:"order"`
	OrderBy *string                `pulumi:"orderBy"`
	Types   []GetInstanceTypesType `pulumi:"types"`
}

func GetInstanceTypesOutput(ctx *pulumi.Context, args GetInstanceTypesOutputArgs, opts ...pulumi.InvokeOption) GetInstanceTypesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetInstanceTypesResult, error) {
			args := v.(GetInstanceTypesArgs)
			r, err := GetInstanceTypes(ctx, &args, opts...)
			var s GetInstanceTypesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetInstanceTypesResultOutput)
}

// A collection of arguments for invoking getInstanceTypes.
type GetInstanceTypesOutputArgs struct {
	Filters GetInstanceTypesFilterArrayInput `pulumi:"filters"`
	// The order in which results should be returned. (`asc`, `desc`; default `asc`)
	Order pulumi.StringPtrInput `pulumi:"order"`
	// The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
	OrderBy pulumi.StringPtrInput          `pulumi:"orderBy"`
	Types   GetInstanceTypesTypeArrayInput `pulumi:"types"`
}

func (GetInstanceTypesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetInstanceTypesArgs)(nil)).Elem()
}

// A collection of values returned by getInstanceTypes.
type GetInstanceTypesResultOutput struct{ *pulumi.OutputState }

func (GetInstanceTypesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetInstanceTypesResult)(nil)).Elem()
}

func (o GetInstanceTypesResultOutput) ToGetInstanceTypesResultOutput() GetInstanceTypesResultOutput {
	return o
}

func (o GetInstanceTypesResultOutput) ToGetInstanceTypesResultOutputWithContext(ctx context.Context) GetInstanceTypesResultOutput {
	return o
}

func (o GetInstanceTypesResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetInstanceTypesResult] {
	return pulumix.Output[GetInstanceTypesResult]{
		OutputState: o.OutputState,
	}
}

func (o GetInstanceTypesResultOutput) Filters() GetInstanceTypesFilterArrayOutput {
	return o.ApplyT(func(v GetInstanceTypesResult) []GetInstanceTypesFilter { return v.Filters }).(GetInstanceTypesFilterArrayOutput)
}

// The ID representing the Linode Type.
func (o GetInstanceTypesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstanceTypesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetInstanceTypesResultOutput) Order() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetInstanceTypesResult) *string { return v.Order }).(pulumi.StringPtrOutput)
}

func (o GetInstanceTypesResultOutput) OrderBy() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetInstanceTypesResult) *string { return v.OrderBy }).(pulumi.StringPtrOutput)
}

func (o GetInstanceTypesResultOutput) Types() GetInstanceTypesTypeArrayOutput {
	return o.ApplyT(func(v GetInstanceTypesResult) []GetInstanceTypesType { return v.Types }).(GetInstanceTypesTypeArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetInstanceTypesResultOutput{})
}
