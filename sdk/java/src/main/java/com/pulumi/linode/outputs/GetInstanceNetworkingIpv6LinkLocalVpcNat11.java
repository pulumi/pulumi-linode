// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetInstanceNetworkingIpv6LinkLocalVpcNat11 {
    /**
     * @return The address.
     * 
     */
    private String address;
    private Integer subnetId;
    private Integer vpcId;

    private GetInstanceNetworkingIpv6LinkLocalVpcNat11() {}
    /**
     * @return The address.
     * 
     */
    public String address() {
        return this.address;
    }
    public Integer subnetId() {
        return this.subnetId;
    }
    public Integer vpcId() {
        return this.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceNetworkingIpv6LinkLocalVpcNat11 defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String address;
        private Integer subnetId;
        private Integer vpcId;
        public Builder() {}
        public Builder(GetInstanceNetworkingIpv6LinkLocalVpcNat11 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.subnetId = defaults.subnetId;
    	      this.vpcId = defaults.vpcId;
        }

        @CustomType.Setter
        public Builder address(String address) {
            this.address = Objects.requireNonNull(address);
            return this;
        }
        @CustomType.Setter
        public Builder subnetId(Integer subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }
        @CustomType.Setter
        public Builder vpcId(Integer vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }
        public GetInstanceNetworkingIpv6LinkLocalVpcNat11 build() {
            final var o = new GetInstanceNetworkingIpv6LinkLocalVpcNat11();
            o.address = address;
            o.subnetId = subnetId;
            o.vpcId = vpcId;
            return o;
        }
    }
}
