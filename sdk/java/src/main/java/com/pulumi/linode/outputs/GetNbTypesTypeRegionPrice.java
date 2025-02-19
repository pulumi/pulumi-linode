// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetNbTypesTypeRegionPrice {
    private Double hourly;
    private String id;
    private Double monthly;

    private GetNbTypesTypeRegionPrice() {}
    public Double hourly() {
        return this.hourly;
    }
    public String id() {
        return this.id;
    }
    public Double monthly() {
        return this.monthly;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNbTypesTypeRegionPrice defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Double hourly;
        private String id;
        private Double monthly;
        public Builder() {}
        public Builder(GetNbTypesTypeRegionPrice defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hourly = defaults.hourly;
    	      this.id = defaults.id;
    	      this.monthly = defaults.monthly;
        }

        @CustomType.Setter
        public Builder hourly(Double hourly) {
            if (hourly == null) {
              throw new MissingRequiredPropertyException("GetNbTypesTypeRegionPrice", "hourly");
            }
            this.hourly = hourly;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetNbTypesTypeRegionPrice", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder monthly(Double monthly) {
            if (monthly == null) {
              throw new MissingRequiredPropertyException("GetNbTypesTypeRegionPrice", "monthly");
            }
            this.monthly = monthly;
            return this;
        }
        public GetNbTypesTypeRegionPrice build() {
            final var _resultValue = new GetNbTypesTypeRegionPrice();
            _resultValue.hourly = hourly;
            _resultValue.id = id;
            _resultValue.monthly = monthly;
            return _resultValue;
        }
    }
}
