// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Inputs
{

    public sealed class GetDatabaseEnginesEngineInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Managed Database engine type.
        /// </summary>
        [Input("engine", required: true)]
        public Input<string> Engine { get; set; } = null!;

        /// <summary>
        /// The Managed Database engine ID in engine/version format.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        /// <summary>
        /// The Managed Database engine version.
        /// </summary>
        [Input("version", required: true)]
        public Input<string> Version { get; set; } = null!;

        public GetDatabaseEnginesEngineInputArgs()
        {
        }
        public static new GetDatabaseEnginesEngineInputArgs Empty => new GetDatabaseEnginesEngineInputArgs();
    }
}
