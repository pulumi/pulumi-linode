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
        /// {{% /examples %}}
        /// ## Attributes
        /// 
        /// The Linode Object Storage Cluster resource exports the following attributes:
        /// 
        /// * `domain` - The base URL for this cluster.
        /// 
        /// * `status` - This cluster's status.
        /// 
        /// * `region` - The region this cluster is located in.
        /// 
        /// * `static_site_domain` - The base URL for this cluster used when hosting static sites.
        /// </summary>
        public static Task<GetObjectStorageClusterResult> InvokeAsync(GetObjectStorageClusterArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetObjectStorageClusterResult>("linode:index/getObjectStorageCluster:getObjectStorageCluster", args ?? new GetObjectStorageClusterArgs(), options.WithVersion());
    }


    public sealed class GetObjectStorageClusterArgs : Pulumi.InvokeArgs
    {
        [Input("domain")]
        public string? Domain { get; set; }

        /// <summary>
        /// The unique ID of this cluster.
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        [Input("region")]
        public string? Region { get; set; }

        [Input("staticSiteDomain")]
        public string? StaticSiteDomain { get; set; }

        [Input("status")]
        public string? Status { get; set; }

        public GetObjectStorageClusterArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetObjectStorageClusterResult
    {
        public readonly string Domain;
        public readonly string Id;
        public readonly string Region;
        public readonly string StaticSiteDomain;
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
