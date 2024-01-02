// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FirewallOutbound {
    /**
     * @return Controls whether traffic is accepted or dropped by this rule (`ACCEPT`, `DROP`). Overrides the Firewall’s inbound_policy if this is an inbound rule, or the outbound_policy if this is an outbound rule.
     * 
     */
    private String action;
    /**
     * @return A list of IPv4 addresses or networks. Must be in IP/mask (CIDR) format.
     * 
     */
    private @Nullable List<String> ipv4s;
    /**
     * @return A list of IPv6 addresses or networks. Must be in IP/mask (CIDR) format.
     * 
     */
    private @Nullable List<String> ipv6s;
    /**
     * @return This Firewall&#39;s unique label.
     * 
     */
    private String label;
    /**
     * @return A string representation of ports and/or port ranges (i.e. &#34;443&#34; or &#34;80-90, 91&#34;).
     * 
     */
    private @Nullable String ports;
    /**
     * @return The network protocol this rule controls. (`TCP`, `UDP`, `ICMP`)
     * 
     */
    private String protocol;

    private FirewallOutbound() {}
    /**
     * @return Controls whether traffic is accepted or dropped by this rule (`ACCEPT`, `DROP`). Overrides the Firewall’s inbound_policy if this is an inbound rule, or the outbound_policy if this is an outbound rule.
     * 
     */
    public String action() {
        return this.action;
    }
    /**
     * @return A list of IPv4 addresses or networks. Must be in IP/mask (CIDR) format.
     * 
     */
    public List<String> ipv4s() {
        return this.ipv4s == null ? List.of() : this.ipv4s;
    }
    /**
     * @return A list of IPv6 addresses or networks. Must be in IP/mask (CIDR) format.
     * 
     */
    public List<String> ipv6s() {
        return this.ipv6s == null ? List.of() : this.ipv6s;
    }
    /**
     * @return This Firewall&#39;s unique label.
     * 
     */
    public String label() {
        return this.label;
    }
    /**
     * @return A string representation of ports and/or port ranges (i.e. &#34;443&#34; or &#34;80-90, 91&#34;).
     * 
     */
    public Optional<String> ports() {
        return Optional.ofNullable(this.ports);
    }
    /**
     * @return The network protocol this rule controls. (`TCP`, `UDP`, `ICMP`)
     * 
     */
    public String protocol() {
        return this.protocol;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallOutbound defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String action;
        private @Nullable List<String> ipv4s;
        private @Nullable List<String> ipv6s;
        private String label;
        private @Nullable String ports;
        private String protocol;
        public Builder() {}
        public Builder(FirewallOutbound defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.ipv4s = defaults.ipv4s;
    	      this.ipv6s = defaults.ipv6s;
    	      this.label = defaults.label;
    	      this.ports = defaults.ports;
    	      this.protocol = defaults.protocol;
        }

        @CustomType.Setter
        public Builder action(String action) {
            if (action == null) {
              throw new MissingRequiredPropertyException("FirewallOutbound", "action");
            }
            this.action = action;
            return this;
        }
        @CustomType.Setter
        public Builder ipv4s(@Nullable List<String> ipv4s) {

            this.ipv4s = ipv4s;
            return this;
        }
        public Builder ipv4s(String... ipv4s) {
            return ipv4s(List.of(ipv4s));
        }
        @CustomType.Setter
        public Builder ipv6s(@Nullable List<String> ipv6s) {

            this.ipv6s = ipv6s;
            return this;
        }
        public Builder ipv6s(String... ipv6s) {
            return ipv6s(List.of(ipv6s));
        }
        @CustomType.Setter
        public Builder label(String label) {
            if (label == null) {
              throw new MissingRequiredPropertyException("FirewallOutbound", "label");
            }
            this.label = label;
            return this;
        }
        @CustomType.Setter
        public Builder ports(@Nullable String ports) {

            this.ports = ports;
            return this;
        }
        @CustomType.Setter
        public Builder protocol(String protocol) {
            if (protocol == null) {
              throw new MissingRequiredPropertyException("FirewallOutbound", "protocol");
            }
            this.protocol = protocol;
            return this;
        }
        public FirewallOutbound build() {
            final var _resultValue = new FirewallOutbound();
            _resultValue.action = action;
            _resultValue.ipv4s = ipv4s;
            _resultValue.ipv6s = ipv6s;
            _resultValue.label = label;
            _resultValue.ports = ports;
            _resultValue.protocol = protocol;
            return _resultValue;
        }
    }
}
