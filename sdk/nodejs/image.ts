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
 * Creating an image from an existing Linode Instance and deploying another instance with that image:
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const foo = new linode.Instance("foo", {
 *     type: "g6-nanode-1",
 *     region: "us-central",
 *     image: "linode/ubuntu22.04",
 *     rootPass: "insecure-p4ssw0rd!!",
 * });
 * const bar = new linode.Image("bar", {
 *     label: "foo-sda-image",
 *     description: "Image taken from foo",
 *     diskId: foo.disks.apply(disks => disks[0].id),
 *     linodeId: foo.id,
 * });
 * const barBased = new linode.Instance("barBased", {
 *     type: foo.type,
 *     region: "eu-west",
 *     image: bar.id,
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * Creating and uploading an image from a local file:
 *
 * ## Import
 *
 * Linodes Images can be imported using the Linode Image `id`, e.g.
 *
 * ```sh
 * $ pulumi import linode:index/image:Image myimage 1234567
 * ```
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
     * The capabilities of this Image.
     */
    public /*out*/ readonly capabilities!: pulumi.Output<string[]>;
    /**
     * Whether this image supports cloud-init.
     */
    public readonly cloudInit!: pulumi.Output<boolean | undefined>;
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
     *
     * - - -
     *
     * The following arguments apply to creating an image from an existing Linode Instance:
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The ID of the Linode Disk that this Image will be created from.
     */
    public readonly diskId!: pulumi.Output<number | undefined>;
    /**
     * Only Images created automatically (from a deleted Linode; type=automatic) will expire.
     */
    public /*out*/ readonly expiry!: pulumi.Output<string>;
    /**
     * The MD5 hash of the file to be uploaded. This is used to trigger file updates.
     */
    public readonly fileHash!: pulumi.Output<string>;
    /**
     * The path of the image file to be uploaded.
     */
    public readonly filePath!: pulumi.Output<string | undefined>;
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
     *
     * - - -
     *
     * > **NOTICE:** Uploading images is currently in beta. Ensure `LINODE_API_VERSION` is set to `v4beta` in order to use this functionality.
     *
     * The following arguments apply to uploading an image:
     */
    public readonly linodeId!: pulumi.Output<number | undefined>;
    /**
     * The region of the image. See all regions [here](https://api.linode.com/v4/regions).
     */
    public readonly region!: pulumi.Output<string | undefined>;
    /**
     * The minimum size this Image needs to deploy. Size is in MB.
     */
    public /*out*/ readonly size!: pulumi.Output<number>;
    /**
     * The current status of this Image.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * How the Image was created. 'Manual' Images can be created at any time. 'Automatic' images are created automatically from a deleted Linode.
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
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ImageState | undefined;
            resourceInputs["capabilities"] = state ? state.capabilities : undefined;
            resourceInputs["cloudInit"] = state ? state.cloudInit : undefined;
            resourceInputs["created"] = state ? state.created : undefined;
            resourceInputs["createdBy"] = state ? state.createdBy : undefined;
            resourceInputs["deprecated"] = state ? state.deprecated : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["diskId"] = state ? state.diskId : undefined;
            resourceInputs["expiry"] = state ? state.expiry : undefined;
            resourceInputs["fileHash"] = state ? state.fileHash : undefined;
            resourceInputs["filePath"] = state ? state.filePath : undefined;
            resourceInputs["isPublic"] = state ? state.isPublic : undefined;
            resourceInputs["label"] = state ? state.label : undefined;
            resourceInputs["linodeId"] = state ? state.linodeId : undefined;
            resourceInputs["region"] = state ? state.region : undefined;
            resourceInputs["size"] = state ? state.size : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["vendor"] = state ? state.vendor : undefined;
        } else {
            const args = argsOrState as ImageArgs | undefined;
            if ((!args || args.label === undefined) && !opts.urn) {
                throw new Error("Missing required property 'label'");
            }
            resourceInputs["cloudInit"] = args ? args.cloudInit : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["diskId"] = args ? args.diskId : undefined;
            resourceInputs["fileHash"] = args ? args.fileHash : undefined;
            resourceInputs["filePath"] = args ? args.filePath : undefined;
            resourceInputs["label"] = args ? args.label : undefined;
            resourceInputs["linodeId"] = args ? args.linodeId : undefined;
            resourceInputs["region"] = args ? args.region : undefined;
            resourceInputs["capabilities"] = undefined /*out*/;
            resourceInputs["created"] = undefined /*out*/;
            resourceInputs["createdBy"] = undefined /*out*/;
            resourceInputs["deprecated"] = undefined /*out*/;
            resourceInputs["expiry"] = undefined /*out*/;
            resourceInputs["isPublic"] = undefined /*out*/;
            resourceInputs["size"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
            resourceInputs["type"] = undefined /*out*/;
            resourceInputs["vendor"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Image.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Image resources.
 */
export interface ImageState {
    /**
     * The capabilities of this Image.
     */
    capabilities?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Whether this image supports cloud-init.
     */
    cloudInit?: pulumi.Input<boolean>;
    /**
     * When this Image was created.
     */
    created?: pulumi.Input<string>;
    /**
     * The name of the User who created this Image.
     */
    createdBy?: pulumi.Input<string>;
    /**
     * Whether or not this Image is deprecated. Will only be True for deprecated public Images.
     */
    deprecated?: pulumi.Input<boolean>;
    /**
     * A detailed description of this Image.
     *
     * - - -
     *
     * The following arguments apply to creating an image from an existing Linode Instance:
     */
    description?: pulumi.Input<string>;
    /**
     * The ID of the Linode Disk that this Image will be created from.
     */
    diskId?: pulumi.Input<number>;
    /**
     * Only Images created automatically (from a deleted Linode; type=automatic) will expire.
     */
    expiry?: pulumi.Input<string>;
    /**
     * The MD5 hash of the file to be uploaded. This is used to trigger file updates.
     */
    fileHash?: pulumi.Input<string>;
    /**
     * The path of the image file to be uploaded.
     */
    filePath?: pulumi.Input<string>;
    /**
     * True if the Image is public.
     */
    isPublic?: pulumi.Input<boolean>;
    /**
     * A short description of the Image. Labels cannot contain special characters.
     */
    label?: pulumi.Input<string>;
    /**
     * The ID of the Linode that this Image will be created from.
     *
     * - - -
     *
     * > **NOTICE:** Uploading images is currently in beta. Ensure `LINODE_API_VERSION` is set to `v4beta` in order to use this functionality.
     *
     * The following arguments apply to uploading an image:
     */
    linodeId?: pulumi.Input<number>;
    /**
     * The region of the image. See all regions [here](https://api.linode.com/v4/regions).
     */
    region?: pulumi.Input<string>;
    /**
     * The minimum size this Image needs to deploy. Size is in MB.
     */
    size?: pulumi.Input<number>;
    /**
     * The current status of this Image.
     */
    status?: pulumi.Input<string>;
    /**
     * How the Image was created. 'Manual' Images can be created at any time. 'Automatic' images are created automatically from a deleted Linode.
     */
    type?: pulumi.Input<string>;
    /**
     * The upstream distribution vendor. Nil for private Images.
     */
    vendor?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Image resource.
 */
export interface ImageArgs {
    /**
     * Whether this image supports cloud-init.
     */
    cloudInit?: pulumi.Input<boolean>;
    /**
     * A detailed description of this Image.
     *
     * - - -
     *
     * The following arguments apply to creating an image from an existing Linode Instance:
     */
    description?: pulumi.Input<string>;
    /**
     * The ID of the Linode Disk that this Image will be created from.
     */
    diskId?: pulumi.Input<number>;
    /**
     * The MD5 hash of the file to be uploaded. This is used to trigger file updates.
     */
    fileHash?: pulumi.Input<string>;
    /**
     * The path of the image file to be uploaded.
     */
    filePath?: pulumi.Input<string>;
    /**
     * A short description of the Image. Labels cannot contain special characters.
     */
    label: pulumi.Input<string>;
    /**
     * The ID of the Linode that this Image will be created from.
     *
     * - - -
     *
     * > **NOTICE:** Uploading images is currently in beta. Ensure `LINODE_API_VERSION` is set to `v4beta` in order to use this functionality.
     *
     * The following arguments apply to uploading an image:
     */
    linodeId?: pulumi.Input<number>;
    /**
     * The region of the image. See all regions [here](https://api.linode.com/v4/regions).
     */
    region?: pulumi.Input<string>;
}
