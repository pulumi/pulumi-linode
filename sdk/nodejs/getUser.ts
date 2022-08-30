// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides information about a Linode user
 *
 * ## Example Usage
 *
 * The following example shows how one might use this data source to access information about a Linode user.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const foo = pulumi.output(linode.getUser({
 *     username: "foo",
 * }));
 * ```
 */
export function getUser(args: GetUserArgs, opts?: pulumi.InvokeOptions): Promise<GetUserResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("linode:index/getUser:getUser", {
        "username": args.username,
    }, opts);
}

/**
 * A collection of arguments for invoking getUser.
 */
export interface GetUserArgs {
    /**
     * The unique username of this User.
     */
    username: string;
}

/**
 * A collection of values returned by getUser.
 */
export interface GetUserResult {
    /**
     * The email address for this User, for account management communications, and may be used for other communications as configured.
     */
    readonly email: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * If true, this User must be granted access to perform actions or access entities on this Account.
     */
    readonly restricted: boolean;
    /**
     * A list of SSH Key labels added by this User. These are the keys that will be deployed if this User is included in the authorizedUsers field of a create Linode, rebuild Linode, or create Disk request.
     */
    readonly sshKeys: string[];
    readonly username: string;
}

export function getUserOutput(args: GetUserOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetUserResult> {
    return pulumi.output(args).apply(a => getUser(a, opts))
}

/**
 * A collection of arguments for invoking getUser.
 */
export interface GetUserOutputArgs {
    /**
     * The unique username of this User.
     */
    username: pulumi.Input<string>;
}
