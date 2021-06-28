// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Provides information about a Linode Volume.
 *
 * ## Example Usage
 *
 * The following example shows how one might use this data source to access information about a Linode Volume.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const foo = pulumi.output(linode.getVolume({
 *     id: 1234567,
 * }, { async: true }));
 * ```
 * ## Attributes
 *
 * The Linode Volume resource exports the following attributes:
 *
 * - `id` - The unique ID of this Volume.
 *
 * - `created` - When this Volume was created.
 *
 * - `status` - The current status of the Volume. (`creating`, `active`, `resizing`, `contactSupport`)
 *
 * - `label` - This Volume's label is for display purposes only.
 *
 * - `tags` - An array of tags applied to this object.
 *
 * - `size` - The Volume's size, in GiB.
 *
 * - `region` - The datacenter in which this Volume is located. See all regions [here](https://api.linode.com/v4/regions).
 *
 * - `updated` - When this Volume was last updated.
 *
 * - `linodeId` - If a Volume is attached to a specific Linode, the ID of that Linode will be displayed here. If the Volume is unattached, this value will be null.
 *
 * - `filesystemPath` - The full filesystem path for the Volume based on the Volume's label. Path is /dev/disk/by-id/scsi-0LinodeVolume + Volume label.
 */
export function getVolume(args: GetVolumeArgs, opts?: pulumi.InvokeOptions): Promise<GetVolumeResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("linode:index/getVolume:getVolume", {
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getVolume.
 */
export interface GetVolumeArgs {
    /**
     * The unique numeric ID of the Volume record to query.
     */
    readonly id: number;
}

/**
 * A collection of values returned by getVolume.
 */
export interface GetVolumeResult {
    readonly created: string;
    readonly filesystemPath: string;
    readonly id: number;
    readonly label: string;
    readonly linodeId: number;
    readonly region: string;
    readonly size: number;
    readonly status: string;
    readonly tags: string[];
    readonly updated: string;
}
