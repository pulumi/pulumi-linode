// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Linode Object Storage Object resource. This can be used to create, modify, and delete Linodes Object Storage Objects for Buckets.
 *
 * ## Example Usage
 * ### Uploading plaintext to a bucket
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const object = new linode.ObjectStorageObject("object", {
 *     bucket: "my-bucket",
 *     cluster: "us-east-1",
 *     key: "my-object",
 *     secretKey: linode_object_storage_key.my_key.secret_key,
 *     accessKey: linode_object_storage_key.my_key.access_key,
 *     content: "This is the content of the Object...",
 *     contentType: "text/plain",
 *     contentLanguage: "en",
 * });
 * ```
 */
export class ObjectStorageObject extends pulumi.CustomResource {
    /**
     * Get an existing ObjectStorageObject resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ObjectStorageObjectState, opts?: pulumi.CustomResourceOptions): ObjectStorageObject {
        return new ObjectStorageObject(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'linode:index/objectStorageObject:ObjectStorageObject';

    /**
     * Returns true if the given object is an instance of ObjectStorageObject.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ObjectStorageObject {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ObjectStorageObject.__pulumiType;
    }

    /**
     * The access key to authenticate with.
     */
    public readonly accessKey!: pulumi.Output<string>;
    /**
     * The canned ACL to apply. (`private`, `public-read`, `authenticated-read`, `public-read-write`, `custom`) (defaults to `private`).
     */
    public readonly acl!: pulumi.Output<string | undefined>;
    /**
     * The name of the bucket to put the object in.
     */
    public readonly bucket!: pulumi.Output<string>;
    /**
     * Specifies caching behavior along the request/reply chain Read [w3c cacheControl](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9) for further details.
     */
    public readonly cacheControl!: pulumi.Output<string | undefined>;
    /**
     * The cluster the bucket is in.
     */
    public readonly cluster!: pulumi.Output<string>;
    /**
     * Literal string value to use as the object content, which will be uploaded as UTF-8-encoded text.
     */
    public readonly content!: pulumi.Output<string | undefined>;
    /**
     * Base64-encoded data that will be decoded and uploaded as raw bytes for the object content. This allows safely uploading non-UTF8 binary data, but is recommended only for small content such as the result of the `gzipbase64` function with small text strings. For larger objects, use `source` to stream the content from a disk file.
     */
    public readonly contentBase64!: pulumi.Output<string | undefined>;
    /**
     * Specifies presentational information for the object. Read [w3c contentDisposition](http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1) for further information.
     */
    public readonly contentDisposition!: pulumi.Output<string | undefined>;
    /**
     * Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field. Read [w3c content encoding](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11) for further information.
     */
    public readonly contentEncoding!: pulumi.Output<string | undefined>;
    /**
     * The language the content is in e.g. en-US or en-GB.
     */
    public readonly contentLanguage!: pulumi.Output<string | undefined>;
    /**
     * A standard MIME type describing the format of the object data, e.g. application/octet-stream. All Valid MIME Types are valid for this input.
     */
    public readonly contentType!: pulumi.Output<string>;
    /**
     * The specific version of this object.
     */
    public readonly etag!: pulumi.Output<string>;
    /**
     * Allow the object to be deleted regardless of any legal hold or object lock (defaults to `false`).
     */
    public readonly forceDestroy!: pulumi.Output<boolean | undefined>;
    /**
     * They name of the object once it is in the bucket.
     */
    public readonly key!: pulumi.Output<string>;
    /**
     * A map of keys/values to provision metadata.
     */
    public readonly metadata!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * The secret key to authenitcate with.
     */
    public readonly secretKey!: pulumi.Output<string>;
    /**
     * The path to a file that will be read and uploaded as raw bytes for the object content. The path must either be relative to the root module or absolute.
     */
    public readonly source!: pulumi.Output<string | undefined>;
    /**
     * A unique version ID value for the object.
     */
    public /*out*/ readonly versionId!: pulumi.Output<string>;
    /**
     * Specifies a target URL for website redirect.
     */
    public readonly websiteRedirect!: pulumi.Output<string | undefined>;

    /**
     * Create a ObjectStorageObject resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ObjectStorageObjectArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ObjectStorageObjectArgs | ObjectStorageObjectState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ObjectStorageObjectState | undefined;
            resourceInputs["accessKey"] = state ? state.accessKey : undefined;
            resourceInputs["acl"] = state ? state.acl : undefined;
            resourceInputs["bucket"] = state ? state.bucket : undefined;
            resourceInputs["cacheControl"] = state ? state.cacheControl : undefined;
            resourceInputs["cluster"] = state ? state.cluster : undefined;
            resourceInputs["content"] = state ? state.content : undefined;
            resourceInputs["contentBase64"] = state ? state.contentBase64 : undefined;
            resourceInputs["contentDisposition"] = state ? state.contentDisposition : undefined;
            resourceInputs["contentEncoding"] = state ? state.contentEncoding : undefined;
            resourceInputs["contentLanguage"] = state ? state.contentLanguage : undefined;
            resourceInputs["contentType"] = state ? state.contentType : undefined;
            resourceInputs["etag"] = state ? state.etag : undefined;
            resourceInputs["forceDestroy"] = state ? state.forceDestroy : undefined;
            resourceInputs["key"] = state ? state.key : undefined;
            resourceInputs["metadata"] = state ? state.metadata : undefined;
            resourceInputs["secretKey"] = state ? state.secretKey : undefined;
            resourceInputs["source"] = state ? state.source : undefined;
            resourceInputs["versionId"] = state ? state.versionId : undefined;
            resourceInputs["websiteRedirect"] = state ? state.websiteRedirect : undefined;
        } else {
            const args = argsOrState as ObjectStorageObjectArgs | undefined;
            if ((!args || args.accessKey === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accessKey'");
            }
            if ((!args || args.bucket === undefined) && !opts.urn) {
                throw new Error("Missing required property 'bucket'");
            }
            if ((!args || args.cluster === undefined) && !opts.urn) {
                throw new Error("Missing required property 'cluster'");
            }
            if ((!args || args.key === undefined) && !opts.urn) {
                throw new Error("Missing required property 'key'");
            }
            if ((!args || args.secretKey === undefined) && !opts.urn) {
                throw new Error("Missing required property 'secretKey'");
            }
            resourceInputs["accessKey"] = args ? args.accessKey : undefined;
            resourceInputs["acl"] = args ? args.acl : undefined;
            resourceInputs["bucket"] = args ? args.bucket : undefined;
            resourceInputs["cacheControl"] = args ? args.cacheControl : undefined;
            resourceInputs["cluster"] = args ? args.cluster : undefined;
            resourceInputs["content"] = args ? args.content : undefined;
            resourceInputs["contentBase64"] = args ? args.contentBase64 : undefined;
            resourceInputs["contentDisposition"] = args ? args.contentDisposition : undefined;
            resourceInputs["contentEncoding"] = args ? args.contentEncoding : undefined;
            resourceInputs["contentLanguage"] = args ? args.contentLanguage : undefined;
            resourceInputs["contentType"] = args ? args.contentType : undefined;
            resourceInputs["etag"] = args ? args.etag : undefined;
            resourceInputs["forceDestroy"] = args ? args.forceDestroy : undefined;
            resourceInputs["key"] = args ? args.key : undefined;
            resourceInputs["metadata"] = args ? args.metadata : undefined;
            resourceInputs["secretKey"] = args ? args.secretKey : undefined;
            resourceInputs["source"] = args ? args.source : undefined;
            resourceInputs["websiteRedirect"] = args ? args.websiteRedirect : undefined;
            resourceInputs["versionId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ObjectStorageObject.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ObjectStorageObject resources.
 */
export interface ObjectStorageObjectState {
    /**
     * The access key to authenticate with.
     */
    accessKey?: pulumi.Input<string>;
    /**
     * The canned ACL to apply. (`private`, `public-read`, `authenticated-read`, `public-read-write`, `custom`) (defaults to `private`).
     */
    acl?: pulumi.Input<string>;
    /**
     * The name of the bucket to put the object in.
     */
    bucket?: pulumi.Input<string>;
    /**
     * Specifies caching behavior along the request/reply chain Read [w3c cacheControl](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9) for further details.
     */
    cacheControl?: pulumi.Input<string>;
    /**
     * The cluster the bucket is in.
     */
    cluster?: pulumi.Input<string>;
    /**
     * Literal string value to use as the object content, which will be uploaded as UTF-8-encoded text.
     */
    content?: pulumi.Input<string>;
    /**
     * Base64-encoded data that will be decoded and uploaded as raw bytes for the object content. This allows safely uploading non-UTF8 binary data, but is recommended only for small content such as the result of the `gzipbase64` function with small text strings. For larger objects, use `source` to stream the content from a disk file.
     */
    contentBase64?: pulumi.Input<string>;
    /**
     * Specifies presentational information for the object. Read [w3c contentDisposition](http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1) for further information.
     */
    contentDisposition?: pulumi.Input<string>;
    /**
     * Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field. Read [w3c content encoding](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11) for further information.
     */
    contentEncoding?: pulumi.Input<string>;
    /**
     * The language the content is in e.g. en-US or en-GB.
     */
    contentLanguage?: pulumi.Input<string>;
    /**
     * A standard MIME type describing the format of the object data, e.g. application/octet-stream. All Valid MIME Types are valid for this input.
     */
    contentType?: pulumi.Input<string>;
    /**
     * The specific version of this object.
     */
    etag?: pulumi.Input<string>;
    /**
     * Allow the object to be deleted regardless of any legal hold or object lock (defaults to `false`).
     */
    forceDestroy?: pulumi.Input<boolean>;
    /**
     * They name of the object once it is in the bucket.
     */
    key?: pulumi.Input<string>;
    /**
     * A map of keys/values to provision metadata.
     */
    metadata?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The secret key to authenitcate with.
     */
    secretKey?: pulumi.Input<string>;
    /**
     * The path to a file that will be read and uploaded as raw bytes for the object content. The path must either be relative to the root module or absolute.
     */
    source?: pulumi.Input<string>;
    /**
     * A unique version ID value for the object.
     */
    versionId?: pulumi.Input<string>;
    /**
     * Specifies a target URL for website redirect.
     */
    websiteRedirect?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ObjectStorageObject resource.
 */
export interface ObjectStorageObjectArgs {
    /**
     * The access key to authenticate with.
     */
    accessKey: pulumi.Input<string>;
    /**
     * The canned ACL to apply. (`private`, `public-read`, `authenticated-read`, `public-read-write`, `custom`) (defaults to `private`).
     */
    acl?: pulumi.Input<string>;
    /**
     * The name of the bucket to put the object in.
     */
    bucket: pulumi.Input<string>;
    /**
     * Specifies caching behavior along the request/reply chain Read [w3c cacheControl](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9) for further details.
     */
    cacheControl?: pulumi.Input<string>;
    /**
     * The cluster the bucket is in.
     */
    cluster: pulumi.Input<string>;
    /**
     * Literal string value to use as the object content, which will be uploaded as UTF-8-encoded text.
     */
    content?: pulumi.Input<string>;
    /**
     * Base64-encoded data that will be decoded and uploaded as raw bytes for the object content. This allows safely uploading non-UTF8 binary data, but is recommended only for small content such as the result of the `gzipbase64` function with small text strings. For larger objects, use `source` to stream the content from a disk file.
     */
    contentBase64?: pulumi.Input<string>;
    /**
     * Specifies presentational information for the object. Read [w3c contentDisposition](http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1) for further information.
     */
    contentDisposition?: pulumi.Input<string>;
    /**
     * Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field. Read [w3c content encoding](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11) for further information.
     */
    contentEncoding?: pulumi.Input<string>;
    /**
     * The language the content is in e.g. en-US or en-GB.
     */
    contentLanguage?: pulumi.Input<string>;
    /**
     * A standard MIME type describing the format of the object data, e.g. application/octet-stream. All Valid MIME Types are valid for this input.
     */
    contentType?: pulumi.Input<string>;
    /**
     * The specific version of this object.
     */
    etag?: pulumi.Input<string>;
    /**
     * Allow the object to be deleted regardless of any legal hold or object lock (defaults to `false`).
     */
    forceDestroy?: pulumi.Input<boolean>;
    /**
     * They name of the object once it is in the bucket.
     */
    key: pulumi.Input<string>;
    /**
     * A map of keys/values to provision metadata.
     */
    metadata?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The secret key to authenitcate with.
     */
    secretKey: pulumi.Input<string>;
    /**
     * The path to a file that will be read and uploaded as raw bytes for the object content. The path must either be relative to the root module or absolute.
     */
    source?: pulumi.Input<string>;
    /**
     * Specifies a target URL for website redirect.
     */
    websiteRedirect?: pulumi.Input<string>;
}
