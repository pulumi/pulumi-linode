// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.linode.inputs.LkeClusterPoolAutoscalerArgs;
import com.pulumi.linode.inputs.LkeClusterPoolNodeArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LkeClusterPoolArgs extends com.pulumi.resources.ResourceArgs {

    public static final LkeClusterPoolArgs Empty = new LkeClusterPoolArgs();

    /**
     * When specified, the number of nodes autoscales within the defined minimum and maximum values.
     * 
     */
    @Import(name="autoscaler")
    private @Nullable Output<LkeClusterPoolAutoscalerArgs> autoscaler;

    /**
     * @return When specified, the number of nodes autoscales within the defined minimum and maximum values.
     * 
     */
    public Optional<Output<LkeClusterPoolAutoscalerArgs>> autoscaler() {
        return Optional.ofNullable(this.autoscaler);
    }

    /**
     * The number of nodes in the Node Pool. If undefined with an autoscaler the initial node count will equal the autoscaler minimum.
     * 
     * * `autoscaler` - (Optional) If defined, an autoscaler will be enabled with the given configuration.
     * 
     */
    @Import(name="count")
    private @Nullable Output<Integer> count;

    /**
     * @return The number of nodes in the Node Pool. If undefined with an autoscaler the initial node count will equal the autoscaler minimum.
     * 
     * * `autoscaler` - (Optional) If defined, an autoscaler will be enabled with the given configuration.
     * 
     */
    public Optional<Output<Integer>> count() {
        return Optional.ofNullable(this.count);
    }

    /**
     * The ID of the node.
     * 
     */
    @Import(name="id")
    private @Nullable Output<Integer> id;

    /**
     * @return The ID of the node.
     * 
     */
    public Optional<Output<Integer>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The nodes in the node pool.
     * 
     */
    @Import(name="nodes")
    private @Nullable Output<List<LkeClusterPoolNodeArgs>> nodes;

    /**
     * @return The nodes in the node pool.
     * 
     */
    public Optional<Output<List<LkeClusterPoolNodeArgs>>> nodes() {
        return Optional.ofNullable(this.nodes);
    }

    /**
     * An array of tags applied to the Kubernetes cluster. Tags are case-insensitive and are for organizational purposes only.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return An array of tags applied to the Kubernetes cluster. Tags are case-insensitive and are for organizational purposes only.
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A Linode Type for all of the nodes in the Node Pool. See all node types [here](https://api.linode.com/v4/linode/types).
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return A Linode Type for all of the nodes in the Node Pool. See all node types [here](https://api.linode.com/v4/linode/types).
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private LkeClusterPoolArgs() {}

    private LkeClusterPoolArgs(LkeClusterPoolArgs $) {
        this.autoscaler = $.autoscaler;
        this.count = $.count;
        this.id = $.id;
        this.nodes = $.nodes;
        this.tags = $.tags;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LkeClusterPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LkeClusterPoolArgs $;

        public Builder() {
            $ = new LkeClusterPoolArgs();
        }

        public Builder(LkeClusterPoolArgs defaults) {
            $ = new LkeClusterPoolArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoscaler When specified, the number of nodes autoscales within the defined minimum and maximum values.
         * 
         * @return builder
         * 
         */
        public Builder autoscaler(@Nullable Output<LkeClusterPoolAutoscalerArgs> autoscaler) {
            $.autoscaler = autoscaler;
            return this;
        }

        /**
         * @param autoscaler When specified, the number of nodes autoscales within the defined minimum and maximum values.
         * 
         * @return builder
         * 
         */
        public Builder autoscaler(LkeClusterPoolAutoscalerArgs autoscaler) {
            return autoscaler(Output.of(autoscaler));
        }

        /**
         * @param count The number of nodes in the Node Pool. If undefined with an autoscaler the initial node count will equal the autoscaler minimum.
         * 
         * * `autoscaler` - (Optional) If defined, an autoscaler will be enabled with the given configuration.
         * 
         * @return builder
         * 
         */
        public Builder count(@Nullable Output<Integer> count) {
            $.count = count;
            return this;
        }

        /**
         * @param count The number of nodes in the Node Pool. If undefined with an autoscaler the initial node count will equal the autoscaler minimum.
         * 
         * * `autoscaler` - (Optional) If defined, an autoscaler will be enabled with the given configuration.
         * 
         * @return builder
         * 
         */
        public Builder count(Integer count) {
            return count(Output.of(count));
        }

        /**
         * @param id The ID of the node.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<Integer> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of the node.
         * 
         * @return builder
         * 
         */
        public Builder id(Integer id) {
            return id(Output.of(id));
        }

        /**
         * @param nodes The nodes in the node pool.
         * 
         * @return builder
         * 
         */
        public Builder nodes(@Nullable Output<List<LkeClusterPoolNodeArgs>> nodes) {
            $.nodes = nodes;
            return this;
        }

        /**
         * @param nodes The nodes in the node pool.
         * 
         * @return builder
         * 
         */
        public Builder nodes(List<LkeClusterPoolNodeArgs> nodes) {
            return nodes(Output.of(nodes));
        }

        /**
         * @param nodes The nodes in the node pool.
         * 
         * @return builder
         * 
         */
        public Builder nodes(LkeClusterPoolNodeArgs... nodes) {
            return nodes(List.of(nodes));
        }

        /**
         * @param tags An array of tags applied to the Kubernetes cluster. Tags are case-insensitive and are for organizational purposes only.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags An array of tags applied to the Kubernetes cluster. Tags are case-insensitive and are for organizational purposes only.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags An array of tags applied to the Kubernetes cluster. Tags are case-insensitive and are for organizational purposes only.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param type A Linode Type for all of the nodes in the Node Pool. See all node types [here](https://api.linode.com/v4/linode/types).
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type A Linode Type for all of the nodes in the Node Pool. See all node types [here](https://api.linode.com/v4/linode/types).
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public LkeClusterPoolArgs build() {
            if ($.type == null) {
                throw new MissingRequiredPropertyException("LkeClusterPoolArgs", "type");
            }
            return $;
        }
    }

}
