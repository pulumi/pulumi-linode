// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;


public final class GetPlacementGroupMigrationsInboundArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPlacementGroupMigrationsInboundArgs Empty = new GetPlacementGroupMigrationsInboundArgs();

    /**
     * The ID of the Linode.
     * 
     */
    @Import(name="linodeId", required=true)
    private Output<Integer> linodeId;

    /**
     * @return The ID of the Linode.
     * 
     */
    public Output<Integer> linodeId() {
        return this.linodeId;
    }

    private GetPlacementGroupMigrationsInboundArgs() {}

    private GetPlacementGroupMigrationsInboundArgs(GetPlacementGroupMigrationsInboundArgs $) {
        this.linodeId = $.linodeId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPlacementGroupMigrationsInboundArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPlacementGroupMigrationsInboundArgs $;

        public Builder() {
            $ = new GetPlacementGroupMigrationsInboundArgs();
        }

        public Builder(GetPlacementGroupMigrationsInboundArgs defaults) {
            $ = new GetPlacementGroupMigrationsInboundArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param linodeId The ID of the Linode.
         * 
         * @return builder
         * 
         */
        public Builder linodeId(Output<Integer> linodeId) {
            $.linodeId = linodeId;
            return this;
        }

        /**
         * @param linodeId The ID of the Linode.
         * 
         * @return builder
         * 
         */
        public Builder linodeId(Integer linodeId) {
            return linodeId(Output.of(linodeId));
        }

        public GetPlacementGroupMigrationsInboundArgs build() {
            if ($.linodeId == null) {
                throw new MissingRequiredPropertyException("GetPlacementGroupMigrationsInboundArgs", "linodeId");
            }
            return $;
        }
    }

}
