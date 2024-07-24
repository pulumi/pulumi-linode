// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode
{
    public static class GetLinodeObjectStorageBucket
    {
        /// <summary>
        /// Provides information about a Linode Object Storage Bucket
        /// For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-object-storage-bucket).
        /// 
        /// ## Example Usage
        /// 
        /// The following example shows how one might use this data source to access information about a Linode Object Storage Bucket.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var my_bucket = Linode.GetLinodeObjectStorageBucket.Invoke(new()
        ///     {
        ///         Label = "my-bucket",
        ///         Region = "us-mia",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetLinodeObjectStorageBucketResult> InvokeAsync(GetLinodeObjectStorageBucketArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetLinodeObjectStorageBucketResult>("linode:index/getLinodeObjectStorageBucket:getLinodeObjectStorageBucket", args ?? new GetLinodeObjectStorageBucketArgs(), options.WithDefaults());

        /// <summary>
        /// Provides information about a Linode Object Storage Bucket
        /// For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-object-storage-bucket).
        /// 
        /// ## Example Usage
        /// 
        /// The following example shows how one might use this data source to access information about a Linode Object Storage Bucket.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var my_bucket = Linode.GetLinodeObjectStorageBucket.Invoke(new()
        ///     {
        ///         Label = "my-bucket",
        ///         Region = "us-mia",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetLinodeObjectStorageBucketResult> Invoke(GetLinodeObjectStorageBucketInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetLinodeObjectStorageBucketResult>("linode:index/getLinodeObjectStorageBucket:getLinodeObjectStorageBucket", args ?? new GetLinodeObjectStorageBucketInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetLinodeObjectStorageBucketArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the Object Storage Cluster this bucket is in. Required if `region` is not configured.
        /// </summary>
        [Input("cluster")]
        public string? Cluster { get; set; }

        /// <summary>
        /// The name of this bucket.
        /// </summary>
        [Input("label", required: true)]
        public string Label { get; set; } = null!;

        /// <summary>
        /// The ID of the region this bucket is in. Required if `cluster` is not configured.
        /// </summary>
        [Input("region")]
        public string? Region { get; set; }

        public GetLinodeObjectStorageBucketArgs()
        {
        }
        public static new GetLinodeObjectStorageBucketArgs Empty => new GetLinodeObjectStorageBucketArgs();
    }

    public sealed class GetLinodeObjectStorageBucketInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the Object Storage Cluster this bucket is in. Required if `region` is not configured.
        /// </summary>
        [Input("cluster")]
        public Input<string>? Cluster { get; set; }

        /// <summary>
        /// The name of this bucket.
        /// </summary>
        [Input("label", required: true)]
        public Input<string> Label { get; set; } = null!;

        /// <summary>
        /// The ID of the region this bucket is in. Required if `cluster` is not configured.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        public GetLinodeObjectStorageBucketInvokeArgs()
        {
        }
        public static new GetLinodeObjectStorageBucketInvokeArgs Empty => new GetLinodeObjectStorageBucketInvokeArgs();
    }


    [OutputType]
    public sealed class GetLinodeObjectStorageBucketResult
    {
        public readonly string Cluster;
        public readonly string Created;
        public readonly string Hostname;
        public readonly string Id;
        public readonly string Label;
        public readonly int Objects;
        public readonly string Region;
        public readonly int Size;

        [OutputConstructor]
        private GetLinodeObjectStorageBucketResult(
            string cluster,

            string created,

            string hostname,

            string id,

            string label,

            int objects,

            string region,

            int size)
        {
            Cluster = cluster;
            Created = created;
            Hostname = hostname;
            Id = id;
            Label = label;
            Objects = objects;
            Region = region;
            Size = size;
        }
    }
}
