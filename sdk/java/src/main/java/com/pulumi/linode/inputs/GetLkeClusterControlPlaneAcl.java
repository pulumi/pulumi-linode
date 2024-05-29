// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.linode.inputs.GetLkeClusterControlPlaneAclAddress;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetLkeClusterControlPlaneAcl extends com.pulumi.resources.InvokeArgs {

    public static final GetLkeClusterControlPlaneAcl Empty = new GetLkeClusterControlPlaneAcl();

    /**
     * A list of ip addresses to allow.
     * 
     */
    @Import(name="addresses")
    private @Nullable List<GetLkeClusterControlPlaneAclAddress> addresses;

    /**
     * @return A list of ip addresses to allow.
     * 
     */
    public Optional<List<GetLkeClusterControlPlaneAclAddress>> addresses() {
        return Optional.ofNullable(this.addresses);
    }

    /**
     * The default policy. A value of true means a default policy of DENY. A value of false means a default policy of ALLOW.
     * 
     */
    @Import(name="enabled", required=true)
    private Boolean enabled;

    /**
     * @return The default policy. A value of true means a default policy of DENY. A value of false means a default policy of ALLOW.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }

    private GetLkeClusterControlPlaneAcl() {}

    private GetLkeClusterControlPlaneAcl(GetLkeClusterControlPlaneAcl $) {
        this.addresses = $.addresses;
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLkeClusterControlPlaneAcl defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLkeClusterControlPlaneAcl $;

        public Builder() {
            $ = new GetLkeClusterControlPlaneAcl();
        }

        public Builder(GetLkeClusterControlPlaneAcl defaults) {
            $ = new GetLkeClusterControlPlaneAcl(Objects.requireNonNull(defaults));
        }

        /**
         * @param addresses A list of ip addresses to allow.
         * 
         * @return builder
         * 
         */
        public Builder addresses(@Nullable List<GetLkeClusterControlPlaneAclAddress> addresses) {
            $.addresses = addresses;
            return this;
        }

        /**
         * @param addresses A list of ip addresses to allow.
         * 
         * @return builder
         * 
         */
        public Builder addresses(GetLkeClusterControlPlaneAclAddress... addresses) {
            return addresses(List.of(addresses));
        }

        /**
         * @param enabled The default policy. A value of true means a default policy of DENY. A value of false means a default policy of ALLOW.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            $.enabled = enabled;
            return this;
        }

        public GetLkeClusterControlPlaneAcl build() {
            if ($.enabled == null) {
                throw new MissingRequiredPropertyException("GetLkeClusterControlPlaneAcl", "enabled");
            }
            return $;
        }
    }

}
