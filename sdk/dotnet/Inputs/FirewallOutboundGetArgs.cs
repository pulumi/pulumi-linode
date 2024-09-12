// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Inputs
{

    public sealed class FirewallOutboundGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Controls whether traffic is accepted or dropped by this rule. Overrides the Firewall's inbound_policy if this is an inbound rule, or the outbound_policy if this is an outbound rule.
        /// </summary>
        [Input("action", required: true)]
        public Input<string> Action { get; set; } = null!;

        /// <summary>
        /// Used to describe this rule. For display purposes only.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("ipv4s")]
        private InputList<string>? _ipv4s;

        /// <summary>
        /// A list of CIDR blocks or 0.0.0.0/0 (to allow all) this rule applies to.
        /// </summary>
        public InputList<string> Ipv4s
        {
            get => _ipv4s ?? (_ipv4s = new InputList<string>());
            set => _ipv4s = value;
        }

        [Input("ipv6s")]
        private InputList<string>? _ipv6s;

        /// <summary>
        /// A list of IPv6 addresses or networks this rule applies to.
        /// </summary>
        public InputList<string> Ipv6s
        {
            get => _ipv6s ?? (_ipv6s = new InputList<string>());
            set => _ipv6s = value;
        }

        /// <summary>
        /// This Firewall's unique label.
        /// </summary>
        [Input("label", required: true)]
        public Input<string> Label { get; set; } = null!;

        /// <summary>
        /// A string representation of ports and/or port ranges (i.e. "443" or "80-90, 91").
        /// </summary>
        [Input("ports")]
        public Input<string>? Ports { get; set; }

        /// <summary>
        /// The network protocol this rule controls.
        /// </summary>
        [Input("protocol", required: true)]
        public Input<string> Protocol { get; set; } = null!;

        public FirewallOutboundGetArgs()
        {
        }
        public static new FirewallOutboundGetArgs Empty => new FirewallOutboundGetArgs();
    }
}
