// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides information about a Linode account.
 * 
 * This data source should not be used in conjuction with the `LINODE_DEBUG` option.  See the [debugging notes](https://www.terraform.io/docs/providers/linode/index.html#debugging) for more details.
 * 
 * ## Example Usage
 * 
 * 
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 * 
 * const account = pulumi.output(linode.getAccount({ async: true }));
 * ```
 * 
 * ## Attributes
 * 
 * The Linode Account resource exports the following attributes:
 * 
 * * `email` - The email address for this Account, for account management communications, and may be used for other communications as configured.
 * 
 * * `firstName` - The first name of the person associated with this Account.
 * 
 * * `lastName` - The last name of the person associated with this Account.
 * 
 * * `company` - The company name associated with this Account.
 * 
 * * `address1` - First line of this Account's billing address.
 * 
 * * `address2` - Second line of this Account's billing address.
 * 
 * * `phone` - The phone number associated with this Account.
 * 
 * * `city` - The city for this Account's billing address.
 * 
 * * `state` - If billing address is in the United States, this is the State portion of the Account's billing address. If the address is outside the US, this is the Province associated with the Account's billing address.
 * 
 * * `country` - The two-letter country code of this Account's billing address.
 * 
 * * `zip` - The zip code of this Account's billing address.
 * 
 * * `balance` - This Account's balance, in US dollars.
 *
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-linode/blob/master/website/docs/d/account.html.md.
 */
export function getAccount(opts?: pulumi.InvokeOptions): Promise<GetAccountResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("linode:index/getAccount:getAccount", {
    }, opts);
}

/**
 * A collection of values returned by getAccount.
 */
export interface GetAccountResult {
    readonly address1: string;
    readonly address2: string;
    readonly balance: number;
    readonly city: string;
    readonly company: string;
    readonly country: string;
    readonly email: string;
    readonly firstName: string;
    readonly lastName: string;
    readonly phone: string;
    readonly state: string;
    readonly zip: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
