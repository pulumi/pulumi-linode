// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;


public final class GetPlacementGroupsPlacementGroupMigrationsOutboundArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPlacementGroupsPlacementGroupMigrationsOutboundArgs Empty = new GetPlacementGroupsPlacementGroupMigrationsOutboundArgs();

    /**
     * The unique identifier for the Linode being migrated out of the placement group.
     * 
     */
    @Import(name="linodeId", required=true)
    private Output<Integer> linodeId;

    /**
     * @return The unique identifier for the Linode being migrated out of the placement group.
     * 
     */
    public Output<Integer> linodeId() {
        return this.linodeId;
    }

    private GetPlacementGroupsPlacementGroupMigrationsOutboundArgs() {}

    private GetPlacementGroupsPlacementGroupMigrationsOutboundArgs(GetPlacementGroupsPlacementGroupMigrationsOutboundArgs $) {
        this.linodeId = $.linodeId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPlacementGroupsPlacementGroupMigrationsOutboundArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPlacementGroupsPlacementGroupMigrationsOutboundArgs $;

        public Builder() {
            $ = new GetPlacementGroupsPlacementGroupMigrationsOutboundArgs();
        }

        public Builder(GetPlacementGroupsPlacementGroupMigrationsOutboundArgs defaults) {
            $ = new GetPlacementGroupsPlacementGroupMigrationsOutboundArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param linodeId The unique identifier for the Linode being migrated out of the placement group.
         * 
         * @return builder
         * 
         */
        public Builder linodeId(Output<Integer> linodeId) {
            $.linodeId = linodeId;
            return this;
        }

        /**
         * @param linodeId The unique identifier for the Linode being migrated out of the placement group.
         * 
         * @return builder
         * 
         */
        public Builder linodeId(Integer linodeId) {
            return linodeId(Output.of(linodeId));
        }

        public GetPlacementGroupsPlacementGroupMigrationsOutboundArgs build() {
            if ($.linodeId == null) {
                throw new MissingRequiredPropertyException("GetPlacementGroupsPlacementGroupMigrationsOutboundArgs", "linodeId");
            }
            return $;
        }
    }

}
