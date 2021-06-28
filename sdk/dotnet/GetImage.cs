// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode
{
    public static class GetImage
    {
        /// <summary>
        /// Provides information about a Linode image
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// The following example shows how one might use this data source to access information about a Linode image.
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var k8Master = Output.Create(Linode.GetImage.InvokeAsync(new Linode.GetImageArgs
        ///         {
        ///             Id = "linode/debian8",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// ## Attributes
        /// 
        /// The Linode Image resource exports the following attributes:
        /// 
        /// * `label` - A short description of the Image.
        /// 
        /// * `created` - When this Image was created.
        /// 
        /// * `created_by` - The name of the User who created this Image, or "linode" for official Images.
        /// 
        /// * `deprecated` - Whether or not this Image is deprecated. Will only be true for deprecated public Images.
        /// 
        /// * `description` - A detailed description of this Image.
        /// 
        /// * `is_public` - True if the Image is public.
        /// 
        /// * `size` - The minimum size this Image needs to deploy. Size is in MB. example: 2500
        /// 
        /// * `status` - The current status of this image. (`creating`, `pending_upload`, `available`)
        /// 
        /// * `type` - How the Image was created. Manual Images can be created at any time. "Automatic" Images are created automatically from a deleted Linode. (`manual`, `automatic`)
        /// 
        /// * `vendor` - The upstream distribution vendor. `None` for private Images.
        /// </summary>
        public static Task<GetImageResult> InvokeAsync(GetImageArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetImageResult>("linode:index/getImage:getImage", args ?? new GetImageArgs(), options.WithVersion());
    }


    public sealed class GetImageArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The unique ID of this Image.  The ID of private images begin with `private/` followed by the numeric identifier of the private image, for example `private/12345`.
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        public GetImageArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetImageResult
    {
        public readonly string Created;
        public readonly string CreatedBy;
        public readonly bool Deprecated;
        public readonly string Description;
        public readonly string Expiry;
        public readonly string Id;
        public readonly bool IsPublic;
        public readonly string Label;
        public readonly int Size;
        public readonly string Status;
        public readonly string Type;
        public readonly string Vendor;

        [OutputConstructor]
        private GetImageResult(
            string created,

            string createdBy,

            bool deprecated,

            string description,

            string expiry,

            string id,

            bool isPublic,

            string label,

            int size,

            string status,

            string type,

            string vendor)
        {
            Created = created;
            CreatedBy = createdBy;
            Deprecated = deprecated;
            Description = description;
            Expiry = expiry;
            Id = id;
            IsPublic = isPublic;
            Label = label;
            Size = size;
            Status = status;
            Type = type;
            Vendor = vendor;
        }
    }
}
