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
 * const ns1LinodeCom = pulumi.output(linode.NetworkIp({
 *     address: "162.159.27.72",
 * }));
 * ```
 * 
 * ## Attributes
 * 
 * The Linode Network IP Address resource exports the following attributes:
 * 
 * * `address` - The IP address.
 * 
 * * `gateway` - The default gateway for this address.
 * 
 * * `subnet_mask` - The mask that separates host bits from network bits for this address.
 * 
 * * `prefix` - The number of bits set in the subnet mask.
 * 
 * * `type` - The type of address this is (ipv4, ipv6, ipv6/pool, ipv6/range).
 * 
 * * `public` - Whether this is a public or private IP address.
 * 
 * * `rdns` - The reverse DNS assigned to this address. For public IPv4 addresses, this will be set to a default value provided by Linode if not explicitly set.
 * 
 * * `linode_id` - The ID of the Linode this address currently belongs to.
 * 
 * * `region` - The Region this IP address resides in.
 *
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-linode/blob/master/website/docs/d/networking_ip.html.markdown.
 */
export function getNetworkingIp(args: GetNetworkingIpArgs, opts?: pulumi.InvokeOptions): Promise<GetNetworkingIpResult> {
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
    readonly address: string;
}

/**
 * A collection of values returned by getNetworkingIp.
 */
export interface GetNetworkingIpResult {
    readonly address: string;
    readonly gateway: string;
    readonly linodeId: number;
    readonly prefix: number;
    readonly public: boolean;
    readonly rdns: string;
    readonly region: string;
    readonly subnetMask: string;
    readonly type: string;
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
