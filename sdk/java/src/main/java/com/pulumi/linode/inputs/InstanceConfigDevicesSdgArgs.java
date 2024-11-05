// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceConfigDevicesSdgArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceConfigDevicesSdgArgs Empty = new InstanceConfigDevicesSdgArgs();

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

    private InstanceConfigDevicesSdgArgs() {}

    private InstanceConfigDevicesSdgArgs(InstanceConfigDevicesSdgArgs $) {
        this.diskId = $.diskId;
        this.volumeId = $.volumeId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceConfigDevicesSdgArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceConfigDevicesSdgArgs $;

        public Builder() {
            $ = new InstanceConfigDevicesSdgArgs();
        }

        public Builder(InstanceConfigDevicesSdgArgs defaults) {
            $ = new InstanceConfigDevicesSdgArgs(Objects.requireNonNull(defaults));
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

        public InstanceConfigDevicesSdgArgs build() {
            return $;
        }
    }

}
