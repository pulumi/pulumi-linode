// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Provides details about an LKE Cluster.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const my_cluster = pulumi.output(linode.getLkeCluster({
 *     id: 123,
 * }));
 * ```
 */
export function getLkeCluster(args: GetLkeClusterArgs, opts?: pulumi.InvokeOptions): Promise<GetLkeClusterResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("linode:index/getLkeCluster:getLkeCluster", {
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getLkeCluster.
 */
export interface GetLkeClusterArgs {
    /**
     * The LKE Cluster's ID.
     */
    id: number;
}

/**
 * A collection of values returned by getLkeCluster.
 */
export interface GetLkeClusterResult {
    /**
     * The endpoints for the Kubernetes API server.
     */
    readonly apiEndpoints: string[];
    readonly controlPlanes: outputs.GetLkeClusterControlPlane[];
    /**
     * The ID of the node.
     */
    readonly id: number;
    /**
     * The Kubernetes version for this Kubernetes cluster in the format of `major.minor` (e.g. `1.17`).
     */
    readonly k8sVersion: string;
    /**
     * The base64 encoded kubeconfig for the Kubernetes cluster.
     */
    readonly kubeconfig: string;
    readonly label: string;
    /**
     * Node pools associated with this cluster.
     */
    readonly pools: outputs.GetLkeClusterPool[];
    /**
     * This Kubernetes cluster's location.
     */
    readonly region: string;
    /**
     * The status of the node. (`ready`, `notReady`)
     */
    readonly status: string;
    /**
     * The tags applied to the cluster.
     */
    readonly tags: string[];
}

export function getLkeClusterOutput(args: GetLkeClusterOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetLkeClusterResult> {
    return pulumi.output(args).apply(a => getLkeCluster(a, opts))
}

/**
 * A collection of arguments for invoking getLkeCluster.
 */
export interface GetLkeClusterOutputArgs {
    /**
     * The LKE Cluster's ID.
     */
    id: pulumi.Input<number>;
}
