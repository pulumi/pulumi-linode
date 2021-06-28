// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Inputs
{

    public sealed class LkeClusterPoolNodeGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the node.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// The ID of the underlying Linode instance.
        /// </summary>
        [Input("instanceId")]
        public Input<int>? InstanceId { get; set; }

        /// <summary>
        /// The status of the node. (`ready`, `not_ready`)
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public LkeClusterPoolNodeGetArgs()
        {
        }
    }
}
