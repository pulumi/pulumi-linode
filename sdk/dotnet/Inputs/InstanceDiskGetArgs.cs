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
        /// A list of SSH public keys to deploy for the root user on the newly created Linode. Only accepted if 'image' is provided.
        /// </summary>
        public InputList<string> AuthorizedKeys
        {
            get => _authorizedKeys ?? (_authorizedKeys = new InputList<string>());
            set => _authorizedKeys = value;
        }

        [Input("authorizedUsers")]
        private InputList<string>? _authorizedUsers;

        /// <summary>
        /// A list of Linode usernames. If the usernames have associated SSH keys, the keys will be appended to the `root` user's `~/.ssh/authorized_keys` file automatically. Only accepted if 'image' is provided.
        /// </summary>
        public InputList<string> AuthorizedUsers
        {
            get => _authorizedUsers ?? (_authorizedUsers = new InputList<string>());
            set => _authorizedUsers = value;
        }

        /// <summary>
        /// The Disk filesystem can be one of: raw, swap, ext3, ext4, initrd (max 32mb)
        /// </summary>
        [Input("filesystem")]
        public Input<string>? Filesystem { get; set; }

        /// <summary>
        /// The ID of the Placement Group.
        /// </summary>
        [Input("id")]
        public Input<int>? Id { get; set; }

        /// <summary>
        /// An Image ID to deploy the Disk from. Official Linode Images start with linode/, while your Images start with private/.
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
        /// The password that will be initialially assigned to the 'root' user account.
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
        private InputMap<string>? _stackscriptData;

        /// <summary>
        /// An object containing responses to any User Defined Fields present in the StackScript being deployed to this Linode. Only accepted if 'stackscript_id' is given. The required values depend on the StackScript being deployed.
        /// </summary>
        public InputMap<string> StackscriptData
        {
            get => _stackscriptData ?? (_stackscriptData = new InputMap<string>());
            set
            {
                var emptySecret = Output.CreateSecret(ImmutableDictionary.Create<string, string>());
                _stackscriptData = Output.All(value, emptySecret).Apply(v => v[0]);
            }
        }

        /// <summary>
        /// The StackScript to deploy to the newly created Linode. If provided, 'image' must also be provided, and must be an Image that is compatible with this StackScript.
        /// </summary>
        [Input("stackscriptId")]
        public Input<int>? StackscriptId { get; set; }

        public InstanceDiskGetArgs()
        {
        }
        public static new InstanceDiskGetArgs Empty => new InstanceDiskGetArgs();
    }
}
