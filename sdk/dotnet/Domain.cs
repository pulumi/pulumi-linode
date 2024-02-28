// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode
{
    /// <summary>
    /// Provides a Linode Domain resource.  This can be used to create, modify, and delete Linode Domains through Linode's managed DNS service.
    /// For more information, see [DNS Manager](https://www.linode.com/docs/platform/manager/dns-manager/) and the [Linode APIv4 docs](https://developers.linode.com/api/v4#operation/createDomain).
    /// 
    /// ## Example Usage
    /// 
    /// The following example shows how one might use this resource to configure a Domain Record attached to a Linode Domain.
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Linode = Pulumi.Linode;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var foobarDomain = new Linode.Domain("foobarDomain", new()
    ///     {
    ///         Type = "master",
    ///         DomainName = "foobar.example",
    ///         SoaEmail = "example@foobar.example",
    ///         Tags = new[]
    ///         {
    ///             "foo",
    ///             "bar",
    ///         },
    ///     });
    /// 
    ///     var foobarDomainRecord = new Linode.DomainRecord("foobarDomainRecord", new()
    ///     {
    ///         DomainId = foobarDomain.Id,
    ///         Name = "www",
    ///         RecordType = "CNAME",
    ///         Target = "foobar.example",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Linodes Domains can be imported using the Linode Domain `id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import linode:index/domain:Domain foobar 1234567
    /// ```
    /// </summary>
    [LinodeResourceType("linode:index/domain:Domain")]
    public partial class Domain : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The list of IPs that may perform a zone transfer for this Domain. This is potentially dangerous, and should be set to an empty list unless you intend to use it.
        /// </summary>
        [Output("axfrIps")]
        public Output<ImmutableArray<string>> AxfrIps { get; private set; } = null!;

        /// <summary>
        /// A description for this Domain. This is for display purposes only.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The domain this Domain represents. These must be unique in our system; you cannot have two Domains representing the same domain.
        /// </summary>
        [Output("domain")]
        public Output<string> DomainName { get; private set; } = null!;

        /// <summary>
        /// The amount of time in seconds that may pass before this Domain is no longer authoritative. Valid values are 0, 30, 120, 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
        /// </summary>
        [Output("expireSec")]
        public Output<int?> ExpireSec { get; private set; } = null!;

        /// <summary>
        /// The group this Domain belongs to. This is for display purposes only.
        /// </summary>
        [Output("group")]
        public Output<string?> Group { get; private set; } = null!;

        /// <summary>
        /// The IP addresses representing the master DNS for this Domain.
        /// 
        /// - - -
        /// </summary>
        [Output("masterIps")]
        public Output<ImmutableArray<string>> MasterIps { get; private set; } = null!;

        /// <summary>
        /// The amount of time in seconds before this Domain should be refreshed. Valid values are 0, 30, 120, 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
        /// </summary>
        [Output("refreshSec")]
        public Output<int?> RefreshSec { get; private set; } = null!;

        /// <summary>
        /// The interval, in seconds, at which a failed refresh should be retried. Valid values are 0, 30, 120, 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
        /// </summary>
        [Output("retrySec")]
        public Output<int?> RetrySec { get; private set; } = null!;

        /// <summary>
        /// Start of Authority email address. This is required for master Domains.
        /// </summary>
        [Output("soaEmail")]
        public Output<string?> SoaEmail { get; private set; } = null!;

        /// <summary>
        /// Used to control whether this Domain is currently being rendered (defaults to "active").
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// A list of tags applied to this object. Tags are case-insensitive and are for organizational purposes only.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<string>> Tags { get; private set; } = null!;

        /// <summary>
        /// 'Time to Live' - the amount of time in seconds that this Domain's records may be cached by resolvers or other domain servers. Valid values are 0, 30, 120, 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
        /// </summary>
        [Output("ttlSec")]
        public Output<int?> TtlSec { get; private set; } = null!;

        /// <summary>
        /// If this Domain represents the authoritative source of information for the domain it describes, or if it is a read-only copy of a master (also called a slave).
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;


        /// <summary>
        /// Create a Domain resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Domain(string name, DomainArgs args, CustomResourceOptions? options = null)
            : base("linode:index/domain:Domain", name, args ?? new DomainArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Domain(string name, Input<string> id, DomainState? state = null, CustomResourceOptions? options = null)
            : base("linode:index/domain:Domain", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Domain resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Domain Get(string name, Input<string> id, DomainState? state = null, CustomResourceOptions? options = null)
        {
            return new Domain(name, id, state, options);
        }
    }

    public sealed class DomainArgs : global::Pulumi.ResourceArgs
    {
        [Input("axfrIps")]
        private InputList<string>? _axfrIps;

        /// <summary>
        /// The list of IPs that may perform a zone transfer for this Domain. This is potentially dangerous, and should be set to an empty list unless you intend to use it.
        /// </summary>
        public InputList<string> AxfrIps
        {
            get => _axfrIps ?? (_axfrIps = new InputList<string>());
            set => _axfrIps = value;
        }

        /// <summary>
        /// A description for this Domain. This is for display purposes only.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The domain this Domain represents. These must be unique in our system; you cannot have two Domains representing the same domain.
        /// </summary>
        [Input("domain", required: true)]
        public Input<string> DomainName { get; set; } = null!;

        /// <summary>
        /// The amount of time in seconds that may pass before this Domain is no longer authoritative. Valid values are 0, 30, 120, 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
        /// </summary>
        [Input("expireSec")]
        public Input<int>? ExpireSec { get; set; }

        /// <summary>
        /// The group this Domain belongs to. This is for display purposes only.
        /// </summary>
        [Input("group")]
        public Input<string>? Group { get; set; }

        [Input("masterIps")]
        private InputList<string>? _masterIps;

        /// <summary>
        /// The IP addresses representing the master DNS for this Domain.
        /// 
        /// - - -
        /// </summary>
        public InputList<string> MasterIps
        {
            get => _masterIps ?? (_masterIps = new InputList<string>());
            set => _masterIps = value;
        }

        /// <summary>
        /// The amount of time in seconds before this Domain should be refreshed. Valid values are 0, 30, 120, 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
        /// </summary>
        [Input("refreshSec")]
        public Input<int>? RefreshSec { get; set; }

        /// <summary>
        /// The interval, in seconds, at which a failed refresh should be retried. Valid values are 0, 30, 120, 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
        /// </summary>
        [Input("retrySec")]
        public Input<int>? RetrySec { get; set; }

        /// <summary>
        /// Start of Authority email address. This is required for master Domains.
        /// </summary>
        [Input("soaEmail")]
        public Input<string>? SoaEmail { get; set; }

        /// <summary>
        /// Used to control whether this Domain is currently being rendered (defaults to "active").
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// A list of tags applied to this object. Tags are case-insensitive and are for organizational purposes only.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        /// <summary>
        /// 'Time to Live' - the amount of time in seconds that this Domain's records may be cached by resolvers or other domain servers. Valid values are 0, 30, 120, 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
        /// </summary>
        [Input("ttlSec")]
        public Input<int>? TtlSec { get; set; }

        /// <summary>
        /// If this Domain represents the authoritative source of information for the domain it describes, or if it is a read-only copy of a master (also called a slave).
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public DomainArgs()
        {
        }
        public static new DomainArgs Empty => new DomainArgs();
    }

    public sealed class DomainState : global::Pulumi.ResourceArgs
    {
        [Input("axfrIps")]
        private InputList<string>? _axfrIps;

        /// <summary>
        /// The list of IPs that may perform a zone transfer for this Domain. This is potentially dangerous, and should be set to an empty list unless you intend to use it.
        /// </summary>
        public InputList<string> AxfrIps
        {
            get => _axfrIps ?? (_axfrIps = new InputList<string>());
            set => _axfrIps = value;
        }

        /// <summary>
        /// A description for this Domain. This is for display purposes only.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The domain this Domain represents. These must be unique in our system; you cannot have two Domains representing the same domain.
        /// </summary>
        [Input("domain")]
        public Input<string>? DomainName { get; set; }

        /// <summary>
        /// The amount of time in seconds that may pass before this Domain is no longer authoritative. Valid values are 0, 30, 120, 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
        /// </summary>
        [Input("expireSec")]
        public Input<int>? ExpireSec { get; set; }

        /// <summary>
        /// The group this Domain belongs to. This is for display purposes only.
        /// </summary>
        [Input("group")]
        public Input<string>? Group { get; set; }

        [Input("masterIps")]
        private InputList<string>? _masterIps;

        /// <summary>
        /// The IP addresses representing the master DNS for this Domain.
        /// 
        /// - - -
        /// </summary>
        public InputList<string> MasterIps
        {
            get => _masterIps ?? (_masterIps = new InputList<string>());
            set => _masterIps = value;
        }

        /// <summary>
        /// The amount of time in seconds before this Domain should be refreshed. Valid values are 0, 30, 120, 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
        /// </summary>
        [Input("refreshSec")]
        public Input<int>? RefreshSec { get; set; }

        /// <summary>
        /// The interval, in seconds, at which a failed refresh should be retried. Valid values are 0, 30, 120, 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
        /// </summary>
        [Input("retrySec")]
        public Input<int>? RetrySec { get; set; }

        /// <summary>
        /// Start of Authority email address. This is required for master Domains.
        /// </summary>
        [Input("soaEmail")]
        public Input<string>? SoaEmail { get; set; }

        /// <summary>
        /// Used to control whether this Domain is currently being rendered (defaults to "active").
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// A list of tags applied to this object. Tags are case-insensitive and are for organizational purposes only.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        /// <summary>
        /// 'Time to Live' - the amount of time in seconds that this Domain's records may be cached by resolvers or other domain servers. Valid values are 0, 30, 120, 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
        /// </summary>
        [Input("ttlSec")]
        public Input<int>? TtlSec { get; set; }

        /// <summary>
        /// If this Domain represents the authoritative source of information for the domain it describes, or if it is a read-only copy of a master (also called a slave).
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public DomainState()
        {
        }
        public static new DomainState Empty => new DomainState();
    }
}
