// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Inputs
{

    public sealed class InstanceConfigInterfaceGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether this interface is currently booted and active.
        /// </summary>
        [Input("active")]
        public Input<bool>? Active { get; set; }

        /// <summary>
        /// The ID of the interface.
        /// </summary>
        [Input("id")]
        public Input<int>? Id { get; set; }

        [Input("ipRanges")]
        private InputList<string>? _ipRanges;

        /// <summary>
        /// IPv4 CIDR VPC Subnet ranges that are routed to this Interface. IPv6 ranges are also available to select participants in the Beta program.
        /// </summary>
        public InputList<string> IpRanges
        {
            get => _ipRanges ?? (_ipRanges = new InputList<string>());
            set => _ipRanges = value;
        }

        /// <summary>
        /// This Network Interface’s private IP address in Classless Inter-Domain Routing (CIDR) notation. (e.g. `10.0.0.1/24`) This field is only allowed for interfaces with the `vlan` purpose.
        /// </summary>
        [Input("ipamAddress")]
        public Input<string>? IpamAddress { get; set; }

        /// <summary>
        /// This Linode's IPv4 Addresses. Each Linode is assigned a single public IPv4 address upon creation, and may get a single private IPv4 address if needed. You may need to open a support ticket to get additional IPv4 addresses.
        /// </summary>
        [Input("ipv4")]
        public Input<Inputs.InstanceConfigInterfaceIpv4GetArgs>? Ipv4 { get; set; }

        /// <summary>
        /// The name of the VLAN to join. This field is only allowed and required for interfaces with the `vlan` purpose.
        /// </summary>
        [Input("label")]
        public Input<string>? Label { get; set; }

        /// <summary>
        /// Whether the interface is the primary interface that should have the default route for this Linode. This field is only allowed for interfaces with the `public` or `vpc` purpose.
        /// 
        /// * `ipv4` - (Optional) The IPv4 configuration of the VPC interface. This field is currently only allowed for interfaces with the `vpc` purpose.
        /// 
        /// The following computed attribute is available in a VPC interface:
        /// </summary>
        [Input("primary")]
        public Input<bool>? Primary { get; set; }

        /// <summary>
        /// The type of interface. (`public`, `vlan`, `vpc`)
        /// </summary>
        [Input("purpose", required: true)]
        public Input<string> Purpose { get; set; } = null!;

        /// <summary>
        /// The name of the VPC Subnet to join. This field is only allowed and required for interfaces with the `vpc` purpose.
        /// </summary>
        [Input("subnetId")]
        public Input<int>? SubnetId { get; set; }

        /// <summary>
        /// The ID of VPC which this interface is attached to.
        /// </summary>
        [Input("vpcId")]
        public Input<int>? VpcId { get; set; }

        public InstanceConfigInterfaceGetArgs()
        {
        }
        public static new InstanceConfigInterfaceGetArgs Empty => new InstanceConfigInterfaceGetArgs();
    }
}
