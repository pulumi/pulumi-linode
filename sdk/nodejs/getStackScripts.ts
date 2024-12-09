// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides information about Linode StackScripts that match a set of filters.
 * For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-stack-scripts).
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
 * const specific-stackscripts = linode.getStackScripts({
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
 * });
 * export const stackscriptId = specific_stackscripts.then(specific_stackscripts => specific_stackscripts.stackscripts?.[0]?.id);
 * ```
 *
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
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("linode:index/getStackScripts:getStackScripts", {
        "filters": args.filters,
        "latest": args.latest,
        "order": args.order,
        "orderBy": args.orderBy,
        "stackscripts": args.stackscripts,
    }, opts);
}

/**
 * A collection of arguments for invoking getStackScripts.
 */
export interface GetStackScriptsArgs {
    filters?: inputs.GetStackScriptsFilter[];
    /**
     * If true, only the latest StackScript will be returned. StackScripts without a valid `created` field are not included in the result.
     *
     * * `filter` - (Optional) A set of filters used to select Linode StackScripts that meet certain requirements.
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
    stackscripts?: inputs.GetStackScriptsStackscript[];
}

/**
 * A collection of values returned by getStackScripts.
 */
export interface GetStackScriptsResult {
    readonly filters?: outputs.GetStackScriptsFilter[];
    /**
     * The unique ID of the StackScript.
     */
    readonly id: string;
    readonly latest?: boolean;
    readonly order?: string;
    readonly orderBy?: string;
    readonly stackscripts?: outputs.GetStackScriptsStackscript[];
}
/**
 * Provides information about Linode StackScripts that match a set of filters.
 * For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-stack-scripts).
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
 * const specific-stackscripts = linode.getStackScripts({
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
 * });
 * export const stackscriptId = specific_stackscripts.then(specific_stackscripts => specific_stackscripts.stackscripts?.[0]?.id);
 * ```
 *
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
export function getStackScriptsOutput(args?: GetStackScriptsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetStackScriptsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("linode:index/getStackScripts:getStackScripts", {
        "filters": args.filters,
        "latest": args.latest,
        "order": args.order,
        "orderBy": args.orderBy,
        "stackscripts": args.stackscripts,
    }, opts);
}

/**
 * A collection of arguments for invoking getStackScripts.
 */
export interface GetStackScriptsOutputArgs {
    filters?: pulumi.Input<pulumi.Input<inputs.GetStackScriptsFilterArgs>[]>;
    /**
     * If true, only the latest StackScript will be returned. StackScripts without a valid `created` field are not included in the result.
     *
     * * `filter` - (Optional) A set of filters used to select Linode StackScripts that meet certain requirements.
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
    stackscripts?: pulumi.Input<pulumi.Input<inputs.GetStackScriptsStackscriptArgs>[]>;
}
