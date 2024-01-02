// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.linode.inputs.InstanceConfigInterfaceIpv4Args;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceConfigInterfaceArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceConfigInterfaceArgs Empty = new InstanceConfigInterfaceArgs();

    @Import(name="active")
    private @Nullable Output<Boolean> active;

    public Optional<Output<Boolean>> active() {
        return Optional.ofNullable(this.active);
    }

    /**
     * The ID of the disk in the Linode API.
     * 
     */
    @Import(name="id")
    private @Nullable Output<Integer> id;

    /**
     * @return The ID of the disk in the Linode API.
     * 
     */
    public Optional<Output<Integer>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * IPv4 CIDR VPC Subnet ranges that are routed to this Interface. IPv6 ranges are also available to select participants in the Beta program.
     * 
     */
    @Import(name="ipRanges")
    private @Nullable Output<List<String>> ipRanges;

    /**
     * @return IPv4 CIDR VPC Subnet ranges that are routed to this Interface. IPv6 ranges are also available to select participants in the Beta program.
     * 
     */
    public Optional<Output<List<String>>> ipRanges() {
        return Optional.ofNullable(this.ipRanges);
    }

    /**
     * This Network Interface’s private IP address in Classless Inter-Domain Routing (CIDR) notation. (e.g. `10.0.0.1/24`) This field is only allowed for interfaces with the `vlan` purpose.
     * 
     */
    @Import(name="ipamAddress")
    private @Nullable Output<String> ipamAddress;

    /**
     * @return This Network Interface’s private IP address in Classless Inter-Domain Routing (CIDR) notation. (e.g. `10.0.0.1/24`) This field is only allowed for interfaces with the `vlan` purpose.
     * 
     */
    public Optional<Output<String>> ipamAddress() {
        return Optional.ofNullable(this.ipamAddress);
    }

    /**
     * This Linode&#39;s IPv4 Addresses. Each Linode is assigned a single public IPv4 address upon creation, and may get a single private IPv4 address if needed. You may need to open a support ticket to get additional IPv4 addresses.
     * 
     */
    @Import(name="ipv4")
    private @Nullable Output<InstanceConfigInterfaceIpv4Args> ipv4;

    /**
     * @return This Linode&#39;s IPv4 Addresses. Each Linode is assigned a single public IPv4 address upon creation, and may get a single private IPv4 address if needed. You may need to open a support ticket to get additional IPv4 addresses.
     * 
     */
    public Optional<Output<InstanceConfigInterfaceIpv4Args>> ipv4() {
        return Optional.ofNullable(this.ipv4);
    }

    /**
     * The name of the VLAN to join. This field is only allowed and required for interfaces with the `vlan` purpose.
     * 
     */
    @Import(name="label")
    private @Nullable Output<String> label;

    /**
     * @return The name of the VLAN to join. This field is only allowed and required for interfaces with the `vlan` purpose.
     * 
     */
    public Optional<Output<String>> label() {
        return Optional.ofNullable(this.label);
    }

    /**
     * Whether the interface is the primary interface that should have the default route for this Linode. This field is only allowed for interfaces with the `public` or `vpc` purpose.
     * 
     * * `ipv4` - (Optional) The IPv4 configuration of the VPC interface. This field is currently only allowed for interfaces with the `vpc` purpose.
     * 
     * The following computed attribute is available in a VPC interface:
     * 
     */
    @Import(name="primary")
    private @Nullable Output<Boolean> primary;

    /**
     * @return Whether the interface is the primary interface that should have the default route for this Linode. This field is only allowed for interfaces with the `public` or `vpc` purpose.
     * 
     * * `ipv4` - (Optional) The IPv4 configuration of the VPC interface. This field is currently only allowed for interfaces with the `vpc` purpose.
     * 
     * The following computed attribute is available in a VPC interface:
     * 
     */
    public Optional<Output<Boolean>> primary() {
        return Optional.ofNullable(this.primary);
    }

    /**
     * The type of interface. (`public`, `vlan`, `vpc`)
     * 
     */
    @Import(name="purpose", required=true)
    private Output<String> purpose;

    /**
     * @return The type of interface. (`public`, `vlan`, `vpc`)
     * 
     */
    public Output<String> purpose() {
        return this.purpose;
    }

    /**
     * The name of the VPC Subnet to join. This field is only allowed and required for interfaces with the `vpc` purpose.
     * 
     */
    @Import(name="subnetId")
    private @Nullable Output<Integer> subnetId;

    /**
     * @return The name of the VPC Subnet to join. This field is only allowed and required for interfaces with the `vpc` purpose.
     * 
     */
    public Optional<Output<Integer>> subnetId() {
        return Optional.ofNullable(this.subnetId);
    }

    /**
     * The ID of VPC which this interface is attached to.
     * 
     */
    @Import(name="vpcId")
    private @Nullable Output<Integer> vpcId;

    /**
     * @return The ID of VPC which this interface is attached to.
     * 
     */
    public Optional<Output<Integer>> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    private InstanceConfigInterfaceArgs() {}

    private InstanceConfigInterfaceArgs(InstanceConfigInterfaceArgs $) {
        this.active = $.active;
        this.id = $.id;
        this.ipRanges = $.ipRanges;
        this.ipamAddress = $.ipamAddress;
        this.ipv4 = $.ipv4;
        this.label = $.label;
        this.primary = $.primary;
        this.purpose = $.purpose;
        this.subnetId = $.subnetId;
        this.vpcId = $.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceConfigInterfaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceConfigInterfaceArgs $;

        public Builder() {
            $ = new InstanceConfigInterfaceArgs();
        }

        public Builder(InstanceConfigInterfaceArgs defaults) {
            $ = new InstanceConfigInterfaceArgs(Objects.requireNonNull(defaults));
        }

        public Builder active(@Nullable Output<Boolean> active) {
            $.active = active;
            return this;
        }

        public Builder active(Boolean active) {
            return active(Output.of(active));
        }

        /**
         * @param id The ID of the disk in the Linode API.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<Integer> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of the disk in the Linode API.
         * 
         * @return builder
         * 
         */
        public Builder id(Integer id) {
            return id(Output.of(id));
        }

        /**
         * @param ipRanges IPv4 CIDR VPC Subnet ranges that are routed to this Interface. IPv6 ranges are also available to select participants in the Beta program.
         * 
         * @return builder
         * 
         */
        public Builder ipRanges(@Nullable Output<List<String>> ipRanges) {
            $.ipRanges = ipRanges;
            return this;
        }

        /**
         * @param ipRanges IPv4 CIDR VPC Subnet ranges that are routed to this Interface. IPv6 ranges are also available to select participants in the Beta program.
         * 
         * @return builder
         * 
         */
        public Builder ipRanges(List<String> ipRanges) {
            return ipRanges(Output.of(ipRanges));
        }

        /**
         * @param ipRanges IPv4 CIDR VPC Subnet ranges that are routed to this Interface. IPv6 ranges are also available to select participants in the Beta program.
         * 
         * @return builder
         * 
         */
        public Builder ipRanges(String... ipRanges) {
            return ipRanges(List.of(ipRanges));
        }

        /**
         * @param ipamAddress This Network Interface’s private IP address in Classless Inter-Domain Routing (CIDR) notation. (e.g. `10.0.0.1/24`) This field is only allowed for interfaces with the `vlan` purpose.
         * 
         * @return builder
         * 
         */
        public Builder ipamAddress(@Nullable Output<String> ipamAddress) {
            $.ipamAddress = ipamAddress;
            return this;
        }

        /**
         * @param ipamAddress This Network Interface’s private IP address in Classless Inter-Domain Routing (CIDR) notation. (e.g. `10.0.0.1/24`) This field is only allowed for interfaces with the `vlan` purpose.
         * 
         * @return builder
         * 
         */
        public Builder ipamAddress(String ipamAddress) {
            return ipamAddress(Output.of(ipamAddress));
        }

        /**
         * @param ipv4 This Linode&#39;s IPv4 Addresses. Each Linode is assigned a single public IPv4 address upon creation, and may get a single private IPv4 address if needed. You may need to open a support ticket to get additional IPv4 addresses.
         * 
         * @return builder
         * 
         */
        public Builder ipv4(@Nullable Output<InstanceConfigInterfaceIpv4Args> ipv4) {
            $.ipv4 = ipv4;
            return this;
        }

        /**
         * @param ipv4 This Linode&#39;s IPv4 Addresses. Each Linode is assigned a single public IPv4 address upon creation, and may get a single private IPv4 address if needed. You may need to open a support ticket to get additional IPv4 addresses.
         * 
         * @return builder
         * 
         */
        public Builder ipv4(InstanceConfigInterfaceIpv4Args ipv4) {
            return ipv4(Output.of(ipv4));
        }

        /**
         * @param label The name of the VLAN to join. This field is only allowed and required for interfaces with the `vlan` purpose.
         * 
         * @return builder
         * 
         */
        public Builder label(@Nullable Output<String> label) {
            $.label = label;
            return this;
        }

        /**
         * @param label The name of the VLAN to join. This field is only allowed and required for interfaces with the `vlan` purpose.
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            return label(Output.of(label));
        }

        /**
         * @param primary Whether the interface is the primary interface that should have the default route for this Linode. This field is only allowed for interfaces with the `public` or `vpc` purpose.
         * 
         * * `ipv4` - (Optional) The IPv4 configuration of the VPC interface. This field is currently only allowed for interfaces with the `vpc` purpose.
         * 
         * The following computed attribute is available in a VPC interface:
         * 
         * @return builder
         * 
         */
        public Builder primary(@Nullable Output<Boolean> primary) {
            $.primary = primary;
            return this;
        }

        /**
         * @param primary Whether the interface is the primary interface that should have the default route for this Linode. This field is only allowed for interfaces with the `public` or `vpc` purpose.
         * 
         * * `ipv4` - (Optional) The IPv4 configuration of the VPC interface. This field is currently only allowed for interfaces with the `vpc` purpose.
         * 
         * The following computed attribute is available in a VPC interface:
         * 
         * @return builder
         * 
         */
        public Builder primary(Boolean primary) {
            return primary(Output.of(primary));
        }

        /**
         * @param purpose The type of interface. (`public`, `vlan`, `vpc`)
         * 
         * @return builder
         * 
         */
        public Builder purpose(Output<String> purpose) {
            $.purpose = purpose;
            return this;
        }

        /**
         * @param purpose The type of interface. (`public`, `vlan`, `vpc`)
         * 
         * @return builder
         * 
         */
        public Builder purpose(String purpose) {
            return purpose(Output.of(purpose));
        }

        /**
         * @param subnetId The name of the VPC Subnet to join. This field is only allowed and required for interfaces with the `vpc` purpose.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(@Nullable Output<Integer> subnetId) {
            $.subnetId = subnetId;
            return this;
        }

        /**
         * @param subnetId The name of the VPC Subnet to join. This field is only allowed and required for interfaces with the `vpc` purpose.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(Integer subnetId) {
            return subnetId(Output.of(subnetId));
        }

        /**
         * @param vpcId The ID of VPC which this interface is attached to.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(@Nullable Output<Integer> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        /**
         * @param vpcId The ID of VPC which this interface is attached to.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(Integer vpcId) {
            return vpcId(Output.of(vpcId));
        }

        public InstanceConfigInterfaceArgs build() {
            if ($.purpose == null) {
                throw new MissingRequiredPropertyException("InstanceConfigInterfaceArgs", "purpose");
            }
            return $;
        }
    }

}
