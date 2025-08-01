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
    public sealed class GetKernelsKernelResult
    {
        /// <summary>
        /// The architecture of this Kernel.
        /// </summary>
        public readonly string Architecture;
        /// <summary>
        /// The date on which this Kernel was built.
        /// </summary>
        public readonly string Built;
        /// <summary>
        /// Whether or not this Kernel is deprecated.
        /// </summary>
        public readonly bool Deprecated;
        /// <summary>
        /// The unique ID of this Kernel.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// If this Kernel is suitable for KVM Linodes.
        /// </summary>
        public readonly bool Kvm;
        /// <summary>
        /// The friendly name of this Kernel.
        /// </summary>
        public readonly string Label;
        /// <summary>
        /// If this Kernel is suitable for paravirtualized operations.
        /// </summary>
        public readonly bool Pvops;
        /// <summary>
        /// Linux Kernel version
        /// </summary>
        public readonly string Version;
        /// <summary>
        /// If this Kernel is suitable for Xen Linodes.
        /// </summary>
        public readonly bool Xen;

        [OutputConstructor]
        private GetKernelsKernelResult(
            string architecture,

            string built,

            bool deprecated,

            string id,

            bool kvm,

            string label,

            bool pvops,

            string version,

            bool xen)
        {
            Architecture = architecture;
            Built = built;
            Deprecated = deprecated;
            Id = id;
            Kvm = kvm;
            Label = label;
            Pvops = pvops;
            Version = version;
            Xen = xen;
        }
    }
}
