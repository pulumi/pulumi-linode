// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode
{
    /// <summary>
    /// Provides a Linode Token resource.  This can be used to create, modify, and delete Linode API Personal Access Tokens.  Personal Access Tokens proxy user credentials for Linode API access.  This is necessary for tools, to interact with Linode services on a user's behalf.
    /// 
    /// It is common for the provider itself to be configured with broadly scoped Personal Access Tokens.  Provisioning scripts or tools configured within a Linode Instance should follow the principle of least privilege to afford only the required roles for tools to perform their necessary tasks.  The `linode.Token` resource allows for the management of Personal Access Tokens with scopes mirroring or narrowing the scope of the parent token.
    /// 
    /// For more information, see the [Linode APIv4 docs](https://developers.linode.com/api/v4#operation/getTokens).
    /// 
    /// ## Example Usage
    /// 
    /// The following example shows how one might use this resource to configure a token for use in another tool that needs access to Linode resources.
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Linode = Pulumi.Linode;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var fooToken = new Linode.Token("fooToken", new()
    ///     {
    ///         Expiry = "2100-01-02T03:04:05Z",
    ///         Label = "token",
    ///         Scopes = "linodes:read_only",
    ///     });
    /// 
    ///     var fooInstance = new Linode.Instance("fooInstance");
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Linodes Tokens can be imported using the Linode Token `id`, e.g.
    /// 
    /// The secret token will not be imported.
    /// 
    /// ```sh
    ///  $ pulumi import linode:index/token:Token mytoken 1234567
    /// ```
    /// </summary>
    [LinodeResourceType("linode:index/token:Token")]
    public partial class Token : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The date this Token was created.
        /// </summary>
        [Output("created")]
        public Output<string> Created { get; private set; } = null!;

        /// <summary>
        /// When this token will expire. Personal Access Tokens cannot be renewed, so after this time the token will be completely unusable and a new token will need to be generated. Tokens may be created with 'null' as their expiry and will never expire unless revoked.
        /// </summary>
        [Output("expiry")]
        public Output<string?> Expiry { get; private set; } = null!;

        /// <summary>
        /// A label for the Token.
        /// </summary>
        [Output("label")]
        public Output<string?> Label { get; private set; } = null!;

        /// <summary>
        /// The scopes this token was created with. These define what parts of the Account the token can be used to access. Many command-line tools, such as the Linode CLI, require tokens with access to *. Tokens with more restrictive scopes are generally more secure. All scopes can be viewed in [the Linode API documentation](https://www.linode.com/docs/api/#oauth-reference).
        /// </summary>
        [Output("scopes")]
        public Output<string> Scopes { get; private set; } = null!;

        /// <summary>
        /// The token used to access the API.
        /// </summary>
        [Output("token")]
        public Output<string> TokenName { get; private set; } = null!;


        /// <summary>
        /// Create a Token resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Token(string name, TokenArgs args, CustomResourceOptions? options = null)
            : base("linode:index/token:Token", name, args ?? new TokenArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Token(string name, Input<string> id, TokenState? state = null, CustomResourceOptions? options = null)
            : base("linode:index/token:Token", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Token resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Token Get(string name, Input<string> id, TokenState? state = null, CustomResourceOptions? options = null)
        {
            return new Token(name, id, state, options);
        }
    }

    public sealed class TokenArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// When this token will expire. Personal Access Tokens cannot be renewed, so after this time the token will be completely unusable and a new token will need to be generated. Tokens may be created with 'null' as their expiry and will never expire unless revoked.
        /// </summary>
        [Input("expiry")]
        public Input<string>? Expiry { get; set; }

        /// <summary>
        /// A label for the Token.
        /// </summary>
        [Input("label")]
        public Input<string>? Label { get; set; }

        /// <summary>
        /// The scopes this token was created with. These define what parts of the Account the token can be used to access. Many command-line tools, such as the Linode CLI, require tokens with access to *. Tokens with more restrictive scopes are generally more secure. All scopes can be viewed in [the Linode API documentation](https://www.linode.com/docs/api/#oauth-reference).
        /// </summary>
        [Input("scopes", required: true)]
        public Input<string> Scopes { get; set; } = null!;

        public TokenArgs()
        {
        }
        public static new TokenArgs Empty => new TokenArgs();
    }

    public sealed class TokenState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The date this Token was created.
        /// </summary>
        [Input("created")]
        public Input<string>? Created { get; set; }

        /// <summary>
        /// When this token will expire. Personal Access Tokens cannot be renewed, so after this time the token will be completely unusable and a new token will need to be generated. Tokens may be created with 'null' as their expiry and will never expire unless revoked.
        /// </summary>
        [Input("expiry")]
        public Input<string>? Expiry { get; set; }

        /// <summary>
        /// A label for the Token.
        /// </summary>
        [Input("label")]
        public Input<string>? Label { get; set; }

        /// <summary>
        /// The scopes this token was created with. These define what parts of the Account the token can be used to access. Many command-line tools, such as the Linode CLI, require tokens with access to *. Tokens with more restrictive scopes are generally more secure. All scopes can be viewed in [the Linode API documentation](https://www.linode.com/docs/api/#oauth-reference).
        /// </summary>
        [Input("scopes")]
        public Input<string>? Scopes { get; set; }

        /// <summary>
        /// The token used to access the API.
        /// </summary>
        [Input("token")]
        public Input<string>? TokenName { get; set; }

        public TokenState()
        {
        }
        public static new TokenState Empty => new TokenState();
    }
}
