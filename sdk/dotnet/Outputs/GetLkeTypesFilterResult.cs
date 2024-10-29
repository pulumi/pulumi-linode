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
    public sealed class GetLkeTypesFilterResult
    {
        /// <summary>
        /// The type of comparison to use for this filter.
        /// </summary>
        public readonly string? MatchBy;
        /// <summary>
        /// The name of the attribute to filter on.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The value(s) to be used in the filter.
        /// </summary>
        public readonly ImmutableArray<string> Values;

        [OutputConstructor]
        private GetLkeTypesFilterResult(
            string? matchBy,

            string name,

            ImmutableArray<string> values)
        {
            MatchBy = matchBy;
            Name = name;
            Values = values;
        }
    }
}
