// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.linode.inputs.GetPlacementGroupMigrationsInboundArgs;
import com.pulumi.linode.inputs.GetPlacementGroupMigrationsOutboundArgs;
import java.util.List;
import java.util.Objects;


public final class GetPlacementGroupMigrationsArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPlacementGroupMigrationsArgs Empty = new GetPlacementGroupMigrationsArgs();

    /**
     * A list of the Linodes the system is migrating into the placement group.
     * 
     */
    @Import(name="inbounds", required=true)
    private Output<List<GetPlacementGroupMigrationsInboundArgs>> inbounds;

    /**
     * @return A list of the Linodes the system is migrating into the placement group.
     * 
     */
    public Output<List<GetPlacementGroupMigrationsInboundArgs>> inbounds() {
        return this.inbounds;
    }

    /**
     * A list of the Linodes the system is migrating out of the placement group.
     * 
     */
    @Import(name="outbounds", required=true)
    private Output<List<GetPlacementGroupMigrationsOutboundArgs>> outbounds;

    /**
     * @return A list of the Linodes the system is migrating out of the placement group.
     * 
     */
    public Output<List<GetPlacementGroupMigrationsOutboundArgs>> outbounds() {
        return this.outbounds;
    }

    private GetPlacementGroupMigrationsArgs() {}

    private GetPlacementGroupMigrationsArgs(GetPlacementGroupMigrationsArgs $) {
        this.inbounds = $.inbounds;
        this.outbounds = $.outbounds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPlacementGroupMigrationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPlacementGroupMigrationsArgs $;

        public Builder() {
            $ = new GetPlacementGroupMigrationsArgs();
        }

        public Builder(GetPlacementGroupMigrationsArgs defaults) {
            $ = new GetPlacementGroupMigrationsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param inbounds A list of the Linodes the system is migrating into the placement group.
         * 
         * @return builder
         * 
         */
        public Builder inbounds(Output<List<GetPlacementGroupMigrationsInboundArgs>> inbounds) {
            $.inbounds = inbounds;
            return this;
        }

        /**
         * @param inbounds A list of the Linodes the system is migrating into the placement group.
         * 
         * @return builder
         * 
         */
        public Builder inbounds(List<GetPlacementGroupMigrationsInboundArgs> inbounds) {
            return inbounds(Output.of(inbounds));
        }

        /**
         * @param inbounds A list of the Linodes the system is migrating into the placement group.
         * 
         * @return builder
         * 
         */
        public Builder inbounds(GetPlacementGroupMigrationsInboundArgs... inbounds) {
            return inbounds(List.of(inbounds));
        }

        /**
         * @param outbounds A list of the Linodes the system is migrating out of the placement group.
         * 
         * @return builder
         * 
         */
        public Builder outbounds(Output<List<GetPlacementGroupMigrationsOutboundArgs>> outbounds) {
            $.outbounds = outbounds;
            return this;
        }

        /**
         * @param outbounds A list of the Linodes the system is migrating out of the placement group.
         * 
         * @return builder
         * 
         */
        public Builder outbounds(List<GetPlacementGroupMigrationsOutboundArgs> outbounds) {
            return outbounds(Output.of(outbounds));
        }

        /**
         * @param outbounds A list of the Linodes the system is migrating out of the placement group.
         * 
         * @return builder
         * 
         */
        public Builder outbounds(GetPlacementGroupMigrationsOutboundArgs... outbounds) {
            return outbounds(List.of(outbounds));
        }

        public GetPlacementGroupMigrationsArgs build() {
            if ($.inbounds == null) {
                throw new MissingRequiredPropertyException("GetPlacementGroupMigrationsArgs", "inbounds");
            }
            if ($.outbounds == null) {
                throw new MissingRequiredPropertyException("GetPlacementGroupMigrationsArgs", "outbounds");
            }
            return $;
        }
    }

}
