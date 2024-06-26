// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.linode.inputs.GetLkeClusterControlPlaneAclAddressArgs;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetLkeClusterControlPlaneAclArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetLkeClusterControlPlaneAclArgs Empty = new GetLkeClusterControlPlaneAclArgs();

    /**
     * A list of ip addresses to allow.
     * 
     */
    @Import(name="addresses")
    private @Nullable Output<List<GetLkeClusterControlPlaneAclAddressArgs>> addresses;

    /**
     * @return A list of ip addresses to allow.
     * 
     */
    public Optional<Output<List<GetLkeClusterControlPlaneAclAddressArgs>>> addresses() {
        return Optional.ofNullable(this.addresses);
    }

    /**
     * The default policy. A value of true means a default policy of DENY. A value of false means a default policy of ALLOW.
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return The default policy. A value of true means a default policy of DENY. A value of false means a default policy of ALLOW.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    private GetLkeClusterControlPlaneAclArgs() {}

    private GetLkeClusterControlPlaneAclArgs(GetLkeClusterControlPlaneAclArgs $) {
        this.addresses = $.addresses;
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLkeClusterControlPlaneAclArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLkeClusterControlPlaneAclArgs $;

        public Builder() {
            $ = new GetLkeClusterControlPlaneAclArgs();
        }

        public Builder(GetLkeClusterControlPlaneAclArgs defaults) {
            $ = new GetLkeClusterControlPlaneAclArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param addresses A list of ip addresses to allow.
         * 
         * @return builder
         * 
         */
        public Builder addresses(@Nullable Output<List<GetLkeClusterControlPlaneAclAddressArgs>> addresses) {
            $.addresses = addresses;
            return this;
        }

        /**
         * @param addresses A list of ip addresses to allow.
         * 
         * @return builder
         * 
         */
        public Builder addresses(List<GetLkeClusterControlPlaneAclAddressArgs> addresses) {
            return addresses(Output.of(addresses));
        }

        /**
         * @param addresses A list of ip addresses to allow.
         * 
         * @return builder
         * 
         */
        public Builder addresses(GetLkeClusterControlPlaneAclAddressArgs... addresses) {
            return addresses(List.of(addresses));
        }

        /**
         * @param enabled The default policy. A value of true means a default policy of DENY. A value of false means a default policy of ALLOW.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled The default policy. A value of true means a default policy of DENY. A value of false means a default policy of ALLOW.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public GetLkeClusterControlPlaneAclArgs build() {
            if ($.enabled == null) {
                throw new MissingRequiredPropertyException("GetLkeClusterControlPlaneAclArgs", "enabled");
            }
            return $;
        }
    }

}
