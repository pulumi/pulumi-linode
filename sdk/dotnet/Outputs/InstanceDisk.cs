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
    public sealed class InstanceDisk
    {
        /// <summary>
        /// A list of SSH public keys to deploy for the root user on the newly created Linode. Only accepted if `image` is provided. *This value can not be imported.* *Changing `authorized_keys` forces the creation of a new Linode Instance.*
        /// </summary>
        public readonly ImmutableArray<string> AuthorizedKeys;
        /// <summary>
        /// A list of Linode usernames. If the usernames have associated SSH keys, the keys will be appended to the `root` user's `~/.ssh/authorized_keys` file automatically. *This value can not be imported.* *Changing `authorized_users` forces the creation of a new Linode Instance.*
        /// </summary>
        public readonly ImmutableArray<string> AuthorizedUsers;
        /// <summary>
        /// The Disk filesystem can be one of: `"raw"`, `"swap"`, `"ext3"`, `"ext4"`, or `"initrd"` which has a max size of 32mb and can be used in the config `initrd` (not currently supported in this provider).
        /// </summary>
        public readonly string? Filesystem;
        /// <summary>
        /// The ID of the disk in the Linode API.
        /// </summary>
        public readonly int? Id;
        /// <summary>
        /// An Image ID to deploy the Disk from. Official Linode Images start with linode/, while your Images start with private/. See /images for more information on the Images available for you to use. Examples are `linode/debian9`, `linode/fedora28`, `linode/ubuntu16.04lts`, `linode/arch`, and `private/12345`. See all images [here](https://api.linode.com/v4/linode/kernels). *Changing `image` forces the creation of a new Linode Instance.*
        /// </summary>
        public readonly string? Image;
        /// <summary>
        /// The name of this interface. If the interface is a VLAN, a label is required.
        /// </summary>
        public readonly string Label;
        public readonly bool? ReadOnly;
        /// <summary>
        /// The initial password for the `root` user account. *This value can not be imported.* *Changing `root_pass` forces the creation of a new Linode Instance.* *If omitted, a random password will be generated but will not be stored in state.*
        /// </summary>
        public readonly string? RootPass;
        /// <summary>
        /// The size of the Disk in MB.
        /// </summary>
        public readonly int Size;
        /// <summary>
        /// An object containing responses to any User Defined Fields present in the StackScript being deployed to this Linode. Only accepted if 'stackscript_id' is given. The required values depend on the StackScript being deployed.  *This value can not be imported.* *Changing `stackscript_data` forces the creation of a new Linode Instance.*
        /// </summary>
        public readonly ImmutableDictionary<string, object>? StackscriptData;
        /// <summary>
        /// The StackScript to deploy to the newly created Linode. If provided, 'image' must also be provided, and must be an Image that is compatible with this StackScript. *This value can not be imported.* *Changing `stackscript_id` forces the creation of a new Linode Instance.*
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

            ImmutableDictionary<string, object>? stackscriptData,

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
