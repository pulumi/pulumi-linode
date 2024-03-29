// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.linode.inputs.VpcSubnetLinodeInterfaceArgs;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;


public final class VpcSubnetLinodeArgs extends com.pulumi.resources.ResourceArgs {

    public static final VpcSubnetLinodeArgs Empty = new VpcSubnetLinodeArgs();

    /**
     * The ID of the VPC Subnet.
     * 
     */
    @Import(name="id", required=true)
    private Output<Integer> id;

    /**
     * @return The ID of the VPC Subnet.
     * 
     */
    public Output<Integer> id() {
        return this.id;
    }

    @Import(name="interfaces", required=true)
    private Output<List<VpcSubnetLinodeInterfaceArgs>> interfaces;

    public Output<List<VpcSubnetLinodeInterfaceArgs>> interfaces() {
        return this.interfaces;
    }

    private VpcSubnetLinodeArgs() {}

    private VpcSubnetLinodeArgs(VpcSubnetLinodeArgs $) {
        this.id = $.id;
        this.interfaces = $.interfaces;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VpcSubnetLinodeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VpcSubnetLinodeArgs $;

        public Builder() {
            $ = new VpcSubnetLinodeArgs();
        }

        public Builder(VpcSubnetLinodeArgs defaults) {
            $ = new VpcSubnetLinodeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ID of the VPC Subnet.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<Integer> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of the VPC Subnet.
         * 
         * @return builder
         * 
         */
        public Builder id(Integer id) {
            return id(Output.of(id));
        }

        public Builder interfaces(Output<List<VpcSubnetLinodeInterfaceArgs>> interfaces) {
            $.interfaces = interfaces;
            return this;
        }

        public Builder interfaces(List<VpcSubnetLinodeInterfaceArgs> interfaces) {
            return interfaces(Output.of(interfaces));
        }

        public Builder interfaces(VpcSubnetLinodeInterfaceArgs... interfaces) {
            return interfaces(List.of(interfaces));
        }

        public VpcSubnetLinodeArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("VpcSubnetLinodeArgs", "id");
            }
            if ($.interfaces == null) {
                throw new MissingRequiredPropertyException("VpcSubnetLinodeArgs", "interfaces");
            }
            return $;
        }
    }

}
