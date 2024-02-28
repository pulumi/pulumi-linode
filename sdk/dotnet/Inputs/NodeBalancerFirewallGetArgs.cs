// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Inputs
{

    public sealed class NodeBalancerFirewallGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// When this firewall was created.
        /// </summary>
        [Input("created", required: true)]
        public Input<string> Created { get; set; } = null!;

        /// <summary>
        /// (Required) The Firewall's ID.
        /// </summary>
        [Input("id", required: true)]
        public Input<int> Id { get; set; } = null!;

        /// <summary>
        /// The default behavior for inbound traffic. (`ACCEPT`, `DROP`)
        /// </summary>
        [Input("inboundPolicy", required: true)]
        public Input<string> InboundPolicy { get; set; } = null!;

        [Input("inbounds", required: true)]
        private InputList<Inputs.NodeBalancerFirewallInboundGetArgs>? _inbounds;
        public InputList<Inputs.NodeBalancerFirewallInboundGetArgs> Inbounds
        {
            get => _inbounds ?? (_inbounds = new InputList<Inputs.NodeBalancerFirewallInboundGetArgs>());
            set => _inbounds = value;
        }

        /// <summary>
        /// The label of the Linode NodeBalancer
        /// </summary>
        [Input("label", required: true)]
        public Input<string> Label { get; set; } = null!;

        /// <summary>
        /// The default behavior for outbound traffic. (`ACCEPT`, `DROP`)
        /// </summary>
        [Input("outboundPolicy", required: true)]
        public Input<string> OutboundPolicy { get; set; } = null!;

        [Input("outbounds", required: true)]
        private InputList<Inputs.NodeBalancerFirewallOutboundGetArgs>? _outbounds;
        public InputList<Inputs.NodeBalancerFirewallOutboundGetArgs> Outbounds
        {
            get => _outbounds ?? (_outbounds = new InputList<Inputs.NodeBalancerFirewallOutboundGetArgs>());
            set => _outbounds = value;
        }

        /// <summary>
        /// The status of the firewall. (`enabled`, `disabled`, `deleted`)
        /// </summary>
        [Input("status", required: true)]
        public Input<string> Status { get; set; } = null!;

        [Input("tags", required: true)]
        private InputList<string>? _tags;

        /// <summary>
        /// A list of tags applied to this object. Tags are case-insensitive and are for organizational purposes only.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        /// <summary>
        /// When this firewall was last updated.
        /// </summary>
        [Input("updated", required: true)]
        public Input<string> Updated { get; set; } = null!;

        public NodeBalancerFirewallGetArgs()
        {
        }
        public static new NodeBalancerFirewallGetArgs Empty => new NodeBalancerFirewallGetArgs();
    }
}
