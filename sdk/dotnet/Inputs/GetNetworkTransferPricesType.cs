// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Inputs
{

    public sealed class GetNetworkTransferPricesTypeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID representing the Network Transfer Price.
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        /// <summary>
        /// The Network Transfer Price label is for display purposes only.
        /// </summary>
        [Input("label", required: true)]
        public string Label { get; set; } = null!;

        [Input("prices", required: true)]
        private List<Inputs.GetNetworkTransferPricesTypePriceArgs>? _prices;

        /// <summary>
        /// Cost in US dollars, broken down into hourly and monthly charges.
        /// </summary>
        public List<Inputs.GetNetworkTransferPricesTypePriceArgs> Prices
        {
            get => _prices ?? (_prices = new List<Inputs.GetNetworkTransferPricesTypePriceArgs>());
            set => _prices = value;
        }

        [Input("regionPrices", required: true)]
        private List<Inputs.GetNetworkTransferPricesTypeRegionPriceArgs>? _regionPrices;

        /// <summary>
        /// A list of region-specific prices for this Network Transfer Price.
        /// </summary>
        public List<Inputs.GetNetworkTransferPricesTypeRegionPriceArgs> RegionPrices
        {
            get => _regionPrices ?? (_regionPrices = new List<Inputs.GetNetworkTransferPricesTypeRegionPriceArgs>());
            set => _regionPrices = value;
        }

        /// <summary>
        /// The monthly outbound transfer amount, in MB.
        /// </summary>
        [Input("transfer", required: true)]
        public int Transfer { get; set; }

        public GetNetworkTransferPricesTypeArgs()
        {
        }
        public static new GetNetworkTransferPricesTypeArgs Empty => new GetNetworkTransferPricesTypeArgs();
    }
}
