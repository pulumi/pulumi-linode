// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides information about a Linode domain.
 * 
 * ## Example Usage
 * 
 * The following example shows how one might use this data source to access information about a Linode domain.
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 * 
 * const foo = linode.getDomain({
 *     id: "1234567",
 * });
 * const bar = linode.getDomain({
 *     domain: "bar.example.com",
 * });
 * ```
 * 
 * ## Attributes
 * 
 * The Linode Domain resource exports the following attributes:
 * 
 * * `id` - The unique ID of this Domain.
 * 
 * * `domain` - The domain this Domain represents. These must be unique in our system; you cannot have two Domains representing the same domain
 * 
 * * `type` - If this Domain represents the authoritative source of information for the domain it describes, or if it is a read-only copy of a master (also called a slave)
 * 
 * * `group` - The group this Domain belongs to.
 * 
 * * `status` - Used to control whether this Domain is currently being rendered.
 * 
 * * `description` - A description for this Domain.
 * 
 * * `masterIps` - The IP addresses representing the master DNS for this Domain.
 * 
 * * `axfrIps` - The list of IPs that may perform a zone transfer for this Domain.
 * 
 * * `ttlSec` - 'Time to Live'-the amount of time in seconds that this Domain's records may be cached by resolvers or other domain servers.
 * 
 * * `retrySec` - The interval, in seconds, at which a failed refresh should be retried.
 * *
 * * `expireSec` - The amount of time in seconds that may pass before this Domain is no longer authoritative.
 * 
 * * `refreshSec` - The amount of time in seconds before this Domain should be refreshed.
 * 
 * * `soaEmail` - Start of Authority email address.
 * 
 * * `tags` - An array of tags applied to this object.
 *
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-linode/blob/master/website/docs/d/domain.html.markdown.
 */
export function getDomain(args?: GetDomainArgs, opts?: pulumi.InvokeOptions): Promise<GetDomainResult> & GetDomainResult {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    const promise: Promise<GetDomainResult> = pulumi.runtime.invoke("linode:index/getDomain:getDomain", {
        "domain": args.domain,
        "id": args.id,
    }, opts);

    return pulumi.utils.liftProperties(promise, opts);
}

/**
 * A collection of arguments for invoking getDomain.
 */
export interface GetDomainArgs {
    /**
     * The unique domain name of the Domain record to query.
     */
    readonly domain?: string;
    /**
     * The unique numeric ID of the Domain record to query.
     */
    readonly id?: string;
}

/**
 * A collection of values returned by getDomain.
 */
export interface GetDomainResult {
    readonly axfrIps: string[];
    readonly description: string;
    readonly domain?: string;
    readonly expireSec: number;
    readonly group: string;
    readonly id?: string;
    readonly masterIps: string[];
    readonly refreshSec: number;
    readonly retrySec: number;
    readonly soaEmail: string;
    readonly status: string;
    readonly tags: string[];
    readonly ttlSec: number;
    readonly type: string;
}
