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
    /// &gt; **NOTICE:** You may need to contact support to increase your instance IP limit before you can allocate additional IPs.
    /// 
    /// &gt; **NOTICE:** This resource will reboot the specified instance following IP allocation.
    /// 
    /// Manages a Linode instance IP.
    /// 
    /// ## Example Usage
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Linode = Pulumi.Linode;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var fooInstance = new Linode.Instance("fooInstance", new()
    ///     {
    ///         Image = "linode/alpine3.19",
    ///         Label = "foobar-test",
    ///         Type = "g6-nanode-1",
    ///         Region = "us-east",
    ///     });
    /// 
    ///     var fooInstanceIp = new Linode.InstanceIp("fooInstanceIp", new()
    ///     {
    ///         LinodeId = fooInstance.Id,
    ///         Public = true,
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// </summary>
    [LinodeResourceType("linode:index/instanceIp:InstanceIp")]
    public partial class InstanceIp : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The resulting IPv4 address.
        /// </summary>
        [Output("address")]
        public Output<string> Address { get; private set; } = null!;

        /// <summary>
        /// If true, the instance will be rebooted to update network interfaces.
        /// </summary>
        [Output("applyImmediately")]
        public Output<bool> ApplyImmediately { get; private set; } = null!;

        /// <summary>
        /// The default gateway for this address
        /// </summary>
        [Output("gateway")]
        public Output<string> Gateway { get; private set; } = null!;

        /// <summary>
        /// The ID of the Linode to allocate an IPv4 address for.
        /// </summary>
        [Output("linodeId")]
        public Output<int> LinodeId { get; private set; } = null!;

        /// <summary>
        /// The number of bits set in the subnet mask.
        /// </summary>
        [Output("prefix")]
        public Output<int> Prefix { get; private set; } = null!;

        /// <summary>
        /// Whether the IPv4 address is public or private. Defaults to true.
        /// </summary>
        [Output("public")]
        public Output<bool> Public { get; private set; } = null!;

        /// <summary>
        /// The reverse DNS assigned to this address.
        /// </summary>
        [Output("rdns")]
        public Output<string> Rdns { get; private set; } = null!;

        /// <summary>
        /// The region this IP resides in.
        /// </summary>
        [Output("region")]
        public Output<string> Region { get; private set; } = null!;

        /// <summary>
        /// The mask that separates host bits from network bits for this address.
        /// </summary>
        [Output("subnetMask")]
        public Output<string> SubnetMask { get; private set; } = null!;

        /// <summary>
        /// The type of IP address. (`ipv4`, `ipv6`, `ipv6/pool`, `ipv6/range`)
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        /// <summary>
        /// Contains information about the NAT 1:1 mapping of a public IP address to a VPC subnet.
        /// </summary>
        [Output("vpcNat11s")]
        public Output<ImmutableArray<Outputs.InstanceIpVpcNat11>> VpcNat11s { get; private set; } = null!;


        /// <summary>
        /// Create a InstanceIp resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public InstanceIp(string name, InstanceIpArgs args, CustomResourceOptions? options = null)
            : base("linode:index/instanceIp:InstanceIp", name, args ?? new InstanceIpArgs(), MakeResourceOptions(options, ""))
        {
        }

        private InstanceIp(string name, Input<string> id, InstanceIpState? state = null, CustomResourceOptions? options = null)
            : base("linode:index/instanceIp:InstanceIp", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing InstanceIp resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static InstanceIp Get(string name, Input<string> id, InstanceIpState? state = null, CustomResourceOptions? options = null)
        {
            return new InstanceIp(name, id, state, options);
        }
    }

    public sealed class InstanceIpArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// If true, the instance will be rebooted to update network interfaces.
        /// </summary>
        [Input("applyImmediately")]
        public Input<bool>? ApplyImmediately { get; set; }

        /// <summary>
        /// The ID of the Linode to allocate an IPv4 address for.
        /// </summary>
        [Input("linodeId", required: true)]
        public Input<int> LinodeId { get; set; } = null!;

        /// <summary>
        /// Whether the IPv4 address is public or private. Defaults to true.
        /// </summary>
        [Input("public")]
        public Input<bool>? Public { get; set; }

        /// <summary>
        /// The reverse DNS assigned to this address.
        /// </summary>
        [Input("rdns")]
        public Input<string>? Rdns { get; set; }

        public InstanceIpArgs()
        {
        }
        public static new InstanceIpArgs Empty => new InstanceIpArgs();
    }

    public sealed class InstanceIpState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The resulting IPv4 address.
        /// </summary>
        [Input("address")]
        public Input<string>? Address { get; set; }

        /// <summary>
        /// If true, the instance will be rebooted to update network interfaces.
        /// </summary>
        [Input("applyImmediately")]
        public Input<bool>? ApplyImmediately { get; set; }

        /// <summary>
        /// The default gateway for this address
        /// </summary>
        [Input("gateway")]
        public Input<string>? Gateway { get; set; }

        /// <summary>
        /// The ID of the Linode to allocate an IPv4 address for.
        /// </summary>
        [Input("linodeId")]
        public Input<int>? LinodeId { get; set; }

        /// <summary>
        /// The number of bits set in the subnet mask.
        /// </summary>
        [Input("prefix")]
        public Input<int>? Prefix { get; set; }

        /// <summary>
        /// Whether the IPv4 address is public or private. Defaults to true.
        /// </summary>
        [Input("public")]
        public Input<bool>? Public { get; set; }

        /// <summary>
        /// The reverse DNS assigned to this address.
        /// </summary>
        [Input("rdns")]
        public Input<string>? Rdns { get; set; }

        /// <summary>
        /// The region this IP resides in.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// The mask that separates host bits from network bits for this address.
        /// </summary>
        [Input("subnetMask")]
        public Input<string>? SubnetMask { get; set; }

        /// <summary>
        /// The type of IP address. (`ipv4`, `ipv6`, `ipv6/pool`, `ipv6/range`)
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        [Input("vpcNat11s")]
        private InputList<Inputs.InstanceIpVpcNat11GetArgs>? _vpcNat11s;

        /// <summary>
        /// Contains information about the NAT 1:1 mapping of a public IP address to a VPC subnet.
        /// </summary>
        public InputList<Inputs.InstanceIpVpcNat11GetArgs> VpcNat11s
        {
            get => _vpcNat11s ?? (_vpcNat11s = new InputList<Inputs.InstanceIpVpcNat11GetArgs>());
            set => _vpcNat11s = value;
        }

        public InstanceIpState()
        {
        }
        public static new InstanceIpState Empty => new InstanceIpState();
    }
}
