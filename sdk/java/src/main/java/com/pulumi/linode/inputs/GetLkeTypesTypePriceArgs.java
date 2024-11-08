// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Double;
import java.util.Objects;


public final class GetLkeTypesTypePriceArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetLkeTypesTypePriceArgs Empty = new GetLkeTypesTypePriceArgs();

    /**
     * Cost (in US dollars) per hour.
     * 
     */
    @Import(name="hourly", required=true)
    private Output<Double> hourly;

    /**
     * @return Cost (in US dollars) per hour.
     * 
     */
    public Output<Double> hourly() {
        return this.hourly;
    }

    /**
     * Cost (in US dollars) per month.
     * 
     */
    @Import(name="monthly", required=true)
    private Output<Double> monthly;

    /**
     * @return Cost (in US dollars) per month.
     * 
     */
    public Output<Double> monthly() {
        return this.monthly;
    }

    private GetLkeTypesTypePriceArgs() {}

    private GetLkeTypesTypePriceArgs(GetLkeTypesTypePriceArgs $) {
        this.hourly = $.hourly;
        this.monthly = $.monthly;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLkeTypesTypePriceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLkeTypesTypePriceArgs $;

        public Builder() {
            $ = new GetLkeTypesTypePriceArgs();
        }

        public Builder(GetLkeTypesTypePriceArgs defaults) {
            $ = new GetLkeTypesTypePriceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param hourly Cost (in US dollars) per hour.
         * 
         * @return builder
         * 
         */
        public Builder hourly(Output<Double> hourly) {
            $.hourly = hourly;
            return this;
        }

        /**
         * @param hourly Cost (in US dollars) per hour.
         * 
         * @return builder
         * 
         */
        public Builder hourly(Double hourly) {
            return hourly(Output.of(hourly));
        }

        /**
         * @param monthly Cost (in US dollars) per month.
         * 
         * @return builder
         * 
         */
        public Builder monthly(Output<Double> monthly) {
            $.monthly = monthly;
            return this;
        }

        /**
         * @param monthly Cost (in US dollars) per month.
         * 
         * @return builder
         * 
         */
        public Builder monthly(Double monthly) {
            return monthly(Output.of(monthly));
        }

        public GetLkeTypesTypePriceArgs build() {
            if ($.hourly == null) {
                throw new MissingRequiredPropertyException("GetLkeTypesTypePriceArgs", "hourly");
            }
            if ($.monthly == null) {
                throw new MissingRequiredPropertyException("GetLkeTypesTypePriceArgs", "monthly");
            }
            return $;
        }
    }

}
