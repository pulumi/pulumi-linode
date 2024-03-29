// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class Ipv6RangeState extends com.pulumi.resources.ResourceArgs {

    public static final Ipv6RangeState Empty = new Ipv6RangeState();

    /**
     * Whether this IPv6 range is shared.
     * 
     */
    @Import(name="isBgp")
    private @Nullable Output<Boolean> isBgp;

    /**
     * @return Whether this IPv6 range is shared.
     * 
     */
    public Optional<Output<Boolean>> isBgp() {
        return Optional.ofNullable(this.isBgp);
    }

    /**
     * The ID of the Linode to assign this range to. This field may be updated to reassign the IPv6 range.
     * 
     */
    @Import(name="linodeId")
    private @Nullable Output<Integer> linodeId;

    /**
     * @return The ID of the Linode to assign this range to. This field may be updated to reassign the IPv6 range.
     * 
     */
    public Optional<Output<Integer>> linodeId() {
        return Optional.ofNullable(this.linodeId);
    }

    /**
     * A list of Linodes targeted by this IPv6 range. Includes Linodes with IP sharing.
     * 
     */
    @Import(name="linodes")
    private @Nullable Output<List<Integer>> linodes;

    /**
     * @return A list of Linodes targeted by this IPv6 range. Includes Linodes with IP sharing.
     * 
     */
    public Optional<Output<List<Integer>>> linodes() {
        return Optional.ofNullable(this.linodes);
    }

    /**
     * The prefix length of the IPv6 range.
     * 
     */
    @Import(name="prefixLength")
    private @Nullable Output<Integer> prefixLength;

    /**
     * @return The prefix length of the IPv6 range.
     * 
     */
    public Optional<Output<Integer>> prefixLength() {
        return Optional.ofNullable(this.prefixLength);
    }

    /**
     * The IPv6 range of addresses in this pool.
     * 
     */
    @Import(name="range")
    private @Nullable Output<String> range;

    /**
     * @return The IPv6 range of addresses in this pool.
     * 
     */
    public Optional<Output<String>> range() {
        return Optional.ofNullable(this.range);
    }

    /**
     * The region for this range of IPv6 addresses.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return The region for this range of IPv6 addresses.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * The IPv6 SLAAC address to assign this range to.
     * 
     */
    @Import(name="routeTarget")
    private @Nullable Output<String> routeTarget;

    /**
     * @return The IPv6 SLAAC address to assign this range to.
     * 
     */
    public Optional<Output<String>> routeTarget() {
        return Optional.ofNullable(this.routeTarget);
    }

    private Ipv6RangeState() {}

    private Ipv6RangeState(Ipv6RangeState $) {
        this.isBgp = $.isBgp;
        this.linodeId = $.linodeId;
        this.linodes = $.linodes;
        this.prefixLength = $.prefixLength;
        this.range = $.range;
        this.region = $.region;
        this.routeTarget = $.routeTarget;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(Ipv6RangeState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Ipv6RangeState $;

        public Builder() {
            $ = new Ipv6RangeState();
        }

        public Builder(Ipv6RangeState defaults) {
            $ = new Ipv6RangeState(Objects.requireNonNull(defaults));
        }

        /**
         * @param isBgp Whether this IPv6 range is shared.
         * 
         * @return builder
         * 
         */
        public Builder isBgp(@Nullable Output<Boolean> isBgp) {
            $.isBgp = isBgp;
            return this;
        }

        /**
         * @param isBgp Whether this IPv6 range is shared.
         * 
         * @return builder
         * 
         */
        public Builder isBgp(Boolean isBgp) {
            return isBgp(Output.of(isBgp));
        }

        /**
         * @param linodeId The ID of the Linode to assign this range to. This field may be updated to reassign the IPv6 range.
         * 
         * @return builder
         * 
         */
        public Builder linodeId(@Nullable Output<Integer> linodeId) {
            $.linodeId = linodeId;
            return this;
        }

        /**
         * @param linodeId The ID of the Linode to assign this range to. This field may be updated to reassign the IPv6 range.
         * 
         * @return builder
         * 
         */
        public Builder linodeId(Integer linodeId) {
            return linodeId(Output.of(linodeId));
        }

        /**
         * @param linodes A list of Linodes targeted by this IPv6 range. Includes Linodes with IP sharing.
         * 
         * @return builder
         * 
         */
        public Builder linodes(@Nullable Output<List<Integer>> linodes) {
            $.linodes = linodes;
            return this;
        }

        /**
         * @param linodes A list of Linodes targeted by this IPv6 range. Includes Linodes with IP sharing.
         * 
         * @return builder
         * 
         */
        public Builder linodes(List<Integer> linodes) {
            return linodes(Output.of(linodes));
        }

        /**
         * @param linodes A list of Linodes targeted by this IPv6 range. Includes Linodes with IP sharing.
         * 
         * @return builder
         * 
         */
        public Builder linodes(Integer... linodes) {
            return linodes(List.of(linodes));
        }

        /**
         * @param prefixLength The prefix length of the IPv6 range.
         * 
         * @return builder
         * 
         */
        public Builder prefixLength(@Nullable Output<Integer> prefixLength) {
            $.prefixLength = prefixLength;
            return this;
        }

        /**
         * @param prefixLength The prefix length of the IPv6 range.
         * 
         * @return builder
         * 
         */
        public Builder prefixLength(Integer prefixLength) {
            return prefixLength(Output.of(prefixLength));
        }

        /**
         * @param range The IPv6 range of addresses in this pool.
         * 
         * @return builder
         * 
         */
        public Builder range(@Nullable Output<String> range) {
            $.range = range;
            return this;
        }

        /**
         * @param range The IPv6 range of addresses in this pool.
         * 
         * @return builder
         * 
         */
        public Builder range(String range) {
            return range(Output.of(range));
        }

        /**
         * @param region The region for this range of IPv6 addresses.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The region for this range of IPv6 addresses.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param routeTarget The IPv6 SLAAC address to assign this range to.
         * 
         * @return builder
         * 
         */
        public Builder routeTarget(@Nullable Output<String> routeTarget) {
            $.routeTarget = routeTarget;
            return this;
        }

        /**
         * @param routeTarget The IPv6 SLAAC address to assign this range to.
         * 
         * @return builder
         * 
         */
        public Builder routeTarget(String routeTarget) {
            return routeTarget(Output.of(routeTarget));
        }

        public Ipv6RangeState build() {
            return $;
        }
    }

}
