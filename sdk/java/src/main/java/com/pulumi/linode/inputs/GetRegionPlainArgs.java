// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.linode.inputs.GetRegionResolver;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegionPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRegionPlainArgs Empty = new GetRegionPlainArgs();

    /**
     * The code name of the region to select.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return The code name of the region to select.
     * 
     */
    public String id() {
        return this.id;
    }

    @Import(name="resolvers")
    private @Nullable List<GetRegionResolver> resolvers;

    public Optional<List<GetRegionResolver>> resolvers() {
        return Optional.ofNullable(this.resolvers);
    }

    private GetRegionPlainArgs() {}

    private GetRegionPlainArgs(GetRegionPlainArgs $) {
        this.id = $.id;
        this.resolvers = $.resolvers;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRegionPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRegionPlainArgs $;

        public Builder() {
            $ = new GetRegionPlainArgs();
        }

        public Builder(GetRegionPlainArgs defaults) {
            $ = new GetRegionPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The code name of the region to select.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public Builder resolvers(@Nullable List<GetRegionResolver> resolvers) {
            $.resolvers = resolvers;
            return this;
        }

        public Builder resolvers(GetRegionResolver... resolvers) {
            return resolvers(List.of(resolvers));
        }

        public GetRegionPlainArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
