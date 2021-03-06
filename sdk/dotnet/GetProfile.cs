// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode
{
    public static class GetProfile
    {
        /// <summary>
        /// Provides information about a Linode profile.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// The following example shows how one might use this data source to access profile details.
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var profile = Output.Create(Linode.GetProfile.InvokeAsync());
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// ## Attributes
        /// 
        /// The Linode Profile resource exports the following attributes:
        /// 
        /// * `email` - The profile email address. This address will be used for communication with Linode as necessary.
        /// 
        /// * `timezone` - The profile's preferred timezone. This is not used by the API, and is for the benefit of clients only. All times the API returns are in UTC.
        /// 
        /// * `email_notifications` - If true, email notifications will be sent about account activity. If false, when false business-critical communications may still be sent through email.
        /// 
        /// * `username` - The username for logging in to Linode services.
        /// 
        /// * `ip_whitelist_enabled` - If true, logins for the user will only be allowed from whitelisted IPs. This setting is currently deprecated, and cannot be enabled.
        /// 
        /// * `lish_auth_method` - The methods of authentication allowed when connecting via Lish. 'keys_only' is the most secure with the intent to use Lish, and 'disabled' is recommended for users that will not use Lish at all.
        /// 
        /// * `authorized_keys` - The list of SSH Keys authorized to use Lish for this user. This value is ignored if lish_auth_method is 'disabled'.
        /// 
        /// * `two_factor_auth` - If true, logins from untrusted computers will require Two Factor Authentication.
        /// 
        /// * `restricted` - If true, the user has restrictions on what can be accessed on the Account.
        /// 
        /// * `referrals` - Credit Card information associated with this Account.
        /// 
        /// * `referrals.0.total` - The number of users who have signed up with the referral code.
        /// 
        /// * `referrals.0.credit` - The amount of account credit in US Dollars issued to the account through the referral program.
        /// 
        /// * `referrals.0.completed` - The number of completed signups with the referral code.
        /// 
        /// * `referrals.0.pending` - The number of pending signups for the referral code. To receive credit the signups must be completed.
        /// 
        /// * `referrals.0.code` - The Profile referral code.  If new accounts use this when signing up for Linode, referring account will receive credit.
        /// 
        /// * `referrals.0.url` - The referral URL.
        /// </summary>
        public static Task<GetProfileResult> InvokeAsync(InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetProfileResult>("linode:index/getProfile:getProfile", InvokeArgs.Empty, options.WithVersion());
    }


    [OutputType]
    public sealed class GetProfileResult
    {
        public readonly ImmutableArray<string> AuthorizedKeys;
        public readonly string Email;
        public readonly bool EmailNotifications;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly bool IpWhitelistEnabled;
        public readonly string LishAuthMethod;
        public readonly Outputs.GetProfileReferralsResult Referrals;
        public readonly bool Restricted;
        public readonly string Timezone;
        public readonly bool TwoFactorAuth;
        public readonly string Username;

        [OutputConstructor]
        private GetProfileResult(
            ImmutableArray<string> authorizedKeys,

            string email,

            bool emailNotifications,

            string id,

            bool ipWhitelistEnabled,

            string lishAuthMethod,

            Outputs.GetProfileReferralsResult referrals,

            bool restricted,

            string timezone,

            bool twoFactorAuth,

            string username)
        {
            AuthorizedKeys = authorizedKeys;
            Email = email;
            EmailNotifications = emailNotifications;
            Id = id;
            IpWhitelistEnabled = ipWhitelistEnabled;
            LishAuthMethod = lishAuthMethod;
            Referrals = referrals;
            Restricted = restricted;
            Timezone = timezone;
            TwoFactorAuth = twoFactorAuth;
            Username = username;
        }
    }
}
