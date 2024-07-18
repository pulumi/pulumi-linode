// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.linode.ImageArgs;
import com.pulumi.linode.Utilities;
import com.pulumi.linode.inputs.ImageState;
import com.pulumi.linode.outputs.ImageTimeouts;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Linode Image resource.  This can be used to create, modify, and delete Linodes Images.  Linode Images are snapshots of a Linode Instance Disk which can then be used to provision more Linode Instances.  Images can be used across regions.
 * 
 * For more information, see [Linode&#39;s documentation on Images](https://www.linode.com/docs/platform/disk-images/linode-images/) and the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/post-image).
 * 
 * ## Example Usage
 * 
 * Creating an image from an existing Linode Instance and deploying another instance with that image:
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
 * import com.pulumi.linode.Image;
 * import com.pulumi.linode.ImageArgs;
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
 *         var foo = new Instance("foo", InstanceArgs.builder()
 *             .type("g6-nanode-1")
 *             .region("us-central")
 *             .image("linode/ubuntu22.04")
 *             .rootPass("insecure-p4ssw0rd!!")
 *             .build());
 * 
 *         var bar = new Image("bar", ImageArgs.builder()
 *             .label("foo-sda-image")
 *             .description("Image taken from foo")
 *             .diskId(foo.disks().applyValue(disks -> disks[0].id()))
 *             .linodeId(foo.id())
 *             .build());
 * 
 *         var barBased = new Instance("barBased", InstanceArgs.builder()
 *             .type(foo.type())
 *             .region("eu-west")
 *             .image(bar.id())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * Creating and uploading an image from a local file:
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.linode.Image;
 * import com.pulumi.linode.ImageArgs;
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
 *         var foobar = new Image("foobar", ImageArgs.builder()
 *             .label("foobar-image")
 *             .description("An image uploaded from Terraform!")
 *             .region("us-southeast")
 *             .filePath("path/to/image.img.gz")
 *             .fileHash(StdFunctions.filemd5(Filemd5Args.builder()
 *                 .input("path/to/image.img.gz")
 *                 .build()).result())
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
 * Linodes Images can be imported using the Linode Image `id`, e.g.
 * 
 * ```sh
 * $ pulumi import linode:index/image:Image myimage 1234567
 * ```
 * 
 */
@ResourceType(type="linode:index/image:Image")
public class Image extends com.pulumi.resources.CustomResource {
    /**
     * The capabilities of this Image.
     * 
     */
    @Export(name="capabilities", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> capabilities;

    /**
     * @return The capabilities of this Image.
     * 
     */
    public Output<List<String>> capabilities() {
        return this.capabilities;
    }
    /**
     * Whether this image supports cloud-init.
     * 
     */
    @Export(name="cloudInit", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> cloudInit;

    /**
     * @return Whether this image supports cloud-init.
     * 
     */
    public Output<Boolean> cloudInit() {
        return this.cloudInit;
    }
    /**
     * When this Image was created.
     * 
     */
    @Export(name="created", refs={String.class}, tree="[0]")
    private Output<String> created;

    /**
     * @return When this Image was created.
     * 
     */
    public Output<String> created() {
        return this.created;
    }
    /**
     * The name of the User who created this Image.
     * 
     */
    @Export(name="createdBy", refs={String.class}, tree="[0]")
    private Output<String> createdBy;

    /**
     * @return The name of the User who created this Image.
     * 
     */
    public Output<String> createdBy() {
        return this.createdBy;
    }
    /**
     * Whether or not this Image is deprecated. Will only be True for deprecated public Images.
     * 
     */
    @Export(name="deprecated", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> deprecated;

    /**
     * @return Whether or not this Image is deprecated. Will only be True for deprecated public Images.
     * 
     */
    public Output<Boolean> deprecated() {
        return this.deprecated;
    }
    /**
     * A detailed description of this Image.
     * 
     * ***
     * 
     * The following arguments apply to creating an image from an existing Linode Instance:
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return A detailed description of this Image.
     * 
     * ***
     * 
     * The following arguments apply to creating an image from an existing Linode Instance:
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The ID of the Linode Disk that this Image will be created from.
     * 
     */
    @Export(name="diskId", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> diskId;

    /**
     * @return The ID of the Linode Disk that this Image will be created from.
     * 
     */
    public Output<Optional<Integer>> diskId() {
        return Codegen.optional(this.diskId);
    }
    /**
     * Only Images created automatically (from a deleted Linode; type=automatic) will expire.
     * 
     */
    @Export(name="expiry", refs={String.class}, tree="[0]")
    private Output<String> expiry;

    /**
     * @return Only Images created automatically (from a deleted Linode; type=automatic) will expire.
     * 
     */
    public Output<String> expiry() {
        return this.expiry;
    }
    /**
     * The MD5 hash of the file to be uploaded. This is used to trigger file updates.
     * 
     */
    @Export(name="fileHash", refs={String.class}, tree="[0]")
    private Output<String> fileHash;

    /**
     * @return The MD5 hash of the file to be uploaded. This is used to trigger file updates.
     * 
     */
    public Output<String> fileHash() {
        return this.fileHash;
    }
    /**
     * The path of the image file to be uploaded.
     * 
     */
    @Export(name="filePath", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> filePath;

    /**
     * @return The path of the image file to be uploaded.
     * 
     */
    public Output<Optional<String>> filePath() {
        return Codegen.optional(this.filePath);
    }
    /**
     * True if the Image is public.
     * 
     */
    @Export(name="isPublic", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> isPublic;

    /**
     * @return True if the Image is public.
     * 
     */
    public Output<Boolean> isPublic() {
        return this.isPublic;
    }
    /**
     * A short description of the Image. Labels cannot contain special characters.
     * 
     */
    @Export(name="label", refs={String.class}, tree="[0]")
    private Output<String> label;

    /**
     * @return A short description of the Image. Labels cannot contain special characters.
     * 
     */
    public Output<String> label() {
        return this.label;
    }
    /**
     * The ID of the Linode that this Image will be created from.
     * 
     * ***
     * 
     * &gt; **NOTICE:** Uploading images is currently in beta. Ensure `LINODE_API_VERSION` is set to `v4beta` in order to use this functionality.
     * 
     * The following arguments apply to uploading an image:
     * 
     */
    @Export(name="linodeId", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> linodeId;

    /**
     * @return The ID of the Linode that this Image will be created from.
     * 
     * ***
     * 
     * &gt; **NOTICE:** Uploading images is currently in beta. Ensure `LINODE_API_VERSION` is set to `v4beta` in order to use this functionality.
     * 
     * The following arguments apply to uploading an image:
     * 
     */
    public Output<Optional<Integer>> linodeId() {
        return Codegen.optional(this.linodeId);
    }
    /**
     * The region of the image. See all regions [here](https://api.linode.com/v4/regions).
     * 
     */
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> region;

    /**
     * @return The region of the image. See all regions [here](https://api.linode.com/v4/regions).
     * 
     */
    public Output<Optional<String>> region() {
        return Codegen.optional(this.region);
    }
    /**
     * The minimum size this Image needs to deploy. Size is in MB.
     * 
     */
    @Export(name="size", refs={Integer.class}, tree="[0]")
    private Output<Integer> size;

    /**
     * @return The minimum size this Image needs to deploy. Size is in MB.
     * 
     */
    public Output<Integer> size() {
        return this.size;
    }
    /**
     * The current status of this Image.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The current status of this Image.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    @Export(name="timeouts", refs={ImageTimeouts.class}, tree="[0]")
    private Output</* @Nullable */ ImageTimeouts> timeouts;

    public Output<Optional<ImageTimeouts>> timeouts() {
        return Codegen.optional(this.timeouts);
    }
    /**
     * How the Image was created. &#39;Manual&#39; Images can be created at any time. &#39;Automatic&#39; images are created automatically from a deleted Linode.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return How the Image was created. &#39;Manual&#39; Images can be created at any time. &#39;Automatic&#39; images are created automatically from a deleted Linode.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * The upstream distribution vendor. Nil for private Images.
     * 
     */
    @Export(name="vendor", refs={String.class}, tree="[0]")
    private Output<String> vendor;

    /**
     * @return The upstream distribution vendor. Nil for private Images.
     * 
     */
    public Output<String> vendor() {
        return this.vendor;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Image(String name) {
        this(name, ImageArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Image(String name, ImageArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Image(String name, ImageArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("linode:index/image:Image", name, args == null ? ImageArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Image(String name, Output<String> id, @Nullable ImageState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("linode:index/image:Image", name, state, makeResourceOptions(options, id));
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
    public static Image get(String name, Output<String> id, @Nullable ImageState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Image(name, id, state, options);
    }
}
