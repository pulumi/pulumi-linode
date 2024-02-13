// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.linode.InstanceDiskArgs;
import com.pulumi.linode.Utilities;
import com.pulumi.linode.inputs.InstanceDiskState;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Linode Instance Disk resource. This can be used to create, modify, and delete Linode Instance Disks.
 * 
 * **NOTE:** Deleting a disk will shut down the attached instance if the instance is booted. If the disk was not in use by the booted configuration profile, the instance will be automatically rebooted.
 * 
 * ## Example Usage
 * 
 * Creating a simple 512 MB Linode Instance Disk:
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.linode.Instance;
 * import com.pulumi.linode.InstanceArgs;
 * import com.pulumi.linode.InstanceDisk;
 * import com.pulumi.linode.InstanceDiskArgs;
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
 *         var my_instance = new Instance(&#34;my-instance&#34;, InstanceArgs.builder()        
 *             .label(&#34;my-instance&#34;)
 *             .type(&#34;g6-standard-1&#34;)
 *             .region(&#34;us-southeast&#34;)
 *             .build());
 * 
 *         var boot = new InstanceDisk(&#34;boot&#34;, InstanceDiskArgs.builder()        
 *             .label(&#34;boot&#34;)
 *             .linodeId(my_instance.id())
 *             .size(512)
 *             .filesystem(&#34;ext4&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * Creating a complex bootable Instance Disk:
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.linode.Instance;
 * import com.pulumi.linode.InstanceArgs;
 * import com.pulumi.linode.InstanceDisk;
 * import com.pulumi.linode.InstanceDiskArgs;
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
 *         var my_instance = new Instance(&#34;my-instance&#34;, InstanceArgs.builder()        
 *             .label(&#34;my-instance&#34;)
 *             .type(&#34;g6-standard-1&#34;)
 *             .region(&#34;us-southeast&#34;)
 *             .build());
 * 
 *         var boot = new InstanceDisk(&#34;boot&#34;, InstanceDiskArgs.builder()        
 *             .label(&#34;boot&#34;)
 *             .linodeId(my_instance.id())
 *             .size(my_instance.specs().applyValue(specs -&gt; specs.disk()))
 *             .image(&#34;linode/ubuntu22.04&#34;)
 *             .rootPass(&#34;myc00lpass!&#34;)
 *             .authorizedKeys(&#34;ssh-rsa AAAA...Gw== user@example.local&#34;)
 *             .stackscriptId(12345)
 *             .stackscriptData(Map.of(&#34;my_var&#34;, &#34;my_value&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Instance Disks can be imported using the `linode_id` followed by the Instance Disk `id` separated by a comma, e.g.
 * 
 * ```sh
 * $ pulumi import linode:index/instanceDisk:InstanceDisk my-disk 1234567,7654321
 * ```
 * 
 */
@ResourceType(type="linode:index/instanceDisk:InstanceDisk")
public class InstanceDisk extends com.pulumi.resources.CustomResource {
    /**
     * A list of public SSH keys that will be automatically appended to the root user’s ~/.ssh/authorized_keys file when deploying from an Image. (Requires `image`)
     * 
     */
    @Export(name="authorizedKeys", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> authorizedKeys;

    /**
     * @return A list of public SSH keys that will be automatically appended to the root user’s ~/.ssh/authorized_keys file when deploying from an Image. (Requires `image`)
     * 
     */
    public Output<Optional<List<String>>> authorizedKeys() {
        return Codegen.optional(this.authorizedKeys);
    }
    /**
     * A list of usernames. If the usernames have associated SSH keys, the keys will be appended to the root user&#39;s ~/.ssh/authorized_keys file. (Requires `image`)
     * 
     */
    @Export(name="authorizedUsers", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> authorizedUsers;

    /**
     * @return A list of usernames. If the usernames have associated SSH keys, the keys will be appended to the root user&#39;s ~/.ssh/authorized_keys file. (Requires `image`)
     * 
     */
    public Output<Optional<List<String>>> authorizedUsers() {
        return Codegen.optional(this.authorizedUsers);
    }
    /**
     * When this disk was created.
     * 
     */
    @Export(name="created", refs={String.class}, tree="[0]")
    private Output<String> created;

    /**
     * @return When this disk was created.
     * 
     */
    public Output<String> created() {
        return this.created;
    }
    /**
     * The filesystem of this disk. (`raw`, `swap`, `ext3`, `ext4`, `initrd`)
     * 
     */
    @Export(name="filesystem", refs={String.class}, tree="[0]")
    private Output<String> filesystem;

    /**
     * @return The filesystem of this disk. (`raw`, `swap`, `ext3`, `ext4`, `initrd`)
     * 
     */
    public Output<String> filesystem() {
        return this.filesystem;
    }
    /**
     * An Image ID to deploy the Linode Disk from.
     * 
     */
    @Export(name="image", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> image;

    /**
     * @return An Image ID to deploy the Linode Disk from.
     * 
     */
    public Output<Optional<String>> image() {
        return Codegen.optional(this.image);
    }
    /**
     * The Disk&#39;s label for display purposes only.
     * 
     */
    @Export(name="label", refs={String.class}, tree="[0]")
    private Output<String> label;

    /**
     * @return The Disk&#39;s label for display purposes only.
     * 
     */
    public Output<String> label() {
        return this.label;
    }
    /**
     * The ID of the Linode to create this Disk under.
     * 
     */
    @Export(name="linodeId", refs={Integer.class}, tree="[0]")
    private Output<Integer> linodeId;

    /**
     * @return The ID of the Linode to create this Disk under.
     * 
     */
    public Output<Integer> linodeId() {
        return this.linodeId;
    }
    /**
     * The root user’s password on a newly-created Linode Disk when deploying from an Image. (Requires `image`)
     * 
     */
    @Export(name="rootPass", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> rootPass;

    /**
     * @return The root user’s password on a newly-created Linode Disk when deploying from an Image. (Requires `image`)
     * 
     */
    public Output<Optional<String>> rootPass() {
        return Codegen.optional(this.rootPass);
    }
    /**
     * The size of the Disk in MB. **NOTE:** Resizing a disk will trigger a Linode reboot.
     * 
     * ***
     * 
     */
    @Export(name="size", refs={Integer.class}, tree="[0]")
    private Output<Integer> size;

    /**
     * @return The size of the Disk in MB. **NOTE:** Resizing a disk will trigger a Linode reboot.
     * 
     * ***
     * 
     */
    public Output<Integer> size() {
        return this.size;
    }
    /**
     * An object containing responses to any User Defined Fields present in the StackScript being deployed to this Disk. Only accepted if `stackscript_id` is given. (Requires `image`)
     * 
     */
    @Export(name="stackscriptData", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,Object>> stackscriptData;

    /**
     * @return An object containing responses to any User Defined Fields present in the StackScript being deployed to this Disk. Only accepted if `stackscript_id` is given. (Requires `image`)
     * 
     */
    public Output<Optional<Map<String,Object>>> stackscriptData() {
        return Codegen.optional(this.stackscriptData);
    }
    /**
     * A StackScript ID that will cause the referenced StackScript to be run during deployment of this Disk. (Requires `image`)
     * 
     */
    @Export(name="stackscriptId", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> stackscriptId;

    /**
     * @return A StackScript ID that will cause the referenced StackScript to be run during deployment of this Disk. (Requires `image`)
     * 
     */
    public Output<Optional<Integer>> stackscriptId() {
        return Codegen.optional(this.stackscriptId);
    }
    /**
     * A brief description of this Disk&#39;s current state.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return A brief description of this Disk&#39;s current state.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * When this disk was last updated.
     * 
     */
    @Export(name="updated", refs={String.class}, tree="[0]")
    private Output<String> updated;

    /**
     * @return When this disk was last updated.
     * 
     */
    public Output<String> updated() {
        return this.updated;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public InstanceDisk(String name) {
        this(name, InstanceDiskArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public InstanceDisk(String name, InstanceDiskArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public InstanceDisk(String name, InstanceDiskArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("linode:index/instanceDisk:InstanceDisk", name, args == null ? InstanceDiskArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private InstanceDisk(String name, Output<String> id, @Nullable InstanceDiskState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("linode:index/instanceDisk:InstanceDisk", name, state, makeResourceOptions(options, id));
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
    public static InstanceDisk get(String name, Output<String> id, @Nullable InstanceDiskState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new InstanceDisk(name, id, state, options);
    }
}
