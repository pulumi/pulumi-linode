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

// ## Import
//
// LKE Node Pools can be imported using the `cluster_id,id`, e.g.
//
// ```sh
// $ pulumi import linode:index/lkeNodePool:LkeNodePool my_pool 150003,12345
// ```
type LkeNodePool struct {
	pulumi.CustomResourceState

	Autoscaler LkeNodePoolAutoscalerPtrOutput `pulumi:"autoscaler"`
	// ID of the LKE Cluster where to create the current Node Pool.
	ClusterId pulumi.IntOutput `pulumi:"clusterId"`
	// A map attribute containing key-value pairs to be added as labels to nodes in the node pool. Labels help classify your nodes and to easily select subsets of objects. To learn more, review [Add Labels and Taints to your LKE Node Pools](https://www.linode.com/docs/products/compute/kubernetes/guides/deploy-and-manage-cluster-with-the-linode-api/#add-labels-and-taints-to-your-lke-node-pools).
	//
	// * `autoscaler` - (Optional) If defined, an autoscaler will be enabled with the given configuration.
	//
	// * `taint` - (Optional) Kubernetes taints to add to node pool nodes. Taints help control how pods are scheduled onto nodes, specifically allowing them to repel certain pods. To learn more, review [Add Labels and Taints to your LKE Node Pools](https://www.linode.com/docs/products/compute/kubernetes/guides/deploy-and-manage-cluster-with-the-linode-api/#add-labels-and-taints-to-your-lke-node-pools).
	Labels pulumi.StringMapOutput `pulumi:"labels"`
	// The number of nodes in the Node Pool. If undefined with an autoscaler the initial node count will equal the autoscaler minimum.
	NodeCount pulumi.IntOutput `pulumi:"nodeCount"`
	// A list of nodes in the node pool.
	Nodes LkeNodePoolNodeArrayOutput `pulumi:"nodes"`
	// An array of tags applied to the Node Pool. Tags can be used to flag node pools as externally managed, see Externally Managed Node Pools for more details.
	Tags pulumi.StringArrayOutput `pulumi:"tags"`
	// Kubernetes taints to add to node pool nodes. Taints help control how pods are scheduled onto nodes, specifically
	// allowing them to repel certain pods.
	Taints LkeNodePoolTaintArrayOutput `pulumi:"taints"`
	// A Linode Type for all nodes in the Node Pool. See all node types [here](https://api.linode.com/v4/linode/types).
	Type pulumi.StringOutput `pulumi:"type"`
}

// NewLkeNodePool registers a new resource with the given unique name, arguments, and options.
func NewLkeNodePool(ctx *pulumi.Context,
	name string, args *LkeNodePoolArgs, opts ...pulumi.ResourceOption) (*LkeNodePool, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ClusterId == nil {
		return nil, errors.New("invalid value for required argument 'ClusterId'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource LkeNodePool
	err := ctx.RegisterResource("linode:index/lkeNodePool:LkeNodePool", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLkeNodePool gets an existing LkeNodePool resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLkeNodePool(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LkeNodePoolState, opts ...pulumi.ResourceOption) (*LkeNodePool, error) {
	var resource LkeNodePool
	err := ctx.ReadResource("linode:index/lkeNodePool:LkeNodePool", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering LkeNodePool resources.
type lkeNodePoolState struct {
	Autoscaler *LkeNodePoolAutoscaler `pulumi:"autoscaler"`
	// ID of the LKE Cluster where to create the current Node Pool.
	ClusterId *int `pulumi:"clusterId"`
	// A map attribute containing key-value pairs to be added as labels to nodes in the node pool. Labels help classify your nodes and to easily select subsets of objects. To learn more, review [Add Labels and Taints to your LKE Node Pools](https://www.linode.com/docs/products/compute/kubernetes/guides/deploy-and-manage-cluster-with-the-linode-api/#add-labels-and-taints-to-your-lke-node-pools).
	//
	// * `autoscaler` - (Optional) If defined, an autoscaler will be enabled with the given configuration.
	//
	// * `taint` - (Optional) Kubernetes taints to add to node pool nodes. Taints help control how pods are scheduled onto nodes, specifically allowing them to repel certain pods. To learn more, review [Add Labels and Taints to your LKE Node Pools](https://www.linode.com/docs/products/compute/kubernetes/guides/deploy-and-manage-cluster-with-the-linode-api/#add-labels-and-taints-to-your-lke-node-pools).
	Labels map[string]string `pulumi:"labels"`
	// The number of nodes in the Node Pool. If undefined with an autoscaler the initial node count will equal the autoscaler minimum.
	NodeCount *int `pulumi:"nodeCount"`
	// A list of nodes in the node pool.
	Nodes []LkeNodePoolNode `pulumi:"nodes"`
	// An array of tags applied to the Node Pool. Tags can be used to flag node pools as externally managed, see Externally Managed Node Pools for more details.
	Tags []string `pulumi:"tags"`
	// Kubernetes taints to add to node pool nodes. Taints help control how pods are scheduled onto nodes, specifically
	// allowing them to repel certain pods.
	Taints []LkeNodePoolTaint `pulumi:"taints"`
	// A Linode Type for all nodes in the Node Pool. See all node types [here](https://api.linode.com/v4/linode/types).
	Type *string `pulumi:"type"`
}

type LkeNodePoolState struct {
	Autoscaler LkeNodePoolAutoscalerPtrInput
	// ID of the LKE Cluster where to create the current Node Pool.
	ClusterId pulumi.IntPtrInput
	// A map attribute containing key-value pairs to be added as labels to nodes in the node pool. Labels help classify your nodes and to easily select subsets of objects. To learn more, review [Add Labels and Taints to your LKE Node Pools](https://www.linode.com/docs/products/compute/kubernetes/guides/deploy-and-manage-cluster-with-the-linode-api/#add-labels-and-taints-to-your-lke-node-pools).
	//
	// * `autoscaler` - (Optional) If defined, an autoscaler will be enabled with the given configuration.
	//
	// * `taint` - (Optional) Kubernetes taints to add to node pool nodes. Taints help control how pods are scheduled onto nodes, specifically allowing them to repel certain pods. To learn more, review [Add Labels and Taints to your LKE Node Pools](https://www.linode.com/docs/products/compute/kubernetes/guides/deploy-and-manage-cluster-with-the-linode-api/#add-labels-and-taints-to-your-lke-node-pools).
	Labels pulumi.StringMapInput
	// The number of nodes in the Node Pool. If undefined with an autoscaler the initial node count will equal the autoscaler minimum.
	NodeCount pulumi.IntPtrInput
	// A list of nodes in the node pool.
	Nodes LkeNodePoolNodeArrayInput
	// An array of tags applied to the Node Pool. Tags can be used to flag node pools as externally managed, see Externally Managed Node Pools for more details.
	Tags pulumi.StringArrayInput
	// Kubernetes taints to add to node pool nodes. Taints help control how pods are scheduled onto nodes, specifically
	// allowing them to repel certain pods.
	Taints LkeNodePoolTaintArrayInput
	// A Linode Type for all nodes in the Node Pool. See all node types [here](https://api.linode.com/v4/linode/types).
	Type pulumi.StringPtrInput
}

func (LkeNodePoolState) ElementType() reflect.Type {
	return reflect.TypeOf((*lkeNodePoolState)(nil)).Elem()
}

type lkeNodePoolArgs struct {
	Autoscaler *LkeNodePoolAutoscaler `pulumi:"autoscaler"`
	// ID of the LKE Cluster where to create the current Node Pool.
	ClusterId int `pulumi:"clusterId"`
	// A map attribute containing key-value pairs to be added as labels to nodes in the node pool. Labels help classify your nodes and to easily select subsets of objects. To learn more, review [Add Labels and Taints to your LKE Node Pools](https://www.linode.com/docs/products/compute/kubernetes/guides/deploy-and-manage-cluster-with-the-linode-api/#add-labels-and-taints-to-your-lke-node-pools).
	//
	// * `autoscaler` - (Optional) If defined, an autoscaler will be enabled with the given configuration.
	//
	// * `taint` - (Optional) Kubernetes taints to add to node pool nodes. Taints help control how pods are scheduled onto nodes, specifically allowing them to repel certain pods. To learn more, review [Add Labels and Taints to your LKE Node Pools](https://www.linode.com/docs/products/compute/kubernetes/guides/deploy-and-manage-cluster-with-the-linode-api/#add-labels-and-taints-to-your-lke-node-pools).
	Labels map[string]string `pulumi:"labels"`
	// The number of nodes in the Node Pool. If undefined with an autoscaler the initial node count will equal the autoscaler minimum.
	NodeCount *int `pulumi:"nodeCount"`
	// An array of tags applied to the Node Pool. Tags can be used to flag node pools as externally managed, see Externally Managed Node Pools for more details.
	Tags []string `pulumi:"tags"`
	// Kubernetes taints to add to node pool nodes. Taints help control how pods are scheduled onto nodes, specifically
	// allowing them to repel certain pods.
	Taints []LkeNodePoolTaint `pulumi:"taints"`
	// A Linode Type for all nodes in the Node Pool. See all node types [here](https://api.linode.com/v4/linode/types).
	Type string `pulumi:"type"`
}

// The set of arguments for constructing a LkeNodePool resource.
type LkeNodePoolArgs struct {
	Autoscaler LkeNodePoolAutoscalerPtrInput
	// ID of the LKE Cluster where to create the current Node Pool.
	ClusterId pulumi.IntInput
	// A map attribute containing key-value pairs to be added as labels to nodes in the node pool. Labels help classify your nodes and to easily select subsets of objects. To learn more, review [Add Labels and Taints to your LKE Node Pools](https://www.linode.com/docs/products/compute/kubernetes/guides/deploy-and-manage-cluster-with-the-linode-api/#add-labels-and-taints-to-your-lke-node-pools).
	//
	// * `autoscaler` - (Optional) If defined, an autoscaler will be enabled with the given configuration.
	//
	// * `taint` - (Optional) Kubernetes taints to add to node pool nodes. Taints help control how pods are scheduled onto nodes, specifically allowing them to repel certain pods. To learn more, review [Add Labels and Taints to your LKE Node Pools](https://www.linode.com/docs/products/compute/kubernetes/guides/deploy-and-manage-cluster-with-the-linode-api/#add-labels-and-taints-to-your-lke-node-pools).
	Labels pulumi.StringMapInput
	// The number of nodes in the Node Pool. If undefined with an autoscaler the initial node count will equal the autoscaler minimum.
	NodeCount pulumi.IntPtrInput
	// An array of tags applied to the Node Pool. Tags can be used to flag node pools as externally managed, see Externally Managed Node Pools for more details.
	Tags pulumi.StringArrayInput
	// Kubernetes taints to add to node pool nodes. Taints help control how pods are scheduled onto nodes, specifically
	// allowing them to repel certain pods.
	Taints LkeNodePoolTaintArrayInput
	// A Linode Type for all nodes in the Node Pool. See all node types [here](https://api.linode.com/v4/linode/types).
	Type pulumi.StringInput
}

func (LkeNodePoolArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*lkeNodePoolArgs)(nil)).Elem()
}

type LkeNodePoolInput interface {
	pulumi.Input

	ToLkeNodePoolOutput() LkeNodePoolOutput
	ToLkeNodePoolOutputWithContext(ctx context.Context) LkeNodePoolOutput
}

func (*LkeNodePool) ElementType() reflect.Type {
	return reflect.TypeOf((**LkeNodePool)(nil)).Elem()
}

func (i *LkeNodePool) ToLkeNodePoolOutput() LkeNodePoolOutput {
	return i.ToLkeNodePoolOutputWithContext(context.Background())
}

func (i *LkeNodePool) ToLkeNodePoolOutputWithContext(ctx context.Context) LkeNodePoolOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LkeNodePoolOutput)
}

// LkeNodePoolArrayInput is an input type that accepts LkeNodePoolArray and LkeNodePoolArrayOutput values.
// You can construct a concrete instance of `LkeNodePoolArrayInput` via:
//
//	LkeNodePoolArray{ LkeNodePoolArgs{...} }
type LkeNodePoolArrayInput interface {
	pulumi.Input

	ToLkeNodePoolArrayOutput() LkeNodePoolArrayOutput
	ToLkeNodePoolArrayOutputWithContext(context.Context) LkeNodePoolArrayOutput
}

type LkeNodePoolArray []LkeNodePoolInput

func (LkeNodePoolArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LkeNodePool)(nil)).Elem()
}

func (i LkeNodePoolArray) ToLkeNodePoolArrayOutput() LkeNodePoolArrayOutput {
	return i.ToLkeNodePoolArrayOutputWithContext(context.Background())
}

func (i LkeNodePoolArray) ToLkeNodePoolArrayOutputWithContext(ctx context.Context) LkeNodePoolArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LkeNodePoolArrayOutput)
}

// LkeNodePoolMapInput is an input type that accepts LkeNodePoolMap and LkeNodePoolMapOutput values.
// You can construct a concrete instance of `LkeNodePoolMapInput` via:
//
//	LkeNodePoolMap{ "key": LkeNodePoolArgs{...} }
type LkeNodePoolMapInput interface {
	pulumi.Input

	ToLkeNodePoolMapOutput() LkeNodePoolMapOutput
	ToLkeNodePoolMapOutputWithContext(context.Context) LkeNodePoolMapOutput
}

type LkeNodePoolMap map[string]LkeNodePoolInput

func (LkeNodePoolMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LkeNodePool)(nil)).Elem()
}

func (i LkeNodePoolMap) ToLkeNodePoolMapOutput() LkeNodePoolMapOutput {
	return i.ToLkeNodePoolMapOutputWithContext(context.Background())
}

func (i LkeNodePoolMap) ToLkeNodePoolMapOutputWithContext(ctx context.Context) LkeNodePoolMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LkeNodePoolMapOutput)
}

type LkeNodePoolOutput struct{ *pulumi.OutputState }

func (LkeNodePoolOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**LkeNodePool)(nil)).Elem()
}

func (o LkeNodePoolOutput) ToLkeNodePoolOutput() LkeNodePoolOutput {
	return o
}

func (o LkeNodePoolOutput) ToLkeNodePoolOutputWithContext(ctx context.Context) LkeNodePoolOutput {
	return o
}

func (o LkeNodePoolOutput) Autoscaler() LkeNodePoolAutoscalerPtrOutput {
	return o.ApplyT(func(v *LkeNodePool) LkeNodePoolAutoscalerPtrOutput { return v.Autoscaler }).(LkeNodePoolAutoscalerPtrOutput)
}

// ID of the LKE Cluster where to create the current Node Pool.
func (o LkeNodePoolOutput) ClusterId() pulumi.IntOutput {
	return o.ApplyT(func(v *LkeNodePool) pulumi.IntOutput { return v.ClusterId }).(pulumi.IntOutput)
}

// A map attribute containing key-value pairs to be added as labels to nodes in the node pool. Labels help classify your nodes and to easily select subsets of objects. To learn more, review [Add Labels and Taints to your LKE Node Pools](https://www.linode.com/docs/products/compute/kubernetes/guides/deploy-and-manage-cluster-with-the-linode-api/#add-labels-and-taints-to-your-lke-node-pools).
//
// * `autoscaler` - (Optional) If defined, an autoscaler will be enabled with the given configuration.
//
// * `taint` - (Optional) Kubernetes taints to add to node pool nodes. Taints help control how pods are scheduled onto nodes, specifically allowing them to repel certain pods. To learn more, review [Add Labels and Taints to your LKE Node Pools](https://www.linode.com/docs/products/compute/kubernetes/guides/deploy-and-manage-cluster-with-the-linode-api/#add-labels-and-taints-to-your-lke-node-pools).
func (o LkeNodePoolOutput) Labels() pulumi.StringMapOutput {
	return o.ApplyT(func(v *LkeNodePool) pulumi.StringMapOutput { return v.Labels }).(pulumi.StringMapOutput)
}

// The number of nodes in the Node Pool. If undefined with an autoscaler the initial node count will equal the autoscaler minimum.
func (o LkeNodePoolOutput) NodeCount() pulumi.IntOutput {
	return o.ApplyT(func(v *LkeNodePool) pulumi.IntOutput { return v.NodeCount }).(pulumi.IntOutput)
}

// A list of nodes in the node pool.
func (o LkeNodePoolOutput) Nodes() LkeNodePoolNodeArrayOutput {
	return o.ApplyT(func(v *LkeNodePool) LkeNodePoolNodeArrayOutput { return v.Nodes }).(LkeNodePoolNodeArrayOutput)
}

// An array of tags applied to the Node Pool. Tags can be used to flag node pools as externally managed, see Externally Managed Node Pools for more details.
func (o LkeNodePoolOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *LkeNodePool) pulumi.StringArrayOutput { return v.Tags }).(pulumi.StringArrayOutput)
}

// Kubernetes taints to add to node pool nodes. Taints help control how pods are scheduled onto nodes, specifically
// allowing them to repel certain pods.
func (o LkeNodePoolOutput) Taints() LkeNodePoolTaintArrayOutput {
	return o.ApplyT(func(v *LkeNodePool) LkeNodePoolTaintArrayOutput { return v.Taints }).(LkeNodePoolTaintArrayOutput)
}

// A Linode Type for all nodes in the Node Pool. See all node types [here](https://api.linode.com/v4/linode/types).
func (o LkeNodePoolOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *LkeNodePool) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

type LkeNodePoolArrayOutput struct{ *pulumi.OutputState }

func (LkeNodePoolArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LkeNodePool)(nil)).Elem()
}

func (o LkeNodePoolArrayOutput) ToLkeNodePoolArrayOutput() LkeNodePoolArrayOutput {
	return o
}

func (o LkeNodePoolArrayOutput) ToLkeNodePoolArrayOutputWithContext(ctx context.Context) LkeNodePoolArrayOutput {
	return o
}

func (o LkeNodePoolArrayOutput) Index(i pulumi.IntInput) LkeNodePoolOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *LkeNodePool {
		return vs[0].([]*LkeNodePool)[vs[1].(int)]
	}).(LkeNodePoolOutput)
}

type LkeNodePoolMapOutput struct{ *pulumi.OutputState }

func (LkeNodePoolMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LkeNodePool)(nil)).Elem()
}

func (o LkeNodePoolMapOutput) ToLkeNodePoolMapOutput() LkeNodePoolMapOutput {
	return o
}

func (o LkeNodePoolMapOutput) ToLkeNodePoolMapOutputWithContext(ctx context.Context) LkeNodePoolMapOutput {
	return o
}

func (o LkeNodePoolMapOutput) MapIndex(k pulumi.StringInput) LkeNodePoolOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *LkeNodePool {
		return vs[0].(map[string]*LkeNodePool)[vs[1].(string)]
	}).(LkeNodePoolOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*LkeNodePoolInput)(nil)).Elem(), &LkeNodePool{})
	pulumi.RegisterInputType(reflect.TypeOf((*LkeNodePoolArrayInput)(nil)).Elem(), LkeNodePoolArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*LkeNodePoolMapInput)(nil)).Elem(), LkeNodePoolMap{})
	pulumi.RegisterOutputType(LkeNodePoolOutput{})
	pulumi.RegisterOutputType(LkeNodePoolArrayOutput{})
	pulumi.RegisterOutputType(LkeNodePoolMapOutput{})
}
