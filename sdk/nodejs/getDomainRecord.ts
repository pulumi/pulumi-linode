// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides information about a Linode Domain Record.
 */
export function getDomainRecord(args: GetDomainRecordArgs, opts?: pulumi.InvokeOptions): Promise<GetDomainRecordResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("linode:index/getDomainRecord:getDomainRecord", {
        "domainId": args.domainId,
        "id": args.id,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getDomainRecord.
 */
export interface GetDomainRecordArgs {
    /**
     * The associated domain's unique ID.
     */
    domainId: number;
    /**
     * The unique ID of the Domain Record.
     */
    id?: number;
    /**
     * The name of the Record.
     */
    name?: string;
}

/**
 * A collection of values returned by getDomainRecord.
 */
export interface GetDomainRecordResult {
    /**
     * The associated domain's unique ID.
     */
    readonly domainId: number;
    /**
     * The unique ID of the Domain Record.
     */
    readonly id?: number;
    /**
     * The name of the Record.
     */
    readonly name?: string;
    /**
     * The port this Record points to.
     */
    readonly port: number;
    /**
     * The priority of the target host. Lower values are preferred.
     */
    readonly priority: number;
    /**
     * The protocol this Record's service communicates with. Only valid for SRV records.
     */
    readonly protocol: string;
    /**
     * The service this Record identified. Only valid for SRV records.
     */
    readonly service: string;
    /**
     * The tag portion of a CAA record.
     */
    readonly tag: string;
    /**
     * The target for this Record. This field's actual usage depends on the type of record this represents. For A and AAAA records, this is the address the named Domain should resolve to.
     */
    readonly target: string;
    /**
     * The amount of time in seconds that this Domain's records may be cached by resolvers or other domain servers.
     */
    readonly ttlSec: number;
    /**
     * The type of Record this is in the DNS system. See all record types [here](https://www.linode.com/docs/api/domains/#domain-records-list__responses).
     */
    readonly type: string;
    /**
     * The relative weight of this Record. Higher values are preferred.
     */
    readonly weight: number;
}
/**
 * Provides information about a Linode Domain Record.
 */
export function getDomainRecordOutput(args: GetDomainRecordOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetDomainRecordResult> {
    return pulumi.output(args).apply((a: any) => getDomainRecord(a, opts))
}

/**
 * A collection of arguments for invoking getDomainRecord.
 */
export interface GetDomainRecordOutputArgs {
    /**
     * The associated domain's unique ID.
     */
    domainId: pulumi.Input<number>;
    /**
     * The unique ID of the Domain Record.
     */
    id?: pulumi.Input<number>;
    /**
     * The name of the Record.
     */
    name?: pulumi.Input<string>;
}
