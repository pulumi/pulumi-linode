// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetNetworkingIpsIpAddress {
    /**
     * @return The IP address.
     * 
     */
    private String address;
    /**
     * @return The default gateway for this address.
     * 
     */
    private String gateway;
    /**
     * @return The ID of the Linode this address currently belongs to.
     * 
     */
    private Integer linodeId;
    /**
     * @return The number of bits set in the subnet mask.
     * 
     */
    private Integer prefix;
    /**
     * @return Whether this is a public or private IP address.
     * 
     */
    private Boolean public_;
    /**
     * @return The reverse DNS assigned to this address. For public IPv4 addresses, this will be set to a default value provided by Linode if not explicitly set.
     * 
     */
    private String rdns;
    /**
     * @return The Region this IP address resides in.
     * 
     */
    private String region;
    /**
     * @return Whether this IP is reserved or not.
     * 
     */
    private Boolean reserved;
    /**
     * @return The mask that separates host bits from network bits for this address.
     * 
     */
    private String subnetMask;
    /**
     * @return The type of address this is (ipv4, ipv6, ipv6/pool, ipv6/range).
     * 
     */
    private String type;

    private GetNetworkingIpsIpAddress() {}
    /**
     * @return The IP address.
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
     * @return The ID of the Linode this address currently belongs to.
     * 
     */
    public Integer linodeId() {
        return this.linodeId;
    }
    /**
     * @return The number of bits set in the subnet mask.
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
     * @return The reverse DNS assigned to this address. For public IPv4 addresses, this will be set to a default value provided by Linode if not explicitly set.
     * 
     */
    public String rdns() {
        return this.rdns;
    }
    /**
     * @return The Region this IP address resides in.
     * 
     */
    public String region() {
        return this.region;
    }
    /**
     * @return Whether this IP is reserved or not.
     * 
     */
    public Boolean reserved() {
        return this.reserved;
    }
    /**
     * @return The mask that separates host bits from network bits for this address.
     * 
     */
    public String subnetMask() {
        return this.subnetMask;
    }
    /**
     * @return The type of address this is (ipv4, ipv6, ipv6/pool, ipv6/range).
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkingIpsIpAddress defaults) {
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
        private Boolean reserved;
        private String subnetMask;
        private String type;
        public Builder() {}
        public Builder(GetNetworkingIpsIpAddress defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.gateway = defaults.gateway;
    	      this.linodeId = defaults.linodeId;
    	      this.prefix = defaults.prefix;
    	      this.public_ = defaults.public_;
    	      this.rdns = defaults.rdns;
    	      this.region = defaults.region;
    	      this.reserved = defaults.reserved;
    	      this.subnetMask = defaults.subnetMask;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder address(String address) {
            if (address == null) {
              throw new MissingRequiredPropertyException("GetNetworkingIpsIpAddress", "address");
            }
            this.address = address;
            return this;
        }
        @CustomType.Setter
        public Builder gateway(String gateway) {
            if (gateway == null) {
              throw new MissingRequiredPropertyException("GetNetworkingIpsIpAddress", "gateway");
            }
            this.gateway = gateway;
            return this;
        }
        @CustomType.Setter
        public Builder linodeId(Integer linodeId) {
            if (linodeId == null) {
              throw new MissingRequiredPropertyException("GetNetworkingIpsIpAddress", "linodeId");
            }
            this.linodeId = linodeId;
            return this;
        }
        @CustomType.Setter
        public Builder prefix(Integer prefix) {
            if (prefix == null) {
              throw new MissingRequiredPropertyException("GetNetworkingIpsIpAddress", "prefix");
            }
            this.prefix = prefix;
            return this;
        }
        @CustomType.Setter("public")
        public Builder public_(Boolean public_) {
            if (public_ == null) {
              throw new MissingRequiredPropertyException("GetNetworkingIpsIpAddress", "public_");
            }
            this.public_ = public_;
            return this;
        }
        @CustomType.Setter
        public Builder rdns(String rdns) {
            if (rdns == null) {
              throw new MissingRequiredPropertyException("GetNetworkingIpsIpAddress", "rdns");
            }
            this.rdns = rdns;
            return this;
        }
        @CustomType.Setter
        public Builder region(String region) {
            if (region == null) {
              throw new MissingRequiredPropertyException("GetNetworkingIpsIpAddress", "region");
            }
            this.region = region;
            return this;
        }
        @CustomType.Setter
        public Builder reserved(Boolean reserved) {
            if (reserved == null) {
              throw new MissingRequiredPropertyException("GetNetworkingIpsIpAddress", "reserved");
            }
            this.reserved = reserved;
            return this;
        }
        @CustomType.Setter
        public Builder subnetMask(String subnetMask) {
            if (subnetMask == null) {
              throw new MissingRequiredPropertyException("GetNetworkingIpsIpAddress", "subnetMask");
            }
            this.subnetMask = subnetMask;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetNetworkingIpsIpAddress", "type");
            }
            this.type = type;
            return this;
        }
        public GetNetworkingIpsIpAddress build() {
            final var _resultValue = new GetNetworkingIpsIpAddress();
            _resultValue.address = address;
            _resultValue.gateway = gateway;
            _resultValue.linodeId = linodeId;
            _resultValue.prefix = prefix;
            _resultValue.public_ = public_;
            _resultValue.rdns = rdns;
            _resultValue.region = region;
            _resultValue.reserved = reserved;
            _resultValue.subnetMask = subnetMask;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
