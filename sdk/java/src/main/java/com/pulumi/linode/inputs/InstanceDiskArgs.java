// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceDiskArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceDiskArgs Empty = new InstanceDiskArgs();

    /**
     * A list of SSH public keys to deploy for the root user on the newly created Linode. Only accepted if &#39;image&#39; is provided.
     * 
     */
    @Import(name="authorizedKeys")
    private @Nullable Output<List<String>> authorizedKeys;

    /**
     * @return A list of SSH public keys to deploy for the root user on the newly created Linode. Only accepted if &#39;image&#39; is provided.
     * 
     */
    public Optional<Output<List<String>>> authorizedKeys() {
        return Optional.ofNullable(this.authorizedKeys);
    }

    /**
     * A list of Linode usernames. If the usernames have associated SSH keys, the keys will be appended to the `root` user&#39;s `~/.ssh/authorized_keys` file automatically. Only accepted if &#39;image&#39; is provided.
     * 
     */
    @Import(name="authorizedUsers")
    private @Nullable Output<List<String>> authorizedUsers;

    /**
     * @return A list of Linode usernames. If the usernames have associated SSH keys, the keys will be appended to the `root` user&#39;s `~/.ssh/authorized_keys` file automatically. Only accepted if &#39;image&#39; is provided.
     * 
     */
    public Optional<Output<List<String>>> authorizedUsers() {
        return Optional.ofNullable(this.authorizedUsers);
    }

    /**
     * The Disk filesystem can be one of: raw, swap, ext3, ext4, initrd (max 32mb)
     * 
     */
    @Import(name="filesystem")
    private @Nullable Output<String> filesystem;

    /**
     * @return The Disk filesystem can be one of: raw, swap, ext3, ext4, initrd (max 32mb)
     * 
     */
    public Optional<Output<String>> filesystem() {
        return Optional.ofNullable(this.filesystem);
    }

    /**
     * The ID of the Placement Group.
     * 
     */
    @Import(name="id")
    private @Nullable Output<Integer> id;

    /**
     * @return The ID of the Placement Group.
     * 
     */
    public Optional<Output<Integer>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * An Image ID to deploy the Disk from. Official Linode Images start with linode/, while your Images start with private/.
     * 
     */
    @Import(name="image")
    private @Nullable Output<String> image;

    /**
     * @return An Image ID to deploy the Disk from. Official Linode Images start with linode/, while your Images start with private/.
     * 
     */
    public Optional<Output<String>> image() {
        return Optional.ofNullable(this.image);
    }

    /**
     * The Linode&#39;s label is for display purposes only. If no label is provided for a Linode, a default will be assigned.
     * 
     */
    @Import(name="label", required=true)
    private Output<String> label;

    /**
     * @return The Linode&#39;s label is for display purposes only. If no label is provided for a Linode, a default will be assigned.
     * 
     */
    public Output<String> label() {
        return this.label;
    }

    /**
     * If true, this Disk is read-only.
     * 
     */
    @Import(name="readOnly")
    private @Nullable Output<Boolean> readOnly;

    /**
     * @return If true, this Disk is read-only.
     * 
     */
    public Optional<Output<Boolean>> readOnly() {
        return Optional.ofNullable(this.readOnly);
    }

    /**
     * The password that will be initialially assigned to the &#39;root&#39; user account.
     * 
     */
    @Import(name="rootPass")
    private @Nullable Output<String> rootPass;

    /**
     * @return The password that will be initialially assigned to the &#39;root&#39; user account.
     * 
     */
    public Optional<Output<String>> rootPass() {
        return Optional.ofNullable(this.rootPass);
    }

    /**
     * The size of the Disk in MB.
     * 
     */
    @Import(name="size", required=true)
    private Output<Integer> size;

    /**
     * @return The size of the Disk in MB.
     * 
     */
    public Output<Integer> size() {
        return this.size;
    }

    /**
     * An object containing responses to any User Defined Fields present in the StackScript being deployed to this Linode. Only accepted if &#39;stackscript_id&#39; is given. The required values depend on the StackScript being deployed.
     * 
     */
    @Import(name="stackscriptData")
    private @Nullable Output<Map<String,Object>> stackscriptData;

    /**
     * @return An object containing responses to any User Defined Fields present in the StackScript being deployed to this Linode. Only accepted if &#39;stackscript_id&#39; is given. The required values depend on the StackScript being deployed.
     * 
     */
    public Optional<Output<Map<String,Object>>> stackscriptData() {
        return Optional.ofNullable(this.stackscriptData);
    }

    /**
     * The StackScript to deploy to the newly created Linode. If provided, &#39;image&#39; must also be provided, and must be an Image that is compatible with this StackScript.
     * 
     */
    @Import(name="stackscriptId")
    private @Nullable Output<Integer> stackscriptId;

    /**
     * @return The StackScript to deploy to the newly created Linode. If provided, &#39;image&#39; must also be provided, and must be an Image that is compatible with this StackScript.
     * 
     */
    public Optional<Output<Integer>> stackscriptId() {
        return Optional.ofNullable(this.stackscriptId);
    }

    private InstanceDiskArgs() {}

    private InstanceDiskArgs(InstanceDiskArgs $) {
        this.authorizedKeys = $.authorizedKeys;
        this.authorizedUsers = $.authorizedUsers;
        this.filesystem = $.filesystem;
        this.id = $.id;
        this.image = $.image;
        this.label = $.label;
        this.readOnly = $.readOnly;
        this.rootPass = $.rootPass;
        this.size = $.size;
        this.stackscriptData = $.stackscriptData;
        this.stackscriptId = $.stackscriptId;
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
         * @param authorizedKeys A list of SSH public keys to deploy for the root user on the newly created Linode. Only accepted if &#39;image&#39; is provided.
         * 
         * @return builder
         * 
         */
        public Builder authorizedKeys(@Nullable Output<List<String>> authorizedKeys) {
            $.authorizedKeys = authorizedKeys;
            return this;
        }

        /**
         * @param authorizedKeys A list of SSH public keys to deploy for the root user on the newly created Linode. Only accepted if &#39;image&#39; is provided.
         * 
         * @return builder
         * 
         */
        public Builder authorizedKeys(List<String> authorizedKeys) {
            return authorizedKeys(Output.of(authorizedKeys));
        }

        /**
         * @param authorizedKeys A list of SSH public keys to deploy for the root user on the newly created Linode. Only accepted if &#39;image&#39; is provided.
         * 
         * @return builder
         * 
         */
        public Builder authorizedKeys(String... authorizedKeys) {
            return authorizedKeys(List.of(authorizedKeys));
        }

        /**
         * @param authorizedUsers A list of Linode usernames. If the usernames have associated SSH keys, the keys will be appended to the `root` user&#39;s `~/.ssh/authorized_keys` file automatically. Only accepted if &#39;image&#39; is provided.
         * 
         * @return builder
         * 
         */
        public Builder authorizedUsers(@Nullable Output<List<String>> authorizedUsers) {
            $.authorizedUsers = authorizedUsers;
            return this;
        }

        /**
         * @param authorizedUsers A list of Linode usernames. If the usernames have associated SSH keys, the keys will be appended to the `root` user&#39;s `~/.ssh/authorized_keys` file automatically. Only accepted if &#39;image&#39; is provided.
         * 
         * @return builder
         * 
         */
        public Builder authorizedUsers(List<String> authorizedUsers) {
            return authorizedUsers(Output.of(authorizedUsers));
        }

        /**
         * @param authorizedUsers A list of Linode usernames. If the usernames have associated SSH keys, the keys will be appended to the `root` user&#39;s `~/.ssh/authorized_keys` file automatically. Only accepted if &#39;image&#39; is provided.
         * 
         * @return builder
         * 
         */
        public Builder authorizedUsers(String... authorizedUsers) {
            return authorizedUsers(List.of(authorizedUsers));
        }

        /**
         * @param filesystem The Disk filesystem can be one of: raw, swap, ext3, ext4, initrd (max 32mb)
         * 
         * @return builder
         * 
         */
        public Builder filesystem(@Nullable Output<String> filesystem) {
            $.filesystem = filesystem;
            return this;
        }

        /**
         * @param filesystem The Disk filesystem can be one of: raw, swap, ext3, ext4, initrd (max 32mb)
         * 
         * @return builder
         * 
         */
        public Builder filesystem(String filesystem) {
            return filesystem(Output.of(filesystem));
        }

        /**
         * @param id The ID of the Placement Group.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<Integer> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of the Placement Group.
         * 
         * @return builder
         * 
         */
        public Builder id(Integer id) {
            return id(Output.of(id));
        }

        /**
         * @param image An Image ID to deploy the Disk from. Official Linode Images start with linode/, while your Images start with private/.
         * 
         * @return builder
         * 
         */
        public Builder image(@Nullable Output<String> image) {
            $.image = image;
            return this;
        }

        /**
         * @param image An Image ID to deploy the Disk from. Official Linode Images start with linode/, while your Images start with private/.
         * 
         * @return builder
         * 
         */
        public Builder image(String image) {
            return image(Output.of(image));
        }

        /**
         * @param label The Linode&#39;s label is for display purposes only. If no label is provided for a Linode, a default will be assigned.
         * 
         * @return builder
         * 
         */
        public Builder label(Output<String> label) {
            $.label = label;
            return this;
        }

        /**
         * @param label The Linode&#39;s label is for display purposes only. If no label is provided for a Linode, a default will be assigned.
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            return label(Output.of(label));
        }

        /**
         * @param readOnly If true, this Disk is read-only.
         * 
         * @return builder
         * 
         */
        public Builder readOnly(@Nullable Output<Boolean> readOnly) {
            $.readOnly = readOnly;
            return this;
        }

        /**
         * @param readOnly If true, this Disk is read-only.
         * 
         * @return builder
         * 
         */
        public Builder readOnly(Boolean readOnly) {
            return readOnly(Output.of(readOnly));
        }

        /**
         * @param rootPass The password that will be initialially assigned to the &#39;root&#39; user account.
         * 
         * @return builder
         * 
         */
        public Builder rootPass(@Nullable Output<String> rootPass) {
            $.rootPass = rootPass;
            return this;
        }

        /**
         * @param rootPass The password that will be initialially assigned to the &#39;root&#39; user account.
         * 
         * @return builder
         * 
         */
        public Builder rootPass(String rootPass) {
            return rootPass(Output.of(rootPass));
        }

        /**
         * @param size The size of the Disk in MB.
         * 
         * @return builder
         * 
         */
        public Builder size(Output<Integer> size) {
            $.size = size;
            return this;
        }

        /**
         * @param size The size of the Disk in MB.
         * 
         * @return builder
         * 
         */
        public Builder size(Integer size) {
            return size(Output.of(size));
        }

        /**
         * @param stackscriptData An object containing responses to any User Defined Fields present in the StackScript being deployed to this Linode. Only accepted if &#39;stackscript_id&#39; is given. The required values depend on the StackScript being deployed.
         * 
         * @return builder
         * 
         */
        public Builder stackscriptData(@Nullable Output<Map<String,Object>> stackscriptData) {
            $.stackscriptData = stackscriptData;
            return this;
        }

        /**
         * @param stackscriptData An object containing responses to any User Defined Fields present in the StackScript being deployed to this Linode. Only accepted if &#39;stackscript_id&#39; is given. The required values depend on the StackScript being deployed.
         * 
         * @return builder
         * 
         */
        public Builder stackscriptData(Map<String,Object> stackscriptData) {
            return stackscriptData(Output.of(stackscriptData));
        }

        /**
         * @param stackscriptId The StackScript to deploy to the newly created Linode. If provided, &#39;image&#39; must also be provided, and must be an Image that is compatible with this StackScript.
         * 
         * @return builder
         * 
         */
        public Builder stackscriptId(@Nullable Output<Integer> stackscriptId) {
            $.stackscriptId = stackscriptId;
            return this;
        }

        /**
         * @param stackscriptId The StackScript to deploy to the newly created Linode. If provided, &#39;image&#39; must also be provided, and must be an Image that is compatible with this StackScript.
         * 
         * @return builder
         * 
         */
        public Builder stackscriptId(Integer stackscriptId) {
            return stackscriptId(Output.of(stackscriptId));
        }

        public InstanceDiskArgs build() {
            if ($.label == null) {
                throw new MissingRequiredPropertyException("InstanceDiskArgs", "label");
            }
            if ($.size == null) {
                throw new MissingRequiredPropertyException("InstanceDiskArgs", "size");
            }
            return $;
        }
    }

}
