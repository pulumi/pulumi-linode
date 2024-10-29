// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.linode.inputs.GetNetworkTransferPricesTypePriceArgs;
import com.pulumi.linode.inputs.GetNetworkTransferPricesTypeRegionPriceArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetNetworkTransferPricesTypeArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetNetworkTransferPricesTypeArgs Empty = new GetNetworkTransferPricesTypeArgs();

    /**
     * The unique ID assigned to this Network Transfer Price.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The unique ID assigned to this Network Transfer Price.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    /**
     * The Network Transfer Price&#39;s label.
     * 
     */
    @Import(name="label", required=true)
    private Output<String> label;

    /**
     * @return The Network Transfer Price&#39;s label.
     * 
     */
    public Output<String> label() {
        return this.label;
    }

    /**
     * Cost in US dollars, broken down into hourly and monthly charges.
     * 
     */
    @Import(name="prices", required=true)
    private Output<List<GetNetworkTransferPricesTypePriceArgs>> prices;

    /**
     * @return Cost in US dollars, broken down into hourly and monthly charges.
     * 
     */
    public Output<List<GetNetworkTransferPricesTypePriceArgs>> prices() {
        return this.prices;
    }

    /**
     * A list of region-specific prices for this Network Transfer Price.
     * 
     */
    @Import(name="regionPrices", required=true)
    private Output<List<GetNetworkTransferPricesTypeRegionPriceArgs>> regionPrices;

    /**
     * @return A list of region-specific prices for this Network Transfer Price.
     * 
     */
    public Output<List<GetNetworkTransferPricesTypeRegionPriceArgs>> regionPrices() {
        return this.regionPrices;
    }

    /**
     * The monthly outbound transfer amount, in MB.
     * 
     */
    @Import(name="transfer", required=true)
    private Output<Integer> transfer;

    /**
     * @return The monthly outbound transfer amount, in MB.
     * 
     */
    public Output<Integer> transfer() {
        return this.transfer;
    }

    private GetNetworkTransferPricesTypeArgs() {}

    private GetNetworkTransferPricesTypeArgs(GetNetworkTransferPricesTypeArgs $) {
        this.id = $.id;
        this.label = $.label;
        this.prices = $.prices;
        this.regionPrices = $.regionPrices;
        this.transfer = $.transfer;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNetworkTransferPricesTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNetworkTransferPricesTypeArgs $;

        public Builder() {
            $ = new GetNetworkTransferPricesTypeArgs();
        }

        public Builder(GetNetworkTransferPricesTypeArgs defaults) {
            $ = new GetNetworkTransferPricesTypeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The unique ID assigned to this Network Transfer Price.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The unique ID assigned to this Network Transfer Price.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param label The Network Transfer Price&#39;s label.
         * 
         * @return builder
         * 
         */
        public Builder label(Output<String> label) {
            $.label = label;
            return this;
        }

        /**
         * @param label The Network Transfer Price&#39;s label.
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            return label(Output.of(label));
        }

        /**
         * @param prices Cost in US dollars, broken down into hourly and monthly charges.
         * 
         * @return builder
         * 
         */
        public Builder prices(Output<List<GetNetworkTransferPricesTypePriceArgs>> prices) {
            $.prices = prices;
            return this;
        }

        /**
         * @param prices Cost in US dollars, broken down into hourly and monthly charges.
         * 
         * @return builder
         * 
         */
        public Builder prices(List<GetNetworkTransferPricesTypePriceArgs> prices) {
            return prices(Output.of(prices));
        }

        /**
         * @param prices Cost in US dollars, broken down into hourly and monthly charges.
         * 
         * @return builder
         * 
         */
        public Builder prices(GetNetworkTransferPricesTypePriceArgs... prices) {
            return prices(List.of(prices));
        }

        /**
         * @param regionPrices A list of region-specific prices for this Network Transfer Price.
         * 
         * @return builder
         * 
         */
        public Builder regionPrices(Output<List<GetNetworkTransferPricesTypeRegionPriceArgs>> regionPrices) {
            $.regionPrices = regionPrices;
            return this;
        }

        /**
         * @param regionPrices A list of region-specific prices for this Network Transfer Price.
         * 
         * @return builder
         * 
         */
        public Builder regionPrices(List<GetNetworkTransferPricesTypeRegionPriceArgs> regionPrices) {
            return regionPrices(Output.of(regionPrices));
        }

        /**
         * @param regionPrices A list of region-specific prices for this Network Transfer Price.
         * 
         * @return builder
         * 
         */
        public Builder regionPrices(GetNetworkTransferPricesTypeRegionPriceArgs... regionPrices) {
            return regionPrices(List.of(regionPrices));
        }

        /**
         * @param transfer The monthly outbound transfer amount, in MB.
         * 
         * @return builder
         * 
         */
        public Builder transfer(Output<Integer> transfer) {
            $.transfer = transfer;
            return this;
        }

        /**
         * @param transfer The monthly outbound transfer amount, in MB.
         * 
         * @return builder
         * 
         */
        public Builder transfer(Integer transfer) {
            return transfer(Output.of(transfer));
        }

        public GetNetworkTransferPricesTypeArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetNetworkTransferPricesTypeArgs", "id");
            }
            if ($.label == null) {
                throw new MissingRequiredPropertyException("GetNetworkTransferPricesTypeArgs", "label");
            }
            if ($.prices == null) {
                throw new MissingRequiredPropertyException("GetNetworkTransferPricesTypeArgs", "prices");
            }
            if ($.regionPrices == null) {
                throw new MissingRequiredPropertyException("GetNetworkTransferPricesTypeArgs", "regionPrices");
            }
            if ($.transfer == null) {
                throw new MissingRequiredPropertyException("GetNetworkTransferPricesTypeArgs", "transfer");
            }
            return $;
        }
    }

}
