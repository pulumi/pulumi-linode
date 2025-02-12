// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.linode.inputs.LkeClusterControlPlaneArgs;
import com.pulumi.linode.inputs.LkeClusterPoolArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LkeClusterState extends com.pulumi.resources.ResourceArgs {

    public static final LkeClusterState Empty = new LkeClusterState();

    /**
     * The endpoints for the Kubernetes API server.
     * 
     */
    @Import(name="apiEndpoints")
    private @Nullable Output<List<String>> apiEndpoints;

    /**
     * @return The endpoints for the Kubernetes API server.
     * 
     */
    public Optional<Output<List<String>>> apiEndpoints() {
        return Optional.ofNullable(this.apiEndpoints);
    }

    /**
     * Defines settings for the Kubernetes Control Plane.
     * 
     */
    @Import(name="controlPlane")
    private @Nullable Output<LkeClusterControlPlaneArgs> controlPlane;

    /**
     * @return Defines settings for the Kubernetes Control Plane.
     * 
     */
    public Optional<Output<LkeClusterControlPlaneArgs>> controlPlane() {
        return Optional.ofNullable(this.controlPlane);
    }

    /**
     * The Kubernetes Dashboard access URL for this cluster.
     * 
     */
    @Import(name="dashboardUrl")
    private @Nullable Output<String> dashboardUrl;

    /**
     * @return The Kubernetes Dashboard access URL for this cluster.
     * 
     */
    public Optional<Output<String>> dashboardUrl() {
        return Optional.ofNullable(this.dashboardUrl);
    }

    /**
     * A set of node pool tags to ignore when planning and applying this cluster. This prevents externally managed node pools from being deleted or unintentionally updated on subsequent applies. See Externally Managed Node Pools for more details.
     * 
     */
    @Import(name="externalPoolTags")
    private @Nullable Output<List<String>> externalPoolTags;

    /**
     * @return A set of node pool tags to ignore when planning and applying this cluster. This prevents externally managed node pools from being deleted or unintentionally updated on subsequent applies. See Externally Managed Node Pools for more details.
     * 
     */
    public Optional<Output<List<String>>> externalPoolTags() {
        return Optional.ofNullable(this.externalPoolTags);
    }

    /**
     * The desired Kubernetes version for this Kubernetes cluster in the format of `major.minor` (e.g. `1.21`), and the latest supported patch version will be deployed.
     * 
     */
    @Import(name="k8sVersion")
    private @Nullable Output<String> k8sVersion;

    /**
     * @return The desired Kubernetes version for this Kubernetes cluster in the format of `major.minor` (e.g. `1.21`), and the latest supported patch version will be deployed.
     * 
     */
    public Optional<Output<String>> k8sVersion() {
        return Optional.ofNullable(this.k8sVersion);
    }

    /**
     * The base64 encoded kubeconfig for the Kubernetes cluster.
     * 
     */
    @Import(name="kubeconfig")
    private @Nullable Output<String> kubeconfig;

    /**
     * @return The base64 encoded kubeconfig for the Kubernetes cluster.
     * 
     */
    public Optional<Output<String>> kubeconfig() {
        return Optional.ofNullable(this.kubeconfig);
    }

    /**
     * This Kubernetes cluster&#39;s unique label.
     * 
     */
    @Import(name="label")
    private @Nullable Output<String> label;

    /**
     * @return This Kubernetes cluster&#39;s unique label.
     * 
     */
    public Optional<Output<String>> label() {
        return Optional.ofNullable(this.label);
    }

    /**
     * Additional nested attributes:
     * 
     */
    @Import(name="pools")
    private @Nullable Output<List<LkeClusterPoolArgs>> pools;

    /**
     * @return Additional nested attributes:
     * 
     */
    public Optional<Output<List<LkeClusterPoolArgs>>> pools() {
        return Optional.ofNullable(this.pools);
    }

    /**
     * This Kubernetes cluster&#39;s location.
     * 
     * * `pool` - (Required) The Node Pool specifications for the Kubernetes cluster. At least one Node Pool is required.
     * 
     * * `control_plane` (Optional) Defines settings for the Kubernetes Control Plane.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return This Kubernetes cluster&#39;s location.
     * 
     * * `pool` - (Required) The Node Pool specifications for the Kubernetes cluster. At least one Node Pool is required.
     * 
     * * `control_plane` (Optional) Defines settings for the Kubernetes Control Plane.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * The status of the node. (`ready`, `not_ready`)
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of the node. (`ready`, `not_ready`)
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * An array of tags applied to the Kubernetes cluster. Tags are case-insensitive and are for organizational purposes only.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return An array of tags applied to the Kubernetes cluster. Tags are case-insensitive and are for organizational purposes only.
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The desired Kubernetes tier. (**Note: v4beta only and may not currently be available to all users.**)
     * 
     */
    @Import(name="tier")
    private @Nullable Output<String> tier;

    /**
     * @return The desired Kubernetes tier. (**Note: v4beta only and may not currently be available to all users.**)
     * 
     */
    public Optional<Output<String>> tier() {
        return Optional.ofNullable(this.tier);
    }

    private LkeClusterState() {}

    private LkeClusterState(LkeClusterState $) {
        this.apiEndpoints = $.apiEndpoints;
        this.controlPlane = $.controlPlane;
        this.dashboardUrl = $.dashboardUrl;
        this.externalPoolTags = $.externalPoolTags;
        this.k8sVersion = $.k8sVersion;
        this.kubeconfig = $.kubeconfig;
        this.label = $.label;
        this.pools = $.pools;
        this.region = $.region;
        this.status = $.status;
        this.tags = $.tags;
        this.tier = $.tier;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LkeClusterState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LkeClusterState $;

        public Builder() {
            $ = new LkeClusterState();
        }

        public Builder(LkeClusterState defaults) {
            $ = new LkeClusterState(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiEndpoints The endpoints for the Kubernetes API server.
         * 
         * @return builder
         * 
         */
        public Builder apiEndpoints(@Nullable Output<List<String>> apiEndpoints) {
            $.apiEndpoints = apiEndpoints;
            return this;
        }

        /**
         * @param apiEndpoints The endpoints for the Kubernetes API server.
         * 
         * @return builder
         * 
         */
        public Builder apiEndpoints(List<String> apiEndpoints) {
            return apiEndpoints(Output.of(apiEndpoints));
        }

        /**
         * @param apiEndpoints The endpoints for the Kubernetes API server.
         * 
         * @return builder
         * 
         */
        public Builder apiEndpoints(String... apiEndpoints) {
            return apiEndpoints(List.of(apiEndpoints));
        }

        /**
         * @param controlPlane Defines settings for the Kubernetes Control Plane.
         * 
         * @return builder
         * 
         */
        public Builder controlPlane(@Nullable Output<LkeClusterControlPlaneArgs> controlPlane) {
            $.controlPlane = controlPlane;
            return this;
        }

        /**
         * @param controlPlane Defines settings for the Kubernetes Control Plane.
         * 
         * @return builder
         * 
         */
        public Builder controlPlane(LkeClusterControlPlaneArgs controlPlane) {
            return controlPlane(Output.of(controlPlane));
        }

        /**
         * @param dashboardUrl The Kubernetes Dashboard access URL for this cluster.
         * 
         * @return builder
         * 
         */
        public Builder dashboardUrl(@Nullable Output<String> dashboardUrl) {
            $.dashboardUrl = dashboardUrl;
            return this;
        }

        /**
         * @param dashboardUrl The Kubernetes Dashboard access URL for this cluster.
         * 
         * @return builder
         * 
         */
        public Builder dashboardUrl(String dashboardUrl) {
            return dashboardUrl(Output.of(dashboardUrl));
        }

        /**
         * @param externalPoolTags A set of node pool tags to ignore when planning and applying this cluster. This prevents externally managed node pools from being deleted or unintentionally updated on subsequent applies. See Externally Managed Node Pools for more details.
         * 
         * @return builder
         * 
         */
        public Builder externalPoolTags(@Nullable Output<List<String>> externalPoolTags) {
            $.externalPoolTags = externalPoolTags;
            return this;
        }

        /**
         * @param externalPoolTags A set of node pool tags to ignore when planning and applying this cluster. This prevents externally managed node pools from being deleted or unintentionally updated on subsequent applies. See Externally Managed Node Pools for more details.
         * 
         * @return builder
         * 
         */
        public Builder externalPoolTags(List<String> externalPoolTags) {
            return externalPoolTags(Output.of(externalPoolTags));
        }

        /**
         * @param externalPoolTags A set of node pool tags to ignore when planning and applying this cluster. This prevents externally managed node pools from being deleted or unintentionally updated on subsequent applies. See Externally Managed Node Pools for more details.
         * 
         * @return builder
         * 
         */
        public Builder externalPoolTags(String... externalPoolTags) {
            return externalPoolTags(List.of(externalPoolTags));
        }

        /**
         * @param k8sVersion The desired Kubernetes version for this Kubernetes cluster in the format of `major.minor` (e.g. `1.21`), and the latest supported patch version will be deployed.
         * 
         * @return builder
         * 
         */
        public Builder k8sVersion(@Nullable Output<String> k8sVersion) {
            $.k8sVersion = k8sVersion;
            return this;
        }

        /**
         * @param k8sVersion The desired Kubernetes version for this Kubernetes cluster in the format of `major.minor` (e.g. `1.21`), and the latest supported patch version will be deployed.
         * 
         * @return builder
         * 
         */
        public Builder k8sVersion(String k8sVersion) {
            return k8sVersion(Output.of(k8sVersion));
        }

        /**
         * @param kubeconfig The base64 encoded kubeconfig for the Kubernetes cluster.
         * 
         * @return builder
         * 
         */
        public Builder kubeconfig(@Nullable Output<String> kubeconfig) {
            $.kubeconfig = kubeconfig;
            return this;
        }

        /**
         * @param kubeconfig The base64 encoded kubeconfig for the Kubernetes cluster.
         * 
         * @return builder
         * 
         */
        public Builder kubeconfig(String kubeconfig) {
            return kubeconfig(Output.of(kubeconfig));
        }

        /**
         * @param label This Kubernetes cluster&#39;s unique label.
         * 
         * @return builder
         * 
         */
        public Builder label(@Nullable Output<String> label) {
            $.label = label;
            return this;
        }

        /**
         * @param label This Kubernetes cluster&#39;s unique label.
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            return label(Output.of(label));
        }

        /**
         * @param pools Additional nested attributes:
         * 
         * @return builder
         * 
         */
        public Builder pools(@Nullable Output<List<LkeClusterPoolArgs>> pools) {
            $.pools = pools;
            return this;
        }

        /**
         * @param pools Additional nested attributes:
         * 
         * @return builder
         * 
         */
        public Builder pools(List<LkeClusterPoolArgs> pools) {
            return pools(Output.of(pools));
        }

        /**
         * @param pools Additional nested attributes:
         * 
         * @return builder
         * 
         */
        public Builder pools(LkeClusterPoolArgs... pools) {
            return pools(List.of(pools));
        }

        /**
         * @param region This Kubernetes cluster&#39;s location.
         * 
         * * `pool` - (Required) The Node Pool specifications for the Kubernetes cluster. At least one Node Pool is required.
         * 
         * * `control_plane` (Optional) Defines settings for the Kubernetes Control Plane.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region This Kubernetes cluster&#39;s location.
         * 
         * * `pool` - (Required) The Node Pool specifications for the Kubernetes cluster. At least one Node Pool is required.
         * 
         * * `control_plane` (Optional) Defines settings for the Kubernetes Control Plane.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param status The status of the node. (`ready`, `not_ready`)
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the node. (`ready`, `not_ready`)
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param tags An array of tags applied to the Kubernetes cluster. Tags are case-insensitive and are for organizational purposes only.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags An array of tags applied to the Kubernetes cluster. Tags are case-insensitive and are for organizational purposes only.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags An array of tags applied to the Kubernetes cluster. Tags are case-insensitive and are for organizational purposes only.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param tier The desired Kubernetes tier. (**Note: v4beta only and may not currently be available to all users.**)
         * 
         * @return builder
         * 
         */
        public Builder tier(@Nullable Output<String> tier) {
            $.tier = tier;
            return this;
        }

        /**
         * @param tier The desired Kubernetes tier. (**Note: v4beta only and may not currently be available to all users.**)
         * 
         * @return builder
         * 
         */
        public Builder tier(String tier) {
            return tier(Output.of(tier));
        }

        public LkeClusterState build() {
            return $;
        }
    }

}
