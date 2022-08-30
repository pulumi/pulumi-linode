// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode
{
    public static class GetObjectStorageCluster
    {
        /// <summary>
        /// Provides information about a Linode Object Storage Cluster
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// The following example shows how one might use this data source to access information about a Linode Object Storage Cluster.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var primary = Linode.GetObjectStorageCluster.Invoke(new()
        ///     {
        ///         Id = "us-east-1",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetObjectStorageClusterResult> InvokeAsync(GetObjectStorageClusterArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetObjectStorageClusterResult>("linode:index/getObjectStorageCluster:getObjectStorageCluster", args ?? new GetObjectStorageClusterArgs(), options.WithDefaults());

        /// <summary>
        /// Provides information about a Linode Object Storage Cluster
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// The following example shows how one might use this data source to access information about a Linode Object Storage Cluster.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var primary = Linode.GetObjectStorageCluster.Invoke(new()
        ///     {
        ///         Id = "us-east-1",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetObjectStorageClusterResult> Invoke(GetObjectStorageClusterInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetObjectStorageClusterResult>("linode:index/getObjectStorageCluster:getObjectStorageCluster", args ?? new GetObjectStorageClusterInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetObjectStorageClusterArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The base URL for this cluster.
        /// </summary>
        [Input("domain")]
        public string? Domain { get; set; }

        /// <summary>
        /// The unique ID of this cluster.
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        /// <summary>
        /// The region this cluster is located in. See all regions [here](https://api.linode.com/v4/regions).
        /// </summary>
        [Input("region")]
        public string? Region { get; set; }

        /// <summary>
        /// The base URL for this cluster used when hosting static sites.
        /// </summary>
        [Input("staticSiteDomain")]
        public string? StaticSiteDomain { get; set; }

        /// <summary>
        /// This cluster's status. (`available`, `unavailable`)
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        public GetObjectStorageClusterArgs()
        {
        }
        public static new GetObjectStorageClusterArgs Empty => new GetObjectStorageClusterArgs();
    }

    public sealed class GetObjectStorageClusterInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The base URL for this cluster.
        /// </summary>
        [Input("domain")]
        public Input<string>? Domain { get; set; }

        /// <summary>
        /// The unique ID of this cluster.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        /// <summary>
        /// The region this cluster is located in. See all regions [here](https://api.linode.com/v4/regions).
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// The base URL for this cluster used when hosting static sites.
        /// </summary>
        [Input("staticSiteDomain")]
        public Input<string>? StaticSiteDomain { get; set; }

        /// <summary>
        /// This cluster's status. (`available`, `unavailable`)
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public GetObjectStorageClusterInvokeArgs()
        {
        }
        public static new GetObjectStorageClusterInvokeArgs Empty => new GetObjectStorageClusterInvokeArgs();
    }


    [OutputType]
    public sealed class GetObjectStorageClusterResult
    {
        /// <summary>
        /// The base URL for this cluster.
        /// </summary>
        public readonly string Domain;
        public readonly string Id;
        /// <summary>
        /// The region this cluster is located in. See all regions [here](https://api.linode.com/v4/regions).
        /// </summary>
        public readonly string Region;
        /// <summary>
        /// The base URL for this cluster used when hosting static sites.
        /// </summary>
        public readonly string StaticSiteDomain;
        /// <summary>
        /// This cluster's status. (`available`, `unavailable`)
        /// </summary>
        public readonly string Status;

        [OutputConstructor]
        private GetObjectStorageClusterResult(
            string domain,

            string id,

            string region,

            string staticSiteDomain,

            string status)
        {
            Domain = domain;
            Id = id;
            Region = region;
            StaticSiteDomain = staticSiteDomain;
            Status = status;
        }
    }
}
