// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a Linode Instance resource.  This can be used to create, modify, and delete Linodes.
 * For more information, see [Getting Started with Linode](https://linode.com/docs/getting-started/) and the [Linode APIv4 docs](https://developers.linode.com/api/v4#operation/createLinodeInstance).
 *
 * ## Example Usage
 *
 * ### Simple Linode Instance
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const web = new linode.Instance("web", {
 *     authorizedKeys: ["ssh-rsa AAAA...Gw== user@example.local"],
 *     group: "foo",
 *     image: "linode/ubuntu18.04",
 *     label: "simpleInstance",
 *     privateIp: true,
 *     region: "us-central",
 *     rootPass: "terr4form-test",
 *     swapSize: 256,
 *     tags: ["foo"],
 *     type: "g6-standard-1",
 * });
 * ```
 *
 * ### Linode Instance with explicit Configs and Disks
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const me = pulumi.output(linode.getProfile({ async: true }));
 * const webVolume = new linode.Volume("webVolume", {
 *     label: "webVolume",
 *     region: "us-central",
 *     size: 20,
 * });
 * const web = new linode.Instance("web", {
 *     bootConfigLabel: "bootConfig",
 *     configs: [{
 *         devices: {
 *             sda: {
 *                 diskLabel: "boot",
 *             },
 *             sdb: {
 *                 volumeId: webVolume.id,
 *             },
 *         },
 *         kernel: "linode/latest-64bit",
 *         label: "bootConfig",
 *         rootDevice: "/dev/sda",
 *     }],
 *     disks: [{
 *         // Any of authorized_keys, authorized_users, and rootPass
 *         // can be used for provisioning.
 *         authorizedKeys: ["ssh-rsa AAAA...Gw== user@example.local"],
 *         authorizedUsers: [me.username],
 *         image: "linode/ubuntu18.04",
 *         label: "boot",
 *         rootPass: "terr4form-test",
 *         size: 3000,
 *     }],
 *     group: "foo",
 *     label: "complexInstance",
 *     privateIp: true,
 *     region: "us-central",
 *     tags: ["foo"],
 *     type: "g6-nanode-1",
 * });
 * ```
 *
 * ## Attributes
 *
 * This Linode Instance resource exports the following attributes:
 *
 * * `status` - The status of the instance, indicating the current readiness state. (`running`, `offline`, ...)
 *
 * * `ipAddress` - A string containing the Linode's public IP address.
 *
 * * `privateIpAddress` - This Linode's Private IPv4 Address, if enabled.  The regional private IP address range, 192.168.128.0/17, is shared by all Linode Instances in a region.
 *
 * * `ipv6` - This Linode's IPv6 SLAAC addresses. This address is specific to a Linode, and may not be shared.  The prefix (`/64`) is included in this attribute.
 *
 * * `ipv4` - This Linode's IPv4 Addresses. Each Linode is assigned a single public IPv4 address upon creation, and may get a single private IPv4 address if needed. You may need to open a support ticket to get additional IPv4 addresses.
 *
 * * `specs.0.disk` -  The amount of storage space, in GB. this Linode has access to. A typical Linode will divide this space between a primary disk with an image deployed to it, and a swap disk, usually 512 MB. This is the default configuration created when deploying a Linode with an image through POST /linode/instances.
 *
 * * `specs.0.memory` - The amount of RAM, in MB, this Linode has access to. Typically a Linode will choose to boot with all of its available RAM, but this can be configured in a Config profile.
 *
 * * `specs.0.vcpus` - The number of vcpus this Linode has access to. Typically a Linode will choose to boot with all of its available vcpus, but this can be configured in a Config Profile.
 *
 * * `specs.0.transfer` - The amount of network transfer this Linode is allotted each month.
 *
 * * `backups` - Information about this Linode's backups status.
 *
 *   * `enabled` - If this Linode has the Backup service enabled.
 *
 *   * `schedule`
 *
 *     * `day` -  The day of the week that your Linode's weekly Backup is taken. If not set manually, a day will be chosen for you. Backups are taken every day, but backups taken on this day are preferred when selecting backups to retain for a longer period.  If not set manually, then when backups are initially enabled, this may come back as "Scheduling" until the day is automatically selected.
 *
 *     * `window` - The window ('W0'-'W22') in which your backups will be taken, in UTC. A backups window is a two-hour span of time in which the backup may occur. For example, 'W10' indicates that your backups should be taken between 10:00 and 12:00. If you do not choose a backup window, one will be selected for you automatically.  If not set manually, when backups are initially enabled this may come back as Scheduling until the window is automatically selected.
 */
export class Instance extends pulumi.CustomResource {
    /**
     * Get an existing Instance resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: InstanceState, opts?: pulumi.CustomResourceOptions): Instance {
        return new Instance(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'linode:index/instance:Instance';

    /**
     * Returns true if the given object is an instance of Instance.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Instance {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Instance.__pulumiType;
    }

    public readonly alerts!: pulumi.Output<outputs.InstanceAlerts>;
    /**
     * A list of SSH public keys to deploy for the root user on the newly created Linode. Only accepted if `image` is provided. *This value can not be imported.* *Changing `authorizedKeys` forces the creation of a new Linode Instance.*
     */
    public readonly authorizedKeys!: pulumi.Output<string[] | undefined>;
    /**
     * A list of Linode usernames. If the usernames have associated SSH keys, the keys will be appended to the `root` user's `~/.ssh/authorized_keys` file automatically. *This value can not be imported.* *Changing `authorizedUsers` forces the creation of a new Linode Instance.*
     */
    public readonly authorizedUsers!: pulumi.Output<string[] | undefined>;
    /**
     * A Backup ID from another Linode's available backups. Your User must have readWrite access to that Linode, the Backup must have a status of successful, and the Linode must be deployed to the same region as the Backup. See /linode/instances/{linodeId}/backups for a Linode's available backups. This field and the image field are mutually exclusive. *This value can not be imported.* *Changing `backupId` forces the creation of a new Linode Instance.*
     */
    public readonly backupId!: pulumi.Output<number | undefined>;
    /**
     * Information about this Linode's backups status.
     */
    public /*out*/ readonly backups!: pulumi.Output<outputs.InstanceBackups>;
    /**
     * If this field is set to true, the created Linode will automatically be enrolled in the Linode Backup service. This will incur an additional charge. The cost for the Backup service is dependent on the Type of Linode deployed.
     */
    public readonly backupsEnabled!: pulumi.Output<boolean>;
    /**
     * The Label of the Instance Config that should be used to boot the Linode instance.  If there is only one `config`, the `label` of that `config` will be used as the `bootConfigLabel`. *This value can not be imported.*
     */
    public readonly bootConfigLabel!: pulumi.Output<string>;
    /**
     * Configuration profiles define the VM settings and boot behavior of the Linode Instance.
     */
    public readonly configs!: pulumi.Output<outputs.InstanceConfig[] | undefined>;
    public readonly disks!: pulumi.Output<outputs.InstanceDisk[] | undefined>;
    /**
     * The display group of the Linode instance.
     */
    public readonly group!: pulumi.Output<string | undefined>;
    /**
     * An Image ID to deploy the Disk from. Official Linode Images start with linode/, while your Images start with private/. See /images for more information on the Images available for you to use. Examples are `linode/debian9`, `linode/fedora28`, `linode/ubuntu16.04lts`, `linode/arch`, and `private/12345`. See all images [here](https://api.linode.com/v4/linode/kernels). *Changing `image` forces the creation of a new Linode Instance.*
     */
    public readonly image!: pulumi.Output<string | undefined>;
    /**
     * This Linode's Public IPv4 Address. If there are multiple public IPv4 addresses on this Instance, an arbitrary
     * address will be used for this field.
     */
    public /*out*/ readonly ipAddress!: pulumi.Output<string>;
    /**
     * This Linode's IPv4 Addresses. Each Linode is assigned a single public IPv4 address upon creation, and may get a
     * single private IPv4 address if needed. You may need to open a support ticket to get additional IPv4 addresses.
     */
    public /*out*/ readonly ipv4s!: pulumi.Output<string[]>;
    /**
     * This Linode's IPv6 SLAAC addresses. This address is specific to a Linode, and may not be shared.
     */
    public /*out*/ readonly ipv6!: pulumi.Output<string>;
    /**
     * The Config's label for display purposes.  Also used by `bootConfigLabel`.
     */
    public readonly label!: pulumi.Output<string>;
    /**
     * If true, the created Linode will have private networking enabled, allowing use of the 192.168.128.0/17 network within the Linode's region. It can be enabled on an existing Linode but it can't be disabled.
     */
    public readonly privateIp!: pulumi.Output<boolean | undefined>;
    /**
     * This Linode's Private IPv4 Address. The regional private IP address range is 192.168.128/17 address shared by all
     * Linode Instances in a region.
     */
    public /*out*/ readonly privateIpAddress!: pulumi.Output<string>;
    /**
     * This is the location where the Linode is deployed. Examples are `"us-east"`, `"us-west"`, `"ap-south"`, etc. See all regions [here](https://api.linode.com/v4/regions). *Changing `region` forces the creation of a new Linode Instance.*.
     */
    public readonly region!: pulumi.Output<string>;
    /**
     * The initial password for the `root` user account. *This value can not be imported.* *Changing `rootPass` forces the creation of a new Linode Instance.* *If omitted, a random password will be generated but will not be stored in state.*
     */
    public readonly rootPass!: pulumi.Output<string | undefined>;
    public /*out*/ readonly specs!: pulumi.Output<outputs.InstanceSpecs>;
    /**
     * An object containing responses to any User Defined Fields present in the StackScript being deployed to this Linode. Only accepted if 'stackscript_id' is given. The required values depend on the StackScript being deployed.  *This value can not be imported.* *Changing `stackscriptData` forces the creation of a new Linode Instance.*
     */
    public readonly stackscriptData!: pulumi.Output<{[key: string]: any} | undefined>;
    /**
     * The StackScript to deploy to the newly created Linode. If provided, 'image' must also be provided, and must be an Image that is compatible with this StackScript. *This value can not be imported.* *Changing `stackscriptId` forces the creation of a new Linode Instance.*
     */
    public readonly stackscriptId!: pulumi.Output<number | undefined>;
    /**
     * The status of the instance, indicating the current readiness state.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * When deploying from an Image, this field is optional with a Linode API default of 512mb, otherwise it is ignored. This is used to set the swap disk size for the newly-created Linode.
     */
    public readonly swapSize!: pulumi.Output<number>;
    /**
     * A list of tags applied to this object. Tags are for organizational purposes only.
     */
    public readonly tags!: pulumi.Output<string[] | undefined>;
    /**
     * The Linode type defines the pricing, CPU, disk, and RAM specs of the instance. Examples are `"g6-nanode-1"`, `"g6-standard-2"`, `"g6-highmem-16"`, `"g6-dedicated-16"`, etc. See all types [here](https://api.linode.com/v4/linode/types).
     */
    public readonly type!: pulumi.Output<string | undefined>;
    /**
     * The watchdog, named Lassie, is a Shutdown Watchdog that monitors your Linode and will reboot it if it powers off unexpectedly. It works by issuing a boot job when your Linode powers off without a shutdown job being responsible. To prevent a loop, Lassie will give up if there have been more than 5 boot jobs issued within 15 minutes.
     */
    public readonly watchdogEnabled!: pulumi.Output<boolean | undefined>;

    /**
     * Create a Instance resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: InstanceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: InstanceArgs | InstanceState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as InstanceState | undefined;
            inputs["alerts"] = state ? state.alerts : undefined;
            inputs["authorizedKeys"] = state ? state.authorizedKeys : undefined;
            inputs["authorizedUsers"] = state ? state.authorizedUsers : undefined;
            inputs["backupId"] = state ? state.backupId : undefined;
            inputs["backups"] = state ? state.backups : undefined;
            inputs["backupsEnabled"] = state ? state.backupsEnabled : undefined;
            inputs["bootConfigLabel"] = state ? state.bootConfigLabel : undefined;
            inputs["configs"] = state ? state.configs : undefined;
            inputs["disks"] = state ? state.disks : undefined;
            inputs["group"] = state ? state.group : undefined;
            inputs["image"] = state ? state.image : undefined;
            inputs["ipAddress"] = state ? state.ipAddress : undefined;
            inputs["ipv4s"] = state ? state.ipv4s : undefined;
            inputs["ipv6"] = state ? state.ipv6 : undefined;
            inputs["label"] = state ? state.label : undefined;
            inputs["privateIp"] = state ? state.privateIp : undefined;
            inputs["privateIpAddress"] = state ? state.privateIpAddress : undefined;
            inputs["region"] = state ? state.region : undefined;
            inputs["rootPass"] = state ? state.rootPass : undefined;
            inputs["specs"] = state ? state.specs : undefined;
            inputs["stackscriptData"] = state ? state.stackscriptData : undefined;
            inputs["stackscriptId"] = state ? state.stackscriptId : undefined;
            inputs["status"] = state ? state.status : undefined;
            inputs["swapSize"] = state ? state.swapSize : undefined;
            inputs["tags"] = state ? state.tags : undefined;
            inputs["type"] = state ? state.type : undefined;
            inputs["watchdogEnabled"] = state ? state.watchdogEnabled : undefined;
        } else {
            const args = argsOrState as InstanceArgs | undefined;
            if (!args || args.region === undefined) {
                throw new Error("Missing required property 'region'");
            }
            inputs["alerts"] = args ? args.alerts : undefined;
            inputs["authorizedKeys"] = args ? args.authorizedKeys : undefined;
            inputs["authorizedUsers"] = args ? args.authorizedUsers : undefined;
            inputs["backupId"] = args ? args.backupId : undefined;
            inputs["backupsEnabled"] = args ? args.backupsEnabled : undefined;
            inputs["bootConfigLabel"] = args ? args.bootConfigLabel : undefined;
            inputs["configs"] = args ? args.configs : undefined;
            inputs["disks"] = args ? args.disks : undefined;
            inputs["group"] = args ? args.group : undefined;
            inputs["image"] = args ? args.image : undefined;
            inputs["label"] = args ? args.label : undefined;
            inputs["privateIp"] = args ? args.privateIp : undefined;
            inputs["region"] = args ? args.region : undefined;
            inputs["rootPass"] = args ? args.rootPass : undefined;
            inputs["stackscriptData"] = args ? args.stackscriptData : undefined;
            inputs["stackscriptId"] = args ? args.stackscriptId : undefined;
            inputs["swapSize"] = args ? args.swapSize : undefined;
            inputs["tags"] = args ? args.tags : undefined;
            inputs["type"] = args ? args.type : undefined;
            inputs["watchdogEnabled"] = args ? args.watchdogEnabled : undefined;
            inputs["backups"] = undefined /*out*/;
            inputs["ipAddress"] = undefined /*out*/;
            inputs["ipv4s"] = undefined /*out*/;
            inputs["ipv6"] = undefined /*out*/;
            inputs["privateIpAddress"] = undefined /*out*/;
            inputs["specs"] = undefined /*out*/;
            inputs["status"] = undefined /*out*/;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(Instance.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Instance resources.
 */
export interface InstanceState {
    readonly alerts?: pulumi.Input<inputs.InstanceAlerts>;
    /**
     * A list of SSH public keys to deploy for the root user on the newly created Linode. Only accepted if `image` is provided. *This value can not be imported.* *Changing `authorizedKeys` forces the creation of a new Linode Instance.*
     */
    readonly authorizedKeys?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A list of Linode usernames. If the usernames have associated SSH keys, the keys will be appended to the `root` user's `~/.ssh/authorized_keys` file automatically. *This value can not be imported.* *Changing `authorizedUsers` forces the creation of a new Linode Instance.*
     */
    readonly authorizedUsers?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A Backup ID from another Linode's available backups. Your User must have readWrite access to that Linode, the Backup must have a status of successful, and the Linode must be deployed to the same region as the Backup. See /linode/instances/{linodeId}/backups for a Linode's available backups. This field and the image field are mutually exclusive. *This value can not be imported.* *Changing `backupId` forces the creation of a new Linode Instance.*
     */
    readonly backupId?: pulumi.Input<number>;
    /**
     * Information about this Linode's backups status.
     */
    readonly backups?: pulumi.Input<inputs.InstanceBackups>;
    /**
     * If this field is set to true, the created Linode will automatically be enrolled in the Linode Backup service. This will incur an additional charge. The cost for the Backup service is dependent on the Type of Linode deployed.
     */
    readonly backupsEnabled?: pulumi.Input<boolean>;
    /**
     * The Label of the Instance Config that should be used to boot the Linode instance.  If there is only one `config`, the `label` of that `config` will be used as the `bootConfigLabel`. *This value can not be imported.*
     */
    readonly bootConfigLabel?: pulumi.Input<string>;
    /**
     * Configuration profiles define the VM settings and boot behavior of the Linode Instance.
     */
    readonly configs?: pulumi.Input<pulumi.Input<inputs.InstanceConfig>[]>;
    readonly disks?: pulumi.Input<pulumi.Input<inputs.InstanceDisk>[]>;
    /**
     * The display group of the Linode instance.
     */
    readonly group?: pulumi.Input<string>;
    /**
     * An Image ID to deploy the Disk from. Official Linode Images start with linode/, while your Images start with private/. See /images for more information on the Images available for you to use. Examples are `linode/debian9`, `linode/fedora28`, `linode/ubuntu16.04lts`, `linode/arch`, and `private/12345`. See all images [here](https://api.linode.com/v4/linode/kernels). *Changing `image` forces the creation of a new Linode Instance.*
     */
    readonly image?: pulumi.Input<string>;
    /**
     * This Linode's Public IPv4 Address. If there are multiple public IPv4 addresses on this Instance, an arbitrary
     * address will be used for this field.
     */
    readonly ipAddress?: pulumi.Input<string>;
    /**
     * This Linode's IPv4 Addresses. Each Linode is assigned a single public IPv4 address upon creation, and may get a
     * single private IPv4 address if needed. You may need to open a support ticket to get additional IPv4 addresses.
     */
    readonly ipv4s?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * This Linode's IPv6 SLAAC addresses. This address is specific to a Linode, and may not be shared.
     */
    readonly ipv6?: pulumi.Input<string>;
    /**
     * The Config's label for display purposes.  Also used by `bootConfigLabel`.
     */
    readonly label?: pulumi.Input<string>;
    /**
     * If true, the created Linode will have private networking enabled, allowing use of the 192.168.128.0/17 network within the Linode's region. It can be enabled on an existing Linode but it can't be disabled.
     */
    readonly privateIp?: pulumi.Input<boolean>;
    /**
     * This Linode's Private IPv4 Address. The regional private IP address range is 192.168.128/17 address shared by all
     * Linode Instances in a region.
     */
    readonly privateIpAddress?: pulumi.Input<string>;
    /**
     * This is the location where the Linode is deployed. Examples are `"us-east"`, `"us-west"`, `"ap-south"`, etc. See all regions [here](https://api.linode.com/v4/regions). *Changing `region` forces the creation of a new Linode Instance.*.
     */
    readonly region?: pulumi.Input<string>;
    /**
     * The initial password for the `root` user account. *This value can not be imported.* *Changing `rootPass` forces the creation of a new Linode Instance.* *If omitted, a random password will be generated but will not be stored in state.*
     */
    readonly rootPass?: pulumi.Input<string>;
    readonly specs?: pulumi.Input<inputs.InstanceSpecs>;
    /**
     * An object containing responses to any User Defined Fields present in the StackScript being deployed to this Linode. Only accepted if 'stackscript_id' is given. The required values depend on the StackScript being deployed.  *This value can not be imported.* *Changing `stackscriptData` forces the creation of a new Linode Instance.*
     */
    readonly stackscriptData?: pulumi.Input<{[key: string]: any}>;
    /**
     * The StackScript to deploy to the newly created Linode. If provided, 'image' must also be provided, and must be an Image that is compatible with this StackScript. *This value can not be imported.* *Changing `stackscriptId` forces the creation of a new Linode Instance.*
     */
    readonly stackscriptId?: pulumi.Input<number>;
    /**
     * The status of the instance, indicating the current readiness state.
     */
    readonly status?: pulumi.Input<string>;
    /**
     * When deploying from an Image, this field is optional with a Linode API default of 512mb, otherwise it is ignored. This is used to set the swap disk size for the newly-created Linode.
     */
    readonly swapSize?: pulumi.Input<number>;
    /**
     * A list of tags applied to this object. Tags are for organizational purposes only.
     */
    readonly tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The Linode type defines the pricing, CPU, disk, and RAM specs of the instance. Examples are `"g6-nanode-1"`, `"g6-standard-2"`, `"g6-highmem-16"`, `"g6-dedicated-16"`, etc. See all types [here](https://api.linode.com/v4/linode/types).
     */
    readonly type?: pulumi.Input<string>;
    /**
     * The watchdog, named Lassie, is a Shutdown Watchdog that monitors your Linode and will reboot it if it powers off unexpectedly. It works by issuing a boot job when your Linode powers off without a shutdown job being responsible. To prevent a loop, Lassie will give up if there have been more than 5 boot jobs issued within 15 minutes.
     */
    readonly watchdogEnabled?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a Instance resource.
 */
export interface InstanceArgs {
    readonly alerts?: pulumi.Input<inputs.InstanceAlerts>;
    /**
     * A list of SSH public keys to deploy for the root user on the newly created Linode. Only accepted if `image` is provided. *This value can not be imported.* *Changing `authorizedKeys` forces the creation of a new Linode Instance.*
     */
    readonly authorizedKeys?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A list of Linode usernames. If the usernames have associated SSH keys, the keys will be appended to the `root` user's `~/.ssh/authorized_keys` file automatically. *This value can not be imported.* *Changing `authorizedUsers` forces the creation of a new Linode Instance.*
     */
    readonly authorizedUsers?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A Backup ID from another Linode's available backups. Your User must have readWrite access to that Linode, the Backup must have a status of successful, and the Linode must be deployed to the same region as the Backup. See /linode/instances/{linodeId}/backups for a Linode's available backups. This field and the image field are mutually exclusive. *This value can not be imported.* *Changing `backupId` forces the creation of a new Linode Instance.*
     */
    readonly backupId?: pulumi.Input<number>;
    /**
     * If this field is set to true, the created Linode will automatically be enrolled in the Linode Backup service. This will incur an additional charge. The cost for the Backup service is dependent on the Type of Linode deployed.
     */
    readonly backupsEnabled?: pulumi.Input<boolean>;
    /**
     * The Label of the Instance Config that should be used to boot the Linode instance.  If there is only one `config`, the `label` of that `config` will be used as the `bootConfigLabel`. *This value can not be imported.*
     */
    readonly bootConfigLabel?: pulumi.Input<string>;
    /**
     * Configuration profiles define the VM settings and boot behavior of the Linode Instance.
     */
    readonly configs?: pulumi.Input<pulumi.Input<inputs.InstanceConfig>[]>;
    readonly disks?: pulumi.Input<pulumi.Input<inputs.InstanceDisk>[]>;
    /**
     * The display group of the Linode instance.
     */
    readonly group?: pulumi.Input<string>;
    /**
     * An Image ID to deploy the Disk from. Official Linode Images start with linode/, while your Images start with private/. See /images for more information on the Images available for you to use. Examples are `linode/debian9`, `linode/fedora28`, `linode/ubuntu16.04lts`, `linode/arch`, and `private/12345`. See all images [here](https://api.linode.com/v4/linode/kernels). *Changing `image` forces the creation of a new Linode Instance.*
     */
    readonly image?: pulumi.Input<string>;
    /**
     * The Config's label for display purposes.  Also used by `bootConfigLabel`.
     */
    readonly label?: pulumi.Input<string>;
    /**
     * If true, the created Linode will have private networking enabled, allowing use of the 192.168.128.0/17 network within the Linode's region. It can be enabled on an existing Linode but it can't be disabled.
     */
    readonly privateIp?: pulumi.Input<boolean>;
    /**
     * This is the location where the Linode is deployed. Examples are `"us-east"`, `"us-west"`, `"ap-south"`, etc. See all regions [here](https://api.linode.com/v4/regions). *Changing `region` forces the creation of a new Linode Instance.*.
     */
    readonly region: pulumi.Input<string>;
    /**
     * The initial password for the `root` user account. *This value can not be imported.* *Changing `rootPass` forces the creation of a new Linode Instance.* *If omitted, a random password will be generated but will not be stored in state.*
     */
    readonly rootPass?: pulumi.Input<string>;
    /**
     * An object containing responses to any User Defined Fields present in the StackScript being deployed to this Linode. Only accepted if 'stackscript_id' is given. The required values depend on the StackScript being deployed.  *This value can not be imported.* *Changing `stackscriptData` forces the creation of a new Linode Instance.*
     */
    readonly stackscriptData?: pulumi.Input<{[key: string]: any}>;
    /**
     * The StackScript to deploy to the newly created Linode. If provided, 'image' must also be provided, and must be an Image that is compatible with this StackScript. *This value can not be imported.* *Changing `stackscriptId` forces the creation of a new Linode Instance.*
     */
    readonly stackscriptId?: pulumi.Input<number>;
    /**
     * When deploying from an Image, this field is optional with a Linode API default of 512mb, otherwise it is ignored. This is used to set the swap disk size for the newly-created Linode.
     */
    readonly swapSize?: pulumi.Input<number>;
    /**
     * A list of tags applied to this object. Tags are for organizational purposes only.
     */
    readonly tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The Linode type defines the pricing, CPU, disk, and RAM specs of the instance. Examples are `"g6-nanode-1"`, `"g6-standard-2"`, `"g6-highmem-16"`, `"g6-dedicated-16"`, etc. See all types [here](https://api.linode.com/v4/linode/types).
     */
    readonly type?: pulumi.Input<string>;
    /**
     * The watchdog, named Lassie, is a Shutdown Watchdog that monitors your Linode and will reboot it if it powers off unexpectedly. It works by issuing a boot job when your Linode powers off without a shutdown job being responsible. To prevent a loop, Lassie will give up if there have been more than 5 boot jobs issued within 15 minutes.
     */
    readonly watchdogEnabled?: pulumi.Input<boolean>;
}
