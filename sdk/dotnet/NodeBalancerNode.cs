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
    /// Provides a Linode NodeBalancer Node resource.  This can be used to create, modify, and delete Linodes NodeBalancer Nodes.
    /// For more information, see [Getting Started with NodeBalancers](https://www.linode.com/docs/platform/nodebalancer/getting-started-with-nodebalancers/) and the [Linode APIv4 docs](https://developers.linode.com/api/v4#operation/createNodeBalancerNode).
    /// 
    /// ## Import
    /// 
    /// NodeBalancer Nodes can be imported using the NodeBalancer `nodebalancer_id` followed by the NodeBalancer Config `config_id` followed by the NodeBalancer Node `id`, separated by a comma, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import linode:index/nodeBalancerNode:NodeBalancerNode https-foobar-1 1234567,7654321,9999999
    /// ```
    /// </summary>
    [LinodeResourceType("linode:index/nodeBalancerNode:NodeBalancerNode")]
    public partial class NodeBalancerNode : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The private IP Address where this backend can be reached. This must be a private IP address.
        /// 
        /// - - -
        /// </summary>
        [Output("address")]
        public Output<string> Address { get; private set; } = null!;

        /// <summary>
        /// The ID of the NodeBalancerConfig to access.
        /// </summary>
        [Output("configId")]
        public Output<int> ConfigId { get; private set; } = null!;

        /// <summary>
        /// The label of the Linode NodeBalancer Node. This is for display purposes only.
        /// </summary>
        [Output("label")]
        public Output<string> Label { get; private set; } = null!;

        /// <summary>
        /// The mode this NodeBalancer should use when sending traffic to this backend. If set to `accept` this backend is accepting traffic. If set to `reject` this backend will not receive traffic. If set to `drain` this backend will not receive new traffic, but connections already pinned to it will continue to be routed to it. (`accept`, `reject`, `drain`, `backup`)
        /// </summary>
        [Output("mode")]
        public Output<string> Mode { get; private set; } = null!;

        /// <summary>
        /// The ID of the NodeBalancer to access.
        /// </summary>
        [Output("nodebalancerId")]
        public Output<int> NodebalancerId { get; private set; } = null!;

        /// <summary>
        /// The current status of this node, based on the configured checks of its NodeBalancer Config. (`unknown`, `UP`, `DOWN`).
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// Used when picking a backend to serve a request and is not pinned to a single backend yet. Nodes with a higher weight will receive more traffic. (1-255).
        /// </summary>
        [Output("weight")]
        public Output<int> Weight { get; private set; } = null!;


        /// <summary>
        /// Create a NodeBalancerNode resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public NodeBalancerNode(string name, NodeBalancerNodeArgs args, CustomResourceOptions? options = null)
            : base("linode:index/nodeBalancerNode:NodeBalancerNode", name, args ?? new NodeBalancerNodeArgs(), MakeResourceOptions(options, ""))
        {
        }

        private NodeBalancerNode(string name, Input<string> id, NodeBalancerNodeState? state = null, CustomResourceOptions? options = null)
            : base("linode:index/nodeBalancerNode:NodeBalancerNode", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing NodeBalancerNode resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static NodeBalancerNode Get(string name, Input<string> id, NodeBalancerNodeState? state = null, CustomResourceOptions? options = null)
        {
            return new NodeBalancerNode(name, id, state, options);
        }
    }

    public sealed class NodeBalancerNodeArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The private IP Address where this backend can be reached. This must be a private IP address.
        /// 
        /// - - -
        /// </summary>
        [Input("address", required: true)]
        public Input<string> Address { get; set; } = null!;

        /// <summary>
        /// The ID of the NodeBalancerConfig to access.
        /// </summary>
        [Input("configId", required: true)]
        public Input<int> ConfigId { get; set; } = null!;

        /// <summary>
        /// The label of the Linode NodeBalancer Node. This is for display purposes only.
        /// </summary>
        [Input("label", required: true)]
        public Input<string> Label { get; set; } = null!;

        /// <summary>
        /// The mode this NodeBalancer should use when sending traffic to this backend. If set to `accept` this backend is accepting traffic. If set to `reject` this backend will not receive traffic. If set to `drain` this backend will not receive new traffic, but connections already pinned to it will continue to be routed to it. (`accept`, `reject`, `drain`, `backup`)
        /// </summary>
        [Input("mode")]
        public Input<string>? Mode { get; set; }

        /// <summary>
        /// The ID of the NodeBalancer to access.
        /// </summary>
        [Input("nodebalancerId", required: true)]
        public Input<int> NodebalancerId { get; set; } = null!;

        /// <summary>
        /// Used when picking a backend to serve a request and is not pinned to a single backend yet. Nodes with a higher weight will receive more traffic. (1-255).
        /// </summary>
        [Input("weight")]
        public Input<int>? Weight { get; set; }

        public NodeBalancerNodeArgs()
        {
        }
        public static new NodeBalancerNodeArgs Empty => new NodeBalancerNodeArgs();
    }

    public sealed class NodeBalancerNodeState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The private IP Address where this backend can be reached. This must be a private IP address.
        /// 
        /// - - -
        /// </summary>
        [Input("address")]
        public Input<string>? Address { get; set; }

        /// <summary>
        /// The ID of the NodeBalancerConfig to access.
        /// </summary>
        [Input("configId")]
        public Input<int>? ConfigId { get; set; }

        /// <summary>
        /// The label of the Linode NodeBalancer Node. This is for display purposes only.
        /// </summary>
        [Input("label")]
        public Input<string>? Label { get; set; }

        /// <summary>
        /// The mode this NodeBalancer should use when sending traffic to this backend. If set to `accept` this backend is accepting traffic. If set to `reject` this backend will not receive traffic. If set to `drain` this backend will not receive new traffic, but connections already pinned to it will continue to be routed to it. (`accept`, `reject`, `drain`, `backup`)
        /// </summary>
        [Input("mode")]
        public Input<string>? Mode { get; set; }

        /// <summary>
        /// The ID of the NodeBalancer to access.
        /// </summary>
        [Input("nodebalancerId")]
        public Input<int>? NodebalancerId { get; set; }

        /// <summary>
        /// The current status of this node, based on the configured checks of its NodeBalancer Config. (`unknown`, `UP`, `DOWN`).
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// Used when picking a backend to serve a request and is not pinned to a single backend yet. Nodes with a higher weight will receive more traffic. (1-255).
        /// </summary>
        [Input("weight")]
        public Input<int>? Weight { get; set; }

        public NodeBalancerNodeState()
        {
        }
        public static new NodeBalancerNodeState Empty => new NodeBalancerNodeState();
    }
}
