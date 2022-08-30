// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.linode.inputs.NodeBalancerTransferArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NodeBalancerState extends com.pulumi.resources.ResourceArgs {

    public static final NodeBalancerState Empty = new NodeBalancerState();

    /**
     * Throttle connections per second (0-20). Set to 0 (default) to disable throttling.
     * 
     */
    @Import(name="clientConnThrottle")
    private @Nullable Output<Integer> clientConnThrottle;

    /**
     * @return Throttle connections per second (0-20). Set to 0 (default) to disable throttling.
     * 
     */
    public Optional<Output<Integer>> clientConnThrottle() {
        return Optional.ofNullable(this.clientConnThrottle);
    }

    /**
     * When this NodeBalancer was created
     * 
     */
    @Import(name="created")
    private @Nullable Output<String> created;

    /**
     * @return When this NodeBalancer was created
     * 
     */
    public Optional<Output<String>> created() {
        return Optional.ofNullable(this.created);
    }

    /**
     * This NodeBalancer&#39;s hostname, ending with .nodebalancer.linode.com
     * 
     */
    @Import(name="hostname")
    private @Nullable Output<String> hostname;

    /**
     * @return This NodeBalancer&#39;s hostname, ending with .nodebalancer.linode.com
     * 
     */
    public Optional<Output<String>> hostname() {
        return Optional.ofNullable(this.hostname);
    }

    /**
     * The Public IPv4 Address of this NodeBalancer
     * 
     */
    @Import(name="ipv4")
    private @Nullable Output<String> ipv4;

    /**
     * @return The Public IPv4 Address of this NodeBalancer
     * 
     */
    public Optional<Output<String>> ipv4() {
        return Optional.ofNullable(this.ipv4);
    }

    /**
     * The Public IPv6 Address of this NodeBalancer
     * 
     */
    @Import(name="ipv6")
    private @Nullable Output<String> ipv6;

    /**
     * @return The Public IPv6 Address of this NodeBalancer
     * 
     */
    public Optional<Output<String>> ipv6() {
        return Optional.ofNullable(this.ipv6);
    }

    /**
     * The label of the Linode NodeBalancer
     * 
     */
    @Import(name="label")
    private @Nullable Output<String> label;

    /**
     * @return The label of the Linode NodeBalancer
     * 
     */
    public Optional<Output<String>> label() {
        return Optional.ofNullable(this.label);
    }

    /**
     * The region where this NodeBalancer will be deployed.  Examples are `&#34;us-east&#34;`, `&#34;us-west&#34;`, `&#34;ap-south&#34;`, etc. See all regions [here](https://api.linode.com/v4/regions).  *Changing `region` forces the creation of a new Linode NodeBalancer.*.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return The region where this NodeBalancer will be deployed.  Examples are `&#34;us-east&#34;`, `&#34;us-west&#34;`, `&#34;ap-south&#34;`, etc. See all regions [here](https://api.linode.com/v4/regions).  *Changing `region` forces the creation of a new Linode NodeBalancer.*.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * A list of tags applied to this object. Tags are for organizational purposes only.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return A list of tags applied to this object. Tags are for organizational purposes only.
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Information about the amount of transfer this NodeBalancer has had so far this month.
     * 
     */
    @Import(name="transfers")
    private @Nullable Output<List<NodeBalancerTransferArgs>> transfers;

    /**
     * @return Information about the amount of transfer this NodeBalancer has had so far this month.
     * 
     */
    public Optional<Output<List<NodeBalancerTransferArgs>>> transfers() {
        return Optional.ofNullable(this.transfers);
    }

    /**
     * When this NodeBalancer was last updated.
     * 
     */
    @Import(name="updated")
    private @Nullable Output<String> updated;

    /**
     * @return When this NodeBalancer was last updated.
     * 
     */
    public Optional<Output<String>> updated() {
        return Optional.ofNullable(this.updated);
    }

    private NodeBalancerState() {}

    private NodeBalancerState(NodeBalancerState $) {
        this.clientConnThrottle = $.clientConnThrottle;
        this.created = $.created;
        this.hostname = $.hostname;
        this.ipv4 = $.ipv4;
        this.ipv6 = $.ipv6;
        this.label = $.label;
        this.region = $.region;
        this.tags = $.tags;
        this.transfers = $.transfers;
        this.updated = $.updated;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodeBalancerState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodeBalancerState $;

        public Builder() {
            $ = new NodeBalancerState();
        }

        public Builder(NodeBalancerState defaults) {
            $ = new NodeBalancerState(Objects.requireNonNull(defaults));
        }

        /**
         * @param clientConnThrottle Throttle connections per second (0-20). Set to 0 (default) to disable throttling.
         * 
         * @return builder
         * 
         */
        public Builder clientConnThrottle(@Nullable Output<Integer> clientConnThrottle) {
            $.clientConnThrottle = clientConnThrottle;
            return this;
        }

        /**
         * @param clientConnThrottle Throttle connections per second (0-20). Set to 0 (default) to disable throttling.
         * 
         * @return builder
         * 
         */
        public Builder clientConnThrottle(Integer clientConnThrottle) {
            return clientConnThrottle(Output.of(clientConnThrottle));
        }

        /**
         * @param created When this NodeBalancer was created
         * 
         * @return builder
         * 
         */
        public Builder created(@Nullable Output<String> created) {
            $.created = created;
            return this;
        }

        /**
         * @param created When this NodeBalancer was created
         * 
         * @return builder
         * 
         */
        public Builder created(String created) {
            return created(Output.of(created));
        }

        /**
         * @param hostname This NodeBalancer&#39;s hostname, ending with .nodebalancer.linode.com
         * 
         * @return builder
         * 
         */
        public Builder hostname(@Nullable Output<String> hostname) {
            $.hostname = hostname;
            return this;
        }

        /**
         * @param hostname This NodeBalancer&#39;s hostname, ending with .nodebalancer.linode.com
         * 
         * @return builder
         * 
         */
        public Builder hostname(String hostname) {
            return hostname(Output.of(hostname));
        }

        /**
         * @param ipv4 The Public IPv4 Address of this NodeBalancer
         * 
         * @return builder
         * 
         */
        public Builder ipv4(@Nullable Output<String> ipv4) {
            $.ipv4 = ipv4;
            return this;
        }

        /**
         * @param ipv4 The Public IPv4 Address of this NodeBalancer
         * 
         * @return builder
         * 
         */
        public Builder ipv4(String ipv4) {
            return ipv4(Output.of(ipv4));
        }

        /**
         * @param ipv6 The Public IPv6 Address of this NodeBalancer
         * 
         * @return builder
         * 
         */
        public Builder ipv6(@Nullable Output<String> ipv6) {
            $.ipv6 = ipv6;
            return this;
        }

        /**
         * @param ipv6 The Public IPv6 Address of this NodeBalancer
         * 
         * @return builder
         * 
         */
        public Builder ipv6(String ipv6) {
            return ipv6(Output.of(ipv6));
        }

        /**
         * @param label The label of the Linode NodeBalancer
         * 
         * @return builder
         * 
         */
        public Builder label(@Nullable Output<String> label) {
            $.label = label;
            return this;
        }

        /**
         * @param label The label of the Linode NodeBalancer
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            return label(Output.of(label));
        }

        /**
         * @param region The region where this NodeBalancer will be deployed.  Examples are `&#34;us-east&#34;`, `&#34;us-west&#34;`, `&#34;ap-south&#34;`, etc. See all regions [here](https://api.linode.com/v4/regions).  *Changing `region` forces the creation of a new Linode NodeBalancer.*.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The region where this NodeBalancer will be deployed.  Examples are `&#34;us-east&#34;`, `&#34;us-west&#34;`, `&#34;ap-south&#34;`, etc. See all regions [here](https://api.linode.com/v4/regions).  *Changing `region` forces the creation of a new Linode NodeBalancer.*.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param tags A list of tags applied to this object. Tags are for organizational purposes only.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A list of tags applied to this object. Tags are for organizational purposes only.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags A list of tags applied to this object. Tags are for organizational purposes only.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param transfers Information about the amount of transfer this NodeBalancer has had so far this month.
         * 
         * @return builder
         * 
         */
        public Builder transfers(@Nullable Output<List<NodeBalancerTransferArgs>> transfers) {
            $.transfers = transfers;
            return this;
        }

        /**
         * @param transfers Information about the amount of transfer this NodeBalancer has had so far this month.
         * 
         * @return builder
         * 
         */
        public Builder transfers(List<NodeBalancerTransferArgs> transfers) {
            return transfers(Output.of(transfers));
        }

        /**
         * @param transfers Information about the amount of transfer this NodeBalancer has had so far this month.
         * 
         * @return builder
         * 
         */
        public Builder transfers(NodeBalancerTransferArgs... transfers) {
            return transfers(List.of(transfers));
        }

        /**
         * @param updated When this NodeBalancer was last updated.
         * 
         * @return builder
         * 
         */
        public Builder updated(@Nullable Output<String> updated) {
            $.updated = updated;
            return this;
        }

        /**
         * @param updated When this NodeBalancer was last updated.
         * 
         * @return builder
         * 
         */
        public Builder updated(String updated) {
            return updated(Output.of(updated));
        }

        public NodeBalancerState build() {
            return $;
        }
    }

}
