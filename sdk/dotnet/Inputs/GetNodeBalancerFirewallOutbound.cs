// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Inputs
{

    public sealed class GetNodeBalancerFirewallOutboundArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Controls whether traffic is accepted or dropped by this rule. Overrides the Firewall’s inbound_policy if this is an inbound rule, or the outbound_policy if this is an outbound rule.
        /// </summary>
        [Input("action", required: true)]
        public string Action { get; set; } = null!;

        [Input("ipv4s", required: true)]
        private List<string>? _ipv4s;

        /// <summary>
        /// A list of IPv4 addresses or networks. Must be in IP/mask format.
        /// </summary>
        public List<string> Ipv4s
        {
            get => _ipv4s ?? (_ipv4s = new List<string>());
            set => _ipv4s = value;
        }

        [Input("ipv6s", required: true)]
        private List<string>? _ipv6s;

        /// <summary>
        /// A list of IPv6 addresses or networks. Must be in IP/mask format.
        /// </summary>
        public List<string> Ipv6s
        {
            get => _ipv6s ?? (_ipv6s = new List<string>());
            set => _ipv6s = value;
        }

        /// <summary>
        /// Used to identify this rule. For display purposes only.
        /// </summary>
        [Input("label", required: true)]
        public string Label { get; set; } = null!;

        /// <summary>
        /// A string representation of ports and/or port ranges (i.e. "443" or "80-90, 91").
        /// </summary>
        [Input("ports", required: true)]
        public string Ports { get; set; } = null!;

        /// <summary>
        /// The network protocol this rule controls. (`TCP`, `UDP`, `ICMP`)
        /// </summary>
        [Input("protocol", required: true)]
        public string Protocol { get; set; } = null!;

        public GetNodeBalancerFirewallOutboundArgs()
        {
        }
        public static new GetNodeBalancerFirewallOutboundArgs Empty => new GetNodeBalancerFirewallOutboundArgs();
    }
}
