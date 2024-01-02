// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetInstancesInstanceConfigDeviceSdb {
    /**
     * @return The Disk ID of the associated `disk_label`, if used
     * 
     */
    private Integer diskId;
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

    private GetInstancesInstanceConfigDeviceSdb() {}
    /**
     * @return The Disk ID of the associated `disk_label`, if used
     * 
     */
    public Integer diskId() {
        return this.diskId;
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

    public static Builder builder(GetInstancesInstanceConfigDeviceSdb defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer diskId;
        private @Nullable String diskLabel;
        private @Nullable Integer volumeId;
        public Builder() {}
        public Builder(GetInstancesInstanceConfigDeviceSdb defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskId = defaults.diskId;
    	      this.diskLabel = defaults.diskLabel;
    	      this.volumeId = defaults.volumeId;
        }

        @CustomType.Setter
        public Builder diskId(Integer diskId) {
            if (diskId == null) {
              throw new MissingRequiredPropertyException("GetInstancesInstanceConfigDeviceSdb", "diskId");
            }
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
        public GetInstancesInstanceConfigDeviceSdb build() {
            final var _resultValue = new GetInstancesInstanceConfigDeviceSdb();
            _resultValue.diskId = diskId;
            _resultValue.diskLabel = diskLabel;
            _resultValue.volumeId = volumeId;
            return _resultValue;
        }
    }
}
