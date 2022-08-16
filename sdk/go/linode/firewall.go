// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Linode Firewall.
//
// ## Example Usage
//
// Accept only inbound HTTP(s) requests and drop outbound HTTP(s) requests:
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-linode/sdk/v3/go/linode"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			myInstance, err := linode.NewInstance(ctx, "myInstance", &linode.InstanceArgs{
//				Label:    pulumi.String("my_instance"),
//				Image:    pulumi.String("linode/ubuntu18.04"),
//				Region:   pulumi.String("us-southeast"),
//				Type:     pulumi.String("g6-standard-1"),
//				RootPass: pulumi.String(fmt.Sprintf("bogusPassword$")),
//				SwapSize: pulumi.Int(256),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = linode.NewFirewall(ctx, "myFirewall", &linode.FirewallArgs{
//				Label: pulumi.String("my_firewall"),
//				Inbounds: FirewallInboundArray{
//					&FirewallInboundArgs{
//						Label:    pulumi.String("allow-http"),
//						Action:   pulumi.String("ACCEPT"),
//						Protocol: pulumi.String("TCP"),
//						Ports:    pulumi.String("80"),
//						Ipv4s: pulumi.StringArray{
//							pulumi.String("0.0.0.0/0"),
//						},
//						Ipv6s: pulumi.StringArray{
//							pulumi.String("::/0"),
//						},
//					},
//					&FirewallInboundArgs{
//						Label:    pulumi.String("allow-https"),
//						Action:   pulumi.String("ACCEPT"),
//						Protocol: pulumi.String("TCP"),
//						Ports:    pulumi.String("443"),
//						Ipv4s: pulumi.StringArray{
//							pulumi.String("0.0.0.0/0"),
//						},
//						Ipv6s: pulumi.StringArray{
//							pulumi.String("::/0"),
//						},
//					},
//				},
//				InboundPolicy: pulumi.String("DROP"),
//				Outbounds: FirewallOutboundArray{
//					&FirewallOutboundArgs{
//						Label:    pulumi.String("reject-http"),
//						Action:   pulumi.String("DROP"),
//						Protocol: pulumi.String("TCP"),
//						Ports:    pulumi.String("80"),
//						Ipv4s: pulumi.StringArray{
//							pulumi.String("0.0.0.0/0"),
//						},
//						Ipv6s: pulumi.StringArray{
//							pulumi.String("::/0"),
//						},
//					},
//					&FirewallOutboundArgs{
//						Label:    pulumi.String("reject-https"),
//						Action:   pulumi.String("DROP"),
//						Protocol: pulumi.String("TCP"),
//						Ports:    pulumi.String("443"),
//						Ipv4s: pulumi.StringArray{
//							pulumi.String("0.0.0.0/0"),
//						},
//						Ipv6s: pulumi.StringArray{
//							pulumi.String("::/0"),
//						},
//					},
//				},
//				OutboundPolicy: pulumi.String("ACCEPT"),
//				Linodes: pulumi.IntArray{
//					myInstance.ID(),
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
// Firewalls can be imported using the `id`, e.g.
//
// ```sh
//
//	$ pulumi import linode:index/firewall:Firewall my_firewall 12345
//
// ```
type Firewall struct {
	pulumi.CustomResourceState

	// The devices associated with this firewall.
	Devices FirewallDeviceTypeArrayOutput `pulumi:"devices"`
	// If `true`, the Firewall's rules are not enforced (defaults to `false`).
	Disabled pulumi.BoolPtrOutput `pulumi:"disabled"`
	// The default behavior for inbound traffic. This setting can be overridden by updating the inbound.action property of the Firewall Rule. (`ACCEPT`, `DROP`)
	InboundPolicy pulumi.StringOutput `pulumi:"inboundPolicy"`
	// A firewall rule that specifies what inbound network traffic is allowed.
	Inbounds FirewallInboundArrayOutput `pulumi:"inbounds"`
	// Used to identify this rule. For display purposes only.
	Label pulumi.StringOutput `pulumi:"label"`
	// A list of IDs of Linodes this Firewall should govern it's network traffic for.
	Linodes pulumi.IntArrayOutput `pulumi:"linodes"`
	// The default behavior for outbound traffic. This setting can be overridden by updating the outbound.action property for an individual Firewall Rule. (`ACCEPT`, `DROP`)
	OutboundPolicy pulumi.StringOutput `pulumi:"outboundPolicy"`
	// A firewall rule that specifies what outbound network traffic is allowed.
	Outbounds FirewallOutboundArrayOutput `pulumi:"outbounds"`
	// The status of the Firewall.
	Status pulumi.StringOutput `pulumi:"status"`
	// A list of tags applied to the Kubernetes cluster. Tags are for organizational purposes only.
	Tags pulumi.StringArrayOutput `pulumi:"tags"`
}

// NewFirewall registers a new resource with the given unique name, arguments, and options.
func NewFirewall(ctx *pulumi.Context,
	name string, args *FirewallArgs, opts ...pulumi.ResourceOption) (*Firewall, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.InboundPolicy == nil {
		return nil, errors.New("invalid value for required argument 'InboundPolicy'")
	}
	if args.Label == nil {
		return nil, errors.New("invalid value for required argument 'Label'")
	}
	if args.OutboundPolicy == nil {
		return nil, errors.New("invalid value for required argument 'OutboundPolicy'")
	}
	var resource Firewall
	err := ctx.RegisterResource("linode:index/firewall:Firewall", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetFirewall gets an existing Firewall resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetFirewall(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *FirewallState, opts ...pulumi.ResourceOption) (*Firewall, error) {
	var resource Firewall
	err := ctx.ReadResource("linode:index/firewall:Firewall", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Firewall resources.
type firewallState struct {
	// The devices associated with this firewall.
	Devices []FirewallDeviceType `pulumi:"devices"`
	// If `true`, the Firewall's rules are not enforced (defaults to `false`).
	Disabled *bool `pulumi:"disabled"`
	// The default behavior for inbound traffic. This setting can be overridden by updating the inbound.action property of the Firewall Rule. (`ACCEPT`, `DROP`)
	InboundPolicy *string `pulumi:"inboundPolicy"`
	// A firewall rule that specifies what inbound network traffic is allowed.
	Inbounds []FirewallInbound `pulumi:"inbounds"`
	// Used to identify this rule. For display purposes only.
	Label *string `pulumi:"label"`
	// A list of IDs of Linodes this Firewall should govern it's network traffic for.
	Linodes []int `pulumi:"linodes"`
	// The default behavior for outbound traffic. This setting can be overridden by updating the outbound.action property for an individual Firewall Rule. (`ACCEPT`, `DROP`)
	OutboundPolicy *string `pulumi:"outboundPolicy"`
	// A firewall rule that specifies what outbound network traffic is allowed.
	Outbounds []FirewallOutbound `pulumi:"outbounds"`
	// The status of the Firewall.
	Status *string `pulumi:"status"`
	// A list of tags applied to the Kubernetes cluster. Tags are for organizational purposes only.
	Tags []string `pulumi:"tags"`
}

type FirewallState struct {
	// The devices associated with this firewall.
	Devices FirewallDeviceTypeArrayInput
	// If `true`, the Firewall's rules are not enforced (defaults to `false`).
	Disabled pulumi.BoolPtrInput
	// The default behavior for inbound traffic. This setting can be overridden by updating the inbound.action property of the Firewall Rule. (`ACCEPT`, `DROP`)
	InboundPolicy pulumi.StringPtrInput
	// A firewall rule that specifies what inbound network traffic is allowed.
	Inbounds FirewallInboundArrayInput
	// Used to identify this rule. For display purposes only.
	Label pulumi.StringPtrInput
	// A list of IDs of Linodes this Firewall should govern it's network traffic for.
	Linodes pulumi.IntArrayInput
	// The default behavior for outbound traffic. This setting can be overridden by updating the outbound.action property for an individual Firewall Rule. (`ACCEPT`, `DROP`)
	OutboundPolicy pulumi.StringPtrInput
	// A firewall rule that specifies what outbound network traffic is allowed.
	Outbounds FirewallOutboundArrayInput
	// The status of the Firewall.
	Status pulumi.StringPtrInput
	// A list of tags applied to the Kubernetes cluster. Tags are for organizational purposes only.
	Tags pulumi.StringArrayInput
}

func (FirewallState) ElementType() reflect.Type {
	return reflect.TypeOf((*firewallState)(nil)).Elem()
}

type firewallArgs struct {
	// If `true`, the Firewall's rules are not enforced (defaults to `false`).
	Disabled *bool `pulumi:"disabled"`
	// The default behavior for inbound traffic. This setting can be overridden by updating the inbound.action property of the Firewall Rule. (`ACCEPT`, `DROP`)
	InboundPolicy string `pulumi:"inboundPolicy"`
	// A firewall rule that specifies what inbound network traffic is allowed.
	Inbounds []FirewallInbound `pulumi:"inbounds"`
	// Used to identify this rule. For display purposes only.
	Label string `pulumi:"label"`
	// A list of IDs of Linodes this Firewall should govern it's network traffic for.
	Linodes []int `pulumi:"linodes"`
	// The default behavior for outbound traffic. This setting can be overridden by updating the outbound.action property for an individual Firewall Rule. (`ACCEPT`, `DROP`)
	OutboundPolicy string `pulumi:"outboundPolicy"`
	// A firewall rule that specifies what outbound network traffic is allowed.
	Outbounds []FirewallOutbound `pulumi:"outbounds"`
	// A list of tags applied to the Kubernetes cluster. Tags are for organizational purposes only.
	Tags []string `pulumi:"tags"`
}

// The set of arguments for constructing a Firewall resource.
type FirewallArgs struct {
	// If `true`, the Firewall's rules are not enforced (defaults to `false`).
	Disabled pulumi.BoolPtrInput
	// The default behavior for inbound traffic. This setting can be overridden by updating the inbound.action property of the Firewall Rule. (`ACCEPT`, `DROP`)
	InboundPolicy pulumi.StringInput
	// A firewall rule that specifies what inbound network traffic is allowed.
	Inbounds FirewallInboundArrayInput
	// Used to identify this rule. For display purposes only.
	Label pulumi.StringInput
	// A list of IDs of Linodes this Firewall should govern it's network traffic for.
	Linodes pulumi.IntArrayInput
	// The default behavior for outbound traffic. This setting can be overridden by updating the outbound.action property for an individual Firewall Rule. (`ACCEPT`, `DROP`)
	OutboundPolicy pulumi.StringInput
	// A firewall rule that specifies what outbound network traffic is allowed.
	Outbounds FirewallOutboundArrayInput
	// A list of tags applied to the Kubernetes cluster. Tags are for organizational purposes only.
	Tags pulumi.StringArrayInput
}

func (FirewallArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*firewallArgs)(nil)).Elem()
}

type FirewallInput interface {
	pulumi.Input

	ToFirewallOutput() FirewallOutput
	ToFirewallOutputWithContext(ctx context.Context) FirewallOutput
}

func (*Firewall) ElementType() reflect.Type {
	return reflect.TypeOf((**Firewall)(nil)).Elem()
}

func (i *Firewall) ToFirewallOutput() FirewallOutput {
	return i.ToFirewallOutputWithContext(context.Background())
}

func (i *Firewall) ToFirewallOutputWithContext(ctx context.Context) FirewallOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FirewallOutput)
}

// FirewallArrayInput is an input type that accepts FirewallArray and FirewallArrayOutput values.
// You can construct a concrete instance of `FirewallArrayInput` via:
//
//	FirewallArray{ FirewallArgs{...} }
type FirewallArrayInput interface {
	pulumi.Input

	ToFirewallArrayOutput() FirewallArrayOutput
	ToFirewallArrayOutputWithContext(context.Context) FirewallArrayOutput
}

type FirewallArray []FirewallInput

func (FirewallArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Firewall)(nil)).Elem()
}

func (i FirewallArray) ToFirewallArrayOutput() FirewallArrayOutput {
	return i.ToFirewallArrayOutputWithContext(context.Background())
}

func (i FirewallArray) ToFirewallArrayOutputWithContext(ctx context.Context) FirewallArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FirewallArrayOutput)
}

// FirewallMapInput is an input type that accepts FirewallMap and FirewallMapOutput values.
// You can construct a concrete instance of `FirewallMapInput` via:
//
//	FirewallMap{ "key": FirewallArgs{...} }
type FirewallMapInput interface {
	pulumi.Input

	ToFirewallMapOutput() FirewallMapOutput
	ToFirewallMapOutputWithContext(context.Context) FirewallMapOutput
}

type FirewallMap map[string]FirewallInput

func (FirewallMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Firewall)(nil)).Elem()
}

func (i FirewallMap) ToFirewallMapOutput() FirewallMapOutput {
	return i.ToFirewallMapOutputWithContext(context.Background())
}

func (i FirewallMap) ToFirewallMapOutputWithContext(ctx context.Context) FirewallMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FirewallMapOutput)
}

type FirewallOutput struct{ *pulumi.OutputState }

func (FirewallOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Firewall)(nil)).Elem()
}

func (o FirewallOutput) ToFirewallOutput() FirewallOutput {
	return o
}

func (o FirewallOutput) ToFirewallOutputWithContext(ctx context.Context) FirewallOutput {
	return o
}

// The devices associated with this firewall.
func (o FirewallOutput) Devices() FirewallDeviceTypeArrayOutput {
	return o.ApplyT(func(v *Firewall) FirewallDeviceTypeArrayOutput { return v.Devices }).(FirewallDeviceTypeArrayOutput)
}

// If `true`, the Firewall's rules are not enforced (defaults to `false`).
func (o FirewallOutput) Disabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Firewall) pulumi.BoolPtrOutput { return v.Disabled }).(pulumi.BoolPtrOutput)
}

// The default behavior for inbound traffic. This setting can be overridden by updating the inbound.action property of the Firewall Rule. (`ACCEPT`, `DROP`)
func (o FirewallOutput) InboundPolicy() pulumi.StringOutput {
	return o.ApplyT(func(v *Firewall) pulumi.StringOutput { return v.InboundPolicy }).(pulumi.StringOutput)
}

// A firewall rule that specifies what inbound network traffic is allowed.
func (o FirewallOutput) Inbounds() FirewallInboundArrayOutput {
	return o.ApplyT(func(v *Firewall) FirewallInboundArrayOutput { return v.Inbounds }).(FirewallInboundArrayOutput)
}

// Used to identify this rule. For display purposes only.
func (o FirewallOutput) Label() pulumi.StringOutput {
	return o.ApplyT(func(v *Firewall) pulumi.StringOutput { return v.Label }).(pulumi.StringOutput)
}

// A list of IDs of Linodes this Firewall should govern it's network traffic for.
func (o FirewallOutput) Linodes() pulumi.IntArrayOutput {
	return o.ApplyT(func(v *Firewall) pulumi.IntArrayOutput { return v.Linodes }).(pulumi.IntArrayOutput)
}

// The default behavior for outbound traffic. This setting can be overridden by updating the outbound.action property for an individual Firewall Rule. (`ACCEPT`, `DROP`)
func (o FirewallOutput) OutboundPolicy() pulumi.StringOutput {
	return o.ApplyT(func(v *Firewall) pulumi.StringOutput { return v.OutboundPolicy }).(pulumi.StringOutput)
}

// A firewall rule that specifies what outbound network traffic is allowed.
func (o FirewallOutput) Outbounds() FirewallOutboundArrayOutput {
	return o.ApplyT(func(v *Firewall) FirewallOutboundArrayOutput { return v.Outbounds }).(FirewallOutboundArrayOutput)
}

// The status of the Firewall.
func (o FirewallOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *Firewall) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// A list of tags applied to the Kubernetes cluster. Tags are for organizational purposes only.
func (o FirewallOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Firewall) pulumi.StringArrayOutput { return v.Tags }).(pulumi.StringArrayOutput)
}

type FirewallArrayOutput struct{ *pulumi.OutputState }

func (FirewallArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Firewall)(nil)).Elem()
}

func (o FirewallArrayOutput) ToFirewallArrayOutput() FirewallArrayOutput {
	return o
}

func (o FirewallArrayOutput) ToFirewallArrayOutputWithContext(ctx context.Context) FirewallArrayOutput {
	return o
}

func (o FirewallArrayOutput) Index(i pulumi.IntInput) FirewallOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Firewall {
		return vs[0].([]*Firewall)[vs[1].(int)]
	}).(FirewallOutput)
}

type FirewallMapOutput struct{ *pulumi.OutputState }

func (FirewallMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Firewall)(nil)).Elem()
}

func (o FirewallMapOutput) ToFirewallMapOutput() FirewallMapOutput {
	return o
}

func (o FirewallMapOutput) ToFirewallMapOutputWithContext(ctx context.Context) FirewallMapOutput {
	return o
}

func (o FirewallMapOutput) MapIndex(k pulumi.StringInput) FirewallOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Firewall {
		return vs[0].(map[string]*Firewall)[vs[1].(string)]
	}).(FirewallOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*FirewallInput)(nil)).Elem(), &Firewall{})
	pulumi.RegisterInputType(reflect.TypeOf((*FirewallArrayInput)(nil)).Elem(), FirewallArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*FirewallMapInput)(nil)).Elem(), FirewallMap{})
	pulumi.RegisterOutputType(FirewallOutput{})
	pulumi.RegisterOutputType(FirewallArrayOutput{})
	pulumi.RegisterOutputType(FirewallMapOutput{})
}
