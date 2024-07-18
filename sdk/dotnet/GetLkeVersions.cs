// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode
{
    public static class GetLkeVersions
    {
        /// <summary>
        /// Provides details about the Kubernetes versions available for deployment to a Kubernetes cluster.
        /// For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-lke-versions).
        /// 
        /// ## Example Usage
        /// 
        /// The following example shows how one might use this data source to access information about a Linode LKE Version.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Linode.GetLkeVersions.Invoke();
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetLkeVersionsResult> InvokeAsync(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetLkeVersionsResult>("linode:index/getLkeVersions:getLkeVersions", InvokeArgs.Empty, options.WithDefaults());

        /// <summary>
        /// Provides details about the Kubernetes versions available for deployment to a Kubernetes cluster.
        /// For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-lke-versions).
        /// 
        /// ## Example Usage
        /// 
        /// The following example shows how one might use this data source to access information about a Linode LKE Version.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Linode.GetLkeVersions.Invoke();
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetLkeVersionsResult> Invoke(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetLkeVersionsResult>("linode:index/getLkeVersions:getLkeVersions", InvokeArgs.Empty, options.WithDefaults());
    }


    [OutputType]
    public sealed class GetLkeVersionsResult
    {
        /// <summary>
        /// The Kubernetes version numbers available for deployment to a Kubernetes cluster in the format of [major].[minor], and the latest supported patch version.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<Outputs.GetLkeVersionsVersionResult> Versions;

        [OutputConstructor]
        private GetLkeVersionsResult(
            string id,

            ImmutableArray<Outputs.GetLkeVersionsVersionResult> versions)
        {
            Id = id;
            Versions = versions;
        }
    }
}
