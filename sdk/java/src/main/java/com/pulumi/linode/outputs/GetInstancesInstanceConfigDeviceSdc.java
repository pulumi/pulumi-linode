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
public final class GetInstancesInstanceConfigDeviceSdc {
    private final Integer diskId;
    private final @Nullable String diskLabel;
    private final @Nullable Integer volumeId;

    @CustomType.Constructor
    private GetInstancesInstanceConfigDeviceSdc(
        @CustomType.Parameter("diskId") Integer diskId,
        @CustomType.Parameter("diskLabel") @Nullable String diskLabel,
        @CustomType.Parameter("volumeId") @Nullable Integer volumeId) {
        this.diskId = diskId;
        this.diskLabel = diskLabel;
        this.volumeId = volumeId;
    }

    public Integer diskId() {
        return this.diskId;
    }
    public Optional<String> diskLabel() {
        return Optional.ofNullable(this.diskLabel);
    }
    public Optional<Integer> volumeId() {
        return Optional.ofNullable(this.volumeId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstancesInstanceConfigDeviceSdc defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer diskId;
        private @Nullable String diskLabel;
        private @Nullable Integer volumeId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstancesInstanceConfigDeviceSdc defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskId = defaults.diskId;
    	      this.diskLabel = defaults.diskLabel;
    	      this.volumeId = defaults.volumeId;
        }

        public Builder diskId(Integer diskId) {
            this.diskId = Objects.requireNonNull(diskId);
            return this;
        }
        public Builder diskLabel(@Nullable String diskLabel) {
            this.diskLabel = diskLabel;
            return this;
        }
        public Builder volumeId(@Nullable Integer volumeId) {
            this.volumeId = volumeId;
            return this;
        }        public GetInstancesInstanceConfigDeviceSdc build() {
            return new GetInstancesInstanceConfigDeviceSdc(diskId, diskLabel, volumeId);
        }
    }
}
