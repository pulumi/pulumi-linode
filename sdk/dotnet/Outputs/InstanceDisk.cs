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
    public sealed class InstanceDisk
    {
        /// <summary>
        /// A list of SSH public keys to deploy for the root user on the newly created Linode. Only accepted if 'image' is provided.
        /// </summary>
        public readonly ImmutableArray<string> AuthorizedKeys;
        /// <summary>
        /// A list of Linode usernames. If the usernames have associated SSH keys, the keys will be appended to the `root` user's `~/.ssh/authorized_keys` file automatically. Only accepted if 'image' is provided.
        /// </summary>
        public readonly ImmutableArray<string> AuthorizedUsers;
        /// <summary>
        /// The Disk filesystem can be one of: raw, swap, ext3, ext4, initrd (max 32mb)
        /// </summary>
        public readonly string? Filesystem;
        /// <summary>
        /// The ID of the Placement Group.
        /// </summary>
        public readonly int? Id;
        /// <summary>
        /// An Image ID to deploy the Disk from. Official Linode Images start with linode/, while your Images start with private/.
        /// </summary>
        public readonly string? Image;
        /// <summary>
        /// The Linode's label is for display purposes only. If no label is provided for a Linode, a default will be assigned.
        /// </summary>
        public readonly string Label;
        /// <summary>
        /// If true, this Disk is read-only.
        /// </summary>
        public readonly bool? ReadOnly;
        /// <summary>
        /// The password that will be initialially assigned to the 'root' user account.
        /// </summary>
        public readonly string? RootPass;
        /// <summary>
        /// The size of the Disk in MB.
        /// </summary>
        public readonly int Size;
        /// <summary>
        /// An object containing responses to any User Defined Fields present in the StackScript being deployed to this Linode. Only accepted if 'stackscript_id' is given. The required values depend on the StackScript being deployed.
        /// </summary>
        public readonly ImmutableDictionary<string, string>? StackscriptData;
        /// <summary>
        /// The StackScript to deploy to the newly created Linode. If provided, 'image' must also be provided, and must be an Image that is compatible with this StackScript.
        /// </summary>
        public readonly int? StackscriptId;

        [OutputConstructor]
        private InstanceDisk(
            ImmutableArray<string> authorizedKeys,

            ImmutableArray<string> authorizedUsers,

            string? filesystem,

            int? id,

            string? image,

            string label,

            bool? readOnly,

            string? rootPass,

            int size,

            ImmutableDictionary<string, string>? stackscriptData,

            int? stackscriptId)
        {
            AuthorizedKeys = authorizedKeys;
            AuthorizedUsers = authorizedUsers;
            Filesystem = filesystem;
            Id = id;
            Image = image;
            Label = label;
            ReadOnly = readOnly;
            RootPass = rootPass;
            Size = size;
            StackscriptData = stackscriptData;
            StackscriptId = stackscriptId;
        }
    }
}
