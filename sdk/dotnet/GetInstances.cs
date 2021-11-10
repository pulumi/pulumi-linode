// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi.Utilities;

namespace Pulumi.Linode
{
    public static class GetInstances
    {
        public static Task<GetInstancesResult> InvokeAsync(GetInstancesArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetInstancesResult>("linode:index/getInstances:getInstances", args ?? new GetInstancesArgs(), options.WithVersion());

        public static Output<GetInstancesResult> Invoke(GetInstancesInvokeArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetInstancesResult>("linode:index/getInstances:getInstances", args ?? new GetInstancesInvokeArgs(), options.WithVersion());
    }


    public sealed class GetInstancesArgs : Pulumi.InvokeArgs
    {
        [Input("filters")]
        private List<Inputs.GetInstancesFilterArgs>? _filters;
        public List<Inputs.GetInstancesFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetInstancesFilterArgs>());
            set => _filters = value;
        }

        public GetInstancesArgs()
        {
        }
    }

    public sealed class GetInstancesInvokeArgs : Pulumi.InvokeArgs
    {
        [Input("filters")]
        private InputList<Inputs.GetInstancesFilterInputArgs>? _filters;
        public InputList<Inputs.GetInstancesFilterInputArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetInstancesFilterInputArgs>());
            set => _filters = value;
        }

        public GetInstancesInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetInstancesResult
    {
        public readonly ImmutableArray<Outputs.GetInstancesFilterResult> Filters;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<Outputs.GetInstancesInstanceResult> Instances;

        [OutputConstructor]
        private GetInstancesResult(
            ImmutableArray<Outputs.GetInstancesFilterResult> filters,

            string id,

            ImmutableArray<Outputs.GetInstancesInstanceResult> instances)
        {
            Filters = filters;
            Id = id;
            Instances = instances;
        }
    }
}
