// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.linode.inputs.InstanceDiskTimeoutsArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceDiskArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceDiskArgs Empty = new InstanceDiskArgs();

    /**
     * A list of public SSH keys that will be automatically appended to the root user’s ~/.ssh/authorized_keys file when deploying from an Image. (Requires `image`)
     * 
     */
    @Import(name="authorizedKeys")
    private @Nullable Output<List<String>> authorizedKeys;

    /**
     * @return A list of public SSH keys that will be automatically appended to the root user’s ~/.ssh/authorized_keys file when deploying from an Image. (Requires `image`)
     * 
     */
    public Optional<Output<List<String>>> authorizedKeys() {
        return Optional.ofNullable(this.authorizedKeys);
    }

    /**
     * A list of usernames. If the usernames have associated SSH keys, the keys will be appended to the root user&#39;s ~/.ssh/authorized_keys file. (Requires `image`)
     * 
     */
    @Import(name="authorizedUsers")
    private @Nullable Output<List<String>> authorizedUsers;

    /**
     * @return A list of usernames. If the usernames have associated SSH keys, the keys will be appended to the root user&#39;s ~/.ssh/authorized_keys file. (Requires `image`)
     * 
     */
    public Optional<Output<List<String>>> authorizedUsers() {
        return Optional.ofNullable(this.authorizedUsers);
    }

    /**
     * The filesystem of this disk. (`raw`, `swap`, `ext3`, `ext4`, `initrd`)
     * 
     */
    @Import(name="filesystem")
    private @Nullable Output<String> filesystem;

    /**
     * @return The filesystem of this disk. (`raw`, `swap`, `ext3`, `ext4`, `initrd`)
     * 
     */
    public Optional<Output<String>> filesystem() {
        return Optional.ofNullable(this.filesystem);
    }

    /**
     * An Image ID to deploy the Linode Disk from.
     * 
     */
    @Import(name="image")
    private @Nullable Output<String> image;

    /**
     * @return An Image ID to deploy the Linode Disk from.
     * 
     */
    public Optional<Output<String>> image() {
        return Optional.ofNullable(this.image);
    }

    /**
     * The Disk&#39;s label for display purposes only.
     * 
     */
    @Import(name="label", required=true)
    private Output<String> label;

    /**
     * @return The Disk&#39;s label for display purposes only.
     * 
     */
    public Output<String> label() {
        return this.label;
    }

    /**
     * The ID of the Linode to create this Disk under.
     * 
     */
    @Import(name="linodeId", required=true)
    private Output<Integer> linodeId;

    /**
     * @return The ID of the Linode to create this Disk under.
     * 
     */
    public Output<Integer> linodeId() {
        return this.linodeId;
    }

    /**
     * The root user’s password on a newly-created Linode Disk when deploying from an Image. (Requires `image`)
     * 
     */
    @Import(name="rootPass")
    private @Nullable Output<String> rootPass;

    /**
     * @return The root user’s password on a newly-created Linode Disk when deploying from an Image. (Requires `image`)
     * 
     */
    public Optional<Output<String>> rootPass() {
        return Optional.ofNullable(this.rootPass);
    }

    /**
     * The size of the Disk in MB. **NOTE:** Resizing a disk will trigger a Linode reboot.
     * 
     * ***
     * 
     */
    @Import(name="size", required=true)
    private Output<Integer> size;

    /**
     * @return The size of the Disk in MB. **NOTE:** Resizing a disk will trigger a Linode reboot.
     * 
     * ***
     * 
     */
    public Output<Integer> size() {
        return this.size;
    }

    /**
     * An object containing responses to any User Defined Fields present in the StackScript being deployed to this Disk. Only accepted if `stackscript_id` is given. (Requires `image`)
     * 
     */
    @Import(name="stackscriptData")
    private @Nullable Output<Map<String,String>> stackscriptData;

    /**
     * @return An object containing responses to any User Defined Fields present in the StackScript being deployed to this Disk. Only accepted if `stackscript_id` is given. (Requires `image`)
     * 
     */
    public Optional<Output<Map<String,String>>> stackscriptData() {
        return Optional.ofNullable(this.stackscriptData);
    }

    /**
     * A StackScript ID that will cause the referenced StackScript to be run during deployment of this Disk. (Requires `image`)
     * 
     */
    @Import(name="stackscriptId")
    private @Nullable Output<Integer> stackscriptId;

    /**
     * @return A StackScript ID that will cause the referenced StackScript to be run during deployment of this Disk. (Requires `image`)
     * 
     */
    public Optional<Output<Integer>> stackscriptId() {
        return Optional.ofNullable(this.stackscriptId);
    }

    @Import(name="timeouts")
    private @Nullable Output<InstanceDiskTimeoutsArgs> timeouts;

    public Optional<Output<InstanceDiskTimeoutsArgs>> timeouts() {
        return Optional.ofNullable(this.timeouts);
    }

    private InstanceDiskArgs() {}

    private InstanceDiskArgs(InstanceDiskArgs $) {
        this.authorizedKeys = $.authorizedKeys;
        this.authorizedUsers = $.authorizedUsers;
        this.filesystem = $.filesystem;
        this.image = $.image;
        this.label = $.label;
        this.linodeId = $.linodeId;
        this.rootPass = $.rootPass;
        this.size = $.size;
        this.stackscriptData = $.stackscriptData;
        this.stackscriptId = $.stackscriptId;
        this.timeouts = $.timeouts;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceDiskArgs $;

        public Builder() {
            $ = new InstanceDiskArgs();
        }

        public Builder(InstanceDiskArgs defaults) {
            $ = new InstanceDiskArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authorizedKeys A list of public SSH keys that will be automatically appended to the root user’s ~/.ssh/authorized_keys file when deploying from an Image. (Requires `image`)
         * 
         * @return builder
         * 
         */
        public Builder authorizedKeys(@Nullable Output<List<String>> authorizedKeys) {
            $.authorizedKeys = authorizedKeys;
            return this;
        }

        /**
         * @param authorizedKeys A list of public SSH keys that will be automatically appended to the root user’s ~/.ssh/authorized_keys file when deploying from an Image. (Requires `image`)
         * 
         * @return builder
         * 
         */
        public Builder authorizedKeys(List<String> authorizedKeys) {
            return authorizedKeys(Output.of(authorizedKeys));
        }

        /**
         * @param authorizedKeys A list of public SSH keys that will be automatically appended to the root user’s ~/.ssh/authorized_keys file when deploying from an Image. (Requires `image`)
         * 
         * @return builder
         * 
         */
        public Builder authorizedKeys(String... authorizedKeys) {
            return authorizedKeys(List.of(authorizedKeys));
        }

        /**
         * @param authorizedUsers A list of usernames. If the usernames have associated SSH keys, the keys will be appended to the root user&#39;s ~/.ssh/authorized_keys file. (Requires `image`)
         * 
         * @return builder
         * 
         */
        public Builder authorizedUsers(@Nullable Output<List<String>> authorizedUsers) {
            $.authorizedUsers = authorizedUsers;
            return this;
        }

        /**
         * @param authorizedUsers A list of usernames. If the usernames have associated SSH keys, the keys will be appended to the root user&#39;s ~/.ssh/authorized_keys file. (Requires `image`)
         * 
         * @return builder
         * 
         */
        public Builder authorizedUsers(List<String> authorizedUsers) {
            return authorizedUsers(Output.of(authorizedUsers));
        }

        /**
         * @param authorizedUsers A list of usernames. If the usernames have associated SSH keys, the keys will be appended to the root user&#39;s ~/.ssh/authorized_keys file. (Requires `image`)
         * 
         * @return builder
         * 
         */
        public Builder authorizedUsers(String... authorizedUsers) {
            return authorizedUsers(List.of(authorizedUsers));
        }

        /**
         * @param filesystem The filesystem of this disk. (`raw`, `swap`, `ext3`, `ext4`, `initrd`)
         * 
         * @return builder
         * 
         */
        public Builder filesystem(@Nullable Output<String> filesystem) {
            $.filesystem = filesystem;
            return this;
        }

        /**
         * @param filesystem The filesystem of this disk. (`raw`, `swap`, `ext3`, `ext4`, `initrd`)
         * 
         * @return builder
         * 
         */
        public Builder filesystem(String filesystem) {
            return filesystem(Output.of(filesystem));
        }

        /**
         * @param image An Image ID to deploy the Linode Disk from.
         * 
         * @return builder
         * 
         */
        public Builder image(@Nullable Output<String> image) {
            $.image = image;
            return this;
        }

        /**
         * @param image An Image ID to deploy the Linode Disk from.
         * 
         * @return builder
         * 
         */
        public Builder image(String image) {
            return image(Output.of(image));
        }

        /**
         * @param label The Disk&#39;s label for display purposes only.
         * 
         * @return builder
         * 
         */
        public Builder label(Output<String> label) {
            $.label = label;
            return this;
        }

        /**
         * @param label The Disk&#39;s label for display purposes only.
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            return label(Output.of(label));
        }

        /**
         * @param linodeId The ID of the Linode to create this Disk under.
         * 
         * @return builder
         * 
         */
        public Builder linodeId(Output<Integer> linodeId) {
            $.linodeId = linodeId;
            return this;
        }

        /**
         * @param linodeId The ID of the Linode to create this Disk under.
         * 
         * @return builder
         * 
         */
        public Builder linodeId(Integer linodeId) {
            return linodeId(Output.of(linodeId));
        }

        /**
         * @param rootPass The root user’s password on a newly-created Linode Disk when deploying from an Image. (Requires `image`)
         * 
         * @return builder
         * 
         */
        public Builder rootPass(@Nullable Output<String> rootPass) {
            $.rootPass = rootPass;
            return this;
        }

        /**
         * @param rootPass The root user’s password on a newly-created Linode Disk when deploying from an Image. (Requires `image`)
         * 
         * @return builder
         * 
         */
        public Builder rootPass(String rootPass) {
            return rootPass(Output.of(rootPass));
        }

        /**
         * @param size The size of the Disk in MB. **NOTE:** Resizing a disk will trigger a Linode reboot.
         * 
         * ***
         * 
         * @return builder
         * 
         */
        public Builder size(Output<Integer> size) {
            $.size = size;
            return this;
        }

        /**
         * @param size The size of the Disk in MB. **NOTE:** Resizing a disk will trigger a Linode reboot.
         * 
         * ***
         * 
         * @return builder
         * 
         */
        public Builder size(Integer size) {
            return size(Output.of(size));
        }

        /**
         * @param stackscriptData An object containing responses to any User Defined Fields present in the StackScript being deployed to this Disk. Only accepted if `stackscript_id` is given. (Requires `image`)
         * 
         * @return builder
         * 
         */
        public Builder stackscriptData(@Nullable Output<Map<String,String>> stackscriptData) {
            $.stackscriptData = stackscriptData;
            return this;
        }

        /**
         * @param stackscriptData An object containing responses to any User Defined Fields present in the StackScript being deployed to this Disk. Only accepted if `stackscript_id` is given. (Requires `image`)
         * 
         * @return builder
         * 
         */
        public Builder stackscriptData(Map<String,String> stackscriptData) {
            return stackscriptData(Output.of(stackscriptData));
        }

        /**
         * @param stackscriptId A StackScript ID that will cause the referenced StackScript to be run during deployment of this Disk. (Requires `image`)
         * 
         * @return builder
         * 
         */
        public Builder stackscriptId(@Nullable Output<Integer> stackscriptId) {
            $.stackscriptId = stackscriptId;
            return this;
        }

        /**
         * @param stackscriptId A StackScript ID that will cause the referenced StackScript to be run during deployment of this Disk. (Requires `image`)
         * 
         * @return builder
         * 
         */
        public Builder stackscriptId(Integer stackscriptId) {
            return stackscriptId(Output.of(stackscriptId));
        }

        public Builder timeouts(@Nullable Output<InstanceDiskTimeoutsArgs> timeouts) {
            $.timeouts = timeouts;
            return this;
        }

        public Builder timeouts(InstanceDiskTimeoutsArgs timeouts) {
            return timeouts(Output.of(timeouts));
        }

        public InstanceDiskArgs build() {
            if ($.label == null) {
                throw new MissingRequiredPropertyException("InstanceDiskArgs", "label");
            }
            if ($.linodeId == null) {
                throw new MissingRequiredPropertyException("InstanceDiskArgs", "linodeId");
            }
            if ($.size == null) {
                throw new MissingRequiredPropertyException("InstanceDiskArgs", "size");
            }
            return $;
        }
    }

}
