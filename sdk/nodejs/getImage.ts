// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides information about a Linode image
 *
 * ## Example Usage
 *
 * The following example shows how one might use this data source to access information about a Linode image.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const k8Master = pulumi.output(linode.getImage({
 *     id: "linode/debian8",
 * }));
 * ```
 * ## Attributes
 *
 * The Linode Image resource exports the following attributes:
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
 */
export function getImage(args: GetImageArgs, opts?: pulumi.InvokeOptions): Promise<GetImageResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("linode:index/getImage:getImage", {
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getImage.
 */
export interface GetImageArgs {
    /**
     * The unique ID of this Image.  The ID of private images begin with `private/` followed by the numeric identifier of the private image, for example `private/12345`.
     */
    id: string;
}

/**
 * A collection of values returned by getImage.
 */
export interface GetImageResult {
    readonly created: string;
    readonly createdBy: string;
    readonly deprecated: boolean;
    readonly description: string;
    readonly expiry: string;
    readonly id: string;
    readonly isPublic: boolean;
    readonly label: string;
    readonly size: number;
    readonly status: string;
    readonly type: string;
    readonly vendor: string;
}

export function getImageOutput(args: GetImageOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetImageResult> {
    return pulumi.output(args).apply(a => getImage(a, opts))
}

/**
 * A collection of arguments for invoking getImage.
 */
export interface GetImageOutputArgs {
    /**
     * The unique ID of this Image.  The ID of private images begin with `private/` followed by the numeric identifier of the private image, for example `private/12345`.
     */
    id: pulumi.Input<string>;
}
