// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.linode.outputs.GetDatabaseEnginesEngine;
import com.pulumi.linode.outputs.GetDatabaseEnginesFilter;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDatabaseEnginesResult {
    private @Nullable List<GetDatabaseEnginesEngine> engines;
    private @Nullable List<GetDatabaseEnginesFilter> filters;
    /**
     * @return The Managed Database engine ID in engine/version format.
     * 
     */
    private String id;
    private @Nullable Boolean latest;
    private @Nullable String order;
    private @Nullable String orderBy;

    private GetDatabaseEnginesResult() {}
    public List<GetDatabaseEnginesEngine> engines() {
        return this.engines == null ? List.of() : this.engines;
    }
    public List<GetDatabaseEnginesFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return The Managed Database engine ID in engine/version format.
     * 
     */
    public String id() {
        return this.id;
    }
    public Optional<Boolean> latest() {
        return Optional.ofNullable(this.latest);
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

    public static Builder builder(GetDatabaseEnginesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<GetDatabaseEnginesEngine> engines;
        private @Nullable List<GetDatabaseEnginesFilter> filters;
        private String id;
        private @Nullable Boolean latest;
        private @Nullable String order;
        private @Nullable String orderBy;
        public Builder() {}
        public Builder(GetDatabaseEnginesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.engines = defaults.engines;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.latest = defaults.latest;
    	      this.order = defaults.order;
    	      this.orderBy = defaults.orderBy;
        }

        @CustomType.Setter
        public Builder engines(@Nullable List<GetDatabaseEnginesEngine> engines) {
            this.engines = engines;
            return this;
        }
        public Builder engines(GetDatabaseEnginesEngine... engines) {
            return engines(List.of(engines));
        }
        @CustomType.Setter
        public Builder filters(@Nullable List<GetDatabaseEnginesFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetDatabaseEnginesFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder latest(@Nullable Boolean latest) {
            this.latest = latest;
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
        public GetDatabaseEnginesResult build() {
            final var o = new GetDatabaseEnginesResult();
            o.engines = engines;
            o.filters = filters;
            o.id = id;
            o.latest = latest;
            o.order = order;
            o.orderBy = orderBy;
            return o;
        }
    }
}
