// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode
{
    public static class GetVolume
    {
        /// <summary>
        /// Provides information about a Linode Volume.
        /// 
        /// ## Example Usage
        /// 
        /// The following example shows how one might use this data source to access information about a Linode Volume.
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
        ///     var foo = Linode.GetVolume.Invoke(new()
        ///     {
        ///         Id = 1234567,
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Task<GetVolumeResult> InvokeAsync(GetVolumeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetVolumeResult>("linode:index/getVolume:getVolume", args ?? new GetVolumeArgs(), options.WithDefaults());

        /// <summary>
        /// Provides information about a Linode Volume.
        /// 
        /// ## Example Usage
        /// 
        /// The following example shows how one might use this data source to access information about a Linode Volume.
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
        ///     var foo = Linode.GetVolume.Invoke(new()
        ///     {
        ///         Id = 1234567,
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Output<GetVolumeResult> Invoke(GetVolumeInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetVolumeResult>("linode:index/getVolume:getVolume", args ?? new GetVolumeInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetVolumeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The unique numeric ID of the Volume record to query.
        /// </summary>
        [Input("id", required: true)]
        public int Id { get; set; }

        public GetVolumeArgs()
        {
        }
        public static new GetVolumeArgs Empty => new GetVolumeArgs();
    }

    public sealed class GetVolumeInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The unique numeric ID of the Volume record to query.
        /// </summary>
        [Input("id", required: true)]
        public Input<int> Id { get; set; } = null!;

        public GetVolumeInvokeArgs()
        {
        }
        public static new GetVolumeInvokeArgs Empty => new GetVolumeInvokeArgs();
    }


    [OutputType]
    public sealed class GetVolumeResult
    {
        /// <summary>
        /// When this Volume was created.
        /// </summary>
        public readonly string Created;
        /// <summary>
        /// The full filesystem path for the Volume based on the Volume's label. Path is /dev/disk/by-id/scsi-0LinodeVolume + Volume label.
        /// </summary>
        public readonly string FilesystemPath;
        /// <summary>
        /// The unique ID of this Volume.
        /// </summary>
        public readonly int Id;
        /// <summary>
        /// This Volume's label is for display purposes only.
        /// </summary>
        public readonly string Label;
        /// <summary>
        /// If a Volume is attached to a specific Linode, the ID of that Linode will be displayed here. If the Volume is unattached, this value will be null.
        /// </summary>
        public readonly int LinodeId;
        /// <summary>
        /// The datacenter in which this Volume is located. See all regions [here](https://api.linode.com/v4/regions).
        /// </summary>
        public readonly string Region;
        /// <summary>
        /// The Volume's size, in GiB.
        /// </summary>
        public readonly int Size;
        /// <summary>
        /// The current status of the Volume. (`creating`, `active`, `resizing`, `contact_support`)
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// An array of tags applied to this object. Tags are case-insensitive and are for organizational purposes only.
        /// </summary>
        public readonly ImmutableArray<string> Tags;
        /// <summary>
        /// When this Volume was last updated.
        /// </summary>
        public readonly string Updated;

        [OutputConstructor]
        private GetVolumeResult(
            string created,

            string filesystemPath,

            int id,

            string label,

            int linodeId,

            string region,

            int size,

            string status,

            ImmutableArray<string> tags,

            string updated)
        {
            Created = created;
            FilesystemPath = filesystemPath;
            Id = id;
            Label = label;
            LinodeId = linodeId;
            Region = region;
            Size = size;
            Status = status;
            Tags = tags;
            Updated = updated;
        }
    }
}
