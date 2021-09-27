// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Provides details about a Linode NodeBalancer.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const my_nodebalancer = pulumi.output(linode.getNodeBalancer({
 *     id: 123,
 * }));
 * ```
 */
export function getNodeBalancer(args: GetNodeBalancerArgs, opts?: pulumi.InvokeOptions): Promise<GetNodeBalancerResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("linode:index/getNodeBalancer:getNodeBalancer", {
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getNodeBalancer.
 */
export interface GetNodeBalancerArgs {
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
    readonly created: string;
    /**
     * This NodeBalancer's hostname, ending with .nodebalancer.linode.com
     */
    readonly hostname: string;
    readonly id: number;
    /**
     * The Public IPv4 Address of this NodeBalancer
     */
    readonly ipv4: string;
    /**
     * The Public IPv6 Address of this NodeBalancer
     */
    readonly ipv6: string;
    /**
     * The label of the Linode NodeBalancer
     */
    readonly label: string;
    readonly region: string;
    /**
     * A list of tags applied to this object. Tags are for organizational purposes only.
     */
    readonly tags: string[];
    readonly transfers: outputs.GetNodeBalancerTransfer[];
    readonly updated: string;
}
