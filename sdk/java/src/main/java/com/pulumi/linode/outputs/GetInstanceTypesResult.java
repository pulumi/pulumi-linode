// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.linode.outputs.GetInstanceTypesFilter;
import com.pulumi.linode.outputs.GetInstanceTypesType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetInstanceTypesResult {
    private @Nullable List<GetInstanceTypesFilter> filters;
    /**
     * @return The ID representing the Linode Type.
     * 
     */
    private String id;
    private @Nullable String order;
    private @Nullable String orderBy;
    private @Nullable List<GetInstanceTypesType> types;

    private GetInstanceTypesResult() {}
    public List<GetInstanceTypesFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return The ID representing the Linode Type.
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
    public List<GetInstanceTypesType> types() {
        return this.types == null ? List.of() : this.types;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceTypesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<GetInstanceTypesFilter> filters;
        private String id;
        private @Nullable String order;
        private @Nullable String orderBy;
        private @Nullable List<GetInstanceTypesType> types;
        public Builder() {}
        public Builder(GetInstanceTypesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.order = defaults.order;
    	      this.orderBy = defaults.orderBy;
    	      this.types = defaults.types;
        }

        @CustomType.Setter
        public Builder filters(@Nullable List<GetInstanceTypesFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetInstanceTypesFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
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
        public Builder types(@Nullable List<GetInstanceTypesType> types) {
            this.types = types;
            return this;
        }
        public Builder types(GetInstanceTypesType... types) {
            return types(List.of(types));
        }
        public GetInstanceTypesResult build() {
            final var o = new GetInstanceTypesResult();
            o.filters = filters;
            o.id = id;
            o.order = order;
            o.orderBy = orderBy;
            o.types = types;
            return o;
        }
    }
}
