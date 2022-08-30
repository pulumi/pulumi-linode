// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class GetLkeClusterControlPlane {
    private Boolean highAvailability;

    private GetLkeClusterControlPlane() {}
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
            this.highAvailability = Objects.requireNonNull(highAvailability);
            return this;
        }
        public GetLkeClusterControlPlane build() {
            final var o = new GetLkeClusterControlPlane();
            o.highAvailability = highAvailability;
            return o;
        }
    }
}
