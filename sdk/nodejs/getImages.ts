// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Provides information about Linode images that match a set of filters.
 *
 * ## Example Usage
 *
 * Get information about all Linode images with a certain label and visibility:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const specific_images = pulumi.output(linode.getImages({
 *     filters: [
 *         {
 *             name: "label",
 *             values: ["Debian 8"],
 *         },
 *         {
 *             name: "is_public",
 *             values: ["true"],
 *         },
 *     ],
 * }, { async: true }));
 * ```
 *
 * Get information about all Linode images associated with the current token:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const all_images = pulumi.output(linode.getImages({ async: true }));
 * ```
 * ## Attributes
 *
 * Each Linode image will be stored in the `images` attribute and will export the following attributes:
 *
 * * `id` - The unique ID of this Image.  The ID of private images begin with `private/` followed by the numeric identifier of the private image, for example `private/12345`.
 *
 * * `label` - A short description of the Image.
 *
 * * `created` - When this Image was created.
 *
 * * `createdBy` - The name of the User who created this Image, or "linode" for official Images.
 *
 * * `deprecated` - Whether or not this Image is deprecated. Will only be true for deprecated public Images.
 *
 * * `description` - A detailed description of this Image.
 *
 * * `isPublic` - True if the Image is public.
 *
 * * `size` - The minimum size this Image needs to deploy. Size is in MB. example: 2500
 *
 * * `status` - The current status of this image. (`creating`, `pendingUpload`, `available`)
 *
 * * `type` - How the Image was created. Manual Images can be created at any time. "Automatic" Images are created automatically from a deleted Linode. (`manual`, `automatic`)
 *
 * * `vendor` - The upstream distribution vendor. `None` for private Images.
 *
 * ## Filterable Fields
 *
 * * `deprecated`
 *
 * * `isPublic`
 *
 * * `label`
 *
 * * `size`
 *
 * * `vendor`
 */
export function getImages(args?: GetImagesArgs, opts?: pulumi.InvokeOptions): Promise<GetImagesResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("linode:index/getImages:getImages", {
        "filters": args.filters,
    }, opts);
}

/**
 * A collection of arguments for invoking getImages.
 */
export interface GetImagesArgs {
    readonly filters?: inputs.GetImagesFilter[];
}

/**
 * A collection of values returned by getImages.
 */
export interface GetImagesResult {
    readonly filters?: outputs.GetImagesFilter[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly images: outputs.GetImagesImage[];
}
