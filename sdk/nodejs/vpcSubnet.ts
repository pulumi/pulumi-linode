// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Manages a Linode VPC subnet.
 *
 * ## Example Usage
 *
 * Create a VPC subnet:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const test = new linode.VpcSubnet("test", {
 *     ipv4: "10.0.0.0/24",
 *     label: "test-subnet",
 *     vpcId: 123,
 * });
 * ```
 */
export class VpcSubnet extends pulumi.CustomResource {
    /**
     * Get an existing VpcSubnet resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: VpcSubnetState, opts?: pulumi.CustomResourceOptions): VpcSubnet {
        return new VpcSubnet(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'linode:index/vpcSubnet:VpcSubnet';

    /**
     * Returns true if the given object is an instance of VpcSubnet.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is VpcSubnet {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === VpcSubnet.__pulumiType;
    }

    /**
     * The date and time when the VPC was created.
     */
    public /*out*/ readonly created!: pulumi.Output<string>;
    /**
     * The IPv4 range of this subnet in CIDR format.
     */
    public readonly ipv4!: pulumi.Output<string>;
    /**
     * The label of the VPC. Only contains ASCII letters, digits and dashes.
     */
    public readonly label!: pulumi.Output<string>;
    /**
     * A list of Linode IDs that added to this subnet.
     */
    public /*out*/ readonly linodes!: pulumi.Output<outputs.VpcSubnetLinode[]>;
    /**
     * The date and time when the VPC was last updated.
     */
    public /*out*/ readonly updated!: pulumi.Output<string>;
    /**
     * The id of the parent VPC for this VPC Subnet.
     */
    public readonly vpcId!: pulumi.Output<number>;

    /**
     * Create a VpcSubnet resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: VpcSubnetArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: VpcSubnetArgs | VpcSubnetState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as VpcSubnetState | undefined;
            resourceInputs["created"] = state ? state.created : undefined;
            resourceInputs["ipv4"] = state ? state.ipv4 : undefined;
            resourceInputs["label"] = state ? state.label : undefined;
            resourceInputs["linodes"] = state ? state.linodes : undefined;
            resourceInputs["updated"] = state ? state.updated : undefined;
            resourceInputs["vpcId"] = state ? state.vpcId : undefined;
        } else {
            const args = argsOrState as VpcSubnetArgs | undefined;
            if ((!args || args.ipv4 === undefined) && !opts.urn) {
                throw new Error("Missing required property 'ipv4'");
            }
            if ((!args || args.label === undefined) && !opts.urn) {
                throw new Error("Missing required property 'label'");
            }
            if ((!args || args.vpcId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'vpcId'");
            }
            resourceInputs["ipv4"] = args ? args.ipv4 : undefined;
            resourceInputs["label"] = args ? args.label : undefined;
            resourceInputs["vpcId"] = args ? args.vpcId : undefined;
            resourceInputs["created"] = undefined /*out*/;
            resourceInputs["linodes"] = undefined /*out*/;
            resourceInputs["updated"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(VpcSubnet.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering VpcSubnet resources.
 */
export interface VpcSubnetState {
    /**
     * The date and time when the VPC was created.
     */
    created?: pulumi.Input<string>;
    /**
     * The IPv4 range of this subnet in CIDR format.
     */
    ipv4?: pulumi.Input<string>;
    /**
     * The label of the VPC. Only contains ASCII letters, digits and dashes.
     */
    label?: pulumi.Input<string>;
    /**
     * A list of Linode IDs that added to this subnet.
     */
    linodes?: pulumi.Input<pulumi.Input<inputs.VpcSubnetLinode>[]>;
    /**
     * The date and time when the VPC was last updated.
     */
    updated?: pulumi.Input<string>;
    /**
     * The id of the parent VPC for this VPC Subnet.
     */
    vpcId?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a VpcSubnet resource.
 */
export interface VpcSubnetArgs {
    /**
     * The IPv4 range of this subnet in CIDR format.
     */
    ipv4: pulumi.Input<string>;
    /**
     * The label of the VPC. Only contains ASCII letters, digits and dashes.
     */
    label: pulumi.Input<string>;
    /**
     * The id of the parent VPC for this VPC Subnet.
     */
    vpcId: pulumi.Input<number>;
}
