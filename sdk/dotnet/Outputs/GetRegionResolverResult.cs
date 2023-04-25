// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Outputs
{

    [OutputType]
    public sealed class GetRegionResolverResult
    {
        /// <summary>
        /// The IPv4 addresses for this region’s DNS resolvers, separated by commas.
        /// </summary>
        public readonly string Ipv4;
        /// <summary>
        /// The IPv6 addresses for this region’s DNS resolvers, separated by commas.
        /// </summary>
        public readonly string Ipv6;

        [OutputConstructor]
        private GetRegionResolverResult(
            string ipv4,

            string ipv6)
        {
            Ipv4 = ipv4;
            Ipv6 = ipv6;
        }
    }
}
