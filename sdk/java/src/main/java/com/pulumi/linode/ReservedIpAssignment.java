// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.linode.ReservedIpAssignmentArgs;
import com.pulumi.linode.Utilities;
import com.pulumi.linode.inputs.ReservedIpAssignmentState;
import com.pulumi.linode.outputs.ReservedIpAssignmentVpcNat11;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="linode:index/reservedIpAssignment:ReservedIpAssignment")
public class ReservedIpAssignment extends com.pulumi.resources.CustomResource {
    /**
     * The resulting IPv4 address.
     * 
     */
    @Export(name="address", refs={String.class}, tree="[0]")
    private Output<String> address;

    /**
     * @return The resulting IPv4 address.
     * 
     */
    public Output<String> address() {
        return this.address;
    }
    /**
     * If true, the instance will be rebooted to update network interfaces. This functionality is not affected by the
     * `skip_implicit_reboots` provider argument.
     * 
     */
    @Export(name="applyImmediately", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> applyImmediately;

    /**
     * @return If true, the instance will be rebooted to update network interfaces. This functionality is not affected by the
     * `skip_implicit_reboots` provider argument.
     * 
     */
    public Output<Boolean> applyImmediately() {
        return this.applyImmediately;
    }
    /**
     * The default gateway for this address
     * 
     */
    @Export(name="gateway", refs={String.class}, tree="[0]")
    private Output<String> gateway;

    /**
     * @return The default gateway for this address
     * 
     */
    public Output<String> gateway() {
        return this.gateway;
    }
    /**
     * The ID of the Linode to allocate an IPv4 address for.
     * 
     */
    @Export(name="linodeId", refs={Integer.class}, tree="[0]")
    private Output<Integer> linodeId;

    /**
     * @return The ID of the Linode to allocate an IPv4 address for.
     * 
     */
    public Output<Integer> linodeId() {
        return this.linodeId;
    }
    /**
     * The number of bits set in the subnet mask.
     * 
     */
    @Export(name="prefix", refs={Integer.class}, tree="[0]")
    private Output<Integer> prefix;

    /**
     * @return The number of bits set in the subnet mask.
     * 
     */
    public Output<Integer> prefix() {
        return this.prefix;
    }
    /**
     * Whether the IPv4 address is public or private.
     * 
     */
    @Export(name="public", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> public_;

    /**
     * @return Whether the IPv4 address is public or private.
     * 
     */
    public Output<Boolean> public_() {
        return this.public_;
    }
    /**
     * The reverse DNS assigned to this address.
     * 
     */
    @Export(name="rdns", refs={String.class}, tree="[0]")
    private Output<String> rdns;

    /**
     * @return The reverse DNS assigned to this address.
     * 
     */
    public Output<String> rdns() {
        return this.rdns;
    }
    /**
     * The region this IP resides in.
     * 
     */
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output<String> region;

    /**
     * @return The region this IP resides in.
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * The reservation status of the IP address
     * 
     */
    @Export(name="reserved", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> reserved;

    /**
     * @return The reservation status of the IP address
     * 
     */
    public Output<Boolean> reserved() {
        return this.reserved;
    }
    /**
     * The mask that separates host bits from network bits for this address.
     * 
     */
    @Export(name="subnetMask", refs={String.class}, tree="[0]")
    private Output<String> subnetMask;

    /**
     * @return The mask that separates host bits from network bits for this address.
     * 
     */
    public Output<String> subnetMask() {
        return this.subnetMask;
    }
    /**
     * The type of IP address.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return The type of IP address.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * Contains information about the NAT 1:1 mapping of a public IP address to a VPC subnet.
     * 
     */
    @Export(name="vpcNat11s", refs={List.class,ReservedIpAssignmentVpcNat11.class}, tree="[0,1]")
    private Output<List<ReservedIpAssignmentVpcNat11>> vpcNat11s;

    /**
     * @return Contains information about the NAT 1:1 mapping of a public IP address to a VPC subnet.
     * 
     */
    public Output<List<ReservedIpAssignmentVpcNat11>> vpcNat11s() {
        return this.vpcNat11s;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ReservedIpAssignment(java.lang.String name) {
        this(name, ReservedIpAssignmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ReservedIpAssignment(java.lang.String name, ReservedIpAssignmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ReservedIpAssignment(java.lang.String name, ReservedIpAssignmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("linode:index/reservedIpAssignment:ReservedIpAssignment", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ReservedIpAssignment(java.lang.String name, Output<java.lang.String> id, @Nullable ReservedIpAssignmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("linode:index/reservedIpAssignment:ReservedIpAssignment", name, state, makeResourceOptions(options, id), false);
    }

    private static ReservedIpAssignmentArgs makeArgs(ReservedIpAssignmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ReservedIpAssignmentArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ReservedIpAssignment get(java.lang.String name, Output<java.lang.String> id, @Nullable ReservedIpAssignmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ReservedIpAssignment(name, id, state, options);
    }
}
