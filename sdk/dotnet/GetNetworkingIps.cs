// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode
{
    public static class GetNetworkingIps
    {
        public static Task<GetNetworkingIpsResult> InvokeAsync(GetNetworkingIpsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetNetworkingIpsResult>("linode:index/getNetworkingIps:getNetworkingIps", args ?? new GetNetworkingIpsArgs(), options.WithDefaults());

        public static Output<GetNetworkingIpsResult> Invoke(GetNetworkingIpsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetNetworkingIpsResult>("linode:index/getNetworkingIps:getNetworkingIps", args ?? new GetNetworkingIpsInvokeArgs(), options.WithDefaults());

        public static Output<GetNetworkingIpsResult> Invoke(GetNetworkingIpsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetNetworkingIpsResult>("linode:index/getNetworkingIps:getNetworkingIps", args ?? new GetNetworkingIpsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetNetworkingIpsArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private List<Inputs.GetNetworkingIpsFilterArgs>? _filters;
        public List<Inputs.GetNetworkingIpsFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetNetworkingIpsFilterArgs>());
            set => _filters = value;
        }

        [Input("ipAddresses")]
        private List<Inputs.GetNetworkingIpsIpAddressArgs>? _ipAddresses;
        public List<Inputs.GetNetworkingIpsIpAddressArgs> IpAddresses
        {
            get => _ipAddresses ?? (_ipAddresses = new List<Inputs.GetNetworkingIpsIpAddressArgs>());
            set => _ipAddresses = value;
        }

        [Input("order")]
        public string? Order { get; set; }

        [Input("orderBy")]
        public string? OrderBy { get; set; }

        public GetNetworkingIpsArgs()
        {
        }
        public static new GetNetworkingIpsArgs Empty => new GetNetworkingIpsArgs();
    }

    public sealed class GetNetworkingIpsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private InputList<Inputs.GetNetworkingIpsFilterInputArgs>? _filters;
        public InputList<Inputs.GetNetworkingIpsFilterInputArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetNetworkingIpsFilterInputArgs>());
            set => _filters = value;
        }

        [Input("ipAddresses")]
        private InputList<Inputs.GetNetworkingIpsIpAddressInputArgs>? _ipAddresses;
        public InputList<Inputs.GetNetworkingIpsIpAddressInputArgs> IpAddresses
        {
            get => _ipAddresses ?? (_ipAddresses = new InputList<Inputs.GetNetworkingIpsIpAddressInputArgs>());
            set => _ipAddresses = value;
        }

        [Input("order")]
        public Input<string>? Order { get; set; }

        [Input("orderBy")]
        public Input<string>? OrderBy { get; set; }

        public GetNetworkingIpsInvokeArgs()
        {
        }
        public static new GetNetworkingIpsInvokeArgs Empty => new GetNetworkingIpsInvokeArgs();
    }


    [OutputType]
    public sealed class GetNetworkingIpsResult
    {
        public readonly ImmutableArray<Outputs.GetNetworkingIpsFilterResult> Filters;
        public readonly string Id;
        public readonly ImmutableArray<Outputs.GetNetworkingIpsIpAddressResult> IpAddresses;
        public readonly string? Order;
        public readonly string? OrderBy;

        [OutputConstructor]
        private GetNetworkingIpsResult(
            ImmutableArray<Outputs.GetNetworkingIpsFilterResult> filters,

            string id,

            ImmutableArray<Outputs.GetNetworkingIpsIpAddressResult> ipAddresses,

            string? order,

            string? orderBy)
        {
            Filters = filters;
            Id = id;
            IpAddresses = ipAddresses;
            Order = order;
            OrderBy = orderBy;
        }
    }
}
