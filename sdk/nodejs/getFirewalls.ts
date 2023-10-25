// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides information about Linode Cloud Firewalls that match a set of filters.
 *
 * ## Firewall Rule
 *
 * * `label` - The label of this rule for display purposes only.
 *
 * * `action` - Controls whether traffic is accepted or dropped by this rule (ACCEPT, DROP).
 *
 * * `protocol` - The network protocol this rule controls. (TCP, UDP, ICMP)
 *
 * * `ports` - A string representation of ports and/or port ranges (i.e. "443" or "80-90, 91").
 *
 * * `ipv4` - A list of IPv4 addresses or networks in IP/mask format.
 *
 * * `ipv6` - A list of IPv6 addresses or networks in IP/mask format.
 *
 * ## Firewall Device
 *
 * * `id` - The unique ID of this Firewall Device assignment.
 *
 * * `entityId` - The ID of the underlying entity this device references.
 *
 * * `type` - The type of the assigned entity.
 *
 * * `label` - The label of the assigned entity.
 *
 * * `url` - The URL of the assigned entity.
 *
 * ## Filterable Fields
 *
 * * `id`
 *
 * * `label`
 *
 * * `status`
 *
 * * `tags`
 */
export function getFirewalls(args?: GetFirewallsArgs, opts?: pulumi.InvokeOptions): Promise<GetFirewallsResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("linode:index/getFirewalls:getFirewalls", {
        "filters": args.filters,
        "firewalls": args.firewalls,
        "order": args.order,
        "orderBy": args.orderBy,
    }, opts);
}

/**
 * A collection of arguments for invoking getFirewalls.
 */
export interface GetFirewallsArgs {
    filters?: inputs.GetFirewallsFilter[];
    firewalls?: inputs.GetFirewallsFirewall[];
    /**
     * The order in which results should be returned. (`asc`, `desc`; default `asc`)
     */
    order?: string;
    /**
     * The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
     */
    orderBy?: string;
}

/**
 * A collection of values returned by getFirewalls.
 */
export interface GetFirewallsResult {
    readonly filters?: outputs.GetFirewallsFilter[];
    readonly firewalls?: outputs.GetFirewallsFirewall[];
    /**
     * The unique ID assigned to this Firewall.
     */
    readonly id: string;
    readonly order?: string;
    readonly orderBy?: string;
}
/**
 * Provides information about Linode Cloud Firewalls that match a set of filters.
 *
 * ## Firewall Rule
 *
 * * `label` - The label of this rule for display purposes only.
 *
 * * `action` - Controls whether traffic is accepted or dropped by this rule (ACCEPT, DROP).
 *
 * * `protocol` - The network protocol this rule controls. (TCP, UDP, ICMP)
 *
 * * `ports` - A string representation of ports and/or port ranges (i.e. "443" or "80-90, 91").
 *
 * * `ipv4` - A list of IPv4 addresses or networks in IP/mask format.
 *
 * * `ipv6` - A list of IPv6 addresses or networks in IP/mask format.
 *
 * ## Firewall Device
 *
 * * `id` - The unique ID of this Firewall Device assignment.
 *
 * * `entityId` - The ID of the underlying entity this device references.
 *
 * * `type` - The type of the assigned entity.
 *
 * * `label` - The label of the assigned entity.
 *
 * * `url` - The URL of the assigned entity.
 *
 * ## Filterable Fields
 *
 * * `id`
 *
 * * `label`
 *
 * * `status`
 *
 * * `tags`
 */
export function getFirewallsOutput(args?: GetFirewallsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetFirewallsResult> {
    return pulumi.output(args).apply((a: any) => getFirewalls(a, opts))
}

/**
 * A collection of arguments for invoking getFirewalls.
 */
export interface GetFirewallsOutputArgs {
    filters?: pulumi.Input<pulumi.Input<inputs.GetFirewallsFilterArgs>[]>;
    firewalls?: pulumi.Input<pulumi.Input<inputs.GetFirewallsFirewallArgs>[]>;
    /**
     * The order in which results should be returned. (`asc`, `desc`; default `asc`)
     */
    order?: pulumi.Input<string>;
    /**
     * The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
     */
    orderBy?: pulumi.Input<string>;
}
