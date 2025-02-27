// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.linode.UserArgs;
import com.pulumi.linode.Utilities;
import com.pulumi.linode.inputs.UserState;
import com.pulumi.linode.outputs.UserDomainGrant;
import com.pulumi.linode.outputs.UserFirewallGrant;
import com.pulumi.linode.outputs.UserGlobalGrants;
import com.pulumi.linode.outputs.UserImageGrant;
import com.pulumi.linode.outputs.UserLinodeGrant;
import com.pulumi.linode.outputs.UserLongviewGrant;
import com.pulumi.linode.outputs.UserNodebalancerGrant;
import com.pulumi.linode.outputs.UserPlacementGroupGrant;
import com.pulumi.linode.outputs.UserStackscriptGrant;
import com.pulumi.linode.outputs.UserVolumeGrant;
import com.pulumi.linode.outputs.UserVpcGrant;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Linode User.
 * For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/post-user).
 * 
 * ## Example Usage
 * 
 * Create an unrestricted user:
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.linode.User;
 * import com.pulumi.linode.UserArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App }{{@code
 *     public static void main(String[] args) }{{@code
 *         Pulumi.run(App::stack);
 *     }}{@code
 * 
 *     public static void stack(Context ctx) }{{@code
 *         var john = new User("john", UserArgs.builder()
 *             .username("john123")
 *             .email("john}{@literal @}{@code acme.io")
 *             .build());
 * 
 *     }}{@code
 * }}{@code
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * Create a restricted user with grants:
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.linode.User;
 * import com.pulumi.linode.UserArgs;
 * import com.pulumi.linode.inputs.UserGlobalGrantsArgs;
 * import com.pulumi.linode.inputs.UserLinodeGrantArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App }{{@code
 *     public static void main(String[] args) }{{@code
 *         Pulumi.run(App::stack);
 *     }}{@code
 * 
 *     public static void stack(Context ctx) }{{@code
 *         var fooser = new User("fooser", UserArgs.builder()
 *             .username("cooluser123")
 *             .email("cool}{@literal @}{@code acme.io")
 *             .restricted(true)
 *             .globalGrants(UserGlobalGrantsArgs.builder()
 *                 .addLinodes(true)
 *                 .addImages(true)
 *                 .build())
 *             .linodeGrants(UserLinodeGrantArgs.builder()
 *                 .id(12345)
 *                 .permissions("read_write")
 *                 .build())
 *             .build());
 * 
 *     }}{@code
 * }}{@code
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Global Grants
 * 
 * * `account_access` - (optional) The level of access this User has to Account-level actions, like billing information. (`read_only`, `read_write`)
 * 
 * * `add_domains` - (optional) If true, this User may add Domains.
 * 
 * * `add_databases` - (optional) If true, this User may add Databases.
 * 
 * * `add_firewalls` - (optional) If true, this User may add Firewalls.
 * 
 * * `add_images` - (optional) If true, this User may add Images.
 * 
 * * `add_linodes` - (optional) If true, this User may create Linodes.
 * 
 * * `add_longview` - (optional) If true, this User may create Longview clients and view the current plan.
 * 
 * * `add_nodebalancers` - (optional) If true, this User may add NodeBalancers.
 * 
 * * `add_placement_groups` - (optional) If true, this User may add Placement Groups.
 * 
 * * `add_stackscripts` - (optional) If true, this User may add StackScripts.
 * 
 * * `add_vpcs` - (optional) If true, this User may add Virtual Private Clouds (VPCs).
 * 
 * * `cancel_account` - (optional) If true, this User may cancel the entire Account.
 * 
 * * `longview_subscription` - (optional) If true, this User may manage the Account’s Longview subscription.
 * 
 * ## Entity Grants
 * 
 * * `id` - (required) The ID of the entity this grant applies to.
 * 
 * * `permissions` - (required) The level of access this User has to this entity. (`read_only`, `read_write`)
 * 
 */
@ResourceType(type="linode:index/user:User")
public class User extends com.pulumi.resources.CustomResource {
    /**
     * The domains the user has permissions access to.
     * 
     */
    @Export(name="domainGrants", refs={List.class,UserDomainGrant.class}, tree="[0,1]")
    private Output<List<UserDomainGrant>> domainGrants;

    /**
     * @return The domains the user has permissions access to.
     * 
     */
    public Output<List<UserDomainGrant>> domainGrants() {
        return this.domainGrants;
    }
    /**
     * The email address of the user.
     * 
     */
    @Export(name="email", refs={String.class}, tree="[0]")
    private Output<String> email;

    /**
     * @return The email address of the user.
     * 
     */
    public Output<String> email() {
        return this.email;
    }
    /**
     * The firewalls the user has permissions access to.
     * 
     */
    @Export(name="firewallGrants", refs={List.class,UserFirewallGrant.class}, tree="[0,1]")
    private Output<List<UserFirewallGrant>> firewallGrants;

    /**
     * @return The firewalls the user has permissions access to.
     * 
     */
    public Output<List<UserFirewallGrant>> firewallGrants() {
        return this.firewallGrants;
    }
    /**
     * A structure containing the Account-level grants a User has.
     * 
     */
    @Export(name="globalGrants", refs={UserGlobalGrants.class}, tree="[0]")
    private Output<UserGlobalGrants> globalGrants;

    /**
     * @return A structure containing the Account-level grants a User has.
     * 
     */
    public Output<UserGlobalGrants> globalGrants() {
        return this.globalGrants;
    }
    /**
     * The images the user has permissions access to.
     * 
     */
    @Export(name="imageGrants", refs={List.class,UserImageGrant.class}, tree="[0,1]")
    private Output<List<UserImageGrant>> imageGrants;

    /**
     * @return The images the user has permissions access to.
     * 
     */
    public Output<List<UserImageGrant>> imageGrants() {
        return this.imageGrants;
    }
    /**
     * The Linodes the user has permissions access to.
     * 
     */
    @Export(name="linodeGrants", refs={List.class,UserLinodeGrant.class}, tree="[0,1]")
    private Output<List<UserLinodeGrant>> linodeGrants;

    /**
     * @return The Linodes the user has permissions access to.
     * 
     */
    public Output<List<UserLinodeGrant>> linodeGrants() {
        return this.linodeGrants;
    }
    /**
     * The longview the user has permissions access to.
     * 
     */
    @Export(name="longviewGrants", refs={List.class,UserLongviewGrant.class}, tree="[0,1]")
    private Output<List<UserLongviewGrant>> longviewGrants;

    /**
     * @return The longview the user has permissions access to.
     * 
     */
    public Output<List<UserLongviewGrant>> longviewGrants() {
        return this.longviewGrants;
    }
    /**
     * The NodeBalancers the user has permissions access to.
     * 
     */
    @Export(name="nodebalancerGrants", refs={List.class,UserNodebalancerGrant.class}, tree="[0,1]")
    private Output<List<UserNodebalancerGrant>> nodebalancerGrants;

    /**
     * @return The NodeBalancers the user has permissions access to.
     * 
     */
    public Output<List<UserNodebalancerGrant>> nodebalancerGrants() {
        return this.nodebalancerGrants;
    }
    /**
     * The Placement Groups the user has permissions access to.
     * 
     */
    @Export(name="placementGroupGrants", refs={List.class,UserPlacementGroupGrant.class}, tree="[0,1]")
    private Output<List<UserPlacementGroupGrant>> placementGroupGrants;

    /**
     * @return The Placement Groups the user has permissions access to.
     * 
     */
    public Output<List<UserPlacementGroupGrant>> placementGroupGrants() {
        return this.placementGroupGrants;
    }
    /**
     * If true, this user will only have explicit permissions granted.
     * 
     * * `global_grants` - (optional) A structure containing the Account-level grants a User has.
     * 
     * The following arguments are sets of entity grants:
     * 
     */
    @Export(name="restricted", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> restricted;

    /**
     * @return If true, this user will only have explicit permissions granted.
     * 
     * * `global_grants` - (optional) A structure containing the Account-level grants a User has.
     * 
     * The following arguments are sets of entity grants:
     * 
     */
    public Output<Optional<Boolean>> restricted() {
        return Codegen.optional(this.restricted);
    }
    /**
     * A list of the User&#39;s SSH keys.
     * 
     */
    @Export(name="sshKeys", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> sshKeys;

    /**
     * @return A list of the User&#39;s SSH keys.
     * 
     */
    public Output<List<String>> sshKeys() {
        return this.sshKeys;
    }
    /**
     * The StackScripts the user has permissions access to.
     * 
     */
    @Export(name="stackscriptGrants", refs={List.class,UserStackscriptGrant.class}, tree="[0,1]")
    private Output<List<UserStackscriptGrant>> stackscriptGrants;

    /**
     * @return The StackScripts the user has permissions access to.
     * 
     */
    public Output<List<UserStackscriptGrant>> stackscriptGrants() {
        return this.stackscriptGrants;
    }
    /**
     * Whether the user has two-factor-authentication enabled.
     * 
     */
    @Export(name="tfaEnabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> tfaEnabled;

    /**
     * @return Whether the user has two-factor-authentication enabled.
     * 
     */
    public Output<Boolean> tfaEnabled() {
        return this.tfaEnabled;
    }
    /**
     * The type of this user.
     * 
     */
    @Export(name="userType", refs={String.class}, tree="[0]")
    private Output<String> userType;

    /**
     * @return The type of this user.
     * 
     */
    public Output<String> userType() {
        return this.userType;
    }
    /**
     * The username of the user.
     * 
     */
    @Export(name="username", refs={String.class}, tree="[0]")
    private Output<String> username;

    /**
     * @return The username of the user.
     * 
     */
    public Output<String> username() {
        return this.username;
    }
    /**
     * The volumes the user has permissions access to.
     * 
     */
    @Export(name="volumeGrants", refs={List.class,UserVolumeGrant.class}, tree="[0,1]")
    private Output<List<UserVolumeGrant>> volumeGrants;

    /**
     * @return The volumes the user has permissions access to.
     * 
     */
    public Output<List<UserVolumeGrant>> volumeGrants() {
        return this.volumeGrants;
    }
    /**
     * The Virtual Private Clouds (VPCs) the user has permissions access to.
     * 
     */
    @Export(name="vpcGrants", refs={List.class,UserVpcGrant.class}, tree="[0,1]")
    private Output<List<UserVpcGrant>> vpcGrants;

    /**
     * @return The Virtual Private Clouds (VPCs) the user has permissions access to.
     * 
     */
    public Output<List<UserVpcGrant>> vpcGrants() {
        return this.vpcGrants;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public User(java.lang.String name) {
        this(name, UserArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public User(java.lang.String name, UserArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public User(java.lang.String name, UserArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("linode:index/user:User", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private User(java.lang.String name, Output<java.lang.String> id, @Nullable UserState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("linode:index/user:User", name, state, makeResourceOptions(options, id), false);
    }

    private static UserArgs makeArgs(UserArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? UserArgs.Empty : args;
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
    public static User get(java.lang.String name, Output<java.lang.String> id, @Nullable UserState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new User(name, id, state, options);
    }
}
