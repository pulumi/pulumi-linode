// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Inputs
{

    public sealed class GetUserLinodeGrantArgs : global::Pulumi.InvokeArgs
    {
        [Input("id", required: true)]
        public int Id { get; set; }

        [Input("label", required: true)]
        public string Label { get; set; } = null!;

        [Input("permissions", required: true)]
        public string Permissions { get; set; } = null!;

        public GetUserLinodeGrantArgs()
        {
        }
        public static new GetUserLinodeGrantArgs Empty => new GetUserLinodeGrantArgs();
    }
}
