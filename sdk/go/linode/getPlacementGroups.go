// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-linode/sdk/v4/go/linode/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// **NOTE: Placement Groups may not currently be available to all users.**
//
// Provides information about a list of Linode Placement Groups that match a set of filters.
//
// ## Example Usage
//
// The following example shows how one might use this data source to list Placement Groups.
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
//			all, err := linode.GetPlacementGroups(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			filtered, err := linode.GetPlacementGroups(ctx, &linode.GetPlacementGroupsArgs{
//				Filters: []linode.GetPlacementGroupsFilter{
//					{
//						Name: "label",
//						Values: []string{
//							"my-label",
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("all-pgs", all.PlacementGroups)
//			ctx.Export("filtered-pgs", filtered.PlacementGroups)
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
// * `region`
//
// * `affinityType`
//
// * `isStrict`
//
// * `isCompliant`
func GetPlacementGroups(ctx *pulumi.Context, args *GetPlacementGroupsArgs, opts ...pulumi.InvokeOption) (*GetPlacementGroupsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetPlacementGroupsResult
	err := ctx.Invoke("linode:index/getPlacementGroups:getPlacementGroups", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getPlacementGroups.
type GetPlacementGroupsArgs struct {
	Filters         []GetPlacementGroupsFilter         `pulumi:"filters"`
	Order           *string                            `pulumi:"order"`
	OrderBy         *string                            `pulumi:"orderBy"`
	PlacementGroups []GetPlacementGroupsPlacementGroup `pulumi:"placementGroups"`
}

// A collection of values returned by getPlacementGroups.
type GetPlacementGroupsResult struct {
	Filters         []GetPlacementGroupsFilter         `pulumi:"filters"`
	Id              string                             `pulumi:"id"`
	Order           *string                            `pulumi:"order"`
	OrderBy         *string                            `pulumi:"orderBy"`
	PlacementGroups []GetPlacementGroupsPlacementGroup `pulumi:"placementGroups"`
}

func GetPlacementGroupsOutput(ctx *pulumi.Context, args GetPlacementGroupsOutputArgs, opts ...pulumi.InvokeOption) GetPlacementGroupsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetPlacementGroupsResult, error) {
			args := v.(GetPlacementGroupsArgs)
			r, err := GetPlacementGroups(ctx, &args, opts...)
			var s GetPlacementGroupsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetPlacementGroupsResultOutput)
}

// A collection of arguments for invoking getPlacementGroups.
type GetPlacementGroupsOutputArgs struct {
	Filters         GetPlacementGroupsFilterArrayInput         `pulumi:"filters"`
	Order           pulumi.StringPtrInput                      `pulumi:"order"`
	OrderBy         pulumi.StringPtrInput                      `pulumi:"orderBy"`
	PlacementGroups GetPlacementGroupsPlacementGroupArrayInput `pulumi:"placementGroups"`
}

func (GetPlacementGroupsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetPlacementGroupsArgs)(nil)).Elem()
}

// A collection of values returned by getPlacementGroups.
type GetPlacementGroupsResultOutput struct{ *pulumi.OutputState }

func (GetPlacementGroupsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetPlacementGroupsResult)(nil)).Elem()
}

func (o GetPlacementGroupsResultOutput) ToGetPlacementGroupsResultOutput() GetPlacementGroupsResultOutput {
	return o
}

func (o GetPlacementGroupsResultOutput) ToGetPlacementGroupsResultOutputWithContext(ctx context.Context) GetPlacementGroupsResultOutput {
	return o
}

func (o GetPlacementGroupsResultOutput) Filters() GetPlacementGroupsFilterArrayOutput {
	return o.ApplyT(func(v GetPlacementGroupsResult) []GetPlacementGroupsFilter { return v.Filters }).(GetPlacementGroupsFilterArrayOutput)
}

func (o GetPlacementGroupsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetPlacementGroupsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetPlacementGroupsResultOutput) Order() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetPlacementGroupsResult) *string { return v.Order }).(pulumi.StringPtrOutput)
}

func (o GetPlacementGroupsResultOutput) OrderBy() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetPlacementGroupsResult) *string { return v.OrderBy }).(pulumi.StringPtrOutput)
}

func (o GetPlacementGroupsResultOutput) PlacementGroups() GetPlacementGroupsPlacementGroupArrayOutput {
	return o.ApplyT(func(v GetPlacementGroupsResult) []GetPlacementGroupsPlacementGroup { return v.PlacementGroups }).(GetPlacementGroupsPlacementGroupArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetPlacementGroupsResultOutput{})
}
