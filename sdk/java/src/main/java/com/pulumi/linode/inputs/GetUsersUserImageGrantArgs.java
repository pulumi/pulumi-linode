// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetUsersUserImageGrantArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetUsersUserImageGrantArgs Empty = new GetUsersUserImageGrantArgs();

    /**
     * The ID of entity this grant applies to.
     * 
     */
    @Import(name="id", required=true)
    private Output<Integer> id;

    /**
     * @return The ID of entity this grant applies to.
     * 
     */
    public Output<Integer> id() {
        return this.id;
    }

    /**
     * The current label of the entity this grant applies to, for display purposes.
     * 
     */
    @Import(name="label", required=true)
    private Output<String> label;

    /**
     * @return The current label of the entity this grant applies to, for display purposes.
     * 
     */
    public Output<String> label() {
        return this.label;
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

    private GetUsersUserImageGrantArgs() {}

    private GetUsersUserImageGrantArgs(GetUsersUserImageGrantArgs $) {
        this.id = $.id;
        this.label = $.label;
        this.permissions = $.permissions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetUsersUserImageGrantArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetUsersUserImageGrantArgs $;

        public Builder() {
            $ = new GetUsersUserImageGrantArgs();
        }

        public Builder(GetUsersUserImageGrantArgs defaults) {
            $ = new GetUsersUserImageGrantArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ID of entity this grant applies to.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<Integer> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of entity this grant applies to.
         * 
         * @return builder
         * 
         */
        public Builder id(Integer id) {
            return id(Output.of(id));
        }

        /**
         * @param label The current label of the entity this grant applies to, for display purposes.
         * 
         * @return builder
         * 
         */
        public Builder label(Output<String> label) {
            $.label = label;
            return this;
        }

        /**
         * @param label The current label of the entity this grant applies to, for display purposes.
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            return label(Output.of(label));
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

        public GetUsersUserImageGrantArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetUsersUserImageGrantArgs", "id");
            }
            if ($.label == null) {
                throw new MissingRequiredPropertyException("GetUsersUserImageGrantArgs", "label");
            }
            if ($.permissions == null) {
                throw new MissingRequiredPropertyException("GetUsersUserImageGrantArgs", "permissions");
            }
            return $;
        }
    }

}
