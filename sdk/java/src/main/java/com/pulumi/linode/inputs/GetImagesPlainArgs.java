// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.linode.inputs.GetImagesFilter;
import com.pulumi.linode.inputs.GetImagesImage;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetImagesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetImagesPlainArgs Empty = new GetImagesPlainArgs();

    @Import(name="filters")
    private @Nullable List<GetImagesFilter> filters;

    public Optional<List<GetImagesFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    @Import(name="images")
    private @Nullable List<GetImagesImage> images;

    public Optional<List<GetImagesImage>> images() {
        return Optional.ofNullable(this.images);
    }

    /**
     * If true, only the latest image will be returned. Images without a valid `created` field are not included in the result.
     * 
     * * `filter` - (Optional) A set of filters used to select Linode images that meet certain requirements.
     * 
     */
    @Import(name="latest")
    private @Nullable Boolean latest;

    /**
     * @return If true, only the latest image will be returned. Images without a valid `created` field are not included in the result.
     * 
     * * `filter` - (Optional) A set of filters used to select Linode images that meet certain requirements.
     * 
     */
    public Optional<Boolean> latest() {
        return Optional.ofNullable(this.latest);
    }

    /**
     * The order in which results should be returned. (`asc`, `desc`; default `asc`)
     * 
     */
    @Import(name="order")
    private @Nullable String order;

    /**
     * @return The order in which results should be returned. (`asc`, `desc`; default `asc`)
     * 
     */
    public Optional<String> order() {
        return Optional.ofNullable(this.order);
    }

    /**
     * The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
     * 
     */
    @Import(name="orderBy")
    private @Nullable String orderBy;

    /**
     * @return The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
     * 
     */
    public Optional<String> orderBy() {
        return Optional.ofNullable(this.orderBy);
    }

    private GetImagesPlainArgs() {}

    private GetImagesPlainArgs(GetImagesPlainArgs $) {
        this.filters = $.filters;
        this.images = $.images;
        this.latest = $.latest;
        this.order = $.order;
        this.orderBy = $.orderBy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImagesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImagesPlainArgs $;

        public Builder() {
            $ = new GetImagesPlainArgs();
        }

        public Builder(GetImagesPlainArgs defaults) {
            $ = new GetImagesPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder filters(@Nullable List<GetImagesFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetImagesFilter... filters) {
            return filters(List.of(filters));
        }

        public Builder images(@Nullable List<GetImagesImage> images) {
            $.images = images;
            return this;
        }

        public Builder images(GetImagesImage... images) {
            return images(List.of(images));
        }

        /**
         * @param latest If true, only the latest image will be returned. Images without a valid `created` field are not included in the result.
         * 
         * * `filter` - (Optional) A set of filters used to select Linode images that meet certain requirements.
         * 
         * @return builder
         * 
         */
        public Builder latest(@Nullable Boolean latest) {
            $.latest = latest;
            return this;
        }

        /**
         * @param order The order in which results should be returned. (`asc`, `desc`; default `asc`)
         * 
         * @return builder
         * 
         */
        public Builder order(@Nullable String order) {
            $.order = order;
            return this;
        }

        /**
         * @param orderBy The attribute to order the results by. See the Filterable Fields section for a list of valid fields.
         * 
         * @return builder
         * 
         */
        public Builder orderBy(@Nullable String orderBy) {
            $.orderBy = orderBy;
            return this;
        }

        public GetImagesPlainArgs build() {
            return $;
        }
    }

}
