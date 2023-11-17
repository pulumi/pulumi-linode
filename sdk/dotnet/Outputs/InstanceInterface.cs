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
    public sealed class InstanceInterface
    {
        public readonly bool? Active;
        /// <summary>
        /// The ID of the disk in the Linode API.
        /// </summary>
        public readonly int? Id;
        /// <summary>
        /// IPv4 CIDR VPC Subnet ranges that are routed to this Interface. IPv6 ranges are also available to select participants in the Beta program.
        /// </summary>
        public readonly ImmutableArray<string> IpRanges;
        /// <summary>
        /// This Network Interface’s private IP address in Classless Inter-Domain Routing (CIDR) notation. (e.g. `10.0.0.1/24`) This field is only allowed for interfaces with the `vlan` purpose.
        /// </summary>
        public readonly string? IpamAddress;
        /// <summary>
        /// This Linode's IPv4 Addresses. Each Linode is assigned a single public IPv4 address upon creation, and may get a single private IPv4 address if needed. You may need to open a support ticket to get additional IPv4 addresses.
        /// </summary>
        public readonly Outputs.InstanceInterfaceIpv4? Ipv4;
        /// <summary>
        /// The name of the VLAN to join. This field is only allowed and required for interfaces with the `vlan` purpose.
        /// </summary>
        public readonly string? Label;
        /// <summary>
        /// Whether the interface is the primary interface that should have the default route for this Linode. This field is only allowed for interfaces with the `public` or `vpc` purpose.
        /// 
        /// * `ipv4` - (Optional) The IPv4 configuration of the VPC interface. This field is currently only allowed for interfaces with the `vpc` purpose.
        /// 
        /// The following computed attribute is available in a VPC interface:
        /// </summary>
        public readonly bool? Primary;
        /// <summary>
        /// The type of interface. (`public`, `vlan`, `vpc`)
        /// </summary>
        public readonly string Purpose;
        /// <summary>
        /// The name of the VPC Subnet to join. This field is only allowed and required for interfaces with the `vpc` purpose.
        /// </summary>
        public readonly int? SubnetId;
        /// <summary>
        /// The ID of VPC which this interface is attached to.
        /// </summary>
        public readonly int? VpcId;

        [OutputConstructor]
        private InstanceInterface(
            bool? active,

            int? id,

            ImmutableArray<string> ipRanges,

            string? ipamAddress,

            Outputs.InstanceInterfaceIpv4? ipv4,

            string? label,

            bool? primary,

            string purpose,

            int? subnetId,

            int? vpcId)
        {
            Active = active;
            Id = id;
            IpRanges = ipRanges;
            IpamAddress = ipamAddress;
            Ipv4 = ipv4;
            Label = label;
            Primary = primary;
            Purpose = purpose;
            SubnetId = subnetId;
            VpcId = vpcId;
        }
    }
}
