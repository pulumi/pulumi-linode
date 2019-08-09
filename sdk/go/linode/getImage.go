// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Provides information about a Linode image
// 
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
// * `type` - How the Image was created. Manual Images can be created at any time. image"Automatic" Images are created automatically from a deleted Linode.
// 
// * `vendor` - The upstream distribution vendor. `None` for private Images. 
//
// > This content is derived from https://github.com/terraform-providers/terraform-provider-linode/blob/master/website/docs/d/image.html.markdown.
func LookupImage(ctx *pulumi.Context, args *GetImageArgs) (*GetImageResult, error) {
	inputs := make(map[string]interface{})
	if args != nil {
		inputs["id"] = args.Id
	}
	outputs, err := ctx.Invoke("linode:index/getImage:getImage", inputs)
	if err != nil {
		return nil, err
	}
	return &GetImageResult{
		Created: outputs["created"],
		CreatedBy: outputs["createdBy"],
		Deprecated: outputs["deprecated"],
		Description: outputs["description"],
		Expiry: outputs["expiry"],
		Id: outputs["id"],
		IsPublic: outputs["isPublic"],
		Label: outputs["label"],
		Size: outputs["size"],
		Type: outputs["type"],
		Vendor: outputs["vendor"],
	}, nil
}

// A collection of arguments for invoking getImage.
type GetImageArgs struct {
	// The unique ID of this Image.  The ID of private images begin with `private/` followed by the numeric identifier of the private image, for example `private/12345`.
	Id interface{}
}

// A collection of values returned by getImage.
type GetImageResult struct {
	Created interface{}
	CreatedBy interface{}
	Deprecated interface{}
	Description interface{}
	Expiry interface{}
	Id interface{}
	IsPublic interface{}
	Label interface{}
	Size interface{}
	Type interface{}
	Vendor interface{}
}
