// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetUserImageGrant extends com.pulumi.resources.InvokeArgs {

    public static final GetUserImageGrant Empty = new GetUserImageGrant();

    @Import(name="id", required=true)
    private Integer id;

    public Integer id() {
        return this.id;
    }

    @Import(name="permissions", required=true)
    private String permissions;

    public String permissions() {
        return this.permissions;
    }

    private GetUserImageGrant() {}

    private GetUserImageGrant(GetUserImageGrant $) {
        this.id = $.id;
        this.permissions = $.permissions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetUserImageGrant defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetUserImageGrant $;

        public Builder() {
            $ = new GetUserImageGrant();
        }

        public Builder(GetUserImageGrant defaults) {
            $ = new GetUserImageGrant(Objects.requireNonNull(defaults));
        }

        public Builder id(Integer id) {
            $.id = id;
            return this;
        }

        public Builder permissions(String permissions) {
            $.permissions = permissions;
            return this;
        }

        public GetUserImageGrant build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.permissions = Objects.requireNonNull($.permissions, "expected parameter 'permissions' to be non-null");
            return $;
        }
    }

}
