// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Double;
import java.util.Objects;


public final class GetInstanceTypesTypeAddonBackupPrice extends com.pulumi.resources.InvokeArgs {

    public static final GetInstanceTypesTypeAddonBackupPrice Empty = new GetInstanceTypesTypeAddonBackupPrice();

    /**
     * Cost (in US dollars) per hour.
     * 
     */
    @Import(name="hourly", required=true)
    private Double hourly;

    /**
     * @return Cost (in US dollars) per hour.
     * 
     */
    public Double hourly() {
        return this.hourly;
    }

    /**
     * Cost (in US dollars) per month.
     * 
     */
    @Import(name="monthly", required=true)
    private Double monthly;

    /**
     * @return Cost (in US dollars) per month.
     * 
     */
    public Double monthly() {
        return this.monthly;
    }

    private GetInstanceTypesTypeAddonBackupPrice() {}

    private GetInstanceTypesTypeAddonBackupPrice(GetInstanceTypesTypeAddonBackupPrice $) {
        this.hourly = $.hourly;
        this.monthly = $.monthly;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInstanceTypesTypeAddonBackupPrice defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInstanceTypesTypeAddonBackupPrice $;

        public Builder() {
            $ = new GetInstanceTypesTypeAddonBackupPrice();
        }

        public Builder(GetInstanceTypesTypeAddonBackupPrice defaults) {
            $ = new GetInstanceTypesTypeAddonBackupPrice(Objects.requireNonNull(defaults));
        }

        /**
         * @param hourly Cost (in US dollars) per hour.
         * 
         * @return builder
         * 
         */
        public Builder hourly(Double hourly) {
            $.hourly = hourly;
            return this;
        }

        /**
         * @param monthly Cost (in US dollars) per month.
         * 
         * @return builder
         * 
         */
        public Builder monthly(Double monthly) {
            $.monthly = monthly;
            return this;
        }

        public GetInstanceTypesTypeAddonBackupPrice build() {
            if ($.hourly == null) {
                throw new MissingRequiredPropertyException("GetInstanceTypesTypeAddonBackupPrice", "hourly");
            }
            if ($.monthly == null) {
                throw new MissingRequiredPropertyException("GetInstanceTypesTypeAddonBackupPrice", "monthly");
            }
            return $;
        }
    }

}
