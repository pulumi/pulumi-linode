// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * `linode.PlacementGroup` provides details about a Linode placement group.
 * For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-placement-group).
 *
 * ## Example Usage
 *
 * The following example shows how the resource might be used to obtain additional information about a Linode placement group.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const pg = linode.getPlacementGroup({
 *     id: 12345,
 * });
 * ```
 */
export function getPlacementGroup(args: GetPlacementGroupArgs, opts?: pulumi.InvokeOptions): Promise<GetPlacementGroupResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("linode:index/getPlacementGroup:getPlacementGroup", {
        "id": args.id,
        "members": args.members,
        "migrations": args.migrations,
    }, opts);
}

/**
 * A collection of arguments for invoking getPlacementGroup.
 */
export interface GetPlacementGroupArgs {
    /**
     * The ID of the Placement Group.
     */
    id: number;
    /**
     * A set of Linodes currently assigned to this Placement Group.
     */
    members?: inputs.GetPlacementGroupMember[];
    /**
     * Any Linodes that are being migrated to or from the placement group.
     */
    migrations?: inputs.GetPlacementGroupMigrations;
}

/**
 * A collection of values returned by getPlacementGroup.
 */
export interface GetPlacementGroupResult {
    readonly id: number;
    /**
     * Whether this Linode is currently compliant with the group's placement group type.
     */
    readonly isCompliant: boolean;
    /**
     * The label of the Placement Group. This field can only contain ASCII letters, digits and dashes.
     */
    readonly label: string;
    /**
     * A set of Linodes currently assigned to this Placement Group.
     */
    readonly members?: outputs.GetPlacementGroupMember[];
    /**
     * Any Linodes that are being migrated to or from the placement group.
     */
    readonly migrations?: outputs.GetPlacementGroupMigrations;
    /**
     * Whether Linodes must be able to become compliant during assignment. (Default `strict`)
     */
    readonly placementGroupPolicy: string;
    /**
     * The placement group type to use when placing Linodes in this group.
     */
    readonly placementGroupType: string;
    /**
     * The region of the Placement Group.
     */
    readonly region: string;
}
/**
 * `linode.PlacementGroup` provides details about a Linode placement group.
 * For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-placement-group).
 *
 * ## Example Usage
 *
 * The following example shows how the resource might be used to obtain additional information about a Linode placement group.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const pg = linode.getPlacementGroup({
 *     id: 12345,
 * });
 * ```
 */
export function getPlacementGroupOutput(args: GetPlacementGroupOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetPlacementGroupResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("linode:index/getPlacementGroup:getPlacementGroup", {
        "id": args.id,
        "members": args.members,
        "migrations": args.migrations,
    }, opts);
}

/**
 * A collection of arguments for invoking getPlacementGroup.
 */
export interface GetPlacementGroupOutputArgs {
    /**
     * The ID of the Placement Group.
     */
    id: pulumi.Input<number>;
    /**
     * A set of Linodes currently assigned to this Placement Group.
     */
    members?: pulumi.Input<pulumi.Input<inputs.GetPlacementGroupMemberArgs>[]>;
    /**
     * Any Linodes that are being migrated to or from the placement group.
     */
    migrations?: pulumi.Input<inputs.GetPlacementGroupMigrationsArgs>;
}
