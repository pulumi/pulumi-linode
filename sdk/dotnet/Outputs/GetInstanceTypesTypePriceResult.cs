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
    public sealed class GetInstanceTypesTypePriceResult
    {
        public readonly double Hourly;
        public readonly double Monthly;

        [OutputConstructor]
        private GetInstanceTypesTypePriceResult(
            double hourly,

            double monthly)
        {
            Hourly = hourly;
            Monthly = monthly;
        }
    }
}
