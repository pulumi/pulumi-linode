// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TokenArgs extends com.pulumi.resources.ResourceArgs {

    public static final TokenArgs Empty = new TokenArgs();

    /**
     * When this token will expire. Personal Access Tokens cannot be renewed, so after this time the token will be completely unusable and a new token will need to be generated. Tokens may be created with &#39;null&#39; as their expiry and will never expire unless revoked.
     * 
     */
    @Import(name="expiry")
    private @Nullable Output<String> expiry;

    /**
     * @return When this token will expire. Personal Access Tokens cannot be renewed, so after this time the token will be completely unusable and a new token will need to be generated. Tokens may be created with &#39;null&#39; as their expiry and will never expire unless revoked.
     * 
     */
    public Optional<Output<String>> expiry() {
        return Optional.ofNullable(this.expiry);
    }

    /**
     * A label for the Token.
     * 
     */
    @Import(name="label")
    private @Nullable Output<String> label;

    /**
     * @return A label for the Token.
     * 
     */
    public Optional<Output<String>> label() {
        return Optional.ofNullable(this.label);
    }

    /**
     * The scopes this token was created with. These define what parts of the Account the token can be used to access. Many command-line tools, such as the Linode CLI, require tokens with access to *. Tokens with more restrictive scopes are generally more secure. All scopes can be viewed in [the Linode API documentation](https://www.linode.com/docs/api/#oauth-reference).
     * 
     */
    @Import(name="scopes", required=true)
    private Output<String> scopes;

    /**
     * @return The scopes this token was created with. These define what parts of the Account the token can be used to access. Many command-line tools, such as the Linode CLI, require tokens with access to *. Tokens with more restrictive scopes are generally more secure. All scopes can be viewed in [the Linode API documentation](https://www.linode.com/docs/api/#oauth-reference).
     * 
     */
    public Output<String> scopes() {
        return this.scopes;
    }

    private TokenArgs() {}

    private TokenArgs(TokenArgs $) {
        this.expiry = $.expiry;
        this.label = $.label;
        this.scopes = $.scopes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TokenArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TokenArgs $;

        public Builder() {
            $ = new TokenArgs();
        }

        public Builder(TokenArgs defaults) {
            $ = new TokenArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param expiry When this token will expire. Personal Access Tokens cannot be renewed, so after this time the token will be completely unusable and a new token will need to be generated. Tokens may be created with &#39;null&#39; as their expiry and will never expire unless revoked.
         * 
         * @return builder
         * 
         */
        public Builder expiry(@Nullable Output<String> expiry) {
            $.expiry = expiry;
            return this;
        }

        /**
         * @param expiry When this token will expire. Personal Access Tokens cannot be renewed, so after this time the token will be completely unusable and a new token will need to be generated. Tokens may be created with &#39;null&#39; as their expiry and will never expire unless revoked.
         * 
         * @return builder
         * 
         */
        public Builder expiry(String expiry) {
            return expiry(Output.of(expiry));
        }

        /**
         * @param label A label for the Token.
         * 
         * @return builder
         * 
         */
        public Builder label(@Nullable Output<String> label) {
            $.label = label;
            return this;
        }

        /**
         * @param label A label for the Token.
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            return label(Output.of(label));
        }

        /**
         * @param scopes The scopes this token was created with. These define what parts of the Account the token can be used to access. Many command-line tools, such as the Linode CLI, require tokens with access to *. Tokens with more restrictive scopes are generally more secure. All scopes can be viewed in [the Linode API documentation](https://www.linode.com/docs/api/#oauth-reference).
         * 
         * @return builder
         * 
         */
        public Builder scopes(Output<String> scopes) {
            $.scopes = scopes;
            return this;
        }

        /**
         * @param scopes The scopes this token was created with. These define what parts of the Account the token can be used to access. Many command-line tools, such as the Linode CLI, require tokens with access to *. Tokens with more restrictive scopes are generally more secure. All scopes can be viewed in [the Linode API documentation](https://www.linode.com/docs/api/#oauth-reference).
         * 
         * @return builder
         * 
         */
        public Builder scopes(String scopes) {
            return scopes(Output.of(scopes));
        }

        public TokenArgs build() {
            $.scopes = Objects.requireNonNull($.scopes, "expected parameter 'scopes' to be non-null");
            return $;
        }
    }

}
