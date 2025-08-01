// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode
{
    public static class GetAccountLogins
    {
        /// <summary>
        /// Provides information about Linode account logins that match a set of filters.
        /// For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-account-logins).
        /// 
        /// ## Example Usage
        /// 
        /// The following example shows how one might use this data source to access information about a Linode account login.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var filtered_account_logins = Linode.GetAccountLogins.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Linode.Inputs.GetAccountLoginsFilterInputArgs
        ///             {
        ///                 Name = "restricted",
        ///                 Values = new[]
        ///                 {
        ///                     "true",
        ///                 },
        ///             },
        ///             new Linode.Inputs.GetAccountLoginsFilterInputArgs
        ///             {
        ///                 Name = "username",
        ///                 Values = new[]
        ///                 {
        ///                     "myUsername",
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["loginIds"] = filtered_account_logins.Apply(filtered_account_logins =&gt; filtered_account_logins.Apply(getAccountLoginsResult =&gt; getAccountLoginsResult.Logins).Select(__item =&gt; __item.Id).ToList()),
        ///     };
        /// });
        /// ```
        /// 
        /// ## Filterable Fields
        /// 
        /// * `ip`
        /// 
        /// * `restricted`
        /// 
        /// * `username`
        /// </summary>
        public static Task<GetAccountLoginsResult> InvokeAsync(GetAccountLoginsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAccountLoginsResult>("linode:index/getAccountLogins:getAccountLogins", args ?? new GetAccountLoginsArgs(), options.WithDefaults());

        /// <summary>
        /// Provides information about Linode account logins that match a set of filters.
        /// For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-account-logins).
        /// 
        /// ## Example Usage
        /// 
        /// The following example shows how one might use this data source to access information about a Linode account login.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var filtered_account_logins = Linode.GetAccountLogins.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Linode.Inputs.GetAccountLoginsFilterInputArgs
        ///             {
        ///                 Name = "restricted",
        ///                 Values = new[]
        ///                 {
        ///                     "true",
        ///                 },
        ///             },
        ///             new Linode.Inputs.GetAccountLoginsFilterInputArgs
        ///             {
        ///                 Name = "username",
        ///                 Values = new[]
        ///                 {
        ///                     "myUsername",
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["loginIds"] = filtered_account_logins.Apply(filtered_account_logins =&gt; filtered_account_logins.Apply(getAccountLoginsResult =&gt; getAccountLoginsResult.Logins).Select(__item =&gt; __item.Id).ToList()),
        ///     };
        /// });
        /// ```
        /// 
        /// ## Filterable Fields
        /// 
        /// * `ip`
        /// 
        /// * `restricted`
        /// 
        /// * `username`
        /// </summary>
        public static Output<GetAccountLoginsResult> Invoke(GetAccountLoginsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAccountLoginsResult>("linode:index/getAccountLogins:getAccountLogins", args ?? new GetAccountLoginsInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Provides information about Linode account logins that match a set of filters.
        /// For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-account-logins).
        /// 
        /// ## Example Usage
        /// 
        /// The following example shows how one might use this data source to access information about a Linode account login.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var filtered_account_logins = Linode.GetAccountLogins.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Linode.Inputs.GetAccountLoginsFilterInputArgs
        ///             {
        ///                 Name = "restricted",
        ///                 Values = new[]
        ///                 {
        ///                     "true",
        ///                 },
        ///             },
        ///             new Linode.Inputs.GetAccountLoginsFilterInputArgs
        ///             {
        ///                 Name = "username",
        ///                 Values = new[]
        ///                 {
        ///                     "myUsername",
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["loginIds"] = filtered_account_logins.Apply(filtered_account_logins =&gt; filtered_account_logins.Apply(getAccountLoginsResult =&gt; getAccountLoginsResult.Logins).Select(__item =&gt; __item.Id).ToList()),
        ///     };
        /// });
        /// ```
        /// 
        /// ## Filterable Fields
        /// 
        /// * `ip`
        /// 
        /// * `restricted`
        /// 
        /// * `username`
        /// </summary>
        public static Output<GetAccountLoginsResult> Invoke(GetAccountLoginsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetAccountLoginsResult>("linode:index/getAccountLogins:getAccountLogins", args ?? new GetAccountLoginsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAccountLoginsArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private List<Inputs.GetAccountLoginsFilterArgs>? _filters;
        public List<Inputs.GetAccountLoginsFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetAccountLoginsFilterArgs>());
            set => _filters = value;
        }

        [Input("logins")]
        private List<Inputs.GetAccountLoginsLoginArgs>? _logins;
        public List<Inputs.GetAccountLoginsLoginArgs> Logins
        {
            get => _logins ?? (_logins = new List<Inputs.GetAccountLoginsLoginArgs>());
            set => _logins = value;
        }

        public GetAccountLoginsArgs()
        {
        }
        public static new GetAccountLoginsArgs Empty => new GetAccountLoginsArgs();
    }

    public sealed class GetAccountLoginsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private InputList<Inputs.GetAccountLoginsFilterInputArgs>? _filters;
        public InputList<Inputs.GetAccountLoginsFilterInputArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetAccountLoginsFilterInputArgs>());
            set => _filters = value;
        }

        [Input("logins")]
        private InputList<Inputs.GetAccountLoginsLoginInputArgs>? _logins;
        public InputList<Inputs.GetAccountLoginsLoginInputArgs> Logins
        {
            get => _logins ?? (_logins = new InputList<Inputs.GetAccountLoginsLoginInputArgs>());
            set => _logins = value;
        }

        public GetAccountLoginsInvokeArgs()
        {
        }
        public static new GetAccountLoginsInvokeArgs Empty => new GetAccountLoginsInvokeArgs();
    }


    [OutputType]
    public sealed class GetAccountLoginsResult
    {
        public readonly ImmutableArray<Outputs.GetAccountLoginsFilterResult> Filters;
        /// <summary>
        /// The unique ID of this login object.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<Outputs.GetAccountLoginsLoginResult> Logins;

        [OutputConstructor]
        private GetAccountLoginsResult(
            ImmutableArray<Outputs.GetAccountLoginsFilterResult> filters,

            string id,

            ImmutableArray<Outputs.GetAccountLoginsLoginResult> logins)
        {
            Filters = filters;
            Id = id;
            Logins = logins;
        }
    }
}
