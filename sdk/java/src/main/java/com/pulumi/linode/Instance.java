// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.linode.InstanceArgs;
import com.pulumi.linode.Utilities;
import com.pulumi.linode.inputs.InstanceState;
import com.pulumi.linode.outputs.InstanceAlerts;
import com.pulumi.linode.outputs.InstanceBackups;
import com.pulumi.linode.outputs.InstanceConfig;
import com.pulumi.linode.outputs.InstanceDisk;
import com.pulumi.linode.outputs.InstanceInterface;
import com.pulumi.linode.outputs.InstanceMetadata;
import com.pulumi.linode.outputs.InstanceSpecs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Linode Instance resource.  This can be used to create, modify, and delete Linodes.
 * For more information, see [Getting Started with Linode](https://linode.com/docs/getting-started/) and the [Linode APIv4 docs](https://developers.linode.com/api/v4#operation/createLinodeInstance).
 * 
 * ## Example Usage
 * ### Simple Linode Instance
 * 
 * The following example shows how one might use this resource to configure a Linode instance.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.linode.Instance;
 * import com.pulumi.linode.InstanceArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var web = new Instance(&#34;web&#34;, InstanceArgs.builder()        
 *             .authorizedKeys(&#34;ssh-rsa AAAA...Gw== user@example.local&#34;)
 *             .image(&#34;linode/ubuntu22.04&#34;)
 *             .label(&#34;simple_instance&#34;)
 *             .privateIp(true)
 *             .region(&#34;us-central&#34;)
 *             .rootPass(&#34;this-is-not-a-safe-password&#34;)
 *             .swapSize(256)
 *             .tags(&#34;foo&#34;)
 *             .type(&#34;g6-standard-1&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Linode Instance with Explicit Networking Interfaces
 * 
 * You can add a VPC or VLAN interface directly to a Linode instance resource.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.linode.Instance;
 * import com.pulumi.linode.InstanceArgs;
 * import com.pulumi.linode.inputs.InstanceInterfaceArgs;
 * import com.pulumi.linode.inputs.InstanceInterfaceIpv4Args;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var web = new Instance(&#34;web&#34;, InstanceArgs.builder()        
 *             .authorizedKeys(&#34;ssh-rsa AAAA...Gw== user@example.local&#34;)
 *             .image(&#34;linode/ubuntu22.04&#34;)
 *             .interfaces(            
 *                 InstanceInterfaceArgs.builder()
 *                     .purpose(&#34;public&#34;)
 *                     .build(),
 *                 InstanceInterfaceArgs.builder()
 *                     .ipv4(InstanceInterfaceIpv4Args.builder()
 *                         .vpc(&#34;10.0.4.250&#34;)
 *                         .build())
 *                     .purpose(&#34;vpc&#34;)
 *                     .subnetId(123)
 *                     .build())
 *             .label(&#34;simple_instance&#34;)
 *             .privateIp(true)
 *             .region(&#34;us-central&#34;)
 *             .rootPass(&#34;this-is-not-a-safe-password&#34;)
 *             .swapSize(256)
 *             .tags(&#34;foo&#34;)
 *             .type(&#34;g6-standard-1&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Linodes Instances can be imported using the Linode `id`, e.g.
 * 
 * ```sh
 * $ pulumi import linode:index/instance:Instance mylinode 1234567
 * ```
 * 
 *  When importing an instance, all `disk` and `config` values must be represented.
 * 
 *  Imported disks must include their `label` value.
 * 
 * **Any disk that is not precisely represented may be removed resulting in data loss.**
 * 
 *  Imported configs should include all `devices`, and must include `label`, `kernel`, and the `root_device`.
 * 
 * The instance must include a `boot_config_label` referring to the correct configuration profile.
 * 
 */
@ResourceType(type="linode:index/instance:Instance")
public class Instance extends com.pulumi.resources.CustomResource {
    /**
     * Configuration options for alert triggers on this Linode.
     * 
     */
    @Export(name="alerts", refs={InstanceAlerts.class}, tree="[0]")
    private Output<InstanceAlerts> alerts;

    /**
     * @return Configuration options for alert triggers on this Linode.
     * 
     */
    public Output<InstanceAlerts> alerts() {
        return this.alerts;
    }
    /**
     * A list of SSH public keys to deploy for the root user on the newly created Linode. Only accepted if `image` is provided. *This value can not be imported.* *Changing `authorized_keys` forces the creation of a new Linode Instance.*
     * 
     */
    @Export(name="authorizedKeys", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> authorizedKeys;

    /**
     * @return A list of SSH public keys to deploy for the root user on the newly created Linode. Only accepted if `image` is provided. *This value can not be imported.* *Changing `authorized_keys` forces the creation of a new Linode Instance.*
     * 
     */
    public Output<Optional<List<String>>> authorizedKeys() {
        return Codegen.optional(this.authorizedKeys);
    }
    /**
     * A list of Linode usernames. If the usernames have associated SSH keys, the keys will be appended to the `root` user&#39;s `~/.ssh/authorized_keys` file automatically. *This value can not be imported.* *Changing `authorized_users` forces the creation of a new Linode Instance.*
     * 
     */
    @Export(name="authorizedUsers", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> authorizedUsers;

    /**
     * @return A list of Linode usernames. If the usernames have associated SSH keys, the keys will be appended to the `root` user&#39;s `~/.ssh/authorized_keys` file automatically. *This value can not be imported.* *Changing `authorized_users` forces the creation of a new Linode Instance.*
     * 
     */
    public Output<Optional<List<String>>> authorizedUsers() {
        return Codegen.optional(this.authorizedUsers);
    }
    /**
     * A Backup ID from another Linode&#39;s available backups. Your User must have read_write access to that Linode, the Backup must have a status of successful, and the Linode must be deployed to the same region as the Backup. See /linode/instances/{linodeId}/backups for a Linode&#39;s available backups. This field and the image field are mutually exclusive. *This value can not be imported.* *Changing `backup_id` forces the creation of a new Linode Instance.*
     * 
     */
    @Export(name="backupId", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> backupId;

    /**
     * @return A Backup ID from another Linode&#39;s available backups. Your User must have read_write access to that Linode, the Backup must have a status of successful, and the Linode must be deployed to the same region as the Backup. See /linode/instances/{linodeId}/backups for a Linode&#39;s available backups. This field and the image field are mutually exclusive. *This value can not be imported.* *Changing `backup_id` forces the creation of a new Linode Instance.*
     * 
     */
    public Output<Optional<Integer>> backupId() {
        return Codegen.optional(this.backupId);
    }
    /**
     * Information about this Linode&#39;s backups status.
     * 
     */
    @Export(name="backups", refs={InstanceBackups.class}, tree="[0]")
    private Output<InstanceBackups> backups;

    /**
     * @return Information about this Linode&#39;s backups status.
     * 
     */
    public Output<InstanceBackups> backups() {
        return this.backups;
    }
    /**
     * If this field is set to true, the created Linode will automatically be enrolled in the Linode Backup service. This will incur an additional charge. The cost for the Backup service is dependent on the Type of Linode deployed.
     * 
     */
    @Export(name="backupsEnabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> backupsEnabled;

    /**
     * @return If this field is set to true, the created Linode will automatically be enrolled in the Linode Backup service. This will incur an additional charge. The cost for the Backup service is dependent on the Type of Linode deployed.
     * 
     */
    public Output<Boolean> backupsEnabled() {
        return this.backupsEnabled;
    }
    /**
     * The Label of the Instance Config that should be used to boot the Linode instance.  If there is only one `config`, the `label` of that `config` will be used as the `boot_config_label`. *This value can not be imported.*
     * 
     */
    @Export(name="bootConfigLabel", refs={String.class}, tree="[0]")
    private Output<String> bootConfigLabel;

    /**
     * @return The Label of the Instance Config that should be used to boot the Linode instance.  If there is only one `config`, the `label` of that `config` will be used as the `boot_config_label`. *This value can not be imported.*
     * 
     */
    public Output<String> bootConfigLabel() {
        return this.bootConfigLabel;
    }
    /**
     * If true, then the instance is kept or converted into in a running state. If false, the instance will be shutdown. If unspecified, the Linode&#39;s power status will not be managed by the Provider.
     * 
     */
    @Export(name="booted", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> booted;

    /**
     * @return If true, then the instance is kept or converted into in a running state. If false, the instance will be shutdown. If unspecified, the Linode&#39;s power status will not be managed by the Provider.
     * 
     */
    public Output<Boolean> booted() {
        return this.booted;
    }
    /**
     * Configuration profiles define the VM settings and boot behavior of the Linode Instance.
     * 
     * @deprecated
     * The embedded config is deprecated and scheduled to be removed in the next major version.Please consider migrating it  to linode_instance_config resource.
     * 
     */
    @Deprecated /* The embedded config is deprecated and scheduled to be removed in the next major version.Please consider migrating it  to linode_instance_config resource. */
    @Export(name="configs", refs={List.class,InstanceConfig.class}, tree="[0,1]")
    private Output<List<InstanceConfig>> configs;

    /**
     * @return Configuration profiles define the VM settings and boot behavior of the Linode Instance.
     * 
     */
    public Output<List<InstanceConfig>> configs() {
        return this.configs;
    }
    /**
     * @deprecated
     * The embedded disk block in linode_instance resource is deprecated and scheduled to be removed in the next major version. Please consider migrating it to be the linode_instance_disk resource.
     * 
     */
    @Deprecated /* The embedded disk block in linode_instance resource is deprecated and scheduled to be removed in the next major version. Please consider migrating it to be the linode_instance_disk resource. */
    @Export(name="disks", refs={List.class,InstanceDisk.class}, tree="[0,1]")
    private Output<List<InstanceDisk>> disks;

    public Output<List<InstanceDisk>> disks() {
        return this.disks;
    }
    /**
     * The ID of the Firewall to attach to the instance upon creation. *Changing `firewall_id` forces the creation of a new Linode Instance.*
     * 
     */
    @Export(name="firewallId", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> firewallId;

    /**
     * @return The ID of the Firewall to attach to the instance upon creation. *Changing `firewall_id` forces the creation of a new Linode Instance.*
     * 
     */
    public Output<Optional<Integer>> firewallId() {
        return Codegen.optional(this.firewallId);
    }
    /**
     * A deprecated property denoting a group label for this Linode. We recommend using the `tags` attribute instead.
     * 
     * @deprecated
     * Group label is deprecated. We recommend using tags instead.
     * 
     */
    @Deprecated /* Group label is deprecated. We recommend using tags instead. */
    @Export(name="group", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> group;

    /**
     * @return A deprecated property denoting a group label for this Linode. We recommend using the `tags` attribute instead.
     * 
     */
    public Output<Optional<String>> group() {
        return Codegen.optional(this.group);
    }
    /**
     * Whether this Instance was created with user-data.
     * 
     */
    @Export(name="hasUserData", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> hasUserData;

    /**
     * @return Whether this Instance was created with user-data.
     * 
     */
    public Output<Boolean> hasUserData() {
        return this.hasUserData;
    }
    /**
     * The Linode’s host machine, as a UUID.
     * 
     */
    @Export(name="hostUuid", refs={String.class}, tree="[0]")
    private Output<String> hostUuid;

    /**
     * @return The Linode’s host machine, as a UUID.
     * 
     */
    public Output<String> hostUuid() {
        return this.hostUuid;
    }
    /**
     * An Image ID to deploy the Disk from. Official Linode Images start with linode/, while your Images start with private/. See /images for more information on the Images available for you to use. Examples are `linode/debian12`, `linode/fedora39`, `linode/ubuntu22.04`, `linode/arch`, and `private/12345`. See all images [here](https://api.linode.com/v4/images). *Changing `image` forces the creation of a new Linode Instance.*
     * 
     */
    @Export(name="image", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> image;

    /**
     * @return An Image ID to deploy the Disk from. Official Linode Images start with linode/, while your Images start with private/. See /images for more information on the Images available for you to use. Examples are `linode/debian12`, `linode/fedora39`, `linode/ubuntu22.04`, `linode/arch`, and `private/12345`. See all images [here](https://api.linode.com/v4/images). *Changing `image` forces the creation of a new Linode Instance.*
     * 
     */
    public Output<Optional<String>> image() {
        return Codegen.optional(this.image);
    }
    /**
     * An array of Network Interfaces for this Linode to be created with. If an explicit config or disk is defined, interfaces
     * must be declared in the config block.
     * 
     */
    @Export(name="interfaces", refs={List.class,InstanceInterface.class}, tree="[0,1]")
    private Output</* @Nullable */ List<InstanceInterface>> interfaces;

    /**
     * @return An array of Network Interfaces for this Linode to be created with. If an explicit config or disk is defined, interfaces
     * must be declared in the config block.
     * 
     */
    public Output<Optional<List<InstanceInterface>>> interfaces() {
        return Codegen.optional(this.interfaces);
    }
    /**
     * A string containing the Linode&#39;s public IP address.
     * 
     */
    @Export(name="ipAddress", refs={String.class}, tree="[0]")
    private Output<String> ipAddress;

    /**
     * @return A string containing the Linode&#39;s public IP address.
     * 
     */
    public Output<String> ipAddress() {
        return this.ipAddress;
    }
    /**
     * This Linode&#39;s IPv4 Addresses. Each Linode is assigned a single public IPv4 address upon creation, and may get a single private IPv4 address if needed. You may need to open a support ticket to get additional IPv4 addresses.
     * 
     */
    @Export(name="ipv4s", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> ipv4s;

    /**
     * @return This Linode&#39;s IPv4 Addresses. Each Linode is assigned a single public IPv4 address upon creation, and may get a single private IPv4 address if needed. You may need to open a support ticket to get additional IPv4 addresses.
     * 
     */
    public Output<List<String>> ipv4s() {
        return this.ipv4s;
    }
    /**
     * This Linode&#39;s IPv6 SLAAC addresses. This address is specific to a Linode, and may not be shared.  The prefix (`/64`) is included in this attribute.
     * 
     */
    @Export(name="ipv6", refs={String.class}, tree="[0]")
    private Output<String> ipv6;

    /**
     * @return This Linode&#39;s IPv6 SLAAC addresses. This address is specific to a Linode, and may not be shared.  The prefix (`/64`) is included in this attribute.
     * 
     */
    public Output<String> ipv6() {
        return this.ipv6;
    }
    /**
     * The Linode&#39;s label is for display purposes only. If no label is provided for a Linode, a default will be assigned.
     * 
     */
    @Export(name="label", refs={String.class}, tree="[0]")
    private Output<String> label;

    /**
     * @return The Linode&#39;s label is for display purposes only. If no label is provided for a Linode, a default will be assigned.
     * 
     */
    public Output<String> label() {
        return this.label;
    }
    /**
     * Various fields related to the Linode Metadata service.
     * 
     */
    @Export(name="metadatas", refs={List.class,InstanceMetadata.class}, tree="[0,1]")
    private Output</* @Nullable */ List<InstanceMetadata>> metadatas;

    /**
     * @return Various fields related to the Linode Metadata service.
     * 
     */
    public Output<Optional<List<InstanceMetadata>>> metadatas() {
        return Codegen.optional(this.metadatas);
    }
    /**
     * The type of migration to use when updating the type or region of a Linode. (`cold`, `warm`; default `cold`)
     * 
     * * `interface` - (Optional) A list of network interfaces to be assigned to the Linode on creation. If an explicit config or disk is defined, interfaces must be declared in the `config` block.
     * 
     */
    @Export(name="migrationType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> migrationType;

    /**
     * @return The type of migration to use when updating the type or region of a Linode. (`cold`, `warm`; default `cold`)
     * 
     * * `interface` - (Optional) A list of network interfaces to be assigned to the Linode on creation. If an explicit config or disk is defined, interfaces must be declared in the `config` block.
     * 
     */
    public Output<Optional<String>> migrationType() {
        return Codegen.optional(this.migrationType);
    }
    /**
     * If true, the created Linode will have private networking enabled, allowing use of the 192.168.128.0/17 network within the Linode&#39;s region. It can be enabled on an existing Linode but it can&#39;t be disabled.
     * 
     */
    @Export(name="privateIp", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> privateIp;

    /**
     * @return If true, the created Linode will have private networking enabled, allowing use of the 192.168.128.0/17 network within the Linode&#39;s region. It can be enabled on an existing Linode but it can&#39;t be disabled.
     * 
     */
    public Output<Optional<Boolean>> privateIp() {
        return Codegen.optional(this.privateIp);
    }
    /**
     * This Linode&#39;s Private IPv4 Address, if enabled.  The regional private IP address range, 192.168.128.0/17, is shared by all Linode Instances in a region.
     * 
     */
    @Export(name="privateIpAddress", refs={String.class}, tree="[0]")
    private Output<String> privateIpAddress;

    /**
     * @return This Linode&#39;s Private IPv4 Address, if enabled.  The regional private IP address range, 192.168.128.0/17, is shared by all Linode Instances in a region.
     * 
     */
    public Output<String> privateIpAddress() {
        return this.privateIpAddress;
    }
    /**
     * This is the location where the Linode is deployed. Examples are `&#34;us-east&#34;`, `&#34;us-west&#34;`, `&#34;ap-south&#34;`, etc. See all regions [here](https://api.linode.com/v4/regions). *Changing `region` will trigger a migration of this Linode. Migration operations are typically long-running operations, so the update timeout should be adjusted accordingly.*.
     * 
     */
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output<String> region;

    /**
     * @return This is the location where the Linode is deployed. Examples are `&#34;us-east&#34;`, `&#34;us-west&#34;`, `&#34;ap-south&#34;`, etc. See all regions [here](https://api.linode.com/v4/regions). *Changing `region` will trigger a migration of this Linode. Migration operations are typically long-running operations, so the update timeout should be adjusted accordingly.*.
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * If true, changes in Linode type will attempt to upsize or downsize implicitly created disks. This must be false if explicit disks are defined. *This is an irreversible action as Linode disks cannot be automatically downsized.*
     * 
     * * `alerts.0.cpu` - (Optional) The percentage of CPU usage required to trigger an alert. If the average CPU usage over two hours exceeds this value, we&#39;ll send you an alert. If this is set to 0, the alert is disabled.
     * 
     * * `alerts.0.network_in` - (Optional) The amount of incoming traffic, in Mbit/s, required to trigger an alert. If the average incoming traffic over two hours exceeds this value, we&#39;ll send you an alert. If this is set to 0 (zero), the alert is disabled.
     * 
     * * `alerts.0.network_out` - (Optional) The amount of outbound traffic, in Mbit/s, required to trigger an alert. If the average outbound traffic over two hours exceeds this value, we&#39;ll send you an alert. If this is set to 0 (zero), the alert is disabled.
     * 
     * * `alerts.0.transfer_quota` - (Optional) The percentage of network transfer that may be used before an alert is triggered. When this value is exceeded, we&#39;ll alert you. If this is set to 0 (zero), the alert is disabled.
     * 
     * * `alerts.0.io` - (Optional) The amount of disk IO operation per second required to trigger an alert. If the average disk IO over two hours exceeds this value, we&#39;ll send you an alert. If set to 0, this alert is disabled.
     * 
     */
    @Export(name="resizeDisk", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> resizeDisk;

    /**
     * @return If true, changes in Linode type will attempt to upsize or downsize implicitly created disks. This must be false if explicit disks are defined. *This is an irreversible action as Linode disks cannot be automatically downsized.*
     * 
     * * `alerts.0.cpu` - (Optional) The percentage of CPU usage required to trigger an alert. If the average CPU usage over two hours exceeds this value, we&#39;ll send you an alert. If this is set to 0, the alert is disabled.
     * 
     * * `alerts.0.network_in` - (Optional) The amount of incoming traffic, in Mbit/s, required to trigger an alert. If the average incoming traffic over two hours exceeds this value, we&#39;ll send you an alert. If this is set to 0 (zero), the alert is disabled.
     * 
     * * `alerts.0.network_out` - (Optional) The amount of outbound traffic, in Mbit/s, required to trigger an alert. If the average outbound traffic over two hours exceeds this value, we&#39;ll send you an alert. If this is set to 0 (zero), the alert is disabled.
     * 
     * * `alerts.0.transfer_quota` - (Optional) The percentage of network transfer that may be used before an alert is triggered. When this value is exceeded, we&#39;ll alert you. If this is set to 0 (zero), the alert is disabled.
     * 
     * * `alerts.0.io` - (Optional) The amount of disk IO operation per second required to trigger an alert. If the average disk IO over two hours exceeds this value, we&#39;ll send you an alert. If set to 0, this alert is disabled.
     * 
     */
    public Output<Optional<Boolean>> resizeDisk() {
        return Codegen.optional(this.resizeDisk);
    }
    /**
     * The initial password for the `root` user account. *This value can not be imported.* *Changing `root_pass` forces the creation of a new Linode Instance.* *If omitted, a random password will be generated but will not be stored in Pulumi state.*
     * 
     */
    @Export(name="rootPass", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> rootPass;

    /**
     * @return The initial password for the `root` user account. *This value can not be imported.* *Changing `root_pass` forces the creation of a new Linode Instance.* *If omitted, a random password will be generated but will not be stored in Pulumi state.*
     * 
     */
    public Output<Optional<String>> rootPass() {
        return Codegen.optional(this.rootPass);
    }
    /**
     * A set of IPv4 addresses to be shared with the Instance. These IP addresses can be both private and public, but must be in the same region as the instance.
     * 
     * * `metadata.0.user_data` - (Optional) The base64-encoded user-defined data exposed to this instance through the Linode Metadata service. Refer to the base64encode(...) function for information on encoding content for this field.
     * 
     */
    @Export(name="sharedIpv4s", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> sharedIpv4s;

    /**
     * @return A set of IPv4 addresses to be shared with the Instance. These IP addresses can be both private and public, but must be in the same region as the instance.
     * 
     * * `metadata.0.user_data` - (Optional) The base64-encoded user-defined data exposed to this instance through the Linode Metadata service. Refer to the base64encode(...) function for information on encoding content for this field.
     * 
     */
    public Output<List<String>> sharedIpv4s() {
        return this.sharedIpv4s;
    }
    /**
     * Information about the resources available to this Linode.
     * 
     */
    @Export(name="specs", refs={InstanceSpecs.class}, tree="[0]")
    private Output<InstanceSpecs> specs;

    /**
     * @return Information about the resources available to this Linode.
     * 
     */
    public Output<InstanceSpecs> specs() {
        return this.specs;
    }
    /**
     * An object containing responses to any User Defined Fields present in the StackScript being deployed to this Linode. Only accepted if &#39;stackscript_id&#39; is given. The required values depend on the StackScript being deployed.  *This value can not be imported.* *Changing `stackscript_data` forces the creation of a new Linode Instance.*
     * 
     */
    @Export(name="stackscriptData", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,Object>> stackscriptData;

    /**
     * @return An object containing responses to any User Defined Fields present in the StackScript being deployed to this Linode. Only accepted if &#39;stackscript_id&#39; is given. The required values depend on the StackScript being deployed.  *This value can not be imported.* *Changing `stackscript_data` forces the creation of a new Linode Instance.*
     * 
     */
    public Output<Optional<Map<String,Object>>> stackscriptData() {
        return Codegen.optional(this.stackscriptData);
    }
    /**
     * The StackScript to deploy to the newly created Linode. If provided, &#39;image&#39; must also be provided, and must be an Image that is compatible with this StackScript. *This value can not be imported.* *Changing `stackscript_id` forces the creation of a new Linode Instance.*
     * 
     */
    @Export(name="stackscriptId", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> stackscriptId;

    /**
     * @return The StackScript to deploy to the newly created Linode. If provided, &#39;image&#39; must also be provided, and must be an Image that is compatible with this StackScript. *This value can not be imported.* *Changing `stackscript_id` forces the creation of a new Linode Instance.*
     * 
     */
    public Output<Optional<Integer>> stackscriptId() {
        return Codegen.optional(this.stackscriptId);
    }
    /**
     * The status of the instance, indicating the current readiness state. (`running`, `offline`, ...)
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of the instance, indicating the current readiness state. (`running`, `offline`, ...)
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * When deploying from an Image, this field is optional with a Linode API default of 512mb, otherwise it is ignored. This is used to set the swap disk size for the newly-created Linode.
     * 
     */
    @Export(name="swapSize", refs={Integer.class}, tree="[0]")
    private Output<Integer> swapSize;

    /**
     * @return When deploying from an Image, this field is optional with a Linode API default of 512mb, otherwise it is ignored. This is used to set the swap disk size for the newly-created Linode.
     * 
     */
    public Output<Integer> swapSize() {
        return this.swapSize;
    }
    /**
     * A list of tags applied to this object. Tags are case-insensitive and are for organizational purposes only.
     * 
     */
    @Export(name="tags", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> tags;

    /**
     * @return A list of tags applied to this object. Tags are case-insensitive and are for organizational purposes only.
     * 
     */
    public Output<List<String>> tags() {
        return this.tags;
    }
    /**
     * The Linode type defines the pricing, CPU, disk, and RAM specs of the instance. Examples are `&#34;g6-nanode-1&#34;`, `&#34;g6-standard-2&#34;`, `&#34;g6-highmem-16&#34;`, `&#34;g6-dedicated-16&#34;`, etc. See all types [here](https://api.linode.com/v4/linode/types).
     * 
     * ***
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> type;

    /**
     * @return The Linode type defines the pricing, CPU, disk, and RAM specs of the instance. Examples are `&#34;g6-nanode-1&#34;`, `&#34;g6-standard-2&#34;`, `&#34;g6-highmem-16&#34;`, `&#34;g6-dedicated-16&#34;`, etc. See all types [here](https://api.linode.com/v4/linode/types).
     * 
     * ***
     * 
     */
    public Output<Optional<String>> type() {
        return Codegen.optional(this.type);
    }
    /**
     * The watchdog, named Lassie, is a Shutdown Watchdog that monitors your Linode and will reboot it if it powers off unexpectedly. It works by issuing a boot job when your Linode powers off without a shutdown job being responsible. To prevent a loop, Lassie will give up if there have been more than 5 boot jobs issued within 15 minutes.
     * 
     */
    @Export(name="watchdogEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> watchdogEnabled;

    /**
     * @return The watchdog, named Lassie, is a Shutdown Watchdog that monitors your Linode and will reboot it if it powers off unexpectedly. It works by issuing a boot job when your Linode powers off without a shutdown job being responsible. To prevent a loop, Lassie will give up if there have been more than 5 boot jobs issued within 15 minutes.
     * 
     */
    public Output<Optional<Boolean>> watchdogEnabled() {
        return Codegen.optional(this.watchdogEnabled);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Instance(String name) {
        this(name, InstanceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Instance(String name, InstanceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Instance(String name, InstanceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("linode:index/instance:Instance", name, args == null ? InstanceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Instance(String name, Output<String> id, @Nullable InstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("linode:index/instance:Instance", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "rootPass",
                "stackscriptData"
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Instance get(String name, Output<String> id, @Nullable InstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Instance(name, id, state, options);
    }
}
