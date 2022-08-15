// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode
{
    public static class GetDatabasePostgresql
    {
        /// <summary>
        /// Provides information about a Linode PostgreSQL Database.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Get information about a PostgreSQL database:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var my_db = Linode.GetDatabasePostgresql.Invoke(new()
        ///     {
        ///         DatabaseId = 12345,
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// ## Attributes
        /// 
        /// The `linode.DatabasePostgresql` data source exports the following attributes:
        /// 
        /// * `allow_list` - A list of IP addresses that can access the Managed Database. Each item can be a single IP address or a range in CIDR format.
        /// 
        /// * `ca_cert` - The base64-encoded SSL CA certificate for the Managed Database instance.
        /// 
        /// * `cluster_size` - The number of Linode Instance nodes deployed to the Managed Database.
        /// 
        /// * `created` - When this Managed Database was created.
        /// 
        /// * `encrypted` - Whether the Managed Databases is encrypted.
        /// 
        /// * `engine` - The Managed Database engine. (e.g. `postgresql`)
        /// 
        /// * `engine_id` - The Managed Database engine in engine/version format. (e.g. `postgresql/13.2`)
        /// 
        /// * `host_primary` - The primary host for the Managed Database.
        /// 
        /// * `host_secondary` - The secondary/private network host for the Managed Database.
        /// 
        /// * `label` - A unique, user-defined string referring to the Managed Database.
        /// 
        /// * `region` - The region that hosts this Linode Managed Database.
        /// 
        /// * `root_password` - The randomly-generated root password for the Managed Database instance.
        /// 
        /// * `root_username` - The root username for the Managed Database instance.
        /// 
        /// * `replication_type` - The replication method used for the Managed Database. (`none`, `asynch`, `semi_synch`)
        /// 
        /// * `replication_commit_type` - (Optional) The synchronization level of the replicating server. (`on`, `local`, `remote_write`, `remote_apply`, `off`)
        /// 
        /// * `ssl_connection` - Whether to require SSL credentials to establish a connection to the Managed Database.
        /// 
        /// * `status` - The operating status of the Managed Database.
        /// 
        /// * `type` - The Linode Instance type used for the nodes of the  Managed Database instance.
        /// 
        /// * `updated` - When this Managed Database was last updated.
        /// 
        /// * `updates` - (Optional) Configuration settings for automated patch update maintenance for the Managed Database.
        /// 
        /// * `version` - The Managed Database engine version. (e.g. `v8.0.26`)
        /// 
        /// ## updates
        /// 
        /// The following arguments are exported by the `updates` specification block:
        /// 
        /// * `day_of_week` - The day to perform maintenance. (`monday`, `tuesday`, ...)
        /// 
        /// * `duration` - The maximum maintenance window time in hours. (`1`..`3`)
        /// 
        /// * `frequency` - Whether maintenance occurs on a weekly or monthly basis. (`weekly`, `monthly`)
        /// 
        /// * `hour_of_day` - The hour to begin maintenance based in UTC time. (`0`..`23`)
        /// 
        /// * `week_of_month` - The week of the month to perform monthly frequency updates. Required for `monthly` frequency updates. (`1`..`4`)
        /// </summary>
        public static Task<GetDatabasePostgresqlResult> InvokeAsync(GetDatabasePostgresqlArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetDatabasePostgresqlResult>("linode:index/getDatabasePostgresql:getDatabasePostgresql", args ?? new GetDatabasePostgresqlArgs(), options.WithDefaults());

        /// <summary>
        /// Provides information about a Linode PostgreSQL Database.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Get information about a PostgreSQL database:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var my_db = Linode.GetDatabasePostgresql.Invoke(new()
        ///     {
        ///         DatabaseId = 12345,
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// ## Attributes
        /// 
        /// The `linode.DatabasePostgresql` data source exports the following attributes:
        /// 
        /// * `allow_list` - A list of IP addresses that can access the Managed Database. Each item can be a single IP address or a range in CIDR format.
        /// 
        /// * `ca_cert` - The base64-encoded SSL CA certificate for the Managed Database instance.
        /// 
        /// * `cluster_size` - The number of Linode Instance nodes deployed to the Managed Database.
        /// 
        /// * `created` - When this Managed Database was created.
        /// 
        /// * `encrypted` - Whether the Managed Databases is encrypted.
        /// 
        /// * `engine` - The Managed Database engine. (e.g. `postgresql`)
        /// 
        /// * `engine_id` - The Managed Database engine in engine/version format. (e.g. `postgresql/13.2`)
        /// 
        /// * `host_primary` - The primary host for the Managed Database.
        /// 
        /// * `host_secondary` - The secondary/private network host for the Managed Database.
        /// 
        /// * `label` - A unique, user-defined string referring to the Managed Database.
        /// 
        /// * `region` - The region that hosts this Linode Managed Database.
        /// 
        /// * `root_password` - The randomly-generated root password for the Managed Database instance.
        /// 
        /// * `root_username` - The root username for the Managed Database instance.
        /// 
        /// * `replication_type` - The replication method used for the Managed Database. (`none`, `asynch`, `semi_synch`)
        /// 
        /// * `replication_commit_type` - (Optional) The synchronization level of the replicating server. (`on`, `local`, `remote_write`, `remote_apply`, `off`)
        /// 
        /// * `ssl_connection` - Whether to require SSL credentials to establish a connection to the Managed Database.
        /// 
        /// * `status` - The operating status of the Managed Database.
        /// 
        /// * `type` - The Linode Instance type used for the nodes of the  Managed Database instance.
        /// 
        /// * `updated` - When this Managed Database was last updated.
        /// 
        /// * `updates` - (Optional) Configuration settings for automated patch update maintenance for the Managed Database.
        /// 
        /// * `version` - The Managed Database engine version. (e.g. `v8.0.26`)
        /// 
        /// ## updates
        /// 
        /// The following arguments are exported by the `updates` specification block:
        /// 
        /// * `day_of_week` - The day to perform maintenance. (`monday`, `tuesday`, ...)
        /// 
        /// * `duration` - The maximum maintenance window time in hours. (`1`..`3`)
        /// 
        /// * `frequency` - Whether maintenance occurs on a weekly or monthly basis. (`weekly`, `monthly`)
        /// 
        /// * `hour_of_day` - The hour to begin maintenance based in UTC time. (`0`..`23`)
        /// 
        /// * `week_of_month` - The week of the month to perform monthly frequency updates. Required for `monthly` frequency updates. (`1`..`4`)
        /// </summary>
        public static Output<GetDatabasePostgresqlResult> Invoke(GetDatabasePostgresqlInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetDatabasePostgresqlResult>("linode:index/getDatabasePostgresql:getDatabasePostgresql", args ?? new GetDatabasePostgresqlInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDatabasePostgresqlArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the PostgreSQL database.
        /// </summary>
        [Input("databaseId", required: true)]
        public int DatabaseId { get; set; }

        public GetDatabasePostgresqlArgs()
        {
        }
        public static new GetDatabasePostgresqlArgs Empty => new GetDatabasePostgresqlArgs();
    }

    public sealed class GetDatabasePostgresqlInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the PostgreSQL database.
        /// </summary>
        [Input("databaseId", required: true)]
        public Input<int> DatabaseId { get; set; } = null!;

        public GetDatabasePostgresqlInvokeArgs()
        {
        }
        public static new GetDatabasePostgresqlInvokeArgs Empty => new GetDatabasePostgresqlInvokeArgs();
    }


    [OutputType]
    public sealed class GetDatabasePostgresqlResult
    {
        public readonly ImmutableArray<string> AllowLists;
        public readonly string CaCert;
        public readonly int ClusterSize;
        public readonly string Created;
        public readonly int DatabaseId;
        public readonly bool Encrypted;
        public readonly string Engine;
        public readonly string EngineId;
        public readonly string HostPrimary;
        public readonly string HostSecondary;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Label;
        public readonly int Port;
        public readonly string Region;
        public readonly string ReplicationCommitType;
        public readonly string ReplicationType;
        public readonly string RootPassword;
        public readonly string RootUsername;
        public readonly bool SslConnection;
        public readonly string Status;
        public readonly string Type;
        public readonly string Updated;
        public readonly ImmutableArray<Outputs.GetDatabasePostgresqlUpdateResult> Updates;
        public readonly string Version;

        [OutputConstructor]
        private GetDatabasePostgresqlResult(
            ImmutableArray<string> allowLists,

            string caCert,

            int clusterSize,

            string created,

            int databaseId,

            bool encrypted,

            string engine,

            string engineId,

            string hostPrimary,

            string hostSecondary,

            string id,

            string label,

            int port,

            string region,

            string replicationCommitType,

            string replicationType,

            string rootPassword,

            string rootUsername,

            bool sslConnection,

            string status,

            string type,

            string updated,

            ImmutableArray<Outputs.GetDatabasePostgresqlUpdateResult> updates,

            string version)
        {
            AllowLists = allowLists;
            CaCert = caCert;
            ClusterSize = clusterSize;
            Created = created;
            DatabaseId = databaseId;
            Encrypted = encrypted;
            Engine = engine;
            EngineId = engineId;
            HostPrimary = hostPrimary;
            HostSecondary = hostSecondary;
            Id = id;
            Label = label;
            Port = port;
            Region = region;
            ReplicationCommitType = replicationCommitType;
            ReplicationType = replicationType;
            RootPassword = rootPassword;
            RootUsername = rootUsername;
            SslConnection = sslConnection;
            Status = status;
            Type = type;
            Updated = updated;
            Updates = updates;
            Version = version;
        }
    }
}
