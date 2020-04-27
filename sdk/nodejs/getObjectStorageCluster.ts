// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides information about a Linode Object Storage Cluster
 * 
 * ## Example Usage
 * 
 * 
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 * 
 * const primary = pulumi.output(linode.getObjectStorageCluster({
 *     id: "us-east-1",
 * }, { async: true }));
 * ```
 * 
 * ## Attributes
 * 
 * The Linode Object Storage Cluster resource exports the following attributes:
 * 
 * * `domain` - The base URL for this cluster.
 * 
 * * `status` - This cluster's status.
 * 
 * * `region` - The region this cluster is located in.
 * 
 * * `staticSiteDomain` - The base URL for this cluster used when hosting static sites.
 *
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-linode/blob/master/website/docs/d/object_storage_cluster.html.md.
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
    readonly domain?: string;
    /**
     * The unique ID of this cluster.
     */
    readonly id: string;
    readonly region?: string;
    readonly staticSiteDomain?: string;
    readonly status?: string;
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
