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

// Provides a Linode RDNS resource.  This can be used to create and modify RDNS records.
//
// Linode RDNS names must have a matching address value in an A or AAAA record.  This A or AAAA name must be resolvable at the time the RDNS resource is being associated.
//
// For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/put-ip) and the [Configure your Linode for Reverse DNS](https://www.linode.com/docs/networking/dns/configure-your-linode-for-reverse-dns-classic-manager/) guide.
//
// ## Example Usage
//
// The following example shows how one might use this resource to configure an RDNS address for an IP address.
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-linode/sdk/v4/go/linode"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			fooInstance, err := linode.NewInstance(ctx, "foo", &linode.InstanceArgs{
//				Image:  pulumi.String("linode/alpine3.19"),
//				Region: pulumi.String("ca-east"),
//				Type:   pulumi.String("g6-dedicated-2"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = linode.NewRdns(ctx, "foo", &linode.RdnsArgs{
//				Address: fooInstance.IpAddress,
//				Rdns: fooInstance.IpAddress.ApplyT(func(ipAddress string) (string, error) {
//					return fmt.Sprintf("%v.nip.io", ipAddress), nil
//				}).(pulumi.StringOutput),
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
// The following example shows how one might use this resource to configure RDNS for multiple IP addresses.
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-linode/sdk/v4/go/linode"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			var myInstance []*linode.Instance
//			for index := 0; index < 3; index++ {
//				key0 := index
//				val0 := index
//				__res, err := linode.NewInstance(ctx, fmt.Sprintf("my_instance-%v", key0), &linode.InstanceArgs{
//					Label:    pulumi.Sprintf("simple_instance-%v", val0+1),
//					Image:    pulumi.String("linode/ubuntu22.04"),
//					Region:   pulumi.String("us-central"),
//					Type:     pulumi.String("g6-standard-1"),
//					RootPass: pulumi.String("terr4form-test"),
//				})
//				if err != nil {
//					return err
//				}
//				myInstance = append(myInstance, __res)
//			}
//			var myRdns []*linode.Rdns
//			for index := 0; index < int(len(myInstance)); index++ {
//				key0 := index
//				val0 := index
//				__res, err := linode.NewRdns(ctx, fmt.Sprintf("my_rdns-%v", key0), &linode.RdnsArgs{
//					Address: myInstance[val0].IpAddress,
//					Rdns: pulumi.String(myInstance[val0].IpAddress.ApplyT(func(ipAddress string) (string, error) {
//						return fmt.Sprintf("%v.nip.io", ipAddress), nil
//					}).(pulumi.StringOutput)),
//				})
//				if err != nil {
//					return err
//				}
//				myRdns = append(myRdns, __res)
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// Linodes RDNS resources can be imported using the address as the `id`.
//
// ```sh
// $ pulumi import linode:index/rdns:Rdns foo 123.123.123.123
// ```
type Rdns struct {
	pulumi.CustomResourceState

	// The Public IPv4 or IPv6 address that will receive the `PTR` record.  A matching `A` or `AAAA` record must exist.
	Address pulumi.StringOutput `pulumi:"address"`
	// The name of the RDNS address.
	Rdns     pulumi.StringOutput   `pulumi:"rdns"`
	Timeouts RdnsTimeoutsPtrOutput `pulumi:"timeouts"`
	// If true, the RDNS assignment will be retried within the operation timeout period.
	WaitForAvailable pulumi.BoolOutput `pulumi:"waitForAvailable"`
}

// NewRdns registers a new resource with the given unique name, arguments, and options.
func NewRdns(ctx *pulumi.Context,
	name string, args *RdnsArgs, opts ...pulumi.ResourceOption) (*Rdns, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Address == nil {
		return nil, errors.New("invalid value for required argument 'Address'")
	}
	if args.Rdns == nil {
		return nil, errors.New("invalid value for required argument 'Rdns'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Rdns
	err := ctx.RegisterResource("linode:index/rdns:Rdns", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRdns gets an existing Rdns resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRdns(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RdnsState, opts ...pulumi.ResourceOption) (*Rdns, error) {
	var resource Rdns
	err := ctx.ReadResource("linode:index/rdns:Rdns", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Rdns resources.
type rdnsState struct {
	// The Public IPv4 or IPv6 address that will receive the `PTR` record.  A matching `A` or `AAAA` record must exist.
	Address *string `pulumi:"address"`
	// The name of the RDNS address.
	Rdns     *string       `pulumi:"rdns"`
	Timeouts *RdnsTimeouts `pulumi:"timeouts"`
	// If true, the RDNS assignment will be retried within the operation timeout period.
	WaitForAvailable *bool `pulumi:"waitForAvailable"`
}

type RdnsState struct {
	// The Public IPv4 or IPv6 address that will receive the `PTR` record.  A matching `A` or `AAAA` record must exist.
	Address pulumi.StringPtrInput
	// The name of the RDNS address.
	Rdns     pulumi.StringPtrInput
	Timeouts RdnsTimeoutsPtrInput
	// If true, the RDNS assignment will be retried within the operation timeout period.
	WaitForAvailable pulumi.BoolPtrInput
}

func (RdnsState) ElementType() reflect.Type {
	return reflect.TypeOf((*rdnsState)(nil)).Elem()
}

type rdnsArgs struct {
	// The Public IPv4 or IPv6 address that will receive the `PTR` record.  A matching `A` or `AAAA` record must exist.
	Address string `pulumi:"address"`
	// The name of the RDNS address.
	Rdns     string        `pulumi:"rdns"`
	Timeouts *RdnsTimeouts `pulumi:"timeouts"`
	// If true, the RDNS assignment will be retried within the operation timeout period.
	WaitForAvailable *bool `pulumi:"waitForAvailable"`
}

// The set of arguments for constructing a Rdns resource.
type RdnsArgs struct {
	// The Public IPv4 or IPv6 address that will receive the `PTR` record.  A matching `A` or `AAAA` record must exist.
	Address pulumi.StringInput
	// The name of the RDNS address.
	Rdns     pulumi.StringInput
	Timeouts RdnsTimeoutsPtrInput
	// If true, the RDNS assignment will be retried within the operation timeout period.
	WaitForAvailable pulumi.BoolPtrInput
}

func (RdnsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*rdnsArgs)(nil)).Elem()
}

type RdnsInput interface {
	pulumi.Input

	ToRdnsOutput() RdnsOutput
	ToRdnsOutputWithContext(ctx context.Context) RdnsOutput
}

func (*Rdns) ElementType() reflect.Type {
	return reflect.TypeOf((**Rdns)(nil)).Elem()
}

func (i *Rdns) ToRdnsOutput() RdnsOutput {
	return i.ToRdnsOutputWithContext(context.Background())
}

func (i *Rdns) ToRdnsOutputWithContext(ctx context.Context) RdnsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RdnsOutput)
}

// RdnsArrayInput is an input type that accepts RdnsArray and RdnsArrayOutput values.
// You can construct a concrete instance of `RdnsArrayInput` via:
//
//	RdnsArray{ RdnsArgs{...} }
type RdnsArrayInput interface {
	pulumi.Input

	ToRdnsArrayOutput() RdnsArrayOutput
	ToRdnsArrayOutputWithContext(context.Context) RdnsArrayOutput
}

type RdnsArray []RdnsInput

func (RdnsArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Rdns)(nil)).Elem()
}

func (i RdnsArray) ToRdnsArrayOutput() RdnsArrayOutput {
	return i.ToRdnsArrayOutputWithContext(context.Background())
}

func (i RdnsArray) ToRdnsArrayOutputWithContext(ctx context.Context) RdnsArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RdnsArrayOutput)
}

// RdnsMapInput is an input type that accepts RdnsMap and RdnsMapOutput values.
// You can construct a concrete instance of `RdnsMapInput` via:
//
//	RdnsMap{ "key": RdnsArgs{...} }
type RdnsMapInput interface {
	pulumi.Input

	ToRdnsMapOutput() RdnsMapOutput
	ToRdnsMapOutputWithContext(context.Context) RdnsMapOutput
}

type RdnsMap map[string]RdnsInput

func (RdnsMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Rdns)(nil)).Elem()
}

func (i RdnsMap) ToRdnsMapOutput() RdnsMapOutput {
	return i.ToRdnsMapOutputWithContext(context.Background())
}

func (i RdnsMap) ToRdnsMapOutputWithContext(ctx context.Context) RdnsMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RdnsMapOutput)
}

type RdnsOutput struct{ *pulumi.OutputState }

func (RdnsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Rdns)(nil)).Elem()
}

func (o RdnsOutput) ToRdnsOutput() RdnsOutput {
	return o
}

func (o RdnsOutput) ToRdnsOutputWithContext(ctx context.Context) RdnsOutput {
	return o
}

// The Public IPv4 or IPv6 address that will receive the `PTR` record.  A matching `A` or `AAAA` record must exist.
func (o RdnsOutput) Address() pulumi.StringOutput {
	return o.ApplyT(func(v *Rdns) pulumi.StringOutput { return v.Address }).(pulumi.StringOutput)
}

// The name of the RDNS address.
func (o RdnsOutput) Rdns() pulumi.StringOutput {
	return o.ApplyT(func(v *Rdns) pulumi.StringOutput { return v.Rdns }).(pulumi.StringOutput)
}

func (o RdnsOutput) Timeouts() RdnsTimeoutsPtrOutput {
	return o.ApplyT(func(v *Rdns) RdnsTimeoutsPtrOutput { return v.Timeouts }).(RdnsTimeoutsPtrOutput)
}

// If true, the RDNS assignment will be retried within the operation timeout period.
func (o RdnsOutput) WaitForAvailable() pulumi.BoolOutput {
	return o.ApplyT(func(v *Rdns) pulumi.BoolOutput { return v.WaitForAvailable }).(pulumi.BoolOutput)
}

type RdnsArrayOutput struct{ *pulumi.OutputState }

func (RdnsArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Rdns)(nil)).Elem()
}

func (o RdnsArrayOutput) ToRdnsArrayOutput() RdnsArrayOutput {
	return o
}

func (o RdnsArrayOutput) ToRdnsArrayOutputWithContext(ctx context.Context) RdnsArrayOutput {
	return o
}

func (o RdnsArrayOutput) Index(i pulumi.IntInput) RdnsOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Rdns {
		return vs[0].([]*Rdns)[vs[1].(int)]
	}).(RdnsOutput)
}

type RdnsMapOutput struct{ *pulumi.OutputState }

func (RdnsMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Rdns)(nil)).Elem()
}

func (o RdnsMapOutput) ToRdnsMapOutput() RdnsMapOutput {
	return o
}

func (o RdnsMapOutput) ToRdnsMapOutputWithContext(ctx context.Context) RdnsMapOutput {
	return o
}

func (o RdnsMapOutput) MapIndex(k pulumi.StringInput) RdnsOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Rdns {
		return vs[0].(map[string]*Rdns)[vs[1].(string)]
	}).(RdnsOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RdnsInput)(nil)).Elem(), &Rdns{})
	pulumi.RegisterInputType(reflect.TypeOf((*RdnsArrayInput)(nil)).Elem(), RdnsArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RdnsMapInput)(nil)).Elem(), RdnsMap{})
	pulumi.RegisterOutputType(RdnsOutput{})
	pulumi.RegisterOutputType(RdnsArrayOutput{})
	pulumi.RegisterOutputType(RdnsMapOutput{})
}
