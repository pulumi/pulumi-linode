// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetPlacementGroupsPlacementGroupMember {
    /**
     * @return Whether this Linode is currently compliant with the group&#39;s placement group type.
     * 
     */
    private Boolean isCompliant;
    /**
     * @return The ID of the Linode.
     * 
     */
    private Integer linodeId;

    private GetPlacementGroupsPlacementGroupMember() {}
    /**
     * @return Whether this Linode is currently compliant with the group&#39;s placement group type.
     * 
     */
    public Boolean isCompliant() {
        return this.isCompliant;
    }
    /**
     * @return The ID of the Linode.
     * 
     */
    public Integer linodeId() {
        return this.linodeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPlacementGroupsPlacementGroupMember defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean isCompliant;
        private Integer linodeId;
        public Builder() {}
        public Builder(GetPlacementGroupsPlacementGroupMember defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isCompliant = defaults.isCompliant;
    	      this.linodeId = defaults.linodeId;
        }

        @CustomType.Setter
        public Builder isCompliant(Boolean isCompliant) {
            if (isCompliant == null) {
              throw new MissingRequiredPropertyException("GetPlacementGroupsPlacementGroupMember", "isCompliant");
            }
            this.isCompliant = isCompliant;
            return this;
        }
        @CustomType.Setter
        public Builder linodeId(Integer linodeId) {
            if (linodeId == null) {
              throw new MissingRequiredPropertyException("GetPlacementGroupsPlacementGroupMember", "linodeId");
            }
            this.linodeId = linodeId;
            return this;
        }
        public GetPlacementGroupsPlacementGroupMember build() {
            final var _resultValue = new GetPlacementGroupsPlacementGroupMember();
            _resultValue.isCompliant = isCompliant;
            _resultValue.linodeId = linodeId;
            return _resultValue;
        }
    }
}
