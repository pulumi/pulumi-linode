// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides details about the backups of an Instance.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const my-backups = linode.getInstanceBackups({
 *     linodeId: 123,
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getInstanceBackups(args: GetInstanceBackupsArgs, opts?: pulumi.InvokeOptions): Promise<GetInstanceBackupsResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("linode:index/getInstanceBackups:getInstanceBackups", {
        "linodeId": args.linodeId,
    }, opts);
}

/**
 * A collection of arguments for invoking getInstanceBackups.
 */
export interface GetInstanceBackupsArgs {
    /**
     * The Linode instance's ID.
     */
    linodeId: number;
}

/**
 * A collection of values returned by getInstanceBackups.
 */
export interface GetInstanceBackupsResult {
    readonly automatics: outputs.GetInstanceBackupsAutomatic[];
    readonly currents: outputs.GetInstanceBackupsCurrent[];
    /**
     * The unique ID of this Backup.
     */
    readonly id: number;
    readonly inProgresses: outputs.GetInstanceBackupsInProgress[];
    readonly linodeId: number;
}
/**
 * Provides details about the backups of an Instance.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const my-backups = linode.getInstanceBackups({
 *     linodeId: 123,
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getInstanceBackupsOutput(args: GetInstanceBackupsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetInstanceBackupsResult> {
    return pulumi.output(args).apply((a: any) => getInstanceBackups(a, opts))
}

/**
 * A collection of arguments for invoking getInstanceBackups.
 */
export interface GetInstanceBackupsOutputArgs {
    /**
     * The Linode instance's ID.
     */
    linodeId: pulumi.Input<number>;
}
