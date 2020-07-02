// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Linode Token resource.  This can be used to create, modify, and delete Linode API Personal Access Tokens.  Personal Access Tokens proxy user credentials for Linode API access.  This is necessary for tools, to interact with Linode services on a user's behalf.
 *
 * It is common for the provider itself to be configured with broadly scoped Personal Access Tokens.  Provisioning scripts or tools configured within a Linode Instance should follow the principle of least privilege to afford only the required roles for tools to perform their necessary tasks.  The `linode.Token` resource allows for the management of Personal Access Tokens with scopes mirroring or narrowing the scope of the parent token.
 *
 * For more information, see the [Linode APIv4 docs](https://developers.linode.com/api/v4#operation/getTokens).
 *
 * ## Example Usage
 *
 * The following example shows how one might use this resource to configure a token for use in another tool that needs access to Linode resources.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const fooToken = new linode.Token("foo", {
 *     expiry: "2100-01-02T03:04:05Z",
 *     label: "token",
 *     scopes: "linodes:read_only",
 * });
 * const fooInstance = new linode.Instance("foo", {});
 * ```
 * ## Attributes
 *
 * This resource exports the following attributes:
 *
 * * `token` - The token used to access the API.
 *
 * * `created` - The date this Token was created.
 */
export class Token extends pulumi.CustomResource {
    /**
     * Get an existing Token resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TokenState, opts?: pulumi.CustomResourceOptions): Token {
        return new Token(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'linode:index/token:Token';

    /**
     * Returns true if the given object is an instance of Token.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Token {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Token.__pulumiType;
    }

    /**
     * The date and time this token was created.
     */
    public /*out*/ readonly created!: pulumi.Output<string>;
    /**
     * When this token will expire. Personal Access Tokens cannot be renewed, so after this time the token will be completely unusable and a new token will need to be generated. Tokens may be created with 'null' as their expiry and will never expire unless revoked.
     */
    public readonly expiry!: pulumi.Output<string | undefined>;
    /**
     * A label for the Token.
     */
    public readonly label!: pulumi.Output<string | undefined>;
    /**
     * The scopes this token was created with. These define what parts of the Account the token can be used to access. Many command-line tools, such as the Linode CLI, require tokens with access to *. Tokens with more restrictive scopes are generally more secure.
     */
    public readonly scopes!: pulumi.Output<string>;
    /**
     * The token used to access the API.
     */
    public /*out*/ readonly token!: pulumi.Output<string>;

    /**
     * Create a Token resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: TokenArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TokenArgs | TokenState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as TokenState | undefined;
            inputs["created"] = state ? state.created : undefined;
            inputs["expiry"] = state ? state.expiry : undefined;
            inputs["label"] = state ? state.label : undefined;
            inputs["scopes"] = state ? state.scopes : undefined;
            inputs["token"] = state ? state.token : undefined;
        } else {
            const args = argsOrState as TokenArgs | undefined;
            if (!args || args.scopes === undefined) {
                throw new Error("Missing required property 'scopes'");
            }
            inputs["expiry"] = args ? args.expiry : undefined;
            inputs["label"] = args ? args.label : undefined;
            inputs["scopes"] = args ? args.scopes : undefined;
            inputs["created"] = undefined /*out*/;
            inputs["token"] = undefined /*out*/;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(Token.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Token resources.
 */
export interface TokenState {
    /**
     * The date and time this token was created.
     */
    readonly created?: pulumi.Input<string>;
    /**
     * When this token will expire. Personal Access Tokens cannot be renewed, so after this time the token will be completely unusable and a new token will need to be generated. Tokens may be created with 'null' as their expiry and will never expire unless revoked.
     */
    readonly expiry?: pulumi.Input<string>;
    /**
     * A label for the Token.
     */
    readonly label?: pulumi.Input<string>;
    /**
     * The scopes this token was created with. These define what parts of the Account the token can be used to access. Many command-line tools, such as the Linode CLI, require tokens with access to *. Tokens with more restrictive scopes are generally more secure.
     */
    readonly scopes?: pulumi.Input<string>;
    /**
     * The token used to access the API.
     */
    readonly token?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Token resource.
 */
export interface TokenArgs {
    /**
     * When this token will expire. Personal Access Tokens cannot be renewed, so after this time the token will be completely unusable and a new token will need to be generated. Tokens may be created with 'null' as their expiry and will never expire unless revoked.
     */
    readonly expiry?: pulumi.Input<string>;
    /**
     * A label for the Token.
     */
    readonly label?: pulumi.Input<string>;
    /**
     * The scopes this token was created with. These define what parts of the Account the token can be used to access. Many command-line tools, such as the Linode CLI, require tokens with access to *. Tokens with more restrictive scopes are generally more secure.
     */
    readonly scopes: pulumi.Input<string>;
}
