// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetLkeVersionResult {
    /**
     * @return The Kubernetes version numbers available for deployment to a Kubernetes cluster in the format of [major].[minor], and the latest supported patch version.
     * 
     */
    private String id;
    /**
     * @return The Kubernetes version tier. Only exported if `tier` was provided when using the datasource.
     * 
     */
    private String tier;

    private GetLkeVersionResult() {}
    /**
     * @return The Kubernetes version numbers available for deployment to a Kubernetes cluster in the format of [major].[minor], and the latest supported patch version.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The Kubernetes version tier. Only exported if `tier` was provided when using the datasource.
     * 
     */
    public String tier() {
        return this.tier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLkeVersionResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String tier;
        public Builder() {}
        public Builder(GetLkeVersionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.tier = defaults.tier;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetLkeVersionResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder tier(String tier) {
            if (tier == null) {
              throw new MissingRequiredPropertyException("GetLkeVersionResult", "tier");
            }
            this.tier = tier;
            return this;
        }
        public GetLkeVersionResult build() {
            final var _resultValue = new GetLkeVersionResult();
            _resultValue.id = id;
            _resultValue.tier = tier;
            return _resultValue;
        }
    }
}
