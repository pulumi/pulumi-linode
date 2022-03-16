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
    /// Manages a Linode IPv6 range.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Linode = Pulumi.Linode;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var foobarInstance = new Linode.Instance("foobarInstance", new Linode.InstanceArgs
    ///         {
    ///             Label = "my-linode",
    ///             Image = "linode/alpine3.14",
    ///             Type = "g6-nanode-1",
    ///             Region = "us-southeast",
    ///         });
    ///         var foobarIpv6Range = new Linode.Ipv6Range("foobarIpv6Range", new Linode.Ipv6RangeArgs
    ///         {
    ///             LinodeId = foobarInstance.Id,
    ///             PrefixLength = 64,
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// </summary>
    [LinodeResourceType("linode:index/ipv6Range:Ipv6Range")]
    public partial class Ipv6Range : Pulumi.CustomResource
    {
        /// <summary>
        /// Whether this IPv6 range is shared.
        /// </summary>
        [Output("isBgp")]
        public Output<bool> IsBgp { get; private set; } = null!;

        /// <summary>
        /// The ID of the Linode to assign this range to.
        /// </summary>
        [Output("linodeId")]
        public Output<int?> LinodeId { get; private set; } = null!;

        /// <summary>
        /// A list of Linodes targeted by this IPv6 range. Includes Linodes with IP sharing.
        /// </summary>
        [Output("linodes")]
        public Output<ImmutableArray<int>> Linodes { get; private set; } = null!;

        /// <summary>
        /// The prefix length of the IPv6 range.
        /// </summary>
        [Output("prefixLength")]
        public Output<int> PrefixLength { get; private set; } = null!;

        /// <summary>
        /// The IPv6 range of addresses in this pool.
        /// </summary>
        [Output("range")]
        public Output<string> Range { get; private set; } = null!;

        /// <summary>
        /// The region for this range of IPv6 addresses.
        /// </summary>
        [Output("region")]
        public Output<string> Region { get; private set; } = null!;

        /// <summary>
        /// The IPv6 SLAAC address to assign this range to.
        /// </summary>
        [Output("routeTarget")]
        public Output<string?> RouteTarget { get; private set; } = null!;


        /// <summary>
        /// Create a Ipv6Range resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Ipv6Range(string name, Ipv6RangeArgs args, CustomResourceOptions? options = null)
            : base("linode:index/ipv6Range:Ipv6Range", name, args ?? new Ipv6RangeArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Ipv6Range(string name, Input<string> id, Ipv6RangeState? state = null, CustomResourceOptions? options = null)
            : base("linode:index/ipv6Range:Ipv6Range", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Ipv6Range resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Ipv6Range Get(string name, Input<string> id, Ipv6RangeState? state = null, CustomResourceOptions? options = null)
        {
            return new Ipv6Range(name, id, state, options);
        }
    }

    public sealed class Ipv6RangeArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Linode to assign this range to.
        /// </summary>
        [Input("linodeId")]
        public Input<int>? LinodeId { get; set; }

        /// <summary>
        /// The prefix length of the IPv6 range.
        /// </summary>
        [Input("prefixLength", required: true)]
        public Input<int> PrefixLength { get; set; } = null!;

        /// <summary>
        /// The IPv6 SLAAC address to assign this range to.
        /// </summary>
        [Input("routeTarget")]
        public Input<string>? RouteTarget { get; set; }

        public Ipv6RangeArgs()
        {
        }
    }

    public sealed class Ipv6RangeState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether this IPv6 range is shared.
        /// </summary>
        [Input("isBgp")]
        public Input<bool>? IsBgp { get; set; }

        /// <summary>
        /// The ID of the Linode to assign this range to.
        /// </summary>
        [Input("linodeId")]
        public Input<int>? LinodeId { get; set; }

        [Input("linodes")]
        private InputList<int>? _linodes;

        /// <summary>
        /// A list of Linodes targeted by this IPv6 range. Includes Linodes with IP sharing.
        /// </summary>
        public InputList<int> Linodes
        {
            get => _linodes ?? (_linodes = new InputList<int>());
            set => _linodes = value;
        }

        /// <summary>
        /// The prefix length of the IPv6 range.
        /// </summary>
        [Input("prefixLength")]
        public Input<int>? PrefixLength { get; set; }

        /// <summary>
        /// The IPv6 range of addresses in this pool.
        /// </summary>
        [Input("range")]
        public Input<string>? Range { get; set; }

        /// <summary>
        /// The region for this range of IPv6 addresses.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// The IPv6 SLAAC address to assign this range to.
        /// </summary>
        [Input("routeTarget")]
        public Input<string>? RouteTarget { get; set; }

        public Ipv6RangeState()
        {
        }
    }
}
