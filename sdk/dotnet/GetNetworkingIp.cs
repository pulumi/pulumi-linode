// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode
{
    public static class GetNetworkingIp
    {
        /// <summary>
        /// Provides information about a Linode Networking IP Address
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// The following example shows how one might use this data source to access information about a Linode Networking IP Address.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var ns1LinodeCom = Linode.GetNetworkingIp.Invoke(new()
        ///     {
        ///         Address = "162.159.27.72",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// ## Attributes
        /// 
        /// The Linode Network IP Address resource exports the following attributes:
        /// 
        /// * `address` - The IP address.
        /// 
        /// * `gateway` - The default gateway for this address.
        /// 
        /// * `subnet_mask` - The mask that separates host bits from network bits for this address.
        /// 
        /// * `prefix` - The number of bits set in the subnet mask.
        /// 
        /// * `type` - The type of address this is (ipv4, ipv6, ipv6/pool, ipv6/range).
        /// 
        /// * `public` - Whether this is a public or private IP address.
        /// 
        /// * `rdns` - The reverse DNS assigned to this address. For public IPv4 addresses, this will be set to a default value provided by Linode if not explicitly set.
        /// 
        /// * `linode_id` - The ID of the Linode this address currently belongs to.
        /// 
        /// * `region` - The Region this IP address resides in. See all regions [here](https://api.linode.com/v4/regions).
        /// </summary>
        public static Task<GetNetworkingIpResult> InvokeAsync(GetNetworkingIpArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetNetworkingIpResult>("linode:index/getNetworkingIp:getNetworkingIp", args ?? new GetNetworkingIpArgs(), options.WithDefaults());

        /// <summary>
        /// Provides information about a Linode Networking IP Address
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// The following example shows how one might use this data source to access information about a Linode Networking IP Address.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var ns1LinodeCom = Linode.GetNetworkingIp.Invoke(new()
        ///     {
        ///         Address = "162.159.27.72",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// ## Attributes
        /// 
        /// The Linode Network IP Address resource exports the following attributes:
        /// 
        /// * `address` - The IP address.
        /// 
        /// * `gateway` - The default gateway for this address.
        /// 
        /// * `subnet_mask` - The mask that separates host bits from network bits for this address.
        /// 
        /// * `prefix` - The number of bits set in the subnet mask.
        /// 
        /// * `type` - The type of address this is (ipv4, ipv6, ipv6/pool, ipv6/range).
        /// 
        /// * `public` - Whether this is a public or private IP address.
        /// 
        /// * `rdns` - The reverse DNS assigned to this address. For public IPv4 addresses, this will be set to a default value provided by Linode if not explicitly set.
        /// 
        /// * `linode_id` - The ID of the Linode this address currently belongs to.
        /// 
        /// * `region` - The Region this IP address resides in. See all regions [here](https://api.linode.com/v4/regions).
        /// </summary>
        public static Output<GetNetworkingIpResult> Invoke(GetNetworkingIpInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetNetworkingIpResult>("linode:index/getNetworkingIp:getNetworkingIp", args ?? new GetNetworkingIpInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetNetworkingIpArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The IP Address to access.  The address must be associated with the account and a resource that the user has access to view.
        /// </summary>
        [Input("address", required: true)]
        public string Address { get; set; } = null!;

        public GetNetworkingIpArgs()
        {
        }
        public static new GetNetworkingIpArgs Empty => new GetNetworkingIpArgs();
    }

    public sealed class GetNetworkingIpInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The IP Address to access.  The address must be associated with the account and a resource that the user has access to view.
        /// </summary>
        [Input("address", required: true)]
        public Input<string> Address { get; set; } = null!;

        public GetNetworkingIpInvokeArgs()
        {
        }
        public static new GetNetworkingIpInvokeArgs Empty => new GetNetworkingIpInvokeArgs();
    }


    [OutputType]
    public sealed class GetNetworkingIpResult
    {
        public readonly string Address;
        public readonly string Gateway;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly int LinodeId;
        public readonly int Prefix;
        public readonly bool Public;
        public readonly string Rdns;
        public readonly string Region;
        public readonly string SubnetMask;
        public readonly string Type;

        [OutputConstructor]
        private GetNetworkingIpResult(
            string address,

            string gateway,

            string id,

            int linodeId,

            int prefix,

            bool @public,

            string rdns,

            string region,

            string subnetMask,

            string type)
        {
            Address = address;
            Gateway = gateway;
            Id = id;
            LinodeId = linodeId;
            Prefix = prefix;
            Public = @public;
            Rdns = rdns;
            Region = region;
            SubnetMask = subnetMask;
            Type = type;
        }
    }
}
