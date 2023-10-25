// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides information about Linode instances that match a set of filters.
 *
 * ## Filterable Fields
 *
 * * `group`
 *
 * * `id`
 *
 * * `image`
 *
 * * `label`
 *
 * * `region`
 *
 * * `status`
 *
 * * `tags`
 *
 * * `type`
 *
 * * `watchdogEnabled`
 */
export function getInstances(args?: GetInstancesArgs, opts?: pulumi.InvokeOptions): Promise<GetInstancesResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("linode:index/getInstances:getInstances", {
        "filters": args.filters,
        "order": args.order,
        "orderBy": args.orderBy,
    }, opts);
}

/**
 * A collection of arguments for invoking getInstances.
 */
export interface GetInstancesArgs {
    filters?: inputs.GetInstancesFilter[];
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
 * A collection of values returned by getInstances.
 */
export interface GetInstancesResult {
    readonly filters?: outputs.GetInstancesFilter[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly instances: outputs.GetInstancesInstance[];
    readonly order?: string;
    readonly orderBy?: string;
}
/**
 * Provides information about Linode instances that match a set of filters.
 *
 * ## Filterable Fields
 *
 * * `group`
 *
 * * `id`
 *
 * * `image`
 *
 * * `label`
 *
 * * `region`
 *
 * * `status`
 *
 * * `tags`
 *
 * * `type`
 *
 * * `watchdogEnabled`
 */
export function getInstancesOutput(args?: GetInstancesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetInstancesResult> {
    return pulumi.output(args).apply((a: any) => getInstances(a, opts))
}

/**
 * A collection of arguments for invoking getInstances.
 */
export interface GetInstancesOutputArgs {
    filters?: pulumi.Input<pulumi.Input<inputs.GetInstancesFilterArgs>[]>;
    /**
     * The order in which results should be returned. (`asc`, `desc`; default `asc`)
     */
    order?: pulumi.Input<string>;
    /**
     * The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
     */
    orderBy?: pulumi.Input<string>;
}
