// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.linode.inputs.DatabaseMysqlV2PendingUpdateArgs;
import com.pulumi.linode.inputs.DatabaseMysqlV2TimeoutsArgs;
import com.pulumi.linode.inputs.DatabaseMysqlV2UpdatesArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatabaseMysqlV2State extends com.pulumi.resources.ResourceArgs {

    public static final DatabaseMysqlV2State Empty = new DatabaseMysqlV2State();

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
     * The base64-encoded SSL CA certificate for the Managed Database.
     * 
     */
    @Import(name="caCert")
    private @Nullable Output<String> caCert;

    /**
     * @return The base64-encoded SSL CA certificate for the Managed Database.
     * 
     */
    public Optional<Output<String>> caCert() {
        return Optional.ofNullable(this.caCert);
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
     * When this Managed Database was created.
     * 
     */
    @Import(name="created")
    private @Nullable Output<String> created;

    /**
     * @return When this Managed Database was created.
     * 
     */
    public Optional<Output<String>> created() {
        return Optional.ofNullable(this.created);
    }

    /**
     * Whether the Managed Databases is encrypted.
     * 
     */
    @Import(name="encrypted")
    private @Nullable Output<Boolean> encrypted;

    /**
     * @return Whether the Managed Databases is encrypted.
     * 
     */
    public Optional<Output<Boolean>> encrypted() {
        return Optional.ofNullable(this.encrypted);
    }

    /**
     * The Managed Database engine. (e.g. `mysql`)
     * 
     */
    @Import(name="engine")
    private @Nullable Output<String> engine;

    /**
     * @return The Managed Database engine. (e.g. `mysql`)
     * 
     */
    public Optional<Output<String>> engine() {
        return Optional.ofNullable(this.engine);
    }

    /**
     * The Managed Database engine in engine/version format. (e.g. `mysql`)
     * 
     */
    @Import(name="engineId")
    private @Nullable Output<String> engineId;

    /**
     * @return The Managed Database engine in engine/version format. (e.g. `mysql`)
     * 
     */
    public Optional<Output<String>> engineId() {
        return Optional.ofNullable(this.engineId);
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
     * The primary host for the Managed Database.
     * 
     */
    @Import(name="hostPrimary")
    private @Nullable Output<String> hostPrimary;

    /**
     * @return The primary host for the Managed Database.
     * 
     */
    public Optional<Output<String>> hostPrimary() {
        return Optional.ofNullable(this.hostPrimary);
    }

    /**
     * The secondary/private host for the managed database.
     * 
     */
    @Import(name="hostSecondary")
    private @Nullable Output<String> hostSecondary;

    /**
     * @return The secondary/private host for the managed database.
     * 
     */
    public Optional<Output<String>> hostSecondary() {
        return Optional.ofNullable(this.hostSecondary);
    }

    /**
     * A unique, user-defined string referring to the Managed Database.
     * 
     */
    @Import(name="label")
    private @Nullable Output<String> label;

    /**
     * @return A unique, user-defined string referring to the Managed Database.
     * 
     */
    public Optional<Output<String>> label() {
        return Optional.ofNullable(this.label);
    }

    /**
     * A mapping between IP addresses and strings designating them as primary or failover.
     * 
     */
    @Import(name="members")
    private @Nullable Output<Map<String,String>> members;

    /**
     * @return A mapping between IP addresses and strings designating them as primary or failover.
     * 
     */
    public Optional<Output<Map<String,String>>> members() {
        return Optional.ofNullable(this.members);
    }

    /**
     * The oldest time to which a database can be restored.
     * 
     */
    @Import(name="oldestRestoreTime")
    private @Nullable Output<String> oldestRestoreTime;

    /**
     * @return The oldest time to which a database can be restored.
     * 
     */
    public Optional<Output<String>> oldestRestoreTime() {
        return Optional.ofNullable(this.oldestRestoreTime);
    }

    /**
     * A set of pending updates.
     * 
     */
    @Import(name="pendingUpdates")
    private @Nullable Output<List<DatabaseMysqlV2PendingUpdateArgs>> pendingUpdates;

    /**
     * @return A set of pending updates.
     * 
     */
    public Optional<Output<List<DatabaseMysqlV2PendingUpdateArgs>>> pendingUpdates() {
        return Optional.ofNullable(this.pendingUpdates);
    }

    /**
     * The back-end platform for relational databases used by the service.
     * 
     */
    @Import(name="platform")
    private @Nullable Output<String> platform;

    /**
     * @return The back-end platform for relational databases used by the service.
     * 
     */
    public Optional<Output<String>> platform() {
        return Optional.ofNullable(this.platform);
    }

    /**
     * The access port for this Managed Database.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    /**
     * @return The access port for this Managed Database.
     * 
     */
    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * The region to use for the Managed Database.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return The region to use for the Managed Database.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * The randomly-generated root password for the Managed Database instance.
     * 
     */
    @Import(name="rootPassword")
    private @Nullable Output<String> rootPassword;

    /**
     * @return The randomly-generated root password for the Managed Database instance.
     * 
     */
    public Optional<Output<String>> rootPassword() {
        return Optional.ofNullable(this.rootPassword);
    }

    /**
     * The root username for the Managed Database instance.
     * 
     */
    @Import(name="rootUsername")
    private @Nullable Output<String> rootUsername;

    /**
     * @return The root username for the Managed Database instance.
     * 
     */
    public Optional<Output<String>> rootUsername() {
        return Optional.ofNullable(this.rootUsername);
    }

    /**
     * Whether to require SSL credentials to establish a connection to the Managed Database.
     * 
     */
    @Import(name="sslConnection")
    private @Nullable Output<Boolean> sslConnection;

    /**
     * @return Whether to require SSL credentials to establish a connection to the Managed Database.
     * 
     */
    public Optional<Output<Boolean>> sslConnection() {
        return Optional.ofNullable(this.sslConnection);
    }

    /**
     * The operating status of the Managed Database.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The operating status of the Managed Database.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * Whether this Managed Database should be suspended.
     * 
     */
    @Import(name="suspended")
    private @Nullable Output<Boolean> suspended;

    /**
     * @return Whether this Managed Database should be suspended.
     * 
     */
    public Optional<Output<Boolean>> suspended() {
        return Optional.ofNullable(this.suspended);
    }

    @Import(name="timeouts")
    private @Nullable Output<DatabaseMysqlV2TimeoutsArgs> timeouts;

    public Optional<Output<DatabaseMysqlV2TimeoutsArgs>> timeouts() {
        return Optional.ofNullable(this.timeouts);
    }

    /**
     * The Linode Instance type used for the nodes of the Managed Database.
     * 
     * ***
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The Linode Instance type used for the nodes of the Managed Database.
     * 
     * ***
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * When this Managed Database was last updated.
     * 
     */
    @Import(name="updated")
    private @Nullable Output<String> updated;

    /**
     * @return When this Managed Database was last updated.
     * 
     */
    public Optional<Output<String>> updated() {
        return Optional.ofNullable(this.updated);
    }

    /**
     * Configuration settings for automated patch update maintenance for the Managed Database.
     * 
     */
    @Import(name="updates")
    private @Nullable Output<DatabaseMysqlV2UpdatesArgs> updates;

    /**
     * @return Configuration settings for automated patch update maintenance for the Managed Database.
     * 
     */
    public Optional<Output<DatabaseMysqlV2UpdatesArgs>> updates() {
        return Optional.ofNullable(this.updates);
    }

    /**
     * The Managed Database engine version. (e.g. `13.2`)
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return The Managed Database engine version. (e.g. `13.2`)
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private DatabaseMysqlV2State() {}

    private DatabaseMysqlV2State(DatabaseMysqlV2State $) {
        this.allowLists = $.allowLists;
        this.caCert = $.caCert;
        this.clusterSize = $.clusterSize;
        this.created = $.created;
        this.encrypted = $.encrypted;
        this.engine = $.engine;
        this.engineId = $.engineId;
        this.forkRestoreTime = $.forkRestoreTime;
        this.forkSource = $.forkSource;
        this.hostPrimary = $.hostPrimary;
        this.hostSecondary = $.hostSecondary;
        this.label = $.label;
        this.members = $.members;
        this.oldestRestoreTime = $.oldestRestoreTime;
        this.pendingUpdates = $.pendingUpdates;
        this.platform = $.platform;
        this.port = $.port;
        this.region = $.region;
        this.rootPassword = $.rootPassword;
        this.rootUsername = $.rootUsername;
        this.sslConnection = $.sslConnection;
        this.status = $.status;
        this.suspended = $.suspended;
        this.timeouts = $.timeouts;
        this.type = $.type;
        this.updated = $.updated;
        this.updates = $.updates;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatabaseMysqlV2State defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatabaseMysqlV2State $;

        public Builder() {
            $ = new DatabaseMysqlV2State();
        }

        public Builder(DatabaseMysqlV2State defaults) {
            $ = new DatabaseMysqlV2State(Objects.requireNonNull(defaults));
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
         * @param caCert The base64-encoded SSL CA certificate for the Managed Database.
         * 
         * @return builder
         * 
         */
        public Builder caCert(@Nullable Output<String> caCert) {
            $.caCert = caCert;
            return this;
        }

        /**
         * @param caCert The base64-encoded SSL CA certificate for the Managed Database.
         * 
         * @return builder
         * 
         */
        public Builder caCert(String caCert) {
            return caCert(Output.of(caCert));
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
         * @param created When this Managed Database was created.
         * 
         * @return builder
         * 
         */
        public Builder created(@Nullable Output<String> created) {
            $.created = created;
            return this;
        }

        /**
         * @param created When this Managed Database was created.
         * 
         * @return builder
         * 
         */
        public Builder created(String created) {
            return created(Output.of(created));
        }

        /**
         * @param encrypted Whether the Managed Databases is encrypted.
         * 
         * @return builder
         * 
         */
        public Builder encrypted(@Nullable Output<Boolean> encrypted) {
            $.encrypted = encrypted;
            return this;
        }

        /**
         * @param encrypted Whether the Managed Databases is encrypted.
         * 
         * @return builder
         * 
         */
        public Builder encrypted(Boolean encrypted) {
            return encrypted(Output.of(encrypted));
        }

        /**
         * @param engine The Managed Database engine. (e.g. `mysql`)
         * 
         * @return builder
         * 
         */
        public Builder engine(@Nullable Output<String> engine) {
            $.engine = engine;
            return this;
        }

        /**
         * @param engine The Managed Database engine. (e.g. `mysql`)
         * 
         * @return builder
         * 
         */
        public Builder engine(String engine) {
            return engine(Output.of(engine));
        }

        /**
         * @param engineId The Managed Database engine in engine/version format. (e.g. `mysql`)
         * 
         * @return builder
         * 
         */
        public Builder engineId(@Nullable Output<String> engineId) {
            $.engineId = engineId;
            return this;
        }

        /**
         * @param engineId The Managed Database engine in engine/version format. (e.g. `mysql`)
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
         * @param hostPrimary The primary host for the Managed Database.
         * 
         * @return builder
         * 
         */
        public Builder hostPrimary(@Nullable Output<String> hostPrimary) {
            $.hostPrimary = hostPrimary;
            return this;
        }

        /**
         * @param hostPrimary The primary host for the Managed Database.
         * 
         * @return builder
         * 
         */
        public Builder hostPrimary(String hostPrimary) {
            return hostPrimary(Output.of(hostPrimary));
        }

        /**
         * @param hostSecondary The secondary/private host for the managed database.
         * 
         * @return builder
         * 
         */
        public Builder hostSecondary(@Nullable Output<String> hostSecondary) {
            $.hostSecondary = hostSecondary;
            return this;
        }

        /**
         * @param hostSecondary The secondary/private host for the managed database.
         * 
         * @return builder
         * 
         */
        public Builder hostSecondary(String hostSecondary) {
            return hostSecondary(Output.of(hostSecondary));
        }

        /**
         * @param label A unique, user-defined string referring to the Managed Database.
         * 
         * @return builder
         * 
         */
        public Builder label(@Nullable Output<String> label) {
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
         * @param members A mapping between IP addresses and strings designating them as primary or failover.
         * 
         * @return builder
         * 
         */
        public Builder members(@Nullable Output<Map<String,String>> members) {
            $.members = members;
            return this;
        }

        /**
         * @param members A mapping between IP addresses and strings designating them as primary or failover.
         * 
         * @return builder
         * 
         */
        public Builder members(Map<String,String> members) {
            return members(Output.of(members));
        }

        /**
         * @param oldestRestoreTime The oldest time to which a database can be restored.
         * 
         * @return builder
         * 
         */
        public Builder oldestRestoreTime(@Nullable Output<String> oldestRestoreTime) {
            $.oldestRestoreTime = oldestRestoreTime;
            return this;
        }

        /**
         * @param oldestRestoreTime The oldest time to which a database can be restored.
         * 
         * @return builder
         * 
         */
        public Builder oldestRestoreTime(String oldestRestoreTime) {
            return oldestRestoreTime(Output.of(oldestRestoreTime));
        }

        /**
         * @param pendingUpdates A set of pending updates.
         * 
         * @return builder
         * 
         */
        public Builder pendingUpdates(@Nullable Output<List<DatabaseMysqlV2PendingUpdateArgs>> pendingUpdates) {
            $.pendingUpdates = pendingUpdates;
            return this;
        }

        /**
         * @param pendingUpdates A set of pending updates.
         * 
         * @return builder
         * 
         */
        public Builder pendingUpdates(List<DatabaseMysqlV2PendingUpdateArgs> pendingUpdates) {
            return pendingUpdates(Output.of(pendingUpdates));
        }

        /**
         * @param pendingUpdates A set of pending updates.
         * 
         * @return builder
         * 
         */
        public Builder pendingUpdates(DatabaseMysqlV2PendingUpdateArgs... pendingUpdates) {
            return pendingUpdates(List.of(pendingUpdates));
        }

        /**
         * @param platform The back-end platform for relational databases used by the service.
         * 
         * @return builder
         * 
         */
        public Builder platform(@Nullable Output<String> platform) {
            $.platform = platform;
            return this;
        }

        /**
         * @param platform The back-end platform for relational databases used by the service.
         * 
         * @return builder
         * 
         */
        public Builder platform(String platform) {
            return platform(Output.of(platform));
        }

        /**
         * @param port The access port for this Managed Database.
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The access port for this Managed Database.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param region The region to use for the Managed Database.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
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
         * @param rootPassword The randomly-generated root password for the Managed Database instance.
         * 
         * @return builder
         * 
         */
        public Builder rootPassword(@Nullable Output<String> rootPassword) {
            $.rootPassword = rootPassword;
            return this;
        }

        /**
         * @param rootPassword The randomly-generated root password for the Managed Database instance.
         * 
         * @return builder
         * 
         */
        public Builder rootPassword(String rootPassword) {
            return rootPassword(Output.of(rootPassword));
        }

        /**
         * @param rootUsername The root username for the Managed Database instance.
         * 
         * @return builder
         * 
         */
        public Builder rootUsername(@Nullable Output<String> rootUsername) {
            $.rootUsername = rootUsername;
            return this;
        }

        /**
         * @param rootUsername The root username for the Managed Database instance.
         * 
         * @return builder
         * 
         */
        public Builder rootUsername(String rootUsername) {
            return rootUsername(Output.of(rootUsername));
        }

        /**
         * @param sslConnection Whether to require SSL credentials to establish a connection to the Managed Database.
         * 
         * @return builder
         * 
         */
        public Builder sslConnection(@Nullable Output<Boolean> sslConnection) {
            $.sslConnection = sslConnection;
            return this;
        }

        /**
         * @param sslConnection Whether to require SSL credentials to establish a connection to the Managed Database.
         * 
         * @return builder
         * 
         */
        public Builder sslConnection(Boolean sslConnection) {
            return sslConnection(Output.of(sslConnection));
        }

        /**
         * @param status The operating status of the Managed Database.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The operating status of the Managed Database.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param suspended Whether this Managed Database should be suspended.
         * 
         * @return builder
         * 
         */
        public Builder suspended(@Nullable Output<Boolean> suspended) {
            $.suspended = suspended;
            return this;
        }

        /**
         * @param suspended Whether this Managed Database should be suspended.
         * 
         * @return builder
         * 
         */
        public Builder suspended(Boolean suspended) {
            return suspended(Output.of(suspended));
        }

        public Builder timeouts(@Nullable Output<DatabaseMysqlV2TimeoutsArgs> timeouts) {
            $.timeouts = timeouts;
            return this;
        }

        public Builder timeouts(DatabaseMysqlV2TimeoutsArgs timeouts) {
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
        public Builder type(@Nullable Output<String> type) {
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
         * @param updated When this Managed Database was last updated.
         * 
         * @return builder
         * 
         */
        public Builder updated(@Nullable Output<String> updated) {
            $.updated = updated;
            return this;
        }

        /**
         * @param updated When this Managed Database was last updated.
         * 
         * @return builder
         * 
         */
        public Builder updated(String updated) {
            return updated(Output.of(updated));
        }

        /**
         * @param updates Configuration settings for automated patch update maintenance for the Managed Database.
         * 
         * @return builder
         * 
         */
        public Builder updates(@Nullable Output<DatabaseMysqlV2UpdatesArgs> updates) {
            $.updates = updates;
            return this;
        }

        /**
         * @param updates Configuration settings for automated patch update maintenance for the Managed Database.
         * 
         * @return builder
         * 
         */
        public Builder updates(DatabaseMysqlV2UpdatesArgs updates) {
            return updates(Output.of(updates));
        }

        /**
         * @param version The Managed Database engine version. (e.g. `13.2`)
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version The Managed Database engine version. (e.g. `13.2`)
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public DatabaseMysqlV2State build() {
            return $;
        }
    }

}
