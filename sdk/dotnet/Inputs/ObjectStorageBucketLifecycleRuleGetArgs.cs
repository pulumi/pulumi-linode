// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Inputs
{

    public sealed class ObjectStorageBucketLifecycleRuleGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the number of days after initiating a multipart upload when the multipart upload must be completed.
        /// </summary>
        [Input("abortIncompleteMultipartUploadDays")]
        public Input<int>? AbortIncompleteMultipartUploadDays { get; set; }

        /// <summary>
        /// Specifies whether the lifecycle rule is active.
        /// </summary>
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        [Input("expiration")]
        public Input<Inputs.ObjectStorageBucketLifecycleRuleExpirationGetArgs>? Expiration { get; set; }

        /// <summary>
        /// The unique identifier for the rule.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        [Input("noncurrentVersionExpiration")]
        public Input<Inputs.ObjectStorageBucketLifecycleRuleNoncurrentVersionExpirationGetArgs>? NoncurrentVersionExpiration { get; set; }

        /// <summary>
        /// The object key prefix identifying one or more objects to which the rule applies.
        /// </summary>
        [Input("prefix")]
        public Input<string>? Prefix { get; set; }

        public ObjectStorageBucketLifecycleRuleGetArgs()
        {
        }
        public static new ObjectStorageBucketLifecycleRuleGetArgs Empty => new ObjectStorageBucketLifecycleRuleGetArgs();
    }
}
