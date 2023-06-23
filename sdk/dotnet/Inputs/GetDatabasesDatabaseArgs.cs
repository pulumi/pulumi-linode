// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Inputs
{

    public sealed class GetDatabasesDatabaseInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("allowLists", required: true)]
        private InputList<string>? _allowLists;

        /// <summary>
        /// A list of IP addresses that can access the Managed Database.
        /// </summary>
        public InputList<string> AllowLists
        {
            get => _allowLists ?? (_allowLists = new InputList<string>());
            set => _allowLists = value;
        }

        /// <summary>
        /// The number of Linode Instance nodes deployed to the Managed Database.
        /// </summary>
        [Input("clusterSize", required: true)]
        public Input<int> ClusterSize { get; set; } = null!;

        /// <summary>
        /// When this Managed Database was created.
        /// </summary>
        [Input("created", required: true)]
        public Input<string> Created { get; set; } = null!;

        /// <summary>
        /// Whether the Managed Databases is encrypted.
        /// </summary>
        [Input("encrypted", required: true)]
        public Input<bool> Encrypted { get; set; } = null!;

        /// <summary>
        /// The Managed Database engine.
        /// </summary>
        [Input("engine", required: true)]
        public Input<string> Engine { get; set; } = null!;

        /// <summary>
        /// The primary host for the Managed Database.
        /// </summary>
        [Input("hostPrimary", required: true)]
        public Input<string> HostPrimary { get; set; } = null!;

        /// <summary>
        /// The secondary/private network host for the Managed Database.
        /// </summary>
        [Input("hostSecondary", required: true)]
        public Input<string> HostSecondary { get; set; } = null!;

        /// <summary>
        /// The ID of the Managed Database.
        /// </summary>
        [Input("id", required: true)]
        public Input<int> Id { get; set; } = null!;

        [Input("instanceUri", required: true)]
        public Input<string> InstanceUri { get; set; } = null!;

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
        /// The replication method used for the Managed Database.
        /// </summary>
        [Input("replicationType", required: true)]
        public Input<string> ReplicationType { get; set; } = null!;

        /// <summary>
        /// Whether to require SSL credentials to establish a connection to the Managed Database.
        /// </summary>
        [Input("sslConnection", required: true)]
        public Input<bool> SslConnection { get; set; } = null!;

        /// <summary>
        /// The operating status of the Managed Database.
        /// </summary>
        [Input("status", required: true)]
        public Input<string> Status { get; set; } = null!;

        /// <summary>
        /// The Linode Instance type used for the nodes of the  Managed Database instance.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        /// <summary>
        /// When this Managed Database was last updated.
        /// </summary>
        [Input("updated", required: true)]
        public Input<string> Updated { get; set; } = null!;

        /// <summary>
        /// The Managed Database engine version.
        /// </summary>
        [Input("version", required: true)]
        public Input<string> Version { get; set; } = null!;

        public GetDatabasesDatabaseInputArgs()
        {
        }
        public static new GetDatabasesDatabaseInputArgs Empty => new GetDatabasesDatabaseInputArgs();
    }
}
