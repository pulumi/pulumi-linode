// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-linode/sdk/v5/go/linode/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// `getRegion` provides details about a specific Linode region. See all regions [here](https://api.linode.com/v4/regions).
// For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-region).
//
// ## Example Usage
//
// The following example shows how the resource might be used to obtain additional information about a Linode region.
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
//			_, err := linode.GetRegion(ctx, &linode.GetRegionArgs{
//				Id: "us-east",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetRegion(ctx *pulumi.Context, args *GetRegionArgs, opts ...pulumi.InvokeOption) (*GetRegionResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetRegionResult
	err := ctx.Invoke("linode:index/getRegion:getRegion", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getRegion.
type GetRegionArgs struct {
	// The code name of the region to select.
	Id        string              `pulumi:"id"`
	Resolvers []GetRegionResolver `pulumi:"resolvers"`
}

// A collection of values returned by getRegion.
type GetRegionResult struct {
	// A list of capabilities of this region.
	Capabilities []string `pulumi:"capabilities"`
	// The country the region resides in.
	Country string `pulumi:"country"`
	Id      string `pulumi:"id"`
	// Detailed location information for this Region, including city, state or region, and country.
	Label                string                         `pulumi:"label"`
	PlacementGroupLimits []GetRegionPlacementGroupLimit `pulumi:"placementGroupLimits"`
	Resolvers            []GetRegionResolver            `pulumi:"resolvers"`
	// The type of this region.
	SiteType string `pulumi:"siteType"`
	// This region’s current operational status (ok or outage).
	Status string `pulumi:"status"`
}

func GetRegionOutput(ctx *pulumi.Context, args GetRegionOutputArgs, opts ...pulumi.InvokeOption) GetRegionResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetRegionResultOutput, error) {
			args := v.(GetRegionArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("linode:index/getRegion:getRegion", args, GetRegionResultOutput{}, options).(GetRegionResultOutput), nil
		}).(GetRegionResultOutput)
}

// A collection of arguments for invoking getRegion.
type GetRegionOutputArgs struct {
	// The code name of the region to select.
	Id        pulumi.StringInput          `pulumi:"id"`
	Resolvers GetRegionResolverArrayInput `pulumi:"resolvers"`
}

func (GetRegionOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetRegionArgs)(nil)).Elem()
}

// A collection of values returned by getRegion.
type GetRegionResultOutput struct{ *pulumi.OutputState }

func (GetRegionResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetRegionResult)(nil)).Elem()
}

func (o GetRegionResultOutput) ToGetRegionResultOutput() GetRegionResultOutput {
	return o
}

func (o GetRegionResultOutput) ToGetRegionResultOutputWithContext(ctx context.Context) GetRegionResultOutput {
	return o
}

// A list of capabilities of this region.
func (o GetRegionResultOutput) Capabilities() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetRegionResult) []string { return v.Capabilities }).(pulumi.StringArrayOutput)
}

// The country the region resides in.
func (o GetRegionResultOutput) Country() pulumi.StringOutput {
	return o.ApplyT(func(v GetRegionResult) string { return v.Country }).(pulumi.StringOutput)
}

func (o GetRegionResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetRegionResult) string { return v.Id }).(pulumi.StringOutput)
}

// Detailed location information for this Region, including city, state or region, and country.
func (o GetRegionResultOutput) Label() pulumi.StringOutput {
	return o.ApplyT(func(v GetRegionResult) string { return v.Label }).(pulumi.StringOutput)
}

func (o GetRegionResultOutput) PlacementGroupLimits() GetRegionPlacementGroupLimitArrayOutput {
	return o.ApplyT(func(v GetRegionResult) []GetRegionPlacementGroupLimit { return v.PlacementGroupLimits }).(GetRegionPlacementGroupLimitArrayOutput)
}

func (o GetRegionResultOutput) Resolvers() GetRegionResolverArrayOutput {
	return o.ApplyT(func(v GetRegionResult) []GetRegionResolver { return v.Resolvers }).(GetRegionResolverArrayOutput)
}

// The type of this region.
func (o GetRegionResultOutput) SiteType() pulumi.StringOutput {
	return o.ApplyT(func(v GetRegionResult) string { return v.SiteType }).(pulumi.StringOutput)
}

// This region’s current operational status (ok or outage).
func (o GetRegionResultOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v GetRegionResult) string { return v.Status }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetRegionResultOutput{})
}
