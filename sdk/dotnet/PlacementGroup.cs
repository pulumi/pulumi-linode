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
    /// Manages a Linode Placement Group.
    /// For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/post-placement-group).
    /// 
    /// ## Example Usage
    /// 
    /// Create a Placement Group with the local anti-affinity policy:
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Linode = Pulumi.Linode;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var test = new Linode.PlacementGroup("test", new()
    ///     {
    ///         Label = "my-placement-group",
    ///         Region = "us-mia",
    ///         PlacementGroupType = "anti_affinity:local",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Placement Groups be imported using their unique `id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import linode:index/placementGroup:PlacementGroup mygroup 1234567
    /// ```
    /// </summary>
    [LinodeResourceType("linode:index/placementGroup:PlacementGroup")]
    public partial class PlacementGroup : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Whether this Linode is currently compliant with the group's placement group type.
        /// </summary>
        [Output("isCompliant")]
        public Output<bool> IsCompliant { get; private set; } = null!;

        /// <summary>
        /// The label of the Placement Group. This field can only contain ASCII letters, digits and dashes.
        /// </summary>
        [Output("label")]
        public Output<string> Label { get; private set; } = null!;

        /// <summary>
        /// A set of Linodes currently assigned to this Placement Group.
        /// </summary>
        [Output("members")]
        public Output<ImmutableArray<Outputs.PlacementGroupMember>> Members { get; private set; } = null!;

        /// <summary>
        /// Whether Linodes must be able to become compliant during assignment. (Default `strict`)
        /// </summary>
        [Output("placementGroupPolicy")]
        public Output<string> PlacementGroupPolicy { get; private set; } = null!;

        /// <summary>
        /// The placement group type to use when placing Linodes in this group.
        /// </summary>
        [Output("placementGroupType")]
        public Output<string> PlacementGroupType { get; private set; } = null!;

        /// <summary>
        /// The region of the Placement Group.
        /// </summary>
        [Output("region")]
        public Output<string> Region { get; private set; } = null!;


        /// <summary>
        /// Create a PlacementGroup resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public PlacementGroup(string name, PlacementGroupArgs args, CustomResourceOptions? options = null)
            : base("linode:index/placementGroup:PlacementGroup", name, args ?? new PlacementGroupArgs(), MakeResourceOptions(options, ""))
        {
        }

        private PlacementGroup(string name, Input<string> id, PlacementGroupState? state = null, CustomResourceOptions? options = null)
            : base("linode:index/placementGroup:PlacementGroup", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing PlacementGroup resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static PlacementGroup Get(string name, Input<string> id, PlacementGroupState? state = null, CustomResourceOptions? options = null)
        {
            return new PlacementGroup(name, id, state, options);
        }
    }

    public sealed class PlacementGroupArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The label of the Placement Group. This field can only contain ASCII letters, digits and dashes.
        /// </summary>
        [Input("label", required: true)]
        public Input<string> Label { get; set; } = null!;

        /// <summary>
        /// Whether Linodes must be able to become compliant during assignment. (Default `strict`)
        /// </summary>
        [Input("placementGroupPolicy")]
        public Input<string>? PlacementGroupPolicy { get; set; }

        /// <summary>
        /// The placement group type to use when placing Linodes in this group.
        /// </summary>
        [Input("placementGroupType", required: true)]
        public Input<string> PlacementGroupType { get; set; } = null!;

        /// <summary>
        /// The region of the Placement Group.
        /// </summary>
        [Input("region", required: true)]
        public Input<string> Region { get; set; } = null!;

        public PlacementGroupArgs()
        {
        }
        public static new PlacementGroupArgs Empty => new PlacementGroupArgs();
    }

    public sealed class PlacementGroupState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether this Linode is currently compliant with the group's placement group type.
        /// </summary>
        [Input("isCompliant")]
        public Input<bool>? IsCompliant { get; set; }

        /// <summary>
        /// The label of the Placement Group. This field can only contain ASCII letters, digits and dashes.
        /// </summary>
        [Input("label")]
        public Input<string>? Label { get; set; }

        [Input("members")]
        private InputList<Inputs.PlacementGroupMemberGetArgs>? _members;

        /// <summary>
        /// A set of Linodes currently assigned to this Placement Group.
        /// </summary>
        public InputList<Inputs.PlacementGroupMemberGetArgs> Members
        {
            get => _members ?? (_members = new InputList<Inputs.PlacementGroupMemberGetArgs>());
            set => _members = value;
        }

        /// <summary>
        /// Whether Linodes must be able to become compliant during assignment. (Default `strict`)
        /// </summary>
        [Input("placementGroupPolicy")]
        public Input<string>? PlacementGroupPolicy { get; set; }

        /// <summary>
        /// The placement group type to use when placing Linodes in this group.
        /// </summary>
        [Input("placementGroupType")]
        public Input<string>? PlacementGroupType { get; set; }

        /// <summary>
        /// The region of the Placement Group.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        public PlacementGroupState()
        {
        }
        public static new PlacementGroupState Empty => new PlacementGroupState();
    }
}
