// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode
{
    public static class GetIpv6Ranges
    {
        /// <summary>
        /// Provides information about Linode IPv6 ranges that match a set of filters.
        /// 
        /// &gt; Some fields may not be accessible directly the results of this data source.
        /// For additional information about a specific IPv6 range consider using the linode.Ipv6Range
        /// data source.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var filtered_ranges = Linode.GetIpv6Ranges.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Linode.Inputs.GetIpv6RangesFilterInputArgs
        ///             {
        ///                 Name = "region",
        ///                 Values = new[]
        ///                 {
        ///                     "us-mia",
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["ranges"] = data.Linode_ipv4_ranges.Filtered_ranges.Ranges,
        ///     };
        /// });
        /// ```
        /// 
        /// ## Filterable Fields
        /// 
        /// * `range`
        /// 
        /// * `route_target`
        /// 
        /// * `prefix`
        /// 
        /// * `region`
        /// </summary>
        public static Task<GetIpv6RangesResult> InvokeAsync(GetIpv6RangesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetIpv6RangesResult>("linode:index/getIpv6Ranges:getIpv6Ranges", args ?? new GetIpv6RangesArgs(), options.WithDefaults());

        /// <summary>
        /// Provides information about Linode IPv6 ranges that match a set of filters.
        /// 
        /// &gt; Some fields may not be accessible directly the results of this data source.
        /// For additional information about a specific IPv6 range consider using the linode.Ipv6Range
        /// data source.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var filtered_ranges = Linode.GetIpv6Ranges.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Linode.Inputs.GetIpv6RangesFilterInputArgs
        ///             {
        ///                 Name = "region",
        ///                 Values = new[]
        ///                 {
        ///                     "us-mia",
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["ranges"] = data.Linode_ipv4_ranges.Filtered_ranges.Ranges,
        ///     };
        /// });
        /// ```
        /// 
        /// ## Filterable Fields
        /// 
        /// * `range`
        /// 
        /// * `route_target`
        /// 
        /// * `prefix`
        /// 
        /// * `region`
        /// </summary>
        public static Output<GetIpv6RangesResult> Invoke(GetIpv6RangesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetIpv6RangesResult>("linode:index/getIpv6Ranges:getIpv6Ranges", args ?? new GetIpv6RangesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetIpv6RangesArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private List<Inputs.GetIpv6RangesFilterArgs>? _filters;
        public List<Inputs.GetIpv6RangesFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetIpv6RangesFilterArgs>());
            set => _filters = value;
        }

        [Input("ranges")]
        private List<Inputs.GetIpv6RangesRangeArgs>? _ranges;
        public List<Inputs.GetIpv6RangesRangeArgs> Ranges
        {
            get => _ranges ?? (_ranges = new List<Inputs.GetIpv6RangesRangeArgs>());
            set => _ranges = value;
        }

        public GetIpv6RangesArgs()
        {
        }
        public static new GetIpv6RangesArgs Empty => new GetIpv6RangesArgs();
    }

    public sealed class GetIpv6RangesInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private InputList<Inputs.GetIpv6RangesFilterInputArgs>? _filters;
        public InputList<Inputs.GetIpv6RangesFilterInputArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetIpv6RangesFilterInputArgs>());
            set => _filters = value;
        }

        [Input("ranges")]
        private InputList<Inputs.GetIpv6RangesRangeInputArgs>? _ranges;
        public InputList<Inputs.GetIpv6RangesRangeInputArgs> Ranges
        {
            get => _ranges ?? (_ranges = new InputList<Inputs.GetIpv6RangesRangeInputArgs>());
            set => _ranges = value;
        }

        public GetIpv6RangesInvokeArgs()
        {
        }
        public static new GetIpv6RangesInvokeArgs Empty => new GetIpv6RangesInvokeArgs();
    }


    [OutputType]
    public sealed class GetIpv6RangesResult
    {
        public readonly ImmutableArray<Outputs.GetIpv6RangesFilterResult> Filters;
        public readonly string Id;
        public readonly ImmutableArray<Outputs.GetIpv6RangesRangeResult> Ranges;

        [OutputConstructor]
        private GetIpv6RangesResult(
            ImmutableArray<Outputs.GetIpv6RangesFilterResult> filters,

            string id,

            ImmutableArray<Outputs.GetIpv6RangesRangeResult> ranges)
        {
            Filters = filters;
            Id = id;
            Ranges = ranges;
        }
    }
}
