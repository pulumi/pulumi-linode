// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Inputs
{

    public sealed class DatabasePostgresqlV2PendingUpdateGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("deadline", required: true)]
        public Input<string> Deadline { get; set; } = null!;

        [Input("description", required: true)]
        public Input<string> Description { get; set; } = null!;

        [Input("plannedFor", required: true)]
        public Input<string> PlannedFor { get; set; } = null!;

        public DatabasePostgresqlV2PendingUpdateGetArgs()
        {
        }
        public static new DatabasePostgresqlV2PendingUpdateGetArgs Empty => new DatabasePostgresqlV2PendingUpdateGetArgs();
    }
}
