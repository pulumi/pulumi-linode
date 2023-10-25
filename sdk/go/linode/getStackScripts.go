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

// Provides information about Linode StackScripts that match a set of filters.
//
// **NOTICE:** Due to the large number of public StackScripts, this data source may time out if `isPublic` is not filtered on.
//
// ## Filterable Fields
//
// * `deploymentsActive`
//
// * `deploymentsTotal`
//
// * `description`
//
// * `images`
//
// * `isPublic`
//
// * `label`
//
// * `mine`
//
// * `revNote`
//
// * `username`
func GetStackScripts(ctx *pulumi.Context, args *GetStackScriptsArgs, opts ...pulumi.InvokeOption) (*GetStackScriptsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetStackScriptsResult
	err := ctx.Invoke("linode:index/getStackScripts:getStackScripts", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getStackScripts.
type GetStackScriptsArgs struct {
	Filters []GetStackScriptsFilter `pulumi:"filters"`
	// If true, only the latest StackScript will be returned. StackScripts without a valid `created` field are not included in the result.
	//
	// * `filter` - (Optional) A set of filters used to select Linode StackScripts that meet certain requirements.
	Latest *bool `pulumi:"latest"`
	// The order in which results should be returned. (`asc`, `desc`; default `asc`)
	Order *string `pulumi:"order"`
	// The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
	OrderBy      *string                      `pulumi:"orderBy"`
	Stackscripts []GetStackScriptsStackscript `pulumi:"stackscripts"`
}

// A collection of values returned by getStackScripts.
type GetStackScriptsResult struct {
	Filters []GetStackScriptsFilter `pulumi:"filters"`
	// The unique ID of the StackScript.
	Id           string                       `pulumi:"id"`
	Latest       *bool                        `pulumi:"latest"`
	Order        *string                      `pulumi:"order"`
	OrderBy      *string                      `pulumi:"orderBy"`
	Stackscripts []GetStackScriptsStackscript `pulumi:"stackscripts"`
}

func GetStackScriptsOutput(ctx *pulumi.Context, args GetStackScriptsOutputArgs, opts ...pulumi.InvokeOption) GetStackScriptsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetStackScriptsResult, error) {
			args := v.(GetStackScriptsArgs)
			r, err := GetStackScripts(ctx, &args, opts...)
			var s GetStackScriptsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetStackScriptsResultOutput)
}

// A collection of arguments for invoking getStackScripts.
type GetStackScriptsOutputArgs struct {
	Filters GetStackScriptsFilterArrayInput `pulumi:"filters"`
	// If true, only the latest StackScript will be returned. StackScripts without a valid `created` field are not included in the result.
	//
	// * `filter` - (Optional) A set of filters used to select Linode StackScripts that meet certain requirements.
	Latest pulumi.BoolPtrInput `pulumi:"latest"`
	// The order in which results should be returned. (`asc`, `desc`; default `asc`)
	Order pulumi.StringPtrInput `pulumi:"order"`
	// The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
	OrderBy      pulumi.StringPtrInput                `pulumi:"orderBy"`
	Stackscripts GetStackScriptsStackscriptArrayInput `pulumi:"stackscripts"`
}

func (GetStackScriptsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetStackScriptsArgs)(nil)).Elem()
}

// A collection of values returned by getStackScripts.
type GetStackScriptsResultOutput struct{ *pulumi.OutputState }

func (GetStackScriptsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetStackScriptsResult)(nil)).Elem()
}

func (o GetStackScriptsResultOutput) ToGetStackScriptsResultOutput() GetStackScriptsResultOutput {
	return o
}

func (o GetStackScriptsResultOutput) ToGetStackScriptsResultOutputWithContext(ctx context.Context) GetStackScriptsResultOutput {
	return o
}

func (o GetStackScriptsResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetStackScriptsResult] {
	return pulumix.Output[GetStackScriptsResult]{
		OutputState: o.OutputState,
	}
}

func (o GetStackScriptsResultOutput) Filters() GetStackScriptsFilterArrayOutput {
	return o.ApplyT(func(v GetStackScriptsResult) []GetStackScriptsFilter { return v.Filters }).(GetStackScriptsFilterArrayOutput)
}

// The unique ID of the StackScript.
func (o GetStackScriptsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetStackScriptsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetStackScriptsResultOutput) Latest() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetStackScriptsResult) *bool { return v.Latest }).(pulumi.BoolPtrOutput)
}

func (o GetStackScriptsResultOutput) Order() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetStackScriptsResult) *string { return v.Order }).(pulumi.StringPtrOutput)
}

func (o GetStackScriptsResultOutput) OrderBy() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetStackScriptsResult) *string { return v.OrderBy }).(pulumi.StringPtrOutput)
}

func (o GetStackScriptsResultOutput) Stackscripts() GetStackScriptsStackscriptArrayOutput {
	return o.ApplyT(func(v GetStackScriptsResult) []GetStackScriptsStackscript { return v.Stackscripts }).(GetStackScriptsStackscriptArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetStackScriptsResultOutput{})
}
