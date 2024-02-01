// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class UserDomainGrantArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserDomainGrantArgs Empty = new UserDomainGrantArgs();

    /**
     * The ID of the entity this grant applies to.
     * 
     */
    @Import(name="id", required=true)
    private Output<Integer> id;

    /**
     * @return The ID of the entity this grant applies to.
     * 
     */
    public Output<Integer> id() {
        return this.id;
    }

    /**
     * The level of access this User has to this entity. If null, this User has no access.
     * 
     */
    @Import(name="permissions", required=true)
    private Output<String> permissions;

    /**
     * @return The level of access this User has to this entity. If null, this User has no access.
     * 
     */
    public Output<String> permissions() {
        return this.permissions;
    }

    private UserDomainGrantArgs() {}

    private UserDomainGrantArgs(UserDomainGrantArgs $) {
        this.id = $.id;
        this.permissions = $.permissions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserDomainGrantArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserDomainGrantArgs $;

        public Builder() {
            $ = new UserDomainGrantArgs();
        }

        public Builder(UserDomainGrantArgs defaults) {
            $ = new UserDomainGrantArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ID of the entity this grant applies to.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<Integer> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of the entity this grant applies to.
         * 
         * @return builder
         * 
         */
        public Builder id(Integer id) {
            return id(Output.of(id));
        }

        /**
         * @param permissions The level of access this User has to this entity. If null, this User has no access.
         * 
         * @return builder
         * 
         */
        public Builder permissions(Output<String> permissions) {
            $.permissions = permissions;
            return this;
        }

        /**
         * @param permissions The level of access this User has to this entity. If null, this User has no access.
         * 
         * @return builder
         * 
         */
        public Builder permissions(String permissions) {
            return permissions(Output.of(permissions));
        }

        public UserDomainGrantArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("UserDomainGrantArgs", "id");
            }
            if ($.permissions == null) {
                throw new MissingRequiredPropertyException("UserDomainGrantArgs", "permissions");
            }
            return $;
        }
    }

}
