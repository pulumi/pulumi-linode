// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode
{
    public static class GetVpcSubnet
    {
        /// <summary>
        /// Provides information about a Linode VPC subnet.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// The following example shows how one might use this data source to access information about a Linode VPC subnet.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var foo = Linode.GetVpcSubnet.Invoke(new()
        ///     {
        ///         VpcId = 123,
        ///         Id = "12345",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["vpcSubnet"] = foo,
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetVpcSubnetResult> InvokeAsync(GetVpcSubnetArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetVpcSubnetResult>("linode:index/getVpcSubnet:getVpcSubnet", args ?? new GetVpcSubnetArgs(), options.WithDefaults());

        /// <summary>
        /// Provides information about a Linode VPC subnet.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// The following example shows how one might use this data source to access information about a Linode VPC subnet.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var foo = Linode.GetVpcSubnet.Invoke(new()
        ///     {
        ///         VpcId = 123,
        ///         Id = "12345",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["vpcSubnet"] = foo,
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetVpcSubnetResult> Invoke(GetVpcSubnetInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetVpcSubnetResult>("linode:index/getVpcSubnet:getVpcSubnet", args ?? new GetVpcSubnetInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetVpcSubnetArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The unique id of this VPC subnet.
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        /// <summary>
        /// The id of the parent VPC for this VPC Subnet.
        /// </summary>
        [Input("vpcId", required: true)]
        public int VpcId { get; set; }

        public GetVpcSubnetArgs()
        {
        }
        public static new GetVpcSubnetArgs Empty => new GetVpcSubnetArgs();
    }

    public sealed class GetVpcSubnetInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The unique id of this VPC subnet.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        /// <summary>
        /// The id of the parent VPC for this VPC Subnet.
        /// </summary>
        [Input("vpcId", required: true)]
        public Input<int> VpcId { get; set; } = null!;

        public GetVpcSubnetInvokeArgs()
        {
        }
        public static new GetVpcSubnetInvokeArgs Empty => new GetVpcSubnetInvokeArgs();
    }


    [OutputType]
    public sealed class GetVpcSubnetResult
    {
        /// <summary>
        /// The date and time when the VPC Subnet was created.
        /// </summary>
        public readonly string Created;
        public readonly string Id;
        /// <summary>
        /// The IPv4 range of this subnet in CIDR format.
        /// </summary>
        public readonly string Ipv4;
        /// <summary>
        /// The label of the VPC subnet.
        /// </summary>
        public readonly string Label;
        /// <summary>
        /// A list of Linode IDs that added to this subnet.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetVpcSubnetLinodeResult> Linodes;
        /// <summary>
        /// The date and time when the VPC Subnet was last updated.
        /// </summary>
        public readonly string Updated;
        public readonly int VpcId;

        [OutputConstructor]
        private GetVpcSubnetResult(
            string created,

            string id,

            string ipv4,

            string label,

            ImmutableArray<Outputs.GetVpcSubnetLinodeResult> linodes,

            string updated,

            int vpcId)
        {
            Created = created;
            Id = id;
            Ipv4 = ipv4;
            Label = label;
            Linodes = linodes;
            Updated = updated;
            VpcId = vpcId;
        }
    }
}
