// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode
{
    public static class GetVlans
    {
        /// <summary>
        /// Provides details about Linode VLANs.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var myInstance = new Linode.Instance("myInstance", new()
        ///     {
        ///         Image = "linode/ubuntu18.04",
        ///         Interfaces = new[]
        ///         {
        ///             new Linode.Inputs.InstanceInterfaceArgs
        ///             {
        ///                 Label = "my-vlan",
        ///                 Purpose = "vlan",
        ///             },
        ///         },
        ///         Label = "my_instance",
        ///         Region = "us-southeast",
        ///         RootPass = "bogusPassword$",
        ///         Type = "g6-standard-1",
        ///     });
        /// 
        ///     var my_vlans = Linode.GetVlans.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Linode.Inputs.GetVlansFilterInputArgs
        ///             {
        ///                 Name = "label",
        ///                 Values = new[]
        ///                 {
        ///                     "my-vlan",
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// ## Filterable Fields
        /// 
        /// * `label`
        /// 
        /// * `region`
        /// </summary>
        public static Task<GetVlansResult> InvokeAsync(GetVlansArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetVlansResult>("linode:index/getVlans:getVlans", args ?? new GetVlansArgs(), options.WithDefaults());

        /// <summary>
        /// Provides details about Linode VLANs.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var myInstance = new Linode.Instance("myInstance", new()
        ///     {
        ///         Image = "linode/ubuntu18.04",
        ///         Interfaces = new[]
        ///         {
        ///             new Linode.Inputs.InstanceInterfaceArgs
        ///             {
        ///                 Label = "my-vlan",
        ///                 Purpose = "vlan",
        ///             },
        ///         },
        ///         Label = "my_instance",
        ///         Region = "us-southeast",
        ///         RootPass = "bogusPassword$",
        ///         Type = "g6-standard-1",
        ///     });
        /// 
        ///     var my_vlans = Linode.GetVlans.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Linode.Inputs.GetVlansFilterInputArgs
        ///             {
        ///                 Name = "label",
        ///                 Values = new[]
        ///                 {
        ///                     "my-vlan",
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// ## Filterable Fields
        /// 
        /// * `label`
        /// 
        /// * `region`
        /// </summary>
        public static Output<GetVlansResult> Invoke(GetVlansInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetVlansResult>("linode:index/getVlans:getVlans", args ?? new GetVlansInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetVlansArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private List<Inputs.GetVlansFilterArgs>? _filters;
        public List<Inputs.GetVlansFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetVlansFilterArgs>());
            set => _filters = value;
        }

        /// <summary>
        /// The order in which results should be returned. (`asc`, `desc`; default `asc`)
        /// </summary>
        [Input("order")]
        public string? Order { get; set; }

        /// <summary>
        /// The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
        /// </summary>
        [Input("orderBy")]
        public string? OrderBy { get; set; }

        public GetVlansArgs()
        {
        }
        public static new GetVlansArgs Empty => new GetVlansArgs();
    }

    public sealed class GetVlansInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private InputList<Inputs.GetVlansFilterInputArgs>? _filters;
        public InputList<Inputs.GetVlansFilterInputArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetVlansFilterInputArgs>());
            set => _filters = value;
        }

        /// <summary>
        /// The order in which results should be returned. (`asc`, `desc`; default `asc`)
        /// </summary>
        [Input("order")]
        public Input<string>? Order { get; set; }

        /// <summary>
        /// The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
        /// </summary>
        [Input("orderBy")]
        public Input<string>? OrderBy { get; set; }

        public GetVlansInvokeArgs()
        {
        }
        public static new GetVlansInvokeArgs Empty => new GetVlansInvokeArgs();
    }


    [OutputType]
    public sealed class GetVlansResult
    {
        public readonly ImmutableArray<Outputs.GetVlansFilterResult> Filters;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string? Order;
        public readonly string? OrderBy;
        public readonly ImmutableArray<Outputs.GetVlansVlanResult> Vlans;

        [OutputConstructor]
        private GetVlansResult(
            ImmutableArray<Outputs.GetVlansFilterResult> filters,

            string id,

            string? order,

            string? orderBy,

            ImmutableArray<Outputs.GetVlansVlanResult> vlans)
        {
            Filters = filters;
            Id = id;
            Order = order;
            OrderBy = orderBy;
            Vlans = vlans;
        }
    }
}
