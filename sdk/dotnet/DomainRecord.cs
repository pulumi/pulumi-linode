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
    /// Provides a Linode Domain Record resource.  This can be used to create, modify, and delete Linodes Domain Records.
    /// For more information, see [DNS Manager](https://www.linode.com/docs/platform/manager/dns-manager/) and the [Linode APIv4 docs](https://developers.linode.com/api/v4#operation/createDomainRecord).
    /// 
    /// ## Example Usage
    /// 
    /// The following example shows how one might use this resource to configure a Domain Record attached to a Linode Domain.
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Linode = Pulumi.Linode;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var foobarDomain = new Linode.Domain("foobarDomain", new Linode.DomainArgs
    ///         {
    ///             Type = "master",
    ///             Domain = "foobar.example",
    ///             SoaEmail = "example@foobar.example",
    ///         });
    ///         var foobarDomainRecord = new Linode.DomainRecord("foobarDomainRecord", new Linode.DomainRecordArgs
    ///         {
    ///             DomainId = foobarDomain.Id,
    ///             Name = "www",
    ///             RecordType = "CNAME",
    ///             Target = "foobar.example",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// ## Attributes
    /// 
    /// This resource exports no additional attributes.
    /// 
    /// ## Import
    /// 
    /// Linodes Domain Records can be imported using the Linode Domain `id` followed by the Domain Record `id` separated by a comma, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import linode:index/domainRecord:DomainRecord www-foobar 1234567,7654321
    /// ```
    /// 
    ///  The Linode Guide, [Import Existing Infrastructure to Terraform](https://www.linode.com/docs/applications/configuration-management/import-existing-infrastructure-to-terraform/), offers resource importing examples for Domain Records and other Linode resource types.
    /// </summary>
    [LinodeResourceType("linode:index/domainRecord:DomainRecord")]
    public partial class DomainRecord : Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the Domain to access.  *Changing `domain_id` forces the creation of a new Linode Domain Record.*.
        /// </summary>
        [Output("domainId")]
        public Output<int> DomainId { get; private set; } = null!;

        /// <summary>
        /// The name of this Record. Setting this is invalid for `SRV` records as it is generated by the API. This field's actual usage depends on the type of record this represents. For A and AAAA records, this is the subdomain being associated with an IP address.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The port this Record points to.
        /// </summary>
        [Output("port")]
        public Output<int?> Port { get; private set; } = null!;

        /// <summary>
        /// The priority of the target host. Lower values are preferred.
        /// </summary>
        [Output("priority")]
        public Output<int?> Priority { get; private set; } = null!;

        /// <summary>
        /// The protocol this Record's service communicates with. Only valid for SRV records.
        /// </summary>
        [Output("protocol")]
        public Output<string?> Protocol { get; private set; } = null!;

        /// <summary>
        /// The type of Record this is in the DNS system. For example, A records associate a domain name with an IPv4 address, and AAAA records associate a domain name with an IPv6 address. *Changing `record_type` forces the creation of a new Linode Domain Record.*.
        /// </summary>
        [Output("recordType")]
        public Output<string> RecordType { get; private set; } = null!;

        /// <summary>
        /// The service this Record identified. Only valid for SRV records.
        /// </summary>
        [Output("service")]
        public Output<string?> Service { get; private set; } = null!;

        /// <summary>
        /// The tag portion of a CAA record. It is invalid to set this on other record types.
        /// </summary>
        [Output("tag")]
        public Output<string?> Tag { get; private set; } = null!;

        /// <summary>
        /// The target for this Record. This field's actual usage depends on the type of record this represents. For A and AAAA records, this is the address the named Domain should resolve to.
        /// </summary>
        [Output("target")]
        public Output<string> Target { get; private set; } = null!;

        /// <summary>
        /// 'Time to Live' - the amount of time in seconds that this Domain's records may be cached by resolvers or other domain servers. Valid values are 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
        /// </summary>
        [Output("ttlSec")]
        public Output<int?> TtlSec { get; private set; } = null!;

        /// <summary>
        /// The relative weight of this Record. Higher values are preferred.
        /// </summary>
        [Output("weight")]
        public Output<int?> Weight { get; private set; } = null!;


        /// <summary>
        /// Create a DomainRecord resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DomainRecord(string name, DomainRecordArgs args, CustomResourceOptions? options = null)
            : base("linode:index/domainRecord:DomainRecord", name, args ?? new DomainRecordArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DomainRecord(string name, Input<string> id, DomainRecordState? state = null, CustomResourceOptions? options = null)
            : base("linode:index/domainRecord:DomainRecord", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing DomainRecord resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DomainRecord Get(string name, Input<string> id, DomainRecordState? state = null, CustomResourceOptions? options = null)
        {
            return new DomainRecord(name, id, state, options);
        }
    }

    public sealed class DomainRecordArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Domain to access.  *Changing `domain_id` forces the creation of a new Linode Domain Record.*.
        /// </summary>
        [Input("domainId", required: true)]
        public Input<int> DomainId { get; set; } = null!;

        /// <summary>
        /// The name of this Record. Setting this is invalid for `SRV` records as it is generated by the API. This field's actual usage depends on the type of record this represents. For A and AAAA records, this is the subdomain being associated with an IP address.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The port this Record points to.
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        /// <summary>
        /// The priority of the target host. Lower values are preferred.
        /// </summary>
        [Input("priority")]
        public Input<int>? Priority { get; set; }

        /// <summary>
        /// The protocol this Record's service communicates with. Only valid for SRV records.
        /// </summary>
        [Input("protocol")]
        public Input<string>? Protocol { get; set; }

        /// <summary>
        /// The type of Record this is in the DNS system. For example, A records associate a domain name with an IPv4 address, and AAAA records associate a domain name with an IPv6 address. *Changing `record_type` forces the creation of a new Linode Domain Record.*.
        /// </summary>
        [Input("recordType", required: true)]
        public Input<string> RecordType { get; set; } = null!;

        /// <summary>
        /// The service this Record identified. Only valid for SRV records.
        /// </summary>
        [Input("service")]
        public Input<string>? Service { get; set; }

        /// <summary>
        /// The tag portion of a CAA record. It is invalid to set this on other record types.
        /// </summary>
        [Input("tag")]
        public Input<string>? Tag { get; set; }

        /// <summary>
        /// The target for this Record. This field's actual usage depends on the type of record this represents. For A and AAAA records, this is the address the named Domain should resolve to.
        /// </summary>
        [Input("target", required: true)]
        public Input<string> Target { get; set; } = null!;

        /// <summary>
        /// 'Time to Live' - the amount of time in seconds that this Domain's records may be cached by resolvers or other domain servers. Valid values are 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
        /// </summary>
        [Input("ttlSec")]
        public Input<int>? TtlSec { get; set; }

        /// <summary>
        /// The relative weight of this Record. Higher values are preferred.
        /// </summary>
        [Input("weight")]
        public Input<int>? Weight { get; set; }

        public DomainRecordArgs()
        {
        }
    }

    public sealed class DomainRecordState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Domain to access.  *Changing `domain_id` forces the creation of a new Linode Domain Record.*.
        /// </summary>
        [Input("domainId")]
        public Input<int>? DomainId { get; set; }

        /// <summary>
        /// The name of this Record. Setting this is invalid for `SRV` records as it is generated by the API. This field's actual usage depends on the type of record this represents. For A and AAAA records, this is the subdomain being associated with an IP address.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The port this Record points to.
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        /// <summary>
        /// The priority of the target host. Lower values are preferred.
        /// </summary>
        [Input("priority")]
        public Input<int>? Priority { get; set; }

        /// <summary>
        /// The protocol this Record's service communicates with. Only valid for SRV records.
        /// </summary>
        [Input("protocol")]
        public Input<string>? Protocol { get; set; }

        /// <summary>
        /// The type of Record this is in the DNS system. For example, A records associate a domain name with an IPv4 address, and AAAA records associate a domain name with an IPv6 address. *Changing `record_type` forces the creation of a new Linode Domain Record.*.
        /// </summary>
        [Input("recordType")]
        public Input<string>? RecordType { get; set; }

        /// <summary>
        /// The service this Record identified. Only valid for SRV records.
        /// </summary>
        [Input("service")]
        public Input<string>? Service { get; set; }

        /// <summary>
        /// The tag portion of a CAA record. It is invalid to set this on other record types.
        /// </summary>
        [Input("tag")]
        public Input<string>? Tag { get; set; }

        /// <summary>
        /// The target for this Record. This field's actual usage depends on the type of record this represents. For A and AAAA records, this is the address the named Domain should resolve to.
        /// </summary>
        [Input("target")]
        public Input<string>? Target { get; set; }

        /// <summary>
        /// 'Time to Live' - the amount of time in seconds that this Domain's records may be cached by resolvers or other domain servers. Valid values are 300, 3600, 7200, 14400, 28800, 57600, 86400, 172800, 345600, 604800, 1209600, and 2419200 - any other value will be rounded to the nearest valid value.
        /// </summary>
        [Input("ttlSec")]
        public Input<int>? TtlSec { get; set; }

        /// <summary>
        /// The relative weight of this Record. Higher values are preferred.
        /// </summary>
        [Input("weight")]
        public Input<int>? Weight { get; set; }

        public DomainRecordState()
        {
        }
    }
}
