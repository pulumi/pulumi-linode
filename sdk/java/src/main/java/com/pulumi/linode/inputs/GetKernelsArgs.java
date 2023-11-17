// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.linode.inputs.GetKernelsFilterArgs;
import com.pulumi.linode.inputs.GetKernelsKernelArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetKernelsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetKernelsArgs Empty = new GetKernelsArgs();

    /**
     * `filter` - (Optional) A set of filters used to select Linode Kernels that meet certain requirements.
     * 
     */
    @Import(name="filters")
    private @Nullable Output<List<GetKernelsFilterArgs>> filters;

    /**
     * @return `filter` - (Optional) A set of filters used to select Linode Kernels that meet certain requirements.
     * 
     */
    public Optional<Output<List<GetKernelsFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    @Import(name="kernels")
    private @Nullable Output<List<GetKernelsKernelArgs>> kernels;

    public Optional<Output<List<GetKernelsKernelArgs>>> kernels() {
        return Optional.ofNullable(this.kernels);
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

    private GetKernelsArgs() {}

    private GetKernelsArgs(GetKernelsArgs $) {
        this.filters = $.filters;
        this.kernels = $.kernels;
        this.order = $.order;
        this.orderBy = $.orderBy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetKernelsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetKernelsArgs $;

        public Builder() {
            $ = new GetKernelsArgs();
        }

        public Builder(GetKernelsArgs defaults) {
            $ = new GetKernelsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters `filter` - (Optional) A set of filters used to select Linode Kernels that meet certain requirements.
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable Output<List<GetKernelsFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters `filter` - (Optional) A set of filters used to select Linode Kernels that meet certain requirements.
         * 
         * @return builder
         * 
         */
        public Builder filters(List<GetKernelsFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        /**
         * @param filters `filter` - (Optional) A set of filters used to select Linode Kernels that meet certain requirements.
         * 
         * @return builder
         * 
         */
        public Builder filters(GetKernelsFilterArgs... filters) {
            return filters(List.of(filters));
        }

        public Builder kernels(@Nullable Output<List<GetKernelsKernelArgs>> kernels) {
            $.kernels = kernels;
            return this;
        }

        public Builder kernels(List<GetKernelsKernelArgs> kernels) {
            return kernels(Output.of(kernels));
        }

        public Builder kernels(GetKernelsKernelArgs... kernels) {
            return kernels(List.of(kernels));
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

        public GetKernelsArgs build() {
            return $;
        }
    }

}
