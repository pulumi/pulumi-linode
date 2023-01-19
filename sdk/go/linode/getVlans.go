// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides details about Linode VLANs.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-linode/sdk/v3/go/linode"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := linode.NewInstance(ctx, "myInstance", &linode.InstanceArgs{
//				Label:    pulumi.String("my_instance"),
//				Image:    pulumi.String("linode/ubuntu18.04"),
//				Region:   pulumi.String("us-southeast"),
//				Type:     pulumi.String("g6-standard-1"),
//				RootPass: pulumi.String(fmt.Sprintf("bogusPassword$")),
//				Interfaces: InstanceInterfaceArray{
//					&InstanceInterfaceArgs{
//						Purpose: pulumi.String("vlan"),
//						Label:   pulumi.String("my-vlan"),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			my_vlans, err := linode.GetVlans(ctx, &GetVlansArgs{
//				Filters: []GetVlansFilter{
//					GetVlansFilter{
//						Name: "label",
//						Values: []string{
//							"my-vlan",
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("vlanLinodes", my_vlans.Vlans[0].Linodes)
//			return nil
//		})
//	}
//
// ```
// ## Filterable Fields
//
// * `label`
//
// * `region`
func GetVlans(ctx *pulumi.Context, args *GetVlansArgs, opts ...pulumi.InvokeOption) (*GetVlansResult, error) {
	var rv GetVlansResult
	err := ctx.Invoke("linode:index/getVlans:getVlans", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getVlans.
type GetVlansArgs struct {
	Filters []GetVlansFilter `pulumi:"filters"`
	// The order in which results should be returned. (`asc`, `desc`; default `asc`)
	Order *string `pulumi:"order"`
	// The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
	OrderBy *string `pulumi:"orderBy"`
}

// A collection of values returned by getVlans.
type GetVlansResult struct {
	Filters []GetVlansFilter `pulumi:"filters"`
	// The provider-assigned unique ID for this managed resource.
	Id      string         `pulumi:"id"`
	Order   *string        `pulumi:"order"`
	OrderBy *string        `pulumi:"orderBy"`
	Vlans   []GetVlansVlan `pulumi:"vlans"`
}

func GetVlansOutput(ctx *pulumi.Context, args GetVlansOutputArgs, opts ...pulumi.InvokeOption) GetVlansResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetVlansResult, error) {
			args := v.(GetVlansArgs)
			r, err := GetVlans(ctx, &args, opts...)
			var s GetVlansResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetVlansResultOutput)
}

// A collection of arguments for invoking getVlans.
type GetVlansOutputArgs struct {
	Filters GetVlansFilterArrayInput `pulumi:"filters"`
	// The order in which results should be returned. (`asc`, `desc`; default `asc`)
	Order pulumi.StringPtrInput `pulumi:"order"`
	// The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
	OrderBy pulumi.StringPtrInput `pulumi:"orderBy"`
}

func (GetVlansOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetVlansArgs)(nil)).Elem()
}

// A collection of values returned by getVlans.
type GetVlansResultOutput struct{ *pulumi.OutputState }

func (GetVlansResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetVlansResult)(nil)).Elem()
}

func (o GetVlansResultOutput) ToGetVlansResultOutput() GetVlansResultOutput {
	return o
}

func (o GetVlansResultOutput) ToGetVlansResultOutputWithContext(ctx context.Context) GetVlansResultOutput {
	return o
}

func (o GetVlansResultOutput) Filters() GetVlansFilterArrayOutput {
	return o.ApplyT(func(v GetVlansResult) []GetVlansFilter { return v.Filters }).(GetVlansFilterArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetVlansResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetVlansResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetVlansResultOutput) Order() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetVlansResult) *string { return v.Order }).(pulumi.StringPtrOutput)
}

func (o GetVlansResultOutput) OrderBy() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetVlansResult) *string { return v.OrderBy }).(pulumi.StringPtrOutput)
}

func (o GetVlansResultOutput) Vlans() GetVlansVlanArrayOutput {
	return o.ApplyT(func(v GetVlansResult) []GetVlansVlan { return v.Vlans }).(GetVlansVlanArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetVlansResultOutput{})
}
