// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Inputs
{

    public sealed class GetVlansVlanInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// When the VLAN was created.
        /// </summary>
        [Input("created", required: true)]
        public Input<string> Created { get; set; } = null!;

        /// <summary>
        /// The unique label of the VLAN.
        /// </summary>
        [Input("label", required: true)]
        public Input<string> Label { get; set; } = null!;

        [Input("linodes", required: true)]
        private InputList<int>? _linodes;

        /// <summary>
        /// The running Linodes currently attached to the VLAN.
        /// </summary>
        public InputList<int> Linodes
        {
            get => _linodes ?? (_linodes = new InputList<int>());
            set => _linodes = value;
        }

        /// <summary>
        /// The region the VLAN is located in. See all regions [here](https://api.linode.com/v4/regions).
        /// </summary>
        [Input("region", required: true)]
        public Input<string> Region { get; set; } = null!;

        public GetVlansVlanInputArgs()
        {
        }
        public static new GetVlansVlanInputArgs Empty => new GetVlansVlanInputArgs();
    }
}
