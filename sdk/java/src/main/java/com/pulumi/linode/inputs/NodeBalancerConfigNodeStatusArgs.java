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

    @Import(name="down")
    private @Nullable Output<Integer> down;

    public Optional<Output<Integer>> down() {
        return Optional.ofNullable(this.down);
    }

    @Import(name="up")
    private @Nullable Output<Integer> up;

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

        public Builder down(@Nullable Output<Integer> down) {
            $.down = down;
            return this;
        }

        public Builder down(Integer down) {
            return down(Output.of(down));
        }

        public Builder up(@Nullable Output<Integer> up) {
            $.up = up;
            return this;
        }

        public Builder up(Integer up) {
            return up(Output.of(up));
        }

        public NodeBalancerConfigNodeStatusArgs build() {
            return $;
        }
    }

}
