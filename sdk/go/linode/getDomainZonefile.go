// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-linode/sdk/v4/go/linode/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides information about a Linode Domain Zonefile.
//
// ## Example Usage
//
// The following example shows how one might use this data source to access information about a Linode Domain Zonefile.
//
// <!--Start PulumiCodeChooser -->
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
//			_, err := linode.GetDomainZonefile(ctx, &linode.GetDomainZonefileArgs{
//				DomainId: 3150401,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
func GetDomainZonefile(ctx *pulumi.Context, args *GetDomainZonefileArgs, opts ...pulumi.InvokeOption) (*GetDomainZonefileResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetDomainZonefileResult
	err := ctx.Invoke("linode:index/getDomainZonefile:getDomainZonefile", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDomainZonefile.
type GetDomainZonefileArgs struct {
	// The associated domain's unique ID.
	DomainId int `pulumi:"domainId"`
}

// A collection of values returned by getDomainZonefile.
type GetDomainZonefileResult struct {
	// The associated domain's unique ID.
	DomainId int    `pulumi:"domainId"`
	Id       string `pulumi:"id"`
	// Array of strings representing the Domain Zonefile.
	ZoneFiles []string `pulumi:"zoneFiles"`
}

func GetDomainZonefileOutput(ctx *pulumi.Context, args GetDomainZonefileOutputArgs, opts ...pulumi.InvokeOption) GetDomainZonefileResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetDomainZonefileResult, error) {
			args := v.(GetDomainZonefileArgs)
			r, err := GetDomainZonefile(ctx, &args, opts...)
			var s GetDomainZonefileResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetDomainZonefileResultOutput)
}

// A collection of arguments for invoking getDomainZonefile.
type GetDomainZonefileOutputArgs struct {
	// The associated domain's unique ID.
	DomainId pulumi.IntInput `pulumi:"domainId"`
}

func (GetDomainZonefileOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDomainZonefileArgs)(nil)).Elem()
}

// A collection of values returned by getDomainZonefile.
type GetDomainZonefileResultOutput struct{ *pulumi.OutputState }

func (GetDomainZonefileResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetDomainZonefileResult)(nil)).Elem()
}

func (o GetDomainZonefileResultOutput) ToGetDomainZonefileResultOutput() GetDomainZonefileResultOutput {
	return o
}

func (o GetDomainZonefileResultOutput) ToGetDomainZonefileResultOutputWithContext(ctx context.Context) GetDomainZonefileResultOutput {
	return o
}

// The associated domain's unique ID.
func (o GetDomainZonefileResultOutput) DomainId() pulumi.IntOutput {
	return o.ApplyT(func(v GetDomainZonefileResult) int { return v.DomainId }).(pulumi.IntOutput)
}

func (o GetDomainZonefileResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetDomainZonefileResult) string { return v.Id }).(pulumi.StringOutput)
}

// Array of strings representing the Domain Zonefile.
func (o GetDomainZonefileResultOutput) ZoneFiles() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetDomainZonefileResult) []string { return v.ZoneFiles }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetDomainZonefileResultOutput{})
}
