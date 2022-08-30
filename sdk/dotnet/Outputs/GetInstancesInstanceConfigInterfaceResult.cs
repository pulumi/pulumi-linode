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
    public sealed class GetInstancesInstanceConfigInterfaceResult
    {
        /// <summary>
        /// (Optional) This Network Interface’s private IP address in Classless Inter-Domain Routing (CIDR) notation.
        /// </summary>
        public readonly string? IpamAddress;
        /// <summary>
        /// (Optional) The name of this interface. If the interface is a `vlan`, a label is required. Must be undefined for `public` purpose interfaces.
        /// </summary>
        public readonly string? Label;
        /// <summary>
        /// (Required) The type of interface. (`public`, `vlan`)
        /// </summary>
        public readonly string? Purpose;

        [OutputConstructor]
        private GetInstancesInstanceConfigInterfaceResult(
            string? ipamAddress,

            string? label,

            string? purpose)
        {
            IpamAddress = ipamAddress;
            Label = label;
            Purpose = purpose;
        }
    }
}
