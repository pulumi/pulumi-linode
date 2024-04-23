// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode
{
    public static class GetFirewalls
    {
        /// <summary>
        /// Provides information about Linode Cloud Firewalls that match a set of filters.
        /// 
        /// ## Example Usage
        /// 
        /// Get information about all Linode Cloud Firewalls with a certain label and visibility:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var specific = Linode.GetFirewalls.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Linode.Inputs.GetFirewallsFilterInputArgs
        ///             {
        ///                 Name = "label",
        ///                 Values = new[]
        ///                 {
        ///                     "my-firewalls",
        ///                 },
        ///             },
        ///             new Linode.Inputs.GetFirewallsFilterInputArgs
        ///             {
        ///                 Name = "tags",
        ///                 Values = new[]
        ///                 {
        ///                     "my-tag",
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firewallId"] = specific.Apply(getFirewallsResult =&gt; getFirewallsResult.Firewalls[0]?.Id),
        ///     };
        /// });
        /// ```
        /// 
        /// Get information about all Linode images associated with the current token:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var all = Linode.GetFirewalls.Invoke();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firewallIds"] = all.Apply(getFirewallsResult =&gt; getFirewallsResult.Firewalls).Select(__item =&gt; __item.Id).ToList(),
        ///     };
        /// });
        /// ```
        /// 
        /// ## Firewall Rule
        /// 
        /// * `label` - The label of this rule for display purposes only.
        /// 
        /// * `action` - Controls whether traffic is accepted or dropped by this rule (ACCEPT, DROP).
        /// 
        /// * `protocol` - The network protocol this rule controls. (TCP, UDP, ICMP)
        /// 
        /// * `ports` - A string representation of ports and/or port ranges (i.e. "443" or "80-90, 91").
        /// 
        /// * `ipv4` - A list of IPv4 addresses or networks in IP/mask format.
        /// 
        /// * `ipv6` - A list of IPv6 addresses or networks in IP/mask format.
        /// 
        /// ## Firewall Device
        /// 
        /// * `id` - The unique ID of this Firewall Device assignment.
        /// 
        /// * `entity_id` - The ID of the underlying entity this device references.
        /// 
        /// * `type` - The type of the assigned entity.
        /// 
        /// * `label` - The label of the assigned entity.
        /// 
        /// * `url` - The URL of the assigned entity.
        /// 
        /// ## Filterable Fields
        /// 
        /// * `id`
        /// 
        /// * `label`
        /// 
        /// * `status`
        /// 
        /// * `tags`
        /// </summary>
        public static Task<GetFirewallsResult> InvokeAsync(GetFirewallsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetFirewallsResult>("linode:index/getFirewalls:getFirewalls", args ?? new GetFirewallsArgs(), options.WithDefaults());

        /// <summary>
        /// Provides information about Linode Cloud Firewalls that match a set of filters.
        /// 
        /// ## Example Usage
        /// 
        /// Get information about all Linode Cloud Firewalls with a certain label and visibility:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var specific = Linode.GetFirewalls.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Linode.Inputs.GetFirewallsFilterInputArgs
        ///             {
        ///                 Name = "label",
        ///                 Values = new[]
        ///                 {
        ///                     "my-firewalls",
        ///                 },
        ///             },
        ///             new Linode.Inputs.GetFirewallsFilterInputArgs
        ///             {
        ///                 Name = "tags",
        ///                 Values = new[]
        ///                 {
        ///                     "my-tag",
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firewallId"] = specific.Apply(getFirewallsResult =&gt; getFirewallsResult.Firewalls[0]?.Id),
        ///     };
        /// });
        /// ```
        /// 
        /// Get information about all Linode images associated with the current token:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var all = Linode.GetFirewalls.Invoke();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firewallIds"] = all.Apply(getFirewallsResult =&gt; getFirewallsResult.Firewalls).Select(__item =&gt; __item.Id).ToList(),
        ///     };
        /// });
        /// ```
        /// 
        /// ## Firewall Rule
        /// 
        /// * `label` - The label of this rule for display purposes only.
        /// 
        /// * `action` - Controls whether traffic is accepted or dropped by this rule (ACCEPT, DROP).
        /// 
        /// * `protocol` - The network protocol this rule controls. (TCP, UDP, ICMP)
        /// 
        /// * `ports` - A string representation of ports and/or port ranges (i.e. "443" or "80-90, 91").
        /// 
        /// * `ipv4` - A list of IPv4 addresses or networks in IP/mask format.
        /// 
        /// * `ipv6` - A list of IPv6 addresses or networks in IP/mask format.
        /// 
        /// ## Firewall Device
        /// 
        /// * `id` - The unique ID of this Firewall Device assignment.
        /// 
        /// * `entity_id` - The ID of the underlying entity this device references.
        /// 
        /// * `type` - The type of the assigned entity.
        /// 
        /// * `label` - The label of the assigned entity.
        /// 
        /// * `url` - The URL of the assigned entity.
        /// 
        /// ## Filterable Fields
        /// 
        /// * `id`
        /// 
        /// * `label`
        /// 
        /// * `status`
        /// 
        /// * `tags`
        /// </summary>
        public static Output<GetFirewallsResult> Invoke(GetFirewallsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetFirewallsResult>("linode:index/getFirewalls:getFirewalls", args ?? new GetFirewallsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetFirewallsArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private List<Inputs.GetFirewallsFilterArgs>? _filters;
        public List<Inputs.GetFirewallsFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetFirewallsFilterArgs>());
            set => _filters = value;
        }

        [Input("firewalls")]
        private List<Inputs.GetFirewallsFirewallArgs>? _firewalls;
        public List<Inputs.GetFirewallsFirewallArgs> Firewalls
        {
            get => _firewalls ?? (_firewalls = new List<Inputs.GetFirewallsFirewallArgs>());
            set => _firewalls = value;
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

        public GetFirewallsArgs()
        {
        }
        public static new GetFirewallsArgs Empty => new GetFirewallsArgs();
    }

    public sealed class GetFirewallsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private InputList<Inputs.GetFirewallsFilterInputArgs>? _filters;
        public InputList<Inputs.GetFirewallsFilterInputArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetFirewallsFilterInputArgs>());
            set => _filters = value;
        }

        [Input("firewalls")]
        private InputList<Inputs.GetFirewallsFirewallInputArgs>? _firewalls;
        public InputList<Inputs.GetFirewallsFirewallInputArgs> Firewalls
        {
            get => _firewalls ?? (_firewalls = new InputList<Inputs.GetFirewallsFirewallInputArgs>());
            set => _firewalls = value;
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

        public GetFirewallsInvokeArgs()
        {
        }
        public static new GetFirewallsInvokeArgs Empty => new GetFirewallsInvokeArgs();
    }


    [OutputType]
    public sealed class GetFirewallsResult
    {
        public readonly ImmutableArray<Outputs.GetFirewallsFilterResult> Filters;
        public readonly ImmutableArray<Outputs.GetFirewallsFirewallResult> Firewalls;
        /// <summary>
        /// The unique ID assigned to this Firewall.
        /// </summary>
        public readonly string Id;
        public readonly string? Order;
        public readonly string? OrderBy;

        [OutputConstructor]
        private GetFirewallsResult(
            ImmutableArray<Outputs.GetFirewallsFilterResult> filters,

            ImmutableArray<Outputs.GetFirewallsFirewallResult> firewalls,

            string id,

            string? order,

            string? orderBy)
        {
            Filters = filters;
            Firewalls = firewalls;
            Id = id;
            Order = order;
            OrderBy = orderBy;
        }
    }
}
