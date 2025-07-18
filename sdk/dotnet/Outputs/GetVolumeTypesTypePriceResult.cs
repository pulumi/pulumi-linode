// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Outputs
{

    [OutputType]
    public sealed class GetVolumeTypesTypePriceResult
    {
        /// <summary>
        /// Cost (in US dollars) per hour.
        /// </summary>
        public readonly double Hourly;
        /// <summary>
        /// Cost (in US dollars) per month.
        /// </summary>
        public readonly double Monthly;

        [OutputConstructor]
        private GetVolumeTypesTypePriceResult(
            double hourly,

            double monthly)
        {
            Hourly = hourly;
            Monthly = monthly;
        }
    }
}
