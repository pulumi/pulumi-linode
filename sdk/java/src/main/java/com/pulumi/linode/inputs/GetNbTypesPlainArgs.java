// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.linode.inputs.GetNbTypesFilter;
import com.pulumi.linode.inputs.GetNbTypesType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNbTypesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNbTypesPlainArgs Empty = new GetNbTypesPlainArgs();

    @Import(name="filters")
    private @Nullable List<GetNbTypesFilter> filters;

    public Optional<List<GetNbTypesFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    @Import(name="order")
    private @Nullable String order;

    public Optional<String> order() {
        return Optional.ofNullable(this.order);
    }

    @Import(name="orderBy")
    private @Nullable String orderBy;

    public Optional<String> orderBy() {
        return Optional.ofNullable(this.orderBy);
    }

    @Import(name="types")
    private @Nullable List<GetNbTypesType> types;

    public Optional<List<GetNbTypesType>> types() {
        return Optional.ofNullable(this.types);
    }

    private GetNbTypesPlainArgs() {}

    private GetNbTypesPlainArgs(GetNbTypesPlainArgs $) {
        this.filters = $.filters;
        this.order = $.order;
        this.orderBy = $.orderBy;
        this.types = $.types;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNbTypesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNbTypesPlainArgs $;

        public Builder() {
            $ = new GetNbTypesPlainArgs();
        }

        public Builder(GetNbTypesPlainArgs defaults) {
            $ = new GetNbTypesPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder filters(@Nullable List<GetNbTypesFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetNbTypesFilter... filters) {
            return filters(List.of(filters));
        }

        public Builder order(@Nullable String order) {
            $.order = order;
            return this;
        }

        public Builder orderBy(@Nullable String orderBy) {
            $.orderBy = orderBy;
            return this;
        }

        public Builder types(@Nullable List<GetNbTypesType> types) {
            $.types = types;
            return this;
        }

        public Builder types(GetNbTypesType... types) {
            return types(List.of(types));
        }

        public GetNbTypesPlainArgs build() {
            return $;
        }
    }

}
