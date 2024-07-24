// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Inputs
{

    public sealed class PlacementGroupMemberArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether this Linode is currently compliant with the group's placement group type.
        /// </summary>
        [Input("isCompliant", required: true)]
        public Input<bool> IsCompliant { get; set; } = null!;

        /// <summary>
        /// The ID of the Linode.
        /// </summary>
        [Input("linodeId", required: true)]
        public Input<int> LinodeId { get; set; } = null!;

        public PlacementGroupMemberArgs()
        {
        }
        public static new PlacementGroupMemberArgs Empty => new PlacementGroupMemberArgs();
    }
}
