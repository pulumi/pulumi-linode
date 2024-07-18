// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * `linode.SshKey` provides access to a filtered list of SSH Keys in the Profile of the User identified by the access token.
 * For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-ssh-keys).
 *
 * ## Example Usage
 *
 * The following example shows how the resource might be used to obtain the names of the SSH Keys configured on the Linode user profile.
 *
 * The following example shows how one might use this data source to access information about a Linode Kernel.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const filteredSsh = linode.getSshkeys({
 *     filters: [
 *         {
 *             name: "label",
 *             values: ["my-ssh"],
 *         },
 *         {
 *             name: "ssh_key",
 *             values: ["RSA-6522525"],
 *         },
 *     ],
 * });
 * ```
 *
 * ## Filterable Fields
 *
 * * `id`
 *
 * * `label`
 *
 * * `sshKey`
 */
export function getSshkeys(args?: GetSshkeysArgs, opts?: pulumi.InvokeOptions): Promise<GetSshkeysResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("linode:index/getSshkeys:getSshkeys", {
        "filters": args.filters,
        "order": args.order,
        "orderBy": args.orderBy,
        "sshkeys": args.sshkeys,
    }, opts);
}

/**
 * A collection of arguments for invoking getSshkeys.
 */
export interface GetSshkeysArgs {
    filters?: inputs.GetSshkeysFilter[];
    /**
     * The order in which results should be returned. (`asc`, `desc`; default `asc`)
     */
    order?: string;
    /**
     * The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
     */
    orderBy?: string;
    sshkeys?: inputs.GetSshkeysSshkey[];
}

/**
 * A collection of values returned by getSshkeys.
 */
export interface GetSshkeysResult {
    readonly filters?: outputs.GetSshkeysFilter[];
    /**
     * The ID of the SSH Key.
     */
    readonly id: string;
    readonly order?: string;
    readonly orderBy?: string;
    readonly sshkeys?: outputs.GetSshkeysSshkey[];
}
/**
 * `linode.SshKey` provides access to a filtered list of SSH Keys in the Profile of the User identified by the access token.
 * For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-ssh-keys).
 *
 * ## Example Usage
 *
 * The following example shows how the resource might be used to obtain the names of the SSH Keys configured on the Linode user profile.
 *
 * The following example shows how one might use this data source to access information about a Linode Kernel.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const filteredSsh = linode.getSshkeys({
 *     filters: [
 *         {
 *             name: "label",
 *             values: ["my-ssh"],
 *         },
 *         {
 *             name: "ssh_key",
 *             values: ["RSA-6522525"],
 *         },
 *     ],
 * });
 * ```
 *
 * ## Filterable Fields
 *
 * * `id`
 *
 * * `label`
 *
 * * `sshKey`
 */
export function getSshkeysOutput(args?: GetSshkeysOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSshkeysResult> {
    return pulumi.output(args).apply((a: any) => getSshkeys(a, opts))
}

/**
 * A collection of arguments for invoking getSshkeys.
 */
export interface GetSshkeysOutputArgs {
    filters?: pulumi.Input<pulumi.Input<inputs.GetSshkeysFilterArgs>[]>;
    /**
     * The order in which results should be returned. (`asc`, `desc`; default `asc`)
     */
    order?: pulumi.Input<string>;
    /**
     * The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
     */
    orderBy?: pulumi.Input<string>;
    sshkeys?: pulumi.Input<pulumi.Input<inputs.GetSshkeysSshkeyArgs>[]>;
}
