// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * > **NOTICE:** This data source has been deprecated in favor of `linode.getDatabaseBackups`.
 *
 * Provides information about Linode MySQL Database Backups that match a set of filters.
 */
export function getDatabaseMysqlBackups(args: GetDatabaseMysqlBackupsArgs, opts?: pulumi.InvokeOptions): Promise<GetDatabaseMysqlBackupsResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("linode:index/getDatabaseMysqlBackups:getDatabaseMysqlBackups", {
        "databaseId": args.databaseId,
        "filters": args.filters,
        "latest": args.latest,
        "order": args.order,
        "orderBy": args.orderBy,
    }, opts);
}

/**
 * A collection of arguments for invoking getDatabaseMysqlBackups.
 */
export interface GetDatabaseMysqlBackupsArgs {
    /**
     * The ID of the database to retrieve backups for.
     */
    databaseId: number;
    filters?: inputs.GetDatabaseMysqlBackupsFilter[];
    /**
     * If true, only the latest backup will be returned.
     *
     * * `filter` - (Optional) A set of filters used to select database backups that meet certain requirements.
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
 * A collection of values returned by getDatabaseMysqlBackups.
 */
export interface GetDatabaseMysqlBackupsResult {
    readonly backups: outputs.GetDatabaseMysqlBackupsBackup[];
    readonly databaseId: number;
    readonly filters?: outputs.GetDatabaseMysqlBackupsFilter[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly latest?: boolean;
    readonly order?: string;
    readonly orderBy?: string;
}
/**
 * > **NOTICE:** This data source has been deprecated in favor of `linode.getDatabaseBackups`.
 *
 * Provides information about Linode MySQL Database Backups that match a set of filters.
 */
export function getDatabaseMysqlBackupsOutput(args: GetDatabaseMysqlBackupsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetDatabaseMysqlBackupsResult> {
    return pulumi.output(args).apply((a: any) => getDatabaseMysqlBackups(a, opts))
}

/**
 * A collection of arguments for invoking getDatabaseMysqlBackups.
 */
export interface GetDatabaseMysqlBackupsOutputArgs {
    /**
     * The ID of the database to retrieve backups for.
     */
    databaseId: pulumi.Input<number>;
    filters?: pulumi.Input<pulumi.Input<inputs.GetDatabaseMysqlBackupsFilterArgs>[]>;
    /**
     * If true, only the latest backup will be returned.
     *
     * * `filter` - (Optional) A set of filters used to select database backups that meet certain requirements.
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
