// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Provides information about Linode Database Backups that match a set of filters.
 *
 * ## Example Usage
 *
 * Get information about all backups for a MySQL database:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const all_backups = pulumi.output(linode.getDatabaseBackups({
 *     databaseId: 12345,
 *     databaseType: "mysql",
 * }));
 * ```
 *
 * Get information about all automatic MongoDB Database Backups:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const auto_backups = pulumi.output(linode.getDatabaseBackups({
 *     databaseId: 12345,
 *     databaseType: "mongodb",
 *     filters: [{
 *         name: "type",
 *         values: ["auto"],
 *     }],
 * }));
 * ```
 * ## Attributes
 *
 * Each backup will be stored in the `backups` attribute and will export the following attributes:
 *
 * * `created` - A time value given in a combined date and time format that represents when the database backup was created.
 *
 * * `id` - The ID of the database backup object.
 *
 * * `label` - The database backup’s label, for display purposes only.
 *
 * * `type` - The type of database backup, determined by how the backup was created.
 */
export function getDatabaseBackups(args: GetDatabaseBackupsArgs, opts?: pulumi.InvokeOptions): Promise<GetDatabaseBackupsResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("linode:index/getDatabaseBackups:getDatabaseBackups", {
        "databaseId": args.databaseId,
        "databaseType": args.databaseType,
        "filters": args.filters,
        "latest": args.latest,
        "order": args.order,
        "orderBy": args.orderBy,
    }, opts);
}

/**
 * A collection of arguments for invoking getDatabaseBackups.
 */
export interface GetDatabaseBackupsArgs {
    /**
     * The ID of the database to retrieve backups for.
     */
    databaseId: number;
    /**
     * The type of the database to retrieve backups for. (`mysql`, `mongodb`, `postgresql`)
     */
    databaseType: string;
    filters?: inputs.GetDatabaseBackupsFilter[];
    /**
     * If true, only the latest backup will be returned.
     */
    latest?: boolean;
    /**
     * The order in which results should be returned. (`asc`, `desc`; default `asc`)
     */
    order?: string;
    /**
     * The attribute to order the results by. (`created`)
     */
    orderBy?: string;
}

/**
 * A collection of values returned by getDatabaseBackups.
 */
export interface GetDatabaseBackupsResult {
    readonly backups: outputs.GetDatabaseBackupsBackup[];
    readonly databaseId: number;
    readonly databaseType: string;
    readonly filters?: outputs.GetDatabaseBackupsFilter[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly latest?: boolean;
    readonly order?: string;
    readonly orderBy?: string;
}

export function getDatabaseBackupsOutput(args: GetDatabaseBackupsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetDatabaseBackupsResult> {
    return pulumi.output(args).apply(a => getDatabaseBackups(a, opts))
}

/**
 * A collection of arguments for invoking getDatabaseBackups.
 */
export interface GetDatabaseBackupsOutputArgs {
    /**
     * The ID of the database to retrieve backups for.
     */
    databaseId: pulumi.Input<number>;
    /**
     * The type of the database to retrieve backups for. (`mysql`, `mongodb`, `postgresql`)
     */
    databaseType: pulumi.Input<string>;
    filters?: pulumi.Input<pulumi.Input<inputs.GetDatabaseBackupsFilterArgs>[]>;
    /**
     * If true, only the latest backup will be returned.
     */
    latest?: pulumi.Input<boolean>;
    /**
     * The order in which results should be returned. (`asc`, `desc`; default `asc`)
     */
    order?: pulumi.Input<string>;
    /**
     * The attribute to order the results by. (`created`)
     */
    orderBy?: pulumi.Input<string>;
}
