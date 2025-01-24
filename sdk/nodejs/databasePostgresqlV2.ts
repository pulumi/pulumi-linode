// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a Linode PostgreSQL Database resource. This can be used to create, modify, and delete Linode PostgreSQL Databases.
 * For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/post-databases-postgre-sql-instances).
 *
 * Please keep in mind that Managed Databases can take up to half an hour to provision.
 *
 * ## Example Usage
 *
 * Creating a simple PostgreSQL database that does not allow connections:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const foobar = new linode.DatabasePostgresqlV2("foobar", {
 *     label: "mydatabase",
 *     engineId: "postgresql/16",
 *     region: "us-mia",
 *     type: "g6-nanode-1",
 * });
 * ```
 *
 * Creating a simple PostgreSQL database that allows connections from all IPv4 addresses:
 *
 * ## Import
 *
 * Linode PostgreSQL Databases can be imported using the `id`, e.g.
 *
 * ```sh
 * $ pulumi import linode:index/databasePostgresqlV2:DatabasePostgresqlV2 foobar 1234567
 * ```
 */
export class DatabasePostgresqlV2 extends pulumi.CustomResource {
    /**
     * Get an existing DatabasePostgresqlV2 resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DatabasePostgresqlV2State, opts?: pulumi.CustomResourceOptions): DatabasePostgresqlV2 {
        return new DatabasePostgresqlV2(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'linode:index/databasePostgresqlV2:DatabasePostgresqlV2';

    /**
     * Returns true if the given object is an instance of DatabasePostgresqlV2.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DatabasePostgresqlV2 {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DatabasePostgresqlV2.__pulumiType;
    }

    /**
     * A list of IP addresses that can access the Managed Database. Each item can be a single IP address or a range in CIDR format. Use `linode.DatabaseAccessControls` to manage your allow list separately.
     */
    public readonly allowLists!: pulumi.Output<string[]>;
    /**
     * The base64-encoded SSL CA certificate for the Managed Database.
     */
    public /*out*/ readonly caCert!: pulumi.Output<string>;
    /**
     * The number of Linode Instance nodes deployed to the Managed Database. (default `1`)
     */
    public readonly clusterSize!: pulumi.Output<number>;
    /**
     * When this Managed Database was created.
     */
    public /*out*/ readonly created!: pulumi.Output<string>;
    /**
     * Whether the Managed Databases is encrypted.
     */
    public /*out*/ readonly encrypted!: pulumi.Output<boolean>;
    /**
     * The Managed Database engine. (e.g. `postgresql`)
     */
    public /*out*/ readonly engine!: pulumi.Output<string>;
    /**
     * The Managed Database engine in engine/version format. (e.g. `postgresql/16`)
     */
    public readonly engineId!: pulumi.Output<string>;
    /**
     * The database timestamp from which it was restored.
     */
    public readonly forkRestoreTime!: pulumi.Output<string>;
    /**
     * The ID of the database that was forked from.
     *
     * * `updates` - (Optional) Configuration settings for automated patch update maintenance for the Managed Database.
     */
    public readonly forkSource!: pulumi.Output<number | undefined>;
    /**
     * The primary host for the Managed Database.
     */
    public /*out*/ readonly hostPrimary!: pulumi.Output<string>;
    /**
     * The secondary/private host for the managed database.
     */
    public /*out*/ readonly hostSecondary!: pulumi.Output<string>;
    /**
     * A unique, user-defined string referring to the Managed Database.
     */
    public readonly label!: pulumi.Output<string>;
    /**
     * A mapping between IP addresses and strings designating them as primary or failover.
     */
    public /*out*/ readonly members!: pulumi.Output<{[key: string]: string}>;
    /**
     * The oldest time to which a database can be restored.
     */
    public /*out*/ readonly oldestRestoreTime!: pulumi.Output<string>;
    /**
     * A set of pending updates.
     */
    public /*out*/ readonly pendingUpdates!: pulumi.Output<outputs.DatabasePostgresqlV2PendingUpdate[]>;
    /**
     * The back-end platform for relational databases used by the service.
     */
    public /*out*/ readonly platform!: pulumi.Output<string>;
    /**
     * The access port for this Managed Database.
     */
    public /*out*/ readonly port!: pulumi.Output<number>;
    /**
     * The region to use for the Managed Database.
     */
    public readonly region!: pulumi.Output<string>;
    /**
     * The randomly-generated root password for the Managed Database instance.
     */
    public /*out*/ readonly rootPassword!: pulumi.Output<string>;
    /**
     * The root username for the Managed Database instance.
     */
    public /*out*/ readonly rootUsername!: pulumi.Output<string>;
    /**
     * Whether to require SSL credentials to establish a connection to the Managed Database.
     */
    public /*out*/ readonly sslConnection!: pulumi.Output<boolean>;
    /**
     * The operating status of the Managed Database.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    public readonly timeouts!: pulumi.Output<outputs.DatabasePostgresqlV2Timeouts | undefined>;
    /**
     * The Linode Instance type used for the nodes of the Managed Database.
     *
     * - - -
     */
    public readonly type!: pulumi.Output<string>;
    /**
     * When this Managed Database was last updated.
     */
    public /*out*/ readonly updated!: pulumi.Output<string>;
    /**
     * Configuration settings for automated patch update maintenance for the Managed Database.
     */
    public readonly updates!: pulumi.Output<outputs.DatabasePostgresqlV2Updates>;
    /**
     * The Managed Database engine version. (e.g. `13.2`)
     */
    public /*out*/ readonly version!: pulumi.Output<string>;

    /**
     * Create a DatabasePostgresqlV2 resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DatabasePostgresqlV2Args, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DatabasePostgresqlV2Args | DatabasePostgresqlV2State, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DatabasePostgresqlV2State | undefined;
            resourceInputs["allowLists"] = state ? state.allowLists : undefined;
            resourceInputs["caCert"] = state ? state.caCert : undefined;
            resourceInputs["clusterSize"] = state ? state.clusterSize : undefined;
            resourceInputs["created"] = state ? state.created : undefined;
            resourceInputs["encrypted"] = state ? state.encrypted : undefined;
            resourceInputs["engine"] = state ? state.engine : undefined;
            resourceInputs["engineId"] = state ? state.engineId : undefined;
            resourceInputs["forkRestoreTime"] = state ? state.forkRestoreTime : undefined;
            resourceInputs["forkSource"] = state ? state.forkSource : undefined;
            resourceInputs["hostPrimary"] = state ? state.hostPrimary : undefined;
            resourceInputs["hostSecondary"] = state ? state.hostSecondary : undefined;
            resourceInputs["label"] = state ? state.label : undefined;
            resourceInputs["members"] = state ? state.members : undefined;
            resourceInputs["oldestRestoreTime"] = state ? state.oldestRestoreTime : undefined;
            resourceInputs["pendingUpdates"] = state ? state.pendingUpdates : undefined;
            resourceInputs["platform"] = state ? state.platform : undefined;
            resourceInputs["port"] = state ? state.port : undefined;
            resourceInputs["region"] = state ? state.region : undefined;
            resourceInputs["rootPassword"] = state ? state.rootPassword : undefined;
            resourceInputs["rootUsername"] = state ? state.rootUsername : undefined;
            resourceInputs["sslConnection"] = state ? state.sslConnection : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["timeouts"] = state ? state.timeouts : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["updated"] = state ? state.updated : undefined;
            resourceInputs["updates"] = state ? state.updates : undefined;
            resourceInputs["version"] = state ? state.version : undefined;
        } else {
            const args = argsOrState as DatabasePostgresqlV2Args | undefined;
            if ((!args || args.engineId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'engineId'");
            }
            if ((!args || args.label === undefined) && !opts.urn) {
                throw new Error("Missing required property 'label'");
            }
            if ((!args || args.region === undefined) && !opts.urn) {
                throw new Error("Missing required property 'region'");
            }
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            resourceInputs["allowLists"] = args ? args.allowLists : undefined;
            resourceInputs["clusterSize"] = args ? args.clusterSize : undefined;
            resourceInputs["engineId"] = args ? args.engineId : undefined;
            resourceInputs["forkRestoreTime"] = args ? args.forkRestoreTime : undefined;
            resourceInputs["forkSource"] = args ? args.forkSource : undefined;
            resourceInputs["label"] = args ? args.label : undefined;
            resourceInputs["region"] = args ? args.region : undefined;
            resourceInputs["timeouts"] = args ? args.timeouts : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["updates"] = args ? args.updates : undefined;
            resourceInputs["caCert"] = undefined /*out*/;
            resourceInputs["created"] = undefined /*out*/;
            resourceInputs["encrypted"] = undefined /*out*/;
            resourceInputs["engine"] = undefined /*out*/;
            resourceInputs["hostPrimary"] = undefined /*out*/;
            resourceInputs["hostSecondary"] = undefined /*out*/;
            resourceInputs["members"] = undefined /*out*/;
            resourceInputs["oldestRestoreTime"] = undefined /*out*/;
            resourceInputs["pendingUpdates"] = undefined /*out*/;
            resourceInputs["platform"] = undefined /*out*/;
            resourceInputs["port"] = undefined /*out*/;
            resourceInputs["rootPassword"] = undefined /*out*/;
            resourceInputs["rootUsername"] = undefined /*out*/;
            resourceInputs["sslConnection"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
            resourceInputs["updated"] = undefined /*out*/;
            resourceInputs["version"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["caCert", "rootPassword", "rootUsername"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(DatabasePostgresqlV2.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DatabasePostgresqlV2 resources.
 */
export interface DatabasePostgresqlV2State {
    /**
     * A list of IP addresses that can access the Managed Database. Each item can be a single IP address or a range in CIDR format. Use `linode.DatabaseAccessControls` to manage your allow list separately.
     */
    allowLists?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The base64-encoded SSL CA certificate for the Managed Database.
     */
    caCert?: pulumi.Input<string>;
    /**
     * The number of Linode Instance nodes deployed to the Managed Database. (default `1`)
     */
    clusterSize?: pulumi.Input<number>;
    /**
     * When this Managed Database was created.
     */
    created?: pulumi.Input<string>;
    /**
     * Whether the Managed Databases is encrypted.
     */
    encrypted?: pulumi.Input<boolean>;
    /**
     * The Managed Database engine. (e.g. `postgresql`)
     */
    engine?: pulumi.Input<string>;
    /**
     * The Managed Database engine in engine/version format. (e.g. `postgresql/16`)
     */
    engineId?: pulumi.Input<string>;
    /**
     * The database timestamp from which it was restored.
     */
    forkRestoreTime?: pulumi.Input<string>;
    /**
     * The ID of the database that was forked from.
     *
     * * `updates` - (Optional) Configuration settings for automated patch update maintenance for the Managed Database.
     */
    forkSource?: pulumi.Input<number>;
    /**
     * The primary host for the Managed Database.
     */
    hostPrimary?: pulumi.Input<string>;
    /**
     * The secondary/private host for the managed database.
     */
    hostSecondary?: pulumi.Input<string>;
    /**
     * A unique, user-defined string referring to the Managed Database.
     */
    label?: pulumi.Input<string>;
    /**
     * A mapping between IP addresses and strings designating them as primary or failover.
     */
    members?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The oldest time to which a database can be restored.
     */
    oldestRestoreTime?: pulumi.Input<string>;
    /**
     * A set of pending updates.
     */
    pendingUpdates?: pulumi.Input<pulumi.Input<inputs.DatabasePostgresqlV2PendingUpdate>[]>;
    /**
     * The back-end platform for relational databases used by the service.
     */
    platform?: pulumi.Input<string>;
    /**
     * The access port for this Managed Database.
     */
    port?: pulumi.Input<number>;
    /**
     * The region to use for the Managed Database.
     */
    region?: pulumi.Input<string>;
    /**
     * The randomly-generated root password for the Managed Database instance.
     */
    rootPassword?: pulumi.Input<string>;
    /**
     * The root username for the Managed Database instance.
     */
    rootUsername?: pulumi.Input<string>;
    /**
     * Whether to require SSL credentials to establish a connection to the Managed Database.
     */
    sslConnection?: pulumi.Input<boolean>;
    /**
     * The operating status of the Managed Database.
     */
    status?: pulumi.Input<string>;
    timeouts?: pulumi.Input<inputs.DatabasePostgresqlV2Timeouts>;
    /**
     * The Linode Instance type used for the nodes of the Managed Database.
     *
     * - - -
     */
    type?: pulumi.Input<string>;
    /**
     * When this Managed Database was last updated.
     */
    updated?: pulumi.Input<string>;
    /**
     * Configuration settings for automated patch update maintenance for the Managed Database.
     */
    updates?: pulumi.Input<inputs.DatabasePostgresqlV2Updates>;
    /**
     * The Managed Database engine version. (e.g. `13.2`)
     */
    version?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a DatabasePostgresqlV2 resource.
 */
export interface DatabasePostgresqlV2Args {
    /**
     * A list of IP addresses that can access the Managed Database. Each item can be a single IP address or a range in CIDR format. Use `linode.DatabaseAccessControls` to manage your allow list separately.
     */
    allowLists?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The number of Linode Instance nodes deployed to the Managed Database. (default `1`)
     */
    clusterSize?: pulumi.Input<number>;
    /**
     * The Managed Database engine in engine/version format. (e.g. `postgresql/16`)
     */
    engineId: pulumi.Input<string>;
    /**
     * The database timestamp from which it was restored.
     */
    forkRestoreTime?: pulumi.Input<string>;
    /**
     * The ID of the database that was forked from.
     *
     * * `updates` - (Optional) Configuration settings for automated patch update maintenance for the Managed Database.
     */
    forkSource?: pulumi.Input<number>;
    /**
     * A unique, user-defined string referring to the Managed Database.
     */
    label: pulumi.Input<string>;
    /**
     * The region to use for the Managed Database.
     */
    region: pulumi.Input<string>;
    timeouts?: pulumi.Input<inputs.DatabasePostgresqlV2Timeouts>;
    /**
     * The Linode Instance type used for the nodes of the Managed Database.
     *
     * - - -
     */
    type: pulumi.Input<string>;
    /**
     * Configuration settings for automated patch update maintenance for the Managed Database.
     */
    updates?: pulumi.Input<inputs.DatabasePostgresqlV2Updates>;
}
