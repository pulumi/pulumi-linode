// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides information about a Linode IPv6 Range.
 * For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-ipv6-range).
 *
 * ## Example Usage
 *
 * Get information about an IPv6 range assigned to a Linode:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const range_info = linode.getIpv6Range({
 *     range: "2001:0db8::",
 * });
 * ```
 */
export function getIpv6Range(args: GetIpv6RangeArgs, opts?: pulumi.InvokeOptions): Promise<GetIpv6RangeResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("linode:index/getIpv6Range:getIpv6Range", {
        "range": args.range,
    }, opts);
}

/**
 * A collection of arguments for invoking getIpv6Range.
 */
export interface GetIpv6RangeArgs {
    /**
     * The IPv6 range to retrieve information about.
     */
    range: string;
}

/**
 * A collection of values returned by getIpv6Range.
 */
export interface GetIpv6RangeResult {
    readonly id: string;
    readonly isBgp: boolean;
    /**
     * A set of Linodes targeted by this IPv6 range. Includes Linodes with IP sharing.
     */
    readonly linodes: number[];
    /**
     * The prefix length of the address, denoting how many addresses can be assigned from this range.
     */
    readonly prefix: number;
    readonly range: string;
    /**
     * The region for this range of IPv6 addresses.
     */
    readonly region: string;
}
/**
 * Provides information about a Linode IPv6 Range.
 * For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-ipv6-range).
 *
 * ## Example Usage
 *
 * Get information about an IPv6 range assigned to a Linode:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const range_info = linode.getIpv6Range({
 *     range: "2001:0db8::",
 * });
 * ```
 */
export function getIpv6RangeOutput(args: GetIpv6RangeOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetIpv6RangeResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("linode:index/getIpv6Range:getIpv6Range", {
        "range": args.range,
    }, opts);
}

/**
 * A collection of arguments for invoking getIpv6Range.
 */
export interface GetIpv6RangeOutputArgs {
    /**
     * The IPv6 range to retrieve information about.
     */
    range: pulumi.Input<string>;
}
