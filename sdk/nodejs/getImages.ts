// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
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
 * const specific-images = linode.getImages({
 *     filters: [
 *         {
 *             name: "label",
 *             values: ["Debian 12"],
 *         },
 *         {
 *             name: "is_public",
 *             values: ["true"],
 *         },
 *     ],
 * });
 * export const imageId = specific_images.then(specific_images => specific_images.images?.[0]?.id);
 * ```
 *
 * Get information about all Linode images associated with the current token:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const all-images = linode.getImages({});
 * export const imageIds = all_images.then(all_images => all_images.images.map(__item => __item.id));
 * ```
 *
 * ## Filterable Fields
 *
 * * `createdBy`
 *
 * * `deprecated`
 *
 * * `description`
 *
 * * `id`
 *
 * * `isPublic`
 *
 * * `label`
 *
 * * `size`
 *
 * * `status`
 *
 * * `vendor`
 */
export function getImages(args?: GetImagesArgs, opts?: pulumi.InvokeOptions): Promise<GetImagesResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("linode:index/getImages:getImages", {
        "filters": args.filters,
        "images": args.images,
        "latest": args.latest,
        "order": args.order,
        "orderBy": args.orderBy,
    }, opts);
}

/**
 * A collection of arguments for invoking getImages.
 */
export interface GetImagesArgs {
    filters?: inputs.GetImagesFilter[];
    images?: inputs.GetImagesImage[];
    /**
     * If true, only the latest image will be returned. Images without a valid `created` field are not included in the result.
     *
     * * `filter` - (Optional) A set of filters used to select Linode images that meet certain requirements.
     */
    latest?: boolean;
    /**
     * The order in which results should be returned. (`asc`, `desc`; default `asc`)
     */
    order?: string;
    /**
     * The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
     */
    orderBy?: string;
}

/**
 * A collection of values returned by getImages.
 */
export interface GetImagesResult {
    readonly filters?: outputs.GetImagesFilter[];
    /**
     * The unique ID of this Image.  The ID of private images begin with `private/` followed by the numeric identifier of the private image, for example `private/12345`.
     */
    readonly id: string;
    readonly images?: outputs.GetImagesImage[];
    readonly latest?: boolean;
    readonly order?: string;
    readonly orderBy?: string;
}
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
 * const specific-images = linode.getImages({
 *     filters: [
 *         {
 *             name: "label",
 *             values: ["Debian 12"],
 *         },
 *         {
 *             name: "is_public",
 *             values: ["true"],
 *         },
 *     ],
 * });
 * export const imageId = specific_images.then(specific_images => specific_images.images?.[0]?.id);
 * ```
 *
 * Get information about all Linode images associated with the current token:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const all-images = linode.getImages({});
 * export const imageIds = all_images.then(all_images => all_images.images.map(__item => __item.id));
 * ```
 *
 * ## Filterable Fields
 *
 * * `createdBy`
 *
 * * `deprecated`
 *
 * * `description`
 *
 * * `id`
 *
 * * `isPublic`
 *
 * * `label`
 *
 * * `size`
 *
 * * `status`
 *
 * * `vendor`
 */
export function getImagesOutput(args?: GetImagesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetImagesResult> {
    return pulumi.output(args).apply((a: any) => getImages(a, opts))
}

/**
 * A collection of arguments for invoking getImages.
 */
export interface GetImagesOutputArgs {
    filters?: pulumi.Input<pulumi.Input<inputs.GetImagesFilterArgs>[]>;
    images?: pulumi.Input<pulumi.Input<inputs.GetImagesImageArgs>[]>;
    /**
     * If true, only the latest image will be returned. Images without a valid `created` field are not included in the result.
     *
     * * `filter` - (Optional) A set of filters used to select Linode images that meet certain requirements.
     */
    latest?: pulumi.Input<boolean>;
    /**
     * The order in which results should be returned. (`asc`, `desc`; default `asc`)
     */
    order?: pulumi.Input<string>;
    /**
     * The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
     */
    orderBy?: pulumi.Input<string>;
}
