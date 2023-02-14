// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetInstanceNetworkingIpv4Public {
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
     * @return The network prefix.
     * 
     */
    private Integer prefix;
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

    private GetInstanceNetworkingIpv4Public() {}
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
     * @return The network prefix.
     * 
     */
    public Integer prefix() {
        return this.prefix;
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

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceNetworkingIpv4Public defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String address;
        private String gateway;
        private Integer prefix;
        private String rdns;
        private String region;
        private String subnetMask;
        private String type;
        public Builder() {}
        public Builder(GetInstanceNetworkingIpv4Public defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.gateway = defaults.gateway;
    	      this.prefix = defaults.prefix;
    	      this.rdns = defaults.rdns;
    	      this.region = defaults.region;
    	      this.subnetMask = defaults.subnetMask;
    	      this.type = defaults.type;
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
        public Builder prefix(Integer prefix) {
            this.prefix = Objects.requireNonNull(prefix);
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
        public GetInstanceNetworkingIpv4Public build() {
            final var o = new GetInstanceNetworkingIpv4Public();
            o.address = address;
            o.gateway = gateway;
            o.prefix = prefix;
            o.rdns = rdns;
            o.region = region;
            o.subnetMask = subnetMask;
            o.type = type;
            return o;
        }
    }
}
