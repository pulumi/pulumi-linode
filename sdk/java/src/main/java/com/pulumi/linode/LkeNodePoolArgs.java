// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.linode.inputs.LkeNodePoolAutoscalerArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LkeNodePoolArgs extends com.pulumi.resources.ResourceArgs {

    public static final LkeNodePoolArgs Empty = new LkeNodePoolArgs();

    @Import(name="autoscaler")
    private @Nullable Output<LkeNodePoolAutoscalerArgs> autoscaler;

    public Optional<Output<LkeNodePoolAutoscalerArgs>> autoscaler() {
        return Optional.ofNullable(this.autoscaler);
    }

    /**
     * The ID of the cluster to associate this node pool with.
     * 
     */
    @Import(name="clusterId", required=true)
    private Output<Integer> clusterId;

    /**
     * @return The ID of the cluster to associate this node pool with.
     * 
     */
    public Output<Integer> clusterId() {
        return this.clusterId;
    }

    /**
     * The number of nodes in the Node Pool.
     * 
     */
    @Import(name="nodeCount")
    private @Nullable Output<Integer> nodeCount;

    /**
     * @return The number of nodes in the Node Pool.
     * 
     */
    public Optional<Output<Integer>> nodeCount() {
        return Optional.ofNullable(this.nodeCount);
    }

    /**
     * An array of tags applied to this object. Tags are for organizational purposes only.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return An array of tags applied to this object. Tags are for organizational purposes only.
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The type of node pool.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The type of node pool.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private LkeNodePoolArgs() {}

    private LkeNodePoolArgs(LkeNodePoolArgs $) {
        this.autoscaler = $.autoscaler;
        this.clusterId = $.clusterId;
        this.nodeCount = $.nodeCount;
        this.tags = $.tags;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LkeNodePoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LkeNodePoolArgs $;

        public Builder() {
            $ = new LkeNodePoolArgs();
        }

        public Builder(LkeNodePoolArgs defaults) {
            $ = new LkeNodePoolArgs(Objects.requireNonNull(defaults));
        }

        public Builder autoscaler(@Nullable Output<LkeNodePoolAutoscalerArgs> autoscaler) {
            $.autoscaler = autoscaler;
            return this;
        }

        public Builder autoscaler(LkeNodePoolAutoscalerArgs autoscaler) {
            return autoscaler(Output.of(autoscaler));
        }

        /**
         * @param clusterId The ID of the cluster to associate this node pool with.
         * 
         * @return builder
         * 
         */
        public Builder clusterId(Output<Integer> clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        /**
         * @param clusterId The ID of the cluster to associate this node pool with.
         * 
         * @return builder
         * 
         */
        public Builder clusterId(Integer clusterId) {
            return clusterId(Output.of(clusterId));
        }

        /**
         * @param nodeCount The number of nodes in the Node Pool.
         * 
         * @return builder
         * 
         */
        public Builder nodeCount(@Nullable Output<Integer> nodeCount) {
            $.nodeCount = nodeCount;
            return this;
        }

        /**
         * @param nodeCount The number of nodes in the Node Pool.
         * 
         * @return builder
         * 
         */
        public Builder nodeCount(Integer nodeCount) {
            return nodeCount(Output.of(nodeCount));
        }

        /**
         * @param tags An array of tags applied to this object. Tags are for organizational purposes only.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags An array of tags applied to this object. Tags are for organizational purposes only.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags An array of tags applied to this object. Tags are for organizational purposes only.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param type The type of node pool.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of node pool.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public LkeNodePoolArgs build() {
            if ($.clusterId == null) {
                throw new MissingRequiredPropertyException("LkeNodePoolArgs", "clusterId");
            }
            if ($.type == null) {
                throw new MissingRequiredPropertyException("LkeNodePoolArgs", "type");
            }
            return $;
        }
    }

}
