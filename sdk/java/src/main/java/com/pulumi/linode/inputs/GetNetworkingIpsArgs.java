// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.linode.inputs.GetNetworkingIpsFilterArgs;
import com.pulumi.linode.inputs.GetNetworkingIpsIpAddressArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNetworkingIpsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNetworkingIpsArgs Empty = new GetNetworkingIpsArgs();

    @Import(name="filters")
    private @Nullable Output<List<GetNetworkingIpsFilterArgs>> filters;

    public Optional<Output<List<GetNetworkingIpsFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    @Import(name="ipAddresses")
    private @Nullable Output<List<GetNetworkingIpsIpAddressArgs>> ipAddresses;

    public Optional<Output<List<GetNetworkingIpsIpAddressArgs>>> ipAddresses() {
        return Optional.ofNullable(this.ipAddresses);
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

    private GetNetworkingIpsArgs() {}

    private GetNetworkingIpsArgs(GetNetworkingIpsArgs $) {
        this.filters = $.filters;
        this.ipAddresses = $.ipAddresses;
        this.order = $.order;
        this.orderBy = $.orderBy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNetworkingIpsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNetworkingIpsArgs $;

        public Builder() {
            $ = new GetNetworkingIpsArgs();
        }

        public Builder(GetNetworkingIpsArgs defaults) {
            $ = new GetNetworkingIpsArgs(Objects.requireNonNull(defaults));
        }

        public Builder filters(@Nullable Output<List<GetNetworkingIpsFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(List<GetNetworkingIpsFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        public Builder filters(GetNetworkingIpsFilterArgs... filters) {
            return filters(List.of(filters));
        }

        public Builder ipAddresses(@Nullable Output<List<GetNetworkingIpsIpAddressArgs>> ipAddresses) {
            $.ipAddresses = ipAddresses;
            return this;
        }

        public Builder ipAddresses(List<GetNetworkingIpsIpAddressArgs> ipAddresses) {
            return ipAddresses(Output.of(ipAddresses));
        }

        public Builder ipAddresses(GetNetworkingIpsIpAddressArgs... ipAddresses) {
            return ipAddresses(List.of(ipAddresses));
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

        public GetNetworkingIpsArgs build() {
            return $;
        }
    }

}
