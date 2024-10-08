// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.linode.InstanceIpArgs;
import com.pulumi.linode.Utilities;
import com.pulumi.linode.inputs.InstanceIpState;
import com.pulumi.linode.outputs.InstanceIpVpcNat11;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Manages a Linode instance IP.
 * For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/post-add-linode-ip).
 * 
 * &gt; **NOTICE:** You may need to contact support to increase your instance IP limit before you can allocate additional IPs.
 * 
 * &gt; **NOTICE:** This resource will reboot the specified instance following IP allocation.
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
 * import com.pulumi.linode.Instance;
 * import com.pulumi.linode.InstanceArgs;
 * import com.pulumi.linode.InstanceIp;
 * import com.pulumi.linode.InstanceIpArgs;
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
 *             .image("linode/alpine3.19")
 *             .label("foobar-test")
 *             .type("g6-nanode-1")
 *             .region("us-east")
 *             .build());
 * 
 *         var fooInstanceIp = new InstanceIp("fooInstanceIp", InstanceIpArgs.builder()
 *             .linodeId(foo.id())
 *             .public_(true)
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="linode:index/instanceIp:InstanceIp")
public class InstanceIp extends com.pulumi.resources.CustomResource {
    /**
     * The resulting IPv4 address.
     * 
     */
    @Export(name="address", refs={String.class}, tree="[0]")
    private Output<String> address;

    /**
     * @return The resulting IPv4 address.
     * 
     */
    public Output<String> address() {
        return this.address;
    }
    /**
     * If true, the instance will be rebooted to update network interfaces.
     * 
     */
    @Export(name="applyImmediately", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> applyImmediately;

    /**
     * @return If true, the instance will be rebooted to update network interfaces.
     * 
     */
    public Output<Boolean> applyImmediately() {
        return this.applyImmediately;
    }
    /**
     * The default gateway for this address
     * 
     */
    @Export(name="gateway", refs={String.class}, tree="[0]")
    private Output<String> gateway;

    /**
     * @return The default gateway for this address
     * 
     */
    public Output<String> gateway() {
        return this.gateway;
    }
    /**
     * The ID of the Linode to allocate an IPv4 address for.
     * 
     */
    @Export(name="linodeId", refs={Integer.class}, tree="[0]")
    private Output<Integer> linodeId;

    /**
     * @return The ID of the Linode to allocate an IPv4 address for.
     * 
     */
    public Output<Integer> linodeId() {
        return this.linodeId;
    }
    /**
     * The number of bits set in the subnet mask.
     * 
     */
    @Export(name="prefix", refs={Integer.class}, tree="[0]")
    private Output<Integer> prefix;

    /**
     * @return The number of bits set in the subnet mask.
     * 
     */
    public Output<Integer> prefix() {
        return this.prefix;
    }
    /**
     * Whether the IPv4 address is public or private. Defaults to true.
     * 
     */
    @Export(name="public", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> public_;

    /**
     * @return Whether the IPv4 address is public or private. Defaults to true.
     * 
     */
    public Output<Boolean> public_() {
        return this.public_;
    }
    /**
     * The reverse DNS assigned to this address.
     * 
     */
    @Export(name="rdns", refs={String.class}, tree="[0]")
    private Output<String> rdns;

    /**
     * @return The reverse DNS assigned to this address.
     * 
     */
    public Output<String> rdns() {
        return this.rdns;
    }
    /**
     * The region this IP resides in.
     * 
     */
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output<String> region;

    /**
     * @return The region this IP resides in.
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * The mask that separates host bits from network bits for this address.
     * 
     */
    @Export(name="subnetMask", refs={String.class}, tree="[0]")
    private Output<String> subnetMask;

    /**
     * @return The mask that separates host bits from network bits for this address.
     * 
     */
    public Output<String> subnetMask() {
        return this.subnetMask;
    }
    /**
     * The type of IP address. (`ipv4`, `ipv6`, `ipv6/pool`, `ipv6/range`)
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return The type of IP address. (`ipv4`, `ipv6`, `ipv6/pool`, `ipv6/range`)
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * Contains information about the NAT 1:1 mapping of a public IP address to a VPC subnet.
     * 
     */
    @Export(name="vpcNat11s", refs={List.class,InstanceIpVpcNat11.class}, tree="[0,1]")
    private Output<List<InstanceIpVpcNat11>> vpcNat11s;

    /**
     * @return Contains information about the NAT 1:1 mapping of a public IP address to a VPC subnet.
     * 
     */
    public Output<List<InstanceIpVpcNat11>> vpcNat11s() {
        return this.vpcNat11s;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public InstanceIp(java.lang.String name) {
        this(name, InstanceIpArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public InstanceIp(java.lang.String name, InstanceIpArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public InstanceIp(java.lang.String name, InstanceIpArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("linode:index/instanceIp:InstanceIp", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private InstanceIp(java.lang.String name, Output<java.lang.String> id, @Nullable InstanceIpState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("linode:index/instanceIp:InstanceIp", name, state, makeResourceOptions(options, id), false);
    }

    private static InstanceIpArgs makeArgs(InstanceIpArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? InstanceIpArgs.Empty : args;
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
    public static InstanceIp get(java.lang.String name, Output<java.lang.String> id, @Nullable InstanceIpState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new InstanceIp(name, id, state, options);
    }
}
