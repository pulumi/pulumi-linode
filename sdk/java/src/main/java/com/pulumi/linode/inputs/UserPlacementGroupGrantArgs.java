// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class UserPlacementGroupGrantArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserPlacementGroupGrantArgs Empty = new UserPlacementGroupGrantArgs();

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

    private UserPlacementGroupGrantArgs() {}

    private UserPlacementGroupGrantArgs(UserPlacementGroupGrantArgs $) {
        this.id = $.id;
        this.permissions = $.permissions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserPlacementGroupGrantArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserPlacementGroupGrantArgs $;

        public Builder() {
            $ = new UserPlacementGroupGrantArgs();
        }

        public Builder(UserPlacementGroupGrantArgs defaults) {
            $ = new UserPlacementGroupGrantArgs(Objects.requireNonNull(defaults));
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

        public UserPlacementGroupGrantArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("UserPlacementGroupGrantArgs", "id");
            }
            if ($.permissions == null) {
                throw new MissingRequiredPropertyException("UserPlacementGroupGrantArgs", "permissions");
            }
            return $;
        }
    }

}
