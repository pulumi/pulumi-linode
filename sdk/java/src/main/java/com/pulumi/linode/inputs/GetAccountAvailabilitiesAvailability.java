// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetAccountAvailabilitiesAvailability extends com.pulumi.resources.InvokeArgs {

    public static final GetAccountAvailabilitiesAvailability Empty = new GetAccountAvailabilitiesAvailability();

    /**
     * The region this availability entry refers to.
     * 
     */
    @Import(name="region", required=true)
    private String region;

    /**
     * @return The region this availability entry refers to.
     * 
     */
    public String region() {
        return this.region;
    }

    /**
     * A set of services that are unavailable for the given region.
     * 
     */
    @Import(name="unavailables", required=true)
    private List<String> unavailables;

    /**
     * @return A set of services that are unavailable for the given region.
     * 
     */
    public List<String> unavailables() {
        return this.unavailables;
    }

    private GetAccountAvailabilitiesAvailability() {}

    private GetAccountAvailabilitiesAvailability(GetAccountAvailabilitiesAvailability $) {
        this.region = $.region;
        this.unavailables = $.unavailables;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAccountAvailabilitiesAvailability defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAccountAvailabilitiesAvailability $;

        public Builder() {
            $ = new GetAccountAvailabilitiesAvailability();
        }

        public Builder(GetAccountAvailabilitiesAvailability defaults) {
            $ = new GetAccountAvailabilitiesAvailability(Objects.requireNonNull(defaults));
        }

        /**
         * @param region The region this availability entry refers to.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            $.region = region;
            return this;
        }

        /**
         * @param unavailables A set of services that are unavailable for the given region.
         * 
         * @return builder
         * 
         */
        public Builder unavailables(List<String> unavailables) {
            $.unavailables = unavailables;
            return this;
        }

        /**
         * @param unavailables A set of services that are unavailable for the given region.
         * 
         * @return builder
         * 
         */
        public Builder unavailables(String... unavailables) {
            return unavailables(List.of(unavailables));
        }

        public GetAccountAvailabilitiesAvailability build() {
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            $.unavailables = Objects.requireNonNull($.unavailables, "expected parameter 'unavailables' to be non-null");
            return $;
        }
    }

}
