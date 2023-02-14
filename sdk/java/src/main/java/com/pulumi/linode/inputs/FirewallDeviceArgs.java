// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FirewallDeviceArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirewallDeviceArgs Empty = new FirewallDeviceArgs();

    /**
     * The ID of the underlying entity this device references (i.e. the Linode&#39;s ID).
     * 
     */
    @Import(name="entityId")
    private @Nullable Output<Integer> entityId;

    /**
     * @return The ID of the underlying entity this device references (i.e. the Linode&#39;s ID).
     * 
     */
    public Optional<Output<Integer>> entityId() {
        return Optional.ofNullable(this.entityId);
    }

    /**
     * The ID of the Firewall Device.
     * 
     */
    @Import(name="id")
    private @Nullable Output<Integer> id;

    /**
     * @return The ID of the Firewall Device.
     * 
     */
    public Optional<Output<Integer>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * This Firewall&#39;s unique label.
     * 
     */
    @Import(name="label")
    private @Nullable Output<String> label;

    /**
     * @return This Firewall&#39;s unique label.
     * 
     */
    public Optional<Output<String>> label() {
        return Optional.ofNullable(this.label);
    }

    /**
     * The type of Firewall Device.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of Firewall Device.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * The URL of the underlying entity this device references.
     * 
     */
    @Import(name="url")
    private @Nullable Output<String> url;

    /**
     * @return The URL of the underlying entity this device references.
     * 
     */
    public Optional<Output<String>> url() {
        return Optional.ofNullable(this.url);
    }

    private FirewallDeviceArgs() {}

    private FirewallDeviceArgs(FirewallDeviceArgs $) {
        this.entityId = $.entityId;
        this.id = $.id;
        this.label = $.label;
        this.type = $.type;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirewallDeviceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirewallDeviceArgs $;

        public Builder() {
            $ = new FirewallDeviceArgs();
        }

        public Builder(FirewallDeviceArgs defaults) {
            $ = new FirewallDeviceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param entityId The ID of the underlying entity this device references (i.e. the Linode&#39;s ID).
         * 
         * @return builder
         * 
         */
        public Builder entityId(@Nullable Output<Integer> entityId) {
            $.entityId = entityId;
            return this;
        }

        /**
         * @param entityId The ID of the underlying entity this device references (i.e. the Linode&#39;s ID).
         * 
         * @return builder
         * 
         */
        public Builder entityId(Integer entityId) {
            return entityId(Output.of(entityId));
        }

        /**
         * @param id The ID of the Firewall Device.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<Integer> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of the Firewall Device.
         * 
         * @return builder
         * 
         */
        public Builder id(Integer id) {
            return id(Output.of(id));
        }

        /**
         * @param label This Firewall&#39;s unique label.
         * 
         * @return builder
         * 
         */
        public Builder label(@Nullable Output<String> label) {
            $.label = label;
            return this;
        }

        /**
         * @param label This Firewall&#39;s unique label.
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            return label(Output.of(label));
        }

        /**
         * @param type The type of Firewall Device.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of Firewall Device.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param url The URL of the underlying entity this device references.
         * 
         * @return builder
         * 
         */
        public Builder url(@Nullable Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url The URL of the underlying entity this device references.
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        public FirewallDeviceArgs build() {
            return $;
        }
    }

}
