// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Double;
import java.util.Objects;

@CustomType
public final class GetInstanceTypeAddonsBackupPrice {
    /**
     * @return Cost (in US dollars) per hour.
     * 
     */
    private Double hourly;
    /**
     * @return Cost (in US dollars) per month.
     * 
     */
    private Double monthly;

    private GetInstanceTypeAddonsBackupPrice() {}
    /**
     * @return Cost (in US dollars) per hour.
     * 
     */
    public Double hourly() {
        return this.hourly;
    }
    /**
     * @return Cost (in US dollars) per month.
     * 
     */
    public Double monthly() {
        return this.monthly;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceTypeAddonsBackupPrice defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Double hourly;
        private Double monthly;
        public Builder() {}
        public Builder(GetInstanceTypeAddonsBackupPrice defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hourly = defaults.hourly;
    	      this.monthly = defaults.monthly;
        }

        @CustomType.Setter
        public Builder hourly(Double hourly) {
            if (hourly == null) {
              throw new MissingRequiredPropertyException("GetInstanceTypeAddonsBackupPrice", "hourly");
            }
            this.hourly = hourly;
            return this;
        }
        @CustomType.Setter
        public Builder monthly(Double monthly) {
            if (monthly == null) {
              throw new MissingRequiredPropertyException("GetInstanceTypeAddonsBackupPrice", "monthly");
            }
            this.monthly = monthly;
            return this;
        }
        public GetInstanceTypeAddonsBackupPrice build() {
            final var _resultValue = new GetInstanceTypeAddonsBackupPrice();
            _resultValue.hourly = hourly;
            _resultValue.monthly = monthly;
            return _resultValue;
        }
    }
}
