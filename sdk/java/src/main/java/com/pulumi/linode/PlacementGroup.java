// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.linode.PlacementGroupArgs;
import com.pulumi.linode.Utilities;
import com.pulumi.linode.inputs.PlacementGroupState;
import com.pulumi.linode.outputs.PlacementGroupMember;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Manages a Linode Placement Group.
 * For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/post-placement-group).
 * 
 * **NOTE: Placement Groups may not currently be available to all users.**
 * 
 * ## Example Usage
 * 
 * Create a Placement Group with the local anti-affinity policy:
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.linode.PlacementGroup;
 * import com.pulumi.linode.PlacementGroupArgs;
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
 *         var test = new PlacementGroup("test", PlacementGroupArgs.builder()
 *             .label("my-placement-group")
 *             .region("us-mia")
 *             .placementGroupType("anti_affinity:local")
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
 * Placement Groups be imported using their unique `id`, e.g.
 * 
 * ```sh
 * $ pulumi import linode:index/placementGroup:PlacementGroup mygroup 1234567
 * ```
 * 
 */
@ResourceType(type="linode:index/placementGroup:PlacementGroup")
public class PlacementGroup extends com.pulumi.resources.CustomResource {
    /**
     * Whether this Linode is currently compliant with the group&#39;s placement group type.
     * 
     */
    @Export(name="isCompliant", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> isCompliant;

    /**
     * @return Whether this Linode is currently compliant with the group&#39;s placement group type.
     * 
     */
    public Output<Boolean> isCompliant() {
        return this.isCompliant;
    }
    /**
     * The label of the Placement Group. This field can only contain ASCII letters, digits and dashes.
     * 
     */
    @Export(name="label", refs={String.class}, tree="[0]")
    private Output<String> label;

    /**
     * @return The label of the Placement Group. This field can only contain ASCII letters, digits and dashes.
     * 
     */
    public Output<String> label() {
        return this.label;
    }
    /**
     * A set of Linodes currently assigned to this Placement Group.
     * 
     */
    @Export(name="members", refs={List.class,PlacementGroupMember.class}, tree="[0,1]")
    private Output<List<PlacementGroupMember>> members;

    /**
     * @return A set of Linodes currently assigned to this Placement Group.
     * 
     */
    public Output<List<PlacementGroupMember>> members() {
        return this.members;
    }
    /**
     * Whether Linodes must be able to become compliant during assignment. (Default `strict`)
     * 
     */
    @Export(name="placementGroupPolicy", refs={String.class}, tree="[0]")
    private Output<String> placementGroupPolicy;

    /**
     * @return Whether Linodes must be able to become compliant during assignment. (Default `strict`)
     * 
     */
    public Output<String> placementGroupPolicy() {
        return this.placementGroupPolicy;
    }
    /**
     * The placement group type to use when placing Linodes in this group.
     * 
     */
    @Export(name="placementGroupType", refs={String.class}, tree="[0]")
    private Output<String> placementGroupType;

    /**
     * @return The placement group type to use when placing Linodes in this group.
     * 
     */
    public Output<String> placementGroupType() {
        return this.placementGroupType;
    }
    /**
     * The region of the Placement Group.
     * 
     */
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output<String> region;

    /**
     * @return The region of the Placement Group.
     * 
     */
    public Output<String> region() {
        return this.region;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PlacementGroup(String name) {
        this(name, PlacementGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PlacementGroup(String name, PlacementGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PlacementGroup(String name, PlacementGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("linode:index/placementGroup:PlacementGroup", name, args == null ? PlacementGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PlacementGroup(String name, Output<String> id, @Nullable PlacementGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("linode:index/placementGroup:PlacementGroup", name, state, makeResourceOptions(options, id));
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
    public static PlacementGroup get(String name, Output<String> id, @Nullable PlacementGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PlacementGroup(name, id, state, options);
    }
}
