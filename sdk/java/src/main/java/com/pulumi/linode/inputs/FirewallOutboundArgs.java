// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FirewallOutboundArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirewallOutboundArgs Empty = new FirewallOutboundArgs();

    /**
     * Controls whether traffic is accepted or dropped by this rule (`ACCEPT`, `DROP`). Overrides the Firewall’s inbound_policy if this is an inbound rule, or the outbound_policy if this is an outbound rule.
     * 
     */
    @Import(name="action", required=true)
    private Output<String> action;

    /**
     * @return Controls whether traffic is accepted or dropped by this rule (`ACCEPT`, `DROP`). Overrides the Firewall’s inbound_policy if this is an inbound rule, or the outbound_policy if this is an outbound rule.
     * 
     */
    public Output<String> action() {
        return this.action;
    }

    /**
     * A list of IPv4 addresses or networks. Must be in IP/mask (CIDR) format.
     * 
     */
    @Import(name="ipv4s")
    private @Nullable Output<List<String>> ipv4s;

    /**
     * @return A list of IPv4 addresses or networks. Must be in IP/mask (CIDR) format.
     * 
     */
    public Optional<Output<List<String>>> ipv4s() {
        return Optional.ofNullable(this.ipv4s);
    }

    /**
     * A list of IPv6 addresses or networks. Must be in IP/mask (CIDR) format.
     * 
     */
    @Import(name="ipv6s")
    private @Nullable Output<List<String>> ipv6s;

    /**
     * @return A list of IPv6 addresses or networks. Must be in IP/mask (CIDR) format.
     * 
     */
    public Optional<Output<List<String>>> ipv6s() {
        return Optional.ofNullable(this.ipv6s);
    }

    /**
     * This Firewall&#39;s unique label.
     * 
     */
    @Import(name="label", required=true)
    private Output<String> label;

    /**
     * @return This Firewall&#39;s unique label.
     * 
     */
    public Output<String> label() {
        return this.label;
    }

    /**
     * A string representation of ports and/or port ranges (i.e. &#34;443&#34; or &#34;80-90, 91&#34;).
     * 
     */
    @Import(name="ports")
    private @Nullable Output<String> ports;

    /**
     * @return A string representation of ports and/or port ranges (i.e. &#34;443&#34; or &#34;80-90, 91&#34;).
     * 
     */
    public Optional<Output<String>> ports() {
        return Optional.ofNullable(this.ports);
    }

    /**
     * The network protocol this rule controls. (`TCP`, `UDP`, `ICMP`)
     * 
     */
    @Import(name="protocol", required=true)
    private Output<String> protocol;

    /**
     * @return The network protocol this rule controls. (`TCP`, `UDP`, `ICMP`)
     * 
     */
    public Output<String> protocol() {
        return this.protocol;
    }

    private FirewallOutboundArgs() {}

    private FirewallOutboundArgs(FirewallOutboundArgs $) {
        this.action = $.action;
        this.ipv4s = $.ipv4s;
        this.ipv6s = $.ipv6s;
        this.label = $.label;
        this.ports = $.ports;
        this.protocol = $.protocol;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirewallOutboundArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirewallOutboundArgs $;

        public Builder() {
            $ = new FirewallOutboundArgs();
        }

        public Builder(FirewallOutboundArgs defaults) {
            $ = new FirewallOutboundArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action Controls whether traffic is accepted or dropped by this rule (`ACCEPT`, `DROP`). Overrides the Firewall’s inbound_policy if this is an inbound rule, or the outbound_policy if this is an outbound rule.
         * 
         * @return builder
         * 
         */
        public Builder action(Output<String> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action Controls whether traffic is accepted or dropped by this rule (`ACCEPT`, `DROP`). Overrides the Firewall’s inbound_policy if this is an inbound rule, or the outbound_policy if this is an outbound rule.
         * 
         * @return builder
         * 
         */
        public Builder action(String action) {
            return action(Output.of(action));
        }

        /**
         * @param ipv4s A list of IPv4 addresses or networks. Must be in IP/mask (CIDR) format.
         * 
         * @return builder
         * 
         */
        public Builder ipv4s(@Nullable Output<List<String>> ipv4s) {
            $.ipv4s = ipv4s;
            return this;
        }

        /**
         * @param ipv4s A list of IPv4 addresses or networks. Must be in IP/mask (CIDR) format.
         * 
         * @return builder
         * 
         */
        public Builder ipv4s(List<String> ipv4s) {
            return ipv4s(Output.of(ipv4s));
        }

        /**
         * @param ipv4s A list of IPv4 addresses or networks. Must be in IP/mask (CIDR) format.
         * 
         * @return builder
         * 
         */
        public Builder ipv4s(String... ipv4s) {
            return ipv4s(List.of(ipv4s));
        }

        /**
         * @param ipv6s A list of IPv6 addresses or networks. Must be in IP/mask (CIDR) format.
         * 
         * @return builder
         * 
         */
        public Builder ipv6s(@Nullable Output<List<String>> ipv6s) {
            $.ipv6s = ipv6s;
            return this;
        }

        /**
         * @param ipv6s A list of IPv6 addresses or networks. Must be in IP/mask (CIDR) format.
         * 
         * @return builder
         * 
         */
        public Builder ipv6s(List<String> ipv6s) {
            return ipv6s(Output.of(ipv6s));
        }

        /**
         * @param ipv6s A list of IPv6 addresses or networks. Must be in IP/mask (CIDR) format.
         * 
         * @return builder
         * 
         */
        public Builder ipv6s(String... ipv6s) {
            return ipv6s(List.of(ipv6s));
        }

        /**
         * @param label This Firewall&#39;s unique label.
         * 
         * @return builder
         * 
         */
        public Builder label(Output<String> label) {
            $.label = label;
            return this;
        }

        /**
         * @param label This Firewall&#39;s unique label.
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            return label(Output.of(label));
        }

        /**
         * @param ports A string representation of ports and/or port ranges (i.e. &#34;443&#34; or &#34;80-90, 91&#34;).
         * 
         * @return builder
         * 
         */
        public Builder ports(@Nullable Output<String> ports) {
            $.ports = ports;
            return this;
        }

        /**
         * @param ports A string representation of ports and/or port ranges (i.e. &#34;443&#34; or &#34;80-90, 91&#34;).
         * 
         * @return builder
         * 
         */
        public Builder ports(String ports) {
            return ports(Output.of(ports));
        }

        /**
         * @param protocol The network protocol this rule controls. (`TCP`, `UDP`, `ICMP`)
         * 
         * @return builder
         * 
         */
        public Builder protocol(Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol The network protocol this rule controls. (`TCP`, `UDP`, `ICMP`)
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        public FirewallOutboundArgs build() {
            if ($.action == null) {
                throw new MissingRequiredPropertyException("FirewallOutboundArgs", "action");
            }
            if ($.label == null) {
                throw new MissingRequiredPropertyException("FirewallOutboundArgs", "label");
            }
            if ($.protocol == null) {
                throw new MissingRequiredPropertyException("FirewallOutboundArgs", "protocol");
            }
            return $;
        }
    }

}
