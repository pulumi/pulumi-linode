// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

// nolint: lll
package linode

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides a Linode Volume resource.  This can be used to create, modify, and delete Linodes Block Storage Volumes.  Block Storage Volumes are removable storage disks that persist outside the life-cycle of Linode Instances. These volumes can be attached to and detached from Linode instances throughout a region.
//
// For more information, see [How to Use Block Storage with Your Linode](https://www.linode.com/docs/platform/block-storage/how-to-use-block-storage-with-your-linode/) and the [Linode APIv4 docs](https://developers.linode.com/api/v4#operation/createVolume).
//
//
// ## Attributes
//
// This resource exports the following attributes:
//
// * `status` - The label of the Linode Volume.
//
// * `filesystemPath` - The full filesystem path for the Volume based on the Volume's label. The path is "/dev/disk/by-id/scsi-0Linode_Volume_" + the Volume label
//
// > This content is derived from https://github.com/terraform-providers/terraform-provider-linode/blob/master/website/docs/r/volume.html.md.
type Volume struct {
	pulumi.CustomResourceState

	// The full filesystem path for the Volume based on the Volume's label. Path is /dev/disk/by-id/scsi-0Linode_Volume_ +
	// Volume label.
	FilesystemPath pulumi.StringOutput `pulumi:"filesystemPath"`
	// The label of the Linode Volume
	Label pulumi.StringOutput `pulumi:"label"`
	// The ID of a Linode Instance where the the Volume should be attached.
	LinodeId pulumi.IntOutput `pulumi:"linodeId"`
	// The region where this volume will be deployed.  Examples are `"us-east"`, `"us-west"`, `"ap-south"`, etc.  *Changing `region` forces the creation of a new Linode Volume.*.
	Region pulumi.StringOutput `pulumi:"region"`
	// Size of the Volume in GB.
	Size pulumi.IntOutput `pulumi:"size"`
	// The status of the volume, indicating the current readiness state.
	Status pulumi.StringOutput `pulumi:"status"`
	// A list of tags applied to this object. Tags are for organizational purposes only.
	Tags pulumi.StringArrayOutput `pulumi:"tags"`
}

// NewVolume registers a new resource with the given unique name, arguments, and options.
func NewVolume(ctx *pulumi.Context,
	name string, args *VolumeArgs, opts ...pulumi.ResourceOption) (*Volume, error) {
	if args == nil || args.Label == nil {
		return nil, errors.New("missing required argument 'Label'")
	}
	if args == nil || args.Region == nil {
		return nil, errors.New("missing required argument 'Region'")
	}
	if args == nil {
		args = &VolumeArgs{}
	}
	var resource Volume
	err := ctx.RegisterResource("linode:index/volume:Volume", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetVolume gets an existing Volume resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetVolume(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *VolumeState, opts ...pulumi.ResourceOption) (*Volume, error) {
	var resource Volume
	err := ctx.ReadResource("linode:index/volume:Volume", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Volume resources.
type volumeState struct {
	// The full filesystem path for the Volume based on the Volume's label. Path is /dev/disk/by-id/scsi-0Linode_Volume_ +
	// Volume label.
	FilesystemPath *string `pulumi:"filesystemPath"`
	// The label of the Linode Volume
	Label *string `pulumi:"label"`
	// The ID of a Linode Instance where the the Volume should be attached.
	LinodeId *int `pulumi:"linodeId"`
	// The region where this volume will be deployed.  Examples are `"us-east"`, `"us-west"`, `"ap-south"`, etc.  *Changing `region` forces the creation of a new Linode Volume.*.
	Region *string `pulumi:"region"`
	// Size of the Volume in GB.
	Size *int `pulumi:"size"`
	// The status of the volume, indicating the current readiness state.
	Status *string `pulumi:"status"`
	// A list of tags applied to this object. Tags are for organizational purposes only.
	Tags []string `pulumi:"tags"`
}

type VolumeState struct {
	// The full filesystem path for the Volume based on the Volume's label. Path is /dev/disk/by-id/scsi-0Linode_Volume_ +
	// Volume label.
	FilesystemPath pulumi.StringPtrInput
	// The label of the Linode Volume
	Label pulumi.StringPtrInput
	// The ID of a Linode Instance where the the Volume should be attached.
	LinodeId pulumi.IntPtrInput
	// The region where this volume will be deployed.  Examples are `"us-east"`, `"us-west"`, `"ap-south"`, etc.  *Changing `region` forces the creation of a new Linode Volume.*.
	Region pulumi.StringPtrInput
	// Size of the Volume in GB.
	Size pulumi.IntPtrInput
	// The status of the volume, indicating the current readiness state.
	Status pulumi.StringPtrInput
	// A list of tags applied to this object. Tags are for organizational purposes only.
	Tags pulumi.StringArrayInput
}

func (VolumeState) ElementType() reflect.Type {
	return reflect.TypeOf((*volumeState)(nil)).Elem()
}

type volumeArgs struct {
	// The label of the Linode Volume
	Label string `pulumi:"label"`
	// The ID of a Linode Instance where the the Volume should be attached.
	LinodeId *int `pulumi:"linodeId"`
	// The region where this volume will be deployed.  Examples are `"us-east"`, `"us-west"`, `"ap-south"`, etc.  *Changing `region` forces the creation of a new Linode Volume.*.
	Region string `pulumi:"region"`
	// Size of the Volume in GB.
	Size *int `pulumi:"size"`
	// A list of tags applied to this object. Tags are for organizational purposes only.
	Tags []string `pulumi:"tags"`
}

// The set of arguments for constructing a Volume resource.
type VolumeArgs struct {
	// The label of the Linode Volume
	Label pulumi.StringInput
	// The ID of a Linode Instance where the the Volume should be attached.
	LinodeId pulumi.IntPtrInput
	// The region where this volume will be deployed.  Examples are `"us-east"`, `"us-west"`, `"ap-south"`, etc.  *Changing `region` forces the creation of a new Linode Volume.*.
	Region pulumi.StringInput
	// Size of the Volume in GB.
	Size pulumi.IntPtrInput
	// A list of tags applied to this object. Tags are for organizational purposes only.
	Tags pulumi.StringArrayInput
}

func (VolumeArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*volumeArgs)(nil)).Elem()
}
