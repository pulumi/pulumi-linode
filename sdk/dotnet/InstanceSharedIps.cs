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
    /// &gt; **Beta Notice** IPv6 sharing is currently available through early access.
    /// To use early access resources, the `api_version` provider argument must be set to `v4beta`.
    /// To learn more, see the early access documentation.
    /// 
    /// &gt; **Notice** This resource should only be defined once per-instance and should not be used alongside the `shared_ipv4` field in `linode.Instance`.
    /// 
    /// Manages IPs shared to a Linode instance.
    /// 
    /// ## Example Usage
    /// 
    /// Share in IPv4 address between two instances:
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Linode = Pulumi.Linode;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     // Create a single primary node
    ///     var primaryInstance = new Linode.Instance("primary", new()
    ///     {
    ///         Label = "node-primary",
    ///         Type = "g6-nanode-1",
    ///         Region = "eu-central",
    ///     });
    /// 
    ///     // Allocate an IP under the primary node
    ///     var primary = new Linode.InstanceIp("primary", new()
    ///     {
    ///         LinodeId = primaryInstance.Id,
    ///     });
    /// 
    ///     // Create a secondary node
    ///     var secondary = new Linode.Instance("secondary", new()
    ///     {
    ///         Label = "node-secondary",
    ///         Type = "g6-nanode-1",
    ///         Region = "eu-central",
    ///     });
    /// 
    ///     // Share the IP with the secondary node
    ///     var share_primary = new Linode.InstanceSharedIps("share-primary", new()
    ///     {
    ///         LinodeId = secondary.Id,
    ///         Addresses = new[]
    ///         {
    ///             primary.Address,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// Share an IPv6 address among a primary node and its replicas:
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Linode = Pulumi.Linode;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     // Create a single primary node
    ///     var primary = new Linode.Instance("primary", new()
    ///     {
    ///         Label = "node-primary",
    ///         Type = "g6-nanode-1",
    ///         Region = "eu-central",
    ///     });
    /// 
    ///     // Allocate an IPv6 range pointing at the primary node
    ///     var rangeIpv6Range = new Linode.Ipv6Range("range", new()
    ///     {
    ///         PrefixLength = 64,
    ///         LinodeId = primary.Id,
    ///     });
    /// 
    ///     // Share with primary node
    ///     var share_primary = new Linode.InstanceSharedIps("share-primary", new()
    ///     {
    ///         LinodeId = primary.Id,
    ///         Addresses = new[]
    ///         {
    ///             rangeIpv6Range.Range,
    ///         },
    ///     });
    /// 
    ///     var config = new Config();
    ///     var numberReplicas = config.GetDouble("numberReplicas") ?? 2;
    ///     // Create two secondary nodes
    ///     var secondary = new List&lt;Linode.Instance&gt;();
    ///     for (var rangeIndex = 0; rangeIndex &lt; numberReplicas; rangeIndex++)
    ///     {
    ///         var range = new { Value = rangeIndex };
    ///         secondary.Add(new Linode.Instance($"secondary-{range.Value}", new()
    ///         {
    ///             Label = $"node-secondary-{range.Value}",
    ///             Type = "g6-nanode-1",
    ///             Region = "eu-central",
    ///         }));
    ///     }
    ///     // Share with secondary nodes
    ///     var share_secondary = new List&lt;Linode.InstanceSharedIps&gt;();
    ///     for (var rangeIndex = 0; rangeIndex &lt; numberReplicas; rangeIndex++)
    ///     {
    ///         var range = new { Value = rangeIndex };
    ///         share_secondary.Add(new Linode.InstanceSharedIps($"share-secondary-{range.Value}", new()
    ///         {
    ///             LinodeId = secondary[range.Value].Id,
    ///             Addresses = new[]
    ///             {
    ///                 rangeIpv6Range.Range,
    ///             },
    ///         }, new CustomResourceOptions
    ///         {
    ///             DependsOn =
    ///             {
    ///                 share_primary,
    ///             },
    ///         }));
    ///     }
    /// });
    /// ```
    /// </summary>
    [LinodeResourceType("linode:index/instanceSharedIps:InstanceSharedIps")]
    public partial class InstanceSharedIps : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The set of IPs to share with the Linode.
        /// </summary>
        [Output("addresses")]
        public Output<ImmutableArray<string>> Addresses { get; private set; } = null!;

        /// <summary>
        /// The ID of the Linode to share the IPs to.
        /// </summary>
        [Output("linodeId")]
        public Output<int> LinodeId { get; private set; } = null!;


        /// <summary>
        /// Create a InstanceSharedIps resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public InstanceSharedIps(string name, InstanceSharedIpsArgs args, CustomResourceOptions? options = null)
            : base("linode:index/instanceSharedIps:InstanceSharedIps", name, args ?? new InstanceSharedIpsArgs(), MakeResourceOptions(options, ""))
        {
        }

        private InstanceSharedIps(string name, Input<string> id, InstanceSharedIpsState? state = null, CustomResourceOptions? options = null)
            : base("linode:index/instanceSharedIps:InstanceSharedIps", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing InstanceSharedIps resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static InstanceSharedIps Get(string name, Input<string> id, InstanceSharedIpsState? state = null, CustomResourceOptions? options = null)
        {
            return new InstanceSharedIps(name, id, state, options);
        }
    }

    public sealed class InstanceSharedIpsArgs : global::Pulumi.ResourceArgs
    {
        [Input("addresses", required: true)]
        private InputList<string>? _addresses;

        /// <summary>
        /// The set of IPs to share with the Linode.
        /// </summary>
        public InputList<string> Addresses
        {
            get => _addresses ?? (_addresses = new InputList<string>());
            set => _addresses = value;
        }

        /// <summary>
        /// The ID of the Linode to share the IPs to.
        /// </summary>
        [Input("linodeId", required: true)]
        public Input<int> LinodeId { get; set; } = null!;

        public InstanceSharedIpsArgs()
        {
        }
        public static new InstanceSharedIpsArgs Empty => new InstanceSharedIpsArgs();
    }

    public sealed class InstanceSharedIpsState : global::Pulumi.ResourceArgs
    {
        [Input("addresses")]
        private InputList<string>? _addresses;

        /// <summary>
        /// The set of IPs to share with the Linode.
        /// </summary>
        public InputList<string> Addresses
        {
            get => _addresses ?? (_addresses = new InputList<string>());
            set => _addresses = value;
        }

        /// <summary>
        /// The ID of the Linode to share the IPs to.
        /// </summary>
        [Input("linodeId")]
        public Input<int>? LinodeId { get; set; }

        public InstanceSharedIpsState()
        {
        }
        public static new InstanceSharedIpsState Empty => new InstanceSharedIpsState();
    }
}
