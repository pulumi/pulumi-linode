// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InstanceConfigDevicesSda {
    /**
     * @return The Disk ID of the associated `disk_label`, if used.
     * 
     */
    private @Nullable Integer diskId;
    /**
     * @return The `label` of the `disk` to map to this `device` slot.
     * 
     */
    private @Nullable String diskLabel;
    /**
     * @return The Volume ID to map to this `device` slot.
     * 
     */
    private @Nullable Integer volumeId;

    private InstanceConfigDevicesSda() {}
    /**
     * @return The Disk ID of the associated `disk_label`, if used.
     * 
     */
    public Optional<Integer> diskId() {
        return Optional.ofNullable(this.diskId);
    }
    /**
     * @return The `label` of the `disk` to map to this `device` slot.
     * 
     */
    public Optional<String> diskLabel() {
        return Optional.ofNullable(this.diskLabel);
    }
    /**
     * @return The Volume ID to map to this `device` slot.
     * 
     */
    public Optional<Integer> volumeId() {
        return Optional.ofNullable(this.volumeId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceConfigDevicesSda defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer diskId;
        private @Nullable String diskLabel;
        private @Nullable Integer volumeId;
        public Builder() {}
        public Builder(InstanceConfigDevicesSda defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskId = defaults.diskId;
    	      this.diskLabel = defaults.diskLabel;
    	      this.volumeId = defaults.volumeId;
        }

        @CustomType.Setter
        public Builder diskId(@Nullable Integer diskId) {
            this.diskId = diskId;
            return this;
        }
        @CustomType.Setter
        public Builder diskLabel(@Nullable String diskLabel) {
            this.diskLabel = diskLabel;
            return this;
        }
        @CustomType.Setter
        public Builder volumeId(@Nullable Integer volumeId) {
            this.volumeId = volumeId;
            return this;
        }
        public InstanceConfigDevicesSda build() {
            final var _resultValue = new InstanceConfigDevicesSda();
            _resultValue.diskId = diskId;
            _resultValue.diskLabel = diskLabel;
            _resultValue.volumeId = volumeId;
            return _resultValue;
        }
    }
}
