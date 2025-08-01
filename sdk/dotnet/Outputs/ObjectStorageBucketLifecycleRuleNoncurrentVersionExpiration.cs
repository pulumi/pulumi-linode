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
    public sealed class ObjectStorageBucketLifecycleRuleNoncurrentVersionExpiration
    {
        /// <summary>
        /// Specifies the number of days non-current object versions expire.
        /// </summary>
        public readonly int Days;

        [OutputConstructor]
        private ObjectStorageBucketLifecycleRuleNoncurrentVersionExpiration(int days)
        {
            Days = days;
        }
    }
}
