// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.linode.inputs.GetObjectStorageEndpointsEndpointArgs;
import com.pulumi.linode.inputs.GetObjectStorageEndpointsFilterArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetObjectStorageEndpointsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetObjectStorageEndpointsArgs Empty = new GetObjectStorageEndpointsArgs();

    @Import(name="endpoints")
    private @Nullable Output<List<GetObjectStorageEndpointsEndpointArgs>> endpoints;

    public Optional<Output<List<GetObjectStorageEndpointsEndpointArgs>>> endpoints() {
        return Optional.ofNullable(this.endpoints);
    }

    @Import(name="filters")
    private @Nullable Output<List<GetObjectStorageEndpointsFilterArgs>> filters;

    public Optional<Output<List<GetObjectStorageEndpointsFilterArgs>>> filters() {
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

    private GetObjectStorageEndpointsArgs() {}

    private GetObjectStorageEndpointsArgs(GetObjectStorageEndpointsArgs $) {
        this.endpoints = $.endpoints;
        this.filters = $.filters;
        this.order = $.order;
        this.orderBy = $.orderBy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetObjectStorageEndpointsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetObjectStorageEndpointsArgs $;

        public Builder() {
            $ = new GetObjectStorageEndpointsArgs();
        }

        public Builder(GetObjectStorageEndpointsArgs defaults) {
            $ = new GetObjectStorageEndpointsArgs(Objects.requireNonNull(defaults));
        }

        public Builder endpoints(@Nullable Output<List<GetObjectStorageEndpointsEndpointArgs>> endpoints) {
            $.endpoints = endpoints;
            return this;
        }

        public Builder endpoints(List<GetObjectStorageEndpointsEndpointArgs> endpoints) {
            return endpoints(Output.of(endpoints));
        }

        public Builder endpoints(GetObjectStorageEndpointsEndpointArgs... endpoints) {
            return endpoints(List.of(endpoints));
        }

        public Builder filters(@Nullable Output<List<GetObjectStorageEndpointsFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(List<GetObjectStorageEndpointsFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        public Builder filters(GetObjectStorageEndpointsFilterArgs... filters) {
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

        public GetObjectStorageEndpointsArgs build() {
            return $;
        }
    }

}
