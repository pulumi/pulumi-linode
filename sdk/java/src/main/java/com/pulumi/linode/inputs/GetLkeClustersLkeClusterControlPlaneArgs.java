// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.util.Objects;


public final class GetLkeClustersLkeClusterControlPlaneArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetLkeClustersLkeClusterControlPlaneArgs Empty = new GetLkeClustersLkeClusterControlPlaneArgs();

    /**
     * Whether High Availability is enabled for the cluster Control Plane.
     * 
     */
    @Import(name="highAvailability", required=true)
    private Output<Boolean> highAvailability;

    /**
     * @return Whether High Availability is enabled for the cluster Control Plane.
     * 
     */
    public Output<Boolean> highAvailability() {
        return this.highAvailability;
    }

    private GetLkeClustersLkeClusterControlPlaneArgs() {}

    private GetLkeClustersLkeClusterControlPlaneArgs(GetLkeClustersLkeClusterControlPlaneArgs $) {
        this.highAvailability = $.highAvailability;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLkeClustersLkeClusterControlPlaneArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLkeClustersLkeClusterControlPlaneArgs $;

        public Builder() {
            $ = new GetLkeClustersLkeClusterControlPlaneArgs();
        }

        public Builder(GetLkeClustersLkeClusterControlPlaneArgs defaults) {
            $ = new GetLkeClustersLkeClusterControlPlaneArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param highAvailability Whether High Availability is enabled for the cluster Control Plane.
         * 
         * @return builder
         * 
         */
        public Builder highAvailability(Output<Boolean> highAvailability) {
            $.highAvailability = highAvailability;
            return this;
        }

        /**
         * @param highAvailability Whether High Availability is enabled for the cluster Control Plane.
         * 
         * @return builder
         * 
         */
        public Builder highAvailability(Boolean highAvailability) {
            return highAvailability(Output.of(highAvailability));
        }

        public GetLkeClustersLkeClusterControlPlaneArgs build() {
            if ($.highAvailability == null) {
                throw new MissingRequiredPropertyException("GetLkeClustersLkeClusterControlPlaneArgs", "highAvailability");
            }
            return $;
        }
    }

}
