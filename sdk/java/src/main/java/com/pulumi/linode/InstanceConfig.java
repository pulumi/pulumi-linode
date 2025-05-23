// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.linode.InstanceConfigArgs;
import com.pulumi.linode.Utilities;
import com.pulumi.linode.inputs.InstanceConfigState;
import com.pulumi.linode.outputs.InstanceConfigDevice;
import com.pulumi.linode.outputs.InstanceConfigDevices;
import com.pulumi.linode.outputs.InstanceConfigHelper;
import com.pulumi.linode.outputs.InstanceConfigInterface;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * Creating a simple bootable Linode Instance Configuration Profile:
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * Creating a complex bootable Instance Configuration Profile with a VPC:
 * 
 * ## Import
 * 
 * Instance Configs can be imported using the `linode_id` followed by the Instance Config `id` separated by a comma, e.g.
 * 
 * ```sh
 * $ pulumi import linode:index/instanceConfig:InstanceConfig my-config 1234567,7654321
 * ```
 * 
 */
@ResourceType(type="linode:index/instanceConfig:InstanceConfig")
public class InstanceConfig extends com.pulumi.resources.CustomResource {
    /**
     * If true, the Linode will be booted into this config. If another config is booted, the Linode will be rebooted into this config. If false, the Linode will be shutdown only if it is currently booted into this config. If undefined, the config will alter the boot status of the Linode.
     * 
     */
    @Export(name="booted", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> booted;

    /**
     * @return If true, the Linode will be booted into this config. If another config is booted, the Linode will be rebooted into this config. If false, the Linode will be shutdown only if it is currently booted into this config. If undefined, the config will alter the boot status of the Linode.
     * 
     */
    public Output<Boolean> booted() {
        return this.booted;
    }
    /**
     * Optional field for arbitrary User comments on this Config.
     * 
     * * `devices` - (Optional) A dictionary of device disks to use as a device map in a Linode’s configuration profile.
     * 
     * * `helpers` - (Optional) Helpers enabled when booting to this Linode Config.
     * 
     * * `interface` - (Optional) An array of Network Interfaces to use for this Configuration Profile.
     * 
     */
    @Export(name="comments", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> comments;

    /**
     * @return Optional field for arbitrary User comments on this Config.
     * 
     * * `devices` - (Optional) A dictionary of device disks to use as a device map in a Linode’s configuration profile.
     * 
     * * `helpers` - (Optional) Helpers enabled when booting to this Linode Config.
     * 
     * * `interface` - (Optional) An array of Network Interfaces to use for this Configuration Profile.
     * 
     */
    public Output<Optional<String>> comments() {
        return Codegen.optional(this.comments);
    }
    /**
     * Blocks for device disks in a Linode&#39;s configuration profile.
     * 
     */
    @Export(name="device", refs={List.class,InstanceConfigDevice.class}, tree="[0,1]")
    private Output<List<InstanceConfigDevice>> device;

    /**
     * @return Blocks for device disks in a Linode&#39;s configuration profile.
     * 
     */
    public Output<List<InstanceConfigDevice>> device() {
        return this.device;
    }
    /**
     * A dictionary of device disks to use as a device map in a Linode&#39;s configuration profile.
     * 
     * @deprecated
     * Devices attribute is deprecated in favor of `device`.
     * 
     */
    @Deprecated /* Devices attribute is deprecated in favor of `device`. */
    @Export(name="devices", refs={InstanceConfigDevices.class}, tree="[0]")
    private Output<InstanceConfigDevices> devices;

    /**
     * @return A dictionary of device disks to use as a device map in a Linode&#39;s configuration profile.
     * 
     */
    public Output<InstanceConfigDevices> devices() {
        return this.devices;
    }
    /**
     * Helpers enabled when booting to this Linode Config.
     * 
     */
    @Export(name="helpers", refs={List.class,InstanceConfigHelper.class}, tree="[0,1]")
    private Output<List<InstanceConfigHelper>> helpers;

    /**
     * @return Helpers enabled when booting to this Linode Config.
     * 
     */
    public Output<List<InstanceConfigHelper>> helpers() {
        return this.helpers;
    }
    /**
     * An array of Network Interfaces to add to this Linode&#39;s Configuration Profile.
     * 
     */
    @Export(name="interfaces", refs={List.class,InstanceConfigInterface.class}, tree="[0,1]")
    private Output</* @Nullable */ List<InstanceConfigInterface>> interfaces;

    /**
     * @return An array of Network Interfaces to add to this Linode&#39;s Configuration Profile.
     * 
     */
    public Output<Optional<List<InstanceConfigInterface>>> interfaces() {
        return Codegen.optional(this.interfaces);
    }
    /**
     * A Kernel ID to boot a Linode with. Default is `linode/latest-64bit`. Examples are `linode/latest-64bit`, `linode/grub2`, `linode/direct-disk`, etc. See all kernels [here](https://api.linode.com/v4/linode/kernels). Note that this is a paginated API endpoint ([docs](https://techdocs.akamai.com/linode-api/reference/get-kernels)).
     * 
     */
    @Export(name="kernel", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> kernel;

    /**
     * @return A Kernel ID to boot a Linode with. Default is `linode/latest-64bit`. Examples are `linode/latest-64bit`, `linode/grub2`, `linode/direct-disk`, etc. See all kernels [here](https://api.linode.com/v4/linode/kernels). Note that this is a paginated API endpoint ([docs](https://techdocs.akamai.com/linode-api/reference/get-kernels)).
     * 
     */
    public Output<Optional<String>> kernel() {
        return Codegen.optional(this.kernel);
    }
    /**
     * The Config’s label for display purposes only.
     * 
     * ***
     * 
     */
    @Export(name="label", refs={String.class}, tree="[0]")
    private Output<String> label;

    /**
     * @return The Config’s label for display purposes only.
     * 
     * ***
     * 
     */
    public Output<String> label() {
        return this.label;
    }
    /**
     * The ID of the Linode to create this configuration profile under.
     * 
     */
    @Export(name="linodeId", refs={Integer.class}, tree="[0]")
    private Output<Integer> linodeId;

    /**
     * @return The ID of the Linode to create this configuration profile under.
     * 
     */
    public Output<Integer> linodeId() {
        return this.linodeId;
    }
    /**
     * The memory limit of the Config. Defaults to the total ram of the Linode.
     * 
     */
    @Export(name="memoryLimit", refs={Integer.class}, tree="[0]")
    private Output<Integer> memoryLimit;

    /**
     * @return The memory limit of the Config. Defaults to the total ram of the Linode.
     * 
     */
    public Output<Integer> memoryLimit() {
        return this.memoryLimit;
    }
    /**
     * The root device to boot. (default `/dev/sda`)
     * 
     */
    @Export(name="rootDevice", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> rootDevice;

    /**
     * @return The root device to boot. (default `/dev/sda`)
     * 
     */
    public Output<Optional<String>> rootDevice() {
        return Codegen.optional(this.rootDevice);
    }
    /**
     * Defines the state of your Linode after booting. (`default`, `single`, `binbash`)
     * 
     */
    @Export(name="runLevel", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> runLevel;

    /**
     * @return Defines the state of your Linode after booting. (`default`, `single`, `binbash`)
     * 
     */
    public Output<Optional<String>> runLevel() {
        return Codegen.optional(this.runLevel);
    }
    /**
     * Controls the virtualization mode. (`paravirt`, `fullvirt`)
     * 
     */
    @Export(name="virtMode", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> virtMode;

    /**
     * @return Controls the virtualization mode. (`paravirt`, `fullvirt`)
     * 
     */
    public Output<Optional<String>> virtMode() {
        return Codegen.optional(this.virtMode);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public InstanceConfig(java.lang.String name) {
        this(name, InstanceConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public InstanceConfig(java.lang.String name, InstanceConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public InstanceConfig(java.lang.String name, InstanceConfigArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("linode:index/instanceConfig:InstanceConfig", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private InstanceConfig(java.lang.String name, Output<java.lang.String> id, @Nullable InstanceConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("linode:index/instanceConfig:InstanceConfig", name, state, makeResourceOptions(options, id), false);
    }

    private static InstanceConfigArgs makeArgs(InstanceConfigArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? InstanceConfigArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static InstanceConfig get(java.lang.String name, Output<java.lang.String> id, @Nullable InstanceConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new InstanceConfig(name, id, state, options);
    }
}
