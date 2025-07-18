// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Inputs
{

    public sealed class GetLkeClusterPoolNodeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The LKE Cluster's ID.
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        /// <summary>
        /// The ID of the underlying Linode instance.
        /// </summary>
        [Input("instanceId", required: true)]
        public int InstanceId { get; set; }

        /// <summary>
        /// The status of the node. (`ready`, `not_ready`)
        /// </summary>
        [Input("status", required: true)]
        public string Status { get; set; } = null!;

        public GetLkeClusterPoolNodeArgs()
        {
        }
        public static new GetLkeClusterPoolNodeArgs Empty => new GetLkeClusterPoolNodeArgs();
    }
}
