// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides information about a Linode Object Storage Cluster
 *
 * ## Example Usage
 *
 * The following example shows how one might use this data source to access information about a Linode Object Storage Cluster.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const primary = pulumi.output(linode.getObjectStorageCluster({
 *     id: "us-east-1",
 * }));
 * ```
 * ## Attributes
 *
 * The Linode Object Storage Cluster resource exports the following attributes:
 *
 * * `domain` - The base URL for this cluster.
 *
 * * `status` - This cluster's status. (`available`, `unavailable`)
 *
 * * `region` - The region this cluster is located in. See all regions [here](https://api.linode.com/v4/regions).
 *
 * * `staticSiteDomain` - The base URL for this cluster used when hosting static sites.
 */
export function getObjectStorageCluster(args: GetObjectStorageClusterArgs, opts?: pulumi.InvokeOptions): Promise<GetObjectStorageClusterResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("linode:index/getObjectStorageCluster:getObjectStorageCluster", {
        "domain": args.domain,
        "id": args.id,
        "region": args.region,
        "staticSiteDomain": args.staticSiteDomain,
        "status": args.status,
    }, opts);
}

/**
 * A collection of arguments for invoking getObjectStorageCluster.
 */
export interface GetObjectStorageClusterArgs {
    domain?: string;
    /**
     * The unique ID of this cluster.
     */
    id: string;
    region?: string;
    staticSiteDomain?: string;
    status?: string;
}

/**
 * A collection of values returned by getObjectStorageCluster.
 */
export interface GetObjectStorageClusterResult {
    readonly domain: string;
    readonly id: string;
    readonly region: string;
    readonly staticSiteDomain: string;
    readonly status: string;
}

export function getObjectStorageClusterOutput(args: GetObjectStorageClusterOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetObjectStorageClusterResult> {
    return pulumi.output(args).apply(a => getObjectStorageCluster(a, opts))
}

/**
 * A collection of arguments for invoking getObjectStorageCluster.
 */
export interface GetObjectStorageClusterOutputArgs {
    domain?: pulumi.Input<string>;
    /**
     * The unique ID of this cluster.
     */
    id: pulumi.Input<string>;
    region?: pulumi.Input<string>;
    staticSiteDomain?: pulumi.Input<string>;
    status?: pulumi.Input<string>;
}
