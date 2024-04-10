// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-linode/sdk/v4/go/linode/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Linode Image resource.  This can be used to create, modify, and delete Linodes Images.  Linode Images are snapshots of a Linode Instance Disk which can then be used to provision more Linode Instances.  Images can be used across regions.
//
// For more information, see [Linode's documentation on Images](https://www.linode.com/docs/platform/disk-images/linode-images/) and the [Linode APIv4 docs](https://developers.linode.com/api/v4#operation/createImage).
//
// ## Example Usage
//
// Creating an image from an existing Linode Instance and deploying another instance with that image:
//
// <!--Start PulumiCodeChooser -->
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
//			foo, err := linode.NewInstance(ctx, "foo", &linode.InstanceArgs{
//				Type:     pulumi.String("g6-nanode-1"),
//				Region:   pulumi.String("us-central"),
//				Image:    pulumi.String("linode/ubuntu22.04"),
//				RootPass: pulumi.String("insecure-p4ssw0rd!!"),
//			})
//			if err != nil {
//				return err
//			}
//			bar, err := linode.NewImage(ctx, "bar", &linode.ImageArgs{
//				Label:       pulumi.String("foo-sda-image"),
//				Description: pulumi.String("Image taken from foo"),
//				DiskId: foo.Disks.ApplyT(func(disks []linode.InstanceDiskType) (*int, error) {
//					return &disks[0].Id, nil
//				}).(pulumi.IntPtrOutput),
//				LinodeId: foo.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = linode.NewInstance(ctx, "barBased", &linode.InstanceArgs{
//				Type:   foo.Type,
//				Region: pulumi.String("eu-west"),
//				Image:  bar.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
//
// Creating and uploading an image from a local file:
//
// ## Import
//
// Linodes Images can be imported using the Linode Image `id`, e.g.
//
// ```sh
// $ pulumi import linode:index/image:Image myimage 1234567
// ```
type Image struct {
	pulumi.CustomResourceState

	// The capabilities of this Image.
	Capabilities pulumi.StringArrayOutput `pulumi:"capabilities"`
	// Whether this image supports cloud-init.
	CloudInit pulumi.BoolOutput `pulumi:"cloudInit"`
	// When this Image was created.
	Created pulumi.StringOutput `pulumi:"created"`
	// The name of the User who created this Image.
	CreatedBy pulumi.StringOutput `pulumi:"createdBy"`
	// Whether or not this Image is deprecated. Will only be True for deprecated public Images.
	Deprecated pulumi.BoolOutput `pulumi:"deprecated"`
	// A detailed description of this Image.
	//
	// ***
	//
	// The following arguments apply to creating an image from an existing Linode Instance:
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The ID of the Linode Disk that this Image will be created from.
	DiskId pulumi.IntPtrOutput `pulumi:"diskId"`
	// Only Images created automatically (from a deleted Linode; type=automatic) will expire.
	Expiry pulumi.StringOutput `pulumi:"expiry"`
	// The MD5 hash of the file to be uploaded. This is used to trigger file updates.
	FileHash pulumi.StringOutput `pulumi:"fileHash"`
	// The path of the image file to be uploaded.
	FilePath pulumi.StringPtrOutput `pulumi:"filePath"`
	// True if the Image is public.
	IsPublic pulumi.BoolOutput `pulumi:"isPublic"`
	// A short description of the Image. Labels cannot contain special characters.
	Label pulumi.StringOutput `pulumi:"label"`
	// The ID of the Linode that this Image will be created from.
	//
	// ***
	//
	// > **NOTICE:** Uploading images is currently in beta. Ensure `LINODE_API_VERSION` is set to `v4beta` in order to use this functionality.
	//
	// The following arguments apply to uploading an image:
	LinodeId pulumi.IntPtrOutput `pulumi:"linodeId"`
	// The region of the image. See all regions [here](https://api.linode.com/v4/regions).
	Region pulumi.StringPtrOutput `pulumi:"region"`
	// The minimum size this Image needs to deploy. Size is in MB.
	Size pulumi.IntOutput `pulumi:"size"`
	// The current status of this Image.
	Status   pulumi.StringOutput    `pulumi:"status"`
	Timeouts ImageTimeoutsPtrOutput `pulumi:"timeouts"`
	// How the Image was created. 'Manual' Images can be created at any time. 'Automatic' images are created automatically from a deleted Linode.
	Type pulumi.StringOutput `pulumi:"type"`
	// The upstream distribution vendor. Nil for private Images.
	Vendor pulumi.StringOutput `pulumi:"vendor"`
}

// NewImage registers a new resource with the given unique name, arguments, and options.
func NewImage(ctx *pulumi.Context,
	name string, args *ImageArgs, opts ...pulumi.ResourceOption) (*Image, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Label == nil {
		return nil, errors.New("invalid value for required argument 'Label'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
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
	// The capabilities of this Image.
	Capabilities []string `pulumi:"capabilities"`
	// Whether this image supports cloud-init.
	CloudInit *bool `pulumi:"cloudInit"`
	// When this Image was created.
	Created *string `pulumi:"created"`
	// The name of the User who created this Image.
	CreatedBy *string `pulumi:"createdBy"`
	// Whether or not this Image is deprecated. Will only be True for deprecated public Images.
	Deprecated *bool `pulumi:"deprecated"`
	// A detailed description of this Image.
	//
	// ***
	//
	// The following arguments apply to creating an image from an existing Linode Instance:
	Description *string `pulumi:"description"`
	// The ID of the Linode Disk that this Image will be created from.
	DiskId *int `pulumi:"diskId"`
	// Only Images created automatically (from a deleted Linode; type=automatic) will expire.
	Expiry *string `pulumi:"expiry"`
	// The MD5 hash of the file to be uploaded. This is used to trigger file updates.
	FileHash *string `pulumi:"fileHash"`
	// The path of the image file to be uploaded.
	FilePath *string `pulumi:"filePath"`
	// True if the Image is public.
	IsPublic *bool `pulumi:"isPublic"`
	// A short description of the Image. Labels cannot contain special characters.
	Label *string `pulumi:"label"`
	// The ID of the Linode that this Image will be created from.
	//
	// ***
	//
	// > **NOTICE:** Uploading images is currently in beta. Ensure `LINODE_API_VERSION` is set to `v4beta` in order to use this functionality.
	//
	// The following arguments apply to uploading an image:
	LinodeId *int `pulumi:"linodeId"`
	// The region of the image. See all regions [here](https://api.linode.com/v4/regions).
	Region *string `pulumi:"region"`
	// The minimum size this Image needs to deploy. Size is in MB.
	Size *int `pulumi:"size"`
	// The current status of this Image.
	Status   *string        `pulumi:"status"`
	Timeouts *ImageTimeouts `pulumi:"timeouts"`
	// How the Image was created. 'Manual' Images can be created at any time. 'Automatic' images are created automatically from a deleted Linode.
	Type *string `pulumi:"type"`
	// The upstream distribution vendor. Nil for private Images.
	Vendor *string `pulumi:"vendor"`
}

type ImageState struct {
	// The capabilities of this Image.
	Capabilities pulumi.StringArrayInput
	// Whether this image supports cloud-init.
	CloudInit pulumi.BoolPtrInput
	// When this Image was created.
	Created pulumi.StringPtrInput
	// The name of the User who created this Image.
	CreatedBy pulumi.StringPtrInput
	// Whether or not this Image is deprecated. Will only be True for deprecated public Images.
	Deprecated pulumi.BoolPtrInput
	// A detailed description of this Image.
	//
	// ***
	//
	// The following arguments apply to creating an image from an existing Linode Instance:
	Description pulumi.StringPtrInput
	// The ID of the Linode Disk that this Image will be created from.
	DiskId pulumi.IntPtrInput
	// Only Images created automatically (from a deleted Linode; type=automatic) will expire.
	Expiry pulumi.StringPtrInput
	// The MD5 hash of the file to be uploaded. This is used to trigger file updates.
	FileHash pulumi.StringPtrInput
	// The path of the image file to be uploaded.
	FilePath pulumi.StringPtrInput
	// True if the Image is public.
	IsPublic pulumi.BoolPtrInput
	// A short description of the Image. Labels cannot contain special characters.
	Label pulumi.StringPtrInput
	// The ID of the Linode that this Image will be created from.
	//
	// ***
	//
	// > **NOTICE:** Uploading images is currently in beta. Ensure `LINODE_API_VERSION` is set to `v4beta` in order to use this functionality.
	//
	// The following arguments apply to uploading an image:
	LinodeId pulumi.IntPtrInput
	// The region of the image. See all regions [here](https://api.linode.com/v4/regions).
	Region pulumi.StringPtrInput
	// The minimum size this Image needs to deploy. Size is in MB.
	Size pulumi.IntPtrInput
	// The current status of this Image.
	Status   pulumi.StringPtrInput
	Timeouts ImageTimeoutsPtrInput
	// How the Image was created. 'Manual' Images can be created at any time. 'Automatic' images are created automatically from a deleted Linode.
	Type pulumi.StringPtrInput
	// The upstream distribution vendor. Nil for private Images.
	Vendor pulumi.StringPtrInput
}

func (ImageState) ElementType() reflect.Type {
	return reflect.TypeOf((*imageState)(nil)).Elem()
}

type imageArgs struct {
	// Whether this image supports cloud-init.
	CloudInit *bool `pulumi:"cloudInit"`
	// A detailed description of this Image.
	//
	// ***
	//
	// The following arguments apply to creating an image from an existing Linode Instance:
	Description *string `pulumi:"description"`
	// The ID of the Linode Disk that this Image will be created from.
	DiskId *int `pulumi:"diskId"`
	// The MD5 hash of the file to be uploaded. This is used to trigger file updates.
	FileHash *string `pulumi:"fileHash"`
	// The path of the image file to be uploaded.
	FilePath *string `pulumi:"filePath"`
	// A short description of the Image. Labels cannot contain special characters.
	Label string `pulumi:"label"`
	// The ID of the Linode that this Image will be created from.
	//
	// ***
	//
	// > **NOTICE:** Uploading images is currently in beta. Ensure `LINODE_API_VERSION` is set to `v4beta` in order to use this functionality.
	//
	// The following arguments apply to uploading an image:
	LinodeId *int `pulumi:"linodeId"`
	// The region of the image. See all regions [here](https://api.linode.com/v4/regions).
	Region   *string        `pulumi:"region"`
	Timeouts *ImageTimeouts `pulumi:"timeouts"`
}

// The set of arguments for constructing a Image resource.
type ImageArgs struct {
	// Whether this image supports cloud-init.
	CloudInit pulumi.BoolPtrInput
	// A detailed description of this Image.
	//
	// ***
	//
	// The following arguments apply to creating an image from an existing Linode Instance:
	Description pulumi.StringPtrInput
	// The ID of the Linode Disk that this Image will be created from.
	DiskId pulumi.IntPtrInput
	// The MD5 hash of the file to be uploaded. This is used to trigger file updates.
	FileHash pulumi.StringPtrInput
	// The path of the image file to be uploaded.
	FilePath pulumi.StringPtrInput
	// A short description of the Image. Labels cannot contain special characters.
	Label pulumi.StringInput
	// The ID of the Linode that this Image will be created from.
	//
	// ***
	//
	// > **NOTICE:** Uploading images is currently in beta. Ensure `LINODE_API_VERSION` is set to `v4beta` in order to use this functionality.
	//
	// The following arguments apply to uploading an image:
	LinodeId pulumi.IntPtrInput
	// The region of the image. See all regions [here](https://api.linode.com/v4/regions).
	Region   pulumi.StringPtrInput
	Timeouts ImageTimeoutsPtrInput
}

func (ImageArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*imageArgs)(nil)).Elem()
}

type ImageInput interface {
	pulumi.Input

	ToImageOutput() ImageOutput
	ToImageOutputWithContext(ctx context.Context) ImageOutput
}

func (*Image) ElementType() reflect.Type {
	return reflect.TypeOf((**Image)(nil)).Elem()
}

func (i *Image) ToImageOutput() ImageOutput {
	return i.ToImageOutputWithContext(context.Background())
}

func (i *Image) ToImageOutputWithContext(ctx context.Context) ImageOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ImageOutput)
}

// ImageArrayInput is an input type that accepts ImageArray and ImageArrayOutput values.
// You can construct a concrete instance of `ImageArrayInput` via:
//
//	ImageArray{ ImageArgs{...} }
type ImageArrayInput interface {
	pulumi.Input

	ToImageArrayOutput() ImageArrayOutput
	ToImageArrayOutputWithContext(context.Context) ImageArrayOutput
}

type ImageArray []ImageInput

func (ImageArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Image)(nil)).Elem()
}

func (i ImageArray) ToImageArrayOutput() ImageArrayOutput {
	return i.ToImageArrayOutputWithContext(context.Background())
}

func (i ImageArray) ToImageArrayOutputWithContext(ctx context.Context) ImageArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ImageArrayOutput)
}

// ImageMapInput is an input type that accepts ImageMap and ImageMapOutput values.
// You can construct a concrete instance of `ImageMapInput` via:
//
//	ImageMap{ "key": ImageArgs{...} }
type ImageMapInput interface {
	pulumi.Input

	ToImageMapOutput() ImageMapOutput
	ToImageMapOutputWithContext(context.Context) ImageMapOutput
}

type ImageMap map[string]ImageInput

func (ImageMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Image)(nil)).Elem()
}

func (i ImageMap) ToImageMapOutput() ImageMapOutput {
	return i.ToImageMapOutputWithContext(context.Background())
}

func (i ImageMap) ToImageMapOutputWithContext(ctx context.Context) ImageMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ImageMapOutput)
}

type ImageOutput struct{ *pulumi.OutputState }

func (ImageOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Image)(nil)).Elem()
}

func (o ImageOutput) ToImageOutput() ImageOutput {
	return o
}

func (o ImageOutput) ToImageOutputWithContext(ctx context.Context) ImageOutput {
	return o
}

// The capabilities of this Image.
func (o ImageOutput) Capabilities() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Image) pulumi.StringArrayOutput { return v.Capabilities }).(pulumi.StringArrayOutput)
}

// Whether this image supports cloud-init.
func (o ImageOutput) CloudInit() pulumi.BoolOutput {
	return o.ApplyT(func(v *Image) pulumi.BoolOutput { return v.CloudInit }).(pulumi.BoolOutput)
}

// When this Image was created.
func (o ImageOutput) Created() pulumi.StringOutput {
	return o.ApplyT(func(v *Image) pulumi.StringOutput { return v.Created }).(pulumi.StringOutput)
}

// The name of the User who created this Image.
func (o ImageOutput) CreatedBy() pulumi.StringOutput {
	return o.ApplyT(func(v *Image) pulumi.StringOutput { return v.CreatedBy }).(pulumi.StringOutput)
}

// Whether or not this Image is deprecated. Will only be True for deprecated public Images.
func (o ImageOutput) Deprecated() pulumi.BoolOutput {
	return o.ApplyT(func(v *Image) pulumi.BoolOutput { return v.Deprecated }).(pulumi.BoolOutput)
}

// A detailed description of this Image.
//
// ***
//
// The following arguments apply to creating an image from an existing Linode Instance:
func (o ImageOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Image) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The ID of the Linode Disk that this Image will be created from.
func (o ImageOutput) DiskId() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Image) pulumi.IntPtrOutput { return v.DiskId }).(pulumi.IntPtrOutput)
}

// Only Images created automatically (from a deleted Linode; type=automatic) will expire.
func (o ImageOutput) Expiry() pulumi.StringOutput {
	return o.ApplyT(func(v *Image) pulumi.StringOutput { return v.Expiry }).(pulumi.StringOutput)
}

// The MD5 hash of the file to be uploaded. This is used to trigger file updates.
func (o ImageOutput) FileHash() pulumi.StringOutput {
	return o.ApplyT(func(v *Image) pulumi.StringOutput { return v.FileHash }).(pulumi.StringOutput)
}

// The path of the image file to be uploaded.
func (o ImageOutput) FilePath() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Image) pulumi.StringPtrOutput { return v.FilePath }).(pulumi.StringPtrOutput)
}

// True if the Image is public.
func (o ImageOutput) IsPublic() pulumi.BoolOutput {
	return o.ApplyT(func(v *Image) pulumi.BoolOutput { return v.IsPublic }).(pulumi.BoolOutput)
}

// A short description of the Image. Labels cannot contain special characters.
func (o ImageOutput) Label() pulumi.StringOutput {
	return o.ApplyT(func(v *Image) pulumi.StringOutput { return v.Label }).(pulumi.StringOutput)
}

// The ID of the Linode that this Image will be created from.
//
// ***
//
// > **NOTICE:** Uploading images is currently in beta. Ensure `LINODE_API_VERSION` is set to `v4beta` in order to use this functionality.
//
// The following arguments apply to uploading an image:
func (o ImageOutput) LinodeId() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Image) pulumi.IntPtrOutput { return v.LinodeId }).(pulumi.IntPtrOutput)
}

// The region of the image. See all regions [here](https://api.linode.com/v4/regions).
func (o ImageOutput) Region() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Image) pulumi.StringPtrOutput { return v.Region }).(pulumi.StringPtrOutput)
}

// The minimum size this Image needs to deploy. Size is in MB.
func (o ImageOutput) Size() pulumi.IntOutput {
	return o.ApplyT(func(v *Image) pulumi.IntOutput { return v.Size }).(pulumi.IntOutput)
}

// The current status of this Image.
func (o ImageOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *Image) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

func (o ImageOutput) Timeouts() ImageTimeoutsPtrOutput {
	return o.ApplyT(func(v *Image) ImageTimeoutsPtrOutput { return v.Timeouts }).(ImageTimeoutsPtrOutput)
}

// How the Image was created. 'Manual' Images can be created at any time. 'Automatic' images are created automatically from a deleted Linode.
func (o ImageOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *Image) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

// The upstream distribution vendor. Nil for private Images.
func (o ImageOutput) Vendor() pulumi.StringOutput {
	return o.ApplyT(func(v *Image) pulumi.StringOutput { return v.Vendor }).(pulumi.StringOutput)
}

type ImageArrayOutput struct{ *pulumi.OutputState }

func (ImageArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Image)(nil)).Elem()
}

func (o ImageArrayOutput) ToImageArrayOutput() ImageArrayOutput {
	return o
}

func (o ImageArrayOutput) ToImageArrayOutputWithContext(ctx context.Context) ImageArrayOutput {
	return o
}

func (o ImageArrayOutput) Index(i pulumi.IntInput) ImageOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Image {
		return vs[0].([]*Image)[vs[1].(int)]
	}).(ImageOutput)
}

type ImageMapOutput struct{ *pulumi.OutputState }

func (ImageMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Image)(nil)).Elem()
}

func (o ImageMapOutput) ToImageMapOutput() ImageMapOutput {
	return o
}

func (o ImageMapOutput) ToImageMapOutputWithContext(ctx context.Context) ImageMapOutput {
	return o
}

func (o ImageMapOutput) MapIndex(k pulumi.StringInput) ImageOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Image {
		return vs[0].(map[string]*Image)[vs[1].(string)]
	}).(ImageOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ImageInput)(nil)).Elem(), &Image{})
	pulumi.RegisterInputType(reflect.TypeOf((*ImageArrayInput)(nil)).Elem(), ImageArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ImageMapInput)(nil)).Elem(), ImageMap{})
	pulumi.RegisterOutputType(ImageOutput{})
	pulumi.RegisterOutputType(ImageArrayOutput{})
	pulumi.RegisterOutputType(ImageMapOutput{})
}
