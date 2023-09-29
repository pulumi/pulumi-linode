// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NodeBalancerArgs extends com.pulumi.resources.ResourceArgs {

    public static final NodeBalancerArgs Empty = new NodeBalancerArgs();

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
     * ID for the firewall you&#39;d like to use with this NodeBalancer.
     * 
     */
    @Import(name="firewallId")
    private @Nullable Output<Integer> firewallId;

    /**
     * @return ID for the firewall you&#39;d like to use with this NodeBalancer.
     * 
     */
    public Optional<Output<Integer>> firewallId() {
        return Optional.ofNullable(this.firewallId);
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
     * ***
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return The region where this NodeBalancer will be deployed.  Examples are `&#34;us-east&#34;`, `&#34;us-west&#34;`, `&#34;ap-south&#34;`, etc. See all regions [here](https://api.linode.com/v4/regions).  *Changing `region` forces the creation of a new Linode NodeBalancer.*.
     * 
     * ***
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

    private NodeBalancerArgs() {}

    private NodeBalancerArgs(NodeBalancerArgs $) {
        this.clientConnThrottle = $.clientConnThrottle;
        this.firewallId = $.firewallId;
        this.label = $.label;
        this.region = $.region;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodeBalancerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodeBalancerArgs $;

        public Builder() {
            $ = new NodeBalancerArgs();
        }

        public Builder(NodeBalancerArgs defaults) {
            $ = new NodeBalancerArgs(Objects.requireNonNull(defaults));
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
         * @param firewallId ID for the firewall you&#39;d like to use with this NodeBalancer.
         * 
         * @return builder
         * 
         */
        public Builder firewallId(@Nullable Output<Integer> firewallId) {
            $.firewallId = firewallId;
            return this;
        }

        /**
         * @param firewallId ID for the firewall you&#39;d like to use with this NodeBalancer.
         * 
         * @return builder
         * 
         */
        public Builder firewallId(Integer firewallId) {
            return firewallId(Output.of(firewallId));
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
         * ***
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
         * ***
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

        public NodeBalancerArgs build() {
            return $;
        }
    }

}
