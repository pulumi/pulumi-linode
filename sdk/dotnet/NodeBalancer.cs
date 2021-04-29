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
    /// Provides a Linode NodeBalancer resource.  This can be used to create, modify, and delete Linodes NodeBalancers in Linode's managed load balancer service.
    /// For more information, see [Getting Started with NodeBalancers](https://www.linode.com/docs/platform/nodebalancer/getting-started-with-nodebalancers/) and the [Linode APIv4 docs](https://developers.linode.com/api/v4#operation/createNodeBalancer).
    /// 
    /// ## Example Usage
    /// 
    /// The following example shows how one might use this resource to configure a NodeBalancer.
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Linode = Pulumi.Linode;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var foobar = new Linode.NodeBalancer("foobar", new Linode.NodeBalancerArgs
    ///         {
    ///             ClientConnThrottle = 20,
    ///             Label = "mynodebalancer",
    ///             Region = "us-east",
    ///             Tags = 
    ///             {
    ///                 "foobar",
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// ## Attributes
    /// 
    /// This resource exports the following attributes:
    /// 
    /// * `hostname` - This NodeBalancer's hostname, ending with .nodebalancer.linode.com
    /// 
    /// * `ipv4` - The Public IPv4 Address of this NodeBalancer
    /// 
    /// * `ipv6` - The Public IPv6 Address of this NodeBalancer
    /// 
    /// * `transfer` - The network transfer stats for the current month
    /// 
    /// ### transfer
    /// 
    /// The following attributes are available on transfer:
    /// 
    /// * `in` - The total transfer, in MB, used by this NodeBalancer for the current month
    /// 
    /// * `out` - The total inbound transfer, in MB, used for this NodeBalancer for the current month
    /// 
    /// * `total` - The total outbound transfer, in MB, used for this NodeBalancer for the current month
    /// 
    /// ## Import
    /// 
    /// Linodes NodeBalancers can be imported using the Linode NodeBalancer `id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import linode:index/nodeBalancer:NodeBalancer mynodebalancer 1234567
    /// ```
    /// 
    ///  The Linode Guide, [Import Existing Infrastructure to Terraform](https://www.linode.com/docs/applications/configuration-management/import-existing-infrastructure-to-terraform/), offers resource importing examples for NodeBalancers and other Linode resource types.
    /// </summary>
    [LinodeResourceType("linode:index/nodeBalancer:NodeBalancer")]
    public partial class NodeBalancer : Pulumi.CustomResource
    {
        /// <summary>
        /// Throttle connections per second (0-20). Set to 0 (default) to disable throttling.
        /// </summary>
        [Output("clientConnThrottle")]
        public Output<int?> ClientConnThrottle { get; private set; } = null!;

        /// <summary>
        /// When this NodeBalancer was created.
        /// </summary>
        [Output("created")]
        public Output<string> Created { get; private set; } = null!;

        /// <summary>
        /// This NodeBalancer's hostname, ending with .nodebalancer.linode.com
        /// </summary>
        [Output("hostname")]
        public Output<string> Hostname { get; private set; } = null!;

        /// <summary>
        /// The Public IPv4 Address of this NodeBalancer
        /// </summary>
        [Output("ipv4")]
        public Output<string> Ipv4 { get; private set; } = null!;

        /// <summary>
        /// The Public IPv6 Address of this NodeBalancer
        /// </summary>
        [Output("ipv6")]
        public Output<string> Ipv6 { get; private set; } = null!;

        /// <summary>
        /// The label of the Linode NodeBalancer
        /// </summary>
        [Output("label")]
        public Output<string?> Label { get; private set; } = null!;

        /// <summary>
        /// The region where this NodeBalancer will be deployed.  Examples are `"us-east"`, `"us-west"`, `"ap-south"`, etc.  *Changing `region` forces the creation of a new Linode NodeBalancer.*.
        /// </summary>
        [Output("region")]
        public Output<string> Region { get; private set; } = null!;

        /// <summary>
        /// A list of tags applied to this object. Tags are for organizational purposes only.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<string>> Tags { get; private set; } = null!;

        /// <summary>
        /// Information about the amount of transfer this NodeBalancer has had so far this month.
        /// </summary>
        [Output("transfers")]
        public Output<ImmutableArray<Outputs.NodeBalancerTransfer>> Transfers { get; private set; } = null!;

        /// <summary>
        /// When this NodeBalancer was last updated.
        /// </summary>
        [Output("updated")]
        public Output<string> Updated { get; private set; } = null!;


        /// <summary>
        /// Create a NodeBalancer resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public NodeBalancer(string name, NodeBalancerArgs args, CustomResourceOptions? options = null)
            : base("linode:index/nodeBalancer:NodeBalancer", name, args ?? new NodeBalancerArgs(), MakeResourceOptions(options, ""))
        {
        }

        private NodeBalancer(string name, Input<string> id, NodeBalancerState? state = null, CustomResourceOptions? options = null)
            : base("linode:index/nodeBalancer:NodeBalancer", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing NodeBalancer resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static NodeBalancer Get(string name, Input<string> id, NodeBalancerState? state = null, CustomResourceOptions? options = null)
        {
            return new NodeBalancer(name, id, state, options);
        }
    }

    public sealed class NodeBalancerArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Throttle connections per second (0-20). Set to 0 (default) to disable throttling.
        /// </summary>
        [Input("clientConnThrottle")]
        public Input<int>? ClientConnThrottle { get; set; }

        /// <summary>
        /// The label of the Linode NodeBalancer
        /// </summary>
        [Input("label")]
        public Input<string>? Label { get; set; }

        /// <summary>
        /// The region where this NodeBalancer will be deployed.  Examples are `"us-east"`, `"us-west"`, `"ap-south"`, etc.  *Changing `region` forces the creation of a new Linode NodeBalancer.*.
        /// </summary>
        [Input("region", required: true)]
        public Input<string> Region { get; set; } = null!;

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// A list of tags applied to this object. Tags are for organizational purposes only.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        public NodeBalancerArgs()
        {
        }
    }

    public sealed class NodeBalancerState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Throttle connections per second (0-20). Set to 0 (default) to disable throttling.
        /// </summary>
        [Input("clientConnThrottle")]
        public Input<int>? ClientConnThrottle { get; set; }

        /// <summary>
        /// When this NodeBalancer was created.
        /// </summary>
        [Input("created")]
        public Input<string>? Created { get; set; }

        /// <summary>
        /// This NodeBalancer's hostname, ending with .nodebalancer.linode.com
        /// </summary>
        [Input("hostname")]
        public Input<string>? Hostname { get; set; }

        /// <summary>
        /// The Public IPv4 Address of this NodeBalancer
        /// </summary>
        [Input("ipv4")]
        public Input<string>? Ipv4 { get; set; }

        /// <summary>
        /// The Public IPv6 Address of this NodeBalancer
        /// </summary>
        [Input("ipv6")]
        public Input<string>? Ipv6 { get; set; }

        /// <summary>
        /// The label of the Linode NodeBalancer
        /// </summary>
        [Input("label")]
        public Input<string>? Label { get; set; }

        /// <summary>
        /// The region where this NodeBalancer will be deployed.  Examples are `"us-east"`, `"us-west"`, `"ap-south"`, etc.  *Changing `region` forces the creation of a new Linode NodeBalancer.*.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// A list of tags applied to this object. Tags are for organizational purposes only.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        [Input("transfers")]
        private InputList<Inputs.NodeBalancerTransferGetArgs>? _transfers;

        /// <summary>
        /// Information about the amount of transfer this NodeBalancer has had so far this month.
        /// </summary>
        public InputList<Inputs.NodeBalancerTransferGetArgs> Transfers
        {
            get => _transfers ?? (_transfers = new InputList<Inputs.NodeBalancerTransferGetArgs>());
            set => _transfers = value;
        }

        /// <summary>
        /// When this NodeBalancer was last updated.
        /// </summary>
        [Input("updated")]
        public Input<string>? Updated { get; set; }

        public NodeBalancerState()
        {
        }
    }
}
