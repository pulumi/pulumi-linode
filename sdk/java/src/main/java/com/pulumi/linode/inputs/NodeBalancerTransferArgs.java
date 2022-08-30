// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NodeBalancerTransferArgs extends com.pulumi.resources.ResourceArgs {

    public static final NodeBalancerTransferArgs Empty = new NodeBalancerTransferArgs();

    /**
     * The total transfer, in MB, used by this NodeBalancer for the current month
     * 
     */
    @Import(name="in")
    private @Nullable Output<Double> in;

    /**
     * @return The total transfer, in MB, used by this NodeBalancer for the current month
     * 
     */
    public Optional<Output<Double>> in() {
        return Optional.ofNullable(this.in);
    }

    /**
     * The total inbound transfer, in MB, used for this NodeBalancer for the current month
     * 
     */
    @Import(name="out")
    private @Nullable Output<Double> out;

    /**
     * @return The total inbound transfer, in MB, used for this NodeBalancer for the current month
     * 
     */
    public Optional<Output<Double>> out() {
        return Optional.ofNullable(this.out);
    }

    /**
     * The total outbound transfer, in MB, used for this NodeBalancer for the current month
     * 
     */
    @Import(name="total")
    private @Nullable Output<Double> total;

    /**
     * @return The total outbound transfer, in MB, used for this NodeBalancer for the current month
     * 
     */
    public Optional<Output<Double>> total() {
        return Optional.ofNullable(this.total);
    }

    private NodeBalancerTransferArgs() {}

    private NodeBalancerTransferArgs(NodeBalancerTransferArgs $) {
        this.in = $.in;
        this.out = $.out;
        this.total = $.total;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodeBalancerTransferArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodeBalancerTransferArgs $;

        public Builder() {
            $ = new NodeBalancerTransferArgs();
        }

        public Builder(NodeBalancerTransferArgs defaults) {
            $ = new NodeBalancerTransferArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param in The total transfer, in MB, used by this NodeBalancer for the current month
         * 
         * @return builder
         * 
         */
        public Builder in(@Nullable Output<Double> in) {
            $.in = in;
            return this;
        }

        /**
         * @param in The total transfer, in MB, used by this NodeBalancer for the current month
         * 
         * @return builder
         * 
         */
        public Builder in(Double in) {
            return in(Output.of(in));
        }

        /**
         * @param out The total inbound transfer, in MB, used for this NodeBalancer for the current month
         * 
         * @return builder
         * 
         */
        public Builder out(@Nullable Output<Double> out) {
            $.out = out;
            return this;
        }

        /**
         * @param out The total inbound transfer, in MB, used for this NodeBalancer for the current month
         * 
         * @return builder
         * 
         */
        public Builder out(Double out) {
            return out(Output.of(out));
        }

        /**
         * @param total The total outbound transfer, in MB, used for this NodeBalancer for the current month
         * 
         * @return builder
         * 
         */
        public Builder total(@Nullable Output<Double> total) {
            $.total = total;
            return this;
        }

        /**
         * @param total The total outbound transfer, in MB, used for this NodeBalancer for the current month
         * 
         * @return builder
         * 
         */
        public Builder total(Double total) {
            return total(Output.of(total));
        }

        public NodeBalancerTransferArgs build() {
            return $;
        }
    }

}
