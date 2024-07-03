// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-linode/sdk/v4/go/linode/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides information about Linode Child Accounts that match a set of filters.
//
// **NOTE: Parent/Child related features may not be generally available.**
//
// ## Example Usage
//
// The following example shows how one might use this data source to access Child Accounts under the current Account.
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
//			all, err := linode.GetChildAccounts(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			filtered, err := linode.GetChildAccounts(ctx, &linode.GetChildAccountsArgs{
//				Filters: []linode.GetChildAccountsFilter{
//					{
//						Name: "email",
//						Values: []string{
//							"example@linode.com",
//						},
//					},
//					{
//						Name: "first_name",
//						Values: []string{
//							"John",
//						},
//					},
//					{
//						Name: "last_name",
//						Values: []string{
//							"Smith",
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			var splat0 []*string
//			for _, val0 := range all.ChildAccounts {
//				splat0 = append(splat0, val0.Euuid)
//			}
//			ctx.Export("allAccounts", splat0)
//			var splat1 []*string
//			for _, val0 := range filtered.ChildAccounts {
//				splat1 = append(splat1, val0.Euuid)
//			}
//			ctx.Export("filteredAccounts", splat1)
//			return nil
//		})
//	}
//
// ```
//
// ## Filterable Fields
//
// * `euuid`
//
// * `email`
//
// * `firstName`
//
// * `lastName`
//
// * `company`
//
// * `address1`
//
// * `address2`
//
// * `phone`
//
// * `city`
//
// * `state`
//
// * `country`
//
// * `zip`
//
// * `capabilities`
//
// * `activeSince`
func GetChildAccounts(ctx *pulumi.Context, args *GetChildAccountsArgs, opts ...pulumi.InvokeOption) (*GetChildAccountsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetChildAccountsResult
	err := ctx.Invoke("linode:index/getChildAccounts:getChildAccounts", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getChildAccounts.
type GetChildAccountsArgs struct {
	ChildAccounts []GetChildAccountsChildAccount `pulumi:"childAccounts"`
	Filters       []GetChildAccountsFilter       `pulumi:"filters"`
}

// A collection of values returned by getChildAccounts.
type GetChildAccountsResult struct {
	ChildAccounts []GetChildAccountsChildAccount `pulumi:"childAccounts"`
	Filters       []GetChildAccountsFilter       `pulumi:"filters"`
	Id            string                         `pulumi:"id"`
}

func GetChildAccountsOutput(ctx *pulumi.Context, args GetChildAccountsOutputArgs, opts ...pulumi.InvokeOption) GetChildAccountsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetChildAccountsResult, error) {
			args := v.(GetChildAccountsArgs)
			r, err := GetChildAccounts(ctx, &args, opts...)
			var s GetChildAccountsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetChildAccountsResultOutput)
}

// A collection of arguments for invoking getChildAccounts.
type GetChildAccountsOutputArgs struct {
	ChildAccounts GetChildAccountsChildAccountArrayInput `pulumi:"childAccounts"`
	Filters       GetChildAccountsFilterArrayInput       `pulumi:"filters"`
}

func (GetChildAccountsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetChildAccountsArgs)(nil)).Elem()
}

// A collection of values returned by getChildAccounts.
type GetChildAccountsResultOutput struct{ *pulumi.OutputState }

func (GetChildAccountsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetChildAccountsResult)(nil)).Elem()
}

func (o GetChildAccountsResultOutput) ToGetChildAccountsResultOutput() GetChildAccountsResultOutput {
	return o
}

func (o GetChildAccountsResultOutput) ToGetChildAccountsResultOutputWithContext(ctx context.Context) GetChildAccountsResultOutput {
	return o
}

func (o GetChildAccountsResultOutput) ChildAccounts() GetChildAccountsChildAccountArrayOutput {
	return o.ApplyT(func(v GetChildAccountsResult) []GetChildAccountsChildAccount { return v.ChildAccounts }).(GetChildAccountsChildAccountArrayOutput)
}

func (o GetChildAccountsResultOutput) Filters() GetChildAccountsFilterArrayOutput {
	return o.ApplyT(func(v GetChildAccountsResult) []GetChildAccountsFilter { return v.Filters }).(GetChildAccountsFilterArrayOutput)
}

func (o GetChildAccountsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetChildAccountsResult) string { return v.Id }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetChildAccountsResultOutput{})
}
