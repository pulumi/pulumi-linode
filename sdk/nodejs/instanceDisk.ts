// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a Linode Instance Disk resource. This can be used to create, modify, and delete Linode Instance Disks.
 * For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/post-add-linode-disk).
 *
 * **NOTE:** Deleting a disk will shut down the attached instance if the instance is booted. If the disk was not in use by the booted configuration profile, the instance will be automatically rebooted.
 *
 * ## Example Usage
 *
 * Creating a simple 512 MB Linode Instance Disk:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const my_instance = new linode.Instance("my-instance", {
 *     label: "my-instance",
 *     type: "g6-standard-1",
 *     region: "us-southeast",
 * });
 * const boot = new linode.InstanceDisk("boot", {
 *     label: "boot",
 *     linodeId: my_instance.id,
 *     size: 512,
 *     filesystem: "ext4",
 * });
 * ```
 *
 * Creating a complex bootable Instance Disk:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const my_instance = new linode.Instance("my-instance", {
 *     label: "my-instance",
 *     type: "g6-standard-1",
 *     region: "us-southeast",
 * });
 * const boot = new linode.InstanceDisk("boot", {
 *     label: "boot",
 *     linodeId: my_instance.id,
 *     size: my_instance.specs.apply(specs => specs.disk),
 *     image: "linode/ubuntu22.04",
 *     rootPass: "myc00lpass!",
 *     authorizedKeys: ["ssh-rsa AAAA...Gw== user@example.local"],
 *     stackscriptId: 12345,
 *     stackscriptData: {
 *         my_var: "my_value",
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Instance Disks can be imported using the `linode_id` followed by the Instance Disk `id` separated by a comma, e.g.
 *
 * ```sh
 * $ pulumi import linode:index/instanceDisk:InstanceDisk my-disk 1234567,7654321
 * ```
 */
export class InstanceDisk extends pulumi.CustomResource {
    /**
     * Get an existing InstanceDisk resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: InstanceDiskState, opts?: pulumi.CustomResourceOptions): InstanceDisk {
        return new InstanceDisk(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'linode:index/instanceDisk:InstanceDisk';

    /**
     * Returns true if the given object is an instance of InstanceDisk.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is InstanceDisk {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === InstanceDisk.__pulumiType;
    }

    /**
     * A list of public SSH keys that will be automatically appended to the root user’s ~/.ssh/authorized_keys file when deploying from an Image. (Requires `image`)
     */
    public readonly authorizedKeys!: pulumi.Output<string[] | undefined>;
    /**
     * A list of usernames. If the usernames have associated SSH keys, the keys will be appended to the root user's ~/.ssh/authorized_keys file. (Requires `image`)
     */
    public readonly authorizedUsers!: pulumi.Output<string[] | undefined>;
    /**
     * When this disk was created.
     */
    public /*out*/ readonly created!: pulumi.Output<string>;
    /**
     * The filesystem of this disk. (`raw`, `swap`, `ext3`, `ext4`, `initrd`)
     */
    public readonly filesystem!: pulumi.Output<string>;
    /**
     * An Image ID to deploy the Linode Disk from.
     */
    public readonly image!: pulumi.Output<string | undefined>;
    /**
     * The Disk's label for display purposes only.
     */
    public readonly label!: pulumi.Output<string>;
    /**
     * The ID of the Linode to create this Disk under.
     */
    public readonly linodeId!: pulumi.Output<number>;
    /**
     * The root user’s password on a newly-created Linode Disk when deploying from an Image. (Requires `image`)
     */
    public readonly rootPass!: pulumi.Output<string | undefined>;
    /**
     * The size of the Disk in MB. **NOTE:** Resizing a disk will trigger a Linode reboot.
     *
     * - - -
     */
    public readonly size!: pulumi.Output<number>;
    /**
     * An object containing responses to any User Defined Fields present in the StackScript being deployed to this Disk. Only accepted if `stackscriptId` is given. (Requires `image`)
     */
    public readonly stackscriptData!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A StackScript ID that will cause the referenced StackScript to be run during deployment of this Disk. (Requires `image`)
     */
    public readonly stackscriptId!: pulumi.Output<number | undefined>;
    /**
     * A brief description of this Disk's current state.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    public readonly timeouts!: pulumi.Output<outputs.InstanceDiskTimeouts | undefined>;
    /**
     * When this disk was last updated.
     */
    public /*out*/ readonly updated!: pulumi.Output<string>;

    /**
     * Create a InstanceDisk resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: InstanceDiskArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: InstanceDiskArgs | InstanceDiskState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as InstanceDiskState | undefined;
            resourceInputs["authorizedKeys"] = state ? state.authorizedKeys : undefined;
            resourceInputs["authorizedUsers"] = state ? state.authorizedUsers : undefined;
            resourceInputs["created"] = state ? state.created : undefined;
            resourceInputs["filesystem"] = state ? state.filesystem : undefined;
            resourceInputs["image"] = state ? state.image : undefined;
            resourceInputs["label"] = state ? state.label : undefined;
            resourceInputs["linodeId"] = state ? state.linodeId : undefined;
            resourceInputs["rootPass"] = state ? state.rootPass : undefined;
            resourceInputs["size"] = state ? state.size : undefined;
            resourceInputs["stackscriptData"] = state ? state.stackscriptData : undefined;
            resourceInputs["stackscriptId"] = state ? state.stackscriptId : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["timeouts"] = state ? state.timeouts : undefined;
            resourceInputs["updated"] = state ? state.updated : undefined;
        } else {
            const args = argsOrState as InstanceDiskArgs | undefined;
            if ((!args || args.label === undefined) && !opts.urn) {
                throw new Error("Missing required property 'label'");
            }
            if ((!args || args.linodeId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'linodeId'");
            }
            if ((!args || args.size === undefined) && !opts.urn) {
                throw new Error("Missing required property 'size'");
            }
            resourceInputs["authorizedKeys"] = args ? args.authorizedKeys : undefined;
            resourceInputs["authorizedUsers"] = args ? args.authorizedUsers : undefined;
            resourceInputs["filesystem"] = args ? args.filesystem : undefined;
            resourceInputs["image"] = args ? args.image : undefined;
            resourceInputs["label"] = args ? args.label : undefined;
            resourceInputs["linodeId"] = args ? args.linodeId : undefined;
            resourceInputs["rootPass"] = args?.rootPass ? pulumi.secret(args.rootPass) : undefined;
            resourceInputs["size"] = args ? args.size : undefined;
            resourceInputs["stackscriptData"] = args?.stackscriptData ? pulumi.secret(args.stackscriptData) : undefined;
            resourceInputs["stackscriptId"] = args ? args.stackscriptId : undefined;
            resourceInputs["timeouts"] = args ? args.timeouts : undefined;
            resourceInputs["created"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
            resourceInputs["updated"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["rootPass", "stackscriptData"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(InstanceDisk.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering InstanceDisk resources.
 */
export interface InstanceDiskState {
    /**
     * A list of public SSH keys that will be automatically appended to the root user’s ~/.ssh/authorized_keys file when deploying from an Image. (Requires `image`)
     */
    authorizedKeys?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A list of usernames. If the usernames have associated SSH keys, the keys will be appended to the root user's ~/.ssh/authorized_keys file. (Requires `image`)
     */
    authorizedUsers?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * When this disk was created.
     */
    created?: pulumi.Input<string>;
    /**
     * The filesystem of this disk. (`raw`, `swap`, `ext3`, `ext4`, `initrd`)
     */
    filesystem?: pulumi.Input<string>;
    /**
     * An Image ID to deploy the Linode Disk from.
     */
    image?: pulumi.Input<string>;
    /**
     * The Disk's label for display purposes only.
     */
    label?: pulumi.Input<string>;
    /**
     * The ID of the Linode to create this Disk under.
     */
    linodeId?: pulumi.Input<number>;
    /**
     * The root user’s password on a newly-created Linode Disk when deploying from an Image. (Requires `image`)
     */
    rootPass?: pulumi.Input<string>;
    /**
     * The size of the Disk in MB. **NOTE:** Resizing a disk will trigger a Linode reboot.
     *
     * - - -
     */
    size?: pulumi.Input<number>;
    /**
     * An object containing responses to any User Defined Fields present in the StackScript being deployed to this Disk. Only accepted if `stackscriptId` is given. (Requires `image`)
     */
    stackscriptData?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A StackScript ID that will cause the referenced StackScript to be run during deployment of this Disk. (Requires `image`)
     */
    stackscriptId?: pulumi.Input<number>;
    /**
     * A brief description of this Disk's current state.
     */
    status?: pulumi.Input<string>;
    timeouts?: pulumi.Input<inputs.InstanceDiskTimeouts>;
    /**
     * When this disk was last updated.
     */
    updated?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a InstanceDisk resource.
 */
export interface InstanceDiskArgs {
    /**
     * A list of public SSH keys that will be automatically appended to the root user’s ~/.ssh/authorized_keys file when deploying from an Image. (Requires `image`)
     */
    authorizedKeys?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A list of usernames. If the usernames have associated SSH keys, the keys will be appended to the root user's ~/.ssh/authorized_keys file. (Requires `image`)
     */
    authorizedUsers?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The filesystem of this disk. (`raw`, `swap`, `ext3`, `ext4`, `initrd`)
     */
    filesystem?: pulumi.Input<string>;
    /**
     * An Image ID to deploy the Linode Disk from.
     */
    image?: pulumi.Input<string>;
    /**
     * The Disk's label for display purposes only.
     */
    label: pulumi.Input<string>;
    /**
     * The ID of the Linode to create this Disk under.
     */
    linodeId: pulumi.Input<number>;
    /**
     * The root user’s password on a newly-created Linode Disk when deploying from an Image. (Requires `image`)
     */
    rootPass?: pulumi.Input<string>;
    /**
     * The size of the Disk in MB. **NOTE:** Resizing a disk will trigger a Linode reboot.
     *
     * - - -
     */
    size: pulumi.Input<number>;
    /**
     * An object containing responses to any User Defined Fields present in the StackScript being deployed to this Disk. Only accepted if `stackscriptId` is given. (Requires `image`)
     */
    stackscriptData?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A StackScript ID that will cause the referenced StackScript to be run during deployment of this Disk. (Requires `image`)
     */
    stackscriptId?: pulumi.Input<number>;
    timeouts?: pulumi.Input<inputs.InstanceDiskTimeouts>;
}
