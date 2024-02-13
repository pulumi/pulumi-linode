// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a Linode RDNS resource.  This can be used to create and modify RDNS records.
 *
 * Linode RDNS names must have a matching address value in an A or AAAA record.  This A or AAAA name must be resolvable at the time the RDNS resource is being associated.
 *
 * For more information, see the [Linode APIv4 docs](https://developers.linode.com/api/v4/networking-ips-address/#put) and the [Configure your Linode for Reverse DNS](https://www.linode.com/docs/networking/dns/configure-your-linode-for-reverse-dns-classic-manager/) guide.
 *
 * ## Import
 *
 * Linodes RDNS resources can be imported using the address as the `id`.
 *
 * ```sh
 * $ pulumi import linode:index/rdns:Rdns foo 123.123.123.123
 * ```
 */
export class Rdns extends pulumi.CustomResource {
    /**
     * Get an existing Rdns resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RdnsState, opts?: pulumi.CustomResourceOptions): Rdns {
        return new Rdns(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'linode:index/rdns:Rdns';

    /**
     * Returns true if the given object is an instance of Rdns.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Rdns {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Rdns.__pulumiType;
    }

    /**
     * The Public IPv4 or IPv6 address that will receive the `PTR` record.  A matching `A` or `AAAA` record must exist.
     */
    public readonly address!: pulumi.Output<string>;
    /**
     * The name of the RDNS address.
     */
    public readonly rdns!: pulumi.Output<string>;
    public readonly timeouts!: pulumi.Output<outputs.RdnsTimeouts | undefined>;
    /**
     * If true, the RDNS assignment will be retried within the operation timeout period.
     */
    public readonly waitForAvailable!: pulumi.Output<boolean>;

    /**
     * Create a Rdns resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RdnsArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RdnsArgs | RdnsState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as RdnsState | undefined;
            resourceInputs["address"] = state ? state.address : undefined;
            resourceInputs["rdns"] = state ? state.rdns : undefined;
            resourceInputs["timeouts"] = state ? state.timeouts : undefined;
            resourceInputs["waitForAvailable"] = state ? state.waitForAvailable : undefined;
        } else {
            const args = argsOrState as RdnsArgs | undefined;
            if ((!args || args.address === undefined) && !opts.urn) {
                throw new Error("Missing required property 'address'");
            }
            if ((!args || args.rdns === undefined) && !opts.urn) {
                throw new Error("Missing required property 'rdns'");
            }
            resourceInputs["address"] = args ? args.address : undefined;
            resourceInputs["rdns"] = args ? args.rdns : undefined;
            resourceInputs["timeouts"] = args ? args.timeouts : undefined;
            resourceInputs["waitForAvailable"] = args ? args.waitForAvailable : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Rdns.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Rdns resources.
 */
export interface RdnsState {
    /**
     * The Public IPv4 or IPv6 address that will receive the `PTR` record.  A matching `A` or `AAAA` record must exist.
     */
    address?: pulumi.Input<string>;
    /**
     * The name of the RDNS address.
     */
    rdns?: pulumi.Input<string>;
    timeouts?: pulumi.Input<inputs.RdnsTimeouts>;
    /**
     * If true, the RDNS assignment will be retried within the operation timeout period.
     */
    waitForAvailable?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a Rdns resource.
 */
export interface RdnsArgs {
    /**
     * The Public IPv4 or IPv6 address that will receive the `PTR` record.  A matching `A` or `AAAA` record must exist.
     */
    address: pulumi.Input<string>;
    /**
     * The name of the RDNS address.
     */
    rdns: pulumi.Input<string>;
    timeouts?: pulumi.Input<inputs.RdnsTimeouts>;
    /**
     * If true, the RDNS assignment will be retried within the operation timeout period.
     */
    waitForAvailable?: pulumi.Input<boolean>;
}
