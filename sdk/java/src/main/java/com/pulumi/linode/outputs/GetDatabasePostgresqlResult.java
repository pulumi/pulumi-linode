// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.linode.outputs.GetDatabasePostgresqlUpdate;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDatabasePostgresqlResult {
    /**
     * @return A list of IP addresses that can access the Managed Database. Each item can be a single IP address or a range in CIDR format.
     * 
     */
    private List<String> allowLists;
    /**
     * @return The base64-encoded SSL CA certificate for the Managed Database instance.
     * 
     */
    private String caCert;
    /**
     * @return The number of Linode Instance nodes deployed to the Managed Database.
     * 
     */
    private Integer clusterSize;
    /**
     * @return When this Managed Database was created.
     * 
     */
    private String created;
    private Integer databaseId;
    /**
     * @return Whether the Managed Databases is encrypted.
     * 
     */
    private Boolean encrypted;
    /**
     * @return The Managed Database engine. (e.g. `postgresql`)
     * 
     */
    private String engine;
    /**
     * @return The Managed Database engine in engine/version format. (e.g. `postgresql/13.2`)
     * 
     */
    private String engineId;
    /**
     * @return The primary host for the Managed Database.
     * 
     */
    private String hostPrimary;
    /**
     * @return The secondary/private network host for the Managed Database.
     * 
     */
    private String hostSecondary;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return A unique, user-defined string referring to the Managed Database.
     * 
     */
    private String label;
    private Integer port;
    /**
     * @return The region that hosts this Linode Managed Database.
     * 
     */
    private String region;
    /**
     * @return (Optional) The synchronization level of the replicating server. (`on`, `local`, `remote_write`, `remote_apply`, `off`)
     * 
     */
    private String replicationCommitType;
    /**
     * @return The replication method used for the Managed Database. (`none`, `asynch`, `semi_synch`)
     * 
     */
    private String replicationType;
    /**
     * @return The randomly-generated root password for the Managed Database instance.
     * 
     */
    private String rootPassword;
    /**
     * @return The root username for the Managed Database instance.
     * 
     */
    private String rootUsername;
    /**
     * @return Whether to require SSL credentials to establish a connection to the Managed Database.
     * 
     */
    private Boolean sslConnection;
    /**
     * @return The operating status of the Managed Database.
     * 
     */
    private String status;
    /**
     * @return The Linode Instance type used for the nodes of the  Managed Database instance.
     * 
     */
    private String type;
    /**
     * @return When this Managed Database was last updated.
     * 
     */
    private String updated;
    private List<GetDatabasePostgresqlUpdate> updates;
    /**
     * @return The Managed Database engine version. (e.g. `v8.0.26`)
     * 
     */
    private String version;

    private GetDatabasePostgresqlResult() {}
    /**
     * @return A list of IP addresses that can access the Managed Database. Each item can be a single IP address or a range in CIDR format.
     * 
     */
    public List<String> allowLists() {
        return this.allowLists;
    }
    /**
     * @return The base64-encoded SSL CA certificate for the Managed Database instance.
     * 
     */
    public String caCert() {
        return this.caCert;
    }
    /**
     * @return The number of Linode Instance nodes deployed to the Managed Database.
     * 
     */
    public Integer clusterSize() {
        return this.clusterSize;
    }
    /**
     * @return When this Managed Database was created.
     * 
     */
    public String created() {
        return this.created;
    }
    public Integer databaseId() {
        return this.databaseId;
    }
    /**
     * @return Whether the Managed Databases is encrypted.
     * 
     */
    public Boolean encrypted() {
        return this.encrypted;
    }
    /**
     * @return The Managed Database engine. (e.g. `postgresql`)
     * 
     */
    public String engine() {
        return this.engine;
    }
    /**
     * @return The Managed Database engine in engine/version format. (e.g. `postgresql/13.2`)
     * 
     */
    public String engineId() {
        return this.engineId;
    }
    /**
     * @return The primary host for the Managed Database.
     * 
     */
    public String hostPrimary() {
        return this.hostPrimary;
    }
    /**
     * @return The secondary/private network host for the Managed Database.
     * 
     */
    public String hostSecondary() {
        return this.hostSecondary;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A unique, user-defined string referring to the Managed Database.
     * 
     */
    public String label() {
        return this.label;
    }
    public Integer port() {
        return this.port;
    }
    /**
     * @return The region that hosts this Linode Managed Database.
     * 
     */
    public String region() {
        return this.region;
    }
    /**
     * @return (Optional) The synchronization level of the replicating server. (`on`, `local`, `remote_write`, `remote_apply`, `off`)
     * 
     */
    public String replicationCommitType() {
        return this.replicationCommitType;
    }
    /**
     * @return The replication method used for the Managed Database. (`none`, `asynch`, `semi_synch`)
     * 
     */
    public String replicationType() {
        return this.replicationType;
    }
    /**
     * @return The randomly-generated root password for the Managed Database instance.
     * 
     */
    public String rootPassword() {
        return this.rootPassword;
    }
    /**
     * @return The root username for the Managed Database instance.
     * 
     */
    public String rootUsername() {
        return this.rootUsername;
    }
    /**
     * @return Whether to require SSL credentials to establish a connection to the Managed Database.
     * 
     */
    public Boolean sslConnection() {
        return this.sslConnection;
    }
    /**
     * @return The operating status of the Managed Database.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return The Linode Instance type used for the nodes of the  Managed Database instance.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return When this Managed Database was last updated.
     * 
     */
    public String updated() {
        return this.updated;
    }
    public List<GetDatabasePostgresqlUpdate> updates() {
        return this.updates;
    }
    /**
     * @return The Managed Database engine version. (e.g. `v8.0.26`)
     * 
     */
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatabasePostgresqlResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> allowLists;
        private String caCert;
        private Integer clusterSize;
        private String created;
        private Integer databaseId;
        private Boolean encrypted;
        private String engine;
        private String engineId;
        private String hostPrimary;
        private String hostSecondary;
        private String id;
        private String label;
        private Integer port;
        private String region;
        private String replicationCommitType;
        private String replicationType;
        private String rootPassword;
        private String rootUsername;
        private Boolean sslConnection;
        private String status;
        private String type;
        private String updated;
        private List<GetDatabasePostgresqlUpdate> updates;
        private String version;
        public Builder() {}
        public Builder(GetDatabasePostgresqlResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowLists = defaults.allowLists;
    	      this.caCert = defaults.caCert;
    	      this.clusterSize = defaults.clusterSize;
    	      this.created = defaults.created;
    	      this.databaseId = defaults.databaseId;
    	      this.encrypted = defaults.encrypted;
    	      this.engine = defaults.engine;
    	      this.engineId = defaults.engineId;
    	      this.hostPrimary = defaults.hostPrimary;
    	      this.hostSecondary = defaults.hostSecondary;
    	      this.id = defaults.id;
    	      this.label = defaults.label;
    	      this.port = defaults.port;
    	      this.region = defaults.region;
    	      this.replicationCommitType = defaults.replicationCommitType;
    	      this.replicationType = defaults.replicationType;
    	      this.rootPassword = defaults.rootPassword;
    	      this.rootUsername = defaults.rootUsername;
    	      this.sslConnection = defaults.sslConnection;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
    	      this.updated = defaults.updated;
    	      this.updates = defaults.updates;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder allowLists(List<String> allowLists) {
            this.allowLists = Objects.requireNonNull(allowLists);
            return this;
        }
        public Builder allowLists(String... allowLists) {
            return allowLists(List.of(allowLists));
        }
        @CustomType.Setter
        public Builder caCert(String caCert) {
            this.caCert = Objects.requireNonNull(caCert);
            return this;
        }
        @CustomType.Setter
        public Builder clusterSize(Integer clusterSize) {
            this.clusterSize = Objects.requireNonNull(clusterSize);
            return this;
        }
        @CustomType.Setter
        public Builder created(String created) {
            this.created = Objects.requireNonNull(created);
            return this;
        }
        @CustomType.Setter
        public Builder databaseId(Integer databaseId) {
            this.databaseId = Objects.requireNonNull(databaseId);
            return this;
        }
        @CustomType.Setter
        public Builder encrypted(Boolean encrypted) {
            this.encrypted = Objects.requireNonNull(encrypted);
            return this;
        }
        @CustomType.Setter
        public Builder engine(String engine) {
            this.engine = Objects.requireNonNull(engine);
            return this;
        }
        @CustomType.Setter
        public Builder engineId(String engineId) {
            this.engineId = Objects.requireNonNull(engineId);
            return this;
        }
        @CustomType.Setter
        public Builder hostPrimary(String hostPrimary) {
            this.hostPrimary = Objects.requireNonNull(hostPrimary);
            return this;
        }
        @CustomType.Setter
        public Builder hostSecondary(String hostSecondary) {
            this.hostSecondary = Objects.requireNonNull(hostSecondary);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder label(String label) {
            this.label = Objects.requireNonNull(label);
            return this;
        }
        @CustomType.Setter
        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        @CustomType.Setter
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        @CustomType.Setter
        public Builder replicationCommitType(String replicationCommitType) {
            this.replicationCommitType = Objects.requireNonNull(replicationCommitType);
            return this;
        }
        @CustomType.Setter
        public Builder replicationType(String replicationType) {
            this.replicationType = Objects.requireNonNull(replicationType);
            return this;
        }
        @CustomType.Setter
        public Builder rootPassword(String rootPassword) {
            this.rootPassword = Objects.requireNonNull(rootPassword);
            return this;
        }
        @CustomType.Setter
        public Builder rootUsername(String rootUsername) {
            this.rootUsername = Objects.requireNonNull(rootUsername);
            return this;
        }
        @CustomType.Setter
        public Builder sslConnection(Boolean sslConnection) {
            this.sslConnection = Objects.requireNonNull(sslConnection);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        @CustomType.Setter
        public Builder updated(String updated) {
            this.updated = Objects.requireNonNull(updated);
            return this;
        }
        @CustomType.Setter
        public Builder updates(List<GetDatabasePostgresqlUpdate> updates) {
            this.updates = Objects.requireNonNull(updates);
            return this;
        }
        public Builder updates(GetDatabasePostgresqlUpdate... updates) {
            return updates(List.of(updates));
        }
        @CustomType.Setter
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public GetDatabasePostgresqlResult build() {
            final var o = new GetDatabasePostgresqlResult();
            o.allowLists = allowLists;
            o.caCert = caCert;
            o.clusterSize = clusterSize;
            o.created = created;
            o.databaseId = databaseId;
            o.encrypted = encrypted;
            o.engine = engine;
            o.engineId = engineId;
            o.hostPrimary = hostPrimary;
            o.hostSecondary = hostSecondary;
            o.id = id;
            o.label = label;
            o.port = port;
            o.region = region;
            o.replicationCommitType = replicationCommitType;
            o.replicationType = replicationType;
            o.rootPassword = rootPassword;
            o.rootUsername = rootUsername;
            o.sslConnection = sslConnection;
            o.status = status;
            o.type = type;
            o.updated = updated;
            o.updates = updates;
            o.version = version;
            return o;
        }
    }
}
