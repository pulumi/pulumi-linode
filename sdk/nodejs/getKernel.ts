// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides information about a Linode kernel
 * For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-kernel).
 *
 * ## Example Usage
 *
 * The following example shows how one might use this data source to access information about a Linode kernel.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const latest = linode.getKernel({
 *     id: "linode/latest-64bit",
 * });
 * ```
 */
export function getKernel(args: GetKernelArgs, opts?: pulumi.InvokeOptions): Promise<GetKernelResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("linode:index/getKernel:getKernel", {
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getKernel.
 */
export interface GetKernelArgs {
    /**
     * The unique ID of this Kernel.
     */
    id: string;
}

/**
 * A collection of values returned by getKernel.
 */
export interface GetKernelResult {
    /**
     * The architecture of this Kernel.
     */
    readonly architecture: string;
    readonly built: string;
    /**
     * Whether or not this Kernel is deprecated.
     */
    readonly deprecated: boolean;
    readonly id: string;
    /**
     * If this Kernel is suitable for KVM Linodes.
     */
    readonly kvm: boolean;
    /**
     * The friendly name of this Kernel.
     */
    readonly label: string;
    /**
     * If this Kernel is suitable for paravirtualized operations.
     */
    readonly pvops: boolean;
    /**
     * Linux Kernel version
     */
    readonly version: string;
    /**
     * If this Kernel is suitable for Xen Linodes.
     */
    readonly xen: boolean;
}
/**
 * Provides information about a Linode kernel
 * For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-kernel).
 *
 * ## Example Usage
 *
 * The following example shows how one might use this data source to access information about a Linode kernel.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const latest = linode.getKernel({
 *     id: "linode/latest-64bit",
 * });
 * ```
 */
export function getKernelOutput(args: GetKernelOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetKernelResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("linode:index/getKernel:getKernel", {
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getKernel.
 */
export interface GetKernelOutputArgs {
    /**
     * The unique ID of this Kernel.
     */
    id: pulumi.Input<string>;
}
