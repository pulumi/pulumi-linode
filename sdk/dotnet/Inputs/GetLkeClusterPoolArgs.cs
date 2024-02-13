// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Inputs
{

    public sealed class GetLkeClusterPoolInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("autoscalers")]
        private InputList<Inputs.GetLkeClusterPoolAutoscalerInputArgs>? _autoscalers;

        /// <summary>
        /// The configuration options for the autoscaler. This field only contains an autoscaler configuration if autoscaling is enabled on this cluster.
        /// </summary>
        public InputList<Inputs.GetLkeClusterPoolAutoscalerInputArgs> Autoscalers
        {
            get => _autoscalers ?? (_autoscalers = new InputList<Inputs.GetLkeClusterPoolAutoscalerInputArgs>());
            set => _autoscalers = value;
        }

        /// <summary>
        /// The number of nodes in the Node Pool.
        /// </summary>
        [Input("count", required: true)]
        public Input<int> Count { get; set; } = null!;

        [Input("disks")]
        private InputList<Inputs.GetLkeClusterPoolDiskInputArgs>? _disks;

        /// <summary>
        /// This Node Pool’s custom disk layout.
        /// </summary>
        public InputList<Inputs.GetLkeClusterPoolDiskInputArgs> Disks
        {
            get => _disks ?? (_disks = new InputList<Inputs.GetLkeClusterPoolDiskInputArgs>());
            set => _disks = value;
        }

        /// <summary>
        /// The LKE Cluster's ID.
        /// </summary>
        [Input("id", required: true)]
        public Input<int> Id { get; set; } = null!;

        [Input("nodes")]
        private InputList<Inputs.GetLkeClusterPoolNodeInputArgs>? _nodes;

        /// <summary>
        /// The nodes in the Node Pool.
        /// </summary>
        public InputList<Inputs.GetLkeClusterPoolNodeInputArgs> Nodes
        {
            get => _nodes ?? (_nodes = new InputList<Inputs.GetLkeClusterPoolNodeInputArgs>());
            set => _nodes = value;
        }

        [Input("tags", required: true)]
        private InputList<string>? _tags;

        /// <summary>
        /// An array of tags applied to this object. Tags are for organizational purposes only.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        /// <summary>
        /// This custom disk partition’s filesystem type.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public GetLkeClusterPoolInputArgs()
        {
        }
        public static new GetLkeClusterPoolInputArgs Empty => new GetLkeClusterPoolInputArgs();
    }
}
