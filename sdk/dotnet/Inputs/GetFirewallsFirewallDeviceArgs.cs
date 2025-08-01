// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Inputs
{

    public sealed class GetFirewallsFirewallDeviceInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the underlying entity this device references (i.e. the Linode's ID).
        /// </summary>
        [Input("entityId", required: true)]
        public Input<int> EntityId { get; set; } = null!;

        /// <summary>
        /// The unique ID assigned to this Firewall.
        /// </summary>
        [Input("id", required: true)]
        public Input<int> Id { get; set; } = null!;

        /// <summary>
        /// The label for the Firewall. For display purposes only. If no label is provided, a default will be assigned.
        /// </summary>
        [Input("label", required: true)]
        public Input<string> Label { get; set; } = null!;

        /// <summary>
        /// The type of Firewall Device.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        /// <summary>
        /// The URL of the underlying entity this device references.
        /// </summary>
        [Input("url", required: true)]
        public Input<string> Url { get; set; } = null!;

        public GetFirewallsFirewallDeviceInputArgs()
        {
        }
        public static new GetFirewallsFirewallDeviceInputArgs Empty => new GetFirewallsFirewallDeviceInputArgs();
    }
}
