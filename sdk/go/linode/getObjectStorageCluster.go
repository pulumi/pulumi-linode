// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides information about a Linode Object Storage Cluster
//
// ## Example Usage
//
// The following example shows how one might use this data source to access information about a Linode Object Storage Cluster.
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-linode/sdk/v2/go/linode"
// 	"github.com/pulumi/pulumi-linode/sdk/v2/go/linode/"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := linode.GetObjectStorageCluster(ctx, &linode.GetObjectStorageClusterArgs{
// 			Id: "us-east-1",
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
// The Linode Object Storage Cluster resource exports the following attributes:
//
// * `domain` - The base URL for this cluster.
//
// * `status` - This cluster's status.
//
// * `region` - The region this cluster is located in.
//
// * `staticSiteDomain` - The base URL for this cluster used when hosting static sites.
func GetObjectStorageCluster(ctx *pulumi.Context, args *GetObjectStorageClusterArgs, opts ...pulumi.InvokeOption) (*GetObjectStorageClusterResult, error) {
	var rv GetObjectStorageClusterResult
	err := ctx.Invoke("linode:index/getObjectStorageCluster:getObjectStorageCluster", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getObjectStorageCluster.
type GetObjectStorageClusterArgs struct {
	Domain *string `pulumi:"domain"`
	// The unique ID of this cluster.
	Id               string  `pulumi:"id"`
	Region           *string `pulumi:"region"`
	StaticSiteDomain *string `pulumi:"staticSiteDomain"`
	Status           *string `pulumi:"status"`
}

// A collection of values returned by getObjectStorageCluster.
type GetObjectStorageClusterResult struct {
	Domain           string `pulumi:"domain"`
	Id               string `pulumi:"id"`
	Region           string `pulumi:"region"`
	StaticSiteDomain string `pulumi:"staticSiteDomain"`
	Status           string `pulumi:"status"`
}
