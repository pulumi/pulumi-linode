// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides information about Linode StackScripts that match a set of filters.
 *
 * **NOTICE:** Due to the large number of public StackScripts, this data source may time out if `isPublic` is not filtered on.
 *
 * ## Example Usage
 *
 * The following example shows how one might use this data source to access information about a Linode StackScript.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const specific_stackscripts = pulumi.output(linode.getStackScripts({
 *     filters: [
 *         {
 *             name: "label",
 *             values: ["my-cool-stackscript"],
 *         },
 *         {
 *             name: "is_public",
 *             values: ["false"],
 *         },
 *     ],
 * }));
 * ```
 * ## Filterable Fields
 *
 * * `deploymentsActive`
 *
 * * `deploymentsTotal`
 *
 * * `description`
 *
 * * `images`
 *
 * * `isPublic`
 *
 * * `label`
 *
 * * `mine`
 *
 * * `revNote`
 *
 * * `username`
 */
export function getStackScripts(args?: GetStackScriptsArgs, opts?: pulumi.InvokeOptions): Promise<GetStackScriptsResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("linode:index/getStackScripts:getStackScripts", {
        "filters": args.filters,
        "latest": args.latest,
        "order": args.order,
        "orderBy": args.orderBy,
    }, opts);
}

/**
 * A collection of arguments for invoking getStackScripts.
 */
export interface GetStackScriptsArgs {
    filters?: inputs.GetStackScriptsFilter[];
    /**
     * If true, only the latest StackScript will be returned. StackScripts without a valid `created` field are not included in the result.
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
 * A collection of values returned by getStackScripts.
 */
export interface GetStackScriptsResult {
    readonly filters?: outputs.GetStackScriptsFilter[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly latest?: boolean;
    readonly order?: string;
    readonly orderBy?: string;
    readonly stackscripts: outputs.GetStackScriptsStackscript[];
}

export function getStackScriptsOutput(args?: GetStackScriptsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetStackScriptsResult> {
    return pulumi.output(args).apply(a => getStackScripts(a, opts))
}

/**
 * A collection of arguments for invoking getStackScripts.
 */
export interface GetStackScriptsOutputArgs {
    filters?: pulumi.Input<pulumi.Input<inputs.GetStackScriptsFilterArgs>[]>;
    /**
     * If true, only the latest StackScript will be returned. StackScripts without a valid `created` field are not included in the result.
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
