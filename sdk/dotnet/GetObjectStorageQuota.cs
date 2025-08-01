// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode
{
    public static class GetObjectStorageQuota
    {
        /// <summary>
        /// Provides details about Object Storage quota information on your account.
        /// For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-object-storage-quota).
        /// 
        /// ## Example Usage
        /// 
        /// The following example shows how one might use this data source to access information about an Object Storage quota.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var myQuota = Linode.GetObjectStorageQuota.Invoke(new()
        ///     {
        ///         QuotaId = "obj-buckets-br-gru-1.linodeobjects.com",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetObjectStorageQuotaResult> InvokeAsync(GetObjectStorageQuotaArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetObjectStorageQuotaResult>("linode:index/getObjectStorageQuota:getObjectStorageQuota", args ?? new GetObjectStorageQuotaArgs(), options.WithDefaults());

        /// <summary>
        /// Provides details about Object Storage quota information on your account.
        /// For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-object-storage-quota).
        /// 
        /// ## Example Usage
        /// 
        /// The following example shows how one might use this data source to access information about an Object Storage quota.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var myQuota = Linode.GetObjectStorageQuota.Invoke(new()
        ///     {
        ///         QuotaId = "obj-buckets-br-gru-1.linodeobjects.com",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetObjectStorageQuotaResult> Invoke(GetObjectStorageQuotaInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetObjectStorageQuotaResult>("linode:index/getObjectStorageQuota:getObjectStorageQuota", args ?? new GetObjectStorageQuotaInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Provides details about Object Storage quota information on your account.
        /// For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-object-storage-quota).
        /// 
        /// ## Example Usage
        /// 
        /// The following example shows how one might use this data source to access information about an Object Storage quota.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var myQuota = Linode.GetObjectStorageQuota.Invoke(new()
        ///     {
        ///         QuotaId = "obj-buckets-br-gru-1.linodeobjects.com",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetObjectStorageQuotaResult> Invoke(GetObjectStorageQuotaInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetObjectStorageQuotaResult>("linode:index/getObjectStorageQuota:getObjectStorageQuota", args ?? new GetObjectStorageQuotaInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetObjectStorageQuotaArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Object Storage quota ID.
        /// </summary>
        [Input("quotaId", required: true)]
        public string QuotaId { get; set; } = null!;

        public GetObjectStorageQuotaArgs()
        {
        }
        public static new GetObjectStorageQuotaArgs Empty => new GetObjectStorageQuotaArgs();
    }

    public sealed class GetObjectStorageQuotaInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Object Storage quota ID.
        /// </summary>
        [Input("quotaId", required: true)]
        public Input<string> QuotaId { get; set; } = null!;

        public GetObjectStorageQuotaInvokeArgs()
        {
        }
        public static new GetObjectStorageQuotaInvokeArgs Empty => new GetObjectStorageQuotaInvokeArgs();
    }


    [OutputType]
    public sealed class GetObjectStorageQuotaResult
    {
        /// <summary>
        /// The description of the Object Storage quota.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The type of the S3 endpoint of the Object Storage.
        /// </summary>
        public readonly string EndpointType;
        /// <summary>
        /// The unique ID of the Object Storage quota data source.
        /// </summary>
        public readonly string Id;
        public readonly string QuotaId;
        /// <summary>
        /// The maximum quantity allowed by the quota.
        /// </summary>
        public readonly int QuotaLimit;
        /// <summary>
        /// The name of the Object Storage quota.
        /// </summary>
        public readonly string QuotaName;
        /// <summary>
        /// The usage data for a specific Object Storage related quota on your account. For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-object-storage-quota-usage).
        /// </summary>
        public readonly Outputs.GetObjectStorageQuotaQuotaUsageResult QuotaUsage;
        /// <summary>
        /// The specific Object Storage resource for the quota.
        /// </summary>
        public readonly string ResourceMetric;
        /// <summary>
        /// The S3 endpoint URL of the Object Storage, based on the `endpoint_type` and `region`.
        /// </summary>
        public readonly string S3Endpoint;

        [OutputConstructor]
        private GetObjectStorageQuotaResult(
            string description,

            string endpointType,

            string id,

            string quotaId,

            int quotaLimit,

            string quotaName,

            Outputs.GetObjectStorageQuotaQuotaUsageResult quotaUsage,

            string resourceMetric,

            string s3Endpoint)
        {
            Description = description;
            EndpointType = endpointType;
            Id = id;
            QuotaId = quotaId;
            QuotaLimit = quotaLimit;
            QuotaName = quotaName;
            QuotaUsage = quotaUsage;
            ResourceMetric = resourceMetric;
            S3Endpoint = s3Endpoint;
        }
    }
}
