// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides information about a Linode Object Storage Bucket
 * For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-object-storage-bucket).
 *
 * ## Example Usage
 *
 * The following example shows how one might use this data source to access information about a Linode Object Storage Bucket.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const my-bucket = linode.getLinodeObjectStorageBucket({
 *     label: "my-bucket",
 *     region: "us-mia",
 * });
 * ```
 */
export function getLinodeObjectStorageBucket(args: GetLinodeObjectStorageBucketArgs, opts?: pulumi.InvokeOptions): Promise<GetLinodeObjectStorageBucketResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("linode:index/getLinodeObjectStorageBucket:getLinodeObjectStorageBucket", {
        "cluster": args.cluster,
        "label": args.label,
        "region": args.region,
    }, opts);
}

/**
 * A collection of arguments for invoking getLinodeObjectStorageBucket.
 */
export interface GetLinodeObjectStorageBucketArgs {
    /**
     * The ID of the Object Storage Cluster this bucket is in. Required if `region` is not configured.
     *
     * @deprecated The cluster attribute has been deprecated, please consider switching to the region attribute. For example, a cluster value of `us-mia-1` can be translated to a region value of `us-mia`.
     */
    cluster?: string;
    /**
     * The name of this bucket.
     */
    label: string;
    /**
     * The ID of the region this bucket is in. Required if `cluster` is not configured.
     */
    region?: string;
}

/**
 * A collection of values returned by getLinodeObjectStorageBucket.
 */
export interface GetLinodeObjectStorageBucketResult {
    /**
     * @deprecated The cluster attribute has been deprecated, please consider switching to the region attribute. For example, a cluster value of `us-mia-1` can be translated to a region value of `us-mia`.
     */
    readonly cluster: string;
    readonly created: string;
    readonly hostname: string;
    readonly id: string;
    readonly label: string;
    readonly objects: number;
    readonly region: string;
    readonly size: number;
}
/**
 * Provides information about a Linode Object Storage Bucket
 * For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-object-storage-bucket).
 *
 * ## Example Usage
 *
 * The following example shows how one might use this data source to access information about a Linode Object Storage Bucket.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const my-bucket = linode.getLinodeObjectStorageBucket({
 *     label: "my-bucket",
 *     region: "us-mia",
 * });
 * ```
 */
export function getLinodeObjectStorageBucketOutput(args: GetLinodeObjectStorageBucketOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetLinodeObjectStorageBucketResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("linode:index/getLinodeObjectStorageBucket:getLinodeObjectStorageBucket", {
        "cluster": args.cluster,
        "label": args.label,
        "region": args.region,
    }, opts);
}

/**
 * A collection of arguments for invoking getLinodeObjectStorageBucket.
 */
export interface GetLinodeObjectStorageBucketOutputArgs {
    /**
     * The ID of the Object Storage Cluster this bucket is in. Required if `region` is not configured.
     *
     * @deprecated The cluster attribute has been deprecated, please consider switching to the region attribute. For example, a cluster value of `us-mia-1` can be translated to a region value of `us-mia`.
     */
    cluster?: pulumi.Input<string>;
    /**
     * The name of this bucket.
     */
    label: pulumi.Input<string>;
    /**
     * The ID of the region this bucket is in. Required if `cluster` is not configured.
     */
    region?: pulumi.Input<string>;
}
