// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Outputs
{

    [OutputType]
    public sealed class GetDatabaseMysqlConfigMysqlInnodbRollbackOnTimeoutResult
    {
        public readonly string Description;
        public readonly bool Example;
        public readonly bool RequiresRestart;
        public readonly string Type;

        [OutputConstructor]
        private GetDatabaseMysqlConfigMysqlInnodbRollbackOnTimeoutResult(
            string description,

            bool example,

            bool requiresRestart,

            string type)
        {
            Description = description;
            Example = example;
            RequiresRestart = requiresRestart;
            Type = type;
        }
    }
}
