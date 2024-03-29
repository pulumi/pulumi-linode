// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;


public final class GetDomainZonefilePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDomainZonefilePlainArgs Empty = new GetDomainZonefilePlainArgs();

    /**
     * The associated domain&#39;s unique ID.
     * 
     */
    @Import(name="domainId", required=true)
    private Integer domainId;

    /**
     * @return The associated domain&#39;s unique ID.
     * 
     */
    public Integer domainId() {
        return this.domainId;
    }

    private GetDomainZonefilePlainArgs() {}

    private GetDomainZonefilePlainArgs(GetDomainZonefilePlainArgs $) {
        this.domainId = $.domainId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDomainZonefilePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDomainZonefilePlainArgs $;

        public Builder() {
            $ = new GetDomainZonefilePlainArgs();
        }

        public Builder(GetDomainZonefilePlainArgs defaults) {
            $ = new GetDomainZonefilePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param domainId The associated domain&#39;s unique ID.
         * 
         * @return builder
         * 
         */
        public Builder domainId(Integer domainId) {
            $.domainId = domainId;
            return this;
        }

        public GetDomainZonefilePlainArgs build() {
            if ($.domainId == null) {
                throw new MissingRequiredPropertyException("GetDomainZonefilePlainArgs", "domainId");
            }
            return $;
        }
    }

}
