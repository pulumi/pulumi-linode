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
    public sealed class GetVolumeTypesTypeResult
    {
        /// <summary>
        /// The unique ID assigned to this Volume Type.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The Volume Type's label.
        /// </summary>
        public readonly string Label;
        /// <summary>
        /// Cost in US dollars, broken down into hourly and monthly charges.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetVolumeTypesTypePriceResult> Prices;
        /// <summary>
        /// A list of region-specific prices for this Volume Type.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetVolumeTypesTypeRegionPriceResult> RegionPrices;
        /// <summary>
        /// The monthly outbound transfer amount, in MB.
        /// </summary>
        public readonly int Transfer;

        [OutputConstructor]
        private GetVolumeTypesTypeResult(
            string id,

            string label,

            ImmutableArray<Outputs.GetVolumeTypesTypePriceResult> prices,

            ImmutableArray<Outputs.GetVolumeTypesTypeRegionPriceResult> regionPrices,

            int transfer)
        {
            Id = id;
            Label = label;
            Prices = prices;
            RegionPrices = regionPrices;
            Transfer = transfer;
        }
    }
}
