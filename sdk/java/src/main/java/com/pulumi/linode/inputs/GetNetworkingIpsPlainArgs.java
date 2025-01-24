// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.linode.inputs.GetNetworkingIpsFilter;
import com.pulumi.linode.inputs.GetNetworkingIpsIpAddress;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNetworkingIpsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNetworkingIpsPlainArgs Empty = new GetNetworkingIpsPlainArgs();

    @Import(name="filters")
    private @Nullable List<GetNetworkingIpsFilter> filters;

    public Optional<List<GetNetworkingIpsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    @Import(name="ipAddresses")
    private @Nullable List<GetNetworkingIpsIpAddress> ipAddresses;

    public Optional<List<GetNetworkingIpsIpAddress>> ipAddresses() {
        return Optional.ofNullable(this.ipAddresses);
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

    private GetNetworkingIpsPlainArgs() {}

    private GetNetworkingIpsPlainArgs(GetNetworkingIpsPlainArgs $) {
        this.filters = $.filters;
        this.ipAddresses = $.ipAddresses;
        this.order = $.order;
        this.orderBy = $.orderBy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNetworkingIpsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNetworkingIpsPlainArgs $;

        public Builder() {
            $ = new GetNetworkingIpsPlainArgs();
        }

        public Builder(GetNetworkingIpsPlainArgs defaults) {
            $ = new GetNetworkingIpsPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder filters(@Nullable List<GetNetworkingIpsFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetNetworkingIpsFilter... filters) {
            return filters(List.of(filters));
        }

        public Builder ipAddresses(@Nullable List<GetNetworkingIpsIpAddress> ipAddresses) {
            $.ipAddresses = ipAddresses;
            return this;
        }

        public Builder ipAddresses(GetNetworkingIpsIpAddress... ipAddresses) {
            return ipAddresses(List.of(ipAddresses));
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

        public GetNetworkingIpsPlainArgs build() {
            return $;
        }
    }

}
