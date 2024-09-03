// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.linode.inputs.DatabasePostgresqlUpdatesArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatabasePostgresqlArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatabasePostgresqlArgs Empty = new DatabasePostgresqlArgs();

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
     * Whether the Managed Databases is encrypted. (default `false`)
     * 
     */
    @Import(name="encrypted")
    private @Nullable Output<Boolean> encrypted;

    /**
     * @return Whether the Managed Databases is encrypted. (default `false`)
     * 
     */
    public Optional<Output<Boolean>> encrypted() {
        return Optional.ofNullable(this.encrypted);
    }

    /**
     * The Managed Database engine in engine/version format. (e.g. `postgresql/13.2`)
     * 
     */
    @Import(name="engineId", required=true)
    private Output<String> engineId;

    /**
     * @return The Managed Database engine in engine/version format. (e.g. `postgresql/13.2`)
     * 
     */
    public Output<String> engineId() {
        return this.engineId;
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

    /**
     * The synchronization level of the replicating server. (`on`, `local`, `remote_write`, `remote_apply`, `off`; default `off`)
     * 
     * * Must be `local` or `off` for the `asynch` replication type.
     * 
     * * Must be `on`, `remote_write`, or `remote_apply` for the `semi_synch` replication type.
     * 
     */
    @Import(name="replicationCommitType")
    private @Nullable Output<String> replicationCommitType;

    /**
     * @return The synchronization level of the replicating server. (`on`, `local`, `remote_write`, `remote_apply`, `off`; default `off`)
     * 
     * * Must be `local` or `off` for the `asynch` replication type.
     * 
     * * Must be `on`, `remote_write`, or `remote_apply` for the `semi_synch` replication type.
     * 
     */
    public Optional<Output<String>> replicationCommitType() {
        return Optional.ofNullable(this.replicationCommitType);
    }

    /**
     * The replication method used for the Managed Database. (`none`, `asynch`, `semi_synch`; default `none`)
     * 
     * * Must be `none` for a single node cluster.
     * 
     * * Must be `asynch` or `semi_synch` for a high availability cluster.
     * 
     */
    @Import(name="replicationType")
    private @Nullable Output<String> replicationType;

    /**
     * @return The replication method used for the Managed Database. (`none`, `asynch`, `semi_synch`; default `none`)
     * 
     * * Must be `none` for a single node cluster.
     * 
     * * Must be `asynch` or `semi_synch` for a high availability cluster.
     * 
     */
    public Optional<Output<String>> replicationType() {
        return Optional.ofNullable(this.replicationType);
    }

    /**
     * Whether to require SSL credentials to establish a connection to the Managed Database. (default `false`)
     * 
     * * `updates` - (Optional) Configuration settings for automated patch update maintenance for the Managed Database.
     * 
     */
    @Import(name="sslConnection")
    private @Nullable Output<Boolean> sslConnection;

    /**
     * @return Whether to require SSL credentials to establish a connection to the Managed Database. (default `false`)
     * 
     * * `updates` - (Optional) Configuration settings for automated patch update maintenance for the Managed Database.
     * 
     */
    public Optional<Output<Boolean>> sslConnection() {
        return Optional.ofNullable(this.sslConnection);
    }

    /**
     * The Linode Instance type used for the nodes of the  Managed Database instance.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The Linode Instance type used for the nodes of the  Managed Database instance.
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
    private @Nullable Output<DatabasePostgresqlUpdatesArgs> updates;

    /**
     * @return Configuration settings for automated patch update maintenance for the Managed Database.
     * 
     */
    public Optional<Output<DatabasePostgresqlUpdatesArgs>> updates() {
        return Optional.ofNullable(this.updates);
    }

    private DatabasePostgresqlArgs() {}

    private DatabasePostgresqlArgs(DatabasePostgresqlArgs $) {
        this.allowLists = $.allowLists;
        this.clusterSize = $.clusterSize;
        this.encrypted = $.encrypted;
        this.engineId = $.engineId;
        this.label = $.label;
        this.region = $.region;
        this.replicationCommitType = $.replicationCommitType;
        this.replicationType = $.replicationType;
        this.sslConnection = $.sslConnection;
        this.type = $.type;
        this.updates = $.updates;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatabasePostgresqlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatabasePostgresqlArgs $;

        public Builder() {
            $ = new DatabasePostgresqlArgs();
        }

        public Builder(DatabasePostgresqlArgs defaults) {
            $ = new DatabasePostgresqlArgs(Objects.requireNonNull(defaults));
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
         * @param encrypted Whether the Managed Databases is encrypted. (default `false`)
         * 
         * @return builder
         * 
         */
        public Builder encrypted(@Nullable Output<Boolean> encrypted) {
            $.encrypted = encrypted;
            return this;
        }

        /**
         * @param encrypted Whether the Managed Databases is encrypted. (default `false`)
         * 
         * @return builder
         * 
         */
        public Builder encrypted(Boolean encrypted) {
            return encrypted(Output.of(encrypted));
        }

        /**
         * @param engineId The Managed Database engine in engine/version format. (e.g. `postgresql/13.2`)
         * 
         * @return builder
         * 
         */
        public Builder engineId(Output<String> engineId) {
            $.engineId = engineId;
            return this;
        }

        /**
         * @param engineId The Managed Database engine in engine/version format. (e.g. `postgresql/13.2`)
         * 
         * @return builder
         * 
         */
        public Builder engineId(String engineId) {
            return engineId(Output.of(engineId));
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

        /**
         * @param replicationCommitType The synchronization level of the replicating server. (`on`, `local`, `remote_write`, `remote_apply`, `off`; default `off`)
         * 
         * * Must be `local` or `off` for the `asynch` replication type.
         * 
         * * Must be `on`, `remote_write`, or `remote_apply` for the `semi_synch` replication type.
         * 
         * @return builder
         * 
         */
        public Builder replicationCommitType(@Nullable Output<String> replicationCommitType) {
            $.replicationCommitType = replicationCommitType;
            return this;
        }

        /**
         * @param replicationCommitType The synchronization level of the replicating server. (`on`, `local`, `remote_write`, `remote_apply`, `off`; default `off`)
         * 
         * * Must be `local` or `off` for the `asynch` replication type.
         * 
         * * Must be `on`, `remote_write`, or `remote_apply` for the `semi_synch` replication type.
         * 
         * @return builder
         * 
         */
        public Builder replicationCommitType(String replicationCommitType) {
            return replicationCommitType(Output.of(replicationCommitType));
        }

        /**
         * @param replicationType The replication method used for the Managed Database. (`none`, `asynch`, `semi_synch`; default `none`)
         * 
         * * Must be `none` for a single node cluster.
         * 
         * * Must be `asynch` or `semi_synch` for a high availability cluster.
         * 
         * @return builder
         * 
         */
        public Builder replicationType(@Nullable Output<String> replicationType) {
            $.replicationType = replicationType;
            return this;
        }

        /**
         * @param replicationType The replication method used for the Managed Database. (`none`, `asynch`, `semi_synch`; default `none`)
         * 
         * * Must be `none` for a single node cluster.
         * 
         * * Must be `asynch` or `semi_synch` for a high availability cluster.
         * 
         * @return builder
         * 
         */
        public Builder replicationType(String replicationType) {
            return replicationType(Output.of(replicationType));
        }

        /**
         * @param sslConnection Whether to require SSL credentials to establish a connection to the Managed Database. (default `false`)
         * 
         * * `updates` - (Optional) Configuration settings for automated patch update maintenance for the Managed Database.
         * 
         * @return builder
         * 
         */
        public Builder sslConnection(@Nullable Output<Boolean> sslConnection) {
            $.sslConnection = sslConnection;
            return this;
        }

        /**
         * @param sslConnection Whether to require SSL credentials to establish a connection to the Managed Database. (default `false`)
         * 
         * * `updates` - (Optional) Configuration settings for automated patch update maintenance for the Managed Database.
         * 
         * @return builder
         * 
         */
        public Builder sslConnection(Boolean sslConnection) {
            return sslConnection(Output.of(sslConnection));
        }

        /**
         * @param type The Linode Instance type used for the nodes of the  Managed Database instance.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The Linode Instance type used for the nodes of the  Managed Database instance.
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
        public Builder updates(@Nullable Output<DatabasePostgresqlUpdatesArgs> updates) {
            $.updates = updates;
            return this;
        }

        /**
         * @param updates Configuration settings for automated patch update maintenance for the Managed Database.
         * 
         * @return builder
         * 
         */
        public Builder updates(DatabasePostgresqlUpdatesArgs updates) {
            return updates(Output.of(updates));
        }

        public DatabasePostgresqlArgs build() {
            if ($.engineId == null) {
                throw new MissingRequiredPropertyException("DatabasePostgresqlArgs", "engineId");
            }
            if ($.label == null) {
                throw new MissingRequiredPropertyException("DatabasePostgresqlArgs", "label");
            }
            if ($.region == null) {
                throw new MissingRequiredPropertyException("DatabasePostgresqlArgs", "region");
            }
            if ($.type == null) {
                throw new MissingRequiredPropertyException("DatabasePostgresqlArgs", "type");
            }
            return $;
        }
    }

}
