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
    /// Provides a Linode Object Storage Object resource. This can be used to create, modify, and delete Linodes Object Storage Objects for Buckets.
    /// 
    /// ## Example Usage
    /// 
    /// ### Uploading plaintext to a bucket
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Linode = Pulumi.Linode;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var @object = new Linode.ObjectStorageObject("object", new()
    ///     {
    ///         Bucket = "my-bucket",
    ///         Cluster = "us-east-1",
    ///         Key = "my-object",
    ///         SecretKey = linode_object_storage_key.My_key.Secret_key,
    ///         AccessKey = linode_object_storage_key.My_key.Access_key,
    ///         Content = "This is the content of the Object...",
    ///         ContentType = "text/plain",
    ///         ContentLanguage = "en",
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [LinodeResourceType("linode:index/objectStorageObject:ObjectStorageObject")]
    public partial class ObjectStorageObject : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The REQUIRED access key to authenticate with. If it's not specified with the resource, you must provide its value by
        /// * configuring the `obj_access_key` in the provider configuration;
        /// * or, opting-in generating it implicitly at apply-time using `obj_use_temp_keys` at provider-level.
        /// </summary>
        [Output("accessKey")]
        public Output<string?> AccessKey { get; private set; } = null!;

        /// <summary>
        /// The canned ACL to apply. (`private`, `public-read`, `authenticated-read`, `public-read-write`, `custom`) (defaults to `private`).
        /// </summary>
        [Output("acl")]
        public Output<string?> Acl { get; private set; } = null!;

        /// <summary>
        /// The name of the bucket to put the object in.
        /// </summary>
        [Output("bucket")]
        public Output<string> Bucket { get; private set; } = null!;

        /// <summary>
        /// Specifies caching behavior along the request/reply chain Read [w3c cache_control](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9) for further details.
        /// </summary>
        [Output("cacheControl")]
        public Output<string?> CacheControl { get; private set; } = null!;

        /// <summary>
        /// The cluster the bucket is in.
        /// </summary>
        [Output("cluster")]
        public Output<string> Cluster { get; private set; } = null!;

        /// <summary>
        /// Literal string value to use as the object content, which will be uploaded as UTF-8-encoded text.
        /// </summary>
        [Output("content")]
        public Output<string?> Content { get; private set; } = null!;

        /// <summary>
        /// Base64-encoded data that will be decoded and uploaded as raw bytes for the object content. This allows safely uploading non-UTF8 binary data, but is recommended only for small content such as the result of the `gzipbase64` function with small text strings. For larger objects, use `source` to stream the content from a disk file.
        /// </summary>
        [Output("contentBase64")]
        public Output<string?> ContentBase64 { get; private set; } = null!;

        /// <summary>
        /// Specifies presentational information for the object. Read [w3c content_disposition](http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1) for further information.
        /// </summary>
        [Output("contentDisposition")]
        public Output<string?> ContentDisposition { get; private set; } = null!;

        /// <summary>
        /// Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field. Read [w3c content encoding](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11) for further information.
        /// </summary>
        [Output("contentEncoding")]
        public Output<string?> ContentEncoding { get; private set; } = null!;

        /// <summary>
        /// The language the content is in e.g. en-US or en-GB.
        /// </summary>
        [Output("contentLanguage")]
        public Output<string?> ContentLanguage { get; private set; } = null!;

        /// <summary>
        /// A standard MIME type describing the format of the object data, e.g. application/octet-stream. All Valid MIME Types are valid for this input.
        /// </summary>
        [Output("contentType")]
        public Output<string> ContentType { get; private set; } = null!;

        /// <summary>
        /// Used with the s3 client to make bucket changes and will be computed automatically if left blank, override for testing/debug purposes.
        /// </summary>
        [Output("endpoint")]
        public Output<string> Endpoint { get; private set; } = null!;

        /// <summary>
        /// The specific version of this object.
        /// </summary>
        [Output("etag")]
        public Output<string> Etag { get; private set; } = null!;

        /// <summary>
        /// Allow the object to be deleted regardless of any legal hold or object lock (defaults to `false`).
        /// </summary>
        [Output("forceDestroy")]
        public Output<bool?> ForceDestroy { get; private set; } = null!;

        /// <summary>
        /// They name of the object once it is in the bucket.
        /// </summary>
        [Output("key")]
        public Output<string> Key { get; private set; } = null!;

        /// <summary>
        /// A map of keys/values to provision metadata.
        /// </summary>
        [Output("metadata")]
        public Output<ImmutableDictionary<string, string>?> Metadata { get; private set; } = null!;

        /// <summary>
        /// The REQUIRED secret key to authenticate with. If it's not specified with the resource, you must provide its value by
        /// * configuring the `obj_secret_key` in the provider configuration;
        /// * or, opting-in generating it implicitly at apply-time using `obj_use_temp_keys` at provider-level.
        /// </summary>
        [Output("secretKey")]
        public Output<string?> SecretKey { get; private set; } = null!;

        /// <summary>
        /// The path to a file that will be read and uploaded as raw bytes for the object content. The path must either be relative to the root module or absolute.
        /// </summary>
        [Output("source")]
        public Output<string?> Source { get; private set; } = null!;

        /// <summary>
        /// A unique version ID value for the object.
        /// </summary>
        [Output("versionId")]
        public Output<string> VersionId { get; private set; } = null!;

        /// <summary>
        /// Specifies a target URL for website redirect.
        /// </summary>
        [Output("websiteRedirect")]
        public Output<string?> WebsiteRedirect { get; private set; } = null!;


        /// <summary>
        /// Create a ObjectStorageObject resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ObjectStorageObject(string name, ObjectStorageObjectArgs args, CustomResourceOptions? options = null)
            : base("linode:index/objectStorageObject:ObjectStorageObject", name, args ?? new ObjectStorageObjectArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ObjectStorageObject(string name, Input<string> id, ObjectStorageObjectState? state = null, CustomResourceOptions? options = null)
            : base("linode:index/objectStorageObject:ObjectStorageObject", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ObjectStorageObject resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ObjectStorageObject Get(string name, Input<string> id, ObjectStorageObjectState? state = null, CustomResourceOptions? options = null)
        {
            return new ObjectStorageObject(name, id, state, options);
        }
    }

    public sealed class ObjectStorageObjectArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The REQUIRED access key to authenticate with. If it's not specified with the resource, you must provide its value by
        /// * configuring the `obj_access_key` in the provider configuration;
        /// * or, opting-in generating it implicitly at apply-time using `obj_use_temp_keys` at provider-level.
        /// </summary>
        [Input("accessKey")]
        public Input<string>? AccessKey { get; set; }

        /// <summary>
        /// The canned ACL to apply. (`private`, `public-read`, `authenticated-read`, `public-read-write`, `custom`) (defaults to `private`).
        /// </summary>
        [Input("acl")]
        public Input<string>? Acl { get; set; }

        /// <summary>
        /// The name of the bucket to put the object in.
        /// </summary>
        [Input("bucket", required: true)]
        public Input<string> Bucket { get; set; } = null!;

        /// <summary>
        /// Specifies caching behavior along the request/reply chain Read [w3c cache_control](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9) for further details.
        /// </summary>
        [Input("cacheControl")]
        public Input<string>? CacheControl { get; set; }

        /// <summary>
        /// The cluster the bucket is in.
        /// </summary>
        [Input("cluster", required: true)]
        public Input<string> Cluster { get; set; } = null!;

        /// <summary>
        /// Literal string value to use as the object content, which will be uploaded as UTF-8-encoded text.
        /// </summary>
        [Input("content")]
        public Input<string>? Content { get; set; }

        /// <summary>
        /// Base64-encoded data that will be decoded and uploaded as raw bytes for the object content. This allows safely uploading non-UTF8 binary data, but is recommended only for small content such as the result of the `gzipbase64` function with small text strings. For larger objects, use `source` to stream the content from a disk file.
        /// </summary>
        [Input("contentBase64")]
        public Input<string>? ContentBase64 { get; set; }

        /// <summary>
        /// Specifies presentational information for the object. Read [w3c content_disposition](http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1) for further information.
        /// </summary>
        [Input("contentDisposition")]
        public Input<string>? ContentDisposition { get; set; }

        /// <summary>
        /// Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field. Read [w3c content encoding](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11) for further information.
        /// </summary>
        [Input("contentEncoding")]
        public Input<string>? ContentEncoding { get; set; }

        /// <summary>
        /// The language the content is in e.g. en-US or en-GB.
        /// </summary>
        [Input("contentLanguage")]
        public Input<string>? ContentLanguage { get; set; }

        /// <summary>
        /// A standard MIME type describing the format of the object data, e.g. application/octet-stream. All Valid MIME Types are valid for this input.
        /// </summary>
        [Input("contentType")]
        public Input<string>? ContentType { get; set; }

        /// <summary>
        /// Used with the s3 client to make bucket changes and will be computed automatically if left blank, override for testing/debug purposes.
        /// </summary>
        [Input("endpoint")]
        public Input<string>? Endpoint { get; set; }

        /// <summary>
        /// The specific version of this object.
        /// </summary>
        [Input("etag")]
        public Input<string>? Etag { get; set; }

        /// <summary>
        /// Allow the object to be deleted regardless of any legal hold or object lock (defaults to `false`).
        /// </summary>
        [Input("forceDestroy")]
        public Input<bool>? ForceDestroy { get; set; }

        /// <summary>
        /// They name of the object once it is in the bucket.
        /// </summary>
        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        [Input("metadata")]
        private InputMap<string>? _metadata;

        /// <summary>
        /// A map of keys/values to provision metadata.
        /// </summary>
        public InputMap<string> Metadata
        {
            get => _metadata ?? (_metadata = new InputMap<string>());
            set => _metadata = value;
        }

        [Input("secretKey")]
        private Input<string>? _secretKey;

        /// <summary>
        /// The REQUIRED secret key to authenticate with. If it's not specified with the resource, you must provide its value by
        /// * configuring the `obj_secret_key` in the provider configuration;
        /// * or, opting-in generating it implicitly at apply-time using `obj_use_temp_keys` at provider-level.
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

        /// <summary>
        /// The path to a file that will be read and uploaded as raw bytes for the object content. The path must either be relative to the root module or absolute.
        /// </summary>
        [Input("source")]
        public Input<string>? Source { get; set; }

        /// <summary>
        /// Specifies a target URL for website redirect.
        /// </summary>
        [Input("websiteRedirect")]
        public Input<string>? WebsiteRedirect { get; set; }

        public ObjectStorageObjectArgs()
        {
        }
        public static new ObjectStorageObjectArgs Empty => new ObjectStorageObjectArgs();
    }

    public sealed class ObjectStorageObjectState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The REQUIRED access key to authenticate with. If it's not specified with the resource, you must provide its value by
        /// * configuring the `obj_access_key` in the provider configuration;
        /// * or, opting-in generating it implicitly at apply-time using `obj_use_temp_keys` at provider-level.
        /// </summary>
        [Input("accessKey")]
        public Input<string>? AccessKey { get; set; }

        /// <summary>
        /// The canned ACL to apply. (`private`, `public-read`, `authenticated-read`, `public-read-write`, `custom`) (defaults to `private`).
        /// </summary>
        [Input("acl")]
        public Input<string>? Acl { get; set; }

        /// <summary>
        /// The name of the bucket to put the object in.
        /// </summary>
        [Input("bucket")]
        public Input<string>? Bucket { get; set; }

        /// <summary>
        /// Specifies caching behavior along the request/reply chain Read [w3c cache_control](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9) for further details.
        /// </summary>
        [Input("cacheControl")]
        public Input<string>? CacheControl { get; set; }

        /// <summary>
        /// The cluster the bucket is in.
        /// </summary>
        [Input("cluster")]
        public Input<string>? Cluster { get; set; }

        /// <summary>
        /// Literal string value to use as the object content, which will be uploaded as UTF-8-encoded text.
        /// </summary>
        [Input("content")]
        public Input<string>? Content { get; set; }

        /// <summary>
        /// Base64-encoded data that will be decoded and uploaded as raw bytes for the object content. This allows safely uploading non-UTF8 binary data, but is recommended only for small content such as the result of the `gzipbase64` function with small text strings. For larger objects, use `source` to stream the content from a disk file.
        /// </summary>
        [Input("contentBase64")]
        public Input<string>? ContentBase64 { get; set; }

        /// <summary>
        /// Specifies presentational information for the object. Read [w3c content_disposition](http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1) for further information.
        /// </summary>
        [Input("contentDisposition")]
        public Input<string>? ContentDisposition { get; set; }

        /// <summary>
        /// Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field. Read [w3c content encoding](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11) for further information.
        /// </summary>
        [Input("contentEncoding")]
        public Input<string>? ContentEncoding { get; set; }

        /// <summary>
        /// The language the content is in e.g. en-US or en-GB.
        /// </summary>
        [Input("contentLanguage")]
        public Input<string>? ContentLanguage { get; set; }

        /// <summary>
        /// A standard MIME type describing the format of the object data, e.g. application/octet-stream. All Valid MIME Types are valid for this input.
        /// </summary>
        [Input("contentType")]
        public Input<string>? ContentType { get; set; }

        /// <summary>
        /// Used with the s3 client to make bucket changes and will be computed automatically if left blank, override for testing/debug purposes.
        /// </summary>
        [Input("endpoint")]
        public Input<string>? Endpoint { get; set; }

        /// <summary>
        /// The specific version of this object.
        /// </summary>
        [Input("etag")]
        public Input<string>? Etag { get; set; }

        /// <summary>
        /// Allow the object to be deleted regardless of any legal hold or object lock (defaults to `false`).
        /// </summary>
        [Input("forceDestroy")]
        public Input<bool>? ForceDestroy { get; set; }

        /// <summary>
        /// They name of the object once it is in the bucket.
        /// </summary>
        [Input("key")]
        public Input<string>? Key { get; set; }

        [Input("metadata")]
        private InputMap<string>? _metadata;

        /// <summary>
        /// A map of keys/values to provision metadata.
        /// </summary>
        public InputMap<string> Metadata
        {
            get => _metadata ?? (_metadata = new InputMap<string>());
            set => _metadata = value;
        }

        [Input("secretKey")]
        private Input<string>? _secretKey;

        /// <summary>
        /// The REQUIRED secret key to authenticate with. If it's not specified with the resource, you must provide its value by
        /// * configuring the `obj_secret_key` in the provider configuration;
        /// * or, opting-in generating it implicitly at apply-time using `obj_use_temp_keys` at provider-level.
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

        /// <summary>
        /// The path to a file that will be read and uploaded as raw bytes for the object content. The path must either be relative to the root module or absolute.
        /// </summary>
        [Input("source")]
        public Input<string>? Source { get; set; }

        /// <summary>
        /// A unique version ID value for the object.
        /// </summary>
        [Input("versionId")]
        public Input<string>? VersionId { get; set; }

        /// <summary>
        /// Specifies a target URL for website redirect.
        /// </summary>
        [Input("websiteRedirect")]
        public Input<string>? WebsiteRedirect { get; set; }

        public ObjectStorageObjectState()
        {
        }
        public static new ObjectStorageObjectState Empty => new ObjectStorageObjectState();
    }
}
