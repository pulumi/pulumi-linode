// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-linode/sdk/v4/go/linode/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides information about a Linode account.
//
// Due to the sensitive nature of the data exposed by this data source, it should not be used in conjunction with the `LINODE_DEBUG` option.  See the [debugging notes](https://www.terraform.io/providers/linode/linode/latest/docs#debugging) for more details.
//
// ## Example Usage
//
// The following example shows how one might use this data source to access account details.
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
//			_, err := linode.GetAccount(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetAccount(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetAccountResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetAccountResult
	err := ctx.Invoke("linode:index/getAccount:getAccount", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getAccount.
type GetAccountResult struct {
	// When this account was first activated.
	ActiveSince string `pulumi:"activeSince"`
	// First line of this Account's billing address.
	Address1 string `pulumi:"address1"`
	// Second line of this Account's billing address.
	Address2 string `pulumi:"address2"`
	// This Account's balance, in US dollars.
	Balance float64 `pulumi:"balance"`
	// A set containing all the capabilities of the current Account.
	Capabilities []string `pulumi:"capabilities"`
	// The city for this Account's billing address.
	City string `pulumi:"city"`
	// The company name associated with this Account.
	Company string `pulumi:"company"`
	// The two-letter country code of this Account's billing address.
	Country string `pulumi:"country"`
	// The email address for this Account, for account management communications, and may be used for other communications as configured.
	Email string `pulumi:"email"`
	Euuid string `pulumi:"euuid"`
	// The first name of the person associated with this Account.
	FirstName string `pulumi:"firstName"`
	Id        string `pulumi:"id"`
	// The last name of the person associated with this Account.
	LastName string `pulumi:"lastName"`
	// The phone number associated with this Account.
	Phone string `pulumi:"phone"`
	// If billing address is in the United States, this is the State portion of the Account's billing address. If the address is outside the US, this is the Province associated with the Account's billing address.
	State string `pulumi:"state"`
	// The zip code of this Account's billing address.
	Zip string `pulumi:"zip"`
}

func GetAccountOutput(ctx *pulumi.Context, opts ...pulumi.InvokeOption) GetAccountResultOutput {
	return pulumi.ToOutput(0).ApplyT(func(int) (GetAccountResult, error) {
		r, err := GetAccount(ctx, opts...)
		var s GetAccountResult
		if r != nil {
			s = *r
		}
		return s, err
	}).(GetAccountResultOutput)
}

// A collection of values returned by getAccount.
type GetAccountResultOutput struct{ *pulumi.OutputState }

func (GetAccountResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAccountResult)(nil)).Elem()
}

func (o GetAccountResultOutput) ToGetAccountResultOutput() GetAccountResultOutput {
	return o
}

func (o GetAccountResultOutput) ToGetAccountResultOutputWithContext(ctx context.Context) GetAccountResultOutput {
	return o
}

// When this account was first activated.
func (o GetAccountResultOutput) ActiveSince() pulumi.StringOutput {
	return o.ApplyT(func(v GetAccountResult) string { return v.ActiveSince }).(pulumi.StringOutput)
}

// First line of this Account's billing address.
func (o GetAccountResultOutput) Address1() pulumi.StringOutput {
	return o.ApplyT(func(v GetAccountResult) string { return v.Address1 }).(pulumi.StringOutput)
}

// Second line of this Account's billing address.
func (o GetAccountResultOutput) Address2() pulumi.StringOutput {
	return o.ApplyT(func(v GetAccountResult) string { return v.Address2 }).(pulumi.StringOutput)
}

// This Account's balance, in US dollars.
func (o GetAccountResultOutput) Balance() pulumi.Float64Output {
	return o.ApplyT(func(v GetAccountResult) float64 { return v.Balance }).(pulumi.Float64Output)
}

// A set containing all the capabilities of the current Account.
func (o GetAccountResultOutput) Capabilities() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetAccountResult) []string { return v.Capabilities }).(pulumi.StringArrayOutput)
}

// The city for this Account's billing address.
func (o GetAccountResultOutput) City() pulumi.StringOutput {
	return o.ApplyT(func(v GetAccountResult) string { return v.City }).(pulumi.StringOutput)
}

// The company name associated with this Account.
func (o GetAccountResultOutput) Company() pulumi.StringOutput {
	return o.ApplyT(func(v GetAccountResult) string { return v.Company }).(pulumi.StringOutput)
}

// The two-letter country code of this Account's billing address.
func (o GetAccountResultOutput) Country() pulumi.StringOutput {
	return o.ApplyT(func(v GetAccountResult) string { return v.Country }).(pulumi.StringOutput)
}

// The email address for this Account, for account management communications, and may be used for other communications as configured.
func (o GetAccountResultOutput) Email() pulumi.StringOutput {
	return o.ApplyT(func(v GetAccountResult) string { return v.Email }).(pulumi.StringOutput)
}

func (o GetAccountResultOutput) Euuid() pulumi.StringOutput {
	return o.ApplyT(func(v GetAccountResult) string { return v.Euuid }).(pulumi.StringOutput)
}

// The first name of the person associated with this Account.
func (o GetAccountResultOutput) FirstName() pulumi.StringOutput {
	return o.ApplyT(func(v GetAccountResult) string { return v.FirstName }).(pulumi.StringOutput)
}

func (o GetAccountResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetAccountResult) string { return v.Id }).(pulumi.StringOutput)
}

// The last name of the person associated with this Account.
func (o GetAccountResultOutput) LastName() pulumi.StringOutput {
	return o.ApplyT(func(v GetAccountResult) string { return v.LastName }).(pulumi.StringOutput)
}

// The phone number associated with this Account.
func (o GetAccountResultOutput) Phone() pulumi.StringOutput {
	return o.ApplyT(func(v GetAccountResult) string { return v.Phone }).(pulumi.StringOutput)
}

// If billing address is in the United States, this is the State portion of the Account's billing address. If the address is outside the US, this is the Province associated with the Account's billing address.
func (o GetAccountResultOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v GetAccountResult) string { return v.State }).(pulumi.StringOutput)
}

// The zip code of this Account's billing address.
func (o GetAccountResultOutput) Zip() pulumi.StringOutput {
	return o.ApplyT(func(v GetAccountResult) string { return v.Zip }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetAccountResultOutput{})
}
