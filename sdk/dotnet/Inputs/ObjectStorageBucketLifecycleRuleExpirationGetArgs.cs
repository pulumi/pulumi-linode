// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Inputs
{

    public sealed class ObjectStorageBucketLifecycleRuleExpirationGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the date after which you want the corresponding action to take effect.
        /// </summary>
        [Input("date")]
        public Input<string>? Date { get; set; }

        /// <summary>
        /// Specifies the number of days non-current object versions expire.
        /// </summary>
        [Input("days")]
        public Input<int>? Days { get; set; }

        /// <summary>
        /// On a versioned bucket (versioning-enabled or versioning-suspended bucket), you can add this element in the lifecycle configuration to direct Linode Object Storage to delete expired object delete markers. This cannot be specified with Days or Date in a Lifecycle Expiration Policy.
        /// </summary>
        [Input("expiredObjectDeleteMarker")]
        public Input<bool>? ExpiredObjectDeleteMarker { get; set; }

        public ObjectStorageBucketLifecycleRuleExpirationGetArgs()
        {
        }
        public static new ObjectStorageBucketLifecycleRuleExpirationGetArgs Empty => new ObjectStorageBucketLifecycleRuleExpirationGetArgs();
    }
}
