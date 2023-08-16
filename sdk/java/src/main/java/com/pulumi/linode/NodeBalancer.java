// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.linode.NodeBalancerArgs;
import com.pulumi.linode.Utilities;
import com.pulumi.linode.inputs.NodeBalancerState;
import com.pulumi.linode.outputs.NodeBalancerTransfer;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Linode NodeBalancer resource.  This can be used to create, modify, and delete Linodes NodeBalancers in Linode&#39;s managed load balancer service.
 * For more information, see [Getting Started with NodeBalancers](https://www.linode.com/docs/platform/nodebalancer/getting-started-with-nodebalancers/) and the [Linode APIv4 docs](https://developers.linode.com/api/v4#operation/createNodeBalancer).
 * 
 * ## Example Usage
 * 
 * The following example shows how one might use this resource to configure a NodeBalancer.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.linode.NodeBalancer;
 * import com.pulumi.linode.NodeBalancerArgs;
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
 *         var foobar = new NodeBalancer(&#34;foobar&#34;, NodeBalancerArgs.builder()        
 *             .clientConnThrottle(20)
 *             .label(&#34;mynodebalancer&#34;)
 *             .region(&#34;us-east&#34;)
 *             .tags(&#34;foobar&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Linodes NodeBalancers can be imported using the Linode NodeBalancer `id`, e.g.
 * 
 * ```sh
 *  $ pulumi import linode:index/nodeBalancer:NodeBalancer mynodebalancer 1234567
 * ```
 * 
 *  The Linode Guide, [Import Existing Infrastructure to Terraform](https://www.linode.com/docs/applications/configuration-management/import-existing-infrastructure-to-terraform/), offers resource importing examples for NodeBalancers and other Linode resource types.
 * 
 */
@ResourceType(type="linode:index/nodeBalancer:NodeBalancer")
public class NodeBalancer extends com.pulumi.resources.CustomResource {
    /**
     * Throttle connections per second (0-20). Set to 0 (default) to disable throttling.
     * 
     */
    @Export(name="clientConnThrottle", refs={Integer.class}, tree="[0]")
    private Output<Integer> clientConnThrottle;

    /**
     * @return Throttle connections per second (0-20). Set to 0 (default) to disable throttling.
     * 
     */
    public Output<Integer> clientConnThrottle() {
        return this.clientConnThrottle;
    }
    /**
     * When this NodeBalancer was created
     * 
     */
    @Export(name="created", refs={String.class}, tree="[0]")
    private Output<String> created;

    /**
     * @return When this NodeBalancer was created
     * 
     */
    public Output<String> created() {
        return this.created;
    }
    /**
     * This NodeBalancer&#39;s hostname, ending with .nodebalancer.linode.com
     * 
     */
    @Export(name="hostname", refs={String.class}, tree="[0]")
    private Output<String> hostname;

    /**
     * @return This NodeBalancer&#39;s hostname, ending with .nodebalancer.linode.com
     * 
     */
    public Output<String> hostname() {
        return this.hostname;
    }
    /**
     * The Public IPv4 Address of this NodeBalancer
     * 
     */
    @Export(name="ipv4", refs={String.class}, tree="[0]")
    private Output<String> ipv4;

    /**
     * @return The Public IPv4 Address of this NodeBalancer
     * 
     */
    public Output<String> ipv4() {
        return this.ipv4;
    }
    /**
     * The Public IPv6 Address of this NodeBalancer
     * 
     */
    @Export(name="ipv6", refs={String.class}, tree="[0]")
    private Output<String> ipv6;

    /**
     * @return The Public IPv6 Address of this NodeBalancer
     * 
     */
    public Output<String> ipv6() {
        return this.ipv6;
    }
    /**
     * The label of the Linode NodeBalancer
     * 
     */
    @Export(name="label", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> label;

    /**
     * @return The label of the Linode NodeBalancer
     * 
     */
    public Output<Optional<String>> label() {
        return Codegen.optional(this.label);
    }
    /**
     * The region where this NodeBalancer will be deployed.  Examples are `&#34;us-east&#34;`, `&#34;us-west&#34;`, `&#34;ap-south&#34;`, etc. See all regions [here](https://api.linode.com/v4/regions).  *Changing `region` forces the creation of a new Linode NodeBalancer.*.
     * 
     * ***
     * 
     */
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output<String> region;

    /**
     * @return The region where this NodeBalancer will be deployed.  Examples are `&#34;us-east&#34;`, `&#34;us-west&#34;`, `&#34;ap-south&#34;`, etc. See all regions [here](https://api.linode.com/v4/regions).  *Changing `region` forces the creation of a new Linode NodeBalancer.*.
     * 
     * ***
     * 
     */
    public Output<String> region() {
        return this.region;
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
     * Information about the amount of transfer this NodeBalancer has had so far this month.
     * 
     */
    @Export(name="transfers", refs={List.class,NodeBalancerTransfer.class}, tree="[0,1]")
    private Output<List<NodeBalancerTransfer>> transfers;

    /**
     * @return Information about the amount of transfer this NodeBalancer has had so far this month.
     * 
     */
    public Output<List<NodeBalancerTransfer>> transfers() {
        return this.transfers;
    }
    /**
     * When this NodeBalancer was last updated.
     * 
     */
    @Export(name="updated", refs={String.class}, tree="[0]")
    private Output<String> updated;

    /**
     * @return When this NodeBalancer was last updated.
     * 
     */
    public Output<String> updated() {
        return this.updated;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NodeBalancer(String name) {
        this(name, NodeBalancerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NodeBalancer(String name, @Nullable NodeBalancerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NodeBalancer(String name, @Nullable NodeBalancerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("linode:index/nodeBalancer:NodeBalancer", name, args == null ? NodeBalancerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NodeBalancer(String name, Output<String> id, @Nullable NodeBalancerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("linode:index/nodeBalancer:NodeBalancer", name, state, makeResourceOptions(options, id));
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
    public static NodeBalancer get(String name, Output<String> id, @Nullable NodeBalancerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NodeBalancer(name, id, state, options);
    }
}
