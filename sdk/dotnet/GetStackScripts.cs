// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode
{
    public static class GetStackScripts
    {
        /// <summary>
        /// Provides information about Linode StackScripts that match a set of filters.
        /// 
        /// **NOTICE:** Due to the large number of public StackScripts, this data source may time out if `is_public` is not filtered on.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// The following example shows how one might use this data source to access information about a Linode StackScript.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var specific_stackscripts = Linode.GetStackScripts.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Linode.Inputs.GetStackScriptsFilterInputArgs
        ///             {
        ///                 Name = "label",
        ///                 Values = new[]
        ///                 {
        ///                     "my-cool-stackscript",
        ///                 },
        ///             },
        ///             new Linode.Inputs.GetStackScriptsFilterInputArgs
        ///             {
        ///                 Name = "is_public",
        ///                 Values = new[]
        ///                 {
        ///                     "false",
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
        /// * `deployments_active`
        /// 
        /// * `deployments_total`
        /// 
        /// * `description`
        /// 
        /// * `images`
        /// 
        /// * `is_public`
        /// 
        /// * `label`
        /// 
        /// * `mine`
        /// 
        /// * `rev_note`
        /// 
        /// * `username`
        /// </summary>
        public static Task<GetStackScriptsResult> InvokeAsync(GetStackScriptsArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetStackScriptsResult>("linode:index/getStackScripts:getStackScripts", args ?? new GetStackScriptsArgs(), options.WithDefaults());

        /// <summary>
        /// Provides information about Linode StackScripts that match a set of filters.
        /// 
        /// **NOTICE:** Due to the large number of public StackScripts, this data source may time out if `is_public` is not filtered on.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// The following example shows how one might use this data source to access information about a Linode StackScript.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var specific_stackscripts = Linode.GetStackScripts.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Linode.Inputs.GetStackScriptsFilterInputArgs
        ///             {
        ///                 Name = "label",
        ///                 Values = new[]
        ///                 {
        ///                     "my-cool-stackscript",
        ///                 },
        ///             },
        ///             new Linode.Inputs.GetStackScriptsFilterInputArgs
        ///             {
        ///                 Name = "is_public",
        ///                 Values = new[]
        ///                 {
        ///                     "false",
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
        /// * `deployments_active`
        /// 
        /// * `deployments_total`
        /// 
        /// * `description`
        /// 
        /// * `images`
        /// 
        /// * `is_public`
        /// 
        /// * `label`
        /// 
        /// * `mine`
        /// 
        /// * `rev_note`
        /// 
        /// * `username`
        /// </summary>
        public static Output<GetStackScriptsResult> Invoke(GetStackScriptsInvokeArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetStackScriptsResult>("linode:index/getStackScripts:getStackScripts", args ?? new GetStackScriptsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetStackScriptsArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private List<Inputs.GetStackScriptsFilterArgs>? _filters;
        public List<Inputs.GetStackScriptsFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetStackScriptsFilterArgs>());
            set => _filters = value;
        }

        /// <summary>
        /// If true, only the latest StackScript will be returned. StackScripts without a valid `created` field are not included in the result.
        /// </summary>
        [Input("latest")]
        public bool? Latest { get; set; }

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

        public GetStackScriptsArgs()
        {
        }
        public static new GetStackScriptsArgs Empty => new GetStackScriptsArgs();
    }

    public sealed class GetStackScriptsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private InputList<Inputs.GetStackScriptsFilterInputArgs>? _filters;
        public InputList<Inputs.GetStackScriptsFilterInputArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetStackScriptsFilterInputArgs>());
            set => _filters = value;
        }

        /// <summary>
        /// If true, only the latest StackScript will be returned. StackScripts without a valid `created` field are not included in the result.
        /// </summary>
        [Input("latest")]
        public Input<bool>? Latest { get; set; }

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

        public GetStackScriptsInvokeArgs()
        {
        }
        public static new GetStackScriptsInvokeArgs Empty => new GetStackScriptsInvokeArgs();
    }


    [OutputType]
    public sealed class GetStackScriptsResult
    {
        public readonly ImmutableArray<Outputs.GetStackScriptsFilterResult> Filters;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly bool? Latest;
        public readonly string? Order;
        public readonly string? OrderBy;
        public readonly ImmutableArray<Outputs.GetStackScriptsStackscriptResult> Stackscripts;

        [OutputConstructor]
        private GetStackScriptsResult(
            ImmutableArray<Outputs.GetStackScriptsFilterResult> filters,

            string id,

            bool? latest,

            string? order,

            string? orderBy,

            ImmutableArray<Outputs.GetStackScriptsStackscriptResult> stackscripts)
        {
            Filters = filters;
            Id = id;
            Latest = latest;
            Order = order;
            OrderBy = orderBy;
            Stackscripts = stackscripts;
        }
    }
}
