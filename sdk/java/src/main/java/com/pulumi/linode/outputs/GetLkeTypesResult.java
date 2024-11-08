// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.linode.outputs.GetLkeTypesFilter;
import com.pulumi.linode.outputs.GetLkeTypesType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetLkeTypesResult {
    private @Nullable List<GetLkeTypesFilter> filters;
    /**
     * @return The ID representing the Kubernetes type.
     * 
     */
    private String id;
    private @Nullable String order;
    private @Nullable String orderBy;
    private @Nullable List<GetLkeTypesType> types;

    private GetLkeTypesResult() {}
    public List<GetLkeTypesFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return The ID representing the Kubernetes type.
     * 
     */
    public String id() {
        return this.id;
    }
    public Optional<String> order() {
        return Optional.ofNullable(this.order);
    }
    public Optional<String> orderBy() {
        return Optional.ofNullable(this.orderBy);
    }
    public List<GetLkeTypesType> types() {
        return this.types == null ? List.of() : this.types;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLkeTypesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<GetLkeTypesFilter> filters;
        private String id;
        private @Nullable String order;
        private @Nullable String orderBy;
        private @Nullable List<GetLkeTypesType> types;
        public Builder() {}
        public Builder(GetLkeTypesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.order = defaults.order;
    	      this.orderBy = defaults.orderBy;
    	      this.types = defaults.types;
        }

        @CustomType.Setter
        public Builder filters(@Nullable List<GetLkeTypesFilter> filters) {

            this.filters = filters;
            return this;
        }
        public Builder filters(GetLkeTypesFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetLkeTypesResult", "id");
            }
            this.id = id;
            return this;
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
        @CustomType.Setter
        public Builder types(@Nullable List<GetLkeTypesType> types) {

            this.types = types;
            return this;
        }
        public Builder types(GetLkeTypesType... types) {
            return types(List.of(types));
        }
        public GetLkeTypesResult build() {
            final var _resultValue = new GetLkeTypesResult();
            _resultValue.filters = filters;
            _resultValue.id = id;
            _resultValue.order = order;
            _resultValue.orderBy = orderBy;
            _resultValue.types = types;
            return _resultValue;
        }
    }
}
