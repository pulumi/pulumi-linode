// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetRegionsRegionResolver {
    /**
     * @return The IPv4 addresses for this region’s DNS resolvers, separated by commas.
     * 
     */
    private String ipv4;
    /**
     * @return The IPv6 addresses for this region’s DNS resolvers, separated by commas.
     * 
     */
    private String ipv6;

    private GetRegionsRegionResolver() {}
    /**
     * @return The IPv4 addresses for this region’s DNS resolvers, separated by commas.
     * 
     */
    public String ipv4() {
        return this.ipv4;
    }
    /**
     * @return The IPv6 addresses for this region’s DNS resolvers, separated by commas.
     * 
     */
    public String ipv6() {
        return this.ipv6;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegionsRegionResolver defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String ipv4;
        private String ipv6;
        public Builder() {}
        public Builder(GetRegionsRegionResolver defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipv4 = defaults.ipv4;
    	      this.ipv6 = defaults.ipv6;
        }

        @CustomType.Setter
        public Builder ipv4(String ipv4) {
            if (ipv4 == null) {
              throw new MissingRequiredPropertyException("GetRegionsRegionResolver", "ipv4");
            }
            this.ipv4 = ipv4;
            return this;
        }
        @CustomType.Setter
        public Builder ipv6(String ipv6) {
            if (ipv6 == null) {
              throw new MissingRequiredPropertyException("GetRegionsRegionResolver", "ipv6");
            }
            this.ipv6 = ipv6;
            return this;
        }
        public GetRegionsRegionResolver build() {
            final var _resultValue = new GetRegionsRegionResolver();
            _resultValue.ipv4 = ipv4;
            _resultValue.ipv6 = ipv6;
            return _resultValue;
        }
    }
}
