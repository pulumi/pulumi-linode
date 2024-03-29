// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Inputs
{

    public sealed class GetLkeClusterPoolAutoscalerInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether autoscaling is enabled for this Node Pool. Defaults to false.
        /// </summary>
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        /// <summary>
        /// The maximum number of nodes to autoscale to.
        /// </summary>
        [Input("max", required: true)]
        public Input<int> Max { get; set; } = null!;

        /// <summary>
        /// The minimum number of nodes to autoscale to.
        /// </summary>
        [Input("min", required: true)]
        public Input<int> Min { get; set; } = null!;

        public GetLkeClusterPoolAutoscalerInputArgs()
        {
        }
        public static new GetLkeClusterPoolAutoscalerInputArgs Empty => new GetLkeClusterPoolAutoscalerInputArgs();
    }
}
