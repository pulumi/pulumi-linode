// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides information about Linode Kernels that match a set of filters.
 * For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-kernels).
 *
 * ## Example Usage
 *
 * The following example shows how one might use this data source to access information about a Linode Kernel.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const filteredKernels = linode.getKernels({
 *     filters: [
 *         {
 *             name: "label",
 *             values: ["my-kernel"],
 *         },
 *         {
 *             name: "architecture",
 *             values: ["x86_64"],
 *         },
 *     ],
 * });
 * ```
 *
 * ## Filterable Fields
 *
 * * `id`
 *
 * * `architecture`
 *
 * * `deprecated`
 *
 * * `kvm`
 *
 * * `label`
 *
 * * `pvops`
 *
 * * `version`
 *
 * * `xen`
 */
export function getKernels(args?: GetKernelsArgs, opts?: pulumi.InvokeOptions): Promise<GetKernelsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("linode:index/getKernels:getKernels", {
        "filters": args.filters,
        "kernels": args.kernels,
        "order": args.order,
        "orderBy": args.orderBy,
    }, opts);
}

/**
 * A collection of arguments for invoking getKernels.
 */
export interface GetKernelsArgs {
    filters?: inputs.GetKernelsFilter[];
    kernels?: inputs.GetKernelsKernel[];
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
 * A collection of values returned by getKernels.
 */
export interface GetKernelsResult {
    readonly filters?: outputs.GetKernelsFilter[];
    /**
     * The unique ID of this Kernel.
     */
    readonly id: string;
    readonly kernels?: outputs.GetKernelsKernel[];
    readonly order?: string;
    readonly orderBy?: string;
}
/**
 * Provides information about Linode Kernels that match a set of filters.
 * For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-kernels).
 *
 * ## Example Usage
 *
 * The following example shows how one might use this data source to access information about a Linode Kernel.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const filteredKernels = linode.getKernels({
 *     filters: [
 *         {
 *             name: "label",
 *             values: ["my-kernel"],
 *         },
 *         {
 *             name: "architecture",
 *             values: ["x86_64"],
 *         },
 *     ],
 * });
 * ```
 *
 * ## Filterable Fields
 *
 * * `id`
 *
 * * `architecture`
 *
 * * `deprecated`
 *
 * * `kvm`
 *
 * * `label`
 *
 * * `pvops`
 *
 * * `version`
 *
 * * `xen`
 */
export function getKernelsOutput(args?: GetKernelsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetKernelsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("linode:index/getKernels:getKernels", {
        "filters": args.filters,
        "kernels": args.kernels,
        "order": args.order,
        "orderBy": args.orderBy,
    }, opts);
}

/**
 * A collection of arguments for invoking getKernels.
 */
export interface GetKernelsOutputArgs {
    filters?: pulumi.Input<pulumi.Input<inputs.GetKernelsFilterArgs>[]>;
    kernels?: pulumi.Input<pulumi.Input<inputs.GetKernelsKernelArgs>[]>;
    /**
     * The order in which results should be returned. (`asc`, `desc`; default `asc`)
     */
    order?: pulumi.Input<string>;
    /**
     * The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
     */
    orderBy?: pulumi.Input<string>;
}
