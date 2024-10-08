// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetLinodeObjectStorageBucketPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLinodeObjectStorageBucketPlainArgs Empty = new GetLinodeObjectStorageBucketPlainArgs();

    /**
     * The ID of the Object Storage Cluster this bucket is in. Required if `region` is not configured.
     * 
     * @deprecated
     * The cluster attribute has been deprecated, please consider switching to the region attribute. For example, a cluster value of `us-mia-1` can be translated to a region value of `us-mia`.
     * 
     */
    @Deprecated /* The cluster attribute has been deprecated, please consider switching to the region attribute. For example, a cluster value of `us-mia-1` can be translated to a region value of `us-mia`. */
    @Import(name="cluster")
    private @Nullable String cluster;

    /**
     * @return The ID of the Object Storage Cluster this bucket is in. Required if `region` is not configured.
     * 
     * @deprecated
     * The cluster attribute has been deprecated, please consider switching to the region attribute. For example, a cluster value of `us-mia-1` can be translated to a region value of `us-mia`.
     * 
     */
    @Deprecated /* The cluster attribute has been deprecated, please consider switching to the region attribute. For example, a cluster value of `us-mia-1` can be translated to a region value of `us-mia`. */
    public Optional<String> cluster() {
        return Optional.ofNullable(this.cluster);
    }

    /**
     * The name of this bucket.
     * 
     */
    @Import(name="label", required=true)
    private String label;

    /**
     * @return The name of this bucket.
     * 
     */
    public String label() {
        return this.label;
    }

    /**
     * The ID of the region this bucket is in. Required if `cluster` is not configured.
     * 
     */
    @Import(name="region")
    private @Nullable String region;

    /**
     * @return The ID of the region this bucket is in. Required if `cluster` is not configured.
     * 
     */
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }

    private GetLinodeObjectStorageBucketPlainArgs() {}

    private GetLinodeObjectStorageBucketPlainArgs(GetLinodeObjectStorageBucketPlainArgs $) {
        this.cluster = $.cluster;
        this.label = $.label;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLinodeObjectStorageBucketPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLinodeObjectStorageBucketPlainArgs $;

        public Builder() {
            $ = new GetLinodeObjectStorageBucketPlainArgs();
        }

        public Builder(GetLinodeObjectStorageBucketPlainArgs defaults) {
            $ = new GetLinodeObjectStorageBucketPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cluster The ID of the Object Storage Cluster this bucket is in. Required if `region` is not configured.
         * 
         * @return builder
         * 
         * @deprecated
         * The cluster attribute has been deprecated, please consider switching to the region attribute. For example, a cluster value of `us-mia-1` can be translated to a region value of `us-mia`.
         * 
         */
        @Deprecated /* The cluster attribute has been deprecated, please consider switching to the region attribute. For example, a cluster value of `us-mia-1` can be translated to a region value of `us-mia`. */
        public Builder cluster(@Nullable String cluster) {
            $.cluster = cluster;
            return this;
        }

        /**
         * @param label The name of this bucket.
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            $.label = label;
            return this;
        }

        /**
         * @param region The ID of the region this bucket is in. Required if `cluster` is not configured.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable String region) {
            $.region = region;
            return this;
        }

        public GetLinodeObjectStorageBucketPlainArgs build() {
            if ($.label == null) {
                throw new MissingRequiredPropertyException("GetLinodeObjectStorageBucketPlainArgs", "label");
            }
            return $;
        }
    }

}
