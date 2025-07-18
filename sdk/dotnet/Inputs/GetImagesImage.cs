// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode.Inputs
{

    public sealed class GetImagesImageArgs : global::Pulumi.InvokeArgs
    {
        [Input("capabilities", required: true)]
        private List<string>? _capabilities;

        /// <summary>
        /// The capabilities of this Image.
        /// </summary>
        public List<string> Capabilities
        {
            get => _capabilities ?? (_capabilities = new List<string>());
            set => _capabilities = value;
        }

        /// <summary>
        /// When this Image was created.
        /// </summary>
        [Input("created", required: true)]
        public string Created { get; set; } = null!;

        /// <summary>
        /// The name of the User who created this Image, or "linode" for official Images.
        /// </summary>
        [Input("createdBy", required: true)]
        public string CreatedBy { get; set; } = null!;

        /// <summary>
        /// Whether or not this Image is deprecated. Will only be true for deprecated public Images.
        /// </summary>
        [Input("deprecated", required: true)]
        public bool Deprecated { get; set; }

        /// <summary>
        /// A detailed description of this Image.
        /// </summary>
        [Input("description", required: true)]
        public string Description { get; set; } = null!;

        /// <summary>
        /// Only Images created automatically (from a deleted Linode; type=automatic) will expire.
        /// </summary>
        [Input("expiry", required: true)]
        public string Expiry { get; set; } = null!;

        /// <summary>
        /// The unique ID of this Image.  The ID of private images begin with `private/` followed by the numeric identifier of the private image, for example `private/12345`.
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        /// <summary>
        /// True if the Image is public.
        /// </summary>
        [Input("isPublic", required: true)]
        public bool IsPublic { get; set; }

        /// <summary>
        /// A short description of the Image.
        /// </summary>
        [Input("label", required: true)]
        public string Label { get; set; } = null!;

        [Input("replications")]
        private List<Inputs.GetImagesImageReplicationArgs>? _replications;

        /// <summary>
        /// A list of image replication regions and corresponding status.
        /// </summary>
        public List<Inputs.GetImagesImageReplicationArgs> Replications
        {
            get => _replications ?? (_replications = new List<Inputs.GetImagesImageReplicationArgs>());
            set => _replications = value;
        }

        /// <summary>
        /// The minimum size this Image needs to deploy. Size is in MB. example: 2500
        /// </summary>
        [Input("size", required: true)]
        public int Size { get; set; }

        /// <summary>
        /// The status of an image replica.
        /// </summary>
        [Input("status", required: true)]
        public string Status { get; set; } = null!;

        [Input("tags", required: true)]
        private List<string>? _tags;

        /// <summary>
        /// A list of customized tags.
        /// </summary>
        public List<string> Tags
        {
            get => _tags ?? (_tags = new List<string>());
            set => _tags = value;
        }

        /// <summary>
        /// The total size of the image in all available regions.
        /// </summary>
        [Input("totalSize", required: true)]
        public int TotalSize { get; set; }

        /// <summary>
        /// How the Image was created. Manual Images can be created at any time. "Automatic" Images are created automatically from a deleted Linode. (`manual`, `automatic`)
        /// </summary>
        [Input("type", required: true)]
        public string Type { get; set; } = null!;

        /// <summary>
        /// The upstream distribution vendor. `None` for private Images.
        /// </summary>
        [Input("vendor", required: true)]
        public string Vendor { get; set; } = null!;

        public GetImagesImageArgs()
        {
        }
        public static new GetImagesImageArgs Empty => new GetImagesImageArgs();
    }
}
