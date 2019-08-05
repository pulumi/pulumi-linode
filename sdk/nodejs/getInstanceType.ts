// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides information about a Linode instance type
 * 
 * ## Example Usage
 * 
 * The following example shows how one might use this data source to access information about a Linode Instance type.
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 * 
 * const defaultInstanceType = pulumi.output(linode.getInstanceType({
 *     id: "g6-standard-2",
 * }));
 * ```
 * 
 * ## Attributes
 * 
 * The Linode Instance Type resource exports the following attributes:
 * 
 * * `id` - The ID representing the Linode Type
 * 
 * * `label` - The Linode Type's label is for display purposes only
 * 
 * * `class` - The class of the Linode Type
 * 
 * * `disk` - The Disk size, in MB, of the Linode Type
 * 
 * * `price.0.hourly` -  Cost (in US dollars) per hour.
 * 
 * * `price.0.monthly` - Cost (in US dollars) per month.
 * 
 * * `addons.0.backups.0.price.0.hourly` - The cost (in US dollars) per hour to add Backups service.
 * 
 * * `addons.0.backups.0.price.0.monthly` - The cost (in US dollars) per month to add Backups service.
 *
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-linode/blob/master/website/docs/d/instance_type.html.markdown.
 */
export function getInstanceType(args: GetInstanceTypeArgs, opts?: pulumi.InvokeOptions): Promise<GetInstanceTypeResult> & GetInstanceTypeResult {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    const promise: Promise<GetInstanceTypeResult> = pulumi.runtime.invoke("linode:index/getInstanceType:getInstanceType", {
        "id": args.id,
        "label": args.label,
    }, opts);

    return pulumi.utils.liftProperties(promise, opts);
}

/**
 * A collection of arguments for invoking getInstanceType.
 */
export interface GetInstanceTypeArgs {
    /**
     * Label used to identify instance type
     */
    readonly id: string;
    readonly label?: string;
}

/**
 * A collection of values returned by getInstanceType.
 */
export interface GetInstanceTypeResult {
    readonly addons: { backups: { price: { hourly: number, monthly: number } } };
    readonly class: string;
    readonly disk: number;
    readonly id: string;
    readonly label: string;
    readonly memory: number;
    readonly networkOut: number;
    readonly price: { hourly: number, monthly: number };
    readonly transfer: number;
    readonly vcpus: number;
}
