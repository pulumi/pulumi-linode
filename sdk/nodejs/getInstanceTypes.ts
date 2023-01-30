// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Provides information about Linode Instance types that match a set of filters.
 *
 * ## Example Usage
 *
 * Get information about all Linode Instance types with a certain number of VCPUs:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const specific-types = linode.getInstanceTypes({
 *     filters: [{
 *         name: "vcpus",
 *         values: ["2"],
 *     }],
 * });
 * export const typeIds = [specific_types.then(specific_types => specific_types.types)].map(__item => __item?.id);
 * ```
 *
 * Get information about all Linode Instance types:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const all-types = linode.getInstanceTypes({});
 * export const typeIds = [all_types.then(all_types => all_types.types)].map(__item => __item?.id);
 * ```
 * ## Filterable Fields
 *
 * * `class`
 *
 * * `disk`
 *
 * * `gpus`
 *
 * * `label`
 *
 * * `memory`
 *
 * * `networkOut`
 *
 * * `transfer`
 *
 * * `vcpus`
 */
export function getInstanceTypes(args?: GetInstanceTypesArgs, opts?: pulumi.InvokeOptions): Promise<GetInstanceTypesResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("linode:index/getInstanceTypes:getInstanceTypes", {
        "filters": args.filters,
        "order": args.order,
        "orderBy": args.orderBy,
    }, opts);
}

/**
 * A collection of arguments for invoking getInstanceTypes.
 */
export interface GetInstanceTypesArgs {
    filters?: inputs.GetInstanceTypesFilter[];
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
 * A collection of values returned by getInstanceTypes.
 */
export interface GetInstanceTypesResult {
    readonly filters?: outputs.GetInstanceTypesFilter[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly order?: string;
    readonly orderBy?: string;
    readonly types: outputs.GetInstanceTypesType[];
}

export function getInstanceTypesOutput(args?: GetInstanceTypesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetInstanceTypesResult> {
    return pulumi.output(args).apply(a => getInstanceTypes(a, opts))
}

/**
 * A collection of arguments for invoking getInstanceTypes.
 */
export interface GetInstanceTypesOutputArgs {
    filters?: pulumi.Input<pulumi.Input<inputs.GetInstanceTypesFilterArgs>[]>;
    /**
     * The order in which results should be returned. (`asc`, `desc`; default `asc`)
     */
    order?: pulumi.Input<string>;
    /**
     * The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
     */
    orderBy?: pulumi.Input<string>;
}
