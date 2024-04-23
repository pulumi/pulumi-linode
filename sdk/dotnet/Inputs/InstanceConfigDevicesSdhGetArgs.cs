// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Inputs
{

    public sealed class InstanceConfigDevicesSdhGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Disk ID to map to this disk slot
        /// </summary>
        [Input("diskId")]
        public Input<int>? DiskId { get; set; }

        /// <summary>
        /// The `label` of the `disk` to map to this `device` slot.
        /// </summary>
        [Input("diskLabel")]
        public Input<string>? DiskLabel { get; set; }

        /// <summary>
        /// The Block Storage volume ID to map to this disk slot
        /// </summary>
        [Input("volumeId")]
        public Input<int>? VolumeId { get; set; }

        public InstanceConfigDevicesSdhGetArgs()
        {
        }
        public static new InstanceConfigDevicesSdhGetArgs Empty => new InstanceConfigDevicesSdhGetArgs();
    }
}
