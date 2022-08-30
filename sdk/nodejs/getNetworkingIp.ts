// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides information about a Linode Networking IP Address
 *
 * ## Example Usage
 *
 * The following example shows how one might use this data source to access information about a Linode Networking IP Address.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const ns1LinodeCom = pulumi.output(linode.getNetworkingIp({
 *     address: "162.159.27.72",
 * }));
 * ```
 */
export function getNetworkingIp(args: GetNetworkingIpArgs, opts?: pulumi.InvokeOptions): Promise<GetNetworkingIpResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("linode:index/getNetworkingIp:getNetworkingIp", {
        "address": args.address,
    }, opts);
}

/**
 * A collection of arguments for invoking getNetworkingIp.
 */
export interface GetNetworkingIpArgs {
    /**
     * The IP Address to access.  The address must be associated with the account and a resource that the user has access to view.
     */
    address: string;
}

/**
 * A collection of values returned by getNetworkingIp.
 */
export interface GetNetworkingIpResult {
    /**
     * The IP address.
     */
    readonly address: string;
    /**
     * The default gateway for this address.
     */
    readonly gateway: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The ID of the Linode this address currently belongs to.
     */
    readonly linodeId: number;
    /**
     * The number of bits set in the subnet mask.
     */
    readonly prefix: number;
    /**
     * Whether this is a public or private IP address.
     */
    readonly public: boolean;
    /**
     * The reverse DNS assigned to this address. For public IPv4 addresses, this will be set to a default value provided by Linode if not explicitly set.
     */
    readonly rdns: string;
    /**
     * The Region this IP address resides in. See all regions [here](https://api.linode.com/v4/regions).
     */
    readonly region: string;
    /**
     * The mask that separates host bits from network bits for this address.
     */
    readonly subnetMask: string;
    /**
     * The type of address this is (ipv4, ipv6, ipv6/pool, ipv6/range).
     */
    readonly type: string;
}

export function getNetworkingIpOutput(args: GetNetworkingIpOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetNetworkingIpResult> {
    return pulumi.output(args).apply(a => getNetworkingIp(a, opts))
}

/**
 * A collection of arguments for invoking getNetworkingIp.
 */
export interface GetNetworkingIpOutputArgs {
    /**
     * The IP Address to access.  The address must be associated with the account and a resource that the user has access to view.
     */
    address: pulumi.Input<string>;
}
