// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;


public final class GetPlacementGroupMigrationsOutbound extends com.pulumi.resources.InvokeArgs {

    public static final GetPlacementGroupMigrationsOutbound Empty = new GetPlacementGroupMigrationsOutbound();

    /**
     * The ID of the Linode.
     * 
     */
    @Import(name="linodeId", required=true)
    private Integer linodeId;

    /**
     * @return The ID of the Linode.
     * 
     */
    public Integer linodeId() {
        return this.linodeId;
    }

    private GetPlacementGroupMigrationsOutbound() {}

    private GetPlacementGroupMigrationsOutbound(GetPlacementGroupMigrationsOutbound $) {
        this.linodeId = $.linodeId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPlacementGroupMigrationsOutbound defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPlacementGroupMigrationsOutbound $;

        public Builder() {
            $ = new GetPlacementGroupMigrationsOutbound();
        }

        public Builder(GetPlacementGroupMigrationsOutbound defaults) {
            $ = new GetPlacementGroupMigrationsOutbound(Objects.requireNonNull(defaults));
        }

        /**
         * @param linodeId The ID of the Linode.
         * 
         * @return builder
         * 
         */
        public Builder linodeId(Integer linodeId) {
            $.linodeId = linodeId;
            return this;
        }

        public GetPlacementGroupMigrationsOutbound build() {
            if ($.linodeId == null) {
                throw new MissingRequiredPropertyException("GetPlacementGroupMigrationsOutbound", "linodeId");
            }
            return $;
        }
    }

}
