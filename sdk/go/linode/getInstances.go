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

// Provides information about Linode instances that match a set of filters.
//
// ## Example Usage
//
// Get information about all Linode instances with a certain label and tag:
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
//			my_instances, err := linode.GetInstances(ctx, &linode.GetInstancesArgs{
//				Filters: []linode.GetInstancesFilter{
//					{
//						Name: "label",
//						Values: []string{
//							"my-label",
//							"my-other-label",
//						},
//					},
//					{
//						Name: "tags",
//						Values: []string{
//							"my-tag",
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("instanceId", my_instances.Instances[0].Id)
//			return nil
//		})
//	}
//
// ```
//
// Get information about all Linode instances associated with the current token:
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
//			all_instances, err := linode.GetInstances(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			var splat0 []*int
//			for _, val0 := range all_instances.Instances {
//				splat0 = append(splat0, val0.Id)
//			}
//			ctx.Export("instanceIds", splat0)
//			return nil
//		})
//	}
//
// ```
// ## Filterable Fields
//
// * `group`
//
// * `id`
//
// * `image`
//
// * `label`
//
// * `region`
//
// * `status`
//
// * `tags`
//
// * `type`
//
// * `watchdogEnabled`
func GetInstances(ctx *pulumi.Context, args *GetInstancesArgs, opts ...pulumi.InvokeOption) (*GetInstancesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetInstancesResult
	err := ctx.Invoke("linode:index/getInstances:getInstances", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getInstances.
type GetInstancesArgs struct {
	Filters []GetInstancesFilter `pulumi:"filters"`
	// The order in which results should be returned. (`asc`, `desc`; default `asc`)
	Order *string `pulumi:"order"`
	// The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
	OrderBy *string `pulumi:"orderBy"`
}

// A collection of values returned by getInstances.
type GetInstancesResult struct {
	Filters []GetInstancesFilter `pulumi:"filters"`
	// The provider-assigned unique ID for this managed resource.
	Id        string                 `pulumi:"id"`
	Instances []GetInstancesInstance `pulumi:"instances"`
	Order     *string                `pulumi:"order"`
	OrderBy   *string                `pulumi:"orderBy"`
}

func GetInstancesOutput(ctx *pulumi.Context, args GetInstancesOutputArgs, opts ...pulumi.InvokeOption) GetInstancesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetInstancesResult, error) {
			args := v.(GetInstancesArgs)
			r, err := GetInstances(ctx, &args, opts...)
			var s GetInstancesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetInstancesResultOutput)
}

// A collection of arguments for invoking getInstances.
type GetInstancesOutputArgs struct {
	Filters GetInstancesFilterArrayInput `pulumi:"filters"`
	// The order in which results should be returned. (`asc`, `desc`; default `asc`)
	Order pulumi.StringPtrInput `pulumi:"order"`
	// The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
	OrderBy pulumi.StringPtrInput `pulumi:"orderBy"`
}

func (GetInstancesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetInstancesArgs)(nil)).Elem()
}

// A collection of values returned by getInstances.
type GetInstancesResultOutput struct{ *pulumi.OutputState }

func (GetInstancesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetInstancesResult)(nil)).Elem()
}

func (o GetInstancesResultOutput) ToGetInstancesResultOutput() GetInstancesResultOutput {
	return o
}

func (o GetInstancesResultOutput) ToGetInstancesResultOutputWithContext(ctx context.Context) GetInstancesResultOutput {
	return o
}

func (o GetInstancesResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetInstancesResult] {
	return pulumix.Output[GetInstancesResult]{
		OutputState: o.OutputState,
	}
}

func (o GetInstancesResultOutput) Filters() GetInstancesFilterArrayOutput {
	return o.ApplyT(func(v GetInstancesResult) []GetInstancesFilter { return v.Filters }).(GetInstancesFilterArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetInstancesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetInstancesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetInstancesResultOutput) Instances() GetInstancesInstanceArrayOutput {
	return o.ApplyT(func(v GetInstancesResult) []GetInstancesInstance { return v.Instances }).(GetInstancesInstanceArrayOutput)
}

func (o GetInstancesResultOutput) Order() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetInstancesResult) *string { return v.Order }).(pulumi.StringPtrOutput)
}

func (o GetInstancesResultOutput) OrderBy() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetInstancesResult) *string { return v.OrderBy }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetInstancesResultOutput{})
}
