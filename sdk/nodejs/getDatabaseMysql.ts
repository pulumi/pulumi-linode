// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides information about a Linode MySQL Database.
 *
 * ## updates
 *
 * The following arguments are exported by the `updates` specification block:
 *
 * * `dayOfWeek` - The day to perform maintenance. (`monday`, `tuesday`, ...)
 *
 * * `duration` - The maximum maintenance window time in hours. (`1`..`3`)
 *
 * * `frequency` - Whether maintenance occurs on a weekly or monthly basis. (`weekly`, `monthly`)
 *
 * * `hourOfDay` - The hour to begin maintenance based in UTC time. (`0`..`23`)
 *
 * * `weekOfMonth` - The week of the month to perform monthly frequency updates. Required for `monthly` frequency updates. (`1`..`4`)
 */
export function getDatabaseMysql(args?: GetDatabaseMysqlArgs, opts?: pulumi.InvokeOptions): Promise<GetDatabaseMysqlResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("linode:index/getDatabaseMysql:getDatabaseMysql", {
        "databaseId": args.databaseId,
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getDatabaseMysql.
 */
export interface GetDatabaseMysqlArgs {
    /**
     * The ID of the MySQL database. Deprecated: Use id instead.
     *
     * @deprecated Configure `id` instead. This attribute will be removed in the next major version of the provider.
     */
    databaseId?: number;
    /**
     * The ID of the MySQL database. Mutually exclusive with `databaseId`.
     */
    id?: number;
}

/**
 * A collection of values returned by getDatabaseMysql.
 */
export interface GetDatabaseMysqlResult {
    /**
     * A list of IP addresses that can access the Managed Database. Each item can be a single IP address or a range in CIDR format.
     */
    readonly allowLists: string[];
    /**
     * The base64-encoded SSL CA certificate for the Managed Database instance.
     */
    readonly caCert: string;
    /**
     * The number of Linode Instance nodes deployed to the Managed Database.
     */
    readonly clusterSize: number;
    /**
     * When this Managed Database was created.
     */
    readonly created: string;
    /**
     * @deprecated Configure `id` instead. This attribute will be removed in the next major version of the provider.
     */
    readonly databaseId?: number;
    /**
     * Whether the Managed Databases is encrypted.
     */
    readonly encrypted: boolean;
    /**
     * The Managed Database engine. (e.g. `mysql`)
     */
    readonly engine: string;
    /**
     * The Managed Database engine in engine/version format. (e.g. `mysql/8.0.30`)
     */
    readonly engineId: string;
    /**
     * The primary host for the Managed Database.
     */
    readonly hostPrimary: string;
    /**
     * The secondary/private network host for the Managed Database.
     */
    readonly hostSecondary: string;
    readonly id?: number;
    /**
     * A unique, user-defined string referring to the Managed Database.
     */
    readonly label: string;
    /**
     * The region that hosts this Linode Managed Database.
     */
    readonly region: string;
    /**
     * The replication method used for the Managed Database. (`none`, `asynch`, `semiSynch`)
     */
    readonly replicationType: string;
    /**
     * The randomly-generated root password for the Managed Database instance.
     */
    readonly rootPassword: string;
    /**
     * The root username for the Managed Database instance.
     */
    readonly rootUsername: string;
    /**
     * Whether to require SSL credentials to establish a connection to the Managed Database.
     */
    readonly sslConnection: boolean;
    /**
     * The operating status of the Managed Database.
     */
    readonly status: string;
    /**
     * The Linode Instance type used for the nodes of the  Managed Database instance.
     */
    readonly type: string;
    /**
     * When this Managed Database was last updated.
     */
    readonly updated: string;
    readonly updates: outputs.GetDatabaseMysqlUpdate[];
    /**
     * The Managed Database engine version. (e.g. `v8.0.26`)
     */
    readonly version: string;
}
/**
 * Provides information about a Linode MySQL Database.
 *
 * ## updates
 *
 * The following arguments are exported by the `updates` specification block:
 *
 * * `dayOfWeek` - The day to perform maintenance. (`monday`, `tuesday`, ...)
 *
 * * `duration` - The maximum maintenance window time in hours. (`1`..`3`)
 *
 * * `frequency` - Whether maintenance occurs on a weekly or monthly basis. (`weekly`, `monthly`)
 *
 * * `hourOfDay` - The hour to begin maintenance based in UTC time. (`0`..`23`)
 *
 * * `weekOfMonth` - The week of the month to perform monthly frequency updates. Required for `monthly` frequency updates. (`1`..`4`)
 */
export function getDatabaseMysqlOutput(args?: GetDatabaseMysqlOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetDatabaseMysqlResult> {
    return pulumi.output(args).apply((a: any) => getDatabaseMysql(a, opts))
}

/**
 * A collection of arguments for invoking getDatabaseMysql.
 */
export interface GetDatabaseMysqlOutputArgs {
    /**
     * The ID of the MySQL database. Deprecated: Use id instead.
     *
     * @deprecated Configure `id` instead. This attribute will be removed in the next major version of the provider.
     */
    databaseId?: pulumi.Input<number>;
    /**
     * The ID of the MySQL database. Mutually exclusive with `databaseId`.
     */
    id?: pulumi.Input<number>;
}
