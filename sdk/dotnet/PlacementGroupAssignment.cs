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
    /// Manages a single assignment between a Linode and a Placement Group.
    /// For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/post-group-add-linode).
    /// 
    /// **NOTE: Placement Groups may not currently be available to all users.**
    /// 
    /// To prevent update conflicts, Linodes managed through the `linode.Instance` resource should specify `placement_group_externally_managed`:
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Linode = Pulumi.Linode;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var my_instance = new Linode.Instance("my-instance", new()
    ///     {
    ///         PlacementGroupExternallyManaged = true,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Linode = Pulumi.Linode;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var my_pg = new Linode.PlacementGroup("my-pg", new()
    ///     {
    ///         Label = "my-pg",
    ///         Region = "us-east",
    ///         PlacementGroupType = "anti_affinity:local",
    ///     });
    /// 
    ///     var my_inst = new Linode.Instance("my-inst", new()
    ///     {
    ///         Label = "my-inst",
    ///         Region = "us-east",
    ///         Type = "g6-nanode-1",
    ///         PlacementGroupExternallyManaged = true,
    ///     });
    /// 
    ///     var my_assignment = new Linode.PlacementGroupAssignment("my-assignment", new()
    ///     {
    ///         PlacementGroupId = my_pg.Id,
    ///         LinodeId = my_inst.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Placement Group assignments can be imported using the Placement Group's ID followed by the Linode's ID separated by a comma, e.g.
    /// 
    /// ```sh
    /// $ pulumi import linode:index/placementGroupAssignment:PlacementGroupAssignment my-assignment 1234567,7654321
    /// ```
    /// </summary>
    [LinodeResourceType("linode:index/placementGroupAssignment:PlacementGroupAssignment")]
    public partial class PlacementGroupAssignment : global::Pulumi.CustomResource
    {
        [Output("compliantOnly")]
        public Output<bool?> CompliantOnly { get; private set; } = null!;

        /// <summary>
        /// The unique ID of the Linode to assign.
        /// </summary>
        [Output("linodeId")]
        public Output<int> LinodeId { get; private set; } = null!;

        /// <summary>
        /// The unique ID of the target Placement Group.
        /// </summary>
        [Output("placementGroupId")]
        public Output<int> PlacementGroupId { get; private set; } = null!;


        /// <summary>
        /// Create a PlacementGroupAssignment resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public PlacementGroupAssignment(string name, PlacementGroupAssignmentArgs args, CustomResourceOptions? options = null)
            : base("linode:index/placementGroupAssignment:PlacementGroupAssignment", name, args ?? new PlacementGroupAssignmentArgs(), MakeResourceOptions(options, ""))
        {
        }

        private PlacementGroupAssignment(string name, Input<string> id, PlacementGroupAssignmentState? state = null, CustomResourceOptions? options = null)
            : base("linode:index/placementGroupAssignment:PlacementGroupAssignment", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing PlacementGroupAssignment resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static PlacementGroupAssignment Get(string name, Input<string> id, PlacementGroupAssignmentState? state = null, CustomResourceOptions? options = null)
        {
            return new PlacementGroupAssignment(name, id, state, options);
        }
    }

    public sealed class PlacementGroupAssignmentArgs : global::Pulumi.ResourceArgs
    {
        [Input("compliantOnly")]
        public Input<bool>? CompliantOnly { get; set; }

        /// <summary>
        /// The unique ID of the Linode to assign.
        /// </summary>
        [Input("linodeId", required: true)]
        public Input<int> LinodeId { get; set; } = null!;

        /// <summary>
        /// The unique ID of the target Placement Group.
        /// </summary>
        [Input("placementGroupId", required: true)]
        public Input<int> PlacementGroupId { get; set; } = null!;

        public PlacementGroupAssignmentArgs()
        {
        }
        public static new PlacementGroupAssignmentArgs Empty => new PlacementGroupAssignmentArgs();
    }

    public sealed class PlacementGroupAssignmentState : global::Pulumi.ResourceArgs
    {
        [Input("compliantOnly")]
        public Input<bool>? CompliantOnly { get; set; }

        /// <summary>
        /// The unique ID of the Linode to assign.
        /// </summary>
        [Input("linodeId")]
        public Input<int>? LinodeId { get; set; }

        /// <summary>
        /// The unique ID of the target Placement Group.
        /// </summary>
        [Input("placementGroupId")]
        public Input<int>? PlacementGroupId { get; set; }

        public PlacementGroupAssignmentState()
        {
        }
        public static new PlacementGroupAssignmentState Empty => new PlacementGroupAssignmentState();
    }
}
