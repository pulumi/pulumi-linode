// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-linode/sdk/v4/go/linode/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides details about a Linode NodeBalancer.
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
//			_, err := linode.LookupNodeBalancer(ctx, &linode.LookupNodeBalancerArgs{
//				Id: 123,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupNodeBalancer(ctx *pulumi.Context, args *LookupNodeBalancerArgs, opts ...pulumi.InvokeOption) (*LookupNodeBalancerResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupNodeBalancerResult
	err := ctx.Invoke("linode:index/getNodeBalancer:getNodeBalancer", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getNodeBalancer.
type LookupNodeBalancerArgs struct {
	Firewalls []GetNodeBalancerFirewall `pulumi:"firewalls"`
	// The NodeBalancer's ID.
	Id int `pulumi:"id"`
}

// A collection of values returned by getNodeBalancer.
type LookupNodeBalancerResult struct {
	// Throttle connections per second (0-20).
	ClientConnThrottle int `pulumi:"clientConnThrottle"`
	// When this firewall was created.
	Created   string                    `pulumi:"created"`
	Firewalls []GetNodeBalancerFirewall `pulumi:"firewalls"`
	// This NodeBalancer's hostname, ending with .ip.linodeusercontent.com
	Hostname string `pulumi:"hostname"`
	// The Firewall's ID.
	Id int `pulumi:"id"`
	// A list of IPv4 addresses or networks. Must be in IP/mask format.
	Ipv4 string `pulumi:"ipv4"`
	// A list of IPv6 addresses or networks. Must be in IP/mask format.
	Ipv6 string `pulumi:"ipv6"`
	// Used to identify this rule. For display purposes only.
	Label string `pulumi:"label"`
	// The Region where this Linode NodeBalancer is located. NodeBalancers only support backends in the same Region.
	Region string `pulumi:"region"`
	// The tags applied to the firewall. Tags are case-insensitive and are for organizational purposes only.
	Tags      []string                  `pulumi:"tags"`
	Transfers []GetNodeBalancerTransfer `pulumi:"transfers"`
	// When this firewall was last updated.
	Updated string `pulumi:"updated"`
}

func LookupNodeBalancerOutput(ctx *pulumi.Context, args LookupNodeBalancerOutputArgs, opts ...pulumi.InvokeOption) LookupNodeBalancerResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupNodeBalancerResult, error) {
			args := v.(LookupNodeBalancerArgs)
			r, err := LookupNodeBalancer(ctx, &args, opts...)
			var s LookupNodeBalancerResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupNodeBalancerResultOutput)
}

// A collection of arguments for invoking getNodeBalancer.
type LookupNodeBalancerOutputArgs struct {
	Firewalls GetNodeBalancerFirewallArrayInput `pulumi:"firewalls"`
	// The NodeBalancer's ID.
	Id pulumi.IntInput `pulumi:"id"`
}

func (LookupNodeBalancerOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupNodeBalancerArgs)(nil)).Elem()
}

// A collection of values returned by getNodeBalancer.
type LookupNodeBalancerResultOutput struct{ *pulumi.OutputState }

func (LookupNodeBalancerResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupNodeBalancerResult)(nil)).Elem()
}

func (o LookupNodeBalancerResultOutput) ToLookupNodeBalancerResultOutput() LookupNodeBalancerResultOutput {
	return o
}

func (o LookupNodeBalancerResultOutput) ToLookupNodeBalancerResultOutputWithContext(ctx context.Context) LookupNodeBalancerResultOutput {
	return o
}

// Throttle connections per second (0-20).
func (o LookupNodeBalancerResultOutput) ClientConnThrottle() pulumi.IntOutput {
	return o.ApplyT(func(v LookupNodeBalancerResult) int { return v.ClientConnThrottle }).(pulumi.IntOutput)
}

// When this firewall was created.
func (o LookupNodeBalancerResultOutput) Created() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNodeBalancerResult) string { return v.Created }).(pulumi.StringOutput)
}

func (o LookupNodeBalancerResultOutput) Firewalls() GetNodeBalancerFirewallArrayOutput {
	return o.ApplyT(func(v LookupNodeBalancerResult) []GetNodeBalancerFirewall { return v.Firewalls }).(GetNodeBalancerFirewallArrayOutput)
}

// This NodeBalancer's hostname, ending with .ip.linodeusercontent.com
func (o LookupNodeBalancerResultOutput) Hostname() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNodeBalancerResult) string { return v.Hostname }).(pulumi.StringOutput)
}

// The Firewall's ID.
func (o LookupNodeBalancerResultOutput) Id() pulumi.IntOutput {
	return o.ApplyT(func(v LookupNodeBalancerResult) int { return v.Id }).(pulumi.IntOutput)
}

// A list of IPv4 addresses or networks. Must be in IP/mask format.
func (o LookupNodeBalancerResultOutput) Ipv4() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNodeBalancerResult) string { return v.Ipv4 }).(pulumi.StringOutput)
}

// A list of IPv6 addresses or networks. Must be in IP/mask format.
func (o LookupNodeBalancerResultOutput) Ipv6() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNodeBalancerResult) string { return v.Ipv6 }).(pulumi.StringOutput)
}

// Used to identify this rule. For display purposes only.
func (o LookupNodeBalancerResultOutput) Label() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNodeBalancerResult) string { return v.Label }).(pulumi.StringOutput)
}

// The Region where this Linode NodeBalancer is located. NodeBalancers only support backends in the same Region.
func (o LookupNodeBalancerResultOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNodeBalancerResult) string { return v.Region }).(pulumi.StringOutput)
}

// The tags applied to the firewall. Tags are case-insensitive and are for organizational purposes only.
func (o LookupNodeBalancerResultOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupNodeBalancerResult) []string { return v.Tags }).(pulumi.StringArrayOutput)
}

func (o LookupNodeBalancerResultOutput) Transfers() GetNodeBalancerTransferArrayOutput {
	return o.ApplyT(func(v LookupNodeBalancerResult) []GetNodeBalancerTransfer { return v.Transfers }).(GetNodeBalancerTransferArrayOutput)
}

// When this firewall was last updated.
func (o LookupNodeBalancerResultOutput) Updated() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNodeBalancerResult) string { return v.Updated }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupNodeBalancerResultOutput{})
}
