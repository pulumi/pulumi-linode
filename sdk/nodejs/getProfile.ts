// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides information about a Linode profile.
 * 
 * ## Example Usage
 * 
 * 
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 * 
 * const profile = linode.getProfile();
 * ```
 * 
 * ## Attributes
 * 
 * The Linode Profile resource exports the following attributes:
 * 
 * * `email` - The profile email address. This address will be used for communication with Linode as necessary.
 * 
 * * `timezone` - The profile's preferred timezone. This is not used by the API, and is for the benefit of clients only. All times the API returns are in UTC.
 * 
 * * `emailNotifications` - If true, email notifications will be sent about account activity. If false, when false business-critical communications may still be sent through email.
 * 
 * * `username` - The username for logging in to Linode services.
 * 
 * * `ipWhitelistEnabled` - If true, logins for the user will only be allowed from whitelisted IPs. This setting is currently deprecated, and cannot be enabled.
 * 
 * * `lishAuthMethod` - The methods of authentication allowed when connecting via Lish. 'keys_only' is the most secure with the intent to use Lish, and 'disabled' is recommended for users that will not use Lish at all.
 * 
 * * `authorizedKeys` - The list of SSH Keys authorized to use Lish for this user. This value is ignored if lishAuthMethod is 'disabled'.
 * 
 * * `twoFactorAuth` - If true, logins from untrusted computers will require Two Factor Authentication.
 * 
 * * `restricted` - If true, the user has restrictions on what can be accessed on the Account.
 * 
 * * `referrals` - Credit Card information associated with this Account.
 * 
 * * `referrals.0.total` - The number of users who have signed up with the referral code.
 * 
 * * `referrals.0.credit` - The amount of account credit in US Dollars issued to the account through the referral program.
 * 
 * * `referrals.0.completed` - The number of completed signups with the referral code.
 * 
 * * `referrals.0.pending` - The number of pending signups for the referral code. To receive credit the signups must be completed.
 * 
 * * `referrals.0.code` - The Profile referral code.  If new accounts use this when signing up for Linode, referring account will receive credit.
 * 
 * * `referrals.0.url` - The referral URL.
 *
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-linode/blob/master/website/docs/d/profile.html.md.
 */
export function getProfile(opts?: pulumi.InvokeOptions): Promise<GetProfileResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("linode:index/getProfile:getProfile", {
    }, opts);
}

/**
 * A collection of values returned by getProfile.
 */
export interface GetProfileResult {
    readonly authorizedKeys: string[];
    readonly email: string;
    readonly emailNotifications: boolean;
    readonly ipWhitelistEnabled: boolean;
    readonly lishAuthMethod: string;
    readonly referrals: outputs.GetProfileReferral[];
    readonly restricted: boolean;
    readonly timezone: string;
    readonly twoFactorAuth: boolean;
    readonly username: string;
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
