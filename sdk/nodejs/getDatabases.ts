// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides information about Linode Managed Databases that match a set of filters.
 *
 * ## Example Usage
 *
 * Get information about all Linode Managed Databases:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const all = linode.getDatabases({});
 * export const databaseIds = all.then(all => all.databases.map(__item => __item.id));
 * ```
 *
 * Get information about all Linode MySQL Databases:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const mysql = linode.getDatabases({
 *     filters: [{
 *         name: "engine",
 *         values: ["mysql"],
 *     }],
 * });
 * export const databaseIds = mysql.then(mysql => mysql.databases.map(__item => __item.id));
 * ```
 */
export function getDatabases(args?: GetDatabasesArgs, opts?: pulumi.InvokeOptions): Promise<GetDatabasesResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("linode:index/getDatabases:getDatabases", {
        "filters": args.filters,
        "latest": args.latest,
        "order": args.order,
        "orderBy": args.orderBy,
    }, opts);
}

/**
 * A collection of arguments for invoking getDatabases.
 */
export interface GetDatabasesArgs {
    filters?: inputs.GetDatabasesFilter[];
    /**
     * If true, only the latest create database will be returned.
     *
     * * `filter` - (Optional) A set of filters used to select databases that meet certain requirements.
     */
    latest?: boolean;
    /**
     * The order in which results should be returned. (`asc`, `desc`; default `asc`)
     */
    order?: string;
    /**
     * The attribute to order the results by. (`version`)
     */
    orderBy?: string;
}

/**
 * A collection of values returned by getDatabases.
 */
export interface GetDatabasesResult {
    readonly databases: outputs.GetDatabasesDatabase[];
    readonly filters?: outputs.GetDatabasesFilter[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly latest?: boolean;
    readonly order?: string;
    readonly orderBy?: string;
}
/**
 * Provides information about Linode Managed Databases that match a set of filters.
 *
 * ## Example Usage
 *
 * Get information about all Linode Managed Databases:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const all = linode.getDatabases({});
 * export const databaseIds = all.then(all => all.databases.map(__item => __item.id));
 * ```
 *
 * Get information about all Linode MySQL Databases:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const mysql = linode.getDatabases({
 *     filters: [{
 *         name: "engine",
 *         values: ["mysql"],
 *     }],
 * });
 * export const databaseIds = mysql.then(mysql => mysql.databases.map(__item => __item.id));
 * ```
 */
export function getDatabasesOutput(args?: GetDatabasesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetDatabasesResult> {
    return pulumi.output(args).apply((a: any) => getDatabases(a, opts))
}

/**
 * A collection of arguments for invoking getDatabases.
 */
export interface GetDatabasesOutputArgs {
    filters?: pulumi.Input<pulumi.Input<inputs.GetDatabasesFilterArgs>[]>;
    /**
     * If true, only the latest create database will be returned.
     *
     * * `filter` - (Optional) A set of filters used to select databases that meet certain requirements.
     */
    latest?: pulumi.Input<boolean>;
    /**
     * The order in which results should be returned. (`asc`, `desc`; default `asc`)
     */
    order?: pulumi.Input<string>;
    /**
     * The attribute to order the results by. (`version`)
     */
    orderBy?: pulumi.Input<string>;
}
