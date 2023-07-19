// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InstanceMetadata {
    private @Nullable String userData;

    private InstanceMetadata() {}
    public Optional<String> userData() {
        return Optional.ofNullable(this.userData);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceMetadata defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String userData;
        public Builder() {}
        public Builder(InstanceMetadata defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.userData = defaults.userData;
        }

        @CustomType.Setter
        public Builder userData(@Nullable String userData) {
            this.userData = userData;
            return this;
        }
        public InstanceMetadata build() {
            final var o = new InstanceMetadata();
            o.userData = userData;
            return o;
        }
    }
}
