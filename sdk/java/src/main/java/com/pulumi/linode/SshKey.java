// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.linode.SshKeyArgs;
import com.pulumi.linode.Utilities;
import com.pulumi.linode.inputs.SshKeyState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Linode SSH Key resource.  This can be used to create, modify, and delete Linodes SSH Keys.  Managed SSH Keys allow instances to be created with a list of Linode usernames, whose SSH keys will be automatically applied to the root account&#39;s `~/.ssh/authorized_keys` file.
 * For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-ssh-keys).
 * 
 * **NOTE**: This does not generate a new ssh key, you must have an existing key generated and saved locally.
 * 
 * ## Example Usage
 * 
 * The following example shows how one might use this resource to configure a SSH Key for access to a Linode Instance.
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.linode.SshKey;
 * import com.pulumi.linode.SshKeyArgs;
 * import com.pulumi.std.StdFunctions;
 * import com.pulumi.std.inputs.FileArgs;
 * import com.pulumi.std.inputs.ChompArgs;
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
 *         var foo = new SshKey("foo", SshKeyArgs.builder()
 *             .label("foo")
 *             .sshKey(StdFunctions.chomp(ChompArgs.builder()
 *                 .input(StdFunctions.file(FileArgs.builder()
 *                     .input("~/.ssh/id_rsa.pub")
 *                     .build()).result())
 *                 .build()).result())
 *             .build());
 * 
 *         var fooInstance = new Instance("fooInstance", InstanceArgs.builder()
 *             .image("linode/ubuntu22.04")
 *             .label("foo")
 *             .region("us-east")
 *             .type("g6-nanode-1")
 *             .authorizedKeys(foo.sshKey())
 *             .rootPass("...")
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
 * Linodes SSH Keys can be imported using the Linode SSH Key `id`, e.g.
 * 
 * ```sh
 * $ pulumi import linode:index/sshKey:SshKey mysshkey 1234567
 * ```
 * 
 */
@ResourceType(type="linode:index/sshKey:SshKey")
public class SshKey extends com.pulumi.resources.CustomResource {
    /**
     * The date this SSH Key was created.
     * 
     */
    @Export(name="created", refs={String.class}, tree="[0]")
    private Output<String> created;

    /**
     * @return The date this SSH Key was created.
     * 
     */
    public Output<String> created() {
        return this.created;
    }
    /**
     * A label for the SSH Key.
     * 
     */
    @Export(name="label", refs={String.class}, tree="[0]")
    private Output<String> label;

    /**
     * @return A label for the SSH Key.
     * 
     */
    public Output<String> label() {
        return this.label;
    }
    /**
     * The public SSH Key, which is used to authenticate to the root user of the Linodes you deploy.
     * 
     */
    @Export(name="sshKey", refs={String.class}, tree="[0]")
    private Output<String> sshKey;

    /**
     * @return The public SSH Key, which is used to authenticate to the root user of the Linodes you deploy.
     * 
     */
    public Output<String> sshKey() {
        return this.sshKey;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SshKey(java.lang.String name) {
        this(name, SshKeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SshKey(java.lang.String name, SshKeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SshKey(java.lang.String name, SshKeyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("linode:index/sshKey:SshKey", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private SshKey(java.lang.String name, Output<java.lang.String> id, @Nullable SshKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("linode:index/sshKey:SshKey", name, state, makeResourceOptions(options, id), false);
    }

    private static SshKeyArgs makeArgs(SshKeyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? SshKeyArgs.Empty : args;
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
    public static SshKey get(java.lang.String name, Output<java.lang.String> id, @Nullable SshKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SshKey(name, id, state, options);
    }
}
