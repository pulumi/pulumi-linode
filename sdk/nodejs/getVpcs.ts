// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides information about a list of Linode VPCs that match a set of filters.
 * For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-vpcs).
 *
 * ## Example Usage
 *
 * The following example shows how one might use this data source to list VPCs.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const filtered-vpcs = linode.getVpcs({
 *     filters: [{
 *         name: "label",
 *         values: ["test"],
 *     }],
 * });
 * export const vpcs = filtered_vpcs.then(filtered_vpcs => filtered_vpcs.vpcs);
 * ```
 *
 * ## Filterable Fields
 *
 * * `id`
 *
 * * `label`
 *
 * * `description`
 *
 * * `region`
 */
export function getVpcs(args?: GetVpcsArgs, opts?: pulumi.InvokeOptions): Promise<GetVpcsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("linode:index/getVpcs:getVpcs", {
        "filters": args.filters,
        "vpcs": args.vpcs,
    }, opts);
}

/**
 * A collection of arguments for invoking getVpcs.
 */
export interface GetVpcsArgs {
    filters?: inputs.GetVpcsFilter[];
    vpcs?: inputs.GetVpcsVpc[];
}

/**
 * A collection of values returned by getVpcs.
 */
export interface GetVpcsResult {
    readonly filters?: outputs.GetVpcsFilter[];
    /**
     * The unique id of this VPC.
     */
    readonly id: string;
    readonly vpcs?: outputs.GetVpcsVpc[];
}
/**
 * Provides information about a list of Linode VPCs that match a set of filters.
 * For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-vpcs).
 *
 * ## Example Usage
 *
 * The following example shows how one might use this data source to list VPCs.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const filtered-vpcs = linode.getVpcs({
 *     filters: [{
 *         name: "label",
 *         values: ["test"],
 *     }],
 * });
 * export const vpcs = filtered_vpcs.then(filtered_vpcs => filtered_vpcs.vpcs);
 * ```
 *
 * ## Filterable Fields
 *
 * * `id`
 *
 * * `label`
 *
 * * `description`
 *
 * * `region`
 */
export function getVpcsOutput(args?: GetVpcsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetVpcsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("linode:index/getVpcs:getVpcs", {
        "filters": args.filters,
        "vpcs": args.vpcs,
    }, opts);
}

/**
 * A collection of arguments for invoking getVpcs.
 */
export interface GetVpcsOutputArgs {
    filters?: pulumi.Input<pulumi.Input<inputs.GetVpcsFilterArgs>[]>;
    vpcs?: pulumi.Input<pulumi.Input<inputs.GetVpcsVpcArgs>[]>;
}
