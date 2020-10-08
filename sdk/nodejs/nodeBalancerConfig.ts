// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a Linode NodeBalancer Config resource.  This can be used to create, modify, and delete Linodes NodeBalancer Configs.
 * For more information, see [Getting Started with NodeBalancers](https://www.linode.com/docs/platform/nodebalancer/getting-started-with-nodebalancers/) and the [Linode APIv4 docs](https://developers.linode.com/api/v4#operation/createNodeBalancerConfig).
 *
 * ## Example Usage
 *
 * The following example shows how one might use this resource to configure a NodeBalancer Config attached to a Linode instance.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const foobar = new linode.NodeBalancer("foobar", {
 *     clientConnThrottle: 20,
 *     label: "mynodebalancer",
 *     region: "us-east",
 * });
 * const foofig = new linode.NodeBalancerConfig("foofig", {
 *     algorithm: "source",
 *     check: "http",
 *     checkAttempts: 3,
 *     checkPath: "/foo",
 *     checkTimeout: 30,
 *     nodebalancerId: foobar.id.apply(id => Number.parseFloat(id)),
 *     port: 8088,
 *     protocol: "http",
 *     stickiness: "http_cookie",
 * });
 * ```
 * ## Attributes
 *
 * This resource exports the following attributes:
 *
 * * `sslCommonname` - The common name for the SSL certification this port is serving if this port is not configured to use SSL.
 *
 * * `sslFingerprint` - The fingerprint for the SSL certification this port is serving if this port is not configured to use SSL.
 *
 * * `nodeStatusUp` - The number of backends considered to be 'UP' and healthy, and that are serving requests.
 *
 * * `nodeStatusDown` - The number of backends considered to be 'DOWN' and unhealthy. These are not in rotation, and not serving requests.
 */
export class NodeBalancerConfig extends pulumi.CustomResource {
    /**
     * Get an existing NodeBalancerConfig resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: NodeBalancerConfigState, opts?: pulumi.CustomResourceOptions): NodeBalancerConfig {
        return new NodeBalancerConfig(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'linode:index/nodeBalancerConfig:NodeBalancerConfig';

    /**
     * Returns true if the given object is an instance of NodeBalancerConfig.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is NodeBalancerConfig {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === NodeBalancerConfig.__pulumiType;
    }

    /**
     * What algorithm this NodeBalancer should use for routing traffic to backends: roundrobin, leastconn, source
     */
    public readonly algorithm!: pulumi.Output<string>;
    /**
     * The type of check to perform against backends to ensure they are serving requests. This is used to determine if backends are up or down. If none no check is performed. connection requires only a connection to the backend to succeed. http and httpBody rely on the backend serving HTTP, and that the response returned matches what is expected.
     */
    public readonly check!: pulumi.Output<string>;
    /**
     * How many times to attempt a check before considering a backend to be down. (1-30)
     */
    public readonly checkAttempts!: pulumi.Output<number>;
    /**
     * This value must be present in the response body of the check in order for it to pass. If this value is not present in
     * the response body of a check request, the backend is considered to be down
     */
    public readonly checkBody!: pulumi.Output<string>;
    /**
     * How often, in seconds, to check that backends are up and serving requests.
     */
    public readonly checkInterval!: pulumi.Output<number>;
    /**
     * If true, any response from this backend with a 5xx status code will be enough for it to be considered unhealthy and taken out of rotation.
     */
    public readonly checkPassive!: pulumi.Output<boolean>;
    /**
     * The URL path to check on each backend. If the backend does not respond to this request it is considered to be down.
     */
    public readonly checkPath!: pulumi.Output<string>;
    /**
     * How long, in seconds, to wait for a check attempt before considering it failed. (1-30)
     */
    public readonly checkTimeout!: pulumi.Output<number>;
    /**
     * What ciphers to use for SSL connections served by this NodeBalancer. `legacy` is considered insecure and should only be used if necessary.
     */
    public readonly cipherSuite!: pulumi.Output<string>;
    public /*out*/ readonly nodeStatus!: pulumi.Output<outputs.NodeBalancerConfigNodeStatus>;
    /**
     * The ID of the NodeBalancer to access.
     */
    public readonly nodebalancerId!: pulumi.Output<number>;
    /**
     * The TCP port this Config is for. These values must be unique across configs on a single NodeBalancer (you can't have two configs for port 80, for example). While some ports imply some protocols, no enforcement is done and you may configure your NodeBalancer however is useful to you. For example, while port 443 is generally used for HTTPS, you do not need SSL configured to have a NodeBalancer listening on port 443. (Defaults to 80)
     */
    public readonly port!: pulumi.Output<number | undefined>;
    /**
     * The protocol this port is configured to serve. If this is set to https you must include an sslCert and an ssl_key. (Defaults to "http")
     */
    public readonly protocol!: pulumi.Output<string | undefined>;
    /**
     * The version of ProxyProtocol to use for the underlying NodeBalancer. This requires protocol to be `tcp`. Valid values are `none`, `v1`, and `v2`. (Defaults to `none`)
     */
    public readonly proxyProtocol!: pulumi.Output<string | undefined>;
    /**
     * The certificate this port is serving. This is not returned. If set, this field will come back as `<REDACTED>`. Please use the sslCommonname and sslFingerprint to identify the certificate.
     */
    public readonly sslCert!: pulumi.Output<string | undefined>;
    /**
     * The common name for the SSL certification this port is serving if this port is not configured to use SSL.
     */
    public /*out*/ readonly sslCommonname!: pulumi.Output<string>;
    /**
     * The fingerprint for the SSL certification this port is serving if this port is not configured to use SSL.
     */
    public /*out*/ readonly sslFingerprint!: pulumi.Output<string>;
    /**
     * The private key corresponding to this port's certificate. This is not returned. If set, this field will come back as `<REDACTED>`. Please use the sslCommonname and sslFingerprint to identify the certificate.
     */
    public readonly sslKey!: pulumi.Output<string | undefined>;
    /**
     * Controls how session stickiness is handled on this port: 'none', 'table', 'http_cookie'
     */
    public readonly stickiness!: pulumi.Output<string>;

    /**
     * Create a NodeBalancerConfig resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: NodeBalancerConfigArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: NodeBalancerConfigArgs | NodeBalancerConfigState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as NodeBalancerConfigState | undefined;
            inputs["algorithm"] = state ? state.algorithm : undefined;
            inputs["check"] = state ? state.check : undefined;
            inputs["checkAttempts"] = state ? state.checkAttempts : undefined;
            inputs["checkBody"] = state ? state.checkBody : undefined;
            inputs["checkInterval"] = state ? state.checkInterval : undefined;
            inputs["checkPassive"] = state ? state.checkPassive : undefined;
            inputs["checkPath"] = state ? state.checkPath : undefined;
            inputs["checkTimeout"] = state ? state.checkTimeout : undefined;
            inputs["cipherSuite"] = state ? state.cipherSuite : undefined;
            inputs["nodeStatus"] = state ? state.nodeStatus : undefined;
            inputs["nodebalancerId"] = state ? state.nodebalancerId : undefined;
            inputs["port"] = state ? state.port : undefined;
            inputs["protocol"] = state ? state.protocol : undefined;
            inputs["proxyProtocol"] = state ? state.proxyProtocol : undefined;
            inputs["sslCert"] = state ? state.sslCert : undefined;
            inputs["sslCommonname"] = state ? state.sslCommonname : undefined;
            inputs["sslFingerprint"] = state ? state.sslFingerprint : undefined;
            inputs["sslKey"] = state ? state.sslKey : undefined;
            inputs["stickiness"] = state ? state.stickiness : undefined;
        } else {
            const args = argsOrState as NodeBalancerConfigArgs | undefined;
            if (!args || args.nodebalancerId === undefined) {
                throw new Error("Missing required property 'nodebalancerId'");
            }
            inputs["algorithm"] = args ? args.algorithm : undefined;
            inputs["check"] = args ? args.check : undefined;
            inputs["checkAttempts"] = args ? args.checkAttempts : undefined;
            inputs["checkBody"] = args ? args.checkBody : undefined;
            inputs["checkInterval"] = args ? args.checkInterval : undefined;
            inputs["checkPassive"] = args ? args.checkPassive : undefined;
            inputs["checkPath"] = args ? args.checkPath : undefined;
            inputs["checkTimeout"] = args ? args.checkTimeout : undefined;
            inputs["cipherSuite"] = args ? args.cipherSuite : undefined;
            inputs["nodebalancerId"] = args ? args.nodebalancerId : undefined;
            inputs["port"] = args ? args.port : undefined;
            inputs["protocol"] = args ? args.protocol : undefined;
            inputs["proxyProtocol"] = args ? args.proxyProtocol : undefined;
            inputs["sslCert"] = args ? args.sslCert : undefined;
            inputs["sslKey"] = args ? args.sslKey : undefined;
            inputs["stickiness"] = args ? args.stickiness : undefined;
            inputs["nodeStatus"] = undefined /*out*/;
            inputs["sslCommonname"] = undefined /*out*/;
            inputs["sslFingerprint"] = undefined /*out*/;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(NodeBalancerConfig.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering NodeBalancerConfig resources.
 */
export interface NodeBalancerConfigState {
    /**
     * What algorithm this NodeBalancer should use for routing traffic to backends: roundrobin, leastconn, source
     */
    readonly algorithm?: pulumi.Input<string>;
    /**
     * The type of check to perform against backends to ensure they are serving requests. This is used to determine if backends are up or down. If none no check is performed. connection requires only a connection to the backend to succeed. http and httpBody rely on the backend serving HTTP, and that the response returned matches what is expected.
     */
    readonly check?: pulumi.Input<string>;
    /**
     * How many times to attempt a check before considering a backend to be down. (1-30)
     */
    readonly checkAttempts?: pulumi.Input<number>;
    /**
     * This value must be present in the response body of the check in order for it to pass. If this value is not present in
     * the response body of a check request, the backend is considered to be down
     */
    readonly checkBody?: pulumi.Input<string>;
    /**
     * How often, in seconds, to check that backends are up and serving requests.
     */
    readonly checkInterval?: pulumi.Input<number>;
    /**
     * If true, any response from this backend with a 5xx status code will be enough for it to be considered unhealthy and taken out of rotation.
     */
    readonly checkPassive?: pulumi.Input<boolean>;
    /**
     * The URL path to check on each backend. If the backend does not respond to this request it is considered to be down.
     */
    readonly checkPath?: pulumi.Input<string>;
    /**
     * How long, in seconds, to wait for a check attempt before considering it failed. (1-30)
     */
    readonly checkTimeout?: pulumi.Input<number>;
    /**
     * What ciphers to use for SSL connections served by this NodeBalancer. `legacy` is considered insecure and should only be used if necessary.
     */
    readonly cipherSuite?: pulumi.Input<string>;
    readonly nodeStatus?: pulumi.Input<inputs.NodeBalancerConfigNodeStatus>;
    /**
     * The ID of the NodeBalancer to access.
     */
    readonly nodebalancerId?: pulumi.Input<number>;
    /**
     * The TCP port this Config is for. These values must be unique across configs on a single NodeBalancer (you can't have two configs for port 80, for example). While some ports imply some protocols, no enforcement is done and you may configure your NodeBalancer however is useful to you. For example, while port 443 is generally used for HTTPS, you do not need SSL configured to have a NodeBalancer listening on port 443. (Defaults to 80)
     */
    readonly port?: pulumi.Input<number>;
    /**
     * The protocol this port is configured to serve. If this is set to https you must include an sslCert and an ssl_key. (Defaults to "http")
     */
    readonly protocol?: pulumi.Input<string>;
    /**
     * The version of ProxyProtocol to use for the underlying NodeBalancer. This requires protocol to be `tcp`. Valid values are `none`, `v1`, and `v2`. (Defaults to `none`)
     */
    readonly proxyProtocol?: pulumi.Input<string>;
    /**
     * The certificate this port is serving. This is not returned. If set, this field will come back as `<REDACTED>`. Please use the sslCommonname and sslFingerprint to identify the certificate.
     */
    readonly sslCert?: pulumi.Input<string>;
    /**
     * The common name for the SSL certification this port is serving if this port is not configured to use SSL.
     */
    readonly sslCommonname?: pulumi.Input<string>;
    /**
     * The fingerprint for the SSL certification this port is serving if this port is not configured to use SSL.
     */
    readonly sslFingerprint?: pulumi.Input<string>;
    /**
     * The private key corresponding to this port's certificate. This is not returned. If set, this field will come back as `<REDACTED>`. Please use the sslCommonname and sslFingerprint to identify the certificate.
     */
    readonly sslKey?: pulumi.Input<string>;
    /**
     * Controls how session stickiness is handled on this port: 'none', 'table', 'http_cookie'
     */
    readonly stickiness?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a NodeBalancerConfig resource.
 */
export interface NodeBalancerConfigArgs {
    /**
     * What algorithm this NodeBalancer should use for routing traffic to backends: roundrobin, leastconn, source
     */
    readonly algorithm?: pulumi.Input<string>;
    /**
     * The type of check to perform against backends to ensure they are serving requests. This is used to determine if backends are up or down. If none no check is performed. connection requires only a connection to the backend to succeed. http and httpBody rely on the backend serving HTTP, and that the response returned matches what is expected.
     */
    readonly check?: pulumi.Input<string>;
    /**
     * How many times to attempt a check before considering a backend to be down. (1-30)
     */
    readonly checkAttempts?: pulumi.Input<number>;
    /**
     * This value must be present in the response body of the check in order for it to pass. If this value is not present in
     * the response body of a check request, the backend is considered to be down
     */
    readonly checkBody?: pulumi.Input<string>;
    /**
     * How often, in seconds, to check that backends are up and serving requests.
     */
    readonly checkInterval?: pulumi.Input<number>;
    /**
     * If true, any response from this backend with a 5xx status code will be enough for it to be considered unhealthy and taken out of rotation.
     */
    readonly checkPassive?: pulumi.Input<boolean>;
    /**
     * The URL path to check on each backend. If the backend does not respond to this request it is considered to be down.
     */
    readonly checkPath?: pulumi.Input<string>;
    /**
     * How long, in seconds, to wait for a check attempt before considering it failed. (1-30)
     */
    readonly checkTimeout?: pulumi.Input<number>;
    /**
     * What ciphers to use for SSL connections served by this NodeBalancer. `legacy` is considered insecure and should only be used if necessary.
     */
    readonly cipherSuite?: pulumi.Input<string>;
    /**
     * The ID of the NodeBalancer to access.
     */
    readonly nodebalancerId: pulumi.Input<number>;
    /**
     * The TCP port this Config is for. These values must be unique across configs on a single NodeBalancer (you can't have two configs for port 80, for example). While some ports imply some protocols, no enforcement is done and you may configure your NodeBalancer however is useful to you. For example, while port 443 is generally used for HTTPS, you do not need SSL configured to have a NodeBalancer listening on port 443. (Defaults to 80)
     */
    readonly port?: pulumi.Input<number>;
    /**
     * The protocol this port is configured to serve. If this is set to https you must include an sslCert and an ssl_key. (Defaults to "http")
     */
    readonly protocol?: pulumi.Input<string>;
    /**
     * The version of ProxyProtocol to use for the underlying NodeBalancer. This requires protocol to be `tcp`. Valid values are `none`, `v1`, and `v2`. (Defaults to `none`)
     */
    readonly proxyProtocol?: pulumi.Input<string>;
    /**
     * The certificate this port is serving. This is not returned. If set, this field will come back as `<REDACTED>`. Please use the sslCommonname and sslFingerprint to identify the certificate.
     */
    readonly sslCert?: pulumi.Input<string>;
    /**
     * The private key corresponding to this port's certificate. This is not returned. If set, this field will come back as `<REDACTED>`. Please use the sslCommonname and sslFingerprint to identify the certificate.
     */
    readonly sslKey?: pulumi.Input<string>;
    /**
     * Controls how session stickiness is handled on this port: 'none', 'table', 'http_cookie'
     */
    readonly stickiness?: pulumi.Input<string>;
}
