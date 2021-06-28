// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Provides a Linode NodeBalancer resource.  This can be used to create, modify, and delete Linodes NodeBalancers in Linode's managed load balancer service.
 * For more information, see [Getting Started with NodeBalancers](https://www.linode.com/docs/platform/nodebalancer/getting-started-with-nodebalancers/) and the [Linode APIv4 docs](https://developers.linode.com/api/v4#operation/createNodeBalancer).
 *
 * ## Example Usage
 *
 * The following example shows how one might use this resource to configure a NodeBalancer.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const foobar = new linode.NodeBalancer("foobar", {
 *     clientConnThrottle: 20,
 *     label: "mynodebalancer",
 *     region: "us-east",
 *     tags: ["foobar"],
 * });
 * ```
 * ## Attributes
 *
 * This resource exports the following attributes:
 *
 * * `hostname` - This NodeBalancer's hostname, ending with .nodebalancer.linode.com
 *
 * * `ipv4` - The Public IPv4 Address of this NodeBalancer
 *
 * * `ipv6` - The Public IPv6 Address of this NodeBalancer
 *
 * * `created` - When this NodeBalancer was created
 *
 * * `updated` - When this NodeBalancer was last updated.
 *
 * * `transfer` - The network transfer stats for the current month
 *
 * ### transfer
 *
 * The following attributes are available on transfer:
 *
 * * `in` - The total transfer, in MB, used by this NodeBalancer for the current month
 *
 * * `out` - The total inbound transfer, in MB, used for this NodeBalancer for the current month
 *
 * * `total` - The total outbound transfer, in MB, used for this NodeBalancer for the current month
 *
 * ## Import
 *
 * Linodes NodeBalancers can be imported using the Linode NodeBalancer `id`, e.g.
 *
 * ```sh
 *  $ pulumi import linode:index/nodeBalancer:NodeBalancer mynodebalancer 1234567
 * ```
 *
 *  The Linode Guide, [Import Existing Infrastructure to Terraform](https://www.linode.com/docs/applications/configuration-management/import-existing-infrastructure-to-terraform/), offers resource importing examples for NodeBalancers and other Linode resource types.
 */
export class NodeBalancer extends pulumi.CustomResource {
    /**
     * Get an existing NodeBalancer resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: NodeBalancerState, opts?: pulumi.CustomResourceOptions): NodeBalancer {
        return new NodeBalancer(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'linode:index/nodeBalancer:NodeBalancer';

    /**
     * Returns true if the given object is an instance of NodeBalancer.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is NodeBalancer {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === NodeBalancer.__pulumiType;
    }

    /**
     * Throttle connections per second (0-20). Set to 0 (default) to disable throttling.
     */
    public readonly clientConnThrottle!: pulumi.Output<number | undefined>;
    /**
     * When this NodeBalancer was created.
     */
    public /*out*/ readonly created!: pulumi.Output<string>;
    /**
     * This NodeBalancer's hostname, ending with .nodebalancer.linode.com
     */
    public /*out*/ readonly hostname!: pulumi.Output<string>;
    /**
     * The Public IPv4 Address of this NodeBalancer
     */
    public /*out*/ readonly ipv4!: pulumi.Output<string>;
    /**
     * The Public IPv6 Address of this NodeBalancer
     */
    public /*out*/ readonly ipv6!: pulumi.Output<string>;
    /**
     * The label of the Linode NodeBalancer
     */
    public readonly label!: pulumi.Output<string | undefined>;
    /**
     * The region where this NodeBalancer will be deployed.  Examples are `"us-east"`, `"us-west"`, `"ap-south"`, etc. See all regions [here](https://api.linode.com/v4/regions).  *Changing `region` forces the creation of a new Linode NodeBalancer.*.
     */
    public readonly region!: pulumi.Output<string>;
    /**
     * A list of tags applied to this object. Tags are for organizational purposes only.
     */
    public readonly tags!: pulumi.Output<string[] | undefined>;
    /**
     * Information about the amount of transfer this NodeBalancer has had so far this month.
     */
    public /*out*/ readonly transfers!: pulumi.Output<outputs.NodeBalancerTransfer[]>;
    /**
     * When this NodeBalancer was last updated.
     */
    public /*out*/ readonly updated!: pulumi.Output<string>;

    /**
     * Create a NodeBalancer resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: NodeBalancerArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: NodeBalancerArgs | NodeBalancerState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as NodeBalancerState | undefined;
            inputs["clientConnThrottle"] = state ? state.clientConnThrottle : undefined;
            inputs["created"] = state ? state.created : undefined;
            inputs["hostname"] = state ? state.hostname : undefined;
            inputs["ipv4"] = state ? state.ipv4 : undefined;
            inputs["ipv6"] = state ? state.ipv6 : undefined;
            inputs["label"] = state ? state.label : undefined;
            inputs["region"] = state ? state.region : undefined;
            inputs["tags"] = state ? state.tags : undefined;
            inputs["transfers"] = state ? state.transfers : undefined;
            inputs["updated"] = state ? state.updated : undefined;
        } else {
            const args = argsOrState as NodeBalancerArgs | undefined;
            if ((!args || args.region === undefined) && !opts.urn) {
                throw new Error("Missing required property 'region'");
            }
            inputs["clientConnThrottle"] = args ? args.clientConnThrottle : undefined;
            inputs["label"] = args ? args.label : undefined;
            inputs["region"] = args ? args.region : undefined;
            inputs["tags"] = args ? args.tags : undefined;
            inputs["created"] = undefined /*out*/;
            inputs["hostname"] = undefined /*out*/;
            inputs["ipv4"] = undefined /*out*/;
            inputs["ipv6"] = undefined /*out*/;
            inputs["transfers"] = undefined /*out*/;
            inputs["updated"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(NodeBalancer.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering NodeBalancer resources.
 */
export interface NodeBalancerState {
    /**
     * Throttle connections per second (0-20). Set to 0 (default) to disable throttling.
     */
    readonly clientConnThrottle?: pulumi.Input<number>;
    /**
     * When this NodeBalancer was created.
     */
    readonly created?: pulumi.Input<string>;
    /**
     * This NodeBalancer's hostname, ending with .nodebalancer.linode.com
     */
    readonly hostname?: pulumi.Input<string>;
    /**
     * The Public IPv4 Address of this NodeBalancer
     */
    readonly ipv4?: pulumi.Input<string>;
    /**
     * The Public IPv6 Address of this NodeBalancer
     */
    readonly ipv6?: pulumi.Input<string>;
    /**
     * The label of the Linode NodeBalancer
     */
    readonly label?: pulumi.Input<string>;
    /**
     * The region where this NodeBalancer will be deployed.  Examples are `"us-east"`, `"us-west"`, `"ap-south"`, etc. See all regions [here](https://api.linode.com/v4/regions).  *Changing `region` forces the creation of a new Linode NodeBalancer.*.
     */
    readonly region?: pulumi.Input<string>;
    /**
     * A list of tags applied to this object. Tags are for organizational purposes only.
     */
    readonly tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Information about the amount of transfer this NodeBalancer has had so far this month.
     */
    readonly transfers?: pulumi.Input<pulumi.Input<inputs.NodeBalancerTransfer>[]>;
    /**
     * When this NodeBalancer was last updated.
     */
    readonly updated?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a NodeBalancer resource.
 */
export interface NodeBalancerArgs {
    /**
     * Throttle connections per second (0-20). Set to 0 (default) to disable throttling.
     */
    readonly clientConnThrottle?: pulumi.Input<number>;
    /**
     * The label of the Linode NodeBalancer
     */
    readonly label?: pulumi.Input<string>;
    /**
     * The region where this NodeBalancer will be deployed.  Examples are `"us-east"`, `"us-west"`, `"ap-south"`, etc. See all regions [here](https://api.linode.com/v4/regions).  *Changing `region` forces the creation of a new Linode NodeBalancer.*.
     */
    readonly region: pulumi.Input<string>;
    /**
     * A list of tags applied to this object. Tags are for organizational purposes only.
     */
    readonly tags?: pulumi.Input<pulumi.Input<string>[]>;
}
