// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode
{
    [LinodeResourceType("linode:index/instanceSharedIps:InstanceSharedIps")]
    public partial class InstanceSharedIps : Pulumi.CustomResource
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

    public sealed class InstanceSharedIpsArgs : Pulumi.ResourceArgs
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
    }

    public sealed class InstanceSharedIpsState : Pulumi.ResourceArgs
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
    }
}
