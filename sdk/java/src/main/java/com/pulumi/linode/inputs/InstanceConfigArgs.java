// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.linode.inputs.InstanceConfigDevicesArgs;
import com.pulumi.linode.inputs.InstanceConfigHelpersArgs;
import com.pulumi.linode.inputs.InstanceConfigInterfaceArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceConfigArgs Empty = new InstanceConfigArgs();

    /**
     * Arbitrary user comments about this `config`.
     * 
     */
    @Import(name="comments")
    private @Nullable Output<String> comments;

    /**
     * @return Arbitrary user comments about this `config`.
     * 
     */
    public Optional<Output<String>> comments() {
        return Optional.ofNullable(this.comments);
    }

    /**
     * A list of `disk` or `volume` attachments for this `config`.  If the `boot_config_label` omits a `devices` block, the Linode will not be booted.
     * 
     */
    @Import(name="devices")
    private @Nullable Output<InstanceConfigDevicesArgs> devices;

    /**
     * @return A list of `disk` or `volume` attachments for this `config`.  If the `boot_config_label` omits a `devices` block, the Linode will not be booted.
     * 
     */
    public Optional<Output<InstanceConfigDevicesArgs>> devices() {
        return Optional.ofNullable(this.devices);
    }

    /**
     * Helpers enabled when booting to this Linode Config.
     * 
     */
    @Import(name="helpers")
    private @Nullable Output<InstanceConfigHelpersArgs> helpers;

    /**
     * @return Helpers enabled when booting to this Linode Config.
     * 
     */
    public Optional<Output<InstanceConfigHelpersArgs>> helpers() {
        return Optional.ofNullable(this.helpers);
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
     * An array of Network Interfaces for this Linode’s Configuration Profile.
     * 
     */
    @Import(name="interfaces")
    private @Nullable Output<List<InstanceConfigInterfaceArgs>> interfaces;

    /**
     * @return An array of Network Interfaces for this Linode’s Configuration Profile.
     * 
     */
    public Optional<Output<List<InstanceConfigInterfaceArgs>>> interfaces() {
        return Optional.ofNullable(this.interfaces);
    }

    /**
     * A Kernel ID to boot a Linode with. Default is based on image choice. Examples are `linode/latest-64bit`, `linode/grub2`, `linode/direct-disk`, etc. See all kernels [here](https://api.linode.com/v4/linode/kernels). Note that this is a paginated API endpoint ([docs](https://developers.linode.com/api/v4/linode-kernels)).
     * 
     */
    @Import(name="kernel")
    private @Nullable Output<String> kernel;

    /**
     * @return A Kernel ID to boot a Linode with. Default is based on image choice. Examples are `linode/latest-64bit`, `linode/grub2`, `linode/direct-disk`, etc. See all kernels [here](https://api.linode.com/v4/linode/kernels). Note that this is a paginated API endpoint ([docs](https://developers.linode.com/api/v4/linode-kernels)).
     * 
     */
    public Optional<Output<String>> kernel() {
        return Optional.ofNullable(this.kernel);
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
     * Defaults to the total RAM of the Linode
     * 
     * * `interface` - (Optional) A list of network interfaces to be assigned to the Linode.
     * 
     */
    @Import(name="memoryLimit")
    private @Nullable Output<Integer> memoryLimit;

    /**
     * @return Defaults to the total RAM of the Linode
     * 
     * * `interface` - (Optional) A list of network interfaces to be assigned to the Linode.
     * 
     */
    public Optional<Output<Integer>> memoryLimit() {
        return Optional.ofNullable(this.memoryLimit);
    }

    /**
     * The root device to boot. The corresponding disk must be attached to a `device` slot.  Example: `&#34;/dev/sda&#34;`
     * 
     */
    @Import(name="rootDevice")
    private @Nullable Output<String> rootDevice;

    /**
     * @return The root device to boot. The corresponding disk must be attached to a `device` slot.  Example: `&#34;/dev/sda&#34;`
     * 
     */
    public Optional<Output<String>> rootDevice() {
        return Optional.ofNullable(this.rootDevice);
    }

    /**
     * Defines the state of your Linode after booting. Defaults to `&#34;default&#34;`.
     * 
     */
    @Import(name="runLevel")
    private @Nullable Output<String> runLevel;

    /**
     * @return Defines the state of your Linode after booting. Defaults to `&#34;default&#34;`.
     * 
     */
    public Optional<Output<String>> runLevel() {
        return Optional.ofNullable(this.runLevel);
    }

    /**
     * Controls the virtualization mode. Defaults to `&#34;paravirt&#34;`.
     * 
     */
    @Import(name="virtMode")
    private @Nullable Output<String> virtMode;

    /**
     * @return Controls the virtualization mode. Defaults to `&#34;paravirt&#34;`.
     * 
     */
    public Optional<Output<String>> virtMode() {
        return Optional.ofNullable(this.virtMode);
    }

    private InstanceConfigArgs() {}

    private InstanceConfigArgs(InstanceConfigArgs $) {
        this.comments = $.comments;
        this.devices = $.devices;
        this.helpers = $.helpers;
        this.id = $.id;
        this.interfaces = $.interfaces;
        this.kernel = $.kernel;
        this.label = $.label;
        this.memoryLimit = $.memoryLimit;
        this.rootDevice = $.rootDevice;
        this.runLevel = $.runLevel;
        this.virtMode = $.virtMode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceConfigArgs $;

        public Builder() {
            $ = new InstanceConfigArgs();
        }

        public Builder(InstanceConfigArgs defaults) {
            $ = new InstanceConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param comments Arbitrary user comments about this `config`.
         * 
         * @return builder
         * 
         */
        public Builder comments(@Nullable Output<String> comments) {
            $.comments = comments;
            return this;
        }

        /**
         * @param comments Arbitrary user comments about this `config`.
         * 
         * @return builder
         * 
         */
        public Builder comments(String comments) {
            return comments(Output.of(comments));
        }

        /**
         * @param devices A list of `disk` or `volume` attachments for this `config`.  If the `boot_config_label` omits a `devices` block, the Linode will not be booted.
         * 
         * @return builder
         * 
         */
        public Builder devices(@Nullable Output<InstanceConfigDevicesArgs> devices) {
            $.devices = devices;
            return this;
        }

        /**
         * @param devices A list of `disk` or `volume` attachments for this `config`.  If the `boot_config_label` omits a `devices` block, the Linode will not be booted.
         * 
         * @return builder
         * 
         */
        public Builder devices(InstanceConfigDevicesArgs devices) {
            return devices(Output.of(devices));
        }

        /**
         * @param helpers Helpers enabled when booting to this Linode Config.
         * 
         * @return builder
         * 
         */
        public Builder helpers(@Nullable Output<InstanceConfigHelpersArgs> helpers) {
            $.helpers = helpers;
            return this;
        }

        /**
         * @param helpers Helpers enabled when booting to this Linode Config.
         * 
         * @return builder
         * 
         */
        public Builder helpers(InstanceConfigHelpersArgs helpers) {
            return helpers(Output.of(helpers));
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
         * @param interfaces An array of Network Interfaces for this Linode’s Configuration Profile.
         * 
         * @return builder
         * 
         */
        public Builder interfaces(@Nullable Output<List<InstanceConfigInterfaceArgs>> interfaces) {
            $.interfaces = interfaces;
            return this;
        }

        /**
         * @param interfaces An array of Network Interfaces for this Linode’s Configuration Profile.
         * 
         * @return builder
         * 
         */
        public Builder interfaces(List<InstanceConfigInterfaceArgs> interfaces) {
            return interfaces(Output.of(interfaces));
        }

        /**
         * @param interfaces An array of Network Interfaces for this Linode’s Configuration Profile.
         * 
         * @return builder
         * 
         */
        public Builder interfaces(InstanceConfigInterfaceArgs... interfaces) {
            return interfaces(List.of(interfaces));
        }

        /**
         * @param kernel A Kernel ID to boot a Linode with. Default is based on image choice. Examples are `linode/latest-64bit`, `linode/grub2`, `linode/direct-disk`, etc. See all kernels [here](https://api.linode.com/v4/linode/kernels). Note that this is a paginated API endpoint ([docs](https://developers.linode.com/api/v4/linode-kernels)).
         * 
         * @return builder
         * 
         */
        public Builder kernel(@Nullable Output<String> kernel) {
            $.kernel = kernel;
            return this;
        }

        /**
         * @param kernel A Kernel ID to boot a Linode with. Default is based on image choice. Examples are `linode/latest-64bit`, `linode/grub2`, `linode/direct-disk`, etc. See all kernels [here](https://api.linode.com/v4/linode/kernels). Note that this is a paginated API endpoint ([docs](https://developers.linode.com/api/v4/linode-kernels)).
         * 
         * @return builder
         * 
         */
        public Builder kernel(String kernel) {
            return kernel(Output.of(kernel));
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
         * @param memoryLimit Defaults to the total RAM of the Linode
         * 
         * * `interface` - (Optional) A list of network interfaces to be assigned to the Linode.
         * 
         * @return builder
         * 
         */
        public Builder memoryLimit(@Nullable Output<Integer> memoryLimit) {
            $.memoryLimit = memoryLimit;
            return this;
        }

        /**
         * @param memoryLimit Defaults to the total RAM of the Linode
         * 
         * * `interface` - (Optional) A list of network interfaces to be assigned to the Linode.
         * 
         * @return builder
         * 
         */
        public Builder memoryLimit(Integer memoryLimit) {
            return memoryLimit(Output.of(memoryLimit));
        }

        /**
         * @param rootDevice The root device to boot. The corresponding disk must be attached to a `device` slot.  Example: `&#34;/dev/sda&#34;`
         * 
         * @return builder
         * 
         */
        public Builder rootDevice(@Nullable Output<String> rootDevice) {
            $.rootDevice = rootDevice;
            return this;
        }

        /**
         * @param rootDevice The root device to boot. The corresponding disk must be attached to a `device` slot.  Example: `&#34;/dev/sda&#34;`
         * 
         * @return builder
         * 
         */
        public Builder rootDevice(String rootDevice) {
            return rootDevice(Output.of(rootDevice));
        }

        /**
         * @param runLevel Defines the state of your Linode after booting. Defaults to `&#34;default&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder runLevel(@Nullable Output<String> runLevel) {
            $.runLevel = runLevel;
            return this;
        }

        /**
         * @param runLevel Defines the state of your Linode after booting. Defaults to `&#34;default&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder runLevel(String runLevel) {
            return runLevel(Output.of(runLevel));
        }

        /**
         * @param virtMode Controls the virtualization mode. Defaults to `&#34;paravirt&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder virtMode(@Nullable Output<String> virtMode) {
            $.virtMode = virtMode;
            return this;
        }

        /**
         * @param virtMode Controls the virtualization mode. Defaults to `&#34;paravirt&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder virtMode(String virtMode) {
            return virtMode(Output.of(virtMode));
        }

        public InstanceConfigArgs build() {
            if ($.label == null) {
                throw new MissingRequiredPropertyException("InstanceConfigArgs", "label");
            }
            return $;
        }
    }

}
