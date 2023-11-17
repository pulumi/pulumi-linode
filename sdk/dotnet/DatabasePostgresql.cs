// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode
{
    /// <summary>
    /// Provides a Linode PostgreSQL Database resource. This can be used to create, modify, and delete Linode PostgreSQL Databases.
    /// For more information, see the [Linode APIv4 docs](https://www.linode.com/docs/api/databases/).
    /// 
    /// Please keep in mind that Managed Databases can take up to an hour to provision.
    /// 
    /// ## Example Usage
    /// 
    /// Creating a simple PostgreSQL database instance:
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Linode = Pulumi.Linode;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var foobar = new Linode.DatabasePostgresql("foobar", new()
    ///     {
    ///         EngineId = "postgresql/13.2",
    ///         Label = "mydatabase",
    ///         Region = "us-southeast",
    ///         Type = "g6-nanode-1",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// Creating a complex PostgreSQL database instance:
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Linode = Pulumi.Linode;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var foobar = new Linode.DatabasePostgresql("foobar", new()
    ///     {
    ///         AllowLists = new[]
    ///         {
    ///             "0.0.0.0/0",
    ///         },
    ///         ClusterSize = 3,
    ///         Encrypted = true,
    ///         EngineId = "postgresql/13.2",
    ///         Label = "mydatabase",
    ///         Region = "us-southeast",
    ///         ReplicationCommitType = "remote_write",
    ///         ReplicationType = "semi_synch",
    ///         SslConnection = true,
    ///         Type = "g6-nanode-1",
    ///         Updates = new Linode.Inputs.DatabasePostgresqlUpdatesArgs
    ///         {
    ///             DayOfWeek = "saturday",
    ///             Duration = 1,
    ///             Frequency = "monthly",
    ///             HourOfDay = 22,
    ///             WeekOfMonth = 2,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Linode PostgreSQL Databases can be imported using the `id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import linode:index/databasePostgresql:DatabasePostgresql foobar 1234567
    /// ```
    /// </summary>
    [LinodeResourceType("linode:index/databasePostgresql:DatabasePostgresql")]
    public partial class DatabasePostgresql : global::Pulumi.CustomResource
    {
        /// <summary>
        /// A list of IP addresses that can access the Managed Database. Each item can be a single IP address or a range in CIDR format. Use `linode.DatabaseAccessControls` to manage your allow list separately.
        /// </summary>
        [Output("allowLists")]
        public Output<ImmutableArray<string>> AllowLists { get; private set; } = null!;

        /// <summary>
        /// The base64-encoded SSL CA certificate for the Managed Database instance.
        /// </summary>
        [Output("caCert")]
        public Output<string> CaCert { get; private set; } = null!;

        /// <summary>
        /// The number of Linode Instance nodes deployed to the Managed Database. (default `1`)
        /// </summary>
        [Output("clusterSize")]
        public Output<int?> ClusterSize { get; private set; } = null!;

        /// <summary>
        /// When this Managed Database was created.
        /// </summary>
        [Output("created")]
        public Output<string> Created { get; private set; } = null!;

        /// <summary>
        /// Whether the Managed Databases is encrypted. (default `false`)
        /// </summary>
        [Output("encrypted")]
        public Output<bool?> Encrypted { get; private set; } = null!;

        /// <summary>
        /// The Managed Database engine. (e.g. `postgresql`)
        /// </summary>
        [Output("engine")]
        public Output<string> Engine { get; private set; } = null!;

        /// <summary>
        /// The Managed Database engine in engine/version format. (e.g. `postgresql/13.2`)
        /// </summary>
        [Output("engineId")]
        public Output<string> EngineId { get; private set; } = null!;

        /// <summary>
        /// The primary host for the Managed Database.
        /// </summary>
        [Output("hostPrimary")]
        public Output<string> HostPrimary { get; private set; } = null!;

        /// <summary>
        /// The secondary/private network host for the Managed Database.
        /// </summary>
        [Output("hostSecondary")]
        public Output<string> HostSecondary { get; private set; } = null!;

        /// <summary>
        /// A unique, user-defined string referring to the Managed Database.
        /// </summary>
        [Output("label")]
        public Output<string> Label { get; private set; } = null!;

        /// <summary>
        /// The access port for this Managed Database.
        /// </summary>
        [Output("port")]
        public Output<int> Port { get; private set; } = null!;

        /// <summary>
        /// The region to use for the Managed Database.
        /// </summary>
        [Output("region")]
        public Output<string> Region { get; private set; } = null!;

        /// <summary>
        /// The synchronization level of the replicating server. (`on`, `local`, `remote_write`, `remote_apply`, `off`; default `off`)
        /// * Must be `local` or `off` for the `asynch` replication type.
        /// 
        /// 
        /// * Must be `on`, `remote_write`, or `remote_apply` for the `semi_synch` replication type.
        /// </summary>
        [Output("replicationCommitType")]
        public Output<string?> ReplicationCommitType { get; private set; } = null!;

        /// <summary>
        /// The replication method used for the Managed Database. (`none`, `asynch`, `semi_synch`; default `none`)
        /// * Must be `none` for a single node cluster.
        /// 
        /// 
        /// * Must be `asynch` or `semi_synch` for a high availability cluster.
        /// </summary>
        [Output("replicationType")]
        public Output<string?> ReplicationType { get; private set; } = null!;

        /// <summary>
        /// The randomly-generated root password for the Managed Database instance.
        /// </summary>
        [Output("rootPassword")]
        public Output<string> RootPassword { get; private set; } = null!;

        /// <summary>
        /// The root username for the Managed Database instance.
        /// </summary>
        [Output("rootUsername")]
        public Output<string> RootUsername { get; private set; } = null!;

        /// <summary>
        /// Whether to require SSL credentials to establish a connection to the Managed Database. (default `false`)
        /// </summary>
        [Output("sslConnection")]
        public Output<bool?> SslConnection { get; private set; } = null!;

        /// <summary>
        /// The operating status of the Managed Database.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// The Linode Instance type used for the nodes of the  Managed Database instance.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        /// <summary>
        /// When this Managed Database was last updated.
        /// </summary>
        [Output("updated")]
        public Output<string> Updated { get; private set; } = null!;

        /// <summary>
        /// `updates` - (Optional) Configuration settings for automated patch update maintenance for the Managed Database.
        /// </summary>
        [Output("updates")]
        public Output<Outputs.DatabasePostgresqlUpdates> Updates { get; private set; } = null!;

        /// <summary>
        /// The Managed Database engine version. (e.g. `13.2`)
        /// </summary>
        [Output("version")]
        public Output<string> Version { get; private set; } = null!;


        /// <summary>
        /// Create a DatabasePostgresql resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DatabasePostgresql(string name, DatabasePostgresqlArgs args, CustomResourceOptions? options = null)
            : base("linode:index/databasePostgresql:DatabasePostgresql", name, args ?? new DatabasePostgresqlArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DatabasePostgresql(string name, Input<string> id, DatabasePostgresqlState? state = null, CustomResourceOptions? options = null)
            : base("linode:index/databasePostgresql:DatabasePostgresql", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "caCert",
                    "rootPassword",
                    "rootUsername",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing DatabasePostgresql resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DatabasePostgresql Get(string name, Input<string> id, DatabasePostgresqlState? state = null, CustomResourceOptions? options = null)
        {
            return new DatabasePostgresql(name, id, state, options);
        }
    }

    public sealed class DatabasePostgresqlArgs : global::Pulumi.ResourceArgs
    {
        [Input("allowLists")]
        private InputList<string>? _allowLists;

        /// <summary>
        /// A list of IP addresses that can access the Managed Database. Each item can be a single IP address or a range in CIDR format. Use `linode.DatabaseAccessControls` to manage your allow list separately.
        /// </summary>
        public InputList<string> AllowLists
        {
            get => _allowLists ?? (_allowLists = new InputList<string>());
            set => _allowLists = value;
        }

        /// <summary>
        /// The number of Linode Instance nodes deployed to the Managed Database. (default `1`)
        /// </summary>
        [Input("clusterSize")]
        public Input<int>? ClusterSize { get; set; }

        /// <summary>
        /// Whether the Managed Databases is encrypted. (default `false`)
        /// </summary>
        [Input("encrypted")]
        public Input<bool>? Encrypted { get; set; }

        /// <summary>
        /// The Managed Database engine in engine/version format. (e.g. `postgresql/13.2`)
        /// </summary>
        [Input("engineId", required: true)]
        public Input<string> EngineId { get; set; } = null!;

        /// <summary>
        /// A unique, user-defined string referring to the Managed Database.
        /// </summary>
        [Input("label", required: true)]
        public Input<string> Label { get; set; } = null!;

        /// <summary>
        /// The region to use for the Managed Database.
        /// </summary>
        [Input("region", required: true)]
        public Input<string> Region { get; set; } = null!;

        /// <summary>
        /// The synchronization level of the replicating server. (`on`, `local`, `remote_write`, `remote_apply`, `off`; default `off`)
        /// * Must be `local` or `off` for the `asynch` replication type.
        /// 
        /// 
        /// * Must be `on`, `remote_write`, or `remote_apply` for the `semi_synch` replication type.
        /// </summary>
        [Input("replicationCommitType")]
        public Input<string>? ReplicationCommitType { get; set; }

        /// <summary>
        /// The replication method used for the Managed Database. (`none`, `asynch`, `semi_synch`; default `none`)
        /// * Must be `none` for a single node cluster.
        /// 
        /// 
        /// * Must be `asynch` or `semi_synch` for a high availability cluster.
        /// </summary>
        [Input("replicationType")]
        public Input<string>? ReplicationType { get; set; }

        /// <summary>
        /// Whether to require SSL credentials to establish a connection to the Managed Database. (default `false`)
        /// </summary>
        [Input("sslConnection")]
        public Input<bool>? SslConnection { get; set; }

        /// <summary>
        /// The Linode Instance type used for the nodes of the  Managed Database instance.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        /// <summary>
        /// `updates` - (Optional) Configuration settings for automated patch update maintenance for the Managed Database.
        /// </summary>
        [Input("updates")]
        public Input<Inputs.DatabasePostgresqlUpdatesArgs>? Updates { get; set; }

        public DatabasePostgresqlArgs()
        {
        }
        public static new DatabasePostgresqlArgs Empty => new DatabasePostgresqlArgs();
    }

    public sealed class DatabasePostgresqlState : global::Pulumi.ResourceArgs
    {
        [Input("allowLists")]
        private InputList<string>? _allowLists;

        /// <summary>
        /// A list of IP addresses that can access the Managed Database. Each item can be a single IP address or a range in CIDR format. Use `linode.DatabaseAccessControls` to manage your allow list separately.
        /// </summary>
        public InputList<string> AllowLists
        {
            get => _allowLists ?? (_allowLists = new InputList<string>());
            set => _allowLists = value;
        }

        [Input("caCert")]
        private Input<string>? _caCert;

        /// <summary>
        /// The base64-encoded SSL CA certificate for the Managed Database instance.
        /// </summary>
        public Input<string>? CaCert
        {
            get => _caCert;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _caCert = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The number of Linode Instance nodes deployed to the Managed Database. (default `1`)
        /// </summary>
        [Input("clusterSize")]
        public Input<int>? ClusterSize { get; set; }

        /// <summary>
        /// When this Managed Database was created.
        /// </summary>
        [Input("created")]
        public Input<string>? Created { get; set; }

        /// <summary>
        /// Whether the Managed Databases is encrypted. (default `false`)
        /// </summary>
        [Input("encrypted")]
        public Input<bool>? Encrypted { get; set; }

        /// <summary>
        /// The Managed Database engine. (e.g. `postgresql`)
        /// </summary>
        [Input("engine")]
        public Input<string>? Engine { get; set; }

        /// <summary>
        /// The Managed Database engine in engine/version format. (e.g. `postgresql/13.2`)
        /// </summary>
        [Input("engineId")]
        public Input<string>? EngineId { get; set; }

        /// <summary>
        /// The primary host for the Managed Database.
        /// </summary>
        [Input("hostPrimary")]
        public Input<string>? HostPrimary { get; set; }

        /// <summary>
        /// The secondary/private network host for the Managed Database.
        /// </summary>
        [Input("hostSecondary")]
        public Input<string>? HostSecondary { get; set; }

        /// <summary>
        /// A unique, user-defined string referring to the Managed Database.
        /// </summary>
        [Input("label")]
        public Input<string>? Label { get; set; }

        /// <summary>
        /// The access port for this Managed Database.
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        /// <summary>
        /// The region to use for the Managed Database.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// The synchronization level of the replicating server. (`on`, `local`, `remote_write`, `remote_apply`, `off`; default `off`)
        /// * Must be `local` or `off` for the `asynch` replication type.
        /// 
        /// 
        /// * Must be `on`, `remote_write`, or `remote_apply` for the `semi_synch` replication type.
        /// </summary>
        [Input("replicationCommitType")]
        public Input<string>? ReplicationCommitType { get; set; }

        /// <summary>
        /// The replication method used for the Managed Database. (`none`, `asynch`, `semi_synch`; default `none`)
        /// * Must be `none` for a single node cluster.
        /// 
        /// 
        /// * Must be `asynch` or `semi_synch` for a high availability cluster.
        /// </summary>
        [Input("replicationType")]
        public Input<string>? ReplicationType { get; set; }

        [Input("rootPassword")]
        private Input<string>? _rootPassword;

        /// <summary>
        /// The randomly-generated root password for the Managed Database instance.
        /// </summary>
        public Input<string>? RootPassword
        {
            get => _rootPassword;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _rootPassword = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("rootUsername")]
        private Input<string>? _rootUsername;

        /// <summary>
        /// The root username for the Managed Database instance.
        /// </summary>
        public Input<string>? RootUsername
        {
            get => _rootUsername;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _rootUsername = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Whether to require SSL credentials to establish a connection to the Managed Database. (default `false`)
        /// </summary>
        [Input("sslConnection")]
        public Input<bool>? SslConnection { get; set; }

        /// <summary>
        /// The operating status of the Managed Database.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// The Linode Instance type used for the nodes of the  Managed Database instance.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// When this Managed Database was last updated.
        /// </summary>
        [Input("updated")]
        public Input<string>? Updated { get; set; }

        /// <summary>
        /// `updates` - (Optional) Configuration settings for automated patch update maintenance for the Managed Database.
        /// </summary>
        [Input("updates")]
        public Input<Inputs.DatabasePostgresqlUpdatesGetArgs>? Updates { get; set; }

        /// <summary>
        /// The Managed Database engine version. (e.g. `13.2`)
        /// </summary>
        [Input("version")]
        public Input<string>? Version { get; set; }

        public DatabasePostgresqlState()
        {
        }
        public static new DatabasePostgresqlState Empty => new DatabasePostgresqlState();
    }
}
