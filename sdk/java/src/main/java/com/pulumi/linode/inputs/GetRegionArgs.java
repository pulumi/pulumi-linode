// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.linode.inputs.GetRegionResolverArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRegionArgs Empty = new GetRegionArgs();

    /**
     * The code name of the region to select.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The code name of the region to select.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    @Import(name="resolvers")
    private @Nullable Output<List<GetRegionResolverArgs>> resolvers;

    public Optional<Output<List<GetRegionResolverArgs>>> resolvers() {
        return Optional.ofNullable(this.resolvers);
    }

    private GetRegionArgs() {}

    private GetRegionArgs(GetRegionArgs $) {
        this.id = $.id;
        this.resolvers = $.resolvers;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRegionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRegionArgs $;

        public Builder() {
            $ = new GetRegionArgs();
        }

        public Builder(GetRegionArgs defaults) {
            $ = new GetRegionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The code name of the region to select.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The code name of the region to select.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public Builder resolvers(@Nullable Output<List<GetRegionResolverArgs>> resolvers) {
            $.resolvers = resolvers;
            return this;
        }

        public Builder resolvers(List<GetRegionResolverArgs> resolvers) {
            return resolvers(Output.of(resolvers));
        }

        public Builder resolvers(GetRegionResolverArgs... resolvers) {
            return resolvers(List.of(resolvers));
        }

        public GetRegionArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetRegionArgs", "id");
            }
            return $;
        }
    }

}
