// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Outputs
{

    [OutputType]
    public sealed class GetInstanceNetworkingIpv6GlobalResult
    {
        /// <summary>
        /// The network prefix.
        /// </summary>
        public readonly int Prefix;
        /// <summary>
        /// The IPv6 range of addresses in this pool.
        /// </summary>
        public readonly string Range;
        /// <summary>
        /// (Filterable) The Region this address resides in.
        /// </summary>
        public readonly string Region;
        /// <summary>
        /// (Nullable) The last address in this block of IPv6 addresses.
        /// </summary>
        public readonly string RouteTarget;

        [OutputConstructor]
        private GetInstanceNetworkingIpv6GlobalResult(
            int prefix,

            string range,

            string region,

            string routeTarget)
        {
            Prefix = prefix;
            Range = range;
            Region = region;
            RouteTarget = routeTarget;
        }
    }
}
