// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


public final class GetNetworkTransferPricesTypeRegionPrice extends com.pulumi.resources.InvokeArgs {

    public static final GetNetworkTransferPricesTypeRegionPrice Empty = new GetNetworkTransferPricesTypeRegionPrice();

    @Import(name="hourly", required=true)
    private Double hourly;

    public Double hourly() {
        return this.hourly;
    }

    @Import(name="id", required=true)
    private String id;

    public String id() {
        return this.id;
    }

    @Import(name="monthly", required=true)
    private Double monthly;

    public Double monthly() {
        return this.monthly;
    }

    private GetNetworkTransferPricesTypeRegionPrice() {}

    private GetNetworkTransferPricesTypeRegionPrice(GetNetworkTransferPricesTypeRegionPrice $) {
        this.hourly = $.hourly;
        this.id = $.id;
        this.monthly = $.monthly;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNetworkTransferPricesTypeRegionPrice defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNetworkTransferPricesTypeRegionPrice $;

        public Builder() {
            $ = new GetNetworkTransferPricesTypeRegionPrice();
        }

        public Builder(GetNetworkTransferPricesTypeRegionPrice defaults) {
            $ = new GetNetworkTransferPricesTypeRegionPrice(Objects.requireNonNull(defaults));
        }

        public Builder hourly(Double hourly) {
            $.hourly = hourly;
            return this;
        }

        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public Builder monthly(Double monthly) {
            $.monthly = monthly;
            return this;
        }

        public GetNetworkTransferPricesTypeRegionPrice build() {
            if ($.hourly == null) {
                throw new MissingRequiredPropertyException("GetNetworkTransferPricesTypeRegionPrice", "hourly");
            }
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetNetworkTransferPricesTypeRegionPrice", "id");
            }
            if ($.monthly == null) {
                throw new MissingRequiredPropertyException("GetNetworkTransferPricesTypeRegionPrice", "monthly");
            }
            return $;
        }
    }

}
