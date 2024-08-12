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
import com.pulumi.linode.outputs.InstancePlacementGroup;
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
 * For more information, see [Getting Started with Linode](https://linode.com/docs/getting-started/) and the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/post-linode-instance).
 * 
 * ## Example Usage
 * 
 * ### Simple Linode Instance
 * 
 * The following example shows how one might use this resource to configure a Linode instance.
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
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
 * public class App }{{@code
 *     public static void main(String[] args) }{{@code
 *         Pulumi.run(App::stack);
 *     }}{@code
 * 
 *     public static void stack(Context ctx) }{{@code
 *         var web = new Instance("web", InstanceArgs.builder()
 *             .label("simple_instance")
 *             .image("linode/ubuntu22.04")
 *             .region("us-central")
 *             .type("g6-standard-1")
 *             .authorizedKeys("ssh-rsa AAAA...Gw== user}{@literal @}{@code example.local")
 *             .rootPass("this-is-not-a-safe-password")
 *             .tags("foo")
 *             .swapSize(256)
 *             .privateIp(true)
 *             .build());
 * 
 *     }}{@code
 * }}{@code
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Linode Instance with Explicit Networking Interfaces
 * 
 * You can add a VPC or VLAN interface directly to a Linode instance resource.
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
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
 * public class App }{{@code
 *     public static void main(String[] args) }{{@code
 *         Pulumi.run(App::stack);
 *     }}{@code
 * 
 *     public static void stack(Context ctx) }{{@code
 *         var web = new Instance("web", InstanceArgs.builder()
 *             .label("simple_instance")
 *             .image("linode/ubuntu22.04")
 *             .region("us-central")
 *             .type("g6-standard-1")
 *             .authorizedKeys("ssh-rsa AAAA...Gw== user}{@literal @}{@code example.local")
 *             .rootPass("this-is-not-a-safe-password")
 *             .interfaces(            
 *                 InstanceInterfaceArgs.builder()
 *                     .purpose("public")
 *                     .build(),
 *                 InstanceInterfaceArgs.builder()
 *                     .purpose("vpc")
 *                     .subnetId(123)
 *                     .ipv4(InstanceInterfaceIpv4Args.builder()
 *                         .vpc("10.0.4.250")
 *                         .build())
 *                     .build())
 *             .tags("foo")
 *             .swapSize(256)
 *             .privateIp(true)
 *             .build());
 * 
 *     }}{@code
 * }}{@code
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Linode Instance with Explicit Configs and Disks
 * 
 * Using explicit Instance Configs and Disks it is possible to create a more elaborate Linode instance. This can be used to provision multiple disks and volumes during Instance creation.
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.linode.LinodeFunctions;
 * import com.pulumi.linode.Instance;
 * import com.pulumi.linode.InstanceArgs;
 * import com.pulumi.linode.Volume;
 * import com.pulumi.linode.VolumeArgs;
 * import com.pulumi.linode.InstanceDisk;
 * import com.pulumi.linode.InstanceDiskArgs;
 * import com.pulumi.linode.instanceConfig;
 * import com.pulumi.linode.InstanceConfigArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App }{{@code
 *     public static void main(String[] args) }{{@code
 *         Pulumi.run(App::stack);
 *     }}{@code
 * 
 *     public static void stack(Context ctx) }{{@code
 *         final var me = LinodeFunctions.getProfile();
 * 
 *         var web = new Instance("web", InstanceArgs.builder()
 *             .label("complex_instance")
 *             .tags("foo")
 *             .region("us-central")
 *             .type("g6-nanode-1")
 *             .privateIp(true)
 *             .build());
 * 
 *         var webVolume = new Volume("webVolume", VolumeArgs.builder()
 *             .label("web_volume")
 *             .size(20)
 *             .region("us-central")
 *             .build());
 * 
 *         var bootDisk = new InstanceDisk("bootDisk", InstanceDiskArgs.builder()
 *             .label("boot")
 *             .linodeId(web.id())
 *             .size(3000)
 *             .image("linode/ubuntu22.04")
 *             .authorizedKeys("ssh-rsa AAAA...Gw== user}{@literal @}{@code example.local")
 *             .authorizedUsers(me.applyValue(getProfileResult -> getProfileResult.username()))
 *             .rootPass("terr4form-test")
 *             .build());
 * 
 *         var bootConfig = new InstanceConfig("bootConfig", InstanceConfigArgs.builder()
 *             .label("boot_config")
 *             .linodeId(web.id())
 *             .devices(            
 *                 %!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference),
 *                 %!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference))
 *             .rootDevice("/dev/sda")
 *             .kernel("linode/latest-64bit")
 *             .booted(true)
 *             .build());
 * 
 *     }}{@code
 * }}{@code
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Linode Instance Assigned to a Placement Group
 * 
 * **NOTE: Placement Groups may not currently be available to all users.**
 * 
 * The following example shows how one might use this resource to configure a Linode instance assigned to a
 * Placement Group.
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.linode.Instance;
 * import com.pulumi.linode.InstanceArgs;
 * import com.pulumi.linode.inputs.InstancePlacementGroupArgs;
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
 *         var my_instance = new Instance("my-instance", InstanceArgs.builder()
 *             .label("my-instance")
 *             .region("us-mia")
 *             .type("g6-standard-1")
 *             .placementGroup(InstancePlacementGroupArgs.builder()
 *                 .id(12345)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Linodes Instances can be imported using the Linode `id`, e.g.
 * 
 * ```sh
 * $ pulumi import linode:index/instance:Instance mylinode 1234567
 * ```
 * 
 * When importing an instance, all `disk` and `config` values must be represented.
 * 
 * Imported disks must include their `label` value.  **Any disk that is not precisely represented may be removed resulting in data loss.**
 * 
 * Imported configs should include all `devices`, and must include `label`, `kernel`, and the `root_device`.  The instance must include a `boot_config_label` referring to the correct configuration profile.
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
     * A list of SSH public keys to deploy for the root user on the newly created Linode. Only accepted if &#39;image&#39; is provided.
     * 
     */
    @Export(name="authorizedKeys", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> authorizedKeys;

    /**
     * @return A list of SSH public keys to deploy for the root user on the newly created Linode. Only accepted if &#39;image&#39; is provided.
     * 
     */
    public Output<Optional<List<String>>> authorizedKeys() {
        return Codegen.optional(this.authorizedKeys);
    }
    /**
     * A list of Linode usernames. If the usernames have associated SSH keys, the keys will be appended to the `root` user&#39;s
     * `~/.ssh/authorized_keys` file automatically. Only accepted if &#39;image&#39; is provided.
     * 
     */
    @Export(name="authorizedUsers", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> authorizedUsers;

    /**
     * @return A list of Linode usernames. If the usernames have associated SSH keys, the keys will be appended to the `root` user&#39;s
     * `~/.ssh/authorized_keys` file automatically. Only accepted if &#39;image&#39; is provided.
     * 
     */
    public Output<Optional<List<String>>> authorizedUsers() {
        return Codegen.optional(this.authorizedUsers);
    }
    /**
     * A Backup ID from another Linode&#39;s available backups. Your User must have read_write access to that Linode, the Backup
     * must have a status of successful, and the Linode must be deployed to the same region as the Backup. See
     * /linode/instances/{linodeId}/backups for a Linode&#39;s available backups. This field and the image field are mutually
     * exclusive.
     * 
     */
    @Export(name="backupId", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> backupId;

    /**
     * @return A Backup ID from another Linode&#39;s available backups. Your User must have read_write access to that Linode, the Backup
     * must have a status of successful, and the Linode must be deployed to the same region as the Backup. See
     * /linode/instances/{linodeId}/backups for a Linode&#39;s available backups. This field and the image field are mutually
     * exclusive.
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
     * The Label of the Instance Config that should be used to boot the Linode instance.
     * 
     */
    @Export(name="bootConfigLabel", refs={String.class}, tree="[0]")
    private Output<String> bootConfigLabel;

    /**
     * @return The Label of the Instance Config that should be used to boot the Linode instance.
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
     * The embedded disk block in linode.Instance resource is deprecated and scheduled to be removed in the next major version. Please consider migrating it to be the linode.InstanceDisk resource.
     * 
     */
    @Deprecated /* The embedded disk block in linode.Instance resource is deprecated and scheduled to be removed in the next major version. Please consider migrating it to be the linode.InstanceDisk resource. */
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
     * An Image ID to deploy the Disk from. Official Linode Images start with linode/, while your Images start with private/.
     * See /images for more information on the Images available for you to use.
     * 
     */
    @Export(name="image", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> image;

    /**
     * @return An Image ID to deploy the Disk from. Official Linode Images start with linode/, while your Images start with private/.
     * See /images for more information on the Images available for you to use.
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
     * Information about the Placement Group this Linode is assigned to. NOTE: Placement Groups may not currently be available to all users.
     * 
     */
    @Export(name="placementGroup", refs={InstancePlacementGroup.class}, tree="[0]")
    private Output</* @Nullable */ InstancePlacementGroup> placementGroup;

    /**
     * @return Information about the Placement Group this Linode is assigned to. NOTE: Placement Groups may not currently be available to all users.
     * 
     */
    public Output<Optional<InstancePlacementGroup>> placementGroup() {
        return Codegen.optional(this.placementGroup);
    }
    /**
     * If true, changes to the Linode&#39;s assigned Placement Group will be ignored. This is necessary when using this resource in conjunction with the linode.PlacementGroupAssignment resource.
     * 
     */
    @Export(name="placementGroupExternallyManaged", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> placementGroupExternallyManaged;

    /**
     * @return If true, changes to the Linode&#39;s assigned Placement Group will be ignored. This is necessary when using this resource in conjunction with the linode.PlacementGroupAssignment resource.
     * 
     */
    public Output<Optional<Boolean>> placementGroupExternallyManaged() {
        return Codegen.optional(this.placementGroupExternallyManaged);
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
     * The password that will be initially assigned to the &#39;root&#39; user account.
     * 
     */
    @Export(name="rootPass", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> rootPass;

    /**
     * @return The password that will be initially assigned to the &#39;root&#39; user account.
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
     * * `placement_group.0.id` - (Optional) The ID of the Placement Group to assign this Linode to.
     * 
     */
    @Export(name="sharedIpv4s", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> sharedIpv4s;

    /**
     * @return A set of IPv4 addresses to be shared with the Instance. These IP addresses can be both private and public, but must be in the same region as the instance.
     * 
     * * `metadata.0.user_data` - (Optional) The base64-encoded user-defined data exposed to this instance through the Linode Metadata service. Refer to the base64encode(...) function for information on encoding content for this field.
     * 
     * * `placement_group.0.id` - (Optional) The ID of the Placement Group to assign this Linode to.
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
     * An object containing responses to any User Defined Fields present in the StackScript being deployed to this Linode. Only
     * accepted if &#39;stackscript_id&#39; is given. The required values depend on the StackScript being deployed.
     * 
     */
    @Export(name="stackscriptData", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,Object>> stackscriptData;

    /**
     * @return An object containing responses to any User Defined Fields present in the StackScript being deployed to this Linode. Only
     * accepted if &#39;stackscript_id&#39; is given. The required values depend on the StackScript being deployed.
     * 
     */
    public Output<Optional<Map<String,Object>>> stackscriptData() {
        return Codegen.optional(this.stackscriptData);
    }
    /**
     * The StackScript to deploy to the newly created Linode. If provided, &#39;image&#39; must also be provided, and must be an Image
     * that is compatible with this StackScript.
     * 
     */
    @Export(name="stackscriptId", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> stackscriptId;

    /**
     * @return The StackScript to deploy to the newly created Linode. If provided, &#39;image&#39; must also be provided, and must be an Image
     * that is compatible with this StackScript.
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
     * When deploying from an Image, this field is optional with a Linode API default of 512mb, otherwise it is ignored. This
     * is used to set the swap disk size for the newly-created Linode.
     * 
     */
    @Export(name="swapSize", refs={Integer.class}, tree="[0]")
    private Output<Integer> swapSize;

    /**
     * @return When deploying from an Image, this field is optional with a Linode API default of 512mb, otherwise it is ignored. This
     * is used to set the swap disk size for the newly-created Linode.
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
    public Instance(java.lang.String name) {
        this(name, InstanceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Instance(java.lang.String name, InstanceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Instance(java.lang.String name, InstanceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("linode:index/instance:Instance", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Instance(java.lang.String name, Output<java.lang.String> id, @Nullable InstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("linode:index/instance:Instance", name, state, makeResourceOptions(options, id), false);
    }

    private static InstanceArgs makeArgs(InstanceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? InstanceArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
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
    public static Instance get(java.lang.String name, Output<java.lang.String> id, @Nullable InstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Instance(name, id, state, options);
    }
}
