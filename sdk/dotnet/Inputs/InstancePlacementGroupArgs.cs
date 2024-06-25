// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Inputs
{

    public sealed class InstancePlacementGroupArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The affinity policy enforced by the Placement Group.
        /// </summary>
        [Input("affinityType")]
        public Input<string>? AffinityType { get; set; }

        [Input("compliantOnly")]
        public Input<bool>? CompliantOnly { get; set; }

        /// <summary>
        /// The ID of the Placement Group.
        /// </summary>
        [Input("id", required: true)]
        public Input<int> Id { get; set; } = null!;

        /// <summary>
        /// Whether the Placement Group enforces strict compliance.
        /// </summary>
        [Input("isStrict")]
        public Input<bool>? IsStrict { get; set; }

        /// <summary>
        /// The Linode's label is for display purposes only. If no label is provided for a Linode, a default will be assigned.
        /// </summary>
        [Input("label")]
        public Input<string>? Label { get; set; }

        public InstancePlacementGroupArgs()
        {
        }
        public static new InstancePlacementGroupArgs Empty => new InstancePlacementGroupArgs();
    }
}
