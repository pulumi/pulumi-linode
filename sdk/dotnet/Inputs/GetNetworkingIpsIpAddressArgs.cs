// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Inputs
{

    public sealed class GetNetworkingIpsIpAddressInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The IPv4 address that is configured as a 1:1 NAT for this VPC interface.
        /// </summary>
        [Input("address", required: true)]
        public Input<string> Address { get; set; } = null!;

        /// <summary>
        /// The default gateway for this address.
        /// </summary>
        [Input("gateway", required: true)]
        public Input<string> Gateway { get; set; } = null!;

        /// <summary>
        /// The ID of the Linode this address currently belongs to.
        /// </summary>
        [Input("linodeId", required: true)]
        public Input<int> LinodeId { get; set; } = null!;

        /// <summary>
        /// The number of bits set in the subnet mask.
        /// </summary>
        [Input("prefix", required: true)]
        public Input<int> Prefix { get; set; } = null!;

        /// <summary>
        /// Whether this is a public or private IP address.
        /// </summary>
        [Input("public", required: true)]
        public Input<bool> Public { get; set; } = null!;

        /// <summary>
        /// The reverse DNS assigned to this address. For public IPv4 addresses, this will be set to a default value provided by Linode if not explicitly set.
        /// </summary>
        [Input("rdns", required: true)]
        public Input<string> Rdns { get; set; } = null!;

        /// <summary>
        /// The Region this IP address resides in. See all regions [here](https://api.linode.com/v4/regions).
        /// </summary>
        [Input("region", required: true)]
        public Input<string> Region { get; set; } = null!;

        /// <summary>
        /// Whether this IP address is a reserved IP.
        /// </summary>
        [Input("reserved", required: true)]
        public Input<bool> Reserved { get; set; } = null!;

        /// <summary>
        /// The mask that separates host bits from network bits for this address.
        /// </summary>
        [Input("subnetMask", required: true)]
        public Input<string> SubnetMask { get; set; } = null!;

        /// <summary>
        /// The type of address this is (ipv4, ipv6, ipv6/pool, ipv6/range).
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        /// <summary>
        /// Contains information about the NAT 1:1 mapping of a public IP address to a VPC subnet.
        /// </summary>
        [Input("vpcNat11", required: true)]
        public Input<Inputs.GetNetworkingIpsIpAddressVpcNat11InputArgs> VpcNat11 { get; set; } = null!;

        public GetNetworkingIpsIpAddressInputArgs()
        {
        }
        public static new GetNetworkingIpsIpAddressInputArgs Empty => new GetNetworkingIpsIpAddressInputArgs();
    }
}
