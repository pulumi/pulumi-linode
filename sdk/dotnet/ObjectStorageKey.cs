// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Linode
{
    /// <summary>
    /// Provides a Linode Object Storage Key resource. This can be used to create, modify, and delete Linodes Object Storage Keys.
    /// For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/post-object-storage-keys).
    /// 
    /// ## Example Usage
    /// 
    /// The following example shows how one might use this resource to create an Object Storage Key.
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Linode = Pulumi.Linode;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var foo = new Linode.ObjectStorageKey("foo", new()
    ///     {
    ///         Label = "image-access",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// The following example shows a key with limited access.
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Linode = Pulumi.Linode;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var foobar = new Linode.ObjectStorageKey("foobar", new()
    ///     {
    ///         Label = "my-key",
    ///         BucketAccesses = new[]
    ///         {
    ///             new Linode.Inputs.ObjectStorageKeyBucketAccessArgs
    ///             {
    ///                 BucketName = "my-bucket-name",
    ///                 Region = "us-mia",
    ///                 Permissions = "read_write",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// The following example shows how to grant a key the explicit access to multiple buckets.
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Linode = Pulumi.Linode;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var foo = new Linode.ObjectStorageKey("foo", new()
    ///     {
    ///         Label = "image-access",
    ///         BucketAccesses = new[]
    ///         {
    ///             new Linode.Inputs.ObjectStorageKeyBucketAccessArgs
    ///             {
    ///                 BucketName = "foobar1",
    ///                 Region = "us-mia",
    ///                 Permissions = "read_write",
    ///             },
    ///             new Linode.Inputs.ObjectStorageKeyBucketAccessArgs
    ///             {
    ///                 BucketName = "foobar2",
    ///                 Region = "gb-lon",
    ///                 Permissions = "read_write",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [LinodeResourceType("linode:index/objectStorageKey:ObjectStorageKey")]
    public partial class ObjectStorageKey : global::Pulumi.CustomResource
    {
        /// <summary>
        /// This keypair's access key. This is not secret.
        /// </summary>
        [Output("accessKey")]
        public Output<string> AccessKey { get; private set; } = null!;

        /// <summary>
        /// Defines this key as a Limited Access Key. Limited Access Keys restrict this Object Storage key’s access to only the bucket(s) declared in this array and define their bucket-level permissions. Not providing this block will not limit this Object Storage Key.
        /// </summary>
        [Output("bucketAccesses")]
        public Output<ImmutableArray<Outputs.ObjectStorageKeyBucketAccess>> BucketAccesses { get; private set; } = null!;

        /// <summary>
        /// The label given to this key. For display purposes only.
        /// </summary>
        [Output("label")]
        public Output<string> Label { get; private set; } = null!;

        /// <summary>
        /// Whether or not this key is a limited access key.
        /// </summary>
        [Output("limited")]
        public Output<bool> Limited { get; private set; } = null!;

        /// <summary>
        /// A set of regions where the key will grant access to create buckets.
        /// 
        /// - - -
        /// </summary>
        [Output("regions")]
        public Output<ImmutableArray<string>> Regions { get; private set; } = null!;

        /// <summary>
        /// A set of objects containing the detailed info of the regions where this key can access.
        /// </summary>
        [Output("regionsDetails")]
        public Output<ImmutableArray<Outputs.ObjectStorageKeyRegionsDetail>> RegionsDetails { get; private set; } = null!;

        /// <summary>
        /// This keypair's secret key.
        /// </summary>
        [Output("secretKey")]
        public Output<string> SecretKey { get; private set; } = null!;


        /// <summary>
        /// Create a ObjectStorageKey resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ObjectStorageKey(string name, ObjectStorageKeyArgs args, CustomResourceOptions? options = null)
            : base("linode:index/objectStorageKey:ObjectStorageKey", name, args ?? new ObjectStorageKeyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ObjectStorageKey(string name, Input<string> id, ObjectStorageKeyState? state = null, CustomResourceOptions? options = null)
            : base("linode:index/objectStorageKey:ObjectStorageKey", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "secretKey",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ObjectStorageKey resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ObjectStorageKey Get(string name, Input<string> id, ObjectStorageKeyState? state = null, CustomResourceOptions? options = null)
        {
            return new ObjectStorageKey(name, id, state, options);
        }
    }

    public sealed class ObjectStorageKeyArgs : global::Pulumi.ResourceArgs
    {
        [Input("bucketAccesses")]
        private InputList<Inputs.ObjectStorageKeyBucketAccessArgs>? _bucketAccesses;

        /// <summary>
        /// Defines this key as a Limited Access Key. Limited Access Keys restrict this Object Storage key’s access to only the bucket(s) declared in this array and define their bucket-level permissions. Not providing this block will not limit this Object Storage Key.
        /// </summary>
        public InputList<Inputs.ObjectStorageKeyBucketAccessArgs> BucketAccesses
        {
            get => _bucketAccesses ?? (_bucketAccesses = new InputList<Inputs.ObjectStorageKeyBucketAccessArgs>());
            set => _bucketAccesses = value;
        }

        /// <summary>
        /// The label given to this key. For display purposes only.
        /// </summary>
        [Input("label", required: true)]
        public Input<string> Label { get; set; } = null!;

        [Input("regions")]
        private InputList<string>? _regions;

        /// <summary>
        /// A set of regions where the key will grant access to create buckets.
        /// 
        /// - - -
        /// </summary>
        public InputList<string> Regions
        {
            get => _regions ?? (_regions = new InputList<string>());
            set => _regions = value;
        }

        public ObjectStorageKeyArgs()
        {
        }
        public static new ObjectStorageKeyArgs Empty => new ObjectStorageKeyArgs();
    }

    public sealed class ObjectStorageKeyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// This keypair's access key. This is not secret.
        /// </summary>
        [Input("accessKey")]
        public Input<string>? AccessKey { get; set; }

        [Input("bucketAccesses")]
        private InputList<Inputs.ObjectStorageKeyBucketAccessGetArgs>? _bucketAccesses;

        /// <summary>
        /// Defines this key as a Limited Access Key. Limited Access Keys restrict this Object Storage key’s access to only the bucket(s) declared in this array and define their bucket-level permissions. Not providing this block will not limit this Object Storage Key.
        /// </summary>
        public InputList<Inputs.ObjectStorageKeyBucketAccessGetArgs> BucketAccesses
        {
            get => _bucketAccesses ?? (_bucketAccesses = new InputList<Inputs.ObjectStorageKeyBucketAccessGetArgs>());
            set => _bucketAccesses = value;
        }

        /// <summary>
        /// The label given to this key. For display purposes only.
        /// </summary>
        [Input("label")]
        public Input<string>? Label { get; set; }

        /// <summary>
        /// Whether or not this key is a limited access key.
        /// </summary>
        [Input("limited")]
        public Input<bool>? Limited { get; set; }

        [Input("regions")]
        private InputList<string>? _regions;

        /// <summary>
        /// A set of regions where the key will grant access to create buckets.
        /// 
        /// - - -
        /// </summary>
        public InputList<string> Regions
        {
            get => _regions ?? (_regions = new InputList<string>());
            set => _regions = value;
        }

        [Input("regionsDetails")]
        private InputList<Inputs.ObjectStorageKeyRegionsDetailGetArgs>? _regionsDetails;

        /// <summary>
        /// A set of objects containing the detailed info of the regions where this key can access.
        /// </summary>
        public InputList<Inputs.ObjectStorageKeyRegionsDetailGetArgs> RegionsDetails
        {
            get => _regionsDetails ?? (_regionsDetails = new InputList<Inputs.ObjectStorageKeyRegionsDetailGetArgs>());
            set => _regionsDetails = value;
        }

        [Input("secretKey")]
        private Input<string>? _secretKey;

        /// <summary>
        /// This keypair's secret key.
        /// </summary>
        public Input<string>? SecretKey
        {
            get => _secretKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _secretKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public ObjectStorageKeyState()
        {
        }
        public static new ObjectStorageKeyState Empty => new ObjectStorageKeyState();
    }
}
