// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.linode.inputs.GetLkeClusterPoolAutoscaler;
import com.pulumi.linode.inputs.GetLkeClusterPoolDisk;
import com.pulumi.linode.inputs.GetLkeClusterPoolNode;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetLkeClusterPool extends com.pulumi.resources.InvokeArgs {

    public static final GetLkeClusterPool Empty = new GetLkeClusterPool();

    /**
     * The configuration options for the autoscaler. This field only contains an autoscaler configuration if autoscaling is enabled on this cluster.
     * 
     */
    @Import(name="autoscalers")
    private @Nullable List<GetLkeClusterPoolAutoscaler> autoscalers;

    /**
     * @return The configuration options for the autoscaler. This field only contains an autoscaler configuration if autoscaling is enabled on this cluster.
     * 
     */
    public Optional<List<GetLkeClusterPoolAutoscaler>> autoscalers() {
        return Optional.ofNullable(this.autoscalers);
    }

    /**
     * The number of nodes in the Node Pool.
     * 
     */
    @Import(name="count", required=true)
    private Integer count;

    /**
     * @return The number of nodes in the Node Pool.
     * 
     */
    public Integer count() {
        return this.count;
    }

    /**
     * This Node Pool’s custom disk layout.
     * 
     */
    @Import(name="disks")
    private @Nullable List<GetLkeClusterPoolDisk> disks;

    /**
     * @return This Node Pool’s custom disk layout.
     * 
     */
    public Optional<List<GetLkeClusterPoolDisk>> disks() {
        return Optional.ofNullable(this.disks);
    }

    /**
     * The LKE Cluster&#39;s ID.
     * 
     */
    @Import(name="id", required=true)
    private Integer id;

    /**
     * @return The LKE Cluster&#39;s ID.
     * 
     */
    public Integer id() {
        return this.id;
    }

    /**
     * The nodes in the Node Pool.
     * 
     */
    @Import(name="nodes")
    private @Nullable List<GetLkeClusterPoolNode> nodes;

    /**
     * @return The nodes in the Node Pool.
     * 
     */
    public Optional<List<GetLkeClusterPoolNode>> nodes() {
        return Optional.ofNullable(this.nodes);
    }

    /**
     * An array of tags applied to this object. Tags are case-insensitive and are for organizational purposes only.
     * 
     */
    @Import(name="tags", required=true)
    private List<String> tags;

    /**
     * @return An array of tags applied to this object. Tags are case-insensitive and are for organizational purposes only.
     * 
     */
    public List<String> tags() {
        return this.tags;
    }

    /**
     * This custom disk partition’s filesystem type.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return This custom disk partition’s filesystem type.
     * 
     */
    public String type() {
        return this.type;
    }

    private GetLkeClusterPool() {}

    private GetLkeClusterPool(GetLkeClusterPool $) {
        this.autoscalers = $.autoscalers;
        this.count = $.count;
        this.disks = $.disks;
        this.id = $.id;
        this.nodes = $.nodes;
        this.tags = $.tags;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLkeClusterPool defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLkeClusterPool $;

        public Builder() {
            $ = new GetLkeClusterPool();
        }

        public Builder(GetLkeClusterPool defaults) {
            $ = new GetLkeClusterPool(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoscalers The configuration options for the autoscaler. This field only contains an autoscaler configuration if autoscaling is enabled on this cluster.
         * 
         * @return builder
         * 
         */
        public Builder autoscalers(@Nullable List<GetLkeClusterPoolAutoscaler> autoscalers) {
            $.autoscalers = autoscalers;
            return this;
        }

        /**
         * @param autoscalers The configuration options for the autoscaler. This field only contains an autoscaler configuration if autoscaling is enabled on this cluster.
         * 
         * @return builder
         * 
         */
        public Builder autoscalers(GetLkeClusterPoolAutoscaler... autoscalers) {
            return autoscalers(List.of(autoscalers));
        }

        /**
         * @param count The number of nodes in the Node Pool.
         * 
         * @return builder
         * 
         */
        public Builder count(Integer count) {
            $.count = count;
            return this;
        }

        /**
         * @param disks This Node Pool’s custom disk layout.
         * 
         * @return builder
         * 
         */
        public Builder disks(@Nullable List<GetLkeClusterPoolDisk> disks) {
            $.disks = disks;
            return this;
        }

        /**
         * @param disks This Node Pool’s custom disk layout.
         * 
         * @return builder
         * 
         */
        public Builder disks(GetLkeClusterPoolDisk... disks) {
            return disks(List.of(disks));
        }

        /**
         * @param id The LKE Cluster&#39;s ID.
         * 
         * @return builder
         * 
         */
        public Builder id(Integer id) {
            $.id = id;
            return this;
        }

        /**
         * @param nodes The nodes in the Node Pool.
         * 
         * @return builder
         * 
         */
        public Builder nodes(@Nullable List<GetLkeClusterPoolNode> nodes) {
            $.nodes = nodes;
            return this;
        }

        /**
         * @param nodes The nodes in the Node Pool.
         * 
         * @return builder
         * 
         */
        public Builder nodes(GetLkeClusterPoolNode... nodes) {
            return nodes(List.of(nodes));
        }

        /**
         * @param tags An array of tags applied to this object. Tags are case-insensitive and are for organizational purposes only.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags An array of tags applied to this object. Tags are case-insensitive and are for organizational purposes only.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param type This custom disk partition’s filesystem type.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public GetLkeClusterPool build() {
            if ($.count == null) {
                throw new MissingRequiredPropertyException("GetLkeClusterPool", "count");
            }
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetLkeClusterPool", "id");
            }
            if ($.tags == null) {
                throw new MissingRequiredPropertyException("GetLkeClusterPool", "tags");
            }
            if ($.type == null) {
                throw new MissingRequiredPropertyException("GetLkeClusterPool", "type");
            }
            return $;
        }
    }

}
