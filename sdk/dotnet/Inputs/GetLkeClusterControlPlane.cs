// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Inputs
{

    public sealed class GetLkeClusterControlPlaneArgs : global::Pulumi.InvokeArgs
    {
        [Input("acls")]
        private List<Inputs.GetLkeClusterControlPlaneAclArgs>? _acls;

        /// <summary>
        /// The ACL configuration for an LKE cluster's control plane.
        /// </summary>
        public List<Inputs.GetLkeClusterControlPlaneAclArgs> Acls
        {
            get => _acls ?? (_acls = new List<Inputs.GetLkeClusterControlPlaneAclArgs>());
            set => _acls = value;
        }

        /// <summary>
        /// Whether High Availability is enabled for the cluster Control Plane.
        /// </summary>
        [Input("highAvailability", required: true)]
        public bool HighAvailability { get; set; }

        public GetLkeClusterControlPlaneArgs()
        {
        }
        public static new GetLkeClusterControlPlaneArgs Empty => new GetLkeClusterControlPlaneArgs();
    }
}
