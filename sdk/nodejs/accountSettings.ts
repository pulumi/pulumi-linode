// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Manages the settings of a Linode account.
 *
 * ## Example Usage
 *
 * The following example shows how one might use this resource to change their Linode account settings.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const myaccount = new linode.AccountSettings("myaccount", {
 *     backupsEnabled: true,
 *     longviewSubscription: "longview-40",
 * });
 * ```
 * ## Additional Results
 *
 * * `managed` - Enables monitoring for connectivity, response, and total request time.
 *
 * * `objectStorage` - A string describing the status of this account’s Object Storage service enrollment.
 */
export class AccountSettings extends pulumi.CustomResource {
    /**
     * Get an existing AccountSettings resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AccountSettingsState, opts?: pulumi.CustomResourceOptions): AccountSettings {
        return new AccountSettings(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'linode:index/accountSettings:AccountSettings';

    /**
     * Returns true if the given object is an instance of AccountSettings.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AccountSettings {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AccountSettings.__pulumiType;
    }

    /**
     * The account-wide backups default. If true, all Linodes created will automatically be enrolled in the Backups service. If false, Linodes will not be enrolled by default, but may still be enrolled on creation or later.
     */
    public readonly backupsEnabled!: pulumi.Output<boolean>;
    /**
     * The Longview Pro tier you are currently subscribed to. The value must be a [Longview Subscription](https://www.linode.com/docs/api/longview/#longview-subscriptions-list) ID or null for Longview Free.
     */
    public readonly longviewSubscription!: pulumi.Output<string>;
    /**
     * Enables monitoring for connectivity, response, and total request time.
     */
    public /*out*/ readonly managed!: pulumi.Output<boolean>;
    /**
     * Enables network helper across all users by default for new Linodes and Linode Configs.
     */
    public readonly networkHelper!: pulumi.Output<boolean>;
    /**
     * A string describing the status of this account's Object Storage service enrollment.
     */
    public /*out*/ readonly objectStorage!: pulumi.Output<string>;

    /**
     * Create a AccountSettings resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: AccountSettingsArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AccountSettingsArgs | AccountSettingsState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AccountSettingsState | undefined;
            resourceInputs["backupsEnabled"] = state ? state.backupsEnabled : undefined;
            resourceInputs["longviewSubscription"] = state ? state.longviewSubscription : undefined;
            resourceInputs["managed"] = state ? state.managed : undefined;
            resourceInputs["networkHelper"] = state ? state.networkHelper : undefined;
            resourceInputs["objectStorage"] = state ? state.objectStorage : undefined;
        } else {
            const args = argsOrState as AccountSettingsArgs | undefined;
            resourceInputs["backupsEnabled"] = args ? args.backupsEnabled : undefined;
            resourceInputs["longviewSubscription"] = args ? args.longviewSubscription : undefined;
            resourceInputs["networkHelper"] = args ? args.networkHelper : undefined;
            resourceInputs["managed"] = undefined /*out*/;
            resourceInputs["objectStorage"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AccountSettings.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AccountSettings resources.
 */
export interface AccountSettingsState {
    /**
     * The account-wide backups default. If true, all Linodes created will automatically be enrolled in the Backups service. If false, Linodes will not be enrolled by default, but may still be enrolled on creation or later.
     */
    backupsEnabled?: pulumi.Input<boolean>;
    /**
     * The Longview Pro tier you are currently subscribed to. The value must be a [Longview Subscription](https://www.linode.com/docs/api/longview/#longview-subscriptions-list) ID or null for Longview Free.
     */
    longviewSubscription?: pulumi.Input<string>;
    /**
     * Enables monitoring for connectivity, response, and total request time.
     */
    managed?: pulumi.Input<boolean>;
    /**
     * Enables network helper across all users by default for new Linodes and Linode Configs.
     */
    networkHelper?: pulumi.Input<boolean>;
    /**
     * A string describing the status of this account's Object Storage service enrollment.
     */
    objectStorage?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AccountSettings resource.
 */
export interface AccountSettingsArgs {
    /**
     * The account-wide backups default. If true, all Linodes created will automatically be enrolled in the Backups service. If false, Linodes will not be enrolled by default, but may still be enrolled on creation or later.
     */
    backupsEnabled?: pulumi.Input<boolean>;
    /**
     * The Longview Pro tier you are currently subscribed to. The value must be a [Longview Subscription](https://www.linode.com/docs/api/longview/#longview-subscriptions-list) ID or null for Longview Free.
     */
    longviewSubscription?: pulumi.Input<string>;
    /**
     * Enables network helper across all users by default for new Linodes and Linode Configs.
     */
    networkHelper?: pulumi.Input<boolean>;
}
