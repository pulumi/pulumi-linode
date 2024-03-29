// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.linode.inputs.GetInstanceTypesFilterArgs;
import com.pulumi.linode.inputs.GetInstanceTypesTypeArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInstanceTypesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetInstanceTypesArgs Empty = new GetInstanceTypesArgs();

    @Import(name="filters")
    private @Nullable Output<List<GetInstanceTypesFilterArgs>> filters;

    public Optional<Output<List<GetInstanceTypesFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The order in which results should be returned. (`asc`, `desc`; default `asc`)
     * 
     */
    @Import(name="order")
    private @Nullable Output<String> order;

    /**
     * @return The order in which results should be returned. (`asc`, `desc`; default `asc`)
     * 
     */
    public Optional<Output<String>> order() {
        return Optional.ofNullable(this.order);
    }

    /**
     * The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
     * 
     */
    @Import(name="orderBy")
    private @Nullable Output<String> orderBy;

    /**
     * @return The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
     * 
     */
    public Optional<Output<String>> orderBy() {
        return Optional.ofNullable(this.orderBy);
    }

    @Import(name="types")
    private @Nullable Output<List<GetInstanceTypesTypeArgs>> types;

    public Optional<Output<List<GetInstanceTypesTypeArgs>>> types() {
        return Optional.ofNullable(this.types);
    }

    private GetInstanceTypesArgs() {}

    private GetInstanceTypesArgs(GetInstanceTypesArgs $) {
        this.filters = $.filters;
        this.order = $.order;
        this.orderBy = $.orderBy;
        this.types = $.types;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInstanceTypesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInstanceTypesArgs $;

        public Builder() {
            $ = new GetInstanceTypesArgs();
        }

        public Builder(GetInstanceTypesArgs defaults) {
            $ = new GetInstanceTypesArgs(Objects.requireNonNull(defaults));
        }

        public Builder filters(@Nullable Output<List<GetInstanceTypesFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(List<GetInstanceTypesFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        public Builder filters(GetInstanceTypesFilterArgs... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param order The order in which results should be returned. (`asc`, `desc`; default `asc`)
         * 
         * @return builder
         * 
         */
        public Builder order(@Nullable Output<String> order) {
            $.order = order;
            return this;
        }

        /**
         * @param order The order in which results should be returned. (`asc`, `desc`; default `asc`)
         * 
         * @return builder
         * 
         */
        public Builder order(String order) {
            return order(Output.of(order));
        }

        /**
         * @param orderBy The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
         * 
         * @return builder
         * 
         */
        public Builder orderBy(@Nullable Output<String> orderBy) {
            $.orderBy = orderBy;
            return this;
        }

        /**
         * @param orderBy The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
         * 
         * @return builder
         * 
         */
        public Builder orderBy(String orderBy) {
            return orderBy(Output.of(orderBy));
        }

        public Builder types(@Nullable Output<List<GetInstanceTypesTypeArgs>> types) {
            $.types = types;
            return this;
        }

        public Builder types(List<GetInstanceTypesTypeArgs> types) {
            return types(Output.of(types));
        }

        public Builder types(GetInstanceTypesTypeArgs... types) {
            return types(List.of(types));
        }

        public GetInstanceTypesArgs build() {
            return $;
        }
    }

}
