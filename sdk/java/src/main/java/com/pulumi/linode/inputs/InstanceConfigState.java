// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.linode.inputs.InstanceConfigDevicesArgs;
import com.pulumi.linode.inputs.InstanceConfigHelperArgs;
import com.pulumi.linode.inputs.InstanceConfigInterfaceArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceConfigState extends com.pulumi.resources.ResourceArgs {

    public static final InstanceConfigState Empty = new InstanceConfigState();

    /**
     * If true, the Linode will be booted into this config. If another config is booted, the Linode will be rebooted into this config. If false, the Linode will be shutdown only if it is currently booted into this config. If undefined, the config will alter the boot status of the Linode.
     * 
     */
    @Import(name="booted")
    private @Nullable Output<Boolean> booted;

    /**
     * @return If true, the Linode will be booted into this config. If another config is booted, the Linode will be rebooted into this config. If false, the Linode will be shutdown only if it is currently booted into this config. If undefined, the config will alter the boot status of the Linode.
     * 
     */
    public Optional<Output<Boolean>> booted() {
        return Optional.ofNullable(this.booted);
    }

    /**
     * Optional field for arbitrary User comments on this Config.
     * 
     */
    @Import(name="comments")
    private @Nullable Output<String> comments;

    /**
     * @return Optional field for arbitrary User comments on this Config.
     * 
     */
    public Optional<Output<String>> comments() {
        return Optional.ofNullable(this.comments);
    }

    /**
     * A dictionary of device disks to use as a device map in a Linode’s configuration profile.
     * 
     */
    @Import(name="devices")
    private @Nullable Output<InstanceConfigDevicesArgs> devices;

    /**
     * @return A dictionary of device disks to use as a device map in a Linode’s configuration profile.
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
    private @Nullable Output<List<InstanceConfigHelperArgs>> helpers;

    /**
     * @return Helpers enabled when booting to this Linode Config.
     * 
     */
    public Optional<Output<List<InstanceConfigHelperArgs>>> helpers() {
        return Optional.ofNullable(this.helpers);
    }

    /**
     * An array of Network Interfaces to add to this Linode’s Configuration Profile.
     * 
     */
    @Import(name="interfaces")
    private @Nullable Output<List<InstanceConfigInterfaceArgs>> interfaces;

    /**
     * @return An array of Network Interfaces to add to this Linode’s Configuration Profile.
     * 
     */
    public Optional<Output<List<InstanceConfigInterfaceArgs>>> interfaces() {
        return Optional.ofNullable(this.interfaces);
    }

    /**
     * A Kernel ID to boot a Linode with. (default `linode/latest-64bit`)
     * 
     */
    @Import(name="kernel")
    private @Nullable Output<String> kernel;

    /**
     * @return A Kernel ID to boot a Linode with. (default `linode/latest-64bit`)
     * 
     */
    public Optional<Output<String>> kernel() {
        return Optional.ofNullable(this.kernel);
    }

    /**
     * The name of this interface.
     * 
     */
    @Import(name="label")
    private @Nullable Output<String> label;

    /**
     * @return The name of this interface.
     * 
     */
    public Optional<Output<String>> label() {
        return Optional.ofNullable(this.label);
    }

    /**
     * The ID of the Linode to create this configuration profile under.
     * 
     */
    @Import(name="linodeId")
    private @Nullable Output<Integer> linodeId;

    /**
     * @return The ID of the Linode to create this configuration profile under.
     * 
     */
    public Optional<Output<Integer>> linodeId() {
        return Optional.ofNullable(this.linodeId);
    }

    /**
     * The memory limit of the Config. Defaults to the total ram of the Linode.
     * 
     */
    @Import(name="memoryLimit")
    private @Nullable Output<Integer> memoryLimit;

    /**
     * @return The memory limit of the Config. Defaults to the total ram of the Linode.
     * 
     */
    public Optional<Output<Integer>> memoryLimit() {
        return Optional.ofNullable(this.memoryLimit);
    }

    /**
     * The root device to boot. (default `/dev/sda`)
     * 
     */
    @Import(name="rootDevice")
    private @Nullable Output<String> rootDevice;

    /**
     * @return The root device to boot. (default `/dev/sda`)
     * 
     */
    public Optional<Output<String>> rootDevice() {
        return Optional.ofNullable(this.rootDevice);
    }

    /**
     * Defines the state of your Linode after booting. (`default`, `single`, `binbash`)
     * 
     */
    @Import(name="runLevel")
    private @Nullable Output<String> runLevel;

    /**
     * @return Defines the state of your Linode after booting. (`default`, `single`, `binbash`)
     * 
     */
    public Optional<Output<String>> runLevel() {
        return Optional.ofNullable(this.runLevel);
    }

    /**
     * Controls the virtualization mode. (`paravirt`, `fullvirt`)
     * 
     */
    @Import(name="virtMode")
    private @Nullable Output<String> virtMode;

    /**
     * @return Controls the virtualization mode. (`paravirt`, `fullvirt`)
     * 
     */
    public Optional<Output<String>> virtMode() {
        return Optional.ofNullable(this.virtMode);
    }

    private InstanceConfigState() {}

    private InstanceConfigState(InstanceConfigState $) {
        this.booted = $.booted;
        this.comments = $.comments;
        this.devices = $.devices;
        this.helpers = $.helpers;
        this.interfaces = $.interfaces;
        this.kernel = $.kernel;
        this.label = $.label;
        this.linodeId = $.linodeId;
        this.memoryLimit = $.memoryLimit;
        this.rootDevice = $.rootDevice;
        this.runLevel = $.runLevel;
        this.virtMode = $.virtMode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceConfigState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceConfigState $;

        public Builder() {
            $ = new InstanceConfigState();
        }

        public Builder(InstanceConfigState defaults) {
            $ = new InstanceConfigState(Objects.requireNonNull(defaults));
        }

        /**
         * @param booted If true, the Linode will be booted into this config. If another config is booted, the Linode will be rebooted into this config. If false, the Linode will be shutdown only if it is currently booted into this config. If undefined, the config will alter the boot status of the Linode.
         * 
         * @return builder
         * 
         */
        public Builder booted(@Nullable Output<Boolean> booted) {
            $.booted = booted;
            return this;
        }

        /**
         * @param booted If true, the Linode will be booted into this config. If another config is booted, the Linode will be rebooted into this config. If false, the Linode will be shutdown only if it is currently booted into this config. If undefined, the config will alter the boot status of the Linode.
         * 
         * @return builder
         * 
         */
        public Builder booted(Boolean booted) {
            return booted(Output.of(booted));
        }

        /**
         * @param comments Optional field for arbitrary User comments on this Config.
         * 
         * @return builder
         * 
         */
        public Builder comments(@Nullable Output<String> comments) {
            $.comments = comments;
            return this;
        }

        /**
         * @param comments Optional field for arbitrary User comments on this Config.
         * 
         * @return builder
         * 
         */
        public Builder comments(String comments) {
            return comments(Output.of(comments));
        }

        /**
         * @param devices A dictionary of device disks to use as a device map in a Linode’s configuration profile.
         * 
         * @return builder
         * 
         */
        public Builder devices(@Nullable Output<InstanceConfigDevicesArgs> devices) {
            $.devices = devices;
            return this;
        }

        /**
         * @param devices A dictionary of device disks to use as a device map in a Linode’s configuration profile.
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
        public Builder helpers(@Nullable Output<List<InstanceConfigHelperArgs>> helpers) {
            $.helpers = helpers;
            return this;
        }

        /**
         * @param helpers Helpers enabled when booting to this Linode Config.
         * 
         * @return builder
         * 
         */
        public Builder helpers(List<InstanceConfigHelperArgs> helpers) {
            return helpers(Output.of(helpers));
        }

        /**
         * @param helpers Helpers enabled when booting to this Linode Config.
         * 
         * @return builder
         * 
         */
        public Builder helpers(InstanceConfigHelperArgs... helpers) {
            return helpers(List.of(helpers));
        }

        /**
         * @param interfaces An array of Network Interfaces to add to this Linode’s Configuration Profile.
         * 
         * @return builder
         * 
         */
        public Builder interfaces(@Nullable Output<List<InstanceConfigInterfaceArgs>> interfaces) {
            $.interfaces = interfaces;
            return this;
        }

        /**
         * @param interfaces An array of Network Interfaces to add to this Linode’s Configuration Profile.
         * 
         * @return builder
         * 
         */
        public Builder interfaces(List<InstanceConfigInterfaceArgs> interfaces) {
            return interfaces(Output.of(interfaces));
        }

        /**
         * @param interfaces An array of Network Interfaces to add to this Linode’s Configuration Profile.
         * 
         * @return builder
         * 
         */
        public Builder interfaces(InstanceConfigInterfaceArgs... interfaces) {
            return interfaces(List.of(interfaces));
        }

        /**
         * @param kernel A Kernel ID to boot a Linode with. (default `linode/latest-64bit`)
         * 
         * @return builder
         * 
         */
        public Builder kernel(@Nullable Output<String> kernel) {
            $.kernel = kernel;
            return this;
        }

        /**
         * @param kernel A Kernel ID to boot a Linode with. (default `linode/latest-64bit`)
         * 
         * @return builder
         * 
         */
        public Builder kernel(String kernel) {
            return kernel(Output.of(kernel));
        }

        /**
         * @param label The name of this interface.
         * 
         * @return builder
         * 
         */
        public Builder label(@Nullable Output<String> label) {
            $.label = label;
            return this;
        }

        /**
         * @param label The name of this interface.
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            return label(Output.of(label));
        }

        /**
         * @param linodeId The ID of the Linode to create this configuration profile under.
         * 
         * @return builder
         * 
         */
        public Builder linodeId(@Nullable Output<Integer> linodeId) {
            $.linodeId = linodeId;
            return this;
        }

        /**
         * @param linodeId The ID of the Linode to create this configuration profile under.
         * 
         * @return builder
         * 
         */
        public Builder linodeId(Integer linodeId) {
            return linodeId(Output.of(linodeId));
        }

        /**
         * @param memoryLimit The memory limit of the Config. Defaults to the total ram of the Linode.
         * 
         * @return builder
         * 
         */
        public Builder memoryLimit(@Nullable Output<Integer> memoryLimit) {
            $.memoryLimit = memoryLimit;
            return this;
        }

        /**
         * @param memoryLimit The memory limit of the Config. Defaults to the total ram of the Linode.
         * 
         * @return builder
         * 
         */
        public Builder memoryLimit(Integer memoryLimit) {
            return memoryLimit(Output.of(memoryLimit));
        }

        /**
         * @param rootDevice The root device to boot. (default `/dev/sda`)
         * 
         * @return builder
         * 
         */
        public Builder rootDevice(@Nullable Output<String> rootDevice) {
            $.rootDevice = rootDevice;
            return this;
        }

        /**
         * @param rootDevice The root device to boot. (default `/dev/sda`)
         * 
         * @return builder
         * 
         */
        public Builder rootDevice(String rootDevice) {
            return rootDevice(Output.of(rootDevice));
        }

        /**
         * @param runLevel Defines the state of your Linode after booting. (`default`, `single`, `binbash`)
         * 
         * @return builder
         * 
         */
        public Builder runLevel(@Nullable Output<String> runLevel) {
            $.runLevel = runLevel;
            return this;
        }

        /**
         * @param runLevel Defines the state of your Linode after booting. (`default`, `single`, `binbash`)
         * 
         * @return builder
         * 
         */
        public Builder runLevel(String runLevel) {
            return runLevel(Output.of(runLevel));
        }

        /**
         * @param virtMode Controls the virtualization mode. (`paravirt`, `fullvirt`)
         * 
         * @return builder
         * 
         */
        public Builder virtMode(@Nullable Output<String> virtMode) {
            $.virtMode = virtMode;
            return this;
        }

        /**
         * @param virtMode Controls the virtualization mode. (`paravirt`, `fullvirt`)
         * 
         * @return builder
         * 
         */
        public Builder virtMode(String virtMode) {
            return virtMode(Output.of(virtMode));
        }

        public InstanceConfigState build() {
            return $;
        }
    }

}
