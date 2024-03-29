// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.linode.LkeNodePoolArgs;
import com.pulumi.linode.Utilities;
import com.pulumi.linode.inputs.LkeNodePoolState;
import com.pulumi.linode.outputs.LkeNodePoolAutoscaler;
import com.pulumi.linode.outputs.LkeNodePoolNode;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * LKE Node Pools can be imported using the `cluster_id,id`, e.g.
 * 
 * ```sh
 * $ pulumi import linode:index/lkeNodePool:LkeNodePool my_pool 150003,12345
 * ```
 * 
 */
@ResourceType(type="linode:index/lkeNodePool:LkeNodePool")
public class LkeNodePool extends com.pulumi.resources.CustomResource {
    @Export(name="autoscaler", refs={LkeNodePoolAutoscaler.class}, tree="[0]")
    private Output</* @Nullable */ LkeNodePoolAutoscaler> autoscaler;

    public Output<Optional<LkeNodePoolAutoscaler>> autoscaler() {
        return Codegen.optional(this.autoscaler);
    }
    /**
     * ID of the LKE Cluster where to create the current Node Pool.
     * 
     */
    @Export(name="clusterId", refs={Integer.class}, tree="[0]")
    private Output<Integer> clusterId;

    /**
     * @return ID of the LKE Cluster where to create the current Node Pool.
     * 
     */
    public Output<Integer> clusterId() {
        return this.clusterId;
    }
    /**
     * The number of nodes in the Node Pool. If undefined with an autoscaler the initial node count will equal the autoscaler minimum.
     * 
     */
    @Export(name="nodeCount", refs={Integer.class}, tree="[0]")
    private Output<Integer> nodeCount;

    /**
     * @return The number of nodes in the Node Pool. If undefined with an autoscaler the initial node count will equal the autoscaler minimum.
     * 
     */
    public Output<Integer> nodeCount() {
        return this.nodeCount;
    }
    /**
     * A list of nodes in the node pool.
     * 
     */
    @Export(name="nodes", refs={List.class,LkeNodePoolNode.class}, tree="[0,1]")
    private Output<List<LkeNodePoolNode>> nodes;

    /**
     * @return A list of nodes in the node pool.
     * 
     */
    public Output<List<LkeNodePoolNode>> nodes() {
        return this.nodes;
    }
    /**
     * An array of tags applied to the Node Pool. Tags can be used to flag node pools as externally managed, see Externally Managed Node Pools for more details.
     * 
     * * `autoscaler` - (Optional) If defined, an autoscaler will be enabled with the given configuration.
     * 
     */
    @Export(name="tags", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> tags;

    /**
     * @return An array of tags applied to the Node Pool. Tags can be used to flag node pools as externally managed, see Externally Managed Node Pools for more details.
     * 
     * * `autoscaler` - (Optional) If defined, an autoscaler will be enabled with the given configuration.
     * 
     */
    public Output<List<String>> tags() {
        return this.tags;
    }
    /**
     * A Linode Type for all nodes in the Node Pool. See all node types [here](https://api.linode.com/v4/linode/types).
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return A Linode Type for all nodes in the Node Pool. See all node types [here](https://api.linode.com/v4/linode/types).
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LkeNodePool(String name) {
        this(name, LkeNodePoolArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LkeNodePool(String name, LkeNodePoolArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LkeNodePool(String name, LkeNodePoolArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("linode:index/lkeNodePool:LkeNodePool", name, args == null ? LkeNodePoolArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LkeNodePool(String name, Output<String> id, @Nullable LkeNodePoolState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("linode:index/lkeNodePool:LkeNodePool", name, state, makeResourceOptions(options, id));
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
    public static LkeNodePool get(String name, Output<String> id, @Nullable LkeNodePoolState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LkeNodePool(name, id, state, options);
    }
}
