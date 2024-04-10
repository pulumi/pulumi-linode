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
    public sealed class GetInstanceNetworkingIpv4ReservedVpcNat11Result
    {
        /// <summary>
        /// The address.
        /// </summary>
        public readonly string Address;
        /// <summary>
        /// The unique globally general API entity identifier for the VPC subnet.
        /// </summary>
        public readonly int SubnetId;
        /// <summary>
        /// The unique globally general API entity identifier for the VPC.
        /// </summary>
        public readonly int VpcId;

        [OutputConstructor]
        private GetInstanceNetworkingIpv4ReservedVpcNat11Result(
            string address,

            int subnetId,

            int vpcId)
        {
            Address = address;
            SubnetId = subnetId;
            VpcId = vpcId;
        }
    }
}
