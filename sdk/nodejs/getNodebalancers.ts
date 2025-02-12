// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides information about Linode NodeBalancers that match a set of filters.
 * For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-node-balancers).
 *
 * ## Example Usage
 *
 * The following example shows how one might use this data source to access information about a Linode NodeBalancer.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const specific_nodebalancers = linode.getNodebalancers({
 *     filters: [
 *         {
 *             name: "label",
 *             values: ["my-nodebalancer"],
 *         },
 *         {
 *             name: "region",
 *             values: ["us-iad"],
 *         },
 *     ],
 * });
 * export const nodebalancerId = specific_nodebalancers.then(specific_nodebalancers => specific_nodebalancers.nodebalancers?.[0]?.id);
 * ```
 *
 * ## Filterable Fields
 *
 * * `label`
 *
 * * `tags`
 *
 * * `ipv4`
 *
 * * `ipv6`
 *
 * * `hostname`
 *
 * * `region`
 *
 * * `clientConnThrottle`
 */
export function getNodebalancers(args?: GetNodebalancersArgs, opts?: pulumi.InvokeOptions): Promise<GetNodebalancersResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("linode:index/getNodebalancers:getNodebalancers", {
        "filters": args.filters,
        "nodebalancers": args.nodebalancers,
        "order": args.order,
        "orderBy": args.orderBy,
    }, opts);
}

/**
 * A collection of arguments for invoking getNodebalancers.
 */
export interface GetNodebalancersArgs {
    filters?: inputs.GetNodebalancersFilter[];
    nodebalancers?: inputs.GetNodebalancersNodebalancer[];
    /**
     * The order in which results should be returned. (`asc`, `desc`; default `asc`)
     */
    order?: string;
    /**
     * The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
     */
    orderBy?: string;
}

/**
 * A collection of values returned by getNodebalancers.
 */
export interface GetNodebalancersResult {
    readonly filters?: outputs.GetNodebalancersFilter[];
    /**
     * The Linode NodeBalancer's unique ID
     */
    readonly id: string;
    readonly nodebalancers?: outputs.GetNodebalancersNodebalancer[];
    readonly order?: string;
    readonly orderBy?: string;
}
/**
 * Provides information about Linode NodeBalancers that match a set of filters.
 * For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-node-balancers).
 *
 * ## Example Usage
 *
 * The following example shows how one might use this data source to access information about a Linode NodeBalancer.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const specific_nodebalancers = linode.getNodebalancers({
 *     filters: [
 *         {
 *             name: "label",
 *             values: ["my-nodebalancer"],
 *         },
 *         {
 *             name: "region",
 *             values: ["us-iad"],
 *         },
 *     ],
 * });
 * export const nodebalancerId = specific_nodebalancers.then(specific_nodebalancers => specific_nodebalancers.nodebalancers?.[0]?.id);
 * ```
 *
 * ## Filterable Fields
 *
 * * `label`
 *
 * * `tags`
 *
 * * `ipv4`
 *
 * * `ipv6`
 *
 * * `hostname`
 *
 * * `region`
 *
 * * `clientConnThrottle`
 */
export function getNodebalancersOutput(args?: GetNodebalancersOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetNodebalancersResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("linode:index/getNodebalancers:getNodebalancers", {
        "filters": args.filters,
        "nodebalancers": args.nodebalancers,
        "order": args.order,
        "orderBy": args.orderBy,
    }, opts);
}

/**
 * A collection of arguments for invoking getNodebalancers.
 */
export interface GetNodebalancersOutputArgs {
    filters?: pulumi.Input<pulumi.Input<inputs.GetNodebalancersFilterArgs>[]>;
    nodebalancers?: pulumi.Input<pulumi.Input<inputs.GetNodebalancersNodebalancerArgs>[]>;
    /**
     * The order in which results should be returned. (`asc`, `desc`; default `asc`)
     */
    order?: pulumi.Input<string>;
    /**
     * The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
     */
    orderBy?: pulumi.Input<string>;
}
