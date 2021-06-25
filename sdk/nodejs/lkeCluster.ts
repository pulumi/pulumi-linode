// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Manages an LKE cluster.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const my_cluster = new linode.LkeCluster("my-cluster", {
 *     k8sVersion: "1.20",
 *     label: "my-cluster",
 *     pools: [{
 *         count: 3,
 *         type: "g6-standard-2",
 *     }],
 *     region: "us-central",
 *     tags: ["prod"],
 * });
 * ```
 *
 * ## Import
 *
 * LKE Clusters can be imported using the `id`, e.g.
 *
 * ```sh
 *  $ pulumi import linode:index/lkeCluster:LkeCluster my_cluster 12345
 * ```
 */
export class LkeCluster extends pulumi.CustomResource {
    /**
     * Get an existing LkeCluster resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: LkeClusterState, opts?: pulumi.CustomResourceOptions): LkeCluster {
        return new LkeCluster(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'linode:index/lkeCluster:LkeCluster';

    /**
     * Returns true if the given object is an instance of LkeCluster.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is LkeCluster {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === LkeCluster.__pulumiType;
    }

    /**
     * The endpoints for the Kubernetes API server.
     */
    public /*out*/ readonly apiEndpoints!: pulumi.Output<string[]>;
    /**
     * The desired Kubernetes version for this Kubernetes cluster in the format of `major.minor` (e.g. `1.17`), and the latest supported patch version will be deployed.
     */
    public readonly k8sVersion!: pulumi.Output<string>;
    /**
     * The base64 encoded kubeconfig for the Kubernetes cluster.
     */
    public /*out*/ readonly kubeconfig!: pulumi.Output<string>;
    /**
     * This Kubernetes cluster's unique label.
     */
    public readonly label!: pulumi.Output<string>;
    /**
     * Additional nested attributes:
     */
    public readonly pools!: pulumi.Output<outputs.LkeClusterPool[]>;
    /**
     * This Kubernetes cluster's location.
     */
    public readonly region!: pulumi.Output<string>;
    /**
     * The status of the node. (`ready`, `notReady`)
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * An array of tags applied to the Kubernetes cluster. Tags are for organizational purposes only.
     */
    public readonly tags!: pulumi.Output<string[] | undefined>;

    /**
     * Create a LkeCluster resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: LkeClusterArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: LkeClusterArgs | LkeClusterState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as LkeClusterState | undefined;
            inputs["apiEndpoints"] = state ? state.apiEndpoints : undefined;
            inputs["k8sVersion"] = state ? state.k8sVersion : undefined;
            inputs["kubeconfig"] = state ? state.kubeconfig : undefined;
            inputs["label"] = state ? state.label : undefined;
            inputs["pools"] = state ? state.pools : undefined;
            inputs["region"] = state ? state.region : undefined;
            inputs["status"] = state ? state.status : undefined;
            inputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as LkeClusterArgs | undefined;
            if ((!args || args.k8sVersion === undefined) && !opts.urn) {
                throw new Error("Missing required property 'k8sVersion'");
            }
            if ((!args || args.label === undefined) && !opts.urn) {
                throw new Error("Missing required property 'label'");
            }
            if ((!args || args.pools === undefined) && !opts.urn) {
                throw new Error("Missing required property 'pools'");
            }
            if ((!args || args.region === undefined) && !opts.urn) {
                throw new Error("Missing required property 'region'");
            }
            inputs["k8sVersion"] = args ? args.k8sVersion : undefined;
            inputs["label"] = args ? args.label : undefined;
            inputs["pools"] = args ? args.pools : undefined;
            inputs["region"] = args ? args.region : undefined;
            inputs["tags"] = args ? args.tags : undefined;
            inputs["apiEndpoints"] = undefined /*out*/;
            inputs["kubeconfig"] = undefined /*out*/;
            inputs["status"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(LkeCluster.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering LkeCluster resources.
 */
export interface LkeClusterState {
    /**
     * The endpoints for the Kubernetes API server.
     */
    readonly apiEndpoints?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The desired Kubernetes version for this Kubernetes cluster in the format of `major.minor` (e.g. `1.17`), and the latest supported patch version will be deployed.
     */
    readonly k8sVersion?: pulumi.Input<string>;
    /**
     * The base64 encoded kubeconfig for the Kubernetes cluster.
     */
    readonly kubeconfig?: pulumi.Input<string>;
    /**
     * This Kubernetes cluster's unique label.
     */
    readonly label?: pulumi.Input<string>;
    /**
     * Additional nested attributes:
     */
    readonly pools?: pulumi.Input<pulumi.Input<inputs.LkeClusterPool>[]>;
    /**
     * This Kubernetes cluster's location.
     */
    readonly region?: pulumi.Input<string>;
    /**
     * The status of the node. (`ready`, `notReady`)
     */
    readonly status?: pulumi.Input<string>;
    /**
     * An array of tags applied to the Kubernetes cluster. Tags are for organizational purposes only.
     */
    readonly tags?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a LkeCluster resource.
 */
export interface LkeClusterArgs {
    /**
     * The desired Kubernetes version for this Kubernetes cluster in the format of `major.minor` (e.g. `1.17`), and the latest supported patch version will be deployed.
     */
    readonly k8sVersion: pulumi.Input<string>;
    /**
     * This Kubernetes cluster's unique label.
     */
    readonly label: pulumi.Input<string>;
    /**
     * Additional nested attributes:
     */
    readonly pools: pulumi.Input<pulumi.Input<inputs.LkeClusterPool>[]>;
    /**
     * This Kubernetes cluster's location.
     */
    readonly region: pulumi.Input<string>;
    /**
     * An array of tags applied to the Kubernetes cluster. Tags are for organizational purposes only.
     */
    readonly tags?: pulumi.Input<pulumi.Input<string>[]>;
}
