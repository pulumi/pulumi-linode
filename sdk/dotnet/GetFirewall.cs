// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode
{
    public static class GetFirewall
    {
        /// <summary>
        /// Provides details about a Linode Firewall.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var my_firewall = Output.Create(Linode.GetFirewall.InvokeAsync(new Linode.GetFirewallArgs
        ///         {
        ///             Id = 123,
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetFirewallResult> InvokeAsync(GetFirewallArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetFirewallResult>("linode:index/getFirewall:getFirewall", args ?? new GetFirewallArgs(), options.WithVersion());
    }


    public sealed class GetFirewallArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Firewall's ID.
        /// </summary>
        [Input("id", required: true)]
        public int Id { get; set; }

        public GetFirewallArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetFirewallResult
    {
        public readonly ImmutableArray<Outputs.GetFirewallDeviceResult> Devices;
        /// <summary>
        /// If true, the firewall is inactive.
        /// </summary>
        public readonly bool Disabled;
        /// <summary>
        /// The ID of the Firewall Device.
        /// </summary>
        public readonly int Id;
        /// <summary>
        /// The default behavior for inbound traffic. (`ACCEPT`, `DROP`)
        /// </summary>
        public readonly string InboundPolicy;
        public readonly ImmutableArray<Outputs.GetFirewallInboundResult> Inbounds;
        /// <summary>
        /// The label of the underlying entity this device references.
        /// </summary>
        public readonly string Label;
        /// <summary>
        /// The IDs of Linodes to apply this firewall to.
        /// </summary>
        public readonly ImmutableArray<int> Linodes;
        /// <summary>
        /// The default behavior for outbound traffic. (`ACCEPT`, `DROP`)
        /// </summary>
        public readonly string OutboundPolicy;
        public readonly ImmutableArray<Outputs.GetFirewallOutboundResult> Outbounds;
        /// <summary>
        /// The status of the firewall. (`enabled`, `disabled`, `deleted`)
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// The tags applied to the firewall.
        /// </summary>
        public readonly ImmutableArray<string> Tags;

        [OutputConstructor]
        private GetFirewallResult(
            ImmutableArray<Outputs.GetFirewallDeviceResult> devices,

            bool disabled,

            int id,

            string inboundPolicy,

            ImmutableArray<Outputs.GetFirewallInboundResult> inbounds,

            string label,

            ImmutableArray<int> linodes,

            string outboundPolicy,

            ImmutableArray<Outputs.GetFirewallOutboundResult> outbounds,

            string status,

            ImmutableArray<string> tags)
        {
            Devices = devices;
            Disabled = disabled;
            Id = id;
            InboundPolicy = inboundPolicy;
            Inbounds = inbounds;
            Label = label;
            Linodes = linodes;
            OutboundPolicy = outboundPolicy;
            Outbounds = outbounds;
            Status = status;
            Tags = tags;
        }
    }
}
