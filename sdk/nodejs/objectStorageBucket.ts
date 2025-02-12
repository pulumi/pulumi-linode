// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a Linode Object Storage Bucket resource. This can be used to create, modify, and delete Linodes Object Storage Buckets.
 * For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/post-object-storage-bucket).
 *
 * ## Example Usage
 *
 * The following example shows how one might use this resource to create an Object Storage Bucket:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const primary = linode.getObjectStorageCluster({
 *     id: "us-east-1",
 * });
 * const foobar = new linode.ObjectStorageBucket("foobar", {
 *     cluster: primary.then(primary => primary.id),
 *     label: "mybucket",
 * });
 * ```
 *
 * Creating an Object Storage Bucket with Lifecycle rules:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const mykey = new linode.ObjectStorageKey("mykey", {label: "image-access"});
 * const mybucket = new linode.ObjectStorageBucket("mybucket", {
 *     accessKey: mykey.accessKey,
 *     secretKey: mykey.secretKey,
 *     region: "us-mia",
 *     label: "mybucket",
 *     lifecycleRules: [{
 *         id: "my-rule",
 *         enabled: true,
 *         abortIncompleteMultipartUploadDays: 5,
 *         expiration: {
 *             date: "2021-06-21",
 *         },
 *     }],
 * });
 * ```
 *
 * Creating an Object Storage Bucket with Lifecycle rules using provider-level object credentials
 *
 * ## Import
 *
 * Linodes Object Storage Buckets can be imported using the resource `id` which is made of `cluster:label`, e.g.
 *
 * ```sh
 * $ pulumi import linode:index/objectStorageBucket:ObjectStorageBucket mybucket us-east-1:foobar
 * ```
 */
export class ObjectStorageBucket extends pulumi.CustomResource {
    /**
     * Get an existing ObjectStorageBucket resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ObjectStorageBucketState, opts?: pulumi.CustomResourceOptions): ObjectStorageBucket {
        return new ObjectStorageBucket(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'linode:index/objectStorageBucket:ObjectStorageBucket';

    /**
     * Returns true if the given object is an instance of ObjectStorageBucket.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ObjectStorageBucket {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ObjectStorageBucket.__pulumiType;
    }

    /**
     * The access key to authenticate with. If not specified with the resource, its value can be
     * * configured by `objAccessKey` in the provider configuration;
     * * or, generated implicitly at apply-time if `objUseTempKeys` at provider-level is set.
     */
    public readonly accessKey!: pulumi.Output<string | undefined>;
    /**
     * The Access Control Level of the bucket using a canned ACL string. See all ACL strings [in the Linode API v4 documentation](https://techdocs.akamai.com/linode-api/reference/post-object-storage-bucket).
     */
    public readonly acl!: pulumi.Output<string | undefined>;
    /**
     * The cert used by this Object Storage Bucket.
     */
    public readonly cert!: pulumi.Output<outputs.ObjectStorageBucketCert | undefined>;
    /**
     * The cluster of the Linode Object Storage Bucket. This is deprecated in favor of `region` attribute.
     * For example, `us-mia-1` cluster can be translated into `us-mia` region. Exactly one of `region` and `cluster` is required for creating a bucket.
     *
     * @deprecated The cluster attribute has been deprecated, please consider switching to the region attribute. For example, a cluster value of `us-mia-1` can be translated to a region value of `us-mia`.
     */
    public readonly cluster!: pulumi.Output<string>;
    /**
     * If true, the bucket will have CORS enabled for all origins.
     */
    public readonly corsEnabled!: pulumi.Output<boolean>;
    /**
     * The endpoint for the bucket used for s3 connections.
     *
     * @deprecated Use `s3Endpoint` instead
     */
    public /*out*/ readonly endpoint!: pulumi.Output<string>;
    /**
     * The type of `s3Endpoint` available to the user in this region. See [Endpoint types](https://techdocs.akamai.com/cloud-computing/docs/object-storage#endpoint-type) for more information.
     */
    public readonly endpointType!: pulumi.Output<string>;
    /**
     * The hostname where this bucket can be accessed. This hostname can be accessed through a browser if the bucket is made
     * public.
     */
    public /*out*/ readonly hostname!: pulumi.Output<string>;
    /**
     * The label of the Linode Object Storage Bucket.
     */
    public readonly label!: pulumi.Output<string>;
    /**
     * Lifecycle rules to be applied to the bucket.
     */
    public readonly lifecycleRules!: pulumi.Output<outputs.ObjectStorageBucketLifecycleRule[] | undefined>;
    /**
     * The region of the Linode Object Storage Bucket. Exactly one of `region` and `cluster` is required for creating a bucket.
     */
    public readonly region!: pulumi.Output<string>;
    /**
     * The user's s3 endpoint URL, based on the `endpointType` and `region`.
     */
    public readonly s3Endpoint!: pulumi.Output<string>;
    /**
     * The secret key to authenticate with. If not specified with the resource, its value can be
     * * configured by `objSecretKey` in the provider configuration;
     * * or, generated implicitly at apply-time if `objUseTempKeys` at provider-level is set.
     */
    public readonly secretKey!: pulumi.Output<string | undefined>;
    /**
     * Whether to enable versioning. Once you version-enable a bucket, it can never return to an unversioned state. You can, however, suspend versioning on that bucket. (Requires `accessKey` and `secretKey`)
     *
     * * `lifecycleRule` - (Optional) Lifecycle rules to be applied to the bucket. (Requires `accessKey` and `secretKey`)
     *
     * * `cert` - (Optional) The bucket's TLS/SSL certificate.
     */
    public readonly versioning!: pulumi.Output<boolean>;

    /**
     * Create a ObjectStorageBucket resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ObjectStorageBucketArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ObjectStorageBucketArgs | ObjectStorageBucketState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ObjectStorageBucketState | undefined;
            resourceInputs["accessKey"] = state ? state.accessKey : undefined;
            resourceInputs["acl"] = state ? state.acl : undefined;
            resourceInputs["cert"] = state ? state.cert : undefined;
            resourceInputs["cluster"] = state ? state.cluster : undefined;
            resourceInputs["corsEnabled"] = state ? state.corsEnabled : undefined;
            resourceInputs["endpoint"] = state ? state.endpoint : undefined;
            resourceInputs["endpointType"] = state ? state.endpointType : undefined;
            resourceInputs["hostname"] = state ? state.hostname : undefined;
            resourceInputs["label"] = state ? state.label : undefined;
            resourceInputs["lifecycleRules"] = state ? state.lifecycleRules : undefined;
            resourceInputs["region"] = state ? state.region : undefined;
            resourceInputs["s3Endpoint"] = state ? state.s3Endpoint : undefined;
            resourceInputs["secretKey"] = state ? state.secretKey : undefined;
            resourceInputs["versioning"] = state ? state.versioning : undefined;
        } else {
            const args = argsOrState as ObjectStorageBucketArgs | undefined;
            if ((!args || args.label === undefined) && !opts.urn) {
                throw new Error("Missing required property 'label'");
            }
            resourceInputs["accessKey"] = args ? args.accessKey : undefined;
            resourceInputs["acl"] = args ? args.acl : undefined;
            resourceInputs["cert"] = args ? args.cert : undefined;
            resourceInputs["cluster"] = args ? args.cluster : undefined;
            resourceInputs["corsEnabled"] = args ? args.corsEnabled : undefined;
            resourceInputs["endpointType"] = args ? args.endpointType : undefined;
            resourceInputs["label"] = args ? args.label : undefined;
            resourceInputs["lifecycleRules"] = args ? args.lifecycleRules : undefined;
            resourceInputs["region"] = args ? args.region : undefined;
            resourceInputs["s3Endpoint"] = args ? args.s3Endpoint : undefined;
            resourceInputs["secretKey"] = args?.secretKey ? pulumi.secret(args.secretKey) : undefined;
            resourceInputs["versioning"] = args ? args.versioning : undefined;
            resourceInputs["endpoint"] = undefined /*out*/;
            resourceInputs["hostname"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["secretKey"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(ObjectStorageBucket.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ObjectStorageBucket resources.
 */
export interface ObjectStorageBucketState {
    /**
     * The access key to authenticate with. If not specified with the resource, its value can be
     * * configured by `objAccessKey` in the provider configuration;
     * * or, generated implicitly at apply-time if `objUseTempKeys` at provider-level is set.
     */
    accessKey?: pulumi.Input<string>;
    /**
     * The Access Control Level of the bucket using a canned ACL string. See all ACL strings [in the Linode API v4 documentation](https://techdocs.akamai.com/linode-api/reference/post-object-storage-bucket).
     */
    acl?: pulumi.Input<string>;
    /**
     * The cert used by this Object Storage Bucket.
     */
    cert?: pulumi.Input<inputs.ObjectStorageBucketCert>;
    /**
     * The cluster of the Linode Object Storage Bucket. This is deprecated in favor of `region` attribute.
     * For example, `us-mia-1` cluster can be translated into `us-mia` region. Exactly one of `region` and `cluster` is required for creating a bucket.
     *
     * @deprecated The cluster attribute has been deprecated, please consider switching to the region attribute. For example, a cluster value of `us-mia-1` can be translated to a region value of `us-mia`.
     */
    cluster?: pulumi.Input<string>;
    /**
     * If true, the bucket will have CORS enabled for all origins.
     */
    corsEnabled?: pulumi.Input<boolean>;
    /**
     * The endpoint for the bucket used for s3 connections.
     *
     * @deprecated Use `s3Endpoint` instead
     */
    endpoint?: pulumi.Input<string>;
    /**
     * The type of `s3Endpoint` available to the user in this region. See [Endpoint types](https://techdocs.akamai.com/cloud-computing/docs/object-storage#endpoint-type) for more information.
     */
    endpointType?: pulumi.Input<string>;
    /**
     * The hostname where this bucket can be accessed. This hostname can be accessed through a browser if the bucket is made
     * public.
     */
    hostname?: pulumi.Input<string>;
    /**
     * The label of the Linode Object Storage Bucket.
     */
    label?: pulumi.Input<string>;
    /**
     * Lifecycle rules to be applied to the bucket.
     */
    lifecycleRules?: pulumi.Input<pulumi.Input<inputs.ObjectStorageBucketLifecycleRule>[]>;
    /**
     * The region of the Linode Object Storage Bucket. Exactly one of `region` and `cluster` is required for creating a bucket.
     */
    region?: pulumi.Input<string>;
    /**
     * The user's s3 endpoint URL, based on the `endpointType` and `region`.
     */
    s3Endpoint?: pulumi.Input<string>;
    /**
     * The secret key to authenticate with. If not specified with the resource, its value can be
     * * configured by `objSecretKey` in the provider configuration;
     * * or, generated implicitly at apply-time if `objUseTempKeys` at provider-level is set.
     */
    secretKey?: pulumi.Input<string>;
    /**
     * Whether to enable versioning. Once you version-enable a bucket, it can never return to an unversioned state. You can, however, suspend versioning on that bucket. (Requires `accessKey` and `secretKey`)
     *
     * * `lifecycleRule` - (Optional) Lifecycle rules to be applied to the bucket. (Requires `accessKey` and `secretKey`)
     *
     * * `cert` - (Optional) The bucket's TLS/SSL certificate.
     */
    versioning?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a ObjectStorageBucket resource.
 */
export interface ObjectStorageBucketArgs {
    /**
     * The access key to authenticate with. If not specified with the resource, its value can be
     * * configured by `objAccessKey` in the provider configuration;
     * * or, generated implicitly at apply-time if `objUseTempKeys` at provider-level is set.
     */
    accessKey?: pulumi.Input<string>;
    /**
     * The Access Control Level of the bucket using a canned ACL string. See all ACL strings [in the Linode API v4 documentation](https://techdocs.akamai.com/linode-api/reference/post-object-storage-bucket).
     */
    acl?: pulumi.Input<string>;
    /**
     * The cert used by this Object Storage Bucket.
     */
    cert?: pulumi.Input<inputs.ObjectStorageBucketCert>;
    /**
     * The cluster of the Linode Object Storage Bucket. This is deprecated in favor of `region` attribute.
     * For example, `us-mia-1` cluster can be translated into `us-mia` region. Exactly one of `region` and `cluster` is required for creating a bucket.
     *
     * @deprecated The cluster attribute has been deprecated, please consider switching to the region attribute. For example, a cluster value of `us-mia-1` can be translated to a region value of `us-mia`.
     */
    cluster?: pulumi.Input<string>;
    /**
     * If true, the bucket will have CORS enabled for all origins.
     */
    corsEnabled?: pulumi.Input<boolean>;
    /**
     * The type of `s3Endpoint` available to the user in this region. See [Endpoint types](https://techdocs.akamai.com/cloud-computing/docs/object-storage#endpoint-type) for more information.
     */
    endpointType?: pulumi.Input<string>;
    /**
     * The label of the Linode Object Storage Bucket.
     */
    label: pulumi.Input<string>;
    /**
     * Lifecycle rules to be applied to the bucket.
     */
    lifecycleRules?: pulumi.Input<pulumi.Input<inputs.ObjectStorageBucketLifecycleRule>[]>;
    /**
     * The region of the Linode Object Storage Bucket. Exactly one of `region` and `cluster` is required for creating a bucket.
     */
    region?: pulumi.Input<string>;
    /**
     * The user's s3 endpoint URL, based on the `endpointType` and `region`.
     */
    s3Endpoint?: pulumi.Input<string>;
    /**
     * The secret key to authenticate with. If not specified with the resource, its value can be
     * * configured by `objSecretKey` in the provider configuration;
     * * or, generated implicitly at apply-time if `objUseTempKeys` at provider-level is set.
     */
    secretKey?: pulumi.Input<string>;
    /**
     * Whether to enable versioning. Once you version-enable a bucket, it can never return to an unversioned state. You can, however, suspend versioning on that bucket. (Requires `accessKey` and `secretKey`)
     *
     * * `lifecycleRule` - (Optional) Lifecycle rules to be applied to the bucket. (Requires `accessKey` and `secretKey`)
     *
     * * `cert` - (Optional) The bucket's TLS/SSL certificate.
     */
    versioning?: pulumi.Input<boolean>;
}
