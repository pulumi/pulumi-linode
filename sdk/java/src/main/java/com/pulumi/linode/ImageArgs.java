// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ImageArgs extends com.pulumi.resources.ResourceArgs {

    public static final ImageArgs Empty = new ImageArgs();

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
     * A detailed description of this Image.
     * 
     * ***
     * 
     * The following arguments apply to creating an image from an existing Linode Instance:
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A detailed description of this Image.
     * 
     * ***
     * 
     * The following arguments apply to creating an image from an existing Linode Instance:
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
     * A short description of the Image. Labels cannot contain special characters.
     * 
     */
    @Import(name="label", required=true)
    private Output<String> label;

    /**
     * @return A short description of the Image. Labels cannot contain special characters.
     * 
     */
    public Output<String> label() {
        return this.label;
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
     * The region of the image. See all regions [here](https://api.linode.com/v4/regions).
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return The region of the image. See all regions [here](https://api.linode.com/v4/regions).
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    private ImageArgs() {}

    private ImageArgs(ImageArgs $) {
        this.cloudInit = $.cloudInit;
        this.description = $.description;
        this.diskId = $.diskId;
        this.fileHash = $.fileHash;
        this.filePath = $.filePath;
        this.label = $.label;
        this.linodeId = $.linodeId;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ImageArgs $;

        public Builder() {
            $ = new ImageArgs();
        }

        public Builder(ImageArgs defaults) {
            $ = new ImageArgs(Objects.requireNonNull(defaults));
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
         * @param description A detailed description of this Image.
         * 
         * ***
         * 
         * The following arguments apply to creating an image from an existing Linode Instance:
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
         * ***
         * 
         * The following arguments apply to creating an image from an existing Linode Instance:
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
         * @param label A short description of the Image. Labels cannot contain special characters.
         * 
         * @return builder
         * 
         */
        public Builder label(Output<String> label) {
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
         * @param region The region of the image. See all regions [here](https://api.linode.com/v4/regions).
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The region of the image. See all regions [here](https://api.linode.com/v4/regions).
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        public ImageArgs build() {
            $.label = Objects.requireNonNull($.label, "expected parameter 'label' to be non-null");
            return $;
        }
    }

}
