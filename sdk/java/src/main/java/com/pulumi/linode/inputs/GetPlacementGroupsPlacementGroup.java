// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.linode.inputs.GetPlacementGroupsPlacementGroupMember;
import com.pulumi.linode.inputs.GetPlacementGroupsPlacementGroupMigrations;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPlacementGroupsPlacementGroup extends com.pulumi.resources.InvokeArgs {

    public static final GetPlacementGroupsPlacementGroup Empty = new GetPlacementGroupsPlacementGroup();

    /**
     * The ID of the placement group.
     * 
     */
    @Import(name="id", required=true)
    private Integer id;

    /**
     * @return The ID of the placement group.
     * 
     */
    public Integer id() {
        return this.id;
    }

    /**
     * Whether this Linode is currently compliant with the group&#39;s placement group type.
     * 
     */
    @Import(name="isCompliant", required=true)
    private Boolean isCompliant;

    /**
     * @return Whether this Linode is currently compliant with the group&#39;s placement group type.
     * 
     */
    public Boolean isCompliant() {
        return this.isCompliant;
    }

    /**
     * The label of the Placement Group. This field can only contain ASCII letters, digits and dashes.
     * 
     */
    @Import(name="label", required=true)
    private String label;

    /**
     * @return The label of the Placement Group. This field can only contain ASCII letters, digits and dashes.
     * 
     */
    public String label() {
        return this.label;
    }

    /**
     * A set of Linodes currently assigned to this Placement Group.
     * 
     */
    @Import(name="members")
    private @Nullable List<GetPlacementGroupsPlacementGroupMember> members;

    /**
     * @return A set of Linodes currently assigned to this Placement Group.
     * 
     */
    public Optional<List<GetPlacementGroupsPlacementGroupMember>> members() {
        return Optional.ofNullable(this.members);
    }

    /**
     * Any Linodes that are being migrated to or from the placement group.
     * 
     */
    @Import(name="migrations")
    private @Nullable GetPlacementGroupsPlacementGroupMigrations migrations;

    /**
     * @return Any Linodes that are being migrated to or from the placement group.
     * 
     */
    public Optional<GetPlacementGroupsPlacementGroupMigrations> migrations() {
        return Optional.ofNullable(this.migrations);
    }

    /**
     * Whether Linodes must be able to become compliant during assignment. (Default `strict`)
     * 
     */
    @Import(name="placementGroupPolicy", required=true)
    private String placementGroupPolicy;

    /**
     * @return Whether Linodes must be able to become compliant during assignment. (Default `strict`)
     * 
     */
    public String placementGroupPolicy() {
        return this.placementGroupPolicy;
    }

    /**
     * The placement group type to use when placing Linodes in this group.
     * 
     */
    @Import(name="placementGroupType", required=true)
    private String placementGroupType;

    /**
     * @return The placement group type to use when placing Linodes in this group.
     * 
     */
    public String placementGroupType() {
        return this.placementGroupType;
    }

    /**
     * The region of the Placement Group.
     * 
     */
    @Import(name="region", required=true)
    private String region;

    /**
     * @return The region of the Placement Group.
     * 
     */
    public String region() {
        return this.region;
    }

    private GetPlacementGroupsPlacementGroup() {}

    private GetPlacementGroupsPlacementGroup(GetPlacementGroupsPlacementGroup $) {
        this.id = $.id;
        this.isCompliant = $.isCompliant;
        this.label = $.label;
        this.members = $.members;
        this.migrations = $.migrations;
        this.placementGroupPolicy = $.placementGroupPolicy;
        this.placementGroupType = $.placementGroupType;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPlacementGroupsPlacementGroup defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPlacementGroupsPlacementGroup $;

        public Builder() {
            $ = new GetPlacementGroupsPlacementGroup();
        }

        public Builder(GetPlacementGroupsPlacementGroup defaults) {
            $ = new GetPlacementGroupsPlacementGroup(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ID of the placement group.
         * 
         * @return builder
         * 
         */
        public Builder id(Integer id) {
            $.id = id;
            return this;
        }

        /**
         * @param isCompliant Whether this Linode is currently compliant with the group&#39;s placement group type.
         * 
         * @return builder
         * 
         */
        public Builder isCompliant(Boolean isCompliant) {
            $.isCompliant = isCompliant;
            return this;
        }

        /**
         * @param label The label of the Placement Group. This field can only contain ASCII letters, digits and dashes.
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            $.label = label;
            return this;
        }

        /**
         * @param members A set of Linodes currently assigned to this Placement Group.
         * 
         * @return builder
         * 
         */
        public Builder members(@Nullable List<GetPlacementGroupsPlacementGroupMember> members) {
            $.members = members;
            return this;
        }

        /**
         * @param members A set of Linodes currently assigned to this Placement Group.
         * 
         * @return builder
         * 
         */
        public Builder members(GetPlacementGroupsPlacementGroupMember... members) {
            return members(List.of(members));
        }

        /**
         * @param migrations Any Linodes that are being migrated to or from the placement group.
         * 
         * @return builder
         * 
         */
        public Builder migrations(@Nullable GetPlacementGroupsPlacementGroupMigrations migrations) {
            $.migrations = migrations;
            return this;
        }

        /**
         * @param placementGroupPolicy Whether Linodes must be able to become compliant during assignment. (Default `strict`)
         * 
         * @return builder
         * 
         */
        public Builder placementGroupPolicy(String placementGroupPolicy) {
            $.placementGroupPolicy = placementGroupPolicy;
            return this;
        }

        /**
         * @param placementGroupType The placement group type to use when placing Linodes in this group.
         * 
         * @return builder
         * 
         */
        public Builder placementGroupType(String placementGroupType) {
            $.placementGroupType = placementGroupType;
            return this;
        }

        /**
         * @param region The region of the Placement Group.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            $.region = region;
            return this;
        }

        public GetPlacementGroupsPlacementGroup build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetPlacementGroupsPlacementGroup", "id");
            }
            if ($.isCompliant == null) {
                throw new MissingRequiredPropertyException("GetPlacementGroupsPlacementGroup", "isCompliant");
            }
            if ($.label == null) {
                throw new MissingRequiredPropertyException("GetPlacementGroupsPlacementGroup", "label");
            }
            if ($.placementGroupPolicy == null) {
                throw new MissingRequiredPropertyException("GetPlacementGroupsPlacementGroup", "placementGroupPolicy");
            }
            if ($.placementGroupType == null) {
                throw new MissingRequiredPropertyException("GetPlacementGroupsPlacementGroup", "placementGroupType");
            }
            if ($.region == null) {
                throw new MissingRequiredPropertyException("GetPlacementGroupsPlacementGroup", "region");
            }
            return $;
        }
    }

}
