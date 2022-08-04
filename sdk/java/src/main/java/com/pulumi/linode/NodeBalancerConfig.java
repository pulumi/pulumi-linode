// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.linode.NodeBalancerConfigArgs;
import com.pulumi.linode.Utilities;
import com.pulumi.linode.inputs.NodeBalancerConfigState;
import com.pulumi.linode.outputs.NodeBalancerConfigNodeStatus;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Linode NodeBalancer Config resource.  This can be used to create, modify, and delete Linodes NodeBalancer Configs.
 * For more information, see [Getting Started with NodeBalancers](https://www.linode.com/docs/platform/nodebalancer/getting-started-with-nodebalancers/) and the [Linode APIv4 docs](https://developers.linode.com/api/v4#operation/createNodeBalancerConfig).
 * 
 * ## Example Usage
 * 
 * The following example shows how one might use this resource to configure a NodeBalancer Config attached to a Linode instance.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.linode.NodeBalancer;
 * import com.pulumi.linode.NodeBalancerArgs;
 * import com.pulumi.linode.NodeBalancerConfig;
 * import com.pulumi.linode.NodeBalancerConfigArgs;
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
 *         var foobar = new NodeBalancer(&#34;foobar&#34;, NodeBalancerArgs.builder()        
 *             .label(&#34;mynodebalancer&#34;)
 *             .region(&#34;us-east&#34;)
 *             .clientConnThrottle(20)
 *             .build());
 * 
 *         var foofig = new NodeBalancerConfig(&#34;foofig&#34;, NodeBalancerConfigArgs.builder()        
 *             .nodebalancerId(foobar.id())
 *             .port(8088)
 *             .protocol(&#34;http&#34;)
 *             .check(&#34;http&#34;)
 *             .checkPath(&#34;/foo&#34;)
 *             .checkAttempts(3)
 *             .checkTimeout(30)
 *             .stickiness(&#34;http_cookie&#34;)
 *             .algorithm(&#34;source&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ## Attributes
 * 
 * This resource exports the following attributes:
 * 
 * * `ssl_commonname` - The read-only common name automatically derived from the SSL certificate assigned to this NodeBalancerConfig. Please refer to this field to verify that the appropriate certificate is assigned to your NodeBalancerConfig.
 * 
 * * `ssl_fingerprint` - The read-only fingerprint automatically derived from the SSL certificate assigned to this NodeBalancerConfig. Please refer to this field to verify that the appropriate certificate is assigned to your NodeBalancerConfig.
 * 
 * * `node_status` - The status of the attached nodes.
 * 
 * ### node_status
 * 
 * The following attributes are available on node_status:
 * 
 * * `up` - The number of backends considered to be &#39;UP&#39; and healthy, and that are serving requests.
 * 
 * * `down` - The number of backends considered to be &#39;DOWN&#39; and unhealthy. These are not in rotation, and not serving requests.
 * 
 * ## Import
 * 
 * NodeBalancer Configs can be imported using the NodeBalancer `nodebalancer_id` followed by the NodeBalancer Config `id` separated by a comma, e.g.
 * 
 * ```sh
 *  $ pulumi import linode:index/nodeBalancerConfig:NodeBalancerConfig http-foobar 1234567,7654321
 * ```
 * 
 *  The Linode Guide, [Import Existing Infrastructure to Terraform](https://www.linode.com/docs/applications/configuration-management/import-existing-infrastructure-to-terraform/), offers resource importing examples for NodeBalancer Configs and other Linode resource types.
 * 
 */
@ResourceType(type="linode:index/nodeBalancerConfig:NodeBalancerConfig")
public class NodeBalancerConfig extends com.pulumi.resources.CustomResource {
    /**
     * What algorithm this NodeBalancer should use for routing traffic to backends. (`roundrobin`, `leastconn`, `source`)
     * 
     */
    @Export(name="algorithm", type=String.class, parameters={})
    private Output<String> algorithm;

    /**
     * @return What algorithm this NodeBalancer should use for routing traffic to backends. (`roundrobin`, `leastconn`, `source`)
     * 
     */
    public Output<String> algorithm() {
        return this.algorithm;
    }
    /**
     * The type of check to perform against backends to ensure they are serving requests. This is used to determine if backends are up or down. If none no check is performed. connection requires only a connection to the backend to succeed. http and http_body rely on the backend serving HTTP, and that the response returned matches what is expected. (`none`, `connection`, `http`, `http_body`)
     * 
     */
    @Export(name="check", type=String.class, parameters={})
    private Output<String> check;

    /**
     * @return The type of check to perform against backends to ensure they are serving requests. This is used to determine if backends are up or down. If none no check is performed. connection requires only a connection to the backend to succeed. http and http_body rely on the backend serving HTTP, and that the response returned matches what is expected. (`none`, `connection`, `http`, `http_body`)
     * 
     */
    public Output<String> check() {
        return this.check;
    }
    /**
     * How many times to attempt a check before considering a backend to be down. (1-30)
     * 
     */
    @Export(name="checkAttempts", type=Integer.class, parameters={})
    private Output<Integer> checkAttempts;

    /**
     * @return How many times to attempt a check before considering a backend to be down. (1-30)
     * 
     */
    public Output<Integer> checkAttempts() {
        return this.checkAttempts;
    }
    /**
     * This value must be present in the response body of the check in order for it to pass. If this value is not present in
     * the response body of a check request, the backend is considered to be down
     * 
     */
    @Export(name="checkBody", type=String.class, parameters={})
    private Output<String> checkBody;

    /**
     * @return This value must be present in the response body of the check in order for it to pass. If this value is not present in
     * the response body of a check request, the backend is considered to be down
     * 
     */
    public Output<String> checkBody() {
        return this.checkBody;
    }
    /**
     * How often, in seconds, to check that backends are up and serving requests.
     * 
     */
    @Export(name="checkInterval", type=Integer.class, parameters={})
    private Output<Integer> checkInterval;

    /**
     * @return How often, in seconds, to check that backends are up and serving requests.
     * 
     */
    public Output<Integer> checkInterval() {
        return this.checkInterval;
    }
    /**
     * If true, any response from this backend with a 5xx status code will be enough for it to be considered unhealthy and taken out of rotation.
     * 
     */
    @Export(name="checkPassive", type=Boolean.class, parameters={})
    private Output<Boolean> checkPassive;

    /**
     * @return If true, any response from this backend with a 5xx status code will be enough for it to be considered unhealthy and taken out of rotation.
     * 
     */
    public Output<Boolean> checkPassive() {
        return this.checkPassive;
    }
    /**
     * The URL path to check on each backend. If the backend does not respond to this request it is considered to be down.
     * 
     */
    @Export(name="checkPath", type=String.class, parameters={})
    private Output<String> checkPath;

    /**
     * @return The URL path to check on each backend. If the backend does not respond to this request it is considered to be down.
     * 
     */
    public Output<String> checkPath() {
        return this.checkPath;
    }
    /**
     * How long, in seconds, to wait for a check attempt before considering it failed. (1-30)
     * 
     */
    @Export(name="checkTimeout", type=Integer.class, parameters={})
    private Output<Integer> checkTimeout;

    /**
     * @return How long, in seconds, to wait for a check attempt before considering it failed. (1-30)
     * 
     */
    public Output<Integer> checkTimeout() {
        return this.checkTimeout;
    }
    /**
     * What ciphers to use for SSL connections served by this NodeBalancer. `legacy` is considered insecure and should only be used if necessary.
     * 
     */
    @Export(name="cipherSuite", type=String.class, parameters={})
    private Output<String> cipherSuite;

    /**
     * @return What ciphers to use for SSL connections served by this NodeBalancer. `legacy` is considered insecure and should only be used if necessary.
     * 
     */
    public Output<String> cipherSuite() {
        return this.cipherSuite;
    }
    /**
     * A structure containing information about the health of the backends for this port. This information is updated
     * periodically as checks are performed against backends.
     * 
     */
    @Export(name="nodeStatuses", type=List.class, parameters={NodeBalancerConfigNodeStatus.class})
    private Output<List<NodeBalancerConfigNodeStatus>> nodeStatuses;

    /**
     * @return A structure containing information about the health of the backends for this port. This information is updated
     * periodically as checks are performed against backends.
     * 
     */
    public Output<List<NodeBalancerConfigNodeStatus>> nodeStatuses() {
        return this.nodeStatuses;
    }
    /**
     * The ID of the NodeBalancer to access.
     * 
     */
    @Export(name="nodebalancerId", type=Integer.class, parameters={})
    private Output<Integer> nodebalancerId;

    /**
     * @return The ID of the NodeBalancer to access.
     * 
     */
    public Output<Integer> nodebalancerId() {
        return this.nodebalancerId;
    }
    /**
     * The TCP port this Config is for. These values must be unique across configs on a single NodeBalancer (you can&#39;t have two configs for port 80, for example). While some ports imply some protocols, no enforcement is done and you may configure your NodeBalancer however is useful to you. For example, while port 443 is generally used for HTTPS, you do not need SSL configured to have a NodeBalancer listening on port 443. (Defaults to 80)
     * 
     */
    @Export(name="port", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> port;

    /**
     * @return The TCP port this Config is for. These values must be unique across configs on a single NodeBalancer (you can&#39;t have two configs for port 80, for example). While some ports imply some protocols, no enforcement is done and you may configure your NodeBalancer however is useful to you. For example, while port 443 is generally used for HTTPS, you do not need SSL configured to have a NodeBalancer listening on port 443. (Defaults to 80)
     * 
     */
    public Output<Optional<Integer>> port() {
        return Codegen.optional(this.port);
    }
    /**
     * The protocol this port is configured to serve. If this is set to https you must include an ssl_cert and an ssl_key. (`http`, `https`, `tcp`) (Defaults to `http`)
     * 
     */
    @Export(name="protocol", type=String.class, parameters={})
    private Output</* @Nullable */ String> protocol;

    /**
     * @return The protocol this port is configured to serve. If this is set to https you must include an ssl_cert and an ssl_key. (`http`, `https`, `tcp`) (Defaults to `http`)
     * 
     */
    public Output<Optional<String>> protocol() {
        return Codegen.optional(this.protocol);
    }
    /**
     * The version of ProxyProtocol to use for the underlying NodeBalancer. This requires protocol to be `tcp`. (`none`, `v1`, `v2`) (Defaults to `none`)
     * 
     */
    @Export(name="proxyProtocol", type=String.class, parameters={})
    private Output</* @Nullable */ String> proxyProtocol;

    /**
     * @return The version of ProxyProtocol to use for the underlying NodeBalancer. This requires protocol to be `tcp`. (`none`, `v1`, `v2`) (Defaults to `none`)
     * 
     */
    public Output<Optional<String>> proxyProtocol() {
        return Codegen.optional(this.proxyProtocol);
    }
    /**
     * The certificate this port is serving. This is not returned. If set, this field will come back as `&lt;REDACTED&gt;`. Please use the ssl_commonname and ssl_fingerprint to identify the certificate.
     * 
     */
    @Export(name="sslCert", type=String.class, parameters={})
    private Output</* @Nullable */ String> sslCert;

    /**
     * @return The certificate this port is serving. This is not returned. If set, this field will come back as `&lt;REDACTED&gt;`. Please use the ssl_commonname and ssl_fingerprint to identify the certificate.
     * 
     */
    public Output<Optional<String>> sslCert() {
        return Codegen.optional(this.sslCert);
    }
    /**
     * The read-only common name automatically derived from the SSL certificate assigned to this NodeBalancerConfig. Please
     * refer to this field to verify that the appropriate certificate is assigned to your NodeBalancerConfig.
     * 
     */
    @Export(name="sslCommonname", type=String.class, parameters={})
    private Output<String> sslCommonname;

    /**
     * @return The read-only common name automatically derived from the SSL certificate assigned to this NodeBalancerConfig. Please
     * refer to this field to verify that the appropriate certificate is assigned to your NodeBalancerConfig.
     * 
     */
    public Output<String> sslCommonname() {
        return this.sslCommonname;
    }
    /**
     * The read-only fingerprint automatically derived from the SSL certificate assigned to this NodeBalancerConfig. Please
     * refer to this field to verify that the appropriate certificate is assigned to your NodeBalancerConfig.
     * 
     */
    @Export(name="sslFingerprint", type=String.class, parameters={})
    private Output<String> sslFingerprint;

    /**
     * @return The read-only fingerprint automatically derived from the SSL certificate assigned to this NodeBalancerConfig. Please
     * refer to this field to verify that the appropriate certificate is assigned to your NodeBalancerConfig.
     * 
     */
    public Output<String> sslFingerprint() {
        return this.sslFingerprint;
    }
    /**
     * The private key corresponding to this port&#39;s certificate. This is not returned. If set, this field will come back as `&lt;REDACTED&gt;`. Please use the ssl_commonname and ssl_fingerprint to identify the certificate.
     * 
     */
    @Export(name="sslKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> sslKey;

    /**
     * @return The private key corresponding to this port&#39;s certificate. This is not returned. If set, this field will come back as `&lt;REDACTED&gt;`. Please use the ssl_commonname and ssl_fingerprint to identify the certificate.
     * 
     */
    public Output<Optional<String>> sslKey() {
        return Codegen.optional(this.sslKey);
    }
    /**
     * Controls how session stickiness is handled on this port. (`none`, `table`, `http_cookie`)
     * 
     */
    @Export(name="stickiness", type=String.class, parameters={})
    private Output<String> stickiness;

    /**
     * @return Controls how session stickiness is handled on this port. (`none`, `table`, `http_cookie`)
     * 
     */
    public Output<String> stickiness() {
        return this.stickiness;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NodeBalancerConfig(String name) {
        this(name, NodeBalancerConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NodeBalancerConfig(String name, NodeBalancerConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NodeBalancerConfig(String name, NodeBalancerConfigArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("linode:index/nodeBalancerConfig:NodeBalancerConfig", name, args == null ? NodeBalancerConfigArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NodeBalancerConfig(String name, Output<String> id, @Nullable NodeBalancerConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("linode:index/nodeBalancerConfig:NodeBalancerConfig", name, state, makeResourceOptions(options, id));
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
    public static NodeBalancerConfig get(String name, Output<String> id, @Nullable NodeBalancerConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NodeBalancerConfig(name, id, state, options);
    }
}
