// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
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
// 	"github.com/pulumi/pulumi-linode/sdk/v3/go/linode"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		opt0 := 14950401
// 		_, err := linode.LookupDomainRecord(ctx, &linode.LookupDomainRecordArgs{
// 			DomainId: 3150401,
// 			Id:       &opt0,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		opt1 := "www"
// 		_, err = linode.LookupDomainRecord(ctx, &linode.LookupDomainRecordArgs{
// 			DomainId: 3150401,
// 			Name:     &opt1,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
// ## Attributes
//
// The Linode Volume resource exports the following attributes:
//
// - `id` - The unique ID of the Domain Record.
//
// - `name` - The name of the Record.
//
// - `domainId` - The associated domain's unique ID.
//
// - `type` - The type of Record this is in the DNS system. See all record types [here](https://www.linode.com/docs/api/domains/#domain-records-list__responses).
//
// - `ttlSec` - The amount of time in seconds that this Domain's records may be cached by resolvers or other domain servers.
//
// - `target` - The target for this Record. This field's actual usage depends on the type of record this represents. For A and AAAA records, this is the address the named Domain should resolve to.
//
// - `priority` - The priority of the target host. Lower values are preferred.
//
// - `weight` - The relative weight of this Record. Higher values are preferred.
//
// - `port` - The port this Record points to.
//
// - `protocol` - The protocol this Record's service communicates with. Only valid for SRV records.
//
// - `service` - The service this Record identified. Only valid for SRV records.
//
// - `tag` - The tag portion of a CAA record.
func LookupDomainRecord(ctx *pulumi.Context, args *LookupDomainRecordArgs, opts ...pulumi.InvokeOption) (*LookupDomainRecordResult, error) {
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
	DomainId int     `pulumi:"domainId"`
	Id       *int    `pulumi:"id"`
	Name     *string `pulumi:"name"`
	Port     int     `pulumi:"port"`
	Priority int     `pulumi:"priority"`
	Protocol string  `pulumi:"protocol"`
	Service  string  `pulumi:"service"`
	Tag      string  `pulumi:"tag"`
	Target   string  `pulumi:"target"`
	TtlSec   int     `pulumi:"ttlSec"`
	Type     string  `pulumi:"type"`
	Weight   int     `pulumi:"weight"`
}
