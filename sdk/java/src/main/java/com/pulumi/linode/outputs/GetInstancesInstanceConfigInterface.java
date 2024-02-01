// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.linode.outputs.GetInstancesInstanceConfigInterfaceIpv4;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetInstancesInstanceConfigInterface {
    /**
     * @return Whether this interface is currently booted and active.
     * 
     */
    private Boolean active;
    /**
     * @return The ID of the disk in the Linode API.
     * 
     */
    private Integer id;
    /**
     * @return IPv4 CIDR VPC Subnet ranges that are routed to this Interface. IPv6 ranges are also available to select participants in the Beta program.
     * 
     */
    private @Nullable List<String> ipRanges;
    /**
     * @return This Network Interface’s private IP address in Classless Inter-Domain Routing (CIDR) notation. (e.g. `10.0.0.1/24`) This field is only allowed for interfaces with the `vlan` purpose.
     * 
     */
    private @Nullable String ipamAddress;
    /**
     * @return This Linode&#39;s IPv4 Addresses. Each Linode is assigned a single public IPv4 address upon creation, and may get a single private IPv4 address if needed. You may need to open a support ticket to get additional IPv4 addresses.
     * 
     */
    private GetInstancesInstanceConfigInterfaceIpv4 ipv4;
    /**
     * @return The name of the VLAN to join. This field is only allowed and required for interfaces with the `vlan` purpose.
     * 
     */
    private @Nullable String label;
    /**
     * @return Whether the interface is the primary interface that should have the default route for this Linode. This field is only allowed for interfaces with the `public` or `vpc` purpose.
     * 
     */
    private @Nullable Boolean primary;
    /**
     * @return The type of interface. (`public`, `vlan`, `vpc`)
     * 
     */
    private String purpose;
    /**
     * @return The name of the VPC Subnet to join. This field is only allowed and required for interfaces with the `vpc` purpose.
     * 
     */
    private @Nullable Integer subnetId;
    /**
     * @return The ID of VPC which this interface is attached to.
     * 
     */
    private Integer vpcId;

    private GetInstancesInstanceConfigInterface() {}
    /**
     * @return Whether this interface is currently booted and active.
     * 
     */
    public Boolean active() {
        return this.active;
    }
    /**
     * @return The ID of the disk in the Linode API.
     * 
     */
    public Integer id() {
        return this.id;
    }
    /**
     * @return IPv4 CIDR VPC Subnet ranges that are routed to this Interface. IPv6 ranges are also available to select participants in the Beta program.
     * 
     */
    public List<String> ipRanges() {
        return this.ipRanges == null ? List.of() : this.ipRanges;
    }
    /**
     * @return This Network Interface’s private IP address in Classless Inter-Domain Routing (CIDR) notation. (e.g. `10.0.0.1/24`) This field is only allowed for interfaces with the `vlan` purpose.
     * 
     */
    public Optional<String> ipamAddress() {
        return Optional.ofNullable(this.ipamAddress);
    }
    /**
     * @return This Linode&#39;s IPv4 Addresses. Each Linode is assigned a single public IPv4 address upon creation, and may get a single private IPv4 address if needed. You may need to open a support ticket to get additional IPv4 addresses.
     * 
     */
    public GetInstancesInstanceConfigInterfaceIpv4 ipv4() {
        return this.ipv4;
    }
    /**
     * @return The name of the VLAN to join. This field is only allowed and required for interfaces with the `vlan` purpose.
     * 
     */
    public Optional<String> label() {
        return Optional.ofNullable(this.label);
    }
    /**
     * @return Whether the interface is the primary interface that should have the default route for this Linode. This field is only allowed for interfaces with the `public` or `vpc` purpose.
     * 
     */
    public Optional<Boolean> primary() {
        return Optional.ofNullable(this.primary);
    }
    /**
     * @return The type of interface. (`public`, `vlan`, `vpc`)
     * 
     */
    public String purpose() {
        return this.purpose;
    }
    /**
     * @return The name of the VPC Subnet to join. This field is only allowed and required for interfaces with the `vpc` purpose.
     * 
     */
    public Optional<Integer> subnetId() {
        return Optional.ofNullable(this.subnetId);
    }
    /**
     * @return The ID of VPC which this interface is attached to.
     * 
     */
    public Integer vpcId() {
        return this.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstancesInstanceConfigInterface defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean active;
        private Integer id;
        private @Nullable List<String> ipRanges;
        private @Nullable String ipamAddress;
        private GetInstancesInstanceConfigInterfaceIpv4 ipv4;
        private @Nullable String label;
        private @Nullable Boolean primary;
        private String purpose;
        private @Nullable Integer subnetId;
        private Integer vpcId;
        public Builder() {}
        public Builder(GetInstancesInstanceConfigInterface defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.active = defaults.active;
    	      this.id = defaults.id;
    	      this.ipRanges = defaults.ipRanges;
    	      this.ipamAddress = defaults.ipamAddress;
    	      this.ipv4 = defaults.ipv4;
    	      this.label = defaults.label;
    	      this.primary = defaults.primary;
    	      this.purpose = defaults.purpose;
    	      this.subnetId = defaults.subnetId;
    	      this.vpcId = defaults.vpcId;
        }

        @CustomType.Setter
        public Builder active(Boolean active) {
            if (active == null) {
              throw new MissingRequiredPropertyException("GetInstancesInstanceConfigInterface", "active");
            }
            this.active = active;
            return this;
        }
        @CustomType.Setter
        public Builder id(Integer id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetInstancesInstanceConfigInterface", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ipRanges(@Nullable List<String> ipRanges) {

            this.ipRanges = ipRanges;
            return this;
        }
        public Builder ipRanges(String... ipRanges) {
            return ipRanges(List.of(ipRanges));
        }
        @CustomType.Setter
        public Builder ipamAddress(@Nullable String ipamAddress) {

            this.ipamAddress = ipamAddress;
            return this;
        }
        @CustomType.Setter
        public Builder ipv4(GetInstancesInstanceConfigInterfaceIpv4 ipv4) {
            if (ipv4 == null) {
              throw new MissingRequiredPropertyException("GetInstancesInstanceConfigInterface", "ipv4");
            }
            this.ipv4 = ipv4;
            return this;
        }
        @CustomType.Setter
        public Builder label(@Nullable String label) {

            this.label = label;
            return this;
        }
        @CustomType.Setter
        public Builder primary(@Nullable Boolean primary) {

            this.primary = primary;
            return this;
        }
        @CustomType.Setter
        public Builder purpose(String purpose) {
            if (purpose == null) {
              throw new MissingRequiredPropertyException("GetInstancesInstanceConfigInterface", "purpose");
            }
            this.purpose = purpose;
            return this;
        }
        @CustomType.Setter
        public Builder subnetId(@Nullable Integer subnetId) {

            this.subnetId = subnetId;
            return this;
        }
        @CustomType.Setter
        public Builder vpcId(Integer vpcId) {
            if (vpcId == null) {
              throw new MissingRequiredPropertyException("GetInstancesInstanceConfigInterface", "vpcId");
            }
            this.vpcId = vpcId;
            return this;
        }
        public GetInstancesInstanceConfigInterface build() {
            final var _resultValue = new GetInstancesInstanceConfigInterface();
            _resultValue.active = active;
            _resultValue.id = id;
            _resultValue.ipRanges = ipRanges;
            _resultValue.ipamAddress = ipamAddress;
            _resultValue.ipv4 = ipv4;
            _resultValue.label = label;
            _resultValue.primary = primary;
            _resultValue.purpose = purpose;
            _resultValue.subnetId = subnetId;
            _resultValue.vpcId = vpcId;
            return _resultValue;
        }
    }
}
