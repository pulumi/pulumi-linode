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
    public sealed class GetLkeClustersLkeClusterControlPlaneResult
    {
        /// <summary>
        /// Defines whether High Availability is enabled for the Control Plane Components of the cluster.
        /// </summary>
        public readonly bool HighAvailability;

        [OutputConstructor]
        private GetLkeClustersLkeClusterControlPlaneResult(bool highAvailability)
        {
            HighAvailability = highAvailability;
        }
    }
}
