// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a Linode NodeBalancer resource.  This can be used to create, modify, and delete Linodes NodeBalancers in Linode's managed load balancer service.
 * For more information, see [Getting Started with NodeBalancers](https://www.linode.com/docs/platform/nodebalancer/getting-started-with-nodebalancers/) and the [Linode APIv4 docs](https://developers.linode.com/api/v4#operation/createNodeBalancer).
 *
 * ## Example Usage
 *
 * The following example shows how one might use this resource to configure a NodeBalancer.
 *
 * <!--Start PulumiCodeChooser -->
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
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Linodes NodeBalancers can be imported using the Linode NodeBalancer `id`, e.g.
 *
 * ```sh
 * $ pulumi import linode:index/nodeBalancer:NodeBalancer mynodebalancer 1234567
 * ```
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
    public readonly clientConnThrottle!: pulumi.Output<number>;
    /**
     * When this firewall was created.
     */
    public /*out*/ readonly created!: pulumi.Output<string>;
    /**
     * ID for the firewall you'd like to use with this NodeBalancer.
     */
    public readonly firewallId!: pulumi.Output<number | undefined>;
    /**
     * A list of Firewalls assigned to this NodeBalancer.
     */
    public /*out*/ readonly firewalls!: pulumi.Output<outputs.NodeBalancerFirewall[]>;
    /**
     * This NodeBalancer's hostname, ending with .nodebalancer.linode.com
     */
    public /*out*/ readonly hostname!: pulumi.Output<string>;
    /**
     * A list of IPv4 addresses or networks. Must be in IP/mask format.
     */
    public /*out*/ readonly ipv4!: pulumi.Output<string>;
    /**
     * A list of IPv6 addresses or networks. Must be in IP/mask format.
     */
    public /*out*/ readonly ipv6!: pulumi.Output<string>;
    /**
     * The label of the Linode NodeBalancer
     */
    public readonly label!: pulumi.Output<string | undefined>;
    /**
     * The region where this NodeBalancer will be deployed.  Examples are `"us-east"`, `"us-west"`, `"ap-south"`, etc. See all regions [here](https://api.linode.com/v4/regions).  *Changing `region` forces the creation of a new Linode NodeBalancer.*.
     *
     * - - -
     */
    public readonly region!: pulumi.Output<string>;
    /**
     * A list of tags applied to this object. Tags are case-insensitive and are for organizational purposes only.
     */
    public readonly tags!: pulumi.Output<string[]>;
    /**
     * Information about the amount of transfer this NodeBalancer has had so far this month.
     */
    public /*out*/ readonly transfers!: pulumi.Output<outputs.NodeBalancerTransfer[]>;
    /**
     * When this firewall was last updated.
     */
    public /*out*/ readonly updated!: pulumi.Output<string>;

    /**
     * Create a NodeBalancer resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: NodeBalancerArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: NodeBalancerArgs | NodeBalancerState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as NodeBalancerState | undefined;
            resourceInputs["clientConnThrottle"] = state ? state.clientConnThrottle : undefined;
            resourceInputs["created"] = state ? state.created : undefined;
            resourceInputs["firewallId"] = state ? state.firewallId : undefined;
            resourceInputs["firewalls"] = state ? state.firewalls : undefined;
            resourceInputs["hostname"] = state ? state.hostname : undefined;
            resourceInputs["ipv4"] = state ? state.ipv4 : undefined;
            resourceInputs["ipv6"] = state ? state.ipv6 : undefined;
            resourceInputs["label"] = state ? state.label : undefined;
            resourceInputs["region"] = state ? state.region : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["transfers"] = state ? state.transfers : undefined;
            resourceInputs["updated"] = state ? state.updated : undefined;
        } else {
            const args = argsOrState as NodeBalancerArgs | undefined;
            resourceInputs["clientConnThrottle"] = args ? args.clientConnThrottle : undefined;
            resourceInputs["firewallId"] = args ? args.firewallId : undefined;
            resourceInputs["label"] = args ? args.label : undefined;
            resourceInputs["region"] = args ? args.region : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["created"] = undefined /*out*/;
            resourceInputs["firewalls"] = undefined /*out*/;
            resourceInputs["hostname"] = undefined /*out*/;
            resourceInputs["ipv4"] = undefined /*out*/;
            resourceInputs["ipv6"] = undefined /*out*/;
            resourceInputs["transfers"] = undefined /*out*/;
            resourceInputs["updated"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(NodeBalancer.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering NodeBalancer resources.
 */
export interface NodeBalancerState {
    /**
     * Throttle connections per second (0-20). Set to 0 (default) to disable throttling.
     */
    clientConnThrottle?: pulumi.Input<number>;
    /**
     * When this firewall was created.
     */
    created?: pulumi.Input<string>;
    /**
     * ID for the firewall you'd like to use with this NodeBalancer.
     */
    firewallId?: pulumi.Input<number>;
    /**
     * A list of Firewalls assigned to this NodeBalancer.
     */
    firewalls?: pulumi.Input<pulumi.Input<inputs.NodeBalancerFirewall>[]>;
    /**
     * This NodeBalancer's hostname, ending with .nodebalancer.linode.com
     */
    hostname?: pulumi.Input<string>;
    /**
     * A list of IPv4 addresses or networks. Must be in IP/mask format.
     */
    ipv4?: pulumi.Input<string>;
    /**
     * A list of IPv6 addresses or networks. Must be in IP/mask format.
     */
    ipv6?: pulumi.Input<string>;
    /**
     * The label of the Linode NodeBalancer
     */
    label?: pulumi.Input<string>;
    /**
     * The region where this NodeBalancer will be deployed.  Examples are `"us-east"`, `"us-west"`, `"ap-south"`, etc. See all regions [here](https://api.linode.com/v4/regions).  *Changing `region` forces the creation of a new Linode NodeBalancer.*.
     *
     * - - -
     */
    region?: pulumi.Input<string>;
    /**
     * A list of tags applied to this object. Tags are case-insensitive and are for organizational purposes only.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Information about the amount of transfer this NodeBalancer has had so far this month.
     */
    transfers?: pulumi.Input<pulumi.Input<inputs.NodeBalancerTransfer>[]>;
    /**
     * When this firewall was last updated.
     */
    updated?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a NodeBalancer resource.
 */
export interface NodeBalancerArgs {
    /**
     * Throttle connections per second (0-20). Set to 0 (default) to disable throttling.
     */
    clientConnThrottle?: pulumi.Input<number>;
    /**
     * ID for the firewall you'd like to use with this NodeBalancer.
     */
    firewallId?: pulumi.Input<number>;
    /**
     * The label of the Linode NodeBalancer
     */
    label?: pulumi.Input<string>;
    /**
     * The region where this NodeBalancer will be deployed.  Examples are `"us-east"`, `"us-west"`, `"ap-south"`, etc. See all regions [here](https://api.linode.com/v4/regions).  *Changing `region` forces the creation of a new Linode NodeBalancer.*.
     *
     * - - -
     */
    region?: pulumi.Input<string>;
    /**
     * A list of tags applied to this object. Tags are case-insensitive and are for organizational purposes only.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
}
