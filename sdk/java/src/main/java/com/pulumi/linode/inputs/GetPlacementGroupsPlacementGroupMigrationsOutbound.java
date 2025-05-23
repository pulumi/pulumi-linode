// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;


public final class GetPlacementGroupsPlacementGroupMigrationsOutbound extends com.pulumi.resources.InvokeArgs {

    public static final GetPlacementGroupsPlacementGroupMigrationsOutbound Empty = new GetPlacementGroupsPlacementGroupMigrationsOutbound();

    /**
     * The unique identifier for the Linode being migrated out of the placement group.
     * 
     */
    @Import(name="linodeId", required=true)
    private Integer linodeId;

    /**
     * @return The unique identifier for the Linode being migrated out of the placement group.
     * 
     */
    public Integer linodeId() {
        return this.linodeId;
    }

    private GetPlacementGroupsPlacementGroupMigrationsOutbound() {}

    private GetPlacementGroupsPlacementGroupMigrationsOutbound(GetPlacementGroupsPlacementGroupMigrationsOutbound $) {
        this.linodeId = $.linodeId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPlacementGroupsPlacementGroupMigrationsOutbound defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPlacementGroupsPlacementGroupMigrationsOutbound $;

        public Builder() {
            $ = new GetPlacementGroupsPlacementGroupMigrationsOutbound();
        }

        public Builder(GetPlacementGroupsPlacementGroupMigrationsOutbound defaults) {
            $ = new GetPlacementGroupsPlacementGroupMigrationsOutbound(Objects.requireNonNull(defaults));
        }

        /**
         * @param linodeId The unique identifier for the Linode being migrated out of the placement group.
         * 
         * @return builder
         * 
         */
        public Builder linodeId(Integer linodeId) {
            $.linodeId = linodeId;
            return this;
        }

        public GetPlacementGroupsPlacementGroupMigrationsOutbound build() {
            if ($.linodeId == null) {
                throw new MissingRequiredPropertyException("GetPlacementGroupsPlacementGroupMigrationsOutbound", "linodeId");
            }
            return $;
        }
    }

}
