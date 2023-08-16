// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Inputs
{

    public sealed class GetNodebalancersNodebalancerArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Throttle connections per second (0-20)
        /// </summary>
        [Input("clientConnThrottle", required: true)]
        public int ClientConnThrottle { get; set; }

        /// <summary>
        /// When this Linode NodeBalancer was created
        /// </summary>
        [Input("created", required: true)]
        public string Created { get; set; } = null!;

        /// <summary>
        /// This NodeBalancer's hostname, ending with .ip.linodeusercontent.com
        /// </summary>
        [Input("hostname", required: true)]
        public string Hostname { get; set; } = null!;

        /// <summary>
        /// The Linode NodeBalancer's unique ID
        /// </summary>
        [Input("id", required: true)]
        public int Id { get; set; }

        /// <summary>
        /// The Public IPv4 Address of this NodeBalancer
        /// </summary>
        [Input("ipv4", required: true)]
        public string Ipv4 { get; set; } = null!;

        /// <summary>
        /// The Public IPv6 Address of this NodeBalancer
        /// </summary>
        [Input("ipv6", required: true)]
        public string Ipv6 { get; set; } = null!;

        /// <summary>
        /// The label of the Linode NodeBalancer
        /// </summary>
        [Input("label", required: true)]
        public string Label { get; set; } = null!;

        /// <summary>
        /// The Region where this Linode NodeBalancer is located. NodeBalancers only support backends in the same Region.
        /// </summary>
        [Input("region", required: true)]
        public string Region { get; set; } = null!;

        [Input("tags", required: true)]
        private List<string>? _tags;

        /// <summary>
        /// A list of tags applied to this object. Tags are for organizational purposes only.
        /// </summary>
        public List<string> Tags
        {
            get => _tags ?? (_tags = new List<string>());
            set => _tags = value;
        }

        [Input("transfers", required: true)]
        private List<Inputs.GetNodebalancersNodebalancerTransferArgs>? _transfers;
        public List<Inputs.GetNodebalancersNodebalancerTransferArgs> Transfers
        {
            get => _transfers ?? (_transfers = new List<Inputs.GetNodebalancersNodebalancerTransferArgs>());
            set => _transfers = value;
        }

        /// <summary>
        /// When this Linode NodeBalancer was last updated
        /// </summary>
        [Input("updated", required: true)]
        public string Updated { get; set; } = null!;

        public GetNodebalancersNodebalancerArgs()
        {
        }
        public static new GetNodebalancersNodebalancerArgs Empty => new GetNodebalancersNodebalancerArgs();
    }
}
