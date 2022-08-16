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
        /// ## Attributes
        /// 
        /// Each Linode StackScript will be stored in the `stackscripts` attribute and will export the following attributes:
        /// 
        /// * `id` - The unique ID of the StackScript.
        /// 
        /// * `label` - The StackScript's label is for display purposes only.
        /// 
        /// * `script` - The script to execute when provisioning a new Linode with this StackScript.
        /// 
        /// * `description` - A description for the StackScript.
        /// 
        /// * `rev_note` - This field allows you to add notes for the set of revisions made to this StackScript.
        /// 
        /// * `is_public` - This determines whether other users can use your StackScript. Once a StackScript is made public, it cannot be made private.
        /// 
        /// * `images` - An array of Image IDs representing the Images that this StackScript is compatible for deploying with.
        /// 
        /// * `deployments_active` - Count of currently active, deployed Linodes created from this StackScript.
        /// 
        /// * `user_gravatar_id` - The Gravatar ID for the User who created the StackScript.
        /// 
        /// * `deployments_total` - The total number of times this StackScript has been deployed.
        /// 
        /// * `username` - The User who created the StackScript.
        /// 
        /// * `created` - The date this StackScript was created.
        /// 
        /// * `updated` - The date this StackScript was updated.
        /// 
        /// * `user_defined_fields` - This is a list of fields defined with a special syntax inside this StackScript that allow for supplying customized parameters during deployment.
        /// 
        ///   * `label` - A human-readable label for the field that will serve as the input prompt for entering the value during deployment.
        /// 
        ///   * `name` - The name of the field.
        /// 
        ///   * `example` - An example value for the field.
        /// 
        ///   * `one_of` - A list of acceptable single values for the field.
        /// 
        ///   * `many_of` - A list of acceptable values for the field in any quantity, combination or order.
        /// 
        ///   * `default` - The default value. If not specified, this value will be used.
        /// 
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
        /// ## Attributes
        /// 
        /// Each Linode StackScript will be stored in the `stackscripts` attribute and will export the following attributes:
        /// 
        /// * `id` - The unique ID of the StackScript.
        /// 
        /// * `label` - The StackScript's label is for display purposes only.
        /// 
        /// * `script` - The script to execute when provisioning a new Linode with this StackScript.
        /// 
        /// * `description` - A description for the StackScript.
        /// 
        /// * `rev_note` - This field allows you to add notes for the set of revisions made to this StackScript.
        /// 
        /// * `is_public` - This determines whether other users can use your StackScript. Once a StackScript is made public, it cannot be made private.
        /// 
        /// * `images` - An array of Image IDs representing the Images that this StackScript is compatible for deploying with.
        /// 
        /// * `deployments_active` - Count of currently active, deployed Linodes created from this StackScript.
        /// 
        /// * `user_gravatar_id` - The Gravatar ID for the User who created the StackScript.
        /// 
        /// * `deployments_total` - The total number of times this StackScript has been deployed.
        /// 
        /// * `username` - The User who created the StackScript.
        /// 
        /// * `created` - The date this StackScript was created.
        /// 
        /// * `updated` - The date this StackScript was updated.
        /// 
        /// * `user_defined_fields` - This is a list of fields defined with a special syntax inside this StackScript that allow for supplying customized parameters during deployment.
        /// 
        ///   * `label` - A human-readable label for the field that will serve as the input prompt for entering the value during deployment.
        /// 
        ///   * `name` - The name of the field.
        /// 
        ///   * `example` - An example value for the field.
        /// 
        ///   * `one_of` - A list of acceptable single values for the field.
        /// 
        ///   * `many_of` - A list of acceptable values for the field in any quantity, combination or order.
        /// 
        ///   * `default` - The default value. If not specified, this value will be used.
        /// 
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
