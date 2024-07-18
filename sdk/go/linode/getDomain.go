// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-linode/sdk/v4/go/linode/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides information about a Linode domain.
// For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-domain).
//
// ## Example Usage
//
// The following example shows how one might use this data source to access information about a Linode domain.
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
//			_, err := linode.LookupDomain(ctx, &linode.LookupDomainArgs{
//				Id: pulumi.IntRef(1234567),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = linode.LookupDomain(ctx, &linode.LookupDomainArgs{
//				Domain: pulumi.StringRef("bar.example.com"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupDomain(ctx *pulumi.Context, args *LookupDomainArgs, opts ...pulumi.InvokeOption) (*LookupDomainResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupDomainResult
	err := ctx.Invoke("linode:index/getDomain:getDomain", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDomain.
type LookupDomainArgs struct {
	// The unique domain name of the Domain record to query.
	Domain *string `pulumi:"domain"`
	// The unique numeric ID of the Domain record to query.
	Id *int `pulumi:"id"`
}

// A collection of values returned by getDomain.
type LookupDomainResult struct {
	// The list of IPs that may perform a zone transfer for this Domain.
	AxfrIps []string `pulumi:"axfrIps"`
	// A description for this Domain.
	Description string `pulumi:"description"`
	// The domain this Domain represents. These must be unique in our system; you cannot have two Domains representing the same domain
	Domain *string `pulumi:"domain"`
	// The amount of time in seconds that may pass before this Domain is no longer authoritative.
	ExpireSec int `pulumi:"expireSec"`
	// The group this Domain belongs to.
	Group string `pulumi:"group"`
	// The unique ID of this Domain.
	Id *int `pulumi:"id"`
	// The IP addresses representing the master DNS for this Domain.
	MasterIps []string `pulumi:"masterIps"`
	// The amount of time in seconds before this Domain should be refreshed.
	RefreshSec int `pulumi:"refreshSec"`
	// The interval, in seconds, at which a failed refresh should be retried.
	RetrySec int `pulumi:"retrySec"`
	// Start of Authority email address.
	SoaEmail string `pulumi:"soaEmail"`
	// Used to control whether this Domain is currently being rendered. (`disabled`, `active`)
	Status string `pulumi:"status"`
	// An array of tags applied to this object. Tags are case-insensitive and are for organizational purposes only.
	Tags []string `pulumi:"tags"`
	// 'Time to Live'-the amount of time in seconds that this Domain's records may be cached by resolvers or other domain servers.
	TtlSec int `pulumi:"ttlSec"`
	// If this Domain represents the authoritative source of information for the domain it describes, or if it is a read-only copy of a master (also called a slave) (`master`, `slave`)
	Type string `pulumi:"type"`
}

func LookupDomainOutput(ctx *pulumi.Context, args LookupDomainOutputArgs, opts ...pulumi.InvokeOption) LookupDomainResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupDomainResult, error) {
			args := v.(LookupDomainArgs)
			r, err := LookupDomain(ctx, &args, opts...)
			var s LookupDomainResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupDomainResultOutput)
}

// A collection of arguments for invoking getDomain.
type LookupDomainOutputArgs struct {
	// The unique domain name of the Domain record to query.
	Domain pulumi.StringPtrInput `pulumi:"domain"`
	// The unique numeric ID of the Domain record to query.
	Id pulumi.IntPtrInput `pulumi:"id"`
}

func (LookupDomainOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDomainArgs)(nil)).Elem()
}

// A collection of values returned by getDomain.
type LookupDomainResultOutput struct{ *pulumi.OutputState }

func (LookupDomainResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDomainResult)(nil)).Elem()
}

func (o LookupDomainResultOutput) ToLookupDomainResultOutput() LookupDomainResultOutput {
	return o
}

func (o LookupDomainResultOutput) ToLookupDomainResultOutputWithContext(ctx context.Context) LookupDomainResultOutput {
	return o
}

// The list of IPs that may perform a zone transfer for this Domain.
func (o LookupDomainResultOutput) AxfrIps() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupDomainResult) []string { return v.AxfrIps }).(pulumi.StringArrayOutput)
}

// A description for this Domain.
func (o LookupDomainResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDomainResult) string { return v.Description }).(pulumi.StringOutput)
}

// The domain this Domain represents. These must be unique in our system; you cannot have two Domains representing the same domain
func (o LookupDomainResultOutput) Domain() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupDomainResult) *string { return v.Domain }).(pulumi.StringPtrOutput)
}

// The amount of time in seconds that may pass before this Domain is no longer authoritative.
func (o LookupDomainResultOutput) ExpireSec() pulumi.IntOutput {
	return o.ApplyT(func(v LookupDomainResult) int { return v.ExpireSec }).(pulumi.IntOutput)
}

// The group this Domain belongs to.
func (o LookupDomainResultOutput) Group() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDomainResult) string { return v.Group }).(pulumi.StringOutput)
}

// The unique ID of this Domain.
func (o LookupDomainResultOutput) Id() pulumi.IntPtrOutput {
	return o.ApplyT(func(v LookupDomainResult) *int { return v.Id }).(pulumi.IntPtrOutput)
}

// The IP addresses representing the master DNS for this Domain.
func (o LookupDomainResultOutput) MasterIps() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupDomainResult) []string { return v.MasterIps }).(pulumi.StringArrayOutput)
}

// The amount of time in seconds before this Domain should be refreshed.
func (o LookupDomainResultOutput) RefreshSec() pulumi.IntOutput {
	return o.ApplyT(func(v LookupDomainResult) int { return v.RefreshSec }).(pulumi.IntOutput)
}

// The interval, in seconds, at which a failed refresh should be retried.
func (o LookupDomainResultOutput) RetrySec() pulumi.IntOutput {
	return o.ApplyT(func(v LookupDomainResult) int { return v.RetrySec }).(pulumi.IntOutput)
}

// Start of Authority email address.
func (o LookupDomainResultOutput) SoaEmail() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDomainResult) string { return v.SoaEmail }).(pulumi.StringOutput)
}

// Used to control whether this Domain is currently being rendered. (`disabled`, `active`)
func (o LookupDomainResultOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDomainResult) string { return v.Status }).(pulumi.StringOutput)
}

// An array of tags applied to this object. Tags are case-insensitive and are for organizational purposes only.
func (o LookupDomainResultOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupDomainResult) []string { return v.Tags }).(pulumi.StringArrayOutput)
}

// 'Time to Live'-the amount of time in seconds that this Domain's records may be cached by resolvers or other domain servers.
func (o LookupDomainResultOutput) TtlSec() pulumi.IntOutput {
	return o.ApplyT(func(v LookupDomainResult) int { return v.TtlSec }).(pulumi.IntOutput)
}

// If this Domain represents the authoritative source of information for the domain it describes, or if it is a read-only copy of a master (also called a slave) (`master`, `slave`)
func (o LookupDomainResultOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDomainResult) string { return v.Type }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupDomainResultOutput{})
}
