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
    /// Provides a Linode Instance resource.  This can be used to create, modify, and delete Linodes.
    /// For more information, see [Getting Started with Linode](https://linode.com/docs/getting-started/) and the [Linode APIv4 docs](https://developers.linode.com/api/v4#operation/createLinodeInstance).
    /// 
    /// ## Example Usage
    /// ### Simple Linode Instance
    /// 
    /// The following example shows how one might use this resource to configure a Linode instance.
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Linode = Pulumi.Linode;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var web = new Linode.Instance("web", new Linode.InstanceArgs
    ///         {
    ///             AuthorizedKeys = 
    ///             {
    ///                 "ssh-rsa AAAA...Gw== user@example.local",
    ///             },
    ///             Group = "foo",
    ///             Image = "linode/ubuntu18.04",
    ///             Label = "simple_instance",
    ///             PrivateIp = true,
    ///             Region = "us-central",
    ///             RootPass = "terr4form-test",
    ///             SwapSize = 256,
    ///             Tags = 
    ///             {
    ///                 "foo",
    ///             },
    ///             Type = "g6-standard-1",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// ### Linode Instance with explicit Configs and Disks
    /// 
    /// Using explicit Instance Configs and Disks it is possible to create a more elaborate Linode instance.  This can be used to provision multiple disks and volumes during Instance creation.
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Linode = Pulumi.Linode;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var me = Output.Create(Linode.GetProfile.InvokeAsync());
    ///         var webVolume = new Linode.Volume("webVolume", new Linode.VolumeArgs
    ///         {
    ///             Label = "web_volume",
    ///             Region = "us-central",
    ///             Size = 20,
    ///         });
    ///         var web = new Linode.Instance("web", new Linode.InstanceArgs
    ///         {
    ///             BootConfigLabel = "boot_config",
    ///             Configs = 
    ///             {
    ///                 new Linode.Inputs.InstanceConfigArgs
    ///                 {
    ///                     Devices = new Linode.Inputs.InstanceConfigDevicesArgs
    ///                     {
    ///                         Sda = new Linode.Inputs.InstanceConfigDevicesSdaArgs
    ///                         {
    ///                             DiskLabel = "boot",
    ///                         },
    ///                         Sdb = new Linode.Inputs.InstanceConfigDevicesSdbArgs
    ///                         {
    ///                             VolumeId = webVolume.Id,
    ///                         },
    ///                     },
    ///                     Kernel = "linode/latest-64bit",
    ///                     Label = "boot_config",
    ///                     RootDevice = "/dev/sda",
    ///                 },
    ///             },
    ///             Disks = 
    ///             {
    ///                 new Linode.Inputs.InstanceDiskArgs
    ///                 {
    ///                     AuthorizedKeys = 
    ///                     {
    ///                         "ssh-rsa AAAA...Gw== user@example.local",
    ///                     },
    ///                     AuthorizedUsers = 
    ///                     {
    ///                         me.Apply(me =&gt; me.Username),
    ///                     },
    ///                     Image = "linode/ubuntu18.04",
    ///                     Label = "boot",
    ///                     RootPass = "terr4form-test",
    ///                     Size = 3000,
    ///                 },
    ///             },
    ///             Group = "foo",
    ///             Label = "complex_instance",
    ///             PrivateIp = true,
    ///             Region = "us-central",
    ///             Tags = 
    ///             {
    ///                 "foo",
    ///             },
    ///             Type = "g6-nanode-1",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// ## Attributes
    /// 
    /// This Linode Instance resource exports the following attributes:
    /// 
    /// * `status` - The status of the instance, indicating the current readiness state. (`running`, `offline`, ...)
    /// 
    /// * `ip_address` - A string containing the Linode's public IP address.
    /// 
    /// * `private_ip_address` - This Linode's Private IPv4 Address, if enabled.  The regional private IP address range, 192.168.128.0/17, is shared by all Linode Instances in a region.
    /// 
    /// * `ipv6` - This Linode's IPv6 SLAAC addresses. This address is specific to a Linode, and may not be shared.  The prefix (`/64`) is included in this attribute.
    /// 
    /// * `ipv4` - This Linode's IPv4 Addresses. Each Linode is assigned a single public IPv4 address upon creation, and may get a single private IPv4 address if needed. You may need to open a support ticket to get additional IPv4 addresses.
    /// 
    /// * `specs.0.disk` -  The amount of storage space, in GB. this Linode has access to. A typical Linode will divide this space between a primary disk with an image deployed to it, and a swap disk, usually 512 MB. This is the default configuration created when deploying a Linode with an image through POST /linode/instances.
    /// 
    /// * `specs.0.memory` - The amount of RAM, in MB, this Linode has access to. Typically a Linode will choose to boot with all of its available RAM, but this can be configured in a Config profile.
    /// 
    /// * `specs.0.vcpus` - The number of vcpus this Linode has access to. Typically a Linode will choose to boot with all of its available vcpus, but this can be configured in a Config Profile.
    /// 
    /// * `specs.0.transfer` - The amount of network transfer this Linode is allotted each month.
    /// 
    /// * `backups` - Information about this Linode's backups status.
    ///   
    ///   * `enabled` - If this Linode has the Backup service enabled.
    ///   
    ///   * `schedule`
    ///     
    ///     * `day` -  The day of the week that your Linode's weekly Backup is taken. If not set manually, a day will be chosen for you. Backups are taken every day, but backups taken on this day are preferred when selecting backups to retain for a longer period.  If not set manually, then when backups are initially enabled, this may come back as "Scheduling" until the day is automatically selected.
    ///     
    ///     * `window` - The window ('W0'-'W22') in which your backups will be taken, in UTC. A backups window is a two-hour span of time in which the backup may occur. For example, 'W10' indicates that your backups should be taken between 10:00 and 12:00. If you do not choose a backup window, one will be selected for you automatically.  If not set manually, when backups are initially enabled this may come back as Scheduling until the window is automatically selected.
    /// 
    /// ## Import
    /// 
    /// Linodes Instances can be imported using the Linode `id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import linode:index/instance:Instance mylinode 1234567
    /// ```
    /// 
    ///  When importing an instance, all `disk` and `config` values must be represented. Imported disks must include their `label` value.
    /// 
    /// **Any disk that is not precisely represented may be removed resulting in data loss.** Imported configs should include all `devices`, and must include `label`, `kernel`, and the `root_device`.
    /// 
    /// The instance must include a `boot_config_label` referring to the correct configuration profile. The Linode Guide, [Import Existing Infrastructure to Terraform](https://www.linode.com/docs/applications/configuration-management/import-existing-infrastructure-to-terraform/), offers resource importing examples for Instances and other Linode resource types.
    /// </summary>
    [LinodeResourceType("linode:index/instance:Instance")]
    public partial class Instance : Pulumi.CustomResource
    {
        [Output("alerts")]
        public Output<Outputs.InstanceAlerts> Alerts { get; private set; } = null!;

        /// <summary>
        /// A list of SSH public keys to deploy for the root user on the newly created Linode. Only accepted if `image` is provided. *This value can not be imported.* *Changing `authorized_keys` forces the creation of a new Linode Instance.*
        /// </summary>
        [Output("authorizedKeys")]
        public Output<ImmutableArray<string>> AuthorizedKeys { get; private set; } = null!;

        /// <summary>
        /// A list of Linode usernames. If the usernames have associated SSH keys, the keys will be appended to the `root` user's `~/.ssh/authorized_keys` file automatically. *This value can not be imported.* *Changing `authorized_users` forces the creation of a new Linode Instance.*
        /// </summary>
        [Output("authorizedUsers")]
        public Output<ImmutableArray<string>> AuthorizedUsers { get; private set; } = null!;

        /// <summary>
        /// A Backup ID from another Linode's available backups. Your User must have read_write access to that Linode, the Backup must have a status of successful, and the Linode must be deployed to the same region as the Backup. See /linode/instances/{linodeId}/backups for a Linode's available backups. This field and the image field are mutually exclusive. *This value can not be imported.* *Changing `backup_id` forces the creation of a new Linode Instance.*
        /// </summary>
        [Output("backupId")]
        public Output<int?> BackupId { get; private set; } = null!;

        /// <summary>
        /// Information about this Linode's backups status.
        /// </summary>
        [Output("backups")]
        public Output<Outputs.InstanceBackups> Backups { get; private set; } = null!;

        /// <summary>
        /// If this field is set to true, the created Linode will automatically be enrolled in the Linode Backup service. This will incur an additional charge. The cost for the Backup service is dependent on the Type of Linode deployed.
        /// </summary>
        [Output("backupsEnabled")]
        public Output<bool> BackupsEnabled { get; private set; } = null!;

        /// <summary>
        /// The Label of the Instance Config that should be used to boot the Linode instance.  If there is only one `config`, the `label` of that `config` will be used as the `boot_config_label`. *This value can not be imported.*
        /// </summary>
        [Output("bootConfigLabel")]
        public Output<string> BootConfigLabel { get; private set; } = null!;

        /// <summary>
        /// Configuration profiles define the VM settings and boot behavior of the Linode Instance.
        /// </summary>
        [Output("configs")]
        public Output<ImmutableArray<Outputs.InstanceConfig>> Configs { get; private set; } = null!;

        [Output("disks")]
        public Output<ImmutableArray<Outputs.InstanceDisk>> Disks { get; private set; } = null!;

        /// <summary>
        /// The display group of the Linode instance.
        /// </summary>
        [Output("group")]
        public Output<string?> Group { get; private set; } = null!;

        /// <summary>
        /// An Image ID to deploy the Disk from. Official Linode Images start with linode/, while your Images start with private/. See /images for more information on the Images available for you to use. Examples are `linode/debian9`, `linode/fedora28`, `linode/ubuntu16.04lts`, `linode/arch`, and `private/12345`. See all images [here](https://api.linode.com/v4/linode/kernels). *Changing `image` forces the creation of a new Linode Instance.*
        /// </summary>
        [Output("image")]
        public Output<string?> Image { get; private set; } = null!;

        /// <summary>
        /// This Linode's Public IPv4 Address. If there are multiple public IPv4 addresses on this Instance, an arbitrary address
        /// will be used for this field.
        /// </summary>
        [Output("ipAddress")]
        public Output<string> IpAddress { get; private set; } = null!;

        /// <summary>
        /// This Linode's IPv4 Addresses. Each Linode is assigned a single public IPv4 address upon creation, and may get a single
        /// private IPv4 address if needed. You may need to open a support ticket to get additional IPv4 addresses.
        /// </summary>
        [Output("ipv4s")]
        public Output<ImmutableArray<string>> Ipv4s { get; private set; } = null!;

        /// <summary>
        /// This Linode's IPv6 SLAAC addresses. This address is specific to a Linode, and may not be shared.
        /// </summary>
        [Output("ipv6")]
        public Output<string> Ipv6 { get; private set; } = null!;

        /// <summary>
        /// The Config's label for display purposes.  Also used by `boot_config_label`.
        /// </summary>
        [Output("label")]
        public Output<string> Label { get; private set; } = null!;

        /// <summary>
        /// If true, the created Linode will have private networking enabled, allowing use of the 192.168.128.0/17 network within the Linode's region. It can be enabled on an existing Linode but it can't be disabled.
        /// </summary>
        [Output("privateIp")]
        public Output<bool?> PrivateIp { get; private set; } = null!;

        /// <summary>
        /// This Linode's Private IPv4 Address. The regional private IP address range is 192.168.128/17 address shared by all Linode
        /// Instances in a region.
        /// </summary>
        [Output("privateIpAddress")]
        public Output<string> PrivateIpAddress { get; private set; } = null!;

        /// <summary>
        /// This is the location where the Linode is deployed. Examples are `"us-east"`, `"us-west"`, `"ap-south"`, etc. See all regions [here](https://api.linode.com/v4/regions). *Changing `region` forces the creation of a new Linode Instance.*.
        /// </summary>
        [Output("region")]
        public Output<string> Region { get; private set; } = null!;

        /// <summary>
        /// The initial password for the `root` user account. *This value can not be imported.* *Changing `root_pass` forces the creation of a new Linode Instance.* *If omitted, a random password will be generated but will not be stored in state.*
        /// </summary>
        [Output("rootPass")]
        public Output<string?> RootPass { get; private set; } = null!;

        [Output("specs")]
        public Output<Outputs.InstanceSpecs> Specs { get; private set; } = null!;

        /// <summary>
        /// An object containing responses to any User Defined Fields present in the StackScript being deployed to this Linode. Only accepted if 'stackscript_id' is given. The required values depend on the StackScript being deployed.  *This value can not be imported.* *Changing `stackscript_data` forces the creation of a new Linode Instance.*
        /// </summary>
        [Output("stackscriptData")]
        public Output<ImmutableDictionary<string, object>?> StackscriptData { get; private set; } = null!;

        /// <summary>
        /// The StackScript to deploy to the newly created Linode. If provided, 'image' must also be provided, and must be an Image that is compatible with this StackScript. *This value can not be imported.* *Changing `stackscript_id` forces the creation of a new Linode Instance.*
        /// </summary>
        [Output("stackscriptId")]
        public Output<int?> StackscriptId { get; private set; } = null!;

        /// <summary>
        /// The status of the instance, indicating the current readiness state.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// When deploying from an Image, this field is optional with a Linode API default of 512mb, otherwise it is ignored. This is used to set the swap disk size for the newly-created Linode.
        /// </summary>
        [Output("swapSize")]
        public Output<int> SwapSize { get; private set; } = null!;

        /// <summary>
        /// A list of tags applied to this object. Tags are for organizational purposes only.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<string>> Tags { get; private set; } = null!;

        /// <summary>
        /// The Linode type defines the pricing, CPU, disk, and RAM specs of the instance. Examples are `"g6-nanode-1"`, `"g6-standard-2"`, `"g6-highmem-16"`, `"g6-dedicated-16"`, etc. See all types [here](https://api.linode.com/v4/linode/types).
        /// </summary>
        [Output("type")]
        public Output<string?> Type { get; private set; } = null!;

        /// <summary>
        /// The watchdog, named Lassie, is a Shutdown Watchdog that monitors your Linode and will reboot it if it powers off unexpectedly. It works by issuing a boot job when your Linode powers off without a shutdown job being responsible. To prevent a loop, Lassie will give up if there have been more than 5 boot jobs issued within 15 minutes.
        /// </summary>
        [Output("watchdogEnabled")]
        public Output<bool?> WatchdogEnabled { get; private set; } = null!;


        /// <summary>
        /// Create a Instance resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Instance(string name, InstanceArgs args, CustomResourceOptions? options = null)
            : base("linode:index/instance:Instance", name, args ?? new InstanceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Instance(string name, Input<string> id, InstanceState? state = null, CustomResourceOptions? options = null)
            : base("linode:index/instance:Instance", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Instance resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Instance Get(string name, Input<string> id, InstanceState? state = null, CustomResourceOptions? options = null)
        {
            return new Instance(name, id, state, options);
        }
    }

    public sealed class InstanceArgs : Pulumi.ResourceArgs
    {
        [Input("alerts")]
        public Input<Inputs.InstanceAlertsArgs>? Alerts { get; set; }

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
        /// A Backup ID from another Linode's available backups. Your User must have read_write access to that Linode, the Backup must have a status of successful, and the Linode must be deployed to the same region as the Backup. See /linode/instances/{linodeId}/backups for a Linode's available backups. This field and the image field are mutually exclusive. *This value can not be imported.* *Changing `backup_id` forces the creation of a new Linode Instance.*
        /// </summary>
        [Input("backupId")]
        public Input<int>? BackupId { get; set; }

        /// <summary>
        /// If this field is set to true, the created Linode will automatically be enrolled in the Linode Backup service. This will incur an additional charge. The cost for the Backup service is dependent on the Type of Linode deployed.
        /// </summary>
        [Input("backupsEnabled")]
        public Input<bool>? BackupsEnabled { get; set; }

        /// <summary>
        /// The Label of the Instance Config that should be used to boot the Linode instance.  If there is only one `config`, the `label` of that `config` will be used as the `boot_config_label`. *This value can not be imported.*
        /// </summary>
        [Input("bootConfigLabel")]
        public Input<string>? BootConfigLabel { get; set; }

        [Input("configs")]
        private InputList<Inputs.InstanceConfigArgs>? _configs;

        /// <summary>
        /// Configuration profiles define the VM settings and boot behavior of the Linode Instance.
        /// </summary>
        public InputList<Inputs.InstanceConfigArgs> Configs
        {
            get => _configs ?? (_configs = new InputList<Inputs.InstanceConfigArgs>());
            set => _configs = value;
        }

        [Input("disks")]
        private InputList<Inputs.InstanceDiskArgs>? _disks;
        public InputList<Inputs.InstanceDiskArgs> Disks
        {
            get => _disks ?? (_disks = new InputList<Inputs.InstanceDiskArgs>());
            set => _disks = value;
        }

        /// <summary>
        /// The display group of the Linode instance.
        /// </summary>
        [Input("group")]
        public Input<string>? Group { get; set; }

        /// <summary>
        /// An Image ID to deploy the Disk from. Official Linode Images start with linode/, while your Images start with private/. See /images for more information on the Images available for you to use. Examples are `linode/debian9`, `linode/fedora28`, `linode/ubuntu16.04lts`, `linode/arch`, and `private/12345`. See all images [here](https://api.linode.com/v4/linode/kernels). *Changing `image` forces the creation of a new Linode Instance.*
        /// </summary>
        [Input("image")]
        public Input<string>? Image { get; set; }

        /// <summary>
        /// The Config's label for display purposes.  Also used by `boot_config_label`.
        /// </summary>
        [Input("label")]
        public Input<string>? Label { get; set; }

        /// <summary>
        /// If true, the created Linode will have private networking enabled, allowing use of the 192.168.128.0/17 network within the Linode's region. It can be enabled on an existing Linode but it can't be disabled.
        /// </summary>
        [Input("privateIp")]
        public Input<bool>? PrivateIp { get; set; }

        /// <summary>
        /// This is the location where the Linode is deployed. Examples are `"us-east"`, `"us-west"`, `"ap-south"`, etc. See all regions [here](https://api.linode.com/v4/regions). *Changing `region` forces the creation of a new Linode Instance.*.
        /// </summary>
        [Input("region", required: true)]
        public Input<string> Region { get; set; } = null!;

        /// <summary>
        /// The initial password for the `root` user account. *This value can not be imported.* *Changing `root_pass` forces the creation of a new Linode Instance.* *If omitted, a random password will be generated but will not be stored in state.*
        /// </summary>
        [Input("rootPass")]
        public Input<string>? RootPass { get; set; }

        [Input("stackscriptData")]
        private InputMap<object>? _stackscriptData;

        /// <summary>
        /// An object containing responses to any User Defined Fields present in the StackScript being deployed to this Linode. Only accepted if 'stackscript_id' is given. The required values depend on the StackScript being deployed.  *This value can not be imported.* *Changing `stackscript_data` forces the creation of a new Linode Instance.*
        /// </summary>
        public InputMap<object> StackscriptData
        {
            get => _stackscriptData ?? (_stackscriptData = new InputMap<object>());
            set => _stackscriptData = value;
        }

        /// <summary>
        /// The StackScript to deploy to the newly created Linode. If provided, 'image' must also be provided, and must be an Image that is compatible with this StackScript. *This value can not be imported.* *Changing `stackscript_id` forces the creation of a new Linode Instance.*
        /// </summary>
        [Input("stackscriptId")]
        public Input<int>? StackscriptId { get; set; }

        /// <summary>
        /// When deploying from an Image, this field is optional with a Linode API default of 512mb, otherwise it is ignored. This is used to set the swap disk size for the newly-created Linode.
        /// </summary>
        [Input("swapSize")]
        public Input<int>? SwapSize { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// A list of tags applied to this object. Tags are for organizational purposes only.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        /// <summary>
        /// The Linode type defines the pricing, CPU, disk, and RAM specs of the instance. Examples are `"g6-nanode-1"`, `"g6-standard-2"`, `"g6-highmem-16"`, `"g6-dedicated-16"`, etc. See all types [here](https://api.linode.com/v4/linode/types).
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// The watchdog, named Lassie, is a Shutdown Watchdog that monitors your Linode and will reboot it if it powers off unexpectedly. It works by issuing a boot job when your Linode powers off without a shutdown job being responsible. To prevent a loop, Lassie will give up if there have been more than 5 boot jobs issued within 15 minutes.
        /// </summary>
        [Input("watchdogEnabled")]
        public Input<bool>? WatchdogEnabled { get; set; }

        public InstanceArgs()
        {
        }
    }

    public sealed class InstanceState : Pulumi.ResourceArgs
    {
        [Input("alerts")]
        public Input<Inputs.InstanceAlertsGetArgs>? Alerts { get; set; }

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
        /// A Backup ID from another Linode's available backups. Your User must have read_write access to that Linode, the Backup must have a status of successful, and the Linode must be deployed to the same region as the Backup. See /linode/instances/{linodeId}/backups for a Linode's available backups. This field and the image field are mutually exclusive. *This value can not be imported.* *Changing `backup_id` forces the creation of a new Linode Instance.*
        /// </summary>
        [Input("backupId")]
        public Input<int>? BackupId { get; set; }

        /// <summary>
        /// Information about this Linode's backups status.
        /// </summary>
        [Input("backups")]
        public Input<Inputs.InstanceBackupsGetArgs>? Backups { get; set; }

        /// <summary>
        /// If this field is set to true, the created Linode will automatically be enrolled in the Linode Backup service. This will incur an additional charge. The cost for the Backup service is dependent on the Type of Linode deployed.
        /// </summary>
        [Input("backupsEnabled")]
        public Input<bool>? BackupsEnabled { get; set; }

        /// <summary>
        /// The Label of the Instance Config that should be used to boot the Linode instance.  If there is only one `config`, the `label` of that `config` will be used as the `boot_config_label`. *This value can not be imported.*
        /// </summary>
        [Input("bootConfigLabel")]
        public Input<string>? BootConfigLabel { get; set; }

        [Input("configs")]
        private InputList<Inputs.InstanceConfigGetArgs>? _configs;

        /// <summary>
        /// Configuration profiles define the VM settings and boot behavior of the Linode Instance.
        /// </summary>
        public InputList<Inputs.InstanceConfigGetArgs> Configs
        {
            get => _configs ?? (_configs = new InputList<Inputs.InstanceConfigGetArgs>());
            set => _configs = value;
        }

        [Input("disks")]
        private InputList<Inputs.InstanceDiskGetArgs>? _disks;
        public InputList<Inputs.InstanceDiskGetArgs> Disks
        {
            get => _disks ?? (_disks = new InputList<Inputs.InstanceDiskGetArgs>());
            set => _disks = value;
        }

        /// <summary>
        /// The display group of the Linode instance.
        /// </summary>
        [Input("group")]
        public Input<string>? Group { get; set; }

        /// <summary>
        /// An Image ID to deploy the Disk from. Official Linode Images start with linode/, while your Images start with private/. See /images for more information on the Images available for you to use. Examples are `linode/debian9`, `linode/fedora28`, `linode/ubuntu16.04lts`, `linode/arch`, and `private/12345`. See all images [here](https://api.linode.com/v4/linode/kernels). *Changing `image` forces the creation of a new Linode Instance.*
        /// </summary>
        [Input("image")]
        public Input<string>? Image { get; set; }

        /// <summary>
        /// This Linode's Public IPv4 Address. If there are multiple public IPv4 addresses on this Instance, an arbitrary address
        /// will be used for this field.
        /// </summary>
        [Input("ipAddress")]
        public Input<string>? IpAddress { get; set; }

        [Input("ipv4s")]
        private InputList<string>? _ipv4s;

        /// <summary>
        /// This Linode's IPv4 Addresses. Each Linode is assigned a single public IPv4 address upon creation, and may get a single
        /// private IPv4 address if needed. You may need to open a support ticket to get additional IPv4 addresses.
        /// </summary>
        public InputList<string> Ipv4s
        {
            get => _ipv4s ?? (_ipv4s = new InputList<string>());
            set => _ipv4s = value;
        }

        /// <summary>
        /// This Linode's IPv6 SLAAC addresses. This address is specific to a Linode, and may not be shared.
        /// </summary>
        [Input("ipv6")]
        public Input<string>? Ipv6 { get; set; }

        /// <summary>
        /// The Config's label for display purposes.  Also used by `boot_config_label`.
        /// </summary>
        [Input("label")]
        public Input<string>? Label { get; set; }

        /// <summary>
        /// If true, the created Linode will have private networking enabled, allowing use of the 192.168.128.0/17 network within the Linode's region. It can be enabled on an existing Linode but it can't be disabled.
        /// </summary>
        [Input("privateIp")]
        public Input<bool>? PrivateIp { get; set; }

        /// <summary>
        /// This Linode's Private IPv4 Address. The regional private IP address range is 192.168.128/17 address shared by all Linode
        /// Instances in a region.
        /// </summary>
        [Input("privateIpAddress")]
        public Input<string>? PrivateIpAddress { get; set; }

        /// <summary>
        /// This is the location where the Linode is deployed. Examples are `"us-east"`, `"us-west"`, `"ap-south"`, etc. See all regions [here](https://api.linode.com/v4/regions). *Changing `region` forces the creation of a new Linode Instance.*.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// The initial password for the `root` user account. *This value can not be imported.* *Changing `root_pass` forces the creation of a new Linode Instance.* *If omitted, a random password will be generated but will not be stored in state.*
        /// </summary>
        [Input("rootPass")]
        public Input<string>? RootPass { get; set; }

        [Input("specs")]
        public Input<Inputs.InstanceSpecsGetArgs>? Specs { get; set; }

        [Input("stackscriptData")]
        private InputMap<object>? _stackscriptData;

        /// <summary>
        /// An object containing responses to any User Defined Fields present in the StackScript being deployed to this Linode. Only accepted if 'stackscript_id' is given. The required values depend on the StackScript being deployed.  *This value can not be imported.* *Changing `stackscript_data` forces the creation of a new Linode Instance.*
        /// </summary>
        public InputMap<object> StackscriptData
        {
            get => _stackscriptData ?? (_stackscriptData = new InputMap<object>());
            set => _stackscriptData = value;
        }

        /// <summary>
        /// The StackScript to deploy to the newly created Linode. If provided, 'image' must also be provided, and must be an Image that is compatible with this StackScript. *This value can not be imported.* *Changing `stackscript_id` forces the creation of a new Linode Instance.*
        /// </summary>
        [Input("stackscriptId")]
        public Input<int>? StackscriptId { get; set; }

        /// <summary>
        /// The status of the instance, indicating the current readiness state.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// When deploying from an Image, this field is optional with a Linode API default of 512mb, otherwise it is ignored. This is used to set the swap disk size for the newly-created Linode.
        /// </summary>
        [Input("swapSize")]
        public Input<int>? SwapSize { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// A list of tags applied to this object. Tags are for organizational purposes only.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        /// <summary>
        /// The Linode type defines the pricing, CPU, disk, and RAM specs of the instance. Examples are `"g6-nanode-1"`, `"g6-standard-2"`, `"g6-highmem-16"`, `"g6-dedicated-16"`, etc. See all types [here](https://api.linode.com/v4/linode/types).
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// The watchdog, named Lassie, is a Shutdown Watchdog that monitors your Linode and will reboot it if it powers off unexpectedly. It works by issuing a boot job when your Linode powers off without a shutdown job being responsible. To prevent a loop, Lassie will give up if there have been more than 5 boot jobs issued within 15 minutes.
        /// </summary>
        [Input("watchdogEnabled")]
        public Input<bool>? WatchdogEnabled { get; set; }

        public InstanceState()
        {
        }
    }
}
