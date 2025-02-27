// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.linode.outputs.GetObjectStorageEndpointsEndpoint;
import com.pulumi.linode.outputs.GetObjectStorageEndpointsFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetObjectStorageEndpointsResult {
    private @Nullable List<GetObjectStorageEndpointsEndpoint> endpoints;
    private @Nullable List<GetObjectStorageEndpointsFilter> filters;
    private String id;
    private @Nullable String order;
    private @Nullable String orderBy;

    private GetObjectStorageEndpointsResult() {}
    public List<GetObjectStorageEndpointsEndpoint> endpoints() {
        return this.endpoints == null ? List.of() : this.endpoints;
    }
    public List<GetObjectStorageEndpointsFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    public String id() {
        return this.id;
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

    public static Builder builder(GetObjectStorageEndpointsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<GetObjectStorageEndpointsEndpoint> endpoints;
        private @Nullable List<GetObjectStorageEndpointsFilter> filters;
        private String id;
        private @Nullable String order;
        private @Nullable String orderBy;
        public Builder() {}
        public Builder(GetObjectStorageEndpointsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoints = defaults.endpoints;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.order = defaults.order;
    	      this.orderBy = defaults.orderBy;
        }

        @CustomType.Setter
        public Builder endpoints(@Nullable List<GetObjectStorageEndpointsEndpoint> endpoints) {

            this.endpoints = endpoints;
            return this;
        }
        public Builder endpoints(GetObjectStorageEndpointsEndpoint... endpoints) {
            return endpoints(List.of(endpoints));
        }
        @CustomType.Setter
        public Builder filters(@Nullable List<GetObjectStorageEndpointsFilter> filters) {

            this.filters = filters;
            return this;
        }
        public Builder filters(GetObjectStorageEndpointsFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetObjectStorageEndpointsResult", "id");
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
        public GetObjectStorageEndpointsResult build() {
            final var _resultValue = new GetObjectStorageEndpointsResult();
            _resultValue.endpoints = endpoints;
            _resultValue.filters = filters;
            _resultValue.id = id;
            _resultValue.order = order;
            _resultValue.orderBy = orderBy;
            return _resultValue;
        }
    }
}
