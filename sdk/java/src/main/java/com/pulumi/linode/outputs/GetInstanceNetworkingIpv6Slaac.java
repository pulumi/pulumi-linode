// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.linode.outputs.GetInstanceNetworkingIpv6SlaacVpcNat11;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetInstanceNetworkingIpv6Slaac {
    /**
     * @return The address.
     * 
     */
    private String address;
    /**
     * @return The default gateway for this address.
     * 
     */
    private String gateway;
    /**
     * @return The Linode instance&#39;s ID.
     * 
     */
    private Integer linodeId;
    /**
     * @return The network prefix.
     * 
     */
    private Integer prefix;
    /**
     * @return Whether this is a public or private IP address.
     * 
     */
    private Boolean public_;
    /**
     * @return The reverse DNS assigned to this address.
     * 
     */
    private String rdns;
    /**
     * @return (Filterable) The Region this address resides in.
     * 
     */
    private String region;
    /**
     * @return The subnet mask.
     * 
     */
    private String subnetMask;
    /**
     * @return The type of address this is.
     * 
     */
    private String type;
    private GetInstanceNetworkingIpv6SlaacVpcNat11 vpcNat11;

    private GetInstanceNetworkingIpv6Slaac() {}
    /**
     * @return The address.
     * 
     */
    public String address() {
        return this.address;
    }
    /**
     * @return The default gateway for this address.
     * 
     */
    public String gateway() {
        return this.gateway;
    }
    /**
     * @return The Linode instance&#39;s ID.
     * 
     */
    public Integer linodeId() {
        return this.linodeId;
    }
    /**
     * @return The network prefix.
     * 
     */
    public Integer prefix() {
        return this.prefix;
    }
    /**
     * @return Whether this is a public or private IP address.
     * 
     */
    public Boolean public_() {
        return this.public_;
    }
    /**
     * @return The reverse DNS assigned to this address.
     * 
     */
    public String rdns() {
        return this.rdns;
    }
    /**
     * @return (Filterable) The Region this address resides in.
     * 
     */
    public String region() {
        return this.region;
    }
    /**
     * @return The subnet mask.
     * 
     */
    public String subnetMask() {
        return this.subnetMask;
    }
    /**
     * @return The type of address this is.
     * 
     */
    public String type() {
        return this.type;
    }
    public GetInstanceNetworkingIpv6SlaacVpcNat11 vpcNat11() {
        return this.vpcNat11;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceNetworkingIpv6Slaac defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String address;
        private String gateway;
        private Integer linodeId;
        private Integer prefix;
        private Boolean public_;
        private String rdns;
        private String region;
        private String subnetMask;
        private String type;
        private GetInstanceNetworkingIpv6SlaacVpcNat11 vpcNat11;
        public Builder() {}
        public Builder(GetInstanceNetworkingIpv6Slaac defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.gateway = defaults.gateway;
    	      this.linodeId = defaults.linodeId;
    	      this.prefix = defaults.prefix;
    	      this.public_ = defaults.public_;
    	      this.rdns = defaults.rdns;
    	      this.region = defaults.region;
    	      this.subnetMask = defaults.subnetMask;
    	      this.type = defaults.type;
    	      this.vpcNat11 = defaults.vpcNat11;
        }

        @CustomType.Setter
        public Builder address(String address) {
            this.address = Objects.requireNonNull(address);
            return this;
        }
        @CustomType.Setter
        public Builder gateway(String gateway) {
            this.gateway = Objects.requireNonNull(gateway);
            return this;
        }
        @CustomType.Setter
        public Builder linodeId(Integer linodeId) {
            this.linodeId = Objects.requireNonNull(linodeId);
            return this;
        }
        @CustomType.Setter
        public Builder prefix(Integer prefix) {
            this.prefix = Objects.requireNonNull(prefix);
            return this;
        }
        @CustomType.Setter("public")
        public Builder public_(Boolean public_) {
            this.public_ = Objects.requireNonNull(public_);
            return this;
        }
        @CustomType.Setter
        public Builder rdns(String rdns) {
            this.rdns = Objects.requireNonNull(rdns);
            return this;
        }
        @CustomType.Setter
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        @CustomType.Setter
        public Builder subnetMask(String subnetMask) {
            this.subnetMask = Objects.requireNonNull(subnetMask);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        @CustomType.Setter
        public Builder vpcNat11(GetInstanceNetworkingIpv6SlaacVpcNat11 vpcNat11) {
            this.vpcNat11 = Objects.requireNonNull(vpcNat11);
            return this;
        }
        public GetInstanceNetworkingIpv6Slaac build() {
            final var _resultValue = new GetInstanceNetworkingIpv6Slaac();
            _resultValue.address = address;
            _resultValue.gateway = gateway;
            _resultValue.linodeId = linodeId;
            _resultValue.prefix = prefix;
            _resultValue.public_ = public_;
            _resultValue.rdns = rdns;
            _resultValue.region = region;
            _resultValue.subnetMask = subnetMask;
            _resultValue.type = type;
            _resultValue.vpcNat11 = vpcNat11;
            return _resultValue;
        }
    }
}
