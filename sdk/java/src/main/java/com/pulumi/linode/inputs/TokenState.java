// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TokenState extends com.pulumi.resources.ResourceArgs {

    public static final TokenState Empty = new TokenState();

    /**
     * The date this Token was created.
     * 
     */
    @Import(name="created")
    private @Nullable Output<String> created;

    /**
     * @return The date this Token was created.
     * 
     */
    public Optional<Output<String>> created() {
        return Optional.ofNullable(this.created);
    }

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
    @Import(name="scopes")
    private @Nullable Output<String> scopes;

    /**
     * @return The scopes this token was created with. These define what parts of the Account the token can be used to access. Many command-line tools, such as the Linode CLI, require tokens with access to *. Tokens with more restrictive scopes are generally more secure. All scopes can be viewed in [the Linode API documentation](https://www.linode.com/docs/api/#oauth-reference).
     * 
     */
    public Optional<Output<String>> scopes() {
        return Optional.ofNullable(this.scopes);
    }

    /**
     * The token used to access the API.
     * 
     */
    @Import(name="token")
    private @Nullable Output<String> token;

    /**
     * @return The token used to access the API.
     * 
     */
    public Optional<Output<String>> token() {
        return Optional.ofNullable(this.token);
    }

    private TokenState() {}

    private TokenState(TokenState $) {
        this.created = $.created;
        this.expiry = $.expiry;
        this.label = $.label;
        this.scopes = $.scopes;
        this.token = $.token;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TokenState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TokenState $;

        public Builder() {
            $ = new TokenState();
        }

        public Builder(TokenState defaults) {
            $ = new TokenState(Objects.requireNonNull(defaults));
        }

        /**
         * @param created The date this Token was created.
         * 
         * @return builder
         * 
         */
        public Builder created(@Nullable Output<String> created) {
            $.created = created;
            return this;
        }

        /**
         * @param created The date this Token was created.
         * 
         * @return builder
         * 
         */
        public Builder created(String created) {
            return created(Output.of(created));
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
        public Builder scopes(@Nullable Output<String> scopes) {
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

        /**
         * @param token The token used to access the API.
         * 
         * @return builder
         * 
         */
        public Builder token(@Nullable Output<String> token) {
            $.token = token;
            return this;
        }

        /**
         * @param token The token used to access the API.
         * 
         * @return builder
         * 
         */
        public Builder token(String token) {
            return token(Output.of(token));
        }

        public TokenState build() {
            return $;
        }
    }

}
