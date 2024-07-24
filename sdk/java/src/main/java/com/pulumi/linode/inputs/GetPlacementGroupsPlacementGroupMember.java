// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;


public final class GetPlacementGroupsPlacementGroupMember extends com.pulumi.resources.InvokeArgs {

    public static final GetPlacementGroupsPlacementGroupMember Empty = new GetPlacementGroupsPlacementGroupMember();

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
     * The ID of the Linode.
     * 
     */
    @Import(name="linodeId", required=true)
    private Integer linodeId;

    /**
     * @return The ID of the Linode.
     * 
     */
    public Integer linodeId() {
        return this.linodeId;
    }

    private GetPlacementGroupsPlacementGroupMember() {}

    private GetPlacementGroupsPlacementGroupMember(GetPlacementGroupsPlacementGroupMember $) {
        this.isCompliant = $.isCompliant;
        this.linodeId = $.linodeId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPlacementGroupsPlacementGroupMember defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPlacementGroupsPlacementGroupMember $;

        public Builder() {
            $ = new GetPlacementGroupsPlacementGroupMember();
        }

        public Builder(GetPlacementGroupsPlacementGroupMember defaults) {
            $ = new GetPlacementGroupsPlacementGroupMember(Objects.requireNonNull(defaults));
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
         * @param linodeId The ID of the Linode.
         * 
         * @return builder
         * 
         */
        public Builder linodeId(Integer linodeId) {
            $.linodeId = linodeId;
            return this;
        }

        public GetPlacementGroupsPlacementGroupMember build() {
            if ($.isCompliant == null) {
                throw new MissingRequiredPropertyException("GetPlacementGroupsPlacementGroupMember", "isCompliant");
            }
            if ($.linodeId == null) {
                throw new MissingRequiredPropertyException("GetPlacementGroupsPlacementGroupMember", "linodeId");
            }
            return $;
        }
    }

}
