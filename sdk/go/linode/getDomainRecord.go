// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-linode/sdk/v4/go/linode/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides information about a Linode Domain Record.
//
// ## Example Usage
//
// The following example shows how one might use this data source to access information about a Linode Domain Record.
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
//			_, err := linode.LookupDomainRecord(ctx, &linode.LookupDomainRecordArgs{
//				DomainId: 3150401,
//				Id:       pulumi.IntRef(14950401),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = linode.LookupDomainRecord(ctx, &linode.LookupDomainRecordArgs{
//				DomainId: 3150401,
//				Name:     pulumi.StringRef("www"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupDomainRecord(ctx *pulumi.Context, args *LookupDomainRecordArgs, opts ...pulumi.InvokeOption) (*LookupDomainRecordResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupDomainRecordResult
	err := ctx.Invoke("linode:index/getDomainRecord:getDomainRecord", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDomainRecord.
type LookupDomainRecordArgs struct {
	// The associated domain's unique ID.
	DomainId int `pulumi:"domainId"`
	// The unique ID of the Domain Record.
	Id *int `pulumi:"id"`
	// The name of the Record.
	Name *string `pulumi:"name"`
}

// A collection of values returned by getDomainRecord.
type LookupDomainRecordResult struct {
	// The associated domain's unique ID.
	DomainId int `pulumi:"domainId"`
	// The unique ID of the Domain Record.
	Id *int `pulumi:"id"`
	// The name of the Record.
	Name *string `pulumi:"name"`
	// The port this Record points to.
	Port int `pulumi:"port"`
	// The priority of the target host. Lower values are preferred.
	Priority int `pulumi:"priority"`
	// The protocol this Record's service communicates with. Only valid for SRV records.
	Protocol string `pulumi:"protocol"`
	// The service this Record identified. Only valid for SRV records.
	Service string `pulumi:"service"`
	// The tag portion of a CAA record.
	Tag string `pulumi:"tag"`
	// The target for this Record. This field's actual usage depends on the type of record this represents. For A and AAAA records, this is the address the named Domain should resolve to.
	Target string `pulumi:"target"`
	// The amount of time in seconds that this Domain's records may be cached by resolvers or other domain servers.
	TtlSec int `pulumi:"ttlSec"`
	// The type of Record this is in the DNS system. See all record types [here](https://www.linode.com/docs/api/domains/#domain-records-list__responses).
	Type string `pulumi:"type"`
	// The relative weight of this Record. Higher values are preferred.
	Weight int `pulumi:"weight"`
}

func LookupDomainRecordOutput(ctx *pulumi.Context, args LookupDomainRecordOutputArgs, opts ...pulumi.InvokeOption) LookupDomainRecordResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupDomainRecordResult, error) {
			args := v.(LookupDomainRecordArgs)
			r, err := LookupDomainRecord(ctx, &args, opts...)
			var s LookupDomainRecordResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupDomainRecordResultOutput)
}

// A collection of arguments for invoking getDomainRecord.
type LookupDomainRecordOutputArgs struct {
	// The associated domain's unique ID.
	DomainId pulumi.IntInput `pulumi:"domainId"`
	// The unique ID of the Domain Record.
	Id pulumi.IntPtrInput `pulumi:"id"`
	// The name of the Record.
	Name pulumi.StringPtrInput `pulumi:"name"`
}

func (LookupDomainRecordOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDomainRecordArgs)(nil)).Elem()
}

// A collection of values returned by getDomainRecord.
type LookupDomainRecordResultOutput struct{ *pulumi.OutputState }

func (LookupDomainRecordResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDomainRecordResult)(nil)).Elem()
}

func (o LookupDomainRecordResultOutput) ToLookupDomainRecordResultOutput() LookupDomainRecordResultOutput {
	return o
}

func (o LookupDomainRecordResultOutput) ToLookupDomainRecordResultOutputWithContext(ctx context.Context) LookupDomainRecordResultOutput {
	return o
}

// The associated domain's unique ID.
func (o LookupDomainRecordResultOutput) DomainId() pulumi.IntOutput {
	return o.ApplyT(func(v LookupDomainRecordResult) int { return v.DomainId }).(pulumi.IntOutput)
}

// The unique ID of the Domain Record.
func (o LookupDomainRecordResultOutput) Id() pulumi.IntPtrOutput {
	return o.ApplyT(func(v LookupDomainRecordResult) *int { return v.Id }).(pulumi.IntPtrOutput)
}

// The name of the Record.
func (o LookupDomainRecordResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupDomainRecordResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// The port this Record points to.
func (o LookupDomainRecordResultOutput) Port() pulumi.IntOutput {
	return o.ApplyT(func(v LookupDomainRecordResult) int { return v.Port }).(pulumi.IntOutput)
}

// The priority of the target host. Lower values are preferred.
func (o LookupDomainRecordResultOutput) Priority() pulumi.IntOutput {
	return o.ApplyT(func(v LookupDomainRecordResult) int { return v.Priority }).(pulumi.IntOutput)
}

// The protocol this Record's service communicates with. Only valid for SRV records.
func (o LookupDomainRecordResultOutput) Protocol() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDomainRecordResult) string { return v.Protocol }).(pulumi.StringOutput)
}

// The service this Record identified. Only valid for SRV records.
func (o LookupDomainRecordResultOutput) Service() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDomainRecordResult) string { return v.Service }).(pulumi.StringOutput)
}

// The tag portion of a CAA record.
func (o LookupDomainRecordResultOutput) Tag() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDomainRecordResult) string { return v.Tag }).(pulumi.StringOutput)
}

// The target for this Record. This field's actual usage depends on the type of record this represents. For A and AAAA records, this is the address the named Domain should resolve to.
func (o LookupDomainRecordResultOutput) Target() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDomainRecordResult) string { return v.Target }).(pulumi.StringOutput)
}

// The amount of time in seconds that this Domain's records may be cached by resolvers or other domain servers.
func (o LookupDomainRecordResultOutput) TtlSec() pulumi.IntOutput {
	return o.ApplyT(func(v LookupDomainRecordResult) int { return v.TtlSec }).(pulumi.IntOutput)
}

// The type of Record this is in the DNS system. See all record types [here](https://www.linode.com/docs/api/domains/#domain-records-list__responses).
func (o LookupDomainRecordResultOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDomainRecordResult) string { return v.Type }).(pulumi.StringOutput)
}

// The relative weight of this Record. Higher values are preferred.
func (o LookupDomainRecordResultOutput) Weight() pulumi.IntOutput {
	return o.ApplyT(func(v LookupDomainRecordResult) int { return v.Weight }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupDomainRecordResultOutput{})
}
