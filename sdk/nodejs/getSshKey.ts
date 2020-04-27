// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * `linode..SshKey` provides access to a specifically labeled SSH Key in the Profile of the User identified by the access token.
 * 
 * ## Example Usage
 * 
 * 
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 * 
 * const foo = pulumi.output(linode.getSshKey({
 *     label: "foo",
 * }, { async: true }));
 * ```
 *
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-linode/blob/master/website/docs/d/sshkey.html.md.
 */
export function getSshKey(args: GetSshKeyArgs, opts?: pulumi.InvokeOptions): Promise<GetSshKeyResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("linode:index/getSshKey:getSshKey", {
        "label": args.label,
    }, opts);
}

/**
 * A collection of arguments for invoking getSshKey.
 */
export interface GetSshKeyArgs {
    readonly label: string;
}

/**
 * A collection of values returned by getSshKey.
 */
export interface GetSshKeyResult {
    readonly created: string;
    readonly label: string;
    readonly sshKey: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
