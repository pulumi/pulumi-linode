// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides information about Linode regions that match a set of filters.
 * For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-regions).
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const filtered_regions = linode.getRegions({
 *     filters: [
 *         {
 *             name: "status",
 *             values: ["ok"],
 *         },
 *         {
 *             name: "capabilities",
 *             values: ["NodeBalancers"],
 *         },
 *     ],
 * });
 * export const regions = filtered_regions.then(filtered_regions => filtered_regions.regions);
 * ```
 *
 * ## Filterable Fields
 *
 * * `status`
 *
 * * `country`
 *
 * * `capabilities`
 *
 * * `siteType`
 */
export function getRegions(args?: GetRegionsArgs, opts?: pulumi.InvokeOptions): Promise<GetRegionsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("linode:index/getRegions:getRegions", {
        "filters": args.filters,
        "regions": args.regions,
    }, opts);
}

/**
 * A collection of arguments for invoking getRegions.
 */
export interface GetRegionsArgs {
    filters?: inputs.GetRegionsFilter[];
    regions?: inputs.GetRegionsRegion[];
}

/**
 * A collection of values returned by getRegions.
 */
export interface GetRegionsResult {
    readonly filters?: outputs.GetRegionsFilter[];
    readonly id: string;
    readonly regions?: outputs.GetRegionsRegion[];
}
/**
 * Provides information about Linode regions that match a set of filters.
 * For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-regions).
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const filtered_regions = linode.getRegions({
 *     filters: [
 *         {
 *             name: "status",
 *             values: ["ok"],
 *         },
 *         {
 *             name: "capabilities",
 *             values: ["NodeBalancers"],
 *         },
 *     ],
 * });
 * export const regions = filtered_regions.then(filtered_regions => filtered_regions.regions);
 * ```
 *
 * ## Filterable Fields
 *
 * * `status`
 *
 * * `country`
 *
 * * `capabilities`
 *
 * * `siteType`
 */
export function getRegionsOutput(args?: GetRegionsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetRegionsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("linode:index/getRegions:getRegions", {
        "filters": args.filters,
        "regions": args.regions,
    }, opts);
}

/**
 * A collection of arguments for invoking getRegions.
 */
export interface GetRegionsOutputArgs {
    filters?: pulumi.Input<pulumi.Input<inputs.GetRegionsFilterArgs>[]>;
    regions?: pulumi.Input<pulumi.Input<inputs.GetRegionsRegionArgs>[]>;
}
