// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.linode.NodeBalancerNodeArgs;
import com.pulumi.linode.Utilities;
import com.pulumi.linode.inputs.NodeBalancerNodeState;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Linode NodeBalancer Node resource.  This can be used to create, modify, and delete Linodes NodeBalancer Nodes.
 * For more information, see [Getting Started with NodeBalancers](https://www.linode.com/docs/platform/nodebalancer/getting-started-with-nodebalancers/) and the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/post-node-balancer-node).
 * 
 * ## Import
 * 
 * NodeBalancer Nodes can be imported using the NodeBalancer `nodebalancer_id` followed by the NodeBalancer Config `config_id` followed by the NodeBalancer Node `id`, separated by a comma, e.g.
 * 
 * ```sh
 * $ pulumi import linode:index/nodeBalancerNode:NodeBalancerNode https-foobar-1 1234567,7654321,9999999
 * ```
 * 
 */
@ResourceType(type="linode:index/nodeBalancerNode:NodeBalancerNode")
public class NodeBalancerNode extends com.pulumi.resources.CustomResource {
    /**
     * The private IP Address where this backend can be reached. This must be a private IP address.
     * 
     */
    @Export(name="address", refs={String.class}, tree="[0]")
    private Output<String> address;

    /**
     * @return The private IP Address where this backend can be reached. This must be a private IP address.
     * 
     */
    public Output<String> address() {
        return this.address;
    }
    /**
     * The ID of the NodeBalancerConfig to access.
     * 
     */
    @Export(name="configId", refs={Integer.class}, tree="[0]")
    private Output<Integer> configId;

    /**
     * @return The ID of the NodeBalancerConfig to access.
     * 
     */
    public Output<Integer> configId() {
        return this.configId;
    }
    /**
     * The label of the Linode NodeBalancer Node. This is for display purposes only.
     * 
     */
    @Export(name="label", refs={String.class}, tree="[0]")
    private Output<String> label;

    /**
     * @return The label of the Linode NodeBalancer Node. This is for display purposes only.
     * 
     */
    public Output<String> label() {
        return this.label;
    }
    /**
     * The mode this NodeBalancer should use when sending traffic to this backend. If set to `accept` this backend is accepting traffic. If set to `reject` this backend will not receive traffic. If set to `drain` this backend will not receive new traffic, but connections already pinned to it will continue to be routed to it. (`accept`, `reject`, `drain`, `backup`)
     * 
     */
    @Export(name="mode", refs={String.class}, tree="[0]")
    private Output<String> mode;

    /**
     * @return The mode this NodeBalancer should use when sending traffic to this backend. If set to `accept` this backend is accepting traffic. If set to `reject` this backend will not receive traffic. If set to `drain` this backend will not receive new traffic, but connections already pinned to it will continue to be routed to it. (`accept`, `reject`, `drain`, `backup`)
     * 
     */
    public Output<String> mode() {
        return this.mode;
    }
    /**
     * The ID of the NodeBalancer to access.
     * 
     */
    @Export(name="nodebalancerId", refs={Integer.class}, tree="[0]")
    private Output<Integer> nodebalancerId;

    /**
     * @return The ID of the NodeBalancer to access.
     * 
     */
    public Output<Integer> nodebalancerId() {
        return this.nodebalancerId;
    }
    /**
     * The current status of this node, based on the configured checks of its NodeBalancer Config. (`unknown`, `UP`, `DOWN`).
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The current status of this node, based on the configured checks of its NodeBalancer Config. (`unknown`, `UP`, `DOWN`).
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * Used when picking a backend to serve a request and is not pinned to a single backend yet. Nodes with a higher weight will receive more traffic. (1-255).
     * 
     */
    @Export(name="weight", refs={Integer.class}, tree="[0]")
    private Output<Integer> weight;

    /**
     * @return Used when picking a backend to serve a request and is not pinned to a single backend yet. Nodes with a higher weight will receive more traffic. (1-255).
     * 
     */
    public Output<Integer> weight() {
        return this.weight;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NodeBalancerNode(java.lang.String name) {
        this(name, NodeBalancerNodeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NodeBalancerNode(java.lang.String name, NodeBalancerNodeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NodeBalancerNode(java.lang.String name, NodeBalancerNodeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("linode:index/nodeBalancerNode:NodeBalancerNode", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private NodeBalancerNode(java.lang.String name, Output<java.lang.String> id, @Nullable NodeBalancerNodeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("linode:index/nodeBalancerNode:NodeBalancerNode", name, state, makeResourceOptions(options, id), false);
    }

    private static NodeBalancerNodeArgs makeArgs(NodeBalancerNodeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? NodeBalancerNodeArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
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
    public static NodeBalancerNode get(java.lang.String name, Output<java.lang.String> id, @Nullable NodeBalancerNodeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NodeBalancerNode(name, id, state, options);
    }
}
