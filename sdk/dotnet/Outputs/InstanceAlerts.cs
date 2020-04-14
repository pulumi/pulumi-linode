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
    public sealed class InstanceAlerts
    {
        public readonly int? Cpu;
        public readonly int? Io;
        public readonly int? NetworkIn;
        public readonly int? NetworkOut;
        public readonly int? TransferQuota;

        [OutputConstructor]
        private InstanceAlerts(
            int? cpu,

            int? io,

            int? networkIn,

            int? networkOut,

            int? transferQuota)
        {
            Cpu = cpu;
            Io = io;
            NetworkIn = networkIn;
            NetworkOut = networkOut;
            TransferQuota = transferQuota;
        }
    }
}
