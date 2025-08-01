// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Outputs
{

    [OutputType]
    public sealed class NodeBalancerFirewallInbound
    {
        /// <summary>
        /// Controls whether traffic is accepted or dropped by this rule. Overrides the Firewall’s inbound_policy if this is an inbound rule, or the outbound_policy if this is an outbound rule.
        /// </summary>
        public readonly string Action;
        public readonly string Description;
        /// <summary>
        /// A list of IPv4 addresses or networks. Must be in IP/mask format.
        /// </summary>
        public readonly ImmutableArray<string> Ipv4s;
        /// <summary>
        /// A list of IPv6 addresses or networks. Must be in IP/mask format.
        /// </summary>
        public readonly ImmutableArray<string> Ipv6s;
        /// <summary>
        /// The label of the Linode NodeBalancer
        /// </summary>
        public readonly string Label;
        /// <summary>
        /// A string representation of ports and/or port ranges (i.e. "443" or "80-90, 91").
        /// </summary>
        public readonly string Ports;
        /// <summary>
        /// The network protocol this rule controls. (`TCP`, `UDP`, `ICMP`)
        /// </summary>
        public readonly string Protocol;

        [OutputConstructor]
        private NodeBalancerFirewallInbound(
            string action,

            string description,

            ImmutableArray<string> ipv4s,

            ImmutableArray<string> ipv6s,

            string label,

            string ports,

            string protocol)
        {
            Action = action;
            Description = description;
            Ipv4s = ipv4s;
            Ipv6s = ipv6s;
            Label = label;
            Ports = ports;
            Protocol = protocol;
        }
    }
}
