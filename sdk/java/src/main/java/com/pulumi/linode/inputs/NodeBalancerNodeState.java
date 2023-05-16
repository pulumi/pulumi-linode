// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NodeBalancerNodeState extends com.pulumi.resources.ResourceArgs {

    public static final NodeBalancerNodeState Empty = new NodeBalancerNodeState();

    /**
     * The private IP Address where this backend can be reached. This must be a private IP address.
     * 
     * ***
     * 
     */
    @Import(name="address")
    private @Nullable Output<String> address;

    /**
     * @return The private IP Address where this backend can be reached. This must be a private IP address.
     * 
     * ***
     * 
     */
    public Optional<Output<String>> address() {
        return Optional.ofNullable(this.address);
    }

    /**
     * The ID of the NodeBalancerConfig to access.
     * 
     */
    @Import(name="configId")
    private @Nullable Output<Integer> configId;

    /**
     * @return The ID of the NodeBalancerConfig to access.
     * 
     */
    public Optional<Output<Integer>> configId() {
        return Optional.ofNullable(this.configId);
    }

    /**
     * The label of the Linode NodeBalancer Node. This is for display purposes only.
     * 
     */
    @Import(name="label")
    private @Nullable Output<String> label;

    /**
     * @return The label of the Linode NodeBalancer Node. This is for display purposes only.
     * 
     */
    public Optional<Output<String>> label() {
        return Optional.ofNullable(this.label);
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
    @Import(name="nodebalancerId")
    private @Nullable Output<Integer> nodebalancerId;

    /**
     * @return The ID of the NodeBalancer to access.
     * 
     */
    public Optional<Output<Integer>> nodebalancerId() {
        return Optional.ofNullable(this.nodebalancerId);
    }

    /**
     * The current status of this node, based on the configured checks of its NodeBalancer Config. (`unknown`, `UP`, `DOWN`).
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The current status of this node, based on the configured checks of its NodeBalancer Config. (`unknown`, `UP`, `DOWN`).
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
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

    private NodeBalancerNodeState() {}

    private NodeBalancerNodeState(NodeBalancerNodeState $) {
        this.address = $.address;
        this.configId = $.configId;
        this.label = $.label;
        this.mode = $.mode;
        this.nodebalancerId = $.nodebalancerId;
        this.status = $.status;
        this.weight = $.weight;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodeBalancerNodeState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodeBalancerNodeState $;

        public Builder() {
            $ = new NodeBalancerNodeState();
        }

        public Builder(NodeBalancerNodeState defaults) {
            $ = new NodeBalancerNodeState(Objects.requireNonNull(defaults));
        }

        /**
         * @param address The private IP Address where this backend can be reached. This must be a private IP address.
         * 
         * ***
         * 
         * @return builder
         * 
         */
        public Builder address(@Nullable Output<String> address) {
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
        public Builder configId(@Nullable Output<Integer> configId) {
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
        public Builder label(@Nullable Output<String> label) {
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
        public Builder nodebalancerId(@Nullable Output<Integer> nodebalancerId) {
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
         * @param status The current status of this node, based on the configured checks of its NodeBalancer Config. (`unknown`, `UP`, `DOWN`).
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The current status of this node, based on the configured checks of its NodeBalancer Config. (`unknown`, `UP`, `DOWN`).
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
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

        public NodeBalancerNodeState build() {
            return $;
        }
    }

}
