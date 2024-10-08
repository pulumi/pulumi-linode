// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InstanceDisk {
    /**
     * @return A list of SSH public keys to deploy for the root user on the newly created Linode. Only accepted if &#39;image&#39; is provided.
     * 
     */
    private @Nullable List<String> authorizedKeys;
    /**
     * @return A list of Linode usernames. If the usernames have associated SSH keys, the keys will be appended to the `root` user&#39;s `~/.ssh/authorized_keys` file automatically. Only accepted if &#39;image&#39; is provided.
     * 
     */
    private @Nullable List<String> authorizedUsers;
    /**
     * @return The Disk filesystem can be one of: raw, swap, ext3, ext4, initrd (max 32mb)
     * 
     */
    private @Nullable String filesystem;
    /**
     * @return The ID of the Placement Group.
     * 
     */
    private @Nullable Integer id;
    /**
     * @return An Image ID to deploy the Disk from. Official Linode Images start with linode/, while your Images start with private/.
     * 
     */
    private @Nullable String image;
    /**
     * @return The Linode&#39;s label is for display purposes only. If no label is provided for a Linode, a default will be assigned.
     * 
     */
    private String label;
    /**
     * @return If true, this Disk is read-only.
     * 
     */
    private @Nullable Boolean readOnly;
    /**
     * @return The password that will be initialially assigned to the &#39;root&#39; user account.
     * 
     */
    private @Nullable String rootPass;
    /**
     * @return The size of the Disk in MB.
     * 
     */
    private Integer size;
    /**
     * @return An object containing responses to any User Defined Fields present in the StackScript being deployed to this Linode. Only accepted if &#39;stackscript_id&#39; is given. The required values depend on the StackScript being deployed.
     * 
     */
    private @Nullable Map<String,String> stackscriptData;
    /**
     * @return The StackScript to deploy to the newly created Linode. If provided, &#39;image&#39; must also be provided, and must be an Image that is compatible with this StackScript.
     * 
     */
    private @Nullable Integer stackscriptId;

    private InstanceDisk() {}
    /**
     * @return A list of SSH public keys to deploy for the root user on the newly created Linode. Only accepted if &#39;image&#39; is provided.
     * 
     */
    public List<String> authorizedKeys() {
        return this.authorizedKeys == null ? List.of() : this.authorizedKeys;
    }
    /**
     * @return A list of Linode usernames. If the usernames have associated SSH keys, the keys will be appended to the `root` user&#39;s `~/.ssh/authorized_keys` file automatically. Only accepted if &#39;image&#39; is provided.
     * 
     */
    public List<String> authorizedUsers() {
        return this.authorizedUsers == null ? List.of() : this.authorizedUsers;
    }
    /**
     * @return The Disk filesystem can be one of: raw, swap, ext3, ext4, initrd (max 32mb)
     * 
     */
    public Optional<String> filesystem() {
        return Optional.ofNullable(this.filesystem);
    }
    /**
     * @return The ID of the Placement Group.
     * 
     */
    public Optional<Integer> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return An Image ID to deploy the Disk from. Official Linode Images start with linode/, while your Images start with private/.
     * 
     */
    public Optional<String> image() {
        return Optional.ofNullable(this.image);
    }
    /**
     * @return The Linode&#39;s label is for display purposes only. If no label is provided for a Linode, a default will be assigned.
     * 
     */
    public String label() {
        return this.label;
    }
    /**
     * @return If true, this Disk is read-only.
     * 
     */
    public Optional<Boolean> readOnly() {
        return Optional.ofNullable(this.readOnly);
    }
    /**
     * @return The password that will be initialially assigned to the &#39;root&#39; user account.
     * 
     */
    public Optional<String> rootPass() {
        return Optional.ofNullable(this.rootPass);
    }
    /**
     * @return The size of the Disk in MB.
     * 
     */
    public Integer size() {
        return this.size;
    }
    /**
     * @return An object containing responses to any User Defined Fields present in the StackScript being deployed to this Linode. Only accepted if &#39;stackscript_id&#39; is given. The required values depend on the StackScript being deployed.
     * 
     */
    public Map<String,String> stackscriptData() {
        return this.stackscriptData == null ? Map.of() : this.stackscriptData;
    }
    /**
     * @return The StackScript to deploy to the newly created Linode. If provided, &#39;image&#39; must also be provided, and must be an Image that is compatible with this StackScript.
     * 
     */
    public Optional<Integer> stackscriptId() {
        return Optional.ofNullable(this.stackscriptId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceDisk defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> authorizedKeys;
        private @Nullable List<String> authorizedUsers;
        private @Nullable String filesystem;
        private @Nullable Integer id;
        private @Nullable String image;
        private String label;
        private @Nullable Boolean readOnly;
        private @Nullable String rootPass;
        private Integer size;
        private @Nullable Map<String,String> stackscriptData;
        private @Nullable Integer stackscriptId;
        public Builder() {}
        public Builder(InstanceDisk defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizedKeys = defaults.authorizedKeys;
    	      this.authorizedUsers = defaults.authorizedUsers;
    	      this.filesystem = defaults.filesystem;
    	      this.id = defaults.id;
    	      this.image = defaults.image;
    	      this.label = defaults.label;
    	      this.readOnly = defaults.readOnly;
    	      this.rootPass = defaults.rootPass;
    	      this.size = defaults.size;
    	      this.stackscriptData = defaults.stackscriptData;
    	      this.stackscriptId = defaults.stackscriptId;
        }

        @CustomType.Setter
        public Builder authorizedKeys(@Nullable List<String> authorizedKeys) {

            this.authorizedKeys = authorizedKeys;
            return this;
        }
        public Builder authorizedKeys(String... authorizedKeys) {
            return authorizedKeys(List.of(authorizedKeys));
        }
        @CustomType.Setter
        public Builder authorizedUsers(@Nullable List<String> authorizedUsers) {

            this.authorizedUsers = authorizedUsers;
            return this;
        }
        public Builder authorizedUsers(String... authorizedUsers) {
            return authorizedUsers(List.of(authorizedUsers));
        }
        @CustomType.Setter
        public Builder filesystem(@Nullable String filesystem) {

            this.filesystem = filesystem;
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable Integer id) {

            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder image(@Nullable String image) {

            this.image = image;
            return this;
        }
        @CustomType.Setter
        public Builder label(String label) {
            if (label == null) {
              throw new MissingRequiredPropertyException("InstanceDisk", "label");
            }
            this.label = label;
            return this;
        }
        @CustomType.Setter
        public Builder readOnly(@Nullable Boolean readOnly) {

            this.readOnly = readOnly;
            return this;
        }
        @CustomType.Setter
        public Builder rootPass(@Nullable String rootPass) {

            this.rootPass = rootPass;
            return this;
        }
        @CustomType.Setter
        public Builder size(Integer size) {
            if (size == null) {
              throw new MissingRequiredPropertyException("InstanceDisk", "size");
            }
            this.size = size;
            return this;
        }
        @CustomType.Setter
        public Builder stackscriptData(@Nullable Map<String,String> stackscriptData) {

            this.stackscriptData = stackscriptData;
            return this;
        }
        @CustomType.Setter
        public Builder stackscriptId(@Nullable Integer stackscriptId) {

            this.stackscriptId = stackscriptId;
            return this;
        }
        public InstanceDisk build() {
            final var _resultValue = new InstanceDisk();
            _resultValue.authorizedKeys = authorizedKeys;
            _resultValue.authorizedUsers = authorizedUsers;
            _resultValue.filesystem = filesystem;
            _resultValue.id = id;
            _resultValue.image = image;
            _resultValue.label = label;
            _resultValue.readOnly = readOnly;
            _resultValue.rootPass = rootPass;
            _resultValue.size = size;
            _resultValue.stackscriptData = stackscriptData;
            _resultValue.stackscriptId = stackscriptId;
            return _resultValue;
        }
    }
}
