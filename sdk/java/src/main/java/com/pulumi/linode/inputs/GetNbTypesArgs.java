// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.linode.inputs.GetNbTypesFilterArgs;
import com.pulumi.linode.inputs.GetNbTypesTypeArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNbTypesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNbTypesArgs Empty = new GetNbTypesArgs();

    @Import(name="filters")
    private @Nullable Output<List<GetNbTypesFilterArgs>> filters;

    public Optional<Output<List<GetNbTypesFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    @Import(name="order")
    private @Nullable Output<String> order;

    public Optional<Output<String>> order() {
        return Optional.ofNullable(this.order);
    }

    @Import(name="orderBy")
    private @Nullable Output<String> orderBy;

    public Optional<Output<String>> orderBy() {
        return Optional.ofNullable(this.orderBy);
    }

    @Import(name="types")
    private @Nullable Output<List<GetNbTypesTypeArgs>> types;

    public Optional<Output<List<GetNbTypesTypeArgs>>> types() {
        return Optional.ofNullable(this.types);
    }

    private GetNbTypesArgs() {}

    private GetNbTypesArgs(GetNbTypesArgs $) {
        this.filters = $.filters;
        this.order = $.order;
        this.orderBy = $.orderBy;
        this.types = $.types;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNbTypesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNbTypesArgs $;

        public Builder() {
            $ = new GetNbTypesArgs();
        }

        public Builder(GetNbTypesArgs defaults) {
            $ = new GetNbTypesArgs(Objects.requireNonNull(defaults));
        }

        public Builder filters(@Nullable Output<List<GetNbTypesFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(List<GetNbTypesFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        public Builder filters(GetNbTypesFilterArgs... filters) {
            return filters(List.of(filters));
        }

        public Builder order(@Nullable Output<String> order) {
            $.order = order;
            return this;
        }

        public Builder order(String order) {
            return order(Output.of(order));
        }

        public Builder orderBy(@Nullable Output<String> orderBy) {
            $.orderBy = orderBy;
            return this;
        }

        public Builder orderBy(String orderBy) {
            return orderBy(Output.of(orderBy));
        }

        public Builder types(@Nullable Output<List<GetNbTypesTypeArgs>> types) {
            $.types = types;
            return this;
        }

        public Builder types(List<GetNbTypesTypeArgs> types) {
            return types(Output.of(types));
        }

        public Builder types(GetNbTypesTypeArgs... types) {
            return types(List.of(types));
        }

        public GetNbTypesArgs build() {
            return $;
        }
    }

}
