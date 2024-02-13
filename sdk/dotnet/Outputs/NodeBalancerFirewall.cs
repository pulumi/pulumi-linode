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
    public sealed class NodeBalancerFirewall
    {
        /// <summary>
        /// When this firewall was created.
        /// </summary>
        public readonly string Created;
        /// <summary>
        /// (Required) The Firewall's ID.
        /// </summary>
        public readonly int Id;
        /// <summary>
        /// The default behavior for inbound traffic. (`ACCEPT`, `DROP`)
        /// </summary>
        public readonly string InboundPolicy;
        public readonly ImmutableArray<Outputs.NodeBalancerFirewallInbound> Inbounds;
        /// <summary>
        /// The label of the Linode NodeBalancer
        /// </summary>
        public readonly string Label;
        /// <summary>
        /// The default behavior for outbound traffic. (`ACCEPT`, `DROP`)
        /// </summary>
        public readonly string OutboundPolicy;
        public readonly ImmutableArray<Outputs.NodeBalancerFirewallOutbound> Outbounds;
        /// <summary>
        /// The status of the firewall. (`enabled`, `disabled`, `deleted`)
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// A list of tags applied to this object. Tags are for organizational purposes only.
        /// </summary>
        public readonly ImmutableArray<string> Tags;
        /// <summary>
        /// When this firewall was last updated.
        /// </summary>
        public readonly string Updated;

        [OutputConstructor]
        private NodeBalancerFirewall(
            string created,

            int id,

            string inboundPolicy,

            ImmutableArray<Outputs.NodeBalancerFirewallInbound> inbounds,

            string label,

            string outboundPolicy,

            ImmutableArray<Outputs.NodeBalancerFirewallOutbound> outbounds,

            string status,

            ImmutableArray<string> tags,

            string updated)
        {
            Created = created;
            Id = id;
            InboundPolicy = inboundPolicy;
            Inbounds = inbounds;
            Label = label;
            OutboundPolicy = outboundPolicy;
            Outbounds = outbounds;
            Status = status;
            Tags = tags;
            Updated = updated;
        }
    }
}
