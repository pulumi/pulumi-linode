// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * > **NOTICE:** You may need to contact support to increase your instance IP limit before you can allocate additional IPs.
 *
 * > **NOTICE:** This resource will reboot the specified instance following IP allocation.
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
 *     image: "linode/alpine3.16",
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
     * If true, the instance will be rebooted to update network interfaces.
     */
    public readonly applyImmediately!: pulumi.Output<boolean | undefined>;
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
     * The type of IP address. (`ipv4`, `ipv6`, `ipv6/pool`, `ipv6/range`)
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
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as InstanceIpState | undefined;
            resourceInputs["address"] = state ? state.address : undefined;
            resourceInputs["applyImmediately"] = state ? state.applyImmediately : undefined;
            resourceInputs["gateway"] = state ? state.gateway : undefined;
            resourceInputs["linodeId"] = state ? state.linodeId : undefined;
            resourceInputs["prefix"] = state ? state.prefix : undefined;
            resourceInputs["public"] = state ? state.public : undefined;
            resourceInputs["rdns"] = state ? state.rdns : undefined;
            resourceInputs["region"] = state ? state.region : undefined;
            resourceInputs["subnetMask"] = state ? state.subnetMask : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as InstanceIpArgs | undefined;
            if ((!args || args.linodeId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'linodeId'");
            }
            resourceInputs["applyImmediately"] = args ? args.applyImmediately : undefined;
            resourceInputs["linodeId"] = args ? args.linodeId : undefined;
            resourceInputs["public"] = args ? args.public : undefined;
            resourceInputs["rdns"] = args ? args.rdns : undefined;
            resourceInputs["address"] = undefined /*out*/;
            resourceInputs["gateway"] = undefined /*out*/;
            resourceInputs["prefix"] = undefined /*out*/;
            resourceInputs["region"] = undefined /*out*/;
            resourceInputs["subnetMask"] = undefined /*out*/;
            resourceInputs["type"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(InstanceIp.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering InstanceIp resources.
 */
export interface InstanceIpState {
    /**
     * The resulting IPv4 address.
     */
    address?: pulumi.Input<string>;
    /**
     * If true, the instance will be rebooted to update network interfaces.
     */
    applyImmediately?: pulumi.Input<boolean>;
    /**
     * The default gateway for this address
     */
    gateway?: pulumi.Input<string>;
    /**
     * The ID of the Linode to allocate an IPv4 address for.
     */
    linodeId?: pulumi.Input<number>;
    /**
     * The number of bits set in the subnet mask.
     */
    prefix?: pulumi.Input<number>;
    /**
     * Whether the IPv4 address is public or private. Defaults to true.
     */
    public?: pulumi.Input<boolean>;
    /**
     * The reverse DNS assigned to this address.
     */
    rdns?: pulumi.Input<string>;
    /**
     * The region this IP resides in.
     */
    region?: pulumi.Input<string>;
    /**
     * The mask that separates host bits from network bits for this address.
     */
    subnetMask?: pulumi.Input<string>;
    /**
     * The type of IP address. (`ipv4`, `ipv6`, `ipv6/pool`, `ipv6/range`)
     */
    type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a InstanceIp resource.
 */
export interface InstanceIpArgs {
    /**
     * If true, the instance will be rebooted to update network interfaces.
     */
    applyImmediately?: pulumi.Input<boolean>;
    /**
     * The ID of the Linode to allocate an IPv4 address for.
     */
    linodeId: pulumi.Input<number>;
    /**
     * Whether the IPv4 address is public or private. Defaults to true.
     */
    public?: pulumi.Input<boolean>;
    /**
     * The reverse DNS assigned to this address.
     */
    rdns?: pulumi.Input<string>;
}
