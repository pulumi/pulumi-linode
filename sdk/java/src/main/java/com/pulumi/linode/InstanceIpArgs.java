// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceIpArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceIpArgs Empty = new InstanceIpArgs();

    /**
     * If true, the instance will be rebooted to update network interfaces.
     * 
     */
    @Import(name="applyImmediately")
    private @Nullable Output<Boolean> applyImmediately;

    /**
     * @return If true, the instance will be rebooted to update network interfaces.
     * 
     */
    public Optional<Output<Boolean>> applyImmediately() {
        return Optional.ofNullable(this.applyImmediately);
    }

    /**
     * The ID of the Linode to allocate an IPv4 address for.
     * 
     */
    @Import(name="linodeId", required=true)
    private Output<Integer> linodeId;

    /**
     * @return The ID of the Linode to allocate an IPv4 address for.
     * 
     */
    public Output<Integer> linodeId() {
        return this.linodeId;
    }

    /**
     * Whether the IPv4 address is public or private. Defaults to true.
     * 
     */
    @Import(name="public")
    private @Nullable Output<Boolean> public_;

    /**
     * @return Whether the IPv4 address is public or private. Defaults to true.
     * 
     */
    public Optional<Output<Boolean>> public_() {
        return Optional.ofNullable(this.public_);
    }

    /**
     * The reverse DNS assigned to this address.
     * 
     */
    @Import(name="rdns")
    private @Nullable Output<String> rdns;

    /**
     * @return The reverse DNS assigned to this address.
     * 
     */
    public Optional<Output<String>> rdns() {
        return Optional.ofNullable(this.rdns);
    }

    private InstanceIpArgs() {}

    private InstanceIpArgs(InstanceIpArgs $) {
        this.applyImmediately = $.applyImmediately;
        this.linodeId = $.linodeId;
        this.public_ = $.public_;
        this.rdns = $.rdns;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceIpArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceIpArgs $;

        public Builder() {
            $ = new InstanceIpArgs();
        }

        public Builder(InstanceIpArgs defaults) {
            $ = new InstanceIpArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param applyImmediately If true, the instance will be rebooted to update network interfaces.
         * 
         * @return builder
         * 
         */
        public Builder applyImmediately(@Nullable Output<Boolean> applyImmediately) {
            $.applyImmediately = applyImmediately;
            return this;
        }

        /**
         * @param applyImmediately If true, the instance will be rebooted to update network interfaces.
         * 
         * @return builder
         * 
         */
        public Builder applyImmediately(Boolean applyImmediately) {
            return applyImmediately(Output.of(applyImmediately));
        }

        /**
         * @param linodeId The ID of the Linode to allocate an IPv4 address for.
         * 
         * @return builder
         * 
         */
        public Builder linodeId(Output<Integer> linodeId) {
            $.linodeId = linodeId;
            return this;
        }

        /**
         * @param linodeId The ID of the Linode to allocate an IPv4 address for.
         * 
         * @return builder
         * 
         */
        public Builder linodeId(Integer linodeId) {
            return linodeId(Output.of(linodeId));
        }

        /**
         * @param public_ Whether the IPv4 address is public or private. Defaults to true.
         * 
         * @return builder
         * 
         */
        public Builder public_(@Nullable Output<Boolean> public_) {
            $.public_ = public_;
            return this;
        }

        /**
         * @param public_ Whether the IPv4 address is public or private. Defaults to true.
         * 
         * @return builder
         * 
         */
        public Builder public_(Boolean public_) {
            return public_(Output.of(public_));
        }

        /**
         * @param rdns The reverse DNS assigned to this address.
         * 
         * @return builder
         * 
         */
        public Builder rdns(@Nullable Output<String> rdns) {
            $.rdns = rdns;
            return this;
        }

        /**
         * @param rdns The reverse DNS assigned to this address.
         * 
         * @return builder
         * 
         */
        public Builder rdns(String rdns) {
            return rdns(Output.of(rdns));
        }

        public InstanceIpArgs build() {
            $.linodeId = Objects.requireNonNull($.linodeId, "expected parameter 'linodeId' to be non-null");
            return $;
        }
    }

}
