// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides details about an LKE Cluster.
//
// ## Example Usage
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
// 		_, err := linode.LookupLkeCluster(ctx, &GetLkeClusterArgs{
// 			Id: 123,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func LookupLkeCluster(ctx *pulumi.Context, args *LookupLkeClusterArgs, opts ...pulumi.InvokeOption) (*LookupLkeClusterResult, error) {
	var rv LookupLkeClusterResult
	err := ctx.Invoke("linode:index/getLkeCluster:getLkeCluster", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getLkeCluster.
type LookupLkeClusterArgs struct {
	// The LKE Cluster's ID.
	Id int `pulumi:"id"`
}

// A collection of values returned by getLkeCluster.
type LookupLkeClusterResult struct {
	// The endpoints for the Kubernetes API server.
	ApiEndpoints  []string                    `pulumi:"apiEndpoints"`
	ControlPlanes []GetLkeClusterControlPlane `pulumi:"controlPlanes"`
	// The ID of the node.
	Id int `pulumi:"id"`
	// The Kubernetes version for this Kubernetes cluster in the format of `major.minor` (e.g. `1.17`).
	K8sVersion string `pulumi:"k8sVersion"`
	// The base64 encoded kubeconfig for the Kubernetes cluster.
	Kubeconfig string `pulumi:"kubeconfig"`
	Label      string `pulumi:"label"`
	// Node pools associated with this cluster.
	Pools []GetLkeClusterPool `pulumi:"pools"`
	// This Kubernetes cluster's location.
	Region string `pulumi:"region"`
	// The status of the node. (`ready`, `notReady`)
	Status string `pulumi:"status"`
	// The tags applied to the cluster.
	Tags []string `pulumi:"tags"`
}

func LookupLkeClusterOutput(ctx *pulumi.Context, args LookupLkeClusterOutputArgs, opts ...pulumi.InvokeOption) LookupLkeClusterResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupLkeClusterResult, error) {
			args := v.(LookupLkeClusterArgs)
			r, err := LookupLkeCluster(ctx, &args, opts...)
			return *r, err
		}).(LookupLkeClusterResultOutput)
}

// A collection of arguments for invoking getLkeCluster.
type LookupLkeClusterOutputArgs struct {
	// The LKE Cluster's ID.
	Id pulumi.IntInput `pulumi:"id"`
}

func (LookupLkeClusterOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupLkeClusterArgs)(nil)).Elem()
}

// A collection of values returned by getLkeCluster.
type LookupLkeClusterResultOutput struct{ *pulumi.OutputState }

func (LookupLkeClusterResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupLkeClusterResult)(nil)).Elem()
}

func (o LookupLkeClusterResultOutput) ToLookupLkeClusterResultOutput() LookupLkeClusterResultOutput {
	return o
}

func (o LookupLkeClusterResultOutput) ToLookupLkeClusterResultOutputWithContext(ctx context.Context) LookupLkeClusterResultOutput {
	return o
}

// The endpoints for the Kubernetes API server.
func (o LookupLkeClusterResultOutput) ApiEndpoints() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupLkeClusterResult) []string { return v.ApiEndpoints }).(pulumi.StringArrayOutput)
}

func (o LookupLkeClusterResultOutput) ControlPlanes() GetLkeClusterControlPlaneArrayOutput {
	return o.ApplyT(func(v LookupLkeClusterResult) []GetLkeClusterControlPlane { return v.ControlPlanes }).(GetLkeClusterControlPlaneArrayOutput)
}

// The ID of the node.
func (o LookupLkeClusterResultOutput) Id() pulumi.IntOutput {
	return o.ApplyT(func(v LookupLkeClusterResult) int { return v.Id }).(pulumi.IntOutput)
}

// The Kubernetes version for this Kubernetes cluster in the format of `major.minor` (e.g. `1.17`).
func (o LookupLkeClusterResultOutput) K8sVersion() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLkeClusterResult) string { return v.K8sVersion }).(pulumi.StringOutput)
}

// The base64 encoded kubeconfig for the Kubernetes cluster.
func (o LookupLkeClusterResultOutput) Kubeconfig() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLkeClusterResult) string { return v.Kubeconfig }).(pulumi.StringOutput)
}

func (o LookupLkeClusterResultOutput) Label() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLkeClusterResult) string { return v.Label }).(pulumi.StringOutput)
}

// Node pools associated with this cluster.
func (o LookupLkeClusterResultOutput) Pools() GetLkeClusterPoolArrayOutput {
	return o.ApplyT(func(v LookupLkeClusterResult) []GetLkeClusterPool { return v.Pools }).(GetLkeClusterPoolArrayOutput)
}

// This Kubernetes cluster's location.
func (o LookupLkeClusterResultOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLkeClusterResult) string { return v.Region }).(pulumi.StringOutput)
}

// The status of the node. (`ready`, `notReady`)
func (o LookupLkeClusterResultOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLkeClusterResult) string { return v.Status }).(pulumi.StringOutput)
}

// The tags applied to the cluster.
func (o LookupLkeClusterResultOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupLkeClusterResult) []string { return v.Tags }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupLkeClusterResultOutput{})
}
