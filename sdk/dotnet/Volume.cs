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
    /// Provides a Linode Volume resource.  This can be used to create, modify, and delete Linodes Block Storage Volumes.  Block Storage Volumes are removable storage disks that persist outside the life-cycle of Linode Instances. These volumes can be attached to and detached from Linode instances throughout a region.
    /// 
    /// For more information, see [How to Use Block Storage with Your Linode](https://www.linode.com/docs/platform/block-storage/how-to-use-block-storage-with-your-linode/) and the [Linode APIv4 docs](https://developers.linode.com/api/v4#operation/createVolume).
    /// 
    /// ## Example Usage
    /// 
    /// The following example shows how one might use this resource to configure a Block Storage Volume attached to a Linode Instance.
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Linode = Pulumi.Linode;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var foobaz = new Linode.Instance("foobaz", new Linode.InstanceArgs
    ///         {
    ///             Region = "us-west",
    ///             RootPass = "3X4mp13",
    ///             Tags = 
    ///             {
    ///                 "foobaz",
    ///             },
    ///             Type = "g6-nanode-1",
    ///         });
    ///         var foobar = new Linode.Volume("foobar", new Linode.VolumeArgs
    ///         {
    ///             Label = "foo-volume",
    ///             LinodeId = foobaz.Id,
    ///             Region = foobaz.Region,
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// Volumes can also be attached using the Linode Instance config device map.
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Linode = Pulumi.Linode;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var foo = new Linode.Instance("foo", new Linode.InstanceArgs
    ///         {
    ///             Configs = 
    ///             {
    ///                 new Linode.Inputs.InstanceConfigArgs
    ///                 {
    ///                     Devices = new Linode.Inputs.InstanceConfigDevicesArgs
    ///                     {
    ///                         Sda = new Linode.Inputs.InstanceConfigDevicesSdaArgs
    ///                         {
    ///                             VolumeId = 123,
    ///                         },
    ///                     },
    ///                     Kernel = "linode/latest-64bit",
    ///                     Label = "boot-existing-volume",
    ///                 },
    ///             },
    ///             Region = "us-east",
    ///             Type = "g6-nanode-1",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// ## Attributes
    /// 
    /// This resource exports the following attributes:
    /// 
    /// * `status` - The label of the Linode Volume.
    /// 
    /// * `filesystem_path` - The full filesystem path for the Volume based on the Volume's label. The path is "/dev/disk/by-id/scsi-0Linode_Volume_" + the Volume label
    /// </summary>
    public partial class Volume : Pulumi.CustomResource
    {
        /// <summary>
        /// The full filesystem path for the Volume based on the Volume's label. Path is /dev/disk/by-id/scsi-0Linode_Volume_ +
        /// Volume label.
        /// </summary>
        [Output("filesystemPath")]
        public Output<string> FilesystemPath { get; private set; } = null!;

        /// <summary>
        /// The label of the Linode Volume
        /// </summary>
        [Output("label")]
        public Output<string> Label { get; private set; } = null!;

        /// <summary>
        /// The ID of a Linode Instance where the the Volume should be attached.
        /// </summary>
        [Output("linodeId")]
        public Output<int> LinodeId { get; private set; } = null!;

        /// <summary>
        /// The region where this volume will be deployed.  Examples are `"us-east"`, `"us-west"`, `"ap-south"`, etc.  *Changing `region` forces the creation of a new Linode Volume.*.
        /// </summary>
        [Output("region")]
        public Output<string> Region { get; private set; } = null!;

        /// <summary>
        /// Size of the Volume in GB.
        /// </summary>
        [Output("size")]
        public Output<int> Size { get; private set; } = null!;

        /// <summary>
        /// The status of the volume, indicating the current readiness state.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// A list of tags applied to this object. Tags are for organizational purposes only.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<string>> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a Volume resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Volume(string name, VolumeArgs args, CustomResourceOptions? options = null)
            : base("linode:index/volume:Volume", name, args ?? new VolumeArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Volume(string name, Input<string> id, VolumeState? state = null, CustomResourceOptions? options = null)
            : base("linode:index/volume:Volume", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Volume resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Volume Get(string name, Input<string> id, VolumeState? state = null, CustomResourceOptions? options = null)
        {
            return new Volume(name, id, state, options);
        }
    }

    public sealed class VolumeArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The label of the Linode Volume
        /// </summary>
        [Input("label", required: true)]
        public Input<string> Label { get; set; } = null!;

        /// <summary>
        /// The ID of a Linode Instance where the the Volume should be attached.
        /// </summary>
        [Input("linodeId")]
        public Input<int>? LinodeId { get; set; }

        /// <summary>
        /// The region where this volume will be deployed.  Examples are `"us-east"`, `"us-west"`, `"ap-south"`, etc.  *Changing `region` forces the creation of a new Linode Volume.*.
        /// </summary>
        [Input("region", required: true)]
        public Input<string> Region { get; set; } = null!;

        /// <summary>
        /// Size of the Volume in GB.
        /// </summary>
        [Input("size")]
        public Input<int>? Size { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// A list of tags applied to this object. Tags are for organizational purposes only.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        public VolumeArgs()
        {
        }
    }

    public sealed class VolumeState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The full filesystem path for the Volume based on the Volume's label. Path is /dev/disk/by-id/scsi-0Linode_Volume_ +
        /// Volume label.
        /// </summary>
        [Input("filesystemPath")]
        public Input<string>? FilesystemPath { get; set; }

        /// <summary>
        /// The label of the Linode Volume
        /// </summary>
        [Input("label")]
        public Input<string>? Label { get; set; }

        /// <summary>
        /// The ID of a Linode Instance where the the Volume should be attached.
        /// </summary>
        [Input("linodeId")]
        public Input<int>? LinodeId { get; set; }

        /// <summary>
        /// The region where this volume will be deployed.  Examples are `"us-east"`, `"us-west"`, `"ap-south"`, etc.  *Changing `region` forces the creation of a new Linode Volume.*.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// Size of the Volume in GB.
        /// </summary>
        [Input("size")]
        public Input<int>? Size { get; set; }

        /// <summary>
        /// The status of the volume, indicating the current readiness state.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// A list of tags applied to this object. Tags are for organizational purposes only.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        public VolumeState()
        {
        }
    }
}
