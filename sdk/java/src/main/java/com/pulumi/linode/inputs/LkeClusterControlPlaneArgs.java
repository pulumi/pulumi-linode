// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LkeClusterControlPlaneArgs extends com.pulumi.resources.ResourceArgs {

    public static final LkeClusterControlPlaneArgs Empty = new LkeClusterControlPlaneArgs();

    /**
     * Defines whether High Availability is enabled for the cluster Control Plane. This is an **irreversible** change.
     * 
     */
    @Import(name="highAvailability")
    private @Nullable Output<Boolean> highAvailability;

    /**
     * @return Defines whether High Availability is enabled for the cluster Control Plane. This is an **irreversible** change.
     * 
     */
    public Optional<Output<Boolean>> highAvailability() {
        return Optional.ofNullable(this.highAvailability);
    }

    private LkeClusterControlPlaneArgs() {}

    private LkeClusterControlPlaneArgs(LkeClusterControlPlaneArgs $) {
        this.highAvailability = $.highAvailability;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LkeClusterControlPlaneArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LkeClusterControlPlaneArgs $;

        public Builder() {
            $ = new LkeClusterControlPlaneArgs();
        }

        public Builder(LkeClusterControlPlaneArgs defaults) {
            $ = new LkeClusterControlPlaneArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param highAvailability Defines whether High Availability is enabled for the cluster Control Plane. This is an **irreversible** change.
         * 
         * @return builder
         * 
         */
        public Builder highAvailability(@Nullable Output<Boolean> highAvailability) {
            $.highAvailability = highAvailability;
            return this;
        }

        /**
         * @param highAvailability Defines whether High Availability is enabled for the cluster Control Plane. This is an **irreversible** change.
         * 
         * @return builder
         * 
         */
        public Builder highAvailability(Boolean highAvailability) {
            return highAvailability(Output.of(highAvailability));
        }

        public LkeClusterControlPlaneArgs build() {
            return $;
        }
    }

}
