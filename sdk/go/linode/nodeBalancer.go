// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-linode/sdk/v4/go/linode/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
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
//
//	"github.com/pulumi/pulumi-linode/sdk/v4/go/linode"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := linode.NewNodeBalancer(ctx, "foobar", &linode.NodeBalancerArgs{
//				ClientConnThrottle: pulumi.Int(20),
//				Label:              pulumi.String("mynodebalancer"),
//				Region:             pulumi.String("us-east"),
//				Tags: pulumi.StringArray{
//					pulumi.String("foobar"),
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
// Linodes NodeBalancers can be imported using the Linode NodeBalancer `id`, e.g.
//
// ```sh
//
//	$ pulumi import linode:index/nodeBalancer:NodeBalancer mynodebalancer 1234567
//
// ```
type NodeBalancer struct {
	pulumi.CustomResourceState

	// Throttle connections per second (0-20). Set to 0 (default) to disable throttling.
	ClientConnThrottle pulumi.IntOutput `pulumi:"clientConnThrottle"`
	// When this NodeBalancer was created
	Created pulumi.StringOutput `pulumi:"created"`
	// ID for the firewall you'd like to use with this NodeBalancer.
	FirewallId pulumi.IntPtrOutput `pulumi:"firewallId"`
	// This NodeBalancer's hostname, ending with .nodebalancer.linode.com
	Hostname pulumi.StringOutput `pulumi:"hostname"`
	// The Public IPv4 Address of this NodeBalancer
	Ipv4 pulumi.StringOutput `pulumi:"ipv4"`
	// The Public IPv6 Address of this NodeBalancer
	Ipv6 pulumi.StringOutput `pulumi:"ipv6"`
	// The label of the Linode NodeBalancer
	Label pulumi.StringPtrOutput `pulumi:"label"`
	// The region where this NodeBalancer will be deployed.  Examples are `"us-east"`, `"us-west"`, `"ap-south"`, etc. See all regions [here](https://api.linode.com/v4/regions).  *Changing `region` forces the creation of a new Linode NodeBalancer.*.
	//
	// ***
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
		args = &NodeBalancerArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
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
	// When this NodeBalancer was created
	Created *string `pulumi:"created"`
	// ID for the firewall you'd like to use with this NodeBalancer.
	FirewallId *int `pulumi:"firewallId"`
	// This NodeBalancer's hostname, ending with .nodebalancer.linode.com
	Hostname *string `pulumi:"hostname"`
	// The Public IPv4 Address of this NodeBalancer
	Ipv4 *string `pulumi:"ipv4"`
	// The Public IPv6 Address of this NodeBalancer
	Ipv6 *string `pulumi:"ipv6"`
	// The label of the Linode NodeBalancer
	Label *string `pulumi:"label"`
	// The region where this NodeBalancer will be deployed.  Examples are `"us-east"`, `"us-west"`, `"ap-south"`, etc. See all regions [here](https://api.linode.com/v4/regions).  *Changing `region` forces the creation of a new Linode NodeBalancer.*.
	//
	// ***
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
	// When this NodeBalancer was created
	Created pulumi.StringPtrInput
	// ID for the firewall you'd like to use with this NodeBalancer.
	FirewallId pulumi.IntPtrInput
	// This NodeBalancer's hostname, ending with .nodebalancer.linode.com
	Hostname pulumi.StringPtrInput
	// The Public IPv4 Address of this NodeBalancer
	Ipv4 pulumi.StringPtrInput
	// The Public IPv6 Address of this NodeBalancer
	Ipv6 pulumi.StringPtrInput
	// The label of the Linode NodeBalancer
	Label pulumi.StringPtrInput
	// The region where this NodeBalancer will be deployed.  Examples are `"us-east"`, `"us-west"`, `"ap-south"`, etc. See all regions [here](https://api.linode.com/v4/regions).  *Changing `region` forces the creation of a new Linode NodeBalancer.*.
	//
	// ***
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
	// ID for the firewall you'd like to use with this NodeBalancer.
	FirewallId *int `pulumi:"firewallId"`
	// The label of the Linode NodeBalancer
	Label *string `pulumi:"label"`
	// The region where this NodeBalancer will be deployed.  Examples are `"us-east"`, `"us-west"`, `"ap-south"`, etc. See all regions [here](https://api.linode.com/v4/regions).  *Changing `region` forces the creation of a new Linode NodeBalancer.*.
	//
	// ***
	Region *string `pulumi:"region"`
	// A list of tags applied to this object. Tags are for organizational purposes only.
	Tags []string `pulumi:"tags"`
}

// The set of arguments for constructing a NodeBalancer resource.
type NodeBalancerArgs struct {
	// Throttle connections per second (0-20). Set to 0 (default) to disable throttling.
	ClientConnThrottle pulumi.IntPtrInput
	// ID for the firewall you'd like to use with this NodeBalancer.
	FirewallId pulumi.IntPtrInput
	// The label of the Linode NodeBalancer
	Label pulumi.StringPtrInput
	// The region where this NodeBalancer will be deployed.  Examples are `"us-east"`, `"us-west"`, `"ap-south"`, etc. See all regions [here](https://api.linode.com/v4/regions).  *Changing `region` forces the creation of a new Linode NodeBalancer.*.
	//
	// ***
	Region pulumi.StringPtrInput
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
	return reflect.TypeOf((**NodeBalancer)(nil)).Elem()
}

func (i *NodeBalancer) ToNodeBalancerOutput() NodeBalancerOutput {
	return i.ToNodeBalancerOutputWithContext(context.Background())
}

func (i *NodeBalancer) ToNodeBalancerOutputWithContext(ctx context.Context) NodeBalancerOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NodeBalancerOutput)
}

func (i *NodeBalancer) ToOutput(ctx context.Context) pulumix.Output[*NodeBalancer] {
	return pulumix.Output[*NodeBalancer]{
		OutputState: i.ToNodeBalancerOutputWithContext(ctx).OutputState,
	}
}

// NodeBalancerArrayInput is an input type that accepts NodeBalancerArray and NodeBalancerArrayOutput values.
// You can construct a concrete instance of `NodeBalancerArrayInput` via:
//
//	NodeBalancerArray{ NodeBalancerArgs{...} }
type NodeBalancerArrayInput interface {
	pulumi.Input

	ToNodeBalancerArrayOutput() NodeBalancerArrayOutput
	ToNodeBalancerArrayOutputWithContext(context.Context) NodeBalancerArrayOutput
}

type NodeBalancerArray []NodeBalancerInput

func (NodeBalancerArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NodeBalancer)(nil)).Elem()
}

func (i NodeBalancerArray) ToNodeBalancerArrayOutput() NodeBalancerArrayOutput {
	return i.ToNodeBalancerArrayOutputWithContext(context.Background())
}

func (i NodeBalancerArray) ToNodeBalancerArrayOutputWithContext(ctx context.Context) NodeBalancerArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NodeBalancerArrayOutput)
}

func (i NodeBalancerArray) ToOutput(ctx context.Context) pulumix.Output[[]*NodeBalancer] {
	return pulumix.Output[[]*NodeBalancer]{
		OutputState: i.ToNodeBalancerArrayOutputWithContext(ctx).OutputState,
	}
}

// NodeBalancerMapInput is an input type that accepts NodeBalancerMap and NodeBalancerMapOutput values.
// You can construct a concrete instance of `NodeBalancerMapInput` via:
//
//	NodeBalancerMap{ "key": NodeBalancerArgs{...} }
type NodeBalancerMapInput interface {
	pulumi.Input

	ToNodeBalancerMapOutput() NodeBalancerMapOutput
	ToNodeBalancerMapOutputWithContext(context.Context) NodeBalancerMapOutput
}

type NodeBalancerMap map[string]NodeBalancerInput

func (NodeBalancerMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NodeBalancer)(nil)).Elem()
}

func (i NodeBalancerMap) ToNodeBalancerMapOutput() NodeBalancerMapOutput {
	return i.ToNodeBalancerMapOutputWithContext(context.Background())
}

func (i NodeBalancerMap) ToNodeBalancerMapOutputWithContext(ctx context.Context) NodeBalancerMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NodeBalancerMapOutput)
}

func (i NodeBalancerMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*NodeBalancer] {
	return pulumix.Output[map[string]*NodeBalancer]{
		OutputState: i.ToNodeBalancerMapOutputWithContext(ctx).OutputState,
	}
}

type NodeBalancerOutput struct{ *pulumi.OutputState }

func (NodeBalancerOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**NodeBalancer)(nil)).Elem()
}

func (o NodeBalancerOutput) ToNodeBalancerOutput() NodeBalancerOutput {
	return o
}

func (o NodeBalancerOutput) ToNodeBalancerOutputWithContext(ctx context.Context) NodeBalancerOutput {
	return o
}

func (o NodeBalancerOutput) ToOutput(ctx context.Context) pulumix.Output[*NodeBalancer] {
	return pulumix.Output[*NodeBalancer]{
		OutputState: o.OutputState,
	}
}

// Throttle connections per second (0-20). Set to 0 (default) to disable throttling.
func (o NodeBalancerOutput) ClientConnThrottle() pulumi.IntOutput {
	return o.ApplyT(func(v *NodeBalancer) pulumi.IntOutput { return v.ClientConnThrottle }).(pulumi.IntOutput)
}

// When this NodeBalancer was created
func (o NodeBalancerOutput) Created() pulumi.StringOutput {
	return o.ApplyT(func(v *NodeBalancer) pulumi.StringOutput { return v.Created }).(pulumi.StringOutput)
}

// ID for the firewall you'd like to use with this NodeBalancer.
func (o NodeBalancerOutput) FirewallId() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *NodeBalancer) pulumi.IntPtrOutput { return v.FirewallId }).(pulumi.IntPtrOutput)
}

// This NodeBalancer's hostname, ending with .nodebalancer.linode.com
func (o NodeBalancerOutput) Hostname() pulumi.StringOutput {
	return o.ApplyT(func(v *NodeBalancer) pulumi.StringOutput { return v.Hostname }).(pulumi.StringOutput)
}

// The Public IPv4 Address of this NodeBalancer
func (o NodeBalancerOutput) Ipv4() pulumi.StringOutput {
	return o.ApplyT(func(v *NodeBalancer) pulumi.StringOutput { return v.Ipv4 }).(pulumi.StringOutput)
}

// The Public IPv6 Address of this NodeBalancer
func (o NodeBalancerOutput) Ipv6() pulumi.StringOutput {
	return o.ApplyT(func(v *NodeBalancer) pulumi.StringOutput { return v.Ipv6 }).(pulumi.StringOutput)
}

// The label of the Linode NodeBalancer
func (o NodeBalancerOutput) Label() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *NodeBalancer) pulumi.StringPtrOutput { return v.Label }).(pulumi.StringPtrOutput)
}

// The region where this NodeBalancer will be deployed.  Examples are `"us-east"`, `"us-west"`, `"ap-south"`, etc. See all regions [here](https://api.linode.com/v4/regions).  *Changing `region` forces the creation of a new Linode NodeBalancer.*.
//
// ***
func (o NodeBalancerOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v *NodeBalancer) pulumi.StringOutput { return v.Region }).(pulumi.StringOutput)
}

// A list of tags applied to this object. Tags are for organizational purposes only.
func (o NodeBalancerOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *NodeBalancer) pulumi.StringArrayOutput { return v.Tags }).(pulumi.StringArrayOutput)
}

// Information about the amount of transfer this NodeBalancer has had so far this month.
func (o NodeBalancerOutput) Transfers() NodeBalancerTransferArrayOutput {
	return o.ApplyT(func(v *NodeBalancer) NodeBalancerTransferArrayOutput { return v.Transfers }).(NodeBalancerTransferArrayOutput)
}

// When this NodeBalancer was last updated.
func (o NodeBalancerOutput) Updated() pulumi.StringOutput {
	return o.ApplyT(func(v *NodeBalancer) pulumi.StringOutput { return v.Updated }).(pulumi.StringOutput)
}

type NodeBalancerArrayOutput struct{ *pulumi.OutputState }

func (NodeBalancerArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NodeBalancer)(nil)).Elem()
}

func (o NodeBalancerArrayOutput) ToNodeBalancerArrayOutput() NodeBalancerArrayOutput {
	return o
}

func (o NodeBalancerArrayOutput) ToNodeBalancerArrayOutputWithContext(ctx context.Context) NodeBalancerArrayOutput {
	return o
}

func (o NodeBalancerArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*NodeBalancer] {
	return pulumix.Output[[]*NodeBalancer]{
		OutputState: o.OutputState,
	}
}

func (o NodeBalancerArrayOutput) Index(i pulumi.IntInput) NodeBalancerOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *NodeBalancer {
		return vs[0].([]*NodeBalancer)[vs[1].(int)]
	}).(NodeBalancerOutput)
}

type NodeBalancerMapOutput struct{ *pulumi.OutputState }

func (NodeBalancerMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NodeBalancer)(nil)).Elem()
}

func (o NodeBalancerMapOutput) ToNodeBalancerMapOutput() NodeBalancerMapOutput {
	return o
}

func (o NodeBalancerMapOutput) ToNodeBalancerMapOutputWithContext(ctx context.Context) NodeBalancerMapOutput {
	return o
}

func (o NodeBalancerMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*NodeBalancer] {
	return pulumix.Output[map[string]*NodeBalancer]{
		OutputState: o.OutputState,
	}
}

func (o NodeBalancerMapOutput) MapIndex(k pulumi.StringInput) NodeBalancerOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *NodeBalancer {
		return vs[0].(map[string]*NodeBalancer)[vs[1].(string)]
	}).(NodeBalancerOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*NodeBalancerInput)(nil)).Elem(), &NodeBalancer{})
	pulumi.RegisterInputType(reflect.TypeOf((*NodeBalancerArrayInput)(nil)).Elem(), NodeBalancerArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*NodeBalancerMapInput)(nil)).Elem(), NodeBalancerMap{})
	pulumi.RegisterOutputType(NodeBalancerOutput{})
	pulumi.RegisterOutputType(NodeBalancerArrayOutput{})
	pulumi.RegisterOutputType(NodeBalancerMapOutput{})
}
