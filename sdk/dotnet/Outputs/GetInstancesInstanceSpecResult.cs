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
    public sealed class GetInstancesInstanceSpecResult
    {
        /// <summary>
        /// The number of VPUs this Linode has access to.
        /// </summary>
        public readonly int AcceleratedDevices;
        /// <summary>
        /// The amount of storage space, in GB. this Linode has access to. A typical Linode will divide this space between a primary disk with an image deployed to it, and a swap disk, usually 512 MB. This is the default configuration created when deploying a Linode with an image through POST /linode/instances.
        /// </summary>
        public readonly int Disk;
        /// <summary>
        /// The number of GPUs this Linode has access to.
        /// </summary>
        public readonly int Gpus;
        /// <summary>
        /// The amount of RAM, in MB, this Linode has access to. Typically a Linode will choose to boot with all of its available RAM, but this can be configured in a Config profile.
        /// </summary>
        public readonly int Memory;
        /// <summary>
        /// The amount of network transfer this Linode is allotted each month.
        /// </summary>
        public readonly int Transfer;
        /// <summary>
        /// The number of vcpus this Linode has access to. Typically a Linode will choose to boot with all of its available vcpus, but this can be configured in a Config Profile.
        /// </summary>
        public readonly int Vcpus;

        [OutputConstructor]
        private GetInstancesInstanceSpecResult(
            int acceleratedDevices,

            int disk,

            int gpus,

            int memory,

            int transfer,

            int vcpus)
        {
            AcceleratedDevices = acceleratedDevices;
            Disk = disk;
            Gpus = gpus;
            Memory = memory;
            Transfer = transfer;
            Vcpus = vcpus;
        }
    }
}
