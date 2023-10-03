// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Inputs
{

    public sealed class InstanceDiskGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("authorizedKeys")]
        private InputList<string>? _authorizedKeys;

        /// <summary>
        /// A list of SSH public keys to deploy for the root user on the newly created Linode. Only accepted if `image` is provided. *This value can not be imported.* *Changing `authorized_keys` forces the creation of a new Linode Instance.*
        /// </summary>
        public InputList<string> AuthorizedKeys
        {
            get => _authorizedKeys ?? (_authorizedKeys = new InputList<string>());
            set => _authorizedKeys = value;
        }

        [Input("authorizedUsers")]
        private InputList<string>? _authorizedUsers;

        /// <summary>
        /// A list of Linode usernames. If the usernames have associated SSH keys, the keys will be appended to the `root` user's `~/.ssh/authorized_keys` file automatically. *This value can not be imported.* *Changing `authorized_users` forces the creation of a new Linode Instance.*
        /// </summary>
        public InputList<string> AuthorizedUsers
        {
            get => _authorizedUsers ?? (_authorizedUsers = new InputList<string>());
            set => _authorizedUsers = value;
        }

        /// <summary>
        /// The Disk filesystem can be one of: `"raw"`, `"swap"`, `"ext3"`, `"ext4"`, or `"initrd"` which has a max size of 32mb and can be used in the config `initrd` (not currently supported in this provider).
        /// </summary>
        [Input("filesystem")]
        public Input<string>? Filesystem { get; set; }

        /// <summary>
        /// The ID of the disk in the Linode API.
        /// </summary>
        [Input("id")]
        public Input<int>? Id { get; set; }

        /// <summary>
        /// An Image ID to deploy the Disk from. Official Linode Images start with linode/, while your Images start with private/. See /images for more information on the Images available for you to use. Examples are `linode/debian9`, `linode/fedora28`, `linode/ubuntu16.04lts`, `linode/arch`, and `private/12345`. See all images [here](https://api.linode.com/v4/images). *Changing `image` forces the creation of a new Linode Instance.*
        /// </summary>
        [Input("image")]
        public Input<string>? Image { get; set; }

        /// <summary>
        /// The Linode's label is for display purposes only. If no label is provided for a Linode, a default will be assigned.
        /// </summary>
        [Input("label", required: true)]
        public Input<string> Label { get; set; } = null!;

        /// <summary>
        /// If true, this Disk is read-only.
        /// </summary>
        [Input("readOnly")]
        public Input<bool>? ReadOnly { get; set; }

        [Input("rootPass")]
        private Input<string>? _rootPass;

        /// <summary>
        /// The initial password for the `root` user account. *This value can not be imported.* *Changing `root_pass` forces the creation of a new Linode Instance.* *If omitted, a random password will be generated but will not be stored in state.*
        /// </summary>
        public Input<string>? RootPass
        {
            get => _rootPass;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _rootPass = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The size of the Disk in MB.
        /// </summary>
        [Input("size", required: true)]
        public Input<int> Size { get; set; } = null!;

        [Input("stackscriptData")]
        private InputMap<object>? _stackscriptData;

        /// <summary>
        /// An object containing responses to any User Defined Fields present in the StackScript being deployed to this Linode. Only accepted if 'stackscript_id' is given. The required values depend on the StackScript being deployed.  *This value can not be imported.* *Changing `stackscript_data` forces the creation of a new Linode Instance.*
        /// </summary>
        public InputMap<object> StackscriptData
        {
            get => _stackscriptData ?? (_stackscriptData = new InputMap<object>());
            set
            {
                var emptySecret = Output.CreateSecret(ImmutableDictionary.Create<string, object>());
                _stackscriptData = Output.All(value, emptySecret).Apply(v => v[0]);
            }
        }

        /// <summary>
        /// The StackScript to deploy to the newly created Linode. If provided, 'image' must also be provided, and must be an Image that is compatible with this StackScript. *This value can not be imported.* *Changing `stackscript_id` forces the creation of a new Linode Instance.*
        /// </summary>
        [Input("stackscriptId")]
        public Input<int>? StackscriptId { get; set; }

        public InstanceDiskGetArgs()
        {
        }
        public static new InstanceDiskGetArgs Empty => new InstanceDiskGetArgs();
    }
}
