// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.linode.inputs.GetRegionsRegionResolver;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegionsRegion extends com.pulumi.resources.InvokeArgs {

    public static final GetRegionsRegion Empty = new GetRegionsRegion();

    /**
     * A list of capabilities of this region.
     * 
     */
    @Import(name="capabilities", required=true)
    private List<String> capabilities;

    /**
     * @return A list of capabilities of this region.
     * 
     */
    public List<String> capabilities() {
        return this.capabilities;
    }

    /**
     * The country the region resides in.
     * 
     */
    @Import(name="country", required=true)
    private String country;

    /**
     * @return The country the region resides in.
     * 
     */
    public String country() {
        return this.country;
    }

    /**
     * The unique ID of this Region.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return The unique ID of this Region.
     * 
     */
    public String id() {
        return this.id;
    }

    /**
     * Detailed location information for this Region, including city, state or region, and country.
     * 
     */
    @Import(name="label", required=true)
    private String label;

    /**
     * @return Detailed location information for this Region, including city, state or region, and country.
     * 
     */
    public String label() {
        return this.label;
    }

    @Import(name="resolvers")
    private @Nullable List<GetRegionsRegionResolver> resolvers;

    public Optional<List<GetRegionsRegionResolver>> resolvers() {
        return Optional.ofNullable(this.resolvers);
    }

    /**
     * This region’s current operational status (ok or outage).
     * 
     */
    @Import(name="status", required=true)
    private String status;

    /**
     * @return This region’s current operational status (ok or outage).
     * 
     */
    public String status() {
        return this.status;
    }

    private GetRegionsRegion() {}

    private GetRegionsRegion(GetRegionsRegion $) {
        this.capabilities = $.capabilities;
        this.country = $.country;
        this.id = $.id;
        this.label = $.label;
        this.resolvers = $.resolvers;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRegionsRegion defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRegionsRegion $;

        public Builder() {
            $ = new GetRegionsRegion();
        }

        public Builder(GetRegionsRegion defaults) {
            $ = new GetRegionsRegion(Objects.requireNonNull(defaults));
        }

        /**
         * @param capabilities A list of capabilities of this region.
         * 
         * @return builder
         * 
         */
        public Builder capabilities(List<String> capabilities) {
            $.capabilities = capabilities;
            return this;
        }

        /**
         * @param capabilities A list of capabilities of this region.
         * 
         * @return builder
         * 
         */
        public Builder capabilities(String... capabilities) {
            return capabilities(List.of(capabilities));
        }

        /**
         * @param country The country the region resides in.
         * 
         * @return builder
         * 
         */
        public Builder country(String country) {
            $.country = country;
            return this;
        }

        /**
         * @param id The unique ID of this Region.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        /**
         * @param label Detailed location information for this Region, including city, state or region, and country.
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            $.label = label;
            return this;
        }

        public Builder resolvers(@Nullable List<GetRegionsRegionResolver> resolvers) {
            $.resolvers = resolvers;
            return this;
        }

        public Builder resolvers(GetRegionsRegionResolver... resolvers) {
            return resolvers(List.of(resolvers));
        }

        /**
         * @param status This region’s current operational status (ok or outage).
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            $.status = status;
            return this;
        }

        public GetRegionsRegion build() {
            if ($.capabilities == null) {
                throw new MissingRequiredPropertyException("GetRegionsRegion", "capabilities");
            }
            if ($.country == null) {
                throw new MissingRequiredPropertyException("GetRegionsRegion", "country");
            }
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetRegionsRegion", "id");
            }
            if ($.label == null) {
                throw new MissingRequiredPropertyException("GetRegionsRegion", "label");
            }
            if ($.status == null) {
                throw new MissingRequiredPropertyException("GetRegionsRegion", "status");
            }
            return $;
        }
    }

}
