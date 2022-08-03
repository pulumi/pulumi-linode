// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class UserLinodeGrant {
    private final Integer id;
    private final String permissions;

    @CustomType.Constructor
    private UserLinodeGrant(
        @CustomType.Parameter("id") Integer id,
        @CustomType.Parameter("permissions") String permissions) {
        this.id = id;
        this.permissions = permissions;
    }

    public Integer id() {
        return this.id;
    }
    public String permissions() {
        return this.permissions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserLinodeGrant defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer id;
        private String permissions;

        public Builder() {
    	      // Empty
        }

        public Builder(UserLinodeGrant defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.permissions = defaults.permissions;
        }

        public Builder id(Integer id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder permissions(String permissions) {
            this.permissions = Objects.requireNonNull(permissions);
            return this;
        }        public UserLinodeGrant build() {
            return new UserLinodeGrant(id, permissions);
        }
    }
}
