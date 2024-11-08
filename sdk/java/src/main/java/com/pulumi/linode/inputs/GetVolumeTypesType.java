// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.linode.inputs.GetVolumeTypesTypePrice;
import com.pulumi.linode.inputs.GetVolumeTypesTypeRegionPrice;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetVolumeTypesType extends com.pulumi.resources.InvokeArgs {

    public static final GetVolumeTypesType Empty = new GetVolumeTypesType();

    /**
     * The ID representing the Volume type.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return The ID representing the Volume type.
     * 
     */
    public String id() {
        return this.id;
    }

    /**
     * The Volume type label is for display purposes only.
     * 
     */
    @Import(name="label", required=true)
    private String label;

    /**
     * @return The Volume type label is for display purposes only.
     * 
     */
    public String label() {
        return this.label;
    }

    /**
     * Cost in US dollars, broken down into hourly and monthly charges.
     * 
     */
    @Import(name="prices", required=true)
    private List<GetVolumeTypesTypePrice> prices;

    /**
     * @return Cost in US dollars, broken down into hourly and monthly charges.
     * 
     */
    public List<GetVolumeTypesTypePrice> prices() {
        return this.prices;
    }

    /**
     * A list of region-specific prices for this Volume Type.
     * 
     */
    @Import(name="regionPrices", required=true)
    private List<GetVolumeTypesTypeRegionPrice> regionPrices;

    /**
     * @return A list of region-specific prices for this Volume Type.
     * 
     */
    public List<GetVolumeTypesTypeRegionPrice> regionPrices() {
        return this.regionPrices;
    }

    /**
     * The monthly outbound transfer amount, in MB.
     * 
     */
    @Import(name="transfer", required=true)
    private Integer transfer;

    /**
     * @return The monthly outbound transfer amount, in MB.
     * 
     */
    public Integer transfer() {
        return this.transfer;
    }

    private GetVolumeTypesType() {}

    private GetVolumeTypesType(GetVolumeTypesType $) {
        this.id = $.id;
        this.label = $.label;
        this.prices = $.prices;
        this.regionPrices = $.regionPrices;
        this.transfer = $.transfer;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVolumeTypesType defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVolumeTypesType $;

        public Builder() {
            $ = new GetVolumeTypesType();
        }

        public Builder(GetVolumeTypesType defaults) {
            $ = new GetVolumeTypesType(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ID representing the Volume type.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        /**
         * @param label The Volume type label is for display purposes only.
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            $.label = label;
            return this;
        }

        /**
         * @param prices Cost in US dollars, broken down into hourly and monthly charges.
         * 
         * @return builder
         * 
         */
        public Builder prices(List<GetVolumeTypesTypePrice> prices) {
            $.prices = prices;
            return this;
        }

        /**
         * @param prices Cost in US dollars, broken down into hourly and monthly charges.
         * 
         * @return builder
         * 
         */
        public Builder prices(GetVolumeTypesTypePrice... prices) {
            return prices(List.of(prices));
        }

        /**
         * @param regionPrices A list of region-specific prices for this Volume Type.
         * 
         * @return builder
         * 
         */
        public Builder regionPrices(List<GetVolumeTypesTypeRegionPrice> regionPrices) {
            $.regionPrices = regionPrices;
            return this;
        }

        /**
         * @param regionPrices A list of region-specific prices for this Volume Type.
         * 
         * @return builder
         * 
         */
        public Builder regionPrices(GetVolumeTypesTypeRegionPrice... regionPrices) {
            return regionPrices(List.of(regionPrices));
        }

        /**
         * @param transfer The monthly outbound transfer amount, in MB.
         * 
         * @return builder
         * 
         */
        public Builder transfer(Integer transfer) {
            $.transfer = transfer;
            return this;
        }

        public GetVolumeTypesType build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetVolumeTypesType", "id");
            }
            if ($.label == null) {
                throw new MissingRequiredPropertyException("GetVolumeTypesType", "label");
            }
            if ($.prices == null) {
                throw new MissingRequiredPropertyException("GetVolumeTypesType", "prices");
            }
            if ($.regionPrices == null) {
                throw new MissingRequiredPropertyException("GetVolumeTypesType", "regionPrices");
            }
            if ($.transfer == null) {
                throw new MissingRequiredPropertyException("GetVolumeTypesType", "transfer");
            }
            return $;
        }
    }

}
