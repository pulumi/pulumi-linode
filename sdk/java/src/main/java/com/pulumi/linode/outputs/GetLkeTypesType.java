// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.linode.outputs.GetLkeTypesTypePrice;
import com.pulumi.linode.outputs.GetLkeTypesTypeRegionPrice;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetLkeTypesType {
    /**
     * @return The ID representing the Kubernetes type.
     * 
     */
    private String id;
    /**
     * @return The Kubernetes type label is for display purposes only.
     * 
     */
    private String label;
    /**
     * @return Cost in US dollars, broken down into hourly and monthly charges.
     * 
     */
    private List<GetLkeTypesTypePrice> prices;
    /**
     * @return A list of region-specific prices for this LKE Type.
     * 
     */
    private List<GetLkeTypesTypeRegionPrice> regionPrices;
    /**
     * @return The monthly outbound transfer amount, in MB.
     * 
     */
    private Integer transfer;

    private GetLkeTypesType() {}
    /**
     * @return The ID representing the Kubernetes type.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The Kubernetes type label is for display purposes only.
     * 
     */
    public String label() {
        return this.label;
    }
    /**
     * @return Cost in US dollars, broken down into hourly and monthly charges.
     * 
     */
    public List<GetLkeTypesTypePrice> prices() {
        return this.prices;
    }
    /**
     * @return A list of region-specific prices for this LKE Type.
     * 
     */
    public List<GetLkeTypesTypeRegionPrice> regionPrices() {
        return this.regionPrices;
    }
    /**
     * @return The monthly outbound transfer amount, in MB.
     * 
     */
    public Integer transfer() {
        return this.transfer;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLkeTypesType defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String label;
        private List<GetLkeTypesTypePrice> prices;
        private List<GetLkeTypesTypeRegionPrice> regionPrices;
        private Integer transfer;
        public Builder() {}
        public Builder(GetLkeTypesType defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.label = defaults.label;
    	      this.prices = defaults.prices;
    	      this.regionPrices = defaults.regionPrices;
    	      this.transfer = defaults.transfer;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetLkeTypesType", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder label(String label) {
            if (label == null) {
              throw new MissingRequiredPropertyException("GetLkeTypesType", "label");
            }
            this.label = label;
            return this;
        }
        @CustomType.Setter
        public Builder prices(List<GetLkeTypesTypePrice> prices) {
            if (prices == null) {
              throw new MissingRequiredPropertyException("GetLkeTypesType", "prices");
            }
            this.prices = prices;
            return this;
        }
        public Builder prices(GetLkeTypesTypePrice... prices) {
            return prices(List.of(prices));
        }
        @CustomType.Setter
        public Builder regionPrices(List<GetLkeTypesTypeRegionPrice> regionPrices) {
            if (regionPrices == null) {
              throw new MissingRequiredPropertyException("GetLkeTypesType", "regionPrices");
            }
            this.regionPrices = regionPrices;
            return this;
        }
        public Builder regionPrices(GetLkeTypesTypeRegionPrice... regionPrices) {
            return regionPrices(List.of(regionPrices));
        }
        @CustomType.Setter
        public Builder transfer(Integer transfer) {
            if (transfer == null) {
              throw new MissingRequiredPropertyException("GetLkeTypesType", "transfer");
            }
            this.transfer = transfer;
            return this;
        }
        public GetLkeTypesType build() {
            final var _resultValue = new GetLkeTypesType();
            _resultValue.id = id;
            _resultValue.label = label;
            _resultValue.prices = prices;
            _resultValue.regionPrices = regionPrices;
            _resultValue.transfer = transfer;
            return _resultValue;
        }
    }
}
