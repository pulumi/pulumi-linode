// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

export class NetworkingIpAssignment extends pulumi.CustomResource {
    /**
     * Get an existing NetworkingIpAssignment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: NetworkingIpAssignmentState, opts?: pulumi.CustomResourceOptions): NetworkingIpAssignment {
        return new NetworkingIpAssignment(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'linode:index/networkingIpAssignment:NetworkingIpAssignment';

    /**
     * Returns true if the given object is an instance of NetworkingIpAssignment.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is NetworkingIpAssignment {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === NetworkingIpAssignment.__pulumiType;
    }

    public readonly assignments!: pulumi.Output<outputs.NetworkingIpAssignmentAssignment[] | undefined>;
    /**
     * The region for the IP assignments.
     */
    public readonly region!: pulumi.Output<string>;

    /**
     * Create a NetworkingIpAssignment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: NetworkingIpAssignmentArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: NetworkingIpAssignmentArgs | NetworkingIpAssignmentState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as NetworkingIpAssignmentState | undefined;
            resourceInputs["assignments"] = state ? state.assignments : undefined;
            resourceInputs["region"] = state ? state.region : undefined;
        } else {
            const args = argsOrState as NetworkingIpAssignmentArgs | undefined;
            if ((!args || args.region === undefined) && !opts.urn) {
                throw new Error("Missing required property 'region'");
            }
            resourceInputs["assignments"] = args ? args.assignments : undefined;
            resourceInputs["region"] = args ? args.region : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(NetworkingIpAssignment.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering NetworkingIpAssignment resources.
 */
export interface NetworkingIpAssignmentState {
    assignments?: pulumi.Input<pulumi.Input<inputs.NetworkingIpAssignmentAssignment>[]>;
    /**
     * The region for the IP assignments.
     */
    region?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a NetworkingIpAssignment resource.
 */
export interface NetworkingIpAssignmentArgs {
    assignments?: pulumi.Input<pulumi.Input<inputs.NetworkingIpAssignmentAssignment>[]>;
    /**
     * The region for the IP assignments.
     */
    region: pulumi.Input<string>;
}
