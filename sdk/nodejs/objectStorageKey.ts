// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Provides a Linode Object Storage Key resource. This can be used to create, modify, and delete Linodes Object Storage Keys.
 *
 * ## Example Usage
 *
 * The following example shows how one might use this resource to create an Object Storage Key.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const foo = new linode.ObjectStorageKey("foo", {
 *     label: "image-access",
 * });
 * ```
 * ## Attributes
 *
 * This resource exports the following attributes:
 *
 * * `accessKey` - This keypair's access key. This is not secret.
 *
 * * `secretKey` - This keypair's secret key.
 *
 * * `limited` - Whether or not this key is a limited access key.
 */
export class ObjectStorageKey extends pulumi.CustomResource {
    /**
     * Get an existing ObjectStorageKey resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ObjectStorageKeyState, opts?: pulumi.CustomResourceOptions): ObjectStorageKey {
        return new ObjectStorageKey(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'linode:index/objectStorageKey:ObjectStorageKey';

    /**
     * Returns true if the given object is an instance of ObjectStorageKey.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ObjectStorageKey {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ObjectStorageKey.__pulumiType;
    }

    /**
     * This keypair's access key. This is not secret.
     */
    public /*out*/ readonly accessKey!: pulumi.Output<string>;
    /**
     * Defines this key as a Limited Access Key. Limited Access Keys restrict this Object Storage key’s access to only the bucket(s) declared in this array and define their bucket-level permissions. Not providing this block will not limit this Object Storage Key.
     */
    public readonly bucketAccesses!: pulumi.Output<outputs.ObjectStorageKeyBucketAccess[] | undefined>;
    /**
     * The label given to this key. For display purposes only.
     */
    public readonly label!: pulumi.Output<string>;
    /**
     * Whether or not this key is a limited access key.
     */
    public /*out*/ readonly limited!: pulumi.Output<boolean>;
    /**
     * This keypair's secret key.
     */
    public /*out*/ readonly secretKey!: pulumi.Output<string>;

    /**
     * Create a ObjectStorageKey resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ObjectStorageKeyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ObjectStorageKeyArgs | ObjectStorageKeyState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ObjectStorageKeyState | undefined;
            inputs["accessKey"] = state ? state.accessKey : undefined;
            inputs["bucketAccesses"] = state ? state.bucketAccesses : undefined;
            inputs["label"] = state ? state.label : undefined;
            inputs["limited"] = state ? state.limited : undefined;
            inputs["secretKey"] = state ? state.secretKey : undefined;
        } else {
            const args = argsOrState as ObjectStorageKeyArgs | undefined;
            if ((!args || args.label === undefined) && !opts.urn) {
                throw new Error("Missing required property 'label'");
            }
            inputs["bucketAccesses"] = args ? args.bucketAccesses : undefined;
            inputs["label"] = args ? args.label : undefined;
            inputs["accessKey"] = undefined /*out*/;
            inputs["limited"] = undefined /*out*/;
            inputs["secretKey"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(ObjectStorageKey.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ObjectStorageKey resources.
 */
export interface ObjectStorageKeyState {
    /**
     * This keypair's access key. This is not secret.
     */
    readonly accessKey?: pulumi.Input<string>;
    /**
     * Defines this key as a Limited Access Key. Limited Access Keys restrict this Object Storage key’s access to only the bucket(s) declared in this array and define their bucket-level permissions. Not providing this block will not limit this Object Storage Key.
     */
    readonly bucketAccesses?: pulumi.Input<pulumi.Input<inputs.ObjectStorageKeyBucketAccess>[]>;
    /**
     * The label given to this key. For display purposes only.
     */
    readonly label?: pulumi.Input<string>;
    /**
     * Whether or not this key is a limited access key.
     */
    readonly limited?: pulumi.Input<boolean>;
    /**
     * This keypair's secret key.
     */
    readonly secretKey?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ObjectStorageKey resource.
 */
export interface ObjectStorageKeyArgs {
    /**
     * Defines this key as a Limited Access Key. Limited Access Keys restrict this Object Storage key’s access to only the bucket(s) declared in this array and define their bucket-level permissions. Not providing this block will not limit this Object Storage Key.
     */
    readonly bucketAccesses?: pulumi.Input<pulumi.Input<inputs.ObjectStorageKeyBucketAccess>[]>;
    /**
     * The label given to this key. For display purposes only.
     */
    readonly label: pulumi.Input<string>;
}
