// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides information about a Linode image
//
// ## Example Usage
//
// The following example shows how one might use this data source to access information about a Linode image.
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
//			_, err := linode.LookupImage(ctx, &linode.LookupImageArgs{
//				Id: "linode/debian8",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupImage(ctx *pulumi.Context, args *LookupImageArgs, opts ...pulumi.InvokeOption) (*LookupImageResult, error) {
	var rv LookupImageResult
	err := ctx.Invoke("linode:index/getImage:getImage", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getImage.
type LookupImageArgs struct {
	// The unique ID of this Image.  The ID of private images begin with `private/` followed by the numeric identifier of the private image, for example `private/12345`.
	Id string `pulumi:"id"`
}

// A collection of values returned by getImage.
type LookupImageResult struct {
	// When this Image was created.
	Created string `pulumi:"created"`
	// The name of the User who created this Image, or "linode" for official Images.
	CreatedBy string `pulumi:"createdBy"`
	// Whether or not this Image is deprecated. Will only be true for deprecated public Images.
	Deprecated bool `pulumi:"deprecated"`
	// A detailed description of this Image.
	Description string `pulumi:"description"`
	Expiry      string `pulumi:"expiry"`
	Id          string `pulumi:"id"`
	// True if the Image is public.
	IsPublic bool `pulumi:"isPublic"`
	// A short description of the Image.
	Label string `pulumi:"label"`
	// The minimum size this Image needs to deploy. Size is in MB. example: 2500
	Size int `pulumi:"size"`
	// The current status of this image. (`creating`, `pendingUpload`, `available`)
	Status string `pulumi:"status"`
	// How the Image was created. Manual Images can be created at any time. "Automatic" Images are created automatically from a deleted Linode. (`manual`, `automatic`)
	Type string `pulumi:"type"`
	// The upstream distribution vendor. `None` for private Images.
	Vendor string `pulumi:"vendor"`
}

func LookupImageOutput(ctx *pulumi.Context, args LookupImageOutputArgs, opts ...pulumi.InvokeOption) LookupImageResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupImageResult, error) {
			args := v.(LookupImageArgs)
			r, err := LookupImage(ctx, &args, opts...)
			var s LookupImageResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupImageResultOutput)
}

// A collection of arguments for invoking getImage.
type LookupImageOutputArgs struct {
	// The unique ID of this Image.  The ID of private images begin with `private/` followed by the numeric identifier of the private image, for example `private/12345`.
	Id pulumi.StringInput `pulumi:"id"`
}

func (LookupImageOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupImageArgs)(nil)).Elem()
}

// A collection of values returned by getImage.
type LookupImageResultOutput struct{ *pulumi.OutputState }

func (LookupImageResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupImageResult)(nil)).Elem()
}

func (o LookupImageResultOutput) ToLookupImageResultOutput() LookupImageResultOutput {
	return o
}

func (o LookupImageResultOutput) ToLookupImageResultOutputWithContext(ctx context.Context) LookupImageResultOutput {
	return o
}

// When this Image was created.
func (o LookupImageResultOutput) Created() pulumi.StringOutput {
	return o.ApplyT(func(v LookupImageResult) string { return v.Created }).(pulumi.StringOutput)
}

// The name of the User who created this Image, or "linode" for official Images.
func (o LookupImageResultOutput) CreatedBy() pulumi.StringOutput {
	return o.ApplyT(func(v LookupImageResult) string { return v.CreatedBy }).(pulumi.StringOutput)
}

// Whether or not this Image is deprecated. Will only be true for deprecated public Images.
func (o LookupImageResultOutput) Deprecated() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupImageResult) bool { return v.Deprecated }).(pulumi.BoolOutput)
}

// A detailed description of this Image.
func (o LookupImageResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupImageResult) string { return v.Description }).(pulumi.StringOutput)
}

func (o LookupImageResultOutput) Expiry() pulumi.StringOutput {
	return o.ApplyT(func(v LookupImageResult) string { return v.Expiry }).(pulumi.StringOutput)
}

func (o LookupImageResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupImageResult) string { return v.Id }).(pulumi.StringOutput)
}

// True if the Image is public.
func (o LookupImageResultOutput) IsPublic() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupImageResult) bool { return v.IsPublic }).(pulumi.BoolOutput)
}

// A short description of the Image.
func (o LookupImageResultOutput) Label() pulumi.StringOutput {
	return o.ApplyT(func(v LookupImageResult) string { return v.Label }).(pulumi.StringOutput)
}

// The minimum size this Image needs to deploy. Size is in MB. example: 2500
func (o LookupImageResultOutput) Size() pulumi.IntOutput {
	return o.ApplyT(func(v LookupImageResult) int { return v.Size }).(pulumi.IntOutput)
}

// The current status of this image. (`creating`, `pendingUpload`, `available`)
func (o LookupImageResultOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v LookupImageResult) string { return v.Status }).(pulumi.StringOutput)
}

// How the Image was created. Manual Images can be created at any time. "Automatic" Images are created automatically from a deleted Linode. (`manual`, `automatic`)
func (o LookupImageResultOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v LookupImageResult) string { return v.Type }).(pulumi.StringOutput)
}

// The upstream distribution vendor. `None` for private Images.
func (o LookupImageResultOutput) Vendor() pulumi.StringOutput {
	return o.ApplyT(func(v LookupImageResult) string { return v.Vendor }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupImageResultOutput{})
}
