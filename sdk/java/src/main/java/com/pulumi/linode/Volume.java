// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.linode.Utilities;
import com.pulumi.linode.VolumeArgs;
import com.pulumi.linode.inputs.VolumeState;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Linode Volume resource.  This can be used to create, modify, and delete Linodes Block Storage Volumes.  Block Storage Volumes are removable storage disks that persist outside the life-cycle of Linode Instances. These volumes can be attached to and detached from Linode instances throughout a region.
 * 
 * For more information, see [How to Use Block Storage with Your Linode](https://www.linode.com/docs/platform/block-storage/how-to-use-block-storage-with-your-linode/) and the [Linode APIv4 docs](https://developers.linode.com/api/v4#operation/createVolume).
 * 
 * ## Example Usage
 * 
 * The following example shows how one might use this resource to configure a Block Storage Volume attached to a Linode Instance.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.linode.Instance;
 * import com.pulumi.linode.InstanceArgs;
 * import com.pulumi.linode.Volume;
 * import com.pulumi.linode.VolumeArgs;
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
 *         var foobaz = new Instance(&#34;foobaz&#34;, InstanceArgs.builder()        
 *             .rootPass(&#34;3X4mp13&#34;)
 *             .type(&#34;g6-nanode-1&#34;)
 *             .region(&#34;us-west&#34;)
 *             .tags(&#34;foobaz&#34;)
 *             .build());
 * 
 *         var foobar = new Volume(&#34;foobar&#34;, VolumeArgs.builder()        
 *             .label(&#34;foo-volume&#34;)
 *             .region(foobaz.region())
 *             .linodeId(foobaz.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * Volumes can also be attached using the Linode Instance config device map.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.linode.Instance;
 * import com.pulumi.linode.InstanceArgs;
 * import com.pulumi.linode.inputs.InstanceConfigArgs;
 * import com.pulumi.linode.inputs.InstanceConfigDevicesArgs;
 * import com.pulumi.linode.inputs.InstanceConfigDevicesSdaArgs;
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
 *         var foo = new Instance(&#34;foo&#34;, InstanceArgs.builder()        
 *             .configs(InstanceConfigArgs.builder()
 *                 .devices(InstanceConfigDevicesArgs.builder()
 *                     .sda(InstanceConfigDevicesSdaArgs.builder()
 *                         .volumeId(&#34;123&#34;)
 *                         .build())
 *                     .build())
 *                 .kernel(&#34;linode/latest-64bit&#34;)
 *                 .label(&#34;boot-existing-volume&#34;)
 *                 .build())
 *             .region(&#34;us-east&#34;)
 *             .type(&#34;g6-nanode-1&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * Volumes may also be cloned from existing volumes.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.linode.Volume;
 * import com.pulumi.linode.VolumeArgs;
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
 *         var foobar = new Volume(&#34;foobar&#34;, VolumeArgs.builder()        
 *             .label(&#34;my-cloned-volume&#34;)
 *             .sourceVolumeId(12345)
 *             .build());
 * 
 *     }
 * }
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
 */
@ResourceType(type="linode:index/volume:Volume")
public class Volume extends com.pulumi.resources.CustomResource {
    /**
     * The full filesystem path for the Volume based on the Volume&#39;s label. The path is &#34;/dev/disk/by-id/scsi-0Linode_Volume_&#34; + the Volume label
     * 
     */
    @Export(name="filesystemPath", refs={String.class}, tree="[0]")
    private Output<String> filesystemPath;

    /**
     * @return The full filesystem path for the Volume based on the Volume&#39;s label. The path is &#34;/dev/disk/by-id/scsi-0Linode_Volume_&#34; + the Volume label
     * 
     */
    public Output<String> filesystemPath() {
        return this.filesystemPath;
    }
    /**
     * The label of the Linode Volume
     * 
     */
    @Export(name="label", refs={String.class}, tree="[0]")
    private Output<String> label;

    /**
     * @return The label of the Linode Volume
     * 
     */
    public Output<String> label() {
        return this.label;
    }
    /**
     * The ID of a Linode Instance where the Volume should be attached.
     * 
     */
    @Export(name="linodeId", refs={Integer.class}, tree="[0]")
    private Output<Integer> linodeId;

    /**
     * @return The ID of a Linode Instance where the Volume should be attached.
     * 
     */
    public Output<Integer> linodeId() {
        return this.linodeId;
    }
    /**
     * The region where this volume will be deployed.  Examples are `&#34;us-east&#34;`, `&#34;us-west&#34;`, `&#34;ap-south&#34;`, etc. See all regions [here](https://api.linode.com/v4/regions). This field is optional for cloned volumes. *Changing `region` forces the creation of a new Linode Volume.*.
     * 
     * ***
     * 
     */
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output<String> region;

    /**
     * @return The region where this volume will be deployed.  Examples are `&#34;us-east&#34;`, `&#34;us-west&#34;`, `&#34;ap-south&#34;`, etc. See all regions [here](https://api.linode.com/v4/regions). This field is optional for cloned volumes. *Changing `region` forces the creation of a new Linode Volume.*.
     * 
     * ***
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * Size of the Volume in GB.
     * 
     */
    @Export(name="size", refs={Integer.class}, tree="[0]")
    private Output<Integer> size;

    /**
     * @return Size of the Volume in GB.
     * 
     */
    public Output<Integer> size() {
        return this.size;
    }
    /**
     * The ID of a Linode Volume to clone. NOTE: Cloned volumes must be in the same region as the source volume.
     * 
     */
    @Export(name="sourceVolumeId", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> sourceVolumeId;

    /**
     * @return The ID of a Linode Volume to clone. NOTE: Cloned volumes must be in the same region as the source volume.
     * 
     */
    public Output<Optional<Integer>> sourceVolumeId() {
        return Codegen.optional(this.sourceVolumeId);
    }
    /**
     * The status of the Linode Volume. (`creating`, `active`, `resizing`, `contact_support`)
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of the Linode Volume. (`creating`, `active`, `resizing`, `contact_support`)
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * A list of tags applied to this object. Tags are for organizational purposes only.
     * 
     */
    @Export(name="tags", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> tags;

    /**
     * @return A list of tags applied to this object. Tags are for organizational purposes only.
     * 
     */
    public Output<Optional<List<String>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Volume(String name) {
        this(name, VolumeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Volume(String name, VolumeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Volume(String name, VolumeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("linode:index/volume:Volume", name, args == null ? VolumeArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Volume(String name, Output<String> id, @Nullable VolumeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("linode:index/volume:Volume", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static Volume get(String name, Output<String> id, @Nullable VolumeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Volume(name, id, state, options);
    }
}
