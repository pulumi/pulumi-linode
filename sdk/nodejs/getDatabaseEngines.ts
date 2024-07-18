// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides information about Linode Managed Database engines that match a set of filters.
 * For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-databases-engines).
 *
 * ## Example Usage
 *
 * Get information about all Linode Managed Database engines:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const all = linode.getDatabaseEngines({});
 * export const engineIds = all.then(all => all.engines.map(__item => __item.id));
 * ```
 *
 * Get information about all Linode MySQL Database engines:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const mysql = linode.getDatabaseEngines({
 *     filters: [{
 *         name: "engine",
 *         values: ["mysql"],
 *     }],
 * });
 * export const engineIds = mysql.then(mysql => mysql.engines.map(__item => __item.id));
 * ```
 *
 * Create a Linode MySQL Database using the latest support MySQL version:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const mysql = linode.getDatabaseEngines({
 *     latest: true,
 *     filters: [{
 *         name: "engine",
 *         values: ["mysql"],
 *     }],
 * });
 * const myDb = new linode.DatabaseMysql("my_db", {
 *     label: "mydb",
 *     engineId: mysql.then(mysql => mysql.engines?.[0]?.id),
 *     region: "us-southeast",
 *     type: "g6-nanode-1",
 * });
 * ```
 */
export function getDatabaseEngines(args?: GetDatabaseEnginesArgs, opts?: pulumi.InvokeOptions): Promise<GetDatabaseEnginesResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("linode:index/getDatabaseEngines:getDatabaseEngines", {
        "engines": args.engines,
        "filters": args.filters,
        "latest": args.latest,
        "order": args.order,
        "orderBy": args.orderBy,
    }, opts);
}

/**
 * A collection of arguments for invoking getDatabaseEngines.
 */
export interface GetDatabaseEnginesArgs {
    engines?: inputs.GetDatabaseEnginesEngine[];
    filters?: inputs.GetDatabaseEnginesFilter[];
    /**
     * If true, only the latest engine version will be returned.
     *
     * * `filter` - (Optional) A set of filters used to select engines that meet certain requirements.
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
 * A collection of values returned by getDatabaseEngines.
 */
export interface GetDatabaseEnginesResult {
    readonly engines?: outputs.GetDatabaseEnginesEngine[];
    readonly filters?: outputs.GetDatabaseEnginesFilter[];
    /**
     * The Managed Database engine ID in engine/version format.
     */
    readonly id: string;
    readonly latest?: boolean;
    readonly order?: string;
    readonly orderBy?: string;
}
/**
 * Provides information about Linode Managed Database engines that match a set of filters.
 * For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-databases-engines).
 *
 * ## Example Usage
 *
 * Get information about all Linode Managed Database engines:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const all = linode.getDatabaseEngines({});
 * export const engineIds = all.then(all => all.engines.map(__item => __item.id));
 * ```
 *
 * Get information about all Linode MySQL Database engines:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const mysql = linode.getDatabaseEngines({
 *     filters: [{
 *         name: "engine",
 *         values: ["mysql"],
 *     }],
 * });
 * export const engineIds = mysql.then(mysql => mysql.engines.map(__item => __item.id));
 * ```
 *
 * Create a Linode MySQL Database using the latest support MySQL version:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const mysql = linode.getDatabaseEngines({
 *     latest: true,
 *     filters: [{
 *         name: "engine",
 *         values: ["mysql"],
 *     }],
 * });
 * const myDb = new linode.DatabaseMysql("my_db", {
 *     label: "mydb",
 *     engineId: mysql.then(mysql => mysql.engines?.[0]?.id),
 *     region: "us-southeast",
 *     type: "g6-nanode-1",
 * });
 * ```
 */
export function getDatabaseEnginesOutput(args?: GetDatabaseEnginesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetDatabaseEnginesResult> {
    return pulumi.output(args).apply((a: any) => getDatabaseEngines(a, opts))
}

/**
 * A collection of arguments for invoking getDatabaseEngines.
 */
export interface GetDatabaseEnginesOutputArgs {
    engines?: pulumi.Input<pulumi.Input<inputs.GetDatabaseEnginesEngineArgs>[]>;
    filters?: pulumi.Input<pulumi.Input<inputs.GetDatabaseEnginesFilterArgs>[]>;
    /**
     * If true, only the latest engine version will be returned.
     *
     * * `filter` - (Optional) A set of filters used to select engines that meet certain requirements.
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
