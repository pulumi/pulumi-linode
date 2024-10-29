// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.linode.outputs.GetNetworkTransferPricesTypePrice;
import com.pulumi.linode.outputs.GetNetworkTransferPricesTypeRegionPrice;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetNetworkTransferPricesType {
    /**
     * @return The unique ID assigned to this Network Transfer Price.
     * 
     */
    private String id;
    /**
     * @return The Network Transfer Price&#39;s label.
     * 
     */
    private String label;
    /**
     * @return Cost in US dollars, broken down into hourly and monthly charges.
     * 
     */
    private List<GetNetworkTransferPricesTypePrice> prices;
    /**
     * @return A list of region-specific prices for this Network Transfer Price.
     * 
     */
    private List<GetNetworkTransferPricesTypeRegionPrice> regionPrices;
    /**
     * @return The monthly outbound transfer amount, in MB.
     * 
     */
    private Integer transfer;

    private GetNetworkTransferPricesType() {}
    /**
     * @return The unique ID assigned to this Network Transfer Price.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The Network Transfer Price&#39;s label.
     * 
     */
    public String label() {
        return this.label;
    }
    /**
     * @return Cost in US dollars, broken down into hourly and monthly charges.
     * 
     */
    public List<GetNetworkTransferPricesTypePrice> prices() {
        return this.prices;
    }
    /**
     * @return A list of region-specific prices for this Network Transfer Price.
     * 
     */
    public List<GetNetworkTransferPricesTypeRegionPrice> regionPrices() {
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

    public static Builder builder(GetNetworkTransferPricesType defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String label;
        private List<GetNetworkTransferPricesTypePrice> prices;
        private List<GetNetworkTransferPricesTypeRegionPrice> regionPrices;
        private Integer transfer;
        public Builder() {}
        public Builder(GetNetworkTransferPricesType defaults) {
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
              throw new MissingRequiredPropertyException("GetNetworkTransferPricesType", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder label(String label) {
            if (label == null) {
              throw new MissingRequiredPropertyException("GetNetworkTransferPricesType", "label");
            }
            this.label = label;
            return this;
        }
        @CustomType.Setter
        public Builder prices(List<GetNetworkTransferPricesTypePrice> prices) {
            if (prices == null) {
              throw new MissingRequiredPropertyException("GetNetworkTransferPricesType", "prices");
            }
            this.prices = prices;
            return this;
        }
        public Builder prices(GetNetworkTransferPricesTypePrice... prices) {
            return prices(List.of(prices));
        }
        @CustomType.Setter
        public Builder regionPrices(List<GetNetworkTransferPricesTypeRegionPrice> regionPrices) {
            if (regionPrices == null) {
              throw new MissingRequiredPropertyException("GetNetworkTransferPricesType", "regionPrices");
            }
            this.regionPrices = regionPrices;
            return this;
        }
        public Builder regionPrices(GetNetworkTransferPricesTypeRegionPrice... regionPrices) {
            return regionPrices(List.of(regionPrices));
        }
        @CustomType.Setter
        public Builder transfer(Integer transfer) {
            if (transfer == null) {
              throw new MissingRequiredPropertyException("GetNetworkTransferPricesType", "transfer");
            }
            this.transfer = transfer;
            return this;
        }
        public GetNetworkTransferPricesType build() {
            final var _resultValue = new GetNetworkTransferPricesType();
            _resultValue.id = id;
            _resultValue.label = label;
            _resultValue.prices = prices;
            _resultValue.regionPrices = regionPrices;
            _resultValue.transfer = transfer;
            return _resultValue;
        }
    }
}
