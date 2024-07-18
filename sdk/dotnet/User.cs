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
    /// Manages a Linode User.
    /// For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/post-user).
    /// 
    /// ## Example Usage
    /// 
    /// Create an unrestricted user:
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Linode = Pulumi.Linode;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var john = new Linode.User("john", new()
    ///     {
    ///         Username = "john123",
    ///         Email = "john@acme.io",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// Create a restricted user with grants:
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Linode = Pulumi.Linode;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var fooser = new Linode.User("fooser", new()
    ///     {
    ///         Username = "cooluser123",
    ///         Email = "cool@acme.io",
    ///         Restricted = true,
    ///         GlobalGrants = new Linode.Inputs.UserGlobalGrantsArgs
    ///         {
    ///             AddLinodes = true,
    ///             AddImages = true,
    ///         },
    ///         LinodeGrants = new[]
    ///         {
    ///             new Linode.Inputs.UserLinodeGrantArgs
    ///             {
    ///                 Id = 12345,
    ///                 Permissions = "read_write",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Global Grants
    /// 
    /// * `account_access` - (optional) The level of access this User has to Account-level actions, like billing information. (`read_only`, `read_write`)
    /// 
    /// * `add_domains` - (optional) If true, this User may add Domains.
    /// 
    /// * `add_databases` - (optional) If true, this User may add Databases.
    /// 
    /// * `add_firewalls` - (optional) If true, this User may add Firewalls.
    /// 
    /// * `add_images` - (optional) If true, this User may add Images.
    /// 
    /// * `add_linodes` - (optional) If true, this User may create Linodes.
    /// 
    /// * `add_longview` - (optional) If true, this User may create Longview clients and view the current plan.
    /// 
    /// * `add_nodebalancers` - (optional) If true, this User may add NodeBalancers.
    /// 
    /// * `add_stackscripts` - (optional) If true, this User may add StackScripts.
    /// 
    /// * `cancel_account` - (optional) If true, this User may cancel the entire Account.
    /// 
    /// * `longview_subscription` - (optional) If true, this User may manage the Account’s Longview subscription.
    /// 
    /// ## Entity Grants
    /// 
    /// * `id` - (required) The ID of the entity this grant applies to.
    /// 
    /// * `permissions` - (required) The level of access this User has to this entity. (`read_only`, `read_write`)
    /// </summary>
    [LinodeResourceType("linode:index/user:User")]
    public partial class User : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The domains the user has permissions access to.
        /// </summary>
        [Output("domainGrants")]
        public Output<ImmutableArray<Outputs.UserDomainGrant>> DomainGrants { get; private set; } = null!;

        /// <summary>
        /// The email address of the user.
        /// </summary>
        [Output("email")]
        public Output<string> Email { get; private set; } = null!;

        /// <summary>
        /// The firewalls the user has permissions access to.
        /// </summary>
        [Output("firewallGrants")]
        public Output<ImmutableArray<Outputs.UserFirewallGrant>> FirewallGrants { get; private set; } = null!;

        /// <summary>
        /// A structure containing the Account-level grants a User has.
        /// </summary>
        [Output("globalGrants")]
        public Output<Outputs.UserGlobalGrants> GlobalGrants { get; private set; } = null!;

        /// <summary>
        /// The images the user has permissions access to.
        /// </summary>
        [Output("imageGrants")]
        public Output<ImmutableArray<Outputs.UserImageGrant>> ImageGrants { get; private set; } = null!;

        /// <summary>
        /// The Linodes the user has permissions access to.
        /// </summary>
        [Output("linodeGrants")]
        public Output<ImmutableArray<Outputs.UserLinodeGrant>> LinodeGrants { get; private set; } = null!;

        /// <summary>
        /// The longview the user has permissions access to.
        /// </summary>
        [Output("longviewGrants")]
        public Output<ImmutableArray<Outputs.UserLongviewGrant>> LongviewGrants { get; private set; } = null!;

        /// <summary>
        /// The NodeBalancers the user has permissions access to.
        /// </summary>
        [Output("nodebalancerGrants")]
        public Output<ImmutableArray<Outputs.UserNodebalancerGrant>> NodebalancerGrants { get; private set; } = null!;

        /// <summary>
        /// If true, this user will only have explicit permissions granted.
        /// 
        /// * `global_grants` - (optional) A structure containing the Account-level grants a User has.
        /// 
        /// The following arguments are sets of entity grants:
        /// </summary>
        [Output("restricted")]
        public Output<bool?> Restricted { get; private set; } = null!;

        /// <summary>
        /// A list of the User's SSH keys.
        /// </summary>
        [Output("sshKeys")]
        public Output<ImmutableArray<string>> SshKeys { get; private set; } = null!;

        /// <summary>
        /// The StackScripts the user has permissions access to.
        /// </summary>
        [Output("stackscriptGrants")]
        public Output<ImmutableArray<Outputs.UserStackscriptGrant>> StackscriptGrants { get; private set; } = null!;

        /// <summary>
        /// Whether the user has two-factor-authentication enabled.
        /// </summary>
        [Output("tfaEnabled")]
        public Output<bool> TfaEnabled { get; private set; } = null!;

        /// <summary>
        /// The type of this user.
        /// </summary>
        [Output("userType")]
        public Output<string> UserType { get; private set; } = null!;

        /// <summary>
        /// The username of the user.
        /// </summary>
        [Output("username")]
        public Output<string> Username { get; private set; } = null!;

        /// <summary>
        /// The volumes the user has permissions access to.
        /// </summary>
        [Output("volumeGrants")]
        public Output<ImmutableArray<Outputs.UserVolumeGrant>> VolumeGrants { get; private set; } = null!;


        /// <summary>
        /// Create a User resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public User(string name, UserArgs args, CustomResourceOptions? options = null)
            : base("linode:index/user:User", name, args ?? new UserArgs(), MakeResourceOptions(options, ""))
        {
        }

        private User(string name, Input<string> id, UserState? state = null, CustomResourceOptions? options = null)
            : base("linode:index/user:User", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing User resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static User Get(string name, Input<string> id, UserState? state = null, CustomResourceOptions? options = null)
        {
            return new User(name, id, state, options);
        }
    }

    public sealed class UserArgs : global::Pulumi.ResourceArgs
    {
        [Input("domainGrants")]
        private InputList<Inputs.UserDomainGrantArgs>? _domainGrants;

        /// <summary>
        /// The domains the user has permissions access to.
        /// </summary>
        public InputList<Inputs.UserDomainGrantArgs> DomainGrants
        {
            get => _domainGrants ?? (_domainGrants = new InputList<Inputs.UserDomainGrantArgs>());
            set => _domainGrants = value;
        }

        /// <summary>
        /// The email address of the user.
        /// </summary>
        [Input("email", required: true)]
        public Input<string> Email { get; set; } = null!;

        [Input("firewallGrants")]
        private InputList<Inputs.UserFirewallGrantArgs>? _firewallGrants;

        /// <summary>
        /// The firewalls the user has permissions access to.
        /// </summary>
        public InputList<Inputs.UserFirewallGrantArgs> FirewallGrants
        {
            get => _firewallGrants ?? (_firewallGrants = new InputList<Inputs.UserFirewallGrantArgs>());
            set => _firewallGrants = value;
        }

        /// <summary>
        /// A structure containing the Account-level grants a User has.
        /// </summary>
        [Input("globalGrants")]
        public Input<Inputs.UserGlobalGrantsArgs>? GlobalGrants { get; set; }

        [Input("imageGrants")]
        private InputList<Inputs.UserImageGrantArgs>? _imageGrants;

        /// <summary>
        /// The images the user has permissions access to.
        /// </summary>
        public InputList<Inputs.UserImageGrantArgs> ImageGrants
        {
            get => _imageGrants ?? (_imageGrants = new InputList<Inputs.UserImageGrantArgs>());
            set => _imageGrants = value;
        }

        [Input("linodeGrants")]
        private InputList<Inputs.UserLinodeGrantArgs>? _linodeGrants;

        /// <summary>
        /// The Linodes the user has permissions access to.
        /// </summary>
        public InputList<Inputs.UserLinodeGrantArgs> LinodeGrants
        {
            get => _linodeGrants ?? (_linodeGrants = new InputList<Inputs.UserLinodeGrantArgs>());
            set => _linodeGrants = value;
        }

        [Input("longviewGrants")]
        private InputList<Inputs.UserLongviewGrantArgs>? _longviewGrants;

        /// <summary>
        /// The longview the user has permissions access to.
        /// </summary>
        public InputList<Inputs.UserLongviewGrantArgs> LongviewGrants
        {
            get => _longviewGrants ?? (_longviewGrants = new InputList<Inputs.UserLongviewGrantArgs>());
            set => _longviewGrants = value;
        }

        [Input("nodebalancerGrants")]
        private InputList<Inputs.UserNodebalancerGrantArgs>? _nodebalancerGrants;

        /// <summary>
        /// The NodeBalancers the user has permissions access to.
        /// </summary>
        public InputList<Inputs.UserNodebalancerGrantArgs> NodebalancerGrants
        {
            get => _nodebalancerGrants ?? (_nodebalancerGrants = new InputList<Inputs.UserNodebalancerGrantArgs>());
            set => _nodebalancerGrants = value;
        }

        /// <summary>
        /// If true, this user will only have explicit permissions granted.
        /// 
        /// * `global_grants` - (optional) A structure containing the Account-level grants a User has.
        /// 
        /// The following arguments are sets of entity grants:
        /// </summary>
        [Input("restricted")]
        public Input<bool>? Restricted { get; set; }

        [Input("stackscriptGrants")]
        private InputList<Inputs.UserStackscriptGrantArgs>? _stackscriptGrants;

        /// <summary>
        /// The StackScripts the user has permissions access to.
        /// </summary>
        public InputList<Inputs.UserStackscriptGrantArgs> StackscriptGrants
        {
            get => _stackscriptGrants ?? (_stackscriptGrants = new InputList<Inputs.UserStackscriptGrantArgs>());
            set => _stackscriptGrants = value;
        }

        /// <summary>
        /// The username of the user.
        /// </summary>
        [Input("username", required: true)]
        public Input<string> Username { get; set; } = null!;

        [Input("volumeGrants")]
        private InputList<Inputs.UserVolumeGrantArgs>? _volumeGrants;

        /// <summary>
        /// The volumes the user has permissions access to.
        /// </summary>
        public InputList<Inputs.UserVolumeGrantArgs> VolumeGrants
        {
            get => _volumeGrants ?? (_volumeGrants = new InputList<Inputs.UserVolumeGrantArgs>());
            set => _volumeGrants = value;
        }

        public UserArgs()
        {
        }
        public static new UserArgs Empty => new UserArgs();
    }

    public sealed class UserState : global::Pulumi.ResourceArgs
    {
        [Input("domainGrants")]
        private InputList<Inputs.UserDomainGrantGetArgs>? _domainGrants;

        /// <summary>
        /// The domains the user has permissions access to.
        /// </summary>
        public InputList<Inputs.UserDomainGrantGetArgs> DomainGrants
        {
            get => _domainGrants ?? (_domainGrants = new InputList<Inputs.UserDomainGrantGetArgs>());
            set => _domainGrants = value;
        }

        /// <summary>
        /// The email address of the user.
        /// </summary>
        [Input("email")]
        public Input<string>? Email { get; set; }

        [Input("firewallGrants")]
        private InputList<Inputs.UserFirewallGrantGetArgs>? _firewallGrants;

        /// <summary>
        /// The firewalls the user has permissions access to.
        /// </summary>
        public InputList<Inputs.UserFirewallGrantGetArgs> FirewallGrants
        {
            get => _firewallGrants ?? (_firewallGrants = new InputList<Inputs.UserFirewallGrantGetArgs>());
            set => _firewallGrants = value;
        }

        /// <summary>
        /// A structure containing the Account-level grants a User has.
        /// </summary>
        [Input("globalGrants")]
        public Input<Inputs.UserGlobalGrantsGetArgs>? GlobalGrants { get; set; }

        [Input("imageGrants")]
        private InputList<Inputs.UserImageGrantGetArgs>? _imageGrants;

        /// <summary>
        /// The images the user has permissions access to.
        /// </summary>
        public InputList<Inputs.UserImageGrantGetArgs> ImageGrants
        {
            get => _imageGrants ?? (_imageGrants = new InputList<Inputs.UserImageGrantGetArgs>());
            set => _imageGrants = value;
        }

        [Input("linodeGrants")]
        private InputList<Inputs.UserLinodeGrantGetArgs>? _linodeGrants;

        /// <summary>
        /// The Linodes the user has permissions access to.
        /// </summary>
        public InputList<Inputs.UserLinodeGrantGetArgs> LinodeGrants
        {
            get => _linodeGrants ?? (_linodeGrants = new InputList<Inputs.UserLinodeGrantGetArgs>());
            set => _linodeGrants = value;
        }

        [Input("longviewGrants")]
        private InputList<Inputs.UserLongviewGrantGetArgs>? _longviewGrants;

        /// <summary>
        /// The longview the user has permissions access to.
        /// </summary>
        public InputList<Inputs.UserLongviewGrantGetArgs> LongviewGrants
        {
            get => _longviewGrants ?? (_longviewGrants = new InputList<Inputs.UserLongviewGrantGetArgs>());
            set => _longviewGrants = value;
        }

        [Input("nodebalancerGrants")]
        private InputList<Inputs.UserNodebalancerGrantGetArgs>? _nodebalancerGrants;

        /// <summary>
        /// The NodeBalancers the user has permissions access to.
        /// </summary>
        public InputList<Inputs.UserNodebalancerGrantGetArgs> NodebalancerGrants
        {
            get => _nodebalancerGrants ?? (_nodebalancerGrants = new InputList<Inputs.UserNodebalancerGrantGetArgs>());
            set => _nodebalancerGrants = value;
        }

        /// <summary>
        /// If true, this user will only have explicit permissions granted.
        /// 
        /// * `global_grants` - (optional) A structure containing the Account-level grants a User has.
        /// 
        /// The following arguments are sets of entity grants:
        /// </summary>
        [Input("restricted")]
        public Input<bool>? Restricted { get; set; }

        [Input("sshKeys")]
        private InputList<string>? _sshKeys;

        /// <summary>
        /// A list of the User's SSH keys.
        /// </summary>
        public InputList<string> SshKeys
        {
            get => _sshKeys ?? (_sshKeys = new InputList<string>());
            set => _sshKeys = value;
        }

        [Input("stackscriptGrants")]
        private InputList<Inputs.UserStackscriptGrantGetArgs>? _stackscriptGrants;

        /// <summary>
        /// The StackScripts the user has permissions access to.
        /// </summary>
        public InputList<Inputs.UserStackscriptGrantGetArgs> StackscriptGrants
        {
            get => _stackscriptGrants ?? (_stackscriptGrants = new InputList<Inputs.UserStackscriptGrantGetArgs>());
            set => _stackscriptGrants = value;
        }

        /// <summary>
        /// Whether the user has two-factor-authentication enabled.
        /// </summary>
        [Input("tfaEnabled")]
        public Input<bool>? TfaEnabled { get; set; }

        /// <summary>
        /// The type of this user.
        /// </summary>
        [Input("userType")]
        public Input<string>? UserType { get; set; }

        /// <summary>
        /// The username of the user.
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        [Input("volumeGrants")]
        private InputList<Inputs.UserVolumeGrantGetArgs>? _volumeGrants;

        /// <summary>
        /// The volumes the user has permissions access to.
        /// </summary>
        public InputList<Inputs.UserVolumeGrantGetArgs> VolumeGrants
        {
            get => _volumeGrants ?? (_volumeGrants = new InputList<Inputs.UserVolumeGrantGetArgs>());
            set => _volumeGrants = value;
        }

        public UserState()
        {
        }
        public static new UserState Empty => new UserState();
    }
}
