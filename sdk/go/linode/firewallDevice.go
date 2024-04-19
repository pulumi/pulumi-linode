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

// Manages a Linode Firewall Device.
//
// **NOTICE:** Attaching a Linode Firewall Device to a `Firewall` resource with user-defined `linodes` may cause device conflicts.
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
//			myFirewall, err := linode.NewFirewall(ctx, "myFirewall", &linode.FirewallArgs{
//				Label: pulumi.String("my_firewall"),
//				Inbounds: linode.FirewallInboundArray{
//					&linode.FirewallInboundArgs{
//						Label:    pulumi.String("http"),
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
//				},
//				InboundPolicy:  pulumi.String("DROP"),
//				OutboundPolicy: pulumi.String("ACCEPT"),
//			})
//			if err != nil {
//				return err
//			}
//			myInstance, err := linode.NewInstance(ctx, "myInstance", &linode.InstanceArgs{
//				Label:  pulumi.String("my_instance"),
//				Region: pulumi.String("us-southeast"),
//				Type:   pulumi.String("g6-standard-1"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = linode.NewFirewallDevice(ctx, "myDevice", &linode.FirewallDeviceArgs{
//				FirewallId: myFirewall.ID(),
//				EntityId:   myInstance.ID(),
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
// Firewall Device can be imported using the `firewall_id` followed by the Firewall Device `id` separated by a comma, e.g.
//
// ```sh
// $ pulumi import linode:index/firewallDevice:FirewallDevice my_device_duplicated 1234567,7654321
// ```
type FirewallDevice struct {
	pulumi.CustomResourceState

	// When the Firewall Device was last created.
	Created pulumi.StringOutput `pulumi:"created"`
	// The unique ID of the entity to attach.
	EntityId pulumi.IntOutput `pulumi:"entityId"`
	// The type of the entity to attach. (default: `linode`)
	EntityType pulumi.StringOutput `pulumi:"entityType"`
	// The unique ID of the target Firewall.
	FirewallId pulumi.IntOutput `pulumi:"firewallId"`
	// When the Firewall Device was last updated.
	Updated pulumi.StringOutput `pulumi:"updated"`
}

// NewFirewallDevice registers a new resource with the given unique name, arguments, and options.
func NewFirewallDevice(ctx *pulumi.Context,
	name string, args *FirewallDeviceArgs, opts ...pulumi.ResourceOption) (*FirewallDevice, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.EntityId == nil {
		return nil, errors.New("invalid value for required argument 'EntityId'")
	}
	if args.FirewallId == nil {
		return nil, errors.New("invalid value for required argument 'FirewallId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource FirewallDevice
	err := ctx.RegisterResource("linode:index/firewallDevice:FirewallDevice", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetFirewallDevice gets an existing FirewallDevice resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetFirewallDevice(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *FirewallDeviceState, opts ...pulumi.ResourceOption) (*FirewallDevice, error) {
	var resource FirewallDevice
	err := ctx.ReadResource("linode:index/firewallDevice:FirewallDevice", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering FirewallDevice resources.
type firewallDeviceState struct {
	// When the Firewall Device was last created.
	Created *string `pulumi:"created"`
	// The unique ID of the entity to attach.
	EntityId *int `pulumi:"entityId"`
	// The type of the entity to attach. (default: `linode`)
	EntityType *string `pulumi:"entityType"`
	// The unique ID of the target Firewall.
	FirewallId *int `pulumi:"firewallId"`
	// When the Firewall Device was last updated.
	Updated *string `pulumi:"updated"`
}

type FirewallDeviceState struct {
	// When the Firewall Device was last created.
	Created pulumi.StringPtrInput
	// The unique ID of the entity to attach.
	EntityId pulumi.IntPtrInput
	// The type of the entity to attach. (default: `linode`)
	EntityType pulumi.StringPtrInput
	// The unique ID of the target Firewall.
	FirewallId pulumi.IntPtrInput
	// When the Firewall Device was last updated.
	Updated pulumi.StringPtrInput
}

func (FirewallDeviceState) ElementType() reflect.Type {
	return reflect.TypeOf((*firewallDeviceState)(nil)).Elem()
}

type firewallDeviceArgs struct {
	// The unique ID of the entity to attach.
	EntityId int `pulumi:"entityId"`
	// The type of the entity to attach. (default: `linode`)
	EntityType *string `pulumi:"entityType"`
	// The unique ID of the target Firewall.
	FirewallId int `pulumi:"firewallId"`
}

// The set of arguments for constructing a FirewallDevice resource.
type FirewallDeviceArgs struct {
	// The unique ID of the entity to attach.
	EntityId pulumi.IntInput
	// The type of the entity to attach. (default: `linode`)
	EntityType pulumi.StringPtrInput
	// The unique ID of the target Firewall.
	FirewallId pulumi.IntInput
}

func (FirewallDeviceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*firewallDeviceArgs)(nil)).Elem()
}

type FirewallDeviceInput interface {
	pulumi.Input

	ToFirewallDeviceOutput() FirewallDeviceOutput
	ToFirewallDeviceOutputWithContext(ctx context.Context) FirewallDeviceOutput
}

func (*FirewallDevice) ElementType() reflect.Type {
	return reflect.TypeOf((**FirewallDevice)(nil)).Elem()
}

func (i *FirewallDevice) ToFirewallDeviceOutput() FirewallDeviceOutput {
	return i.ToFirewallDeviceOutputWithContext(context.Background())
}

func (i *FirewallDevice) ToFirewallDeviceOutputWithContext(ctx context.Context) FirewallDeviceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FirewallDeviceOutput)
}

// FirewallDeviceArrayInput is an input type that accepts FirewallDeviceArray and FirewallDeviceArrayOutput values.
// You can construct a concrete instance of `FirewallDeviceArrayInput` via:
//
//	FirewallDeviceArray{ FirewallDeviceArgs{...} }
type FirewallDeviceArrayInput interface {
	pulumi.Input

	ToFirewallDeviceArrayOutput() FirewallDeviceArrayOutput
	ToFirewallDeviceArrayOutputWithContext(context.Context) FirewallDeviceArrayOutput
}

type FirewallDeviceArray []FirewallDeviceInput

func (FirewallDeviceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FirewallDevice)(nil)).Elem()
}

func (i FirewallDeviceArray) ToFirewallDeviceArrayOutput() FirewallDeviceArrayOutput {
	return i.ToFirewallDeviceArrayOutputWithContext(context.Background())
}

func (i FirewallDeviceArray) ToFirewallDeviceArrayOutputWithContext(ctx context.Context) FirewallDeviceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FirewallDeviceArrayOutput)
}

// FirewallDeviceMapInput is an input type that accepts FirewallDeviceMap and FirewallDeviceMapOutput values.
// You can construct a concrete instance of `FirewallDeviceMapInput` via:
//
//	FirewallDeviceMap{ "key": FirewallDeviceArgs{...} }
type FirewallDeviceMapInput interface {
	pulumi.Input

	ToFirewallDeviceMapOutput() FirewallDeviceMapOutput
	ToFirewallDeviceMapOutputWithContext(context.Context) FirewallDeviceMapOutput
}

type FirewallDeviceMap map[string]FirewallDeviceInput

func (FirewallDeviceMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FirewallDevice)(nil)).Elem()
}

func (i FirewallDeviceMap) ToFirewallDeviceMapOutput() FirewallDeviceMapOutput {
	return i.ToFirewallDeviceMapOutputWithContext(context.Background())
}

func (i FirewallDeviceMap) ToFirewallDeviceMapOutputWithContext(ctx context.Context) FirewallDeviceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FirewallDeviceMapOutput)
}

type FirewallDeviceOutput struct{ *pulumi.OutputState }

func (FirewallDeviceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**FirewallDevice)(nil)).Elem()
}

func (o FirewallDeviceOutput) ToFirewallDeviceOutput() FirewallDeviceOutput {
	return o
}

func (o FirewallDeviceOutput) ToFirewallDeviceOutputWithContext(ctx context.Context) FirewallDeviceOutput {
	return o
}

// When the Firewall Device was last created.
func (o FirewallDeviceOutput) Created() pulumi.StringOutput {
	return o.ApplyT(func(v *FirewallDevice) pulumi.StringOutput { return v.Created }).(pulumi.StringOutput)
}

// The unique ID of the entity to attach.
func (o FirewallDeviceOutput) EntityId() pulumi.IntOutput {
	return o.ApplyT(func(v *FirewallDevice) pulumi.IntOutput { return v.EntityId }).(pulumi.IntOutput)
}

// The type of the entity to attach. (default: `linode`)
func (o FirewallDeviceOutput) EntityType() pulumi.StringOutput {
	return o.ApplyT(func(v *FirewallDevice) pulumi.StringOutput { return v.EntityType }).(pulumi.StringOutput)
}

// The unique ID of the target Firewall.
func (o FirewallDeviceOutput) FirewallId() pulumi.IntOutput {
	return o.ApplyT(func(v *FirewallDevice) pulumi.IntOutput { return v.FirewallId }).(pulumi.IntOutput)
}

// When the Firewall Device was last updated.
func (o FirewallDeviceOutput) Updated() pulumi.StringOutput {
	return o.ApplyT(func(v *FirewallDevice) pulumi.StringOutput { return v.Updated }).(pulumi.StringOutput)
}

type FirewallDeviceArrayOutput struct{ *pulumi.OutputState }

func (FirewallDeviceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FirewallDevice)(nil)).Elem()
}

func (o FirewallDeviceArrayOutput) ToFirewallDeviceArrayOutput() FirewallDeviceArrayOutput {
	return o
}

func (o FirewallDeviceArrayOutput) ToFirewallDeviceArrayOutputWithContext(ctx context.Context) FirewallDeviceArrayOutput {
	return o
}

func (o FirewallDeviceArrayOutput) Index(i pulumi.IntInput) FirewallDeviceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *FirewallDevice {
		return vs[0].([]*FirewallDevice)[vs[1].(int)]
	}).(FirewallDeviceOutput)
}

type FirewallDeviceMapOutput struct{ *pulumi.OutputState }

func (FirewallDeviceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FirewallDevice)(nil)).Elem()
}

func (o FirewallDeviceMapOutput) ToFirewallDeviceMapOutput() FirewallDeviceMapOutput {
	return o
}

func (o FirewallDeviceMapOutput) ToFirewallDeviceMapOutputWithContext(ctx context.Context) FirewallDeviceMapOutput {
	return o
}

func (o FirewallDeviceMapOutput) MapIndex(k pulumi.StringInput) FirewallDeviceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *FirewallDevice {
		return vs[0].(map[string]*FirewallDevice)[vs[1].(string)]
	}).(FirewallDeviceOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*FirewallDeviceInput)(nil)).Elem(), &FirewallDevice{})
	pulumi.RegisterInputType(reflect.TypeOf((*FirewallDeviceArrayInput)(nil)).Elem(), FirewallDeviceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*FirewallDeviceMapInput)(nil)).Elem(), FirewallDeviceMap{})
	pulumi.RegisterOutputType(FirewallDeviceOutput{})
	pulumi.RegisterOutputType(FirewallDeviceArrayOutput{})
	pulumi.RegisterOutputType(FirewallDeviceMapOutput{})
}
