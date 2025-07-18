// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Inputs
{

    public sealed class GetStackScriptsStackscriptInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The date this StackScript was created.
        /// </summary>
        [Input("created", required: true)]
        public Input<string> Created { get; set; } = null!;

        /// <summary>
        /// Count of currently active, deployed Linodes created from this StackScript.
        /// </summary>
        [Input("deploymentsActive", required: true)]
        public Input<int> DeploymentsActive { get; set; } = null!;

        /// <summary>
        /// The total number of times this StackScript has been deployed.
        /// </summary>
        [Input("deploymentsTotal", required: true)]
        public Input<int> DeploymentsTotal { get; set; } = null!;

        /// <summary>
        /// A description for the StackScript.
        /// </summary>
        [Input("description", required: true)]
        public Input<string> Description { get; set; } = null!;

        /// <summary>
        /// The unique ID of the StackScript.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        [Input("images", required: true)]
        private InputList<string>? _images;

        /// <summary>
        /// An array of Image IDs representing the Images that this StackScript is compatible for deploying with.
        /// </summary>
        public InputList<string> Images
        {
            get => _images ?? (_images = new InputList<string>());
            set => _images = value;
        }

        /// <summary>
        /// This determines whether other users can use your StackScript. Once a StackScript is made public, it cannot be made private.
        /// </summary>
        [Input("isPublic", required: true)]
        public Input<bool> IsPublic { get; set; } = null!;

        /// <summary>
        /// A human-readable label for the field that will serve as the input prompt for entering the value during deployment.
        /// </summary>
        [Input("label", required: true)]
        public Input<string> Label { get; set; } = null!;

        /// <summary>
        /// This field allows you to add notes for the set of revisions made to this StackScript.
        /// </summary>
        [Input("revNote", required: true)]
        public Input<string> RevNote { get; set; } = null!;

        /// <summary>
        /// The script to execute when provisioning a new Linode with this StackScript.
        /// </summary>
        [Input("script", required: true)]
        public Input<string> Script { get; set; } = null!;

        /// <summary>
        /// The date this StackScript was updated.
        /// </summary>
        [Input("updated", required: true)]
        public Input<string> Updated { get; set; } = null!;

        [Input("userDefinedFields", required: true)]
        private InputList<Inputs.GetStackScriptsStackscriptUserDefinedFieldInputArgs>? _userDefinedFields;

        /// <summary>
        /// This is a list of fields defined with a special syntax inside this StackScript that allow for supplying customized parameters during deployment.
        /// </summary>
        public InputList<Inputs.GetStackScriptsStackscriptUserDefinedFieldInputArgs> UserDefinedFields
        {
            get => _userDefinedFields ?? (_userDefinedFields = new InputList<Inputs.GetStackScriptsStackscriptUserDefinedFieldInputArgs>());
            set => _userDefinedFields = value;
        }

        /// <summary>
        /// The Gravatar ID for the User who created the StackScript.
        /// </summary>
        [Input("userGravatarId", required: true)]
        public Input<string> UserGravatarId { get; set; } = null!;

        /// <summary>
        /// The User who created the StackScript.
        /// </summary>
        [Input("username", required: true)]
        public Input<string> Username { get; set; } = null!;

        public GetStackScriptsStackscriptInputArgs()
        {
        }
        public static new GetStackScriptsStackscriptInputArgs Empty => new GetStackScriptsStackscriptInputArgs();
    }
}
