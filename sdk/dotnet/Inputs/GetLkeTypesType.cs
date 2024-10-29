// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Inputs
{

    public sealed class GetLkeTypesTypeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The unique ID assigned to this LKE Type.
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        /// <summary>
        /// The LKE Type's label.
        /// </summary>
        [Input("label", required: true)]
        public string Label { get; set; } = null!;

        [Input("prices", required: true)]
        private List<Inputs.GetLkeTypesTypePriceArgs>? _prices;

        /// <summary>
        /// Cost in US dollars, broken down into hourly and monthly charges.
        /// </summary>
        public List<Inputs.GetLkeTypesTypePriceArgs> Prices
        {
            get => _prices ?? (_prices = new List<Inputs.GetLkeTypesTypePriceArgs>());
            set => _prices = value;
        }

        [Input("regionPrices", required: true)]
        private List<Inputs.GetLkeTypesTypeRegionPriceArgs>? _regionPrices;

        /// <summary>
        /// A list of region-specific prices for this LKE Type.
        /// </summary>
        public List<Inputs.GetLkeTypesTypeRegionPriceArgs> RegionPrices
        {
            get => _regionPrices ?? (_regionPrices = new List<Inputs.GetLkeTypesTypeRegionPriceArgs>());
            set => _regionPrices = value;
        }

        /// <summary>
        /// The monthly outbound transfer amount, in MB.
        /// </summary>
        [Input("transfer", required: true)]
        public int Transfer { get; set; }

        public GetLkeTypesTypeArgs()
        {
        }
        public static new GetLkeTypesTypeArgs Empty => new GetLkeTypesTypeArgs();
    }
}
