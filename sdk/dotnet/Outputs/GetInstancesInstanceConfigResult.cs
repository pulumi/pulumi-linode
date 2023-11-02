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
    public sealed class GetInstancesInstanceConfigResult
    {
        /// <summary>
        /// Arbitrary user comments about this `config`.
        /// </summary>
        public readonly string Comments;
        /// <summary>
        /// A list of `disk` or `volume` attachments for this `config`.  If the `boot_config_label` omits a `devices` block, the Linode will not be booted.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetInstancesInstanceConfigDeviceResult> Devices;
        /// <summary>
        /// Helpers enabled when booting to this Linode Config.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetInstancesInstanceConfigHelperResult> Helpers;
        /// <summary>
        /// The ID of the disk in the Linode API.
        /// </summary>
        public readonly int Id;
        public readonly ImmutableArray<Outputs.GetInstancesInstanceConfigInterfaceResult> Interfaces;
        /// <summary>
        /// A Kernel ID to boot a Linode with. Default is based on image choice. Examples are `linode/latest-64bit`, `linode/grub2`, `linode/direct-disk`, etc. See all kernels [here](https://api.linode.com/v4/linode/kernels). Note that this is a paginated API endpoint ([docs](https://developers.linode.com/api/v4/linode-kernels)).
        /// </summary>
        public readonly string Kernel;
        /// <summary>
        /// (Optional) The name of this interface. If the interface is a `vlan`, a label is required. Must be undefined for `public` purpose interfaces.
        /// </summary>
        public readonly string Label;
        /// <summary>
        /// Defaults to the total RAM of the Linode
        /// </summary>
        public readonly int MemoryLimit;
        /// <summary>
        /// The root device to boot.
        /// </summary>
        public readonly string RootDevice;
        /// <summary>
        /// Defines the state of your Linode after booting.
        /// </summary>
        public readonly string RunLevel;
        /// <summary>
        /// Controls the virtualization mode.
        /// </summary>
        public readonly string VirtMode;

        [OutputConstructor]
        private GetInstancesInstanceConfigResult(
            string comments,

            ImmutableArray<Outputs.GetInstancesInstanceConfigDeviceResult> devices,

            ImmutableArray<Outputs.GetInstancesInstanceConfigHelperResult> helpers,

            int id,

            ImmutableArray<Outputs.GetInstancesInstanceConfigInterfaceResult> interfaces,

            string kernel,

            string label,

            int memoryLimit,

            string rootDevice,

            string runLevel,

            string virtMode)
        {
            Comments = comments;
            Devices = devices;
            Helpers = helpers;
            Id = id;
            Interfaces = interfaces;
            Kernel = kernel;
            Label = label;
            MemoryLimit = memoryLimit;
            RootDevice = rootDevice;
            RunLevel = runLevel;
            VirtMode = virtMode;
        }
    }
}
