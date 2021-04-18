// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides information about a Linode kernel
//
// ## Example Usage
//
// The following example shows how one might use this data source to access information about a Linode kernel.
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
// 		_, err := linode.GetKernel(ctx, &linode.GetKernelArgs{
// 			Id: "linode/latest-64bit",
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
// The Linode Kernel resource exports the following attributes:
//
// * `architecture` - The architecture of this Kernel.
//
// * `deprecated` - Whether or not this Kernel is deprecated.
//
// * `kvm` - If this Kernel is suitable for KVM Linodes.
//
// * `label` - The friendly name of this Kernel.
//
// * `pvops` - If this Kernel is suitable for paravirtualized operations.
//
// * `version` - Linux Kernel version
//
// * `xen` - If this Kernel is suitable for Xen Linodes.
func GetKernel(ctx *pulumi.Context, args *GetKernelArgs, opts ...pulumi.InvokeOption) (*GetKernelResult, error) {
	var rv GetKernelResult
	err := ctx.Invoke("linode:index/getKernel:getKernel", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getKernel.
type GetKernelArgs struct {
	// The unique ID of this Kernel.
	Id string `pulumi:"id"`
}

// A collection of values returned by getKernel.
type GetKernelResult struct {
	Architecture string `pulumi:"architecture"`
	Deprecated   bool   `pulumi:"deprecated"`
	Id           string `pulumi:"id"`
	Kvm          bool   `pulumi:"kvm"`
	Label        string `pulumi:"label"`
	Pvops        bool   `pulumi:"pvops"`
	Version      string `pulumi:"version"`
	Xen          bool   `pulumi:"xen"`
}
