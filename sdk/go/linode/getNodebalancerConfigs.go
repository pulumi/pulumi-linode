// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-linode/sdk/v4/go/linode/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides information about Linode NodeBalancer Configs that match a set of filters.
//
// ## Example Usage
//
// The following example shows how one might use this data source to access information about a list of NodeBalancer Configs.
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
//			filterNbConfigs, err := linode.GetNodebalancerConfigs(ctx, &linode.GetNodebalancerConfigsArgs{
//				NodebalancerId: 12345,
//				Filters: []linode.GetNodebalancerConfigsFilter{
//					{
//						Name: "port",
//						Values: []string{
//							"80",
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("nodebalancerConfigId", filterNbConfigs.NodebalancerConfigs[0].Id)
//			return nil
//		})
//	}
//
// ```
//
// ## Filterable Fields
//
// * `algorithm`
//
// * `check`
//
// * `nodebalancerId`
//
// * `port`
//
// * `protocol`
//
// * `proxyProtocol`
//
// * `stickiness`
//
// * `checkPath`
//
// * `checkBody`
//
// * `checkPassive`
//
// * `cipherSuite`
//
// * `sslCommonname`
func GetNodebalancerConfigs(ctx *pulumi.Context, args *GetNodebalancerConfigsArgs, opts ...pulumi.InvokeOption) (*GetNodebalancerConfigsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetNodebalancerConfigsResult
	err := ctx.Invoke("linode:index/getNodebalancerConfigs:getNodebalancerConfigs", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getNodebalancerConfigs.
type GetNodebalancerConfigsArgs struct {
	Filters             []GetNodebalancerConfigsFilter             `pulumi:"filters"`
	NodebalancerConfigs []GetNodebalancerConfigsNodebalancerConfig `pulumi:"nodebalancerConfigs"`
	// The ID of the NodeBalancer to access.
	//
	// * `filter` - (Optional) A set of filters used to select Linode NodeBalancers that meet certain requirements.
	NodebalancerId int `pulumi:"nodebalancerId"`
	// The order in which results should be returned. (`asc`, `desc`; default `asc`)
	Order *string `pulumi:"order"`
	// The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
	OrderBy *string `pulumi:"orderBy"`
}

// A collection of values returned by getNodebalancerConfigs.
type GetNodebalancerConfigsResult struct {
	Filters []GetNodebalancerConfigsFilter `pulumi:"filters"`
	// The config's ID.
	Id                  string                                     `pulumi:"id"`
	NodebalancerConfigs []GetNodebalancerConfigsNodebalancerConfig `pulumi:"nodebalancerConfigs"`
	// The ID of the NodeBalancer that contains the config.
	NodebalancerId int     `pulumi:"nodebalancerId"`
	Order          *string `pulumi:"order"`
	OrderBy        *string `pulumi:"orderBy"`
}

func GetNodebalancerConfigsOutput(ctx *pulumi.Context, args GetNodebalancerConfigsOutputArgs, opts ...pulumi.InvokeOption) GetNodebalancerConfigsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetNodebalancerConfigsResult, error) {
			args := v.(GetNodebalancerConfigsArgs)
			r, err := GetNodebalancerConfigs(ctx, &args, opts...)
			var s GetNodebalancerConfigsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetNodebalancerConfigsResultOutput)
}

// A collection of arguments for invoking getNodebalancerConfigs.
type GetNodebalancerConfigsOutputArgs struct {
	Filters             GetNodebalancerConfigsFilterArrayInput             `pulumi:"filters"`
	NodebalancerConfigs GetNodebalancerConfigsNodebalancerConfigArrayInput `pulumi:"nodebalancerConfigs"`
	// The ID of the NodeBalancer to access.
	//
	// * `filter` - (Optional) A set of filters used to select Linode NodeBalancers that meet certain requirements.
	NodebalancerId pulumi.IntInput `pulumi:"nodebalancerId"`
	// The order in which results should be returned. (`asc`, `desc`; default `asc`)
	Order pulumi.StringPtrInput `pulumi:"order"`
	// The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
	OrderBy pulumi.StringPtrInput `pulumi:"orderBy"`
}

func (GetNodebalancerConfigsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetNodebalancerConfigsArgs)(nil)).Elem()
}

// A collection of values returned by getNodebalancerConfigs.
type GetNodebalancerConfigsResultOutput struct{ *pulumi.OutputState }

func (GetNodebalancerConfigsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetNodebalancerConfigsResult)(nil)).Elem()
}

func (o GetNodebalancerConfigsResultOutput) ToGetNodebalancerConfigsResultOutput() GetNodebalancerConfigsResultOutput {
	return o
}

func (o GetNodebalancerConfigsResultOutput) ToGetNodebalancerConfigsResultOutputWithContext(ctx context.Context) GetNodebalancerConfigsResultOutput {
	return o
}

func (o GetNodebalancerConfigsResultOutput) Filters() GetNodebalancerConfigsFilterArrayOutput {
	return o.ApplyT(func(v GetNodebalancerConfigsResult) []GetNodebalancerConfigsFilter { return v.Filters }).(GetNodebalancerConfigsFilterArrayOutput)
}

// The config's ID.
func (o GetNodebalancerConfigsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetNodebalancerConfigsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetNodebalancerConfigsResultOutput) NodebalancerConfigs() GetNodebalancerConfigsNodebalancerConfigArrayOutput {
	return o.ApplyT(func(v GetNodebalancerConfigsResult) []GetNodebalancerConfigsNodebalancerConfig {
		return v.NodebalancerConfigs
	}).(GetNodebalancerConfigsNodebalancerConfigArrayOutput)
}

// The ID of the NodeBalancer that contains the config.
func (o GetNodebalancerConfigsResultOutput) NodebalancerId() pulumi.IntOutput {
	return o.ApplyT(func(v GetNodebalancerConfigsResult) int { return v.NodebalancerId }).(pulumi.IntOutput)
}

func (o GetNodebalancerConfigsResultOutput) Order() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetNodebalancerConfigsResult) *string { return v.Order }).(pulumi.StringPtrOutput)
}

func (o GetNodebalancerConfigsResultOutput) OrderBy() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetNodebalancerConfigsResult) *string { return v.OrderBy }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetNodebalancerConfigsResultOutput{})
}
