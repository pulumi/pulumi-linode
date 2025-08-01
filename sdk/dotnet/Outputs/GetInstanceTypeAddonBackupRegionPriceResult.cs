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
    public sealed class GetInstanceTypeAddonBackupRegionPriceResult
    {
        public readonly double Hourly;
        /// <summary>
        /// Label used to identify instance type
        /// </summary>
        public readonly string Id;
        public readonly double Monthly;

        [OutputConstructor]
        private GetInstanceTypeAddonBackupRegionPriceResult(
            double hourly,

            string id,

            double monthly)
        {
            Hourly = hourly;
            Id = id;
            Monthly = monthly;
        }
    }
}
