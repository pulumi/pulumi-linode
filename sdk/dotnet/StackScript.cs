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
    /// Provides a Linode StackScript resource.  This can be used to create, modify, and delete Linode StackScripts.  StackScripts are private or public managed scripts which run within an instance during startup.  StackScripts can include variables whose values are specified when the Instance is created.
    /// 
    /// For more information, see [Automate Deployment with StackScripts](https://www.linode.com/docs/platform/stackscripts/) and the [Linode APIv4 docs](https://developers.linode.com/api/v4#tag/StackScripts).
    /// 
    /// ## Example Usage
    /// 
    /// The following example shows how one might use this resource to configure a StackScript attached to a Linode Instance.  As shown below, StackScripts must begin with a shebang (`#!`).  The `&lt;UDF ...&gt;` element provided in the Bash comment block defines a variable whose value is provided when creating the Instance (or disk) using the `stackscript_data` field.
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Linode = Pulumi.Linode;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var fooStackScript = new Linode.StackScript("fooStackScript", new()
    ///     {
    ///         Label = "foo",
    ///         Description = "Installs a Package",
    ///         Script = @"#!/bin/bash
    /// # &lt;UDF name=""package"" label=""System Package to Install"" example=""nginx"" default=""""&gt;
    /// apt-get -q update &amp;&amp; apt-get -q -y install $PACKAGE
    /// ",
    ///         Images = new[]
    ///         {
    ///             "linode/ubuntu22.04",
    ///             "linode/ubuntu20.04",
    ///         },
    ///         RevNote = "initial version",
    ///     });
    /// 
    ///     var fooInstance = new Linode.Instance("fooInstance", new()
    ///     {
    ///         Image = "linode/ubuntu22.04",
    ///         Label = "foo",
    ///         Region = "us-east",
    ///         Type = "g6-nanode-1",
    ///         AuthorizedKeys = new[]
    ///         {
    ///             "...",
    ///         },
    ///         RootPass = "...",
    ///         StackscriptId = fooStackScript.Id,
    ///         StackscriptData = 
    ///         {
    ///             { "package", "nginx" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Linodes StackScripts can be imported using the Linode StackScript `id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import linode:index/stackScript:StackScript mystackscript 1234567
    /// ```
    /// </summary>
    [LinodeResourceType("linode:index/stackScript:StackScript")]
    public partial class StackScript : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The date this StackScript was created.
        /// </summary>
        [Output("created")]
        public Output<string> Created { get; private set; } = null!;

        /// <summary>
        /// Count of currently active, deployed Linodes created from this StackScript.
        /// </summary>
        [Output("deploymentsActive")]
        public Output<int> DeploymentsActive { get; private set; } = null!;

        /// <summary>
        /// The total number of times this StackScript has been deployed.
        /// </summary>
        [Output("deploymentsTotal")]
        public Output<int> DeploymentsTotal { get; private set; } = null!;

        /// <summary>
        /// A description for the StackScript.
        /// </summary>
        [Output("description")]
        public Output<string> Description { get; private set; } = null!;

        /// <summary>
        /// A set of Image IDs representing the Images that this StackScript is compatible for deploying with. `any/all` indicates that all available image distributions, including private images, are accepted. Currently private image IDs are not supported.
        /// 
        /// - - -
        /// </summary>
        [Output("images")]
        public Output<ImmutableArray<string>> Images { get; private set; } = null!;

        /// <summary>
        /// This determines whether other users can use your StackScript. Once a StackScript is made public, it cannot be made private. *Changing `is_public` forces the creation of a new StackScript*
        /// </summary>
        [Output("isPublic")]
        public Output<bool> IsPublic { get; private set; } = null!;

        /// <summary>
        /// The StackScript's label is for display purposes only.
        /// </summary>
        [Output("label")]
        public Output<string> Label { get; private set; } = null!;

        /// <summary>
        /// This field allows you to add notes for the set of revisions made to this StackScript.
        /// </summary>
        [Output("revNote")]
        public Output<string> RevNote { get; private set; } = null!;

        /// <summary>
        /// The script to execute when provisioning a new Linode with this StackScript.
        /// </summary>
        [Output("script")]
        public Output<string> Script { get; private set; } = null!;

        /// <summary>
        /// The date this StackScript was updated.
        /// </summary>
        [Output("updated")]
        public Output<string> Updated { get; private set; } = null!;

        /// <summary>
        /// This is a list of fields defined with a special syntax inside this StackScript that allow for supplying customized parameters during deployment.
        /// </summary>
        [Output("userDefinedFields")]
        public Output<ImmutableArray<Outputs.StackScriptUserDefinedField>> UserDefinedFields { get; private set; } = null!;

        /// <summary>
        /// The Gravatar ID for the User who created the StackScript.
        /// </summary>
        [Output("userGravatarId")]
        public Output<string> UserGravatarId { get; private set; } = null!;

        /// <summary>
        /// The User who created the StackScript.
        /// </summary>
        [Output("username")]
        public Output<string> Username { get; private set; } = null!;


        /// <summary>
        /// Create a StackScript resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public StackScript(string name, StackScriptArgs args, CustomResourceOptions? options = null)
            : base("linode:index/stackScript:StackScript", name, args ?? new StackScriptArgs(), MakeResourceOptions(options, ""))
        {
        }

        private StackScript(string name, Input<string> id, StackScriptState? state = null, CustomResourceOptions? options = null)
            : base("linode:index/stackScript:StackScript", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing StackScript resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static StackScript Get(string name, Input<string> id, StackScriptState? state = null, CustomResourceOptions? options = null)
        {
            return new StackScript(name, id, state, options);
        }
    }

    public sealed class StackScriptArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A description for the StackScript.
        /// </summary>
        [Input("description", required: true)]
        public Input<string> Description { get; set; } = null!;

        [Input("images", required: true)]
        private InputList<string>? _images;

        /// <summary>
        /// A set of Image IDs representing the Images that this StackScript is compatible for deploying with. `any/all` indicates that all available image distributions, including private images, are accepted. Currently private image IDs are not supported.
        /// 
        /// - - -
        /// </summary>
        public InputList<string> Images
        {
            get => _images ?? (_images = new InputList<string>());
            set => _images = value;
        }

        /// <summary>
        /// This determines whether other users can use your StackScript. Once a StackScript is made public, it cannot be made private. *Changing `is_public` forces the creation of a new StackScript*
        /// </summary>
        [Input("isPublic")]
        public Input<bool>? IsPublic { get; set; }

        /// <summary>
        /// The StackScript's label is for display purposes only.
        /// </summary>
        [Input("label", required: true)]
        public Input<string> Label { get; set; } = null!;

        /// <summary>
        /// This field allows you to add notes for the set of revisions made to this StackScript.
        /// </summary>
        [Input("revNote")]
        public Input<string>? RevNote { get; set; }

        /// <summary>
        /// The script to execute when provisioning a new Linode with this StackScript.
        /// </summary>
        [Input("script", required: true)]
        public Input<string> Script { get; set; } = null!;

        public StackScriptArgs()
        {
        }
        public static new StackScriptArgs Empty => new StackScriptArgs();
    }

    public sealed class StackScriptState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The date this StackScript was created.
        /// </summary>
        [Input("created")]
        public Input<string>? Created { get; set; }

        /// <summary>
        /// Count of currently active, deployed Linodes created from this StackScript.
        /// </summary>
        [Input("deploymentsActive")]
        public Input<int>? DeploymentsActive { get; set; }

        /// <summary>
        /// The total number of times this StackScript has been deployed.
        /// </summary>
        [Input("deploymentsTotal")]
        public Input<int>? DeploymentsTotal { get; set; }

        /// <summary>
        /// A description for the StackScript.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("images")]
        private InputList<string>? _images;

        /// <summary>
        /// A set of Image IDs representing the Images that this StackScript is compatible for deploying with. `any/all` indicates that all available image distributions, including private images, are accepted. Currently private image IDs are not supported.
        /// 
        /// - - -
        /// </summary>
        public InputList<string> Images
        {
            get => _images ?? (_images = new InputList<string>());
            set => _images = value;
        }

        /// <summary>
        /// This determines whether other users can use your StackScript. Once a StackScript is made public, it cannot be made private. *Changing `is_public` forces the creation of a new StackScript*
        /// </summary>
        [Input("isPublic")]
        public Input<bool>? IsPublic { get; set; }

        /// <summary>
        /// The StackScript's label is for display purposes only.
        /// </summary>
        [Input("label")]
        public Input<string>? Label { get; set; }

        /// <summary>
        /// This field allows you to add notes for the set of revisions made to this StackScript.
        /// </summary>
        [Input("revNote")]
        public Input<string>? RevNote { get; set; }

        /// <summary>
        /// The script to execute when provisioning a new Linode with this StackScript.
        /// </summary>
        [Input("script")]
        public Input<string>? Script { get; set; }

        /// <summary>
        /// The date this StackScript was updated.
        /// </summary>
        [Input("updated")]
        public Input<string>? Updated { get; set; }

        [Input("userDefinedFields")]
        private InputList<Inputs.StackScriptUserDefinedFieldGetArgs>? _userDefinedFields;

        /// <summary>
        /// This is a list of fields defined with a special syntax inside this StackScript that allow for supplying customized parameters during deployment.
        /// </summary>
        public InputList<Inputs.StackScriptUserDefinedFieldGetArgs> UserDefinedFields
        {
            get => _userDefinedFields ?? (_userDefinedFields = new InputList<Inputs.StackScriptUserDefinedFieldGetArgs>());
            set => _userDefinedFields = value;
        }

        /// <summary>
        /// The Gravatar ID for the User who created the StackScript.
        /// </summary>
        [Input("userGravatarId")]
        public Input<string>? UserGravatarId { get; set; }

        /// <summary>
        /// The User who created the StackScript.
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        public StackScriptState()
        {
        }
        public static new StackScriptState Empty => new StackScriptState();
    }
}
