// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Inputs
{

    public sealed class InstanceBackupsScheduleArgs : global::Pulumi.ResourceArgs
    {
        [Input("day")]
        public Input<string>? Day { get; set; }

        [Input("window")]
        public Input<string>? Window { get; set; }

        public InstanceBackupsScheduleArgs()
        {
        }
        public static new InstanceBackupsScheduleArgs Empty => new InstanceBackupsScheduleArgs();
    }
}
