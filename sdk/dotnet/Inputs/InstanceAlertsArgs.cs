// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Inputs
{

    public sealed class InstanceAlertsArgs : Pulumi.ResourceArgs
    {
        [Input("cpu")]
        public Input<int>? Cpu { get; set; }

        [Input("io")]
        public Input<int>? Io { get; set; }

        [Input("networkIn")]
        public Input<int>? NetworkIn { get; set; }

        [Input("networkOut")]
        public Input<int>? NetworkOut { get; set; }

        [Input("transferQuota")]
        public Input<int>? TransferQuota { get; set; }

        public InstanceAlertsArgs()
        {
        }
    }
}
