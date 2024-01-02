// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetUserDatabaseGrant extends com.pulumi.resources.InvokeArgs {

    public static final GetUserDatabaseGrant Empty = new GetUserDatabaseGrant();

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
     * The level of access this User has to this entity. If null, this User has no access. (`read_only`, `read_write`)
     * 
     */
    @Import(name="permissions", required=true)
    private String permissions;

    /**
     * @return The level of access this User has to this entity. If null, this User has no access. (`read_only`, `read_write`)
     * 
     */
    public String permissions() {
        return this.permissions;
    }

    private GetUserDatabaseGrant() {}

    private GetUserDatabaseGrant(GetUserDatabaseGrant $) {
        this.id = $.id;
        this.label = $.label;
        this.permissions = $.permissions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetUserDatabaseGrant defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetUserDatabaseGrant $;

        public Builder() {
            $ = new GetUserDatabaseGrant();
        }

        public Builder(GetUserDatabaseGrant defaults) {
            $ = new GetUserDatabaseGrant(Objects.requireNonNull(defaults));
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
         * @param permissions The level of access this User has to this entity. If null, this User has no access. (`read_only`, `read_write`)
         * 
         * @return builder
         * 
         */
        public Builder permissions(String permissions) {
            $.permissions = permissions;
            return this;
        }

        public GetUserDatabaseGrant build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetUserDatabaseGrant", "id");
            }
            if ($.label == null) {
                throw new MissingRequiredPropertyException("GetUserDatabaseGrant", "label");
            }
            if ($.permissions == null) {
                throw new MissingRequiredPropertyException("GetUserDatabaseGrant", "permissions");
            }
            return $;
        }
    }

}
