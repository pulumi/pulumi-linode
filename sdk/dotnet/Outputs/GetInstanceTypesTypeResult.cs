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
    public sealed class GetInstanceTypesTypeResult
    {
        public readonly ImmutableArray<Outputs.GetInstanceTypesTypeAddonResult> Addons;
        /// <summary>
        /// The class of the Linode Type. See all classes [here](https://www.linode.com/docs/api/linode-types/#type-view__responses).
        /// </summary>
        public readonly string Class;
        /// <summary>
        /// The Disk size, in MB, of the Linode Type.
        /// </summary>
        public readonly int Disk;
        /// <summary>
        /// The ID representing the Linode Type.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The Linode Type's label is for display purposes only.
        /// </summary>
        public readonly string Label;
        /// <summary>
        /// The amount of RAM included in this Linode Type.
        /// </summary>
        public readonly int Memory;
        /// <summary>
        /// The Mbits outbound bandwidth allocation.
        /// </summary>
        public readonly int NetworkOut;
        public readonly ImmutableArray<Outputs.GetInstanceTypesTypePriceResult> Prices;
        /// <summary>
        /// The monthly outbound transfer amount, in MB.
        /// </summary>
        public readonly int Transfer;
        /// <summary>
        /// The number of VCPU cores this Linode Type offers.
        /// </summary>
        public readonly int Vcpus;

        [OutputConstructor]
        private GetInstanceTypesTypeResult(
            ImmutableArray<Outputs.GetInstanceTypesTypeAddonResult> addons,

            string @class,

            int disk,

            string id,

            string label,

            int memory,

            int networkOut,

            ImmutableArray<Outputs.GetInstanceTypesTypePriceResult> prices,

            int transfer,

            int vcpus)
        {
            Addons = addons;
            Class = @class;
            Disk = disk;
            Id = id;
            Label = label;
            Memory = memory;
            NetworkOut = networkOut;
            Prices = prices;
            Transfer = transfer;
            Vcpus = vcpus;
        }
    }
}
