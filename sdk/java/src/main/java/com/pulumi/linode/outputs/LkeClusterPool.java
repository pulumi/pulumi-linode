// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.linode.outputs.LkeClusterPoolAutoscaler;
import com.pulumi.linode.outputs.LkeClusterPoolNode;
import com.pulumi.linode.outputs.LkeClusterPoolTaint;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LkeClusterPool {
    /**
     * @return When specified, the number of nodes autoscales within the defined minimum and maximum values.
     * 
     */
    private @Nullable LkeClusterPoolAutoscaler autoscaler;
    /**
     * @return The number of nodes in the Node Pool. If undefined with an autoscaler the initial node count will equal the autoscaler minimum.
     * 
     * * `autoscaler` - (Optional) If defined, an autoscaler will be enabled with the given configuration.
     * 
     */
    private @Nullable Integer count;
    /**
     * @return The disk encryption policy for nodes in this pool.
     * 
     */
    private @Nullable String diskEncryption;
    /**
     * @return The ID of the node.
     * 
     */
    private @Nullable Integer id;
    /**
     * @return Key-value pairs added as labels to nodes in the node pool. Labels help classify your nodes and to easily select subsets of objects.
     * 
     */
    private @Nullable Map<String,String> labels;
    /**
     * @return The nodes in the node pool.
     * 
     */
    private @Nullable List<LkeClusterPoolNode> nodes;
    /**
     * @return An array of tags applied to the Kubernetes cluster. Tags are case-insensitive and are for organizational purposes only.
     * 
     */
    private @Nullable List<String> tags;
    /**
     * @return Kubernetes taints to add to node pool nodes. Taints help control how pods are scheduled onto nodes, specifically allowing them to repel certain pods.
     * 
     */
    private @Nullable List<LkeClusterPoolTaint> taints;
    /**
     * @return A Linode Type for all of the nodes in the Node Pool. See all node types [here](https://api.linode.com/v4/linode/types).
     * 
     */
    private String type;

    private LkeClusterPool() {}
    /**
     * @return When specified, the number of nodes autoscales within the defined minimum and maximum values.
     * 
     */
    public Optional<LkeClusterPoolAutoscaler> autoscaler() {
        return Optional.ofNullable(this.autoscaler);
    }
    /**
     * @return The number of nodes in the Node Pool. If undefined with an autoscaler the initial node count will equal the autoscaler minimum.
     * 
     * * `autoscaler` - (Optional) If defined, an autoscaler will be enabled with the given configuration.
     * 
     */
    public Optional<Integer> count() {
        return Optional.ofNullable(this.count);
    }
    /**
     * @return The disk encryption policy for nodes in this pool.
     * 
     */
    public Optional<String> diskEncryption() {
        return Optional.ofNullable(this.diskEncryption);
    }
    /**
     * @return The ID of the node.
     * 
     */
    public Optional<Integer> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return Key-value pairs added as labels to nodes in the node pool. Labels help classify your nodes and to easily select subsets of objects.
     * 
     */
    public Map<String,String> labels() {
        return this.labels == null ? Map.of() : this.labels;
    }
    /**
     * @return The nodes in the node pool.
     * 
     */
    public List<LkeClusterPoolNode> nodes() {
        return this.nodes == null ? List.of() : this.nodes;
    }
    /**
     * @return An array of tags applied to the Kubernetes cluster. Tags are case-insensitive and are for organizational purposes only.
     * 
     */
    public List<String> tags() {
        return this.tags == null ? List.of() : this.tags;
    }
    /**
     * @return Kubernetes taints to add to node pool nodes. Taints help control how pods are scheduled onto nodes, specifically allowing them to repel certain pods.
     * 
     */
    public List<LkeClusterPoolTaint> taints() {
        return this.taints == null ? List.of() : this.taints;
    }
    /**
     * @return A Linode Type for all of the nodes in the Node Pool. See all node types [here](https://api.linode.com/v4/linode/types).
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LkeClusterPool defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable LkeClusterPoolAutoscaler autoscaler;
        private @Nullable Integer count;
        private @Nullable String diskEncryption;
        private @Nullable Integer id;
        private @Nullable Map<String,String> labels;
        private @Nullable List<LkeClusterPoolNode> nodes;
        private @Nullable List<String> tags;
        private @Nullable List<LkeClusterPoolTaint> taints;
        private String type;
        public Builder() {}
        public Builder(LkeClusterPool defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoscaler = defaults.autoscaler;
    	      this.count = defaults.count;
    	      this.diskEncryption = defaults.diskEncryption;
    	      this.id = defaults.id;
    	      this.labels = defaults.labels;
    	      this.nodes = defaults.nodes;
    	      this.tags = defaults.tags;
    	      this.taints = defaults.taints;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder autoscaler(@Nullable LkeClusterPoolAutoscaler autoscaler) {

            this.autoscaler = autoscaler;
            return this;
        }
        @CustomType.Setter
        public Builder count(@Nullable Integer count) {

            this.count = count;
            return this;
        }
        @CustomType.Setter
        public Builder diskEncryption(@Nullable String diskEncryption) {

            this.diskEncryption = diskEncryption;
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable Integer id) {

            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder labels(@Nullable Map<String,String> labels) {

            this.labels = labels;
            return this;
        }
        @CustomType.Setter
        public Builder nodes(@Nullable List<LkeClusterPoolNode> nodes) {

            this.nodes = nodes;
            return this;
        }
        public Builder nodes(LkeClusterPoolNode... nodes) {
            return nodes(List.of(nodes));
        }
        @CustomType.Setter
        public Builder tags(@Nullable List<String> tags) {

            this.tags = tags;
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        @CustomType.Setter
        public Builder taints(@Nullable List<LkeClusterPoolTaint> taints) {

            this.taints = taints;
            return this;
        }
        public Builder taints(LkeClusterPoolTaint... taints) {
            return taints(List.of(taints));
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("LkeClusterPool", "type");
            }
            this.type = type;
            return this;
        }
        public LkeClusterPool build() {
            final var _resultValue = new LkeClusterPool();
            _resultValue.autoscaler = autoscaler;
            _resultValue.count = count;
            _resultValue.diskEncryption = diskEncryption;
            _resultValue.id = id;
            _resultValue.labels = labels;
            _resultValue.nodes = nodes;
            _resultValue.tags = tags;
            _resultValue.taints = taints;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
