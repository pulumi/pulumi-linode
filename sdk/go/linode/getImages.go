// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides information about Linode images that match a set of filters.
//
// ## Example Usage
//
// Get information about all Linode images with a certain label and visibility:
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
// 		_, err := linode.GetImages(ctx, &GetImagesArgs{
// 			Filters: []GetImagesFilter{
// 				GetImagesFilter{
// 					Name: "label",
// 					Values: []string{
// 						"Debian 8",
// 					},
// 				},
// 				GetImagesFilter{
// 					Name: "is_public",
// 					Values: []string{
// 						"true",
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
// Get information about all Linode images associated with the current token:
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
// 		_, err := linode.GetImages(ctx, nil, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
// ## Attributes
//
// Each Linode image will be stored in the `images` attribute and will export the following attributes:
//
// * `id` - The unique ID of this Image.  The ID of private images begin with `private/` followed by the numeric identifier of the private image, for example `private/12345`.
//
// * `label` - A short description of the Image.
//
// * `created` - When this Image was created.
//
// * `createdBy` - The name of the User who created this Image, or "linode" for official Images.
//
// * `deprecated` - Whether or not this Image is deprecated. Will only be true for deprecated public Images.
//
// * `description` - A detailed description of this Image.
//
// * `isPublic` - True if the Image is public.
//
// * `size` - The minimum size this Image needs to deploy. Size is in MB. example: 2500
//
// * `status` - The current status of this image. (`creating`, `pendingUpload`, `available`)
//
// * `type` - How the Image was created. Manual Images can be created at any time. "Automatic" Images are created automatically from a deleted Linode. (`manual`, `automatic`)
//
// * `vendor` - The upstream distribution vendor. `None` for private Images.
//
// ## Filterable Fields
//
// * `deprecated`
//
// * `isPublic`
//
// * `label`
//
// * `size`
//
// * `vendor`
func GetImages(ctx *pulumi.Context, args *GetImagesArgs, opts ...pulumi.InvokeOption) (*GetImagesResult, error) {
	var rv GetImagesResult
	err := ctx.Invoke("linode:index/getImages:getImages", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getImages.
type GetImagesArgs struct {
	Filters []GetImagesFilter `pulumi:"filters"`
	// If true, only the latest image will be returned. Images without a valid `created` field are not included in the result.
	Latest *bool `pulumi:"latest"`
	// The order in which results should be returned. (`asc`, `desc`; default `asc`)
	Order *string `pulumi:"order"`
	// The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
	OrderBy *string `pulumi:"orderBy"`
}

// A collection of values returned by getImages.
type GetImagesResult struct {
	Filters []GetImagesFilter `pulumi:"filters"`
	// The provider-assigned unique ID for this managed resource.
	Id      string           `pulumi:"id"`
	Images  []GetImagesImage `pulumi:"images"`
	Latest  *bool            `pulumi:"latest"`
	Order   *string          `pulumi:"order"`
	OrderBy *string          `pulumi:"orderBy"`
}

func GetImagesOutput(ctx *pulumi.Context, args GetImagesOutputArgs, opts ...pulumi.InvokeOption) GetImagesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetImagesResult, error) {
			args := v.(GetImagesArgs)
			r, err := GetImages(ctx, &args, opts...)
			return *r, err
		}).(GetImagesResultOutput)
}

// A collection of arguments for invoking getImages.
type GetImagesOutputArgs struct {
	Filters GetImagesFilterArrayInput `pulumi:"filters"`
	// If true, only the latest image will be returned. Images without a valid `created` field are not included in the result.
	Latest pulumi.BoolPtrInput `pulumi:"latest"`
	// The order in which results should be returned. (`asc`, `desc`; default `asc`)
	Order pulumi.StringPtrInput `pulumi:"order"`
	// The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
	OrderBy pulumi.StringPtrInput `pulumi:"orderBy"`
}

func (GetImagesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetImagesArgs)(nil)).Elem()
}

// A collection of values returned by getImages.
type GetImagesResultOutput struct{ *pulumi.OutputState }

func (GetImagesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetImagesResult)(nil)).Elem()
}

func (o GetImagesResultOutput) ToGetImagesResultOutput() GetImagesResultOutput {
	return o
}

func (o GetImagesResultOutput) ToGetImagesResultOutputWithContext(ctx context.Context) GetImagesResultOutput {
	return o
}

func (o GetImagesResultOutput) Filters() GetImagesFilterArrayOutput {
	return o.ApplyT(func(v GetImagesResult) []GetImagesFilter { return v.Filters }).(GetImagesFilterArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetImagesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetImagesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetImagesResultOutput) Images() GetImagesImageArrayOutput {
	return o.ApplyT(func(v GetImagesResult) []GetImagesImage { return v.Images }).(GetImagesImageArrayOutput)
}

func (o GetImagesResultOutput) Latest() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetImagesResult) *bool { return v.Latest }).(pulumi.BoolPtrOutput)
}

func (o GetImagesResultOutput) Order() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetImagesResult) *string { return v.Order }).(pulumi.StringPtrOutput)
}

func (o GetImagesResultOutput) OrderBy() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetImagesResult) *string { return v.OrderBy }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetImagesResultOutput{})
}
