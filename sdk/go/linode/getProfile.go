// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-linode/sdk/v4/go/linode/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides information about a Linode profile.
// For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-profile).
//
// ## Example Usage
//
// The following example shows how one might use this data source to access profile details.
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
//			_, err := linode.GetProfile(ctx, map[string]interface{}{}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetProfile(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetProfileResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetProfileResult
	err := ctx.Invoke("linode:index/getProfile:getProfile", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getProfile.
type GetProfileResult struct {
	// The list of SSH Keys authorized to use Lish for this user. This value is ignored if lishAuthMethod is 'disabled'.
	AuthorizedKeys []string `pulumi:"authorizedKeys"`
	// The profile email address. This address will be used for communication with Linode as necessary.
	Email string `pulumi:"email"`
	// If true, email notifications will be sent about account activity. If false, when false business-critical communications may still be sent through email.
	EmailNotifications bool   `pulumi:"emailNotifications"`
	Id                 string `pulumi:"id"`
	// If true, logins for the user will only be allowed from whitelisted IPs. This setting is currently deprecated, and cannot be enabled.
	IpWhitelistEnabled bool `pulumi:"ipWhitelistEnabled"`
	// The methods of authentication allowed when connecting via Lish. 'keys_only' is the most secure with the intent to use Lish, and 'disabled' is recommended for users that will not use Lish at all.
	LishAuthMethod string `pulumi:"lishAuthMethod"`
	// Credit Card information associated with this Account.
	Referrals GetProfileReferrals `pulumi:"referrals"`
	// If true, the user has restrictions on what can be accessed on the Account.
	Restricted bool `pulumi:"restricted"`
	// The profile's preferred timezone. This is not used by the API, and is for the benefit of clients only. All times the API returns are in UTC.
	Timezone string `pulumi:"timezone"`
	// If true, logins from untrusted computers will require Two Factor Authentication.
	TwoFactorAuth bool `pulumi:"twoFactorAuth"`
	// The username for logging in to Linode services.
	Username string `pulumi:"username"`
}

func GetProfileOutput(ctx *pulumi.Context, opts ...pulumi.InvokeOption) GetProfileResultOutput {
	return pulumi.ToOutput(0).ApplyT(func(int) (GetProfileResultOutput, error) {
		options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
		return ctx.InvokeOutput("linode:index/getProfile:getProfile", nil, GetProfileResultOutput{}, options).(GetProfileResultOutput), nil
	}).(GetProfileResultOutput)
}

// A collection of values returned by getProfile.
type GetProfileResultOutput struct{ *pulumi.OutputState }

func (GetProfileResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetProfileResult)(nil)).Elem()
}

func (o GetProfileResultOutput) ToGetProfileResultOutput() GetProfileResultOutput {
	return o
}

func (o GetProfileResultOutput) ToGetProfileResultOutputWithContext(ctx context.Context) GetProfileResultOutput {
	return o
}

// The list of SSH Keys authorized to use Lish for this user. This value is ignored if lishAuthMethod is 'disabled'.
func (o GetProfileResultOutput) AuthorizedKeys() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetProfileResult) []string { return v.AuthorizedKeys }).(pulumi.StringArrayOutput)
}

// The profile email address. This address will be used for communication with Linode as necessary.
func (o GetProfileResultOutput) Email() pulumi.StringOutput {
	return o.ApplyT(func(v GetProfileResult) string { return v.Email }).(pulumi.StringOutput)
}

// If true, email notifications will be sent about account activity. If false, when false business-critical communications may still be sent through email.
func (o GetProfileResultOutput) EmailNotifications() pulumi.BoolOutput {
	return o.ApplyT(func(v GetProfileResult) bool { return v.EmailNotifications }).(pulumi.BoolOutput)
}

func (o GetProfileResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetProfileResult) string { return v.Id }).(pulumi.StringOutput)
}

// If true, logins for the user will only be allowed from whitelisted IPs. This setting is currently deprecated, and cannot be enabled.
func (o GetProfileResultOutput) IpWhitelistEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v GetProfileResult) bool { return v.IpWhitelistEnabled }).(pulumi.BoolOutput)
}

// The methods of authentication allowed when connecting via Lish. 'keys_only' is the most secure with the intent to use Lish, and 'disabled' is recommended for users that will not use Lish at all.
func (o GetProfileResultOutput) LishAuthMethod() pulumi.StringOutput {
	return o.ApplyT(func(v GetProfileResult) string { return v.LishAuthMethod }).(pulumi.StringOutput)
}

// Credit Card information associated with this Account.
func (o GetProfileResultOutput) Referrals() GetProfileReferralsOutput {
	return o.ApplyT(func(v GetProfileResult) GetProfileReferrals { return v.Referrals }).(GetProfileReferralsOutput)
}

// If true, the user has restrictions on what can be accessed on the Account.
func (o GetProfileResultOutput) Restricted() pulumi.BoolOutput {
	return o.ApplyT(func(v GetProfileResult) bool { return v.Restricted }).(pulumi.BoolOutput)
}

// The profile's preferred timezone. This is not used by the API, and is for the benefit of clients only. All times the API returns are in UTC.
func (o GetProfileResultOutput) Timezone() pulumi.StringOutput {
	return o.ApplyT(func(v GetProfileResult) string { return v.Timezone }).(pulumi.StringOutput)
}

// If true, logins from untrusted computers will require Two Factor Authentication.
func (o GetProfileResultOutput) TwoFactorAuth() pulumi.BoolOutput {
	return o.ApplyT(func(v GetProfileResult) bool { return v.TwoFactorAuth }).(pulumi.BoolOutput)
}

// The username for logging in to Linode services.
func (o GetProfileResultOutput) Username() pulumi.StringOutput {
	return o.ApplyT(func(v GetProfileResult) string { return v.Username }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetProfileResultOutput{})
}
