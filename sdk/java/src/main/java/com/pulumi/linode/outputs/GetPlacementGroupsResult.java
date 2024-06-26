// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.linode.outputs.GetPlacementGroupsFilter;
import com.pulumi.linode.outputs.GetPlacementGroupsPlacementGroup;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPlacementGroupsResult {
    private @Nullable List<GetPlacementGroupsFilter> filters;
    private String id;
    private @Nullable String order;
    private @Nullable String orderBy;
    private @Nullable List<GetPlacementGroupsPlacementGroup> placementGroups;

    private GetPlacementGroupsResult() {}
    public List<GetPlacementGroupsFilter> filters() {
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
    public List<GetPlacementGroupsPlacementGroup> placementGroups() {
        return this.placementGroups == null ? List.of() : this.placementGroups;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPlacementGroupsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<GetPlacementGroupsFilter> filters;
        private String id;
        private @Nullable String order;
        private @Nullable String orderBy;
        private @Nullable List<GetPlacementGroupsPlacementGroup> placementGroups;
        public Builder() {}
        public Builder(GetPlacementGroupsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.order = defaults.order;
    	      this.orderBy = defaults.orderBy;
    	      this.placementGroups = defaults.placementGroups;
        }

        @CustomType.Setter
        public Builder filters(@Nullable List<GetPlacementGroupsFilter> filters) {

            this.filters = filters;
            return this;
        }
        public Builder filters(GetPlacementGroupsFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetPlacementGroupsResult", "id");
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
        public Builder placementGroups(@Nullable List<GetPlacementGroupsPlacementGroup> placementGroups) {

            this.placementGroups = placementGroups;
            return this;
        }
        public Builder placementGroups(GetPlacementGroupsPlacementGroup... placementGroups) {
            return placementGroups(List.of(placementGroups));
        }
        public GetPlacementGroupsResult build() {
            final var _resultValue = new GetPlacementGroupsResult();
            _resultValue.filters = filters;
            _resultValue.id = id;
            _resultValue.order = order;
            _resultValue.orderBy = orderBy;
            _resultValue.placementGroups = placementGroups;
            return _resultValue;
        }
    }
}
