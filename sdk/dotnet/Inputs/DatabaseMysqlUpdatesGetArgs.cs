// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Inputs
{

    public sealed class DatabaseMysqlUpdatesGetArgs : Pulumi.ResourceArgs
    {
        [Input("dayOfWeek", required: true)]
        public Input<string> DayOfWeek { get; set; } = null!;

        [Input("duration", required: true)]
        public Input<int> Duration { get; set; } = null!;

        [Input("frequency", required: true)]
        public Input<string> Frequency { get; set; } = null!;

        [Input("hourOfDay", required: true)]
        public Input<int> HourOfDay { get; set; } = null!;

        [Input("weekOfMonth")]
        public Input<int>? WeekOfMonth { get; set; }

        public DatabaseMysqlUpdatesGetArgs()
        {
        }
    }
}
