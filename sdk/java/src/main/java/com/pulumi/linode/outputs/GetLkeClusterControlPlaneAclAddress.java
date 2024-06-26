// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetLkeClusterControlPlaneAclAddress {
    /**
     * @return A set of individual ipv4 addresses or CIDRs to ALLOW.
     * 
     */
    private List<String> ipv4s;
    /**
     * @return A set of individual ipv6 addresses or CIDRs to ALLOW.
     * 
     */
    private List<String> ipv6s;

    private GetLkeClusterControlPlaneAclAddress() {}
    /**
     * @return A set of individual ipv4 addresses or CIDRs to ALLOW.
     * 
     */
    public List<String> ipv4s() {
        return this.ipv4s;
    }
    /**
     * @return A set of individual ipv6 addresses or CIDRs to ALLOW.
     * 
     */
    public List<String> ipv6s() {
        return this.ipv6s;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLkeClusterControlPlaneAclAddress defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> ipv4s;
        private List<String> ipv6s;
        public Builder() {}
        public Builder(GetLkeClusterControlPlaneAclAddress defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipv4s = defaults.ipv4s;
    	      this.ipv6s = defaults.ipv6s;
        }

        @CustomType.Setter
        public Builder ipv4s(List<String> ipv4s) {
            if (ipv4s == null) {
              throw new MissingRequiredPropertyException("GetLkeClusterControlPlaneAclAddress", "ipv4s");
            }
            this.ipv4s = ipv4s;
            return this;
        }
        public Builder ipv4s(String... ipv4s) {
            return ipv4s(List.of(ipv4s));
        }
        @CustomType.Setter
        public Builder ipv6s(List<String> ipv6s) {
            if (ipv6s == null) {
              throw new MissingRequiredPropertyException("GetLkeClusterControlPlaneAclAddress", "ipv6s");
            }
            this.ipv6s = ipv6s;
            return this;
        }
        public Builder ipv6s(String... ipv6s) {
            return ipv6s(List.of(ipv6s));
        }
        public GetLkeClusterControlPlaneAclAddress build() {
            final var _resultValue = new GetLkeClusterControlPlaneAclAddress();
            _resultValue.ipv4s = ipv4s;
            _resultValue.ipv6s = ipv6s;
            return _resultValue;
        }
    }
}
