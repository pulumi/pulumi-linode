// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Inputs
{

    public sealed class GetInstanceTypesTypeAddonBackupPriceArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Cost (in US dollars) per hour.
        /// </summary>
        [Input("hourly", required: true)]
        public double Hourly { get; set; }

        /// <summary>
        /// Cost (in US dollars) per month.
        /// </summary>
        [Input("monthly", required: true)]
        public double Monthly { get; set; }

        public GetInstanceTypesTypeAddonBackupPriceArgs()
        {
        }
        public static new GetInstanceTypesTypeAddonBackupPriceArgs Empty => new GetInstanceTypesTypeAddonBackupPriceArgs();
    }
}
