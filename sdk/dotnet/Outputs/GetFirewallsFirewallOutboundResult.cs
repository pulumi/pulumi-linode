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
    public sealed class GetFirewallsFirewallOutboundResult
    {
        /// <summary>
        /// Controls whether traffic is accepted or dropped by this rule (ACCEPT, DROP).
        /// </summary>
        public readonly string Action;
        /// <summary>
        /// A list of IPv4 addresses or networks in IP/mask format.
        /// </summary>
        public readonly ImmutableArray<string> Ipv4s;
        /// <summary>
        /// A list of IPv6 addresses or networks in IP/mask format.
        /// </summary>
        public readonly ImmutableArray<string> Ipv6s;
        /// <summary>
        /// The label for the Firewall. For display purposes only. If no label is provided, a default will be assigned.
        /// </summary>
        public readonly string Label;
        /// <summary>
        /// A string representation of ports and/or port ranges (i.e. "443" or "80-90, 91").
        /// </summary>
        public readonly string Ports;
        /// <summary>
        /// The network protocol this rule controls. (TCP, UDP, ICMP)
        /// </summary>
        public readonly string Protocol;

        [OutputConstructor]
        private GetFirewallsFirewallOutboundResult(
            string action,

            ImmutableArray<string> ipv4s,

            ImmutableArray<string> ipv6s,

            string label,

            string ports,

            string protocol)
        {
            Action = action;
            Ipv4s = ipv4s;
            Ipv6s = ipv6s;
            Label = label;
            Ports = ports;
            Protocol = protocol;
        }
    }
}
