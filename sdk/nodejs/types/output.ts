// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";

export interface FirewallDevice {
    /**
     * The ID of the underlying entity this device references (i.e. the Linode's ID).
     */
    entityId: number;
    /**
     * The ID of the Firewall Device.
     */
    id: number;
    /**
     * Used to identify this rule. For display purposes only.
     */
    label: string;
    /**
     * The type of Firewall Device.
     */
    type: string;
    url: string;
}

export interface FirewallInbound {
    /**
     * Controls whether traffic is accepted or dropped by this rule (`ACCEPT`, `DROP`). Overrides the Firewall’s inboundPolicy if this is an inbound rule, or the outboundPolicy if this is an outbound rule.
     */
    action: string;
    /**
     * A list of IPv4 addresses or networks. Must be in IP/mask format.
     */
    ipv4s?: string[];
    /**
     * A list of IPv6 addresses or networks. Must be in IP/mask format.
     */
    ipv6s?: string[];
    /**
     * Used to identify this rule. For display purposes only.
     */
    label: string;
    /**
     * A string representation of ports and/or port ranges (i.e. "443" or "80-90, 91").
     */
    ports?: string;
    /**
     * The network protocol this rule controls. (`TCP`, `UDP`, `ICMP`)
     */
    protocol: string;
}

export interface FirewallOutbound {
    /**
     * Controls whether traffic is accepted or dropped by this rule (`ACCEPT`, `DROP`). Overrides the Firewall’s inboundPolicy if this is an inbound rule, or the outboundPolicy if this is an outbound rule.
     */
    action: string;
    /**
     * A list of IPv4 addresses or networks. Must be in IP/mask format.
     */
    ipv4s?: string[];
    /**
     * A list of IPv6 addresses or networks. Must be in IP/mask format.
     */
    ipv6s?: string[];
    /**
     * Used to identify this rule. For display purposes only.
     */
    label: string;
    /**
     * A string representation of ports and/or port ranges (i.e. "443" or "80-90, 91").
     */
    ports?: string;
    /**
     * The network protocol this rule controls. (`TCP`, `UDP`, `ICMP`)
     */
    protocol: string;
}

export interface GetFirewallDevice {
    /**
     * The ID of the underlying entity this device references (i.e. the Linode's ID).
     */
    entityId: number;
    /**
     * The Firewall's ID.
     */
    id: number;
    /**
     * The label of the underlying entity this device references.
     */
    label: string;
    /**
     * The type of Firewall Device.
     */
    type: string;
    url: string;
}

export interface GetFirewallInbound {
    /**
     * Controls whether traffic is accepted or dropped by this rule. Overrides the Firewall’s inboundPolicy if this is an inbound rule, or the outboundPolicy if this is an outbound rule.
     */
    action: string;
    /**
     * A list of IPv4 addresses or networks. Must be in IP/mask format.
     */
    ipv4s: string[];
    /**
     * A list of IPv6 addresses or networks. Must be in IP/mask format.
     */
    ipv6s: string[];
    /**
     * The label of the underlying entity this device references.
     */
    label: string;
    /**
     * A string representation of ports and/or port ranges (i.e. "443" or "80-90, 91").
     */
    ports: string;
    /**
     * The network protocol this rule controls. (`TCP`, `UDP`, `ICMP`)
     */
    protocol: string;
}

export interface GetFirewallOutbound {
    /**
     * Controls whether traffic is accepted or dropped by this rule. Overrides the Firewall’s inboundPolicy if this is an inbound rule, or the outboundPolicy if this is an outbound rule.
     */
    action: string;
    /**
     * A list of IPv4 addresses or networks. Must be in IP/mask format.
     */
    ipv4s: string[];
    /**
     * A list of IPv6 addresses or networks. Must be in IP/mask format.
     */
    ipv6s: string[];
    /**
     * The label of the underlying entity this device references.
     */
    label: string;
    /**
     * A string representation of ports and/or port ranges (i.e. "443" or "80-90, 91").
     */
    ports: string;
    /**
     * The network protocol this rule controls. (`TCP`, `UDP`, `ICMP`)
     */
    protocol: string;
}

export interface GetImagesFilter {
    /**
     * The name of the field to filter by. See the Filterable Fields section for a complete list of filterable fields.
     */
    name: string;
    /**
     * A list of values for the filter to allow. These values should all be in string form.
     */
    values: string[];
}

export interface GetImagesImage {
    created: string;
    createdBy: string;
    deprecated: boolean;
    description: string;
    expiry: string;
    id: string;
    isPublic: boolean;
    label: string;
    size: number;
    status: string;
    type: string;
    vendor: string;
}

export interface GetInstanceBackupsAutomatic {
    /**
     * A list of the labels of the Configuration profiles that are part of the Backup.
     */
    configs: string[];
    /**
     * The date the Backup was taken.
     */
    created: string;
    disks: outputs.GetInstanceBackupsAutomaticDisk[];
    /**
     * The date the Backup completed.
     */
    finished: string;
    /**
     * The unique ID of this Backup.
     */
    id: number;
    /**
     * The label of this disk.
     */
    label: string;
    /**
     * The current state of a specific Backup. (`paused`, `pending`, `running`, `needsPostProcessing`, `successful`, `failed`, `userAborted`)
     */
    status: string;
    /**
     * This indicates whether the Backup is an automatic Backup or manual snapshot taken by the User at a specific point in time. (`auto`, `snapshot`)
     */
    type: string;
    /**
     * The date the Backup was most recently updated.
     */
    updated: string;
}

export interface GetInstanceBackupsAutomaticDisk {
    /**
     * The filesystem of this disk.
     */
    filesystem: string;
    /**
     * The label of this disk.
     */
    label: string;
    /**
     * The size of this disk.
     */
    size: number;
}

export interface GetInstanceBackupsCurrent {
    /**
     * A list of the labels of the Configuration profiles that are part of the Backup.
     */
    configs: string[];
    /**
     * The date the Backup was taken.
     */
    created: string;
    disks: outputs.GetInstanceBackupsCurrentDisk[];
    /**
     * The date the Backup completed.
     */
    finished: string;
    /**
     * The unique ID of this Backup.
     */
    id: number;
    /**
     * The label of this disk.
     */
    label: string;
    /**
     * The current state of a specific Backup. (`paused`, `pending`, `running`, `needsPostProcessing`, `successful`, `failed`, `userAborted`)
     */
    status: string;
    /**
     * This indicates whether the Backup is an automatic Backup or manual snapshot taken by the User at a specific point in time. (`auto`, `snapshot`)
     */
    type: string;
    /**
     * The date the Backup was most recently updated.
     */
    updated: string;
}

export interface GetInstanceBackupsCurrentDisk {
    /**
     * The filesystem of this disk.
     */
    filesystem: string;
    /**
     * The label of this disk.
     */
    label: string;
    /**
     * The size of this disk.
     */
    size: number;
}

export interface GetInstanceBackupsInProgress {
    /**
     * A list of the labels of the Configuration profiles that are part of the Backup.
     */
    configs: string[];
    /**
     * The date the Backup was taken.
     */
    created: string;
    disks: outputs.GetInstanceBackupsInProgressDisk[];
    /**
     * The date the Backup completed.
     */
    finished: string;
    /**
     * The unique ID of this Backup.
     */
    id: number;
    /**
     * The label of this disk.
     */
    label: string;
    /**
     * The current state of a specific Backup. (`paused`, `pending`, `running`, `needsPostProcessing`, `successful`, `failed`, `userAborted`)
     */
    status: string;
    /**
     * This indicates whether the Backup is an automatic Backup or manual snapshot taken by the User at a specific point in time. (`auto`, `snapshot`)
     */
    type: string;
    /**
     * The date the Backup was most recently updated.
     */
    updated: string;
}

export interface GetInstanceBackupsInProgressDisk {
    /**
     * The filesystem of this disk.
     */
    filesystem: string;
    /**
     * The label of this disk.
     */
    label: string;
    /**
     * The size of this disk.
     */
    size: number;
}

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

export interface GetInstancesFilter {
    /**
     * The name of the field to filter by. See the Filterable Fields section for a list of filterable fields.
     */
    name: string;
    /**
     * A list of values for the filter to allow. These values should all be in string form.
     */
    values: string[];
}

export interface GetInstancesInstance {
    alerts: outputs.GetInstancesInstanceAlerts;
    backups: outputs.GetInstancesInstanceBackup[];
    bootConfigLabel: string;
    configs: outputs.GetInstancesInstanceConfig[];
    disks: outputs.GetInstancesInstanceDisk[];
    group: string;
    image: string;
    ipAddress: string;
    ipv4s: string[];
    ipv6: string;
    label: string;
    privateIpAddress: string;
    region: string;
    specs: outputs.GetInstancesInstanceSpec[];
    status: string;
    swapSize: number;
    tags: string[];
    type: string;
    watchdogEnabled: boolean;
}

export interface GetInstancesInstanceAlerts {
    cpu: number;
    io: number;
    networkIn: number;
    networkOut: number;
    transferQuota: number;
}

export interface GetInstancesInstanceBackup {
    enabled: boolean;
    schedules: outputs.GetInstancesInstanceBackupSchedule[];
}

export interface GetInstancesInstanceBackupSchedule {
    day: string;
    window: string;
}

export interface GetInstancesInstanceConfig {
    comments: string;
    devices: outputs.GetInstancesInstanceConfigDevice[];
    helpers: outputs.GetInstancesInstanceConfigHelper[];
    interfaces: outputs.GetInstancesInstanceConfigInterface[];
    kernel: string;
    label: string;
    memoryLimit: number;
    rootDevice: string;
    runLevel: string;
    virtMode: string;
}

export interface GetInstancesInstanceConfigDevice {
    sdas: outputs.GetInstancesInstanceConfigDeviceSda[];
    sdbs: outputs.GetInstancesInstanceConfigDeviceSdb[];
    sdcs: outputs.GetInstancesInstanceConfigDeviceSdc[];
    sdds: outputs.GetInstancesInstanceConfigDeviceSdd[];
    sdes: outputs.GetInstancesInstanceConfigDeviceSde[];
    sdfs: outputs.GetInstancesInstanceConfigDeviceSdf[];
    sdgs: outputs.GetInstancesInstanceConfigDeviceSdg[];
    sdhs: outputs.GetInstancesInstanceConfigDeviceSdh[];
}

export interface GetInstancesInstanceConfigDeviceSda {
    diskId: number;
    diskLabel?: string;
    volumeId?: number;
}

export interface GetInstancesInstanceConfigDeviceSdb {
    diskId: number;
    diskLabel?: string;
    volumeId?: number;
}

export interface GetInstancesInstanceConfigDeviceSdc {
    diskId: number;
    diskLabel?: string;
    volumeId?: number;
}

export interface GetInstancesInstanceConfigDeviceSdd {
    diskId: number;
    diskLabel?: string;
    volumeId?: number;
}

export interface GetInstancesInstanceConfigDeviceSde {
    diskId: number;
    diskLabel?: string;
    volumeId?: number;
}

export interface GetInstancesInstanceConfigDeviceSdf {
    diskId: number;
    diskLabel?: string;
    volumeId?: number;
}

export interface GetInstancesInstanceConfigDeviceSdg {
    diskId: number;
    diskLabel?: string;
    volumeId?: number;
}

export interface GetInstancesInstanceConfigDeviceSdh {
    diskId: number;
    diskLabel?: string;
    volumeId?: number;
}

export interface GetInstancesInstanceConfigHelper {
    devtmpfsAutomount: boolean;
    distro: boolean;
    modulesDep: boolean;
    network: boolean;
    updatedbDisabled: boolean;
}

export interface GetInstancesInstanceConfigInterface {
    ipamAddress?: string;
    label?: string;
    purpose?: string;
}

export interface GetInstancesInstanceDisk {
    filesystem: string;
    id: number;
    label: string;
    size: number;
}

export interface GetInstancesInstanceSpec {
    disk: number;
    memory: number;
    transfer: number;
    vcpus: number;
}

export interface GetLkeClusterPool {
    /**
     * The number of nodes in the Node Pool.
     */
    count: number;
    /**
     * The LKE Cluster's ID.
     */
    id: number;
    /**
     * The nodes in the Node Pool.
     */
    nodes: outputs.GetLkeClusterPoolNode[];
    /**
     * The linode type for all of the nodes in the Node Pool. See all node types [here](https://api.linode.com/v4/linode/types).
     */
    type: string;
}

export interface GetLkeClusterPoolNode {
    /**
     * The LKE Cluster's ID.
     */
    id: string;
    /**
     * The ID of the underlying Linode instance.
     */
    instanceId: number;
    /**
     * The status of the node. (`ready`, `notReady`)
     */
    status: string;
}

export interface GetNodeBalancerConfigNodeStatus {
    /**
     * The number of backends considered to be 'DOWN' and unhealthy. These are not in rotation, and not serving requests.
     */
    down: number;
    /**
     * The number of backends considered to be 'UP' and healthy, and that are serving requests.
     */
    up: number;
}

export interface GetNodeBalancerTransfer {
    /**
     * The total transfer, in MB, used by this NodeBalancer for the current month
     */
    in: number;
    /**
     * The total inbound transfer, in MB, used for this NodeBalancer for the current month
     */
    out: number;
    /**
     * The total outbound transfer, in MB, used for this NodeBalancer for the current month
     */
    total: number;
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

export interface GetVlansFilter {
    /**
     * The name of the field to filter by. See the Filterable Fields section for a complete list of filterable fields.
     */
    name: string;
    /**
     * A list of values for the filter to allow. These values should all be in string form.
     */
    values: string[];
}

export interface GetVlansVlan {
    created: string;
    label: string;
    linodes: number[];
    region: string;
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
    interfaces?: outputs.InstanceConfigInterface[];
    /**
     * - A Kernel ID to boot a Linode with. Default is based on image choice. Examples are `linode/latest-64bit`, `linode/grub2`, `linode/direct-disk`, etc. See all kernels [here](https://api.linode.com/v4/linode/kernels). Note that this is a paginated API endpoint ([docs](https://developers.linode.com/api/v4/linode-kernels)).
     */
    kernel?: string;
    /**
     * The name of this interface. If the interface is a VLAN, a label is required.
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

export interface InstanceConfigInterface {
    /**
     * This Network Interface’s private IP address in Classless Inter-Domain Routing (CIDR) notation.
     */
    ipamAddress?: string;
    /**
     * The name of this interface. If the interface is a VLAN, a label is required.
     */
    label?: string;
    /**
     * The type of interface. (`public`, `vlan`)
     */
    purpose?: string;
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
    /**
     * The Disk filesystem can be one of: `"raw"`, `"swap"`, `"ext3"`, `"ext4"`, or `"initrd"` which has a max size of 32mb and can be used in the config `initrd` (not currently supported in this provider).
     */
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
     * The name of this interface. If the interface is a VLAN, a label is required.
     */
    label: string;
    readOnly: boolean;
    /**
     * The initial password for the `root` user account. *This value can not be imported.* *Changing `rootPass` forces the creation of a new Linode Instance.* *If omitted, a random password will be generated but will not be stored in state.*
     */
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

export interface InstanceInterface {
    /**
     * This Network Interface’s private IP address in Classless Inter-Domain Routing (CIDR) notation.
     */
    ipamAddress?: string;
    /**
     * The name of this interface. If the interface is a VLAN, a label is required.
     */
    label?: string;
    /**
     * The type of interface. (`public`, `vlan`)
     */
    purpose?: string;
}

export interface InstanceSpecs {
    disk: number;
    memory: number;
    transfer: number;
    vcpus: number;
}

export interface LkeClusterPool {
    /**
     * The number of nodes in the Node Pool.
     */
    count: number;
    /**
     * The ID of the node.
     */
    id: number;
    nodes: outputs.LkeClusterPoolNode[];
    /**
     * A Linode Type for all of the nodes in the Node Pool. See all node types [here](https://api.linode.com/v4/linode/types).
     */
    type: string;
}

export interface LkeClusterPoolNode {
    /**
     * The ID of the node.
     */
    id: string;
    /**
     * The ID of the underlying Linode instance.
     */
    instanceId: number;
    /**
     * The status of the node. (`ready`, `notReady`)
     */
    status: string;
}

export interface NodeBalancerConfigNodeStatus {
    down: number;
    up: number;
}

export interface NodeBalancerTransfer {
    in: number;
    out: number;
    total: number;
}

export interface ObjectStorageBucketCert {
    /**
     * The Base64 encoded and PEM formatted SSL certificate.
     */
    certificate: string;
    /**
     * The private key associated with the TLS/SSL certificate.
     */
    privateKey: string;
}

export interface ObjectStorageBucketLifecycleRule {
    /**
     * Specifies the number of days after initiating a multipart upload when the multipart upload must be completed.
     */
    abortIncompleteMultipartUploadDays?: number;
    /**
     * Specifies whether the lifecycle rule is active.
     */
    enabled: boolean;
    expiration?: outputs.ObjectStorageBucketLifecycleRuleExpiration;
    /**
     * The unique identifier for the rule.
     */
    id: string;
    noncurrentVersionExpiration?: outputs.ObjectStorageBucketLifecycleRuleNoncurrentVersionExpiration;
    /**
     * The object key prefix identifying one or more objects to which the rule applies.
     */
    prefix?: string;
}

export interface ObjectStorageBucketLifecycleRuleExpiration {
    /**
     * Specifies the date after which you want the corresponding action to take effect.
     */
    date?: string;
    /**
     * Specifies the number of days non-current object versions expire.
     */
    days?: number;
    /**
     * On a versioned bucket (versioning-enabled or versioning-suspended bucket), you can add this element in the lifecycle configuration to direct Linode Object Storage to delete expired object delete markers. This cannot be specified with Days or Date in a Lifecycle Expiration Policy.
     */
    expiredObjectDeleteMarker?: boolean;
}

export interface ObjectStorageBucketLifecycleRuleNoncurrentVersionExpiration {
    /**
     * Specifies the number of days non-current object versions expire.
     */
    days: number;
}

export interface ObjectStorageKeyBucketAccess {
    /**
     * The unique label of the bucket to which the key will grant limited access.
     */
    bucketName: string;
    /**
     * The Object Storage cluster where a bucket to which the key is granting access is hosted.
     */
    cluster: string;
    /**
     * This Limited Access Key’s permissions for the selected bucket. *Changing `permissions` forces the creation of a new Object Storage Key.* (`readWrite`, `readOnly`)
     */
    permissions: string;
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

export interface UserDomainGrant {
    id: number;
    permissions: string;
}

export interface UserFirewallGrant {
    id: number;
    permissions: string;
}

export interface UserGlobalGrants {
    accountAccess?: string;
    addDomains?: boolean;
    addFirewalls?: boolean;
    addImages?: boolean;
    addLinodes?: boolean;
    addLongview?: boolean;
    addNodebalancers?: boolean;
    addStackscripts?: boolean;
    addVolumes?: boolean;
    cancelAccount?: boolean;
    longviewSubscription?: boolean;
}

export interface UserImageGrant {
    id: number;
    permissions: string;
}

export interface UserLinodeGrant {
    id: number;
    permissions: string;
}

export interface UserLongviewGrant {
    id: number;
    permissions: string;
}

export interface UserNodebalancerGrant {
    id: number;
    permissions: string;
}

export interface UserStackscriptGrant {
    id: number;
    permissions: string;
}

export interface UserVolumeGrant {
    id: number;
    permissions: string;
}

