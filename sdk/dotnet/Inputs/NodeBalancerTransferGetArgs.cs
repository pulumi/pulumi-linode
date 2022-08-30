// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Inputs
{

    public sealed class NodeBalancerTransferGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The total transfer, in MB, used by this NodeBalancer for the current month
        /// </summary>
        [Input("in")]
        public Input<double>? In { get; set; }

        /// <summary>
        /// The total inbound transfer, in MB, used for this NodeBalancer for the current month
        /// </summary>
        [Input("out")]
        public Input<double>? Out { get; set; }

        /// <summary>
        /// The total outbound transfer, in MB, used for this NodeBalancer for the current month
        /// </summary>
        [Input("total")]
        public Input<double>? Total { get; set; }

        public NodeBalancerTransferGetArgs()
        {
        }
        public static new NodeBalancerTransferGetArgs Empty => new NodeBalancerTransferGetArgs();
    }
}
