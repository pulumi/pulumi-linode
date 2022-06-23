// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Provides information about Linode Managed Database engines that match a set of filters.
 *
 * ## Attributes
 *
 * Each engine will be stored in the `engines` attribute and will export the following attributes:
 *
 * * `engine` - The Managed Database engine type.
 *
 * * `id` - The Managed Database engine ID in engine/version format.
 *
 * * `version` - The Managed Database engine version.
 */
export function getDatabaseEngines(args?: GetDatabaseEnginesArgs, opts?: pulumi.InvokeOptions): Promise<GetDatabaseEnginesResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("linode:index/getDatabaseEngines:getDatabaseEngines", {
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
    filters?: inputs.GetDatabaseEnginesFilter[];
    /**
     * If true, only the latest engine version will be returned.
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
    readonly engines: outputs.GetDatabaseEnginesEngine[];
    readonly filters?: outputs.GetDatabaseEnginesFilter[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly latest?: boolean;
    readonly order?: string;
    readonly orderBy?: string;
}

export function getDatabaseEnginesOutput(args?: GetDatabaseEnginesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetDatabaseEnginesResult> {
    return pulumi.output(args).apply(a => getDatabaseEngines(a, opts))
}

/**
 * A collection of arguments for invoking getDatabaseEngines.
 */
export interface GetDatabaseEnginesOutputArgs {
    filters?: pulumi.Input<pulumi.Input<inputs.GetDatabaseEnginesFilterArgs>[]>;
    /**
     * If true, only the latest engine version will be returned.
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
