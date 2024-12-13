// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-linode/sdk/v4/go/linode/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func GetNbTypes(ctx *pulumi.Context, args *GetNbTypesArgs, opts ...pulumi.InvokeOption) (*GetNbTypesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetNbTypesResult
	err := ctx.Invoke("linode:index/getNbTypes:getNbTypes", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getNbTypes.
type GetNbTypesArgs struct {
	Filters []GetNbTypesFilter `pulumi:"filters"`
	Order   *string            `pulumi:"order"`
	OrderBy *string            `pulumi:"orderBy"`
	Types   []GetNbTypesType   `pulumi:"types"`
}

// A collection of values returned by getNbTypes.
type GetNbTypesResult struct {
	Filters []GetNbTypesFilter `pulumi:"filters"`
	Id      string             `pulumi:"id"`
	Order   *string            `pulumi:"order"`
	OrderBy *string            `pulumi:"orderBy"`
	Types   []GetNbTypesType   `pulumi:"types"`
}

func GetNbTypesOutput(ctx *pulumi.Context, args GetNbTypesOutputArgs, opts ...pulumi.InvokeOption) GetNbTypesResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetNbTypesResultOutput, error) {
			args := v.(GetNbTypesArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("linode:index/getNbTypes:getNbTypes", args, GetNbTypesResultOutput{}, options).(GetNbTypesResultOutput), nil
		}).(GetNbTypesResultOutput)
}

// A collection of arguments for invoking getNbTypes.
type GetNbTypesOutputArgs struct {
	Filters GetNbTypesFilterArrayInput `pulumi:"filters"`
	Order   pulumi.StringPtrInput      `pulumi:"order"`
	OrderBy pulumi.StringPtrInput      `pulumi:"orderBy"`
	Types   GetNbTypesTypeArrayInput   `pulumi:"types"`
}

func (GetNbTypesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetNbTypesArgs)(nil)).Elem()
}

// A collection of values returned by getNbTypes.
type GetNbTypesResultOutput struct{ *pulumi.OutputState }

func (GetNbTypesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetNbTypesResult)(nil)).Elem()
}

func (o GetNbTypesResultOutput) ToGetNbTypesResultOutput() GetNbTypesResultOutput {
	return o
}

func (o GetNbTypesResultOutput) ToGetNbTypesResultOutputWithContext(ctx context.Context) GetNbTypesResultOutput {
	return o
}

func (o GetNbTypesResultOutput) Filters() GetNbTypesFilterArrayOutput {
	return o.ApplyT(func(v GetNbTypesResult) []GetNbTypesFilter { return v.Filters }).(GetNbTypesFilterArrayOutput)
}

func (o GetNbTypesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetNbTypesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetNbTypesResultOutput) Order() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetNbTypesResult) *string { return v.Order }).(pulumi.StringPtrOutput)
}

func (o GetNbTypesResultOutput) OrderBy() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetNbTypesResult) *string { return v.OrderBy }).(pulumi.StringPtrOutput)
}

func (o GetNbTypesResultOutput) Types() GetNbTypesTypeArrayOutput {
	return o.ApplyT(func(v GetNbTypesResult) []GetNbTypesType { return v.Types }).(GetNbTypesTypeArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetNbTypesResultOutput{})
}
