// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.linode.DomainArgs;
import com.pulumi.linode.Utilities;
import com.pulumi.linode.inputs.DomainState;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Linode Domain resource.  This can be used to create, modify, and delete Linode Domains through Linode&#39;s managed DNS service.
 * For more information, see [DNS Manager](https://www.linode.com/docs/platform/manager/dns-manager/) and the [Linode APIv4 docs](https://developers.linode.com/api/v4#operation/createDomain).
 * 
 * ## Example Usage
 * 
 * The following example shows how one might use this resource to configure a Domain Record attached to a Linode Domain.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.linode.Domain;
 * import com.pulumi.linode.DomainArgs;
 * import com.pulumi.linode.DomainRecord;
 * import com.pulumi.linode.DomainRecordArgs;
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
 *         var foobarDomain = new Domain(&#34;foobarDomain&#34;, DomainArgs.builder()        
 *             .type(&#34;master&#34;)
 *             .domain(&#34;foobar.example&#34;)
 *             .soaEmail(&#34;example@foobar.example&#34;)
 *             .tags(            
 *                 &#34;foo&#34;,
 *                 &#34;bar&#34;)
 *             .build());
 * 
 *         var foobarDomainRecord = new DomainRecord(&#34;foobarDomainRecord&#34;, DomainRecordArgs.builder()        
 *             .domainId(foobarDomain.id())
 *             .name(&#34;www&#34;)
 *             .recordType(&#34;CNAME&#34;)
 *             .target(&#34;foobar.example&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Linodes Domains can be imported using the Linode Domain `id`, e.g.
 * 
 * ```sh
 *  $ pulumi import linode:index/domain:Domain foobar 1234567
 * ```
 * 
 *  The Linode Guide, [Import Existing Infrastructure to Terraform](https://www.linode.com/docs/applications/configuration-management/import-existing-infrastructure-to-terraform/), offers resource importing examples for Domains and other Linode resource types.
 * 
 */
@ResourceType(type="linode:index/domain:Domain")
public class Domain extends com.pulumi.resources.CustomResource {
    /**
     * The list of IPs that may perform a zone transfer for this Domain. This is potentially dangerous, and should be set to an empty list unless you intend to use it.
     * 
     */
    @Export(name="axfrIps", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> axfrIps;

    /**
     * @return The list of IPs that may perform a zone transfer for this Domain. This is potentially dangerous, and should be set to an empty list unless you intend to use it.
     * 
     */
    public Output<Optional<List<String>>> axfrIps() {
        return Codegen.optional(this.axfrIps);
    }
    /**
     * A description for this Domain. This is for display purposes only.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description for this Domain. This is for display purposes only.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The domain this Domain represents. These must be unique in our system; you cannot have two Domains representing the same domain.
     * 
     */
    @Export(name="domain", type=String.class, parameters={})
    private Output<String> domain;

    /**
     * @return The domain this Domain represents. These must be unique in our system; you cannot have two Domains representing the same domain.
     * 
     */
    public Output<String> domain() {
        return this.domain;
    }
    /**
     * The amount of time in seconds that may pass before this Domain is no longer authoritative. Valid values are 0, 30, 120, 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
     * 
     */
    @Export(name="expireSec", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> expireSec;

    /**
     * @return The amount of time in seconds that may pass before this Domain is no longer authoritative. Valid values are 0, 30, 120, 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
     * 
     */
    public Output<Optional<Integer>> expireSec() {
        return Codegen.optional(this.expireSec);
    }
    /**
     * The group this Domain belongs to. This is for display purposes only.
     * 
     */
    @Export(name="group", type=String.class, parameters={})
    private Output</* @Nullable */ String> group;

    /**
     * @return The group this Domain belongs to. This is for display purposes only.
     * 
     */
    public Output<Optional<String>> group() {
        return Codegen.optional(this.group);
    }
    /**
     * The IP addresses representing the master DNS for this Domain.
     * 
     * ***
     * 
     */
    @Export(name="masterIps", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> masterIps;

    /**
     * @return The IP addresses representing the master DNS for this Domain.
     * 
     * ***
     * 
     */
    public Output<Optional<List<String>>> masterIps() {
        return Codegen.optional(this.masterIps);
    }
    /**
     * The amount of time in seconds before this Domain should be refreshed. Valid values are 0, 30, 120, 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
     * 
     */
    @Export(name="refreshSec", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> refreshSec;

    /**
     * @return The amount of time in seconds before this Domain should be refreshed. Valid values are 0, 30, 120, 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
     * 
     */
    public Output<Optional<Integer>> refreshSec() {
        return Codegen.optional(this.refreshSec);
    }
    /**
     * The interval, in seconds, at which a failed refresh should be retried. Valid values are 0, 30, 120, 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
     * 
     */
    @Export(name="retrySec", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> retrySec;

    /**
     * @return The interval, in seconds, at which a failed refresh should be retried. Valid values are 0, 30, 120, 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
     * 
     */
    public Output<Optional<Integer>> retrySec() {
        return Codegen.optional(this.retrySec);
    }
    /**
     * Start of Authority email address. This is required for master Domains.
     * 
     */
    @Export(name="soaEmail", type=String.class, parameters={})
    private Output</* @Nullable */ String> soaEmail;

    /**
     * @return Start of Authority email address. This is required for master Domains.
     * 
     */
    public Output<Optional<String>> soaEmail() {
        return Codegen.optional(this.soaEmail);
    }
    /**
     * Used to control whether this Domain is currently being rendered (defaults to &#34;active&#34;).
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return Used to control whether this Domain is currently being rendered (defaults to &#34;active&#34;).
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * A list of tags applied to this object. Tags are for organizational purposes only.
     * 
     */
    @Export(name="tags", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> tags;

    /**
     * @return A list of tags applied to this object. Tags are for organizational purposes only.
     * 
     */
    public Output<Optional<List<String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * &#39;Time to Live&#39; - the amount of time in seconds that this Domain&#39;s records may be cached by resolvers or other domain servers. Valid values are 0, 30, 120, 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
     * 
     */
    @Export(name="ttlSec", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> ttlSec;

    /**
     * @return &#39;Time to Live&#39; - the amount of time in seconds that this Domain&#39;s records may be cached by resolvers or other domain servers. Valid values are 0, 30, 120, 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
     * 
     */
    public Output<Optional<Integer>> ttlSec() {
        return Codegen.optional(this.ttlSec);
    }
    /**
     * If this Domain represents the authoritative source of information for the domain it describes, or if it is a read-only copy of a master (also called a slave).
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return If this Domain represents the authoritative source of information for the domain it describes, or if it is a read-only copy of a master (also called a slave).
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Domain(String name) {
        this(name, DomainArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Domain(String name, DomainArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Domain(String name, DomainArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("linode:index/domain:Domain", name, args == null ? DomainArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Domain(String name, Output<String> id, @Nullable DomainState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("linode:index/domain:Domain", name, state, makeResourceOptions(options, id));
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
    public static Domain get(String name, Output<String> id, @Nullable DomainState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Domain(name, id, state, options);
    }
}
