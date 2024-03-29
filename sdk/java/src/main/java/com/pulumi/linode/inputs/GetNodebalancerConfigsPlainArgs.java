// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.linode.inputs.GetNodebalancerConfigsFilter;
import com.pulumi.linode.inputs.GetNodebalancerConfigsNodebalancerConfig;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNodebalancerConfigsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNodebalancerConfigsPlainArgs Empty = new GetNodebalancerConfigsPlainArgs();

    @Import(name="filters")
    private @Nullable List<GetNodebalancerConfigsFilter> filters;

    public Optional<List<GetNodebalancerConfigsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    @Import(name="nodebalancerConfigs")
    private @Nullable List<GetNodebalancerConfigsNodebalancerConfig> nodebalancerConfigs;

    public Optional<List<GetNodebalancerConfigsNodebalancerConfig>> nodebalancerConfigs() {
        return Optional.ofNullable(this.nodebalancerConfigs);
    }

    /**
     * The ID of the NodeBalancer to access.
     * 
     * * `filter` - (Optional) A set of filters used to select Linode NodeBalancers that meet certain requirements.
     * 
     */
    @Import(name="nodebalancerId", required=true)
    private Integer nodebalancerId;

    /**
     * @return The ID of the NodeBalancer to access.
     * 
     * * `filter` - (Optional) A set of filters used to select Linode NodeBalancers that meet certain requirements.
     * 
     */
    public Integer nodebalancerId() {
        return this.nodebalancerId;
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

    private GetNodebalancerConfigsPlainArgs() {}

    private GetNodebalancerConfigsPlainArgs(GetNodebalancerConfigsPlainArgs $) {
        this.filters = $.filters;
        this.nodebalancerConfigs = $.nodebalancerConfigs;
        this.nodebalancerId = $.nodebalancerId;
        this.order = $.order;
        this.orderBy = $.orderBy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNodebalancerConfigsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNodebalancerConfigsPlainArgs $;

        public Builder() {
            $ = new GetNodebalancerConfigsPlainArgs();
        }

        public Builder(GetNodebalancerConfigsPlainArgs defaults) {
            $ = new GetNodebalancerConfigsPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder filters(@Nullable List<GetNodebalancerConfigsFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetNodebalancerConfigsFilter... filters) {
            return filters(List.of(filters));
        }

        public Builder nodebalancerConfigs(@Nullable List<GetNodebalancerConfigsNodebalancerConfig> nodebalancerConfigs) {
            $.nodebalancerConfigs = nodebalancerConfigs;
            return this;
        }

        public Builder nodebalancerConfigs(GetNodebalancerConfigsNodebalancerConfig... nodebalancerConfigs) {
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
        public Builder nodebalancerId(Integer nodebalancerId) {
            $.nodebalancerId = nodebalancerId;
            return this;
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

        public GetNodebalancerConfigsPlainArgs build() {
            if ($.nodebalancerId == null) {
                throw new MissingRequiredPropertyException("GetNodebalancerConfigsPlainArgs", "nodebalancerId");
            }
            return $;
        }
    }

}
