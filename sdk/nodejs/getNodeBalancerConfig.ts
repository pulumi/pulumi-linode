// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides details about a Linode NodeBalancer Config.
 * For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-node-balancer-config).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const my_config = linode.getNodeBalancerConfig({
 *     id: 123,
 *     nodebalancerId: 456,
 * });
 * ```
 */
export function getNodeBalancerConfig(args: GetNodeBalancerConfigArgs, opts?: pulumi.InvokeOptions): Promise<GetNodeBalancerConfigResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("linode:index/getNodeBalancerConfig:getNodeBalancerConfig", {
        "id": args.id,
        "nodebalancerId": args.nodebalancerId,
    }, opts);
}

/**
 * A collection of arguments for invoking getNodeBalancerConfig.
 */
export interface GetNodeBalancerConfigArgs {
    /**
     * The config's ID.
     */
    id: number;
    /**
     * The ID of the NodeBalancer that contains the config.
     */
    nodebalancerId: number;
}

/**
 * A collection of values returned by getNodeBalancerConfig.
 */
export interface GetNodeBalancerConfigResult {
    /**
     * What algorithm this NodeBalancer should use for routing traffic to backends (`roundrobin`, `leastconn`, `source`)
     */
    readonly algorithm: string;
    /**
     * The type of check to perform against backends to ensure they are serving requests. This is used to determine if backends are up or down. If none no check is performed. connection requires only a connection to the backend to succeed. http and httpBody rely on the backend serving HTTP, and that the response returned matches what is expected. (`none`, `connection`, `http`, `httpBody`)
     */
    readonly check: string;
    /**
     * How many times to attempt a check before considering a backend to be down. (1-30)
     */
    readonly checkAttempts: number;
    readonly checkBody: string;
    /**
     * How often, in seconds, to check that backends are up and serving requests.
     */
    readonly checkInterval: number;
    /**
     * If true, any response from this backend with a 5xx status code will be enough for it to be considered unhealthy and taken out of rotation.
     */
    readonly checkPassive: boolean;
    /**
     * The URL path to check on each backend. If the backend does not respond to this request it is considered to be down.
     */
    readonly checkPath: string;
    /**
     * How long, in seconds, to wait for a check attempt before considering it failed. (1-30)
     */
    readonly checkTimeout: number;
    /**
     * What ciphers to use for SSL connections served by this NodeBalancer. `legacy` is considered insecure and should only be used if necessary. (`recommended`, `legacy`)
     */
    readonly cipherSuite: string;
    readonly id: number;
    readonly nodeStatuses: outputs.GetNodeBalancerConfigNodeStatus[];
    readonly nodebalancerId: number;
    /**
     * The TCP port this Config is for.
     */
    readonly port: number;
    /**
     * The protocol this port is configured to serve. If this is set to https you must include an sslCert and an ssl_key. (`http`, `https`, `tcp`) (Defaults to `http`)
     */
    readonly protocol: string;
    /**
     * The version of ProxyProtocol to use for the underlying NodeBalancer. This requires protocol to be `tcp`. (`none`, `v1`, and `v2`) (Defaults to `none`)
     */
    readonly proxyProtocol: string;
    /**
     * The read-only common name automatically derived from the SSL certificate assigned to this NodeBalancerConfig. Please refer to this field to verify that the appropriate certificate is assigned to your NodeBalancerConfig.
     */
    readonly sslCommonname: string;
    /**
     * The read-only fingerprint automatically derived from the SSL certificate assigned to this NodeBalancerConfig. Please refer to this field to verify that the appropriate certificate is assigned to your NodeBalancerConfig.
     */
    readonly sslFingerprint: string;
    /**
     * Controls how session stickiness is handled on this port. (`none`, `table`, `httpCookie`)
     */
    readonly stickiness: string;
}
/**
 * Provides details about a Linode NodeBalancer Config.
 * For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-node-balancer-config).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const my_config = linode.getNodeBalancerConfig({
 *     id: 123,
 *     nodebalancerId: 456,
 * });
 * ```
 */
export function getNodeBalancerConfigOutput(args: GetNodeBalancerConfigOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetNodeBalancerConfigResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("linode:index/getNodeBalancerConfig:getNodeBalancerConfig", {
        "id": args.id,
        "nodebalancerId": args.nodebalancerId,
    }, opts);
}

/**
 * A collection of arguments for invoking getNodeBalancerConfig.
 */
export interface GetNodeBalancerConfigOutputArgs {
    /**
     * The config's ID.
     */
    id: pulumi.Input<number>;
    /**
     * The ID of the NodeBalancer that contains the config.
     */
    nodebalancerId: pulumi.Input<number>;
}
