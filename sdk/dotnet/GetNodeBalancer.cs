// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode
{
    public static class GetNodeBalancer
    {
        /// <summary>
        /// Provides details about a Linode NodeBalancer.
        /// For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-node-balancer).
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
        ///     var my_nodebalancer = Linode.GetNodeBalancer.Invoke(new()
        ///     {
        ///         Id = 123,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetNodeBalancerResult> InvokeAsync(GetNodeBalancerArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetNodeBalancerResult>("linode:index/getNodeBalancer:getNodeBalancer", args ?? new GetNodeBalancerArgs(), options.WithDefaults());

        /// <summary>
        /// Provides details about a Linode NodeBalancer.
        /// For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-node-balancer).
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
        ///     var my_nodebalancer = Linode.GetNodeBalancer.Invoke(new()
        ///     {
        ///         Id = 123,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetNodeBalancerResult> Invoke(GetNodeBalancerInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetNodeBalancerResult>("linode:index/getNodeBalancer:getNodeBalancer", args ?? new GetNodeBalancerInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Provides details about a Linode NodeBalancer.
        /// For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-node-balancer).
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
        ///     var my_nodebalancer = Linode.GetNodeBalancer.Invoke(new()
        ///     {
        ///         Id = 123,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetNodeBalancerResult> Invoke(GetNodeBalancerInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetNodeBalancerResult>("linode:index/getNodeBalancer:getNodeBalancer", args ?? new GetNodeBalancerInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetNodeBalancerArgs : global::Pulumi.InvokeArgs
    {
        [Input("firewalls")]
        private List<Inputs.GetNodeBalancerFirewallArgs>? _firewalls;
        public List<Inputs.GetNodeBalancerFirewallArgs> Firewalls
        {
            get => _firewalls ?? (_firewalls = new List<Inputs.GetNodeBalancerFirewallArgs>());
            set => _firewalls = value;
        }

        /// <summary>
        /// The NodeBalancer's ID.
        /// </summary>
        [Input("id", required: true)]
        public int Id { get; set; }

        public GetNodeBalancerArgs()
        {
        }
        public static new GetNodeBalancerArgs Empty => new GetNodeBalancerArgs();
    }

    public sealed class GetNodeBalancerInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("firewalls")]
        private InputList<Inputs.GetNodeBalancerFirewallInputArgs>? _firewalls;
        public InputList<Inputs.GetNodeBalancerFirewallInputArgs> Firewalls
        {
            get => _firewalls ?? (_firewalls = new InputList<Inputs.GetNodeBalancerFirewallInputArgs>());
            set => _firewalls = value;
        }

        /// <summary>
        /// The NodeBalancer's ID.
        /// </summary>
        [Input("id", required: true)]
        public Input<int> Id { get; set; } = null!;

        public GetNodeBalancerInvokeArgs()
        {
        }
        public static new GetNodeBalancerInvokeArgs Empty => new GetNodeBalancerInvokeArgs();
    }


    [OutputType]
    public sealed class GetNodeBalancerResult
    {
        /// <summary>
        /// Throttle connections per second (0-20).
        /// </summary>
        public readonly int ClientConnThrottle;
        /// <summary>
        /// Throttle UDP sessions per second (0-20).
        /// </summary>
        public readonly int ClientUdpSessThrottle;
        /// <summary>
        /// When this firewall was created.
        /// </summary>
        public readonly string Created;
        public readonly ImmutableArray<Outputs.GetNodeBalancerFirewallResult> Firewalls;
        /// <summary>
        /// This NodeBalancer's hostname, ending with .ip.linodeusercontent.com
        /// </summary>
        public readonly string Hostname;
        /// <summary>
        /// The Firewall's ID.
        /// </summary>
        public readonly int Id;
        /// <summary>
        /// A list of IPv4 addresses or networks. Must be in IP/mask format.
        /// </summary>
        public readonly string Ipv4;
        /// <summary>
        /// A list of IPv6 addresses or networks. Must be in IP/mask format.
        /// </summary>
        public readonly string Ipv6;
        /// <summary>
        /// Used to identify this rule. For display purposes only.
        /// </summary>
        public readonly string Label;
        /// <summary>
        /// The Region where this Linode NodeBalancer is located. NodeBalancers only support backends in the same Region.
        /// </summary>
        public readonly string Region;
        /// <summary>
        /// The tags applied to the firewall. Tags are case-insensitive and are for organizational purposes only.
        /// </summary>
        public readonly ImmutableArray<string> Tags;
        public readonly ImmutableArray<Outputs.GetNodeBalancerTransferResult> Transfers;
        /// <summary>
        /// When this firewall was last updated.
        /// </summary>
        public readonly string Updated;

        [OutputConstructor]
        private GetNodeBalancerResult(
            int clientConnThrottle,

            int clientUdpSessThrottle,

            string created,

            ImmutableArray<Outputs.GetNodeBalancerFirewallResult> firewalls,

            string hostname,

            int id,

            string ipv4,

            string ipv6,

            string label,

            string region,

            ImmutableArray<string> tags,

            ImmutableArray<Outputs.GetNodeBalancerTransferResult> transfers,

            string updated)
        {
            ClientConnThrottle = clientConnThrottle;
            ClientUdpSessThrottle = clientUdpSessThrottle;
            Created = created;
            Firewalls = firewalls;
            Hostname = hostname;
            Id = id;
            Ipv4 = ipv4;
            Ipv6 = ipv6;
            Label = label;
            Region = region;
            Tags = tags;
            Transfers = transfers;
            Updated = updated;
        }
    }
}
