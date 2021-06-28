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
    public sealed class GetLkeClusterPoolResult
    {
        /// <summary>
        /// The number of nodes in the Node Pool.
        /// </summary>
        public readonly int Count;
        /// <summary>
        /// The LKE Cluster's ID.
        /// </summary>
        public readonly int Id;
        /// <summary>
        /// The nodes in the Node Pool.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetLkeClusterPoolNodeResult> Nodes;
        /// <summary>
        /// The linode type for all of the nodes in the Node Pool. See all node types [here](https://api.linode.com/v4/linode/types).
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetLkeClusterPoolResult(
            int count,

            int id,

            ImmutableArray<Outputs.GetLkeClusterPoolNodeResult> nodes,

            string type)
        {
            Count = count;
            Id = id;
            Nodes = nodes;
            Type = type;
        }
    }
}
