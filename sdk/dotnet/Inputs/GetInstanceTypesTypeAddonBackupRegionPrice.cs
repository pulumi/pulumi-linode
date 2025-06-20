// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Inputs
{

    public sealed class GetInstanceTypesTypeAddonBackupRegionPriceArgs : global::Pulumi.InvokeArgs
    {
        [Input("hourly", required: true)]
        public double Hourly { get; set; }

        /// <summary>
        /// The ID representing the Linode Type.
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        [Input("monthly", required: true)]
        public double Monthly { get; set; }

        public GetInstanceTypesTypeAddonBackupRegionPriceArgs()
        {
        }
        public static new GetInstanceTypesTypeAddonBackupRegionPriceArgs Empty => new GetInstanceTypesTypeAddonBackupRegionPriceArgs();
    }
}
