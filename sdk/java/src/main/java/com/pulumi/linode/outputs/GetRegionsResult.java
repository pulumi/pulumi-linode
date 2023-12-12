// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.linode.outputs.GetRegionsFilter;
import com.pulumi.linode.outputs.GetRegionsRegion;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetRegionsResult {
    private @Nullable List<GetRegionsFilter> filters;
    private String id;
    private @Nullable List<GetRegionsRegion> regions;

    private GetRegionsResult() {}
    public List<GetRegionsFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    public String id() {
        return this.id;
    }
    public List<GetRegionsRegion> regions() {
        return this.regions == null ? List.of() : this.regions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegionsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<GetRegionsFilter> filters;
        private String id;
        private @Nullable List<GetRegionsRegion> regions;
        public Builder() {}
        public Builder(GetRegionsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.regions = defaults.regions;
        }

        @CustomType.Setter
        public Builder filters(@Nullable List<GetRegionsFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetRegionsFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder regions(@Nullable List<GetRegionsRegion> regions) {
            this.regions = regions;
            return this;
        }
        public Builder regions(GetRegionsRegion... regions) {
            return regions(List.of(regions));
        }
        public GetRegionsResult build() {
            final var _resultValue = new GetRegionsResult();
            _resultValue.filters = filters;
            _resultValue.id = id;
            _resultValue.regions = regions;
            return _resultValue;
        }
    }
}
