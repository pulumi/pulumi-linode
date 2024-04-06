// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.util.Objects;


public final class GetLkeClusterControlPlane extends com.pulumi.resources.InvokeArgs {

    public static final GetLkeClusterControlPlane Empty = new GetLkeClusterControlPlane();

    /**
     * Whether High Availability is enabled for the cluster Control Plane.
     * 
     */
    @Import(name="highAvailability", required=true)
    private Boolean highAvailability;

    /**
     * @return Whether High Availability is enabled for the cluster Control Plane.
     * 
     */
    public Boolean highAvailability() {
        return this.highAvailability;
    }

    private GetLkeClusterControlPlane() {}

    private GetLkeClusterControlPlane(GetLkeClusterControlPlane $) {
        this.highAvailability = $.highAvailability;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLkeClusterControlPlane defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLkeClusterControlPlane $;

        public Builder() {
            $ = new GetLkeClusterControlPlane();
        }

        public Builder(GetLkeClusterControlPlane defaults) {
            $ = new GetLkeClusterControlPlane(Objects.requireNonNull(defaults));
        }

        /**
         * @param highAvailability Whether High Availability is enabled for the cluster Control Plane.
         * 
         * @return builder
         * 
         */
        public Builder highAvailability(Boolean highAvailability) {
            $.highAvailability = highAvailability;
            return this;
        }

        public GetLkeClusterControlPlane build() {
            if ($.highAvailability == null) {
                throw new MissingRequiredPropertyException("GetLkeClusterControlPlane", "highAvailability");
            }
            return $;
        }
    }

}
