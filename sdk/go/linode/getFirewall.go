// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
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
// 		_, err := linode.LookupFirewall(ctx, &linode.LookupFirewallArgs{
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
	Devices []GetFirewallDevice `pulumi:"devices"`
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
