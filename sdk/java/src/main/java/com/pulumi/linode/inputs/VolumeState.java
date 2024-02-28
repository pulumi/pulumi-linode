// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.linode.inputs.VolumeTimeoutsArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VolumeState extends com.pulumi.resources.ResourceArgs {

    public static final VolumeState Empty = new VolumeState();

    /**
     * The full filesystem path for the Volume based on the Volume&#39;s label. The path is &#34;/dev/disk/by-id/scsi-0Linode_Volume_&#34; + the Volume label
     * 
     */
    @Import(name="filesystemPath")
    private @Nullable Output<String> filesystemPath;

    /**
     * @return The full filesystem path for the Volume based on the Volume&#39;s label. The path is &#34;/dev/disk/by-id/scsi-0Linode_Volume_&#34; + the Volume label
     * 
     */
    public Optional<Output<String>> filesystemPath() {
        return Optional.ofNullable(this.filesystemPath);
    }

    /**
     * The label of the Linode Volume
     * 
     */
    @Import(name="label")
    private @Nullable Output<String> label;

    /**
     * @return The label of the Linode Volume
     * 
     */
    public Optional<Output<String>> label() {
        return Optional.ofNullable(this.label);
    }

    /**
     * The ID of a Linode Instance where the Volume should be attached.
     * 
     */
    @Import(name="linodeId")
    private @Nullable Output<Integer> linodeId;

    /**
     * @return The ID of a Linode Instance where the Volume should be attached.
     * 
     */
    public Optional<Output<Integer>> linodeId() {
        return Optional.ofNullable(this.linodeId);
    }

    /**
     * The region where this volume will be deployed.  Examples are `&#34;us-east&#34;`, `&#34;us-west&#34;`, `&#34;ap-south&#34;`, etc. See all regions [here](https://api.linode.com/v4/regions). This field is optional for cloned volumes. *Changing `region` forces the creation of a new Linode Volume.*.
     * 
     * ***
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return The region where this volume will be deployed.  Examples are `&#34;us-east&#34;`, `&#34;us-west&#34;`, `&#34;ap-south&#34;`, etc. See all regions [here](https://api.linode.com/v4/regions). This field is optional for cloned volumes. *Changing `region` forces the creation of a new Linode Volume.*.
     * 
     * ***
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * Size of the Volume in GB.
     * 
     */
    @Import(name="size")
    private @Nullable Output<Integer> size;

    /**
     * @return Size of the Volume in GB.
     * 
     */
    public Optional<Output<Integer>> size() {
        return Optional.ofNullable(this.size);
    }

    /**
     * The ID of a Linode Volume to clone. NOTE: Cloned volumes must be in the same region as the source volume.
     * 
     */
    @Import(name="sourceVolumeId")
    private @Nullable Output<Integer> sourceVolumeId;

    /**
     * @return The ID of a Linode Volume to clone. NOTE: Cloned volumes must be in the same region as the source volume.
     * 
     */
    public Optional<Output<Integer>> sourceVolumeId() {
        return Optional.ofNullable(this.sourceVolumeId);
    }

    /**
     * The status of the Linode Volume. (`creating`, `active`, `resizing`, `contact_support`)
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of the Linode Volume. (`creating`, `active`, `resizing`, `contact_support`)
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * A list of tags applied to this object. Tags are case-insensitive and are for organizational purposes only.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return A list of tags applied to this object. Tags are case-insensitive and are for organizational purposes only.
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    @Import(name="timeouts")
    private @Nullable Output<VolumeTimeoutsArgs> timeouts;

    public Optional<Output<VolumeTimeoutsArgs>> timeouts() {
        return Optional.ofNullable(this.timeouts);
    }

    private VolumeState() {}

    private VolumeState(VolumeState $) {
        this.filesystemPath = $.filesystemPath;
        this.label = $.label;
        this.linodeId = $.linodeId;
        this.region = $.region;
        this.size = $.size;
        this.sourceVolumeId = $.sourceVolumeId;
        this.status = $.status;
        this.tags = $.tags;
        this.timeouts = $.timeouts;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VolumeState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VolumeState $;

        public Builder() {
            $ = new VolumeState();
        }

        public Builder(VolumeState defaults) {
            $ = new VolumeState(Objects.requireNonNull(defaults));
        }

        /**
         * @param filesystemPath The full filesystem path for the Volume based on the Volume&#39;s label. The path is &#34;/dev/disk/by-id/scsi-0Linode_Volume_&#34; + the Volume label
         * 
         * @return builder
         * 
         */
        public Builder filesystemPath(@Nullable Output<String> filesystemPath) {
            $.filesystemPath = filesystemPath;
            return this;
        }

        /**
         * @param filesystemPath The full filesystem path for the Volume based on the Volume&#39;s label. The path is &#34;/dev/disk/by-id/scsi-0Linode_Volume_&#34; + the Volume label
         * 
         * @return builder
         * 
         */
        public Builder filesystemPath(String filesystemPath) {
            return filesystemPath(Output.of(filesystemPath));
        }

        /**
         * @param label The label of the Linode Volume
         * 
         * @return builder
         * 
         */
        public Builder label(@Nullable Output<String> label) {
            $.label = label;
            return this;
        }

        /**
         * @param label The label of the Linode Volume
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            return label(Output.of(label));
        }

        /**
         * @param linodeId The ID of a Linode Instance where the Volume should be attached.
         * 
         * @return builder
         * 
         */
        public Builder linodeId(@Nullable Output<Integer> linodeId) {
            $.linodeId = linodeId;
            return this;
        }

        /**
         * @param linodeId The ID of a Linode Instance where the Volume should be attached.
         * 
         * @return builder
         * 
         */
        public Builder linodeId(Integer linodeId) {
            return linodeId(Output.of(linodeId));
        }

        /**
         * @param region The region where this volume will be deployed.  Examples are `&#34;us-east&#34;`, `&#34;us-west&#34;`, `&#34;ap-south&#34;`, etc. See all regions [here](https://api.linode.com/v4/regions). This field is optional for cloned volumes. *Changing `region` forces the creation of a new Linode Volume.*.
         * 
         * ***
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The region where this volume will be deployed.  Examples are `&#34;us-east&#34;`, `&#34;us-west&#34;`, `&#34;ap-south&#34;`, etc. See all regions [here](https://api.linode.com/v4/regions). This field is optional for cloned volumes. *Changing `region` forces the creation of a new Linode Volume.*.
         * 
         * ***
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param size Size of the Volume in GB.
         * 
         * @return builder
         * 
         */
        public Builder size(@Nullable Output<Integer> size) {
            $.size = size;
            return this;
        }

        /**
         * @param size Size of the Volume in GB.
         * 
         * @return builder
         * 
         */
        public Builder size(Integer size) {
            return size(Output.of(size));
        }

        /**
         * @param sourceVolumeId The ID of a Linode Volume to clone. NOTE: Cloned volumes must be in the same region as the source volume.
         * 
         * @return builder
         * 
         */
        public Builder sourceVolumeId(@Nullable Output<Integer> sourceVolumeId) {
            $.sourceVolumeId = sourceVolumeId;
            return this;
        }

        /**
         * @param sourceVolumeId The ID of a Linode Volume to clone. NOTE: Cloned volumes must be in the same region as the source volume.
         * 
         * @return builder
         * 
         */
        public Builder sourceVolumeId(Integer sourceVolumeId) {
            return sourceVolumeId(Output.of(sourceVolumeId));
        }

        /**
         * @param status The status of the Linode Volume. (`creating`, `active`, `resizing`, `contact_support`)
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the Linode Volume. (`creating`, `active`, `resizing`, `contact_support`)
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param tags A list of tags applied to this object. Tags are case-insensitive and are for organizational purposes only.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A list of tags applied to this object. Tags are case-insensitive and are for organizational purposes only.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags A list of tags applied to this object. Tags are case-insensitive and are for organizational purposes only.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        public Builder timeouts(@Nullable Output<VolumeTimeoutsArgs> timeouts) {
            $.timeouts = timeouts;
            return this;
        }

        public Builder timeouts(VolumeTimeoutsArgs timeouts) {
            return timeouts(Output.of(timeouts));
        }

        public VolumeState build() {
            return $;
        }
    }

}
