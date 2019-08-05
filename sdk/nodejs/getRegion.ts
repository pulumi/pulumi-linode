// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * `linode_region` provides details about a specific Linode region.
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
 *
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-linode/blob/master/website/docs/d/region.html.markdown.
 */
export function getRegion(args: GetRegionArgs, opts?: pulumi.InvokeOptions): Promise<GetRegionResult> & GetRegionResult {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    const promise: Promise<GetRegionResult> = pulumi.runtime.invoke("linode:index/getRegion:getRegion", {
        "country": args.country,
        "id": args.id,
    }, opts);

    return pulumi.utils.liftProperties(promise, opts);
}

/**
 * A collection of arguments for invoking getRegion.
 */
export interface GetRegionArgs {
    readonly country?: string;
    readonly id: string;
}

/**
 * A collection of values returned by getRegion.
 */
export interface GetRegionResult {
    readonly country: string;
    readonly id: string;
}
