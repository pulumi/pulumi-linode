// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides information about Linode account logins that match a set of filters.
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
    }, opts);
}

/**
 * A collection of arguments for invoking getAccountLogins.
 */
export interface GetAccountLoginsArgs {
    filters?: inputs.GetAccountLoginsFilter[];
}

/**
 * A collection of values returned by getAccountLogins.
 */
export interface GetAccountLoginsResult {
    readonly filters?: outputs.GetAccountLoginsFilter[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly logins: outputs.GetAccountLoginsLogin[];
}
/**
 * Provides information about Linode account logins that match a set of filters.
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
 * ## Filterable Fields
 *
 * * `ip`
 *
 * * `restricted`
 *
 * * `username`
 */
export function getAccountLoginsOutput(args?: GetAccountLoginsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetAccountLoginsResult> {
    return pulumi.output(args).apply((a: any) => getAccountLogins(a, opts))
}

/**
 * A collection of arguments for invoking getAccountLogins.
 */
export interface GetAccountLoginsOutputArgs {
    filters?: pulumi.Input<pulumi.Input<inputs.GetAccountLoginsFilterArgs>[]>;
}
