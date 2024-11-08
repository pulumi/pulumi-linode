// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


public final class GetLkeTypesTypeRegionPriceArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetLkeTypesTypeRegionPriceArgs Empty = new GetLkeTypesTypeRegionPriceArgs();

    @Import(name="hourly", required=true)
    private Output<Double> hourly;

    public Output<Double> hourly() {
        return this.hourly;
    }

    /**
     * The ID representing the Kubernetes type.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The ID representing the Kubernetes type.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    @Import(name="monthly", required=true)
    private Output<Double> monthly;

    public Output<Double> monthly() {
        return this.monthly;
    }

    private GetLkeTypesTypeRegionPriceArgs() {}

    private GetLkeTypesTypeRegionPriceArgs(GetLkeTypesTypeRegionPriceArgs $) {
        this.hourly = $.hourly;
        this.id = $.id;
        this.monthly = $.monthly;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLkeTypesTypeRegionPriceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLkeTypesTypeRegionPriceArgs $;

        public Builder() {
            $ = new GetLkeTypesTypeRegionPriceArgs();
        }

        public Builder(GetLkeTypesTypeRegionPriceArgs defaults) {
            $ = new GetLkeTypesTypeRegionPriceArgs(Objects.requireNonNull(defaults));
        }

        public Builder hourly(Output<Double> hourly) {
            $.hourly = hourly;
            return this;
        }

        public Builder hourly(Double hourly) {
            return hourly(Output.of(hourly));
        }

        /**
         * @param id The ID representing the Kubernetes type.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID representing the Kubernetes type.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public Builder monthly(Output<Double> monthly) {
            $.monthly = monthly;
            return this;
        }

        public Builder monthly(Double monthly) {
            return monthly(Output.of(monthly));
        }

        public GetLkeTypesTypeRegionPriceArgs build() {
            if ($.hourly == null) {
                throw new MissingRequiredPropertyException("GetLkeTypesTypeRegionPriceArgs", "hourly");
            }
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetLkeTypesTypeRegionPriceArgs", "id");
            }
            if ($.monthly == null) {
                throw new MissingRequiredPropertyException("GetLkeTypesTypeRegionPriceArgs", "monthly");
            }
            return $;
        }
    }

}
