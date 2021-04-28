// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Linode NodeBalancer resource.  This can be used to create, modify, and delete Linodes NodeBalancers in Linode's managed load balancer service.
// For more information, see [Getting Started with NodeBalancers](https://www.linode.com/docs/platform/nodebalancer/getting-started-with-nodebalancers/) and the [Linode APIv4 docs](https://developers.linode.com/api/v4#operation/createNodeBalancer).
//
// ## Example Usage
//
// The following example shows how one might use this resource to configure a NodeBalancer.
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
// 		_, err := linode.NewNodeBalancer(ctx, "foobar", &linode.NodeBalancerArgs{
// 			ClientConnThrottle: pulumi.Int(20),
// 			Label:              pulumi.String("mynodebalancer"),
// 			Region:             pulumi.String("us-east"),
// 			Tags: pulumi.StringArray{
// 				pulumi.String("foobar"),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
// ## Attributes
//
// This resource exports the following attributes:
//
// * `hostname` - This NodeBalancer's hostname, ending with .nodebalancer.linode.com
//
// * `ipv4` - The Public IPv4 Address of this NodeBalancer
//
// * `ipv6` - The Public IPv6 Address of this NodeBalancer
//
// * `transfer` - The network transfer stats for the current month
//
// ### transfer
//
// The following attributes are available on transfer:
//
// * `in` - The total transfer, in MB, used by this NodeBalancer for the current month
//
// * `out` - The total inbound transfer, in MB, used for this NodeBalancer for the current month
//
// * `total` - The total outbound transfer, in MB, used for this NodeBalancer for the current month
//
// ## Import
//
// Linodes NodeBalancers can be imported using the Linode NodeBalancer `id`, e.g.
//
// ```sh
//  $ pulumi import linode:index/nodeBalancer:NodeBalancer mynodebalancer 1234567
// ```
//
//  The Linode Guide, [Import Existing Infrastructure to Terraform](https://www.linode.com/docs/applications/configuration-management/import-existing-infrastructure-to-terraform/), offers resource importing examples for NodeBalancers and other Linode resource types.
type NodeBalancer struct {
	pulumi.CustomResourceState

	// Throttle connections per second (0-20). Set to 0 (default) to disable throttling.
	ClientConnThrottle pulumi.IntPtrOutput `pulumi:"clientConnThrottle"`
	// When this NodeBalancer was created.
	Created pulumi.StringOutput `pulumi:"created"`
	// This NodeBalancer's hostname, ending with .nodebalancer.linode.com
	Hostname pulumi.StringOutput `pulumi:"hostname"`
	// The Public IPv4 Address of this NodeBalancer
	Ipv4 pulumi.StringOutput `pulumi:"ipv4"`
	// The Public IPv6 Address of this NodeBalancer
	Ipv6 pulumi.StringOutput `pulumi:"ipv6"`
	// The label of the Linode NodeBalancer
	Label pulumi.StringPtrOutput `pulumi:"label"`
	// The region where this NodeBalancer will be deployed.  Examples are `"us-east"`, `"us-west"`, `"ap-south"`, etc.  *Changing `region` forces the creation of a new Linode NodeBalancer.*.
	Region pulumi.StringOutput `pulumi:"region"`
	// A list of tags applied to this object. Tags are for organizational purposes only.
	Tags pulumi.StringArrayOutput `pulumi:"tags"`
	// Information about the amount of transfer this NodeBalancer has had so far this month.
	Transfers NodeBalancerTransferArrayOutput `pulumi:"transfers"`
	// When this NodeBalancer was last updated.
	Updated pulumi.StringOutput `pulumi:"updated"`
}

// NewNodeBalancer registers a new resource with the given unique name, arguments, and options.
func NewNodeBalancer(ctx *pulumi.Context,
	name string, args *NodeBalancerArgs, opts ...pulumi.ResourceOption) (*NodeBalancer, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Region == nil {
		return nil, errors.New("invalid value for required argument 'Region'")
	}
	var resource NodeBalancer
	err := ctx.RegisterResource("linode:index/nodeBalancer:NodeBalancer", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetNodeBalancer gets an existing NodeBalancer resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetNodeBalancer(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *NodeBalancerState, opts ...pulumi.ResourceOption) (*NodeBalancer, error) {
	var resource NodeBalancer
	err := ctx.ReadResource("linode:index/nodeBalancer:NodeBalancer", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering NodeBalancer resources.
type nodeBalancerState struct {
	// Throttle connections per second (0-20). Set to 0 (default) to disable throttling.
	ClientConnThrottle *int `pulumi:"clientConnThrottle"`
	// When this NodeBalancer was created.
	Created *string `pulumi:"created"`
	// This NodeBalancer's hostname, ending with .nodebalancer.linode.com
	Hostname *string `pulumi:"hostname"`
	// The Public IPv4 Address of this NodeBalancer
	Ipv4 *string `pulumi:"ipv4"`
	// The Public IPv6 Address of this NodeBalancer
	Ipv6 *string `pulumi:"ipv6"`
	// The label of the Linode NodeBalancer
	Label *string `pulumi:"label"`
	// The region where this NodeBalancer will be deployed.  Examples are `"us-east"`, `"us-west"`, `"ap-south"`, etc.  *Changing `region` forces the creation of a new Linode NodeBalancer.*.
	Region *string `pulumi:"region"`
	// A list of tags applied to this object. Tags are for organizational purposes only.
	Tags []string `pulumi:"tags"`
	// Information about the amount of transfer this NodeBalancer has had so far this month.
	Transfers []NodeBalancerTransfer `pulumi:"transfers"`
	// When this NodeBalancer was last updated.
	Updated *string `pulumi:"updated"`
}

type NodeBalancerState struct {
	// Throttle connections per second (0-20). Set to 0 (default) to disable throttling.
	ClientConnThrottle pulumi.IntPtrInput
	// When this NodeBalancer was created.
	Created pulumi.StringPtrInput
	// This NodeBalancer's hostname, ending with .nodebalancer.linode.com
	Hostname pulumi.StringPtrInput
	// The Public IPv4 Address of this NodeBalancer
	Ipv4 pulumi.StringPtrInput
	// The Public IPv6 Address of this NodeBalancer
	Ipv6 pulumi.StringPtrInput
	// The label of the Linode NodeBalancer
	Label pulumi.StringPtrInput
	// The region where this NodeBalancer will be deployed.  Examples are `"us-east"`, `"us-west"`, `"ap-south"`, etc.  *Changing `region` forces the creation of a new Linode NodeBalancer.*.
	Region pulumi.StringPtrInput
	// A list of tags applied to this object. Tags are for organizational purposes only.
	Tags pulumi.StringArrayInput
	// Information about the amount of transfer this NodeBalancer has had so far this month.
	Transfers NodeBalancerTransferArrayInput
	// When this NodeBalancer was last updated.
	Updated pulumi.StringPtrInput
}

func (NodeBalancerState) ElementType() reflect.Type {
	return reflect.TypeOf((*nodeBalancerState)(nil)).Elem()
}

type nodeBalancerArgs struct {
	// Throttle connections per second (0-20). Set to 0 (default) to disable throttling.
	ClientConnThrottle *int `pulumi:"clientConnThrottle"`
	// The label of the Linode NodeBalancer
	Label *string `pulumi:"label"`
	// The region where this NodeBalancer will be deployed.  Examples are `"us-east"`, `"us-west"`, `"ap-south"`, etc.  *Changing `region` forces the creation of a new Linode NodeBalancer.*.
	Region string `pulumi:"region"`
	// A list of tags applied to this object. Tags are for organizational purposes only.
	Tags []string `pulumi:"tags"`
}

// The set of arguments for constructing a NodeBalancer resource.
type NodeBalancerArgs struct {
	// Throttle connections per second (0-20). Set to 0 (default) to disable throttling.
	ClientConnThrottle pulumi.IntPtrInput
	// The label of the Linode NodeBalancer
	Label pulumi.StringPtrInput
	// The region where this NodeBalancer will be deployed.  Examples are `"us-east"`, `"us-west"`, `"ap-south"`, etc.  *Changing `region` forces the creation of a new Linode NodeBalancer.*.
	Region pulumi.StringInput
	// A list of tags applied to this object. Tags are for organizational purposes only.
	Tags pulumi.StringArrayInput
}

func (NodeBalancerArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*nodeBalancerArgs)(nil)).Elem()
}

type NodeBalancerInput interface {
	pulumi.Input

	ToNodeBalancerOutput() NodeBalancerOutput
	ToNodeBalancerOutputWithContext(ctx context.Context) NodeBalancerOutput
}

func (*NodeBalancer) ElementType() reflect.Type {
	return reflect.TypeOf((*NodeBalancer)(nil))
}

func (i *NodeBalancer) ToNodeBalancerOutput() NodeBalancerOutput {
	return i.ToNodeBalancerOutputWithContext(context.Background())
}

func (i *NodeBalancer) ToNodeBalancerOutputWithContext(ctx context.Context) NodeBalancerOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NodeBalancerOutput)
}

func (i *NodeBalancer) ToNodeBalancerPtrOutput() NodeBalancerPtrOutput {
	return i.ToNodeBalancerPtrOutputWithContext(context.Background())
}

func (i *NodeBalancer) ToNodeBalancerPtrOutputWithContext(ctx context.Context) NodeBalancerPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NodeBalancerPtrOutput)
}

type NodeBalancerPtrInput interface {
	pulumi.Input

	ToNodeBalancerPtrOutput() NodeBalancerPtrOutput
	ToNodeBalancerPtrOutputWithContext(ctx context.Context) NodeBalancerPtrOutput
}

type nodeBalancerPtrType NodeBalancerArgs

func (*nodeBalancerPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**NodeBalancer)(nil))
}

func (i *nodeBalancerPtrType) ToNodeBalancerPtrOutput() NodeBalancerPtrOutput {
	return i.ToNodeBalancerPtrOutputWithContext(context.Background())
}

func (i *nodeBalancerPtrType) ToNodeBalancerPtrOutputWithContext(ctx context.Context) NodeBalancerPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NodeBalancerPtrOutput)
}

// NodeBalancerArrayInput is an input type that accepts NodeBalancerArray and NodeBalancerArrayOutput values.
// You can construct a concrete instance of `NodeBalancerArrayInput` via:
//
//          NodeBalancerArray{ NodeBalancerArgs{...} }
type NodeBalancerArrayInput interface {
	pulumi.Input

	ToNodeBalancerArrayOutput() NodeBalancerArrayOutput
	ToNodeBalancerArrayOutputWithContext(context.Context) NodeBalancerArrayOutput
}

type NodeBalancerArray []NodeBalancerInput

func (NodeBalancerArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*NodeBalancer)(nil))
}

func (i NodeBalancerArray) ToNodeBalancerArrayOutput() NodeBalancerArrayOutput {
	return i.ToNodeBalancerArrayOutputWithContext(context.Background())
}

func (i NodeBalancerArray) ToNodeBalancerArrayOutputWithContext(ctx context.Context) NodeBalancerArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NodeBalancerArrayOutput)
}

// NodeBalancerMapInput is an input type that accepts NodeBalancerMap and NodeBalancerMapOutput values.
// You can construct a concrete instance of `NodeBalancerMapInput` via:
//
//          NodeBalancerMap{ "key": NodeBalancerArgs{...} }
type NodeBalancerMapInput interface {
	pulumi.Input

	ToNodeBalancerMapOutput() NodeBalancerMapOutput
	ToNodeBalancerMapOutputWithContext(context.Context) NodeBalancerMapOutput
}

type NodeBalancerMap map[string]NodeBalancerInput

func (NodeBalancerMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*NodeBalancer)(nil))
}

func (i NodeBalancerMap) ToNodeBalancerMapOutput() NodeBalancerMapOutput {
	return i.ToNodeBalancerMapOutputWithContext(context.Background())
}

func (i NodeBalancerMap) ToNodeBalancerMapOutputWithContext(ctx context.Context) NodeBalancerMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NodeBalancerMapOutput)
}

type NodeBalancerOutput struct {
	*pulumi.OutputState
}

func (NodeBalancerOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*NodeBalancer)(nil))
}

func (o NodeBalancerOutput) ToNodeBalancerOutput() NodeBalancerOutput {
	return o
}

func (o NodeBalancerOutput) ToNodeBalancerOutputWithContext(ctx context.Context) NodeBalancerOutput {
	return o
}

func (o NodeBalancerOutput) ToNodeBalancerPtrOutput() NodeBalancerPtrOutput {
	return o.ToNodeBalancerPtrOutputWithContext(context.Background())
}

func (o NodeBalancerOutput) ToNodeBalancerPtrOutputWithContext(ctx context.Context) NodeBalancerPtrOutput {
	return o.ApplyT(func(v NodeBalancer) *NodeBalancer {
		return &v
	}).(NodeBalancerPtrOutput)
}

type NodeBalancerPtrOutput struct {
	*pulumi.OutputState
}

func (NodeBalancerPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**NodeBalancer)(nil))
}

func (o NodeBalancerPtrOutput) ToNodeBalancerPtrOutput() NodeBalancerPtrOutput {
	return o
}

func (o NodeBalancerPtrOutput) ToNodeBalancerPtrOutputWithContext(ctx context.Context) NodeBalancerPtrOutput {
	return o
}

type NodeBalancerArrayOutput struct{ *pulumi.OutputState }

func (NodeBalancerArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]NodeBalancer)(nil))
}

func (o NodeBalancerArrayOutput) ToNodeBalancerArrayOutput() NodeBalancerArrayOutput {
	return o
}

func (o NodeBalancerArrayOutput) ToNodeBalancerArrayOutputWithContext(ctx context.Context) NodeBalancerArrayOutput {
	return o
}

func (o NodeBalancerArrayOutput) Index(i pulumi.IntInput) NodeBalancerOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) NodeBalancer {
		return vs[0].([]NodeBalancer)[vs[1].(int)]
	}).(NodeBalancerOutput)
}

type NodeBalancerMapOutput struct{ *pulumi.OutputState }

func (NodeBalancerMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]NodeBalancer)(nil))
}

func (o NodeBalancerMapOutput) ToNodeBalancerMapOutput() NodeBalancerMapOutput {
	return o
}

func (o NodeBalancerMapOutput) ToNodeBalancerMapOutputWithContext(ctx context.Context) NodeBalancerMapOutput {
	return o
}

func (o NodeBalancerMapOutput) MapIndex(k pulumi.StringInput) NodeBalancerOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) NodeBalancer {
		return vs[0].(map[string]NodeBalancer)[vs[1].(string)]
	}).(NodeBalancerOutput)
}

func init() {
	pulumi.RegisterOutputType(NodeBalancerOutput{})
	pulumi.RegisterOutputType(NodeBalancerPtrOutput{})
	pulumi.RegisterOutputType(NodeBalancerArrayOutput{})
	pulumi.RegisterOutputType(NodeBalancerMapOutput{})
}
