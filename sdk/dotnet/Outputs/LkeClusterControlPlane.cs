// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Outputs
{

    [OutputType]
    public sealed class LkeClusterControlPlane
    {
        /// <summary>
        /// Defines the ACL configuration for an LKE cluster's control plane.
        /// </summary>
        public readonly Outputs.LkeClusterControlPlaneAcl? Acl;
        /// <summary>
        /// Defines whether High Availability is enabled for the cluster Control Plane. This is an **irreversible** change.
        /// 
        /// * `acl` - (Optional) Defines the ACL configuration for an LKE cluster's control plane.
        /// </summary>
        public readonly bool? HighAvailability;

        [OutputConstructor]
        private LkeClusterControlPlane(
            Outputs.LkeClusterControlPlaneAcl? acl,

            bool? highAvailability)
        {
            Acl = acl;
            HighAvailability = highAvailability;
        }
    }
}
