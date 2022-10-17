// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Inputs
{

    public sealed class InstanceConfigHelperArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Populates the /dev directory early during boot without udev. (default `true`)
        /// </summary>
        [Input("devtmpfsAutomount")]
        public Input<bool>? DevtmpfsAutomount { get; set; }

        /// <summary>
        /// Helps maintain correct inittab/upstart console device. (default `true`)
        /// </summary>
        [Input("distro")]
        public Input<bool>? Distro { get; set; }

        /// <summary>
        /// Creates a modules dependency file for the Kernel you run. (default `true`)
        /// </summary>
        [Input("modulesDep")]
        public Input<bool>? ModulesDep { get; set; }

        /// <summary>
        /// Automatically configures static networking. (default `true`)
        /// </summary>
        [Input("network")]
        public Input<bool>? Network { get; set; }

        /// <summary>
        /// Disables updatedb cron job to avoid disk thrashing. (default `true`)
        /// </summary>
        [Input("updatedbDisabled")]
        public Input<bool>? UpdatedbDisabled { get; set; }

        public InstanceConfigHelperArgs()
        {
        }
        public static new InstanceConfigHelperArgs Empty => new InstanceConfigHelperArgs();
    }
}
