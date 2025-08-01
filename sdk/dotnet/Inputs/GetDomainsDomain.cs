// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Inputs
{

    public sealed class GetDomainsDomainArgs : global::Pulumi.InvokeArgs
    {
        [Input("axfrIps", required: true)]
        private List<string>? _axfrIps;

        /// <summary>
        /// The list of IPs that may perform a zone transfer for this Domain.
        /// </summary>
        public List<string> AxfrIps
        {
            get => _axfrIps ?? (_axfrIps = new List<string>());
            set => _axfrIps = value;
        }

        /// <summary>
        /// A description for this Domain.
        /// </summary>
        [Input("description", required: true)]
        public string Description { get; set; } = null!;

        /// <summary>
        /// The domain this Domain represents. These must be unique in our system; you cannot have two Domains representing the same domain
        /// </summary>
        [Input("domain")]
        public string? Domain { get; set; }

        /// <summary>
        /// The amount of time in seconds that may pass before this Domain is no longer authoritative.
        /// </summary>
        [Input("expireSec", required: true)]
        public int ExpireSec { get; set; }

        /// <summary>
        /// The group this Domain belongs to.
        /// </summary>
        [Input("group", required: true)]
        public string Group { get; set; } = null!;

        /// <summary>
        /// The unique ID of this Domain.
        /// </summary>
        [Input("id")]
        public int? Id { get; set; }

        [Input("masterIps", required: true)]
        private List<string>? _masterIps;

        /// <summary>
        /// The IP addresses representing the master DNS for this Domain.
        /// </summary>
        public List<string> MasterIps
        {
            get => _masterIps ?? (_masterIps = new List<string>());
            set => _masterIps = value;
        }

        /// <summary>
        /// The amount of time in seconds before this Domain should be refreshed.
        /// </summary>
        [Input("refreshSec", required: true)]
        public int RefreshSec { get; set; }

        /// <summary>
        /// The interval, in seconds, at which a failed refresh should be retried.
        /// </summary>
        [Input("retrySec", required: true)]
        public int RetrySec { get; set; }

        /// <summary>
        /// Start of Authority email address.
        /// </summary>
        [Input("soaEmail", required: true)]
        public string SoaEmail { get; set; } = null!;

        /// <summary>
        /// Used to control whether this Domain is currently being rendered. (`disabled`, `active`)
        /// </summary>
        [Input("status", required: true)]
        public string Status { get; set; } = null!;

        [Input("tags", required: true)]
        private List<string>? _tags;

        /// <summary>
        /// An array of tags applied to this object. Tags are case-insensitive and are for organizational purposes only.
        /// </summary>
        public List<string> Tags
        {
            get => _tags ?? (_tags = new List<string>());
            set => _tags = value;
        }

        /// <summary>
        /// 'Time to Live'-the amount of time in seconds that this Domain's records may be cached by resolvers or other domain servers.
        /// </summary>
        [Input("ttlSec", required: true)]
        public int TtlSec { get; set; }

        /// <summary>
        /// If this Domain represents the authoritative source of information for the domain it describes, or if it is a read-only copy of a master (also called a slave) (`master`, `slave`)
        /// </summary>
        [Input("type", required: true)]
        public string Type { get; set; } = null!;

        public GetDomainsDomainArgs()
        {
        }
        public static new GetDomainsDomainArgs Empty => new GetDomainsDomainArgs();
    }
}
