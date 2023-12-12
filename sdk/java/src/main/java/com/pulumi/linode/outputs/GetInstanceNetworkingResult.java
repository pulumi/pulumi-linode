// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.linode.outputs.GetInstanceNetworkingIpv4;
import com.pulumi.linode.outputs.GetInstanceNetworkingIpv6;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetInstanceNetworkingResult {
    private String id;
    private List<GetInstanceNetworkingIpv4> ipv4s;
    private List<GetInstanceNetworkingIpv6> ipv6s;
    /**
     * @return The ID of the Linode this address currently belongs to.
     * 
     */
    private Integer linodeId;

    private GetInstanceNetworkingResult() {}
    public String id() {
        return this.id;
    }
    public List<GetInstanceNetworkingIpv4> ipv4s() {
        return this.ipv4s;
    }
    public List<GetInstanceNetworkingIpv6> ipv6s() {
        return this.ipv6s;
    }
    /**
     * @return The ID of the Linode this address currently belongs to.
     * 
     */
    public Integer linodeId() {
        return this.linodeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceNetworkingResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<GetInstanceNetworkingIpv4> ipv4s;
        private List<GetInstanceNetworkingIpv6> ipv6s;
        private Integer linodeId;
        public Builder() {}
        public Builder(GetInstanceNetworkingResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ipv4s = defaults.ipv4s;
    	      this.ipv6s = defaults.ipv6s;
    	      this.linodeId = defaults.linodeId;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder ipv4s(List<GetInstanceNetworkingIpv4> ipv4s) {
            this.ipv4s = Objects.requireNonNull(ipv4s);
            return this;
        }
        public Builder ipv4s(GetInstanceNetworkingIpv4... ipv4s) {
            return ipv4s(List.of(ipv4s));
        }
        @CustomType.Setter
        public Builder ipv6s(List<GetInstanceNetworkingIpv6> ipv6s) {
            this.ipv6s = Objects.requireNonNull(ipv6s);
            return this;
        }
        public Builder ipv6s(GetInstanceNetworkingIpv6... ipv6s) {
            return ipv6s(List.of(ipv6s));
        }
        @CustomType.Setter
        public Builder linodeId(Integer linodeId) {
            this.linodeId = Objects.requireNonNull(linodeId);
            return this;
        }
        public GetInstanceNetworkingResult build() {
            final var _resultValue = new GetInstanceNetworkingResult();
            _resultValue.id = id;
            _resultValue.ipv4s = ipv4s;
            _resultValue.ipv6s = ipv6s;
            _resultValue.linodeId = linodeId;
            return _resultValue;
        }
    }
}
