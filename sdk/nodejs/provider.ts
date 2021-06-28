// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * The provider type for the linode package. By default, resources use package-wide configuration
 * settings, however an explicit `Provider` instance may be created and passed during resource
 * construction to achieve fine-grained programmatic control over provider settings. See the
 * [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
 */
export class Provider extends pulumi.ProviderResource {
    /** @internal */
    public static readonly __pulumiType = 'linode';

    /**
     * Returns true if the given object is an instance of Provider.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Provider {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Provider.__pulumiType;
    }


    /**
     * Create a Provider resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ProviderArgs, opts?: pulumi.ResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        {
            if ((!args || args.token === undefined) && !opts.urn) {
                throw new Error("Missing required property 'token'");
            }
            inputs["apiVersion"] = (args ? args.apiVersion : undefined) ?? utilities.getEnv("LINODE_API_VERSION");
            inputs["eventPollMs"] = pulumi.output(args ? args.eventPollMs : undefined).apply(JSON.stringify);
            inputs["lkeEventPollMs"] = pulumi.output(args ? args.lkeEventPollMs : undefined).apply(JSON.stringify);
            inputs["lkeNodeReadyPollMs"] = pulumi.output(args ? args.lkeNodeReadyPollMs : undefined).apply(JSON.stringify);
            inputs["maxRetryDelayMs"] = pulumi.output(args ? args.maxRetryDelayMs : undefined).apply(JSON.stringify);
            inputs["minRetryDelayMs"] = pulumi.output(args ? args.minRetryDelayMs : undefined).apply(JSON.stringify);
            inputs["skipInstanceDeletePoll"] = pulumi.output(args ? args.skipInstanceDeletePoll : undefined).apply(JSON.stringify);
            inputs["skipInstanceReadyPoll"] = pulumi.output(args ? args.skipInstanceReadyPoll : undefined).apply(JSON.stringify);
            inputs["token"] = args ? args.token : undefined;
            inputs["uaPrefix"] = (args ? args.uaPrefix : undefined) ?? utilities.getEnv("LINODE_UA_PREFIX");
            inputs["url"] = (args ? args.url : undefined) ?? utilities.getEnv("LINODE_URL");
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(Provider.__pulumiType, name, inputs, opts);
    }
}

/**
 * The set of arguments for constructing a Provider resource.
 */
export interface ProviderArgs {
    /**
     * An HTTP User-Agent Prefix to prepend in API requests.
     */
    readonly apiVersion?: pulumi.Input<string>;
    /**
     * The rate in milliseconds to poll for events.
     */
    readonly eventPollMs?: pulumi.Input<number>;
    /**
     * The rate in milliseconds to poll for LKE events.
     */
    readonly lkeEventPollMs?: pulumi.Input<number>;
    /**
     * The rate in milliseconds to poll for an LKE node to be ready.
     */
    readonly lkeNodeReadyPollMs?: pulumi.Input<number>;
    /**
     * Maximum delay in milliseconds before retrying a request.
     */
    readonly maxRetryDelayMs?: pulumi.Input<number>;
    /**
     * Minimum delay in milliseconds before retrying a request.
     */
    readonly minRetryDelayMs?: pulumi.Input<number>;
    /**
     * Skip waiting for a linode_instance resource to finish deleting.
     */
    readonly skipInstanceDeletePoll?: pulumi.Input<boolean>;
    /**
     * Skip waiting for a linode_instance resource to be running.
     */
    readonly skipInstanceReadyPoll?: pulumi.Input<boolean>;
    /**
     * The token that allows you access to your Linode account
     */
    readonly token: pulumi.Input<string>;
    /**
     * An HTTP User-Agent Prefix to prepend in API requests.
     */
    readonly uaPrefix?: pulumi.Input<string>;
    /**
     * The HTTP(S) API address of the Linode API to use.
     */
    readonly url?: pulumi.Input<string>;
}
