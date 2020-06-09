// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode
{
    public static class GetDomainRecord
    {
        /// <summary>
        /// Provides information about a Linode Domain Record.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// The following example shows how one might use this data source to access information about a Linode Domain Record.
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var myRecord = Output.Create(Linode.GetDomainRecord.InvokeAsync(new Linode.GetDomainRecordArgs
        ///         {
        ///             DomainId = 3150401,
        ///             Id = 14950401,
        ///         }));
        ///         var myWwwRecord = Output.Create(Linode.GetDomainRecord.InvokeAsync(new Linode.GetDomainRecordArgs
        ///         {
        ///             DomainId = 3150401,
        ///             Name = "www",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// 
        /// {{% /example %}}
        /// {{% /examples %}}
        /// ## Attributes
        /// 
        /// The Linode Volume resource exports the following attributes:
        /// 
        /// - `id` - The unique ID of the Domain Record.
        /// 
        /// - `name` - The name of the Record.
        /// 
        /// - `domain_id` - The associated domain's unique ID.
        /// 
        /// - `type` - The type of Record this is in the DNS system.
        /// 
        /// - `ttl_sec` - The amount of time in seconds that this Domain's records may be cached by resolvers or other domain servers.
        /// 
        /// - `target` - The target for this Record. This field's actual usage depends on the type of record this represents. For A and AAAA records, this is the address the named Domain should resolve to.
        /// 
        /// - `priority` - The priority of the target host. Lower values are preferred.
        /// 
        /// - `weight` - The relative weight of this Record. Higher values are preferred.
        /// 
        /// - `port` - The port this Record points to.
        /// 
        /// - `protocol` - The protocol this Record's service communicates with. Only valid for SRV records.
        /// 
        /// - `service` - The service this Record identified. Only valid for SRV records.
        /// 
        /// - `tag` - The tag portion of a CAA record.
        /// </summary>
        public static Task<GetDomainRecordResult> InvokeAsync(GetDomainRecordArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetDomainRecordResult>("linode:index/getDomainRecord:getDomainRecord", args ?? new GetDomainRecordArgs(), options.WithVersion());
    }


    public sealed class GetDomainRecordArgs : Pulumi.InvokeArgs
    {
        [Input("domainId", required: true)]
        public int DomainId { get; set; }

        [Input("id")]
        public int? Id { get; set; }

        [Input("name")]
        public string? Name { get; set; }

        public GetDomainRecordArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetDomainRecordResult
    {
        public readonly int DomainId;
        public readonly int? Id;
        public readonly string? Name;
        public readonly int Port;
        public readonly int Priority;
        public readonly string Protocol;
        public readonly string Service;
        public readonly string Tag;
        public readonly string Target;
        public readonly int TtlSec;
        public readonly string Type;
        public readonly int Weight;

        [OutputConstructor]
        private GetDomainRecordResult(
            int domainId,

            int? id,

            string? name,

            int port,

            int priority,

            string protocol,

            string service,

            string tag,

            string target,

            int ttlSec,

            string type,

            int weight)
        {
            DomainId = domainId;
            Id = id;
            Name = name;
            Port = port;
            Priority = priority;
            Protocol = protocol;
            Service = service;
            Tag = tag;
            Target = target;
            TtlSec = ttlSec;
            Type = type;
            Weight = weight;
        }
    }
}
