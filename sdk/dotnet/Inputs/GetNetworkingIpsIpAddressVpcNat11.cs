// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Inputs
{

    public sealed class GetNetworkingIpsIpAddressVpcNat11Args : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The IPv4 address that is configured as a 1:1 NAT for this VPC interface.
        /// </summary>
        [Input("address", required: true)]
        public string Address { get; set; } = null!;

        /// <summary>
        /// The `id` of the VPC Subnet for this Interface.
        /// </summary>
        [Input("subnetId", required: true)]
        public int SubnetId { get; set; }

        /// <summary>
        /// The `id` of the VPC configured for this Interface.
        /// </summary>
        [Input("vpcId", required: true)]
        public int VpcId { get; set; }

        public GetNetworkingIpsIpAddressVpcNat11Args()
        {
        }
        public static new GetNetworkingIpsIpAddressVpcNat11Args Empty => new GetNetworkingIpsIpAddressVpcNat11Args();
    }
}
