// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


public final class GetInstanceTypesTypeRegionPrice extends com.pulumi.resources.InvokeArgs {

    public static final GetInstanceTypesTypeRegionPrice Empty = new GetInstanceTypesTypeRegionPrice();

    @Import(name="hourly", required=true)
    private Double hourly;

    public Double hourly() {
        return this.hourly;
    }

    /**
     * The ID representing the Linode Type.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return The ID representing the Linode Type.
     * 
     */
    public String id() {
        return this.id;
    }

    @Import(name="monthly", required=true)
    private Double monthly;

    public Double monthly() {
        return this.monthly;
    }

    private GetInstanceTypesTypeRegionPrice() {}

    private GetInstanceTypesTypeRegionPrice(GetInstanceTypesTypeRegionPrice $) {
        this.hourly = $.hourly;
        this.id = $.id;
        this.monthly = $.monthly;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInstanceTypesTypeRegionPrice defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInstanceTypesTypeRegionPrice $;

        public Builder() {
            $ = new GetInstanceTypesTypeRegionPrice();
        }

        public Builder(GetInstanceTypesTypeRegionPrice defaults) {
            $ = new GetInstanceTypesTypeRegionPrice(Objects.requireNonNull(defaults));
        }

        public Builder hourly(Double hourly) {
            $.hourly = hourly;
            return this;
        }

        /**
         * @param id The ID representing the Linode Type.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public Builder monthly(Double monthly) {
            $.monthly = monthly;
            return this;
        }

        public GetInstanceTypesTypeRegionPrice build() {
            if ($.hourly == null) {
                throw new MissingRequiredPropertyException("GetInstanceTypesTypeRegionPrice", "hourly");
            }
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetInstanceTypesTypeRegionPrice", "id");
            }
            if ($.monthly == null) {
                throw new MissingRequiredPropertyException("GetInstanceTypesTypeRegionPrice", "monthly");
            }
            return $;
        }
    }

}
