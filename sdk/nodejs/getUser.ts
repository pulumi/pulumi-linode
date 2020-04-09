// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides information about a Linode user
 * 
 * ## Example Usage
 * 
 * 
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 * 
 * const foo = linode.getUser({
 *     username: "foo",
 * });
 * ```
 * 
 * ## Attributes
 * 
 * The Linode User resource exports the following attributes:
 * 
 * * `sshKeys` - A list of SSH Key labels added by this User. These are the keys that will be deployed if this User is included in the authorizedUsers field of a create Linode, rebuild Linode, or create Disk request.
 * 
 * * `email` - The email address for this User, for account management communications, and may be used for other communications as configured.
 * 
 * * `restricted` - If true, this User must be granted access to perform actions or access entities on this Account.
 *
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-linode/blob/master/website/docs/d/user.html.md.
 */
export function getUser(args: GetUserArgs, opts?: pulumi.InvokeOptions): Promise<GetUserResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
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
    readonly username: string;
}

/**
 * A collection of values returned by getUser.
 */
export interface GetUserResult {
    readonly email: string;
    readonly restricted: boolean;
    readonly sshKeys: string[];
    readonly username: string;
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
