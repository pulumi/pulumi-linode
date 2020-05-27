// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";

export interface FirewallDevice {
    /**
     * The ID of the underlying entity this device references (i.e. the Linode's ID).
     */
    entityId?: pulumi.Input<number>;
    /**
     * The ID of the Firewall Device.
     */
    id?: pulumi.Input<number>;
    /**
     * This Firewall's unique label.
     */
    label?: pulumi.Input<string>;
    /**
     * The type of Firewall Device.
     */
    type?: pulumi.Input<string>;
    url?: pulumi.Input<string>;
}

export interface FirewallInbound {
    /**
     * A list of IP addresses, CIDR blocks, or `0.0.0.0/0` (to whitelist all) this rule applies to.
     */
    addresses: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A list of ports and/or port ranges (i.e. "443" or "80-90").
     */
    ports: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The network protocol this rule controls.
     */
    protocol: pulumi.Input<string>;
}

export interface FirewallOutbound {
    /**
     * A list of IP addresses, CIDR blocks, or `0.0.0.0/0` (to whitelist all) this rule applies to.
     */
    addresses: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A list of ports and/or port ranges (i.e. "443" or "80-90").
     */
    ports: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The network protocol this rule controls.
     */
    protocol: pulumi.Input<string>;
}

export interface GetStackScriptUserDefinedField {
    default?: string;
    example?: string;
    label?: string;
    manyOf?: string;
    name?: string;
    oneOf?: string;
}

export interface InstanceAlerts {
    cpu?: pulumi.Input<number>;
    io?: pulumi.Input<number>;
    networkIn?: pulumi.Input<number>;
    networkOut?: pulumi.Input<number>;
    transferQuota?: pulumi.Input<number>;
}

export interface InstanceBackups {
    enabled?: pulumi.Input<boolean>;
    schedule?: pulumi.Input<inputs.InstanceBackupsSchedule>;
}

export interface InstanceBackupsSchedule {
    day?: pulumi.Input<string>;
    window?: pulumi.Input<string>;
}

export interface InstanceConfig {
    /**
     * - Arbitrary user comments about this `config`.
     */
    comments?: pulumi.Input<string>;
    /**
     * A list of `disk` or `volume` attachments for this `config`.  If the `bootConfigLabel` omits a `devices` block, the Linode will not be booted.
     */
    devices?: pulumi.Input<inputs.InstanceConfigDevices>;
    /**
     * Helpers enabled when booting to this Linode Config.
     */
    helpers?: pulumi.Input<inputs.InstanceConfigHelpers>;
    /**
     * - A Kernel ID to boot a Linode with. Default is based on image choice. Examples are `linode/latest-64bit`, `linode/grub2`, `linode/direct-disk`, etc. See all kernels [here](https://api.linode.com/v4/linode/kernels).
     */
    kernel?: pulumi.Input<string>;
    /**
     * The Config's label for display purposes.  Also used by `bootConfigLabel`.
     */
    label: pulumi.Input<string>;
    /**
     * - Defaults to the total RAM of the Linode
     */
    memoryLimit?: pulumi.Input<number>;
    /**
     * - The root device to boot. The corresponding disk must be attached to a `device` slot.  Example: `"/dev/sda"`
     */
    rootDevice?: pulumi.Input<string>;
    /**
     * - Defines the state of your Linode after booting. Defaults to `"default"`.
     */
    runLevel?: pulumi.Input<string>;
    /**
     * - Controls the virtualization mode. Defaults to `"paravirt"`.
     */
    virtMode?: pulumi.Input<string>;
}

export interface InstanceConfigDevices {
    /**
     * ... `sdh` - (Optional) The SDA-SDH slots, represent the Linux block device nodes for the first 8 disks attached to the Linode.  Each device must be suplied sequentially.  The device can be either a Disk or a Volume identified by `diskLabel` or `volumeId`. Only one disk identifier is permitted per slot. Devices mapped from `sde` through `sdh` are unavailable in `"fullvirt"` `virtMode`.
     */
    sda?: pulumi.Input<inputs.InstanceConfigDevicesSda>;
    sdb?: pulumi.Input<inputs.InstanceConfigDevicesSdb>;
    sdc?: pulumi.Input<inputs.InstanceConfigDevicesSdc>;
    sdd?: pulumi.Input<inputs.InstanceConfigDevicesSdd>;
    sde?: pulumi.Input<inputs.InstanceConfigDevicesSde>;
    sdf?: pulumi.Input<inputs.InstanceConfigDevicesSdf>;
    sdg?: pulumi.Input<inputs.InstanceConfigDevicesSdg>;
    sdh?: pulumi.Input<inputs.InstanceConfigDevicesSdh>;
}

export interface InstanceConfigDevicesSda {
    /**
     * The Disk ID of the associated `diskLabel`, if used.
     */
    diskId?: pulumi.Input<number>;
    /**
     * The `label` of the `disk` to map to this `device` slot.
     */
    diskLabel?: pulumi.Input<string>;
    /**
     * The Volume ID to map to this `device` slot.
     */
    volumeId?: pulumi.Input<number>;
}

export interface InstanceConfigDevicesSdb {
    /**
     * The Disk ID of the associated `diskLabel`, if used.
     */
    diskId?: pulumi.Input<number>;
    /**
     * The `label` of the `disk` to map to this `device` slot.
     */
    diskLabel?: pulumi.Input<string>;
    /**
     * The Volume ID to map to this `device` slot.
     */
    volumeId?: pulumi.Input<number>;
}

export interface InstanceConfigDevicesSdc {
    /**
     * The Disk ID of the associated `diskLabel`, if used.
     */
    diskId?: pulumi.Input<number>;
    /**
     * The `label` of the `disk` to map to this `device` slot.
     */
    diskLabel?: pulumi.Input<string>;
    /**
     * The Volume ID to map to this `device` slot.
     */
    volumeId?: pulumi.Input<number>;
}

export interface InstanceConfigDevicesSdd {
    /**
     * The Disk ID of the associated `diskLabel`, if used.
     */
    diskId?: pulumi.Input<number>;
    /**
     * The `label` of the `disk` to map to this `device` slot.
     */
    diskLabel?: pulumi.Input<string>;
    /**
     * The Volume ID to map to this `device` slot.
     */
    volumeId?: pulumi.Input<number>;
}

export interface InstanceConfigDevicesSde {
    /**
     * The Disk ID of the associated `diskLabel`, if used.
     */
    diskId?: pulumi.Input<number>;
    /**
     * The `label` of the `disk` to map to this `device` slot.
     */
    diskLabel?: pulumi.Input<string>;
    /**
     * The Volume ID to map to this `device` slot.
     */
    volumeId?: pulumi.Input<number>;
}

export interface InstanceConfigDevicesSdf {
    /**
     * The Disk ID of the associated `diskLabel`, if used.
     */
    diskId?: pulumi.Input<number>;
    /**
     * The `label` of the `disk` to map to this `device` slot.
     */
    diskLabel?: pulumi.Input<string>;
    /**
     * The Volume ID to map to this `device` slot.
     */
    volumeId?: pulumi.Input<number>;
}

export interface InstanceConfigDevicesSdg {
    /**
     * The Disk ID of the associated `diskLabel`, if used.
     */
    diskId?: pulumi.Input<number>;
    /**
     * The `label` of the `disk` to map to this `device` slot.
     */
    diskLabel?: pulumi.Input<string>;
    /**
     * The Volume ID to map to this `device` slot.
     */
    volumeId?: pulumi.Input<number>;
}

export interface InstanceConfigDevicesSdh {
    /**
     * The Disk ID of the associated `diskLabel`, if used.
     */
    diskId?: pulumi.Input<number>;
    /**
     * The `label` of the `disk` to map to this `device` slot.
     */
    diskLabel?: pulumi.Input<string>;
    /**
     * The Volume ID to map to this `device` slot.
     */
    volumeId?: pulumi.Input<number>;
}

export interface InstanceConfigHelpers {
    devtmpfsAutomount?: pulumi.Input<boolean>;
    /**
     * Controls the behavior of the Linode Config's Distribution Helper setting.
     */
    distro?: pulumi.Input<boolean>;
    /**
     * Creates a modules dependency file for the Kernel you run.
     */
    modulesDep?: pulumi.Input<boolean>;
    /**
     * Controls the behavior of the Linode Config's Network Helper setting, used to automatically configure additional IP addresses assigned to this instance.
     */
    network?: pulumi.Input<boolean>;
    /**
     * Disables updatedb cron job to avoid disk thrashing.
     */
    updatedbDisabled?: pulumi.Input<boolean>;
}

export interface InstanceDisk {
    /**
     * A list of SSH public keys to deploy for the root user on the newly created Linode. Only accepted if `image` is provided. *This value can not be imported.* *Changing `authorizedKeys` forces the creation of a new Linode Instance.*
     */
    authorizedKeys?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A list of Linode usernames. If the usernames have associated SSH keys, the keys will be appended to the `root` user's `~/.ssh/authorized_keys` file automatically. *This value can not be imported.* *Changing `authorizedUsers` forces the creation of a new Linode Instance.*
     */
    authorizedUsers?: pulumi.Input<pulumi.Input<string>[]>;
    filesystem?: pulumi.Input<string>;
    /**
     * The ID of the disk in the Linode API.
     */
    id?: pulumi.Input<number>;
    /**
     * An Image ID to deploy the Disk from. Official Linode Images start with linode/, while your Images start with private/. See /images for more information on the Images available for you to use. Examples are `linode/debian9`, `linode/fedora28`, `linode/ubuntu16.04lts`, `linode/arch`, and `private/12345`. See all images [here](https://api.linode.com/v4/linode/kernels). *Changing `image` forces the creation of a new Linode Instance.*
     */
    image?: pulumi.Input<string>;
    /**
     * The Config's label for display purposes.  Also used by `bootConfigLabel`.
     */
    label: pulumi.Input<string>;
    readOnly?: pulumi.Input<boolean>;
    rootPass?: pulumi.Input<string>;
    /**
     * The size of the Disk in MB.
     */
    size: pulumi.Input<number>;
    /**
     * An object containing responses to any User Defined Fields present in the StackScript being deployed to this Linode. Only accepted if 'stackscript_id' is given. The required values depend on the StackScript being deployed.  *This value can not be imported.* *Changing `stackscriptData` forces the creation of a new Linode Instance.*
     */
    stackscriptData?: pulumi.Input<{[key: string]: any}>;
    /**
     * The StackScript to deploy to the newly created Linode. If provided, 'image' must also be provided, and must be an Image that is compatible with this StackScript. *This value can not be imported.* *Changing `stackscriptId` forces the creation of a new Linode Instance.*
     */
    stackscriptId?: pulumi.Input<number>;
}

export interface InstanceSpecs {
    disk?: pulumi.Input<number>;
    memory?: pulumi.Input<number>;
    transfer?: pulumi.Input<number>;
    vcpus?: pulumi.Input<number>;
}

export interface LkeClusterPool {
    /**
     * The number of nodes in the Node Pool.
     */
    count: pulumi.Input<number>;
    /**
     * The ID of the node.
     */
    id?: pulumi.Input<number>;
    nodes?: pulumi.Input<pulumi.Input<inputs.LkeClusterPoolNode>[]>;
    /**
     * A Linode Type for all of the nodes in the Node Pool.
     */
    type: pulumi.Input<string>;
}

export interface LkeClusterPoolNode {
    /**
     * The ID of the node.
     */
    id?: pulumi.Input<string>;
    /**
     * The ID of the underlying Linode instance.
     */
    instanceId?: pulumi.Input<number>;
    /**
     * The status of the node.
     */
    status?: pulumi.Input<string>;
}

export interface NodeBalancerConfigNodeStatus {
    statusDown?: pulumi.Input<number>;
    statusUp?: pulumi.Input<number>;
}

export interface NodeBalancerTransfer {
    in?: pulumi.Input<number>;
    out?: pulumi.Input<number>;
    total?: pulumi.Input<number>;
}

export interface StackScriptUserDefinedField {
    default?: pulumi.Input<string>;
    example?: pulumi.Input<string>;
    /**
     * The StackScript's label is for display purposes only.
     */
    label?: pulumi.Input<string>;
    manyOf?: pulumi.Input<string>;
    name?: pulumi.Input<string>;
    oneOf?: pulumi.Input<string>;
}
