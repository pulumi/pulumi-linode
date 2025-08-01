// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-linode/sdk/v5/go/linode/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// `PlacementGroup` provides details about a Linode placement group.
// For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-placement-group).
//
// ## Example Usage
//
// The following example shows how the resource might be used to obtain additional information about a Linode placement group.
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
//			_, err := linode.LookupPlacementGroup(ctx, &linode.LookupPlacementGroupArgs{
//				Id: 12345,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupPlacementGroup(ctx *pulumi.Context, args *LookupPlacementGroupArgs, opts ...pulumi.InvokeOption) (*LookupPlacementGroupResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupPlacementGroupResult
	err := ctx.Invoke("linode:index/getPlacementGroup:getPlacementGroup", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getPlacementGroup.
type LookupPlacementGroupArgs struct {
	// The ID of the Placement Group.
	Id int `pulumi:"id"`
	// A set of Linodes currently assigned to this Placement Group.
	Members []GetPlacementGroupMember `pulumi:"members"`
	// Any Linodes that are being migrated to or from the placement group.
	Migrations *GetPlacementGroupMigrations `pulumi:"migrations"`
}

// A collection of values returned by getPlacementGroup.
type LookupPlacementGroupResult struct {
	Id int `pulumi:"id"`
	// Whether this Linode is currently compliant with the group's placement group type.
	IsCompliant bool `pulumi:"isCompliant"`
	// The label of the Placement Group. This field can only contain ASCII letters, digits and dashes.
	Label string `pulumi:"label"`
	// A set of Linodes currently assigned to this Placement Group.
	Members []GetPlacementGroupMember `pulumi:"members"`
	// Any Linodes that are being migrated to or from the placement group.
	Migrations *GetPlacementGroupMigrations `pulumi:"migrations"`
	// Whether Linodes must be able to become compliant during assignment. (Default `strict`)
	PlacementGroupPolicy string `pulumi:"placementGroupPolicy"`
	// The placement group type to use when placing Linodes in this group.
	PlacementGroupType string `pulumi:"placementGroupType"`
	// The region of the Placement Group.
	Region string `pulumi:"region"`
}

func LookupPlacementGroupOutput(ctx *pulumi.Context, args LookupPlacementGroupOutputArgs, opts ...pulumi.InvokeOption) LookupPlacementGroupResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupPlacementGroupResultOutput, error) {
			args := v.(LookupPlacementGroupArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("linode:index/getPlacementGroup:getPlacementGroup", args, LookupPlacementGroupResultOutput{}, options).(LookupPlacementGroupResultOutput), nil
		}).(LookupPlacementGroupResultOutput)
}

// A collection of arguments for invoking getPlacementGroup.
type LookupPlacementGroupOutputArgs struct {
	// The ID of the Placement Group.
	Id pulumi.IntInput `pulumi:"id"`
	// A set of Linodes currently assigned to this Placement Group.
	Members GetPlacementGroupMemberArrayInput `pulumi:"members"`
	// Any Linodes that are being migrated to or from the placement group.
	Migrations GetPlacementGroupMigrationsPtrInput `pulumi:"migrations"`
}

func (LookupPlacementGroupOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupPlacementGroupArgs)(nil)).Elem()
}

// A collection of values returned by getPlacementGroup.
type LookupPlacementGroupResultOutput struct{ *pulumi.OutputState }

func (LookupPlacementGroupResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupPlacementGroupResult)(nil)).Elem()
}

func (o LookupPlacementGroupResultOutput) ToLookupPlacementGroupResultOutput() LookupPlacementGroupResultOutput {
	return o
}

func (o LookupPlacementGroupResultOutput) ToLookupPlacementGroupResultOutputWithContext(ctx context.Context) LookupPlacementGroupResultOutput {
	return o
}

func (o LookupPlacementGroupResultOutput) Id() pulumi.IntOutput {
	return o.ApplyT(func(v LookupPlacementGroupResult) int { return v.Id }).(pulumi.IntOutput)
}

// Whether this Linode is currently compliant with the group's placement group type.
func (o LookupPlacementGroupResultOutput) IsCompliant() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupPlacementGroupResult) bool { return v.IsCompliant }).(pulumi.BoolOutput)
}

// The label of the Placement Group. This field can only contain ASCII letters, digits and dashes.
func (o LookupPlacementGroupResultOutput) Label() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPlacementGroupResult) string { return v.Label }).(pulumi.StringOutput)
}

// A set of Linodes currently assigned to this Placement Group.
func (o LookupPlacementGroupResultOutput) Members() GetPlacementGroupMemberArrayOutput {
	return o.ApplyT(func(v LookupPlacementGroupResult) []GetPlacementGroupMember { return v.Members }).(GetPlacementGroupMemberArrayOutput)
}

// Any Linodes that are being migrated to or from the placement group.
func (o LookupPlacementGroupResultOutput) Migrations() GetPlacementGroupMigrationsPtrOutput {
	return o.ApplyT(func(v LookupPlacementGroupResult) *GetPlacementGroupMigrations { return v.Migrations }).(GetPlacementGroupMigrationsPtrOutput)
}

// Whether Linodes must be able to become compliant during assignment. (Default `strict`)
func (o LookupPlacementGroupResultOutput) PlacementGroupPolicy() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPlacementGroupResult) string { return v.PlacementGroupPolicy }).(pulumi.StringOutput)
}

// The placement group type to use when placing Linodes in this group.
func (o LookupPlacementGroupResultOutput) PlacementGroupType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPlacementGroupResult) string { return v.PlacementGroupType }).(pulumi.StringOutput)
}

// The region of the Placement Group.
func (o LookupPlacementGroupResultOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPlacementGroupResult) string { return v.Region }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupPlacementGroupResultOutput{})
}
