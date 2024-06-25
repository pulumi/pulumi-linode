// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.linode.PlacementGroupAssignmentArgs;
import com.pulumi.linode.Utilities;
import com.pulumi.linode.inputs.PlacementGroupAssignmentState;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * **NOTE: Placement Groups may not currently be available to all users.**
 * 
 * Manages a single assignment between a Linode and a Placement Group.
 * 
 * To prevent update conflicts, Linodes managed through the `linode.Instance` resource should specify `placement_group_externally_managed`:
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
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var my_instance = new Instance("my-instance", InstanceArgs.builder()
 *             .placementGroupExternallyManaged(true)
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Example Usage
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
 * import com.pulumi.linode.Instance;
 * import com.pulumi.linode.InstanceArgs;
 * import com.pulumi.linode.PlacementGroupAssignment;
 * import com.pulumi.linode.PlacementGroupAssignmentArgs;
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
 *         var my_pg = new PlacementGroup("my-pg", PlacementGroupArgs.builder()
 *             .label("my-pg")
 *             .region("us-east")
 *             .affinityType("anti_affinity:local")
 *             .build());
 * 
 *         var my_inst = new Instance("my-inst", InstanceArgs.builder()
 *             .label("my-inst")
 *             .region("us-east")
 *             .type("g6-nanode-1")
 *             .placementGroupExternallyManaged(true)
 *             .build());
 * 
 *         var my_assignment = new PlacementGroupAssignment("my-assignment", PlacementGroupAssignmentArgs.builder()
 *             .placementGroupId(my_pg.id())
 *             .linodeId(my_inst.id())
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
 * Placement Group assignments can be imported using the Placement Group&#39;s ID followed by the Linode&#39;s ID separated by a comma, e.g.
 * 
 * ```sh
 * $ pulumi import linode:index/placementGroupAssignment:PlacementGroupAssignment my-assignment 1234567,7654321
 * ```
 * 
 */
@ResourceType(type="linode:index/placementGroupAssignment:PlacementGroupAssignment")
public class PlacementGroupAssignment extends com.pulumi.resources.CustomResource {
    @Export(name="compliantOnly", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> compliantOnly;

    public Output<Optional<Boolean>> compliantOnly() {
        return Codegen.optional(this.compliantOnly);
    }
    /**
     * The unique ID of the Linode to assign.
     * 
     */
    @Export(name="linodeId", refs={Integer.class}, tree="[0]")
    private Output<Integer> linodeId;

    /**
     * @return The unique ID of the Linode to assign.
     * 
     */
    public Output<Integer> linodeId() {
        return this.linodeId;
    }
    /**
     * The unique ID of the target Placement Group.
     * 
     */
    @Export(name="placementGroupId", refs={Integer.class}, tree="[0]")
    private Output<Integer> placementGroupId;

    /**
     * @return The unique ID of the target Placement Group.
     * 
     */
    public Output<Integer> placementGroupId() {
        return this.placementGroupId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PlacementGroupAssignment(String name) {
        this(name, PlacementGroupAssignmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PlacementGroupAssignment(String name, PlacementGroupAssignmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PlacementGroupAssignment(String name, PlacementGroupAssignmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("linode:index/placementGroupAssignment:PlacementGroupAssignment", name, args == null ? PlacementGroupAssignmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PlacementGroupAssignment(String name, Output<String> id, @Nullable PlacementGroupAssignmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("linode:index/placementGroupAssignment:PlacementGroupAssignment", name, state, makeResourceOptions(options, id));
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
    public static PlacementGroupAssignment get(String name, Output<String> id, @Nullable PlacementGroupAssignmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PlacementGroupAssignment(name, id, state, options);
    }
}
