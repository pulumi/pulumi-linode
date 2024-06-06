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
 * The following example shows how one might use this data source to access information about a Linode user.
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
 * The following example shows a sample grant.
 */
export function getUser(args: GetUserArgs, opts?: pulumi.InvokeOptions): Promise<GetUserResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("linode:index/getUser:getUser", {
        "databaseGrants": args.databaseGrants,
        "domainGrants": args.domainGrants,
        "firewallGrants": args.firewallGrants,
        "imageGrants": args.imageGrants,
        "linodeGrants": args.linodeGrants,
        "longviewGrants": args.longviewGrants,
        "nodebalancerGrants": args.nodebalancerGrants,
        "stackscriptGrants": args.stackscriptGrants,
        "username": args.username,
        "volumeGrants": args.volumeGrants,
    }, opts);
}

/**
 * A collection of arguments for invoking getUser.
 */
export interface GetUserArgs {
    databaseGrants?: inputs.GetUserDatabaseGrant[];
    domainGrants?: inputs.GetUserDomainGrant[];
    firewallGrants?: inputs.GetUserFirewallGrant[];
    imageGrants?: inputs.GetUserImageGrant[];
    linodeGrants?: inputs.GetUserLinodeGrant[];
    longviewGrants?: inputs.GetUserLongviewGrant[];
    nodebalancerGrants?: inputs.GetUserNodebalancerGrant[];
    stackscriptGrants?: inputs.GetUserStackscriptGrant[];
    /**
     * The unique username of this User.
     */
    username: string;
    volumeGrants?: inputs.GetUserVolumeGrant[];
}

/**
 * A collection of values returned by getUser.
 */
export interface GetUserResult {
    readonly databaseGrants: outputs.GetUserDatabaseGrant[];
    readonly domainGrants: outputs.GetUserDomainGrant[];
    /**
     * The email address for this User, for account management communications, and may be used for other communications as configured.
     */
    readonly email: string;
    readonly firewallGrants: outputs.GetUserFirewallGrant[];
    readonly globalGrants: outputs.GetUserGlobalGrant[];
    /**
     * The ID of entity this grant applies to.
     */
    readonly id: string;
    readonly imageGrants: outputs.GetUserImageGrant[];
    readonly linodeGrants: outputs.GetUserLinodeGrant[];
    readonly longviewGrants: outputs.GetUserLongviewGrant[];
    readonly nodebalancerGrants: outputs.GetUserNodebalancerGrant[];
    /**
     * The date and time when this User’s current password was created. User passwords are first created during the Account sign-up process, and updated using the Reset Password webpage. null if this User has not created a password yet.
     */
    readonly passwordCreated: string;
    /**
     * If true, this User must be granted access to perform actions or access entities on this Account.
     */
    readonly restricted: boolean;
    /**
     * A list of SSH Key labels added by this User. These are the keys that will be deployed if this User is included in the authorizedUsers field of a create Linode, rebuild Linode, or create Disk request.
     */
    readonly sshKeys: string[];
    readonly stackscriptGrants: outputs.GetUserStackscriptGrant[];
    /**
     * A boolean value indicating if the User has Two Factor Authentication (TFA) enabled.
     */
    readonly tfaEnabled: boolean;
    /**
     * The type of this user.
     */
    readonly userType: string;
    readonly username: string;
    /**
     * The phone number verified for this User Profile with the Phone Number Verify command. null if this User Profile has no verified phone number.
     */
    readonly verifiedPhoneNumber: string;
    readonly volumeGrants: outputs.GetUserVolumeGrant[];
}
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
 * const foo = linode.getUser({
 *     username: "foo",
 * });
 * ```
 *
 * The following example shows a sample grant.
 */
export function getUserOutput(args: GetUserOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetUserResult> {
    return pulumi.output(args).apply((a: any) => getUser(a, opts))
}

/**
 * A collection of arguments for invoking getUser.
 */
export interface GetUserOutputArgs {
    databaseGrants?: pulumi.Input<pulumi.Input<inputs.GetUserDatabaseGrantArgs>[]>;
    domainGrants?: pulumi.Input<pulumi.Input<inputs.GetUserDomainGrantArgs>[]>;
    firewallGrants?: pulumi.Input<pulumi.Input<inputs.GetUserFirewallGrantArgs>[]>;
    imageGrants?: pulumi.Input<pulumi.Input<inputs.GetUserImageGrantArgs>[]>;
    linodeGrants?: pulumi.Input<pulumi.Input<inputs.GetUserLinodeGrantArgs>[]>;
    longviewGrants?: pulumi.Input<pulumi.Input<inputs.GetUserLongviewGrantArgs>[]>;
    nodebalancerGrants?: pulumi.Input<pulumi.Input<inputs.GetUserNodebalancerGrantArgs>[]>;
    stackscriptGrants?: pulumi.Input<pulumi.Input<inputs.GetUserStackscriptGrantArgs>[]>;
    /**
     * The unique username of this User.
     */
    username: pulumi.Input<string>;
    volumeGrants?: pulumi.Input<pulumi.Input<inputs.GetUserVolumeGrantArgs>[]>;
}
