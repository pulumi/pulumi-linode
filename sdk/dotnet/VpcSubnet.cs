// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode
{
    /// <summary>
    /// Manages a Linode VPC subnet.
    /// 
    /// ## Example Usage
    /// 
    /// Create a VPC subnet:
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
    ///     var test = new Linode.VpcSubnet("test", new()
    ///     {
    ///         Ipv4 = "10.0.0.0/24",
    ///         Label = "test-subnet",
    ///         VpcId = 123,
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// Linode Virtual Private Cloud (VPC) Subnet can be imported using the `vpc_id` followed by the subnet `id` separated by a comma, e.g.
    /// 
    /// ```sh
    /// $ pulumi import linode:index/vpcSubnet:VpcSubnet my_subnet_duplicated 1234567,7654321
    /// ```
    /// </summary>
    [LinodeResourceType("linode:index/vpcSubnet:VpcSubnet")]
    public partial class VpcSubnet : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The date and time when the VPC was created.
        /// </summary>
        [Output("created")]
        public Output<string> Created { get; private set; } = null!;

        /// <summary>
        /// The IPv4 range of this subnet in CIDR format.
        /// </summary>
        [Output("ipv4")]
        public Output<string> Ipv4 { get; private set; } = null!;

        /// <summary>
        /// The label of the VPC. Only contains ASCII letters, digits and dashes.
        /// </summary>
        [Output("label")]
        public Output<string> Label { get; private set; } = null!;

        /// <summary>
        /// A list of Linode IDs that added to this subnet.
        /// </summary>
        [Output("linodes")]
        public Output<ImmutableArray<Outputs.VpcSubnetLinode>> Linodes { get; private set; } = null!;

        /// <summary>
        /// The date and time when the VPC was last updated.
        /// </summary>
        [Output("updated")]
        public Output<string> Updated { get; private set; } = null!;

        /// <summary>
        /// The id of the parent VPC for this VPC Subnet.
        /// </summary>
        [Output("vpcId")]
        public Output<int> VpcId { get; private set; } = null!;


        /// <summary>
        /// Create a VpcSubnet resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public VpcSubnet(string name, VpcSubnetArgs args, CustomResourceOptions? options = null)
            : base("linode:index/vpcSubnet:VpcSubnet", name, args ?? new VpcSubnetArgs(), MakeResourceOptions(options, ""))
        {
        }

        private VpcSubnet(string name, Input<string> id, VpcSubnetState? state = null, CustomResourceOptions? options = null)
            : base("linode:index/vpcSubnet:VpcSubnet", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing VpcSubnet resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static VpcSubnet Get(string name, Input<string> id, VpcSubnetState? state = null, CustomResourceOptions? options = null)
        {
            return new VpcSubnet(name, id, state, options);
        }
    }

    public sealed class VpcSubnetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The IPv4 range of this subnet in CIDR format.
        /// </summary>
        [Input("ipv4", required: true)]
        public Input<string> Ipv4 { get; set; } = null!;

        /// <summary>
        /// The label of the VPC. Only contains ASCII letters, digits and dashes.
        /// </summary>
        [Input("label", required: true)]
        public Input<string> Label { get; set; } = null!;

        /// <summary>
        /// The id of the parent VPC for this VPC Subnet.
        /// </summary>
        [Input("vpcId", required: true)]
        public Input<int> VpcId { get; set; } = null!;

        public VpcSubnetArgs()
        {
        }
        public static new VpcSubnetArgs Empty => new VpcSubnetArgs();
    }

    public sealed class VpcSubnetState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The date and time when the VPC was created.
        /// </summary>
        [Input("created")]
        public Input<string>? Created { get; set; }

        /// <summary>
        /// The IPv4 range of this subnet in CIDR format.
        /// </summary>
        [Input("ipv4")]
        public Input<string>? Ipv4 { get; set; }

        /// <summary>
        /// The label of the VPC. Only contains ASCII letters, digits and dashes.
        /// </summary>
        [Input("label")]
        public Input<string>? Label { get; set; }

        [Input("linodes")]
        private InputList<Inputs.VpcSubnetLinodeGetArgs>? _linodes;

        /// <summary>
        /// A list of Linode IDs that added to this subnet.
        /// </summary>
        public InputList<Inputs.VpcSubnetLinodeGetArgs> Linodes
        {
            get => _linodes ?? (_linodes = new InputList<Inputs.VpcSubnetLinodeGetArgs>());
            set => _linodes = value;
        }

        /// <summary>
        /// The date and time when the VPC was last updated.
        /// </summary>
        [Input("updated")]
        public Input<string>? Updated { get; set; }

        /// <summary>
        /// The id of the parent VPC for this VPC Subnet.
        /// </summary>
        [Input("vpcId")]
        public Input<int>? VpcId { get; set; }

        public VpcSubnetState()
        {
        }
        public static new VpcSubnetState Empty => new VpcSubnetState();
    }
}
