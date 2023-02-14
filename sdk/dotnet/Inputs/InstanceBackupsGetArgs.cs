// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Inputs
{

    public sealed class InstanceBackupsGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("available")]
        public Input<bool>? Available { get; set; }

        /// <summary>
        /// If this Linode has the Backup service enabled.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("schedule")]
        public Input<Inputs.InstanceBackupsScheduleGetArgs>? Schedule { get; set; }

        public InstanceBackupsGetArgs()
        {
        }
        public static new InstanceBackupsGetArgs Empty => new InstanceBackupsGetArgs();
    }
}
