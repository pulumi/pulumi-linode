// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides information about a Linode Volume.
 * For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-volume).
 *
 * ## Example Usage
 *
 * The following example shows how one might use this data source to access information about a Linode Volume.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const foo = linode.getVolume({
 *     id: 1234567,
 * });
 * ```
 */
export function getVolume(args: GetVolumeArgs, opts?: pulumi.InvokeOptions): Promise<GetVolumeResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
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
    id: number;
}

/**
 * A collection of values returned by getVolume.
 */
export interface GetVolumeResult {
    /**
     * When this Volume was created.
     */
    readonly created: string;
    /**
     * Whether Block Storage Disk Encryption is enabled or disabled on this Volume. Note: Block Storage Disk Encryption is not currently available to all users.
     */
    readonly encryption: string;
    /**
     * The full filesystem path for the Volume based on the Volume's label. Path is /dev/disk/by-id/scsi-0LinodeVolume + Volume label.
     */
    readonly filesystemPath: string;
    /**
     * The unique ID of this Volume.
     */
    readonly id: number;
    /**
     * This Volume's label is for display purposes only.
     */
    readonly label: string;
    /**
     * If a Volume is attached to a specific Linode, the ID of that Linode will be displayed here. If the Volume is unattached, this value will be null.
     */
    readonly linodeId: number;
    /**
     * The datacenter in which this Volume is located. See all regions [here](https://api.linode.com/v4/regions).
     */
    readonly region: string;
    /**
     * The Volume's size, in GiB.
     */
    readonly size: number;
    /**
     * The current status of the Volume. (`creating`, `active`, `resizing`, `contactSupport`)
     */
    readonly status: string;
    /**
     * An array of tags applied to this object. Tags are case-insensitive and are for organizational purposes only.
     */
    readonly tags: string[];
    /**
     * When this Volume was last updated.
     */
    readonly updated: string;
}
/**
 * Provides information about a Linode Volume.
 * For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-volume).
 *
 * ## Example Usage
 *
 * The following example shows how one might use this data source to access information about a Linode Volume.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const foo = linode.getVolume({
 *     id: 1234567,
 * });
 * ```
 */
export function getVolumeOutput(args: GetVolumeOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetVolumeResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("linode:index/getVolume:getVolume", {
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getVolume.
 */
export interface GetVolumeOutputArgs {
    /**
     * The unique numeric ID of the Volume record to query.
     */
    id: pulumi.Input<number>;
}
