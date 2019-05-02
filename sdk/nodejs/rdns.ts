// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Linode RDNS resource.  This can be used to create and modify RDNS records.
 * 
 * Linode RDNS names must have a matching address value in an A or AAAA record.  This A or AAAA name must be resolvable at the time the RDNS resource is being associated.
 * 
 * For more information, see the [Linode APIv4 docs](https://developers.linode.com/api/docs/v4#operation/updateIP) and the [Configure your Linode for Reverse DNS](https://www.linode.com/docs/networking/dns/configure-your-linode-for-reverse-dns-classic-manager/) guide.
 * 
 * ## Example Usage
 * 
 * The following example shows how one might use this resource to configure an RDNS address for an IP address.
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 * 
 * const fooInstance = new linode.Instance("foo", {
 *     image: "linode/alpine3.9",
 *     region: "ca-east",
 *     type: "g6-dedicated-2",
 * });
 * const fooRdns = new linode.Rdns("foo", {
 *     address: fooInstance.ipAddress,
 *     rdns: fooInstance.ipAddress.apply(ipAddress => `${ipAddress}.nip.io`),
 * });
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
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RdnsState, opts?: pulumi.CustomResourceOptions): Rdns {
        return new Rdns(name, <any>state, { ...opts, id: id });
    }

    /**
     * The Public IPv4 or IPv6 address that will receive the `PTR` record.  A matching `A` or `AAAA` record must exist.
     */
    public readonly address!: pulumi.Output<string>;
    /**
     * The name of the RDNS address.
     */
    public readonly rdns!: pulumi.Output<string>;

    /**
     * Create a Rdns resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RdnsArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RdnsArgs | RdnsState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as RdnsState | undefined;
            inputs["address"] = state ? state.address : undefined;
            inputs["rdns"] = state ? state.rdns : undefined;
        } else {
            const args = argsOrState as RdnsArgs | undefined;
            if (!args || args.address === undefined) {
                throw new Error("Missing required property 'address'");
            }
            if (!args || args.rdns === undefined) {
                throw new Error("Missing required property 'rdns'");
            }
            inputs["address"] = args ? args.address : undefined;
            inputs["rdns"] = args ? args.rdns : undefined;
        }
        super("linode:index/rdns:Rdns", name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Rdns resources.
 */
export interface RdnsState {
    /**
     * The Public IPv4 or IPv6 address that will receive the `PTR` record.  A matching `A` or `AAAA` record must exist.
     */
    readonly address?: pulumi.Input<string>;
    /**
     * The name of the RDNS address.
     */
    readonly rdns?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Rdns resource.
 */
export interface RdnsArgs {
    /**
     * The Public IPv4 or IPv6 address that will receive the `PTR` record.  A matching `A` or `AAAA` record must exist.
     */
    readonly address: pulumi.Input<string>;
    /**
     * The name of the RDNS address.
     */
    readonly rdns: pulumi.Input<string>;
}
