// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Inputs
{

    public sealed class InstanceConfigDevicesSdfGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Disk ID to map to this `device` slot
        /// </summary>
        [Input("diskId")]
        public Input<int>? DiskId { get; set; }

        /// <summary>
        /// The Volume ID to map to this `device` slot.
        /// </summary>
        [Input("volumeId")]
        public Input<int>? VolumeId { get; set; }

        public InstanceConfigDevicesSdfGetArgs()
        {
        }
        public static new InstanceConfigDevicesSdfGetArgs Empty => new InstanceConfigDevicesSdfGetArgs();
    }
}
