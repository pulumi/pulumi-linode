// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class UserLongviewGrant {
    /**
     * @return The ID of the entity this grant applies to.
     * 
     */
    private Integer id;
    /**
     * @return The level of access this User has to this entity. If null, this User has no access.
     * 
     */
    private String permissions;

    private UserLongviewGrant() {}
    /**
     * @return The ID of the entity this grant applies to.
     * 
     */
    public Integer id() {
        return this.id;
    }
    /**
     * @return The level of access this User has to this entity. If null, this User has no access.
     * 
     */
    public String permissions() {
        return this.permissions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserLongviewGrant defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer id;
        private String permissions;
        public Builder() {}
        public Builder(UserLongviewGrant defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.permissions = defaults.permissions;
        }

        @CustomType.Setter
        public Builder id(Integer id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("UserLongviewGrant", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder permissions(String permissions) {
            if (permissions == null) {
              throw new MissingRequiredPropertyException("UserLongviewGrant", "permissions");
            }
            this.permissions = permissions;
            return this;
        }
        public UserLongviewGrant build() {
            final var _resultValue = new UserLongviewGrant();
            _resultValue.id = id;
            _resultValue.permissions = permissions;
            return _resultValue;
        }
    }
}
