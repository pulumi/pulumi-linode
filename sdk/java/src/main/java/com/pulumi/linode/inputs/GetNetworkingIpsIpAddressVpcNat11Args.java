// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetNetworkingIpsIpAddressVpcNat11Args extends com.pulumi.resources.ResourceArgs {

    public static final GetNetworkingIpsIpAddressVpcNat11Args Empty = new GetNetworkingIpsIpAddressVpcNat11Args();

    /**
     * The IPv4 address that is configured as a 1:1 NAT for this VPC interface.
     * 
     */
    @Import(name="address", required=true)
    private Output<String> address;

    /**
     * @return The IPv4 address that is configured as a 1:1 NAT for this VPC interface.
     * 
     */
    public Output<String> address() {
        return this.address;
    }

    /**
     * The `id` of the VPC Subnet for this Interface.
     * 
     */
    @Import(name="subnetId", required=true)
    private Output<Integer> subnetId;

    /**
     * @return The `id` of the VPC Subnet for this Interface.
     * 
     */
    public Output<Integer> subnetId() {
        return this.subnetId;
    }

    /**
     * The `id` of the VPC configured for this Interface.
     * 
     */
    @Import(name="vpcId", required=true)
    private Output<Integer> vpcId;

    /**
     * @return The `id` of the VPC configured for this Interface.
     * 
     */
    public Output<Integer> vpcId() {
        return this.vpcId;
    }

    private GetNetworkingIpsIpAddressVpcNat11Args() {}

    private GetNetworkingIpsIpAddressVpcNat11Args(GetNetworkingIpsIpAddressVpcNat11Args $) {
        this.address = $.address;
        this.subnetId = $.subnetId;
        this.vpcId = $.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNetworkingIpsIpAddressVpcNat11Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNetworkingIpsIpAddressVpcNat11Args $;

        public Builder() {
            $ = new GetNetworkingIpsIpAddressVpcNat11Args();
        }

        public Builder(GetNetworkingIpsIpAddressVpcNat11Args defaults) {
            $ = new GetNetworkingIpsIpAddressVpcNat11Args(Objects.requireNonNull(defaults));
        }

        /**
         * @param address The IPv4 address that is configured as a 1:1 NAT for this VPC interface.
         * 
         * @return builder
         * 
         */
        public Builder address(Output<String> address) {
            $.address = address;
            return this;
        }

        /**
         * @param address The IPv4 address that is configured as a 1:1 NAT for this VPC interface.
         * 
         * @return builder
         * 
         */
        public Builder address(String address) {
            return address(Output.of(address));
        }

        /**
         * @param subnetId The `id` of the VPC Subnet for this Interface.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(Output<Integer> subnetId) {
            $.subnetId = subnetId;
            return this;
        }

        /**
         * @param subnetId The `id` of the VPC Subnet for this Interface.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(Integer subnetId) {
            return subnetId(Output.of(subnetId));
        }

        /**
         * @param vpcId The `id` of the VPC configured for this Interface.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(Output<Integer> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        /**
         * @param vpcId The `id` of the VPC configured for this Interface.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(Integer vpcId) {
            return vpcId(Output.of(vpcId));
        }

        public GetNetworkingIpsIpAddressVpcNat11Args build() {
            if ($.address == null) {
                throw new MissingRequiredPropertyException("GetNetworkingIpsIpAddressVpcNat11Args", "address");
            }
            if ($.subnetId == null) {
                throw new MissingRequiredPropertyException("GetNetworkingIpsIpAddressVpcNat11Args", "subnetId");
            }
            if ($.vpcId == null) {
                throw new MissingRequiredPropertyException("GetNetworkingIpsIpAddressVpcNat11Args", "vpcId");
            }
            return $;
        }
    }

}
