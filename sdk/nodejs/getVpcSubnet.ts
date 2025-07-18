// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides information about a Linode VPC subnet.
 * For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-vpc-subnet).
 *
 * ## Example Usage
 *
 * The following example shows how one might use this data source to access information about a Linode VPC subnet.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const foo = linode.getVpcSubnet({
 *     vpcId: 123,
 *     id: "12345",
 * });
 * export const vpcSubnet = foo;
 * ```
 */
export function getVpcSubnet(args: GetVpcSubnetArgs, opts?: pulumi.InvokeOptions): Promise<GetVpcSubnetResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("linode:index/getVpcSubnet:getVpcSubnet", {
        "id": args.id,
        "vpcId": args.vpcId,
    }, opts);
}

/**
 * A collection of arguments for invoking getVpcSubnet.
 */
export interface GetVpcSubnetArgs {
    /**
     * The unique id of this VPC subnet.
     */
    id: string;
    /**
     * The id of the parent VPC for this VPC Subnet.
     */
    vpcId: number;
}

/**
 * A collection of values returned by getVpcSubnet.
 */
export interface GetVpcSubnetResult {
    /**
     * The date and time when the VPC Subnet was created.
     */
    readonly created: string;
    readonly id: string;
    /**
     * The IPv4 range of this subnet in CIDR format.
     */
    readonly ipv4: string;
    /**
     * The label of the VPC subnet.
     */
    readonly label: string;
    /**
     * A list of Linode IDs that added to this subnet.
     */
    readonly linodes: outputs.GetVpcSubnetLinode[];
    /**
     * The date and time when the VPC Subnet was last updated.
     */
    readonly updated: string;
    readonly vpcId: number;
}
/**
 * Provides information about a Linode VPC subnet.
 * For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-vpc-subnet).
 *
 * ## Example Usage
 *
 * The following example shows how one might use this data source to access information about a Linode VPC subnet.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as linode from "@pulumi/linode";
 *
 * const foo = linode.getVpcSubnet({
 *     vpcId: 123,
 *     id: "12345",
 * });
 * export const vpcSubnet = foo;
 * ```
 */
export function getVpcSubnetOutput(args: GetVpcSubnetOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetVpcSubnetResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("linode:index/getVpcSubnet:getVpcSubnet", {
        "id": args.id,
        "vpcId": args.vpcId,
    }, opts);
}

/**
 * A collection of arguments for invoking getVpcSubnet.
 */
export interface GetVpcSubnetOutputArgs {
    /**
     * The unique id of this VPC subnet.
     */
    id: pulumi.Input<string>;
    /**
     * The id of the parent VPC for this VPC Subnet.
     */
    vpcId: pulumi.Input<number>;
}
