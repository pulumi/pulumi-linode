// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InstancePlacementGroup {
    private @Nullable Boolean compliantOnly;
    /**
     * @return The ID of the Placement Group.
     * 
     */
    private Integer id;
    /**
     * @return The Linode&#39;s label is for display purposes only. If no label is provided for a Linode, a default will be assigned.
     * 
     */
    private @Nullable String label;
    /**
     * @return Whether the Placement Group enforces strict compliance.
     * 
     */
    private @Nullable String placementGroupPolicy;
    /**
     * @return The placement group type enforced by the Placement Group.
     * 
     */
    private @Nullable String placementGroupType;

    private InstancePlacementGroup() {}
    public Optional<Boolean> compliantOnly() {
        return Optional.ofNullable(this.compliantOnly);
    }
    /**
     * @return The ID of the Placement Group.
     * 
     */
    public Integer id() {
        return this.id;
    }
    /**
     * @return The Linode&#39;s label is for display purposes only. If no label is provided for a Linode, a default will be assigned.
     * 
     */
    public Optional<String> label() {
        return Optional.ofNullable(this.label);
    }
    /**
     * @return Whether the Placement Group enforces strict compliance.
     * 
     */
    public Optional<String> placementGroupPolicy() {
        return Optional.ofNullable(this.placementGroupPolicy);
    }
    /**
     * @return The placement group type enforced by the Placement Group.
     * 
     */
    public Optional<String> placementGroupType() {
        return Optional.ofNullable(this.placementGroupType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstancePlacementGroup defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean compliantOnly;
        private Integer id;
        private @Nullable String label;
        private @Nullable String placementGroupPolicy;
        private @Nullable String placementGroupType;
        public Builder() {}
        public Builder(InstancePlacementGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compliantOnly = defaults.compliantOnly;
    	      this.id = defaults.id;
    	      this.label = defaults.label;
    	      this.placementGroupPolicy = defaults.placementGroupPolicy;
    	      this.placementGroupType = defaults.placementGroupType;
        }

        @CustomType.Setter
        public Builder compliantOnly(@Nullable Boolean compliantOnly) {

            this.compliantOnly = compliantOnly;
            return this;
        }
        @CustomType.Setter
        public Builder id(Integer id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("InstancePlacementGroup", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder label(@Nullable String label) {

            this.label = label;
            return this;
        }
        @CustomType.Setter
        public Builder placementGroupPolicy(@Nullable String placementGroupPolicy) {

            this.placementGroupPolicy = placementGroupPolicy;
            return this;
        }
        @CustomType.Setter
        public Builder placementGroupType(@Nullable String placementGroupType) {

            this.placementGroupType = placementGroupType;
            return this;
        }
        public InstancePlacementGroup build() {
            final var _resultValue = new InstancePlacementGroup();
            _resultValue.compliantOnly = compliantOnly;
            _resultValue.id = id;
            _resultValue.label = label;
            _resultValue.placementGroupPolicy = placementGroupPolicy;
            _resultValue.placementGroupType = placementGroupType;
            return _resultValue;
        }
    }
}
