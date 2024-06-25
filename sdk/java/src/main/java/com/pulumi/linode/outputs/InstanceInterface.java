// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.linode.outputs.InstanceInterfaceIpv4;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InstanceInterface {
    /**
     * @return Whether this interface is currently booted and active.
     * 
     */
    private @Nullable Boolean active;
    /**
     * @return The ID of the Placement Group.
     * 
     */
    private @Nullable Integer id;
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
    private @Nullable InstanceInterfaceIpv4 ipv4;
    /**
     * @return The name of the VLAN to join. This field is only allowed and required for interfaces with the `vlan` purpose.
     * 
     */
    private @Nullable String label;
    /**
     * @return Whether the interface is the primary interface that should have the default route for this Linode. This field is only allowed for interfaces with the `public` or `vpc` purpose.
     * 
     * * `ipv4` - (Optional) The IPv4 configuration of the VPC interface. This field is currently only allowed for interfaces with the `vpc` purpose.
     * 
     * The following computed attribute is available in a VPC interface:
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
    private @Nullable Integer vpcId;

    private InstanceInterface() {}
    /**
     * @return Whether this interface is currently booted and active.
     * 
     */
    public Optional<Boolean> active() {
        return Optional.ofNullable(this.active);
    }
    /**
     * @return The ID of the Placement Group.
     * 
     */
    public Optional<Integer> id() {
        return Optional.ofNullable(this.id);
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
    public Optional<InstanceInterfaceIpv4> ipv4() {
        return Optional.ofNullable(this.ipv4);
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
     * * `ipv4` - (Optional) The IPv4 configuration of the VPC interface. This field is currently only allowed for interfaces with the `vpc` purpose.
     * 
     * The following computed attribute is available in a VPC interface:
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
    public Optional<Integer> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceInterface defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean active;
        private @Nullable Integer id;
        private @Nullable List<String> ipRanges;
        private @Nullable String ipamAddress;
        private @Nullable InstanceInterfaceIpv4 ipv4;
        private @Nullable String label;
        private @Nullable Boolean primary;
        private String purpose;
        private @Nullable Integer subnetId;
        private @Nullable Integer vpcId;
        public Builder() {}
        public Builder(InstanceInterface defaults) {
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
        public Builder active(@Nullable Boolean active) {

            this.active = active;
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable Integer id) {

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
        public Builder ipv4(@Nullable InstanceInterfaceIpv4 ipv4) {

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
              throw new MissingRequiredPropertyException("InstanceInterface", "purpose");
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
        public Builder vpcId(@Nullable Integer vpcId) {

            this.vpcId = vpcId;
            return this;
        }
        public InstanceInterface build() {
            final var _resultValue = new InstanceInterface();
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
