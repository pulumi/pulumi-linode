// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.linode.outputs.InstanceConfigDevices;
import com.pulumi.linode.outputs.InstanceConfigHelpers;
import com.pulumi.linode.outputs.InstanceConfigInterface;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InstanceConfig {
    /**
     * @return Arbitrary user comments about this `config`.
     * 
     */
    private @Nullable String comments;
    /**
     * @return A list of `disk` or `volume` attachments for this `config`.  If the `boot_config_label` omits a `devices` block, the Linode will not be booted.
     * 
     */
    private @Nullable InstanceConfigDevices devices;
    /**
     * @return Helpers enabled when booting to this Linode Config.
     * 
     */
    private @Nullable InstanceConfigHelpers helpers;
    /**
     * @return The ID of the disk in the Linode API.
     * 
     */
    private @Nullable Integer id;
    private @Nullable List<InstanceConfigInterface> interfaces;
    /**
     * @return A Kernel ID to boot a Linode with. Default is based on image choice. Examples are `linode/latest-64bit`, `linode/grub2`, `linode/direct-disk`, etc. See all kernels [here](https://api.linode.com/v4/linode/kernels). Note that this is a paginated API endpoint ([docs](https://developers.linode.com/api/v4/linode-kernels)).
     * 
     */
    private @Nullable String kernel;
    /**
     * @return The Linode&#39;s label is for display purposes only. If no label is provided for a Linode, a default will be assigned.
     * 
     */
    private String label;
    /**
     * @return Defaults to the total RAM of the Linode
     * 
     * * `interface` - (Optional) A list of network interfaces to be assigned to the Linode.
     * 
     */
    private @Nullable Integer memoryLimit;
    /**
     * @return The root device to boot. The corresponding disk must be attached to a `device` slot.  Example: `&#34;/dev/sda&#34;`
     * 
     */
    private @Nullable String rootDevice;
    /**
     * @return Defines the state of your Linode after booting. Defaults to `&#34;default&#34;`.
     * 
     */
    private @Nullable String runLevel;
    /**
     * @return Controls the virtualization mode. Defaults to `&#34;paravirt&#34;`.
     * 
     */
    private @Nullable String virtMode;

    private InstanceConfig() {}
    /**
     * @return Arbitrary user comments about this `config`.
     * 
     */
    public Optional<String> comments() {
        return Optional.ofNullable(this.comments);
    }
    /**
     * @return A list of `disk` or `volume` attachments for this `config`.  If the `boot_config_label` omits a `devices` block, the Linode will not be booted.
     * 
     */
    public Optional<InstanceConfigDevices> devices() {
        return Optional.ofNullable(this.devices);
    }
    /**
     * @return Helpers enabled when booting to this Linode Config.
     * 
     */
    public Optional<InstanceConfigHelpers> helpers() {
        return Optional.ofNullable(this.helpers);
    }
    /**
     * @return The ID of the disk in the Linode API.
     * 
     */
    public Optional<Integer> id() {
        return Optional.ofNullable(this.id);
    }
    public List<InstanceConfigInterface> interfaces() {
        return this.interfaces == null ? List.of() : this.interfaces;
    }
    /**
     * @return A Kernel ID to boot a Linode with. Default is based on image choice. Examples are `linode/latest-64bit`, `linode/grub2`, `linode/direct-disk`, etc. See all kernels [here](https://api.linode.com/v4/linode/kernels). Note that this is a paginated API endpoint ([docs](https://developers.linode.com/api/v4/linode-kernels)).
     * 
     */
    public Optional<String> kernel() {
        return Optional.ofNullable(this.kernel);
    }
    /**
     * @return The Linode&#39;s label is for display purposes only. If no label is provided for a Linode, a default will be assigned.
     * 
     */
    public String label() {
        return this.label;
    }
    /**
     * @return Defaults to the total RAM of the Linode
     * 
     * * `interface` - (Optional) A list of network interfaces to be assigned to the Linode.
     * 
     */
    public Optional<Integer> memoryLimit() {
        return Optional.ofNullable(this.memoryLimit);
    }
    /**
     * @return The root device to boot. The corresponding disk must be attached to a `device` slot.  Example: `&#34;/dev/sda&#34;`
     * 
     */
    public Optional<String> rootDevice() {
        return Optional.ofNullable(this.rootDevice);
    }
    /**
     * @return Defines the state of your Linode after booting. Defaults to `&#34;default&#34;`.
     * 
     */
    public Optional<String> runLevel() {
        return Optional.ofNullable(this.runLevel);
    }
    /**
     * @return Controls the virtualization mode. Defaults to `&#34;paravirt&#34;`.
     * 
     */
    public Optional<String> virtMode() {
        return Optional.ofNullable(this.virtMode);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String comments;
        private @Nullable InstanceConfigDevices devices;
        private @Nullable InstanceConfigHelpers helpers;
        private @Nullable Integer id;
        private @Nullable List<InstanceConfigInterface> interfaces;
        private @Nullable String kernel;
        private String label;
        private @Nullable Integer memoryLimit;
        private @Nullable String rootDevice;
        private @Nullable String runLevel;
        private @Nullable String virtMode;
        public Builder() {}
        public Builder(InstanceConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comments = defaults.comments;
    	      this.devices = defaults.devices;
    	      this.helpers = defaults.helpers;
    	      this.id = defaults.id;
    	      this.interfaces = defaults.interfaces;
    	      this.kernel = defaults.kernel;
    	      this.label = defaults.label;
    	      this.memoryLimit = defaults.memoryLimit;
    	      this.rootDevice = defaults.rootDevice;
    	      this.runLevel = defaults.runLevel;
    	      this.virtMode = defaults.virtMode;
        }

        @CustomType.Setter
        public Builder comments(@Nullable String comments) {
            this.comments = comments;
            return this;
        }
        @CustomType.Setter
        public Builder devices(@Nullable InstanceConfigDevices devices) {
            this.devices = devices;
            return this;
        }
        @CustomType.Setter
        public Builder helpers(@Nullable InstanceConfigHelpers helpers) {
            this.helpers = helpers;
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable Integer id) {
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder interfaces(@Nullable List<InstanceConfigInterface> interfaces) {
            this.interfaces = interfaces;
            return this;
        }
        public Builder interfaces(InstanceConfigInterface... interfaces) {
            return interfaces(List.of(interfaces));
        }
        @CustomType.Setter
        public Builder kernel(@Nullable String kernel) {
            this.kernel = kernel;
            return this;
        }
        @CustomType.Setter
        public Builder label(String label) {
            this.label = Objects.requireNonNull(label);
            return this;
        }
        @CustomType.Setter
        public Builder memoryLimit(@Nullable Integer memoryLimit) {
            this.memoryLimit = memoryLimit;
            return this;
        }
        @CustomType.Setter
        public Builder rootDevice(@Nullable String rootDevice) {
            this.rootDevice = rootDevice;
            return this;
        }
        @CustomType.Setter
        public Builder runLevel(@Nullable String runLevel) {
            this.runLevel = runLevel;
            return this;
        }
        @CustomType.Setter
        public Builder virtMode(@Nullable String virtMode) {
            this.virtMode = virtMode;
            return this;
        }
        public InstanceConfig build() {
            final var _resultValue = new InstanceConfig();
            _resultValue.comments = comments;
            _resultValue.devices = devices;
            _resultValue.helpers = helpers;
            _resultValue.id = id;
            _resultValue.interfaces = interfaces;
            _resultValue.kernel = kernel;
            _resultValue.label = label;
            _resultValue.memoryLimit = memoryLimit;
            _resultValue.rootDevice = rootDevice;
            _resultValue.runLevel = runLevel;
            _resultValue.virtMode = virtMode;
            return _resultValue;
        }
    }
}
