// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Outputs
{

    [OutputType]
    public sealed class GetNodebalancersNodebalancerResult
    {
        /// <summary>
        /// Throttle connections per second (0-20)
        /// </summary>
        public readonly int ClientConnThrottle;
        /// <summary>
        /// When this Linode NodeBalancer was created
        /// </summary>
        public readonly string Created;
        /// <summary>
        /// This NodeBalancer's hostname, ending with .ip.linodeusercontent.com
        /// </summary>
        public readonly string Hostname;
        /// <summary>
        /// The Linode NodeBalancer's unique ID
        /// </summary>
        public readonly int Id;
        /// <summary>
        /// The Public IPv4 Address of this NodeBalancer
        /// </summary>
        public readonly string Ipv4;
        /// <summary>
        /// The Public IPv6 Address of this NodeBalancer
        /// </summary>
        public readonly string Ipv6;
        /// <summary>
        /// The label of the Linode NodeBalancer
        /// </summary>
        public readonly string Label;
        /// <summary>
        /// The Region where this Linode NodeBalancer is located. NodeBalancers only support backends in the same Region.
        /// </summary>
        public readonly string Region;
        /// <summary>
        /// A list of tags applied to this object. Tags are case-insensitive and are for organizational purposes only.
        /// </summary>
        public readonly ImmutableArray<string> Tags;
        /// <summary>
        /// Information about the amount of transfer this NodeBalancer has had so far this month.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetNodebalancersNodebalancerTransferResult> Transfers;
        /// <summary>
        /// When this Linode NodeBalancer was last updated
        /// </summary>
        public readonly string Updated;

        [OutputConstructor]
        private GetNodebalancersNodebalancerResult(
            int clientConnThrottle,

            string created,

            string hostname,

            int id,

            string ipv4,

            string ipv6,

            string label,

            string region,

            ImmutableArray<string> tags,

            ImmutableArray<Outputs.GetNodebalancersNodebalancerTransferResult> transfers,

            string updated)
        {
            ClientConnThrottle = clientConnThrottle;
            Created = created;
            Hostname = hostname;
            Id = id;
            Ipv4 = ipv4;
            Ipv6 = ipv6;
            Label = label;
            Region = region;
            Tags = tags;
            Transfers = transfers;
            Updated = updated;
        }
    }
}
