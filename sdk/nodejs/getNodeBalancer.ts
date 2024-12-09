// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides details about a Linode NodeBalancer.
 * For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-node-balancer).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const my-nodebalancer = linode.getNodeBalancer({
 *     id: 123,
 * });
 * ```
 */
export function getNodeBalancer(args: GetNodeBalancerArgs, opts?: pulumi.InvokeOptions): Promise<GetNodeBalancerResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("linode:index/getNodeBalancer:getNodeBalancer", {
        "firewalls": args.firewalls,
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getNodeBalancer.
 */
export interface GetNodeBalancerArgs {
    firewalls?: inputs.GetNodeBalancerFirewall[];
    /**
     * The NodeBalancer's ID.
     */
    id: number;
}

/**
 * A collection of values returned by getNodeBalancer.
 */
export interface GetNodeBalancerResult {
    /**
     * Throttle connections per second (0-20).
     */
    readonly clientConnThrottle: number;
    /**
     * When this firewall was created.
     */
    readonly created: string;
    readonly firewalls?: outputs.GetNodeBalancerFirewall[];
    /**
     * This NodeBalancer's hostname, ending with .ip.linodeusercontent.com
     */
    readonly hostname: string;
    /**
     * The Firewall's ID.
     */
    readonly id: number;
    /**
     * A list of IPv4 addresses or networks. Must be in IP/mask format.
     */
    readonly ipv4: string;
    /**
     * A list of IPv6 addresses or networks. Must be in IP/mask format.
     */
    readonly ipv6: string;
    /**
     * Used to identify this rule. For display purposes only.
     */
    readonly label: string;
    /**
     * The Region where this Linode NodeBalancer is located. NodeBalancers only support backends in the same Region.
     */
    readonly region: string;
    /**
     * The tags applied to the firewall. Tags are case-insensitive and are for organizational purposes only.
     */
    readonly tags: string[];
    readonly transfers: outputs.GetNodeBalancerTransfer[];
    /**
     * When this firewall was last updated.
     */
    readonly updated: string;
}
/**
 * Provides details about a Linode NodeBalancer.
 * For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-node-balancer).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const my-nodebalancer = linode.getNodeBalancer({
 *     id: 123,
 * });
 * ```
 */
export function getNodeBalancerOutput(args: GetNodeBalancerOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetNodeBalancerResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("linode:index/getNodeBalancer:getNodeBalancer", {
        "firewalls": args.firewalls,
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getNodeBalancer.
 */
export interface GetNodeBalancerOutputArgs {
    firewalls?: pulumi.Input<pulumi.Input<inputs.GetNodeBalancerFirewallArgs>[]>;
    /**
     * The NodeBalancer's ID.
     */
    id: pulumi.Input<number>;
}
