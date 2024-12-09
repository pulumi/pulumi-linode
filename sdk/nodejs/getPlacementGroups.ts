// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides information about a list of Linode Placement Groups that match a set of filters.
 * For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-placement-groups).
 *
 * ## Example Usage
 *
 * The following example shows how one might use this data source to list Placement Groups.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * export = async () => {
 *     const all = await linode.getPlacementGroups({});
 *     const filtered = await linode.getPlacementGroups({
 *         filters: [{
 *             name: "label",
 *             values: ["my-label"],
 *         }],
 *     });
 *     return {
 *         "all-pgs": all.placementGroups,
 *         "filtered-pgs": filtered.placementGroups,
 *     };
 * }
 * ```
 *
 * ## Filterable Fields
 *
 * * `id`
 *
 * * `label`
 *
 * * `region`
 *
 * * `placementGroupType`
 *
 * * `placementGroupPolicy`
 *
 * * `isCompliant`
 */
export function getPlacementGroups(args?: GetPlacementGroupsArgs, opts?: pulumi.InvokeOptions): Promise<GetPlacementGroupsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("linode:index/getPlacementGroups:getPlacementGroups", {
        "filters": args.filters,
        "order": args.order,
        "orderBy": args.orderBy,
        "placementGroups": args.placementGroups,
    }, opts);
}

/**
 * A collection of arguments for invoking getPlacementGroups.
 */
export interface GetPlacementGroupsArgs {
    filters?: inputs.GetPlacementGroupsFilter[];
    order?: string;
    orderBy?: string;
    placementGroups?: inputs.GetPlacementGroupsPlacementGroup[];
}

/**
 * A collection of values returned by getPlacementGroups.
 */
export interface GetPlacementGroupsResult {
    readonly filters?: outputs.GetPlacementGroupsFilter[];
    readonly id: string;
    readonly order?: string;
    readonly orderBy?: string;
    readonly placementGroups?: outputs.GetPlacementGroupsPlacementGroup[];
}
/**
 * Provides information about a list of Linode Placement Groups that match a set of filters.
 * For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-placement-groups).
 *
 * ## Example Usage
 *
 * The following example shows how one might use this data source to list Placement Groups.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * export = async () => {
 *     const all = await linode.getPlacementGroups({});
 *     const filtered = await linode.getPlacementGroups({
 *         filters: [{
 *             name: "label",
 *             values: ["my-label"],
 *         }],
 *     });
 *     return {
 *         "all-pgs": all.placementGroups,
 *         "filtered-pgs": filtered.placementGroups,
 *     };
 * }
 * ```
 *
 * ## Filterable Fields
 *
 * * `id`
 *
 * * `label`
 *
 * * `region`
 *
 * * `placementGroupType`
 *
 * * `placementGroupPolicy`
 *
 * * `isCompliant`
 */
export function getPlacementGroupsOutput(args?: GetPlacementGroupsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetPlacementGroupsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("linode:index/getPlacementGroups:getPlacementGroups", {
        "filters": args.filters,
        "order": args.order,
        "orderBy": args.orderBy,
        "placementGroups": args.placementGroups,
    }, opts);
}

/**
 * A collection of arguments for invoking getPlacementGroups.
 */
export interface GetPlacementGroupsOutputArgs {
    filters?: pulumi.Input<pulumi.Input<inputs.GetPlacementGroupsFilterArgs>[]>;
    order?: pulumi.Input<string>;
    orderBy?: pulumi.Input<string>;
    placementGroups?: pulumi.Input<pulumi.Input<inputs.GetPlacementGroupsPlacementGroupArgs>[]>;
}
