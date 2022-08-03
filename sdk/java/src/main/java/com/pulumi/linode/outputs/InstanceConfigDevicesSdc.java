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
public final class InstanceConfigDevicesSdc {
    /**
     * @return The Disk ID of the associated `disk_label`, if used.
     * 
     */
    private final @Nullable Integer diskId;
    /**
     * @return The `label` of the `disk` to map to this `device` slot.
     * 
     */
    private final @Nullable String diskLabel;
    /**
     * @return The Volume ID to map to this `device` slot.
     * 
     */
    private final @Nullable Integer volumeId;

    @CustomType.Constructor
    private InstanceConfigDevicesSdc(
        @CustomType.Parameter("diskId") @Nullable Integer diskId,
        @CustomType.Parameter("diskLabel") @Nullable String diskLabel,
        @CustomType.Parameter("volumeId") @Nullable Integer volumeId) {
        this.diskId = diskId;
        this.diskLabel = diskLabel;
        this.volumeId = volumeId;
    }

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

    public static Builder builder(InstanceConfigDevicesSdc defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer diskId;
        private @Nullable String diskLabel;
        private @Nullable Integer volumeId;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceConfigDevicesSdc defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskId = defaults.diskId;
    	      this.diskLabel = defaults.diskLabel;
    	      this.volumeId = defaults.volumeId;
        }

        public Builder diskId(@Nullable Integer diskId) {
            this.diskId = diskId;
            return this;
        }
        public Builder diskLabel(@Nullable String diskLabel) {
            this.diskLabel = diskLabel;
            return this;
        }
        public Builder volumeId(@Nullable Integer volumeId) {
            this.volumeId = volumeId;
            return this;
        }        public InstanceConfigDevicesSdc build() {
            return new InstanceConfigDevicesSdc(diskId, diskLabel, volumeId);
        }
    }
}
