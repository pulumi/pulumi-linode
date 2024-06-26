// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode
{
    public static class GetPlacementGroup
    {
        /// <summary>
        /// **NOTE: Placement Groups may not currently be available to all users.**
        /// 
        /// `linode.PlacementGroup` provides details about a Linode placement group.
        /// 
        /// ## Example Usage
        /// 
        /// The following example shows how the resource might be used to obtain additional information about a Linode placement group.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var pg = Linode.GetPlacementGroup.Invoke(new()
        ///     {
        ///         Id = 12345,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetPlacementGroupResult> InvokeAsync(GetPlacementGroupArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetPlacementGroupResult>("linode:index/getPlacementGroup:getPlacementGroup", args ?? new GetPlacementGroupArgs(), options.WithDefaults());

        /// <summary>
        /// **NOTE: Placement Groups may not currently be available to all users.**
        /// 
        /// `linode.PlacementGroup` provides details about a Linode placement group.
        /// 
        /// ## Example Usage
        /// 
        /// The following example shows how the resource might be used to obtain additional information about a Linode placement group.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var pg = Linode.GetPlacementGroup.Invoke(new()
        ///     {
        ///         Id = 12345,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetPlacementGroupResult> Invoke(GetPlacementGroupInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetPlacementGroupResult>("linode:index/getPlacementGroup:getPlacementGroup", args ?? new GetPlacementGroupInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetPlacementGroupArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the Placement Group.
        /// </summary>
        [Input("id", required: true)]
        public int Id { get; set; }

        [Input("members")]
        private List<Inputs.GetPlacementGroupMemberArgs>? _members;

        /// <summary>
        /// A set of Linodes currently assigned to this Placement Group.
        /// </summary>
        public List<Inputs.GetPlacementGroupMemberArgs> Members
        {
            get => _members ?? (_members = new List<Inputs.GetPlacementGroupMemberArgs>());
            set => _members = value;
        }

        public GetPlacementGroupArgs()
        {
        }
        public static new GetPlacementGroupArgs Empty => new GetPlacementGroupArgs();
    }

    public sealed class GetPlacementGroupInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the Placement Group.
        /// </summary>
        [Input("id", required: true)]
        public Input<int> Id { get; set; } = null!;

        [Input("members")]
        private InputList<Inputs.GetPlacementGroupMemberInputArgs>? _members;

        /// <summary>
        /// A set of Linodes currently assigned to this Placement Group.
        /// </summary>
        public InputList<Inputs.GetPlacementGroupMemberInputArgs> Members
        {
            get => _members ?? (_members = new InputList<Inputs.GetPlacementGroupMemberInputArgs>());
            set => _members = value;
        }

        public GetPlacementGroupInvokeArgs()
        {
        }
        public static new GetPlacementGroupInvokeArgs Empty => new GetPlacementGroupInvokeArgs();
    }


    [OutputType]
    public sealed class GetPlacementGroupResult
    {
        /// <summary>
        /// The affinity policy to use when placing Linodes in this group.
        /// </summary>
        public readonly string AffinityType;
        public readonly int Id;
        /// <summary>
        /// Whether this Linode is currently compliant with the group's affinity policy.
        /// </summary>
        public readonly bool IsCompliant;
        /// <summary>
        /// Whether Linodes must be able to become compliant during assignment. (Default `true`)
        /// </summary>
        public readonly bool IsStrict;
        /// <summary>
        /// The label of the Placement Group. This field can only contain ASCII letters, digits and dashes.
        /// </summary>
        public readonly string Label;
        /// <summary>
        /// A set of Linodes currently assigned to this Placement Group.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetPlacementGroupMemberResult> Members;
        /// <summary>
        /// The region of the Placement Group.
        /// </summary>
        public readonly string Region;

        [OutputConstructor]
        private GetPlacementGroupResult(
            string affinityType,

            int id,

            bool isCompliant,

            bool isStrict,

            string label,

            ImmutableArray<Outputs.GetPlacementGroupMemberResult> members,

            string region)
        {
            AffinityType = affinityType;
            Id = id;
            IsCompliant = isCompliant;
            IsStrict = isStrict;
            Label = label;
            Members = members;
            Region = region;
        }
    }
}
