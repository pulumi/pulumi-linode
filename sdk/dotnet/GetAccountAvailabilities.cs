// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode
{
    public static class GetAccountAvailabilities
    {
        /// <summary>
        /// Provides information about services which are unavailable for the current Linode account.
        /// 
        /// ## Example Usage
        /// 
        /// The following example shows how one might use this data source to discover regions without specific service availability.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var filtered_availabilities = Linode.GetAccountAvailabilities.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Linode.Inputs.GetAccountAvailabilitiesFilterInputArgs
        ///             {
        ///                 Name = "unavailable",
        ///                 Values = new[]
        ///                 {
        ///                     "Linodes",
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["regions-without-linodes"] = filtered_availabilities.Apply(filtered_availabilities =&gt; filtered_availabilities.Apply(getAccountAvailabilitiesResult =&gt; getAccountAvailabilitiesResult.Availabilities).Select(__item =&gt; __item.Region).ToList()),
        ///     };
        /// });
        /// ```
        /// 
        /// ## Filterable Fields
        /// 
        /// * `region`
        /// 
        /// * `unavailable`
        /// </summary>
        public static Task<GetAccountAvailabilitiesResult> InvokeAsync(GetAccountAvailabilitiesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAccountAvailabilitiesResult>("linode:index/getAccountAvailabilities:getAccountAvailabilities", args ?? new GetAccountAvailabilitiesArgs(), options.WithDefaults());

        /// <summary>
        /// Provides information about services which are unavailable for the current Linode account.
        /// 
        /// ## Example Usage
        /// 
        /// The following example shows how one might use this data source to discover regions without specific service availability.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var filtered_availabilities = Linode.GetAccountAvailabilities.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Linode.Inputs.GetAccountAvailabilitiesFilterInputArgs
        ///             {
        ///                 Name = "unavailable",
        ///                 Values = new[]
        ///                 {
        ///                     "Linodes",
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["regions-without-linodes"] = filtered_availabilities.Apply(filtered_availabilities =&gt; filtered_availabilities.Apply(getAccountAvailabilitiesResult =&gt; getAccountAvailabilitiesResult.Availabilities).Select(__item =&gt; __item.Region).ToList()),
        ///     };
        /// });
        /// ```
        /// 
        /// ## Filterable Fields
        /// 
        /// * `region`
        /// 
        /// * `unavailable`
        /// </summary>
        public static Output<GetAccountAvailabilitiesResult> Invoke(GetAccountAvailabilitiesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAccountAvailabilitiesResult>("linode:index/getAccountAvailabilities:getAccountAvailabilities", args ?? new GetAccountAvailabilitiesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAccountAvailabilitiesArgs : global::Pulumi.InvokeArgs
    {
        [Input("availabilities")]
        private List<Inputs.GetAccountAvailabilitiesAvailabilityArgs>? _availabilities;
        public List<Inputs.GetAccountAvailabilitiesAvailabilityArgs> Availabilities
        {
            get => _availabilities ?? (_availabilities = new List<Inputs.GetAccountAvailabilitiesAvailabilityArgs>());
            set => _availabilities = value;
        }

        [Input("filters")]
        private List<Inputs.GetAccountAvailabilitiesFilterArgs>? _filters;
        public List<Inputs.GetAccountAvailabilitiesFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetAccountAvailabilitiesFilterArgs>());
            set => _filters = value;
        }

        public GetAccountAvailabilitiesArgs()
        {
        }
        public static new GetAccountAvailabilitiesArgs Empty => new GetAccountAvailabilitiesArgs();
    }

    public sealed class GetAccountAvailabilitiesInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("availabilities")]
        private InputList<Inputs.GetAccountAvailabilitiesAvailabilityInputArgs>? _availabilities;
        public InputList<Inputs.GetAccountAvailabilitiesAvailabilityInputArgs> Availabilities
        {
            get => _availabilities ?? (_availabilities = new InputList<Inputs.GetAccountAvailabilitiesAvailabilityInputArgs>());
            set => _availabilities = value;
        }

        [Input("filters")]
        private InputList<Inputs.GetAccountAvailabilitiesFilterInputArgs>? _filters;
        public InputList<Inputs.GetAccountAvailabilitiesFilterInputArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetAccountAvailabilitiesFilterInputArgs>());
            set => _filters = value;
        }

        public GetAccountAvailabilitiesInvokeArgs()
        {
        }
        public static new GetAccountAvailabilitiesInvokeArgs Empty => new GetAccountAvailabilitiesInvokeArgs();
    }


    [OutputType]
    public sealed class GetAccountAvailabilitiesResult
    {
        public readonly ImmutableArray<Outputs.GetAccountAvailabilitiesAvailabilityResult> Availabilities;
        public readonly ImmutableArray<Outputs.GetAccountAvailabilitiesFilterResult> Filters;
        public readonly string Id;

        [OutputConstructor]
        private GetAccountAvailabilitiesResult(
            ImmutableArray<Outputs.GetAccountAvailabilitiesAvailabilityResult> availabilities,

            ImmutableArray<Outputs.GetAccountAvailabilitiesFilterResult> filters,

            string id)
        {
            Availabilities = availabilities;
            Filters = filters;
            Id = id;
        }
    }
}
