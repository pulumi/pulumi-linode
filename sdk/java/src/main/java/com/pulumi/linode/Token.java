// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.linode.TokenArgs;
import com.pulumi.linode.Utilities;
import com.pulumi.linode.inputs.TokenState;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Linode Token resource.  This can be used to create, modify, and delete Linode API Personal Access Tokens.  Personal Access Tokens proxy user credentials for Linode API access.  This is necessary for tools, to interact with Linode services on a user&#39;s behalf.
 * 
 * It is common for the provider itself to be configured with broadly scoped Personal Access Tokens.  Provisioning scripts or tools configured within a Linode Instance should follow the principle of least privilege to afford only the required roles for tools to perform their necessary tasks.  The `linode.Token` resource allows for the management of Personal Access Tokens with scopes mirroring or narrowing the scope of the parent token.
 * 
 * For more information, see the [Linode APIv4 docs](https://developers.linode.com/api/v4#operation/getTokens).
 * 
 * ## Example Usage
 * 
 * The following example shows how one might use this resource to configure a token for use in another tool that needs access to Linode resources.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.linode.Token;
 * import com.pulumi.linode.TokenArgs;
 * import com.pulumi.linode.Instance;
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
 *         var fooToken = new Token(&#34;fooToken&#34;, TokenArgs.builder()        
 *             .expiry(&#34;2100-01-02T03:04:05Z&#34;)
 *             .label(&#34;token&#34;)
 *             .scopes(&#34;linodes:read_only&#34;)
 *             .build());
 * 
 *         var fooInstance = new Instance(&#34;fooInstance&#34;);
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Linodes Tokens can be imported using the Linode Token `id`, e.g.
 * 
 * The secret token will not be imported.
 * 
 * ```sh
 *  $ pulumi import linode:index/token:Token mytoken 1234567
 * ```
 * 
 */
@ResourceType(type="linode:index/token:Token")
public class Token extends com.pulumi.resources.CustomResource {
    /**
     * The date this Token was created.
     * 
     */
    @Export(name="created", type=String.class, parameters={})
    private Output<String> created;

    /**
     * @return The date this Token was created.
     * 
     */
    public Output<String> created() {
        return this.created;
    }
    /**
     * When this token will expire. Personal Access Tokens cannot be renewed, so after this time the token will be completely unusable and a new token will need to be generated. Tokens may be created with &#39;null&#39; as their expiry and will never expire unless revoked.
     * 
     */
    @Export(name="expiry", type=String.class, parameters={})
    private Output</* @Nullable */ String> expiry;

    /**
     * @return When this token will expire. Personal Access Tokens cannot be renewed, so after this time the token will be completely unusable and a new token will need to be generated. Tokens may be created with &#39;null&#39; as their expiry and will never expire unless revoked.
     * 
     */
    public Output<Optional<String>> expiry() {
        return Codegen.optional(this.expiry);
    }
    /**
     * A label for the Token.
     * 
     */
    @Export(name="label", type=String.class, parameters={})
    private Output</* @Nullable */ String> label;

    /**
     * @return A label for the Token.
     * 
     */
    public Output<Optional<String>> label() {
        return Codegen.optional(this.label);
    }
    /**
     * The scopes this token was created with. These define what parts of the Account the token can be used to access. Many command-line tools, such as the Linode CLI, require tokens with access to *. Tokens with more restrictive scopes are generally more secure. All scopes can be viewed in [the Linode API documentation](https://www.linode.com/docs/api/#oauth-reference).
     * 
     */
    @Export(name="scopes", type=String.class, parameters={})
    private Output<String> scopes;

    /**
     * @return The scopes this token was created with. These define what parts of the Account the token can be used to access. Many command-line tools, such as the Linode CLI, require tokens with access to *. Tokens with more restrictive scopes are generally more secure. All scopes can be viewed in [the Linode API documentation](https://www.linode.com/docs/api/#oauth-reference).
     * 
     */
    public Output<String> scopes() {
        return this.scopes;
    }
    /**
     * The token used to access the API.
     * 
     */
    @Export(name="token", type=String.class, parameters={})
    private Output<String> token;

    /**
     * @return The token used to access the API.
     * 
     */
    public Output<String> token() {
        return this.token;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Token(String name) {
        this(name, TokenArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Token(String name, TokenArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Token(String name, TokenArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("linode:index/token:Token", name, args == null ? TokenArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Token(String name, Output<String> id, @Nullable TokenState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("linode:index/token:Token", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
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
    public static Token get(String name, Output<String> id, @Nullable TokenState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Token(name, id, state, options);
    }
}
