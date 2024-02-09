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

// Manages an LKE cluster.
//
// ## Example Usage
//
// Creating a basic LKE cluster:
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
//			_, err := linode.NewLkeCluster(ctx, "my-cluster", &linode.LkeClusterArgs{
//				K8sVersion: pulumi.String("1.21"),
//				Label:      pulumi.String("my-cluster"),
//				Pools: linode.LkeClusterPoolArray{
//					&linode.LkeClusterPoolArgs{
//						Count: pulumi.Int(3),
//						Type:  pulumi.String("g6-standard-2"),
//					},
//				},
//				Region: pulumi.String("us-central"),
//				Tags: pulumi.StringArray{
//					pulumi.String("prod"),
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
// Creating an LKE cluster with autoscaler:
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
//			_, err := linode.NewLkeCluster(ctx, "my-cluster", &linode.LkeClusterArgs{
//				Label:      pulumi.String("my-cluster"),
//				K8sVersion: pulumi.String("1.21"),
//				Region:     pulumi.String("us-central"),
//				Tags: pulumi.StringArray{
//					pulumi.String("prod"),
//				},
//				Pools: linode.LkeClusterPoolArray{
//					&linode.LkeClusterPoolArgs{
//						Type:  pulumi.String("g6-standard-2"),
//						Count: pulumi.Int(3),
//						Autoscaler: &linode.LkeClusterPoolAutoscalerArgs{
//							Min: pulumi.Int(3),
//							Max: pulumi.Int(10),
//						},
//					},
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
// LKE Clusters can be imported using the `id`, e.g.
//
// ```sh
// $ pulumi import linode:index/lkeCluster:LkeCluster my_cluster 12345
// ```
type LkeCluster struct {
	pulumi.CustomResourceState

	// The endpoints for the Kubernetes API server.
	ApiEndpoints pulumi.StringArrayOutput `pulumi:"apiEndpoints"`
	// Defines settings for the Kubernetes Control Plane.
	ControlPlane LkeClusterControlPlaneOutput `pulumi:"controlPlane"`
	// The Kubernetes Dashboard access URL for this cluster.
	DashboardUrl pulumi.StringOutput `pulumi:"dashboardUrl"`
	// The desired Kubernetes version for this Kubernetes cluster in the format of `major.minor` (e.g. `1.21`), and the latest supported patch version will be deployed.
	K8sVersion pulumi.StringOutput `pulumi:"k8sVersion"`
	// The base64 encoded kubeconfig for the Kubernetes cluster.
	Kubeconfig pulumi.StringOutput `pulumi:"kubeconfig"`
	// This Kubernetes cluster's unique label.
	Label pulumi.StringOutput `pulumi:"label"`
	// Additional nested attributes:
	Pools LkeClusterPoolArrayOutput `pulumi:"pools"`
	// This Kubernetes cluster's location.
	//
	// * `pool` - (Required) The Node Pool specifications for the Kubernetes cluster. At least one Node Pool is required.
	//
	// * `controlPlane` (Optional) Defines settings for the Kubernetes Control Plane.
	Region pulumi.StringOutput `pulumi:"region"`
	// The status of the node. (`ready`, `notReady`)
	Status pulumi.StringOutput `pulumi:"status"`
	// An array of tags applied to the Kubernetes cluster. Tags are for organizational purposes only.
	Tags pulumi.StringArrayOutput `pulumi:"tags"`
}

// NewLkeCluster registers a new resource with the given unique name, arguments, and options.
func NewLkeCluster(ctx *pulumi.Context,
	name string, args *LkeClusterArgs, opts ...pulumi.ResourceOption) (*LkeCluster, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.K8sVersion == nil {
		return nil, errors.New("invalid value for required argument 'K8sVersion'")
	}
	if args.Label == nil {
		return nil, errors.New("invalid value for required argument 'Label'")
	}
	if args.Pools == nil {
		return nil, errors.New("invalid value for required argument 'Pools'")
	}
	if args.Region == nil {
		return nil, errors.New("invalid value for required argument 'Region'")
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"kubeconfig",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource LkeCluster
	err := ctx.RegisterResource("linode:index/lkeCluster:LkeCluster", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLkeCluster gets an existing LkeCluster resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLkeCluster(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LkeClusterState, opts ...pulumi.ResourceOption) (*LkeCluster, error) {
	var resource LkeCluster
	err := ctx.ReadResource("linode:index/lkeCluster:LkeCluster", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering LkeCluster resources.
type lkeClusterState struct {
	// The endpoints for the Kubernetes API server.
	ApiEndpoints []string `pulumi:"apiEndpoints"`
	// Defines settings for the Kubernetes Control Plane.
	ControlPlane *LkeClusterControlPlane `pulumi:"controlPlane"`
	// The Kubernetes Dashboard access URL for this cluster.
	DashboardUrl *string `pulumi:"dashboardUrl"`
	// The desired Kubernetes version for this Kubernetes cluster in the format of `major.minor` (e.g. `1.21`), and the latest supported patch version will be deployed.
	K8sVersion *string `pulumi:"k8sVersion"`
	// The base64 encoded kubeconfig for the Kubernetes cluster.
	Kubeconfig *string `pulumi:"kubeconfig"`
	// This Kubernetes cluster's unique label.
	Label *string `pulumi:"label"`
	// Additional nested attributes:
	Pools []LkeClusterPool `pulumi:"pools"`
	// This Kubernetes cluster's location.
	//
	// * `pool` - (Required) The Node Pool specifications for the Kubernetes cluster. At least one Node Pool is required.
	//
	// * `controlPlane` (Optional) Defines settings for the Kubernetes Control Plane.
	Region *string `pulumi:"region"`
	// The status of the node. (`ready`, `notReady`)
	Status *string `pulumi:"status"`
	// An array of tags applied to the Kubernetes cluster. Tags are for organizational purposes only.
	Tags []string `pulumi:"tags"`
}

type LkeClusterState struct {
	// The endpoints for the Kubernetes API server.
	ApiEndpoints pulumi.StringArrayInput
	// Defines settings for the Kubernetes Control Plane.
	ControlPlane LkeClusterControlPlanePtrInput
	// The Kubernetes Dashboard access URL for this cluster.
	DashboardUrl pulumi.StringPtrInput
	// The desired Kubernetes version for this Kubernetes cluster in the format of `major.minor` (e.g. `1.21`), and the latest supported patch version will be deployed.
	K8sVersion pulumi.StringPtrInput
	// The base64 encoded kubeconfig for the Kubernetes cluster.
	Kubeconfig pulumi.StringPtrInput
	// This Kubernetes cluster's unique label.
	Label pulumi.StringPtrInput
	// Additional nested attributes:
	Pools LkeClusterPoolArrayInput
	// This Kubernetes cluster's location.
	//
	// * `pool` - (Required) The Node Pool specifications for the Kubernetes cluster. At least one Node Pool is required.
	//
	// * `controlPlane` (Optional) Defines settings for the Kubernetes Control Plane.
	Region pulumi.StringPtrInput
	// The status of the node. (`ready`, `notReady`)
	Status pulumi.StringPtrInput
	// An array of tags applied to the Kubernetes cluster. Tags are for organizational purposes only.
	Tags pulumi.StringArrayInput
}

func (LkeClusterState) ElementType() reflect.Type {
	return reflect.TypeOf((*lkeClusterState)(nil)).Elem()
}

type lkeClusterArgs struct {
	// Defines settings for the Kubernetes Control Plane.
	ControlPlane *LkeClusterControlPlane `pulumi:"controlPlane"`
	// The desired Kubernetes version for this Kubernetes cluster in the format of `major.minor` (e.g. `1.21`), and the latest supported patch version will be deployed.
	K8sVersion string `pulumi:"k8sVersion"`
	// This Kubernetes cluster's unique label.
	Label string `pulumi:"label"`
	// Additional nested attributes:
	Pools []LkeClusterPool `pulumi:"pools"`
	// This Kubernetes cluster's location.
	//
	// * `pool` - (Required) The Node Pool specifications for the Kubernetes cluster. At least one Node Pool is required.
	//
	// * `controlPlane` (Optional) Defines settings for the Kubernetes Control Plane.
	Region string `pulumi:"region"`
	// An array of tags applied to the Kubernetes cluster. Tags are for organizational purposes only.
	Tags []string `pulumi:"tags"`
}

// The set of arguments for constructing a LkeCluster resource.
type LkeClusterArgs struct {
	// Defines settings for the Kubernetes Control Plane.
	ControlPlane LkeClusterControlPlanePtrInput
	// The desired Kubernetes version for this Kubernetes cluster in the format of `major.minor` (e.g. `1.21`), and the latest supported patch version will be deployed.
	K8sVersion pulumi.StringInput
	// This Kubernetes cluster's unique label.
	Label pulumi.StringInput
	// Additional nested attributes:
	Pools LkeClusterPoolArrayInput
	// This Kubernetes cluster's location.
	//
	// * `pool` - (Required) The Node Pool specifications for the Kubernetes cluster. At least one Node Pool is required.
	//
	// * `controlPlane` (Optional) Defines settings for the Kubernetes Control Plane.
	Region pulumi.StringInput
	// An array of tags applied to the Kubernetes cluster. Tags are for organizational purposes only.
	Tags pulumi.StringArrayInput
}

func (LkeClusterArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*lkeClusterArgs)(nil)).Elem()
}

type LkeClusterInput interface {
	pulumi.Input

	ToLkeClusterOutput() LkeClusterOutput
	ToLkeClusterOutputWithContext(ctx context.Context) LkeClusterOutput
}

func (*LkeCluster) ElementType() reflect.Type {
	return reflect.TypeOf((**LkeCluster)(nil)).Elem()
}

func (i *LkeCluster) ToLkeClusterOutput() LkeClusterOutput {
	return i.ToLkeClusterOutputWithContext(context.Background())
}

func (i *LkeCluster) ToLkeClusterOutputWithContext(ctx context.Context) LkeClusterOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LkeClusterOutput)
}

// LkeClusterArrayInput is an input type that accepts LkeClusterArray and LkeClusterArrayOutput values.
// You can construct a concrete instance of `LkeClusterArrayInput` via:
//
//	LkeClusterArray{ LkeClusterArgs{...} }
type LkeClusterArrayInput interface {
	pulumi.Input

	ToLkeClusterArrayOutput() LkeClusterArrayOutput
	ToLkeClusterArrayOutputWithContext(context.Context) LkeClusterArrayOutput
}

type LkeClusterArray []LkeClusterInput

func (LkeClusterArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LkeCluster)(nil)).Elem()
}

func (i LkeClusterArray) ToLkeClusterArrayOutput() LkeClusterArrayOutput {
	return i.ToLkeClusterArrayOutputWithContext(context.Background())
}

func (i LkeClusterArray) ToLkeClusterArrayOutputWithContext(ctx context.Context) LkeClusterArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LkeClusterArrayOutput)
}

// LkeClusterMapInput is an input type that accepts LkeClusterMap and LkeClusterMapOutput values.
// You can construct a concrete instance of `LkeClusterMapInput` via:
//
//	LkeClusterMap{ "key": LkeClusterArgs{...} }
type LkeClusterMapInput interface {
	pulumi.Input

	ToLkeClusterMapOutput() LkeClusterMapOutput
	ToLkeClusterMapOutputWithContext(context.Context) LkeClusterMapOutput
}

type LkeClusterMap map[string]LkeClusterInput

func (LkeClusterMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LkeCluster)(nil)).Elem()
}

func (i LkeClusterMap) ToLkeClusterMapOutput() LkeClusterMapOutput {
	return i.ToLkeClusterMapOutputWithContext(context.Background())
}

func (i LkeClusterMap) ToLkeClusterMapOutputWithContext(ctx context.Context) LkeClusterMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LkeClusterMapOutput)
}

type LkeClusterOutput struct{ *pulumi.OutputState }

func (LkeClusterOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**LkeCluster)(nil)).Elem()
}

func (o LkeClusterOutput) ToLkeClusterOutput() LkeClusterOutput {
	return o
}

func (o LkeClusterOutput) ToLkeClusterOutputWithContext(ctx context.Context) LkeClusterOutput {
	return o
}

// The endpoints for the Kubernetes API server.
func (o LkeClusterOutput) ApiEndpoints() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *LkeCluster) pulumi.StringArrayOutput { return v.ApiEndpoints }).(pulumi.StringArrayOutput)
}

// Defines settings for the Kubernetes Control Plane.
func (o LkeClusterOutput) ControlPlane() LkeClusterControlPlaneOutput {
	return o.ApplyT(func(v *LkeCluster) LkeClusterControlPlaneOutput { return v.ControlPlane }).(LkeClusterControlPlaneOutput)
}

// The Kubernetes Dashboard access URL for this cluster.
func (o LkeClusterOutput) DashboardUrl() pulumi.StringOutput {
	return o.ApplyT(func(v *LkeCluster) pulumi.StringOutput { return v.DashboardUrl }).(pulumi.StringOutput)
}

// The desired Kubernetes version for this Kubernetes cluster in the format of `major.minor` (e.g. `1.21`), and the latest supported patch version will be deployed.
func (o LkeClusterOutput) K8sVersion() pulumi.StringOutput {
	return o.ApplyT(func(v *LkeCluster) pulumi.StringOutput { return v.K8sVersion }).(pulumi.StringOutput)
}

// The base64 encoded kubeconfig for the Kubernetes cluster.
func (o LkeClusterOutput) Kubeconfig() pulumi.StringOutput {
	return o.ApplyT(func(v *LkeCluster) pulumi.StringOutput { return v.Kubeconfig }).(pulumi.StringOutput)
}

// This Kubernetes cluster's unique label.
func (o LkeClusterOutput) Label() pulumi.StringOutput {
	return o.ApplyT(func(v *LkeCluster) pulumi.StringOutput { return v.Label }).(pulumi.StringOutput)
}

// Additional nested attributes:
func (o LkeClusterOutput) Pools() LkeClusterPoolArrayOutput {
	return o.ApplyT(func(v *LkeCluster) LkeClusterPoolArrayOutput { return v.Pools }).(LkeClusterPoolArrayOutput)
}

// This Kubernetes cluster's location.
//
// * `pool` - (Required) The Node Pool specifications for the Kubernetes cluster. At least one Node Pool is required.
//
// * `controlPlane` (Optional) Defines settings for the Kubernetes Control Plane.
func (o LkeClusterOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v *LkeCluster) pulumi.StringOutput { return v.Region }).(pulumi.StringOutput)
}

// The status of the node. (`ready`, `notReady`)
func (o LkeClusterOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *LkeCluster) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// An array of tags applied to the Kubernetes cluster. Tags are for organizational purposes only.
func (o LkeClusterOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *LkeCluster) pulumi.StringArrayOutput { return v.Tags }).(pulumi.StringArrayOutput)
}

type LkeClusterArrayOutput struct{ *pulumi.OutputState }

func (LkeClusterArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LkeCluster)(nil)).Elem()
}

func (o LkeClusterArrayOutput) ToLkeClusterArrayOutput() LkeClusterArrayOutput {
	return o
}

func (o LkeClusterArrayOutput) ToLkeClusterArrayOutputWithContext(ctx context.Context) LkeClusterArrayOutput {
	return o
}

func (o LkeClusterArrayOutput) Index(i pulumi.IntInput) LkeClusterOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *LkeCluster {
		return vs[0].([]*LkeCluster)[vs[1].(int)]
	}).(LkeClusterOutput)
}

type LkeClusterMapOutput struct{ *pulumi.OutputState }

func (LkeClusterMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LkeCluster)(nil)).Elem()
}

func (o LkeClusterMapOutput) ToLkeClusterMapOutput() LkeClusterMapOutput {
	return o
}

func (o LkeClusterMapOutput) ToLkeClusterMapOutputWithContext(ctx context.Context) LkeClusterMapOutput {
	return o
}

func (o LkeClusterMapOutput) MapIndex(k pulumi.StringInput) LkeClusterOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *LkeCluster {
		return vs[0].(map[string]*LkeCluster)[vs[1].(string)]
	}).(LkeClusterOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*LkeClusterInput)(nil)).Elem(), &LkeCluster{})
	pulumi.RegisterInputType(reflect.TypeOf((*LkeClusterArrayInput)(nil)).Elem(), LkeClusterArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*LkeClusterMapInput)(nil)).Elem(), LkeClusterMap{})
	pulumi.RegisterOutputType(LkeClusterOutput{})
	pulumi.RegisterOutputType(LkeClusterArrayOutput{})
	pulumi.RegisterOutputType(LkeClusterMapOutput{})
}
