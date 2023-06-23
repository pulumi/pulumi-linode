// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.linode.inputs.GetDatabasesDatabase;
import com.pulumi.linode.inputs.GetDatabasesFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDatabasesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDatabasesPlainArgs Empty = new GetDatabasesPlainArgs();

    @Import(name="databases")
    private @Nullable List<GetDatabasesDatabase> databases;

    public Optional<List<GetDatabasesDatabase>> databases() {
        return Optional.ofNullable(this.databases);
    }

    @Import(name="filters")
    private @Nullable List<GetDatabasesFilter> filters;

    public Optional<List<GetDatabasesFilter>> filters() {
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
     * The attribute to order the results by. (`version`)
     * 
     */
    @Import(name="orderBy")
    private @Nullable String orderBy;

    /**
     * @return The attribute to order the results by. (`version`)
     * 
     */
    public Optional<String> orderBy() {
        return Optional.ofNullable(this.orderBy);
    }

    private GetDatabasesPlainArgs() {}

    private GetDatabasesPlainArgs(GetDatabasesPlainArgs $) {
        this.databases = $.databases;
        this.filters = $.filters;
        this.order = $.order;
        this.orderBy = $.orderBy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDatabasesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDatabasesPlainArgs $;

        public Builder() {
            $ = new GetDatabasesPlainArgs();
        }

        public Builder(GetDatabasesPlainArgs defaults) {
            $ = new GetDatabasesPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder databases(@Nullable List<GetDatabasesDatabase> databases) {
            $.databases = databases;
            return this;
        }

        public Builder databases(GetDatabasesDatabase... databases) {
            return databases(List.of(databases));
        }

        public Builder filters(@Nullable List<GetDatabasesFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetDatabasesFilter... filters) {
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
         * @param orderBy The attribute to order the results by. (`version`)
         * 
         * @return builder
         * 
         */
        public Builder orderBy(@Nullable String orderBy) {
            $.orderBy = orderBy;
            return this;
        }

        public GetDatabasesPlainArgs build() {
            return $;
        }
    }

}
