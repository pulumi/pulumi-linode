// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
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
// 	"github.com/pulumi/pulumi-linode/sdk/v3/go/linode"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := linode.LookupImage(ctx, &linode.LookupImageArgs{
// 			Id: "linode/debian8",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
// ## Attributes
//
// The Linode Image resource exports the following attributes:
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
	Created     string `pulumi:"created"`
	CreatedBy   string `pulumi:"createdBy"`
	Deprecated  bool   `pulumi:"deprecated"`
	Description string `pulumi:"description"`
	Expiry      string `pulumi:"expiry"`
	Id          string `pulumi:"id"`
	IsPublic    bool   `pulumi:"isPublic"`
	Label       string `pulumi:"label"`
	Size        int    `pulumi:"size"`
	Status      string `pulumi:"status"`
	Type        string `pulumi:"type"`
	Vendor      string `pulumi:"vendor"`
}
