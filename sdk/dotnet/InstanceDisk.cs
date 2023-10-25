// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode
{
    /// <summary>
    /// Provides a Linode Instance Disk resource. This can be used to create, modify, and delete Linode Instance Disks.
    /// 
    /// **NOTE:** Deleting a disk will shut down the attached instance if the instance is booted. If the disk was not in use by the booted configuration profile, the instance will be automatically rebooted.
    /// 
    /// ## Example Usage
    /// 
    /// Creating a simple 512 MB Linode Instance Disk:
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Linode = Pulumi.Linode;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var my_instance = new Linode.Instance("my-instance", new()
    ///     {
    ///         Label = "my-instance",
    ///         Type = "g6-standard-1",
    ///         Region = "us-southeast",
    ///     });
    /// 
    ///     var boot = new Linode.InstanceDisk("boot", new()
    ///     {
    ///         Label = "boot",
    ///         LinodeId = my_instance.Id,
    ///         Size = 512,
    ///         Filesystem = "ext4",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// Creating a complex bootable Instance Disk:
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Linode = Pulumi.Linode;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var my_instance = new Linode.Instance("my-instance", new()
    ///     {
    ///         Label = "my-instance",
    ///         Type = "g6-standard-1",
    ///         Region = "us-southeast",
    ///     });
    /// 
    ///     var boot = new Linode.InstanceDisk("boot", new()
    ///     {
    ///         Label = "boot",
    ///         LinodeId = my_instance.Id,
    ///         Size = my_instance.Specs.Apply(specs =&gt; specs.Disk),
    ///         Image = "linode/ubuntu20.04",
    ///         RootPass = "myc00lpass!",
    ///         AuthorizedKeys = new[]
    ///         {
    ///             "ssh-rsa AAAA...Gw== user@example.local",
    ///         },
    ///         StackscriptId = 12345,
    ///         StackscriptData = 
    ///         {
    ///             { "my_var", "my_value" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Instance Disks can be imported using the `linode_id` followed by the Instance Disk `id` separated by a comma, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import linode:index/instanceDisk:InstanceDisk my-disk 1234567,7654321
    /// ```
    /// </summary>
    [LinodeResourceType("linode:index/instanceDisk:InstanceDisk")]
    public partial class InstanceDisk : global::Pulumi.CustomResource
    {
        /// <summary>
        /// A list of public SSH keys that will be automatically appended to the root user’s ~/.ssh/authorized_keys file when deploying from an Image.
        /// </summary>
        [Output("authorizedKeys")]
        public Output<ImmutableArray<string>> AuthorizedKeys { get; private set; } = null!;

        /// <summary>
        /// A list of usernames. If the usernames have associated SSH keys, the keys will be appended to the
        /// </summary>
        [Output("authorizedUsers")]
        public Output<ImmutableArray<string>> AuthorizedUsers { get; private set; } = null!;

        /// <summary>
        /// When this disk was created.
        /// </summary>
        [Output("created")]
        public Output<string> Created { get; private set; } = null!;

        /// <summary>
        /// The filesystem of this disk. (`raw`, `swap`, `ext3`, `ext4`, `initrd`)
        /// </summary>
        [Output("filesystem")]
        public Output<string> Filesystem { get; private set; } = null!;

        /// <summary>
        /// An Image ID to deploy the Linode Disk from.
        /// </summary>
        [Output("image")]
        public Output<string?> Image { get; private set; } = null!;

        /// <summary>
        /// The Disk's label for display purposes only.
        /// </summary>
        [Output("label")]
        public Output<string> Label { get; private set; } = null!;

        /// <summary>
        /// The ID of the Linode to create this Disk under.
        /// </summary>
        [Output("linodeId")]
        public Output<int> LinodeId { get; private set; } = null!;

        /// <summary>
        /// The root user’s password on a newly-created Linode Disk when deploying from an Image.
        /// </summary>
        [Output("rootPass")]
        public Output<string?> RootPass { get; private set; } = null!;

        /// <summary>
        /// The size of the Disk in MB. **NOTE:** Resizing a disk will trigger a Linode reboot.
        /// 
        /// - - -
        /// </summary>
        [Output("size")]
        public Output<int> Size { get; private set; } = null!;

        /// <summary>
        /// An object containing responses to any User Defined Fields present in the StackScript being deployed to this Disk. Only accepted if `stackscript_id` is given.
        /// </summary>
        [Output("stackscriptData")]
        public Output<ImmutableDictionary<string, object>?> StackscriptData { get; private set; } = null!;

        /// <summary>
        /// A StackScript ID that will cause the referenced StackScript to be run during deployment of this Disk.
        /// </summary>
        [Output("stackscriptId")]
        public Output<int?> StackscriptId { get; private set; } = null!;

        /// <summary>
        /// A brief description of this Disk's current state.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// When this disk was last updated.
        /// </summary>
        [Output("updated")]
        public Output<string> Updated { get; private set; } = null!;


        /// <summary>
        /// Create a InstanceDisk resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public InstanceDisk(string name, InstanceDiskArgs args, CustomResourceOptions? options = null)
            : base("linode:index/instanceDisk:InstanceDisk", name, args ?? new InstanceDiskArgs(), MakeResourceOptions(options, ""))
        {
        }

        private InstanceDisk(string name, Input<string> id, InstanceDiskState? state = null, CustomResourceOptions? options = null)
            : base("linode:index/instanceDisk:InstanceDisk", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "rootPass",
                    "stackscriptData",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing InstanceDisk resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static InstanceDisk Get(string name, Input<string> id, InstanceDiskState? state = null, CustomResourceOptions? options = null)
        {
            return new InstanceDisk(name, id, state, options);
        }
    }

    public sealed class InstanceDiskArgs : global::Pulumi.ResourceArgs
    {
        [Input("authorizedKeys")]
        private InputList<string>? _authorizedKeys;

        /// <summary>
        /// A list of public SSH keys that will be automatically appended to the root user’s ~/.ssh/authorized_keys file when deploying from an Image.
        /// </summary>
        public InputList<string> AuthorizedKeys
        {
            get => _authorizedKeys ?? (_authorizedKeys = new InputList<string>());
            set => _authorizedKeys = value;
        }

        [Input("authorizedUsers")]
        private InputList<string>? _authorizedUsers;

        /// <summary>
        /// A list of usernames. If the usernames have associated SSH keys, the keys will be appended to the
        /// </summary>
        public InputList<string> AuthorizedUsers
        {
            get => _authorizedUsers ?? (_authorizedUsers = new InputList<string>());
            set => _authorizedUsers = value;
        }

        /// <summary>
        /// The filesystem of this disk. (`raw`, `swap`, `ext3`, `ext4`, `initrd`)
        /// </summary>
        [Input("filesystem")]
        public Input<string>? Filesystem { get; set; }

        /// <summary>
        /// An Image ID to deploy the Linode Disk from.
        /// </summary>
        [Input("image")]
        public Input<string>? Image { get; set; }

        /// <summary>
        /// The Disk's label for display purposes only.
        /// </summary>
        [Input("label", required: true)]
        public Input<string> Label { get; set; } = null!;

        /// <summary>
        /// The ID of the Linode to create this Disk under.
        /// </summary>
        [Input("linodeId", required: true)]
        public Input<int> LinodeId { get; set; } = null!;

        [Input("rootPass")]
        private Input<string>? _rootPass;

        /// <summary>
        /// The root user’s password on a newly-created Linode Disk when deploying from an Image.
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
        /// The size of the Disk in MB. **NOTE:** Resizing a disk will trigger a Linode reboot.
        /// 
        /// - - -
        /// </summary>
        [Input("size", required: true)]
        public Input<int> Size { get; set; } = null!;

        [Input("stackscriptData")]
        private InputMap<object>? _stackscriptData;

        /// <summary>
        /// An object containing responses to any User Defined Fields present in the StackScript being deployed to this Disk. Only accepted if `stackscript_id` is given.
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
        /// A StackScript ID that will cause the referenced StackScript to be run during deployment of this Disk.
        /// </summary>
        [Input("stackscriptId")]
        public Input<int>? StackscriptId { get; set; }

        public InstanceDiskArgs()
        {
        }
        public static new InstanceDiskArgs Empty => new InstanceDiskArgs();
    }

    public sealed class InstanceDiskState : global::Pulumi.ResourceArgs
    {
        [Input("authorizedKeys")]
        private InputList<string>? _authorizedKeys;

        /// <summary>
        /// A list of public SSH keys that will be automatically appended to the root user’s ~/.ssh/authorized_keys file when deploying from an Image.
        /// </summary>
        public InputList<string> AuthorizedKeys
        {
            get => _authorizedKeys ?? (_authorizedKeys = new InputList<string>());
            set => _authorizedKeys = value;
        }

        [Input("authorizedUsers")]
        private InputList<string>? _authorizedUsers;

        /// <summary>
        /// A list of usernames. If the usernames have associated SSH keys, the keys will be appended to the
        /// </summary>
        public InputList<string> AuthorizedUsers
        {
            get => _authorizedUsers ?? (_authorizedUsers = new InputList<string>());
            set => _authorizedUsers = value;
        }

        /// <summary>
        /// When this disk was created.
        /// </summary>
        [Input("created")]
        public Input<string>? Created { get; set; }

        /// <summary>
        /// The filesystem of this disk. (`raw`, `swap`, `ext3`, `ext4`, `initrd`)
        /// </summary>
        [Input("filesystem")]
        public Input<string>? Filesystem { get; set; }

        /// <summary>
        /// An Image ID to deploy the Linode Disk from.
        /// </summary>
        [Input("image")]
        public Input<string>? Image { get; set; }

        /// <summary>
        /// The Disk's label for display purposes only.
        /// </summary>
        [Input("label")]
        public Input<string>? Label { get; set; }

        /// <summary>
        /// The ID of the Linode to create this Disk under.
        /// </summary>
        [Input("linodeId")]
        public Input<int>? LinodeId { get; set; }

        [Input("rootPass")]
        private Input<string>? _rootPass;

        /// <summary>
        /// The root user’s password on a newly-created Linode Disk when deploying from an Image.
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
        /// The size of the Disk in MB. **NOTE:** Resizing a disk will trigger a Linode reboot.
        /// 
        /// - - -
        /// </summary>
        [Input("size")]
        public Input<int>? Size { get; set; }

        [Input("stackscriptData")]
        private InputMap<object>? _stackscriptData;

        /// <summary>
        /// An object containing responses to any User Defined Fields present in the StackScript being deployed to this Disk. Only accepted if `stackscript_id` is given.
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
        /// A StackScript ID that will cause the referenced StackScript to be run during deployment of this Disk.
        /// </summary>
        [Input("stackscriptId")]
        public Input<int>? StackscriptId { get; set; }

        /// <summary>
        /// A brief description of this Disk's current state.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// When this disk was last updated.
        /// </summary>
        [Input("updated")]
        public Input<string>? Updated { get; set; }

        public InstanceDiskState()
        {
        }
        public static new InstanceDiskState Empty => new InstanceDiskState();
    }
}
