// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetRegionsRegionResolverArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetRegionsRegionResolverArgs Empty = new GetRegionsRegionResolverArgs();

    /**
     * The IPv4 addresses for this region’s DNS resolvers, separated by commas.
     * 
     */
    @Import(name="ipv4", required=true)
    private Output<String> ipv4;

    /**
     * @return The IPv4 addresses for this region’s DNS resolvers, separated by commas.
     * 
     */
    public Output<String> ipv4() {
        return this.ipv4;
    }

    /**
     * The IPv6 addresses for this region’s DNS resolvers, separated by commas.
     * 
     */
    @Import(name="ipv6", required=true)
    private Output<String> ipv6;

    /**
     * @return The IPv6 addresses for this region’s DNS resolvers, separated by commas.
     * 
     */
    public Output<String> ipv6() {
        return this.ipv6;
    }

    private GetRegionsRegionResolverArgs() {}

    private GetRegionsRegionResolverArgs(GetRegionsRegionResolverArgs $) {
        this.ipv4 = $.ipv4;
        this.ipv6 = $.ipv6;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRegionsRegionResolverArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRegionsRegionResolverArgs $;

        public Builder() {
            $ = new GetRegionsRegionResolverArgs();
        }

        public Builder(GetRegionsRegionResolverArgs defaults) {
            $ = new GetRegionsRegionResolverArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ipv4 The IPv4 addresses for this region’s DNS resolvers, separated by commas.
         * 
         * @return builder
         * 
         */
        public Builder ipv4(Output<String> ipv4) {
            $.ipv4 = ipv4;
            return this;
        }

        /**
         * @param ipv4 The IPv4 addresses for this region’s DNS resolvers, separated by commas.
         * 
         * @return builder
         * 
         */
        public Builder ipv4(String ipv4) {
            return ipv4(Output.of(ipv4));
        }

        /**
         * @param ipv6 The IPv6 addresses for this region’s DNS resolvers, separated by commas.
         * 
         * @return builder
         * 
         */
        public Builder ipv6(Output<String> ipv6) {
            $.ipv6 = ipv6;
            return this;
        }

        /**
         * @param ipv6 The IPv6 addresses for this region’s DNS resolvers, separated by commas.
         * 
         * @return builder
         * 
         */
        public Builder ipv6(String ipv6) {
            return ipv6(Output.of(ipv6));
        }

        public GetRegionsRegionResolverArgs build() {
            if ($.ipv4 == null) {
                throw new MissingRequiredPropertyException("GetRegionsRegionResolverArgs", "ipv4");
            }
            if ($.ipv6 == null) {
                throw new MissingRequiredPropertyException("GetRegionsRegionResolverArgs", "ipv6");
            }
            return $;
        }
    }

}
