// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-linode/sdk/v4/go/linode/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides information about Linode volumes that match a set of filters.
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
//			filtered_volumes, err := linode.GetVolumes(ctx, &linode.GetVolumesArgs{
//				Filters: []linode.GetVolumesFilter{
//					{
//						Name: "label",
//						Values: []string{
//							"test-volume",
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("volumes", filtered_volumes.Volumes)
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
func GetVolumes(ctx *pulumi.Context, args *GetVolumesArgs, opts ...pulumi.InvokeOption) (*GetVolumesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetVolumesResult
	err := ctx.Invoke("linode:index/getVolumes:getVolumes", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getVolumes.
type GetVolumesArgs struct {
	Filters []GetVolumesFilter `pulumi:"filters"`
	// The order in which results should be returned. (`asc`, `desc`; default `asc`)
	Order *string `pulumi:"order"`
	// The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
	OrderBy *string            `pulumi:"orderBy"`
	Volumes []GetVolumesVolume `pulumi:"volumes"`
}

// A collection of values returned by getVolumes.
type GetVolumesResult struct {
	Filters []GetVolumesFilter `pulumi:"filters"`
	// The unique ID of this Volume.
	Id      string             `pulumi:"id"`
	Order   *string            `pulumi:"order"`
	OrderBy *string            `pulumi:"orderBy"`
	Volumes []GetVolumesVolume `pulumi:"volumes"`
}

func GetVolumesOutput(ctx *pulumi.Context, args GetVolumesOutputArgs, opts ...pulumi.InvokeOption) GetVolumesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetVolumesResult, error) {
			args := v.(GetVolumesArgs)
			r, err := GetVolumes(ctx, &args, opts...)
			var s GetVolumesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetVolumesResultOutput)
}

// A collection of arguments for invoking getVolumes.
type GetVolumesOutputArgs struct {
	Filters GetVolumesFilterArrayInput `pulumi:"filters"`
	// The order in which results should be returned. (`asc`, `desc`; default `asc`)
	Order pulumi.StringPtrInput `pulumi:"order"`
	// The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
	OrderBy pulumi.StringPtrInput      `pulumi:"orderBy"`
	Volumes GetVolumesVolumeArrayInput `pulumi:"volumes"`
}

func (GetVolumesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetVolumesArgs)(nil)).Elem()
}

// A collection of values returned by getVolumes.
type GetVolumesResultOutput struct{ *pulumi.OutputState }

func (GetVolumesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetVolumesResult)(nil)).Elem()
}

func (o GetVolumesResultOutput) ToGetVolumesResultOutput() GetVolumesResultOutput {
	return o
}

func (o GetVolumesResultOutput) ToGetVolumesResultOutputWithContext(ctx context.Context) GetVolumesResultOutput {
	return o
}

func (o GetVolumesResultOutput) Filters() GetVolumesFilterArrayOutput {
	return o.ApplyT(func(v GetVolumesResult) []GetVolumesFilter { return v.Filters }).(GetVolumesFilterArrayOutput)
}

// The unique ID of this Volume.
func (o GetVolumesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetVolumesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetVolumesResultOutput) Order() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetVolumesResult) *string { return v.Order }).(pulumi.StringPtrOutput)
}

func (o GetVolumesResultOutput) OrderBy() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetVolumesResult) *string { return v.OrderBy }).(pulumi.StringPtrOutput)
}

func (o GetVolumesResultOutput) Volumes() GetVolumesVolumeArrayOutput {
	return o.ApplyT(func(v GetVolumesResult) []GetVolumesVolume { return v.Volumes }).(GetVolumesVolumeArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetVolumesResultOutput{})
}
