// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-linode/sdk/v4/go/linode/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides information about Linode Volume types that match a set of filters.
// For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-volume-types).
func GetVolumeTypes(ctx *pulumi.Context, args *GetVolumeTypesArgs, opts ...pulumi.InvokeOption) (*GetVolumeTypesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetVolumeTypesResult
	err := ctx.Invoke("linode:index/getVolumeTypes:getVolumeTypes", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getVolumeTypes.
type GetVolumeTypesArgs struct {
	Filters []GetVolumeTypesFilter `pulumi:"filters"`
	// The order in which results should be returned. (`asc`, `desc`; default `asc`)
	Order *string `pulumi:"order"`
	// The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
	OrderBy *string              `pulumi:"orderBy"`
	Types   []GetVolumeTypesType `pulumi:"types"`
}

// A collection of values returned by getVolumeTypes.
type GetVolumeTypesResult struct {
	Filters []GetVolumeTypesFilter `pulumi:"filters"`
	// The ID representing the Volume type.
	Id      string               `pulumi:"id"`
	Order   *string              `pulumi:"order"`
	OrderBy *string              `pulumi:"orderBy"`
	Types   []GetVolumeTypesType `pulumi:"types"`
}

func GetVolumeTypesOutput(ctx *pulumi.Context, args GetVolumeTypesOutputArgs, opts ...pulumi.InvokeOption) GetVolumeTypesResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetVolumeTypesResultOutput, error) {
			args := v.(GetVolumeTypesArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("linode:index/getVolumeTypes:getVolumeTypes", args, GetVolumeTypesResultOutput{}, options).(GetVolumeTypesResultOutput), nil
		}).(GetVolumeTypesResultOutput)
}

// A collection of arguments for invoking getVolumeTypes.
type GetVolumeTypesOutputArgs struct {
	Filters GetVolumeTypesFilterArrayInput `pulumi:"filters"`
	// The order in which results should be returned. (`asc`, `desc`; default `asc`)
	Order pulumi.StringPtrInput `pulumi:"order"`
	// The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
	OrderBy pulumi.StringPtrInput        `pulumi:"orderBy"`
	Types   GetVolumeTypesTypeArrayInput `pulumi:"types"`
}

func (GetVolumeTypesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetVolumeTypesArgs)(nil)).Elem()
}

// A collection of values returned by getVolumeTypes.
type GetVolumeTypesResultOutput struct{ *pulumi.OutputState }

func (GetVolumeTypesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetVolumeTypesResult)(nil)).Elem()
}

func (o GetVolumeTypesResultOutput) ToGetVolumeTypesResultOutput() GetVolumeTypesResultOutput {
	return o
}

func (o GetVolumeTypesResultOutput) ToGetVolumeTypesResultOutputWithContext(ctx context.Context) GetVolumeTypesResultOutput {
	return o
}

func (o GetVolumeTypesResultOutput) Filters() GetVolumeTypesFilterArrayOutput {
	return o.ApplyT(func(v GetVolumeTypesResult) []GetVolumeTypesFilter { return v.Filters }).(GetVolumeTypesFilterArrayOutput)
}

// The ID representing the Volume type.
func (o GetVolumeTypesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetVolumeTypesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetVolumeTypesResultOutput) Order() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetVolumeTypesResult) *string { return v.Order }).(pulumi.StringPtrOutput)
}

func (o GetVolumeTypesResultOutput) OrderBy() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetVolumeTypesResult) *string { return v.OrderBy }).(pulumi.StringPtrOutput)
}

func (o GetVolumeTypesResultOutput) Types() GetVolumeTypesTypeArrayOutput {
	return o.ApplyT(func(v GetVolumeTypesResult) []GetVolumeTypesType { return v.Types }).(GetVolumeTypesTypeArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetVolumeTypesResultOutput{})
}
