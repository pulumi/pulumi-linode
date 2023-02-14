// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode
{
    public static class GetDatabaseBackups
    {
        /// <summary>
        /// Provides information about Linode Database Backups that match a set of filters.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Get information about all backups for a MySQL database:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var all_backups = Linode.GetDatabaseBackups.Invoke(new()
        ///     {
        ///         DatabaseId = 12345,
        ///         DatabaseType = "mysql",
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// Get information about all automatic MongoDB Database Backups:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var auto_backups = Linode.GetDatabaseBackups.Invoke(new()
        ///     {
        ///         DatabaseId = 12345,
        ///         DatabaseType = "mongodb",
        ///         Filters = new[]
        ///         {
        ///             new Linode.Inputs.GetDatabaseBackupsFilterInputArgs
        ///             {
        ///                 Name = "type",
        ///                 Values = new[]
        ///                 {
        ///                     "auto",
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetDatabaseBackupsResult> InvokeAsync(GetDatabaseBackupsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetDatabaseBackupsResult>("linode:index/getDatabaseBackups:getDatabaseBackups", args ?? new GetDatabaseBackupsArgs(), options.WithDefaults());

        /// <summary>
        /// Provides information about Linode Database Backups that match a set of filters.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Get information about all backups for a MySQL database:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var all_backups = Linode.GetDatabaseBackups.Invoke(new()
        ///     {
        ///         DatabaseId = 12345,
        ///         DatabaseType = "mysql",
        ///     });
        /// 
        /// });
        /// ```
        /// 
        /// Get information about all automatic MongoDB Database Backups:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var auto_backups = Linode.GetDatabaseBackups.Invoke(new()
        ///     {
        ///         DatabaseId = 12345,
        ///         DatabaseType = "mongodb",
        ///         Filters = new[]
        ///         {
        ///             new Linode.Inputs.GetDatabaseBackupsFilterInputArgs
        ///             {
        ///                 Name = "type",
        ///                 Values = new[]
        ///                 {
        ///                     "auto",
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetDatabaseBackupsResult> Invoke(GetDatabaseBackupsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetDatabaseBackupsResult>("linode:index/getDatabaseBackups:getDatabaseBackups", args ?? new GetDatabaseBackupsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDatabaseBackupsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the database to retrieve backups for.
        /// </summary>
        [Input("databaseId", required: true)]
        public int DatabaseId { get; set; }

        /// <summary>
        /// The type of the database to retrieve backups for. (`mysql`, `mongodb`, `postgresql`)
        /// </summary>
        [Input("databaseType", required: true)]
        public string DatabaseType { get; set; } = null!;

        [Input("filters")]
        private List<Inputs.GetDatabaseBackupsFilterArgs>? _filters;
        public List<Inputs.GetDatabaseBackupsFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetDatabaseBackupsFilterArgs>());
            set => _filters = value;
        }

        /// <summary>
        /// If true, only the latest backup will be returned.
        /// </summary>
        [Input("latest")]
        public bool? Latest { get; set; }

        /// <summary>
        /// The order in which results should be returned. (`asc`, `desc`; default `asc`)
        /// </summary>
        [Input("order")]
        public string? Order { get; set; }

        /// <summary>
        /// The attribute to order the results by. (`created`)
        /// </summary>
        [Input("orderBy")]
        public string? OrderBy { get; set; }

        public GetDatabaseBackupsArgs()
        {
        }
        public static new GetDatabaseBackupsArgs Empty => new GetDatabaseBackupsArgs();
    }

    public sealed class GetDatabaseBackupsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the database to retrieve backups for.
        /// </summary>
        [Input("databaseId", required: true)]
        public Input<int> DatabaseId { get; set; } = null!;

        /// <summary>
        /// The type of the database to retrieve backups for. (`mysql`, `mongodb`, `postgresql`)
        /// </summary>
        [Input("databaseType", required: true)]
        public Input<string> DatabaseType { get; set; } = null!;

        [Input("filters")]
        private InputList<Inputs.GetDatabaseBackupsFilterInputArgs>? _filters;
        public InputList<Inputs.GetDatabaseBackupsFilterInputArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetDatabaseBackupsFilterInputArgs>());
            set => _filters = value;
        }

        /// <summary>
        /// If true, only the latest backup will be returned.
        /// </summary>
        [Input("latest")]
        public Input<bool>? Latest { get; set; }

        /// <summary>
        /// The order in which results should be returned. (`asc`, `desc`; default `asc`)
        /// </summary>
        [Input("order")]
        public Input<string>? Order { get; set; }

        /// <summary>
        /// The attribute to order the results by. (`created`)
        /// </summary>
        [Input("orderBy")]
        public Input<string>? OrderBy { get; set; }

        public GetDatabaseBackupsInvokeArgs()
        {
        }
        public static new GetDatabaseBackupsInvokeArgs Empty => new GetDatabaseBackupsInvokeArgs();
    }


    [OutputType]
    public sealed class GetDatabaseBackupsResult
    {
        public readonly ImmutableArray<Outputs.GetDatabaseBackupsBackupResult> Backups;
        public readonly int DatabaseId;
        public readonly string DatabaseType;
        public readonly ImmutableArray<Outputs.GetDatabaseBackupsFilterResult> Filters;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly bool? Latest;
        public readonly string? Order;
        public readonly string? OrderBy;

        [OutputConstructor]
        private GetDatabaseBackupsResult(
            ImmutableArray<Outputs.GetDatabaseBackupsBackupResult> backups,

            int databaseId,

            string databaseType,

            ImmutableArray<Outputs.GetDatabaseBackupsFilterResult> filters,

            string id,

            bool? latest,

            string? order,

            string? orderBy)
        {
            Backups = backups;
            DatabaseId = databaseId;
            DatabaseType = databaseType;
            Filters = filters;
            Id = id;
            Latest = latest;
            Order = order;
            OrderBy = orderBy;
        }
    }
}
