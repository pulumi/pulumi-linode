// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.linode.inputs.GetRegionsFilter;
import com.pulumi.linode.inputs.GetRegionsRegion;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegionsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRegionsPlainArgs Empty = new GetRegionsPlainArgs();

    @Import(name="filters")
    private @Nullable List<GetRegionsFilter> filters;

    public Optional<List<GetRegionsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    @Import(name="regions")
    private @Nullable List<GetRegionsRegion> regions;

    public Optional<List<GetRegionsRegion>> regions() {
        return Optional.ofNullable(this.regions);
    }

    private GetRegionsPlainArgs() {}

    private GetRegionsPlainArgs(GetRegionsPlainArgs $) {
        this.filters = $.filters;
        this.regions = $.regions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRegionsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRegionsPlainArgs $;

        public Builder() {
            $ = new GetRegionsPlainArgs();
        }

        public Builder(GetRegionsPlainArgs defaults) {
            $ = new GetRegionsPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder filters(@Nullable List<GetRegionsFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetRegionsFilter... filters) {
            return filters(List.of(filters));
        }

        public Builder regions(@Nullable List<GetRegionsRegion> regions) {
            $.regions = regions;
            return this;
        }

        public Builder regions(GetRegionsRegion... regions) {
            return regions(List.of(regions));
        }

        public GetRegionsPlainArgs build() {
            return $;
        }
    }

}
