// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LkeClusterPoolNodeArgs extends com.pulumi.resources.ResourceArgs {

    public static final LkeClusterPoolNodeArgs Empty = new LkeClusterPoolNodeArgs();

    /**
     * The ID of the node.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The ID of the node.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The ID of the underlying Linode instance.
     * 
     */
    @Import(name="instanceId")
    private @Nullable Output<Integer> instanceId;

    /**
     * @return The ID of the underlying Linode instance.
     * 
     */
    public Optional<Output<Integer>> instanceId() {
        return Optional.ofNullable(this.instanceId);
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

    private LkeClusterPoolNodeArgs() {}

    private LkeClusterPoolNodeArgs(LkeClusterPoolNodeArgs $) {
        this.id = $.id;
        this.instanceId = $.instanceId;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LkeClusterPoolNodeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LkeClusterPoolNodeArgs $;

        public Builder() {
            $ = new LkeClusterPoolNodeArgs();
        }

        public Builder(LkeClusterPoolNodeArgs defaults) {
            $ = new LkeClusterPoolNodeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ID of the node.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of the node.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param instanceId The ID of the underlying Linode instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(@Nullable Output<Integer> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param instanceId The ID of the underlying Linode instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(Integer instanceId) {
            return instanceId(Output.of(instanceId));
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

        public LkeClusterPoolNodeArgs build() {
            return $;
        }
    }

}
