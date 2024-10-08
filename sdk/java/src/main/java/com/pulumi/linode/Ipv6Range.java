// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.linode.Ipv6RangeArgs;
import com.pulumi.linode.Utilities;
import com.pulumi.linode.inputs.Ipv6RangeState;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
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
 * import com.pulumi.linode.Instance;
 * import com.pulumi.linode.InstanceArgs;
 * import com.pulumi.linode.Ipv6Range;
 * import com.pulumi.linode.Ipv6RangeArgs;
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
 *         var foobar = new Instance("foobar", InstanceArgs.builder()
 *             .label("my-linode")
 *             .image("linode/alpine3.19")
 *             .type("g6-nanode-1")
 *             .region("us-southeast")
 *             .build());
 * 
 *         var foobarIpv6Range = new Ipv6Range("foobarIpv6Range", Ipv6RangeArgs.builder()
 *             .linodeId(foobar.id())
 *             .prefixLength(64)
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="linode:index/ipv6Range:Ipv6Range")
public class Ipv6Range extends com.pulumi.resources.CustomResource {
    /**
     * Whether this IPv6 range is shared.
     * 
     */
    @Export(name="isBgp", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> isBgp;

    /**
     * @return Whether this IPv6 range is shared.
     * 
     */
    public Output<Boolean> isBgp() {
        return this.isBgp;
    }
    /**
     * The ID of the Linode to assign this range to. This field may be updated to reassign the IPv6 range.
     * 
     */
    @Export(name="linodeId", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> linodeId;

    /**
     * @return The ID of the Linode to assign this range to. This field may be updated to reassign the IPv6 range.
     * 
     */
    public Output<Optional<Integer>> linodeId() {
        return Codegen.optional(this.linodeId);
    }
    /**
     * A list of Linodes targeted by this IPv6 range. Includes Linodes with IP sharing.
     * 
     */
    @Export(name="linodes", refs={List.class,Integer.class}, tree="[0,1]")
    private Output<List<Integer>> linodes;

    /**
     * @return A list of Linodes targeted by this IPv6 range. Includes Linodes with IP sharing.
     * 
     */
    public Output<List<Integer>> linodes() {
        return this.linodes;
    }
    /**
     * The prefix length of the IPv6 range.
     * 
     */
    @Export(name="prefixLength", refs={Integer.class}, tree="[0]")
    private Output<Integer> prefixLength;

    /**
     * @return The prefix length of the IPv6 range.
     * 
     */
    public Output<Integer> prefixLength() {
        return this.prefixLength;
    }
    /**
     * The IPv6 range of addresses in this pool.
     * 
     */
    @Export(name="range", refs={String.class}, tree="[0]")
    private Output<String> range;

    /**
     * @return The IPv6 range of addresses in this pool.
     * 
     */
    public Output<String> range() {
        return this.range;
    }
    /**
     * The region for this range of IPv6 addresses.
     * 
     */
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output<String> region;

    /**
     * @return The region for this range of IPv6 addresses.
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * The IPv6 SLAAC address to assign this range to.
     * 
     */
    @Export(name="routeTarget", refs={String.class}, tree="[0]")
    private Output<String> routeTarget;

    /**
     * @return The IPv6 SLAAC address to assign this range to.
     * 
     */
    public Output<String> routeTarget() {
        return this.routeTarget;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Ipv6Range(java.lang.String name) {
        this(name, Ipv6RangeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Ipv6Range(java.lang.String name, Ipv6RangeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Ipv6Range(java.lang.String name, Ipv6RangeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("linode:index/ipv6Range:Ipv6Range", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Ipv6Range(java.lang.String name, Output<java.lang.String> id, @Nullable Ipv6RangeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("linode:index/ipv6Range:Ipv6Range", name, state, makeResourceOptions(options, id), false);
    }

    private static Ipv6RangeArgs makeArgs(Ipv6RangeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? Ipv6RangeArgs.Empty : args;
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
    public static Ipv6Range get(java.lang.String name, Output<java.lang.String> id, @Nullable Ipv6RangeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Ipv6Range(name, id, state, options);
    }
}
