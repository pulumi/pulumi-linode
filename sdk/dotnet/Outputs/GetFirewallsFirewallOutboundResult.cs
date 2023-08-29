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
        public readonly string Action;
        public readonly ImmutableArray<string> Ipv4s;
        public readonly ImmutableArray<string> Ipv6s;
        /// <summary>
        /// The label for the Firewall. For display purposes only. If no label is provided, a default will be assigned.
        /// </summary>
        public readonly string Label;
        public readonly string Ports;
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
