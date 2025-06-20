// *** WARNING: this file was generated by pulumi-language-dotnet. ***
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
        /// For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-ip).
        /// 
        /// ## Example Usage
        /// 
        /// The following example shows how one might use this data source to access information about a Linode Networking IP Address.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
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
        /// </summary>
        public static Task<GetNetworkingIpResult> InvokeAsync(GetNetworkingIpArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetNetworkingIpResult>("linode:index/getNetworkingIp:getNetworkingIp", args ?? new GetNetworkingIpArgs(), options.WithDefaults());

        /// <summary>
        /// Provides information about a Linode Networking IP Address
        /// For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-ip).
        /// 
        /// ## Example Usage
        /// 
        /// The following example shows how one might use this data source to access information about a Linode Networking IP Address.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
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
        /// </summary>
        public static Output<GetNetworkingIpResult> Invoke(GetNetworkingIpInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetNetworkingIpResult>("linode:index/getNetworkingIp:getNetworkingIp", args ?? new GetNetworkingIpInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Provides information about a Linode Networking IP Address
        /// For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-ip).
        /// 
        /// ## Example Usage
        /// 
        /// The following example shows how one might use this data source to access information about a Linode Networking IP Address.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
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
        /// </summary>
        public static Output<GetNetworkingIpResult> Invoke(GetNetworkingIpInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetNetworkingIpResult>("linode:index/getNetworkingIp:getNetworkingIp", args ?? new GetNetworkingIpInvokeArgs(), options.WithDefaults());
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
        /// <summary>
        /// The IPv4 address that is configured as a 1:1 NAT for this VPC interface.
        /// </summary>
        public readonly string Address;
        /// <summary>
        /// The default gateway for this address.
        /// </summary>
        public readonly string Gateway;
        public readonly string Id;
        /// <summary>
        /// The ID of the Linode this address currently belongs to.
        /// </summary>
        public readonly int LinodeId;
        /// <summary>
        /// The number of bits set in the subnet mask.
        /// </summary>
        public readonly int Prefix;
        /// <summary>
        /// Whether this is a public or private IP address.
        /// </summary>
        public readonly bool Public;
        /// <summary>
        /// The reverse DNS assigned to this address. For public IPv4 addresses, this will be set to a default value provided by Linode if not explicitly set.
        /// </summary>
        public readonly string Rdns;
        /// <summary>
        /// The Region this IP address resides in. See all regions [here](https://api.linode.com/v4/regions).
        /// </summary>
        public readonly string Region;
        /// <summary>
        /// Whether this IP address is a reserved IP.
        /// </summary>
        public readonly bool Reserved;
        /// <summary>
        /// The mask that separates host bits from network bits for this address.
        /// </summary>
        public readonly string SubnetMask;
        /// <summary>
        /// The type of address this is (ipv4, ipv6, ipv6/pool, ipv6/range).
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// Contains information about the NAT 1:1 mapping of a public IP address to a VPC subnet.
        /// </summary>
        public readonly Outputs.GetNetworkingIpVpcNat11Result VpcNat11;

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

            bool reserved,

            string subnetMask,

            string type,

            Outputs.GetNetworkingIpVpcNat11Result vpcNat11)
        {
            Address = address;
            Gateway = gateway;
            Id = id;
            LinodeId = linodeId;
            Prefix = prefix;
            Public = @public;
            Rdns = rdns;
            Region = region;
            Reserved = reserved;
            SubnetMask = subnetMask;
            Type = type;
            VpcNat11 = vpcNat11;
        }
    }
}
