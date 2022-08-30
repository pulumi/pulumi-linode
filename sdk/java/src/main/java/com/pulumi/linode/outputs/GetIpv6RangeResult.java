// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetIpv6RangeResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private Boolean isBgp;
    /**
     * @return A set of Linodes targeted by this IPv6 range. Includes Linodes with IP sharing.
     * 
     */
    private List<Integer> linodes;
    /**
     * @return The prefix length of the address, denoting how many addresses can be assigned from this range.
     * 
     */
    private Integer prefix;
    private String range;
    /**
     * @return The region for this range of IPv6 addresses.
     * 
     */
    private String region;

    private GetIpv6RangeResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Boolean isBgp() {
        return this.isBgp;
    }
    /**
     * @return A set of Linodes targeted by this IPv6 range. Includes Linodes with IP sharing.
     * 
     */
    public List<Integer> linodes() {
        return this.linodes;
    }
    /**
     * @return The prefix length of the address, denoting how many addresses can be assigned from this range.
     * 
     */
    public Integer prefix() {
        return this.prefix;
    }
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

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIpv6RangeResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private Boolean isBgp;
        private List<Integer> linodes;
        private Integer prefix;
        private String range;
        private String region;
        public Builder() {}
        public Builder(GetIpv6RangeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.isBgp = defaults.isBgp;
    	      this.linodes = defaults.linodes;
    	      this.prefix = defaults.prefix;
    	      this.range = defaults.range;
    	      this.region = defaults.region;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder isBgp(Boolean isBgp) {
            this.isBgp = Objects.requireNonNull(isBgp);
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
        public Builder prefix(Integer prefix) {
            this.prefix = Objects.requireNonNull(prefix);
            return this;
        }
        @CustomType.Setter
        public Builder range(String range) {
            this.range = Objects.requireNonNull(range);
            return this;
        }
        @CustomType.Setter
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public GetIpv6RangeResult build() {
            final var o = new GetIpv6RangeResult();
            o.id = id;
            o.isBgp = isBgp;
            o.linodes = linodes;
            o.prefix = prefix;
            o.range = range;
            o.region = region;
            return o;
        }
    }
}
