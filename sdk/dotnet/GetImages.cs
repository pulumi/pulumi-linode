// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode
{
    public static class GetImages
    {
        /// <summary>
        /// Provides information about Linode images that match a set of filters.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Get information about all Linode images with a certain label and visibility:
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var specific_images = Output.Create(Linode.GetImages.InvokeAsync(new Linode.GetImagesArgs
        ///         {
        ///             Filters = 
        ///             {
        ///                 new Linode.Inputs.GetImagesFilterArgs
        ///                 {
        ///                     Name = "label",
        ///                     Values = 
        ///                     {
        ///                         "Debian 8",
        ///                     },
        ///                 },
        ///                 new Linode.Inputs.GetImagesFilterArgs
        ///                 {
        ///                     Name = "is_public",
        ///                     Values = 
        ///                     {
        ///                         "true",
        ///                     },
        ///                 },
        ///             },
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// 
        /// Get information about all Linode images associated with the current token:
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var all_images = Output.Create(Linode.GetImages.InvokeAsync());
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// ## Attributes
        /// 
        /// Each Linode image will be stored in the `images` attribute and will export the following attributes:
        /// 
        /// * `id` - The unique ID of this Image.  The ID of private images begin with `private/` followed by the numeric identifier of the private image, for example `private/12345`.
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
        /// 
        /// ## Filterable Fields
        /// 
        /// * `created_by`
        /// 
        /// * `deprecated`
        /// 
        /// * `description`
        /// 
        /// * `id`
        /// 
        /// * `is_public`
        /// 
        /// * `label`
        /// 
        /// * `size`
        /// 
        /// * `status`
        /// 
        /// * `vendor`
        /// </summary>
        public static Task<GetImagesResult> InvokeAsync(GetImagesArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetImagesResult>("linode:index/getImages:getImages", args ?? new GetImagesArgs(), options.WithDefaults());

        /// <summary>
        /// Provides information about Linode images that match a set of filters.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Get information about all Linode images with a certain label and visibility:
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var specific_images = Output.Create(Linode.GetImages.InvokeAsync(new Linode.GetImagesArgs
        ///         {
        ///             Filters = 
        ///             {
        ///                 new Linode.Inputs.GetImagesFilterArgs
        ///                 {
        ///                     Name = "label",
        ///                     Values = 
        ///                     {
        ///                         "Debian 8",
        ///                     },
        ///                 },
        ///                 new Linode.Inputs.GetImagesFilterArgs
        ///                 {
        ///                     Name = "is_public",
        ///                     Values = 
        ///                     {
        ///                         "true",
        ///                     },
        ///                 },
        ///             },
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// 
        /// Get information about all Linode images associated with the current token:
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Linode = Pulumi.Linode;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var all_images = Output.Create(Linode.GetImages.InvokeAsync());
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// ## Attributes
        /// 
        /// Each Linode image will be stored in the `images` attribute and will export the following attributes:
        /// 
        /// * `id` - The unique ID of this Image.  The ID of private images begin with `private/` followed by the numeric identifier of the private image, for example `private/12345`.
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
        /// 
        /// ## Filterable Fields
        /// 
        /// * `created_by`
        /// 
        /// * `deprecated`
        /// 
        /// * `description`
        /// 
        /// * `id`
        /// 
        /// * `is_public`
        /// 
        /// * `label`
        /// 
        /// * `size`
        /// 
        /// * `status`
        /// 
        /// * `vendor`
        /// </summary>
        public static Output<GetImagesResult> Invoke(GetImagesInvokeArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetImagesResult>("linode:index/getImages:getImages", args ?? new GetImagesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetImagesArgs : Pulumi.InvokeArgs
    {
        [Input("filters")]
        private List<Inputs.GetImagesFilterArgs>? _filters;
        public List<Inputs.GetImagesFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetImagesFilterArgs>());
            set => _filters = value;
        }

        /// <summary>
        /// If true, only the latest image will be returned. Images without a valid `created` field are not included in the result.
        /// </summary>
        [Input("latest")]
        public bool? Latest { get; set; }

        /// <summary>
        /// The order in which results should be returned. (`asc`, `desc`; default `asc`)
        /// </summary>
        [Input("order")]
        public string? Order { get; set; }

        /// <summary>
        /// The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
        /// </summary>
        [Input("orderBy")]
        public string? OrderBy { get; set; }

        public GetImagesArgs()
        {
        }
    }

    public sealed class GetImagesInvokeArgs : Pulumi.InvokeArgs
    {
        [Input("filters")]
        private InputList<Inputs.GetImagesFilterInputArgs>? _filters;
        public InputList<Inputs.GetImagesFilterInputArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetImagesFilterInputArgs>());
            set => _filters = value;
        }

        /// <summary>
        /// If true, only the latest image will be returned. Images without a valid `created` field are not included in the result.
        /// </summary>
        [Input("latest")]
        public Input<bool>? Latest { get; set; }

        /// <summary>
        /// The order in which results should be returned. (`asc`, `desc`; default `asc`)
        /// </summary>
        [Input("order")]
        public Input<string>? Order { get; set; }

        /// <summary>
        /// The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
        /// </summary>
        [Input("orderBy")]
        public Input<string>? OrderBy { get; set; }

        public GetImagesInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetImagesResult
    {
        public readonly ImmutableArray<Outputs.GetImagesFilterResult> Filters;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<Outputs.GetImagesImageResult> Images;
        public readonly bool? Latest;
        public readonly string? Order;
        public readonly string? OrderBy;

        [OutputConstructor]
        private GetImagesResult(
            ImmutableArray<Outputs.GetImagesFilterResult> filters,

            string id,

            ImmutableArray<Outputs.GetImagesImageResult> images,

            bool? latest,

            string? order,

            string? orderBy)
        {
            Filters = filters;
            Id = id;
            Images = images;
            Latest = latest;
            Order = order;
            OrderBy = orderBy;
        }
    }
}
