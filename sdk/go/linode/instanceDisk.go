// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-linode/sdk/v5/go/linode/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Linode Instance Disk resource. This can be used to create, modify, and delete Linode Instance Disks.
// For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/post-add-linode-disk).
//
// **NOTE:** Deleting a disk will shut down the attached instance if the instance is booted. If the disk was not in use by the booted configuration profile, the instance will be automatically rebooted.
//
// ## Example Usage
//
// Creating a simple 512 MB Linode Instance Disk:
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-linode/sdk/v5/go/linode"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			my_instance, err := linode.NewInstance(ctx, "my-instance", &linode.InstanceArgs{
//				Label:  pulumi.String("my-instance"),
//				Type:   pulumi.String("g6-standard-1"),
//				Region: pulumi.String("us-southeast"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = linode.NewInstanceDisk(ctx, "boot", &linode.InstanceDiskArgs{
//				Label:      pulumi.String("boot"),
//				LinodeId:   my_instance.ID(),
//				Size:       pulumi.Int(512),
//				Filesystem: pulumi.String("ext4"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// Creating a complex bootable Instance Disk:
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-linode/sdk/v5/go/linode"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			my_instance, err := linode.NewInstance(ctx, "my-instance", &linode.InstanceArgs{
//				Label:  pulumi.String("my-instance"),
//				Type:   pulumi.String("g6-standard-1"),
//				Region: pulumi.String("us-southeast"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = linode.NewInstanceDisk(ctx, "boot", &linode.InstanceDiskArgs{
//				Label:    pulumi.String("boot"),
//				LinodeId: my_instance.ID(),
//				Size: pulumi.Int(my_instance.Specs.ApplyT(func(specs []linode.InstanceSpec) (*int, error) {
//					return &specs[0].Disk, nil
//				}).(pulumi.IntPtrOutput)),
//				Image:    pulumi.String("linode/ubuntu22.04"),
//				RootPass: pulumi.String("myc00lpass!"),
//				AuthorizedKeys: pulumi.StringArray{
//					pulumi.String("ssh-rsa AAAA...Gw== user@example.local"),
//				},
//				StackscriptId: pulumi.Int(12345),
//				StackscriptData: pulumi.StringMap{
//					"my_var": pulumi.String("my_value"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// Instance Disks can be imported using the `linode_id` followed by the Instance Disk `id` separated by a comma, e.g.
//
// ```sh
// $ pulumi import linode:index/instanceDisk:InstanceDisk my-disk 1234567,7654321
// ```
type InstanceDisk struct {
	pulumi.CustomResourceState

	// A list of public SSH keys that will be automatically appended to the root user’s ~/.ssh/authorized_keys file when deploying from an Image. (Requires `image`)
	AuthorizedKeys pulumi.StringArrayOutput `pulumi:"authorizedKeys"`
	// A list of usernames. If the usernames have associated SSH keys, the keys will be appended to the root user's ~/.ssh/authorized_keys file. (Requires `image`)
	AuthorizedUsers pulumi.StringArrayOutput `pulumi:"authorizedUsers"`
	// When this disk was created.
	Created pulumi.StringOutput `pulumi:"created"`
	// The disk encryption policy for this disk's parent instance. (`enabled`, `disabled`)
	DiskEncryption pulumi.StringOutput `pulumi:"diskEncryption"`
	// The filesystem of this disk. (`raw`, `swap`, `ext3`, `ext4`, `initrd`)
	Filesystem pulumi.StringOutput `pulumi:"filesystem"`
	// An Image ID to deploy the Linode Disk from.
	Image pulumi.StringPtrOutput `pulumi:"image"`
	// The Disk's label for display purposes only.
	Label pulumi.StringOutput `pulumi:"label"`
	// The ID of the Linode to create this Disk under.
	LinodeId pulumi.IntOutput `pulumi:"linodeId"`
	// The root user’s password on a newly-created Linode Disk when deploying from an Image. (Requires `image`)
	RootPass pulumi.StringPtrOutput `pulumi:"rootPass"`
	// The size of the Disk in MB. **NOTE:** Resizing a disk will trigger a Linode reboot.
	//
	// ***
	Size pulumi.IntOutput `pulumi:"size"`
	// An object containing responses to any User Defined Fields present in the StackScript being deployed to this Disk. Only accepted if `stackscriptId` is given. (Requires `image`)
	StackscriptData pulumi.StringMapOutput `pulumi:"stackscriptData"`
	// A StackScript ID that will cause the referenced StackScript to be run during deployment of this Disk. (Requires `image`)
	StackscriptId pulumi.IntPtrOutput `pulumi:"stackscriptId"`
	// A brief description of this Disk's current state.
	Status   pulumi.StringOutput           `pulumi:"status"`
	Timeouts InstanceDiskTimeoutsPtrOutput `pulumi:"timeouts"`
	// When this disk was last updated.
	Updated pulumi.StringOutput `pulumi:"updated"`
}

// NewInstanceDisk registers a new resource with the given unique name, arguments, and options.
func NewInstanceDisk(ctx *pulumi.Context,
	name string, args *InstanceDiskArgs, opts ...pulumi.ResourceOption) (*InstanceDisk, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Label == nil {
		return nil, errors.New("invalid value for required argument 'Label'")
	}
	if args.LinodeId == nil {
		return nil, errors.New("invalid value for required argument 'LinodeId'")
	}
	if args.Size == nil {
		return nil, errors.New("invalid value for required argument 'Size'")
	}
	if args.RootPass != nil {
		args.RootPass = pulumi.ToSecret(args.RootPass).(pulumi.StringPtrInput)
	}
	if args.StackscriptData != nil {
		args.StackscriptData = pulumi.ToSecret(args.StackscriptData).(pulumi.StringMapInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"rootPass",
		"stackscriptData",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource InstanceDisk
	err := ctx.RegisterResource("linode:index/instanceDisk:InstanceDisk", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetInstanceDisk gets an existing InstanceDisk resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetInstanceDisk(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *InstanceDiskState, opts ...pulumi.ResourceOption) (*InstanceDisk, error) {
	var resource InstanceDisk
	err := ctx.ReadResource("linode:index/instanceDisk:InstanceDisk", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering InstanceDisk resources.
type instanceDiskState struct {
	// A list of public SSH keys that will be automatically appended to the root user’s ~/.ssh/authorized_keys file when deploying from an Image. (Requires `image`)
	AuthorizedKeys []string `pulumi:"authorizedKeys"`
	// A list of usernames. If the usernames have associated SSH keys, the keys will be appended to the root user's ~/.ssh/authorized_keys file. (Requires `image`)
	AuthorizedUsers []string `pulumi:"authorizedUsers"`
	// When this disk was created.
	Created *string `pulumi:"created"`
	// The disk encryption policy for this disk's parent instance. (`enabled`, `disabled`)
	DiskEncryption *string `pulumi:"diskEncryption"`
	// The filesystem of this disk. (`raw`, `swap`, `ext3`, `ext4`, `initrd`)
	Filesystem *string `pulumi:"filesystem"`
	// An Image ID to deploy the Linode Disk from.
	Image *string `pulumi:"image"`
	// The Disk's label for display purposes only.
	Label *string `pulumi:"label"`
	// The ID of the Linode to create this Disk under.
	LinodeId *int `pulumi:"linodeId"`
	// The root user’s password on a newly-created Linode Disk when deploying from an Image. (Requires `image`)
	RootPass *string `pulumi:"rootPass"`
	// The size of the Disk in MB. **NOTE:** Resizing a disk will trigger a Linode reboot.
	//
	// ***
	Size *int `pulumi:"size"`
	// An object containing responses to any User Defined Fields present in the StackScript being deployed to this Disk. Only accepted if `stackscriptId` is given. (Requires `image`)
	StackscriptData map[string]string `pulumi:"stackscriptData"`
	// A StackScript ID that will cause the referenced StackScript to be run during deployment of this Disk. (Requires `image`)
	StackscriptId *int `pulumi:"stackscriptId"`
	// A brief description of this Disk's current state.
	Status   *string               `pulumi:"status"`
	Timeouts *InstanceDiskTimeouts `pulumi:"timeouts"`
	// When this disk was last updated.
	Updated *string `pulumi:"updated"`
}

type InstanceDiskState struct {
	// A list of public SSH keys that will be automatically appended to the root user’s ~/.ssh/authorized_keys file when deploying from an Image. (Requires `image`)
	AuthorizedKeys pulumi.StringArrayInput
	// A list of usernames. If the usernames have associated SSH keys, the keys will be appended to the root user's ~/.ssh/authorized_keys file. (Requires `image`)
	AuthorizedUsers pulumi.StringArrayInput
	// When this disk was created.
	Created pulumi.StringPtrInput
	// The disk encryption policy for this disk's parent instance. (`enabled`, `disabled`)
	DiskEncryption pulumi.StringPtrInput
	// The filesystem of this disk. (`raw`, `swap`, `ext3`, `ext4`, `initrd`)
	Filesystem pulumi.StringPtrInput
	// An Image ID to deploy the Linode Disk from.
	Image pulumi.StringPtrInput
	// The Disk's label for display purposes only.
	Label pulumi.StringPtrInput
	// The ID of the Linode to create this Disk under.
	LinodeId pulumi.IntPtrInput
	// The root user’s password on a newly-created Linode Disk when deploying from an Image. (Requires `image`)
	RootPass pulumi.StringPtrInput
	// The size of the Disk in MB. **NOTE:** Resizing a disk will trigger a Linode reboot.
	//
	// ***
	Size pulumi.IntPtrInput
	// An object containing responses to any User Defined Fields present in the StackScript being deployed to this Disk. Only accepted if `stackscriptId` is given. (Requires `image`)
	StackscriptData pulumi.StringMapInput
	// A StackScript ID that will cause the referenced StackScript to be run during deployment of this Disk. (Requires `image`)
	StackscriptId pulumi.IntPtrInput
	// A brief description of this Disk's current state.
	Status   pulumi.StringPtrInput
	Timeouts InstanceDiskTimeoutsPtrInput
	// When this disk was last updated.
	Updated pulumi.StringPtrInput
}

func (InstanceDiskState) ElementType() reflect.Type {
	return reflect.TypeOf((*instanceDiskState)(nil)).Elem()
}

type instanceDiskArgs struct {
	// A list of public SSH keys that will be automatically appended to the root user’s ~/.ssh/authorized_keys file when deploying from an Image. (Requires `image`)
	AuthorizedKeys []string `pulumi:"authorizedKeys"`
	// A list of usernames. If the usernames have associated SSH keys, the keys will be appended to the root user's ~/.ssh/authorized_keys file. (Requires `image`)
	AuthorizedUsers []string `pulumi:"authorizedUsers"`
	// The filesystem of this disk. (`raw`, `swap`, `ext3`, `ext4`, `initrd`)
	Filesystem *string `pulumi:"filesystem"`
	// An Image ID to deploy the Linode Disk from.
	Image *string `pulumi:"image"`
	// The Disk's label for display purposes only.
	Label string `pulumi:"label"`
	// The ID of the Linode to create this Disk under.
	LinodeId int `pulumi:"linodeId"`
	// The root user’s password on a newly-created Linode Disk when deploying from an Image. (Requires `image`)
	RootPass *string `pulumi:"rootPass"`
	// The size of the Disk in MB. **NOTE:** Resizing a disk will trigger a Linode reboot.
	//
	// ***
	Size int `pulumi:"size"`
	// An object containing responses to any User Defined Fields present in the StackScript being deployed to this Disk. Only accepted if `stackscriptId` is given. (Requires `image`)
	StackscriptData map[string]string `pulumi:"stackscriptData"`
	// A StackScript ID that will cause the referenced StackScript to be run during deployment of this Disk. (Requires `image`)
	StackscriptId *int                  `pulumi:"stackscriptId"`
	Timeouts      *InstanceDiskTimeouts `pulumi:"timeouts"`
}

// The set of arguments for constructing a InstanceDisk resource.
type InstanceDiskArgs struct {
	// A list of public SSH keys that will be automatically appended to the root user’s ~/.ssh/authorized_keys file when deploying from an Image. (Requires `image`)
	AuthorizedKeys pulumi.StringArrayInput
	// A list of usernames. If the usernames have associated SSH keys, the keys will be appended to the root user's ~/.ssh/authorized_keys file. (Requires `image`)
	AuthorizedUsers pulumi.StringArrayInput
	// The filesystem of this disk. (`raw`, `swap`, `ext3`, `ext4`, `initrd`)
	Filesystem pulumi.StringPtrInput
	// An Image ID to deploy the Linode Disk from.
	Image pulumi.StringPtrInput
	// The Disk's label for display purposes only.
	Label pulumi.StringInput
	// The ID of the Linode to create this Disk under.
	LinodeId pulumi.IntInput
	// The root user’s password on a newly-created Linode Disk when deploying from an Image. (Requires `image`)
	RootPass pulumi.StringPtrInput
	// The size of the Disk in MB. **NOTE:** Resizing a disk will trigger a Linode reboot.
	//
	// ***
	Size pulumi.IntInput
	// An object containing responses to any User Defined Fields present in the StackScript being deployed to this Disk. Only accepted if `stackscriptId` is given. (Requires `image`)
	StackscriptData pulumi.StringMapInput
	// A StackScript ID that will cause the referenced StackScript to be run during deployment of this Disk. (Requires `image`)
	StackscriptId pulumi.IntPtrInput
	Timeouts      InstanceDiskTimeoutsPtrInput
}

func (InstanceDiskArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*instanceDiskArgs)(nil)).Elem()
}

type InstanceDiskInput interface {
	pulumi.Input

	ToInstanceDiskOutput() InstanceDiskOutput
	ToInstanceDiskOutputWithContext(ctx context.Context) InstanceDiskOutput
}

func (*InstanceDisk) ElementType() reflect.Type {
	return reflect.TypeOf((**InstanceDisk)(nil)).Elem()
}

func (i *InstanceDisk) ToInstanceDiskOutput() InstanceDiskOutput {
	return i.ToInstanceDiskOutputWithContext(context.Background())
}

func (i *InstanceDisk) ToInstanceDiskOutputWithContext(ctx context.Context) InstanceDiskOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceDiskOutput)
}

// InstanceDiskArrayInput is an input type that accepts InstanceDiskArray and InstanceDiskArrayOutput values.
// You can construct a concrete instance of `InstanceDiskArrayInput` via:
//
//	InstanceDiskArray{ InstanceDiskArgs{...} }
type InstanceDiskArrayInput interface {
	pulumi.Input

	ToInstanceDiskArrayOutput() InstanceDiskArrayOutput
	ToInstanceDiskArrayOutputWithContext(context.Context) InstanceDiskArrayOutput
}

type InstanceDiskArray []InstanceDiskInput

func (InstanceDiskArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*InstanceDisk)(nil)).Elem()
}

func (i InstanceDiskArray) ToInstanceDiskArrayOutput() InstanceDiskArrayOutput {
	return i.ToInstanceDiskArrayOutputWithContext(context.Background())
}

func (i InstanceDiskArray) ToInstanceDiskArrayOutputWithContext(ctx context.Context) InstanceDiskArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceDiskArrayOutput)
}

// InstanceDiskMapInput is an input type that accepts InstanceDiskMap and InstanceDiskMapOutput values.
// You can construct a concrete instance of `InstanceDiskMapInput` via:
//
//	InstanceDiskMap{ "key": InstanceDiskArgs{...} }
type InstanceDiskMapInput interface {
	pulumi.Input

	ToInstanceDiskMapOutput() InstanceDiskMapOutput
	ToInstanceDiskMapOutputWithContext(context.Context) InstanceDiskMapOutput
}

type InstanceDiskMap map[string]InstanceDiskInput

func (InstanceDiskMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*InstanceDisk)(nil)).Elem()
}

func (i InstanceDiskMap) ToInstanceDiskMapOutput() InstanceDiskMapOutput {
	return i.ToInstanceDiskMapOutputWithContext(context.Background())
}

func (i InstanceDiskMap) ToInstanceDiskMapOutputWithContext(ctx context.Context) InstanceDiskMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceDiskMapOutput)
}

type InstanceDiskOutput struct{ *pulumi.OutputState }

func (InstanceDiskOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**InstanceDisk)(nil)).Elem()
}

func (o InstanceDiskOutput) ToInstanceDiskOutput() InstanceDiskOutput {
	return o
}

func (o InstanceDiskOutput) ToInstanceDiskOutputWithContext(ctx context.Context) InstanceDiskOutput {
	return o
}

// A list of public SSH keys that will be automatically appended to the root user’s ~/.ssh/authorized_keys file when deploying from an Image. (Requires `image`)
func (o InstanceDiskOutput) AuthorizedKeys() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *InstanceDisk) pulumi.StringArrayOutput { return v.AuthorizedKeys }).(pulumi.StringArrayOutput)
}

// A list of usernames. If the usernames have associated SSH keys, the keys will be appended to the root user's ~/.ssh/authorized_keys file. (Requires `image`)
func (o InstanceDiskOutput) AuthorizedUsers() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *InstanceDisk) pulumi.StringArrayOutput { return v.AuthorizedUsers }).(pulumi.StringArrayOutput)
}

// When this disk was created.
func (o InstanceDiskOutput) Created() pulumi.StringOutput {
	return o.ApplyT(func(v *InstanceDisk) pulumi.StringOutput { return v.Created }).(pulumi.StringOutput)
}

// The disk encryption policy for this disk's parent instance. (`enabled`, `disabled`)
func (o InstanceDiskOutput) DiskEncryption() pulumi.StringOutput {
	return o.ApplyT(func(v *InstanceDisk) pulumi.StringOutput { return v.DiskEncryption }).(pulumi.StringOutput)
}

// The filesystem of this disk. (`raw`, `swap`, `ext3`, `ext4`, `initrd`)
func (o InstanceDiskOutput) Filesystem() pulumi.StringOutput {
	return o.ApplyT(func(v *InstanceDisk) pulumi.StringOutput { return v.Filesystem }).(pulumi.StringOutput)
}

// An Image ID to deploy the Linode Disk from.
func (o InstanceDiskOutput) Image() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *InstanceDisk) pulumi.StringPtrOutput { return v.Image }).(pulumi.StringPtrOutput)
}

// The Disk's label for display purposes only.
func (o InstanceDiskOutput) Label() pulumi.StringOutput {
	return o.ApplyT(func(v *InstanceDisk) pulumi.StringOutput { return v.Label }).(pulumi.StringOutput)
}

// The ID of the Linode to create this Disk under.
func (o InstanceDiskOutput) LinodeId() pulumi.IntOutput {
	return o.ApplyT(func(v *InstanceDisk) pulumi.IntOutput { return v.LinodeId }).(pulumi.IntOutput)
}

// The root user’s password on a newly-created Linode Disk when deploying from an Image. (Requires `image`)
func (o InstanceDiskOutput) RootPass() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *InstanceDisk) pulumi.StringPtrOutput { return v.RootPass }).(pulumi.StringPtrOutput)
}

// The size of the Disk in MB. **NOTE:** Resizing a disk will trigger a Linode reboot.
//
// ***
func (o InstanceDiskOutput) Size() pulumi.IntOutput {
	return o.ApplyT(func(v *InstanceDisk) pulumi.IntOutput { return v.Size }).(pulumi.IntOutput)
}

// An object containing responses to any User Defined Fields present in the StackScript being deployed to this Disk. Only accepted if `stackscriptId` is given. (Requires `image`)
func (o InstanceDiskOutput) StackscriptData() pulumi.StringMapOutput {
	return o.ApplyT(func(v *InstanceDisk) pulumi.StringMapOutput { return v.StackscriptData }).(pulumi.StringMapOutput)
}

// A StackScript ID that will cause the referenced StackScript to be run during deployment of this Disk. (Requires `image`)
func (o InstanceDiskOutput) StackscriptId() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *InstanceDisk) pulumi.IntPtrOutput { return v.StackscriptId }).(pulumi.IntPtrOutput)
}

// A brief description of this Disk's current state.
func (o InstanceDiskOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *InstanceDisk) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

func (o InstanceDiskOutput) Timeouts() InstanceDiskTimeoutsPtrOutput {
	return o.ApplyT(func(v *InstanceDisk) InstanceDiskTimeoutsPtrOutput { return v.Timeouts }).(InstanceDiskTimeoutsPtrOutput)
}

// When this disk was last updated.
func (o InstanceDiskOutput) Updated() pulumi.StringOutput {
	return o.ApplyT(func(v *InstanceDisk) pulumi.StringOutput { return v.Updated }).(pulumi.StringOutput)
}

type InstanceDiskArrayOutput struct{ *pulumi.OutputState }

func (InstanceDiskArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*InstanceDisk)(nil)).Elem()
}

func (o InstanceDiskArrayOutput) ToInstanceDiskArrayOutput() InstanceDiskArrayOutput {
	return o
}

func (o InstanceDiskArrayOutput) ToInstanceDiskArrayOutputWithContext(ctx context.Context) InstanceDiskArrayOutput {
	return o
}

func (o InstanceDiskArrayOutput) Index(i pulumi.IntInput) InstanceDiskOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *InstanceDisk {
		return vs[0].([]*InstanceDisk)[vs[1].(int)]
	}).(InstanceDiskOutput)
}

type InstanceDiskMapOutput struct{ *pulumi.OutputState }

func (InstanceDiskMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*InstanceDisk)(nil)).Elem()
}

func (o InstanceDiskMapOutput) ToInstanceDiskMapOutput() InstanceDiskMapOutput {
	return o
}

func (o InstanceDiskMapOutput) ToInstanceDiskMapOutputWithContext(ctx context.Context) InstanceDiskMapOutput {
	return o
}

func (o InstanceDiskMapOutput) MapIndex(k pulumi.StringInput) InstanceDiskOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *InstanceDisk {
		return vs[0].(map[string]*InstanceDisk)[vs[1].(string)]
	}).(InstanceDiskOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*InstanceDiskInput)(nil)).Elem(), &InstanceDisk{})
	pulumi.RegisterInputType(reflect.TypeOf((*InstanceDiskArrayInput)(nil)).Elem(), InstanceDiskArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*InstanceDiskMapInput)(nil)).Elem(), InstanceDiskMap{})
	pulumi.RegisterOutputType(InstanceDiskOutput{})
	pulumi.RegisterOutputType(InstanceDiskArrayOutput{})
	pulumi.RegisterOutputType(InstanceDiskMapOutput{})
}
