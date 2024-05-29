// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.linode.inputs.GetLkeClusterControlPlaneAcl;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetLkeClusterControlPlane extends com.pulumi.resources.InvokeArgs {

    public static final GetLkeClusterControlPlane Empty = new GetLkeClusterControlPlane();

    /**
     * The ACL configuration for an LKE cluster&#39;s control plane.
     * 
     */
    @Import(name="acls")
    private @Nullable List<GetLkeClusterControlPlaneAcl> acls;

    /**
     * @return The ACL configuration for an LKE cluster&#39;s control plane.
     * 
     */
    public Optional<List<GetLkeClusterControlPlaneAcl>> acls() {
        return Optional.ofNullable(this.acls);
    }

    /**
     * Whether High Availability is enabled for the cluster Control Plane.
     * 
     */
    @Import(name="highAvailability", required=true)
    private Boolean highAvailability;

    /**
     * @return Whether High Availability is enabled for the cluster Control Plane.
     * 
     */
    public Boolean highAvailability() {
        return this.highAvailability;
    }

    private GetLkeClusterControlPlane() {}

    private GetLkeClusterControlPlane(GetLkeClusterControlPlane $) {
        this.acls = $.acls;
        this.highAvailability = $.highAvailability;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLkeClusterControlPlane defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLkeClusterControlPlane $;

        public Builder() {
            $ = new GetLkeClusterControlPlane();
        }

        public Builder(GetLkeClusterControlPlane defaults) {
            $ = new GetLkeClusterControlPlane(Objects.requireNonNull(defaults));
        }

        /**
         * @param acls The ACL configuration for an LKE cluster&#39;s control plane.
         * 
         * @return builder
         * 
         */
        public Builder acls(@Nullable List<GetLkeClusterControlPlaneAcl> acls) {
            $.acls = acls;
            return this;
        }

        /**
         * @param acls The ACL configuration for an LKE cluster&#39;s control plane.
         * 
         * @return builder
         * 
         */
        public Builder acls(GetLkeClusterControlPlaneAcl... acls) {
            return acls(List.of(acls));
        }

        /**
         * @param highAvailability Whether High Availability is enabled for the cluster Control Plane.
         * 
         * @return builder
         * 
         */
        public Builder highAvailability(Boolean highAvailability) {
            $.highAvailability = highAvailability;
            return this;
        }

        public GetLkeClusterControlPlane build() {
            if ($.highAvailability == null) {
                throw new MissingRequiredPropertyException("GetLkeClusterControlPlane", "highAvailability");
            }
            return $;
        }
    }

}
