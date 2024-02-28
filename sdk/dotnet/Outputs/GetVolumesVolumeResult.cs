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
    public sealed class GetVolumesVolumeResult
    {
        /// <summary>
        /// When this Volume was created.
        /// </summary>
        public readonly string Created;
        /// <summary>
        /// The full filesystem path for the Volume based on the Volume's label. Path is /dev/disk/by-id/scsi-0LinodeVolume + Volume label.
        /// </summary>
        public readonly string FilesystemPath;
        /// <summary>
        /// The unique ID of this Volume.
        /// </summary>
        public readonly int Id;
        /// <summary>
        /// This Volume's label is for display purposes only.
        /// </summary>
        public readonly string Label;
        /// <summary>
        /// If a Volume is attached to a specific Linode, the ID of that Linode will be displayed here. If the Volume is unattached, this value will be null.
        /// </summary>
        public readonly int LinodeId;
        /// <summary>
        /// The datacenter in which this Volume is located. See all regions [here](https://api.linode.com/v4/regions).
        /// </summary>
        public readonly string Region;
        /// <summary>
        /// The Volume's size, in GiB.
        /// </summary>
        public readonly int Size;
        /// <summary>
        /// The current status of the Volume. (`creating`, `active`, `resizing`, `contact_support`)
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// An array of tags applied to this object. Tags are case-insensitive and are for organizational purposes only.
        /// </summary>
        public readonly ImmutableArray<string> Tags;
        /// <summary>
        /// When this Volume was last updated.
        /// </summary>
        public readonly string Updated;

        [OutputConstructor]
        private GetVolumesVolumeResult(
            string created,

            string filesystemPath,

            int id,

            string label,

            int linodeId,

            string region,

            int size,

            string status,

            ImmutableArray<string> tags,

            string updated)
        {
            Created = created;
            FilesystemPath = filesystemPath;
            Id = id;
            Label = label;
            LinodeId = linodeId;
            Region = region;
            Size = size;
            Status = status;
            Tags = tags;
            Updated = updated;
        }
    }
}
