// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
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
        /// **NOTICE:** Managed Databases are currently in beta. Ensure `api_version` is set to `v4beta` in order to use this data source.
        /// 
        /// Provides information about Linode Managed Databases that match a set of filters.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Get information about all Linode Managed Databases:
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var all = Output.Create(Linode.GetDatabases.InvokeAsync());
        ///     }
        /// 
        /// }
        /// ```
        /// 
        /// Get information about all Linode MySQL Databases:
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var mysql = Output.Create(Linode.GetDatabases.InvokeAsync(new Linode.GetDatabasesArgs
        ///         {
        ///             Filters = 
        ///             {
        ///                 new Linode.Inputs.GetDatabasesFilterArgs
        ///                 {
        ///                     Name = "engine",
        ///                     Values = 
        ///                     {
        ///                         "mysql",
        ///                     },
        ///                 },
        ///             },
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// ## Attributes
        /// 
        /// Each engine will be stored in the `databases` attribute and will export the following attributes:
        /// 
        /// * `allow_list` - A list of IP addresses that can access the Managed Database.
        /// 
        /// * `cluster_size` - The number of Linode Instance nodes deployed to the Managed Database.
        /// 
        /// * `created` - When this Managed Database was created.
        /// 
        /// * `encrypted` - Whether the Managed Databases is encrypted.
        /// 
        /// * `engine` - The Managed Database engine.
        /// 
        /// * `host_primary` - The primary host for the Managed Database.
        /// 
        /// * `host_secondary` - The secondary/private network host for the Managed Database.
        /// 
        /// * `id` - The ID of the Managed Database.
        /// 
        /// * `label` - A unique, user-defined string referring to the Managed Database.
        /// 
        /// * `region` - The region to use for the Managed Database.
        /// 
        /// * `replication_type` - The replication method used for the Managed Database.
        /// 
        /// * `ssl_connection` - Whether to require SSL credentials to establish a connection to the Managed Database.
        /// 
        /// * `status` - The operating status of the Managed Database.
        /// 
        /// * `type` - The Linode Instance type used for the nodes of the  Managed Database instance.
        /// 
        /// * `updated` - When this Managed Database was last updated.
        /// 
        /// * `version` - The Managed Database engine version.
        /// </summary>
        public static Task<GetDatabasesResult> InvokeAsync(GetDatabasesArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetDatabasesResult>("linode:index/getDatabases:getDatabases", args ?? new GetDatabasesArgs(), options.WithDefaults());

        /// <summary>
        /// **NOTICE:** Managed Databases are currently in beta. Ensure `api_version` is set to `v4beta` in order to use this data source.
        /// 
        /// Provides information about Linode Managed Databases that match a set of filters.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Get information about all Linode Managed Databases:
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var all = Output.Create(Linode.GetDatabases.InvokeAsync());
        ///     }
        /// 
        /// }
        /// ```
        /// 
        /// Get information about all Linode MySQL Databases:
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var mysql = Output.Create(Linode.GetDatabases.InvokeAsync(new Linode.GetDatabasesArgs
        ///         {
        ///             Filters = 
        ///             {
        ///                 new Linode.Inputs.GetDatabasesFilterArgs
        ///                 {
        ///                     Name = "engine",
        ///                     Values = 
        ///                     {
        ///                         "mysql",
        ///                     },
        ///                 },
        ///             },
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// ## Attributes
        /// 
        /// Each engine will be stored in the `databases` attribute and will export the following attributes:
        /// 
        /// * `allow_list` - A list of IP addresses that can access the Managed Database.
        /// 
        /// * `cluster_size` - The number of Linode Instance nodes deployed to the Managed Database.
        /// 
        /// * `created` - When this Managed Database was created.
        /// 
        /// * `encrypted` - Whether the Managed Databases is encrypted.
        /// 
        /// * `engine` - The Managed Database engine.
        /// 
        /// * `host_primary` - The primary host for the Managed Database.
        /// 
        /// * `host_secondary` - The secondary/private network host for the Managed Database.
        /// 
        /// * `id` - The ID of the Managed Database.
        /// 
        /// * `label` - A unique, user-defined string referring to the Managed Database.
        /// 
        /// * `region` - The region to use for the Managed Database.
        /// 
        /// * `replication_type` - The replication method used for the Managed Database.
        /// 
        /// * `ssl_connection` - Whether to require SSL credentials to establish a connection to the Managed Database.
        /// 
        /// * `status` - The operating status of the Managed Database.
        /// 
        /// * `type` - The Linode Instance type used for the nodes of the  Managed Database instance.
        /// 
        /// * `updated` - When this Managed Database was last updated.
        /// 
        /// * `version` - The Managed Database engine version.
        /// </summary>
        public static Output<GetDatabasesResult> Invoke(GetDatabasesInvokeArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetDatabasesResult>("linode:index/getDatabases:getDatabases", args ?? new GetDatabasesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDatabasesArgs : Pulumi.InvokeArgs
    {
        [Input("filters")]
        private List<Inputs.GetDatabasesFilterArgs>? _filters;
        public List<Inputs.GetDatabasesFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetDatabasesFilterArgs>());
            set => _filters = value;
        }

        /// <summary>
        /// If true, only the latest create database will be returned.
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

        public GetDatabasesArgs()
        {
        }
    }

    public sealed class GetDatabasesInvokeArgs : Pulumi.InvokeArgs
    {
        [Input("filters")]
        private InputList<Inputs.GetDatabasesFilterInputArgs>? _filters;
        public InputList<Inputs.GetDatabasesFilterInputArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetDatabasesFilterInputArgs>());
            set => _filters = value;
        }

        /// <summary>
        /// If true, only the latest create database will be returned.
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

        public GetDatabasesInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetDatabasesResult
    {
        public readonly ImmutableArray<Outputs.GetDatabasesDatabaseResult> Databases;
        public readonly ImmutableArray<Outputs.GetDatabasesFilterResult> Filters;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly bool? Latest;
        public readonly string? Order;
        public readonly string? OrderBy;

        [OutputConstructor]
        private GetDatabasesResult(
            ImmutableArray<Outputs.GetDatabasesDatabaseResult> databases,

            ImmutableArray<Outputs.GetDatabasesFilterResult> filters,

            string id,

            bool? latest,

            string? order,

            string? orderBy)
        {
            Databases = databases;
            Filters = filters;
            Id = id;
            Latest = latest;
            Order = order;
            OrderBy = orderBy;
        }
    }
}
