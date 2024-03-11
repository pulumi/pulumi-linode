// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode
{
    public static class GetLkeClusters
    {
        /// <summary>
        /// Provides information about a list of current Linode Kubernetes (LKE) clusters on your account that match a set of filters.
        /// 
        /// ## Example Usage
        /// 
        /// Get information about all LKE clusters with a specific tag:
        /// 
        /// &lt;!--Start PulumiCodeChooser --&gt;
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var specific = Linode.GetLkeClusters.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Linode.Inputs.GetLkeClustersFilterInputArgs
        ///             {
        ///                 Name = "tags",
        ///                 Values = new[]
        ///                 {
        ///                     "test-tag",
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["lkeCluster"] = specific.Apply(getLkeClustersResult =&gt; getLkeClustersResult.LkeClusters[0]?.Id),
        ///     };
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// 
        /// ## Filterable Fields
        /// 
        /// * `k8s_version`
        /// 
        /// * `label`
        /// 
        /// * `region`
        /// 
        /// * `tags`
        /// 
        /// * `status`
        /// 
        /// * `created`
        /// 
        /// * `updated`
        /// </summary>
        public static Task<GetLkeClustersResult> InvokeAsync(GetLkeClustersArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetLkeClustersResult>("linode:index/getLkeClusters:getLkeClusters", args ?? new GetLkeClustersArgs(), options.WithDefaults());

        /// <summary>
        /// Provides information about a list of current Linode Kubernetes (LKE) clusters on your account that match a set of filters.
        /// 
        /// ## Example Usage
        /// 
        /// Get information about all LKE clusters with a specific tag:
        /// 
        /// &lt;!--Start PulumiCodeChooser --&gt;
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var specific = Linode.GetLkeClusters.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Linode.Inputs.GetLkeClustersFilterInputArgs
        ///             {
        ///                 Name = "tags",
        ///                 Values = new[]
        ///                 {
        ///                     "test-tag",
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["lkeCluster"] = specific.Apply(getLkeClustersResult =&gt; getLkeClustersResult.LkeClusters[0]?.Id),
        ///     };
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// 
        /// ## Filterable Fields
        /// 
        /// * `k8s_version`
        /// 
        /// * `label`
        /// 
        /// * `region`
        /// 
        /// * `tags`
        /// 
        /// * `status`
        /// 
        /// * `created`
        /// 
        /// * `updated`
        /// </summary>
        public static Output<GetLkeClustersResult> Invoke(GetLkeClustersInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetLkeClustersResult>("linode:index/getLkeClusters:getLkeClusters", args ?? new GetLkeClustersInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetLkeClustersArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private List<Inputs.GetLkeClustersFilterArgs>? _filters;
        public List<Inputs.GetLkeClustersFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetLkeClustersFilterArgs>());
            set => _filters = value;
        }

        [Input("lkeClusters")]
        private List<Inputs.GetLkeClustersLkeClusterArgs>? _lkeClusters;
        public List<Inputs.GetLkeClustersLkeClusterArgs> LkeClusters
        {
            get => _lkeClusters ?? (_lkeClusters = new List<Inputs.GetLkeClustersLkeClusterArgs>());
            set => _lkeClusters = value;
        }

        /// <summary>
        /// The order in which results should be returned. (`asc`, `desc`; default `asc`)
        /// </summary>
        [Input("order")]
        public string? Order { get; set; }

        /// <summary>
        /// The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
        /// </summary>
        [Input("orderBy")]
        public string? OrderBy { get; set; }

        public GetLkeClustersArgs()
        {
        }
        public static new GetLkeClustersArgs Empty => new GetLkeClustersArgs();
    }

    public sealed class GetLkeClustersInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private InputList<Inputs.GetLkeClustersFilterInputArgs>? _filters;
        public InputList<Inputs.GetLkeClustersFilterInputArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetLkeClustersFilterInputArgs>());
            set => _filters = value;
        }

        [Input("lkeClusters")]
        private InputList<Inputs.GetLkeClustersLkeClusterInputArgs>? _lkeClusters;
        public InputList<Inputs.GetLkeClustersLkeClusterInputArgs> LkeClusters
        {
            get => _lkeClusters ?? (_lkeClusters = new InputList<Inputs.GetLkeClustersLkeClusterInputArgs>());
            set => _lkeClusters = value;
        }

        /// <summary>
        /// The order in which results should be returned. (`asc`, `desc`; default `asc`)
        /// </summary>
        [Input("order")]
        public Input<string>? Order { get; set; }

        /// <summary>
        /// The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
        /// </summary>
        [Input("orderBy")]
        public Input<string>? OrderBy { get; set; }

        public GetLkeClustersInvokeArgs()
        {
        }
        public static new GetLkeClustersInvokeArgs Empty => new GetLkeClustersInvokeArgs();
    }


    [OutputType]
    public sealed class GetLkeClustersResult
    {
        public readonly ImmutableArray<Outputs.GetLkeClustersFilterResult> Filters;
        /// <summary>
        /// The LKE Cluster's ID.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<Outputs.GetLkeClustersLkeClusterResult> LkeClusters;
        public readonly string? Order;
        public readonly string? OrderBy;

        [OutputConstructor]
        private GetLkeClustersResult(
            ImmutableArray<Outputs.GetLkeClustersFilterResult> filters,

            string id,

            ImmutableArray<Outputs.GetLkeClustersLkeClusterResult> lkeClusters,

            string? order,

            string? orderBy)
        {
            Filters = filters;
            Id = id;
            LkeClusters = lkeClusters;
            Order = order;
            OrderBy = orderBy;
        }
    }
}
