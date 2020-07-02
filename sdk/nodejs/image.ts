// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Linode Image resource.  This can be used to create, modify, and delete Linodes Images.  Linode Images are snapshots of a Linode Instance Disk which can then be used to provision more Linode Instances.  Images can be used across regions.
 *
 * For more information, see [Linode's documentation on Images](https://www.linode.com/docs/platform/disk-images/linode-images/) and the [Linode APIv4 docs](https://developers.linode.com/api/v4#operation/createImage).
 *
 * ## Example Usage
 *
 * The following example shows how one might use this resource to create an Image from a Linode Instance Disk and then deploy a new Linode Instance in another region using that Image.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const foo = new linode.Instance("foo", {
 *     region: "us-central",
 *     type: "g6-nanode-1",
 * });
 * const bar = new linode.Image("bar", {
 *     description: "Image taken from foo",
 *     diskId: foo.disks.apply(disks => disks[0].id),
 *     label: "foo-sda-image",
 *     linodeId: foo.id.apply(id => Number.parseFloat(id)),
 * });
 * const barBased = new linode.Instance("bar_based", {
 *     image: bar.id,
 *     region: "eu-west",
 *     type: foo.type,
 * });
 * ```
 * ## Attributes
 *
 * This resource exports the following attributes:
 *
 * * `id` - The unique ID of this Image.  The ID of private images begin with `private/` followed by the numeric identifier of the private image, for example `private/12345`.
 *
 * * `created` - When this Image was created.
 *
 * * `createdBy` - The name of the User who created this Image.
 *
 * * `deprecated` - Whether or not this Image is deprecated. Will only be True for deprecated public Images.
 *
 * * `isPublic` - True if the Image is public.
 *
 * * `size` - The minimum size this Image needs to deploy. Size is in MB.
 *
 * * `type` - How the Image was created. 'Manual' Images can be created at any time. 'Automatic' images are created automatically from a deleted Linode.
 *
 * * `expiry` - Only Images created automatically (from a deleted Linode; type=automatic) will expire.
 *
 * * `vendor` - The upstream distribution vendor. Nil for private Images.
 */
export class Image extends pulumi.CustomResource {
    /**
     * Get an existing Image resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ImageState, opts?: pulumi.CustomResourceOptions): Image {
        return new Image(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'linode:index/image:Image';

    /**
     * Returns true if the given object is an instance of Image.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Image {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Image.__pulumiType;
    }

    /**
     * When this Image was created.
     */
    public /*out*/ readonly created!: pulumi.Output<string>;
    /**
     * The name of the User who created this Image.
     */
    public /*out*/ readonly createdBy!: pulumi.Output<string>;
    /**
     * Whether or not this Image is deprecated. Will only be True for deprecated public Images.
     */
    public /*out*/ readonly deprecated!: pulumi.Output<boolean>;
    /**
     * A detailed description of this Image.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The ID of the Linode Disk that this Image will be created from.
     */
    public readonly diskId!: pulumi.Output<number>;
    /**
     * Only Images created automatically (from a deleted Linode; type=automatic) will expire.
     */
    public /*out*/ readonly expiry!: pulumi.Output<string>;
    /**
     * True if the Image is public.
     */
    public /*out*/ readonly isPublic!: pulumi.Output<boolean>;
    /**
     * A short description of the Image. Labels cannot contain special characters.
     */
    public readonly label!: pulumi.Output<string>;
    /**
     * The ID of the Linode that this Image will be created from.
     */
    public readonly linodeId!: pulumi.Output<number>;
    /**
     * The minimum size this Image needs to deploy. Size is in MB.
     */
    public /*out*/ readonly size!: pulumi.Output<number>;
    /**
     * How the Image was created. 'Manual' Images can be created at any time. 'Automatic' images are created automatically from
     * a deleted Linode.
     */
    public /*out*/ readonly type!: pulumi.Output<string>;
    /**
     * The upstream distribution vendor. Nil for private Images.
     */
    public /*out*/ readonly vendor!: pulumi.Output<string>;

    /**
     * Create a Image resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ImageArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ImageArgs | ImageState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as ImageState | undefined;
            inputs["created"] = state ? state.created : undefined;
            inputs["createdBy"] = state ? state.createdBy : undefined;
            inputs["deprecated"] = state ? state.deprecated : undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["diskId"] = state ? state.diskId : undefined;
            inputs["expiry"] = state ? state.expiry : undefined;
            inputs["isPublic"] = state ? state.isPublic : undefined;
            inputs["label"] = state ? state.label : undefined;
            inputs["linodeId"] = state ? state.linodeId : undefined;
            inputs["size"] = state ? state.size : undefined;
            inputs["type"] = state ? state.type : undefined;
            inputs["vendor"] = state ? state.vendor : undefined;
        } else {
            const args = argsOrState as ImageArgs | undefined;
            if (!args || args.diskId === undefined) {
                throw new Error("Missing required property 'diskId'");
            }
            if (!args || args.label === undefined) {
                throw new Error("Missing required property 'label'");
            }
            if (!args || args.linodeId === undefined) {
                throw new Error("Missing required property 'linodeId'");
            }
            inputs["description"] = args ? args.description : undefined;
            inputs["diskId"] = args ? args.diskId : undefined;
            inputs["label"] = args ? args.label : undefined;
            inputs["linodeId"] = args ? args.linodeId : undefined;
            inputs["created"] = undefined /*out*/;
            inputs["createdBy"] = undefined /*out*/;
            inputs["deprecated"] = undefined /*out*/;
            inputs["expiry"] = undefined /*out*/;
            inputs["isPublic"] = undefined /*out*/;
            inputs["size"] = undefined /*out*/;
            inputs["type"] = undefined /*out*/;
            inputs["vendor"] = undefined /*out*/;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(Image.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Image resources.
 */
export interface ImageState {
    /**
     * When this Image was created.
     */
    readonly created?: pulumi.Input<string>;
    /**
     * The name of the User who created this Image.
     */
    readonly createdBy?: pulumi.Input<string>;
    /**
     * Whether or not this Image is deprecated. Will only be True for deprecated public Images.
     */
    readonly deprecated?: pulumi.Input<boolean>;
    /**
     * A detailed description of this Image.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * The ID of the Linode Disk that this Image will be created from.
     */
    readonly diskId?: pulumi.Input<number>;
    /**
     * Only Images created automatically (from a deleted Linode; type=automatic) will expire.
     */
    readonly expiry?: pulumi.Input<string>;
    /**
     * True if the Image is public.
     */
    readonly isPublic?: pulumi.Input<boolean>;
    /**
     * A short description of the Image. Labels cannot contain special characters.
     */
    readonly label?: pulumi.Input<string>;
    /**
     * The ID of the Linode that this Image will be created from.
     */
    readonly linodeId?: pulumi.Input<number>;
    /**
     * The minimum size this Image needs to deploy. Size is in MB.
     */
    readonly size?: pulumi.Input<number>;
    /**
     * How the Image was created. 'Manual' Images can be created at any time. 'Automatic' images are created automatically from
     * a deleted Linode.
     */
    readonly type?: pulumi.Input<string>;
    /**
     * The upstream distribution vendor. Nil for private Images.
     */
    readonly vendor?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Image resource.
 */
export interface ImageArgs {
    /**
     * A detailed description of this Image.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * The ID of the Linode Disk that this Image will be created from.
     */
    readonly diskId: pulumi.Input<number>;
    /**
     * A short description of the Image. Labels cannot contain special characters.
     */
    readonly label: pulumi.Input<string>;
    /**
     * The ID of the Linode that this Image will be created from.
     */
    readonly linodeId: pulumi.Input<number>;
}
