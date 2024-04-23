// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides details about a specific Linode account login.
 *
 * ## Example Usage
 *
 * The following example shows how one might use this data source to access information about a Linode account login.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const myAccountLogin = linode.getAccountLogin({
 *     id: 123456,
 * });
 * ```
 */
export function getAccountLogin(args: GetAccountLoginArgs, opts?: pulumi.InvokeOptions): Promise<GetAccountLoginResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("linode:index/getAccountLogin:getAccountLogin", {
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getAccountLogin.
 */
export interface GetAccountLoginArgs {
    /**
     * The unique ID of this login object.
     */
    id: number;
}

/**
 * A collection of values returned by getAccountLogin.
 */
export interface GetAccountLoginResult {
    /**
     * When the login was initiated.
     */
    readonly datetime: string;
    /**
     * The unique ID of this login object.
     */
    readonly id: number;
    /**
     * The remote IP address that requested the login.
     */
    readonly ip: string;
    /**
     * True if the User that was logged into was a restricted User, false otherwise.
     */
    readonly restricted: boolean;
    readonly status: string;
    /**
     * The username of the User that was logged into.
     */
    readonly username: string;
}
/**
 * Provides details about a specific Linode account login.
 *
 * ## Example Usage
 *
 * The following example shows how one might use this data source to access information about a Linode account login.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const myAccountLogin = linode.getAccountLogin({
 *     id: 123456,
 * });
 * ```
 */
export function getAccountLoginOutput(args: GetAccountLoginOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetAccountLoginResult> {
    return pulumi.output(args).apply((a: any) => getAccountLogin(a, opts))
}

/**
 * A collection of arguments for invoking getAccountLogin.
 */
export interface GetAccountLoginOutputArgs {
    /**
     * The unique ID of this login object.
     */
    id: pulumi.Input<number>;
}
