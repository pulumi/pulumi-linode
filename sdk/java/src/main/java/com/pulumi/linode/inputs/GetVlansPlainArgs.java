// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.linode.inputs.GetVlansFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVlansPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVlansPlainArgs Empty = new GetVlansPlainArgs();

    @Import(name="filters")
    private @Nullable List<GetVlansFilter> filters;

    public Optional<List<GetVlansFilter>> filters() {
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

    private GetVlansPlainArgs() {}

    private GetVlansPlainArgs(GetVlansPlainArgs $) {
        this.filters = $.filters;
        this.order = $.order;
        this.orderBy = $.orderBy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVlansPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVlansPlainArgs $;

        public Builder() {
            $ = new GetVlansPlainArgs();
        }

        public Builder(GetVlansPlainArgs defaults) {
            $ = new GetVlansPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder filters(@Nullable List<GetVlansFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetVlansFilter... filters) {
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

        public GetVlansPlainArgs build() {
            return $;
        }
    }

}
