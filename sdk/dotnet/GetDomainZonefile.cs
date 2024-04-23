// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode
{
    public static class GetDomainZonefile
    {
        /// <summary>
        /// Provides information about a Linode Domain Zonefile.
        /// 
        /// ## Example Usage
        /// 
        /// The following example shows how one might use this data source to access information about a Linode Domain Zonefile.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var myZonefile = Linode.GetDomainZonefile.Invoke(new()
        ///     {
        ///         DomainId = 3150401,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetDomainZonefileResult> InvokeAsync(GetDomainZonefileArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDomainZonefileResult>("linode:index/getDomainZonefile:getDomainZonefile", args ?? new GetDomainZonefileArgs(), options.WithDefaults());

        /// <summary>
        /// Provides information about a Linode Domain Zonefile.
        /// 
        /// ## Example Usage
        /// 
        /// The following example shows how one might use this data source to access information about a Linode Domain Zonefile.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var myZonefile = Linode.GetDomainZonefile.Invoke(new()
        ///     {
        ///         DomainId = 3150401,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetDomainZonefileResult> Invoke(GetDomainZonefileInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetDomainZonefileResult>("linode:index/getDomainZonefile:getDomainZonefile", args ?? new GetDomainZonefileInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDomainZonefileArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The associated domain's unique ID.
        /// </summary>
        [Input("domainId", required: true)]
        public int DomainId { get; set; }

        public GetDomainZonefileArgs()
        {
        }
        public static new GetDomainZonefileArgs Empty => new GetDomainZonefileArgs();
    }

    public sealed class GetDomainZonefileInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The associated domain's unique ID.
        /// </summary>
        [Input("domainId", required: true)]
        public Input<int> DomainId { get; set; } = null!;

        public GetDomainZonefileInvokeArgs()
        {
        }
        public static new GetDomainZonefileInvokeArgs Empty => new GetDomainZonefileInvokeArgs();
    }


    [OutputType]
    public sealed class GetDomainZonefileResult
    {
        /// <summary>
        /// The associated domain's unique ID.
        /// </summary>
        public readonly int DomainId;
        public readonly string Id;
        /// <summary>
        /// Array of strings representing the Domain Zonefile.
        /// </summary>
        public readonly ImmutableArray<string> ZoneFiles;

        [OutputConstructor]
        private GetDomainZonefileResult(
            int domainId,

            string id,

            ImmutableArray<string> zoneFiles)
        {
            DomainId = domainId;
            Id = id;
            ZoneFiles = zoneFiles;
        }
    }
}
