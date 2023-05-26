// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package linode

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides information about a Linode profile.
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
//			_, err := linode.GetProfile(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetProfile(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetProfileResult, error) {
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
