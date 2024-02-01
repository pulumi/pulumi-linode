// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Inputs
{

    public sealed class InstanceConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Arbitrary user comments about this `config`.
        /// </summary>
        [Input("comments")]
        public Input<string>? Comments { get; set; }

        /// <summary>
        /// A list of `disk` or `volume` attachments for this `config`.  If the `boot_config_label` omits a `devices` block, the Linode will not be booted.
        /// </summary>
        [Input("devices")]
        public Input<Inputs.InstanceConfigDevicesArgs>? Devices { get; set; }

        /// <summary>
        /// Helpers enabled when booting to this Linode Config.
        /// </summary>
        [Input("helpers")]
        public Input<Inputs.InstanceConfigHelpersArgs>? Helpers { get; set; }

        /// <summary>
        /// The ID of the disk in the Linode API.
        /// </summary>
        [Input("id")]
        public Input<int>? Id { get; set; }

        [Input("interfaces")]
        private InputList<Inputs.InstanceConfigInterfaceArgs>? _interfaces;

        /// <summary>
        /// An array of Network Interfaces for this Linode’s Configuration Profile.
        /// </summary>
        public InputList<Inputs.InstanceConfigInterfaceArgs> Interfaces
        {
            get => _interfaces ?? (_interfaces = new InputList<Inputs.InstanceConfigInterfaceArgs>());
            set => _interfaces = value;
        }

        /// <summary>
        /// A Kernel ID to boot a Linode with. Default is based on image choice. Examples are `linode/latest-64bit`, `linode/grub2`, `linode/direct-disk`, etc. See all kernels [here](https://api.linode.com/v4/linode/kernels). Note that this is a paginated API endpoint ([docs](https://developers.linode.com/api/v4/linode-kernels)).
        /// </summary>
        [Input("kernel")]
        public Input<string>? Kernel { get; set; }

        /// <summary>
        /// The Linode's label is for display purposes only. If no label is provided for a Linode, a default will be assigned.
        /// </summary>
        [Input("label", required: true)]
        public Input<string> Label { get; set; } = null!;

        /// <summary>
        /// Defaults to the total RAM of the Linode
        /// 
        /// * `interface` - (Optional) A list of network interfaces to be assigned to the Linode.
        /// </summary>
        [Input("memoryLimit")]
        public Input<int>? MemoryLimit { get; set; }

        /// <summary>
        /// The root device to boot. The corresponding disk must be attached to a `device` slot.  Example: `"/dev/sda"`
        /// </summary>
        [Input("rootDevice")]
        public Input<string>? RootDevice { get; set; }

        /// <summary>
        /// Defines the state of your Linode after booting. Defaults to `"default"`.
        /// </summary>
        [Input("runLevel")]
        public Input<string>? RunLevel { get; set; }

        /// <summary>
        /// Controls the virtualization mode. Defaults to `"paravirt"`.
        /// </summary>
        [Input("virtMode")]
        public Input<string>? VirtMode { get; set; }

        public InstanceConfigArgs()
        {
        }
        public static new InstanceConfigArgs Empty => new InstanceConfigArgs();
    }
}
