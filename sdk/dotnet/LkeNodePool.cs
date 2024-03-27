// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode
{
    /// <summary>
    /// ## Import
    /// 
    /// LKE Node Pools can be imported using the `cluster_id,id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import linode:index/lkeNodePool:LkeNodePool my_pool 150003,12345
    /// ```
    /// </summary>
    [LinodeResourceType("linode:index/lkeNodePool:LkeNodePool")]
    public partial class LkeNodePool : global::Pulumi.CustomResource
    {
        [Output("autoscaler")]
        public Output<Outputs.LkeNodePoolAutoscaler?> Autoscaler { get; private set; } = null!;

        /// <summary>
        /// ID of the LKE Cluster where to create the current Node Pool.
        /// </summary>
        [Output("clusterId")]
        public Output<int> ClusterId { get; private set; } = null!;

        /// <summary>
        /// The number of nodes in the Node Pool. If undefined with an autoscaler the initial node count will equal the autoscaler minimum.
        /// </summary>
        [Output("nodeCount")]
        public Output<int> NodeCount { get; private set; } = null!;

        /// <summary>
        /// A list of nodes in the node pool.
        /// </summary>
        [Output("nodes")]
        public Output<ImmutableArray<Outputs.LkeNodePoolNode>> Nodes { get; private set; } = null!;

        /// <summary>
        /// An array of tags applied to the Node Pool. Tags can be used to flag node pools as externally managed, see Externally Managed Node Pools for more details.
        /// 
        /// * `autoscaler` - (Optional) If defined, an autoscaler will be enabled with the given configuration.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<string>> Tags { get; private set; } = null!;

        /// <summary>
        /// A Linode Type for all nodes in the Node Pool. See all node types [here](https://api.linode.com/v4/linode/types).
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;


        /// <summary>
        /// Create a LkeNodePool resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public LkeNodePool(string name, LkeNodePoolArgs args, CustomResourceOptions? options = null)
            : base("linode:index/lkeNodePool:LkeNodePool", name, args ?? new LkeNodePoolArgs(), MakeResourceOptions(options, ""))
        {
        }

        private LkeNodePool(string name, Input<string> id, LkeNodePoolState? state = null, CustomResourceOptions? options = null)
            : base("linode:index/lkeNodePool:LkeNodePool", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing LkeNodePool resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static LkeNodePool Get(string name, Input<string> id, LkeNodePoolState? state = null, CustomResourceOptions? options = null)
        {
            return new LkeNodePool(name, id, state, options);
        }
    }

    public sealed class LkeNodePoolArgs : global::Pulumi.ResourceArgs
    {
        [Input("autoscaler")]
        public Input<Inputs.LkeNodePoolAutoscalerArgs>? Autoscaler { get; set; }

        /// <summary>
        /// ID of the LKE Cluster where to create the current Node Pool.
        /// </summary>
        [Input("clusterId", required: true)]
        public Input<int> ClusterId { get; set; } = null!;

        /// <summary>
        /// The number of nodes in the Node Pool. If undefined with an autoscaler the initial node count will equal the autoscaler minimum.
        /// </summary>
        [Input("nodeCount")]
        public Input<int>? NodeCount { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// An array of tags applied to the Node Pool. Tags can be used to flag node pools as externally managed, see Externally Managed Node Pools for more details.
        /// 
        /// * `autoscaler` - (Optional) If defined, an autoscaler will be enabled with the given configuration.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        /// <summary>
        /// A Linode Type for all nodes in the Node Pool. See all node types [here](https://api.linode.com/v4/linode/types).
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public LkeNodePoolArgs()
        {
        }
        public static new LkeNodePoolArgs Empty => new LkeNodePoolArgs();
    }

    public sealed class LkeNodePoolState : global::Pulumi.ResourceArgs
    {
        [Input("autoscaler")]
        public Input<Inputs.LkeNodePoolAutoscalerGetArgs>? Autoscaler { get; set; }

        /// <summary>
        /// ID of the LKE Cluster where to create the current Node Pool.
        /// </summary>
        [Input("clusterId")]
        public Input<int>? ClusterId { get; set; }

        /// <summary>
        /// The number of nodes in the Node Pool. If undefined with an autoscaler the initial node count will equal the autoscaler minimum.
        /// </summary>
        [Input("nodeCount")]
        public Input<int>? NodeCount { get; set; }

        [Input("nodes")]
        private InputList<Inputs.LkeNodePoolNodeGetArgs>? _nodes;

        /// <summary>
        /// A list of nodes in the node pool.
        /// </summary>
        public InputList<Inputs.LkeNodePoolNodeGetArgs> Nodes
        {
            get => _nodes ?? (_nodes = new InputList<Inputs.LkeNodePoolNodeGetArgs>());
            set => _nodes = value;
        }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// An array of tags applied to the Node Pool. Tags can be used to flag node pools as externally managed, see Externally Managed Node Pools for more details.
        /// 
        /// * `autoscaler` - (Optional) If defined, an autoscaler will be enabled with the given configuration.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        /// <summary>
        /// A Linode Type for all nodes in the Node Pool. See all node types [here](https://api.linode.com/v4/linode/types).
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public LkeNodePoolState()
        {
        }
        public static new LkeNodePoolState Empty => new LkeNodePoolState();
    }
}
