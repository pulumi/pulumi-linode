// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.linode.ProviderArgs;
import com.pulumi.linode.Utilities;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The provider type for the linode package. By default, resources use package-wide configuration
 * settings, however an explicit `Provider` instance may be created and passed during resource
 * construction to achieve fine-grained programmatic control over provider settings. See the
 * [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
 * 
 */
@ResourceType(type="pulumi:providers:linode")
public class Provider extends com.pulumi.resources.ProviderResource {
    /**
     * The version of Linode API.
     * 
     */
    @Export(name="apiVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> apiVersion;

    /**
     * @return The version of Linode API.
     * 
     */
    public Output<Optional<String>> apiVersion() {
        return Codegen.optional(this.apiVersion);
    }
    @Export(name="configPath", type=String.class, parameters={})
    private Output</* @Nullable */ String> configPath;

    public Output<Optional<String>> configPath() {
        return Codegen.optional(this.configPath);
    }
    @Export(name="configProfile", type=String.class, parameters={})
    private Output</* @Nullable */ String> configProfile;

    public Output<Optional<String>> configProfile() {
        return Codegen.optional(this.configProfile);
    }
    /**
     * The token that allows you access to your Linode account
     * 
     */
    @Export(name="token", type=String.class, parameters={})
    private Output</* @Nullable */ String> token;

    /**
     * @return The token that allows you access to your Linode account
     * 
     */
    public Output<Optional<String>> token() {
        return Codegen.optional(this.token);
    }
    /**
     * An HTTP User-Agent Prefix to prepend in API requests.
     * 
     */
    @Export(name="uaPrefix", type=String.class, parameters={})
    private Output</* @Nullable */ String> uaPrefix;

    /**
     * @return An HTTP User-Agent Prefix to prepend in API requests.
     * 
     */
    public Output<Optional<String>> uaPrefix() {
        return Codegen.optional(this.uaPrefix);
    }
    /**
     * The HTTP(S) API address of the Linode API to use.
     * 
     */
    @Export(name="url", type=String.class, parameters={})
    private Output</* @Nullable */ String> url;

    /**
     * @return The HTTP(S) API address of the Linode API to use.
     * 
     */
    public Output<Optional<String>> url() {
        return Codegen.optional(this.url);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Provider(String name) {
        this(name, ProviderArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Provider(String name, @Nullable ProviderArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Provider(String name, @Nullable ProviderArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("linode", name, args == null ? ProviderArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

}
