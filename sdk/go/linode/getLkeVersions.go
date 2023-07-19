// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"github.com/pulumi/pulumi-linode/sdk/v4/go/linode/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides details about the Kubernetes versions available for deployment to a Kubernetes cluster.
//
// ## Example Usage
//
// The following example shows how one might use this data source to access information about a Linode LKE Version.
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
//			_, err := linode.GetLkeVersions(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetLkeVersions(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetLkeVersionsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetLkeVersionsResult
	err := ctx.Invoke("linode:index/getLkeVersions:getLkeVersions", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getLkeVersions.
type GetLkeVersionsResult struct {
	// The Kubernetes version numbers available for deployment to a Kubernetes cluster in the format of [major].[minor], and the latest supported patch version.
	Id       string                  `pulumi:"id"`
	Versions []GetLkeVersionsVersion `pulumi:"versions"`
}
