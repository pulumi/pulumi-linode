// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Inputs
{

    public sealed class GetLkeTypesTypePriceArgs : global::Pulumi.InvokeArgs
    {
        [Input("hourly", required: true)]
        public double Hourly { get; set; }

        [Input("monthly", required: true)]
        public double Monthly { get; set; }

        public GetLkeTypesTypePriceArgs()
        {
        }
        public static new GetLkeTypesTypePriceArgs Empty => new GetLkeTypesTypePriceArgs();
    }
}
