// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Linode Volume resource.  This can be used to create, modify, and delete Linodes Block Storage Volumes.  Block Storage Volumes are removable storage disks that persist outside the life-cycle of Linode Instances. These volumes can be attached to and detached from Linode instances throughout a region.
 *
 * For more information, see [How to Use Block Storage with Your Linode](https://www.linode.com/docs/platform/block-storage/how-to-use-block-storage-with-your-linode/) and the [Linode APIv4 docs](https://developers.linode.com/api/v4#operation/createVolume).
 *
 * ## Example Usage
 *
 * The following example shows how one might use this resource to configure a Block Storage Volume attached to a Linode Instance.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const foobaz = new linode.Instance("foobaz", {
 *     rootPass: "3X4mp13",
 *     type: "g6-nanode-1",
 *     region: "us-west",
 *     tags: ["foobaz"],
 * });
 * const foobar = new linode.Volume("foobar", {
 *     label: "foo-volume",
 *     region: foobaz.region,
 *     linodeId: foobaz.id,
 * });
 * ```
 *
 * Volumes can also be attached using the Linode Instance config device map.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const foo = new linode.Instance("foo", {
 *     configs: [{
 *         devices: {
 *             sda: {
 *                 volumeId: 123,
 *             },
 *         },
 *         kernel: "linode/latest-64bit",
 *         label: "boot-existing-volume",
 *     }],
 *     region: "us-east",
 *     type: "g6-nanode-1",
 * });
 * ```
 *
 * Volumes may also be cloned from existing volumes.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const foobar = new linode.Volume("foobar", {
 *     label: "my-cloned-volume",
 *     sourceVolumeId: 12345,
 * });
 * ```
 *
 * ## Import
 *
 * Linodes Volumes can be imported using the Linode Volume `id`, e.g.
 *
 * ```sh
 *  $ pulumi import linode:index/volume:Volume myvolume 1234567
 * ```
 *
 *  The Linode Guide, [Import Existing Infrastructure to Terraform](https://www.linode.com/docs/applications/configuration-management/import-existing-infrastructure-to-terraform/), offers resource importing examples for Block Storage Volumes and other Linode resource types.
 */
export class Volume extends pulumi.CustomResource {
    /**
     * Get an existing Volume resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: VolumeState, opts?: pulumi.CustomResourceOptions): Volume {
        return new Volume(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'linode:index/volume:Volume';

    /**
     * Returns true if the given object is an instance of Volume.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Volume {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Volume.__pulumiType;
    }

    /**
     * The full filesystem path for the Volume based on the Volume's label. The path is "/dev/disk/by-id/scsi-0Linode_Volume_" + the Volume label
     */
    public /*out*/ readonly filesystemPath!: pulumi.Output<string>;
    /**
     * The label of the Linode Volume
     */
    public readonly label!: pulumi.Output<string>;
    /**
     * The ID of a Linode Instance where the Volume should be attached.
     */
    public readonly linodeId!: pulumi.Output<number>;
    /**
     * The region where this volume will be deployed.  Examples are `"us-east"`, `"us-west"`, `"ap-south"`, etc. See all regions [here](https://api.linode.com/v4/regions). This field is optional for cloned volumes. *Changing `region` forces the creation of a new Linode Volume.*.
     */
    public readonly region!: pulumi.Output<string>;
    /**
     * Size of the Volume in GB.
     */
    public readonly size!: pulumi.Output<number>;
    /**
     * The ID of a Linode Volume to clone. NOTE: Cloned volumes must be in the same region as the source volume.
     */
    public readonly sourceVolumeId!: pulumi.Output<number | undefined>;
    /**
     * The status of the Linode Volume. (`creating`, `active`, `resizing`, `contactSupport`)
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * A list of tags applied to this object. Tags are for organizational purposes only.
     */
    public readonly tags!: pulumi.Output<string[] | undefined>;

    /**
     * Create a Volume resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: VolumeArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: VolumeArgs | VolumeState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as VolumeState | undefined;
            resourceInputs["filesystemPath"] = state ? state.filesystemPath : undefined;
            resourceInputs["label"] = state ? state.label : undefined;
            resourceInputs["linodeId"] = state ? state.linodeId : undefined;
            resourceInputs["region"] = state ? state.region : undefined;
            resourceInputs["size"] = state ? state.size : undefined;
            resourceInputs["sourceVolumeId"] = state ? state.sourceVolumeId : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as VolumeArgs | undefined;
            if ((!args || args.label === undefined) && !opts.urn) {
                throw new Error("Missing required property 'label'");
            }
            resourceInputs["label"] = args ? args.label : undefined;
            resourceInputs["linodeId"] = args ? args.linodeId : undefined;
            resourceInputs["region"] = args ? args.region : undefined;
            resourceInputs["size"] = args ? args.size : undefined;
            resourceInputs["sourceVolumeId"] = args ? args.sourceVolumeId : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["filesystemPath"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Volume.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Volume resources.
 */
export interface VolumeState {
    /**
     * The full filesystem path for the Volume based on the Volume's label. The path is "/dev/disk/by-id/scsi-0Linode_Volume_" + the Volume label
     */
    filesystemPath?: pulumi.Input<string>;
    /**
     * The label of the Linode Volume
     */
    label?: pulumi.Input<string>;
    /**
     * The ID of a Linode Instance where the Volume should be attached.
     */
    linodeId?: pulumi.Input<number>;
    /**
     * The region where this volume will be deployed.  Examples are `"us-east"`, `"us-west"`, `"ap-south"`, etc. See all regions [here](https://api.linode.com/v4/regions). This field is optional for cloned volumes. *Changing `region` forces the creation of a new Linode Volume.*.
     */
    region?: pulumi.Input<string>;
    /**
     * Size of the Volume in GB.
     */
    size?: pulumi.Input<number>;
    /**
     * The ID of a Linode Volume to clone. NOTE: Cloned volumes must be in the same region as the source volume.
     */
    sourceVolumeId?: pulumi.Input<number>;
    /**
     * The status of the Linode Volume. (`creating`, `active`, `resizing`, `contactSupport`)
     */
    status?: pulumi.Input<string>;
    /**
     * A list of tags applied to this object. Tags are for organizational purposes only.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a Volume resource.
 */
export interface VolumeArgs {
    /**
     * The label of the Linode Volume
     */
    label: pulumi.Input<string>;
    /**
     * The ID of a Linode Instance where the Volume should be attached.
     */
    linodeId?: pulumi.Input<number>;
    /**
     * The region where this volume will be deployed.  Examples are `"us-east"`, `"us-west"`, `"ap-south"`, etc. See all regions [here](https://api.linode.com/v4/regions). This field is optional for cloned volumes. *Changing `region` forces the creation of a new Linode Volume.*.
     */
    region?: pulumi.Input<string>;
    /**
     * Size of the Volume in GB.
     */
    size?: pulumi.Input<number>;
    /**
     * The ID of a Linode Volume to clone. NOTE: Cloned volumes must be in the same region as the source volume.
     */
    sourceVolumeId?: pulumi.Input<number>;
    /**
     * A list of tags applied to this object. Tags are for organizational purposes only.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
}
