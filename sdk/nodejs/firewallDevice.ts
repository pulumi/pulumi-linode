// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Manages a Linode Firewall Device.
 *
 * **NOTICE:** Attaching a Linode Firewall Device to a `linode.Firewall` resource with user-defined `linodes` may cause device conflicts.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const myFirewall = new linode.Firewall("myFirewall", {
 *     label: "my_firewall",
 *     inbounds: [{
 *         label: "http",
 *         action: "ACCEPT",
 *         protocol: "TCP",
 *         ports: "80",
 *         ipv4s: ["0.0.0.0/0"],
 *         ipv6s: ["::/0"],
 *     }],
 *     inboundPolicy: "DROP",
 *     outboundPolicy: "ACCEPT",
 * });
 * const myInstance = new linode.Instance("myInstance", {
 *     label: "my_instance",
 *     region: "us-southeast",
 *     type: "g6-standard-1",
 * });
 * const myDevice = new linode.FirewallDevice("myDevice", {
 *     firewallId: myFirewall.id,
 *     entityId: myInstance.id,
 * });
 * ```
 */
export class FirewallDevice extends pulumi.CustomResource {
    /**
     * Get an existing FirewallDevice resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: FirewallDeviceState, opts?: pulumi.CustomResourceOptions): FirewallDevice {
        return new FirewallDevice(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'linode:index/firewallDevice:FirewallDevice';

    /**
     * Returns true if the given object is an instance of FirewallDevice.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is FirewallDevice {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === FirewallDevice.__pulumiType;
    }

    /**
     * When the Firewall Device was last created.
     */
    public /*out*/ readonly created!: pulumi.Output<string>;
    /**
     * The unique ID of the entity to attach.
     */
    public readonly entityId!: pulumi.Output<number>;
    /**
     * The type of the entity to attach. (default: `linode`)
     */
    public readonly entityType!: pulumi.Output<string | undefined>;
    /**
     * The unique ID of the target Firewall.
     */
    public readonly firewallId!: pulumi.Output<number>;
    /**
     * When the Firewall Device was last updated.
     */
    public /*out*/ readonly updated!: pulumi.Output<string>;

    /**
     * Create a FirewallDevice resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: FirewallDeviceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: FirewallDeviceArgs | FirewallDeviceState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as FirewallDeviceState | undefined;
            resourceInputs["created"] = state ? state.created : undefined;
            resourceInputs["entityId"] = state ? state.entityId : undefined;
            resourceInputs["entityType"] = state ? state.entityType : undefined;
            resourceInputs["firewallId"] = state ? state.firewallId : undefined;
            resourceInputs["updated"] = state ? state.updated : undefined;
        } else {
            const args = argsOrState as FirewallDeviceArgs | undefined;
            if ((!args || args.entityId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'entityId'");
            }
            if ((!args || args.firewallId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'firewallId'");
            }
            resourceInputs["entityId"] = args ? args.entityId : undefined;
            resourceInputs["entityType"] = args ? args.entityType : undefined;
            resourceInputs["firewallId"] = args ? args.firewallId : undefined;
            resourceInputs["created"] = undefined /*out*/;
            resourceInputs["updated"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(FirewallDevice.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering FirewallDevice resources.
 */
export interface FirewallDeviceState {
    /**
     * When the Firewall Device was last created.
     */
    created?: pulumi.Input<string>;
    /**
     * The unique ID of the entity to attach.
     */
    entityId?: pulumi.Input<number>;
    /**
     * The type of the entity to attach. (default: `linode`)
     */
    entityType?: pulumi.Input<string>;
    /**
     * The unique ID of the target Firewall.
     */
    firewallId?: pulumi.Input<number>;
    /**
     * When the Firewall Device was last updated.
     */
    updated?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a FirewallDevice resource.
 */
export interface FirewallDeviceArgs {
    /**
     * The unique ID of the entity to attach.
     */
    entityId: pulumi.Input<number>;
    /**
     * The type of the entity to attach. (default: `linode`)
     */
    entityType?: pulumi.Input<string>;
    /**
     * The unique ID of the target Firewall.
     */
    firewallId: pulumi.Input<number>;
}
