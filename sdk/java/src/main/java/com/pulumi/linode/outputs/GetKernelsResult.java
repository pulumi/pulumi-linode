// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.linode.outputs.GetKernelsFilter;
import com.pulumi.linode.outputs.GetKernelsKernel;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetKernelsResult {
    private @Nullable List<GetKernelsFilter> filters;
    /**
     * @return The unique ID of this Kernel.
     * 
     */
    private String id;
    private @Nullable List<GetKernelsKernel> kernels;
    private @Nullable String order;
    private @Nullable String orderBy;

    private GetKernelsResult() {}
    public List<GetKernelsFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return The unique ID of this Kernel.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<GetKernelsKernel> kernels() {
        return this.kernels == null ? List.of() : this.kernels;
    }
    public Optional<String> order() {
        return Optional.ofNullable(this.order);
    }
    public Optional<String> orderBy() {
        return Optional.ofNullable(this.orderBy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKernelsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<GetKernelsFilter> filters;
        private String id;
        private @Nullable List<GetKernelsKernel> kernels;
        private @Nullable String order;
        private @Nullable String orderBy;
        public Builder() {}
        public Builder(GetKernelsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.kernels = defaults.kernels;
    	      this.order = defaults.order;
    	      this.orderBy = defaults.orderBy;
        }

        @CustomType.Setter
        public Builder filters(@Nullable List<GetKernelsFilter> filters) {

            this.filters = filters;
            return this;
        }
        public Builder filters(GetKernelsFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetKernelsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder kernels(@Nullable List<GetKernelsKernel> kernels) {

            this.kernels = kernels;
            return this;
        }
        public Builder kernels(GetKernelsKernel... kernels) {
            return kernels(List.of(kernels));
        }
        @CustomType.Setter
        public Builder order(@Nullable String order) {

            this.order = order;
            return this;
        }
        @CustomType.Setter
        public Builder orderBy(@Nullable String orderBy) {

            this.orderBy = orderBy;
            return this;
        }
        public GetKernelsResult build() {
            final var _resultValue = new GetKernelsResult();
            _resultValue.filters = filters;
            _resultValue.id = id;
            _resultValue.kernels = kernels;
            _resultValue.order = order;
            _resultValue.orderBy = orderBy;
            return _resultValue;
        }
    }
}
