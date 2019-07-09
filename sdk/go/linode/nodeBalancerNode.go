// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

type NodeBalancerNode struct {
	s *pulumi.ResourceState
}

// NewNodeBalancerNode registers a new resource with the given unique name, arguments, and options.
func NewNodeBalancerNode(ctx *pulumi.Context,
	name string, args *NodeBalancerNodeArgs, opts ...pulumi.ResourceOpt) (*NodeBalancerNode, error) {
	if args == nil || args.Address == nil {
		return nil, errors.New("missing required argument 'Address'")
	}
	if args == nil || args.ConfigId == nil {
		return nil, errors.New("missing required argument 'ConfigId'")
	}
	if args == nil || args.Label == nil {
		return nil, errors.New("missing required argument 'Label'")
	}
	if args == nil || args.NodebalancerId == nil {
		return nil, errors.New("missing required argument 'NodebalancerId'")
	}
	inputs := make(map[string]interface{})
	if args == nil {
		inputs["address"] = nil
		inputs["configId"] = nil
		inputs["label"] = nil
		inputs["mode"] = nil
		inputs["nodebalancerId"] = nil
		inputs["weight"] = nil
	} else {
		inputs["address"] = args.Address
		inputs["configId"] = args.ConfigId
		inputs["label"] = args.Label
		inputs["mode"] = args.Mode
		inputs["nodebalancerId"] = args.NodebalancerId
		inputs["weight"] = args.Weight
	}
	inputs["status"] = nil
	s, err := ctx.RegisterResource("linode:index/nodeBalancerNode:NodeBalancerNode", name, true, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &NodeBalancerNode{s: s}, nil
}

// GetNodeBalancerNode gets an existing NodeBalancerNode resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetNodeBalancerNode(ctx *pulumi.Context,
	name string, id pulumi.ID, state *NodeBalancerNodeState, opts ...pulumi.ResourceOpt) (*NodeBalancerNode, error) {
	inputs := make(map[string]interface{})
	if state != nil {
		inputs["address"] = state.Address
		inputs["configId"] = state.ConfigId
		inputs["label"] = state.Label
		inputs["mode"] = state.Mode
		inputs["nodebalancerId"] = state.NodebalancerId
		inputs["status"] = state.Status
		inputs["weight"] = state.Weight
	}
	s, err := ctx.ReadResource("linode:index/nodeBalancerNode:NodeBalancerNode", name, id, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &NodeBalancerNode{s: s}, nil
}

// URN is this resource's unique name assigned by Pulumi.
func (r *NodeBalancerNode) URN() *pulumi.URNOutput {
	return r.s.URN()
}

// ID is this resource's unique identifier assigned by its provider.
func (r *NodeBalancerNode) ID() *pulumi.IDOutput {
	return r.s.ID()
}

// The private IP Address where this backend can be reached. This must be a private IP address.
func (r *NodeBalancerNode) Address() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["address"])
}

// The ID of the NodeBalancerConfig to access.
func (r *NodeBalancerNode) ConfigId() *pulumi.IntOutput {
	return (*pulumi.IntOutput)(r.s.State["configId"])
}

// The label of the Linode NodeBalancer Node. This is for display purposes only.
func (r *NodeBalancerNode) Label() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["label"])
}

// The mode this NodeBalancer should use when sending traffic to this backend. If set to `accept` this backend is accepting traffic. If set to `reject` this backend will not receive traffic. If set to `drain` this backend will not receive new traffic, but connections already pinned to it will continue to be routed to it
func (r *NodeBalancerNode) Mode() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["mode"])
}

// The ID of the NodeBalancer to access.
func (r *NodeBalancerNode) NodebalancerId() *pulumi.IntOutput {
	return (*pulumi.IntOutput)(r.s.State["nodebalancerId"])
}

// The current status of this node, based on the configured checks of its NodeBalancer Config. (unknown, UP, DOWN)
func (r *NodeBalancerNode) Status() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["status"])
}

// Used when picking a backend to serve a request and is not pinned to a single backend yet. Nodes with a higher weight will receive more traffic. (1-255).
func (r *NodeBalancerNode) Weight() *pulumi.IntOutput {
	return (*pulumi.IntOutput)(r.s.State["weight"])
}

// Input properties used for looking up and filtering NodeBalancerNode resources.
type NodeBalancerNodeState struct {
	// The private IP Address where this backend can be reached. This must be a private IP address.
	Address interface{}
	// The ID of the NodeBalancerConfig to access.
	ConfigId interface{}
	// The label of the Linode NodeBalancer Node. This is for display purposes only.
	Label interface{}
	// The mode this NodeBalancer should use when sending traffic to this backend. If set to `accept` this backend is accepting traffic. If set to `reject` this backend will not receive traffic. If set to `drain` this backend will not receive new traffic, but connections already pinned to it will continue to be routed to it
	Mode interface{}
	// The ID of the NodeBalancer to access.
	NodebalancerId interface{}
	// The current status of this node, based on the configured checks of its NodeBalancer Config. (unknown, UP, DOWN)
	Status interface{}
	// Used when picking a backend to serve a request and is not pinned to a single backend yet. Nodes with a higher weight will receive more traffic. (1-255).
	Weight interface{}
}

// The set of arguments for constructing a NodeBalancerNode resource.
type NodeBalancerNodeArgs struct {
	// The private IP Address where this backend can be reached. This must be a private IP address.
	Address interface{}
	// The ID of the NodeBalancerConfig to access.
	ConfigId interface{}
	// The label of the Linode NodeBalancer Node. This is for display purposes only.
	Label interface{}
	// The mode this NodeBalancer should use when sending traffic to this backend. If set to `accept` this backend is accepting traffic. If set to `reject` this backend will not receive traffic. If set to `drain` this backend will not receive new traffic, but connections already pinned to it will continue to be routed to it
	Mode interface{}
	// The ID of the NodeBalancer to access.
	NodebalancerId interface{}
	// Used when picking a backend to serve a request and is not pinned to a single backend yet. Nodes with a higher weight will receive more traffic. (1-255).
	Weight interface{}
}
