// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NodeBalancerNodeArgs extends com.pulumi.resources.ResourceArgs {

    public static final NodeBalancerNodeArgs Empty = new NodeBalancerNodeArgs();

    /**
     * The private IP Address where this backend can be reached. This must be a private IP address.
     * 
     * ***
     * 
     */
    @Import(name="address", required=true)
    private Output<String> address;

    /**
     * @return The private IP Address where this backend can be reached. This must be a private IP address.
     * 
     * ***
     * 
     */
    public Output<String> address() {
        return this.address;
    }

    /**
     * The ID of the NodeBalancerConfig to access.
     * 
     */
    @Import(name="configId", required=true)
    private Output<Integer> configId;

    /**
     * @return The ID of the NodeBalancerConfig to access.
     * 
     */
    public Output<Integer> configId() {
        return this.configId;
    }

    /**
     * The label of the Linode NodeBalancer Node. This is for display purposes only.
     * 
     */
    @Import(name="label", required=true)
    private Output<String> label;

    /**
     * @return The label of the Linode NodeBalancer Node. This is for display purposes only.
     * 
     */
    public Output<String> label() {
        return this.label;
    }

    /**
     * The mode this NodeBalancer should use when sending traffic to this backend. If set to `accept` this backend is accepting traffic. If set to `reject` this backend will not receive traffic. If set to `drain` this backend will not receive new traffic, but connections already pinned to it will continue to be routed to it. (`accept`, `reject`, `drain`, `backup`)
     * 
     */
    @Import(name="mode")
    private @Nullable Output<String> mode;

    /**
     * @return The mode this NodeBalancer should use when sending traffic to this backend. If set to `accept` this backend is accepting traffic. If set to `reject` this backend will not receive traffic. If set to `drain` this backend will not receive new traffic, but connections already pinned to it will continue to be routed to it. (`accept`, `reject`, `drain`, `backup`)
     * 
     */
    public Optional<Output<String>> mode() {
        return Optional.ofNullable(this.mode);
    }

    /**
     * The ID of the NodeBalancer to access.
     * 
     */
    @Import(name="nodebalancerId", required=true)
    private Output<Integer> nodebalancerId;

    /**
     * @return The ID of the NodeBalancer to access.
     * 
     */
    public Output<Integer> nodebalancerId() {
        return this.nodebalancerId;
    }

    /**
     * Used when picking a backend to serve a request and is not pinned to a single backend yet. Nodes with a higher weight will receive more traffic. (1-255).
     * 
     */
    @Import(name="weight")
    private @Nullable Output<Integer> weight;

    /**
     * @return Used when picking a backend to serve a request and is not pinned to a single backend yet. Nodes with a higher weight will receive more traffic. (1-255).
     * 
     */
    public Optional<Output<Integer>> weight() {
        return Optional.ofNullable(this.weight);
    }

    private NodeBalancerNodeArgs() {}

    private NodeBalancerNodeArgs(NodeBalancerNodeArgs $) {
        this.address = $.address;
        this.configId = $.configId;
        this.label = $.label;
        this.mode = $.mode;
        this.nodebalancerId = $.nodebalancerId;
        this.weight = $.weight;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodeBalancerNodeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodeBalancerNodeArgs $;

        public Builder() {
            $ = new NodeBalancerNodeArgs();
        }

        public Builder(NodeBalancerNodeArgs defaults) {
            $ = new NodeBalancerNodeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param address The private IP Address where this backend can be reached. This must be a private IP address.
         * 
         * ***
         * 
         * @return builder
         * 
         */
        public Builder address(Output<String> address) {
            $.address = address;
            return this;
        }

        /**
         * @param address The private IP Address where this backend can be reached. This must be a private IP address.
         * 
         * ***
         * 
         * @return builder
         * 
         */
        public Builder address(String address) {
            return address(Output.of(address));
        }

        /**
         * @param configId The ID of the NodeBalancerConfig to access.
         * 
         * @return builder
         * 
         */
        public Builder configId(Output<Integer> configId) {
            $.configId = configId;
            return this;
        }

        /**
         * @param configId The ID of the NodeBalancerConfig to access.
         * 
         * @return builder
         * 
         */
        public Builder configId(Integer configId) {
            return configId(Output.of(configId));
        }

        /**
         * @param label The label of the Linode NodeBalancer Node. This is for display purposes only.
         * 
         * @return builder
         * 
         */
        public Builder label(Output<String> label) {
            $.label = label;
            return this;
        }

        /**
         * @param label The label of the Linode NodeBalancer Node. This is for display purposes only.
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            return label(Output.of(label));
        }

        /**
         * @param mode The mode this NodeBalancer should use when sending traffic to this backend. If set to `accept` this backend is accepting traffic. If set to `reject` this backend will not receive traffic. If set to `drain` this backend will not receive new traffic, but connections already pinned to it will continue to be routed to it. (`accept`, `reject`, `drain`, `backup`)
         * 
         * @return builder
         * 
         */
        public Builder mode(@Nullable Output<String> mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param mode The mode this NodeBalancer should use when sending traffic to this backend. If set to `accept` this backend is accepting traffic. If set to `reject` this backend will not receive traffic. If set to `drain` this backend will not receive new traffic, but connections already pinned to it will continue to be routed to it. (`accept`, `reject`, `drain`, `backup`)
         * 
         * @return builder
         * 
         */
        public Builder mode(String mode) {
            return mode(Output.of(mode));
        }

        /**
         * @param nodebalancerId The ID of the NodeBalancer to access.
         * 
         * @return builder
         * 
         */
        public Builder nodebalancerId(Output<Integer> nodebalancerId) {
            $.nodebalancerId = nodebalancerId;
            return this;
        }

        /**
         * @param nodebalancerId The ID of the NodeBalancer to access.
         * 
         * @return builder
         * 
         */
        public Builder nodebalancerId(Integer nodebalancerId) {
            return nodebalancerId(Output.of(nodebalancerId));
        }

        /**
         * @param weight Used when picking a backend to serve a request and is not pinned to a single backend yet. Nodes with a higher weight will receive more traffic. (1-255).
         * 
         * @return builder
         * 
         */
        public Builder weight(@Nullable Output<Integer> weight) {
            $.weight = weight;
            return this;
        }

        /**
         * @param weight Used when picking a backend to serve a request and is not pinned to a single backend yet. Nodes with a higher weight will receive more traffic. (1-255).
         * 
         * @return builder
         * 
         */
        public Builder weight(Integer weight) {
            return weight(Output.of(weight));
        }

        public NodeBalancerNodeArgs build() {
            if ($.address == null) {
                throw new MissingRequiredPropertyException("NodeBalancerNodeArgs", "address");
            }
            if ($.configId == null) {
                throw new MissingRequiredPropertyException("NodeBalancerNodeArgs", "configId");
            }
            if ($.label == null) {
                throw new MissingRequiredPropertyException("NodeBalancerNodeArgs", "label");
            }
            if ($.nodebalancerId == null) {
                throw new MissingRequiredPropertyException("NodeBalancerNodeArgs", "nodebalancerId");
            }
            return $;
        }
    }

}
