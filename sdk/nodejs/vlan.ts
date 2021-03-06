// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

export class Vlan extends pulumi.CustomResource {
    /**
     * Get an existing Vlan resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: VlanState, opts?: pulumi.CustomResourceOptions): Vlan {
        return new Vlan(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'linode:index/vlan:Vlan';

    /**
     * Returns true if the given object is an instance of Vlan.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Vlan {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Vlan.__pulumiType;
    }

    /**
     * The Linodes attached to this vlan.
     */
    public /*out*/ readonly attachedLinodes!: pulumi.Output<outputs.VlanAttachedLinode[]>;
    /**
     * The CIDR block for this VLAN.
     */
    public readonly cidrBlock!: pulumi.Output<string | undefined>;
    /**
     * Description of the vlan for display purposes only.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * A list of IDs of Linodes to attach to this VLAN.
     */
    public readonly linodes!: pulumi.Output<number[] | undefined>;
    /**
     * The region of where the VLAN is deployed.
     */
    public readonly region!: pulumi.Output<string>;

    /**
     * Create a Vlan resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: VlanArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: VlanArgs | VlanState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as VlanState | undefined;
            inputs["attachedLinodes"] = state ? state.attachedLinodes : undefined;
            inputs["cidrBlock"] = state ? state.cidrBlock : undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["linodes"] = state ? state.linodes : undefined;
            inputs["region"] = state ? state.region : undefined;
        } else {
            const args = argsOrState as VlanArgs | undefined;
            if ((!args || args.region === undefined) && !opts.urn) {
                throw new Error("Missing required property 'region'");
            }
            inputs["cidrBlock"] = args ? args.cidrBlock : undefined;
            inputs["description"] = args ? args.description : undefined;
            inputs["linodes"] = args ? args.linodes : undefined;
            inputs["region"] = args ? args.region : undefined;
            inputs["attachedLinodes"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(Vlan.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Vlan resources.
 */
export interface VlanState {
    /**
     * The Linodes attached to this vlan.
     */
    readonly attachedLinodes?: pulumi.Input<pulumi.Input<inputs.VlanAttachedLinode>[]>;
    /**
     * The CIDR block for this VLAN.
     */
    readonly cidrBlock?: pulumi.Input<string>;
    /**
     * Description of the vlan for display purposes only.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * A list of IDs of Linodes to attach to this VLAN.
     */
    readonly linodes?: pulumi.Input<pulumi.Input<number>[]>;
    /**
     * The region of where the VLAN is deployed.
     */
    readonly region?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Vlan resource.
 */
export interface VlanArgs {
    /**
     * The CIDR block for this VLAN.
     */
    readonly cidrBlock?: pulumi.Input<string>;
    /**
     * Description of the vlan for display purposes only.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * A list of IDs of Linodes to attach to this VLAN.
     */
    readonly linodes?: pulumi.Input<pulumi.Input<number>[]>;
    /**
     * The region of where the VLAN is deployed.
     */
    readonly region: pulumi.Input<string>;
}
