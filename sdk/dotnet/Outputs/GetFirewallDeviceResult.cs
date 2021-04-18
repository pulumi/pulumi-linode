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
    public sealed class GetFirewallDeviceResult
    {
        /// <summary>
        /// The ID of the underlying entity this device references (i.e. the Linode's ID).
        /// </summary>
        public readonly int EntityId;
        /// <summary>
        /// The Firewall's ID.
        /// </summary>
        public readonly int Id;
        /// <summary>
        /// The label of the underlying entity this device references.
        /// </summary>
        public readonly string Label;
        /// <summary>
        /// The type of Firewall Device.
        /// </summary>
        public readonly string Type;
        public readonly string Url;

        [OutputConstructor]
        private GetFirewallDeviceResult(
            int entityId,

            int id,

            string label,

            string type,

            string url)
        {
            EntityId = entityId;
            Id = id;
            Label = label;
            Type = type;
            Url = url;
        }
    }
}
