// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Manages allocation of reserved IPv4 address in a region and optionally assigning the reserved address to a Linode instance.
 *
 * For more information, see the corresponding [API documentation](https://techdocs.akamai.com/linode-api/reference/post-allocate-ip).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const testIp = new linode.NetworkingIp("test_ip", {
 *     type: "ipv4",
 *     linodeId: 12345,
 *     "public": true,
 * });
 * ```
 *
 * ## Import
 *
 * IP addresses can be imported using the IP address ID, e.g.
 *
 * ```sh
 * $ pulumi import linode:index/networkingIp:NetworkingIp example_ip 172.104.30.209
 * ```
 */
export class NetworkingIp extends pulumi.CustomResource {
    /**
     * Get an existing NetworkingIp resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: NetworkingIpState, opts?: pulumi.CustomResourceOptions): NetworkingIp {
        return new NetworkingIp(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'linode:index/networkingIp:NetworkingIp';

    /**
     * Returns true if the given object is an instance of NetworkingIp.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is NetworkingIp {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === NetworkingIp.__pulumiType;
    }

    /**
     * The IPv4 address that is configured as a 1:1 NAT for this VPC interface.
     */
    public /*out*/ readonly address!: pulumi.Output<string>;
    /**
     * The default gateway for this address.
     */
    public /*out*/ readonly gateway!: pulumi.Output<string>;
    /**
     * The ID of the Linode to which the IP address will be assigned. Updating this field on an ephemeral IP will trigger a recreation. Conflicts with `region`.
     */
    public readonly linodeId!: pulumi.Output<number>;
    /**
     * The number of bits set in the subnet mask.
     */
    public /*out*/ readonly prefix!: pulumi.Output<number>;
    /**
     * Whether the IP address is public. Defaults to true.
     */
    public readonly public!: pulumi.Output<boolean>;
    /**
     * The reverse DNS assigned to this address. For public IPv4 addresses, this will be set to a default value provided by Linode if not explicitly set.
     */
    public /*out*/ readonly rdns!: pulumi.Output<string>;
    /**
     * The region for the reserved IPv4 address. Required when reserved is true and linodeId is not set.
     */
    public readonly region!: pulumi.Output<string>;
    /**
     * Whether the IPv4 address should be reserved.
     */
    public readonly reserved!: pulumi.Output<boolean>;
    /**
     * The mask that separates host bits from network bits for this address.
     */
    public /*out*/ readonly subnetMask!: pulumi.Output<string>;
    /**
     * The type of IP address. (ipv4, ipv6, etc.)
     */
    public readonly type!: pulumi.Output<string>;
    /**
     * Contains information about the NAT 1:1 mapping of a public IP address to a VPC subnet.
     */
    public /*out*/ readonly vpcNat11!: pulumi.Output<outputs.NetworkingIpVpcNat11>;

    /**
     * Create a NetworkingIp resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: NetworkingIpArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: NetworkingIpArgs | NetworkingIpState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as NetworkingIpState | undefined;
            resourceInputs["address"] = state ? state.address : undefined;
            resourceInputs["gateway"] = state ? state.gateway : undefined;
            resourceInputs["linodeId"] = state ? state.linodeId : undefined;
            resourceInputs["prefix"] = state ? state.prefix : undefined;
            resourceInputs["public"] = state ? state.public : undefined;
            resourceInputs["rdns"] = state ? state.rdns : undefined;
            resourceInputs["region"] = state ? state.region : undefined;
            resourceInputs["reserved"] = state ? state.reserved : undefined;
            resourceInputs["subnetMask"] = state ? state.subnetMask : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["vpcNat11"] = state ? state.vpcNat11 : undefined;
        } else {
            const args = argsOrState as NetworkingIpArgs | undefined;
            resourceInputs["linodeId"] = args ? args.linodeId : undefined;
            resourceInputs["public"] = args ? args.public : undefined;
            resourceInputs["region"] = args ? args.region : undefined;
            resourceInputs["reserved"] = args ? args.reserved : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["address"] = undefined /*out*/;
            resourceInputs["gateway"] = undefined /*out*/;
            resourceInputs["prefix"] = undefined /*out*/;
            resourceInputs["rdns"] = undefined /*out*/;
            resourceInputs["subnetMask"] = undefined /*out*/;
            resourceInputs["vpcNat11"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(NetworkingIp.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering NetworkingIp resources.
 */
export interface NetworkingIpState {
    /**
     * The IPv4 address that is configured as a 1:1 NAT for this VPC interface.
     */
    address?: pulumi.Input<string>;
    /**
     * The default gateway for this address.
     */
    gateway?: pulumi.Input<string>;
    /**
     * The ID of the Linode to which the IP address will be assigned. Updating this field on an ephemeral IP will trigger a recreation. Conflicts with `region`.
     */
    linodeId?: pulumi.Input<number>;
    /**
     * The number of bits set in the subnet mask.
     */
    prefix?: pulumi.Input<number>;
    /**
     * Whether the IP address is public. Defaults to true.
     */
    public?: pulumi.Input<boolean>;
    /**
     * The reverse DNS assigned to this address. For public IPv4 addresses, this will be set to a default value provided by Linode if not explicitly set.
     */
    rdns?: pulumi.Input<string>;
    /**
     * The region for the reserved IPv4 address. Required when reserved is true and linodeId is not set.
     */
    region?: pulumi.Input<string>;
    /**
     * Whether the IPv4 address should be reserved.
     */
    reserved?: pulumi.Input<boolean>;
    /**
     * The mask that separates host bits from network bits for this address.
     */
    subnetMask?: pulumi.Input<string>;
    /**
     * The type of IP address. (ipv4, ipv6, etc.)
     */
    type?: pulumi.Input<string>;
    /**
     * Contains information about the NAT 1:1 mapping of a public IP address to a VPC subnet.
     */
    vpcNat11?: pulumi.Input<inputs.NetworkingIpVpcNat11>;
}

/**
 * The set of arguments for constructing a NetworkingIp resource.
 */
export interface NetworkingIpArgs {
    /**
     * The ID of the Linode to which the IP address will be assigned. Updating this field on an ephemeral IP will trigger a recreation. Conflicts with `region`.
     */
    linodeId?: pulumi.Input<number>;
    /**
     * Whether the IP address is public. Defaults to true.
     */
    public?: pulumi.Input<boolean>;
    /**
     * The region for the reserved IPv4 address. Required when reserved is true and linodeId is not set.
     */
    region?: pulumi.Input<string>;
    /**
     * Whether the IPv4 address should be reserved.
     */
    reserved?: pulumi.Input<boolean>;
    /**
     * The type of IP address. (ipv4, ipv6, etc.)
     */
    type?: pulumi.Input<string>;
}
