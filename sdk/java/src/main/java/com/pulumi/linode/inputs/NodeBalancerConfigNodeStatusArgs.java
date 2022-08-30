// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NodeBalancerConfigNodeStatusArgs extends com.pulumi.resources.ResourceArgs {

    public static final NodeBalancerConfigNodeStatusArgs Empty = new NodeBalancerConfigNodeStatusArgs();

    /**
     * The number of backends considered to be &#39;DOWN&#39; and unhealthy. These are not in rotation, and not serving requests.
     * 
     */
    @Import(name="down")
    private @Nullable Output<Integer> down;

    /**
     * @return The number of backends considered to be &#39;DOWN&#39; and unhealthy. These are not in rotation, and not serving requests.
     * 
     */
    public Optional<Output<Integer>> down() {
        return Optional.ofNullable(this.down);
    }

    /**
     * The number of backends considered to be &#39;UP&#39; and healthy, and that are serving requests.
     * 
     */
    @Import(name="up")
    private @Nullable Output<Integer> up;

    /**
     * @return The number of backends considered to be &#39;UP&#39; and healthy, and that are serving requests.
     * 
     */
    public Optional<Output<Integer>> up() {
        return Optional.ofNullable(this.up);
    }

    private NodeBalancerConfigNodeStatusArgs() {}

    private NodeBalancerConfigNodeStatusArgs(NodeBalancerConfigNodeStatusArgs $) {
        this.down = $.down;
        this.up = $.up;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodeBalancerConfigNodeStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodeBalancerConfigNodeStatusArgs $;

        public Builder() {
            $ = new NodeBalancerConfigNodeStatusArgs();
        }

        public Builder(NodeBalancerConfigNodeStatusArgs defaults) {
            $ = new NodeBalancerConfigNodeStatusArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param down The number of backends considered to be &#39;DOWN&#39; and unhealthy. These are not in rotation, and not serving requests.
         * 
         * @return builder
         * 
         */
        public Builder down(@Nullable Output<Integer> down) {
            $.down = down;
            return this;
        }

        /**
         * @param down The number of backends considered to be &#39;DOWN&#39; and unhealthy. These are not in rotation, and not serving requests.
         * 
         * @return builder
         * 
         */
        public Builder down(Integer down) {
            return down(Output.of(down));
        }

        /**
         * @param up The number of backends considered to be &#39;UP&#39; and healthy, and that are serving requests.
         * 
         * @return builder
         * 
         */
        public Builder up(@Nullable Output<Integer> up) {
            $.up = up;
            return this;
        }

        /**
         * @param up The number of backends considered to be &#39;UP&#39; and healthy, and that are serving requests.
         * 
         * @return builder
         * 
         */
        public Builder up(Integer up) {
            return up(Output.of(up));
        }

        public NodeBalancerConfigNodeStatusArgs build() {
            return $;
        }
    }

}
