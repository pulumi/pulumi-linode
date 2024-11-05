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
    /// ## Example Usage
    /// 
    /// Creating a simple bootable Linode Instance Configuration Profile:
    /// 
    /// ## Import
    /// 
    /// Instance Configs can be imported using the `linode_id` followed by the Instance Config `id` separated by a comma, e.g.
    /// 
    /// ```sh
    /// $ pulumi import linode:index/instanceConfig:InstanceConfig my-config 1234567,7654321
    /// ```
    /// </summary>
    [LinodeResourceType("linode:index/instanceConfig:InstanceConfig")]
    public partial class InstanceConfig : global::Pulumi.CustomResource
    {
        /// <summary>
        /// If true, the Linode will be booted into this config. If another config is booted, the Linode will be rebooted into this config. If false, the Linode will be shutdown only if it is currently booted into this config. If undefined, the config will alter the boot status of the Linode.
        /// </summary>
        [Output("booted")]
        public Output<bool> Booted { get; private set; } = null!;

        /// <summary>
        /// Optional field for arbitrary User comments on this Config.
        /// 
        /// * `devices` - (Optional) A dictionary of device disks to use as a device map in a Linode’s configuration profile.
        /// 
        /// * `helpers` - (Optional) Helpers enabled when booting to this Linode Config.
        /// 
        /// * `interface` - (Optional) An array of Network Interfaces to use for this Configuration Profile.
        /// </summary>
        [Output("comments")]
        public Output<string?> Comments { get; private set; } = null!;

        /// <summary>
        /// Blocks for device disks in a Linode's configuration profile.
        /// </summary>
        [Output("device")]
        public Output<ImmutableArray<Outputs.InstanceConfigDevice>> Device { get; private set; } = null!;

        /// <summary>
        /// A dictionary of device disks to use as a device map in a Linode's configuration profile.
        /// </summary>
        [Output("devices")]
        public Output<Outputs.InstanceConfigDevices> Devices { get; private set; } = null!;

        /// <summary>
        /// Helpers enabled when booting to this Linode Config.
        /// </summary>
        [Output("helpers")]
        public Output<ImmutableArray<Outputs.InstanceConfigHelper>> Helpers { get; private set; } = null!;

        /// <summary>
        /// An array of Network Interfaces to add to this Linode's Configuration Profile.
        /// </summary>
        [Output("interfaces")]
        public Output<ImmutableArray<Outputs.InstanceConfigInterface>> Interfaces { get; private set; } = null!;

        /// <summary>
        /// A Kernel ID to boot a Linode with. Default is `linode/latest-64bit`. Examples are `linode/latest-64bit`, `linode/grub2`, `linode/direct-disk`, etc. See all kernels [here](https://api.linode.com/v4/linode/kernels). Note that this is a paginated API endpoint ([docs](https://techdocs.akamai.com/linode-api/reference/get-kernels)).
        /// </summary>
        [Output("kernel")]
        public Output<string?> Kernel { get; private set; } = null!;

        /// <summary>
        /// The Config’s label for display purposes only.
        /// 
        /// - - -
        /// </summary>
        [Output("label")]
        public Output<string> Label { get; private set; } = null!;

        /// <summary>
        /// The ID of the Linode to create this configuration profile under.
        /// </summary>
        [Output("linodeId")]
        public Output<int> LinodeId { get; private set; } = null!;

        /// <summary>
        /// The memory limit of the Config. Defaults to the total ram of the Linode.
        /// </summary>
        [Output("memoryLimit")]
        public Output<int> MemoryLimit { get; private set; } = null!;

        /// <summary>
        /// The root device to boot. (default `/dev/sda`)
        /// </summary>
        [Output("rootDevice")]
        public Output<string?> RootDevice { get; private set; } = null!;

        /// <summary>
        /// Defines the state of your Linode after booting. (`default`, `single`, `binbash`)
        /// </summary>
        [Output("runLevel")]
        public Output<string?> RunLevel { get; private set; } = null!;

        /// <summary>
        /// Controls the virtualization mode. (`paravirt`, `fullvirt`)
        /// </summary>
        [Output("virtMode")]
        public Output<string?> VirtMode { get; private set; } = null!;


        /// <summary>
        /// Create a InstanceConfig resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public InstanceConfig(string name, InstanceConfigArgs args, CustomResourceOptions? options = null)
            : base("linode:index/instanceConfig:InstanceConfig", name, args ?? new InstanceConfigArgs(), MakeResourceOptions(options, ""))
        {
        }

        private InstanceConfig(string name, Input<string> id, InstanceConfigState? state = null, CustomResourceOptions? options = null)
            : base("linode:index/instanceConfig:InstanceConfig", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing InstanceConfig resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static InstanceConfig Get(string name, Input<string> id, InstanceConfigState? state = null, CustomResourceOptions? options = null)
        {
            return new InstanceConfig(name, id, state, options);
        }
    }

    public sealed class InstanceConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// If true, the Linode will be booted into this config. If another config is booted, the Linode will be rebooted into this config. If false, the Linode will be shutdown only if it is currently booted into this config. If undefined, the config will alter the boot status of the Linode.
        /// </summary>
        [Input("booted")]
        public Input<bool>? Booted { get; set; }

        /// <summary>
        /// Optional field for arbitrary User comments on this Config.
        /// 
        /// * `devices` - (Optional) A dictionary of device disks to use as a device map in a Linode’s configuration profile.
        /// 
        /// * `helpers` - (Optional) Helpers enabled when booting to this Linode Config.
        /// 
        /// * `interface` - (Optional) An array of Network Interfaces to use for this Configuration Profile.
        /// </summary>
        [Input("comments")]
        public Input<string>? Comments { get; set; }

        [Input("device")]
        private InputList<Inputs.InstanceConfigDeviceArgs>? _device;

        /// <summary>
        /// Blocks for device disks in a Linode's configuration profile.
        /// </summary>
        public InputList<Inputs.InstanceConfigDeviceArgs> Device
        {
            get => _device ?? (_device = new InputList<Inputs.InstanceConfigDeviceArgs>());
            set => _device = value;
        }

        /// <summary>
        /// A dictionary of device disks to use as a device map in a Linode's configuration profile.
        /// </summary>
        [Input("devices")]
        public Input<Inputs.InstanceConfigDevicesArgs>? Devices { get; set; }

        [Input("helpers")]
        private InputList<Inputs.InstanceConfigHelperArgs>? _helpers;

        /// <summary>
        /// Helpers enabled when booting to this Linode Config.
        /// </summary>
        public InputList<Inputs.InstanceConfigHelperArgs> Helpers
        {
            get => _helpers ?? (_helpers = new InputList<Inputs.InstanceConfigHelperArgs>());
            set => _helpers = value;
        }

        [Input("interfaces")]
        private InputList<Inputs.InstanceConfigInterfaceArgs>? _interfaces;

        /// <summary>
        /// An array of Network Interfaces to add to this Linode's Configuration Profile.
        /// </summary>
        public InputList<Inputs.InstanceConfigInterfaceArgs> Interfaces
        {
            get => _interfaces ?? (_interfaces = new InputList<Inputs.InstanceConfigInterfaceArgs>());
            set => _interfaces = value;
        }

        /// <summary>
        /// A Kernel ID to boot a Linode with. Default is `linode/latest-64bit`. Examples are `linode/latest-64bit`, `linode/grub2`, `linode/direct-disk`, etc. See all kernels [here](https://api.linode.com/v4/linode/kernels). Note that this is a paginated API endpoint ([docs](https://techdocs.akamai.com/linode-api/reference/get-kernels)).
        /// </summary>
        [Input("kernel")]
        public Input<string>? Kernel { get; set; }

        /// <summary>
        /// The Config’s label for display purposes only.
        /// 
        /// - - -
        /// </summary>
        [Input("label", required: true)]
        public Input<string> Label { get; set; } = null!;

        /// <summary>
        /// The ID of the Linode to create this configuration profile under.
        /// </summary>
        [Input("linodeId", required: true)]
        public Input<int> LinodeId { get; set; } = null!;

        /// <summary>
        /// The memory limit of the Config. Defaults to the total ram of the Linode.
        /// </summary>
        [Input("memoryLimit")]
        public Input<int>? MemoryLimit { get; set; }

        /// <summary>
        /// The root device to boot. (default `/dev/sda`)
        /// </summary>
        [Input("rootDevice")]
        public Input<string>? RootDevice { get; set; }

        /// <summary>
        /// Defines the state of your Linode after booting. (`default`, `single`, `binbash`)
        /// </summary>
        [Input("runLevel")]
        public Input<string>? RunLevel { get; set; }

        /// <summary>
        /// Controls the virtualization mode. (`paravirt`, `fullvirt`)
        /// </summary>
        [Input("virtMode")]
        public Input<string>? VirtMode { get; set; }

        public InstanceConfigArgs()
        {
        }
        public static new InstanceConfigArgs Empty => new InstanceConfigArgs();
    }

    public sealed class InstanceConfigState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// If true, the Linode will be booted into this config. If another config is booted, the Linode will be rebooted into this config. If false, the Linode will be shutdown only if it is currently booted into this config. If undefined, the config will alter the boot status of the Linode.
        /// </summary>
        [Input("booted")]
        public Input<bool>? Booted { get; set; }

        /// <summary>
        /// Optional field for arbitrary User comments on this Config.
        /// 
        /// * `devices` - (Optional) A dictionary of device disks to use as a device map in a Linode’s configuration profile.
        /// 
        /// * `helpers` - (Optional) Helpers enabled when booting to this Linode Config.
        /// 
        /// * `interface` - (Optional) An array of Network Interfaces to use for this Configuration Profile.
        /// </summary>
        [Input("comments")]
        public Input<string>? Comments { get; set; }

        [Input("device")]
        private InputList<Inputs.InstanceConfigDeviceGetArgs>? _device;

        /// <summary>
        /// Blocks for device disks in a Linode's configuration profile.
        /// </summary>
        public InputList<Inputs.InstanceConfigDeviceGetArgs> Device
        {
            get => _device ?? (_device = new InputList<Inputs.InstanceConfigDeviceGetArgs>());
            set => _device = value;
        }

        /// <summary>
        /// A dictionary of device disks to use as a device map in a Linode's configuration profile.
        /// </summary>
        [Input("devices")]
        public Input<Inputs.InstanceConfigDevicesGetArgs>? Devices { get; set; }

        [Input("helpers")]
        private InputList<Inputs.InstanceConfigHelperGetArgs>? _helpers;

        /// <summary>
        /// Helpers enabled when booting to this Linode Config.
        /// </summary>
        public InputList<Inputs.InstanceConfigHelperGetArgs> Helpers
        {
            get => _helpers ?? (_helpers = new InputList<Inputs.InstanceConfigHelperGetArgs>());
            set => _helpers = value;
        }

        [Input("interfaces")]
        private InputList<Inputs.InstanceConfigInterfaceGetArgs>? _interfaces;

        /// <summary>
        /// An array of Network Interfaces to add to this Linode's Configuration Profile.
        /// </summary>
        public InputList<Inputs.InstanceConfigInterfaceGetArgs> Interfaces
        {
            get => _interfaces ?? (_interfaces = new InputList<Inputs.InstanceConfigInterfaceGetArgs>());
            set => _interfaces = value;
        }

        /// <summary>
        /// A Kernel ID to boot a Linode with. Default is `linode/latest-64bit`. Examples are `linode/latest-64bit`, `linode/grub2`, `linode/direct-disk`, etc. See all kernels [here](https://api.linode.com/v4/linode/kernels). Note that this is a paginated API endpoint ([docs](https://techdocs.akamai.com/linode-api/reference/get-kernels)).
        /// </summary>
        [Input("kernel")]
        public Input<string>? Kernel { get; set; }

        /// <summary>
        /// The Config’s label for display purposes only.
        /// 
        /// - - -
        /// </summary>
        [Input("label")]
        public Input<string>? Label { get; set; }

        /// <summary>
        /// The ID of the Linode to create this configuration profile under.
        /// </summary>
        [Input("linodeId")]
        public Input<int>? LinodeId { get; set; }

        /// <summary>
        /// The memory limit of the Config. Defaults to the total ram of the Linode.
        /// </summary>
        [Input("memoryLimit")]
        public Input<int>? MemoryLimit { get; set; }

        /// <summary>
        /// The root device to boot. (default `/dev/sda`)
        /// </summary>
        [Input("rootDevice")]
        public Input<string>? RootDevice { get; set; }

        /// <summary>
        /// Defines the state of your Linode after booting. (`default`, `single`, `binbash`)
        /// </summary>
        [Input("runLevel")]
        public Input<string>? RunLevel { get; set; }

        /// <summary>
        /// Controls the virtualization mode. (`paravirt`, `fullvirt`)
        /// </summary>
        [Input("virtMode")]
        public Input<string>? VirtMode { get; set; }

        public InstanceConfigState()
        {
        }
        public static new InstanceConfigState Empty => new InstanceConfigState();
    }
}
