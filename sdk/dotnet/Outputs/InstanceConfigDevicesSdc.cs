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
    public sealed class InstanceConfigDevicesSdc
    {
        /// <summary>
        /// The Disk ID of the associated `disk_label`, if used.
        /// </summary>
        public readonly int? DiskId;
        /// <summary>
        /// The `label` of the `disk` to map to this `device` slot.
        /// </summary>
        public readonly string? DiskLabel;
        /// <summary>
        /// The Volume ID to map to this `device` slot.
        /// </summary>
        public readonly int? VolumeId;

        [OutputConstructor]
        private InstanceConfigDevicesSdc(
            int? diskId,

            string? diskLabel,

            int? volumeId)
        {
            DiskId = diskId;
            DiskLabel = diskLabel;
            VolumeId = volumeId;
        }
    }
}
