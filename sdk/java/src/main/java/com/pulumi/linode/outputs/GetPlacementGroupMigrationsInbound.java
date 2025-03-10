// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetPlacementGroupMigrationsInbound {
    /**
     * @return The ID of the Linode.
     * 
     */
    private Integer linodeId;

    private GetPlacementGroupMigrationsInbound() {}
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

    public static Builder builder(GetPlacementGroupMigrationsInbound defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer linodeId;
        public Builder() {}
        public Builder(GetPlacementGroupMigrationsInbound defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.linodeId = defaults.linodeId;
        }

        @CustomType.Setter
        public Builder linodeId(Integer linodeId) {
            if (linodeId == null) {
              throw new MissingRequiredPropertyException("GetPlacementGroupMigrationsInbound", "linodeId");
            }
            this.linodeId = linodeId;
            return this;
        }
        public GetPlacementGroupMigrationsInbound build() {
            final var _resultValue = new GetPlacementGroupMigrationsInbound();
            _resultValue.linodeId = linodeId;
            return _resultValue;
        }
    }
}
