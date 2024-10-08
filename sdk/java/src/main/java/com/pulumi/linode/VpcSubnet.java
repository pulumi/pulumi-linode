// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.linode.Utilities;
import com.pulumi.linode.VpcSubnetArgs;
import com.pulumi.linode.inputs.VpcSubnetState;
import com.pulumi.linode.outputs.VpcSubnetLinode;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Manages a Linode VPC subnet.
 * For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/post-vpc-subnet).
 * 
 * ## Example Usage
 * 
 * Create a VPC subnet:
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.linode.VpcSubnet;
 * import com.pulumi.linode.VpcSubnetArgs;
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
 *         var test = new VpcSubnet("test", VpcSubnetArgs.builder()
 *             .vpcId(123)
 *             .label("test-subnet")
 *             .ipv4("10.0.0.0/24")
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
 * Linode Virtual Private Cloud (VPC) Subnet can be imported using the `vpc_id` followed by the subnet `id` separated by a comma, e.g.
 * 
 * ```sh
 * $ pulumi import linode:index/vpcSubnet:VpcSubnet my_subnet_duplicated 1234567,7654321
 * ```
 * 
 */
@ResourceType(type="linode:index/vpcSubnet:VpcSubnet")
public class VpcSubnet extends com.pulumi.resources.CustomResource {
    /**
     * The date and time when the VPC was created.
     * 
     */
    @Export(name="created", refs={String.class}, tree="[0]")
    private Output<String> created;

    /**
     * @return The date and time when the VPC was created.
     * 
     */
    public Output<String> created() {
        return this.created;
    }
    /**
     * The IPv4 range of this subnet in CIDR format.
     * 
     */
    @Export(name="ipv4", refs={String.class}, tree="[0]")
    private Output<String> ipv4;

    /**
     * @return The IPv4 range of this subnet in CIDR format.
     * 
     */
    public Output<String> ipv4() {
        return this.ipv4;
    }
    /**
     * The label of the VPC. Only contains ASCII letters, digits and dashes.
     * 
     */
    @Export(name="label", refs={String.class}, tree="[0]")
    private Output<String> label;

    /**
     * @return The label of the VPC. Only contains ASCII letters, digits and dashes.
     * 
     */
    public Output<String> label() {
        return this.label;
    }
    /**
     * A list of Linode IDs that added to this subnet.
     * 
     */
    @Export(name="linodes", refs={List.class,VpcSubnetLinode.class}, tree="[0,1]")
    private Output<List<VpcSubnetLinode>> linodes;

    /**
     * @return A list of Linode IDs that added to this subnet.
     * 
     */
    public Output<List<VpcSubnetLinode>> linodes() {
        return this.linodes;
    }
    /**
     * The date and time when the VPC was last updated.
     * 
     */
    @Export(name="updated", refs={String.class}, tree="[0]")
    private Output<String> updated;

    /**
     * @return The date and time when the VPC was last updated.
     * 
     */
    public Output<String> updated() {
        return this.updated;
    }
    /**
     * The id of the parent VPC for this VPC Subnet.
     * 
     */
    @Export(name="vpcId", refs={Integer.class}, tree="[0]")
    private Output<Integer> vpcId;

    /**
     * @return The id of the parent VPC for this VPC Subnet.
     * 
     */
    public Output<Integer> vpcId() {
        return this.vpcId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VpcSubnet(java.lang.String name) {
        this(name, VpcSubnetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VpcSubnet(java.lang.String name, VpcSubnetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VpcSubnet(java.lang.String name, VpcSubnetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("linode:index/vpcSubnet:VpcSubnet", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private VpcSubnet(java.lang.String name, Output<java.lang.String> id, @Nullable VpcSubnetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("linode:index/vpcSubnet:VpcSubnet", name, state, makeResourceOptions(options, id), false);
    }

    private static VpcSubnetArgs makeArgs(VpcSubnetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? VpcSubnetArgs.Empty : args;
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
    public static VpcSubnet get(java.lang.String name, Output<java.lang.String> id, @Nullable VpcSubnetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VpcSubnet(name, id, state, options);
    }
}
