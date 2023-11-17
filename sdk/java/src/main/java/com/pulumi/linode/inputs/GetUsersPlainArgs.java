// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.linode.inputs.GetUsersFilter;
import com.pulumi.linode.inputs.GetUsersUser;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetUsersPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetUsersPlainArgs Empty = new GetUsersPlainArgs();

    /**
     * `filter` - (Optional) A set of filters used to select Linode users that meet certain requirements.
     * 
     */
    @Import(name="filters")
    private @Nullable List<GetUsersFilter> filters;

    /**
     * @return `filter` - (Optional) A set of filters used to select Linode users that meet certain requirements.
     * 
     */
    public Optional<List<GetUsersFilter>> filters() {
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

    @Import(name="users")
    private @Nullable List<GetUsersUser> users;

    public Optional<List<GetUsersUser>> users() {
        return Optional.ofNullable(this.users);
    }

    private GetUsersPlainArgs() {}

    private GetUsersPlainArgs(GetUsersPlainArgs $) {
        this.filters = $.filters;
        this.order = $.order;
        this.orderBy = $.orderBy;
        this.users = $.users;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetUsersPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetUsersPlainArgs $;

        public Builder() {
            $ = new GetUsersPlainArgs();
        }

        public Builder(GetUsersPlainArgs defaults) {
            $ = new GetUsersPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters `filter` - (Optional) A set of filters used to select Linode users that meet certain requirements.
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable List<GetUsersFilter> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters `filter` - (Optional) A set of filters used to select Linode users that meet certain requirements.
         * 
         * @return builder
         * 
         */
        public Builder filters(GetUsersFilter... filters) {
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

        public Builder users(@Nullable List<GetUsersUser> users) {
            $.users = users;
            return this;
        }

        public Builder users(GetUsersUser... users) {
            return users(List.of(users));
        }

        public GetUsersPlainArgs build() {
            return $;
        }
    }

}
