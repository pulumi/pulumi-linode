// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.linode.inputs.GetLkeClusterControlPlaneArgs;
import com.pulumi.linode.inputs.GetLkeClusterPoolArgs;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetLkeClusterArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLkeClusterArgs Empty = new GetLkeClusterArgs();

    @Import(name="controlPlanes")
    private @Nullable Output<List<GetLkeClusterControlPlaneArgs>> controlPlanes;

    public Optional<Output<List<GetLkeClusterControlPlaneArgs>>> controlPlanes() {
        return Optional.ofNullable(this.controlPlanes);
    }

    /**
     * The LKE Cluster&#39;s ID.
     * 
     */
    @Import(name="id", required=true)
    private Output<Integer> id;

    /**
     * @return The LKE Cluster&#39;s ID.
     * 
     */
    public Output<Integer> id() {
        return this.id;
    }

    /**
     * Node pools associated with this cluster.
     * 
     */
    @Import(name="pools")
    private @Nullable Output<List<GetLkeClusterPoolArgs>> pools;

    /**
     * @return Node pools associated with this cluster.
     * 
     */
    public Optional<Output<List<GetLkeClusterPoolArgs>>> pools() {
        return Optional.ofNullable(this.pools);
    }

    private GetLkeClusterArgs() {}

    private GetLkeClusterArgs(GetLkeClusterArgs $) {
        this.controlPlanes = $.controlPlanes;
        this.id = $.id;
        this.pools = $.pools;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLkeClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLkeClusterArgs $;

        public Builder() {
            $ = new GetLkeClusterArgs();
        }

        public Builder(GetLkeClusterArgs defaults) {
            $ = new GetLkeClusterArgs(Objects.requireNonNull(defaults));
        }

        public Builder controlPlanes(@Nullable Output<List<GetLkeClusterControlPlaneArgs>> controlPlanes) {
            $.controlPlanes = controlPlanes;
            return this;
        }

        public Builder controlPlanes(List<GetLkeClusterControlPlaneArgs> controlPlanes) {
            return controlPlanes(Output.of(controlPlanes));
        }

        public Builder controlPlanes(GetLkeClusterControlPlaneArgs... controlPlanes) {
            return controlPlanes(List.of(controlPlanes));
        }

        /**
         * @param id The LKE Cluster&#39;s ID.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<Integer> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The LKE Cluster&#39;s ID.
         * 
         * @return builder
         * 
         */
        public Builder id(Integer id) {
            return id(Output.of(id));
        }

        /**
         * @param pools Node pools associated with this cluster.
         * 
         * @return builder
         * 
         */
        public Builder pools(@Nullable Output<List<GetLkeClusterPoolArgs>> pools) {
            $.pools = pools;
            return this;
        }

        /**
         * @param pools Node pools associated with this cluster.
         * 
         * @return builder
         * 
         */
        public Builder pools(List<GetLkeClusterPoolArgs> pools) {
            return pools(Output.of(pools));
        }

        /**
         * @param pools Node pools associated with this cluster.
         * 
         * @return builder
         * 
         */
        public Builder pools(GetLkeClusterPoolArgs... pools) {
            return pools(List.of(pools));
        }

        public GetLkeClusterArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetLkeClusterArgs", "id");
            }
            return $;
        }
    }

}
