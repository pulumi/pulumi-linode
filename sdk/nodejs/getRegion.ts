// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * `linode.getRegion` provides details about a specific Linode region. See all regions [here](https://api.linode.com/v4/regions).
 * For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-region).
 *
 * ## Example Usage
 *
 * The following example shows how the resource might be used to obtain additional information about a Linode region.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const region = linode.getRegion({
 *     id: "us-east",
 * });
 * ```
 */
export function getRegion(args: GetRegionArgs, opts?: pulumi.InvokeOptions): Promise<GetRegionResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("linode:index/getRegion:getRegion", {
        "id": args.id,
        "resolvers": args.resolvers,
    }, opts);
}

/**
 * A collection of arguments for invoking getRegion.
 */
export interface GetRegionArgs {
    /**
     * The code name of the region to select.
     */
    id: string;
    resolvers?: inputs.GetRegionResolver[];
}

/**
 * A collection of values returned by getRegion.
 */
export interface GetRegionResult {
    /**
     * A list of capabilities of this region.
     */
    readonly capabilities: string[];
    /**
     * The country the region resides in.
     */
    readonly country: string;
    readonly id: string;
    /**
     * Detailed location information for this Region, including city, state or region, and country.
     */
    readonly label: string;
    readonly placementGroupLimits: outputs.GetRegionPlacementGroupLimit[];
    readonly resolvers?: outputs.GetRegionResolver[];
    /**
     * The type of this region.
     */
    readonly siteType: string;
    /**
     * This region’s current operational status (ok or outage).
     */
    readonly status: string;
}
/**
 * `linode.getRegion` provides details about a specific Linode region. See all regions [here](https://api.linode.com/v4/regions).
 * For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-region).
 *
 * ## Example Usage
 *
 * The following example shows how the resource might be used to obtain additional information about a Linode region.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const region = linode.getRegion({
 *     id: "us-east",
 * });
 * ```
 */
export function getRegionOutput(args: GetRegionOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetRegionResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("linode:index/getRegion:getRegion", {
        "id": args.id,
        "resolvers": args.resolvers,
    }, opts);
}

/**
 * A collection of arguments for invoking getRegion.
 */
export interface GetRegionOutputArgs {
    /**
     * The code name of the region to select.
     */
    id: pulumi.Input<string>;
    resolvers?: pulumi.Input<pulumi.Input<inputs.GetRegionResolverArgs>[]>;
}
