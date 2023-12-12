// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.linode.outputs.GetNodebalancersNodebalancerTransfer;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetNodebalancersNodebalancer {
    /**
     * @return Throttle connections per second (0-20)
     * 
     */
    private Integer clientConnThrottle;
    /**
     * @return When this Linode NodeBalancer was created
     * 
     */
    private String created;
    /**
     * @return This NodeBalancer&#39;s hostname, ending with .ip.linodeusercontent.com
     * 
     */
    private String hostname;
    /**
     * @return The Linode NodeBalancer&#39;s unique ID
     * 
     */
    private Integer id;
    /**
     * @return The Public IPv4 Address of this NodeBalancer
     * 
     */
    private String ipv4;
    /**
     * @return The Public IPv6 Address of this NodeBalancer
     * 
     */
    private String ipv6;
    /**
     * @return The label of the Linode NodeBalancer
     * 
     */
    private String label;
    /**
     * @return The Region where this Linode NodeBalancer is located. NodeBalancers only support backends in the same Region.
     * 
     */
    private String region;
    /**
     * @return A list of tags applied to this object. Tags are for organizational purposes only.
     * 
     */
    private List<String> tags;
    private List<GetNodebalancersNodebalancerTransfer> transfers;
    /**
     * @return When this Linode NodeBalancer was last updated
     * 
     */
    private String updated;

    private GetNodebalancersNodebalancer() {}
    /**
     * @return Throttle connections per second (0-20)
     * 
     */
    public Integer clientConnThrottle() {
        return this.clientConnThrottle;
    }
    /**
     * @return When this Linode NodeBalancer was created
     * 
     */
    public String created() {
        return this.created;
    }
    /**
     * @return This NodeBalancer&#39;s hostname, ending with .ip.linodeusercontent.com
     * 
     */
    public String hostname() {
        return this.hostname;
    }
    /**
     * @return The Linode NodeBalancer&#39;s unique ID
     * 
     */
    public Integer id() {
        return this.id;
    }
    /**
     * @return The Public IPv4 Address of this NodeBalancer
     * 
     */
    public String ipv4() {
        return this.ipv4;
    }
    /**
     * @return The Public IPv6 Address of this NodeBalancer
     * 
     */
    public String ipv6() {
        return this.ipv6;
    }
    /**
     * @return The label of the Linode NodeBalancer
     * 
     */
    public String label() {
        return this.label;
    }
    /**
     * @return The Region where this Linode NodeBalancer is located. NodeBalancers only support backends in the same Region.
     * 
     */
    public String region() {
        return this.region;
    }
    /**
     * @return A list of tags applied to this object. Tags are for organizational purposes only.
     * 
     */
    public List<String> tags() {
        return this.tags;
    }
    public List<GetNodebalancersNodebalancerTransfer> transfers() {
        return this.transfers;
    }
    /**
     * @return When this Linode NodeBalancer was last updated
     * 
     */
    public String updated() {
        return this.updated;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNodebalancersNodebalancer defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer clientConnThrottle;
        private String created;
        private String hostname;
        private Integer id;
        private String ipv4;
        private String ipv6;
        private String label;
        private String region;
        private List<String> tags;
        private List<GetNodebalancersNodebalancerTransfer> transfers;
        private String updated;
        public Builder() {}
        public Builder(GetNodebalancersNodebalancer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientConnThrottle = defaults.clientConnThrottle;
    	      this.created = defaults.created;
    	      this.hostname = defaults.hostname;
    	      this.id = defaults.id;
    	      this.ipv4 = defaults.ipv4;
    	      this.ipv6 = defaults.ipv6;
    	      this.label = defaults.label;
    	      this.region = defaults.region;
    	      this.tags = defaults.tags;
    	      this.transfers = defaults.transfers;
    	      this.updated = defaults.updated;
        }

        @CustomType.Setter
        public Builder clientConnThrottle(Integer clientConnThrottle) {
            this.clientConnThrottle = Objects.requireNonNull(clientConnThrottle);
            return this;
        }
        @CustomType.Setter
        public Builder created(String created) {
            this.created = Objects.requireNonNull(created);
            return this;
        }
        @CustomType.Setter
        public Builder hostname(String hostname) {
            this.hostname = Objects.requireNonNull(hostname);
            return this;
        }
        @CustomType.Setter
        public Builder id(Integer id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder ipv4(String ipv4) {
            this.ipv4 = Objects.requireNonNull(ipv4);
            return this;
        }
        @CustomType.Setter
        public Builder ipv6(String ipv6) {
            this.ipv6 = Objects.requireNonNull(ipv6);
            return this;
        }
        @CustomType.Setter
        public Builder label(String label) {
            this.label = Objects.requireNonNull(label);
            return this;
        }
        @CustomType.Setter
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
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
        public Builder transfers(List<GetNodebalancersNodebalancerTransfer> transfers) {
            this.transfers = Objects.requireNonNull(transfers);
            return this;
        }
        public Builder transfers(GetNodebalancersNodebalancerTransfer... transfers) {
            return transfers(List.of(transfers));
        }
        @CustomType.Setter
        public Builder updated(String updated) {
            this.updated = Objects.requireNonNull(updated);
            return this;
        }
        public GetNodebalancersNodebalancer build() {
            final var _resultValue = new GetNodebalancersNodebalancer();
            _resultValue.clientConnThrottle = clientConnThrottle;
            _resultValue.created = created;
            _resultValue.hostname = hostname;
            _resultValue.id = id;
            _resultValue.ipv4 = ipv4;
            _resultValue.ipv6 = ipv6;
            _resultValue.label = label;
            _resultValue.region = region;
            _resultValue.tags = tags;
            _resultValue.transfers = transfers;
            _resultValue.updated = updated;
            return _resultValue;
        }
    }
}
