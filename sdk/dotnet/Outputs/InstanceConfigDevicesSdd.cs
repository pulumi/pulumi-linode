// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Outputs
{

    [OutputType]
    public sealed class InstanceConfigDevicesSdd
    {
        /// <summary>
        /// The Disk ID to map to this disk slot
        /// </summary>
        public readonly int? DiskId;
        /// <summary>
        /// The Block Storage volume ID to map to this disk slot
        /// </summary>
        public readonly int? VolumeId;

        [OutputConstructor]
        private InstanceConfigDevicesSdd(
            int? diskId,

            int? volumeId)
        {
            DiskId = diskId;
            VolumeId = volumeId;
        }
    }
}
