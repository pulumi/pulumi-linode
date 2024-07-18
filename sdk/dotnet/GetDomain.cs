// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode
{
    public static class GetDomain
    {
        /// <summary>
        /// Provides information about a Linode domain.
        /// For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-domain).
        /// 
        /// ## Example Usage
        /// 
        /// The following example shows how one might use this data source to access information about a Linode domain.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var foo = Linode.GetDomain.Invoke(new()
        ///     {
        ///         Id = 1234567,
        ///     });
        /// 
        ///     var bar = Linode.GetDomain.Invoke(new()
        ///     {
        ///         Domain = "bar.example.com",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetDomainResult> InvokeAsync(GetDomainArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDomainResult>("linode:index/getDomain:getDomain", args ?? new GetDomainArgs(), options.WithDefaults());

        /// <summary>
        /// Provides information about a Linode domain.
        /// For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-domain).
        /// 
        /// ## Example Usage
        /// 
        /// The following example shows how one might use this data source to access information about a Linode domain.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var foo = Linode.GetDomain.Invoke(new()
        ///     {
        ///         Id = 1234567,
        ///     });
        /// 
        ///     var bar = Linode.GetDomain.Invoke(new()
        ///     {
        ///         Domain = "bar.example.com",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetDomainResult> Invoke(GetDomainInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetDomainResult>("linode:index/getDomain:getDomain", args ?? new GetDomainInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDomainArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The unique domain name of the Domain record to query.
        /// </summary>
        [Input("domain")]
        public string? Domain { get; set; }

        /// <summary>
        /// The unique numeric ID of the Domain record to query.
        /// </summary>
        [Input("id")]
        public int? Id { get; set; }

        public GetDomainArgs()
        {
        }
        public static new GetDomainArgs Empty => new GetDomainArgs();
    }

    public sealed class GetDomainInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The unique domain name of the Domain record to query.
        /// </summary>
        [Input("domain")]
        public Input<string>? Domain { get; set; }

        /// <summary>
        /// The unique numeric ID of the Domain record to query.
        /// </summary>
        [Input("id")]
        public Input<int>? Id { get; set; }

        public GetDomainInvokeArgs()
        {
        }
        public static new GetDomainInvokeArgs Empty => new GetDomainInvokeArgs();
    }


    [OutputType]
    public sealed class GetDomainResult
    {
        /// <summary>
        /// The list of IPs that may perform a zone transfer for this Domain.
        /// </summary>
        public readonly ImmutableArray<string> AxfrIps;
        /// <summary>
        /// A description for this Domain.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The domain this Domain represents. These must be unique in our system; you cannot have two Domains representing the same domain
        /// </summary>
        public readonly string? Domain;
        /// <summary>
        /// The amount of time in seconds that may pass before this Domain is no longer authoritative.
        /// </summary>
        public readonly int ExpireSec;
        /// <summary>
        /// The group this Domain belongs to.
        /// </summary>
        public readonly string Group;
        /// <summary>
        /// The unique ID of this Domain.
        /// </summary>
        public readonly int? Id;
        /// <summary>
        /// The IP addresses representing the master DNS for this Domain.
        /// </summary>
        public readonly ImmutableArray<string> MasterIps;
        /// <summary>
        /// The amount of time in seconds before this Domain should be refreshed.
        /// </summary>
        public readonly int RefreshSec;
        /// <summary>
        /// The interval, in seconds, at which a failed refresh should be retried.
        /// </summary>
        public readonly int RetrySec;
        /// <summary>
        /// Start of Authority email address.
        /// </summary>
        public readonly string SoaEmail;
        /// <summary>
        /// Used to control whether this Domain is currently being rendered. (`disabled`, `active`)
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// An array of tags applied to this object. Tags are case-insensitive and are for organizational purposes only.
        /// </summary>
        public readonly ImmutableArray<string> Tags;
        /// <summary>
        /// 'Time to Live'-the amount of time in seconds that this Domain's records may be cached by resolvers or other domain servers.
        /// </summary>
        public readonly int TtlSec;
        /// <summary>
        /// If this Domain represents the authoritative source of information for the domain it describes, or if it is a read-only copy of a master (also called a slave) (`master`, `slave`)
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetDomainResult(
            ImmutableArray<string> axfrIps,

            string description,

            string? domain,

            int expireSec,

            string group,

            int? id,

            ImmutableArray<string> masterIps,

            int refreshSec,

            int retrySec,

            string soaEmail,

            string status,

            ImmutableArray<string> tags,

            int ttlSec,

            string type)
        {
            AxfrIps = axfrIps;
            Description = description;
            Domain = domain;
            ExpireSec = expireSec;
            Group = group;
            Id = id;
            MasterIps = masterIps;
            RefreshSec = refreshSec;
            RetrySec = retrySec;
            SoaEmail = soaEmail;
            Status = status;
            Tags = tags;
            TtlSec = ttlSec;
            Type = type;
        }
    }
}
