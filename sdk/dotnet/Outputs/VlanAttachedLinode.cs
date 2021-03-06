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
    public sealed class VlanAttachedLinode
    {
        /// <summary>
        /// The ID of the Linode.
        /// </summary>
        public readonly int? Id;
        /// <summary>
        /// The IPv4 address of the Linode.
        /// </summary>
        public readonly string? Ipv4Address;
        /// <summary>
        /// The mac address of the Linode.
        /// </summary>
        public readonly string? MacAddress;

        [OutputConstructor]
        private VlanAttachedLinode(
            int? id,

            string? ipv4Address,

            string? macAddress)
        {
            Id = id;
            Ipv4Address = ipv4Address;
            MacAddress = macAddress;
        }
    }
}
