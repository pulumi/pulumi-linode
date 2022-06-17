// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

export class InstanceSharedIps extends pulumi.CustomResource {
    /**
     * Get an existing InstanceSharedIps resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: InstanceSharedIpsState, opts?: pulumi.CustomResourceOptions): InstanceSharedIps {
        return new InstanceSharedIps(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'linode:index/instanceSharedIps:InstanceSharedIps';

    /**
     * Returns true if the given object is an instance of InstanceSharedIps.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is InstanceSharedIps {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === InstanceSharedIps.__pulumiType;
    }

    /**
     * The set of IPs to share with the Linode.
     */
    public readonly addresses!: pulumi.Output<string[]>;
    /**
     * The ID of the Linode to share the IPs to.
     */
    public readonly linodeId!: pulumi.Output<number>;

    /**
     * Create a InstanceSharedIps resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: InstanceSharedIpsArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: InstanceSharedIpsArgs | InstanceSharedIpsState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as InstanceSharedIpsState | undefined;
            resourceInputs["addresses"] = state ? state.addresses : undefined;
            resourceInputs["linodeId"] = state ? state.linodeId : undefined;
        } else {
            const args = argsOrState as InstanceSharedIpsArgs | undefined;
            if ((!args || args.addresses === undefined) && !opts.urn) {
                throw new Error("Missing required property 'addresses'");
            }
            if ((!args || args.linodeId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'linodeId'");
            }
            resourceInputs["addresses"] = args ? args.addresses : undefined;
            resourceInputs["linodeId"] = args ? args.linodeId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(InstanceSharedIps.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering InstanceSharedIps resources.
 */
export interface InstanceSharedIpsState {
    /**
     * The set of IPs to share with the Linode.
     */
    addresses?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The ID of the Linode to share the IPs to.
     */
    linodeId?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a InstanceSharedIps resource.
 */
export interface InstanceSharedIpsArgs {
    /**
     * The set of IPs to share with the Linode.
     */
    addresses: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The ID of the Linode to share the IPs to.
     */
    linodeId: pulumi.Input<number>;
}
