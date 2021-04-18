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
    public sealed class GetInstancesInstanceConfigDeviceSdcResult
    {
        public readonly int DiskId;
        public readonly string? DiskLabel;
        public readonly int? VolumeId;

        [OutputConstructor]
        private GetInstancesInstanceConfigDeviceSdcResult(
            int diskId,

            string? diskLabel,

            int? volumeId)
        {
            DiskId = diskId;
            DiskLabel = diskLabel;
            VolumeId = volumeId;
        }
    }
}
