// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides a Linode Volume resource.  This can be used to create, modify, and delete Linodes Block Storage Volumes.  Block Storage Volumes are removable storage disks that persist outside the life-cycle of Linode Instances. These volumes can be attached to and detached from Linode instances throughout a region.
//
// For more information, see [How to Use Block Storage with Your Linode](https://www.linode.com/docs/platform/block-storage/how-to-use-block-storage-with-your-linode/) and the [Linode APIv4 docs](https://developers.linode.com/api/v4#operation/createVolume).
//
// ## Example Usage
//
// The following example shows how one might use this resource to configure a Block Storage Volume attached to a Linode Instance.
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
// 		foobaz, err := linode.NewInstance(ctx, "foobaz", &linode.InstanceArgs{
// 			Region:   pulumi.String("us-west"),
// 			RootPass: pulumi.String("3X4mp13"),
// 			Tags: pulumi.StringArray{
// 				pulumi.String("foobaz"),
// 			},
// 			Type: pulumi.String("g6-nanode-1"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = linode.NewVolume(ctx, "foobar", &linode.VolumeArgs{
// 			Label:    pulumi.String("foo-volume"),
// 			LinodeId: foobaz.ID(),
// 			Region:   foobaz.Region,
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// Volumes can also be attached using the Linode Instance config device map.
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
// 		_, err := linode.NewInstance(ctx, "foo", &linode.InstanceArgs{
// 			Configs: linode.InstanceConfigArray{
// 				&linode.InstanceConfigArgs{
// 					Devices: &linode.InstanceConfigDevicesArgs{
// 						Sda: &linode.InstanceConfigDevicesSdaArgs{
// 							VolumeId: pulumi.Int(123),
// 						},
// 					},
// 					Kernel: pulumi.String("linode/latest-64bit"),
// 					Label:  pulumi.String("boot-existing-volume"),
// 				},
// 			},
// 			Region: pulumi.String("us-east"),
// 			Type:   pulumi.String("g6-nanode-1"),
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
// * `status` - The label of the Linode Volume.
//
// * `filesystemPath` - The full filesystem path for the Volume based on the Volume's label. The path is "/dev/disk/by-id/scsi-0Linode_Volume_" + the Volume label
//
// ## Import
//
// Linodes Volumes can be imported using the Linode Volume `id`, e.g.
//
// ```sh
//  $ pulumi import linode:index/volume:Volume myvolume 1234567
// ```
//
//  The Linode Guide, [Import Existing Infrastructure to Terraform](https://www.linode.com/docs/applications/configuration-management/import-existing-infrastructure-to-terraform/), offers resource importing examples for Block Storage Volumes and other Linode resource types.
type Volume struct {
	pulumi.CustomResourceState

	// The full filesystem path for the Volume based on the Volume's label. Path is /dev/disk/by-id/scsi-0Linode_Volume_ +
	// Volume label.
	FilesystemPath pulumi.StringOutput `pulumi:"filesystemPath"`
	// The label of the Linode Volume
	Label pulumi.StringOutput `pulumi:"label"`
	// The ID of a Linode Instance where the Volume should be attached.
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
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Label == nil {
		return nil, errors.New("invalid value for required argument 'Label'")
	}
	if args.Region == nil {
		return nil, errors.New("invalid value for required argument 'Region'")
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
	// The ID of a Linode Instance where the Volume should be attached.
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
	// The ID of a Linode Instance where the Volume should be attached.
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
	// The ID of a Linode Instance where the Volume should be attached.
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
	// The ID of a Linode Instance where the Volume should be attached.
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

type VolumeInput interface {
	pulumi.Input

	ToVolumeOutput() VolumeOutput
	ToVolumeOutputWithContext(ctx context.Context) VolumeOutput
}

func (*Volume) ElementType() reflect.Type {
	return reflect.TypeOf((*Volume)(nil))
}

func (i *Volume) ToVolumeOutput() VolumeOutput {
	return i.ToVolumeOutputWithContext(context.Background())
}

func (i *Volume) ToVolumeOutputWithContext(ctx context.Context) VolumeOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VolumeOutput)
}

func (i *Volume) ToVolumePtrOutput() VolumePtrOutput {
	return i.ToVolumePtrOutputWithContext(context.Background())
}

func (i *Volume) ToVolumePtrOutputWithContext(ctx context.Context) VolumePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VolumePtrOutput)
}

type VolumePtrInput interface {
	pulumi.Input

	ToVolumePtrOutput() VolumePtrOutput
	ToVolumePtrOutputWithContext(ctx context.Context) VolumePtrOutput
}

type volumePtrType VolumeArgs

func (*volumePtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**Volume)(nil))
}

func (i *volumePtrType) ToVolumePtrOutput() VolumePtrOutput {
	return i.ToVolumePtrOutputWithContext(context.Background())
}

func (i *volumePtrType) ToVolumePtrOutputWithContext(ctx context.Context) VolumePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VolumePtrOutput)
}

// VolumeArrayInput is an input type that accepts VolumeArray and VolumeArrayOutput values.
// You can construct a concrete instance of `VolumeArrayInput` via:
//
//          VolumeArray{ VolumeArgs{...} }
type VolumeArrayInput interface {
	pulumi.Input

	ToVolumeArrayOutput() VolumeArrayOutput
	ToVolumeArrayOutputWithContext(context.Context) VolumeArrayOutput
}

type VolumeArray []VolumeInput

func (VolumeArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*Volume)(nil))
}

func (i VolumeArray) ToVolumeArrayOutput() VolumeArrayOutput {
	return i.ToVolumeArrayOutputWithContext(context.Background())
}

func (i VolumeArray) ToVolumeArrayOutputWithContext(ctx context.Context) VolumeArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VolumeArrayOutput)
}

// VolumeMapInput is an input type that accepts VolumeMap and VolumeMapOutput values.
// You can construct a concrete instance of `VolumeMapInput` via:
//
//          VolumeMap{ "key": VolumeArgs{...} }
type VolumeMapInput interface {
	pulumi.Input

	ToVolumeMapOutput() VolumeMapOutput
	ToVolumeMapOutputWithContext(context.Context) VolumeMapOutput
}

type VolumeMap map[string]VolumeInput

func (VolumeMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*Volume)(nil))
}

func (i VolumeMap) ToVolumeMapOutput() VolumeMapOutput {
	return i.ToVolumeMapOutputWithContext(context.Background())
}

func (i VolumeMap) ToVolumeMapOutputWithContext(ctx context.Context) VolumeMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VolumeMapOutput)
}

type VolumeOutput struct {
	*pulumi.OutputState
}

func (VolumeOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*Volume)(nil))
}

func (o VolumeOutput) ToVolumeOutput() VolumeOutput {
	return o
}

func (o VolumeOutput) ToVolumeOutputWithContext(ctx context.Context) VolumeOutput {
	return o
}

func (o VolumeOutput) ToVolumePtrOutput() VolumePtrOutput {
	return o.ToVolumePtrOutputWithContext(context.Background())
}

func (o VolumeOutput) ToVolumePtrOutputWithContext(ctx context.Context) VolumePtrOutput {
	return o.ApplyT(func(v Volume) *Volume {
		return &v
	}).(VolumePtrOutput)
}

type VolumePtrOutput struct {
	*pulumi.OutputState
}

func (VolumePtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Volume)(nil))
}

func (o VolumePtrOutput) ToVolumePtrOutput() VolumePtrOutput {
	return o
}

func (o VolumePtrOutput) ToVolumePtrOutputWithContext(ctx context.Context) VolumePtrOutput {
	return o
}

type VolumeArrayOutput struct{ *pulumi.OutputState }

func (VolumeArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]Volume)(nil))
}

func (o VolumeArrayOutput) ToVolumeArrayOutput() VolumeArrayOutput {
	return o
}

func (o VolumeArrayOutput) ToVolumeArrayOutputWithContext(ctx context.Context) VolumeArrayOutput {
	return o
}

func (o VolumeArrayOutput) Index(i pulumi.IntInput) VolumeOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) Volume {
		return vs[0].([]Volume)[vs[1].(int)]
	}).(VolumeOutput)
}

type VolumeMapOutput struct{ *pulumi.OutputState }

func (VolumeMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]Volume)(nil))
}

func (o VolumeMapOutput) ToVolumeMapOutput() VolumeMapOutput {
	return o
}

func (o VolumeMapOutput) ToVolumeMapOutputWithContext(ctx context.Context) VolumeMapOutput {
	return o
}

func (o VolumeMapOutput) MapIndex(k pulumi.StringInput) VolumeOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) Volume {
		return vs[0].(map[string]Volume)[vs[1].(string)]
	}).(VolumeOutput)
}

func init() {
	pulumi.RegisterOutputType(VolumeOutput{})
	pulumi.RegisterOutputType(VolumePtrOutput{})
	pulumi.RegisterOutputType(VolumeArrayOutput{})
	pulumi.RegisterOutputType(VolumeMapOutput{})
}
