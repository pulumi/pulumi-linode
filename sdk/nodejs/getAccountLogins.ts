// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides information about Linode account logins that match a set of filters.
 * For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-account-logins).
 *
 * ## Example Usage
 *
 * The following example shows how one might use this data source to access information about a Linode account login.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const filtered-account-logins = linode.getAccountLogins({
 *     filters: [
 *         {
 *             name: "restricted",
 *             values: ["true"],
 *         },
 *         {
 *             name: "username",
 *             values: ["myUsername"],
 *         },
 *     ],
 * });
 * export const loginIds = filtered_account_logins.then(filtered_account_logins => filtered_account_logins.logins.map(__item => __item.id));
 * ```
 *
 * ## Filterable Fields
 *
 * * `ip`
 *
 * * `restricted`
 *
 * * `username`
 */
export function getAccountLogins(args?: GetAccountLoginsArgs, opts?: pulumi.InvokeOptions): Promise<GetAccountLoginsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("linode:index/getAccountLogins:getAccountLogins", {
        "filters": args.filters,
        "logins": args.logins,
    }, opts);
}

/**
 * A collection of arguments for invoking getAccountLogins.
 */
export interface GetAccountLoginsArgs {
    filters?: inputs.GetAccountLoginsFilter[];
    logins?: inputs.GetAccountLoginsLogin[];
}

/**
 * A collection of values returned by getAccountLogins.
 */
export interface GetAccountLoginsResult {
    readonly filters?: outputs.GetAccountLoginsFilter[];
    /**
     * The unique ID of this login object.
     */
    readonly id: string;
    readonly logins?: outputs.GetAccountLoginsLogin[];
}
/**
 * Provides information about Linode account logins that match a set of filters.
 * For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-account-logins).
 *
 * ## Example Usage
 *
 * The following example shows how one might use this data source to access information about a Linode account login.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const filtered-account-logins = linode.getAccountLogins({
 *     filters: [
 *         {
 *             name: "restricted",
 *             values: ["true"],
 *         },
 *         {
 *             name: "username",
 *             values: ["myUsername"],
 *         },
 *     ],
 * });
 * export const loginIds = filtered_account_logins.then(filtered_account_logins => filtered_account_logins.logins.map(__item => __item.id));
 * ```
 *
 * ## Filterable Fields
 *
 * * `ip`
 *
 * * `restricted`
 *
 * * `username`
 */
export function getAccountLoginsOutput(args?: GetAccountLoginsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetAccountLoginsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("linode:index/getAccountLogins:getAccountLogins", {
        "filters": args.filters,
        "logins": args.logins,
    }, opts);
}

/**
 * A collection of arguments for invoking getAccountLogins.
 */
export interface GetAccountLoginsOutputArgs {
    filters?: pulumi.Input<pulumi.Input<inputs.GetAccountLoginsFilterArgs>[]>;
    logins?: pulumi.Input<pulumi.Input<inputs.GetAccountLoginsLoginArgs>[]>;
}
