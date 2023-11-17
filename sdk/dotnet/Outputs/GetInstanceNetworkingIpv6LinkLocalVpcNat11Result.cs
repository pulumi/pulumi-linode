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
    public sealed class GetInstanceNetworkingIpv6LinkLocalVpcNat11Result
    {
        /// <summary>
        /// The address.
        /// </summary>
        public readonly string Address;
        public readonly int SubnetId;
        public readonly int VpcId;

        [OutputConstructor]
        private GetInstanceNetworkingIpv6LinkLocalVpcNat11Result(
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
