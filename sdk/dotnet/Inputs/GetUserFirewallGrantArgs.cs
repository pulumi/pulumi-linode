// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Inputs
{

    public sealed class GetUserFirewallGrantInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("id", required: true)]
        public Input<int> Id { get; set; } = null!;

        [Input("permissions", required: true)]
        public Input<string> Permissions { get; set; } = null!;

        public GetUserFirewallGrantInputArgs()
        {
        }
        public static new GetUserFirewallGrantInputArgs Empty => new GetUserFirewallGrantInputArgs();
    }
}
