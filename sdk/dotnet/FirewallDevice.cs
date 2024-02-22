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
    /// Manages a Linode Firewall Device.
    /// 
    /// **NOTICE:** Attaching a Linode Firewall Device to a `linode.Firewall` resource with user-defined `linodes` may cause device conflicts.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Linode = Pulumi.Linode;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var myFirewall = new Linode.Firewall("myFirewall", new()
    ///     {
    ///         Label = "my_firewall",
    ///         Inbounds = new[]
    ///         {
    ///             new Linode.Inputs.FirewallInboundArgs
    ///             {
    ///                 Label = "http",
    ///                 Action = "ACCEPT",
    ///                 Protocol = "TCP",
    ///                 Ports = "80",
    ///                 Ipv4s = new[]
    ///                 {
    ///                     "0.0.0.0/0",
    ///                 },
    ///                 Ipv6s = new[]
    ///                 {
    ///                     "::/0",
    ///                 },
    ///             },
    ///         },
    ///         InboundPolicy = "DROP",
    ///         OutboundPolicy = "ACCEPT",
    ///     });
    /// 
    ///     var myInstance = new Linode.Instance("myInstance", new()
    ///     {
    ///         Label = "my_instance",
    ///         Region = "us-southeast",
    ///         Type = "g6-standard-1",
    ///     });
    /// 
    ///     var myDevice = new Linode.FirewallDevice("myDevice", new()
    ///     {
    ///         FirewallId = myFirewall.Id,
    ///         EntityId = myInstance.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Firewall Device can be imported using the `firewall_id` followed by the Firewall Device `id` separated by a comma, e.g.
    /// 
    /// ```sh
    /// $ pulumi import linode:index/firewallDevice:FirewallDevice my_device_duplicated 1234567,7654321
    /// ```
    /// </summary>
    [LinodeResourceType("linode:index/firewallDevice:FirewallDevice")]
    public partial class FirewallDevice : global::Pulumi.CustomResource
    {
        /// <summary>
        /// When the Firewall Device was last created.
        /// </summary>
        [Output("created")]
        public Output<string> Created { get; private set; } = null!;

        /// <summary>
        /// The unique ID of the entity to attach.
        /// </summary>
        [Output("entityId")]
        public Output<int> EntityId { get; private set; } = null!;

        /// <summary>
        /// The type of the entity to attach. (default: `linode`)
        /// </summary>
        [Output("entityType")]
        public Output<string> EntityType { get; private set; } = null!;

        /// <summary>
        /// The unique ID of the target Firewall.
        /// </summary>
        [Output("firewallId")]
        public Output<int> FirewallId { get; private set; } = null!;

        /// <summary>
        /// When the Firewall Device was last updated.
        /// </summary>
        [Output("updated")]
        public Output<string> Updated { get; private set; } = null!;


        /// <summary>
        /// Create a FirewallDevice resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public FirewallDevice(string name, FirewallDeviceArgs args, CustomResourceOptions? options = null)
            : base("linode:index/firewallDevice:FirewallDevice", name, args ?? new FirewallDeviceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private FirewallDevice(string name, Input<string> id, FirewallDeviceState? state = null, CustomResourceOptions? options = null)
            : base("linode:index/firewallDevice:FirewallDevice", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing FirewallDevice resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static FirewallDevice Get(string name, Input<string> id, FirewallDeviceState? state = null, CustomResourceOptions? options = null)
        {
            return new FirewallDevice(name, id, state, options);
        }
    }

    public sealed class FirewallDeviceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The unique ID of the entity to attach.
        /// </summary>
        [Input("entityId", required: true)]
        public Input<int> EntityId { get; set; } = null!;

        /// <summary>
        /// The type of the entity to attach. (default: `linode`)
        /// </summary>
        [Input("entityType")]
        public Input<string>? EntityType { get; set; }

        /// <summary>
        /// The unique ID of the target Firewall.
        /// </summary>
        [Input("firewallId", required: true)]
        public Input<int> FirewallId { get; set; } = null!;

        public FirewallDeviceArgs()
        {
        }
        public static new FirewallDeviceArgs Empty => new FirewallDeviceArgs();
    }

    public sealed class FirewallDeviceState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// When the Firewall Device was last created.
        /// </summary>
        [Input("created")]
        public Input<string>? Created { get; set; }

        /// <summary>
        /// The unique ID of the entity to attach.
        /// </summary>
        [Input("entityId")]
        public Input<int>? EntityId { get; set; }

        /// <summary>
        /// The type of the entity to attach. (default: `linode`)
        /// </summary>
        [Input("entityType")]
        public Input<string>? EntityType { get; set; }

        /// <summary>
        /// The unique ID of the target Firewall.
        /// </summary>
        [Input("firewallId")]
        public Input<int>? FirewallId { get; set; }

        /// <summary>
        /// When the Firewall Device was last updated.
        /// </summary>
        [Input("updated")]
        public Input<string>? Updated { get; set; }

        public FirewallDeviceState()
        {
        }
        public static new FirewallDeviceState Empty => new FirewallDeviceState();
    }
}
