// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode
{
    public static class GetIpv6Range
    {
        /// <summary>
        /// Provides information about a Linode IPv6 Range.
        /// For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-ipv6-range).
        /// 
        /// ## Example Usage
        /// 
        /// Get information about an IPv6 range assigned to a Linode:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var range_info = Linode.GetIpv6Range.Invoke(new()
        ///     {
        ///         Range = "2001:0db8::",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetIpv6RangeResult> InvokeAsync(GetIpv6RangeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetIpv6RangeResult>("linode:index/getIpv6Range:getIpv6Range", args ?? new GetIpv6RangeArgs(), options.WithDefaults());

        /// <summary>
        /// Provides information about a Linode IPv6 Range.
        /// For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-ipv6-range).
        /// 
        /// ## Example Usage
        /// 
        /// Get information about an IPv6 range assigned to a Linode:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var range_info = Linode.GetIpv6Range.Invoke(new()
        ///     {
        ///         Range = "2001:0db8::",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetIpv6RangeResult> Invoke(GetIpv6RangeInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetIpv6RangeResult>("linode:index/getIpv6Range:getIpv6Range", args ?? new GetIpv6RangeInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Provides information about a Linode IPv6 Range.
        /// For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-ipv6-range).
        /// 
        /// ## Example Usage
        /// 
        /// Get information about an IPv6 range assigned to a Linode:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var range_info = Linode.GetIpv6Range.Invoke(new()
        ///     {
        ///         Range = "2001:0db8::",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetIpv6RangeResult> Invoke(GetIpv6RangeInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetIpv6RangeResult>("linode:index/getIpv6Range:getIpv6Range", args ?? new GetIpv6RangeInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetIpv6RangeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The IPv6 range to retrieve information about.
        /// </summary>
        [Input("range", required: true)]
        public string Range { get; set; } = null!;

        public GetIpv6RangeArgs()
        {
        }
        public static new GetIpv6RangeArgs Empty => new GetIpv6RangeArgs();
    }

    public sealed class GetIpv6RangeInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The IPv6 range to retrieve information about.
        /// </summary>
        [Input("range", required: true)]
        public Input<string> Range { get; set; } = null!;

        public GetIpv6RangeInvokeArgs()
        {
        }
        public static new GetIpv6RangeInvokeArgs Empty => new GetIpv6RangeInvokeArgs();
    }


    [OutputType]
    public sealed class GetIpv6RangeResult
    {
        public readonly string Id;
        public readonly bool IsBgp;
        /// <summary>
        /// A set of Linodes targeted by this IPv6 range. Includes Linodes with IP sharing.
        /// </summary>
        public readonly ImmutableArray<int> Linodes;
        /// <summary>
        /// The prefix length of the address, denoting how many addresses can be assigned from this range.
        /// </summary>
        public readonly int Prefix;
        public readonly string Range;
        /// <summary>
        /// The region for this range of IPv6 addresses.
        /// </summary>
        public readonly string Region;

        [OutputConstructor]
        private GetIpv6RangeResult(
            string id,

            bool isBgp,

            ImmutableArray<int> linodes,

            int prefix,

            string range,

            string region)
        {
            Id = id;
            IsBgp = isBgp;
            Linodes = linodes;
            Prefix = prefix;
            Range = range;
            Region = region;
        }
    }
}
