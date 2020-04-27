// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as outputs from "../types/output";

export interface GetInstanceTypeAddons {
    backups: outputs.GetInstanceTypeAddonsBackups;
}

export interface GetInstanceTypeAddonsBackups {
    price: outputs.GetInstanceTypeAddonsBackupsPrice;
}

export interface GetInstanceTypeAddonsBackupsPrice {
    hourly: number;
    monthly: number;
}

export interface GetInstanceTypePrice {
    hourly: number;
    monthly: number;
}

export interface GetProfileReferrals {
    code: string;
    completed: number;
    credit: number;
    pending: number;
    total: number;
    url: string;
}

export interface GetStackScriptUserDefinedField {
    default: string;
    example: string;
    label: string;
    manyOf: string;
    name: string;
    oneOf: string;
}

export interface InstanceAlerts {
    cpu: number;
    io: number;
    networkIn: number;
    networkOut: number;
    transferQuota: number;
}

export interface InstanceBackups {
    enabled: boolean;
    schedule: outputs.InstanceBackupsSchedule;
}

export interface InstanceBackupsSchedule {
    day: string;
    window: string;
}

export interface InstanceConfig {
    /**
     * - Arbitrary user comments about this `config`.
     */
    comments?: string;
    /**
     * A list of `disk` or `volume` attachments for this `config`.  If the `bootConfigLabel` omits a `devices` block, the Linode will not be booted.
     */
    devices: outputs.InstanceConfigDevices;
    /**
     * Helpers enabled when booting to this Linode Config.
     */
    helpers: outputs.InstanceConfigHelpers;
    /**
     * - A Kernel ID to boot a Linode with. Default is based on image choice. Examples are `linode/latest-64bit`, `linode/grub2`, `linode/direct-disk`, etc. See all kernels [here](https://api.linode.com/v4/linode/kernels).
     */
    kernel?: string;
    /**
     * The Config's label for display purposes.  Also used by `bootConfigLabel`.
     */
    label: string;
    /**
     * - Defaults to the total RAM of the Linode
     */
    memoryLimit?: number;
    /**
     * - The root device to boot. The corresponding disk must be attached to a `device` slot.  Example: `"/dev/sda"`
     */
    rootDevice: string;
    /**
     * - Defines the state of your Linode after booting. Defaults to `"default"`.
     */
    runLevel?: string;
    /**
     * - Controls the virtualization mode. Defaults to `"paravirt"`.
     */
    virtMode?: string;
}

export interface InstanceConfigDevices {
    /**
     * ... `sdh` - (Optional) The SDA-SDH slots, represent the Linux block device nodes for the first 8 disks attached to the Linode.  Each device must be suplied sequentially.  The device can be either a Disk or a Volume identified by `diskLabel` or `volumeId`. Only one disk identifier is permitted per slot. Devices mapped from `sde` through `sdh` are unavailable in `"fullvirt"` `virtMode`.
     */
    sda: outputs.InstanceConfigDevicesSda;
    sdb: outputs.InstanceConfigDevicesSdb;
    sdc: outputs.InstanceConfigDevicesSdc;
    sdd: outputs.InstanceConfigDevicesSdd;
    sde: outputs.InstanceConfigDevicesSde;
    sdf: outputs.InstanceConfigDevicesSdf;
    sdg: outputs.InstanceConfigDevicesSdg;
    sdh: outputs.InstanceConfigDevicesSdh;
}

export interface InstanceConfigDevicesSda {
    /**
     * The Disk ID of the associated `diskLabel`, if used.
     */
    diskId: number;
    /**
     * The `label` of the `disk` to map to this `device` slot.
     */
    diskLabel?: string;
    /**
     * The Volume ID to map to this `device` slot.
     */
    volumeId?: number;
}

export interface InstanceConfigDevicesSdb {
    /**
     * The Disk ID of the associated `diskLabel`, if used.
     */
    diskId: number;
    /**
     * The `label` of the `disk` to map to this `device` slot.
     */
    diskLabel?: string;
    /**
     * The Volume ID to map to this `device` slot.
     */
    volumeId?: number;
}

export interface InstanceConfigDevicesSdc {
    /**
     * The Disk ID of the associated `diskLabel`, if used.
     */
    diskId: number;
    /**
     * The `label` of the `disk` to map to this `device` slot.
     */
    diskLabel?: string;
    /**
     * The Volume ID to map to this `device` slot.
     */
    volumeId?: number;
}

export interface InstanceConfigDevicesSdd {
    /**
     * The Disk ID of the associated `diskLabel`, if used.
     */
    diskId: number;
    /**
     * The `label` of the `disk` to map to this `device` slot.
     */
    diskLabel?: string;
    /**
     * The Volume ID to map to this `device` slot.
     */
    volumeId?: number;
}

export interface InstanceConfigDevicesSde {
    /**
     * The Disk ID of the associated `diskLabel`, if used.
     */
    diskId: number;
    /**
     * The `label` of the `disk` to map to this `device` slot.
     */
    diskLabel?: string;
    /**
     * The Volume ID to map to this `device` slot.
     */
    volumeId?: number;
}

export interface InstanceConfigDevicesSdf {
    /**
     * The Disk ID of the associated `diskLabel`, if used.
     */
    diskId: number;
    /**
     * The `label` of the `disk` to map to this `device` slot.
     */
    diskLabel?: string;
    /**
     * The Volume ID to map to this `device` slot.
     */
    volumeId?: number;
}

export interface InstanceConfigDevicesSdg {
    /**
     * The Disk ID of the associated `diskLabel`, if used.
     */
    diskId: number;
    /**
     * The `label` of the `disk` to map to this `device` slot.
     */
    diskLabel?: string;
    /**
     * The Volume ID to map to this `device` slot.
     */
    volumeId?: number;
}

export interface InstanceConfigDevicesSdh {
    /**
     * The Disk ID of the associated `diskLabel`, if used.
     */
    diskId: number;
    /**
     * The `label` of the `disk` to map to this `device` slot.
     */
    diskLabel?: string;
    /**
     * The Volume ID to map to this `device` slot.
     */
    volumeId?: number;
}

export interface InstanceConfigHelpers {
    devtmpfsAutomount?: boolean;
    /**
     * Controls the behavior of the Linode Config's Distribution Helper setting.
     */
    distro?: boolean;
    /**
     * Creates a modules dependency file for the Kernel you run.
     */
    modulesDep?: boolean;
    /**
     * Controls the behavior of the Linode Config's Network Helper setting, used to automatically configure additional IP addresses assigned to this instance.
     */
    network?: boolean;
    /**
     * Disables updatedb cron job to avoid disk thrashing.
     */
    updatedbDisabled?: boolean;
}

export interface InstanceDisk {
    /**
     * A list of SSH public keys to deploy for the root user on the newly created Linode. Only accepted if `image` is provided. *This value can not be imported.* *Changing `authorizedKeys` forces the creation of a new Linode Instance.*
     */
    authorizedKeys?: string[];
    /**
     * A list of Linode usernames. If the usernames have associated SSH keys, the keys will be appended to the `root` user's `~/.ssh/authorized_keys` file automatically. *This value can not be imported.* *Changing `authorizedUsers` forces the creation of a new Linode Instance.*
     */
    authorizedUsers?: string[];
    filesystem: string;
    /**
     * The ID of the disk in the Linode API.
     */
    id: number;
    /**
     * An Image ID to deploy the Disk from. Official Linode Images start with linode/, while your Images start with private/. See /images for more information on the Images available for you to use. Examples are `linode/debian9`, `linode/fedora28`, `linode/ubuntu16.04lts`, `linode/arch`, and `private/12345`. See all images [here](https://api.linode.com/v4/linode/kernels). *Changing `image` forces the creation of a new Linode Instance.*
     */
    image: string;
    /**
     * The Config's label for display purposes.  Also used by `bootConfigLabel`.
     */
    label: string;
    readOnly: boolean;
    rootPass?: string;
    /**
     * The size of the Disk in MB.
     */
    size: number;
    /**
     * An object containing responses to any User Defined Fields present in the StackScript being deployed to this Linode. Only accepted if 'stackscript_id' is given. The required values depend on the StackScript being deployed.  *This value can not be imported.* *Changing `stackscriptData` forces the creation of a new Linode Instance.*
     */
    stackscriptData: {[key: string]: any};
    /**
     * The StackScript to deploy to the newly created Linode. If provided, 'image' must also be provided, and must be an Image that is compatible with this StackScript. *This value can not be imported.* *Changing `stackscriptId` forces the creation of a new Linode Instance.*
     */
    stackscriptId: number;
}

export interface InstanceSpecs {
    disk: number;
    memory: number;
    transfer: number;
    vcpus: number;
}

export interface NodeBalancerConfigNodeStatus {
    statusDown: number;
    statusUp: number;
}

export interface NodeBalancerTransfer {
    in: number;
    out: number;
    total: number;
}

export interface StackScriptUserDefinedField {
    default: string;
    example: string;
    /**
     * The StackScript's label is for display purposes only.
     */
    label: string;
    manyOf: string;
    name: string;
    oneOf: string;
}
