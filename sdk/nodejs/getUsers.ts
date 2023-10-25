// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides information about Linode users that match a set of filters.
 *
 * ## Filterable Fields
 *
 * * `username`
 *
 * * `email`
 *
 * * `restricted`
 *
 * * `passwordCreated`
 *
 * * `tfaEnabled`
 *
 * * `verfiedPhoneNumber`
 */
export function getUsers(args?: GetUsersArgs, opts?: pulumi.InvokeOptions): Promise<GetUsersResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("linode:index/getUsers:getUsers", {
        "filters": args.filters,
        "order": args.order,
        "orderBy": args.orderBy,
        "users": args.users,
    }, opts);
}

/**
 * A collection of arguments for invoking getUsers.
 */
export interface GetUsersArgs {
    filters?: inputs.GetUsersFilter[];
    /**
     * The order in which results should be returned. (`asc`, `desc`; default `asc`)
     */
    order?: string;
    /**
     * The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
     */
    orderBy?: string;
    users?: inputs.GetUsersUser[];
}

/**
 * A collection of values returned by getUsers.
 */
export interface GetUsersResult {
    readonly filters?: outputs.GetUsersFilter[];
    /**
     * The ID of entity this grant applies to.
     */
    readonly id: string;
    readonly order?: string;
    readonly orderBy?: string;
    readonly users?: outputs.GetUsersUser[];
}
/**
 * Provides information about Linode users that match a set of filters.
 *
 * ## Filterable Fields
 *
 * * `username`
 *
 * * `email`
 *
 * * `restricted`
 *
 * * `passwordCreated`
 *
 * * `tfaEnabled`
 *
 * * `verfiedPhoneNumber`
 */
export function getUsersOutput(args?: GetUsersOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetUsersResult> {
    return pulumi.output(args).apply((a: any) => getUsers(a, opts))
}

/**
 * A collection of arguments for invoking getUsers.
 */
export interface GetUsersOutputArgs {
    filters?: pulumi.Input<pulumi.Input<inputs.GetUsersFilterArgs>[]>;
    /**
     * The order in which results should be returned. (`asc`, `desc`; default `asc`)
     */
    order?: pulumi.Input<string>;
    /**
     * The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
     */
    orderBy?: pulumi.Input<string>;
    users?: pulumi.Input<pulumi.Input<inputs.GetUsersUserArgs>[]>;
}
