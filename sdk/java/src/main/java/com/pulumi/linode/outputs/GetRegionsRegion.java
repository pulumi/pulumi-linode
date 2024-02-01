// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.linode.outputs.GetRegionsRegionResolver;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetRegionsRegion {
    /**
     * @return A list of capabilities of this region.
     * 
     */
    private List<String> capabilities;
    /**
     * @return The country the region resides in.
     * 
     */
    private String country;
    /**
     * @return The unique ID of this Region.
     * 
     */
    private String id;
    /**
     * @return Detailed location information for this Region, including city, state or region, and country.
     * 
     */
    private String label;
    private @Nullable List<GetRegionsRegionResolver> resolvers;
    /**
     * @return This region’s current operational status (ok or outage).
     * 
     */
    private String status;

    private GetRegionsRegion() {}
    /**
     * @return A list of capabilities of this region.
     * 
     */
    public List<String> capabilities() {
        return this.capabilities;
    }
    /**
     * @return The country the region resides in.
     * 
     */
    public String country() {
        return this.country;
    }
    /**
     * @return The unique ID of this Region.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Detailed location information for this Region, including city, state or region, and country.
     * 
     */
    public String label() {
        return this.label;
    }
    public List<GetRegionsRegionResolver> resolvers() {
        return this.resolvers == null ? List.of() : this.resolvers;
    }
    /**
     * @return This region’s current operational status (ok or outage).
     * 
     */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegionsRegion defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> capabilities;
        private String country;
        private String id;
        private String label;
        private @Nullable List<GetRegionsRegionResolver> resolvers;
        private String status;
        public Builder() {}
        public Builder(GetRegionsRegion defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capabilities = defaults.capabilities;
    	      this.country = defaults.country;
    	      this.id = defaults.id;
    	      this.label = defaults.label;
    	      this.resolvers = defaults.resolvers;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder capabilities(List<String> capabilities) {
            if (capabilities == null) {
              throw new MissingRequiredPropertyException("GetRegionsRegion", "capabilities");
            }
            this.capabilities = capabilities;
            return this;
        }
        public Builder capabilities(String... capabilities) {
            return capabilities(List.of(capabilities));
        }
        @CustomType.Setter
        public Builder country(String country) {
            if (country == null) {
              throw new MissingRequiredPropertyException("GetRegionsRegion", "country");
            }
            this.country = country;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetRegionsRegion", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder label(String label) {
            if (label == null) {
              throw new MissingRequiredPropertyException("GetRegionsRegion", "label");
            }
            this.label = label;
            return this;
        }
        @CustomType.Setter
        public Builder resolvers(@Nullable List<GetRegionsRegionResolver> resolvers) {

            this.resolvers = resolvers;
            return this;
        }
        public Builder resolvers(GetRegionsRegionResolver... resolvers) {
            return resolvers(List.of(resolvers));
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetRegionsRegion", "status");
            }
            this.status = status;
            return this;
        }
        public GetRegionsRegion build() {
            final var _resultValue = new GetRegionsRegion();
            _resultValue.capabilities = capabilities;
            _resultValue.country = country;
            _resultValue.id = id;
            _resultValue.label = label;
            _resultValue.resolvers = resolvers;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}
