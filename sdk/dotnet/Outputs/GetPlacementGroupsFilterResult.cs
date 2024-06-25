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
    public sealed class GetPlacementGroupsFilterResult
    {
        /// <summary>
        /// The method to match the field by. (`exact`, `regex`, `substring`; default `exact`)
        /// </summary>
        public readonly string? MatchBy;
        /// <summary>
        /// The name of the field to filter by. See the Filterable Fields section for a complete list of filterable fields.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// A list of values for the filter to allow. These values should all be in string form.
        /// </summary>
        public readonly ImmutableArray<string> Values;

        [OutputConstructor]
        private GetPlacementGroupsFilterResult(
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
