// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.linode.inputs.GetNodebalancerConfigsFilterArgs;
import com.pulumi.linode.inputs.GetNodebalancerConfigsNodebalancerConfigArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNodebalancerConfigsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNodebalancerConfigsArgs Empty = new GetNodebalancerConfigsArgs();

    @Import(name="filters")
    private @Nullable Output<List<GetNodebalancerConfigsFilterArgs>> filters;

    public Optional<Output<List<GetNodebalancerConfigsFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    @Import(name="nodebalancerConfigs")
    private @Nullable Output<List<GetNodebalancerConfigsNodebalancerConfigArgs>> nodebalancerConfigs;

    public Optional<Output<List<GetNodebalancerConfigsNodebalancerConfigArgs>>> nodebalancerConfigs() {
        return Optional.ofNullable(this.nodebalancerConfigs);
    }

    /**
     * The ID of the NodeBalancer to access.
     * 
     * * `filter` - (Optional) A set of filters used to select Linode NodeBalancers that meet certain requirements.
     * 
     */
    @Import(name="nodebalancerId", required=true)
    private Output<Integer> nodebalancerId;

    /**
     * @return The ID of the NodeBalancer to access.
     * 
     * * `filter` - (Optional) A set of filters used to select Linode NodeBalancers that meet certain requirements.
     * 
     */
    public Output<Integer> nodebalancerId() {
        return this.nodebalancerId;
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

    private GetNodebalancerConfigsArgs() {}

    private GetNodebalancerConfigsArgs(GetNodebalancerConfigsArgs $) {
        this.filters = $.filters;
        this.nodebalancerConfigs = $.nodebalancerConfigs;
        this.nodebalancerId = $.nodebalancerId;
        this.order = $.order;
        this.orderBy = $.orderBy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNodebalancerConfigsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNodebalancerConfigsArgs $;

        public Builder() {
            $ = new GetNodebalancerConfigsArgs();
        }

        public Builder(GetNodebalancerConfigsArgs defaults) {
            $ = new GetNodebalancerConfigsArgs(Objects.requireNonNull(defaults));
        }

        public Builder filters(@Nullable Output<List<GetNodebalancerConfigsFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(List<GetNodebalancerConfigsFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        public Builder filters(GetNodebalancerConfigsFilterArgs... filters) {
            return filters(List.of(filters));
        }

        public Builder nodebalancerConfigs(@Nullable Output<List<GetNodebalancerConfigsNodebalancerConfigArgs>> nodebalancerConfigs) {
            $.nodebalancerConfigs = nodebalancerConfigs;
            return this;
        }

        public Builder nodebalancerConfigs(List<GetNodebalancerConfigsNodebalancerConfigArgs> nodebalancerConfigs) {
            return nodebalancerConfigs(Output.of(nodebalancerConfigs));
        }

        public Builder nodebalancerConfigs(GetNodebalancerConfigsNodebalancerConfigArgs... nodebalancerConfigs) {
            return nodebalancerConfigs(List.of(nodebalancerConfigs));
        }

        /**
         * @param nodebalancerId The ID of the NodeBalancer to access.
         * 
         * * `filter` - (Optional) A set of filters used to select Linode NodeBalancers that meet certain requirements.
         * 
         * @return builder
         * 
         */
        public Builder nodebalancerId(Output<Integer> nodebalancerId) {
            $.nodebalancerId = nodebalancerId;
            return this;
        }

        /**
         * @param nodebalancerId The ID of the NodeBalancer to access.
         * 
         * * `filter` - (Optional) A set of filters used to select Linode NodeBalancers that meet certain requirements.
         * 
         * @return builder
         * 
         */
        public Builder nodebalancerId(Integer nodebalancerId) {
            return nodebalancerId(Output.of(nodebalancerId));
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

        public GetNodebalancerConfigsArgs build() {
            if ($.nodebalancerId == null) {
                throw new MissingRequiredPropertyException("GetNodebalancerConfigsArgs", "nodebalancerId");
            }
            return $;
        }
    }

}
