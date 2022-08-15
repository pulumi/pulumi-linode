// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Inputs
{

    public sealed class InstanceConfigDevicesSdcArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Disk ID of the associated `disk_label`, if used.
        /// </summary>
        [Input("diskId")]
        public Input<int>? DiskId { get; set; }

        /// <summary>
        /// The `label` of the `disk` to map to this `device` slot.
        /// </summary>
        [Input("diskLabel")]
        public Input<string>? DiskLabel { get; set; }

        /// <summary>
        /// The Volume ID to map to this `device` slot.
        /// </summary>
        [Input("volumeId")]
        public Input<int>? VolumeId { get; set; }

        public InstanceConfigDevicesSdcArgs()
        {
        }
        public static new InstanceConfigDevicesSdcArgs Empty => new InstanceConfigDevicesSdcArgs();
    }
}
