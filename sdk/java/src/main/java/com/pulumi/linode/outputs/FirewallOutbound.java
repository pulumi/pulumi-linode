// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
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
    private final String action;
    /**
     * @return A list of IPv4 addresses or networks. Must be in IP/mask format.
     * 
     */
    private final @Nullable List<String> ipv4s;
    /**
     * @return A list of IPv6 addresses or networks. Must be in IP/mask format.
     * 
     */
    private final @Nullable List<String> ipv6s;
    /**
     * @return Used to identify this rule. For display purposes only.
     * 
     */
    private final String label;
    /**
     * @return A string representation of ports and/or port ranges (i.e. &#34;443&#34; or &#34;80-90, 91&#34;).
     * 
     */
    private final @Nullable String ports;
    /**
     * @return The network protocol this rule controls. (`TCP`, `UDP`, `ICMP`)
     * 
     */
    private final String protocol;

    @CustomType.Constructor
    private FirewallOutbound(
        @CustomType.Parameter("action") String action,
        @CustomType.Parameter("ipv4s") @Nullable List<String> ipv4s,
        @CustomType.Parameter("ipv6s") @Nullable List<String> ipv6s,
        @CustomType.Parameter("label") String label,
        @CustomType.Parameter("ports") @Nullable String ports,
        @CustomType.Parameter("protocol") String protocol) {
        this.action = action;
        this.ipv4s = ipv4s;
        this.ipv6s = ipv6s;
        this.label = label;
        this.ports = ports;
        this.protocol = protocol;
    }

    /**
     * @return Controls whether traffic is accepted or dropped by this rule (`ACCEPT`, `DROP`). Overrides the Firewall’s inbound_policy if this is an inbound rule, or the outbound_policy if this is an outbound rule.
     * 
     */
    public String action() {
        return this.action;
    }
    /**
     * @return A list of IPv4 addresses or networks. Must be in IP/mask format.
     * 
     */
    public List<String> ipv4s() {
        return this.ipv4s == null ? List.of() : this.ipv4s;
    }
    /**
     * @return A list of IPv6 addresses or networks. Must be in IP/mask format.
     * 
     */
    public List<String> ipv6s() {
        return this.ipv6s == null ? List.of() : this.ipv6s;
    }
    /**
     * @return Used to identify this rule. For display purposes only.
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

    public static final class Builder {
        private String action;
        private @Nullable List<String> ipv4s;
        private @Nullable List<String> ipv6s;
        private String label;
        private @Nullable String ports;
        private String protocol;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallOutbound defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.ipv4s = defaults.ipv4s;
    	      this.ipv6s = defaults.ipv6s;
    	      this.label = defaults.label;
    	      this.ports = defaults.ports;
    	      this.protocol = defaults.protocol;
        }

        public Builder action(String action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        public Builder ipv4s(@Nullable List<String> ipv4s) {
            this.ipv4s = ipv4s;
            return this;
        }
        public Builder ipv4s(String... ipv4s) {
            return ipv4s(List.of(ipv4s));
        }
        public Builder ipv6s(@Nullable List<String> ipv6s) {
            this.ipv6s = ipv6s;
            return this;
        }
        public Builder ipv6s(String... ipv6s) {
            return ipv6s(List.of(ipv6s));
        }
        public Builder label(String label) {
            this.label = Objects.requireNonNull(label);
            return this;
        }
        public Builder ports(@Nullable String ports) {
            this.ports = ports;
            return this;
        }
        public Builder protocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }        public FirewallOutbound build() {
            return new FirewallOutbound(action, ipv4s, ipv6s, label, ports, protocol);
        }
    }
}
