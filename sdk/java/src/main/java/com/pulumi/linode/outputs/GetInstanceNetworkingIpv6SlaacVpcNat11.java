// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetInstanceNetworkingIpv6SlaacVpcNat11 {
    /**
     * @return The address.
     * 
     */
    private String address;
    /**
     * @return The unique globally general API entity identifier for the VPC subnet.
     * 
     */
    private Integer subnetId;
    /**
     * @return The unique globally general API entity identifier for the VPC.
     * 
     */
    private Integer vpcId;

    private GetInstanceNetworkingIpv6SlaacVpcNat11() {}
    /**
     * @return The address.
     * 
     */
    public String address() {
        return this.address;
    }
    /**
     * @return The unique globally general API entity identifier for the VPC subnet.
     * 
     */
    public Integer subnetId() {
        return this.subnetId;
    }
    /**
     * @return The unique globally general API entity identifier for the VPC.
     * 
     */
    public Integer vpcId() {
        return this.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceNetworkingIpv6SlaacVpcNat11 defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String address;
        private Integer subnetId;
        private Integer vpcId;
        public Builder() {}
        public Builder(GetInstanceNetworkingIpv6SlaacVpcNat11 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.subnetId = defaults.subnetId;
    	      this.vpcId = defaults.vpcId;
        }

        @CustomType.Setter
        public Builder address(String address) {
            if (address == null) {
              throw new MissingRequiredPropertyException("GetInstanceNetworkingIpv6SlaacVpcNat11", "address");
            }
            this.address = address;
            return this;
        }
        @CustomType.Setter
        public Builder subnetId(Integer subnetId) {
            if (subnetId == null) {
              throw new MissingRequiredPropertyException("GetInstanceNetworkingIpv6SlaacVpcNat11", "subnetId");
            }
            this.subnetId = subnetId;
            return this;
        }
        @CustomType.Setter
        public Builder vpcId(Integer vpcId) {
            if (vpcId == null) {
              throw new MissingRequiredPropertyException("GetInstanceNetworkingIpv6SlaacVpcNat11", "vpcId");
            }
            this.vpcId = vpcId;
            return this;
        }
        public GetInstanceNetworkingIpv6SlaacVpcNat11 build() {
            final var _resultValue = new GetInstanceNetworkingIpv6SlaacVpcNat11();
            _resultValue.address = address;
            _resultValue.subnetId = subnetId;
            _resultValue.vpcId = vpcId;
            return _resultValue;
        }
    }
}
