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
    public sealed class GetInstanceBackupsCurrentResult
    {
        /// <summary>
        /// A list of the labels of the Configuration profiles that are part of the Backup.
        /// </summary>
        public readonly ImmutableArray<string> Configs;
        /// <summary>
        /// The date the Backup was taken.
        /// </summary>
        public readonly string Created;
        public readonly ImmutableArray<Outputs.GetInstanceBackupsCurrentDiskResult> Disks;
        /// <summary>
        /// The date the Backup completed.
        /// </summary>
        public readonly string Finished;
        /// <summary>
        /// The unique ID of this Backup.
        /// </summary>
        public readonly int Id;
        /// <summary>
        /// The label of this disk.
        /// </summary>
        public readonly string Label;
        /// <summary>
        /// The current state of a specific Backup. (`paused`, `pending`, `running`, `needsPostProcessing`, `successful`, `failed`, `userAborted`)
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// This indicates whether the Backup is an automatic Backup or manual snapshot taken by the User at a specific point in time. (`auto`, `snapshot`)
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// The date the Backup was most recently updated.
        /// </summary>
        public readonly string Updated;

        [OutputConstructor]
        private GetInstanceBackupsCurrentResult(
            ImmutableArray<string> configs,

            string created,

            ImmutableArray<Outputs.GetInstanceBackupsCurrentDiskResult> disks,

            string finished,

            int id,

            string label,

            string status,

            string type,

            string updated)
        {
            Configs = configs;
            Created = created;
            Disks = disks;
            Finished = finished;
            Id = id;
            Label = label;
            Status = status;
            Type = type;
            Updated = updated;
        }
    }
}
