// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-linode/sdk/v4/go/linode/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides information about a Linode Volume.
//
// ## Example Usage
//
// The following example shows how one might use this data source to access information about a Linode Volume.
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
//			_, err := linode.LookupVolume(ctx, &linode.LookupVolumeArgs{
//				Id: 1234567,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupVolume(ctx *pulumi.Context, args *LookupVolumeArgs, opts ...pulumi.InvokeOption) (*LookupVolumeResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupVolumeResult
	err := ctx.Invoke("linode:index/getVolume:getVolume", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getVolume.
type LookupVolumeArgs struct {
	// The unique numeric ID of the Volume record to query.
	Id int `pulumi:"id"`
}

// A collection of values returned by getVolume.
type LookupVolumeResult struct {
	// When this Volume was created.
	Created string `pulumi:"created"`
	// The full filesystem path for the Volume based on the Volume's label. Path is /dev/disk/by-id/scsi-0LinodeVolume + Volume label.
	FilesystemPath string `pulumi:"filesystemPath"`
	// The unique ID of this Volume.
	Id int `pulumi:"id"`
	// This Volume's label is for display purposes only.
	Label string `pulumi:"label"`
	// If a Volume is attached to a specific Linode, the ID of that Linode will be displayed here. If the Volume is unattached, this value will be null.
	LinodeId int `pulumi:"linodeId"`
	// The datacenter in which this Volume is located. See all regions [here](https://api.linode.com/v4/regions).
	Region string `pulumi:"region"`
	// The Volume's size, in GiB.
	Size int `pulumi:"size"`
	// The current status of the Volume. (`creating`, `active`, `resizing`, `contactSupport`)
	Status string `pulumi:"status"`
	// An array of tags applied to this object. Tags are case-insensitive and are for organizational purposes only.
	Tags []string `pulumi:"tags"`
	// When this Volume was last updated.
	Updated string `pulumi:"updated"`
}

func LookupVolumeOutput(ctx *pulumi.Context, args LookupVolumeOutputArgs, opts ...pulumi.InvokeOption) LookupVolumeResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupVolumeResult, error) {
			args := v.(LookupVolumeArgs)
			r, err := LookupVolume(ctx, &args, opts...)
			var s LookupVolumeResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupVolumeResultOutput)
}

// A collection of arguments for invoking getVolume.
type LookupVolumeOutputArgs struct {
	// The unique numeric ID of the Volume record to query.
	Id pulumi.IntInput `pulumi:"id"`
}

func (LookupVolumeOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupVolumeArgs)(nil)).Elem()
}

// A collection of values returned by getVolume.
type LookupVolumeResultOutput struct{ *pulumi.OutputState }

func (LookupVolumeResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupVolumeResult)(nil)).Elem()
}

func (o LookupVolumeResultOutput) ToLookupVolumeResultOutput() LookupVolumeResultOutput {
	return o
}

func (o LookupVolumeResultOutput) ToLookupVolumeResultOutputWithContext(ctx context.Context) LookupVolumeResultOutput {
	return o
}

// When this Volume was created.
func (o LookupVolumeResultOutput) Created() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVolumeResult) string { return v.Created }).(pulumi.StringOutput)
}

// The full filesystem path for the Volume based on the Volume's label. Path is /dev/disk/by-id/scsi-0LinodeVolume + Volume label.
func (o LookupVolumeResultOutput) FilesystemPath() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVolumeResult) string { return v.FilesystemPath }).(pulumi.StringOutput)
}

// The unique ID of this Volume.
func (o LookupVolumeResultOutput) Id() pulumi.IntOutput {
	return o.ApplyT(func(v LookupVolumeResult) int { return v.Id }).(pulumi.IntOutput)
}

// This Volume's label is for display purposes only.
func (o LookupVolumeResultOutput) Label() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVolumeResult) string { return v.Label }).(pulumi.StringOutput)
}

// If a Volume is attached to a specific Linode, the ID of that Linode will be displayed here. If the Volume is unattached, this value will be null.
func (o LookupVolumeResultOutput) LinodeId() pulumi.IntOutput {
	return o.ApplyT(func(v LookupVolumeResult) int { return v.LinodeId }).(pulumi.IntOutput)
}

// The datacenter in which this Volume is located. See all regions [here](https://api.linode.com/v4/regions).
func (o LookupVolumeResultOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVolumeResult) string { return v.Region }).(pulumi.StringOutput)
}

// The Volume's size, in GiB.
func (o LookupVolumeResultOutput) Size() pulumi.IntOutput {
	return o.ApplyT(func(v LookupVolumeResult) int { return v.Size }).(pulumi.IntOutput)
}

// The current status of the Volume. (`creating`, `active`, `resizing`, `contactSupport`)
func (o LookupVolumeResultOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVolumeResult) string { return v.Status }).(pulumi.StringOutput)
}

// An array of tags applied to this object. Tags are case-insensitive and are for organizational purposes only.
func (o LookupVolumeResultOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupVolumeResult) []string { return v.Tags }).(pulumi.StringArrayOutput)
}

// When this Volume was last updated.
func (o LookupVolumeResultOutput) Updated() pulumi.StringOutput {
	return o.ApplyT(func(v LookupVolumeResult) string { return v.Updated }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupVolumeResultOutput{})
}
