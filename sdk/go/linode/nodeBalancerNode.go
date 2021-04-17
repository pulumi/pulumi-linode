// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Linode NodeBalancer Node resource.  This can be used to create, modify, and delete Linodes NodeBalancer Nodes.
// For more information, see [Getting Started with NodeBalancers](https://www.linode.com/docs/platform/nodebalancer/getting-started-with-nodebalancers/) and the [Linode APIv4 docs](https://developers.linode.com/api/v4#operation/createNodeBalancerNode).
//
// ## Attributes
//
// This resource exports the following attributes:
//
// * `status` - The current status of this node, based on the configured checks of its NodeBalancer Config. (unknown, UP, DOWN).
//
// * `configId` - The ID of the NodeBalancerConfig this NodeBalancerNode is attached to.
//
// * `nodebalancerId` - The ID of the NodeBalancer this NodeBalancerNode is attached to.
//
// ## Import
//
// NodeBalancer Nodes can be imported using the NodeBalancer `nodebalancer_id` followed by the NodeBalancer Config `config_id` followed by the NodeBalancer Node `id`, separated by a comma, e.g.
//
// ```sh
//  $ pulumi import linode:index/nodeBalancerNode:NodeBalancerNode https-foobar-1 1234567,7654321,9999999
// ```
//
//  The Linode Guide, [Import Existing Infrastructure to Terraform](https://www.linode.com/docs/applications/configuration-management/import-existing-infrastructure-to-terraform/), offers resource importing examples for NodeBalancer Nodes and other Linode resource types.
type NodeBalancerNode struct {
	pulumi.CustomResourceState

	// The private IP Address where this backend can be reached. This must be a private IP address.
	Address pulumi.StringOutput `pulumi:"address"`
	// The ID of the NodeBalancerConfig to access.
	ConfigId pulumi.IntOutput `pulumi:"configId"`
	// The label of the Linode NodeBalancer Node. This is for display purposes only.
	Label pulumi.StringOutput `pulumi:"label"`
	// The mode this NodeBalancer should use when sending traffic to this backend. If set to `accept` this backend is accepting traffic. If set to `reject` this backend will not receive traffic. If set to `drain` this backend will not receive new traffic, but connections already pinned to it will continue to be routed to it
	Mode pulumi.StringOutput `pulumi:"mode"`
	// The ID of the NodeBalancer to access.
	NodebalancerId pulumi.IntOutput `pulumi:"nodebalancerId"`
	// The current status of this node, based on the configured checks of its NodeBalancer Config. (unknown, UP, DOWN)
	Status pulumi.StringOutput `pulumi:"status"`
	// Used when picking a backend to serve a request and is not pinned to a single backend yet. Nodes with a higher weight will receive more traffic. (1-255).
	Weight pulumi.IntOutput `pulumi:"weight"`
}

// NewNodeBalancerNode registers a new resource with the given unique name, arguments, and options.
func NewNodeBalancerNode(ctx *pulumi.Context,
	name string, args *NodeBalancerNodeArgs, opts ...pulumi.ResourceOption) (*NodeBalancerNode, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Address == nil {
		return nil, errors.New("invalid value for required argument 'Address'")
	}
	if args.ConfigId == nil {
		return nil, errors.New("invalid value for required argument 'ConfigId'")
	}
	if args.Label == nil {
		return nil, errors.New("invalid value for required argument 'Label'")
	}
	if args.NodebalancerId == nil {
		return nil, errors.New("invalid value for required argument 'NodebalancerId'")
	}
	var resource NodeBalancerNode
	err := ctx.RegisterResource("linode:index/nodeBalancerNode:NodeBalancerNode", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetNodeBalancerNode gets an existing NodeBalancerNode resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetNodeBalancerNode(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *NodeBalancerNodeState, opts ...pulumi.ResourceOption) (*NodeBalancerNode, error) {
	var resource NodeBalancerNode
	err := ctx.ReadResource("linode:index/nodeBalancerNode:NodeBalancerNode", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering NodeBalancerNode resources.
type nodeBalancerNodeState struct {
	// The private IP Address where this backend can be reached. This must be a private IP address.
	Address *string `pulumi:"address"`
	// The ID of the NodeBalancerConfig to access.
	ConfigId *int `pulumi:"configId"`
	// The label of the Linode NodeBalancer Node. This is for display purposes only.
	Label *string `pulumi:"label"`
	// The mode this NodeBalancer should use when sending traffic to this backend. If set to `accept` this backend is accepting traffic. If set to `reject` this backend will not receive traffic. If set to `drain` this backend will not receive new traffic, but connections already pinned to it will continue to be routed to it
	Mode *string `pulumi:"mode"`
	// The ID of the NodeBalancer to access.
	NodebalancerId *int `pulumi:"nodebalancerId"`
	// The current status of this node, based on the configured checks of its NodeBalancer Config. (unknown, UP, DOWN)
	Status *string `pulumi:"status"`
	// Used when picking a backend to serve a request and is not pinned to a single backend yet. Nodes with a higher weight will receive more traffic. (1-255).
	Weight *int `pulumi:"weight"`
}

type NodeBalancerNodeState struct {
	// The private IP Address where this backend can be reached. This must be a private IP address.
	Address pulumi.StringPtrInput
	// The ID of the NodeBalancerConfig to access.
	ConfigId pulumi.IntPtrInput
	// The label of the Linode NodeBalancer Node. This is for display purposes only.
	Label pulumi.StringPtrInput
	// The mode this NodeBalancer should use when sending traffic to this backend. If set to `accept` this backend is accepting traffic. If set to `reject` this backend will not receive traffic. If set to `drain` this backend will not receive new traffic, but connections already pinned to it will continue to be routed to it
	Mode pulumi.StringPtrInput
	// The ID of the NodeBalancer to access.
	NodebalancerId pulumi.IntPtrInput
	// The current status of this node, based on the configured checks of its NodeBalancer Config. (unknown, UP, DOWN)
	Status pulumi.StringPtrInput
	// Used when picking a backend to serve a request and is not pinned to a single backend yet. Nodes with a higher weight will receive more traffic. (1-255).
	Weight pulumi.IntPtrInput
}

func (NodeBalancerNodeState) ElementType() reflect.Type {
	return reflect.TypeOf((*nodeBalancerNodeState)(nil)).Elem()
}

type nodeBalancerNodeArgs struct {
	// The private IP Address where this backend can be reached. This must be a private IP address.
	Address string `pulumi:"address"`
	// The ID of the NodeBalancerConfig to access.
	ConfigId int `pulumi:"configId"`
	// The label of the Linode NodeBalancer Node. This is for display purposes only.
	Label string `pulumi:"label"`
	// The mode this NodeBalancer should use when sending traffic to this backend. If set to `accept` this backend is accepting traffic. If set to `reject` this backend will not receive traffic. If set to `drain` this backend will not receive new traffic, but connections already pinned to it will continue to be routed to it
	Mode *string `pulumi:"mode"`
	// The ID of the NodeBalancer to access.
	NodebalancerId int `pulumi:"nodebalancerId"`
	// Used when picking a backend to serve a request and is not pinned to a single backend yet. Nodes with a higher weight will receive more traffic. (1-255).
	Weight *int `pulumi:"weight"`
}

// The set of arguments for constructing a NodeBalancerNode resource.
type NodeBalancerNodeArgs struct {
	// The private IP Address where this backend can be reached. This must be a private IP address.
	Address pulumi.StringInput
	// The ID of the NodeBalancerConfig to access.
	ConfigId pulumi.IntInput
	// The label of the Linode NodeBalancer Node. This is for display purposes only.
	Label pulumi.StringInput
	// The mode this NodeBalancer should use when sending traffic to this backend. If set to `accept` this backend is accepting traffic. If set to `reject` this backend will not receive traffic. If set to `drain` this backend will not receive new traffic, but connections already pinned to it will continue to be routed to it
	Mode pulumi.StringPtrInput
	// The ID of the NodeBalancer to access.
	NodebalancerId pulumi.IntInput
	// Used when picking a backend to serve a request and is not pinned to a single backend yet. Nodes with a higher weight will receive more traffic. (1-255).
	Weight pulumi.IntPtrInput
}

func (NodeBalancerNodeArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*nodeBalancerNodeArgs)(nil)).Elem()
}

type NodeBalancerNodeInput interface {
	pulumi.Input

	ToNodeBalancerNodeOutput() NodeBalancerNodeOutput
	ToNodeBalancerNodeOutputWithContext(ctx context.Context) NodeBalancerNodeOutput
}

func (*NodeBalancerNode) ElementType() reflect.Type {
	return reflect.TypeOf((*NodeBalancerNode)(nil))
}

func (i *NodeBalancerNode) ToNodeBalancerNodeOutput() NodeBalancerNodeOutput {
	return i.ToNodeBalancerNodeOutputWithContext(context.Background())
}

func (i *NodeBalancerNode) ToNodeBalancerNodeOutputWithContext(ctx context.Context) NodeBalancerNodeOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NodeBalancerNodeOutput)
}

func (i *NodeBalancerNode) ToNodeBalancerNodePtrOutput() NodeBalancerNodePtrOutput {
	return i.ToNodeBalancerNodePtrOutputWithContext(context.Background())
}

func (i *NodeBalancerNode) ToNodeBalancerNodePtrOutputWithContext(ctx context.Context) NodeBalancerNodePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NodeBalancerNodePtrOutput)
}

type NodeBalancerNodePtrInput interface {
	pulumi.Input

	ToNodeBalancerNodePtrOutput() NodeBalancerNodePtrOutput
	ToNodeBalancerNodePtrOutputWithContext(ctx context.Context) NodeBalancerNodePtrOutput
}

type nodeBalancerNodePtrType NodeBalancerNodeArgs

func (*nodeBalancerNodePtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**NodeBalancerNode)(nil))
}

func (i *nodeBalancerNodePtrType) ToNodeBalancerNodePtrOutput() NodeBalancerNodePtrOutput {
	return i.ToNodeBalancerNodePtrOutputWithContext(context.Background())
}

func (i *nodeBalancerNodePtrType) ToNodeBalancerNodePtrOutputWithContext(ctx context.Context) NodeBalancerNodePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NodeBalancerNodePtrOutput)
}

// NodeBalancerNodeArrayInput is an input type that accepts NodeBalancerNodeArray and NodeBalancerNodeArrayOutput values.
// You can construct a concrete instance of `NodeBalancerNodeArrayInput` via:
//
//          NodeBalancerNodeArray{ NodeBalancerNodeArgs{...} }
type NodeBalancerNodeArrayInput interface {
	pulumi.Input

	ToNodeBalancerNodeArrayOutput() NodeBalancerNodeArrayOutput
	ToNodeBalancerNodeArrayOutputWithContext(context.Context) NodeBalancerNodeArrayOutput
}

type NodeBalancerNodeArray []NodeBalancerNodeInput

func (NodeBalancerNodeArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*NodeBalancerNode)(nil))
}

func (i NodeBalancerNodeArray) ToNodeBalancerNodeArrayOutput() NodeBalancerNodeArrayOutput {
	return i.ToNodeBalancerNodeArrayOutputWithContext(context.Background())
}

func (i NodeBalancerNodeArray) ToNodeBalancerNodeArrayOutputWithContext(ctx context.Context) NodeBalancerNodeArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NodeBalancerNodeArrayOutput)
}

// NodeBalancerNodeMapInput is an input type that accepts NodeBalancerNodeMap and NodeBalancerNodeMapOutput values.
// You can construct a concrete instance of `NodeBalancerNodeMapInput` via:
//
//          NodeBalancerNodeMap{ "key": NodeBalancerNodeArgs{...} }
type NodeBalancerNodeMapInput interface {
	pulumi.Input

	ToNodeBalancerNodeMapOutput() NodeBalancerNodeMapOutput
	ToNodeBalancerNodeMapOutputWithContext(context.Context) NodeBalancerNodeMapOutput
}

type NodeBalancerNodeMap map[string]NodeBalancerNodeInput

func (NodeBalancerNodeMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*NodeBalancerNode)(nil))
}

func (i NodeBalancerNodeMap) ToNodeBalancerNodeMapOutput() NodeBalancerNodeMapOutput {
	return i.ToNodeBalancerNodeMapOutputWithContext(context.Background())
}

func (i NodeBalancerNodeMap) ToNodeBalancerNodeMapOutputWithContext(ctx context.Context) NodeBalancerNodeMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NodeBalancerNodeMapOutput)
}

type NodeBalancerNodeOutput struct {
	*pulumi.OutputState
}

func (NodeBalancerNodeOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*NodeBalancerNode)(nil))
}

func (o NodeBalancerNodeOutput) ToNodeBalancerNodeOutput() NodeBalancerNodeOutput {
	return o
}

func (o NodeBalancerNodeOutput) ToNodeBalancerNodeOutputWithContext(ctx context.Context) NodeBalancerNodeOutput {
	return o
}

func (o NodeBalancerNodeOutput) ToNodeBalancerNodePtrOutput() NodeBalancerNodePtrOutput {
	return o.ToNodeBalancerNodePtrOutputWithContext(context.Background())
}

func (o NodeBalancerNodeOutput) ToNodeBalancerNodePtrOutputWithContext(ctx context.Context) NodeBalancerNodePtrOutput {
	return o.ApplyT(func(v NodeBalancerNode) *NodeBalancerNode {
		return &v
	}).(NodeBalancerNodePtrOutput)
}

type NodeBalancerNodePtrOutput struct {
	*pulumi.OutputState
}

func (NodeBalancerNodePtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**NodeBalancerNode)(nil))
}

func (o NodeBalancerNodePtrOutput) ToNodeBalancerNodePtrOutput() NodeBalancerNodePtrOutput {
	return o
}

func (o NodeBalancerNodePtrOutput) ToNodeBalancerNodePtrOutputWithContext(ctx context.Context) NodeBalancerNodePtrOutput {
	return o
}

type NodeBalancerNodeArrayOutput struct{ *pulumi.OutputState }

func (NodeBalancerNodeArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]NodeBalancerNode)(nil))
}

func (o NodeBalancerNodeArrayOutput) ToNodeBalancerNodeArrayOutput() NodeBalancerNodeArrayOutput {
	return o
}

func (o NodeBalancerNodeArrayOutput) ToNodeBalancerNodeArrayOutputWithContext(ctx context.Context) NodeBalancerNodeArrayOutput {
	return o
}

func (o NodeBalancerNodeArrayOutput) Index(i pulumi.IntInput) NodeBalancerNodeOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) NodeBalancerNode {
		return vs[0].([]NodeBalancerNode)[vs[1].(int)]
	}).(NodeBalancerNodeOutput)
}

type NodeBalancerNodeMapOutput struct{ *pulumi.OutputState }

func (NodeBalancerNodeMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]NodeBalancerNode)(nil))
}

func (o NodeBalancerNodeMapOutput) ToNodeBalancerNodeMapOutput() NodeBalancerNodeMapOutput {
	return o
}

func (o NodeBalancerNodeMapOutput) ToNodeBalancerNodeMapOutputWithContext(ctx context.Context) NodeBalancerNodeMapOutput {
	return o
}

func (o NodeBalancerNodeMapOutput) MapIndex(k pulumi.StringInput) NodeBalancerNodeOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) NodeBalancerNode {
		return vs[0].(map[string]NodeBalancerNode)[vs[1].(string)]
	}).(NodeBalancerNodeOutput)
}

func init() {
	pulumi.RegisterOutputType(NodeBalancerNodeOutput{})
	pulumi.RegisterOutputType(NodeBalancerNodePtrOutput{})
	pulumi.RegisterOutputType(NodeBalancerNodeArrayOutput{})
	pulumi.RegisterOutputType(NodeBalancerNodeMapOutput{})
}
