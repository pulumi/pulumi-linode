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
    /// &gt; **NOTICE:** The Firewall feature is currently available through early access.
    /// 
    /// Manages a Linode Firewall.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Linode = Pulumi.Linode;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var myInstance = new Linode.Instance("myInstance", new Linode.InstanceArgs
    ///         {
    ///             Label = "my_instance",
    ///             Image = "linode/ubuntu18.04",
    ///             Region = "us-east",
    ///             Type = "g6-standard-1",
    ///             RootPass = "bogusPassword$",
    ///             SwapSize = 256,
    ///         });
    ///         var myFirewall = new Linode.Firewall("myFirewall", new Linode.FirewallArgs
    ///         {
    ///             Label = "my_firewall",
    ///             Tags = 
    ///             {
    ///                 "test",
    ///             },
    ///             Inbounds = 
    ///             {
    ///                 new Linode.Inputs.FirewallInboundArgs
    ///                 {
    ///                     Label = "allow-them",
    ///                     Action = "ACCEPT",
    ///                     Protocol = "TCP",
    ///                     Ports = "80",
    ///                     Ipv4s = 
    ///                     {
    ///                         "0.0.0.0/0",
    ///                     },
    ///                     Ipv6s = 
    ///                     {
    ///                         "ff00::/8",
    ///                     },
    ///                 },
    ///             },
    ///             InboundPolicy = "DROP",
    ///             Outbounds = 
    ///             {
    ///                 new Linode.Inputs.FirewallOutboundArgs
    ///                 {
    ///                     Label = "reject-them",
    ///                     Action = "DROP",
    ///                     Protocol = "TCP",
    ///                     Ports = "80",
    ///                     Ipv4s = 
    ///                     {
    ///                         "0.0.0.0/0",
    ///                     },
    ///                     Ipv6s = 
    ///                     {
    ///                         "ff00::/8",
    ///                     },
    ///                 },
    ///             },
    ///             OutboundPolicy = "ACCEPT",
    ///             Linodes = 
    ///             {
    ///                 myInstance.Id,
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Firewalls can be imported using the `id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import linode:index/firewall:Firewall my_firewall 12345
    /// ```
    /// </summary>
    [LinodeResourceType("linode:index/firewall:Firewall")]
    public partial class Firewall : Pulumi.CustomResource
    {
        /// <summary>
        /// The devices associated with this firewall.
        /// </summary>
        [Output("devices")]
        public Output<ImmutableArray<Outputs.FirewallDevice>> Devices { get; private set; } = null!;

        /// <summary>
        /// If `true`, the Firewall's rules are not enforced (defaults to `false`).
        /// </summary>
        [Output("disabled")]
        public Output<bool?> Disabled { get; private set; } = null!;

        /// <summary>
        /// The default behavior for inbound traffic. This setting can be overridden by updating the inbound.action property of the Firewall Rule.
        /// </summary>
        [Output("inboundPolicy")]
        public Output<string> InboundPolicy { get; private set; } = null!;

        /// <summary>
        /// A firewall rule that specifies what inbound network traffic is allowed.
        /// </summary>
        [Output("inbounds")]
        public Output<ImmutableArray<Outputs.FirewallInbound>> Inbounds { get; private set; } = null!;

        /// <summary>
        /// Used to identify this rule. For display purposes only.
        /// </summary>
        [Output("label")]
        public Output<string> Label { get; private set; } = null!;

        /// <summary>
        /// A list of IDs of Linodes this Firewall should govern it's network traffic for.
        /// </summary>
        [Output("linodes")]
        public Output<ImmutableArray<int>> Linodes { get; private set; } = null!;

        /// <summary>
        /// The default behavior for outbound traffic. This setting can be overridden by updating the action property for an individual Firewall Rule.
        /// </summary>
        [Output("outboundPolicy")]
        public Output<string> OutboundPolicy { get; private set; } = null!;

        /// <summary>
        /// A firewall rule that specifies what outbound network traffic is allowed.
        /// </summary>
        [Output("outbounds")]
        public Output<ImmutableArray<Outputs.FirewallOutbound>> Outbounds { get; private set; } = null!;

        /// <summary>
        /// The status of the Firewall.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// A list of tags applied to the Kubernetes cluster. Tags are for organizational purposes only.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<string>> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a Firewall resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Firewall(string name, FirewallArgs args, CustomResourceOptions? options = null)
            : base("linode:index/firewall:Firewall", name, args ?? new FirewallArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Firewall(string name, Input<string> id, FirewallState? state = null, CustomResourceOptions? options = null)
            : base("linode:index/firewall:Firewall", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Firewall resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Firewall Get(string name, Input<string> id, FirewallState? state = null, CustomResourceOptions? options = null)
        {
            return new Firewall(name, id, state, options);
        }
    }

    public sealed class FirewallArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// If `true`, the Firewall's rules are not enforced (defaults to `false`).
        /// </summary>
        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        /// <summary>
        /// The default behavior for inbound traffic. This setting can be overridden by updating the inbound.action property of the Firewall Rule.
        /// </summary>
        [Input("inboundPolicy", required: true)]
        public Input<string> InboundPolicy { get; set; } = null!;

        [Input("inbounds")]
        private InputList<Inputs.FirewallInboundArgs>? _inbounds;

        /// <summary>
        /// A firewall rule that specifies what inbound network traffic is allowed.
        /// </summary>
        public InputList<Inputs.FirewallInboundArgs> Inbounds
        {
            get => _inbounds ?? (_inbounds = new InputList<Inputs.FirewallInboundArgs>());
            set => _inbounds = value;
        }

        /// <summary>
        /// Used to identify this rule. For display purposes only.
        /// </summary>
        [Input("label", required: true)]
        public Input<string> Label { get; set; } = null!;

        [Input("linodes")]
        private InputList<int>? _linodes;

        /// <summary>
        /// A list of IDs of Linodes this Firewall should govern it's network traffic for.
        /// </summary>
        public InputList<int> Linodes
        {
            get => _linodes ?? (_linodes = new InputList<int>());
            set => _linodes = value;
        }

        /// <summary>
        /// The default behavior for outbound traffic. This setting can be overridden by updating the action property for an individual Firewall Rule.
        /// </summary>
        [Input("outboundPolicy", required: true)]
        public Input<string> OutboundPolicy { get; set; } = null!;

        [Input("outbounds")]
        private InputList<Inputs.FirewallOutboundArgs>? _outbounds;

        /// <summary>
        /// A firewall rule that specifies what outbound network traffic is allowed.
        /// </summary>
        public InputList<Inputs.FirewallOutboundArgs> Outbounds
        {
            get => _outbounds ?? (_outbounds = new InputList<Inputs.FirewallOutboundArgs>());
            set => _outbounds = value;
        }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// A list of tags applied to the Kubernetes cluster. Tags are for organizational purposes only.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        public FirewallArgs()
        {
        }
    }

    public sealed class FirewallState : Pulumi.ResourceArgs
    {
        [Input("devices")]
        private InputList<Inputs.FirewallDeviceGetArgs>? _devices;

        /// <summary>
        /// The devices associated with this firewall.
        /// </summary>
        public InputList<Inputs.FirewallDeviceGetArgs> Devices
        {
            get => _devices ?? (_devices = new InputList<Inputs.FirewallDeviceGetArgs>());
            set => _devices = value;
        }

        /// <summary>
        /// If `true`, the Firewall's rules are not enforced (defaults to `false`).
        /// </summary>
        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        /// <summary>
        /// The default behavior for inbound traffic. This setting can be overridden by updating the inbound.action property of the Firewall Rule.
        /// </summary>
        [Input("inboundPolicy")]
        public Input<string>? InboundPolicy { get; set; }

        [Input("inbounds")]
        private InputList<Inputs.FirewallInboundGetArgs>? _inbounds;

        /// <summary>
        /// A firewall rule that specifies what inbound network traffic is allowed.
        /// </summary>
        public InputList<Inputs.FirewallInboundGetArgs> Inbounds
        {
            get => _inbounds ?? (_inbounds = new InputList<Inputs.FirewallInboundGetArgs>());
            set => _inbounds = value;
        }

        /// <summary>
        /// Used to identify this rule. For display purposes only.
        /// </summary>
        [Input("label")]
        public Input<string>? Label { get; set; }

        [Input("linodes")]
        private InputList<int>? _linodes;

        /// <summary>
        /// A list of IDs of Linodes this Firewall should govern it's network traffic for.
        /// </summary>
        public InputList<int> Linodes
        {
            get => _linodes ?? (_linodes = new InputList<int>());
            set => _linodes = value;
        }

        /// <summary>
        /// The default behavior for outbound traffic. This setting can be overridden by updating the action property for an individual Firewall Rule.
        /// </summary>
        [Input("outboundPolicy")]
        public Input<string>? OutboundPolicy { get; set; }

        [Input("outbounds")]
        private InputList<Inputs.FirewallOutboundGetArgs>? _outbounds;

        /// <summary>
        /// A firewall rule that specifies what outbound network traffic is allowed.
        /// </summary>
        public InputList<Inputs.FirewallOutboundGetArgs> Outbounds
        {
            get => _outbounds ?? (_outbounds = new InputList<Inputs.FirewallOutboundGetArgs>());
            set => _outbounds = value;
        }

        /// <summary>
        /// The status of the Firewall.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// A list of tags applied to the Kubernetes cluster. Tags are for organizational purposes only.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        public FirewallState()
        {
        }
    }
}
