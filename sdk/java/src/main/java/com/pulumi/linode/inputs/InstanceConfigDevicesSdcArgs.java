// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceConfigDevicesSdcArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceConfigDevicesSdcArgs Empty = new InstanceConfigDevicesSdcArgs();

    /**
     * The Disk ID to map to this disk slot
     * 
     */
    @Import(name="diskId")
    private @Nullable Output<Integer> diskId;

    /**
     * @return The Disk ID to map to this disk slot
     * 
     */
    public Optional<Output<Integer>> diskId() {
        return Optional.ofNullable(this.diskId);
    }

    /**
     * The Block Storage volume ID to map to this disk slot
     * 
     */
    @Import(name="volumeId")
    private @Nullable Output<Integer> volumeId;

    /**
     * @return The Block Storage volume ID to map to this disk slot
     * 
     */
    public Optional<Output<Integer>> volumeId() {
        return Optional.ofNullable(this.volumeId);
    }

    private InstanceConfigDevicesSdcArgs() {}

    private InstanceConfigDevicesSdcArgs(InstanceConfigDevicesSdcArgs $) {
        this.diskId = $.diskId;
        this.volumeId = $.volumeId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceConfigDevicesSdcArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceConfigDevicesSdcArgs $;

        public Builder() {
            $ = new InstanceConfigDevicesSdcArgs();
        }

        public Builder(InstanceConfigDevicesSdcArgs defaults) {
            $ = new InstanceConfigDevicesSdcArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param diskId The Disk ID to map to this disk slot
         * 
         * @return builder
         * 
         */
        public Builder diskId(@Nullable Output<Integer> diskId) {
            $.diskId = diskId;
            return this;
        }

        /**
         * @param diskId The Disk ID to map to this disk slot
         * 
         * @return builder
         * 
         */
        public Builder diskId(Integer diskId) {
            return diskId(Output.of(diskId));
        }

        /**
         * @param volumeId The Block Storage volume ID to map to this disk slot
         * 
         * @return builder
         * 
         */
        public Builder volumeId(@Nullable Output<Integer> volumeId) {
            $.volumeId = volumeId;
            return this;
        }

        /**
         * @param volumeId The Block Storage volume ID to map to this disk slot
         * 
         * @return builder
         * 
         */
        public Builder volumeId(Integer volumeId) {
            return volumeId(Output.of(volumeId));
        }

        public InstanceConfigDevicesSdcArgs build() {
            return $;
        }
    }

}
