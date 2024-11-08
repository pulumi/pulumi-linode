// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

export class ReservedIpAssignment extends pulumi.CustomResource {
    /**
     * Get an existing ReservedIpAssignment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ReservedIpAssignmentState, opts?: pulumi.CustomResourceOptions): ReservedIpAssignment {
        return new ReservedIpAssignment(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'linode:index/reservedIpAssignment:ReservedIpAssignment';

    /**
     * Returns true if the given object is an instance of ReservedIpAssignment.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ReservedIpAssignment {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ReservedIpAssignment.__pulumiType;
    }

    /**
     * The resulting IPv4 address.
     */
    public readonly address!: pulumi.Output<string>;
    /**
     * If true, the instance will be rebooted to update network interfaces. This functionality is not affected by the
     * `skipImplicitReboots` provider argument.
     */
    public readonly applyImmediately!: pulumi.Output<boolean>;
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
     * Whether the IPv4 address is public or private.
     */
    public readonly public!: pulumi.Output<boolean>;
    /**
     * The reverse DNS assigned to this address.
     */
    public readonly rdns!: pulumi.Output<string>;
    /**
     * The region this IP resides in.
     */
    public /*out*/ readonly region!: pulumi.Output<string>;
    /**
     * The reservation status of the IP address
     */
    public /*out*/ readonly reserved!: pulumi.Output<boolean>;
    /**
     * The mask that separates host bits from network bits for this address.
     */
    public /*out*/ readonly subnetMask!: pulumi.Output<string>;
    /**
     * The type of IP address.
     */
    public /*out*/ readonly type!: pulumi.Output<string>;
    /**
     * Contains information about the NAT 1:1 mapping of a public IP address to a VPC subnet.
     */
    public /*out*/ readonly vpcNat11s!: pulumi.Output<outputs.ReservedIpAssignmentVpcNat11[]>;

    /**
     * Create a ReservedIpAssignment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ReservedIpAssignmentArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ReservedIpAssignmentArgs | ReservedIpAssignmentState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ReservedIpAssignmentState | undefined;
            resourceInputs["address"] = state ? state.address : undefined;
            resourceInputs["applyImmediately"] = state ? state.applyImmediately : undefined;
            resourceInputs["gateway"] = state ? state.gateway : undefined;
            resourceInputs["linodeId"] = state ? state.linodeId : undefined;
            resourceInputs["prefix"] = state ? state.prefix : undefined;
            resourceInputs["public"] = state ? state.public : undefined;
            resourceInputs["rdns"] = state ? state.rdns : undefined;
            resourceInputs["region"] = state ? state.region : undefined;
            resourceInputs["reserved"] = state ? state.reserved : undefined;
            resourceInputs["subnetMask"] = state ? state.subnetMask : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["vpcNat11s"] = state ? state.vpcNat11s : undefined;
        } else {
            const args = argsOrState as ReservedIpAssignmentArgs | undefined;
            if ((!args || args.address === undefined) && !opts.urn) {
                throw new Error("Missing required property 'address'");
            }
            if ((!args || args.linodeId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'linodeId'");
            }
            resourceInputs["address"] = args ? args.address : undefined;
            resourceInputs["applyImmediately"] = args ? args.applyImmediately : undefined;
            resourceInputs["linodeId"] = args ? args.linodeId : undefined;
            resourceInputs["public"] = args ? args.public : undefined;
            resourceInputs["rdns"] = args ? args.rdns : undefined;
            resourceInputs["gateway"] = undefined /*out*/;
            resourceInputs["prefix"] = undefined /*out*/;
            resourceInputs["region"] = undefined /*out*/;
            resourceInputs["reserved"] = undefined /*out*/;
            resourceInputs["subnetMask"] = undefined /*out*/;
            resourceInputs["type"] = undefined /*out*/;
            resourceInputs["vpcNat11s"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ReservedIpAssignment.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ReservedIpAssignment resources.
 */
export interface ReservedIpAssignmentState {
    /**
     * The resulting IPv4 address.
     */
    address?: pulumi.Input<string>;
    /**
     * If true, the instance will be rebooted to update network interfaces. This functionality is not affected by the
     * `skipImplicitReboots` provider argument.
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
     * Whether the IPv4 address is public or private.
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
     * The reservation status of the IP address
     */
    reserved?: pulumi.Input<boolean>;
    /**
     * The mask that separates host bits from network bits for this address.
     */
    subnetMask?: pulumi.Input<string>;
    /**
     * The type of IP address.
     */
    type?: pulumi.Input<string>;
    /**
     * Contains information about the NAT 1:1 mapping of a public IP address to a VPC subnet.
     */
    vpcNat11s?: pulumi.Input<pulumi.Input<inputs.ReservedIpAssignmentVpcNat11>[]>;
}

/**
 * The set of arguments for constructing a ReservedIpAssignment resource.
 */
export interface ReservedIpAssignmentArgs {
    /**
     * The resulting IPv4 address.
     */
    address: pulumi.Input<string>;
    /**
     * If true, the instance will be rebooted to update network interfaces. This functionality is not affected by the
     * `skipImplicitReboots` provider argument.
     */
    applyImmediately?: pulumi.Input<boolean>;
    /**
     * The ID of the Linode to allocate an IPv4 address for.
     */
    linodeId: pulumi.Input<number>;
    /**
     * Whether the IPv4 address is public or private.
     */
    public?: pulumi.Input<boolean>;
    /**
     * The reverse DNS assigned to this address.
     */
    rdns?: pulumi.Input<string>;
}
