// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetIpv6RangesRange {
    /**
     * @return The prefix length of the address, denoting how many addresses can be assigned from this range.
     * 
     */
    private Integer prefix;
    /**
     * @return The IPv6 address of this range.
     * 
     */
    private String range;
    /**
     * @return The region for this range of IPv6 addresses.
     * 
     */
    private String region;
    /**
     * @return The IPv6 SLAAC address.
     * 
     */
    private String routeTarget;

    private GetIpv6RangesRange() {}
    /**
     * @return The prefix length of the address, denoting how many addresses can be assigned from this range.
     * 
     */
    public Integer prefix() {
        return this.prefix;
    }
    /**
     * @return The IPv6 address of this range.
     * 
     */
    public String range() {
        return this.range;
    }
    /**
     * @return The region for this range of IPv6 addresses.
     * 
     */
    public String region() {
        return this.region;
    }
    /**
     * @return The IPv6 SLAAC address.
     * 
     */
    public String routeTarget() {
        return this.routeTarget;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIpv6RangesRange defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer prefix;
        private String range;
        private String region;
        private String routeTarget;
        public Builder() {}
        public Builder(GetIpv6RangesRange defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.prefix = defaults.prefix;
    	      this.range = defaults.range;
    	      this.region = defaults.region;
    	      this.routeTarget = defaults.routeTarget;
        }

        @CustomType.Setter
        public Builder prefix(Integer prefix) {
            if (prefix == null) {
              throw new MissingRequiredPropertyException("GetIpv6RangesRange", "prefix");
            }
            this.prefix = prefix;
            return this;
        }
        @CustomType.Setter
        public Builder range(String range) {
            if (range == null) {
              throw new MissingRequiredPropertyException("GetIpv6RangesRange", "range");
            }
            this.range = range;
            return this;
        }
        @CustomType.Setter
        public Builder region(String region) {
            if (region == null) {
              throw new MissingRequiredPropertyException("GetIpv6RangesRange", "region");
            }
            this.region = region;
            return this;
        }
        @CustomType.Setter
        public Builder routeTarget(String routeTarget) {
            if (routeTarget == null) {
              throw new MissingRequiredPropertyException("GetIpv6RangesRange", "routeTarget");
            }
            this.routeTarget = routeTarget;
            return this;
        }
        public GetIpv6RangesRange build() {
            final var _resultValue = new GetIpv6RangesRange();
            _resultValue.prefix = prefix;
            _resultValue.range = range;
            _resultValue.region = region;
            _resultValue.routeTarget = routeTarget;
            return _resultValue;
        }
    }
}
