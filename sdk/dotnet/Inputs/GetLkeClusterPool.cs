// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Inputs
{

    public sealed class GetLkeClusterPoolArgs : global::Pulumi.InvokeArgs
    {
        [Input("autoscalers")]
        private List<Inputs.GetLkeClusterPoolAutoscalerArgs>? _autoscalers;

        /// <summary>
        /// The configuration options for the autoscaler. This field only contains an autoscaler configuration if autoscaling is enabled on this cluster.
        /// </summary>
        public List<Inputs.GetLkeClusterPoolAutoscalerArgs> Autoscalers
        {
            get => _autoscalers ?? (_autoscalers = new List<Inputs.GetLkeClusterPoolAutoscalerArgs>());
            set => _autoscalers = value;
        }

        /// <summary>
        /// The number of nodes in the Node Pool.
        /// </summary>
        [Input("count", required: true)]
        public int Count { get; set; }

        /// <summary>
        /// The disk encryption policy for nodes in this pool.
        /// </summary>
        [Input("diskEncryption", required: true)]
        public string DiskEncryption { get; set; } = null!;

        [Input("disks")]
        private List<Inputs.GetLkeClusterPoolDiskArgs>? _disks;

        /// <summary>
        /// This Node Pool’s custom disk layout.
        /// </summary>
        public List<Inputs.GetLkeClusterPoolDiskArgs> Disks
        {
            get => _disks ?? (_disks = new List<Inputs.GetLkeClusterPoolDiskArgs>());
            set => _disks = value;
        }

        /// <summary>
        /// The LKE Cluster's ID.
        /// </summary>
        [Input("id", required: true)]
        public int Id { get; set; }

        [Input("labels", required: true)]
        private Dictionary<string, string>? _labels;

        /// <summary>
        /// Key-value pairs added as labels to nodes in the node pool. Labels help classify your nodes and to easily select subsets of objects.
        /// </summary>
        public Dictionary<string, string> Labels
        {
            get => _labels ?? (_labels = new Dictionary<string, string>());
            set => _labels = value;
        }

        [Input("nodes")]
        private List<Inputs.GetLkeClusterPoolNodeArgs>? _nodes;

        /// <summary>
        /// The nodes in the Node Pool.
        /// </summary>
        public List<Inputs.GetLkeClusterPoolNodeArgs> Nodes
        {
            get => _nodes ?? (_nodes = new List<Inputs.GetLkeClusterPoolNodeArgs>());
            set => _nodes = value;
        }

        [Input("tags", required: true)]
        private List<string>? _tags;

        /// <summary>
        /// An array of tags applied to this object. Tags are case-insensitive and are for organizational purposes only.
        /// </summary>
        public List<string> Tags
        {
            get => _tags ?? (_tags = new List<string>());
            set => _tags = value;
        }

        [Input("taints", required: true)]
        private List<Inputs.GetLkeClusterPoolTaintArgs>? _taints;

        /// <summary>
        /// Kubernetes taints to add to node pool nodes. Taints help control how pods are scheduled onto nodes, specifically allowing them to repel certain pods.
        /// </summary>
        public List<Inputs.GetLkeClusterPoolTaintArgs> Taints
        {
            get => _taints ?? (_taints = new List<Inputs.GetLkeClusterPoolTaintArgs>());
            set => _taints = value;
        }

        /// <summary>
        /// The linode type for all of the nodes in the Node Pool. See all node types [here](https://api.linode.com/v4/linode/types).
        /// </summary>
        [Input("type", required: true)]
        public string Type { get; set; } = null!;

        public GetLkeClusterPoolArgs()
        {
        }
        public static new GetLkeClusterPoolArgs Empty => new GetLkeClusterPoolArgs();
    }
}
