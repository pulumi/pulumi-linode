// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Inputs
{

    public sealed class FirewallDeviceGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the underlying entity this device references (i.e. the Linode's ID).
        /// </summary>
        [Input("entityId")]
        public Input<int>? EntityId { get; set; }

        /// <summary>
        /// The ID of the Firewall Device.
        /// </summary>
        [Input("id")]
        public Input<int>? Id { get; set; }

        /// <summary>
        /// Used to identify this rule. For display purposes only.
        /// </summary>
        [Input("label")]
        public Input<string>? Label { get; set; }

        /// <summary>
        /// The type of Firewall Device.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        [Input("url")]
        public Input<string>? Url { get; set; }

        public FirewallDeviceGetArgs()
        {
        }
        public static new FirewallDeviceGetArgs Empty => new FirewallDeviceGetArgs();
    }
}
