// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Inputs
{

    public sealed class InstanceInterfaceGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// This Network Interface’s private IP address in Classless Inter-Domain Routing (CIDR) notation.
        /// </summary>
        [Input("ipamAddress")]
        public Input<string>? IpamAddress { get; set; }

        /// <summary>
        /// The name of this interface. If the interface is a VLAN, a label is required.
        /// </summary>
        [Input("label")]
        public Input<string>? Label { get; set; }

        /// <summary>
        /// The type of interface. (`public`, `vlan`)
        /// </summary>
        [Input("purpose")]
        public Input<string>? Purpose { get; set; }

        public InstanceInterfaceGetArgs()
        {
        }
    }
}
