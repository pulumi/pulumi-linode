// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode
{
    public static partial class Invokes
    {
        /// <summary>
        /// Provides information about a Linode domain.
        /// 
        /// ## Attributes
        /// 
        /// The Linode Domain resource exports the following attributes:
        /// 
        /// * `id` - The unique ID of this Domain.
        /// 
        /// * `domain` - The domain this Domain represents. These must be unique in our system; you cannot have two Domains representing the same domain
        /// 
        /// * `type` - If this Domain represents the authoritative source of information for the domain it describes, or if it is a read-only copy of a master (also called a slave)
        /// 
        /// * `group` - The group this Domain belongs to.
        /// 
        /// * `status` - Used to control whether this Domain is currently being rendered.
        /// 
        /// * `description` - A description for this Domain.
        /// 
        /// * `master_ips` - The IP addresses representing the master DNS for this Domain.
        /// 
        /// * `axfr_ips` - The list of IPs that may perform a zone transfer for this Domain.
        /// 
        /// * `ttl_sec` - 'Time to Live'-the amount of time in seconds that this Domain's records may be cached by resolvers or other domain servers.
        /// 
        /// * `retry_sec` - The interval, in seconds, at which a failed refresh should be retried.
        /// *
        /// * `expire_sec` - The amount of time in seconds that may pass before this Domain is no longer authoritative.
        /// 
        /// * `refresh_sec` - The amount of time in seconds before this Domain should be refreshed.
        /// 
        /// * `soa_email` - Start of Authority email address.
        /// 
        /// * `tags` - An array of tags applied to this object.
        /// 
        /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-linode/blob/master/website/docs/d/domain.html.markdown.
        /// </summary>
        public static Task<GetDomainResult> GetDomain(GetDomainArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetDomainResult>("linode:index/getDomain:getDomain", args, options.WithVersion());
    }

    public sealed class GetDomainArgs : Pulumi.ResourceArgs
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
        public Input<string>? Id { get; set; }

        public GetDomainArgs()
        {
        }
    }

    [OutputType]
    public sealed class GetDomainResult
    {
        public readonly ImmutableArray<string> AxfrIps;
        public readonly string Description;
        public readonly string? Domain;
        public readonly int ExpireSec;
        public readonly string Group;
        public readonly string? Id;
        public readonly ImmutableArray<string> MasterIps;
        public readonly int RefreshSec;
        public readonly int RetrySec;
        public readonly string SoaEmail;
        public readonly string Status;
        public readonly ImmutableArray<string> Tags;
        public readonly int TtlSec;
        public readonly string Type;

        [OutputConstructor]
        private GetDomainResult(
            ImmutableArray<string> axfrIps,
            string description,
            string? domain,
            int expireSec,
            string group,
            string? id,
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
