// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode
{
    public static class GetDatabaseEngines
    {
        /// <summary>
        /// Provides information about Linode Managed Database engines that match a set of filters.
        /// For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-databases-engines).
        /// 
        /// ## Example Usage
        /// 
        /// Get information about all Linode Managed Database engines:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var all = Linode.GetDatabaseEngines.Invoke();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["engineIds"] = all.Apply(getDatabaseEnginesResult =&gt; getDatabaseEnginesResult.Engines).Select(__item =&gt; __item.Id).ToList(),
        ///     };
        /// });
        /// ```
        /// 
        /// Get information about all Linode MySQL Database engines:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var mysql = Linode.GetDatabaseEngines.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Linode.Inputs.GetDatabaseEnginesFilterInputArgs
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
        ///         ["engineIds"] = mysql.Apply(getDatabaseEnginesResult =&gt; getDatabaseEnginesResult.Engines).Select(__item =&gt; __item.Id).ToList(),
        ///     };
        /// });
        /// ```
        /// 
        /// Create a Linode MySQL Database using the latest support MySQL version:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var mysql = Linode.GetDatabaseEngines.Invoke(new()
        ///     {
        ///         Latest = true,
        ///         Filters = new[]
        ///         {
        ///             new Linode.Inputs.GetDatabaseEnginesFilterInputArgs
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
        ///     var myDb = new Linode.DatabaseMysql("my_db", new()
        ///     {
        ///         Label = "mydb",
        ///         EngineId = mysql.Apply(getDatabaseEnginesResult =&gt; getDatabaseEnginesResult.Engines[0]?.Id),
        ///         Region = "us-southeast",
        ///         Type = "g6-nanode-1",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetDatabaseEnginesResult> InvokeAsync(GetDatabaseEnginesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDatabaseEnginesResult>("linode:index/getDatabaseEngines:getDatabaseEngines", args ?? new GetDatabaseEnginesArgs(), options.WithDefaults());

        /// <summary>
        /// Provides information about Linode Managed Database engines that match a set of filters.
        /// For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-databases-engines).
        /// 
        /// ## Example Usage
        /// 
        /// Get information about all Linode Managed Database engines:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var all = Linode.GetDatabaseEngines.Invoke();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["engineIds"] = all.Apply(getDatabaseEnginesResult =&gt; getDatabaseEnginesResult.Engines).Select(__item =&gt; __item.Id).ToList(),
        ///     };
        /// });
        /// ```
        /// 
        /// Get information about all Linode MySQL Database engines:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var mysql = Linode.GetDatabaseEngines.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Linode.Inputs.GetDatabaseEnginesFilterInputArgs
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
        ///         ["engineIds"] = mysql.Apply(getDatabaseEnginesResult =&gt; getDatabaseEnginesResult.Engines).Select(__item =&gt; __item.Id).ToList(),
        ///     };
        /// });
        /// ```
        /// 
        /// Create a Linode MySQL Database using the latest support MySQL version:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var mysql = Linode.GetDatabaseEngines.Invoke(new()
        ///     {
        ///         Latest = true,
        ///         Filters = new[]
        ///         {
        ///             new Linode.Inputs.GetDatabaseEnginesFilterInputArgs
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
        ///     var myDb = new Linode.DatabaseMysql("my_db", new()
        ///     {
        ///         Label = "mydb",
        ///         EngineId = mysql.Apply(getDatabaseEnginesResult =&gt; getDatabaseEnginesResult.Engines[0]?.Id),
        ///         Region = "us-southeast",
        ///         Type = "g6-nanode-1",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetDatabaseEnginesResult> Invoke(GetDatabaseEnginesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetDatabaseEnginesResult>("linode:index/getDatabaseEngines:getDatabaseEngines", args ?? new GetDatabaseEnginesInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Provides information about Linode Managed Database engines that match a set of filters.
        /// For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-databases-engines).
        /// 
        /// ## Example Usage
        /// 
        /// Get information about all Linode Managed Database engines:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var all = Linode.GetDatabaseEngines.Invoke();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["engineIds"] = all.Apply(getDatabaseEnginesResult =&gt; getDatabaseEnginesResult.Engines).Select(__item =&gt; __item.Id).ToList(),
        ///     };
        /// });
        /// ```
        /// 
        /// Get information about all Linode MySQL Database engines:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var mysql = Linode.GetDatabaseEngines.Invoke(new()
        ///     {
        ///         Filters = new[]
        ///         {
        ///             new Linode.Inputs.GetDatabaseEnginesFilterInputArgs
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
        ///         ["engineIds"] = mysql.Apply(getDatabaseEnginesResult =&gt; getDatabaseEnginesResult.Engines).Select(__item =&gt; __item.Id).ToList(),
        ///     };
        /// });
        /// ```
        /// 
        /// Create a Linode MySQL Database using the latest support MySQL version:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var mysql = Linode.GetDatabaseEngines.Invoke(new()
        ///     {
        ///         Latest = true,
        ///         Filters = new[]
        ///         {
        ///             new Linode.Inputs.GetDatabaseEnginesFilterInputArgs
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
        ///     var myDb = new Linode.DatabaseMysql("my_db", new()
        ///     {
        ///         Label = "mydb",
        ///         EngineId = mysql.Apply(getDatabaseEnginesResult =&gt; getDatabaseEnginesResult.Engines[0]?.Id),
        ///         Region = "us-southeast",
        ///         Type = "g6-nanode-1",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetDatabaseEnginesResult> Invoke(GetDatabaseEnginesInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetDatabaseEnginesResult>("linode:index/getDatabaseEngines:getDatabaseEngines", args ?? new GetDatabaseEnginesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDatabaseEnginesArgs : global::Pulumi.InvokeArgs
    {
        [Input("engines")]
        private List<Inputs.GetDatabaseEnginesEngineArgs>? _engines;
        public List<Inputs.GetDatabaseEnginesEngineArgs> Engines
        {
            get => _engines ?? (_engines = new List<Inputs.GetDatabaseEnginesEngineArgs>());
            set => _engines = value;
        }

        [Input("filters")]
        private List<Inputs.GetDatabaseEnginesFilterArgs>? _filters;
        public List<Inputs.GetDatabaseEnginesFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetDatabaseEnginesFilterArgs>());
            set => _filters = value;
        }

        /// <summary>
        /// If true, only the latest engine version will be returned.
        /// 
        /// * `filter` - (Optional) A set of filters used to select engines that meet certain requirements.
        /// </summary>
        [Input("latest")]
        public bool? Latest { get; set; }

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

        public GetDatabaseEnginesArgs()
        {
        }
        public static new GetDatabaseEnginesArgs Empty => new GetDatabaseEnginesArgs();
    }

    public sealed class GetDatabaseEnginesInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("engines")]
        private InputList<Inputs.GetDatabaseEnginesEngineInputArgs>? _engines;
        public InputList<Inputs.GetDatabaseEnginesEngineInputArgs> Engines
        {
            get => _engines ?? (_engines = new InputList<Inputs.GetDatabaseEnginesEngineInputArgs>());
            set => _engines = value;
        }

        [Input("filters")]
        private InputList<Inputs.GetDatabaseEnginesFilterInputArgs>? _filters;
        public InputList<Inputs.GetDatabaseEnginesFilterInputArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetDatabaseEnginesFilterInputArgs>());
            set => _filters = value;
        }

        /// <summary>
        /// If true, only the latest engine version will be returned.
        /// 
        /// * `filter` - (Optional) A set of filters used to select engines that meet certain requirements.
        /// </summary>
        [Input("latest")]
        public Input<bool>? Latest { get; set; }

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

        public GetDatabaseEnginesInvokeArgs()
        {
        }
        public static new GetDatabaseEnginesInvokeArgs Empty => new GetDatabaseEnginesInvokeArgs();
    }


    [OutputType]
    public sealed class GetDatabaseEnginesResult
    {
        public readonly ImmutableArray<Outputs.GetDatabaseEnginesEngineResult> Engines;
        public readonly ImmutableArray<Outputs.GetDatabaseEnginesFilterResult> Filters;
        /// <summary>
        /// The Managed Database engine ID in engine/version format.
        /// </summary>
        public readonly string Id;
        public readonly bool? Latest;
        public readonly string? Order;
        public readonly string? OrderBy;

        [OutputConstructor]
        private GetDatabaseEnginesResult(
            ImmutableArray<Outputs.GetDatabaseEnginesEngineResult> engines,

            ImmutableArray<Outputs.GetDatabaseEnginesFilterResult> filters,

            string id,

            bool? latest,

            string? order,

            string? orderBy)
        {
            Engines = engines;
            Filters = filters;
            Id = id;
            Latest = latest;
            Order = order;
            OrderBy = orderBy;
        }
    }
}
