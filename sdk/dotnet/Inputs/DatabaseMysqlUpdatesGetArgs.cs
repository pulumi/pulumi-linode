// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Inputs
{

    public sealed class DatabaseMysqlUpdatesGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The day to perform maintenance.
        /// </summary>
        [Input("dayOfWeek", required: true)]
        public Input<string> DayOfWeek { get; set; } = null!;

        /// <summary>
        /// The maximum maintenance window time in hours.
        /// </summary>
        [Input("duration", required: true)]
        public Input<int> Duration { get; set; } = null!;

        /// <summary>
        /// Whether maintenance occurs on a weekly or monthly basis.
        /// </summary>
        [Input("frequency", required: true)]
        public Input<string> Frequency { get; set; } = null!;

        /// <summary>
        /// The hour to begin maintenance based in UTC time.
        /// </summary>
        [Input("hourOfDay", required: true)]
        public Input<int> HourOfDay { get; set; } = null!;

        /// <summary>
        /// The week of the month to perform monthly frequency updates. Required for monthly frequency updates.
        /// </summary>
        [Input("weekOfMonth")]
        public Input<int>? WeekOfMonth { get; set; }

        public DatabaseMysqlUpdatesGetArgs()
        {
        }
        public static new DatabaseMysqlUpdatesGetArgs Empty => new DatabaseMysqlUpdatesGetArgs();
    }
}
