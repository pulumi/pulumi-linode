// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a Linode StackScript resource.  This can be used to create, modify, and delete Linode StackScripts.  StackScripts are private or public managed scripts which run within an instance during startup.  StackScripts can include variables whose values are specified when the Instance is created.
 *
 * For more information, see [Automate Deployment with StackScripts](https://www.linode.com/docs/platform/stackscripts/) and the [Linode APIv4 docs](https://developers.linode.com/api/v4#tag/StackScripts).
 *
 * ## Example Usage
 *
 * The following example shows how one might use this resource to configure a StackScript attached to a Linode Instance.  As shown below, StackScripts must begin with a shebang (`#!`).  The `<UDF ...>` element provided in the Bash comment block defines a variable whose value is provided when creating the Instance (or disk) using the `stackscriptData` field.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const fooStackScript = new linode.StackScript("fooStackScript", {
 *     label: "foo",
 *     description: "Installs a Package",
 *     script: `#!/bin/bash
 * # <UDF name="package" label="System Package to Install" example="nginx" default="">
 * apt-get -q update && apt-get -q -y install $PACKAGE
 * `,
 *     images: [
 *         "linode/ubuntu18.04",
 *         "linode/ubuntu16.04lts",
 *     ],
 *     revNote: "initial version",
 * });
 * const fooInstance = new linode.Instance("fooInstance", {
 *     image: "linode/ubuntu18.04",
 *     label: "foo",
 *     region: "us-east",
 *     type: "g6-nanode-1",
 *     authorizedKeys: ["..."],
 *     rootPass: "...",
 *     stackscriptId: fooStackScript.id,
 *     stackscriptData: {
 *         "package": "nginx",
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Linodes StackScripts can be imported using the Linode StackScript `id`, e.g.
 *
 * ```sh
 *  $ pulumi import linode:index/stackScript:StackScript mystackscript 1234567
 * ```
 */
export class StackScript extends pulumi.CustomResource {
    /**
     * Get an existing StackScript resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: StackScriptState, opts?: pulumi.CustomResourceOptions): StackScript {
        return new StackScript(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'linode:index/stackScript:StackScript';

    /**
     * Returns true if the given object is an instance of StackScript.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is StackScript {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === StackScript.__pulumiType;
    }

    /**
     * The date this StackScript was created.
     */
    public /*out*/ readonly created!: pulumi.Output<string>;
    /**
     * Count of currently active, deployed Linodes created from this StackScript.
     */
    public /*out*/ readonly deploymentsActive!: pulumi.Output<number>;
    /**
     * The total number of times this StackScript has been deployed.
     */
    public /*out*/ readonly deploymentsTotal!: pulumi.Output<number>;
    /**
     * A description for the StackScript.
     */
    public readonly description!: pulumi.Output<string>;
    /**
     * An array of Image IDs representing the Images that this StackScript is compatible for deploying with.
     */
    public readonly images!: pulumi.Output<string[]>;
    /**
     * This determines whether other users can use your StackScript. Once a StackScript is made public, it cannot be made private. *Changing `isPublic` forces the creation of a new StackScript*
     */
    public readonly isPublic!: pulumi.Output<boolean | undefined>;
    /**
     * The StackScript's label is for display purposes only.
     */
    public readonly label!: pulumi.Output<string>;
    /**
     * This field allows you to add notes for the set of revisions made to this StackScript.
     */
    public readonly revNote!: pulumi.Output<string | undefined>;
    /**
     * The script to execute when provisioning a new Linode with this StackScript.
     */
    public readonly script!: pulumi.Output<string>;
    /**
     * The date this StackScript was updated.
     */
    public /*out*/ readonly updated!: pulumi.Output<string>;
    /**
     * This is a list of fields defined with a special syntax inside this StackScript that allow for supplying customized parameters during deployment.
     */
    public readonly userDefinedFields!: pulumi.Output<outputs.StackScriptUserDefinedField[]>;
    /**
     * The Gravatar ID for the User who created the StackScript.
     */
    public /*out*/ readonly userGravatarId!: pulumi.Output<string>;
    /**
     * The User who created the StackScript.
     */
    public /*out*/ readonly username!: pulumi.Output<string>;

    /**
     * Create a StackScript resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: StackScriptArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: StackScriptArgs | StackScriptState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as StackScriptState | undefined;
            resourceInputs["created"] = state ? state.created : undefined;
            resourceInputs["deploymentsActive"] = state ? state.deploymentsActive : undefined;
            resourceInputs["deploymentsTotal"] = state ? state.deploymentsTotal : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["images"] = state ? state.images : undefined;
            resourceInputs["isPublic"] = state ? state.isPublic : undefined;
            resourceInputs["label"] = state ? state.label : undefined;
            resourceInputs["revNote"] = state ? state.revNote : undefined;
            resourceInputs["script"] = state ? state.script : undefined;
            resourceInputs["updated"] = state ? state.updated : undefined;
            resourceInputs["userDefinedFields"] = state ? state.userDefinedFields : undefined;
            resourceInputs["userGravatarId"] = state ? state.userGravatarId : undefined;
            resourceInputs["username"] = state ? state.username : undefined;
        } else {
            const args = argsOrState as StackScriptArgs | undefined;
            if ((!args || args.description === undefined) && !opts.urn) {
                throw new Error("Missing required property 'description'");
            }
            if ((!args || args.images === undefined) && !opts.urn) {
                throw new Error("Missing required property 'images'");
            }
            if ((!args || args.label === undefined) && !opts.urn) {
                throw new Error("Missing required property 'label'");
            }
            if ((!args || args.script === undefined) && !opts.urn) {
                throw new Error("Missing required property 'script'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["images"] = args ? args.images : undefined;
            resourceInputs["isPublic"] = args ? args.isPublic : undefined;
            resourceInputs["label"] = args ? args.label : undefined;
            resourceInputs["revNote"] = args ? args.revNote : undefined;
            resourceInputs["script"] = args ? args.script : undefined;
            resourceInputs["userDefinedFields"] = args ? args.userDefinedFields : undefined;
            resourceInputs["created"] = undefined /*out*/;
            resourceInputs["deploymentsActive"] = undefined /*out*/;
            resourceInputs["deploymentsTotal"] = undefined /*out*/;
            resourceInputs["updated"] = undefined /*out*/;
            resourceInputs["userGravatarId"] = undefined /*out*/;
            resourceInputs["username"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(StackScript.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering StackScript resources.
 */
export interface StackScriptState {
    /**
     * The date this StackScript was created.
     */
    created?: pulumi.Input<string>;
    /**
     * Count of currently active, deployed Linodes created from this StackScript.
     */
    deploymentsActive?: pulumi.Input<number>;
    /**
     * The total number of times this StackScript has been deployed.
     */
    deploymentsTotal?: pulumi.Input<number>;
    /**
     * A description for the StackScript.
     */
    description?: pulumi.Input<string>;
    /**
     * An array of Image IDs representing the Images that this StackScript is compatible for deploying with.
     */
    images?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * This determines whether other users can use your StackScript. Once a StackScript is made public, it cannot be made private. *Changing `isPublic` forces the creation of a new StackScript*
     */
    isPublic?: pulumi.Input<boolean>;
    /**
     * The StackScript's label is for display purposes only.
     */
    label?: pulumi.Input<string>;
    /**
     * This field allows you to add notes for the set of revisions made to this StackScript.
     */
    revNote?: pulumi.Input<string>;
    /**
     * The script to execute when provisioning a new Linode with this StackScript.
     */
    script?: pulumi.Input<string>;
    /**
     * The date this StackScript was updated.
     */
    updated?: pulumi.Input<string>;
    /**
     * This is a list of fields defined with a special syntax inside this StackScript that allow for supplying customized parameters during deployment.
     */
    userDefinedFields?: pulumi.Input<pulumi.Input<inputs.StackScriptUserDefinedField>[]>;
    /**
     * The Gravatar ID for the User who created the StackScript.
     */
    userGravatarId?: pulumi.Input<string>;
    /**
     * The User who created the StackScript.
     */
    username?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a StackScript resource.
 */
export interface StackScriptArgs {
    /**
     * A description for the StackScript.
     */
    description: pulumi.Input<string>;
    /**
     * An array of Image IDs representing the Images that this StackScript is compatible for deploying with.
     */
    images: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * This determines whether other users can use your StackScript. Once a StackScript is made public, it cannot be made private. *Changing `isPublic` forces the creation of a new StackScript*
     */
    isPublic?: pulumi.Input<boolean>;
    /**
     * The StackScript's label is for display purposes only.
     */
    label: pulumi.Input<string>;
    /**
     * This field allows you to add notes for the set of revisions made to this StackScript.
     */
    revNote?: pulumi.Input<string>;
    /**
     * The script to execute when provisioning a new Linode with this StackScript.
     */
    script: pulumi.Input<string>;
    /**
     * This is a list of fields defined with a special syntax inside this StackScript that allow for supplying customized parameters during deployment.
     */
    userDefinedFields?: pulumi.Input<pulumi.Input<inputs.StackScriptUserDefinedField>[]>;
}
