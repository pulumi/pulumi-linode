// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.linode.NetworkingIpAssignmentArgs;
import com.pulumi.linode.Utilities;
import com.pulumi.linode.inputs.NetworkingIpAssignmentState;
import com.pulumi.linode.outputs.NetworkingIpAssignmentAssignment;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages the assignment of multiple IPv4 addresses and/or IPv6 ranges to multiple Linodes in a specified region.
 * 
 * For more information, see the corresponding [API documentation](https://techdocs.akamai.com/linode-api/reference/post-assign-ips).
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
 * import com.pulumi.linode.NetworkingIpAssignment;
 * import com.pulumi.linode.NetworkingIpAssignmentArgs;
 * import com.pulumi.linode.inputs.NetworkingIpAssignmentAssignmentArgs;
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
 *         var foobar = new NetworkingIpAssignment("foobar", NetworkingIpAssignmentArgs.builder()
 *             .region("us-mia")
 *             .assignments(            
 *                 NetworkingIpAssignmentAssignmentArgs.builder()
 *                     .address(reservedIp1.address())
 *                     .linode_id(terraform_web1.id())
 *                     .build(),
 *                 NetworkingIpAssignmentAssignmentArgs.builder()
 *                     .address(reservedIp2.address())
 *                     .linode_id(terraform_web2.id())
 *                     .build())
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
 * Network IP assignments cannot be imported.
 * 
 */
@ResourceType(type="linode:index/networkingIpAssignment:NetworkingIpAssignment")
public class NetworkingIpAssignment extends com.pulumi.resources.CustomResource {
    /**
     * A list of IP/Linode assignments to apply.
     * 
     */
    @Export(name="assignments", refs={List.class,NetworkingIpAssignmentAssignment.class}, tree="[0,1]")
    private Output</* @Nullable */ List<NetworkingIpAssignmentAssignment>> assignments;

    /**
     * @return A list of IP/Linode assignments to apply.
     * 
     */
    public Output<Optional<List<NetworkingIpAssignmentAssignment>>> assignments() {
        return Codegen.optional(this.assignments);
    }
    /**
     * The region where the IP addresses will be assigned.
     * 
     */
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output<String> region;

    /**
     * @return The region where the IP addresses will be assigned.
     * 
     */
    public Output<String> region() {
        return this.region;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NetworkingIpAssignment(java.lang.String name) {
        this(name, NetworkingIpAssignmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NetworkingIpAssignment(java.lang.String name, NetworkingIpAssignmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NetworkingIpAssignment(java.lang.String name, NetworkingIpAssignmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("linode:index/networkingIpAssignment:NetworkingIpAssignment", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private NetworkingIpAssignment(java.lang.String name, Output<java.lang.String> id, @Nullable NetworkingIpAssignmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("linode:index/networkingIpAssignment:NetworkingIpAssignment", name, state, makeResourceOptions(options, id), false);
    }

    private static NetworkingIpAssignmentArgs makeArgs(NetworkingIpAssignmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? NetworkingIpAssignmentArgs.Empty : args;
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
    public static NetworkingIpAssignment get(java.lang.String name, Output<java.lang.String> id, @Nullable NetworkingIpAssignmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NetworkingIpAssignment(name, id, state, options);
    }
}
