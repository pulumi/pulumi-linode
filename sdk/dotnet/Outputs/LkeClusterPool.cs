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
    public sealed class LkeClusterPool
    {
        /// <summary>
        /// The number of nodes in the Node Pool.
        /// </summary>
        public readonly int Count;
        /// <summary>
        /// The ID of the node.
        /// </summary>
        public readonly int? Id;
        public readonly ImmutableArray<Outputs.LkeClusterPoolNode> Nodes;
        /// <summary>
        /// A Linode Type for all of the nodes in the Node Pool.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private LkeClusterPool(
            int count,

            int? id,

            ImmutableArray<Outputs.LkeClusterPoolNode> nodes,

            string type)
        {
            Count = count;
            Id = id;
            Nodes = nodes;
            Type = type;
        }
    }
}
