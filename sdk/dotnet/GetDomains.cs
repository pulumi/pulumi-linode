// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode
{
    public static class GetDomains
    {
        /// <summary>
        /// Provides information about Linode Domains that match a set of filters.
        /// For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-domains).
        /// 
        /// ## Example Usage
        /// 
        /// Get information about all Linode Cloud Domains with a specific tag:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var specific = Linode.GetDomains.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Linode.Inputs.GetDomainsFilterInputArgs
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
        ///         ["domain"] = specific.Apply(getDomainsResult =&gt; getDomainsResult.Domains[0]?.Domain),
        ///     };
        /// });
        /// ```
        /// 
        /// ## Filterable Fields
        /// 
        /// * `group`
        /// 
        /// * `tags`
        /// 
        /// * `domain`
        /// 
        /// * `type`
        /// 
        /// * `status`
        /// 
        /// * `description`
        /// 
        /// * `master_ips`
        /// 
        /// * `axfr_ips`
        /// 
        /// * `ttl_sec`
        /// 
        /// * `retry_sec`
        /// 
        /// * `expire_sec`
        /// 
        /// * `refresh_sec`
        /// 
        /// * `soa_email`
        /// </summary>
        public static Task<GetDomainsResult> InvokeAsync(GetDomainsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDomainsResult>("linode:index/getDomains:getDomains", args ?? new GetDomainsArgs(), options.WithDefaults());

        /// <summary>
        /// Provides information about Linode Domains that match a set of filters.
        /// For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-domains).
        /// 
        /// ## Example Usage
        /// 
        /// Get information about all Linode Cloud Domains with a specific tag:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var specific = Linode.GetDomains.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Linode.Inputs.GetDomainsFilterInputArgs
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
        ///         ["domain"] = specific.Apply(getDomainsResult =&gt; getDomainsResult.Domains[0]?.Domain),
        ///     };
        /// });
        /// ```
        /// 
        /// ## Filterable Fields
        /// 
        /// * `group`
        /// 
        /// * `tags`
        /// 
        /// * `domain`
        /// 
        /// * `type`
        /// 
        /// * `status`
        /// 
        /// * `description`
        /// 
        /// * `master_ips`
        /// 
        /// * `axfr_ips`
        /// 
        /// * `ttl_sec`
        /// 
        /// * `retry_sec`
        /// 
        /// * `expire_sec`
        /// 
        /// * `refresh_sec`
        /// 
        /// * `soa_email`
        /// </summary>
        public static Output<GetDomainsResult> Invoke(GetDomainsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetDomainsResult>("linode:index/getDomains:getDomains", args ?? new GetDomainsInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Provides information about Linode Domains that match a set of filters.
        /// For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-domains).
        /// 
        /// ## Example Usage
        /// 
        /// Get information about all Linode Cloud Domains with a specific tag:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var specific = Linode.GetDomains.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Linode.Inputs.GetDomainsFilterInputArgs
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
        ///         ["domain"] = specific.Apply(getDomainsResult =&gt; getDomainsResult.Domains[0]?.Domain),
        ///     };
        /// });
        /// ```
        /// 
        /// ## Filterable Fields
        /// 
        /// * `group`
        /// 
        /// * `tags`
        /// 
        /// * `domain`
        /// 
        /// * `type`
        /// 
        /// * `status`
        /// 
        /// * `description`
        /// 
        /// * `master_ips`
        /// 
        /// * `axfr_ips`
        /// 
        /// * `ttl_sec`
        /// 
        /// * `retry_sec`
        /// 
        /// * `expire_sec`
        /// 
        /// * `refresh_sec`
        /// 
        /// * `soa_email`
        /// </summary>
        public static Output<GetDomainsResult> Invoke(GetDomainsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetDomainsResult>("linode:index/getDomains:getDomains", args ?? new GetDomainsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDomainsArgs : global::Pulumi.InvokeArgs
    {
        [Input("domains")]
        private List<Inputs.GetDomainsDomainArgs>? _domains;
        public List<Inputs.GetDomainsDomainArgs> Domains
        {
            get => _domains ?? (_domains = new List<Inputs.GetDomainsDomainArgs>());
            set => _domains = value;
        }

        [Input("filters")]
        private List<Inputs.GetDomainsFilterArgs>? _filters;
        public List<Inputs.GetDomainsFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetDomainsFilterArgs>());
            set => _filters = value;
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

        public GetDomainsArgs()
        {
        }
        public static new GetDomainsArgs Empty => new GetDomainsArgs();
    }

    public sealed class GetDomainsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("domains")]
        private InputList<Inputs.GetDomainsDomainInputArgs>? _domains;
        public InputList<Inputs.GetDomainsDomainInputArgs> Domains
        {
            get => _domains ?? (_domains = new InputList<Inputs.GetDomainsDomainInputArgs>());
            set => _domains = value;
        }

        [Input("filters")]
        private InputList<Inputs.GetDomainsFilterInputArgs>? _filters;
        public InputList<Inputs.GetDomainsFilterInputArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetDomainsFilterInputArgs>());
            set => _filters = value;
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

        public GetDomainsInvokeArgs()
        {
        }
        public static new GetDomainsInvokeArgs Empty => new GetDomainsInvokeArgs();
    }


    [OutputType]
    public sealed class GetDomainsResult
    {
        public readonly ImmutableArray<Outputs.GetDomainsDomainResult> Domains;
        public readonly ImmutableArray<Outputs.GetDomainsFilterResult> Filters;
        /// <summary>
        /// The unique ID of this Domain.
        /// </summary>
        public readonly string Id;
        public readonly string? Order;
        public readonly string? OrderBy;

        [OutputConstructor]
        private GetDomainsResult(
            ImmutableArray<Outputs.GetDomainsDomainResult> domains,

            ImmutableArray<Outputs.GetDomainsFilterResult> filters,

            string id,

            string? order,

            string? orderBy)
        {
            Domains = domains;
            Filters = filters;
            Id = id;
            Order = order;
            OrderBy = orderBy;
        }
    }
}
