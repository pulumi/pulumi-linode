// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.linode.outputs.GetFirewallDevice;
import com.pulumi.linode.outputs.GetFirewallInbound;
import com.pulumi.linode.outputs.GetFirewallOutbound;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetFirewallResult {
    /**
     * @return When this firewall was created.
     * 
     */
    private String created;
    private List<GetFirewallDevice> devices;
    /**
     * @return If true, the firewall is inactive.
     * 
     */
    private Boolean disabled;
    /**
     * @return The ID of the Firewall Device.
     * 
     */
    private Integer id;
    /**
     * @return The default behavior for inbound traffic. (`ACCEPT`, `DROP`)
     * 
     */
    private String inboundPolicy;
    private List<GetFirewallInbound> inbounds;
    /**
     * @return The label of the underlying entity this device references.
     * 
     */
    private String label;
    /**
     * @return The IDs of Linodes assigned to this Firewall.
     * 
     */
    private List<Integer> linodes;
    /**
     * @return The IDs of NodeBalancers assigned to this Firewall.
     * 
     */
    private List<Integer> nodebalancers;
    /**
     * @return The default behavior for outbound traffic. (`ACCEPT`, `DROP`)
     * 
     */
    private String outboundPolicy;
    private List<GetFirewallOutbound> outbounds;
    /**
     * @return The status of the firewall. (`enabled`, `disabled`, `deleted`)
     * 
     */
    private String status;
    /**
     * @return The tags applied to the firewall.
     * 
     */
    private List<String> tags;
    /**
     * @return When this firewall was last updated.
     * 
     */
    private String updated;

    private GetFirewallResult() {}
    /**
     * @return When this firewall was created.
     * 
     */
    public String created() {
        return this.created;
    }
    public List<GetFirewallDevice> devices() {
        return this.devices;
    }
    /**
     * @return If true, the firewall is inactive.
     * 
     */
    public Boolean disabled() {
        return this.disabled;
    }
    /**
     * @return The ID of the Firewall Device.
     * 
     */
    public Integer id() {
        return this.id;
    }
    /**
     * @return The default behavior for inbound traffic. (`ACCEPT`, `DROP`)
     * 
     */
    public String inboundPolicy() {
        return this.inboundPolicy;
    }
    public List<GetFirewallInbound> inbounds() {
        return this.inbounds;
    }
    /**
     * @return The label of the underlying entity this device references.
     * 
     */
    public String label() {
        return this.label;
    }
    /**
     * @return The IDs of Linodes assigned to this Firewall.
     * 
     */
    public List<Integer> linodes() {
        return this.linodes;
    }
    /**
     * @return The IDs of NodeBalancers assigned to this Firewall.
     * 
     */
    public List<Integer> nodebalancers() {
        return this.nodebalancers;
    }
    /**
     * @return The default behavior for outbound traffic. (`ACCEPT`, `DROP`)
     * 
     */
    public String outboundPolicy() {
        return this.outboundPolicy;
    }
    public List<GetFirewallOutbound> outbounds() {
        return this.outbounds;
    }
    /**
     * @return The status of the firewall. (`enabled`, `disabled`, `deleted`)
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return The tags applied to the firewall.
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

    public static Builder builder(GetFirewallResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String created;
        private List<GetFirewallDevice> devices;
        private Boolean disabled;
        private Integer id;
        private String inboundPolicy;
        private List<GetFirewallInbound> inbounds;
        private String label;
        private List<Integer> linodes;
        private List<Integer> nodebalancers;
        private String outboundPolicy;
        private List<GetFirewallOutbound> outbounds;
        private String status;
        private List<String> tags;
        private String updated;
        public Builder() {}
        public Builder(GetFirewallResult defaults) {
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
        public Builder devices(List<GetFirewallDevice> devices) {
            this.devices = Objects.requireNonNull(devices);
            return this;
        }
        public Builder devices(GetFirewallDevice... devices) {
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
        public Builder inbounds(List<GetFirewallInbound> inbounds) {
            this.inbounds = Objects.requireNonNull(inbounds);
            return this;
        }
        public Builder inbounds(GetFirewallInbound... inbounds) {
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
        public Builder outbounds(List<GetFirewallOutbound> outbounds) {
            this.outbounds = Objects.requireNonNull(outbounds);
            return this;
        }
        public Builder outbounds(GetFirewallOutbound... outbounds) {
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
        public GetFirewallResult build() {
            final var o = new GetFirewallResult();
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
