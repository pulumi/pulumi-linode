// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides information about a Linode instance type
 *
 * ## Example Usage
 *
 * The following example shows how one might use this data source to access information about a Linode Instance type.
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const default = linode.getInstanceType({
 *     id: "g6-standard-2",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getInstanceType(args: GetInstanceTypeArgs, opts?: pulumi.InvokeOptions): Promise<GetInstanceTypeResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("linode:index/getInstanceType:getInstanceType", {
        "id": args.id,
        "label": args.label,
    }, opts);
}

/**
 * A collection of arguments for invoking getInstanceType.
 */
export interface GetInstanceTypeArgs {
    /**
     * Label used to identify instance type
     */
    id: string;
    /**
     * The Linode Type's label is for display purposes only
     */
    label?: string;
}

/**
 * A collection of values returned by getInstanceType.
 */
export interface GetInstanceTypeResult {
    readonly addons: outputs.GetInstanceTypeAddons;
    /**
     * The class of the Linode Type. See all classes [here](https://www.linode.com/docs/api/linode-types/#type-view__responses).
     */
    readonly class: string;
    /**
     * The Disk size, in MB, of the Linode Type
     */
    readonly disk: number;
    /**
     * The ID representing the Linode Type
     */
    readonly id: string;
    /**
     * The Linode Type's label is for display purposes only
     */
    readonly label: string;
    /**
     * The amount of RAM included in this Linode Type.
     */
    readonly memory: number;
    /**
     * The Mbits outbound bandwidth allocation.
     */
    readonly networkOut: number;
    readonly price: outputs.GetInstanceTypePrice;
    readonly regionPrices: outputs.GetInstanceTypeRegionPrice[];
    /**
     * The monthly outbound transfer amount, in MB.
     */
    readonly transfer: number;
    /**
     * The number of VCPU cores this Linode Type offers.
     */
    readonly vcpus: number;
}
/**
 * Provides information about a Linode instance type
 *
 * ## Example Usage
 *
 * The following example shows how one might use this data source to access information about a Linode Instance type.
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const default = linode.getInstanceType({
 *     id: "g6-standard-2",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getInstanceTypeOutput(args: GetInstanceTypeOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetInstanceTypeResult> {
    return pulumi.output(args).apply((a: any) => getInstanceType(a, opts))
}

/**
 * A collection of arguments for invoking getInstanceType.
 */
export interface GetInstanceTypeOutputArgs {
    /**
     * Label used to identify instance type
     */
    id: pulumi.Input<string>;
    /**
     * The Linode Type's label is for display purposes only
     */
    label?: pulumi.Input<string>;
}
