// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode
{
    /// <summary>
    /// Manages allocation of reserved IPv4 address in a region and optionally assigning the reserved address to a Linode instance.
    /// 
    /// For more information, see the corresponding [API documentation](https://techdocs.akamai.com/linode-api/reference/post-allocate-ip).
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Linode = Pulumi.Linode;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var testIp = new Linode.NetworkingIp("test_ip", new()
    ///     {
    ///         Type = "ipv4",
    ///         LinodeId = 12345,
    ///         Public = true,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// IP addresses can be imported using the IP address ID, e.g.
    /// 
    /// ```sh
    /// $ pulumi import linode:index/networkingIp:NetworkingIp example_ip 172.104.30.209
    /// ```
    /// </summary>
    [LinodeResourceType("linode:index/networkingIp:NetworkingIp")]
    public partial class NetworkingIp : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The IPv4 address that is configured as a 1:1 NAT for this VPC interface.
        /// </summary>
        [Output("address")]
        public Output<string> Address { get; private set; } = null!;

        /// <summary>
        /// The default gateway for this address.
        /// </summary>
        [Output("gateway")]
        public Output<string> Gateway { get; private set; } = null!;

        /// <summary>
        /// The ID of the Linode to which the IP address will be assigned. Updating this field on an ephemeral IP will trigger a recreation. Conflicts with `region`.
        /// </summary>
        [Output("linodeId")]
        public Output<int> LinodeId { get; private set; } = null!;

        /// <summary>
        /// The number of bits set in the subnet mask.
        /// </summary>
        [Output("prefix")]
        public Output<int> Prefix { get; private set; } = null!;

        /// <summary>
        /// Whether the IP address is public. Defaults to true.
        /// </summary>
        [Output("public")]
        public Output<bool> Public { get; private set; } = null!;

        /// <summary>
        /// The reverse DNS assigned to this address. For public IPv4 addresses, this will be set to a default value provided by Linode if not explicitly set.
        /// </summary>
        [Output("rdns")]
        public Output<string> Rdns { get; private set; } = null!;

        /// <summary>
        /// The region for the reserved IPv4 address. Required when reserved is true and linode_id is not set.
        /// </summary>
        [Output("region")]
        public Output<string> Region { get; private set; } = null!;

        /// <summary>
        /// Whether the IPv4 address should be reserved.
        /// </summary>
        [Output("reserved")]
        public Output<bool> Reserved { get; private set; } = null!;

        /// <summary>
        /// The mask that separates host bits from network bits for this address.
        /// </summary>
        [Output("subnetMask")]
        public Output<string> SubnetMask { get; private set; } = null!;

        /// <summary>
        /// The type of IP address. (ipv4, ipv6, etc.)
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        /// <summary>
        /// Contains information about the NAT 1:1 mapping of a public IP address to a VPC subnet.
        /// </summary>
        [Output("vpcNat11")]
        public Output<Outputs.NetworkingIpVpcNat11> VpcNat11 { get; private set; } = null!;


        /// <summary>
        /// Create a NetworkingIp resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public NetworkingIp(string name, NetworkingIpArgs? args = null, CustomResourceOptions? options = null)
            : base("linode:index/networkingIp:NetworkingIp", name, args ?? new NetworkingIpArgs(), MakeResourceOptions(options, ""))
        {
        }

        private NetworkingIp(string name, Input<string> id, NetworkingIpState? state = null, CustomResourceOptions? options = null)
            : base("linode:index/networkingIp:NetworkingIp", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing NetworkingIp resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static NetworkingIp Get(string name, Input<string> id, NetworkingIpState? state = null, CustomResourceOptions? options = null)
        {
            return new NetworkingIp(name, id, state, options);
        }
    }

    public sealed class NetworkingIpArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Linode to which the IP address will be assigned. Updating this field on an ephemeral IP will trigger a recreation. Conflicts with `region`.
        /// </summary>
        [Input("linodeId")]
        public Input<int>? LinodeId { get; set; }

        /// <summary>
        /// Whether the IP address is public. Defaults to true.
        /// </summary>
        [Input("public")]
        public Input<bool>? Public { get; set; }

        /// <summary>
        /// The region for the reserved IPv4 address. Required when reserved is true and linode_id is not set.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// Whether the IPv4 address should be reserved.
        /// </summary>
        [Input("reserved")]
        public Input<bool>? Reserved { get; set; }

        /// <summary>
        /// The type of IP address. (ipv4, ipv6, etc.)
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public NetworkingIpArgs()
        {
        }
        public static new NetworkingIpArgs Empty => new NetworkingIpArgs();
    }

    public sealed class NetworkingIpState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The IPv4 address that is configured as a 1:1 NAT for this VPC interface.
        /// </summary>
        [Input("address")]
        public Input<string>? Address { get; set; }

        /// <summary>
        /// The default gateway for this address.
        /// </summary>
        [Input("gateway")]
        public Input<string>? Gateway { get; set; }

        /// <summary>
        /// The ID of the Linode to which the IP address will be assigned. Updating this field on an ephemeral IP will trigger a recreation. Conflicts with `region`.
        /// </summary>
        [Input("linodeId")]
        public Input<int>? LinodeId { get; set; }

        /// <summary>
        /// The number of bits set in the subnet mask.
        /// </summary>
        [Input("prefix")]
        public Input<int>? Prefix { get; set; }

        /// <summary>
        /// Whether the IP address is public. Defaults to true.
        /// </summary>
        [Input("public")]
        public Input<bool>? Public { get; set; }

        /// <summary>
        /// The reverse DNS assigned to this address. For public IPv4 addresses, this will be set to a default value provided by Linode if not explicitly set.
        /// </summary>
        [Input("rdns")]
        public Input<string>? Rdns { get; set; }

        /// <summary>
        /// The region for the reserved IPv4 address. Required when reserved is true and linode_id is not set.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// Whether the IPv4 address should be reserved.
        /// </summary>
        [Input("reserved")]
        public Input<bool>? Reserved { get; set; }

        /// <summary>
        /// The mask that separates host bits from network bits for this address.
        /// </summary>
        [Input("subnetMask")]
        public Input<string>? SubnetMask { get; set; }

        /// <summary>
        /// The type of IP address. (ipv4, ipv6, etc.)
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// Contains information about the NAT 1:1 mapping of a public IP address to a VPC subnet.
        /// </summary>
        [Input("vpcNat11")]
        public Input<Inputs.NetworkingIpVpcNat11GetArgs>? VpcNat11 { get; set; }

        public NetworkingIpState()
        {
        }
        public static new NetworkingIpState Empty => new NetworkingIpState();
    }
}
