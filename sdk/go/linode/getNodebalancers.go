// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-linode/sdk/v4/go/linode/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides information about Linode NodeBalancers that match a set of filters.
// For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-node-balancers).
//
// ## Example Usage
//
// The following example shows how one might use this data source to access information about a Linode NodeBalancer.
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
//			specific_nodebalancers, err := linode.GetNodebalancers(ctx, &linode.GetNodebalancersArgs{
//				Filters: []linode.GetNodebalancersFilter{
//					{
//						Name: "label",
//						Values: []string{
//							"my-nodebalancer",
//						},
//					},
//					{
//						Name: "region",
//						Values: []string{
//							"us-iad",
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("nodebalancerId", specific_nodebalancers.Nodebalancers[0].Id)
//			return nil
//		})
//	}
//
// ```
//
// ## Filterable Fields
//
// * `label`
//
// * `tags`
//
// * `ipv4`
//
// * `ipv6`
//
// * `hostname`
//
// * `region`
//
// * `clientConnThrottle`
func GetNodebalancers(ctx *pulumi.Context, args *GetNodebalancersArgs, opts ...pulumi.InvokeOption) (*GetNodebalancersResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetNodebalancersResult
	err := ctx.Invoke("linode:index/getNodebalancers:getNodebalancers", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getNodebalancers.
type GetNodebalancersArgs struct {
	Filters       []GetNodebalancersFilter       `pulumi:"filters"`
	Nodebalancers []GetNodebalancersNodebalancer `pulumi:"nodebalancers"`
	// The order in which results should be returned. (`asc`, `desc`; default `asc`)
	Order *string `pulumi:"order"`
	// The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
	OrderBy *string `pulumi:"orderBy"`
}

// A collection of values returned by getNodebalancers.
type GetNodebalancersResult struct {
	Filters []GetNodebalancersFilter `pulumi:"filters"`
	// The Linode NodeBalancer's unique ID
	Id            string                         `pulumi:"id"`
	Nodebalancers []GetNodebalancersNodebalancer `pulumi:"nodebalancers"`
	Order         *string                        `pulumi:"order"`
	OrderBy       *string                        `pulumi:"orderBy"`
}

func GetNodebalancersOutput(ctx *pulumi.Context, args GetNodebalancersOutputArgs, opts ...pulumi.InvokeOption) GetNodebalancersResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (GetNodebalancersResultOutput, error) {
			args := v.(GetNodebalancersArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("linode:index/getNodebalancers:getNodebalancers", args, GetNodebalancersResultOutput{}, options).(GetNodebalancersResultOutput), nil
		}).(GetNodebalancersResultOutput)
}

// A collection of arguments for invoking getNodebalancers.
type GetNodebalancersOutputArgs struct {
	Filters       GetNodebalancersFilterArrayInput       `pulumi:"filters"`
	Nodebalancers GetNodebalancersNodebalancerArrayInput `pulumi:"nodebalancers"`
	// The order in which results should be returned. (`asc`, `desc`; default `asc`)
	Order pulumi.StringPtrInput `pulumi:"order"`
	// The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
	OrderBy pulumi.StringPtrInput `pulumi:"orderBy"`
}

func (GetNodebalancersOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetNodebalancersArgs)(nil)).Elem()
}

// A collection of values returned by getNodebalancers.
type GetNodebalancersResultOutput struct{ *pulumi.OutputState }

func (GetNodebalancersResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetNodebalancersResult)(nil)).Elem()
}

func (o GetNodebalancersResultOutput) ToGetNodebalancersResultOutput() GetNodebalancersResultOutput {
	return o
}

func (o GetNodebalancersResultOutput) ToGetNodebalancersResultOutputWithContext(ctx context.Context) GetNodebalancersResultOutput {
	return o
}

func (o GetNodebalancersResultOutput) Filters() GetNodebalancersFilterArrayOutput {
	return o.ApplyT(func(v GetNodebalancersResult) []GetNodebalancersFilter { return v.Filters }).(GetNodebalancersFilterArrayOutput)
}

// The Linode NodeBalancer's unique ID
func (o GetNodebalancersResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetNodebalancersResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetNodebalancersResultOutput) Nodebalancers() GetNodebalancersNodebalancerArrayOutput {
	return o.ApplyT(func(v GetNodebalancersResult) []GetNodebalancersNodebalancer { return v.Nodebalancers }).(GetNodebalancersNodebalancerArrayOutput)
}

func (o GetNodebalancersResultOutput) Order() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetNodebalancersResult) *string { return v.Order }).(pulumi.StringPtrOutput)
}

func (o GetNodebalancersResultOutput) OrderBy() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetNodebalancersResult) *string { return v.OrderBy }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetNodebalancersResultOutput{})
}
