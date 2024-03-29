// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * > **Beta Notice** IPv6 sharing is currently available through early access.
 * To use early access resources, the `apiVersion` provider argument must be set to `v4beta`.
 * To learn more, see the early access documentation.
 *
 * > **Notice** This resource should only be defined once per-instance and should not be used alongside the `sharedIpv4` field in `linode.Instance`.
 *
 * Manages IPs shared to a Linode instance.
 *
 * ## Example Usage
 *
 * Share in IPv4 address between two instances:
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * // Create a single primary node
 * const primaryInstance = new linode.Instance("primaryInstance", {
 *     label: "node-primary",
 *     type: "g6-nanode-1",
 *     region: "eu-central",
 * });
 * // Allocate an IP under the primary node
 * const primaryInstanceIp = new linode.InstanceIp("primaryInstanceIp", {linodeId: primaryInstance.id});
 * // Create a secondary node
 * const secondary = new linode.Instance("secondary", {
 *     label: "node-secondary",
 *     type: "g6-nanode-1",
 *     region: "eu-central",
 * });
 * // Share the IP with the secondary node
 * const share_primary = new linode.InstanceSharedIps("share-primary", {
 *     linodeId: secondary.id,
 *     addresses: [primaryInstanceIp.address],
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * Share an IPv6 address among a primary node and its replicas:
 */
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
