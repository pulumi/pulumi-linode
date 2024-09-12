// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.linode.FirewallArgs;
import com.pulumi.linode.Utilities;
import com.pulumi.linode.inputs.FirewallState;
import com.pulumi.linode.outputs.FirewallDevice;
import com.pulumi.linode.outputs.FirewallInbound;
import com.pulumi.linode.outputs.FirewallOutbound;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Linode Firewall.
 * For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/post-firewalls).
 * 
 * ## Example Usage
 * 
 * Accept only inbound HTTP(s) requests and drop outbound HTTP(s) requests:
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
 * import com.pulumi.linode.Firewall;
 * import com.pulumi.linode.FirewallArgs;
 * import com.pulumi.linode.inputs.FirewallInboundArgs;
 * import com.pulumi.linode.inputs.FirewallOutboundArgs;
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
 *         var myInstance = new Instance("myInstance", InstanceArgs.builder()
 *             .label("my_instance")
 *             .image("linode/ubuntu22.04")
 *             .region("us-southeast")
 *             .type("g6-standard-1")
 *             .rootPass("bogusPassword$")
 *             .swapSize(256)
 *             .build());
 * 
 *         var myFirewall = new Firewall("myFirewall", FirewallArgs.builder()
 *             .label("my_firewall")
 *             .inbounds(            
 *                 FirewallInboundArgs.builder()
 *                     .label("allow-http")
 *                     .action("ACCEPT")
 *                     .protocol("TCP")
 *                     .ports("80")
 *                     .ipv4s("0.0.0.0/0")
 *                     .ipv6s("::/0")
 *                     .build(),
 *                 FirewallInboundArgs.builder()
 *                     .label("allow-https")
 *                     .action("ACCEPT")
 *                     .protocol("TCP")
 *                     .ports("443")
 *                     .ipv4s("0.0.0.0/0")
 *                     .ipv6s("::/0")
 *                     .build())
 *             .inboundPolicy("DROP")
 *             .outbounds(            
 *                 FirewallOutboundArgs.builder()
 *                     .label("reject-http")
 *                     .action("DROP")
 *                     .protocol("TCP")
 *                     .ports("80")
 *                     .ipv4s("0.0.0.0/0")
 *                     .ipv6s("::/0")
 *                     .build(),
 *                 FirewallOutboundArgs.builder()
 *                     .label("reject-https")
 *                     .action("DROP")
 *                     .protocol("TCP")
 *                     .ports("443")
 *                     .ipv4s("0.0.0.0/0")
 *                     .ipv6s("::/0")
 *                     .build())
 *             .outboundPolicy("ACCEPT")
 *             .linodes(myInstance.id())
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
 * Firewalls can be imported using the `id`, e.g.
 * 
 * ```sh
 * $ pulumi import linode:index/firewall:Firewall my_firewall 12345
 * ```
 * 
 */
@ResourceType(type="linode:index/firewall:Firewall")
public class Firewall extends com.pulumi.resources.CustomResource {
    /**
     * When this firewall was created
     * 
     */
    @Export(name="created", refs={String.class}, tree="[0]")
    private Output<String> created;

    /**
     * @return When this firewall was created
     * 
     */
    public Output<String> created() {
        return this.created;
    }
    /**
     * The devices associated with this firewall.
     * 
     */
    @Export(name="devices", refs={List.class,FirewallDevice.class}, tree="[0,1]")
    private Output<List<FirewallDevice>> devices;

    /**
     * @return The devices associated with this firewall.
     * 
     */
    public Output<List<FirewallDevice>> devices() {
        return this.devices;
    }
    /**
     * If `true`, the Firewall&#39;s rules are not enforced (defaults to `false`).
     * 
     * * `inbound` - (Optional) A firewall rule that specifies what inbound network traffic is allowed.
     * 
     */
    @Export(name="disabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> disabled;

    /**
     * @return If `true`, the Firewall&#39;s rules are not enforced (defaults to `false`).
     * 
     * * `inbound` - (Optional) A firewall rule that specifies what inbound network traffic is allowed.
     * 
     */
    public Output<Boolean> disabled() {
        return this.disabled;
    }
    /**
     * The default behavior for inbound traffic. This setting can be overridden by updating the inbound.action property of the Firewall Rule. (`ACCEPT`, `DROP`)
     * 
     * * `outbound` - (Optional) A firewall rule that specifies what outbound network traffic is allowed.
     * 
     */
    @Export(name="inboundPolicy", refs={String.class}, tree="[0]")
    private Output<String> inboundPolicy;

    /**
     * @return The default behavior for inbound traffic. This setting can be overridden by updating the inbound.action property of the Firewall Rule. (`ACCEPT`, `DROP`)
     * 
     * * `outbound` - (Optional) A firewall rule that specifies what outbound network traffic is allowed.
     * 
     */
    public Output<String> inboundPolicy() {
        return this.inboundPolicy;
    }
    /**
     * A firewall rule that specifies what inbound network traffic is allowed.
     * 
     */
    @Export(name="inbounds", refs={List.class,FirewallInbound.class}, tree="[0,1]")
    private Output</* @Nullable */ List<FirewallInbound>> inbounds;

    /**
     * @return A firewall rule that specifies what inbound network traffic is allowed.
     * 
     */
    public Output<Optional<List<FirewallInbound>>> inbounds() {
        return Codegen.optional(this.inbounds);
    }
    /**
     * This Firewall&#39;s unique label.
     * 
     */
    @Export(name="label", refs={String.class}, tree="[0]")
    private Output<String> label;

    /**
     * @return This Firewall&#39;s unique label.
     * 
     */
    public Output<String> label() {
        return this.label;
    }
    /**
     * A list of IDs of Linodes this Firewall should govern network traffic for.
     * 
     */
    @Export(name="linodes", refs={List.class,Integer.class}, tree="[0,1]")
    private Output<List<Integer>> linodes;

    /**
     * @return A list of IDs of Linodes this Firewall should govern network traffic for.
     * 
     */
    public Output<List<Integer>> linodes() {
        return this.linodes;
    }
    /**
     * A list of IDs of NodeBalancers this Firewall should govern network traffic for.
     * 
     */
    @Export(name="nodebalancers", refs={List.class,Integer.class}, tree="[0,1]")
    private Output<List<Integer>> nodebalancers;

    /**
     * @return A list of IDs of NodeBalancers this Firewall should govern network traffic for.
     * 
     */
    public Output<List<Integer>> nodebalancers() {
        return this.nodebalancers;
    }
    /**
     * The default behavior for outbound traffic. This setting can be overridden by updating the outbound.action property for an individual Firewall Rule. (`ACCEPT`, `DROP`)
     * 
     */
    @Export(name="outboundPolicy", refs={String.class}, tree="[0]")
    private Output<String> outboundPolicy;

    /**
     * @return The default behavior for outbound traffic. This setting can be overridden by updating the outbound.action property for an individual Firewall Rule. (`ACCEPT`, `DROP`)
     * 
     */
    public Output<String> outboundPolicy() {
        return this.outboundPolicy;
    }
    /**
     * A firewall rule that specifies what outbound network traffic is allowed.
     * 
     */
    @Export(name="outbounds", refs={List.class,FirewallOutbound.class}, tree="[0,1]")
    private Output</* @Nullable */ List<FirewallOutbound>> outbounds;

    /**
     * @return A firewall rule that specifies what outbound network traffic is allowed.
     * 
     */
    public Output<Optional<List<FirewallOutbound>>> outbounds() {
        return Codegen.optional(this.outbounds);
    }
    /**
     * The status of the Firewall.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of the Firewall.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * A list of tags applied to the Kubernetes cluster. Tags are case-insensitive and are for organizational purposes only.
     * 
     */
    @Export(name="tags", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> tags;

    /**
     * @return A list of tags applied to the Kubernetes cluster. Tags are case-insensitive and are for organizational purposes only.
     * 
     */
    public Output<List<String>> tags() {
        return this.tags;
    }
    /**
     * When this firewall was last updated
     * 
     */
    @Export(name="updated", refs={String.class}, tree="[0]")
    private Output<String> updated;

    /**
     * @return When this firewall was last updated
     * 
     */
    public Output<String> updated() {
        return this.updated;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Firewall(java.lang.String name) {
        this(name, FirewallArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Firewall(java.lang.String name, FirewallArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Firewall(java.lang.String name, FirewallArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("linode:index/firewall:Firewall", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Firewall(java.lang.String name, Output<java.lang.String> id, @Nullable FirewallState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("linode:index/firewall:Firewall", name, state, makeResourceOptions(options, id), false);
    }

    private static FirewallArgs makeArgs(FirewallArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? FirewallArgs.Empty : args;
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
    public static Firewall get(java.lang.String name, Output<java.lang.String> id, @Nullable FirewallState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Firewall(name, id, state, options);
    }
}
