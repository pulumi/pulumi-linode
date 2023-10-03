// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
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
     * A list of SSH public keys to deploy for the root user on the newly created Linode. Only accepted if `image` is provided. *This value can not be imported.* *Changing `authorized_keys` forces the creation of a new Linode Instance.*
     * 
     */
    @Import(name="authorizedKeys")
    private @Nullable Output<List<String>> authorizedKeys;

    /**
     * @return A list of SSH public keys to deploy for the root user on the newly created Linode. Only accepted if `image` is provided. *This value can not be imported.* *Changing `authorized_keys` forces the creation of a new Linode Instance.*
     * 
     */
    public Optional<Output<List<String>>> authorizedKeys() {
        return Optional.ofNullable(this.authorizedKeys);
    }

    /**
     * A list of Linode usernames. If the usernames have associated SSH keys, the keys will be appended to the `root` user&#39;s `~/.ssh/authorized_keys` file automatically. *This value can not be imported.* *Changing `authorized_users` forces the creation of a new Linode Instance.*
     * 
     */
    @Import(name="authorizedUsers")
    private @Nullable Output<List<String>> authorizedUsers;

    /**
     * @return A list of Linode usernames. If the usernames have associated SSH keys, the keys will be appended to the `root` user&#39;s `~/.ssh/authorized_keys` file automatically. *This value can not be imported.* *Changing `authorized_users` forces the creation of a new Linode Instance.*
     * 
     */
    public Optional<Output<List<String>>> authorizedUsers() {
        return Optional.ofNullable(this.authorizedUsers);
    }

    /**
     * The Disk filesystem can be one of: `&#34;raw&#34;`, `&#34;swap&#34;`, `&#34;ext3&#34;`, `&#34;ext4&#34;`, or `&#34;initrd&#34;` which has a max size of 32mb and can be used in the config `initrd` (not currently supported in this provider).
     * 
     */
    @Import(name="filesystem")
    private @Nullable Output<String> filesystem;

    /**
     * @return The Disk filesystem can be one of: `&#34;raw&#34;`, `&#34;swap&#34;`, `&#34;ext3&#34;`, `&#34;ext4&#34;`, or `&#34;initrd&#34;` which has a max size of 32mb and can be used in the config `initrd` (not currently supported in this provider).
     * 
     */
    public Optional<Output<String>> filesystem() {
        return Optional.ofNullable(this.filesystem);
    }

    /**
     * The ID of the disk in the Linode API.
     * 
     */
    @Import(name="id")
    private @Nullable Output<Integer> id;

    /**
     * @return The ID of the disk in the Linode API.
     * 
     */
    public Optional<Output<Integer>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * An Image ID to deploy the Disk from. Official Linode Images start with linode/, while your Images start with private/. See /images for more information on the Images available for you to use. Examples are `linode/debian9`, `linode/fedora28`, `linode/ubuntu16.04lts`, `linode/arch`, and `private/12345`. See all images [here](https://api.linode.com/v4/images). *Changing `image` forces the creation of a new Linode Instance.*
     * 
     */
    @Import(name="image")
    private @Nullable Output<String> image;

    /**
     * @return An Image ID to deploy the Disk from. Official Linode Images start with linode/, while your Images start with private/. See /images for more information on the Images available for you to use. Examples are `linode/debian9`, `linode/fedora28`, `linode/ubuntu16.04lts`, `linode/arch`, and `private/12345`. See all images [here](https://api.linode.com/v4/images). *Changing `image` forces the creation of a new Linode Instance.*
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
     * The initial password for the `root` user account. *This value can not be imported.* *Changing `root_pass` forces the creation of a new Linode Instance.* *If omitted, a random password will be generated but will not be stored in state.*
     * 
     */
    @Import(name="rootPass")
    private @Nullable Output<String> rootPass;

    /**
     * @return The initial password for the `root` user account. *This value can not be imported.* *Changing `root_pass` forces the creation of a new Linode Instance.* *If omitted, a random password will be generated but will not be stored in state.*
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
     * An object containing responses to any User Defined Fields present in the StackScript being deployed to this Linode. Only accepted if &#39;stackscript_id&#39; is given. The required values depend on the StackScript being deployed.  *This value can not be imported.* *Changing `stackscript_data` forces the creation of a new Linode Instance.*
     * 
     */
    @Import(name="stackscriptData")
    private @Nullable Output<Map<String,Object>> stackscriptData;

    /**
     * @return An object containing responses to any User Defined Fields present in the StackScript being deployed to this Linode. Only accepted if &#39;stackscript_id&#39; is given. The required values depend on the StackScript being deployed.  *This value can not be imported.* *Changing `stackscript_data` forces the creation of a new Linode Instance.*
     * 
     */
    public Optional<Output<Map<String,Object>>> stackscriptData() {
        return Optional.ofNullable(this.stackscriptData);
    }

    /**
     * The StackScript to deploy to the newly created Linode. If provided, &#39;image&#39; must also be provided, and must be an Image that is compatible with this StackScript. *This value can not be imported.* *Changing `stackscript_id` forces the creation of a new Linode Instance.*
     * 
     */
    @Import(name="stackscriptId")
    private @Nullable Output<Integer> stackscriptId;

    /**
     * @return The StackScript to deploy to the newly created Linode. If provided, &#39;image&#39; must also be provided, and must be an Image that is compatible with this StackScript. *This value can not be imported.* *Changing `stackscript_id` forces the creation of a new Linode Instance.*
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
         * @param authorizedKeys A list of SSH public keys to deploy for the root user on the newly created Linode. Only accepted if `image` is provided. *This value can not be imported.* *Changing `authorized_keys` forces the creation of a new Linode Instance.*
         * 
         * @return builder
         * 
         */
        public Builder authorizedKeys(@Nullable Output<List<String>> authorizedKeys) {
            $.authorizedKeys = authorizedKeys;
            return this;
        }

        /**
         * @param authorizedKeys A list of SSH public keys to deploy for the root user on the newly created Linode. Only accepted if `image` is provided. *This value can not be imported.* *Changing `authorized_keys` forces the creation of a new Linode Instance.*
         * 
         * @return builder
         * 
         */
        public Builder authorizedKeys(List<String> authorizedKeys) {
            return authorizedKeys(Output.of(authorizedKeys));
        }

        /**
         * @param authorizedKeys A list of SSH public keys to deploy for the root user on the newly created Linode. Only accepted if `image` is provided. *This value can not be imported.* *Changing `authorized_keys` forces the creation of a new Linode Instance.*
         * 
         * @return builder
         * 
         */
        public Builder authorizedKeys(String... authorizedKeys) {
            return authorizedKeys(List.of(authorizedKeys));
        }

        /**
         * @param authorizedUsers A list of Linode usernames. If the usernames have associated SSH keys, the keys will be appended to the `root` user&#39;s `~/.ssh/authorized_keys` file automatically. *This value can not be imported.* *Changing `authorized_users` forces the creation of a new Linode Instance.*
         * 
         * @return builder
         * 
         */
        public Builder authorizedUsers(@Nullable Output<List<String>> authorizedUsers) {
            $.authorizedUsers = authorizedUsers;
            return this;
        }

        /**
         * @param authorizedUsers A list of Linode usernames. If the usernames have associated SSH keys, the keys will be appended to the `root` user&#39;s `~/.ssh/authorized_keys` file automatically. *This value can not be imported.* *Changing `authorized_users` forces the creation of a new Linode Instance.*
         * 
         * @return builder
         * 
         */
        public Builder authorizedUsers(List<String> authorizedUsers) {
            return authorizedUsers(Output.of(authorizedUsers));
        }

        /**
         * @param authorizedUsers A list of Linode usernames. If the usernames have associated SSH keys, the keys will be appended to the `root` user&#39;s `~/.ssh/authorized_keys` file automatically. *This value can not be imported.* *Changing `authorized_users` forces the creation of a new Linode Instance.*
         * 
         * @return builder
         * 
         */
        public Builder authorizedUsers(String... authorizedUsers) {
            return authorizedUsers(List.of(authorizedUsers));
        }

        /**
         * @param filesystem The Disk filesystem can be one of: `&#34;raw&#34;`, `&#34;swap&#34;`, `&#34;ext3&#34;`, `&#34;ext4&#34;`, or `&#34;initrd&#34;` which has a max size of 32mb and can be used in the config `initrd` (not currently supported in this provider).
         * 
         * @return builder
         * 
         */
        public Builder filesystem(@Nullable Output<String> filesystem) {
            $.filesystem = filesystem;
            return this;
        }

        /**
         * @param filesystem The Disk filesystem can be one of: `&#34;raw&#34;`, `&#34;swap&#34;`, `&#34;ext3&#34;`, `&#34;ext4&#34;`, or `&#34;initrd&#34;` which has a max size of 32mb and can be used in the config `initrd` (not currently supported in this provider).
         * 
         * @return builder
         * 
         */
        public Builder filesystem(String filesystem) {
            return filesystem(Output.of(filesystem));
        }

        /**
         * @param id The ID of the disk in the Linode API.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<Integer> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of the disk in the Linode API.
         * 
         * @return builder
         * 
         */
        public Builder id(Integer id) {
            return id(Output.of(id));
        }

        /**
         * @param image An Image ID to deploy the Disk from. Official Linode Images start with linode/, while your Images start with private/. See /images for more information on the Images available for you to use. Examples are `linode/debian9`, `linode/fedora28`, `linode/ubuntu16.04lts`, `linode/arch`, and `private/12345`. See all images [here](https://api.linode.com/v4/images). *Changing `image` forces the creation of a new Linode Instance.*
         * 
         * @return builder
         * 
         */
        public Builder image(@Nullable Output<String> image) {
            $.image = image;
            return this;
        }

        /**
         * @param image An Image ID to deploy the Disk from. Official Linode Images start with linode/, while your Images start with private/. See /images for more information on the Images available for you to use. Examples are `linode/debian9`, `linode/fedora28`, `linode/ubuntu16.04lts`, `linode/arch`, and `private/12345`. See all images [here](https://api.linode.com/v4/images). *Changing `image` forces the creation of a new Linode Instance.*
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
         * @param rootPass The initial password for the `root` user account. *This value can not be imported.* *Changing `root_pass` forces the creation of a new Linode Instance.* *If omitted, a random password will be generated but will not be stored in state.*
         * 
         * @return builder
         * 
         */
        public Builder rootPass(@Nullable Output<String> rootPass) {
            $.rootPass = rootPass;
            return this;
        }

        /**
         * @param rootPass The initial password for the `root` user account. *This value can not be imported.* *Changing `root_pass` forces the creation of a new Linode Instance.* *If omitted, a random password will be generated but will not be stored in state.*
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
         * @param stackscriptData An object containing responses to any User Defined Fields present in the StackScript being deployed to this Linode. Only accepted if &#39;stackscript_id&#39; is given. The required values depend on the StackScript being deployed.  *This value can not be imported.* *Changing `stackscript_data` forces the creation of a new Linode Instance.*
         * 
         * @return builder
         * 
         */
        public Builder stackscriptData(@Nullable Output<Map<String,Object>> stackscriptData) {
            $.stackscriptData = stackscriptData;
            return this;
        }

        /**
         * @param stackscriptData An object containing responses to any User Defined Fields present in the StackScript being deployed to this Linode. Only accepted if &#39;stackscript_id&#39; is given. The required values depend on the StackScript being deployed.  *This value can not be imported.* *Changing `stackscript_data` forces the creation of a new Linode Instance.*
         * 
         * @return builder
         * 
         */
        public Builder stackscriptData(Map<String,Object> stackscriptData) {
            return stackscriptData(Output.of(stackscriptData));
        }

        /**
         * @param stackscriptId The StackScript to deploy to the newly created Linode. If provided, &#39;image&#39; must also be provided, and must be an Image that is compatible with this StackScript. *This value can not be imported.* *Changing `stackscript_id` forces the creation of a new Linode Instance.*
         * 
         * @return builder
         * 
         */
        public Builder stackscriptId(@Nullable Output<Integer> stackscriptId) {
            $.stackscriptId = stackscriptId;
            return this;
        }

        /**
         * @param stackscriptId The StackScript to deploy to the newly created Linode. If provided, &#39;image&#39; must also be provided, and must be an Image that is compatible with this StackScript. *This value can not be imported.* *Changing `stackscript_id` forces the creation of a new Linode Instance.*
         * 
         * @return builder
         * 
         */
        public Builder stackscriptId(Integer stackscriptId) {
            return stackscriptId(Output.of(stackscriptId));
        }

        public InstanceDiskArgs build() {
            $.label = Objects.requireNonNull($.label, "expected parameter 'label' to be non-null");
            $.size = Objects.requireNonNull($.size, "expected parameter 'size' to be non-null");
            return $;
        }
    }

}
