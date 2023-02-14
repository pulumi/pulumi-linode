// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode
{
    public static class GetInstanceNetworking
    {
        /// <summary>
        /// Provides details about the networking configuration of an Instance.
        /// </summary>
        public static Task<GetInstanceNetworkingResult> InvokeAsync(GetInstanceNetworkingArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetInstanceNetworkingResult>("linode:index/getInstanceNetworking:getInstanceNetworking", args ?? new GetInstanceNetworkingArgs(), options.WithDefaults());

        /// <summary>
        /// Provides details about the networking configuration of an Instance.
        /// </summary>
        public static Output<GetInstanceNetworkingResult> Invoke(GetInstanceNetworkingInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetInstanceNetworkingResult>("linode:index/getInstanceNetworking:getInstanceNetworking", args ?? new GetInstanceNetworkingInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetInstanceNetworkingArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Linode instance's ID.
        /// </summary>
        [Input("linodeId", required: true)]
        public int LinodeId { get; set; }

        public GetInstanceNetworkingArgs()
        {
        }
        public static new GetInstanceNetworkingArgs Empty => new GetInstanceNetworkingArgs();
    }

    public sealed class GetInstanceNetworkingInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Linode instance's ID.
        /// </summary>
        [Input("linodeId", required: true)]
        public Input<int> LinodeId { get; set; } = null!;

        public GetInstanceNetworkingInvokeArgs()
        {
        }
        public static new GetInstanceNetworkingInvokeArgs Empty => new GetInstanceNetworkingInvokeArgs();
    }


    [OutputType]
    public sealed class GetInstanceNetworkingResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<Outputs.GetInstanceNetworkingIpv4Result> Ipv4s;
        public readonly ImmutableArray<Outputs.GetInstanceNetworkingIpv6Result> Ipv6s;
        /// <summary>
        /// The ID of the Linode this address currently belongs to.
        /// </summary>
        public readonly int LinodeId;

        [OutputConstructor]
        private GetInstanceNetworkingResult(
            string id,

            ImmutableArray<Outputs.GetInstanceNetworkingIpv4Result> ipv4s,

            ImmutableArray<Outputs.GetInstanceNetworkingIpv6Result> ipv6s,

            int linodeId)
        {
            Id = id;
            Ipv4s = ipv4s;
            Ipv6s = ipv6s;
            LinodeId = linodeId;
        }
    }
}
