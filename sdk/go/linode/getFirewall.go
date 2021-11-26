// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides details about a Linode Firewall.
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
// 		_, err := linode.LookupFirewall(ctx, &GetFirewallArgs{
// 			Id: 123,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func LookupFirewall(ctx *pulumi.Context, args *LookupFirewallArgs, opts ...pulumi.InvokeOption) (*LookupFirewallResult, error) {
	var rv LookupFirewallResult
	err := ctx.Invoke("linode:index/getFirewall:getFirewall", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getFirewall.
type LookupFirewallArgs struct {
	// The Firewall's ID.
	Id int `pulumi:"id"`
}

// A collection of values returned by getFirewall.
type LookupFirewallResult struct {
	Devices []GetFirewallDeviceType `pulumi:"devices"`
	// If true, the firewall is inactive.
	Disabled bool `pulumi:"disabled"`
	// The ID of the Firewall Device.
	Id int `pulumi:"id"`
	// The default behavior for inbound traffic. (`ACCEPT`, `DROP`)
	InboundPolicy string               `pulumi:"inboundPolicy"`
	Inbounds      []GetFirewallInbound `pulumi:"inbounds"`
	// The label of the underlying entity this device references.
	Label string `pulumi:"label"`
	// The IDs of Linodes to apply this firewall to.
	Linodes []int `pulumi:"linodes"`
	// The default behavior for outbound traffic. (`ACCEPT`, `DROP`)
	OutboundPolicy string                `pulumi:"outboundPolicy"`
	Outbounds      []GetFirewallOutbound `pulumi:"outbounds"`
	// The status of the firewall. (`enabled`, `disabled`, `deleted`)
	Status string `pulumi:"status"`
	// The tags applied to the firewall.
	Tags []string `pulumi:"tags"`
}

func LookupFirewallOutput(ctx *pulumi.Context, args LookupFirewallOutputArgs, opts ...pulumi.InvokeOption) LookupFirewallResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupFirewallResult, error) {
			args := v.(LookupFirewallArgs)
			r, err := LookupFirewall(ctx, &args, opts...)
			return *r, err
		}).(LookupFirewallResultOutput)
}

// A collection of arguments for invoking getFirewall.
type LookupFirewallOutputArgs struct {
	// The Firewall's ID.
	Id pulumi.IntInput `pulumi:"id"`
}

func (LookupFirewallOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupFirewallArgs)(nil)).Elem()
}

// A collection of values returned by getFirewall.
type LookupFirewallResultOutput struct{ *pulumi.OutputState }

func (LookupFirewallResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupFirewallResult)(nil)).Elem()
}

func (o LookupFirewallResultOutput) ToLookupFirewallResultOutput() LookupFirewallResultOutput {
	return o
}

func (o LookupFirewallResultOutput) ToLookupFirewallResultOutputWithContext(ctx context.Context) LookupFirewallResultOutput {
	return o
}

func (o LookupFirewallResultOutput) Devices() GetFirewallDeviceTypeArrayOutput {
	return o.ApplyT(func(v LookupFirewallResult) []GetFirewallDeviceType { return v.Devices }).(GetFirewallDeviceTypeArrayOutput)
}

// If true, the firewall is inactive.
func (o LookupFirewallResultOutput) Disabled() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupFirewallResult) bool { return v.Disabled }).(pulumi.BoolOutput)
}

// The ID of the Firewall Device.
func (o LookupFirewallResultOutput) Id() pulumi.IntOutput {
	return o.ApplyT(func(v LookupFirewallResult) int { return v.Id }).(pulumi.IntOutput)
}

// The default behavior for inbound traffic. (`ACCEPT`, `DROP`)
func (o LookupFirewallResultOutput) InboundPolicy() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFirewallResult) string { return v.InboundPolicy }).(pulumi.StringOutput)
}

func (o LookupFirewallResultOutput) Inbounds() GetFirewallInboundArrayOutput {
	return o.ApplyT(func(v LookupFirewallResult) []GetFirewallInbound { return v.Inbounds }).(GetFirewallInboundArrayOutput)
}

// The label of the underlying entity this device references.
func (o LookupFirewallResultOutput) Label() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFirewallResult) string { return v.Label }).(pulumi.StringOutput)
}

// The IDs of Linodes to apply this firewall to.
func (o LookupFirewallResultOutput) Linodes() pulumi.IntArrayOutput {
	return o.ApplyT(func(v LookupFirewallResult) []int { return v.Linodes }).(pulumi.IntArrayOutput)
}

// The default behavior for outbound traffic. (`ACCEPT`, `DROP`)
func (o LookupFirewallResultOutput) OutboundPolicy() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFirewallResult) string { return v.OutboundPolicy }).(pulumi.StringOutput)
}

func (o LookupFirewallResultOutput) Outbounds() GetFirewallOutboundArrayOutput {
	return o.ApplyT(func(v LookupFirewallResult) []GetFirewallOutbound { return v.Outbounds }).(GetFirewallOutboundArrayOutput)
}

// The status of the firewall. (`enabled`, `disabled`, `deleted`)
func (o LookupFirewallResultOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFirewallResult) string { return v.Status }).(pulumi.StringOutput)
}

// The tags applied to the firewall.
func (o LookupFirewallResultOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupFirewallResult) []string { return v.Tags }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupFirewallResultOutput{})
}
