// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.linode.outputs.GetInstancesInstanceConfigDevice;
import com.pulumi.linode.outputs.GetInstancesInstanceConfigHelper;
import com.pulumi.linode.outputs.GetInstancesInstanceConfigInterface;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetInstancesInstanceConfig {
    /**
     * @return Arbitrary user comments about this `config`.
     * 
     */
    private String comments;
    /**
     * @return A list of `disk` or `volume` attachments for this `config`.  If the `boot_config_label` omits a `devices` block, the Linode will not be booted.
     * 
     */
    private List<GetInstancesInstanceConfigDevice> devices;
    /**
     * @return Helpers enabled when booting to this Linode Config.
     * 
     */
    private List<GetInstancesInstanceConfigHelper> helpers;
    private List<GetInstancesInstanceConfigInterface> interfaces;
    /**
     * @return A Kernel ID to boot a Linode with. Default is based on image choice. Examples are `linode/latest-64bit`, `linode/grub2`, `linode/direct-disk`, etc. See all kernels [here](https://api.linode.com/v4/linode/kernels). Note that this is a paginated API endpoint ([docs](https://developers.linode.com/api/v4/linode-kernels)).
     * 
     */
    private String kernel;
    /**
     * @return (Optional) The name of this interface. If the interface is a `vlan`, a label is required. Must be undefined for `public` purpose interfaces.
     * 
     */
    private String label;
    /**
     * @return Defaults to the total RAM of the Linode
     * 
     */
    private Integer memoryLimit;
    /**
     * @return The root device to boot.
     * 
     */
    private String rootDevice;
    /**
     * @return Defines the state of your Linode after booting.
     * 
     */
    private String runLevel;
    /**
     * @return Controls the virtualization mode.
     * 
     */
    private String virtMode;

    private GetInstancesInstanceConfig() {}
    /**
     * @return Arbitrary user comments about this `config`.
     * 
     */
    public String comments() {
        return this.comments;
    }
    /**
     * @return A list of `disk` or `volume` attachments for this `config`.  If the `boot_config_label` omits a `devices` block, the Linode will not be booted.
     * 
     */
    public List<GetInstancesInstanceConfigDevice> devices() {
        return this.devices;
    }
    /**
     * @return Helpers enabled when booting to this Linode Config.
     * 
     */
    public List<GetInstancesInstanceConfigHelper> helpers() {
        return this.helpers;
    }
    public List<GetInstancesInstanceConfigInterface> interfaces() {
        return this.interfaces;
    }
    /**
     * @return A Kernel ID to boot a Linode with. Default is based on image choice. Examples are `linode/latest-64bit`, `linode/grub2`, `linode/direct-disk`, etc. See all kernels [here](https://api.linode.com/v4/linode/kernels). Note that this is a paginated API endpoint ([docs](https://developers.linode.com/api/v4/linode-kernels)).
     * 
     */
    public String kernel() {
        return this.kernel;
    }
    /**
     * @return (Optional) The name of this interface. If the interface is a `vlan`, a label is required. Must be undefined for `public` purpose interfaces.
     * 
     */
    public String label() {
        return this.label;
    }
    /**
     * @return Defaults to the total RAM of the Linode
     * 
     */
    public Integer memoryLimit() {
        return this.memoryLimit;
    }
    /**
     * @return The root device to boot.
     * 
     */
    public String rootDevice() {
        return this.rootDevice;
    }
    /**
     * @return Defines the state of your Linode after booting.
     * 
     */
    public String runLevel() {
        return this.runLevel;
    }
    /**
     * @return Controls the virtualization mode.
     * 
     */
    public String virtMode() {
        return this.virtMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstancesInstanceConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String comments;
        private List<GetInstancesInstanceConfigDevice> devices;
        private List<GetInstancesInstanceConfigHelper> helpers;
        private List<GetInstancesInstanceConfigInterface> interfaces;
        private String kernel;
        private String label;
        private Integer memoryLimit;
        private String rootDevice;
        private String runLevel;
        private String virtMode;
        public Builder() {}
        public Builder(GetInstancesInstanceConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comments = defaults.comments;
    	      this.devices = defaults.devices;
    	      this.helpers = defaults.helpers;
    	      this.interfaces = defaults.interfaces;
    	      this.kernel = defaults.kernel;
    	      this.label = defaults.label;
    	      this.memoryLimit = defaults.memoryLimit;
    	      this.rootDevice = defaults.rootDevice;
    	      this.runLevel = defaults.runLevel;
    	      this.virtMode = defaults.virtMode;
        }

        @CustomType.Setter
        public Builder comments(String comments) {
            this.comments = Objects.requireNonNull(comments);
            return this;
        }
        @CustomType.Setter
        public Builder devices(List<GetInstancesInstanceConfigDevice> devices) {
            this.devices = Objects.requireNonNull(devices);
            return this;
        }
        public Builder devices(GetInstancesInstanceConfigDevice... devices) {
            return devices(List.of(devices));
        }
        @CustomType.Setter
        public Builder helpers(List<GetInstancesInstanceConfigHelper> helpers) {
            this.helpers = Objects.requireNonNull(helpers);
            return this;
        }
        public Builder helpers(GetInstancesInstanceConfigHelper... helpers) {
            return helpers(List.of(helpers));
        }
        @CustomType.Setter
        public Builder interfaces(List<GetInstancesInstanceConfigInterface> interfaces) {
            this.interfaces = Objects.requireNonNull(interfaces);
            return this;
        }
        public Builder interfaces(GetInstancesInstanceConfigInterface... interfaces) {
            return interfaces(List.of(interfaces));
        }
        @CustomType.Setter
        public Builder kernel(String kernel) {
            this.kernel = Objects.requireNonNull(kernel);
            return this;
        }
        @CustomType.Setter
        public Builder label(String label) {
            this.label = Objects.requireNonNull(label);
            return this;
        }
        @CustomType.Setter
        public Builder memoryLimit(Integer memoryLimit) {
            this.memoryLimit = Objects.requireNonNull(memoryLimit);
            return this;
        }
        @CustomType.Setter
        public Builder rootDevice(String rootDevice) {
            this.rootDevice = Objects.requireNonNull(rootDevice);
            return this;
        }
        @CustomType.Setter
        public Builder runLevel(String runLevel) {
            this.runLevel = Objects.requireNonNull(runLevel);
            return this;
        }
        @CustomType.Setter
        public Builder virtMode(String virtMode) {
            this.virtMode = Objects.requireNonNull(virtMode);
            return this;
        }
        public GetInstancesInstanceConfig build() {
            final var o = new GetInstancesInstanceConfig();
            o.comments = comments;
            o.devices = devices;
            o.helpers = helpers;
            o.interfaces = interfaces;
            o.kernel = kernel;
            o.label = label;
            o.memoryLimit = memoryLimit;
            o.rootDevice = rootDevice;
            o.runLevel = runLevel;
            o.virtMode = virtMode;
            return o;
        }
    }
}
