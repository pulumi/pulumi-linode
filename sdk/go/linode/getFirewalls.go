// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-linode/sdk/v4/go/linode/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides information about Linode Cloud Firewalls that match a set of filters.
// For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-firewalls).
//
// ## Example Usage
//
// Get information about all Linode Cloud Firewalls with a certain label and visibility:
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
//			specific, err := linode.GetFirewalls(ctx, &linode.GetFirewallsArgs{
//				Filters: []linode.GetFirewallsFilter{
//					{
//						Name: "label",
//						Values: []string{
//							"my-firewalls",
//						},
//					},
//					{
//						Name: "tags",
//						Values: []string{
//							"my-tag",
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("firewallId", specific.Firewalls[0].Id)
//			return nil
//		})
//	}
//
// ```
//
// Get information about all Linode images associated with the current token:
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
// func main() {
// pulumi.Run(func(ctx *pulumi.Context) error {
// all, err := linode.GetFirewalls(ctx, nil, nil);
// if err != nil {
// return err
// }
// ctx.Export("firewallIds", pulumi.IntArray(%!v(PANIC=Format method: fatal: A failure has occurred: unlowered splat expression @ example.pp:3,11-30)))
// return nil
// })
// }
// ```
//
// ## Firewall Rule
//
// * `label` - The label of this rule for display purposes only.
//
// * `action` - Controls whether traffic is accepted or dropped by this rule (ACCEPT, DROP).
//
// * `protocol` - The network protocol this rule controls. (TCP, UDP, ICMP)
//
// * `ports` - A string representation of ports and/or port ranges (i.e. "443" or "80-90, 91").
//
// * `ipv4` - A list of IPv4 addresses or networks in IP/mask format.
//
// * `ipv6` - A list of IPv6 addresses or networks in IP/mask format.
//
// ## Firewall Device
//
// * `id` - The unique ID of this Firewall Device assignment.
//
// * `entityId` - The ID of the underlying entity this device references.
//
// * `type` - The type of the assigned entity.
//
// * `label` - The label of the assigned entity.
//
// * `url` - The URL of the assigned entity.
//
// ## Filterable Fields
//
// * `id`
//
// * `label`
//
// * `status`
//
// * `tags`
func GetFirewalls(ctx *pulumi.Context, args *GetFirewallsArgs, opts ...pulumi.InvokeOption) (*GetFirewallsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetFirewallsResult
	err := ctx.Invoke("linode:index/getFirewalls:getFirewalls", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getFirewalls.
type GetFirewallsArgs struct {
	Filters   []GetFirewallsFilter   `pulumi:"filters"`
	Firewalls []GetFirewallsFirewall `pulumi:"firewalls"`
	// The order in which results should be returned. (`asc`, `desc`; default `asc`)
	Order *string `pulumi:"order"`
	// The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
	OrderBy *string `pulumi:"orderBy"`
}

// A collection of values returned by getFirewalls.
type GetFirewallsResult struct {
	Filters   []GetFirewallsFilter   `pulumi:"filters"`
	Firewalls []GetFirewallsFirewall `pulumi:"firewalls"`
	// The unique ID assigned to this Firewall.
	Id      string  `pulumi:"id"`
	Order   *string `pulumi:"order"`
	OrderBy *string `pulumi:"orderBy"`
}

func GetFirewallsOutput(ctx *pulumi.Context, args GetFirewallsOutputArgs, opts ...pulumi.InvokeOption) GetFirewallsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetFirewallsResult, error) {
			args := v.(GetFirewallsArgs)
			r, err := GetFirewalls(ctx, &args, opts...)
			var s GetFirewallsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetFirewallsResultOutput)
}

// A collection of arguments for invoking getFirewalls.
type GetFirewallsOutputArgs struct {
	Filters   GetFirewallsFilterArrayInput   `pulumi:"filters"`
	Firewalls GetFirewallsFirewallArrayInput `pulumi:"firewalls"`
	// The order in which results should be returned. (`asc`, `desc`; default `asc`)
	Order pulumi.StringPtrInput `pulumi:"order"`
	// The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
	OrderBy pulumi.StringPtrInput `pulumi:"orderBy"`
}

func (GetFirewallsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetFirewallsArgs)(nil)).Elem()
}

// A collection of values returned by getFirewalls.
type GetFirewallsResultOutput struct{ *pulumi.OutputState }

func (GetFirewallsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetFirewallsResult)(nil)).Elem()
}

func (o GetFirewallsResultOutput) ToGetFirewallsResultOutput() GetFirewallsResultOutput {
	return o
}

func (o GetFirewallsResultOutput) ToGetFirewallsResultOutputWithContext(ctx context.Context) GetFirewallsResultOutput {
	return o
}

func (o GetFirewallsResultOutput) Filters() GetFirewallsFilterArrayOutput {
	return o.ApplyT(func(v GetFirewallsResult) []GetFirewallsFilter { return v.Filters }).(GetFirewallsFilterArrayOutput)
}

func (o GetFirewallsResultOutput) Firewalls() GetFirewallsFirewallArrayOutput {
	return o.ApplyT(func(v GetFirewallsResult) []GetFirewallsFirewall { return v.Firewalls }).(GetFirewallsFirewallArrayOutput)
}

// The unique ID assigned to this Firewall.
func (o GetFirewallsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetFirewallsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetFirewallsResultOutput) Order() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetFirewallsResult) *string { return v.Order }).(pulumi.StringPtrOutput)
}

func (o GetFirewallsResultOutput) OrderBy() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetFirewallsResult) *string { return v.OrderBy }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetFirewallsResultOutput{})
}
