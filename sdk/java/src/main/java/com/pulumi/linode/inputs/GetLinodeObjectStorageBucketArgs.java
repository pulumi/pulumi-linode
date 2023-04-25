// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetLinodeObjectStorageBucketArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLinodeObjectStorageBucketArgs Empty = new GetLinodeObjectStorageBucketArgs();

    @Import(name="cluster", required=true)
    private Output<String> cluster;

    public Output<String> cluster() {
        return this.cluster;
    }

    @Import(name="label", required=true)
    private Output<String> label;

    public Output<String> label() {
        return this.label;
    }

    private GetLinodeObjectStorageBucketArgs() {}

    private GetLinodeObjectStorageBucketArgs(GetLinodeObjectStorageBucketArgs $) {
        this.cluster = $.cluster;
        this.label = $.label;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLinodeObjectStorageBucketArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLinodeObjectStorageBucketArgs $;

        public Builder() {
            $ = new GetLinodeObjectStorageBucketArgs();
        }

        public Builder(GetLinodeObjectStorageBucketArgs defaults) {
            $ = new GetLinodeObjectStorageBucketArgs(Objects.requireNonNull(defaults));
        }

        public Builder cluster(Output<String> cluster) {
            $.cluster = cluster;
            return this;
        }

        public Builder cluster(String cluster) {
            return cluster(Output.of(cluster));
        }

        public Builder label(Output<String> label) {
            $.label = label;
            return this;
        }

        public Builder label(String label) {
            return label(Output.of(label));
        }

        public GetLinodeObjectStorageBucketArgs build() {
            $.cluster = Objects.requireNonNull($.cluster, "expected parameter 'cluster' to be non-null");
            $.label = Objects.requireNonNull($.label, "expected parameter 'label' to be non-null");
            return $;
        }
    }

}
