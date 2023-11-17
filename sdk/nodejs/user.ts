// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Manages a Linode User.
 *
 * ## Example Usage
 *
 * Create an unrestricted user:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const john = new linode.User("john", {
 *     email: "john@acme.io",
 *     username: "john123",
 * });
 * ```
 *
 * Create a restricted user with grants:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const fooser = new linode.User("fooser", {
 *     email: "cool@acme.io",
 *     globalGrants: {
 *         addImages: true,
 *         addLinodes: true,
 *     },
 *     linodeGrants: [{
 *         id: 12345,
 *         permissions: "read_write",
 *     }],
 *     restricted: true,
 *     username: "cooluser123",
 * });
 * ```
 * ## Global Grants
 *
 * * `account-access` - (optional) The level of access this User has to Account-level actions, like billing information. (`readOnly`, `readWrite`)
 *
 * * `addDomains` - (optional) If true, this User may add Domains.
 *
 * * `addDatabases` - (optional) If true, this User may add Databases.
 *
 * * `addFirewalls` - (optional) If true, this User may add Firewalls.
 *
 * * `addImages` - (optional) If true, this User may add Images.
 *
 * * `addLinodes` - (optional) If true, this User may create Linodes.
 *
 * * `addLongview` - (optional) If true, this User may create Longview clients and view the current plan.
 *
 * * `addNodebalancers` - (optional) If true, this User may add NodeBalancers.
 *
 * * `addStackscripts` - (optional) If true, this User may add StackScripts.
 *
 * * `cancelAccount` - (optional) If true, this User may cancel the entire Account.
 *
 * * `longviewSubscription` - (optional) If true, this User may manage the Account’s Longview subscription.
 *
 * ## Entity Grants
 *
 * * `id` - (required) The ID of the entity this grant applies to.
 *
 * * `permissions` - (required) The level of access this User has to this entity. (`readOnly`, `readWrite`)
 */
export class User extends pulumi.CustomResource {
    /**
     * Get an existing User resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: UserState, opts?: pulumi.CustomResourceOptions): User {
        return new User(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'linode:index/user:User';

    /**
     * Returns true if the given object is an instance of User.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is User {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === User.__pulumiType;
    }

    /**
     * The domains the user has permissions access to.
     */
    public readonly domainGrants!: pulumi.Output<outputs.UserDomainGrant[]>;
    /**
     * The email address of the user.
     */
    public readonly email!: pulumi.Output<string>;
    /**
     * The firewalls the user has permissions access to.
     */
    public readonly firewallGrants!: pulumi.Output<outputs.UserFirewallGrant[]>;
    /**
     * `globalGrants` - (optional) A structure containing the Account-level grants a User has.
     *
     * The following arguments are sets of entity grants:
     */
    public readonly globalGrants!: pulumi.Output<outputs.UserGlobalGrants>;
    /**
     * The images the user has permissions access to.
     */
    public readonly imageGrants!: pulumi.Output<outputs.UserImageGrant[]>;
    /**
     * The Linodes the user has permissions access to.
     */
    public readonly linodeGrants!: pulumi.Output<outputs.UserLinodeGrant[]>;
    /**
     * The longview the user has permissions access to.
     */
    public readonly longviewGrants!: pulumi.Output<outputs.UserLongviewGrant[]>;
    /**
     * The NodeBalancers the user has permissions access to.
     */
    public readonly nodebalancerGrants!: pulumi.Output<outputs.UserNodebalancerGrant[]>;
    /**
     * If true, this user will only have explicit permissions granted.
     */
    public readonly restricted!: pulumi.Output<boolean | undefined>;
    /**
     * A list of the User's SSH keys.
     */
    public /*out*/ readonly sshKeys!: pulumi.Output<string[]>;
    /**
     * The StackScripts the user has permissions access to.
     */
    public readonly stackscriptGrants!: pulumi.Output<outputs.UserStackscriptGrant[]>;
    /**
     * Whether the user has two-factor-authentication enabled.
     */
    public /*out*/ readonly tfaEnabled!: pulumi.Output<boolean>;
    /**
     * The username of the user.
     */
    public readonly username!: pulumi.Output<string>;
    /**
     * The volumes the user has permissions access to.
     */
    public readonly volumeGrants!: pulumi.Output<outputs.UserVolumeGrant[]>;

    /**
     * Create a User resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: UserArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: UserArgs | UserState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as UserState | undefined;
            resourceInputs["domainGrants"] = state ? state.domainGrants : undefined;
            resourceInputs["email"] = state ? state.email : undefined;
            resourceInputs["firewallGrants"] = state ? state.firewallGrants : undefined;
            resourceInputs["globalGrants"] = state ? state.globalGrants : undefined;
            resourceInputs["imageGrants"] = state ? state.imageGrants : undefined;
            resourceInputs["linodeGrants"] = state ? state.linodeGrants : undefined;
            resourceInputs["longviewGrants"] = state ? state.longviewGrants : undefined;
            resourceInputs["nodebalancerGrants"] = state ? state.nodebalancerGrants : undefined;
            resourceInputs["restricted"] = state ? state.restricted : undefined;
            resourceInputs["sshKeys"] = state ? state.sshKeys : undefined;
            resourceInputs["stackscriptGrants"] = state ? state.stackscriptGrants : undefined;
            resourceInputs["tfaEnabled"] = state ? state.tfaEnabled : undefined;
            resourceInputs["username"] = state ? state.username : undefined;
            resourceInputs["volumeGrants"] = state ? state.volumeGrants : undefined;
        } else {
            const args = argsOrState as UserArgs | undefined;
            if ((!args || args.email === undefined) && !opts.urn) {
                throw new Error("Missing required property 'email'");
            }
            if ((!args || args.username === undefined) && !opts.urn) {
                throw new Error("Missing required property 'username'");
            }
            resourceInputs["domainGrants"] = args ? args.domainGrants : undefined;
            resourceInputs["email"] = args ? args.email : undefined;
            resourceInputs["firewallGrants"] = args ? args.firewallGrants : undefined;
            resourceInputs["globalGrants"] = args ? args.globalGrants : undefined;
            resourceInputs["imageGrants"] = args ? args.imageGrants : undefined;
            resourceInputs["linodeGrants"] = args ? args.linodeGrants : undefined;
            resourceInputs["longviewGrants"] = args ? args.longviewGrants : undefined;
            resourceInputs["nodebalancerGrants"] = args ? args.nodebalancerGrants : undefined;
            resourceInputs["restricted"] = args ? args.restricted : undefined;
            resourceInputs["stackscriptGrants"] = args ? args.stackscriptGrants : undefined;
            resourceInputs["username"] = args ? args.username : undefined;
            resourceInputs["volumeGrants"] = args ? args.volumeGrants : undefined;
            resourceInputs["sshKeys"] = undefined /*out*/;
            resourceInputs["tfaEnabled"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(User.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering User resources.
 */
export interface UserState {
    /**
     * The domains the user has permissions access to.
     */
    domainGrants?: pulumi.Input<pulumi.Input<inputs.UserDomainGrant>[]>;
    /**
     * The email address of the user.
     */
    email?: pulumi.Input<string>;
    /**
     * The firewalls the user has permissions access to.
     */
    firewallGrants?: pulumi.Input<pulumi.Input<inputs.UserFirewallGrant>[]>;
    /**
     * `globalGrants` - (optional) A structure containing the Account-level grants a User has.
     *
     * The following arguments are sets of entity grants:
     */
    globalGrants?: pulumi.Input<inputs.UserGlobalGrants>;
    /**
     * The images the user has permissions access to.
     */
    imageGrants?: pulumi.Input<pulumi.Input<inputs.UserImageGrant>[]>;
    /**
     * The Linodes the user has permissions access to.
     */
    linodeGrants?: pulumi.Input<pulumi.Input<inputs.UserLinodeGrant>[]>;
    /**
     * The longview the user has permissions access to.
     */
    longviewGrants?: pulumi.Input<pulumi.Input<inputs.UserLongviewGrant>[]>;
    /**
     * The NodeBalancers the user has permissions access to.
     */
    nodebalancerGrants?: pulumi.Input<pulumi.Input<inputs.UserNodebalancerGrant>[]>;
    /**
     * If true, this user will only have explicit permissions granted.
     */
    restricted?: pulumi.Input<boolean>;
    /**
     * A list of the User's SSH keys.
     */
    sshKeys?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The StackScripts the user has permissions access to.
     */
    stackscriptGrants?: pulumi.Input<pulumi.Input<inputs.UserStackscriptGrant>[]>;
    /**
     * Whether the user has two-factor-authentication enabled.
     */
    tfaEnabled?: pulumi.Input<boolean>;
    /**
     * The username of the user.
     */
    username?: pulumi.Input<string>;
    /**
     * The volumes the user has permissions access to.
     */
    volumeGrants?: pulumi.Input<pulumi.Input<inputs.UserVolumeGrant>[]>;
}

/**
 * The set of arguments for constructing a User resource.
 */
export interface UserArgs {
    /**
     * The domains the user has permissions access to.
     */
    domainGrants?: pulumi.Input<pulumi.Input<inputs.UserDomainGrant>[]>;
    /**
     * The email address of the user.
     */
    email: pulumi.Input<string>;
    /**
     * The firewalls the user has permissions access to.
     */
    firewallGrants?: pulumi.Input<pulumi.Input<inputs.UserFirewallGrant>[]>;
    /**
     * `globalGrants` - (optional) A structure containing the Account-level grants a User has.
     *
     * The following arguments are sets of entity grants:
     */
    globalGrants?: pulumi.Input<inputs.UserGlobalGrants>;
    /**
     * The images the user has permissions access to.
     */
    imageGrants?: pulumi.Input<pulumi.Input<inputs.UserImageGrant>[]>;
    /**
     * The Linodes the user has permissions access to.
     */
    linodeGrants?: pulumi.Input<pulumi.Input<inputs.UserLinodeGrant>[]>;
    /**
     * The longview the user has permissions access to.
     */
    longviewGrants?: pulumi.Input<pulumi.Input<inputs.UserLongviewGrant>[]>;
    /**
     * The NodeBalancers the user has permissions access to.
     */
    nodebalancerGrants?: pulumi.Input<pulumi.Input<inputs.UserNodebalancerGrant>[]>;
    /**
     * If true, this user will only have explicit permissions granted.
     */
    restricted?: pulumi.Input<boolean>;
    /**
     * The StackScripts the user has permissions access to.
     */
    stackscriptGrants?: pulumi.Input<pulumi.Input<inputs.UserStackscriptGrant>[]>;
    /**
     * The username of the user.
     */
    username: pulumi.Input<string>;
    /**
     * The volumes the user has permissions access to.
     */
    volumeGrants?: pulumi.Input<pulumi.Input<inputs.UserVolumeGrant>[]>;
}
