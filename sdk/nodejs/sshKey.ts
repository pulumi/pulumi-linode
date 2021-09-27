// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Linode SSH Key resource.  This can be used to create, modify, and delete Linodes SSH Keys.  Managed SSH Keys allow instances to be created with a list of Linode usernames, whose SSH keys will be automatically applied to the root account's `~/.ssh/authorized_keys` file.
 * For more information, see the [Linode APIv4 docs](https://developers.linode.com/api/v4#operation/getSSHKeys).
 *
 * ## Attributes
 *
 * This resource exports the following attributes:
 *
 * * `created` - The date this SSH Key was created.
 *
 * ## Import
 *
 * Linodes SSH Keys can be imported using the Linode SSH Key `id`, e.g.
 *
 * ```sh
 *  $ pulumi import linode:index/sshKey:SshKey mysshkey 1234567
 * ```
 */
export class SshKey extends pulumi.CustomResource {
    /**
     * Get an existing SshKey resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SshKeyState, opts?: pulumi.CustomResourceOptions): SshKey {
        return new SshKey(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'linode:index/sshKey:SshKey';

    /**
     * Returns true if the given object is an instance of SshKey.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SshKey {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SshKey.__pulumiType;
    }

    /**
     * The date this key was added.
     */
    public /*out*/ readonly created!: pulumi.Output<string>;
    /**
     * A label for the SSH Key.
     */
    public readonly label!: pulumi.Output<string>;
    /**
     * The public SSH Key, which is used to authenticate to the root user of the Linodes you deploy.
     */
    public readonly sshKey!: pulumi.Output<string>;

    /**
     * Create a SshKey resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SshKeyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SshKeyArgs | SshKeyState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SshKeyState | undefined;
            inputs["created"] = state ? state.created : undefined;
            inputs["label"] = state ? state.label : undefined;
            inputs["sshKey"] = state ? state.sshKey : undefined;
        } else {
            const args = argsOrState as SshKeyArgs | undefined;
            if ((!args || args.label === undefined) && !opts.urn) {
                throw new Error("Missing required property 'label'");
            }
            if ((!args || args.sshKey === undefined) && !opts.urn) {
                throw new Error("Missing required property 'sshKey'");
            }
            inputs["label"] = args ? args.label : undefined;
            inputs["sshKey"] = args ? args.sshKey : undefined;
            inputs["created"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(SshKey.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SshKey resources.
 */
export interface SshKeyState {
    /**
     * The date this key was added.
     */
    created?: pulumi.Input<string>;
    /**
     * A label for the SSH Key.
     */
    label?: pulumi.Input<string>;
    /**
     * The public SSH Key, which is used to authenticate to the root user of the Linodes you deploy.
     */
    sshKey?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a SshKey resource.
 */
export interface SshKeyArgs {
    /**
     * A label for the SSH Key.
     */
    label: pulumi.Input<string>;
    /**
     * The public SSH Key, which is used to authenticate to the root user of the Linodes you deploy.
     */
    sshKey: pulumi.Input<string>;
}
