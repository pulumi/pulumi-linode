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
 * For more information, see [Getting Started with NodeBalancers](https://www.linode.com/docs/platform/nodebalancer/getting-started-with-nodebalancers/) and the [Linode APIv4 docs](https://developers.linode.com/api/v4#operation/createNodeBalancerNode).
 * 
 * ## Example Usage
 * 
 * The following example shows how one might use this resource to configure NodeBalancer Nodes attached to Linode instances.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.linode.Instance;
 * import com.pulumi.linode.InstanceArgs;
 * import com.pulumi.linode.NodeBalancer;
 * import com.pulumi.linode.NodeBalancerArgs;
 * import com.pulumi.linode.NodeBalancerConfig;
 * import com.pulumi.linode.NodeBalancerConfigArgs;
 * import com.pulumi.linode.NodeBalancerNode;
 * import com.pulumi.linode.NodeBalancerNodeArgs;
 * import com.pulumi.codegen.internal.KeyedValue;
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
 *         for (var i = 0; i &lt; &#34;3&#34;; i++) {
 *             new Instance(&#34;web-&#34; + i, InstanceArgs.builder()            
 *                 .label(String.format(&#34;web-%s&#34;, range.value() + 1))
 *                 .image(&#34;linode/ubuntu18.04&#34;)
 *                 .region(&#34;us-east&#34;)
 *                 .type(&#34;g6-standard-1&#34;)
 *                 .authorizedKeys(&#34;ssh-rsa AAAA...Gw== user@example.local&#34;)
 *                 .rootPass(&#34;test&#34;)
 *                 .privateIp(true)
 *                 .build());
 * 
 *         
 * }
 *         var foobar = new NodeBalancer(&#34;foobar&#34;, NodeBalancerArgs.builder()        
 *             .label(&#34;mynodebalancer&#34;)
 *             .region(&#34;us-east&#34;)
 *             .clientConnThrottle(20)
 *             .build());
 * 
 *         var foofig = new NodeBalancerConfig(&#34;foofig&#34;, NodeBalancerConfigArgs.builder()        
 *             .nodebalancerId(foobar.id())
 *             .port(80)
 *             .protocol(&#34;http&#34;)
 *             .check(&#34;http&#34;)
 *             .checkPath(&#34;/foo&#34;)
 *             .checkAttempts(3)
 *             .checkTimeout(30)
 *             .stickiness(&#34;http_cookie&#34;)
 *             .algorithm(&#34;source&#34;)
 *             .build());
 * 
 *         for (var i = 0; i &lt; &#34;3&#34;; i++) {
 *             new NodeBalancerNode(&#34;foonode-&#34; + i, NodeBalancerNodeArgs.builder()            
 *                 .nodebalancerId(foobar.id())
 *                 .configId(foofig.id())
 *                 .address(web.stream().map(element -&gt; element.privateIpAddress()).collect(toList())[range.value()].applyValue(privateIpAddresses -&gt; String.format(&#34;%s:80&#34;, privateIpAddresses)))
 *                 .label(&#34;mynodebalancernode&#34;)
 *                 .weight(50)
 *                 .build());
 * 
 *         
 * }
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * NodeBalancer Nodes can be imported using the NodeBalancer `nodebalancer_id` followed by the NodeBalancer Config `config_id` followed by the NodeBalancer Node `id`, separated by a comma, e.g.
 * 
 * ```sh
 *  $ pulumi import linode:index/nodeBalancerNode:NodeBalancerNode https-foobar-1 1234567,7654321,9999999
 * ```
 * 
 *  The Linode Guide, [Import Existing Infrastructure to Terraform](https://www.linode.com/docs/applications/configuration-management/import-existing-infrastructure-to-terraform/), offers resource importing examples for NodeBalancer Nodes and other Linode resource types.
 * 
 */
@ResourceType(type="linode:index/nodeBalancerNode:NodeBalancerNode")
public class NodeBalancerNode extends com.pulumi.resources.CustomResource {
    /**
     * The private IP Address where this backend can be reached. This must be a private IP address.
     * 
     */
    @Export(name="address", type=String.class, parameters={})
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
    @Export(name="configId", type=Integer.class, parameters={})
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
    @Export(name="label", type=String.class, parameters={})
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
    @Export(name="mode", type=String.class, parameters={})
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
    @Export(name="nodebalancerId", type=Integer.class, parameters={})
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
    @Export(name="status", type=String.class, parameters={})
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
    @Export(name="weight", type=Integer.class, parameters={})
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
    public NodeBalancerNode(String name) {
        this(name, NodeBalancerNodeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NodeBalancerNode(String name, NodeBalancerNodeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NodeBalancerNode(String name, NodeBalancerNodeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("linode:index/nodeBalancerNode:NodeBalancerNode", name, args == null ? NodeBalancerNodeArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NodeBalancerNode(String name, Output<String> id, @Nullable NodeBalancerNodeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("linode:index/nodeBalancerNode:NodeBalancerNode", name, state, makeResourceOptions(options, id));
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
    public static NodeBalancerNode get(String name, Output<String> id, @Nullable NodeBalancerNodeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NodeBalancerNode(name, id, state, options);
    }
}
