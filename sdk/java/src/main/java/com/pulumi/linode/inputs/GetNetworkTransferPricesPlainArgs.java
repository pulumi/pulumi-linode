// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.linode.inputs.GetNetworkTransferPricesFilter;
import com.pulumi.linode.inputs.GetNetworkTransferPricesType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNetworkTransferPricesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNetworkTransferPricesPlainArgs Empty = new GetNetworkTransferPricesPlainArgs();

    @Import(name="filters")
    private @Nullable List<GetNetworkTransferPricesFilter> filters;

    public Optional<List<GetNetworkTransferPricesFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The order in which results should be returned. (`asc`, `desc`; default `asc`)
     * 
     */
    @Import(name="order")
    private @Nullable String order;

    /**
     * @return The order in which results should be returned. (`asc`, `desc`; default `asc`)
     * 
     */
    public Optional<String> order() {
        return Optional.ofNullable(this.order);
    }

    /**
     * The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
     * 
     */
    @Import(name="orderBy")
    private @Nullable String orderBy;

    /**
     * @return The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
     * 
     */
    public Optional<String> orderBy() {
        return Optional.ofNullable(this.orderBy);
    }

    @Import(name="types")
    private @Nullable List<GetNetworkTransferPricesType> types;

    public Optional<List<GetNetworkTransferPricesType>> types() {
        return Optional.ofNullable(this.types);
    }

    private GetNetworkTransferPricesPlainArgs() {}

    private GetNetworkTransferPricesPlainArgs(GetNetworkTransferPricesPlainArgs $) {
        this.filters = $.filters;
        this.order = $.order;
        this.orderBy = $.orderBy;
        this.types = $.types;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNetworkTransferPricesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNetworkTransferPricesPlainArgs $;

        public Builder() {
            $ = new GetNetworkTransferPricesPlainArgs();
        }

        public Builder(GetNetworkTransferPricesPlainArgs defaults) {
            $ = new GetNetworkTransferPricesPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder filters(@Nullable List<GetNetworkTransferPricesFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetNetworkTransferPricesFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param order The order in which results should be returned. (`asc`, `desc`; default `asc`)
         * 
         * @return builder
         * 
         */
        public Builder order(@Nullable String order) {
            $.order = order;
            return this;
        }

        /**
         * @param orderBy The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
         * 
         * @return builder
         * 
         */
        public Builder orderBy(@Nullable String orderBy) {
            $.orderBy = orderBy;
            return this;
        }

        public Builder types(@Nullable List<GetNetworkTransferPricesType> types) {
            $.types = types;
            return this;
        }

        public Builder types(GetNetworkTransferPricesType... types) {
            return types(List.of(types));
        }

        public GetNetworkTransferPricesPlainArgs build() {
            return $;
        }
    }

}
