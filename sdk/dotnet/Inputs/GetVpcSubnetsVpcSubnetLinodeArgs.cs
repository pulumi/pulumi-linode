// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Inputs
{

    public sealed class GetVpcSubnetsVpcSubnetLinodeInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The unique id of the VPC subnet.
        /// </summary>
        [Input("id", required: true)]
        public Input<int> Id { get; set; } = null!;

        [Input("interfaces", required: true)]
        private InputList<Inputs.GetVpcSubnetsVpcSubnetLinodeInterfaceInputArgs>? _interfaces;
        public InputList<Inputs.GetVpcSubnetsVpcSubnetLinodeInterfaceInputArgs> Interfaces
        {
            get => _interfaces ?? (_interfaces = new InputList<Inputs.GetVpcSubnetsVpcSubnetLinodeInterfaceInputArgs>());
            set => _interfaces = value;
        }

        public GetVpcSubnetsVpcSubnetLinodeInputArgs()
        {
        }
        public static new GetVpcSubnetsVpcSubnetLinodeInputArgs Empty => new GetVpcSubnetsVpcSubnetLinodeInputArgs();
    }
}
