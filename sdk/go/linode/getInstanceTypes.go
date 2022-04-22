// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
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
// 	"github.com/pulumi/pulumi-linode/sdk/v3/go/linode"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := linode.GetInstanceTypes(ctx, &GetInstanceTypesArgs{
// 			Filters: []GetInstanceTypesFilter{
// 				GetInstanceTypesFilter{
// 					Name: "vcpus",
// 					Values: []string{
// 						"2",
// 					},
// 				},
// 			},
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// Get information about all Linode Instance types:
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-linode/sdk/v3/go/linode"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := linode.GetInstanceTypes(ctx, nil, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
// ## Attributes
//
// Each Linode Instance type will be stored in the `types` attribute and will export the following attributes:
//
// * `id` - The ID representing the Linode Type.
//
// * `label` - The Linode Type's label is for display purposes only.
//
// * `class` - The class of the Linode Type. See all classes [here](https://www.linode.com/docs/api/linode-types/#type-view__responses).
//
// * `disk` - The Disk size, in MB, of the Linode Type.
//
// * `price.0.hourly` -  Cost (in US dollars) per hour.
//
// * `price.0.monthly` - Cost (in US dollars) per month.
//
// * `addons.0.backups.0.price.0.hourly` - The cost (in US dollars) per hour to add Backups service.
//
// * `addons.0.backups.0.price.0.monthly` - The cost (in US dollars) per month to add Backups service.
//
// * `networkOut` - The Mbits outbound bandwidth allocation.
//
// * `memory` - The amount of RAM included in this Linode Type.
//
// * `transfer` - The monthly outbound transfer amount, in MB.
//
// * `vcpus` - The number of VCPU cores this Linode Type offers.
//
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
	OrderBy *string `pulumi:"orderBy"`
}

// A collection of values returned by getInstanceTypes.
type GetInstanceTypesResult struct {
	Filters []GetInstanceTypesFilter `pulumi:"filters"`
	// The provider-assigned unique ID for this managed resource.
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
	OrderBy pulumi.StringPtrInput `pulumi:"orderBy"`
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

func (o GetInstanceTypesResultOutput) Filters() GetInstanceTypesFilterArrayOutput {
	return o.ApplyT(func(v GetInstanceTypesResult) []GetInstanceTypesFilter { return v.Filters }).(GetInstanceTypesFilterArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
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
