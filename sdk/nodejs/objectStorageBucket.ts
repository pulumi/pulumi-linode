// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Provides a Linode Object Storage Bucket resource. This can be used to create, modify, and delete Linodes Object Storage Buckets.
 *
 * ## Example Usage
 *
 * The following example shows how one might use this resource to create an Object Storage Bucket.
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
 *     label: `%s`,
 * });
 * ```
 *
 * ## Import
 *
 * Linodes Object Storage Buckets can be imported using the resource `id` which is made of `cluster:label`, e.g.
 *
 * ```sh
 *  $ pulumi import linode:index/objectStorageBucket:ObjectStorageBucket mybucket us-east-1:foobar
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
     * The S3 access key to use for this resource. (Required for lifecycle_rule and versioning)
     */
    public readonly accessKey!: pulumi.Output<string | undefined>;
    /**
     * The Access Control Level of the bucket using a canned ACL string. See all ACL strings in the Linode API v4 documentation.
     */
    public readonly acl!: pulumi.Output<string | undefined>;
    /**
     * The cert used by this Object Storage Bucket.
     */
    public readonly cert!: pulumi.Output<outputs.ObjectStorageBucketCert | undefined>;
    /**
     * The cluster of the Linode Object Storage Bucket.
     */
    public readonly cluster!: pulumi.Output<string>;
    /**
     * If true, the bucket will have CORS enabled for all origins.
     */
    public readonly corsEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * The label of the Linode Object Storage Bucket.
     */
    public readonly label!: pulumi.Output<string>;
    /**
     * Lifecycle rules to be applied to the bucket.
     */
    public readonly lifecycleRules!: pulumi.Output<outputs.ObjectStorageBucketLifecycleRule[] | undefined>;
    /**
     * The S3 secret key to use for this resource. (Required for lifecycle_rule and versioning)
     */
    public readonly secretKey!: pulumi.Output<string | undefined>;
    /**
     * Whether to enable versioning. Once you version-enable a bucket, it can never return to an unversioned state. You can, however, suspend versioning on that bucket.
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
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ObjectStorageBucketState | undefined;
            inputs["accessKey"] = state ? state.accessKey : undefined;
            inputs["acl"] = state ? state.acl : undefined;
            inputs["cert"] = state ? state.cert : undefined;
            inputs["cluster"] = state ? state.cluster : undefined;
            inputs["corsEnabled"] = state ? state.corsEnabled : undefined;
            inputs["label"] = state ? state.label : undefined;
            inputs["lifecycleRules"] = state ? state.lifecycleRules : undefined;
            inputs["secretKey"] = state ? state.secretKey : undefined;
            inputs["versioning"] = state ? state.versioning : undefined;
        } else {
            const args = argsOrState as ObjectStorageBucketArgs | undefined;
            if ((!args || args.cluster === undefined) && !opts.urn) {
                throw new Error("Missing required property 'cluster'");
            }
            if ((!args || args.label === undefined) && !opts.urn) {
                throw new Error("Missing required property 'label'");
            }
            inputs["accessKey"] = args ? args.accessKey : undefined;
            inputs["acl"] = args ? args.acl : undefined;
            inputs["cert"] = args ? args.cert : undefined;
            inputs["cluster"] = args ? args.cluster : undefined;
            inputs["corsEnabled"] = args ? args.corsEnabled : undefined;
            inputs["label"] = args ? args.label : undefined;
            inputs["lifecycleRules"] = args ? args.lifecycleRules : undefined;
            inputs["secretKey"] = args ? args.secretKey : undefined;
            inputs["versioning"] = args ? args.versioning : undefined;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(ObjectStorageBucket.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ObjectStorageBucket resources.
 */
export interface ObjectStorageBucketState {
    /**
     * The S3 access key to use for this resource. (Required for lifecycle_rule and versioning)
     */
    readonly accessKey?: pulumi.Input<string>;
    /**
     * The Access Control Level of the bucket using a canned ACL string. See all ACL strings in the Linode API v4 documentation.
     */
    readonly acl?: pulumi.Input<string>;
    /**
     * The cert used by this Object Storage Bucket.
     */
    readonly cert?: pulumi.Input<inputs.ObjectStorageBucketCert>;
    /**
     * The cluster of the Linode Object Storage Bucket.
     */
    readonly cluster?: pulumi.Input<string>;
    /**
     * If true, the bucket will have CORS enabled for all origins.
     */
    readonly corsEnabled?: pulumi.Input<boolean>;
    /**
     * The label of the Linode Object Storage Bucket.
     */
    readonly label?: pulumi.Input<string>;
    /**
     * Lifecycle rules to be applied to the bucket.
     */
    readonly lifecycleRules?: pulumi.Input<pulumi.Input<inputs.ObjectStorageBucketLifecycleRule>[]>;
    /**
     * The S3 secret key to use for this resource. (Required for lifecycle_rule and versioning)
     */
    readonly secretKey?: pulumi.Input<string>;
    /**
     * Whether to enable versioning. Once you version-enable a bucket, it can never return to an unversioned state. You can, however, suspend versioning on that bucket.
     */
    readonly versioning?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a ObjectStorageBucket resource.
 */
export interface ObjectStorageBucketArgs {
    /**
     * The S3 access key to use for this resource. (Required for lifecycle_rule and versioning)
     */
    readonly accessKey?: pulumi.Input<string>;
    /**
     * The Access Control Level of the bucket using a canned ACL string. See all ACL strings in the Linode API v4 documentation.
     */
    readonly acl?: pulumi.Input<string>;
    /**
     * The cert used by this Object Storage Bucket.
     */
    readonly cert?: pulumi.Input<inputs.ObjectStorageBucketCert>;
    /**
     * The cluster of the Linode Object Storage Bucket.
     */
    readonly cluster: pulumi.Input<string>;
    /**
     * If true, the bucket will have CORS enabled for all origins.
     */
    readonly corsEnabled?: pulumi.Input<boolean>;
    /**
     * The label of the Linode Object Storage Bucket.
     */
    readonly label: pulumi.Input<string>;
    /**
     * Lifecycle rules to be applied to the bucket.
     */
    readonly lifecycleRules?: pulumi.Input<pulumi.Input<inputs.ObjectStorageBucketLifecycleRule>[]>;
    /**
     * The S3 secret key to use for this resource. (Required for lifecycle_rule and versioning)
     */
    readonly secretKey?: pulumi.Input<string>;
    /**
     * Whether to enable versioning. Once you version-enable a bucket, it can never return to an unversioned state. You can, however, suspend versioning on that bucket.
     */
    readonly versioning?: pulumi.Input<boolean>;
}
