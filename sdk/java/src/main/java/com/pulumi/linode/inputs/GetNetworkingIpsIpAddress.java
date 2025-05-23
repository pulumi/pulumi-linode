// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.linode.inputs.GetNetworkingIpsIpAddressVpcNat11;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetNetworkingIpsIpAddress extends com.pulumi.resources.InvokeArgs {

    public static final GetNetworkingIpsIpAddress Empty = new GetNetworkingIpsIpAddress();

    /**
     * The IPv4 address that is configured as a 1:1 NAT for this VPC interface.
     * 
     */
    @Import(name="address", required=true)
    private String address;

    /**
     * @return The IPv4 address that is configured as a 1:1 NAT for this VPC interface.
     * 
     */
    public String address() {
        return this.address;
    }

    /**
     * The default gateway for this address.
     * 
     */
    @Import(name="gateway", required=true)
    private String gateway;

    /**
     * @return The default gateway for this address.
     * 
     */
    public String gateway() {
        return this.gateway;
    }

    /**
     * The ID of the Linode this address currently belongs to.
     * 
     */
    @Import(name="linodeId", required=true)
    private Integer linodeId;

    /**
     * @return The ID of the Linode this address currently belongs to.
     * 
     */
    public Integer linodeId() {
        return this.linodeId;
    }

    /**
     * The number of bits set in the subnet mask.
     * 
     */
    @Import(name="prefix", required=true)
    private Integer prefix;

    /**
     * @return The number of bits set in the subnet mask.
     * 
     */
    public Integer prefix() {
        return this.prefix;
    }

    /**
     * Whether this is a public or private IP address.
     * 
     */
    @Import(name="public", required=true)
    private Boolean public_;

    /**
     * @return Whether this is a public or private IP address.
     * 
     */
    public Boolean public_() {
        return this.public_;
    }

    /**
     * The reverse DNS assigned to this address. For public IPv4 addresses, this will be set to a default value provided by Linode if not explicitly set.
     * 
     */
    @Import(name="rdns", required=true)
    private String rdns;

    /**
     * @return The reverse DNS assigned to this address. For public IPv4 addresses, this will be set to a default value provided by Linode if not explicitly set.
     * 
     */
    public String rdns() {
        return this.rdns;
    }

    /**
     * The Region this IP address resides in. See all regions [here](https://api.linode.com/v4/regions).
     * 
     */
    @Import(name="region", required=true)
    private String region;

    /**
     * @return The Region this IP address resides in. See all regions [here](https://api.linode.com/v4/regions).
     * 
     */
    public String region() {
        return this.region;
    }

    /**
     * Whether this IP address is a reserved IP.
     * 
     */
    @Import(name="reserved", required=true)
    private Boolean reserved;

    /**
     * @return Whether this IP address is a reserved IP.
     * 
     */
    public Boolean reserved() {
        return this.reserved;
    }

    /**
     * The mask that separates host bits from network bits for this address.
     * 
     */
    @Import(name="subnetMask", required=true)
    private String subnetMask;

    /**
     * @return The mask that separates host bits from network bits for this address.
     * 
     */
    public String subnetMask() {
        return this.subnetMask;
    }

    /**
     * The type of address this is (ipv4, ipv6, ipv6/pool, ipv6/range).
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return The type of address this is (ipv4, ipv6, ipv6/pool, ipv6/range).
     * 
     */
    public String type() {
        return this.type;
    }

    /**
     * Contains information about the NAT 1:1 mapping of a public IP address to a VPC subnet.
     * 
     */
    @Import(name="vpcNat11", required=true)
    private GetNetworkingIpsIpAddressVpcNat11 vpcNat11;

    /**
     * @return Contains information about the NAT 1:1 mapping of a public IP address to a VPC subnet.
     * 
     */
    public GetNetworkingIpsIpAddressVpcNat11 vpcNat11() {
        return this.vpcNat11;
    }

    private GetNetworkingIpsIpAddress() {}

    private GetNetworkingIpsIpAddress(GetNetworkingIpsIpAddress $) {
        this.address = $.address;
        this.gateway = $.gateway;
        this.linodeId = $.linodeId;
        this.prefix = $.prefix;
        this.public_ = $.public_;
        this.rdns = $.rdns;
        this.region = $.region;
        this.reserved = $.reserved;
        this.subnetMask = $.subnetMask;
        this.type = $.type;
        this.vpcNat11 = $.vpcNat11;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNetworkingIpsIpAddress defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNetworkingIpsIpAddress $;

        public Builder() {
            $ = new GetNetworkingIpsIpAddress();
        }

        public Builder(GetNetworkingIpsIpAddress defaults) {
            $ = new GetNetworkingIpsIpAddress(Objects.requireNonNull(defaults));
        }

        /**
         * @param address The IPv4 address that is configured as a 1:1 NAT for this VPC interface.
         * 
         * @return builder
         * 
         */
        public Builder address(String address) {
            $.address = address;
            return this;
        }

        /**
         * @param gateway The default gateway for this address.
         * 
         * @return builder
         * 
         */
        public Builder gateway(String gateway) {
            $.gateway = gateway;
            return this;
        }

        /**
         * @param linodeId The ID of the Linode this address currently belongs to.
         * 
         * @return builder
         * 
         */
        public Builder linodeId(Integer linodeId) {
            $.linodeId = linodeId;
            return this;
        }

        /**
         * @param prefix The number of bits set in the subnet mask.
         * 
         * @return builder
         * 
         */
        public Builder prefix(Integer prefix) {
            $.prefix = prefix;
            return this;
        }

        /**
         * @param public_ Whether this is a public or private IP address.
         * 
         * @return builder
         * 
         */
        public Builder public_(Boolean public_) {
            $.public_ = public_;
            return this;
        }

        /**
         * @param rdns The reverse DNS assigned to this address. For public IPv4 addresses, this will be set to a default value provided by Linode if not explicitly set.
         * 
         * @return builder
         * 
         */
        public Builder rdns(String rdns) {
            $.rdns = rdns;
            return this;
        }

        /**
         * @param region The Region this IP address resides in. See all regions [here](https://api.linode.com/v4/regions).
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            $.region = region;
            return this;
        }

        /**
         * @param reserved Whether this IP address is a reserved IP.
         * 
         * @return builder
         * 
         */
        public Builder reserved(Boolean reserved) {
            $.reserved = reserved;
            return this;
        }

        /**
         * @param subnetMask The mask that separates host bits from network bits for this address.
         * 
         * @return builder
         * 
         */
        public Builder subnetMask(String subnetMask) {
            $.subnetMask = subnetMask;
            return this;
        }

        /**
         * @param type The type of address this is (ipv4, ipv6, ipv6/pool, ipv6/range).
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        /**
         * @param vpcNat11 Contains information about the NAT 1:1 mapping of a public IP address to a VPC subnet.
         * 
         * @return builder
         * 
         */
        public Builder vpcNat11(GetNetworkingIpsIpAddressVpcNat11 vpcNat11) {
            $.vpcNat11 = vpcNat11;
            return this;
        }

        public GetNetworkingIpsIpAddress build() {
            if ($.address == null) {
                throw new MissingRequiredPropertyException("GetNetworkingIpsIpAddress", "address");
            }
            if ($.gateway == null) {
                throw new MissingRequiredPropertyException("GetNetworkingIpsIpAddress", "gateway");
            }
            if ($.linodeId == null) {
                throw new MissingRequiredPropertyException("GetNetworkingIpsIpAddress", "linodeId");
            }
            if ($.prefix == null) {
                throw new MissingRequiredPropertyException("GetNetworkingIpsIpAddress", "prefix");
            }
            if ($.public_ == null) {
                throw new MissingRequiredPropertyException("GetNetworkingIpsIpAddress", "public_");
            }
            if ($.rdns == null) {
                throw new MissingRequiredPropertyException("GetNetworkingIpsIpAddress", "rdns");
            }
            if ($.region == null) {
                throw new MissingRequiredPropertyException("GetNetworkingIpsIpAddress", "region");
            }
            if ($.reserved == null) {
                throw new MissingRequiredPropertyException("GetNetworkingIpsIpAddress", "reserved");
            }
            if ($.subnetMask == null) {
                throw new MissingRequiredPropertyException("GetNetworkingIpsIpAddress", "subnetMask");
            }
            if ($.type == null) {
                throw new MissingRequiredPropertyException("GetNetworkingIpsIpAddress", "type");
            }
            if ($.vpcNat11 == null) {
                throw new MissingRequiredPropertyException("GetNetworkingIpsIpAddress", "vpcNat11");
            }
            return $;
        }
    }

}
