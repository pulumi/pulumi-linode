// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * `linode.getRegion` provides details about a specific Linode region. See all regions [here](https://api.linode.com/v4/regions).
 *
 * ## Example Usage
 *
 * The following example shows how the resource might be used to obtain additional information about a Linode region.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const region = pulumi.output(linode.getRegion({
 *     id: "us-east",
 * }));
 * ```
 */
export function getRegion(args: GetRegionArgs, opts?: pulumi.InvokeOptions): Promise<GetRegionResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("linode:index/getRegion:getRegion", {
        "country": args.country,
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getRegion.
 */
export interface GetRegionArgs {
    /**
     * The country the region resides in.
     */
    country?: string;
    /**
     * The code name of the region to select.
     */
    id: string;
}

/**
 * A collection of values returned by getRegion.
 */
export interface GetRegionResult {
    /**
     * The country the region resides in.
     */
    readonly country: string;
    readonly id: string;
}

export function getRegionOutput(args: GetRegionOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetRegionResult> {
    return pulumi.output(args).apply(a => getRegion(a, opts))
}

/**
 * A collection of arguments for invoking getRegion.
 */
export interface GetRegionOutputArgs {
    /**
     * The country the region resides in.
     */
    country?: pulumi.Input<string>;
    /**
     * The code name of the region to select.
     */
    id: pulumi.Input<string>;
}
