// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode
{
    public static class GetDatabases
    {
        /// <summary>
        /// Provides information about Linode Managed Databases that match a set of filters.
        /// For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-databases-instances).
        /// 
        /// ## Example Usage
        /// 
        /// Get information about all Linode Managed Databases:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var all = Linode.GetDatabases.Invoke();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["databaseIds"] = all.Apply(getDatabasesResult =&gt; getDatabasesResult.Databases).Select(__item =&gt; __item.Id).ToList(),
        ///     };
        /// });
        /// ```
        /// 
        /// Get information about all Linode MySQL Databases:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var mysql = Linode.GetDatabases.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Linode.Inputs.GetDatabasesFilterInputArgs
        ///             {
        ///                 Name = "engine",
        ///                 Values = new[]
        ///                 {
        ///                     "mysql",
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["databaseIds"] = mysql.Apply(getDatabasesResult =&gt; getDatabasesResult.Databases).Select(__item =&gt; __item.Id).ToList(),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetDatabasesResult> InvokeAsync(GetDatabasesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDatabasesResult>("linode:index/getDatabases:getDatabases", args ?? new GetDatabasesArgs(), options.WithDefaults());

        /// <summary>
        /// Provides information about Linode Managed Databases that match a set of filters.
        /// For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-databases-instances).
        /// 
        /// ## Example Usage
        /// 
        /// Get information about all Linode Managed Databases:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var all = Linode.GetDatabases.Invoke();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["databaseIds"] = all.Apply(getDatabasesResult =&gt; getDatabasesResult.Databases).Select(__item =&gt; __item.Id).ToList(),
        ///     };
        /// });
        /// ```
        /// 
        /// Get information about all Linode MySQL Databases:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var mysql = Linode.GetDatabases.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Linode.Inputs.GetDatabasesFilterInputArgs
        ///             {
        ///                 Name = "engine",
        ///                 Values = new[]
        ///                 {
        ///                     "mysql",
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["databaseIds"] = mysql.Apply(getDatabasesResult =&gt; getDatabasesResult.Databases).Select(__item =&gt; __item.Id).ToList(),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetDatabasesResult> Invoke(GetDatabasesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetDatabasesResult>("linode:index/getDatabases:getDatabases", args ?? new GetDatabasesInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Provides information about Linode Managed Databases that match a set of filters.
        /// For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-databases-instances).
        /// 
        /// ## Example Usage
        /// 
        /// Get information about all Linode Managed Databases:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var all = Linode.GetDatabases.Invoke();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["databaseIds"] = all.Apply(getDatabasesResult =&gt; getDatabasesResult.Databases).Select(__item =&gt; __item.Id).ToList(),
        ///     };
        /// });
        /// ```
        /// 
        /// Get information about all Linode MySQL Databases:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var mysql = Linode.GetDatabases.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Linode.Inputs.GetDatabasesFilterInputArgs
        ///             {
        ///                 Name = "engine",
        ///                 Values = new[]
        ///                 {
        ///                     "mysql",
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["databaseIds"] = mysql.Apply(getDatabasesResult =&gt; getDatabasesResult.Databases).Select(__item =&gt; __item.Id).ToList(),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetDatabasesResult> Invoke(GetDatabasesInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetDatabasesResult>("linode:index/getDatabases:getDatabases", args ?? new GetDatabasesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDatabasesArgs : global::Pulumi.InvokeArgs
    {
        [Input("databases")]
        private List<Inputs.GetDatabasesDatabaseArgs>? _databases;
        public List<Inputs.GetDatabasesDatabaseArgs> Databases
        {
            get => _databases ?? (_databases = new List<Inputs.GetDatabasesDatabaseArgs>());
            set => _databases = value;
        }

        [Input("filters")]
        private List<Inputs.GetDatabasesFilterArgs>? _filters;
        public List<Inputs.GetDatabasesFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetDatabasesFilterArgs>());
            set => _filters = value;
        }

        /// <summary>
        /// The order in which results should be returned. (`asc`, `desc`; default `asc`)
        /// </summary>
        [Input("order")]
        public string? Order { get; set; }

        /// <summary>
        /// The attribute to order the results by. (`version`)
        /// </summary>
        [Input("orderBy")]
        public string? OrderBy { get; set; }

        public GetDatabasesArgs()
        {
        }
        public static new GetDatabasesArgs Empty => new GetDatabasesArgs();
    }

    public sealed class GetDatabasesInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("databases")]
        private InputList<Inputs.GetDatabasesDatabaseInputArgs>? _databases;
        public InputList<Inputs.GetDatabasesDatabaseInputArgs> Databases
        {
            get => _databases ?? (_databases = new InputList<Inputs.GetDatabasesDatabaseInputArgs>());
            set => _databases = value;
        }

        [Input("filters")]
        private InputList<Inputs.GetDatabasesFilterInputArgs>? _filters;
        public InputList<Inputs.GetDatabasesFilterInputArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetDatabasesFilterInputArgs>());
            set => _filters = value;
        }

        /// <summary>
        /// The order in which results should be returned. (`asc`, `desc`; default `asc`)
        /// </summary>
        [Input("order")]
        public Input<string>? Order { get; set; }

        /// <summary>
        /// The attribute to order the results by. (`version`)
        /// </summary>
        [Input("orderBy")]
        public Input<string>? OrderBy { get; set; }

        public GetDatabasesInvokeArgs()
        {
        }
        public static new GetDatabasesInvokeArgs Empty => new GetDatabasesInvokeArgs();
    }


    [OutputType]
    public sealed class GetDatabasesResult
    {
        public readonly ImmutableArray<Outputs.GetDatabasesDatabaseResult> Databases;
        public readonly ImmutableArray<Outputs.GetDatabasesFilterResult> Filters;
        /// <summary>
        /// The ID of the Managed Database.
        /// </summary>
        public readonly string Id;
        public readonly string? Order;
        public readonly string? OrderBy;

        [OutputConstructor]
        private GetDatabasesResult(
            ImmutableArray<Outputs.GetDatabasesDatabaseResult> databases,

            ImmutableArray<Outputs.GetDatabasesFilterResult> filters,

            string id,

            string? order,

            string? orderBy)
        {
            Databases = databases;
            Filters = filters;
            Id = id;
            Order = order;
            OrderBy = orderBy;
        }
    }
}
