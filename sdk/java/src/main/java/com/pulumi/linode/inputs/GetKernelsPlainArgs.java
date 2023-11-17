// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.linode.inputs.GetKernelsFilter;
import com.pulumi.linode.inputs.GetKernelsKernel;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetKernelsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetKernelsPlainArgs Empty = new GetKernelsPlainArgs();

    /**
     * `filter` - (Optional) A set of filters used to select Linode Kernels that meet certain requirements.
     * 
     */
    @Import(name="filters")
    private @Nullable List<GetKernelsFilter> filters;

    /**
     * @return `filter` - (Optional) A set of filters used to select Linode Kernels that meet certain requirements.
     * 
     */
    public Optional<List<GetKernelsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    @Import(name="kernels")
    private @Nullable List<GetKernelsKernel> kernels;

    public Optional<List<GetKernelsKernel>> kernels() {
        return Optional.ofNullable(this.kernels);
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

    private GetKernelsPlainArgs() {}

    private GetKernelsPlainArgs(GetKernelsPlainArgs $) {
        this.filters = $.filters;
        this.kernels = $.kernels;
        this.order = $.order;
        this.orderBy = $.orderBy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetKernelsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetKernelsPlainArgs $;

        public Builder() {
            $ = new GetKernelsPlainArgs();
        }

        public Builder(GetKernelsPlainArgs defaults) {
            $ = new GetKernelsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters `filter` - (Optional) A set of filters used to select Linode Kernels that meet certain requirements.
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable List<GetKernelsFilter> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters `filter` - (Optional) A set of filters used to select Linode Kernels that meet certain requirements.
         * 
         * @return builder
         * 
         */
        public Builder filters(GetKernelsFilter... filters) {
            return filters(List.of(filters));
        }

        public Builder kernels(@Nullable List<GetKernelsKernel> kernels) {
            $.kernels = kernels;
            return this;
        }

        public Builder kernels(GetKernelsKernel... kernels) {
            return kernels(List.of(kernels));
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

        public GetKernelsPlainArgs build() {
            return $;
        }
    }

}
