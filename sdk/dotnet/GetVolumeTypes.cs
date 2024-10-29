// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode
{
    public static class GetVolumeTypes
    {
        public static Task<GetVolumeTypesResult> InvokeAsync(GetVolumeTypesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetVolumeTypesResult>("linode:index/getVolumeTypes:getVolumeTypes", args ?? new GetVolumeTypesArgs(), options.WithDefaults());

        public static Output<GetVolumeTypesResult> Invoke(GetVolumeTypesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetVolumeTypesResult>("linode:index/getVolumeTypes:getVolumeTypes", args ?? new GetVolumeTypesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetVolumeTypesArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private List<Inputs.GetVolumeTypesFilterArgs>? _filters;
        public List<Inputs.GetVolumeTypesFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetVolumeTypesFilterArgs>());
            set => _filters = value;
        }

        [Input("order")]
        public string? Order { get; set; }

        [Input("orderBy")]
        public string? OrderBy { get; set; }

        [Input("types")]
        private List<Inputs.GetVolumeTypesTypeArgs>? _types;
        public List<Inputs.GetVolumeTypesTypeArgs> Types
        {
            get => _types ?? (_types = new List<Inputs.GetVolumeTypesTypeArgs>());
            set => _types = value;
        }

        public GetVolumeTypesArgs()
        {
        }
        public static new GetVolumeTypesArgs Empty => new GetVolumeTypesArgs();
    }

    public sealed class GetVolumeTypesInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private InputList<Inputs.GetVolumeTypesFilterInputArgs>? _filters;
        public InputList<Inputs.GetVolumeTypesFilterInputArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetVolumeTypesFilterInputArgs>());
            set => _filters = value;
        }

        [Input("order")]
        public Input<string>? Order { get; set; }

        [Input("orderBy")]
        public Input<string>? OrderBy { get; set; }

        [Input("types")]
        private InputList<Inputs.GetVolumeTypesTypeInputArgs>? _types;
        public InputList<Inputs.GetVolumeTypesTypeInputArgs> Types
        {
            get => _types ?? (_types = new InputList<Inputs.GetVolumeTypesTypeInputArgs>());
            set => _types = value;
        }

        public GetVolumeTypesInvokeArgs()
        {
        }
        public static new GetVolumeTypesInvokeArgs Empty => new GetVolumeTypesInvokeArgs();
    }


    [OutputType]
    public sealed class GetVolumeTypesResult
    {
        public readonly ImmutableArray<Outputs.GetVolumeTypesFilterResult> Filters;
        public readonly string Id;
        public readonly string? Order;
        public readonly string? OrderBy;
        public readonly ImmutableArray<Outputs.GetVolumeTypesTypeResult> Types;

        [OutputConstructor]
        private GetVolumeTypesResult(
            ImmutableArray<Outputs.GetVolumeTypesFilterResult> filters,

            string id,

            string? order,

            string? orderBy,

            ImmutableArray<Outputs.GetVolumeTypesTypeResult> types)
        {
            Filters = filters;
            Id = id;
            Order = order;
            OrderBy = orderBy;
            Types = types;
        }
    }
}
