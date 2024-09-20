// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * `linode.SshKey` provides access to a specifically labeled SSH Key in the Profile of the User identified by the access token.
 * For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-ssh-key).
 *
 * ## Example Usage
 *
 * The following example shows how the resource might be used to obtain the name of the SSH Key configured on the Linode user profile.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const foo = linode.getSshKey({
 *     label: "foo",
 * });
 * ```
 */
export function getSshKey(args: GetSshKeyArgs, opts?: pulumi.InvokeOptions): Promise<GetSshKeyResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("linode:index/getSshKey:getSshKey", {
        "id": args.id,
        "label": args.label,
    }, opts);
}

/**
 * A collection of arguments for invoking getSshKey.
 */
export interface GetSshKeyArgs {
    /**
     * The ID of the SSH Key
     */
    id?: string;
    /**
     * The label of the SSH Key to select.
     */
    label: string;
}

/**
 * A collection of values returned by getSshKey.
 */
export interface GetSshKeyResult {
    /**
     * The date this key was added.
     */
    readonly created: string;
    /**
     * The ID of the SSH Key
     */
    readonly id?: string;
    readonly label: string;
    /**
     * The public SSH Key, which is used to authenticate to the root user of the Linodes you deploy.
     */
    readonly sshKey: string;
}
/**
 * `linode.SshKey` provides access to a specifically labeled SSH Key in the Profile of the User identified by the access token.
 * For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-ssh-key).
 *
 * ## Example Usage
 *
 * The following example shows how the resource might be used to obtain the name of the SSH Key configured on the Linode user profile.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const foo = linode.getSshKey({
 *     label: "foo",
 * });
 * ```
 */
export function getSshKeyOutput(args: GetSshKeyOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSshKeyResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("linode:index/getSshKey:getSshKey", {
        "id": args.id,
        "label": args.label,
    }, opts);
}

/**
 * A collection of arguments for invoking getSshKey.
 */
export interface GetSshKeyOutputArgs {
    /**
     * The ID of the SSH Key
     */
    id?: pulumi.Input<string>;
    /**
     * The label of the SSH Key to select.
     */
    label: pulumi.Input<string>;
}
