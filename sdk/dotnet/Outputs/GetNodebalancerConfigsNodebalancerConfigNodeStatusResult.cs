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
    public sealed class GetNodebalancerConfigsNodebalancerConfigNodeStatusResult
    {
        /// <summary>
        /// The number of backends considered to be 'DOWN' and unhealthy. These are not in rotation, and not serving requests.
        /// </summary>
        public readonly int Down;
        /// <summary>
        /// The number of backends considered to be 'UP' and healthy, and that are serving requests.
        /// </summary>
        public readonly int Up;

        [OutputConstructor]
        private GetNodebalancerConfigsNodebalancerConfigNodeStatusResult(
            int down,

            int up)
        {
            Down = down;
            Up = up;
        }
    }
}
