// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkingIpState extends com.pulumi.resources.ResourceArgs {

    public static final NetworkingIpState Empty = new NetworkingIpState();

    /**
     * The IP address.
     * 
     */
    @Import(name="address")
    private @Nullable Output<String> address;

    /**
     * @return The IP address.
     * 
     */
    public Optional<Output<String>> address() {
        return Optional.ofNullable(this.address);
    }

    /**
     * The ID of the Linode to which the IP address will be assigned. Conflicts with `region`.
     * 
     */
    @Import(name="linodeId")
    private @Nullable Output<Integer> linodeId;

    /**
     * @return The ID of the Linode to which the IP address will be assigned. Conflicts with `region`.
     * 
     */
    public Optional<Output<Integer>> linodeId() {
        return Optional.ofNullable(this.linodeId);
    }

    /**
     * Whether the IP address is public. Defaults to true.
     * 
     */
    @Import(name="public")
    private @Nullable Output<Boolean> public_;

    /**
     * @return Whether the IP address is public. Defaults to true.
     * 
     */
    public Optional<Output<Boolean>> public_() {
        return Optional.ofNullable(this.public_);
    }

    /**
     * The region for the reserved IPv4 address. Required when reserved is true and linode_id is not set.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return The region for the reserved IPv4 address. Required when reserved is true and linode_id is not set.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * Whether the IPv4 address should be reserved.
     * 
     */
    @Import(name="reserved")
    private @Nullable Output<Boolean> reserved;

    /**
     * @return Whether the IPv4 address should be reserved.
     * 
     */
    public Optional<Output<Boolean>> reserved() {
        return Optional.ofNullable(this.reserved);
    }

    /**
     * The type of IP address. (ipv4, ipv6, etc.)
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of IP address. (ipv4, ipv6, etc.)
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private NetworkingIpState() {}

    private NetworkingIpState(NetworkingIpState $) {
        this.address = $.address;
        this.linodeId = $.linodeId;
        this.public_ = $.public_;
        this.region = $.region;
        this.reserved = $.reserved;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkingIpState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkingIpState $;

        public Builder() {
            $ = new NetworkingIpState();
        }

        public Builder(NetworkingIpState defaults) {
            $ = new NetworkingIpState(Objects.requireNonNull(defaults));
        }

        /**
         * @param address The IP address.
         * 
         * @return builder
         * 
         */
        public Builder address(@Nullable Output<String> address) {
            $.address = address;
            return this;
        }

        /**
         * @param address The IP address.
         * 
         * @return builder
         * 
         */
        public Builder address(String address) {
            return address(Output.of(address));
        }

        /**
         * @param linodeId The ID of the Linode to which the IP address will be assigned. Conflicts with `region`.
         * 
         * @return builder
         * 
         */
        public Builder linodeId(@Nullable Output<Integer> linodeId) {
            $.linodeId = linodeId;
            return this;
        }

        /**
         * @param linodeId The ID of the Linode to which the IP address will be assigned. Conflicts with `region`.
         * 
         * @return builder
         * 
         */
        public Builder linodeId(Integer linodeId) {
            return linodeId(Output.of(linodeId));
        }

        /**
         * @param public_ Whether the IP address is public. Defaults to true.
         * 
         * @return builder
         * 
         */
        public Builder public_(@Nullable Output<Boolean> public_) {
            $.public_ = public_;
            return this;
        }

        /**
         * @param public_ Whether the IP address is public. Defaults to true.
         * 
         * @return builder
         * 
         */
        public Builder public_(Boolean public_) {
            return public_(Output.of(public_));
        }

        /**
         * @param region The region for the reserved IPv4 address. Required when reserved is true and linode_id is not set.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The region for the reserved IPv4 address. Required when reserved is true and linode_id is not set.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param reserved Whether the IPv4 address should be reserved.
         * 
         * @return builder
         * 
         */
        public Builder reserved(@Nullable Output<Boolean> reserved) {
            $.reserved = reserved;
            return this;
        }

        /**
         * @param reserved Whether the IPv4 address should be reserved.
         * 
         * @return builder
         * 
         */
        public Builder reserved(Boolean reserved) {
            return reserved(Output.of(reserved));
        }

        /**
         * @param type The type of IP address. (ipv4, ipv6, etc.)
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of IP address. (ipv4, ipv6, etc.)
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public NetworkingIpState build() {
            return $;
        }
    }

}
