// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.linode.inputs.GetPlacementGroupsPlacementGroupMemberArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPlacementGroupsPlacementGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPlacementGroupsPlacementGroupArgs Empty = new GetPlacementGroupsPlacementGroupArgs();

    /**
     * The ID of the placement group.
     * 
     */
    @Import(name="id", required=true)
    private Output<Integer> id;

    /**
     * @return The ID of the placement group.
     * 
     */
    public Output<Integer> id() {
        return this.id;
    }

    /**
     * Whether this Linode is currently compliant with the group&#39;s placement group type.
     * 
     */
    @Import(name="isCompliant", required=true)
    private Output<Boolean> isCompliant;

    /**
     * @return Whether this Linode is currently compliant with the group&#39;s placement group type.
     * 
     */
    public Output<Boolean> isCompliant() {
        return this.isCompliant;
    }

    /**
     * The label of the Placement Group. This field can only contain ASCII letters, digits and dashes.
     * 
     */
    @Import(name="label", required=true)
    private Output<String> label;

    /**
     * @return The label of the Placement Group. This field can only contain ASCII letters, digits and dashes.
     * 
     */
    public Output<String> label() {
        return this.label;
    }

    /**
     * A set of Linodes currently assigned to this Placement Group.
     * 
     */
    @Import(name="members")
    private @Nullable Output<List<GetPlacementGroupsPlacementGroupMemberArgs>> members;

    /**
     * @return A set of Linodes currently assigned to this Placement Group.
     * 
     */
    public Optional<Output<List<GetPlacementGroupsPlacementGroupMemberArgs>>> members() {
        return Optional.ofNullable(this.members);
    }

    /**
     * Whether Linodes must be able to become compliant during assignment. (Default `strict`)
     * 
     */
    @Import(name="placementGroupPolicy", required=true)
    private Output<String> placementGroupPolicy;

    /**
     * @return Whether Linodes must be able to become compliant during assignment. (Default `strict`)
     * 
     */
    public Output<String> placementGroupPolicy() {
        return this.placementGroupPolicy;
    }

    /**
     * The placement group type to use when placing Linodes in this group.
     * 
     */
    @Import(name="placementGroupType", required=true)
    private Output<String> placementGroupType;

    /**
     * @return The placement group type to use when placing Linodes in this group.
     * 
     */
    public Output<String> placementGroupType() {
        return this.placementGroupType;
    }

    /**
     * The region of the Placement Group.
     * 
     */
    @Import(name="region", required=true)
    private Output<String> region;

    /**
     * @return The region of the Placement Group.
     * 
     */
    public Output<String> region() {
        return this.region;
    }

    private GetPlacementGroupsPlacementGroupArgs() {}

    private GetPlacementGroupsPlacementGroupArgs(GetPlacementGroupsPlacementGroupArgs $) {
        this.id = $.id;
        this.isCompliant = $.isCompliant;
        this.label = $.label;
        this.members = $.members;
        this.placementGroupPolicy = $.placementGroupPolicy;
        this.placementGroupType = $.placementGroupType;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPlacementGroupsPlacementGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPlacementGroupsPlacementGroupArgs $;

        public Builder() {
            $ = new GetPlacementGroupsPlacementGroupArgs();
        }

        public Builder(GetPlacementGroupsPlacementGroupArgs defaults) {
            $ = new GetPlacementGroupsPlacementGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ID of the placement group.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<Integer> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of the placement group.
         * 
         * @return builder
         * 
         */
        public Builder id(Integer id) {
            return id(Output.of(id));
        }

        /**
         * @param isCompliant Whether this Linode is currently compliant with the group&#39;s placement group type.
         * 
         * @return builder
         * 
         */
        public Builder isCompliant(Output<Boolean> isCompliant) {
            $.isCompliant = isCompliant;
            return this;
        }

        /**
         * @param isCompliant Whether this Linode is currently compliant with the group&#39;s placement group type.
         * 
         * @return builder
         * 
         */
        public Builder isCompliant(Boolean isCompliant) {
            return isCompliant(Output.of(isCompliant));
        }

        /**
         * @param label The label of the Placement Group. This field can only contain ASCII letters, digits and dashes.
         * 
         * @return builder
         * 
         */
        public Builder label(Output<String> label) {
            $.label = label;
            return this;
        }

        /**
         * @param label The label of the Placement Group. This field can only contain ASCII letters, digits and dashes.
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            return label(Output.of(label));
        }

        /**
         * @param members A set of Linodes currently assigned to this Placement Group.
         * 
         * @return builder
         * 
         */
        public Builder members(@Nullable Output<List<GetPlacementGroupsPlacementGroupMemberArgs>> members) {
            $.members = members;
            return this;
        }

        /**
         * @param members A set of Linodes currently assigned to this Placement Group.
         * 
         * @return builder
         * 
         */
        public Builder members(List<GetPlacementGroupsPlacementGroupMemberArgs> members) {
            return members(Output.of(members));
        }

        /**
         * @param members A set of Linodes currently assigned to this Placement Group.
         * 
         * @return builder
         * 
         */
        public Builder members(GetPlacementGroupsPlacementGroupMemberArgs... members) {
            return members(List.of(members));
        }

        /**
         * @param placementGroupPolicy Whether Linodes must be able to become compliant during assignment. (Default `strict`)
         * 
         * @return builder
         * 
         */
        public Builder placementGroupPolicy(Output<String> placementGroupPolicy) {
            $.placementGroupPolicy = placementGroupPolicy;
            return this;
        }

        /**
         * @param placementGroupPolicy Whether Linodes must be able to become compliant during assignment. (Default `strict`)
         * 
         * @return builder
         * 
         */
        public Builder placementGroupPolicy(String placementGroupPolicy) {
            return placementGroupPolicy(Output.of(placementGroupPolicy));
        }

        /**
         * @param placementGroupType The placement group type to use when placing Linodes in this group.
         * 
         * @return builder
         * 
         */
        public Builder placementGroupType(Output<String> placementGroupType) {
            $.placementGroupType = placementGroupType;
            return this;
        }

        /**
         * @param placementGroupType The placement group type to use when placing Linodes in this group.
         * 
         * @return builder
         * 
         */
        public Builder placementGroupType(String placementGroupType) {
            return placementGroupType(Output.of(placementGroupType));
        }

        /**
         * @param region The region of the Placement Group.
         * 
         * @return builder
         * 
         */
        public Builder region(Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The region of the Placement Group.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        public GetPlacementGroupsPlacementGroupArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetPlacementGroupsPlacementGroupArgs", "id");
            }
            if ($.isCompliant == null) {
                throw new MissingRequiredPropertyException("GetPlacementGroupsPlacementGroupArgs", "isCompliant");
            }
            if ($.label == null) {
                throw new MissingRequiredPropertyException("GetPlacementGroupsPlacementGroupArgs", "label");
            }
            if ($.placementGroupPolicy == null) {
                throw new MissingRequiredPropertyException("GetPlacementGroupsPlacementGroupArgs", "placementGroupPolicy");
            }
            if ($.placementGroupType == null) {
                throw new MissingRequiredPropertyException("GetPlacementGroupsPlacementGroupArgs", "placementGroupType");
            }
            if ($.region == null) {
                throw new MissingRequiredPropertyException("GetPlacementGroupsPlacementGroupArgs", "region");
            }
            return $;
        }
    }

}
