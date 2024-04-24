// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Inputs
{

    public sealed class NodeBalancerConfigNodeStatusArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The number of backends considered to be 'DOWN' and unhealthy. These are not in rotation, and not serving requests.
        /// </summary>
        [Input("down", required: true)]
        public Input<int> Down { get; set; } = null!;

        /// <summary>
        /// The number of backends considered to be 'UP' and healthy, and that are serving requests.
        /// </summary>
        [Input("up", required: true)]
        public Input<int> Up { get; set; } = null!;

        public NodeBalancerConfigNodeStatusArgs()
        {
        }
        public static new NodeBalancerConfigNodeStatusArgs Empty => new NodeBalancerConfigNodeStatusArgs();
    }
}
