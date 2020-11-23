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
    /// Provides a Linode SSH Key resource.  This can be used to create, modify, and delete Linodes SSH Keys.  Managed SSH Keys allow instances to be created with a list of Linode usernames, whose SSH keys will be automatically applied to the root account's `~/.ssh/authorized_keys` file.
    /// For more information, see the [Linode APIv4 docs](https://developers.linode.com/api/v4#operation/getSSHKeys).
    /// 
    /// ## Attributes
    /// 
    /// This resource exports the following attributes:
    /// 
    /// * `created` - The date this SSH Key was created.
    /// 
    /// ## Import
    /// 
    /// Linodes SSH Keys can be imported using the Linode SSH Key `id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import linode:index/sshKey:SshKey mysshkey 1234567
    /// ```
    /// </summary>
    public partial class SshKey : Pulumi.CustomResource
    {
        /// <summary>
        /// The date this key was added.
        /// </summary>
        [Output("created")]
        public Output<string> Created { get; private set; } = null!;

        /// <summary>
        /// A label for the SSH Key.
        /// </summary>
        [Output("label")]
        public Output<string> Label { get; private set; } = null!;

        /// <summary>
        /// The public SSH Key, which is used to authenticate to the root user of the Linodes you deploy.
        /// </summary>
        [Output("sshKey")]
        public Output<string> SshKeyName { get; private set; } = null!;


        /// <summary>
        /// Create a SshKey resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SshKey(string name, SshKeyArgs args, CustomResourceOptions? options = null)
            : base("linode:index/sshKey:SshKey", name, args ?? new SshKeyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SshKey(string name, Input<string> id, SshKeyState? state = null, CustomResourceOptions? options = null)
            : base("linode:index/sshKey:SshKey", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing SshKey resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SshKey Get(string name, Input<string> id, SshKeyState? state = null, CustomResourceOptions? options = null)
        {
            return new SshKey(name, id, state, options);
        }
    }

    public sealed class SshKeyArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// A label for the SSH Key.
        /// </summary>
        [Input("label", required: true)]
        public Input<string> Label { get; set; } = null!;

        /// <summary>
        /// The public SSH Key, which is used to authenticate to the root user of the Linodes you deploy.
        /// </summary>
        [Input("sshKey", required: true)]
        public Input<string> SshKeyName { get; set; } = null!;

        public SshKeyArgs()
        {
        }
    }

    public sealed class SshKeyState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The date this key was added.
        /// </summary>
        [Input("created")]
        public Input<string>? Created { get; set; }

        /// <summary>
        /// A label for the SSH Key.
        /// </summary>
        [Input("label")]
        public Input<string>? Label { get; set; }

        /// <summary>
        /// The public SSH Key, which is used to authenticate to the root user of the Linodes you deploy.
        /// </summary>
        [Input("sshKey")]
        public Input<string>? SshKeyName { get; set; }

        public SshKeyState()
        {
        }
    }
}
