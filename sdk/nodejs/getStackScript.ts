// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides details about a specific Linode StackScript.
 *
 * ## Example Usage
 *
 * The following example shows how one might use this data source to access information about a Linode StackScript.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const myStackscript = pulumi.output(linode.getStackScript({
 *     id: 355872,
 * }));
 * ```
 */
export function getStackScript(args: GetStackScriptArgs, opts?: pulumi.InvokeOptions): Promise<GetStackScriptResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("linode:index/getStackScript:getStackScript", {
        "id": args.id,
        "userDefinedFields": args.userDefinedFields,
    }, opts);
}

/**
 * A collection of arguments for invoking getStackScript.
 */
export interface GetStackScriptArgs {
    /**
     * The unique numeric ID of the StackScript to query.
     */
    id: number;
    /**
     * This is a list of fields defined with a special syntax inside this StackScript that allow for supplying customized parameters during deployment.
     */
    userDefinedFields?: inputs.GetStackScriptUserDefinedField[];
}

/**
 * A collection of values returned by getStackScript.
 */
export interface GetStackScriptResult {
    /**
     * The date this StackScript was created.
     */
    readonly created: string;
    /**
     * Count of currently active, deployed Linodes created from this StackScript.
     */
    readonly deploymentsActive: number;
    /**
     * The total number of times this StackScript has been deployed.
     */
    readonly deploymentsTotal: number;
    /**
     * A description for the StackScript.
     */
    readonly description: string;
    readonly id: number;
    /**
     * An array of Image IDs representing the Images that this StackScript is compatible for deploying with.
     */
    readonly images: string[];
    /**
     * This determines whether other users can use your StackScript. Once a StackScript is made public, it cannot be made private.
     */
    readonly isPublic: boolean;
    /**
     * A human-readable label for the field that will serve as the input prompt for entering the value during deployment.
     */
    readonly label: string;
    /**
     * This field allows you to add notes for the set of revisions made to this StackScript.
     */
    readonly revNote: string;
    /**
     * The script to execute when provisioning a new Linode with this StackScript.
     */
    readonly script: string;
    /**
     * The date this StackScript was updated.
     */
    readonly updated: string;
    /**
     * This is a list of fields defined with a special syntax inside this StackScript that allow for supplying customized parameters during deployment.
     */
    readonly userDefinedFields: outputs.GetStackScriptUserDefinedField[];
    /**
     * The Gravatar ID for the User who created the StackScript.
     */
    readonly userGravatarId: string;
    /**
     * The User who created the StackScript.
     */
    readonly username: string;
}

export function getStackScriptOutput(args: GetStackScriptOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetStackScriptResult> {
    return pulumi.output(args).apply(a => getStackScript(a, opts))
}

/**
 * A collection of arguments for invoking getStackScript.
 */
export interface GetStackScriptOutputArgs {
    /**
     * The unique numeric ID of the StackScript to query.
     */
    id: pulumi.Input<number>;
    /**
     * This is a list of fields defined with a special syntax inside this StackScript that allow for supplying customized parameters during deployment.
     */
    userDefinedFields?: pulumi.Input<pulumi.Input<inputs.GetStackScriptUserDefinedFieldArgs>[]>;
}
