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
        /// &gt; **Beta Notice** VLANs are currently available through early access.
        /// To use early access resources, the `api_version` provider argument must be set to `v4beta`.
        /// To learn more, see the early access documentation.
        /// 
        /// Provides details about Linode VLANs.
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
        ///     var myInstance = new Linode.Instance("myInstance", new()
        ///     {
        ///         Label = "my_instance",
        ///         Image = "linode/ubuntu22.04",
        ///         Region = "us-southeast",
        ///         Type = "g6-standard-1",
        ///         RootPass = "bogusPassword$",
        ///         Interfaces = new[]
        ///         {
        ///             new Linode.Inputs.InstanceInterfaceArgs
        ///             {
        ///                 Purpose = "vlan",
        ///                 Label = "my-vlan",
        ///             },
        ///         },
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
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["vlanLinodes"] = my_vlans.Apply(my_vlans =&gt; my_vlans.Apply(getVlansResult =&gt; getVlansResult.Vlans[0]?.Linodes)),
        ///     };
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// 
        /// ## Filterable Fields
        /// 
        /// * `label`
        /// 
        /// * `region`
        /// </summary>
        public static Task<GetVlansResult> InvokeAsync(GetVlansArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetVlansResult>("linode:index/getVlans:getVlans", args ?? new GetVlansArgs(), options.WithDefaults());

        /// <summary>
        /// &gt; **Beta Notice** VLANs are currently available through early access.
        /// To use early access resources, the `api_version` provider argument must be set to `v4beta`.
        /// To learn more, see the early access documentation.
        /// 
        /// Provides details about Linode VLANs.
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
        ///     var myInstance = new Linode.Instance("myInstance", new()
        ///     {
        ///         Label = "my_instance",
        ///         Image = "linode/ubuntu22.04",
        ///         Region = "us-southeast",
        ///         Type = "g6-standard-1",
        ///         RootPass = "bogusPassword$",
        ///         Interfaces = new[]
        ///         {
        ///             new Linode.Inputs.InstanceInterfaceArgs
        ///             {
        ///                 Purpose = "vlan",
        ///                 Label = "my-vlan",
        ///             },
        ///         },
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
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["vlanLinodes"] = my_vlans.Apply(my_vlans =&gt; my_vlans.Apply(getVlansResult =&gt; getVlansResult.Vlans[0]?.Linodes)),
        ///     };
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// 
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

        [Input("vlans")]
        private List<Inputs.GetVlansVlanArgs>? _vlans;
        public List<Inputs.GetVlansVlanArgs> Vlans
        {
            get => _vlans ?? (_vlans = new List<Inputs.GetVlansVlanArgs>());
            set => _vlans = value;
        }

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

        [Input("vlans")]
        private InputList<Inputs.GetVlansVlanInputArgs>? _vlans;
        public InputList<Inputs.GetVlansVlanInputArgs> Vlans
        {
            get => _vlans ?? (_vlans = new InputList<Inputs.GetVlansVlanInputArgs>());
            set => _vlans = value;
        }

        public GetVlansInvokeArgs()
        {
        }
        public static new GetVlansInvokeArgs Empty => new GetVlansInvokeArgs();
    }


    [OutputType]
    public sealed class GetVlansResult
    {
        public readonly ImmutableArray<Outputs.GetVlansFilterResult> Filters;
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
