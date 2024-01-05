// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Inputs
{

    public sealed class GetNodebalancerConfigsNodebalancerConfigInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// What algorithm this NodeBalancer should use for routing traffic to backends (`roundrobin`, `leastconn`, `source`)
        /// </summary>
        [Input("algorithm", required: true)]
        public Input<string> Algorithm { get; set; } = null!;

        /// <summary>
        /// The type of check to perform against backends to ensure they are serving requests. This is used to determine if backends are up or down. If none no check is performed. connection requires only a connection to the backend to succeed. http and http_body rely on the backend serving HTTP, and that the response returned matches what is expected. (`none`, `connection`, `http`, `http_body`)
        /// </summary>
        [Input("check", required: true)]
        public Input<string> Check { get; set; } = null!;

        /// <summary>
        /// How many times to attempt a check before considering a backend to be down. (1-30)
        /// </summary>
        [Input("checkAttempts", required: true)]
        public Input<int> CheckAttempts { get; set; } = null!;

        [Input("checkBody", required: true)]
        public Input<string> CheckBody { get; set; } = null!;

        /// <summary>
        /// How often, in seconds, to check that backends are up and serving requests.
        /// </summary>
        [Input("checkInterval", required: true)]
        public Input<int> CheckInterval { get; set; } = null!;

        /// <summary>
        /// If true, any response from this backend with a 5xx status code will be enough for it to be considered unhealthy and taken out of rotation.
        /// </summary>
        [Input("checkPassive", required: true)]
        public Input<bool> CheckPassive { get; set; } = null!;

        /// <summary>
        /// The URL path to check on each backend. If the backend does not respond to this request it is considered to be down.
        /// </summary>
        [Input("checkPath", required: true)]
        public Input<string> CheckPath { get; set; } = null!;

        /// <summary>
        /// How long, in seconds, to wait for a check attempt before considering it failed. (1-30)
        /// </summary>
        [Input("checkTimeout", required: true)]
        public Input<int> CheckTimeout { get; set; } = null!;

        /// <summary>
        /// What ciphers to use for SSL connections served by this NodeBalancer. `legacy` is considered insecure and should only be used if necessary. (`recommended`, `legacy`)
        /// </summary>
        [Input("cipherSuite", required: true)]
        public Input<string> CipherSuite { get; set; } = null!;

        /// <summary>
        /// The config's ID.
        /// </summary>
        [Input("id", required: true)]
        public Input<int> Id { get; set; } = null!;

        [Input("nodeStatuses", required: true)]
        private InputList<Inputs.GetNodebalancerConfigsNodebalancerConfigNodeStatusInputArgs>? _nodeStatuses;
        public InputList<Inputs.GetNodebalancerConfigsNodebalancerConfigNodeStatusInputArgs> NodeStatuses
        {
            get => _nodeStatuses ?? (_nodeStatuses = new InputList<Inputs.GetNodebalancerConfigsNodebalancerConfigNodeStatusInputArgs>());
            set => _nodeStatuses = value;
        }

        /// <summary>
        /// The ID of the NodeBalancer to access.
        /// 
        /// * `filter` - (Optional) A set of filters used to select Linode NodeBalancers that meet certain requirements.
        /// </summary>
        [Input("nodebalancerId", required: true)]
        public Input<int> NodebalancerId { get; set; } = null!;

        /// <summary>
        /// The TCP port this Config is for.
        /// </summary>
        [Input("port", required: true)]
        public Input<int> Port { get; set; } = null!;

        /// <summary>
        /// The protocol this port is configured to serve. If this is set to https you must include an ssl_cert and an ssl_key. (`http`, `https`, `tcp`) (Defaults to `http`)
        /// </summary>
        [Input("protocol", required: true)]
        public Input<string> Protocol { get; set; } = null!;

        /// <summary>
        /// The version of ProxyProtocol to use for the underlying NodeBalancer. This requires protocol to be `tcp`. (`none`, `v1`, and `v2`) (Defaults to `none`)
        /// </summary>
        [Input("proxyProtocol", required: true)]
        public Input<string> ProxyProtocol { get; set; } = null!;

        /// <summary>
        /// The read-only common name automatically derived from the SSL certificate assigned to this NodeBalancerConfig. Please refer to this field to verify that the appropriate certificate is assigned to your NodeBalancerConfig.
        /// </summary>
        [Input("sslCommonname", required: true)]
        public Input<string> SslCommonname { get; set; } = null!;

        /// <summary>
        /// The read-only fingerprint automatically derived from the SSL certificate assigned to this NodeBalancerConfig. Please refer to this field to verify that the appropriate certificate is assigned to your NodeBalancerConfig.
        /// </summary>
        [Input("sslFingerprint", required: true)]
        public Input<string> SslFingerprint { get; set; } = null!;

        /// <summary>
        /// Controls how session stickiness is handled on this port. (`none`, `table`, `http_cookie`)
        /// </summary>
        [Input("stickiness", required: true)]
        public Input<string> Stickiness { get; set; } = null!;

        public GetNodebalancerConfigsNodebalancerConfigInputArgs()
        {
        }
        public static new GetNodebalancerConfigsNodebalancerConfigInputArgs Empty => new GetNodebalancerConfigsNodebalancerConfigInputArgs();
    }
}
