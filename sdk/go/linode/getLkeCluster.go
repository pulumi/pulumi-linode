// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-linode/sdk/v4/go/linode/internal"
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
//
//	"github.com/pulumi/pulumi-linode/sdk/v4/go/linode"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := linode.LookupLkeCluster(ctx, &linode.LookupLkeClusterArgs{
//				Id: 123,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupLkeCluster(ctx *pulumi.Context, args *LookupLkeClusterArgs, opts ...pulumi.InvokeOption) (*LookupLkeClusterResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupLkeClusterResult
	err := ctx.Invoke("linode:index/getLkeCluster:getLkeCluster", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getLkeCluster.
type LookupLkeClusterArgs struct {
	// The settings for the Kubernetes Control Plane.
	ControlPlanes []GetLkeClusterControlPlane `pulumi:"controlPlanes"`
	// The LKE Cluster's ID.
	Id int `pulumi:"id"`
	// Node pools associated with this cluster.
	Pools []GetLkeClusterPool `pulumi:"pools"`
}

// A collection of values returned by getLkeCluster.
type LookupLkeClusterResult struct {
	// The endpoints for the Kubernetes API server.
	ApiEndpoints []string `pulumi:"apiEndpoints"`
	// The settings for the Kubernetes Control Plane.
	ControlPlanes []GetLkeClusterControlPlane `pulumi:"controlPlanes"`
	// When this Kubernetes cluster was created.
	Created string `pulumi:"created"`
	// The Kubernetes Dashboard access URL for this cluster.
	DashboardUrl string `pulumi:"dashboardUrl"`
	// The ID of the node.
	Id int `pulumi:"id"`
	// The Kubernetes version for this Kubernetes cluster in the format of `major.minor` (e.g. `1.17`).
	K8sVersion string `pulumi:"k8sVersion"`
	// The base64 encoded kubeconfig for the Kubernetes cluster.
	Kubeconfig string `pulumi:"kubeconfig"`
	// The unique label for the cluster.
	Label string `pulumi:"label"`
	// Node pools associated with this cluster.
	Pools []GetLkeClusterPool `pulumi:"pools"`
	// This Kubernetes cluster's location.
	Region string `pulumi:"region"`
	// The status of the node. (`ready`, `notReady`)
	Status string `pulumi:"status"`
	// An array of tags applied to this object. Tags are case-insensitive and are for organizational purposes only.
	Tags []string `pulumi:"tags"`
	// When this Kubernetes cluster was updated.
	Updated string `pulumi:"updated"`
}

func LookupLkeClusterOutput(ctx *pulumi.Context, args LookupLkeClusterOutputArgs, opts ...pulumi.InvokeOption) LookupLkeClusterResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupLkeClusterResult, error) {
			args := v.(LookupLkeClusterArgs)
			r, err := LookupLkeCluster(ctx, &args, opts...)
			var s LookupLkeClusterResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupLkeClusterResultOutput)
}

// A collection of arguments for invoking getLkeCluster.
type LookupLkeClusterOutputArgs struct {
	// The settings for the Kubernetes Control Plane.
	ControlPlanes GetLkeClusterControlPlaneArrayInput `pulumi:"controlPlanes"`
	// The LKE Cluster's ID.
	Id pulumi.IntInput `pulumi:"id"`
	// Node pools associated with this cluster.
	Pools GetLkeClusterPoolArrayInput `pulumi:"pools"`
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

// The settings for the Kubernetes Control Plane.
func (o LookupLkeClusterResultOutput) ControlPlanes() GetLkeClusterControlPlaneArrayOutput {
	return o.ApplyT(func(v LookupLkeClusterResult) []GetLkeClusterControlPlane { return v.ControlPlanes }).(GetLkeClusterControlPlaneArrayOutput)
}

// When this Kubernetes cluster was created.
func (o LookupLkeClusterResultOutput) Created() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLkeClusterResult) string { return v.Created }).(pulumi.StringOutput)
}

// The Kubernetes Dashboard access URL for this cluster.
func (o LookupLkeClusterResultOutput) DashboardUrl() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLkeClusterResult) string { return v.DashboardUrl }).(pulumi.StringOutput)
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

// The unique label for the cluster.
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

// An array of tags applied to this object. Tags are case-insensitive and are for organizational purposes only.
func (o LookupLkeClusterResultOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupLkeClusterResult) []string { return v.Tags }).(pulumi.StringArrayOutput)
}

// When this Kubernetes cluster was updated.
func (o LookupLkeClusterResultOutput) Updated() pulumi.StringOutput {
	return o.ApplyT(func(v LookupLkeClusterResult) string { return v.Updated }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupLkeClusterResultOutput{})
}
