// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides details about the networking configuration of an Instance.
 */
export function getInstanceNetworking(args: GetInstanceNetworkingArgs, opts?: pulumi.InvokeOptions): Promise<GetInstanceNetworkingResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("linode:index/getInstanceNetworking:getInstanceNetworking", {
        "linodeId": args.linodeId,
    }, opts);
}

/**
 * A collection of arguments for invoking getInstanceNetworking.
 */
export interface GetInstanceNetworkingArgs {
    /**
     * The Linode instance's ID.
     */
    linodeId: number;
}

/**
 * A collection of values returned by getInstanceNetworking.
 */
export interface GetInstanceNetworkingResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ipv4s: outputs.GetInstanceNetworkingIpv4[];
    readonly ipv6s: outputs.GetInstanceNetworkingIpv6[];
    /**
     * The ID of the Linode this address currently belongs to.
     */
    readonly linodeId: number;
}
/**
 * Provides details about the networking configuration of an Instance.
 */
export function getInstanceNetworkingOutput(args: GetInstanceNetworkingOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetInstanceNetworkingResult> {
    return pulumi.output(args).apply((a: any) => getInstanceNetworking(a, opts))
}

/**
 * A collection of arguments for invoking getInstanceNetworking.
 */
export interface GetInstanceNetworkingOutputArgs {
    /**
     * The Linode instance's ID.
     */
    linodeId: pulumi.Input<number>;
}
