// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode
{
    public static class GetNodebalancers
    {
        /// <summary>
        /// Provides information about Linode NodeBalancers that match a set of filters.
        /// For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-node-balancers).
        /// 
        /// ## Example Usage
        /// 
        /// The following example shows how one might use this data source to access information about a Linode NodeBalancer.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var specific_nodebalancers = Linode.GetNodebalancers.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Linode.Inputs.GetNodebalancersFilterInputArgs
        ///             {
        ///                 Name = "label",
        ///                 Values = new[]
        ///                 {
        ///                     "my-nodebalancer",
        ///                 },
        ///             },
        ///             new Linode.Inputs.GetNodebalancersFilterInputArgs
        ///             {
        ///                 Name = "region",
        ///                 Values = new[]
        ///                 {
        ///                     "us-iad",
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["nodebalancerId"] = specific_nodebalancers.Apply(specific_nodebalancers =&gt; specific_nodebalancers.Apply(getNodebalancersResult =&gt; getNodebalancersResult.Nodebalancers[0]?.Id)),
        ///     };
        /// });
        /// ```
        /// 
        /// ## Filterable Fields
        /// 
        /// * `label`
        /// 
        /// * `tags`
        /// 
        /// * `ipv4`
        /// 
        /// * `ipv6`
        /// 
        /// * `hostname`
        /// 
        /// * `region`
        /// 
        /// * `client_conn_throttle`
        /// </summary>
        public static Task<GetNodebalancersResult> InvokeAsync(GetNodebalancersArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetNodebalancersResult>("linode:index/getNodebalancers:getNodebalancers", args ?? new GetNodebalancersArgs(), options.WithDefaults());

        /// <summary>
        /// Provides information about Linode NodeBalancers that match a set of filters.
        /// For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-node-balancers).
        /// 
        /// ## Example Usage
        /// 
        /// The following example shows how one might use this data source to access information about a Linode NodeBalancer.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var specific_nodebalancers = Linode.GetNodebalancers.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Linode.Inputs.GetNodebalancersFilterInputArgs
        ///             {
        ///                 Name = "label",
        ///                 Values = new[]
        ///                 {
        ///                     "my-nodebalancer",
        ///                 },
        ///             },
        ///             new Linode.Inputs.GetNodebalancersFilterInputArgs
        ///             {
        ///                 Name = "region",
        ///                 Values = new[]
        ///                 {
        ///                     "us-iad",
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["nodebalancerId"] = specific_nodebalancers.Apply(specific_nodebalancers =&gt; specific_nodebalancers.Apply(getNodebalancersResult =&gt; getNodebalancersResult.Nodebalancers[0]?.Id)),
        ///     };
        /// });
        /// ```
        /// 
        /// ## Filterable Fields
        /// 
        /// * `label`
        /// 
        /// * `tags`
        /// 
        /// * `ipv4`
        /// 
        /// * `ipv6`
        /// 
        /// * `hostname`
        /// 
        /// * `region`
        /// 
        /// * `client_conn_throttle`
        /// </summary>
        public static Output<GetNodebalancersResult> Invoke(GetNodebalancersInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetNodebalancersResult>("linode:index/getNodebalancers:getNodebalancers", args ?? new GetNodebalancersInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Provides information about Linode NodeBalancers that match a set of filters.
        /// For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-node-balancers).
        /// 
        /// ## Example Usage
        /// 
        /// The following example shows how one might use this data source to access information about a Linode NodeBalancer.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var specific_nodebalancers = Linode.GetNodebalancers.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Linode.Inputs.GetNodebalancersFilterInputArgs
        ///             {
        ///                 Name = "label",
        ///                 Values = new[]
        ///                 {
        ///                     "my-nodebalancer",
        ///                 },
        ///             },
        ///             new Linode.Inputs.GetNodebalancersFilterInputArgs
        ///             {
        ///                 Name = "region",
        ///                 Values = new[]
        ///                 {
        ///                     "us-iad",
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["nodebalancerId"] = specific_nodebalancers.Apply(specific_nodebalancers =&gt; specific_nodebalancers.Apply(getNodebalancersResult =&gt; getNodebalancersResult.Nodebalancers[0]?.Id)),
        ///     };
        /// });
        /// ```
        /// 
        /// ## Filterable Fields
        /// 
        /// * `label`
        /// 
        /// * `tags`
        /// 
        /// * `ipv4`
        /// 
        /// * `ipv6`
        /// 
        /// * `hostname`
        /// 
        /// * `region`
        /// 
        /// * `client_conn_throttle`
        /// </summary>
        public static Output<GetNodebalancersResult> Invoke(GetNodebalancersInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetNodebalancersResult>("linode:index/getNodebalancers:getNodebalancers", args ?? new GetNodebalancersInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetNodebalancersArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private List<Inputs.GetNodebalancersFilterArgs>? _filters;
        public List<Inputs.GetNodebalancersFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetNodebalancersFilterArgs>());
            set => _filters = value;
        }

        [Input("nodebalancers")]
        private List<Inputs.GetNodebalancersNodebalancerArgs>? _nodebalancers;
        public List<Inputs.GetNodebalancersNodebalancerArgs> Nodebalancers
        {
            get => _nodebalancers ?? (_nodebalancers = new List<Inputs.GetNodebalancersNodebalancerArgs>());
            set => _nodebalancers = value;
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

        public GetNodebalancersArgs()
        {
        }
        public static new GetNodebalancersArgs Empty => new GetNodebalancersArgs();
    }

    public sealed class GetNodebalancersInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private InputList<Inputs.GetNodebalancersFilterInputArgs>? _filters;
        public InputList<Inputs.GetNodebalancersFilterInputArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetNodebalancersFilterInputArgs>());
            set => _filters = value;
        }

        [Input("nodebalancers")]
        private InputList<Inputs.GetNodebalancersNodebalancerInputArgs>? _nodebalancers;
        public InputList<Inputs.GetNodebalancersNodebalancerInputArgs> Nodebalancers
        {
            get => _nodebalancers ?? (_nodebalancers = new InputList<Inputs.GetNodebalancersNodebalancerInputArgs>());
            set => _nodebalancers = value;
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

        public GetNodebalancersInvokeArgs()
        {
        }
        public static new GetNodebalancersInvokeArgs Empty => new GetNodebalancersInvokeArgs();
    }


    [OutputType]
    public sealed class GetNodebalancersResult
    {
        public readonly ImmutableArray<Outputs.GetNodebalancersFilterResult> Filters;
        /// <summary>
        /// The Linode NodeBalancer's unique ID
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<Outputs.GetNodebalancersNodebalancerResult> Nodebalancers;
        public readonly string? Order;
        public readonly string? OrderBy;

        [OutputConstructor]
        private GetNodebalancersResult(
            ImmutableArray<Outputs.GetNodebalancersFilterResult> filters,

            string id,

            ImmutableArray<Outputs.GetNodebalancersNodebalancerResult> nodebalancers,

            string? order,

            string? orderBy)
        {
            Filters = filters;
            Id = id;
            Nodebalancers = nodebalancers;
            Order = order;
            OrderBy = orderBy;
        }
    }
}
