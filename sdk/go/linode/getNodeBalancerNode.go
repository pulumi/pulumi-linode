// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides details about a Linode NodeBalancer node.
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
// 		_, err := linode.LookupNodeBalancerNode(ctx, &linode.LookupNodeBalancerNodeArgs{
// 			ConfigId:       789,
// 			Id:             123,
// 			NodebalancerId: 456,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func LookupNodeBalancerNode(ctx *pulumi.Context, args *LookupNodeBalancerNodeArgs, opts ...pulumi.InvokeOption) (*LookupNodeBalancerNodeResult, error) {
	var rv LookupNodeBalancerNodeResult
	err := ctx.Invoke("linode:index/getNodeBalancerNode:getNodeBalancerNode", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getNodeBalancerNode.
type LookupNodeBalancerNodeArgs struct {
	// The ID of the config that contains the Node.
	ConfigId int `pulumi:"configId"`
	// The node's ID.
	Id int `pulumi:"id"`
	// The ID of the NodeBalancer that contains the node.
	NodebalancerId int `pulumi:"nodebalancerId"`
}

// A collection of values returned by getNodeBalancerNode.
type LookupNodeBalancerNodeResult struct {
	// The private IP Address where this backend can be reached.
	Address  string `pulumi:"address"`
	ConfigId int    `pulumi:"configId"`
	Id       int    `pulumi:"id"`
	// The label of the Linode NodeBalancer Node. This is for display purposes only.
	Label string `pulumi:"label"`
	// The mode this NodeBalancer should use when sending traffic to this backend. If set to `accept` this backend is accepting traffic. If set to `reject` this backend will not receive traffic. If set to `drain` this backend will not receive new traffic, but connections already pinned to it will continue to be routed to it
	Mode           string `pulumi:"mode"`
	NodebalancerId int    `pulumi:"nodebalancerId"`
	// The current status of this node, based on the configured checks of its NodeBalancer Config. (unknown, UP, DOWN).
	Status string `pulumi:"status"`
	// Used when picking a backend to serve a request and is not pinned to a single backend yet. Nodes with a higher weight will receive more traffic. (1-255).
	Weight int `pulumi:"weight"`
}
