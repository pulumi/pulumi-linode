// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode
{
    public static class GetInstanceType
    {
        /// <summary>
        /// Provides information about a Linode instance type
        /// 
        /// ## Example Usage
        /// 
        /// The following example shows how one might use this data source to access information about a Linode Instance type.
        /// 
        /// &lt;!--Start PulumiCodeChooser --&gt;
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var @default = Linode.GetInstanceType.Invoke(new()
        ///     {
        ///         Id = "g6-standard-2",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Task<GetInstanceTypeResult> InvokeAsync(GetInstanceTypeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetInstanceTypeResult>("linode:index/getInstanceType:getInstanceType", args ?? new GetInstanceTypeArgs(), options.WithDefaults());

        /// <summary>
        /// Provides information about a Linode instance type
        /// 
        /// ## Example Usage
        /// 
        /// The following example shows how one might use this data source to access information about a Linode Instance type.
        /// 
        /// &lt;!--Start PulumiCodeChooser --&gt;
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var @default = Linode.GetInstanceType.Invoke(new()
        ///     {
        ///         Id = "g6-standard-2",
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Output<GetInstanceTypeResult> Invoke(GetInstanceTypeInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetInstanceTypeResult>("linode:index/getInstanceType:getInstanceType", args ?? new GetInstanceTypeInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetInstanceTypeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Label used to identify instance type
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        /// <summary>
        /// The Linode Type's label is for display purposes only
        /// </summary>
        [Input("label")]
        public string? Label { get; set; }

        public GetInstanceTypeArgs()
        {
        }
        public static new GetInstanceTypeArgs Empty => new GetInstanceTypeArgs();
    }

    public sealed class GetInstanceTypeInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Label used to identify instance type
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        /// <summary>
        /// The Linode Type's label is for display purposes only
        /// </summary>
        [Input("label")]
        public Input<string>? Label { get; set; }

        public GetInstanceTypeInvokeArgs()
        {
        }
        public static new GetInstanceTypeInvokeArgs Empty => new GetInstanceTypeInvokeArgs();
    }


    [OutputType]
    public sealed class GetInstanceTypeResult
    {
        public readonly Outputs.GetInstanceTypeAddonsResult Addons;
        /// <summary>
        /// The class of the Linode Type. See all classes [here](https://www.linode.com/docs/api/linode-types/#type-view__responses).
        /// </summary>
        public readonly string Class;
        /// <summary>
        /// The Disk size, in MB, of the Linode Type
        /// </summary>
        public readonly int Disk;
        /// <summary>
        /// The ID representing the Linode Type
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The Linode Type's label is for display purposes only
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
        public readonly Outputs.GetInstanceTypePriceResult Price;
        public readonly ImmutableArray<Outputs.GetInstanceTypeRegionPriceResult> RegionPrices;
        /// <summary>
        /// The monthly outbound transfer amount, in MB.
        /// </summary>
        public readonly int Transfer;
        /// <summary>
        /// The number of VCPU cores this Linode Type offers.
        /// </summary>
        public readonly int Vcpus;

        [OutputConstructor]
        private GetInstanceTypeResult(
            Outputs.GetInstanceTypeAddonsResult addons,

            string @class,

            int disk,

            string id,

            string label,

            int memory,

            int networkOut,

            Outputs.GetInstanceTypePriceResult price,

            ImmutableArray<Outputs.GetInstanceTypeRegionPriceResult> regionPrices,

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
            Price = price;
            RegionPrices = regionPrices;
            Transfer = transfer;
            Vcpus = vcpus;
        }
    }
}
