// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Outputs
{

    [OutputType]
    public sealed class GetInstancesInstanceAlertsResult
    {
        /// <summary>
        /// The percentage of CPU usage required to trigger an alert. If the average CPU usage over two hours exceeds this value, we'll send you an alert. If this is set to 0, the alert is disabled.
        /// </summary>
        public readonly int Cpu;
        /// <summary>
        /// The amount of disk IO operation per second required to trigger an alert. If the average disk IO over two hours exceeds this value, we'll send you an alert. If set to 0, this alert is disabled.
        /// </summary>
        public readonly int Io;
        /// <summary>
        /// The amount of incoming traffic, in Mbit/s, required to trigger an alert. If the average incoming traffic over two hours exceeds this value, we'll send you an alert. If this is set to 0 (zero), the alert is disabled.
        /// </summary>
        public readonly int NetworkIn;
        /// <summary>
        /// The amount of outbound traffic, in Mbit/s, required to trigger an alert. If the average outbound traffic over two hours exceeds this value, we'll send you an alert. If this is set to 0 (zero), the alert is disabled.
        /// </summary>
        public readonly int NetworkOut;
        /// <summary>
        /// The percentage of network transfer that may be used before an alert is triggered. When this value is exceeded, we'll alert you. If this is set to 0 (zero), the alert is disabled.
        /// </summary>
        public readonly int TransferQuota;

        [OutputConstructor]
        private GetInstancesInstanceAlertsResult(
            int cpu,

            int io,

            int networkIn,

            int networkOut,

            int transferQuota)
        {
            Cpu = cpu;
            Io = io;
            NetworkIn = networkIn;
            NetworkOut = networkOut;
            TransferQuota = transferQuota;
        }
    }
}
