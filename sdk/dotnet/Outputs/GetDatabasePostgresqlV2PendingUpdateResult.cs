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
    public sealed class GetDatabasePostgresqlV2PendingUpdateResult
    {
        public readonly string Deadline;
        public readonly string Description;
        public readonly string PlannedFor;

        [OutputConstructor]
        private GetDatabasePostgresqlV2PendingUpdateResult(
            string deadline,

            string description,

            string plannedFor)
        {
            Deadline = deadline;
            Description = description;
            PlannedFor = plannedFor;
        }
    }
}
