// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Inputs
{

    public sealed class InstanceBackupsScheduleGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The day of the week that your Linode's weekly Backup is taken. If not set manually, a day will be chosen for you. Backups are taken every day, but backups taken on this day are preferred when selecting backups to retain for a longer period.  If not set manually, then when backups are initially enabled, this may come back as "Scheduling" until the day is automatically selected.
        /// </summary>
        [Input("day")]
        public Input<string>? Day { get; set; }

        /// <summary>
        /// The window ('W0'-'W22') in which your backups will be taken, in UTC. A backups window is a two-hour span of time in which the backup may occur. For example, 'W10' indicates that your backups should be taken between 10:00 and 12:00. If you do not choose a backup window, one will be selected for you automatically.  If not set manually, when backups are initially enabled this may come back as Scheduling until the window is automatically selected.
        /// </summary>
        [Input("window")]
        public Input<string>? Window { get; set; }

        public InstanceBackupsScheduleGetArgs()
        {
        }
        public static new InstanceBackupsScheduleGetArgs Empty => new InstanceBackupsScheduleGetArgs();
    }
}
