// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode
{
    public static class GetVpcSubnets
    {
        /// <summary>
        /// Provides information about a list of Linode VPC subnets that match a set of filters.
        /// For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-vpc-subnets).
        /// 
        /// ## Example Usage
        /// 
        /// The following example shows how one might use this data source to list VPC subnets.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var filtered_subnets = Linode.GetVpcSubnets.Invoke(new()
        ///     {
        ///         VpcId = 123,
        ///         Filters = new[]
        ///         {
        ///             new Linode.Inputs.GetVpcSubnetsFilterInputArgs
        ///             {
        ///                 Name = "label",
        ///                 Values = new[]
        ///                 {
        ///                     "test",
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["vpcSubnets"] = filtered_subnets.Apply(filtered_subnets =&gt; filtered_subnets.Apply(getVpcSubnetsResult =&gt; getVpcSubnetsResult.VpcSubnets)),
        ///     };
        /// });
        /// ```
        /// 
        /// ## Filterable Fields
        /// 
        /// * `id`
        /// 
        /// * `label`
        /// 
        /// * `ipv4`
        /// </summary>
        public static Task<GetVpcSubnetsResult> InvokeAsync(GetVpcSubnetsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetVpcSubnetsResult>("linode:index/getVpcSubnets:getVpcSubnets", args ?? new GetVpcSubnetsArgs(), options.WithDefaults());

        /// <summary>
        /// Provides information about a list of Linode VPC subnets that match a set of filters.
        /// For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-vpc-subnets).
        /// 
        /// ## Example Usage
        /// 
        /// The following example shows how one might use this data source to list VPC subnets.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var filtered_subnets = Linode.GetVpcSubnets.Invoke(new()
        ///     {
        ///         VpcId = 123,
        ///         Filters = new[]
        ///         {
        ///             new Linode.Inputs.GetVpcSubnetsFilterInputArgs
        ///             {
        ///                 Name = "label",
        ///                 Values = new[]
        ///                 {
        ///                     "test",
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["vpcSubnets"] = filtered_subnets.Apply(filtered_subnets =&gt; filtered_subnets.Apply(getVpcSubnetsResult =&gt; getVpcSubnetsResult.VpcSubnets)),
        ///     };
        /// });
        /// ```
        /// 
        /// ## Filterable Fields
        /// 
        /// * `id`
        /// 
        /// * `label`
        /// 
        /// * `ipv4`
        /// </summary>
        public static Output<GetVpcSubnetsResult> Invoke(GetVpcSubnetsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetVpcSubnetsResult>("linode:index/getVpcSubnets:getVpcSubnets", args ?? new GetVpcSubnetsInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Provides information about a list of Linode VPC subnets that match a set of filters.
        /// For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-vpc-subnets).
        /// 
        /// ## Example Usage
        /// 
        /// The following example shows how one might use this data source to list VPC subnets.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var filtered_subnets = Linode.GetVpcSubnets.Invoke(new()
        ///     {
        ///         VpcId = 123,
        ///         Filters = new[]
        ///         {
        ///             new Linode.Inputs.GetVpcSubnetsFilterInputArgs
        ///             {
        ///                 Name = "label",
        ///                 Values = new[]
        ///                 {
        ///                     "test",
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["vpcSubnets"] = filtered_subnets.Apply(filtered_subnets =&gt; filtered_subnets.Apply(getVpcSubnetsResult =&gt; getVpcSubnetsResult.VpcSubnets)),
        ///     };
        /// });
        /// ```
        /// 
        /// ## Filterable Fields
        /// 
        /// * `id`
        /// 
        /// * `label`
        /// 
        /// * `ipv4`
        /// </summary>
        public static Output<GetVpcSubnetsResult> Invoke(GetVpcSubnetsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetVpcSubnetsResult>("linode:index/getVpcSubnets:getVpcSubnets", args ?? new GetVpcSubnetsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetVpcSubnetsArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private List<Inputs.GetVpcSubnetsFilterArgs>? _filters;
        public List<Inputs.GetVpcSubnetsFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetVpcSubnetsFilterArgs>());
            set => _filters = value;
        }

        /// <summary>
        /// The id of the parent VPC for the list of VPCs.
        /// 
        /// * `filter` - (Optional) A set of filters used to select Linode VPC subnets that meet certain requirements.
        /// </summary>
        [Input("vpcId", required: true)]
        public int VpcId { get; set; }

        [Input("vpcSubnets")]
        private List<Inputs.GetVpcSubnetsVpcSubnetArgs>? _vpcSubnets;
        public List<Inputs.GetVpcSubnetsVpcSubnetArgs> VpcSubnets
        {
            get => _vpcSubnets ?? (_vpcSubnets = new List<Inputs.GetVpcSubnetsVpcSubnetArgs>());
            set => _vpcSubnets = value;
        }

        public GetVpcSubnetsArgs()
        {
        }
        public static new GetVpcSubnetsArgs Empty => new GetVpcSubnetsArgs();
    }

    public sealed class GetVpcSubnetsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private InputList<Inputs.GetVpcSubnetsFilterInputArgs>? _filters;
        public InputList<Inputs.GetVpcSubnetsFilterInputArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetVpcSubnetsFilterInputArgs>());
            set => _filters = value;
        }

        /// <summary>
        /// The id of the parent VPC for the list of VPCs.
        /// 
        /// * `filter` - (Optional) A set of filters used to select Linode VPC subnets that meet certain requirements.
        /// </summary>
        [Input("vpcId", required: true)]
        public Input<int> VpcId { get; set; } = null!;

        [Input("vpcSubnets")]
        private InputList<Inputs.GetVpcSubnetsVpcSubnetInputArgs>? _vpcSubnets;
        public InputList<Inputs.GetVpcSubnetsVpcSubnetInputArgs> VpcSubnets
        {
            get => _vpcSubnets ?? (_vpcSubnets = new InputList<Inputs.GetVpcSubnetsVpcSubnetInputArgs>());
            set => _vpcSubnets = value;
        }

        public GetVpcSubnetsInvokeArgs()
        {
        }
        public static new GetVpcSubnetsInvokeArgs Empty => new GetVpcSubnetsInvokeArgs();
    }


    [OutputType]
    public sealed class GetVpcSubnetsResult
    {
        public readonly ImmutableArray<Outputs.GetVpcSubnetsFilterResult> Filters;
        /// <summary>
        /// The unique id of the VPC subnet.
        /// </summary>
        public readonly string Id;
        public readonly int VpcId;
        public readonly ImmutableArray<Outputs.GetVpcSubnetsVpcSubnetResult> VpcSubnets;

        [OutputConstructor]
        private GetVpcSubnetsResult(
            ImmutableArray<Outputs.GetVpcSubnetsFilterResult> filters,

            string id,

            int vpcId,

            ImmutableArray<Outputs.GetVpcSubnetsVpcSubnetResult> vpcSubnets)
        {
            Filters = filters;
            Id = id;
            VpcId = vpcId;
            VpcSubnets = vpcSubnets;
        }
    }
}
