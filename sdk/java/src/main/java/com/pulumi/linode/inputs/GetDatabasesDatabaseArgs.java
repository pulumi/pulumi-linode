// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetDatabasesDatabaseArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetDatabasesDatabaseArgs Empty = new GetDatabasesDatabaseArgs();

    /**
     * A list of IP addresses that can access the Managed Database.
     * 
     */
    @Import(name="allowLists", required=true)
    private Output<List<String>> allowLists;

    /**
     * @return A list of IP addresses that can access the Managed Database.
     * 
     */
    public Output<List<String>> allowLists() {
        return this.allowLists;
    }

    /**
     * The number of Linode Instance nodes deployed to the Managed Database.
     * 
     */
    @Import(name="clusterSize", required=true)
    private Output<Integer> clusterSize;

    /**
     * @return The number of Linode Instance nodes deployed to the Managed Database.
     * 
     */
    public Output<Integer> clusterSize() {
        return this.clusterSize;
    }

    /**
     * When this Managed Database was created.
     * 
     */
    @Import(name="created", required=true)
    private Output<String> created;

    /**
     * @return When this Managed Database was created.
     * 
     */
    public Output<String> created() {
        return this.created;
    }

    /**
     * Whether the Managed Databases is encrypted.
     * 
     */
    @Import(name="encrypted", required=true)
    private Output<Boolean> encrypted;

    /**
     * @return Whether the Managed Databases is encrypted.
     * 
     */
    public Output<Boolean> encrypted() {
        return this.encrypted;
    }

    /**
     * The Managed Database engine.
     * 
     */
    @Import(name="engine", required=true)
    private Output<String> engine;

    /**
     * @return The Managed Database engine.
     * 
     */
    public Output<String> engine() {
        return this.engine;
    }

    /**
     * The primary host for the Managed Database.
     * 
     */
    @Import(name="hostPrimary", required=true)
    private Output<String> hostPrimary;

    /**
     * @return The primary host for the Managed Database.
     * 
     */
    public Output<String> hostPrimary() {
        return this.hostPrimary;
    }

    /**
     * The secondary/private network host for the Managed Database.
     * 
     */
    @Import(name="hostSecondary", required=true)
    private Output<String> hostSecondary;

    /**
     * @return The secondary/private network host for the Managed Database.
     * 
     */
    public Output<String> hostSecondary() {
        return this.hostSecondary;
    }

    /**
     * The ID of the Managed Database.
     * 
     */
    @Import(name="id", required=true)
    private Output<Integer> id;

    /**
     * @return The ID of the Managed Database.
     * 
     */
    public Output<Integer> id() {
        return this.id;
    }

    @Import(name="instanceUri", required=true)
    private Output<String> instanceUri;

    public Output<String> instanceUri() {
        return this.instanceUri;
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
     * The replication method used for the Managed Database.
     * 
     */
    @Import(name="replicationType", required=true)
    private Output<String> replicationType;

    /**
     * @return The replication method used for the Managed Database.
     * 
     */
    public Output<String> replicationType() {
        return this.replicationType;
    }

    /**
     * Whether to require SSL credentials to establish a connection to the Managed Database.
     * 
     */
    @Import(name="sslConnection", required=true)
    private Output<Boolean> sslConnection;

    /**
     * @return Whether to require SSL credentials to establish a connection to the Managed Database.
     * 
     */
    public Output<Boolean> sslConnection() {
        return this.sslConnection;
    }

    /**
     * The operating status of the Managed Database.
     * 
     */
    @Import(name="status", required=true)
    private Output<String> status;

    /**
     * @return The operating status of the Managed Database.
     * 
     */
    public Output<String> status() {
        return this.status;
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
     * When this Managed Database was last updated.
     * 
     */
    @Import(name="updated", required=true)
    private Output<String> updated;

    /**
     * @return When this Managed Database was last updated.
     * 
     */
    public Output<String> updated() {
        return this.updated;
    }

    /**
     * The Managed Database engine version.
     * 
     */
    @Import(name="version", required=true)
    private Output<String> version;

    /**
     * @return The Managed Database engine version.
     * 
     */
    public Output<String> version() {
        return this.version;
    }

    private GetDatabasesDatabaseArgs() {}

    private GetDatabasesDatabaseArgs(GetDatabasesDatabaseArgs $) {
        this.allowLists = $.allowLists;
        this.clusterSize = $.clusterSize;
        this.created = $.created;
        this.encrypted = $.encrypted;
        this.engine = $.engine;
        this.hostPrimary = $.hostPrimary;
        this.hostSecondary = $.hostSecondary;
        this.id = $.id;
        this.instanceUri = $.instanceUri;
        this.label = $.label;
        this.region = $.region;
        this.replicationType = $.replicationType;
        this.sslConnection = $.sslConnection;
        this.status = $.status;
        this.type = $.type;
        this.updated = $.updated;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDatabasesDatabaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDatabasesDatabaseArgs $;

        public Builder() {
            $ = new GetDatabasesDatabaseArgs();
        }

        public Builder(GetDatabasesDatabaseArgs defaults) {
            $ = new GetDatabasesDatabaseArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowLists A list of IP addresses that can access the Managed Database.
         * 
         * @return builder
         * 
         */
        public Builder allowLists(Output<List<String>> allowLists) {
            $.allowLists = allowLists;
            return this;
        }

        /**
         * @param allowLists A list of IP addresses that can access the Managed Database.
         * 
         * @return builder
         * 
         */
        public Builder allowLists(List<String> allowLists) {
            return allowLists(Output.of(allowLists));
        }

        /**
         * @param allowLists A list of IP addresses that can access the Managed Database.
         * 
         * @return builder
         * 
         */
        public Builder allowLists(String... allowLists) {
            return allowLists(List.of(allowLists));
        }

        /**
         * @param clusterSize The number of Linode Instance nodes deployed to the Managed Database.
         * 
         * @return builder
         * 
         */
        public Builder clusterSize(Output<Integer> clusterSize) {
            $.clusterSize = clusterSize;
            return this;
        }

        /**
         * @param clusterSize The number of Linode Instance nodes deployed to the Managed Database.
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
        public Builder created(Output<String> created) {
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
        public Builder encrypted(Output<Boolean> encrypted) {
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
         * @param engine The Managed Database engine.
         * 
         * @return builder
         * 
         */
        public Builder engine(Output<String> engine) {
            $.engine = engine;
            return this;
        }

        /**
         * @param engine The Managed Database engine.
         * 
         * @return builder
         * 
         */
        public Builder engine(String engine) {
            return engine(Output.of(engine));
        }

        /**
         * @param hostPrimary The primary host for the Managed Database.
         * 
         * @return builder
         * 
         */
        public Builder hostPrimary(Output<String> hostPrimary) {
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
         * @param hostSecondary The secondary/private network host for the Managed Database.
         * 
         * @return builder
         * 
         */
        public Builder hostSecondary(Output<String> hostSecondary) {
            $.hostSecondary = hostSecondary;
            return this;
        }

        /**
         * @param hostSecondary The secondary/private network host for the Managed Database.
         * 
         * @return builder
         * 
         */
        public Builder hostSecondary(String hostSecondary) {
            return hostSecondary(Output.of(hostSecondary));
        }

        /**
         * @param id The ID of the Managed Database.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<Integer> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of the Managed Database.
         * 
         * @return builder
         * 
         */
        public Builder id(Integer id) {
            return id(Output.of(id));
        }

        public Builder instanceUri(Output<String> instanceUri) {
            $.instanceUri = instanceUri;
            return this;
        }

        public Builder instanceUri(String instanceUri) {
            return instanceUri(Output.of(instanceUri));
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
         * @param replicationType The replication method used for the Managed Database.
         * 
         * @return builder
         * 
         */
        public Builder replicationType(Output<String> replicationType) {
            $.replicationType = replicationType;
            return this;
        }

        /**
         * @param replicationType The replication method used for the Managed Database.
         * 
         * @return builder
         * 
         */
        public Builder replicationType(String replicationType) {
            return replicationType(Output.of(replicationType));
        }

        /**
         * @param sslConnection Whether to require SSL credentials to establish a connection to the Managed Database.
         * 
         * @return builder
         * 
         */
        public Builder sslConnection(Output<Boolean> sslConnection) {
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
        public Builder status(Output<String> status) {
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
         * @param updated When this Managed Database was last updated.
         * 
         * @return builder
         * 
         */
        public Builder updated(Output<String> updated) {
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
         * @param version The Managed Database engine version.
         * 
         * @return builder
         * 
         */
        public Builder version(Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version The Managed Database engine version.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public GetDatabasesDatabaseArgs build() {
            $.allowLists = Objects.requireNonNull($.allowLists, "expected parameter 'allowLists' to be non-null");
            $.clusterSize = Objects.requireNonNull($.clusterSize, "expected parameter 'clusterSize' to be non-null");
            $.created = Objects.requireNonNull($.created, "expected parameter 'created' to be non-null");
            $.encrypted = Objects.requireNonNull($.encrypted, "expected parameter 'encrypted' to be non-null");
            $.engine = Objects.requireNonNull($.engine, "expected parameter 'engine' to be non-null");
            $.hostPrimary = Objects.requireNonNull($.hostPrimary, "expected parameter 'hostPrimary' to be non-null");
            $.hostSecondary = Objects.requireNonNull($.hostSecondary, "expected parameter 'hostSecondary' to be non-null");
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.instanceUri = Objects.requireNonNull($.instanceUri, "expected parameter 'instanceUri' to be non-null");
            $.label = Objects.requireNonNull($.label, "expected parameter 'label' to be non-null");
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            $.replicationType = Objects.requireNonNull($.replicationType, "expected parameter 'replicationType' to be non-null");
            $.sslConnection = Objects.requireNonNull($.sslConnection, "expected parameter 'sslConnection' to be non-null");
            $.status = Objects.requireNonNull($.status, "expected parameter 'status' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            $.updated = Objects.requireNonNull($.updated, "expected parameter 'updated' to be non-null");
            $.version = Objects.requireNonNull($.version, "expected parameter 'version' to be non-null");
            return $;
        }
    }

}
