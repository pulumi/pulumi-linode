// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class GetLkeClusterControlPlane {
    /**
     * @return Whether High Availability is enabled for the cluster Control Plane.
     * 
     */
    private Boolean highAvailability;

    private GetLkeClusterControlPlane() {}
    /**
     * @return Whether High Availability is enabled for the cluster Control Plane.
     * 
     */
    public Boolean highAvailability() {
        return this.highAvailability;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLkeClusterControlPlane defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean highAvailability;
        public Builder() {}
        public Builder(GetLkeClusterControlPlane defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.highAvailability = defaults.highAvailability;
        }

        @CustomType.Setter
        public Builder highAvailability(Boolean highAvailability) {
            if (highAvailability == null) {
              throw new MissingRequiredPropertyException("GetLkeClusterControlPlane", "highAvailability");
            }
            this.highAvailability = highAvailability;
            return this;
        }
        public GetLkeClusterControlPlane build() {
            final var _resultValue = new GetLkeClusterControlPlane();
            _resultValue.highAvailability = highAvailability;
            return _resultValue;
        }
    }
}
