// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides information about a Linode account.
 *
 * This data source should not be used in conjuction with the `LINODE_DEBUG` option.  See the [debugging notes](https://www.terraform.io/providers/linode/linode/latest/docs#debugging) for more details.
 *
 * ## Example Usage
 *
 * The following example shows how one might use this data source to access account details.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const account = pulumi.output(linode.getAccount());
 * ```
 */
export function getAccount(opts?: pulumi.InvokeOptions): Promise<GetAccountResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("linode:index/getAccount:getAccount", {
    }, opts);
}

/**
 * A collection of values returned by getAccount.
 */
export interface GetAccountResult {
    /**
     * First line of this Account's billing address.
     */
    readonly address1: string;
    /**
     * Second line of this Account's billing address.
     */
    readonly address2: string;
    /**
     * This Account's balance, in US dollars.
     */
    readonly balance: number;
    /**
     * The city for this Account's billing address.
     */
    readonly city: string;
    /**
     * The company name associated with this Account.
     */
    readonly company: string;
    /**
     * The two-letter country code of this Account's billing address.
     */
    readonly country: string;
    /**
     * The email address for this Account, for account management communications, and may be used for other communications as configured.
     */
    readonly email: string;
    /**
     * The first name of the person associated with this Account.
     */
    readonly firstName: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The last name of the person associated with this Account.
     */
    readonly lastName: string;
    /**
     * The phone number associated with this Account.
     */
    readonly phone: string;
    /**
     * If billing address is in the United States, this is the State portion of the Account's billing address. If the address is outside the US, this is the Province associated with the Account's billing address.
     */
    readonly state: string;
    /**
     * The zip code of this Account's billing address.
     */
    readonly zip: string;
}
