// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides information about a Linode Domain Zonefile.
 *
 * ## Example Usage
 *
 * The following example shows how one might use this data source to access information about a Linode Domain Zonefile.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const myZonefile = pulumi.output(linode.getDomainZonefile({
 *     domainId: 3150401,
 * }));
 * ```
 */
export function getDomainZonefile(args: GetDomainZonefileArgs, opts?: pulumi.InvokeOptions): Promise<GetDomainZonefileResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("linode:index/getDomainZonefile:getDomainZonefile", {
        "domainId": args.domainId,
        "zoneFiles": args.zoneFiles,
    }, opts);
}

/**
 * A collection of arguments for invoking getDomainZonefile.
 */
export interface GetDomainZonefileArgs {
    /**
     * The associated domain's unique ID.
     */
    domainId: number;
    /**
     * Array of strings representing the Domain Zonefile.
     */
    zoneFiles?: string[];
}

/**
 * A collection of values returned by getDomainZonefile.
 */
export interface GetDomainZonefileResult {
    /**
     * The associated domain's unique ID.
     */
    readonly domainId: number;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Array of strings representing the Domain Zonefile.
     */
    readonly zoneFiles?: string[];
}

export function getDomainZonefileOutput(args: GetDomainZonefileOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetDomainZonefileResult> {
    return pulumi.output(args).apply(a => getDomainZonefile(a, opts))
}

/**
 * A collection of arguments for invoking getDomainZonefile.
 */
export interface GetDomainZonefileOutputArgs {
    /**
     * The associated domain's unique ID.
     */
    domainId: pulumi.Input<number>;
    /**
     * Array of strings representing the Domain Zonefile.
     */
    zoneFiles?: pulumi.Input<pulumi.Input<string>[]>;
}
