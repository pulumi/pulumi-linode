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
 * ### Simple Linode Instance
 *
 * The following example shows how one might use this resource to configure a Linode instance.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const web = new linode.Instance("web", {
 *     authorizedKeys: ["ssh-rsa AAAA...Gw== user@example.local"],
 *     group: "foo",
 *     image: "linode/ubuntu18.04",
 *     label: "simple_instance",
 *     privateIp: true,
 *     region: "us-central",
 *     rootPass: "terr4form-test",
 *     swapSize: 256,
 *     tags: ["foo"],
 *     type: "g6-standard-1",
 * });
 * ```
 *
 * ## Import
 *
 * Linodes Instances can be imported using the Linode `id`, e.g.
 *
 * ```sh
 *  $ pulumi import linode:index/instance:Instance mylinode 1234567
 * ```
 *
 *  When importing an instance, all `disk` and `config` values must be represented. Imported disks must include their `label` value.
 *
 * **Any disk that is not precisely represented may be removed resulting in data loss.** Imported configs should include all `devices`, and must include `label`, `kernel`, and the `root_device`.
 *
 * The instance must include a `boot_config_label` referring to the correct configuration profile.
 */
export class Instance extends pulumi.CustomResource {
    /**
     * Get an existing Instance resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
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

    /**
     * Configuration options for alert triggers on this Linode.
     */
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
     * If true, then the instance is kept or converted into in a running state. If false, the instance will be shutdown. If unspecified, the Linode's power status will not be managed by the Provider.
     */
    public readonly booted!: pulumi.Output<boolean>;
    /**
     * Configuration profiles define the VM settings and boot behavior of the Linode Instance.
     *
     * @deprecated The embedded config is deprecated and scheduled to be removed in the next major version.Please consider migrating it  to linode_instance_config resource.
     */
    public readonly configs!: pulumi.Output<outputs.InstanceConfig[]>;
    /**
     * @deprecated The embedded disk block in linode_instance resource is deprecated and scheduled to be removed in the next major version. Please consider migrating it to be the linode_instance_disk resource.
     */
    public readonly disks!: pulumi.Output<outputs.InstanceDisk[]>;
    /**
     * The ID of the firewall applied to the Linode instance during creation.
     */
    public readonly firewallId!: pulumi.Output<number | undefined>;
    /**
     * The display group of the Linode instance.
     */
    public readonly group!: pulumi.Output<string | undefined>;
    /**
     * Whether this Instance was created with user-data.
     */
    public /*out*/ readonly hasUserData!: pulumi.Output<boolean>;
    /**
     * The Linode’s host machine, as a UUID.
     */
    public /*out*/ readonly hostUuid!: pulumi.Output<string>;
    /**
     * An Image ID to deploy the Disk from. Official Linode Images start with linode/, while your Images start with private/. See /images for more information on the Images available for you to use. Examples are `linode/debian9`, `linode/fedora28`, `linode/ubuntu16.04lts`, `linode/arch`, and `private/12345`. See all images [here](https://api.linode.com/v4/images). *Changing `image` forces the creation of a new Linode Instance.*
     */
    public readonly image!: pulumi.Output<string | undefined>;
    /**
     * `interface` - (Optional) A list of network interfaces to be assigned to the Linode.
     */
    public readonly interfaces!: pulumi.Output<outputs.InstanceInterface[] | undefined>;
    /**
     * A string containing the Linode's public IP address.
     */
    public /*out*/ readonly ipAddress!: pulumi.Output<string>;
    /**
     * `ipv4` - (Optional) The IPv4 configuration of the VPC interface. This field is currently only allowed for interfaces with the `vpc` purpose.
     *
     * The following computed attribute is available in a VPC interface:
     */
    public /*out*/ readonly ipv4s!: pulumi.Output<string[]>;
    /**
     * This Linode's IPv6 SLAAC addresses. This address is specific to a Linode, and may not be shared.  The prefix (`/64`) is included in this attribute.
     */
    public /*out*/ readonly ipv6!: pulumi.Output<string>;
    /**
     * The Linode's label is for display purposes only. If no label is provided for a Linode, a default will be assigned.
     */
    public readonly label!: pulumi.Output<string>;
    /**
     * Various fields related to the Linode Metadata service.
     */
    public readonly metadatas!: pulumi.Output<outputs.InstanceMetadata[] | undefined>;
    /**
     * If true, the created Linode will have private networking enabled, allowing use of the 192.168.128.0/17 network within the Linode's region. It can be enabled on an existing Linode but it can't be disabled.
     */
    public readonly privateIp!: pulumi.Output<boolean | undefined>;
    /**
     * This Linode's Private IPv4 Address, if enabled.  The regional private IP address range, 192.168.128.0/17, is shared by all Linode Instances in a region.
     */
    public /*out*/ readonly privateIpAddress!: pulumi.Output<string>;
    /**
     * This is the location where the Linode is deployed. Examples are `"us-east"`, `"us-west"`, `"ap-south"`, etc. See all regions [here](https://api.linode.com/v4/regions). *Changing `region` forces the creation of a new Linode Instance.*.
     */
    public readonly region!: pulumi.Output<string>;
    /**
     * If true, changes in Linode type will attempt to upsize or downsize implicitly created disks. This must be false if explicit disks are defined. *This is an irreversible action as Linode disks cannot be automatically downsized.*
     */
    public readonly resizeDisk!: pulumi.Output<boolean | undefined>;
    /**
     * The initial password for the `root` user account. *This value can not be imported.* *Changing `rootPass` forces the creation of a new Linode Instance.* *If omitted, a random password will be generated but will not be stored in Pulumi state.*
     */
    public readonly rootPass!: pulumi.Output<string | undefined>;
    /**
     * A set of IPv4 addresses to be shared with the Instance. These IP addresses can be both private and public, but must be in the same region as the instance.
     */
    public readonly sharedIpv4s!: pulumi.Output<string[]>;
    /**
     * Information about the resources available to this Linode.
     */
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
     * The status of the instance, indicating the current readiness state. (`running`, `offline`, ...)
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
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as InstanceState | undefined;
            resourceInputs["alerts"] = state ? state.alerts : undefined;
            resourceInputs["authorizedKeys"] = state ? state.authorizedKeys : undefined;
            resourceInputs["authorizedUsers"] = state ? state.authorizedUsers : undefined;
            resourceInputs["backupId"] = state ? state.backupId : undefined;
            resourceInputs["backups"] = state ? state.backups : undefined;
            resourceInputs["backupsEnabled"] = state ? state.backupsEnabled : undefined;
            resourceInputs["bootConfigLabel"] = state ? state.bootConfigLabel : undefined;
            resourceInputs["booted"] = state ? state.booted : undefined;
            resourceInputs["configs"] = state ? state.configs : undefined;
            resourceInputs["disks"] = state ? state.disks : undefined;
            resourceInputs["firewallId"] = state ? state.firewallId : undefined;
            resourceInputs["group"] = state ? state.group : undefined;
            resourceInputs["hasUserData"] = state ? state.hasUserData : undefined;
            resourceInputs["hostUuid"] = state ? state.hostUuid : undefined;
            resourceInputs["image"] = state ? state.image : undefined;
            resourceInputs["interfaces"] = state ? state.interfaces : undefined;
            resourceInputs["ipAddress"] = state ? state.ipAddress : undefined;
            resourceInputs["ipv4s"] = state ? state.ipv4s : undefined;
            resourceInputs["ipv6"] = state ? state.ipv6 : undefined;
            resourceInputs["label"] = state ? state.label : undefined;
            resourceInputs["metadatas"] = state ? state.metadatas : undefined;
            resourceInputs["privateIp"] = state ? state.privateIp : undefined;
            resourceInputs["privateIpAddress"] = state ? state.privateIpAddress : undefined;
            resourceInputs["region"] = state ? state.region : undefined;
            resourceInputs["resizeDisk"] = state ? state.resizeDisk : undefined;
            resourceInputs["rootPass"] = state ? state.rootPass : undefined;
            resourceInputs["sharedIpv4s"] = state ? state.sharedIpv4s : undefined;
            resourceInputs["specs"] = state ? state.specs : undefined;
            resourceInputs["stackscriptData"] = state ? state.stackscriptData : undefined;
            resourceInputs["stackscriptId"] = state ? state.stackscriptId : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["swapSize"] = state ? state.swapSize : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["watchdogEnabled"] = state ? state.watchdogEnabled : undefined;
        } else {
            const args = argsOrState as InstanceArgs | undefined;
            if ((!args || args.region === undefined) && !opts.urn) {
                throw new Error("Missing required property 'region'");
            }
            resourceInputs["alerts"] = args ? args.alerts : undefined;
            resourceInputs["authorizedKeys"] = args ? args.authorizedKeys : undefined;
            resourceInputs["authorizedUsers"] = args ? args.authorizedUsers : undefined;
            resourceInputs["backupId"] = args ? args.backupId : undefined;
            resourceInputs["backupsEnabled"] = args ? args.backupsEnabled : undefined;
            resourceInputs["bootConfigLabel"] = args ? args.bootConfigLabel : undefined;
            resourceInputs["booted"] = args ? args.booted : undefined;
            resourceInputs["configs"] = args ? args.configs : undefined;
            resourceInputs["disks"] = args ? args.disks : undefined;
            resourceInputs["firewallId"] = args ? args.firewallId : undefined;
            resourceInputs["group"] = args ? args.group : undefined;
            resourceInputs["image"] = args ? args.image : undefined;
            resourceInputs["interfaces"] = args ? args.interfaces : undefined;
            resourceInputs["label"] = args ? args.label : undefined;
            resourceInputs["metadatas"] = args ? args.metadatas : undefined;
            resourceInputs["privateIp"] = args ? args.privateIp : undefined;
            resourceInputs["region"] = args ? args.region : undefined;
            resourceInputs["resizeDisk"] = args ? args.resizeDisk : undefined;
            resourceInputs["rootPass"] = args?.rootPass ? pulumi.secret(args.rootPass) : undefined;
            resourceInputs["sharedIpv4s"] = args ? args.sharedIpv4s : undefined;
            resourceInputs["stackscriptData"] = args?.stackscriptData ? pulumi.secret(args.stackscriptData) : undefined;
            resourceInputs["stackscriptId"] = args ? args.stackscriptId : undefined;
            resourceInputs["swapSize"] = args ? args.swapSize : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["watchdogEnabled"] = args ? args.watchdogEnabled : undefined;
            resourceInputs["backups"] = undefined /*out*/;
            resourceInputs["hasUserData"] = undefined /*out*/;
            resourceInputs["hostUuid"] = undefined /*out*/;
            resourceInputs["ipAddress"] = undefined /*out*/;
            resourceInputs["ipv4s"] = undefined /*out*/;
            resourceInputs["ipv6"] = undefined /*out*/;
            resourceInputs["privateIpAddress"] = undefined /*out*/;
            resourceInputs["specs"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["rootPass", "stackscriptData"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(Instance.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Instance resources.
 */
export interface InstanceState {
    /**
     * Configuration options for alert triggers on this Linode.
     */
    alerts?: pulumi.Input<inputs.InstanceAlerts>;
    /**
     * A list of SSH public keys to deploy for the root user on the newly created Linode. Only accepted if `image` is provided. *This value can not be imported.* *Changing `authorizedKeys` forces the creation of a new Linode Instance.*
     */
    authorizedKeys?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A list of Linode usernames. If the usernames have associated SSH keys, the keys will be appended to the `root` user's `~/.ssh/authorized_keys` file automatically. *This value can not be imported.* *Changing `authorizedUsers` forces the creation of a new Linode Instance.*
     */
    authorizedUsers?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A Backup ID from another Linode's available backups. Your User must have readWrite access to that Linode, the Backup must have a status of successful, and the Linode must be deployed to the same region as the Backup. See /linode/instances/{linodeId}/backups for a Linode's available backups. This field and the image field are mutually exclusive. *This value can not be imported.* *Changing `backupId` forces the creation of a new Linode Instance.*
     */
    backupId?: pulumi.Input<number>;
    /**
     * Information about this Linode's backups status.
     */
    backups?: pulumi.Input<inputs.InstanceBackups>;
    /**
     * If this field is set to true, the created Linode will automatically be enrolled in the Linode Backup service. This will incur an additional charge. The cost for the Backup service is dependent on the Type of Linode deployed.
     */
    backupsEnabled?: pulumi.Input<boolean>;
    /**
     * The Label of the Instance Config that should be used to boot the Linode instance.  If there is only one `config`, the `label` of that `config` will be used as the `bootConfigLabel`. *This value can not be imported.*
     */
    bootConfigLabel?: pulumi.Input<string>;
    /**
     * If true, then the instance is kept or converted into in a running state. If false, the instance will be shutdown. If unspecified, the Linode's power status will not be managed by the Provider.
     */
    booted?: pulumi.Input<boolean>;
    /**
     * Configuration profiles define the VM settings and boot behavior of the Linode Instance.
     *
     * @deprecated The embedded config is deprecated and scheduled to be removed in the next major version.Please consider migrating it  to linode_instance_config resource.
     */
    configs?: pulumi.Input<pulumi.Input<inputs.InstanceConfig>[]>;
    /**
     * @deprecated The embedded disk block in linode_instance resource is deprecated and scheduled to be removed in the next major version. Please consider migrating it to be the linode_instance_disk resource.
     */
    disks?: pulumi.Input<pulumi.Input<inputs.InstanceDisk>[]>;
    /**
     * The ID of the firewall applied to the Linode instance during creation.
     */
    firewallId?: pulumi.Input<number>;
    /**
     * The display group of the Linode instance.
     */
    group?: pulumi.Input<string>;
    /**
     * Whether this Instance was created with user-data.
     */
    hasUserData?: pulumi.Input<boolean>;
    /**
     * The Linode’s host machine, as a UUID.
     */
    hostUuid?: pulumi.Input<string>;
    /**
     * An Image ID to deploy the Disk from. Official Linode Images start with linode/, while your Images start with private/. See /images for more information on the Images available for you to use. Examples are `linode/debian9`, `linode/fedora28`, `linode/ubuntu16.04lts`, `linode/arch`, and `private/12345`. See all images [here](https://api.linode.com/v4/images). *Changing `image` forces the creation of a new Linode Instance.*
     */
    image?: pulumi.Input<string>;
    /**
     * `interface` - (Optional) A list of network interfaces to be assigned to the Linode.
     */
    interfaces?: pulumi.Input<pulumi.Input<inputs.InstanceInterface>[]>;
    /**
     * A string containing the Linode's public IP address.
     */
    ipAddress?: pulumi.Input<string>;
    /**
     * `ipv4` - (Optional) The IPv4 configuration of the VPC interface. This field is currently only allowed for interfaces with the `vpc` purpose.
     *
     * The following computed attribute is available in a VPC interface:
     */
    ipv4s?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * This Linode's IPv6 SLAAC addresses. This address is specific to a Linode, and may not be shared.  The prefix (`/64`) is included in this attribute.
     */
    ipv6?: pulumi.Input<string>;
    /**
     * The Linode's label is for display purposes only. If no label is provided for a Linode, a default will be assigned.
     */
    label?: pulumi.Input<string>;
    /**
     * Various fields related to the Linode Metadata service.
     */
    metadatas?: pulumi.Input<pulumi.Input<inputs.InstanceMetadata>[]>;
    /**
     * If true, the created Linode will have private networking enabled, allowing use of the 192.168.128.0/17 network within the Linode's region. It can be enabled on an existing Linode but it can't be disabled.
     */
    privateIp?: pulumi.Input<boolean>;
    /**
     * This Linode's Private IPv4 Address, if enabled.  The regional private IP address range, 192.168.128.0/17, is shared by all Linode Instances in a region.
     */
    privateIpAddress?: pulumi.Input<string>;
    /**
     * This is the location where the Linode is deployed. Examples are `"us-east"`, `"us-west"`, `"ap-south"`, etc. See all regions [here](https://api.linode.com/v4/regions). *Changing `region` forces the creation of a new Linode Instance.*.
     */
    region?: pulumi.Input<string>;
    /**
     * If true, changes in Linode type will attempt to upsize or downsize implicitly created disks. This must be false if explicit disks are defined. *This is an irreversible action as Linode disks cannot be automatically downsized.*
     */
    resizeDisk?: pulumi.Input<boolean>;
    /**
     * The initial password for the `root` user account. *This value can not be imported.* *Changing `rootPass` forces the creation of a new Linode Instance.* *If omitted, a random password will be generated but will not be stored in Pulumi state.*
     */
    rootPass?: pulumi.Input<string>;
    /**
     * A set of IPv4 addresses to be shared with the Instance. These IP addresses can be both private and public, but must be in the same region as the instance.
     */
    sharedIpv4s?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Information about the resources available to this Linode.
     */
    specs?: pulumi.Input<inputs.InstanceSpecs>;
    /**
     * An object containing responses to any User Defined Fields present in the StackScript being deployed to this Linode. Only accepted if 'stackscript_id' is given. The required values depend on the StackScript being deployed.  *This value can not be imported.* *Changing `stackscriptData` forces the creation of a new Linode Instance.*
     */
    stackscriptData?: pulumi.Input<{[key: string]: any}>;
    /**
     * The StackScript to deploy to the newly created Linode. If provided, 'image' must also be provided, and must be an Image that is compatible with this StackScript. *This value can not be imported.* *Changing `stackscriptId` forces the creation of a new Linode Instance.*
     */
    stackscriptId?: pulumi.Input<number>;
    /**
     * The status of the instance, indicating the current readiness state. (`running`, `offline`, ...)
     */
    status?: pulumi.Input<string>;
    /**
     * When deploying from an Image, this field is optional with a Linode API default of 512mb, otherwise it is ignored. This is used to set the swap disk size for the newly-created Linode.
     */
    swapSize?: pulumi.Input<number>;
    /**
     * A list of tags applied to this object. Tags are for organizational purposes only.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The Linode type defines the pricing, CPU, disk, and RAM specs of the instance. Examples are `"g6-nanode-1"`, `"g6-standard-2"`, `"g6-highmem-16"`, `"g6-dedicated-16"`, etc. See all types [here](https://api.linode.com/v4/linode/types).
     */
    type?: pulumi.Input<string>;
    /**
     * The watchdog, named Lassie, is a Shutdown Watchdog that monitors your Linode and will reboot it if it powers off unexpectedly. It works by issuing a boot job when your Linode powers off without a shutdown job being responsible. To prevent a loop, Lassie will give up if there have been more than 5 boot jobs issued within 15 minutes.
     */
    watchdogEnabled?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a Instance resource.
 */
export interface InstanceArgs {
    /**
     * Configuration options for alert triggers on this Linode.
     */
    alerts?: pulumi.Input<inputs.InstanceAlerts>;
    /**
     * A list of SSH public keys to deploy for the root user on the newly created Linode. Only accepted if `image` is provided. *This value can not be imported.* *Changing `authorizedKeys` forces the creation of a new Linode Instance.*
     */
    authorizedKeys?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A list of Linode usernames. If the usernames have associated SSH keys, the keys will be appended to the `root` user's `~/.ssh/authorized_keys` file automatically. *This value can not be imported.* *Changing `authorizedUsers` forces the creation of a new Linode Instance.*
     */
    authorizedUsers?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A Backup ID from another Linode's available backups. Your User must have readWrite access to that Linode, the Backup must have a status of successful, and the Linode must be deployed to the same region as the Backup. See /linode/instances/{linodeId}/backups for a Linode's available backups. This field and the image field are mutually exclusive. *This value can not be imported.* *Changing `backupId` forces the creation of a new Linode Instance.*
     */
    backupId?: pulumi.Input<number>;
    /**
     * If this field is set to true, the created Linode will automatically be enrolled in the Linode Backup service. This will incur an additional charge. The cost for the Backup service is dependent on the Type of Linode deployed.
     */
    backupsEnabled?: pulumi.Input<boolean>;
    /**
     * The Label of the Instance Config that should be used to boot the Linode instance.  If there is only one `config`, the `label` of that `config` will be used as the `bootConfigLabel`. *This value can not be imported.*
     */
    bootConfigLabel?: pulumi.Input<string>;
    /**
     * If true, then the instance is kept or converted into in a running state. If false, the instance will be shutdown. If unspecified, the Linode's power status will not be managed by the Provider.
     */
    booted?: pulumi.Input<boolean>;
    /**
     * Configuration profiles define the VM settings and boot behavior of the Linode Instance.
     *
     * @deprecated The embedded config is deprecated and scheduled to be removed in the next major version.Please consider migrating it  to linode_instance_config resource.
     */
    configs?: pulumi.Input<pulumi.Input<inputs.InstanceConfig>[]>;
    /**
     * @deprecated The embedded disk block in linode_instance resource is deprecated and scheduled to be removed in the next major version. Please consider migrating it to be the linode_instance_disk resource.
     */
    disks?: pulumi.Input<pulumi.Input<inputs.InstanceDisk>[]>;
    /**
     * The ID of the firewall applied to the Linode instance during creation.
     */
    firewallId?: pulumi.Input<number>;
    /**
     * The display group of the Linode instance.
     */
    group?: pulumi.Input<string>;
    /**
     * An Image ID to deploy the Disk from. Official Linode Images start with linode/, while your Images start with private/. See /images for more information on the Images available for you to use. Examples are `linode/debian9`, `linode/fedora28`, `linode/ubuntu16.04lts`, `linode/arch`, and `private/12345`. See all images [here](https://api.linode.com/v4/images). *Changing `image` forces the creation of a new Linode Instance.*
     */
    image?: pulumi.Input<string>;
    /**
     * `interface` - (Optional) A list of network interfaces to be assigned to the Linode.
     */
    interfaces?: pulumi.Input<pulumi.Input<inputs.InstanceInterface>[]>;
    /**
     * The Linode's label is for display purposes only. If no label is provided for a Linode, a default will be assigned.
     */
    label?: pulumi.Input<string>;
    /**
     * Various fields related to the Linode Metadata service.
     */
    metadatas?: pulumi.Input<pulumi.Input<inputs.InstanceMetadata>[]>;
    /**
     * If true, the created Linode will have private networking enabled, allowing use of the 192.168.128.0/17 network within the Linode's region. It can be enabled on an existing Linode but it can't be disabled.
     */
    privateIp?: pulumi.Input<boolean>;
    /**
     * This is the location where the Linode is deployed. Examples are `"us-east"`, `"us-west"`, `"ap-south"`, etc. See all regions [here](https://api.linode.com/v4/regions). *Changing `region` forces the creation of a new Linode Instance.*.
     */
    region: pulumi.Input<string>;
    /**
     * If true, changes in Linode type will attempt to upsize or downsize implicitly created disks. This must be false if explicit disks are defined. *This is an irreversible action as Linode disks cannot be automatically downsized.*
     */
    resizeDisk?: pulumi.Input<boolean>;
    /**
     * The initial password for the `root` user account. *This value can not be imported.* *Changing `rootPass` forces the creation of a new Linode Instance.* *If omitted, a random password will be generated but will not be stored in Pulumi state.*
     */
    rootPass?: pulumi.Input<string>;
    /**
     * A set of IPv4 addresses to be shared with the Instance. These IP addresses can be both private and public, but must be in the same region as the instance.
     */
    sharedIpv4s?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * An object containing responses to any User Defined Fields present in the StackScript being deployed to this Linode. Only accepted if 'stackscript_id' is given. The required values depend on the StackScript being deployed.  *This value can not be imported.* *Changing `stackscriptData` forces the creation of a new Linode Instance.*
     */
    stackscriptData?: pulumi.Input<{[key: string]: any}>;
    /**
     * The StackScript to deploy to the newly created Linode. If provided, 'image' must also be provided, and must be an Image that is compatible with this StackScript. *This value can not be imported.* *Changing `stackscriptId` forces the creation of a new Linode Instance.*
     */
    stackscriptId?: pulumi.Input<number>;
    /**
     * When deploying from an Image, this field is optional with a Linode API default of 512mb, otherwise it is ignored. This is used to set the swap disk size for the newly-created Linode.
     */
    swapSize?: pulumi.Input<number>;
    /**
     * A list of tags applied to this object. Tags are for organizational purposes only.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The Linode type defines the pricing, CPU, disk, and RAM specs of the instance. Examples are `"g6-nanode-1"`, `"g6-standard-2"`, `"g6-highmem-16"`, `"g6-dedicated-16"`, etc. See all types [here](https://api.linode.com/v4/linode/types).
     */
    type?: pulumi.Input<string>;
    /**
     * The watchdog, named Lassie, is a Shutdown Watchdog that monitors your Linode and will reboot it if it powers off unexpectedly. It works by issuing a boot job when your Linode powers off without a shutdown job being responsible. To prevent a loop, Lassie will give up if there have been more than 5 boot jobs issued within 15 minutes.
     */
    watchdogEnabled?: pulumi.Input<boolean>;
}
