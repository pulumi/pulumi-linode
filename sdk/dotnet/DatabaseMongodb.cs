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
    /// Provides a Linode Mongo Database resource. This can be used to create, modify, and delete Linode MongoDB Databases.
    /// For more information, see the [Linode APIv4 docs](https://www.linode.com/docs/api/databases/).
    /// 
    /// Please keep in mind that Managed Databases can take up to an hour to provision.
    /// 
    /// ## Example Usage
    /// 
    /// Creating a simple MongoDB database instance:
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Linode = Pulumi.Linode;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var foobar = new Linode.DatabaseMongodb("foobar", new()
    ///     {
    ///         EngineId = "mongodb/4.4.10",
    ///         Label = "mydatabase",
    ///         Region = "us-southeast",
    ///         Type = "g6-nanode-1",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// Creating a complex MongoDB database instance:
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Linode = Pulumi.Linode;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var foobar = new Linode.DatabaseMongodb("foobar", new()
    ///     {
    ///         AllowLists = new[]
    ///         {
    ///             "0.0.0.0/0",
    ///         },
    ///         ClusterSize = 3,
    ///         CompressionType = "zlib",
    ///         Encrypted = true,
    ///         EngineId = "mongodb/4.4.10",
    ///         Label = "mydatabase",
    ///         Region = "us-southeast",
    ///         SslConnection = true,
    ///         StorageEngine = "wiredtiger",
    ///         Type = "g6-nanode-1",
    ///         Updates = new Linode.Inputs.DatabaseMongodbUpdatesArgs
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
    /// ## updates
    /// 
    /// The following arguments are supported in the `updates` specification block:
    /// 
    /// * `day_of_week` - (Required) The day to perform maintenance. (`monday`, `tuesday`, ...)
    /// 
    /// * `duration` - (Required) The maximum maintenance window time in hours. (`1`..`3`)
    /// 
    /// * `frequency` - (Required) Whether maintenance occurs on a weekly or monthly basis. (`weekly`, `monthly`)
    /// 
    /// * `hour_of_day` - (Required) The hour to begin maintenance based in UTC time. (`0`..`23`)
    /// 
    /// * `week_of_month` - (Optional) The week of the month to perform monthly frequency updates. Required for `monthly` frequency updates. (`1`..`4`)
    /// 
    /// ## Import
    /// 
    /// Linode MongoDB Databases can be imported using the `id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import linode:index/databaseMongodb:DatabaseMongodb foobar 1234567
    /// ```
    /// </summary>
    [LinodeResourceType("linode:index/databaseMongodb:DatabaseMongodb")]
    public partial class DatabaseMongodb : global::Pulumi.CustomResource
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
        /// The type of data compression for this Database. (`none`, `snappy`, `zlib`; default `none`)
        /// </summary>
        [Output("compressionType")]
        public Output<string?> CompressionType { get; private set; } = null!;

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
        /// The Managed Database engine. (e.g. `mongodb`)
        /// </summary>
        [Output("engine")]
        public Output<string> Engine { get; private set; } = null!;

        /// <summary>
        /// The Managed Database engine in engine/version format. (e.g. `mongo/4.4.10`)
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
        /// A set of peer addresses for this Database.
        /// </summary>
        [Output("peers")]
        public Output<ImmutableArray<string>> Peers { get; private set; } = null!;

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
        /// Label for configuring a MongoDB replica set. Choose the same label on multiple Databases to include them in the same replica set.
        /// </summary>
        [Output("replicaSet")]
        public Output<string> ReplicaSet { get; private set; } = null!;

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
        /// The type of storage engine for this Database. (`mmapv1`, `wiredtiger`; default `wiredtiger`)
        /// </summary>
        [Output("storageEngine")]
        public Output<string?> StorageEngine { get; private set; } = null!;

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
        /// Configuration settings for automated patch update maintenance for the Managed Database.
        /// </summary>
        [Output("updates")]
        public Output<Outputs.DatabaseMongodbUpdates> Updates { get; private set; } = null!;

        /// <summary>
        /// The Managed Database engine version. (e.g. `v8.0.26`)
        /// </summary>
        [Output("version")]
        public Output<string> Version { get; private set; } = null!;


        /// <summary>
        /// Create a DatabaseMongodb resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DatabaseMongodb(string name, DatabaseMongodbArgs args, CustomResourceOptions? options = null)
            : base("linode:index/databaseMongodb:DatabaseMongodb", name, args ?? new DatabaseMongodbArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DatabaseMongodb(string name, Input<string> id, DatabaseMongodbState? state = null, CustomResourceOptions? options = null)
            : base("linode:index/databaseMongodb:DatabaseMongodb", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing DatabaseMongodb resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DatabaseMongodb Get(string name, Input<string> id, DatabaseMongodbState? state = null, CustomResourceOptions? options = null)
        {
            return new DatabaseMongodb(name, id, state, options);
        }
    }

    public sealed class DatabaseMongodbArgs : global::Pulumi.ResourceArgs
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
        /// The type of data compression for this Database. (`none`, `snappy`, `zlib`; default `none`)
        /// </summary>
        [Input("compressionType")]
        public Input<string>? CompressionType { get; set; }

        /// <summary>
        /// Whether the Managed Databases is encrypted. (default `false`)
        /// </summary>
        [Input("encrypted")]
        public Input<bool>? Encrypted { get; set; }

        /// <summary>
        /// The Managed Database engine in engine/version format. (e.g. `mongo/4.4.10`)
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
        /// Whether to require SSL credentials to establish a connection to the Managed Database. (default `false`)
        /// </summary>
        [Input("sslConnection")]
        public Input<bool>? SslConnection { get; set; }

        /// <summary>
        /// The type of storage engine for this Database. (`mmapv1`, `wiredtiger`; default `wiredtiger`)
        /// </summary>
        [Input("storageEngine")]
        public Input<string>? StorageEngine { get; set; }

        /// <summary>
        /// The Linode Instance type used for the nodes of the  Managed Database instance.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        /// <summary>
        /// Configuration settings for automated patch update maintenance for the Managed Database.
        /// </summary>
        [Input("updates")]
        public Input<Inputs.DatabaseMongodbUpdatesArgs>? Updates { get; set; }

        public DatabaseMongodbArgs()
        {
        }
        public static new DatabaseMongodbArgs Empty => new DatabaseMongodbArgs();
    }

    public sealed class DatabaseMongodbState : global::Pulumi.ResourceArgs
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
        /// The base64-encoded SSL CA certificate for the Managed Database instance.
        /// </summary>
        [Input("caCert")]
        public Input<string>? CaCert { get; set; }

        /// <summary>
        /// The number of Linode Instance nodes deployed to the Managed Database. (default `1`)
        /// </summary>
        [Input("clusterSize")]
        public Input<int>? ClusterSize { get; set; }

        /// <summary>
        /// The type of data compression for this Database. (`none`, `snappy`, `zlib`; default `none`)
        /// </summary>
        [Input("compressionType")]
        public Input<string>? CompressionType { get; set; }

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
        /// The Managed Database engine. (e.g. `mongodb`)
        /// </summary>
        [Input("engine")]
        public Input<string>? Engine { get; set; }

        /// <summary>
        /// The Managed Database engine in engine/version format. (e.g. `mongo/4.4.10`)
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

        [Input("peers")]
        private InputList<string>? _peers;

        /// <summary>
        /// A set of peer addresses for this Database.
        /// </summary>
        public InputList<string> Peers
        {
            get => _peers ?? (_peers = new InputList<string>());
            set => _peers = value;
        }

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
        /// Label for configuring a MongoDB replica set. Choose the same label on multiple Databases to include them in the same replica set.
        /// </summary>
        [Input("replicaSet")]
        public Input<string>? ReplicaSet { get; set; }

        /// <summary>
        /// The randomly-generated root password for the Managed Database instance.
        /// </summary>
        [Input("rootPassword")]
        public Input<string>? RootPassword { get; set; }

        /// <summary>
        /// The root username for the Managed Database instance.
        /// </summary>
        [Input("rootUsername")]
        public Input<string>? RootUsername { get; set; }

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
        /// The type of storage engine for this Database. (`mmapv1`, `wiredtiger`; default `wiredtiger`)
        /// </summary>
        [Input("storageEngine")]
        public Input<string>? StorageEngine { get; set; }

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
        /// Configuration settings for automated patch update maintenance for the Managed Database.
        /// </summary>
        [Input("updates")]
        public Input<Inputs.DatabaseMongodbUpdatesGetArgs>? Updates { get; set; }

        /// <summary>
        /// The Managed Database engine version. (e.g. `v8.0.26`)
        /// </summary>
        [Input("version")]
        public Input<string>? Version { get; set; }

        public DatabaseMongodbState()
        {
        }
        public static new DatabaseMongodbState Empty => new DatabaseMongodbState();
    }
}
