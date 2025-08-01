// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Inputs
{

    public sealed class GetLkeClustersLkeClusterInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enables the App Platform Layer for this cluster. Note: v4beta only and may not currently be available to all users.
        /// </summary>
        [Input("aplEnabled", required: true)]
        public Input<bool> AplEnabled { get; set; } = null!;

        /// <summary>
        /// Defines settings for the Kubernetes Control Plane.
        /// </summary>
        [Input("controlPlane")]
        public Input<Inputs.GetLkeClustersLkeClusterControlPlaneInputArgs>? ControlPlane { get; set; }

        /// <summary>
        /// When this Kubernetes cluster was created.
        /// </summary>
        [Input("created", required: true)]
        public Input<string> Created { get; set; } = null!;

        /// <summary>
        /// The LKE Cluster's ID.
        /// </summary>
        [Input("id", required: true)]
        public Input<int> Id { get; set; } = null!;

        /// <summary>
        /// The Kubernetes version for this Kubernetes cluster in the format of `major.minor` (e.g. `1.17`).
        /// </summary>
        [Input("k8sVersion", required: true)]
        public Input<string> K8sVersion { get; set; } = null!;

        /// <summary>
        /// The unique label for the cluster.
        /// </summary>
        [Input("label", required: true)]
        public Input<string> Label { get; set; } = null!;

        /// <summary>
        /// This Kubernetes cluster's location.
        /// </summary>
        [Input("region", required: true)]
        public Input<string> Region { get; set; } = null!;

        /// <summary>
        /// The status of the cluster.
        /// </summary>
        [Input("status", required: true)]
        public Input<string> Status { get; set; } = null!;

        [Input("tags", required: true)]
        private InputList<string>? _tags;

        /// <summary>
        /// An array of tags applied to this object. Tags are case-insensitive and are for organizational purposes only.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        /// <summary>
        /// The desired Kubernetes tier. (**Note: v4beta only and may not currently be available to all users.**)
        /// </summary>
        [Input("tier", required: true)]
        public Input<string> Tier { get; set; } = null!;

        /// <summary>
        /// When this Kubernetes cluster was updated.
        /// </summary>
        [Input("updated", required: true)]
        public Input<string> Updated { get; set; } = null!;

        public GetLkeClustersLkeClusterInputArgs()
        {
        }
        public static new GetLkeClustersLkeClusterInputArgs Empty => new GetLkeClustersLkeClusterInputArgs();
    }
}
