// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Manages the access control for a Linode Database. Only one `linode.DatabaseAccessControls` resource should be defined per-database.
 *
 * ## Example Usage
 *
 * Grant a Linode access to a database:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const my_instance = new linode.Instance("my-instance", {
 *     label: "myinstance",
 *     region: "us-southeast",
 *     type: "g6-nanode-1",
 *     image: "linode/alpine3.19",
 * });
 * const my_db = new linode.DatabaseMysql("my-db", {
 *     label: "mydatabase",
 *     engineId: "mysql/8.0.30",
 *     region: "us-southeast",
 *     type: "g6-nanode-1",
 * });
 * const my_access = new linode.DatabaseAccessControls("my-access", {
 *     databaseId: my_db.id,
 *     databaseType: "mysql",
 *     allowLists: [my_instance.ipAddress],
 * });
 * ```
 */
export class DatabaseAccessControls extends pulumi.CustomResource {
    /**
     * Get an existing DatabaseAccessControls resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DatabaseAccessControlsState, opts?: pulumi.CustomResourceOptions): DatabaseAccessControls {
        return new DatabaseAccessControls(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'linode:index/databaseAccessControls:DatabaseAccessControls';

    /**
     * Returns true if the given object is an instance of DatabaseAccessControls.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DatabaseAccessControls {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DatabaseAccessControls.__pulumiType;
    }

    /**
     * A list of IP addresses that can access the Managed Database. Each item can be a single IP address or a range in CIDR format.
     */
    public readonly allowLists!: pulumi.Output<string[]>;
    /**
     * The unique ID of the target database.
     */
    public readonly databaseId!: pulumi.Output<number>;
    /**
     * The unique type of the target database. (`mysql`, `mongodb`, `postgresql`)
     */
    public readonly databaseType!: pulumi.Output<string>;

    /**
     * Create a DatabaseAccessControls resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DatabaseAccessControlsArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DatabaseAccessControlsArgs | DatabaseAccessControlsState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DatabaseAccessControlsState | undefined;
            resourceInputs["allowLists"] = state ? state.allowLists : undefined;
            resourceInputs["databaseId"] = state ? state.databaseId : undefined;
            resourceInputs["databaseType"] = state ? state.databaseType : undefined;
        } else {
            const args = argsOrState as DatabaseAccessControlsArgs | undefined;
            if ((!args || args.allowLists === undefined) && !opts.urn) {
                throw new Error("Missing required property 'allowLists'");
            }
            if ((!args || args.databaseId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'databaseId'");
            }
            if ((!args || args.databaseType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'databaseType'");
            }
            resourceInputs["allowLists"] = args ? args.allowLists : undefined;
            resourceInputs["databaseId"] = args ? args.databaseId : undefined;
            resourceInputs["databaseType"] = args ? args.databaseType : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(DatabaseAccessControls.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DatabaseAccessControls resources.
 */
export interface DatabaseAccessControlsState {
    /**
     * A list of IP addresses that can access the Managed Database. Each item can be a single IP address or a range in CIDR format.
     */
    allowLists?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The unique ID of the target database.
     */
    databaseId?: pulumi.Input<number>;
    /**
     * The unique type of the target database. (`mysql`, `mongodb`, `postgresql`)
     */
    databaseType?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a DatabaseAccessControls resource.
 */
export interface DatabaseAccessControlsArgs {
    /**
     * A list of IP addresses that can access the Managed Database. Each item can be a single IP address or a range in CIDR format.
     */
    allowLists: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The unique ID of the target database.
     */
    databaseId: pulumi.Input<number>;
    /**
     * The unique type of the target database. (`mysql`, `mongodb`, `postgresql`)
     */
    databaseType: pulumi.Input<string>;
}
