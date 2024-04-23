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
    public sealed class GetInstanceTypeAddonsBackupPriceResult
    {
        /// <summary>
        /// The cost (in US dollars) per hour to add Backups service.
        /// </summary>
        public readonly double Hourly;
        /// <summary>
        /// The cost (in US dollars) per month to add Backups service.
        /// </summary>
        public readonly double Monthly;

        [OutputConstructor]
        private GetInstanceTypeAddonsBackupPriceResult(
            double hourly,

            double monthly)
        {
            Hourly = hourly;
            Monthly = monthly;
        }
    }
}
