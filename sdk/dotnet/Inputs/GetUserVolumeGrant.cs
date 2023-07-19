// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Inputs
{

    public sealed class GetUserVolumeGrantArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of entity this grant applies to.
        /// </summary>
        [Input("id", required: true)]
        public int Id { get; set; }

        /// <summary>
        /// The current label of the entity this grant applies to, for display purposes.
        /// </summary>
        [Input("label", required: true)]
        public string Label { get; set; } = null!;

        /// <summary>
        /// The level of access this User has to this entity. If null, this User has no access. (`read_only`, `read_write`)
        /// </summary>
        [Input("permissions", required: true)]
        public string Permissions { get; set; } = null!;

        public GetUserVolumeGrantArgs()
        {
        }
        public static new GetUserVolumeGrantArgs Empty => new GetUserVolumeGrantArgs();
    }
}
