// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Manages a Linode VPC.
 * For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/post-vpc).
 *
 * Please refer to linode.VpcSubnet to manage the subnets under a Linode VPC.
 *
 * ## Example Usage
 *
 * Create a VPC:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const test = new linode.Vpc("test", {
 *     label: "test-vpc",
 *     region: "us-iad",
 *     description: "My first VPC.",
 * });
 * ```
 */
export class Vpc extends pulumi.CustomResource {
    /**
     * Get an existing Vpc resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: VpcState, opts?: pulumi.CustomResourceOptions): Vpc {
        return new Vpc(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'linode:index/vpc:Vpc';

    /**
     * Returns true if the given object is an instance of Vpc.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Vpc {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Vpc.__pulumiType;
    }

    /**
     * The date and time when the VPC was created.
     */
    public /*out*/ readonly created!: pulumi.Output<string>;
    /**
     * The user-defined description of this VPC.
     */
    public readonly description!: pulumi.Output<string>;
    /**
     * The label of the VPC. This field can only contain ASCII letters, digits and dashes.
     */
    public readonly label!: pulumi.Output<string>;
    /**
     * The region of the VPC.
     */
    public readonly region!: pulumi.Output<string>;
    /**
     * The date and time when the VPC was last updated.
     */
    public /*out*/ readonly updated!: pulumi.Output<string>;

    /**
     * Create a Vpc resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: VpcArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: VpcArgs | VpcState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as VpcState | undefined;
            resourceInputs["created"] = state ? state.created : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["label"] = state ? state.label : undefined;
            resourceInputs["region"] = state ? state.region : undefined;
            resourceInputs["updated"] = state ? state.updated : undefined;
        } else {
            const args = argsOrState as VpcArgs | undefined;
            if ((!args || args.label === undefined) && !opts.urn) {
                throw new Error("Missing required property 'label'");
            }
            if ((!args || args.region === undefined) && !opts.urn) {
                throw new Error("Missing required property 'region'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["label"] = args ? args.label : undefined;
            resourceInputs["region"] = args ? args.region : undefined;
            resourceInputs["created"] = undefined /*out*/;
            resourceInputs["updated"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Vpc.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Vpc resources.
 */
export interface VpcState {
    /**
     * The date and time when the VPC was created.
     */
    created?: pulumi.Input<string>;
    /**
     * The user-defined description of this VPC.
     */
    description?: pulumi.Input<string>;
    /**
     * The label of the VPC. This field can only contain ASCII letters, digits and dashes.
     */
    label?: pulumi.Input<string>;
    /**
     * The region of the VPC.
     */
    region?: pulumi.Input<string>;
    /**
     * The date and time when the VPC was last updated.
     */
    updated?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Vpc resource.
 */
export interface VpcArgs {
    /**
     * The user-defined description of this VPC.
     */
    description?: pulumi.Input<string>;
    /**
     * The label of the VPC. This field can only contain ASCII letters, digits and dashes.
     */
    label: pulumi.Input<string>;
    /**
     * The region of the VPC.
     */
    region: pulumi.Input<string>;
}
