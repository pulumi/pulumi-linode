// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * > **NOTICE:** You may need to contact support to increase your instance IP limit before you can allocate additional IPs.
 *
 * Manages a Linode instance IP.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const fooInstance = new linode.Instance("fooInstance", {
 *     image: "linode/alpine3.12",
 *     label: "foobar-test",
 *     type: "g6-nanode-1",
 *     region: "us-east",
 * });
 * const fooInstanceIp = new linode.InstanceIp("fooInstanceIp", {
 *     linodeId: fooInstance.id,
 *     "public": true,
 * });
 * ```
 */
export class InstanceIp extends pulumi.CustomResource {
    /**
     * Get an existing InstanceIp resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: InstanceIpState, opts?: pulumi.CustomResourceOptions): InstanceIp {
        return new InstanceIp(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'linode:index/instanceIp:InstanceIp';

    /**
     * Returns true if the given object is an instance of InstanceIp.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is InstanceIp {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === InstanceIp.__pulumiType;
    }

    /**
     * The resulting IPv4 address.
     */
    public /*out*/ readonly address!: pulumi.Output<string>;
    /**
     * The default gateway for this address
     */
    public /*out*/ readonly gateway!: pulumi.Output<string>;
    /**
     * The ID of the Linode to allocate an IPv4 address for.
     */
    public readonly linodeId!: pulumi.Output<number>;
    /**
     * The number of bits set in the subnet mask.
     */
    public /*out*/ readonly prefix!: pulumi.Output<number>;
    /**
     * Whether the IPv4 address is public or private. Defaults to true.
     */
    public readonly public!: pulumi.Output<boolean | undefined>;
    /**
     * The reverse DNS assigned to this address.
     */
    public readonly rdns!: pulumi.Output<string>;
    /**
     * The region this IP resides in.
     */
    public /*out*/ readonly region!: pulumi.Output<string>;
    /**
     * The mask that separates host bits from network bits for this address.
     */
    public /*out*/ readonly subnetMask!: pulumi.Output<string>;
    /**
     * The type of IP address.
     */
    public /*out*/ readonly type!: pulumi.Output<string>;

    /**
     * Create a InstanceIp resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: InstanceIpArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: InstanceIpArgs | InstanceIpState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as InstanceIpState | undefined;
            inputs["address"] = state ? state.address : undefined;
            inputs["gateway"] = state ? state.gateway : undefined;
            inputs["linodeId"] = state ? state.linodeId : undefined;
            inputs["prefix"] = state ? state.prefix : undefined;
            inputs["public"] = state ? state.public : undefined;
            inputs["rdns"] = state ? state.rdns : undefined;
            inputs["region"] = state ? state.region : undefined;
            inputs["subnetMask"] = state ? state.subnetMask : undefined;
            inputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as InstanceIpArgs | undefined;
            if ((!args || args.linodeId === undefined) && !(opts && opts.urn)) {
                throw new Error("Missing required property 'linodeId'");
            }
            inputs["linodeId"] = args ? args.linodeId : undefined;
            inputs["public"] = args ? args.public : undefined;
            inputs["rdns"] = args ? args.rdns : undefined;
            inputs["address"] = undefined /*out*/;
            inputs["gateway"] = undefined /*out*/;
            inputs["prefix"] = undefined /*out*/;
            inputs["region"] = undefined /*out*/;
            inputs["subnetMask"] = undefined /*out*/;
            inputs["type"] = undefined /*out*/;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(InstanceIp.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering InstanceIp resources.
 */
export interface InstanceIpState {
    /**
     * The resulting IPv4 address.
     */
    readonly address?: pulumi.Input<string>;
    /**
     * The default gateway for this address
     */
    readonly gateway?: pulumi.Input<string>;
    /**
     * The ID of the Linode to allocate an IPv4 address for.
     */
    readonly linodeId?: pulumi.Input<number>;
    /**
     * The number of bits set in the subnet mask.
     */
    readonly prefix?: pulumi.Input<number>;
    /**
     * Whether the IPv4 address is public or private. Defaults to true.
     */
    readonly public?: pulumi.Input<boolean>;
    /**
     * The reverse DNS assigned to this address.
     */
    readonly rdns?: pulumi.Input<string>;
    /**
     * The region this IP resides in.
     */
    readonly region?: pulumi.Input<string>;
    /**
     * The mask that separates host bits from network bits for this address.
     */
    readonly subnetMask?: pulumi.Input<string>;
    /**
     * The type of IP address.
     */
    readonly type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a InstanceIp resource.
 */
export interface InstanceIpArgs {
    /**
     * The ID of the Linode to allocate an IPv4 address for.
     */
    readonly linodeId: pulumi.Input<number>;
    /**
     * Whether the IPv4 address is public or private. Defaults to true.
     */
    readonly public?: pulumi.Input<boolean>;
    /**
     * The reverse DNS assigned to this address.
     */
    readonly rdns?: pulumi.Input<string>;
}
