// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.linode.inputs.DatabasePostgresqlV2TimeoutsArgs;
import com.pulumi.linode.inputs.DatabasePostgresqlV2UpdatesArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatabasePostgresqlV2Args extends com.pulumi.resources.ResourceArgs {

    public static final DatabasePostgresqlV2Args Empty = new DatabasePostgresqlV2Args();

    /**
     * A list of IP addresses that can access the Managed Database. Each item can be a single IP address or a range in CIDR format. Use `linode.DatabaseAccessControls` to manage your allow list separately.
     * 
     */
    @Import(name="allowLists")
    private @Nullable Output<List<String>> allowLists;

    /**
     * @return A list of IP addresses that can access the Managed Database. Each item can be a single IP address or a range in CIDR format. Use `linode.DatabaseAccessControls` to manage your allow list separately.
     * 
     */
    public Optional<Output<List<String>>> allowLists() {
        return Optional.ofNullable(this.allowLists);
    }

    /**
     * The number of Linode Instance nodes deployed to the Managed Database. (default `1`)
     * 
     */
    @Import(name="clusterSize")
    private @Nullable Output<Integer> clusterSize;

    /**
     * @return The number of Linode Instance nodes deployed to the Managed Database. (default `1`)
     * 
     */
    public Optional<Output<Integer>> clusterSize() {
        return Optional.ofNullable(this.clusterSize);
    }

    /**
     * The Managed Database engine in engine/version format. (e.g. `postgresql/16`)
     * 
     */
    @Import(name="engineId", required=true)
    private Output<String> engineId;

    /**
     * @return The Managed Database engine in engine/version format. (e.g. `postgresql/16`)
     * 
     */
    public Output<String> engineId() {
        return this.engineId;
    }

    /**
     * The database timestamp from which it was restored.
     * 
     */
    @Import(name="forkRestoreTime")
    private @Nullable Output<String> forkRestoreTime;

    /**
     * @return The database timestamp from which it was restored.
     * 
     */
    public Optional<Output<String>> forkRestoreTime() {
        return Optional.ofNullable(this.forkRestoreTime);
    }

    /**
     * The ID of the database that was forked from.
     * 
     * * `updates` - (Optional) Configuration settings for automated patch update maintenance for the Managed Database.
     * 
     */
    @Import(name="forkSource")
    private @Nullable Output<Integer> forkSource;

    /**
     * @return The ID of the database that was forked from.
     * 
     * * `updates` - (Optional) Configuration settings for automated patch update maintenance for the Managed Database.
     * 
     */
    public Optional<Output<Integer>> forkSource() {
        return Optional.ofNullable(this.forkSource);
    }

    /**
     * A unique, user-defined string referring to the Managed Database.
     * 
     */
    @Import(name="label", required=true)
    private Output<String> label;

    /**
     * @return A unique, user-defined string referring to the Managed Database.
     * 
     */
    public Output<String> label() {
        return this.label;
    }

    /**
     * The region to use for the Managed Database.
     * 
     */
    @Import(name="region", required=true)
    private Output<String> region;

    /**
     * @return The region to use for the Managed Database.
     * 
     */
    public Output<String> region() {
        return this.region;
    }

    @Import(name="timeouts")
    private @Nullable Output<DatabasePostgresqlV2TimeoutsArgs> timeouts;

    public Optional<Output<DatabasePostgresqlV2TimeoutsArgs>> timeouts() {
        return Optional.ofNullable(this.timeouts);
    }

    /**
     * The Linode Instance type used for the nodes of the Managed Database.
     * 
     * ***
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The Linode Instance type used for the nodes of the Managed Database.
     * 
     * ***
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * Configuration settings for automated patch update maintenance for the Managed Database.
     * 
     */
    @Import(name="updates")
    private @Nullable Output<DatabasePostgresqlV2UpdatesArgs> updates;

    /**
     * @return Configuration settings for automated patch update maintenance for the Managed Database.
     * 
     */
    public Optional<Output<DatabasePostgresqlV2UpdatesArgs>> updates() {
        return Optional.ofNullable(this.updates);
    }

    private DatabasePostgresqlV2Args() {}

    private DatabasePostgresqlV2Args(DatabasePostgresqlV2Args $) {
        this.allowLists = $.allowLists;
        this.clusterSize = $.clusterSize;
        this.engineId = $.engineId;
        this.forkRestoreTime = $.forkRestoreTime;
        this.forkSource = $.forkSource;
        this.label = $.label;
        this.region = $.region;
        this.timeouts = $.timeouts;
        this.type = $.type;
        this.updates = $.updates;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatabasePostgresqlV2Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatabasePostgresqlV2Args $;

        public Builder() {
            $ = new DatabasePostgresqlV2Args();
        }

        public Builder(DatabasePostgresqlV2Args defaults) {
            $ = new DatabasePostgresqlV2Args(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowLists A list of IP addresses that can access the Managed Database. Each item can be a single IP address or a range in CIDR format. Use `linode.DatabaseAccessControls` to manage your allow list separately.
         * 
         * @return builder
         * 
         */
        public Builder allowLists(@Nullable Output<List<String>> allowLists) {
            $.allowLists = allowLists;
            return this;
        }

        /**
         * @param allowLists A list of IP addresses that can access the Managed Database. Each item can be a single IP address or a range in CIDR format. Use `linode.DatabaseAccessControls` to manage your allow list separately.
         * 
         * @return builder
         * 
         */
        public Builder allowLists(List<String> allowLists) {
            return allowLists(Output.of(allowLists));
        }

        /**
         * @param allowLists A list of IP addresses that can access the Managed Database. Each item can be a single IP address or a range in CIDR format. Use `linode.DatabaseAccessControls` to manage your allow list separately.
         * 
         * @return builder
         * 
         */
        public Builder allowLists(String... allowLists) {
            return allowLists(List.of(allowLists));
        }

        /**
         * @param clusterSize The number of Linode Instance nodes deployed to the Managed Database. (default `1`)
         * 
         * @return builder
         * 
         */
        public Builder clusterSize(@Nullable Output<Integer> clusterSize) {
            $.clusterSize = clusterSize;
            return this;
        }

        /**
         * @param clusterSize The number of Linode Instance nodes deployed to the Managed Database. (default `1`)
         * 
         * @return builder
         * 
         */
        public Builder clusterSize(Integer clusterSize) {
            return clusterSize(Output.of(clusterSize));
        }

        /**
         * @param engineId The Managed Database engine in engine/version format. (e.g. `postgresql/16`)
         * 
         * @return builder
         * 
         */
        public Builder engineId(Output<String> engineId) {
            $.engineId = engineId;
            return this;
        }

        /**
         * @param engineId The Managed Database engine in engine/version format. (e.g. `postgresql/16`)
         * 
         * @return builder
         * 
         */
        public Builder engineId(String engineId) {
            return engineId(Output.of(engineId));
        }

        /**
         * @param forkRestoreTime The database timestamp from which it was restored.
         * 
         * @return builder
         * 
         */
        public Builder forkRestoreTime(@Nullable Output<String> forkRestoreTime) {
            $.forkRestoreTime = forkRestoreTime;
            return this;
        }

        /**
         * @param forkRestoreTime The database timestamp from which it was restored.
         * 
         * @return builder
         * 
         */
        public Builder forkRestoreTime(String forkRestoreTime) {
            return forkRestoreTime(Output.of(forkRestoreTime));
        }

        /**
         * @param forkSource The ID of the database that was forked from.
         * 
         * * `updates` - (Optional) Configuration settings for automated patch update maintenance for the Managed Database.
         * 
         * @return builder
         * 
         */
        public Builder forkSource(@Nullable Output<Integer> forkSource) {
            $.forkSource = forkSource;
            return this;
        }

        /**
         * @param forkSource The ID of the database that was forked from.
         * 
         * * `updates` - (Optional) Configuration settings for automated patch update maintenance for the Managed Database.
         * 
         * @return builder
         * 
         */
        public Builder forkSource(Integer forkSource) {
            return forkSource(Output.of(forkSource));
        }

        /**
         * @param label A unique, user-defined string referring to the Managed Database.
         * 
         * @return builder
         * 
         */
        public Builder label(Output<String> label) {
            $.label = label;
            return this;
        }

        /**
         * @param label A unique, user-defined string referring to the Managed Database.
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            return label(Output.of(label));
        }

        /**
         * @param region The region to use for the Managed Database.
         * 
         * @return builder
         * 
         */
        public Builder region(Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The region to use for the Managed Database.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        public Builder timeouts(@Nullable Output<DatabasePostgresqlV2TimeoutsArgs> timeouts) {
            $.timeouts = timeouts;
            return this;
        }

        public Builder timeouts(DatabasePostgresqlV2TimeoutsArgs timeouts) {
            return timeouts(Output.of(timeouts));
        }

        /**
         * @param type The Linode Instance type used for the nodes of the Managed Database.
         * 
         * ***
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The Linode Instance type used for the nodes of the Managed Database.
         * 
         * ***
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param updates Configuration settings for automated patch update maintenance for the Managed Database.
         * 
         * @return builder
         * 
         */
        public Builder updates(@Nullable Output<DatabasePostgresqlV2UpdatesArgs> updates) {
            $.updates = updates;
            return this;
        }

        /**
         * @param updates Configuration settings for automated patch update maintenance for the Managed Database.
         * 
         * @return builder
         * 
         */
        public Builder updates(DatabasePostgresqlV2UpdatesArgs updates) {
            return updates(Output.of(updates));
        }

        public DatabasePostgresqlV2Args build() {
            if ($.engineId == null) {
                throw new MissingRequiredPropertyException("DatabasePostgresqlV2Args", "engineId");
            }
            if ($.label == null) {
                throw new MissingRequiredPropertyException("DatabasePostgresqlV2Args", "label");
            }
            if ($.region == null) {
                throw new MissingRequiredPropertyException("DatabasePostgresqlV2Args", "region");
            }
            if ($.type == null) {
                throw new MissingRequiredPropertyException("DatabasePostgresqlV2Args", "type");
            }
            return $;
        }
    }

}
