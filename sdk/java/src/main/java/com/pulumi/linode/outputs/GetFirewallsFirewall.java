// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.linode.outputs.GetFirewallsFirewallDevice;
import com.pulumi.linode.outputs.GetFirewallsFirewallInbound;
import com.pulumi.linode.outputs.GetFirewallsFirewallOutbound;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetFirewallsFirewall {
    /**
     * @return When this firewall was created.
     * 
     */
    private String created;
    private @Nullable List<GetFirewallsFirewallDevice> devices;
    /**
     * @return If true, the Firewall is inactive.
     * 
     */
    private Boolean disabled;
    /**
     * @return The unique ID assigned to this Firewall.
     * 
     */
    private Integer id;
    /**
     * @return The default behavior for inbound traffic.
     * 
     */
    private String inboundPolicy;
    private @Nullable List<GetFirewallsFirewallInbound> inbounds;
    /**
     * @return The label for the Firewall. For display purposes only. If no label is provided, a default will be assigned.
     * 
     */
    private String label;
    /**
     * @return The IDs of Linodes this firewall is applied to.
     * 
     */
    private List<Integer> linodes;
    private List<Integer> nodebalancers;
    /**
     * @return The default behavior for outbound traffic.
     * 
     */
    private String outboundPolicy;
    private @Nullable List<GetFirewallsFirewallOutbound> outbounds;
    /**
     * @return The status of the firewall.
     * 
     */
    private String status;
    /**
     * @return An array of tags applied to this object. Tags are for organizational purposes only.
     * 
     */
    private List<String> tags;
    /**
     * @return When this firewall was last updated.
     * 
     */
    private String updated;

    private GetFirewallsFirewall() {}
    /**
     * @return When this firewall was created.
     * 
     */
    public String created() {
        return this.created;
    }
    public List<GetFirewallsFirewallDevice> devices() {
        return this.devices == null ? List.of() : this.devices;
    }
    /**
     * @return If true, the Firewall is inactive.
     * 
     */
    public Boolean disabled() {
        return this.disabled;
    }
    /**
     * @return The unique ID assigned to this Firewall.
     * 
     */
    public Integer id() {
        return this.id;
    }
    /**
     * @return The default behavior for inbound traffic.
     * 
     */
    public String inboundPolicy() {
        return this.inboundPolicy;
    }
    public List<GetFirewallsFirewallInbound> inbounds() {
        return this.inbounds == null ? List.of() : this.inbounds;
    }
    /**
     * @return The label for the Firewall. For display purposes only. If no label is provided, a default will be assigned.
     * 
     */
    public String label() {
        return this.label;
    }
    /**
     * @return The IDs of Linodes this firewall is applied to.
     * 
     */
    public List<Integer> linodes() {
        return this.linodes;
    }
    public List<Integer> nodebalancers() {
        return this.nodebalancers;
    }
    /**
     * @return The default behavior for outbound traffic.
     * 
     */
    public String outboundPolicy() {
        return this.outboundPolicy;
    }
    public List<GetFirewallsFirewallOutbound> outbounds() {
        return this.outbounds == null ? List.of() : this.outbounds;
    }
    /**
     * @return The status of the firewall.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return An array of tags applied to this object. Tags are for organizational purposes only.
     * 
     */
    public List<String> tags() {
        return this.tags;
    }
    /**
     * @return When this firewall was last updated.
     * 
     */
    public String updated() {
        return this.updated;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFirewallsFirewall defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String created;
        private @Nullable List<GetFirewallsFirewallDevice> devices;
        private Boolean disabled;
        private Integer id;
        private String inboundPolicy;
        private @Nullable List<GetFirewallsFirewallInbound> inbounds;
        private String label;
        private List<Integer> linodes;
        private List<Integer> nodebalancers;
        private String outboundPolicy;
        private @Nullable List<GetFirewallsFirewallOutbound> outbounds;
        private String status;
        private List<String> tags;
        private String updated;
        public Builder() {}
        public Builder(GetFirewallsFirewall defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.created = defaults.created;
    	      this.devices = defaults.devices;
    	      this.disabled = defaults.disabled;
    	      this.id = defaults.id;
    	      this.inboundPolicy = defaults.inboundPolicy;
    	      this.inbounds = defaults.inbounds;
    	      this.label = defaults.label;
    	      this.linodes = defaults.linodes;
    	      this.nodebalancers = defaults.nodebalancers;
    	      this.outboundPolicy = defaults.outboundPolicy;
    	      this.outbounds = defaults.outbounds;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.updated = defaults.updated;
        }

        @CustomType.Setter
        public Builder created(String created) {
            this.created = Objects.requireNonNull(created);
            return this;
        }
        @CustomType.Setter
        public Builder devices(@Nullable List<GetFirewallsFirewallDevice> devices) {
            this.devices = devices;
            return this;
        }
        public Builder devices(GetFirewallsFirewallDevice... devices) {
            return devices(List.of(devices));
        }
        @CustomType.Setter
        public Builder disabled(Boolean disabled) {
            this.disabled = Objects.requireNonNull(disabled);
            return this;
        }
        @CustomType.Setter
        public Builder id(Integer id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder inboundPolicy(String inboundPolicy) {
            this.inboundPolicy = Objects.requireNonNull(inboundPolicy);
            return this;
        }
        @CustomType.Setter
        public Builder inbounds(@Nullable List<GetFirewallsFirewallInbound> inbounds) {
            this.inbounds = inbounds;
            return this;
        }
        public Builder inbounds(GetFirewallsFirewallInbound... inbounds) {
            return inbounds(List.of(inbounds));
        }
        @CustomType.Setter
        public Builder label(String label) {
            this.label = Objects.requireNonNull(label);
            return this;
        }
        @CustomType.Setter
        public Builder linodes(List<Integer> linodes) {
            this.linodes = Objects.requireNonNull(linodes);
            return this;
        }
        public Builder linodes(Integer... linodes) {
            return linodes(List.of(linodes));
        }
        @CustomType.Setter
        public Builder nodebalancers(List<Integer> nodebalancers) {
            this.nodebalancers = Objects.requireNonNull(nodebalancers);
            return this;
        }
        public Builder nodebalancers(Integer... nodebalancers) {
            return nodebalancers(List.of(nodebalancers));
        }
        @CustomType.Setter
        public Builder outboundPolicy(String outboundPolicy) {
            this.outboundPolicy = Objects.requireNonNull(outboundPolicy);
            return this;
        }
        @CustomType.Setter
        public Builder outbounds(@Nullable List<GetFirewallsFirewallOutbound> outbounds) {
            this.outbounds = outbounds;
            return this;
        }
        public Builder outbounds(GetFirewallsFirewallOutbound... outbounds) {
            return outbounds(List.of(outbounds));
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder tags(List<String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        @CustomType.Setter
        public Builder updated(String updated) {
            this.updated = Objects.requireNonNull(updated);
            return this;
        }
        public GetFirewallsFirewall build() {
            final var o = new GetFirewallsFirewall();
            o.created = created;
            o.devices = devices;
            o.disabled = disabled;
            o.id = id;
            o.inboundPolicy = inboundPolicy;
            o.inbounds = inbounds;
            o.label = label;
            o.linodes = linodes;
            o.nodebalancers = nodebalancers;
            o.outboundPolicy = outboundPolicy;
            o.outbounds = outbounds;
            o.status = status;
            o.tags = tags;
            o.updated = updated;
            return o;
        }
    }
}
