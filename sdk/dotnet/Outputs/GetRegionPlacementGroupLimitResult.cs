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
    public sealed class GetRegionPlacementGroupLimitResult
    {
        /// <summary>
        /// The maximum number of Linodes allowed to be assigned to a placement group in this region.
        /// </summary>
        public readonly int MaximumLinodesPerPg;
        /// <summary>
        /// The maximum number of placement groups allowed for the current user in this region.
        /// </summary>
        public readonly int MaximumPgsPerCustomer;

        [OutputConstructor]
        private GetRegionPlacementGroupLimitResult(
            int maximumLinodesPerPg,

            int maximumPgsPerCustomer)
        {
            MaximumLinodesPerPg = maximumLinodesPerPg;
            MaximumPgsPerCustomer = maximumPgsPerCustomer;
        }
    }
}
