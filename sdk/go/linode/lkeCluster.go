// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Manages an LKE cluster.
//
// ## Example Usage
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
// 		_, err := linode.NewLkeCluster(ctx, "my_cluster", &linode.LkeClusterArgs{
// 			K8sVersion: pulumi.String("1.17"),
// 			Label:      pulumi.String("my-cluster"),
// 			Pools: linode.LkeClusterPoolArray{
// 				&linode.LkeClusterPoolArgs{
// 					Count: pulumi.Int(3),
// 					Type:  pulumi.String("g6-standard-2"),
// 				},
// 			},
// 			Region: pulumi.String("us-central"),
// 			Tags: pulumi.StringArray{
// 				pulumi.String("prod"),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// LKE Clusters can be imported using the `id`, e.g.
//
// ```sh
//  $ pulumi import linode:index/lkeCluster:LkeCluster my_cluster 12345
// ```
type LkeCluster struct {
	pulumi.CustomResourceState

	// The endpoints for the Kubernetes API server.
	ApiEndpoints pulumi.StringArrayOutput `pulumi:"apiEndpoints"`
	// The desired Kubernetes version for this Kubernetes cluster in the format of `major.minor` (e.g. `1.17`), and the latest supported patch version will be deployed.
	K8sVersion pulumi.StringOutput `pulumi:"k8sVersion"`
	// The base64 encoded kubeconfig for the Kubernetes cluster.
	Kubeconfig pulumi.StringOutput `pulumi:"kubeconfig"`
	// This Kubernetes cluster's unique label.
	Label pulumi.StringOutput `pulumi:"label"`
	// Additional nested attributes:
	Pools LkeClusterPoolArrayOutput `pulumi:"pools"`
	// This Kubernetes cluster's location.
	Region pulumi.StringOutput `pulumi:"region"`
	// The status of the node.
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
	// The desired Kubernetes version for this Kubernetes cluster in the format of `major.minor` (e.g. `1.17`), and the latest supported patch version will be deployed.
	K8sVersion *string `pulumi:"k8sVersion"`
	// The base64 encoded kubeconfig for the Kubernetes cluster.
	Kubeconfig *string `pulumi:"kubeconfig"`
	// This Kubernetes cluster's unique label.
	Label *string `pulumi:"label"`
	// Additional nested attributes:
	Pools []LkeClusterPool `pulumi:"pools"`
	// This Kubernetes cluster's location.
	Region *string `pulumi:"region"`
	// The status of the node.
	Status *string `pulumi:"status"`
	// An array of tags applied to the Kubernetes cluster. Tags are for organizational purposes only.
	Tags []string `pulumi:"tags"`
}

type LkeClusterState struct {
	// The endpoints for the Kubernetes API server.
	ApiEndpoints pulumi.StringArrayInput
	// The desired Kubernetes version for this Kubernetes cluster in the format of `major.minor` (e.g. `1.17`), and the latest supported patch version will be deployed.
	K8sVersion pulumi.StringPtrInput
	// The base64 encoded kubeconfig for the Kubernetes cluster.
	Kubeconfig pulumi.StringPtrInput
	// This Kubernetes cluster's unique label.
	Label pulumi.StringPtrInput
	// Additional nested attributes:
	Pools LkeClusterPoolArrayInput
	// This Kubernetes cluster's location.
	Region pulumi.StringPtrInput
	// The status of the node.
	Status pulumi.StringPtrInput
	// An array of tags applied to the Kubernetes cluster. Tags are for organizational purposes only.
	Tags pulumi.StringArrayInput
}

func (LkeClusterState) ElementType() reflect.Type {
	return reflect.TypeOf((*lkeClusterState)(nil)).Elem()
}

type lkeClusterArgs struct {
	// The desired Kubernetes version for this Kubernetes cluster in the format of `major.minor` (e.g. `1.17`), and the latest supported patch version will be deployed.
	K8sVersion string `pulumi:"k8sVersion"`
	// This Kubernetes cluster's unique label.
	Label string `pulumi:"label"`
	// Additional nested attributes:
	Pools []LkeClusterPool `pulumi:"pools"`
	// This Kubernetes cluster's location.
	Region string `pulumi:"region"`
	// An array of tags applied to the Kubernetes cluster. Tags are for organizational purposes only.
	Tags []string `pulumi:"tags"`
}

// The set of arguments for constructing a LkeCluster resource.
type LkeClusterArgs struct {
	// The desired Kubernetes version for this Kubernetes cluster in the format of `major.minor` (e.g. `1.17`), and the latest supported patch version will be deployed.
	K8sVersion pulumi.StringInput
	// This Kubernetes cluster's unique label.
	Label pulumi.StringInput
	// Additional nested attributes:
	Pools LkeClusterPoolArrayInput
	// This Kubernetes cluster's location.
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
	return reflect.TypeOf((*LkeCluster)(nil))
}

func (i *LkeCluster) ToLkeClusterOutput() LkeClusterOutput {
	return i.ToLkeClusterOutputWithContext(context.Background())
}

func (i *LkeCluster) ToLkeClusterOutputWithContext(ctx context.Context) LkeClusterOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LkeClusterOutput)
}

type LkeClusterOutput struct {
	*pulumi.OutputState
}

func (LkeClusterOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LkeCluster)(nil))
}

func (o LkeClusterOutput) ToLkeClusterOutput() LkeClusterOutput {
	return o
}

func (o LkeClusterOutput) ToLkeClusterOutputWithContext(ctx context.Context) LkeClusterOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(LkeClusterOutput{})
}
