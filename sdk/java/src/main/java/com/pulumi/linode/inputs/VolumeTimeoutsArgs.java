// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VolumeTimeoutsArgs extends com.pulumi.resources.ResourceArgs {

    public static final VolumeTimeoutsArgs Empty = new VolumeTimeoutsArgs();

    /**
     * Used when creating the volume (until the volume is reaches the initial `active` state)
     * 
     */
    @Import(name="create")
    private @Nullable Output<String> create;

    /**
     * @return Used when creating the volume (until the volume is reaches the initial `active` state)
     * 
     */
    public Optional<Output<String>> create() {
        return Optional.ofNullable(this.create);
    }

    /**
     * Used when deleting the volume
     * 
     */
    @Import(name="delete")
    private @Nullable Output<String> delete;

    /**
     * @return Used when deleting the volume
     * 
     */
    public Optional<Output<String>> delete() {
        return Optional.ofNullable(this.delete);
    }

    /**
     * Used when updating the volume when necessary during update - e.g. when resizing the volume
     * 
     */
    @Import(name="update")
    private @Nullable Output<String> update;

    /**
     * @return Used when updating the volume when necessary during update - e.g. when resizing the volume
     * 
     */
    public Optional<Output<String>> update() {
        return Optional.ofNullable(this.update);
    }

    private VolumeTimeoutsArgs() {}

    private VolumeTimeoutsArgs(VolumeTimeoutsArgs $) {
        this.create = $.create;
        this.delete = $.delete;
        this.update = $.update;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VolumeTimeoutsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VolumeTimeoutsArgs $;

        public Builder() {
            $ = new VolumeTimeoutsArgs();
        }

        public Builder(VolumeTimeoutsArgs defaults) {
            $ = new VolumeTimeoutsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param create Used when creating the volume (until the volume is reaches the initial `active` state)
         * 
         * @return builder
         * 
         */
        public Builder create(@Nullable Output<String> create) {
            $.create = create;
            return this;
        }

        /**
         * @param create Used when creating the volume (until the volume is reaches the initial `active` state)
         * 
         * @return builder
         * 
         */
        public Builder create(String create) {
            return create(Output.of(create));
        }

        /**
         * @param delete Used when deleting the volume
         * 
         * @return builder
         * 
         */
        public Builder delete(@Nullable Output<String> delete) {
            $.delete = delete;
            return this;
        }

        /**
         * @param delete Used when deleting the volume
         * 
         * @return builder
         * 
         */
        public Builder delete(String delete) {
            return delete(Output.of(delete));
        }

        /**
         * @param update Used when updating the volume when necessary during update - e.g. when resizing the volume
         * 
         * @return builder
         * 
         */
        public Builder update(@Nullable Output<String> update) {
            $.update = update;
            return this;
        }

        /**
         * @param update Used when updating the volume when necessary during update - e.g. when resizing the volume
         * 
         * @return builder
         * 
         */
        public Builder update(String update) {
            return update(Output.of(update));
        }

        public VolumeTimeoutsArgs build() {
            return $;
        }
    }

}
