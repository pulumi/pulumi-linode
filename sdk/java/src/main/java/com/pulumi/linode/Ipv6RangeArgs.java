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


public final class Ipv6RangeArgs extends com.pulumi.resources.ResourceArgs {

    public static final Ipv6RangeArgs Empty = new Ipv6RangeArgs();

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
     * The prefix length of the IPv6 range.
     * 
     */
    @Import(name="prefixLength", required=true)
    private Output<Integer> prefixLength;

    /**
     * @return The prefix length of the IPv6 range.
     * 
     */
    public Output<Integer> prefixLength() {
        return this.prefixLength;
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

    private Ipv6RangeArgs() {}

    private Ipv6RangeArgs(Ipv6RangeArgs $) {
        this.linodeId = $.linodeId;
        this.prefixLength = $.prefixLength;
        this.routeTarget = $.routeTarget;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(Ipv6RangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Ipv6RangeArgs $;

        public Builder() {
            $ = new Ipv6RangeArgs();
        }

        public Builder(Ipv6RangeArgs defaults) {
            $ = new Ipv6RangeArgs(Objects.requireNonNull(defaults));
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
         * @param prefixLength The prefix length of the IPv6 range.
         * 
         * @return builder
         * 
         */
        public Builder prefixLength(Output<Integer> prefixLength) {
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

        public Ipv6RangeArgs build() {
            if ($.prefixLength == null) {
                throw new MissingRequiredPropertyException("Ipv6RangeArgs", "prefixLength");
            }
            return $;
        }
    }

}
