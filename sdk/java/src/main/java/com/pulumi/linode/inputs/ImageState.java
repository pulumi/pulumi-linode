// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.linode.inputs.ImageReplicationArgs;
import com.pulumi.linode.inputs.ImageTimeoutsArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ImageState extends com.pulumi.resources.ResourceArgs {

    public static final ImageState Empty = new ImageState();

    /**
     * The capabilities of this Image.
     * 
     */
    @Import(name="capabilities")
    private @Nullable Output<List<String>> capabilities;

    /**
     * @return The capabilities of this Image.
     * 
     */
    public Optional<Output<List<String>>> capabilities() {
        return Optional.ofNullable(this.capabilities);
    }

    /**
     * Whether this image supports cloud-init.
     * 
     */
    @Import(name="cloudInit")
    private @Nullable Output<Boolean> cloudInit;

    /**
     * @return Whether this image supports cloud-init.
     * 
     */
    public Optional<Output<Boolean>> cloudInit() {
        return Optional.ofNullable(this.cloudInit);
    }

    /**
     * When this Image was created.
     * 
     */
    @Import(name="created")
    private @Nullable Output<String> created;

    /**
     * @return When this Image was created.
     * 
     */
    public Optional<Output<String>> created() {
        return Optional.ofNullable(this.created);
    }

    /**
     * The name of the User who created this Image.
     * 
     */
    @Import(name="createdBy")
    private @Nullable Output<String> createdBy;

    /**
     * @return The name of the User who created this Image.
     * 
     */
    public Optional<Output<String>> createdBy() {
        return Optional.ofNullable(this.createdBy);
    }

    /**
     * Whether or not this Image is deprecated. Will only be True for deprecated public Images.
     * 
     */
    @Import(name="deprecated")
    private @Nullable Output<Boolean> deprecated;

    /**
     * @return Whether or not this Image is deprecated. Will only be True for deprecated public Images.
     * 
     */
    public Optional<Output<Boolean>> deprecated() {
        return Optional.ofNullable(this.deprecated);
    }

    /**
     * A detailed description of this Image.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A detailed description of this Image.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The ID of the Linode Disk that this Image will be created from.
     * 
     */
    @Import(name="diskId")
    private @Nullable Output<Integer> diskId;

    /**
     * @return The ID of the Linode Disk that this Image will be created from.
     * 
     */
    public Optional<Output<Integer>> diskId() {
        return Optional.ofNullable(this.diskId);
    }

    /**
     * Only Images created automatically (from a deleted Linode; type=automatic) will expire.
     * 
     */
    @Import(name="expiry")
    private @Nullable Output<String> expiry;

    /**
     * @return Only Images created automatically (from a deleted Linode; type=automatic) will expire.
     * 
     */
    public Optional<Output<String>> expiry() {
        return Optional.ofNullable(this.expiry);
    }

    /**
     * The MD5 hash of the file to be uploaded. This is used to trigger file updates.
     * 
     */
    @Import(name="fileHash")
    private @Nullable Output<String> fileHash;

    /**
     * @return The MD5 hash of the file to be uploaded. This is used to trigger file updates.
     * 
     */
    public Optional<Output<String>> fileHash() {
        return Optional.ofNullable(this.fileHash);
    }

    /**
     * The path of the image file to be uploaded.
     * 
     */
    @Import(name="filePath")
    private @Nullable Output<String> filePath;

    /**
     * @return The path of the image file to be uploaded.
     * 
     */
    public Optional<Output<String>> filePath() {
        return Optional.ofNullable(this.filePath);
    }

    /**
     * True if the Image is public.
     * 
     */
    @Import(name="isPublic")
    private @Nullable Output<Boolean> isPublic;

    /**
     * @return True if the Image is public.
     * 
     */
    public Optional<Output<Boolean>> isPublic() {
        return Optional.ofNullable(this.isPublic);
    }

    /**
     * A short description of the Image. Labels cannot contain special characters.
     * 
     */
    @Import(name="label")
    private @Nullable Output<String> label;

    /**
     * @return A short description of the Image. Labels cannot contain special characters.
     * 
     */
    public Optional<Output<String>> label() {
        return Optional.ofNullable(this.label);
    }

    /**
     * The ID of the Linode that this Image will be created from.
     * 
     * ***
     * 
     * &gt; **NOTICE:** Uploading images is currently in beta. Ensure `LINODE_API_VERSION` is set to `v4beta` in order to use this functionality.
     * 
     * The following arguments apply to uploading an image:
     * 
     */
    @Import(name="linodeId")
    private @Nullable Output<Integer> linodeId;

    /**
     * @return The ID of the Linode that this Image will be created from.
     * 
     * ***
     * 
     * &gt; **NOTICE:** Uploading images is currently in beta. Ensure `LINODE_API_VERSION` is set to `v4beta` in order to use this functionality.
     * 
     * The following arguments apply to uploading an image:
     * 
     */
    public Optional<Output<Integer>> linodeId() {
        return Optional.ofNullable(this.linodeId);
    }

    /**
     * The region of the image. See all regions [here](https://techdocs.akamai.com/linode-api/reference/get-regions).
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return The region of the image. See all regions [here](https://techdocs.akamai.com/linode-api/reference/get-regions).
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * A list of regions that customer wants to replicate this image in. At least one valid region is required and only core regions allowed. Existing images in the regions not passed will be removed. See Replicate an Image [here](https://techdocs.akamai.com/linode-api/reference/post-replicate-image) for more details.
     * 
     */
    @Import(name="replicaRegions")
    private @Nullable Output<List<String>> replicaRegions;

    /**
     * @return A list of regions that customer wants to replicate this image in. At least one valid region is required and only core regions allowed. Existing images in the regions not passed will be removed. See Replicate an Image [here](https://techdocs.akamai.com/linode-api/reference/post-replicate-image) for more details.
     * 
     */
    public Optional<Output<List<String>>> replicaRegions() {
        return Optional.ofNullable(this.replicaRegions);
    }

    /**
     * A list of image replications region and corresponding status.
     * 
     */
    @Import(name="replications")
    private @Nullable Output<List<ImageReplicationArgs>> replications;

    /**
     * @return A list of image replications region and corresponding status.
     * 
     */
    public Optional<Output<List<ImageReplicationArgs>>> replications() {
        return Optional.ofNullable(this.replications);
    }

    /**
     * The minimum size this Image needs to deploy. Size is in MB.
     * 
     */
    @Import(name="size")
    private @Nullable Output<Integer> size;

    /**
     * @return The minimum size this Image needs to deploy. Size is in MB.
     * 
     */
    public Optional<Output<Integer>> size() {
        return Optional.ofNullable(this.size);
    }

    /**
     * The status of an image replica.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of an image replica.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * A list of customized tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return A list of customized tags.
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    @Import(name="timeouts")
    private @Nullable Output<ImageTimeoutsArgs> timeouts;

    public Optional<Output<ImageTimeoutsArgs>> timeouts() {
        return Optional.ofNullable(this.timeouts);
    }

    /**
     * The total size of the image in all available regions.
     * 
     */
    @Import(name="totalSize")
    private @Nullable Output<Integer> totalSize;

    /**
     * @return The total size of the image in all available regions.
     * 
     */
    public Optional<Output<Integer>> totalSize() {
        return Optional.ofNullable(this.totalSize);
    }

    /**
     * How the Image was created. &#39;Manual&#39; Images can be created at any time. &#39;Automatic&#39; images are created automatically from a deleted Linode.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return How the Image was created. &#39;Manual&#39; Images can be created at any time. &#39;Automatic&#39; images are created automatically from a deleted Linode.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * The upstream distribution vendor. Nil for private Images.
     * 
     */
    @Import(name="vendor")
    private @Nullable Output<String> vendor;

    /**
     * @return The upstream distribution vendor. Nil for private Images.
     * 
     */
    public Optional<Output<String>> vendor() {
        return Optional.ofNullable(this.vendor);
    }

    /**
     * Whether to wait for all image replications become `available`. Default to false.
     * 
     * ***
     * 
     * The following arguments apply to creating an image from an existing Linode Instance:
     * 
     */
    @Import(name="waitForReplications")
    private @Nullable Output<Boolean> waitForReplications;

    /**
     * @return Whether to wait for all image replications become `available`. Default to false.
     * 
     * ***
     * 
     * The following arguments apply to creating an image from an existing Linode Instance:
     * 
     */
    public Optional<Output<Boolean>> waitForReplications() {
        return Optional.ofNullable(this.waitForReplications);
    }

    private ImageState() {}

    private ImageState(ImageState $) {
        this.capabilities = $.capabilities;
        this.cloudInit = $.cloudInit;
        this.created = $.created;
        this.createdBy = $.createdBy;
        this.deprecated = $.deprecated;
        this.description = $.description;
        this.diskId = $.diskId;
        this.expiry = $.expiry;
        this.fileHash = $.fileHash;
        this.filePath = $.filePath;
        this.isPublic = $.isPublic;
        this.label = $.label;
        this.linodeId = $.linodeId;
        this.region = $.region;
        this.replicaRegions = $.replicaRegions;
        this.replications = $.replications;
        this.size = $.size;
        this.status = $.status;
        this.tags = $.tags;
        this.timeouts = $.timeouts;
        this.totalSize = $.totalSize;
        this.type = $.type;
        this.vendor = $.vendor;
        this.waitForReplications = $.waitForReplications;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ImageState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ImageState $;

        public Builder() {
            $ = new ImageState();
        }

        public Builder(ImageState defaults) {
            $ = new ImageState(Objects.requireNonNull(defaults));
        }

        /**
         * @param capabilities The capabilities of this Image.
         * 
         * @return builder
         * 
         */
        public Builder capabilities(@Nullable Output<List<String>> capabilities) {
            $.capabilities = capabilities;
            return this;
        }

        /**
         * @param capabilities The capabilities of this Image.
         * 
         * @return builder
         * 
         */
        public Builder capabilities(List<String> capabilities) {
            return capabilities(Output.of(capabilities));
        }

        /**
         * @param capabilities The capabilities of this Image.
         * 
         * @return builder
         * 
         */
        public Builder capabilities(String... capabilities) {
            return capabilities(List.of(capabilities));
        }

        /**
         * @param cloudInit Whether this image supports cloud-init.
         * 
         * @return builder
         * 
         */
        public Builder cloudInit(@Nullable Output<Boolean> cloudInit) {
            $.cloudInit = cloudInit;
            return this;
        }

        /**
         * @param cloudInit Whether this image supports cloud-init.
         * 
         * @return builder
         * 
         */
        public Builder cloudInit(Boolean cloudInit) {
            return cloudInit(Output.of(cloudInit));
        }

        /**
         * @param created When this Image was created.
         * 
         * @return builder
         * 
         */
        public Builder created(@Nullable Output<String> created) {
            $.created = created;
            return this;
        }

        /**
         * @param created When this Image was created.
         * 
         * @return builder
         * 
         */
        public Builder created(String created) {
            return created(Output.of(created));
        }

        /**
         * @param createdBy The name of the User who created this Image.
         * 
         * @return builder
         * 
         */
        public Builder createdBy(@Nullable Output<String> createdBy) {
            $.createdBy = createdBy;
            return this;
        }

        /**
         * @param createdBy The name of the User who created this Image.
         * 
         * @return builder
         * 
         */
        public Builder createdBy(String createdBy) {
            return createdBy(Output.of(createdBy));
        }

        /**
         * @param deprecated Whether or not this Image is deprecated. Will only be True for deprecated public Images.
         * 
         * @return builder
         * 
         */
        public Builder deprecated(@Nullable Output<Boolean> deprecated) {
            $.deprecated = deprecated;
            return this;
        }

        /**
         * @param deprecated Whether or not this Image is deprecated. Will only be True for deprecated public Images.
         * 
         * @return builder
         * 
         */
        public Builder deprecated(Boolean deprecated) {
            return deprecated(Output.of(deprecated));
        }

        /**
         * @param description A detailed description of this Image.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A detailed description of this Image.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param diskId The ID of the Linode Disk that this Image will be created from.
         * 
         * @return builder
         * 
         */
        public Builder diskId(@Nullable Output<Integer> diskId) {
            $.diskId = diskId;
            return this;
        }

        /**
         * @param diskId The ID of the Linode Disk that this Image will be created from.
         * 
         * @return builder
         * 
         */
        public Builder diskId(Integer diskId) {
            return diskId(Output.of(diskId));
        }

        /**
         * @param expiry Only Images created automatically (from a deleted Linode; type=automatic) will expire.
         * 
         * @return builder
         * 
         */
        public Builder expiry(@Nullable Output<String> expiry) {
            $.expiry = expiry;
            return this;
        }

        /**
         * @param expiry Only Images created automatically (from a deleted Linode; type=automatic) will expire.
         * 
         * @return builder
         * 
         */
        public Builder expiry(String expiry) {
            return expiry(Output.of(expiry));
        }

        /**
         * @param fileHash The MD5 hash of the file to be uploaded. This is used to trigger file updates.
         * 
         * @return builder
         * 
         */
        public Builder fileHash(@Nullable Output<String> fileHash) {
            $.fileHash = fileHash;
            return this;
        }

        /**
         * @param fileHash The MD5 hash of the file to be uploaded. This is used to trigger file updates.
         * 
         * @return builder
         * 
         */
        public Builder fileHash(String fileHash) {
            return fileHash(Output.of(fileHash));
        }

        /**
         * @param filePath The path of the image file to be uploaded.
         * 
         * @return builder
         * 
         */
        public Builder filePath(@Nullable Output<String> filePath) {
            $.filePath = filePath;
            return this;
        }

        /**
         * @param filePath The path of the image file to be uploaded.
         * 
         * @return builder
         * 
         */
        public Builder filePath(String filePath) {
            return filePath(Output.of(filePath));
        }

        /**
         * @param isPublic True if the Image is public.
         * 
         * @return builder
         * 
         */
        public Builder isPublic(@Nullable Output<Boolean> isPublic) {
            $.isPublic = isPublic;
            return this;
        }

        /**
         * @param isPublic True if the Image is public.
         * 
         * @return builder
         * 
         */
        public Builder isPublic(Boolean isPublic) {
            return isPublic(Output.of(isPublic));
        }

        /**
         * @param label A short description of the Image. Labels cannot contain special characters.
         * 
         * @return builder
         * 
         */
        public Builder label(@Nullable Output<String> label) {
            $.label = label;
            return this;
        }

        /**
         * @param label A short description of the Image. Labels cannot contain special characters.
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            return label(Output.of(label));
        }

        /**
         * @param linodeId The ID of the Linode that this Image will be created from.
         * 
         * ***
         * 
         * &gt; **NOTICE:** Uploading images is currently in beta. Ensure `LINODE_API_VERSION` is set to `v4beta` in order to use this functionality.
         * 
         * The following arguments apply to uploading an image:
         * 
         * @return builder
         * 
         */
        public Builder linodeId(@Nullable Output<Integer> linodeId) {
            $.linodeId = linodeId;
            return this;
        }

        /**
         * @param linodeId The ID of the Linode that this Image will be created from.
         * 
         * ***
         * 
         * &gt; **NOTICE:** Uploading images is currently in beta. Ensure `LINODE_API_VERSION` is set to `v4beta` in order to use this functionality.
         * 
         * The following arguments apply to uploading an image:
         * 
         * @return builder
         * 
         */
        public Builder linodeId(Integer linodeId) {
            return linodeId(Output.of(linodeId));
        }

        /**
         * @param region The region of the image. See all regions [here](https://techdocs.akamai.com/linode-api/reference/get-regions).
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The region of the image. See all regions [here](https://techdocs.akamai.com/linode-api/reference/get-regions).
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param replicaRegions A list of regions that customer wants to replicate this image in. At least one valid region is required and only core regions allowed. Existing images in the regions not passed will be removed. See Replicate an Image [here](https://techdocs.akamai.com/linode-api/reference/post-replicate-image) for more details.
         * 
         * @return builder
         * 
         */
        public Builder replicaRegions(@Nullable Output<List<String>> replicaRegions) {
            $.replicaRegions = replicaRegions;
            return this;
        }

        /**
         * @param replicaRegions A list of regions that customer wants to replicate this image in. At least one valid region is required and only core regions allowed. Existing images in the regions not passed will be removed. See Replicate an Image [here](https://techdocs.akamai.com/linode-api/reference/post-replicate-image) for more details.
         * 
         * @return builder
         * 
         */
        public Builder replicaRegions(List<String> replicaRegions) {
            return replicaRegions(Output.of(replicaRegions));
        }

        /**
         * @param replicaRegions A list of regions that customer wants to replicate this image in. At least one valid region is required and only core regions allowed. Existing images in the regions not passed will be removed. See Replicate an Image [here](https://techdocs.akamai.com/linode-api/reference/post-replicate-image) for more details.
         * 
         * @return builder
         * 
         */
        public Builder replicaRegions(String... replicaRegions) {
            return replicaRegions(List.of(replicaRegions));
        }

        /**
         * @param replications A list of image replications region and corresponding status.
         * 
         * @return builder
         * 
         */
        public Builder replications(@Nullable Output<List<ImageReplicationArgs>> replications) {
            $.replications = replications;
            return this;
        }

        /**
         * @param replications A list of image replications region and corresponding status.
         * 
         * @return builder
         * 
         */
        public Builder replications(List<ImageReplicationArgs> replications) {
            return replications(Output.of(replications));
        }

        /**
         * @param replications A list of image replications region and corresponding status.
         * 
         * @return builder
         * 
         */
        public Builder replications(ImageReplicationArgs... replications) {
            return replications(List.of(replications));
        }

        /**
         * @param size The minimum size this Image needs to deploy. Size is in MB.
         * 
         * @return builder
         * 
         */
        public Builder size(@Nullable Output<Integer> size) {
            $.size = size;
            return this;
        }

        /**
         * @param size The minimum size this Image needs to deploy. Size is in MB.
         * 
         * @return builder
         * 
         */
        public Builder size(Integer size) {
            return size(Output.of(size));
        }

        /**
         * @param status The status of an image replica.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of an image replica.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param tags A list of customized tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A list of customized tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags A list of customized tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        public Builder timeouts(@Nullable Output<ImageTimeoutsArgs> timeouts) {
            $.timeouts = timeouts;
            return this;
        }

        public Builder timeouts(ImageTimeoutsArgs timeouts) {
            return timeouts(Output.of(timeouts));
        }

        /**
         * @param totalSize The total size of the image in all available regions.
         * 
         * @return builder
         * 
         */
        public Builder totalSize(@Nullable Output<Integer> totalSize) {
            $.totalSize = totalSize;
            return this;
        }

        /**
         * @param totalSize The total size of the image in all available regions.
         * 
         * @return builder
         * 
         */
        public Builder totalSize(Integer totalSize) {
            return totalSize(Output.of(totalSize));
        }

        /**
         * @param type How the Image was created. &#39;Manual&#39; Images can be created at any time. &#39;Automatic&#39; images are created automatically from a deleted Linode.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type How the Image was created. &#39;Manual&#39; Images can be created at any time. &#39;Automatic&#39; images are created automatically from a deleted Linode.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param vendor The upstream distribution vendor. Nil for private Images.
         * 
         * @return builder
         * 
         */
        public Builder vendor(@Nullable Output<String> vendor) {
            $.vendor = vendor;
            return this;
        }

        /**
         * @param vendor The upstream distribution vendor. Nil for private Images.
         * 
         * @return builder
         * 
         */
        public Builder vendor(String vendor) {
            return vendor(Output.of(vendor));
        }

        /**
         * @param waitForReplications Whether to wait for all image replications become `available`. Default to false.
         * 
         * ***
         * 
         * The following arguments apply to creating an image from an existing Linode Instance:
         * 
         * @return builder
         * 
         */
        public Builder waitForReplications(@Nullable Output<Boolean> waitForReplications) {
            $.waitForReplications = waitForReplications;
            return this;
        }

        /**
         * @param waitForReplications Whether to wait for all image replications become `available`. Default to false.
         * 
         * ***
         * 
         * The following arguments apply to creating an image from an existing Linode Instance:
         * 
         * @return builder
         * 
         */
        public Builder waitForReplications(Boolean waitForReplications) {
            return waitForReplications(Output.of(waitForReplications));
        }

        public ImageState build() {
            return $;
        }
    }

}
