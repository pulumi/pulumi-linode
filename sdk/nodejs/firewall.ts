// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Manages a Linode Firewall.
 *
 * ## Import
 *
 * Firewalls can be imported using the `id`, e.g.
 *
 * ```sh
 *  $ pulumi import linode:index/firewall:Firewall my_firewall 12345
 * ```
 */
export class Firewall extends pulumi.CustomResource {
    /**
     * Get an existing Firewall resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: FirewallState, opts?: pulumi.CustomResourceOptions): Firewall {
        return new Firewall(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'linode:index/firewall:Firewall';

    /**
     * Returns true if the given object is an instance of Firewall.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Firewall {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Firewall.__pulumiType;
    }

    /**
     * When this firewall was created
     */
    public /*out*/ readonly created!: pulumi.Output<string>;
    /**
     * The devices associated with this firewall.
     */
    public /*out*/ readonly devices!: pulumi.Output<outputs.FirewallDevice[]>;
    /**
     * If `true`, the Firewall's rules are not enforced (defaults to `false`).
     *
     * * `inbound` - (Optional) A firewall rule that specifies what inbound network traffic is allowed.
     */
    public readonly disabled!: pulumi.Output<boolean | undefined>;
    /**
     * The default behavior for inbound traffic. This setting can be overridden by updating the inbound.action property of the Firewall Rule. (`ACCEPT`, `DROP`)
     *
     * * `outbound` - (Optional) A firewall rule that specifies what outbound network traffic is allowed.
     */
    public readonly inboundPolicy!: pulumi.Output<string>;
    /**
     * A firewall rule that specifies what inbound network traffic is allowed.
     */
    public readonly inbounds!: pulumi.Output<outputs.FirewallInbound[] | undefined>;
    /**
     * This Firewall's unique label.
     */
    public readonly label!: pulumi.Output<string>;
    /**
     * A list of IDs of Linodes this Firewall should govern network traffic for.
     */
    public readonly linodes!: pulumi.Output<number[]>;
    /**
     * A list of IDs of NodeBalancers this Firewall should govern network traffic for.
     */
    public readonly nodebalancers!: pulumi.Output<number[]>;
    /**
     * The default behavior for outbound traffic. This setting can be overridden by updating the outbound.action property for an individual Firewall Rule. (`ACCEPT`, `DROP`)
     */
    public readonly outboundPolicy!: pulumi.Output<string>;
    /**
     * A firewall rule that specifies what outbound network traffic is allowed.
     */
    public readonly outbounds!: pulumi.Output<outputs.FirewallOutbound[] | undefined>;
    /**
     * The status of the Firewall.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * A list of tags applied to the Kubernetes cluster. Tags are for organizational purposes only.
     */
    public readonly tags!: pulumi.Output<string[] | undefined>;
    /**
     * When this firewall was last updated
     */
    public /*out*/ readonly updated!: pulumi.Output<string>;

    /**
     * Create a Firewall resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: FirewallArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: FirewallArgs | FirewallState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as FirewallState | undefined;
            resourceInputs["created"] = state ? state.created : undefined;
            resourceInputs["devices"] = state ? state.devices : undefined;
            resourceInputs["disabled"] = state ? state.disabled : undefined;
            resourceInputs["inboundPolicy"] = state ? state.inboundPolicy : undefined;
            resourceInputs["inbounds"] = state ? state.inbounds : undefined;
            resourceInputs["label"] = state ? state.label : undefined;
            resourceInputs["linodes"] = state ? state.linodes : undefined;
            resourceInputs["nodebalancers"] = state ? state.nodebalancers : undefined;
            resourceInputs["outboundPolicy"] = state ? state.outboundPolicy : undefined;
            resourceInputs["outbounds"] = state ? state.outbounds : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["updated"] = state ? state.updated : undefined;
        } else {
            const args = argsOrState as FirewallArgs | undefined;
            if ((!args || args.inboundPolicy === undefined) && !opts.urn) {
                throw new Error("Missing required property 'inboundPolicy'");
            }
            if ((!args || args.label === undefined) && !opts.urn) {
                throw new Error("Missing required property 'label'");
            }
            if ((!args || args.outboundPolicy === undefined) && !opts.urn) {
                throw new Error("Missing required property 'outboundPolicy'");
            }
            resourceInputs["disabled"] = args ? args.disabled : undefined;
            resourceInputs["inboundPolicy"] = args ? args.inboundPolicy : undefined;
            resourceInputs["inbounds"] = args ? args.inbounds : undefined;
            resourceInputs["label"] = args ? args.label : undefined;
            resourceInputs["linodes"] = args ? args.linodes : undefined;
            resourceInputs["nodebalancers"] = args ? args.nodebalancers : undefined;
            resourceInputs["outboundPolicy"] = args ? args.outboundPolicy : undefined;
            resourceInputs["outbounds"] = args ? args.outbounds : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["created"] = undefined /*out*/;
            resourceInputs["devices"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
            resourceInputs["updated"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Firewall.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Firewall resources.
 */
export interface FirewallState {
    /**
     * When this firewall was created
     */
    created?: pulumi.Input<string>;
    /**
     * The devices associated with this firewall.
     */
    devices?: pulumi.Input<pulumi.Input<inputs.FirewallDevice>[]>;
    /**
     * If `true`, the Firewall's rules are not enforced (defaults to `false`).
     *
     * * `inbound` - (Optional) A firewall rule that specifies what inbound network traffic is allowed.
     */
    disabled?: pulumi.Input<boolean>;
    /**
     * The default behavior for inbound traffic. This setting can be overridden by updating the inbound.action property of the Firewall Rule. (`ACCEPT`, `DROP`)
     *
     * * `outbound` - (Optional) A firewall rule that specifies what outbound network traffic is allowed.
     */
    inboundPolicy?: pulumi.Input<string>;
    /**
     * A firewall rule that specifies what inbound network traffic is allowed.
     */
    inbounds?: pulumi.Input<pulumi.Input<inputs.FirewallInbound>[]>;
    /**
     * This Firewall's unique label.
     */
    label?: pulumi.Input<string>;
    /**
     * A list of IDs of Linodes this Firewall should govern network traffic for.
     */
    linodes?: pulumi.Input<pulumi.Input<number>[]>;
    /**
     * A list of IDs of NodeBalancers this Firewall should govern network traffic for.
     */
    nodebalancers?: pulumi.Input<pulumi.Input<number>[]>;
    /**
     * The default behavior for outbound traffic. This setting can be overridden by updating the outbound.action property for an individual Firewall Rule. (`ACCEPT`, `DROP`)
     */
    outboundPolicy?: pulumi.Input<string>;
    /**
     * A firewall rule that specifies what outbound network traffic is allowed.
     */
    outbounds?: pulumi.Input<pulumi.Input<inputs.FirewallOutbound>[]>;
    /**
     * The status of the Firewall.
     */
    status?: pulumi.Input<string>;
    /**
     * A list of tags applied to the Kubernetes cluster. Tags are for organizational purposes only.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * When this firewall was last updated
     */
    updated?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Firewall resource.
 */
export interface FirewallArgs {
    /**
     * If `true`, the Firewall's rules are not enforced (defaults to `false`).
     *
     * * `inbound` - (Optional) A firewall rule that specifies what inbound network traffic is allowed.
     */
    disabled?: pulumi.Input<boolean>;
    /**
     * The default behavior for inbound traffic. This setting can be overridden by updating the inbound.action property of the Firewall Rule. (`ACCEPT`, `DROP`)
     *
     * * `outbound` - (Optional) A firewall rule that specifies what outbound network traffic is allowed.
     */
    inboundPolicy: pulumi.Input<string>;
    /**
     * A firewall rule that specifies what inbound network traffic is allowed.
     */
    inbounds?: pulumi.Input<pulumi.Input<inputs.FirewallInbound>[]>;
    /**
     * This Firewall's unique label.
     */
    label: pulumi.Input<string>;
    /**
     * A list of IDs of Linodes this Firewall should govern network traffic for.
     */
    linodes?: pulumi.Input<pulumi.Input<number>[]>;
    /**
     * A list of IDs of NodeBalancers this Firewall should govern network traffic for.
     */
    nodebalancers?: pulumi.Input<pulumi.Input<number>[]>;
    /**
     * The default behavior for outbound traffic. This setting can be overridden by updating the outbound.action property for an individual Firewall Rule. (`ACCEPT`, `DROP`)
     */
    outboundPolicy: pulumi.Input<string>;
    /**
     * A firewall rule that specifies what outbound network traffic is allowed.
     */
    outbounds?: pulumi.Input<pulumi.Input<inputs.FirewallOutbound>[]>;
    /**
     * A list of tags applied to the Kubernetes cluster. Tags are for organizational purposes only.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
}
