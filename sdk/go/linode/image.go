// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides a Linode Image resource.  This can be used to create, modify, and delete Linodes Images.  Linode Images are snapshots of a Linode Instance Disk which can then be used to provision more Linode Instances.  Images can be used across regions.
//
// For more information, see [Linode's documentation on Images](https://www.linode.com/docs/platform/disk-images/linode-images/) and the [Linode APIv4 docs](https://developers.linode.com/api/v4#operation/createImage).
//
// ## Example Usage
//
// The following example shows how one might use this resource to create an Image from a Linode Instance Disk and then deploy a new Linode Instance in another region using that Image.
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-linode/sdk/v2/go/linode"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		foo, err := linode.NewInstance(ctx, "foo", &linode.InstanceArgs{
// 			Region: pulumi.String("us-central"),
// 			Type:   pulumi.String("g6-nanode-1"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		bar, err := linode.NewImage(ctx, "bar", &linode.ImageArgs{
// 			Description: pulumi.String("Image taken from foo"),
// 			DiskId: pulumi.Int(foo.Disks.ApplyT(func(disks []linode.InstanceDisk) (int, error) {
// 				return disks[0].Id, nil
// 			}).(pulumi.IntOutput)),
// 			Label:    pulumi.String("foo-sda-image"),
// 			LinodeId: foo.ID(),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = linode.NewInstance(ctx, "barBased", &linode.InstanceArgs{
// 			Image:  bar.ID(),
// 			Region: pulumi.String("eu-west"),
// 			Type:   foo.Type,
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
// ## Attributes
//
// This resource exports the following attributes:
//
// * `id` - The unique ID of this Image.  The ID of private images begin with `private/` followed by the numeric identifier of the private image, for example `private/12345`.
//
// * `created` - When this Image was created.
//
// * `createdBy` - The name of the User who created this Image.
//
// * `deprecated` - Whether or not this Image is deprecated. Will only be True for deprecated public Images.
//
// * `isPublic` - True if the Image is public.
//
// * `size` - The minimum size this Image needs to deploy. Size is in MB.
//
// * `type` - How the Image was created. 'Manual' Images can be created at any time. 'Automatic' images are created automatically from a deleted Linode.
//
// * `expiry` - Only Images created automatically (from a deleted Linode; type=automatic) will expire.
//
// * `vendor` - The upstream distribution vendor. Nil for private Images.
//
// ## Import
//
// Linodes Images can be imported using the Linode Image `id`, e.g.
//
// ```sh
//  $ pulumi import linode:index/image:Image myimage 1234567
// ```
type Image struct {
	pulumi.CustomResourceState

	// When this Image was created.
	Created pulumi.StringOutput `pulumi:"created"`
	// The name of the User who created this Image.
	CreatedBy pulumi.StringOutput `pulumi:"createdBy"`
	// Whether or not this Image is deprecated. Will only be True for deprecated public Images.
	Deprecated pulumi.BoolOutput `pulumi:"deprecated"`
	// A detailed description of this Image.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The ID of the Linode Disk that this Image will be created from.
	DiskId pulumi.IntOutput `pulumi:"diskId"`
	// Only Images created automatically (from a deleted Linode; type=automatic) will expire.
	Expiry pulumi.StringOutput `pulumi:"expiry"`
	// True if the Image is public.
	IsPublic pulumi.BoolOutput `pulumi:"isPublic"`
	// A short description of the Image. Labels cannot contain special characters.
	Label pulumi.StringOutput `pulumi:"label"`
	// The ID of the Linode that this Image will be created from.
	LinodeId pulumi.IntOutput `pulumi:"linodeId"`
	// The minimum size this Image needs to deploy. Size is in MB.
	Size pulumi.IntOutput `pulumi:"size"`
	// How the Image was created. 'Manual' Images can be created at any time. 'Automatic' images are created automatically from
	// a deleted Linode.
	Type pulumi.StringOutput `pulumi:"type"`
	// The upstream distribution vendor. Nil for private Images.
	Vendor pulumi.StringOutput `pulumi:"vendor"`
}

// NewImage registers a new resource with the given unique name, arguments, and options.
func NewImage(ctx *pulumi.Context,
	name string, args *ImageArgs, opts ...pulumi.ResourceOption) (*Image, error) {
	if args == nil || args.DiskId == nil {
		return nil, errors.New("missing required argument 'DiskId'")
	}
	if args == nil || args.Label == nil {
		return nil, errors.New("missing required argument 'Label'")
	}
	if args == nil || args.LinodeId == nil {
		return nil, errors.New("missing required argument 'LinodeId'")
	}
	if args == nil {
		args = &ImageArgs{}
	}
	var resource Image
	err := ctx.RegisterResource("linode:index/image:Image", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetImage gets an existing Image resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetImage(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ImageState, opts ...pulumi.ResourceOption) (*Image, error) {
	var resource Image
	err := ctx.ReadResource("linode:index/image:Image", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Image resources.
type imageState struct {
	// When this Image was created.
	Created *string `pulumi:"created"`
	// The name of the User who created this Image.
	CreatedBy *string `pulumi:"createdBy"`
	// Whether or not this Image is deprecated. Will only be True for deprecated public Images.
	Deprecated *bool `pulumi:"deprecated"`
	// A detailed description of this Image.
	Description *string `pulumi:"description"`
	// The ID of the Linode Disk that this Image will be created from.
	DiskId *int `pulumi:"diskId"`
	// Only Images created automatically (from a deleted Linode; type=automatic) will expire.
	Expiry *string `pulumi:"expiry"`
	// True if the Image is public.
	IsPublic *bool `pulumi:"isPublic"`
	// A short description of the Image. Labels cannot contain special characters.
	Label *string `pulumi:"label"`
	// The ID of the Linode that this Image will be created from.
	LinodeId *int `pulumi:"linodeId"`
	// The minimum size this Image needs to deploy. Size is in MB.
	Size *int `pulumi:"size"`
	// How the Image was created. 'Manual' Images can be created at any time. 'Automatic' images are created automatically from
	// a deleted Linode.
	Type *string `pulumi:"type"`
	// The upstream distribution vendor. Nil for private Images.
	Vendor *string `pulumi:"vendor"`
}

type ImageState struct {
	// When this Image was created.
	Created pulumi.StringPtrInput
	// The name of the User who created this Image.
	CreatedBy pulumi.StringPtrInput
	// Whether or not this Image is deprecated. Will only be True for deprecated public Images.
	Deprecated pulumi.BoolPtrInput
	// A detailed description of this Image.
	Description pulumi.StringPtrInput
	// The ID of the Linode Disk that this Image will be created from.
	DiskId pulumi.IntPtrInput
	// Only Images created automatically (from a deleted Linode; type=automatic) will expire.
	Expiry pulumi.StringPtrInput
	// True if the Image is public.
	IsPublic pulumi.BoolPtrInput
	// A short description of the Image. Labels cannot contain special characters.
	Label pulumi.StringPtrInput
	// The ID of the Linode that this Image will be created from.
	LinodeId pulumi.IntPtrInput
	// The minimum size this Image needs to deploy. Size is in MB.
	Size pulumi.IntPtrInput
	// How the Image was created. 'Manual' Images can be created at any time. 'Automatic' images are created automatically from
	// a deleted Linode.
	Type pulumi.StringPtrInput
	// The upstream distribution vendor. Nil for private Images.
	Vendor pulumi.StringPtrInput
}

func (ImageState) ElementType() reflect.Type {
	return reflect.TypeOf((*imageState)(nil)).Elem()
}

type imageArgs struct {
	// A detailed description of this Image.
	Description *string `pulumi:"description"`
	// The ID of the Linode Disk that this Image will be created from.
	DiskId int `pulumi:"diskId"`
	// A short description of the Image. Labels cannot contain special characters.
	Label string `pulumi:"label"`
	// The ID of the Linode that this Image will be created from.
	LinodeId int `pulumi:"linodeId"`
}

// The set of arguments for constructing a Image resource.
type ImageArgs struct {
	// A detailed description of this Image.
	Description pulumi.StringPtrInput
	// The ID of the Linode Disk that this Image will be created from.
	DiskId pulumi.IntInput
	// A short description of the Image. Labels cannot contain special characters.
	Label pulumi.StringInput
	// The ID of the Linode that this Image will be created from.
	LinodeId pulumi.IntInput
}

func (ImageArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*imageArgs)(nil)).Elem()
}

type ImageInput interface {
	pulumi.Input

	ToImageOutput() ImageOutput
	ToImageOutputWithContext(ctx context.Context) ImageOutput
}

func (Image) ElementType() reflect.Type {
	return reflect.TypeOf((*Image)(nil)).Elem()
}

func (i Image) ToImageOutput() ImageOutput {
	return i.ToImageOutputWithContext(context.Background())
}

func (i Image) ToImageOutputWithContext(ctx context.Context) ImageOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ImageOutput)
}

type ImageOutput struct {
	*pulumi.OutputState
}

func (ImageOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ImageOutput)(nil)).Elem()
}

func (o ImageOutput) ToImageOutput() ImageOutput {
	return o
}

func (o ImageOutput) ToImageOutputWithContext(ctx context.Context) ImageOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(ImageOutput{})
}
