// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Inputs
{

    public sealed class GetPlacementGroupMigrationsInboundArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the Linode.
        /// </summary>
        [Input("linodeId", required: true)]
        public int LinodeId { get; set; }

        public GetPlacementGroupMigrationsInboundArgs()
        {
        }
        public static new GetPlacementGroupMigrationsInboundArgs Empty => new GetPlacementGroupMigrationsInboundArgs();
    }
}
