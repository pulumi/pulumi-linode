// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Inputs
{

    public sealed class LkeNodePoolNodeArgs : global::Pulumi.ResourceArgs
    {
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        [Input("instanceId", required: true)]
        public Input<int> InstanceId { get; set; } = null!;

        [Input("status", required: true)]
        public Input<string> Status { get; set; } = null!;

        public LkeNodePoolNodeArgs()
        {
        }
        public static new LkeNodePoolNodeArgs Empty => new LkeNodePoolNodeArgs();
    }
}
