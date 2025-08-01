// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.linode.outputs.GetLkeClusterPoolAutoscaler;
import com.pulumi.linode.outputs.GetLkeClusterPoolDisk;
import com.pulumi.linode.outputs.GetLkeClusterPoolNode;
import com.pulumi.linode.outputs.GetLkeClusterPoolTaint;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetLkeClusterPool {
    /**
     * @return The configuration options for the autoscaler. This field only contains an autoscaler configuration if autoscaling is enabled on this cluster.
     * 
     */
    private @Nullable List<GetLkeClusterPoolAutoscaler> autoscalers;
    /**
     * @return The number of nodes in the Node Pool.
     * 
     */
    private Integer count;
    /**
     * @return The disk encryption policy for nodes in this pool.
     * 
     */
    private String diskEncryption;
    /**
     * @return This Node Pool’s custom disk layout.
     * 
     */
    private @Nullable List<GetLkeClusterPoolDisk> disks;
    /**
     * @return The LKE Cluster&#39;s ID.
     * 
     */
    private Integer id;
    /**
     * @return The k8s version of the nodes in this Node Pool. For LKE enterprise only and may not currently available to all users even under v4beta.
     * 
     */
    private String k8sVersion;
    /**
     * @return Key-value pairs added as labels to nodes in the node pool. Labels help classify your nodes and to easily select subsets of objects.
     * 
     */
    private Map<String,String> labels;
    /**
     * @return The nodes in the Node Pool.
     * 
     */
    private @Nullable List<GetLkeClusterPoolNode> nodes;
    /**
     * @return An array of tags applied to this object. Tags are case-insensitive and are for organizational purposes only.
     * 
     */
    private List<String> tags;
    /**
     * @return Kubernetes taints to add to node pool nodes. Taints help control how pods are scheduled onto nodes, specifically allowing them to repel certain pods.
     * 
     */
    private List<GetLkeClusterPoolTaint> taints;
    /**
     * @return The linode type for all of the nodes in the Node Pool. See all node types [here](https://api.linode.com/v4/linode/types).
     * 
     */
    private String type;
    /**
     * @return The strategy for updating the Node Pool k8s version. For LKE enterprise only and may not currently available to all users even under v4beta.
     * 
     */
    private String updateStrategy;

    private GetLkeClusterPool() {}
    /**
     * @return The configuration options for the autoscaler. This field only contains an autoscaler configuration if autoscaling is enabled on this cluster.
     * 
     */
    public List<GetLkeClusterPoolAutoscaler> autoscalers() {
        return this.autoscalers == null ? List.of() : this.autoscalers;
    }
    /**
     * @return The number of nodes in the Node Pool.
     * 
     */
    public Integer count() {
        return this.count;
    }
    /**
     * @return The disk encryption policy for nodes in this pool.
     * 
     */
    public String diskEncryption() {
        return this.diskEncryption;
    }
    /**
     * @return This Node Pool’s custom disk layout.
     * 
     */
    public List<GetLkeClusterPoolDisk> disks() {
        return this.disks == null ? List.of() : this.disks;
    }
    /**
     * @return The LKE Cluster&#39;s ID.
     * 
     */
    public Integer id() {
        return this.id;
    }
    /**
     * @return The k8s version of the nodes in this Node Pool. For LKE enterprise only and may not currently available to all users even under v4beta.
     * 
     */
    public String k8sVersion() {
        return this.k8sVersion;
    }
    /**
     * @return Key-value pairs added as labels to nodes in the node pool. Labels help classify your nodes and to easily select subsets of objects.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return The nodes in the Node Pool.
     * 
     */
    public List<GetLkeClusterPoolNode> nodes() {
        return this.nodes == null ? List.of() : this.nodes;
    }
    /**
     * @return An array of tags applied to this object. Tags are case-insensitive and are for organizational purposes only.
     * 
     */
    public List<String> tags() {
        return this.tags;
    }
    /**
     * @return Kubernetes taints to add to node pool nodes. Taints help control how pods are scheduled onto nodes, specifically allowing them to repel certain pods.
     * 
     */
    public List<GetLkeClusterPoolTaint> taints() {
        return this.taints;
    }
    /**
     * @return The linode type for all of the nodes in the Node Pool. See all node types [here](https://api.linode.com/v4/linode/types).
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The strategy for updating the Node Pool k8s version. For LKE enterprise only and may not currently available to all users even under v4beta.
     * 
     */
    public String updateStrategy() {
        return this.updateStrategy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLkeClusterPool defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<GetLkeClusterPoolAutoscaler> autoscalers;
        private Integer count;
        private String diskEncryption;
        private @Nullable List<GetLkeClusterPoolDisk> disks;
        private Integer id;
        private String k8sVersion;
        private Map<String,String> labels;
        private @Nullable List<GetLkeClusterPoolNode> nodes;
        private List<String> tags;
        private List<GetLkeClusterPoolTaint> taints;
        private String type;
        private String updateStrategy;
        public Builder() {}
        public Builder(GetLkeClusterPool defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoscalers = defaults.autoscalers;
    	      this.count = defaults.count;
    	      this.diskEncryption = defaults.diskEncryption;
    	      this.disks = defaults.disks;
    	      this.id = defaults.id;
    	      this.k8sVersion = defaults.k8sVersion;
    	      this.labels = defaults.labels;
    	      this.nodes = defaults.nodes;
    	      this.tags = defaults.tags;
    	      this.taints = defaults.taints;
    	      this.type = defaults.type;
    	      this.updateStrategy = defaults.updateStrategy;
        }

        @CustomType.Setter
        public Builder autoscalers(@Nullable List<GetLkeClusterPoolAutoscaler> autoscalers) {

            this.autoscalers = autoscalers;
            return this;
        }
        public Builder autoscalers(GetLkeClusterPoolAutoscaler... autoscalers) {
            return autoscalers(List.of(autoscalers));
        }
        @CustomType.Setter
        public Builder count(Integer count) {
            if (count == null) {
              throw new MissingRequiredPropertyException("GetLkeClusterPool", "count");
            }
            this.count = count;
            return this;
        }
        @CustomType.Setter
        public Builder diskEncryption(String diskEncryption) {
            if (diskEncryption == null) {
              throw new MissingRequiredPropertyException("GetLkeClusterPool", "diskEncryption");
            }
            this.diskEncryption = diskEncryption;
            return this;
        }
        @CustomType.Setter
        public Builder disks(@Nullable List<GetLkeClusterPoolDisk> disks) {

            this.disks = disks;
            return this;
        }
        public Builder disks(GetLkeClusterPoolDisk... disks) {
            return disks(List.of(disks));
        }
        @CustomType.Setter
        public Builder id(Integer id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetLkeClusterPool", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder k8sVersion(String k8sVersion) {
            if (k8sVersion == null) {
              throw new MissingRequiredPropertyException("GetLkeClusterPool", "k8sVersion");
            }
            this.k8sVersion = k8sVersion;
            return this;
        }
        @CustomType.Setter
        public Builder labels(Map<String,String> labels) {
            if (labels == null) {
              throw new MissingRequiredPropertyException("GetLkeClusterPool", "labels");
            }
            this.labels = labels;
            return this;
        }
        @CustomType.Setter
        public Builder nodes(@Nullable List<GetLkeClusterPoolNode> nodes) {

            this.nodes = nodes;
            return this;
        }
        public Builder nodes(GetLkeClusterPoolNode... nodes) {
            return nodes(List.of(nodes));
        }
        @CustomType.Setter
        public Builder tags(List<String> tags) {
            if (tags == null) {
              throw new MissingRequiredPropertyException("GetLkeClusterPool", "tags");
            }
            this.tags = tags;
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        @CustomType.Setter
        public Builder taints(List<GetLkeClusterPoolTaint> taints) {
            if (taints == null) {
              throw new MissingRequiredPropertyException("GetLkeClusterPool", "taints");
            }
            this.taints = taints;
            return this;
        }
        public Builder taints(GetLkeClusterPoolTaint... taints) {
            return taints(List.of(taints));
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetLkeClusterPool", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder updateStrategy(String updateStrategy) {
            if (updateStrategy == null) {
              throw new MissingRequiredPropertyException("GetLkeClusterPool", "updateStrategy");
            }
            this.updateStrategy = updateStrategy;
            return this;
        }
        public GetLkeClusterPool build() {
            final var _resultValue = new GetLkeClusterPool();
            _resultValue.autoscalers = autoscalers;
            _resultValue.count = count;
            _resultValue.diskEncryption = diskEncryption;
            _resultValue.disks = disks;
            _resultValue.id = id;
            _resultValue.k8sVersion = k8sVersion;
            _resultValue.labels = labels;
            _resultValue.nodes = nodes;
            _resultValue.tags = tags;
            _resultValue.taints = taints;
            _resultValue.type = type;
            _resultValue.updateStrategy = updateStrategy;
            return _resultValue;
        }
    }
}
