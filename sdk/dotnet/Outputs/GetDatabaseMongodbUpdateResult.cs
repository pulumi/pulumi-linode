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
    public sealed class GetDatabaseMongodbUpdateResult
    {
        public readonly string DayOfWeek;
        public readonly int Duration;
        public readonly string Frequency;
        public readonly int HourOfDay;
        public readonly int WeekOfMonth;

        [OutputConstructor]
        private GetDatabaseMongodbUpdateResult(
            string dayOfWeek,

            int duration,

            string frequency,

            int hourOfDay,

            int weekOfMonth)
        {
            DayOfWeek = dayOfWeek;
            Duration = duration;
            Frequency = frequency;
            HourOfDay = hourOfDay;
            WeekOfMonth = weekOfMonth;
        }
    }
}
