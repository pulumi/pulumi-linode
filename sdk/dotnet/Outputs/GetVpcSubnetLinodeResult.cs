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
    public sealed class GetVpcSubnetLinodeResult
    {
        /// <summary>
        /// The unique id of this VPC subnet.
        /// </summary>
        public readonly int Id;
        public readonly ImmutableArray<Outputs.GetVpcSubnetLinodeInterfaceResult> Interfaces;

        [OutputConstructor]
        private GetVpcSubnetLinodeResult(
            int id,

            ImmutableArray<Outputs.GetVpcSubnetLinodeInterfaceResult> interfaces)
        {
            Id = id;
            Interfaces = interfaces;
        }
    }
}
