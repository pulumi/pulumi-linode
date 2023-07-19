// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetUsersUserImageGrant extends com.pulumi.resources.InvokeArgs {

    public static final GetUsersUserImageGrant Empty = new GetUsersUserImageGrant();

    /**
     * The ID of entity this grant applies to.
     * 
     */
    @Import(name="id", required=true)
    private Integer id;

    /**
     * @return The ID of entity this grant applies to.
     * 
     */
    public Integer id() {
        return this.id;
    }

    /**
     * The current label of the entity this grant applies to, for display purposes.
     * 
     */
    @Import(name="label", required=true)
    private String label;

    /**
     * @return The current label of the entity this grant applies to, for display purposes.
     * 
     */
    public String label() {
        return this.label;
    }

    /**
     * The level of access this User has to this entity. If null, this User has no access.
     * 
     */
    @Import(name="permissions", required=true)
    private String permissions;

    /**
     * @return The level of access this User has to this entity. If null, this User has no access.
     * 
     */
    public String permissions() {
        return this.permissions;
    }

    private GetUsersUserImageGrant() {}

    private GetUsersUserImageGrant(GetUsersUserImageGrant $) {
        this.id = $.id;
        this.label = $.label;
        this.permissions = $.permissions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetUsersUserImageGrant defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetUsersUserImageGrant $;

        public Builder() {
            $ = new GetUsersUserImageGrant();
        }

        public Builder(GetUsersUserImageGrant defaults) {
            $ = new GetUsersUserImageGrant(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ID of entity this grant applies to.
         * 
         * @return builder
         * 
         */
        public Builder id(Integer id) {
            $.id = id;
            return this;
        }

        /**
         * @param label The current label of the entity this grant applies to, for display purposes.
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            $.label = label;
            return this;
        }

        /**
         * @param permissions The level of access this User has to this entity. If null, this User has no access.
         * 
         * @return builder
         * 
         */
        public Builder permissions(String permissions) {
            $.permissions = permissions;
            return this;
        }

        public GetUsersUserImageGrant build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.label = Objects.requireNonNull($.label, "expected parameter 'label' to be non-null");
            $.permissions = Objects.requireNonNull($.permissions, "expected parameter 'permissions' to be non-null");
            return $;
        }
    }

}
