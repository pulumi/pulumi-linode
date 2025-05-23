// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetUserPlacementGroupGrant {
    /**
     * @return The ID of entity this grant applies to.
     * 
     */
    private Integer id;
    /**
     * @return The current label of the entity this grant applies to, for display purposes.
     * 
     */
    private String label;
    /**
     * @return The level of access this User has to this entity. If null, this User has no access. (`read_only`, `read_write`)
     * 
     */
    private String permissions;

    private GetUserPlacementGroupGrant() {}
    /**
     * @return The ID of entity this grant applies to.
     * 
     */
    public Integer id() {
        return this.id;
    }
    /**
     * @return The current label of the entity this grant applies to, for display purposes.
     * 
     */
    public String label() {
        return this.label;
    }
    /**
     * @return The level of access this User has to this entity. If null, this User has no access. (`read_only`, `read_write`)
     * 
     */
    public String permissions() {
        return this.permissions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserPlacementGroupGrant defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer id;
        private String label;
        private String permissions;
        public Builder() {}
        public Builder(GetUserPlacementGroupGrant defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.label = defaults.label;
    	      this.permissions = defaults.permissions;
        }

        @CustomType.Setter
        public Builder id(Integer id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetUserPlacementGroupGrant", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder label(String label) {
            if (label == null) {
              throw new MissingRequiredPropertyException("GetUserPlacementGroupGrant", "label");
            }
            this.label = label;
            return this;
        }
        @CustomType.Setter
        public Builder permissions(String permissions) {
            if (permissions == null) {
              throw new MissingRequiredPropertyException("GetUserPlacementGroupGrant", "permissions");
            }
            this.permissions = permissions;
            return this;
        }
        public GetUserPlacementGroupGrant build() {
            final var _resultValue = new GetUserPlacementGroupGrant();
            _resultValue.id = id;
            _resultValue.label = label;
            _resultValue.permissions = permissions;
            return _resultValue;
        }
    }
}
