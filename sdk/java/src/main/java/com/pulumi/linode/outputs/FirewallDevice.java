// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FirewallDevice {
    /**
     * @return The ID of the underlying entity this device references (i.e. the Linode&#39;s ID).
     * 
     */
    private @Nullable Integer entityId;
    /**
     * @return The ID of the Firewall Device.
     * 
     */
    private @Nullable Integer id;
    /**
     * @return This Firewall&#39;s unique label.
     * 
     */
    private @Nullable String label;
    /**
     * @return The type of Firewall Device.
     * 
     */
    private @Nullable String type;
    /**
     * @return The URL of the underlying entity this device references.
     * 
     */
    private @Nullable String url;

    private FirewallDevice() {}
    /**
     * @return The ID of the underlying entity this device references (i.e. the Linode&#39;s ID).
     * 
     */
    public Optional<Integer> entityId() {
        return Optional.ofNullable(this.entityId);
    }
    /**
     * @return The ID of the Firewall Device.
     * 
     */
    public Optional<Integer> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return This Firewall&#39;s unique label.
     * 
     */
    public Optional<String> label() {
        return Optional.ofNullable(this.label);
    }
    /**
     * @return The type of Firewall Device.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    /**
     * @return The URL of the underlying entity this device references.
     * 
     */
    public Optional<String> url() {
        return Optional.ofNullable(this.url);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallDevice defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer entityId;
        private @Nullable Integer id;
        private @Nullable String label;
        private @Nullable String type;
        private @Nullable String url;
        public Builder() {}
        public Builder(FirewallDevice defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.entityId = defaults.entityId;
    	      this.id = defaults.id;
    	      this.label = defaults.label;
    	      this.type = defaults.type;
    	      this.url = defaults.url;
        }

        @CustomType.Setter
        public Builder entityId(@Nullable Integer entityId) {

            this.entityId = entityId;
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable Integer id) {

            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder label(@Nullable String label) {

            this.label = label;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder url(@Nullable String url) {

            this.url = url;
            return this;
        }
        public FirewallDevice build() {
            final var _resultValue = new FirewallDevice();
            _resultValue.entityId = entityId;
            _resultValue.id = id;
            _resultValue.label = label;
            _resultValue.type = type;
            _resultValue.url = url;
            return _resultValue;
        }
    }
}
