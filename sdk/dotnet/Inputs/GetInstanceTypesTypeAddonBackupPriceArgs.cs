// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Inputs
{

    public sealed class GetInstanceTypesTypeAddonBackupPriceInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("hourly", required: true)]
        public Input<double> Hourly { get; set; } = null!;

        [Input("monthly", required: true)]
        public Input<double> Monthly { get; set; } = null!;

        public GetInstanceTypesTypeAddonBackupPriceInputArgs()
        {
        }
        public static new GetInstanceTypesTypeAddonBackupPriceInputArgs Empty => new GetInstanceTypesTypeAddonBackupPriceInputArgs();
    }
}
