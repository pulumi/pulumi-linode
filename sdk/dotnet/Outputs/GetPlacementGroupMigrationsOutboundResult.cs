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
    public sealed class GetPlacementGroupMigrationsOutboundResult
    {
        /// <summary>
        /// The ID of the Linode.
        /// </summary>
        public readonly int LinodeId;

        [OutputConstructor]
        private GetPlacementGroupMigrationsOutboundResult(int linodeId)
        {
            LinodeId = linodeId;
        }
    }
}
