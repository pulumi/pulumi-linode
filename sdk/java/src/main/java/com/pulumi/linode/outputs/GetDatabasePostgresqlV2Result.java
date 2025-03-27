// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.linode.outputs.GetDatabasePostgresqlV2PendingUpdate;
import com.pulumi.linode.outputs.GetDatabasePostgresqlV2Updates;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetDatabasePostgresqlV2Result {
    /**
     * @return A list of IP addresses that can access the Managed Database. Each item can be a single IP address or a range in CIDR format. Use `linode.DatabaseAccessControls` to manage your allow list separately.
     * 
     */
    private List<String> allowLists;
    /**
     * @return The base64-encoded SSL CA certificate for the Managed Database.
     * 
     */
    private String caCert;
    /**
     * @return The number of Linode Instance nodes deployed to the Managed Database. (default `1`)
     * 
     */
    private Integer clusterSize;
    /**
     * @return When this Managed Database was created.
     * 
     */
    private String created;
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
     * @return The Managed Database engine in engine/version format. (e.g. `postgresql/16`)
     * 
     */
    private String engineId;
    /**
     * @return The database timestamp from which it was restored.
     * 
     */
    private String forkRestoreTime;
    /**
     * @return The ID of the database that was forked from.
     * 
     */
    private Integer forkSource;
    /**
     * @return The primary host for the Managed Database.
     * 
     */
    private String hostPrimary;
    /**
     * @return The secondary/private host for the managed database.
     * 
     */
    private String hostSecondary;
    private String id;
    /**
     * @return A unique, user-defined string referring to the Managed Database.
     * 
     */
    private String label;
    private Map<String,String> members;
    private String oldestRestoreTime;
    private List<GetDatabasePostgresqlV2PendingUpdate> pendingUpdates;
    /**
     * @return The back-end platform for relational databases used by the service.
     * 
     */
    private String platform;
    /**
     * @return The access port for this Managed Database.
     * 
     */
    private Integer port;
    /**
     * @return The region to use for the Managed Database.
     * 
     */
    private String region;
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
     * @return Whether this Managed Database is suspended.
     * 
     */
    private Boolean suspended;
    /**
     * @return The Linode Instance type used for the nodes of the Managed Database.
     * 
     */
    private String type;
    /**
     * @return When this Managed Database was last updated.
     * 
     */
    private String updated;
    private GetDatabasePostgresqlV2Updates updates;
    /**
     * @return The Managed Database engine version. (e.g. `13.2`)
     * 
     */
    private String version;

    private GetDatabasePostgresqlV2Result() {}
    /**
     * @return A list of IP addresses that can access the Managed Database. Each item can be a single IP address or a range in CIDR format. Use `linode.DatabaseAccessControls` to manage your allow list separately.
     * 
     */
    public List<String> allowLists() {
        return this.allowLists;
    }
    /**
     * @return The base64-encoded SSL CA certificate for the Managed Database.
     * 
     */
    public String caCert() {
        return this.caCert;
    }
    /**
     * @return The number of Linode Instance nodes deployed to the Managed Database. (default `1`)
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
     * @return The Managed Database engine in engine/version format. (e.g. `postgresql/16`)
     * 
     */
    public String engineId() {
        return this.engineId;
    }
    /**
     * @return The database timestamp from which it was restored.
     * 
     */
    public String forkRestoreTime() {
        return this.forkRestoreTime;
    }
    /**
     * @return The ID of the database that was forked from.
     * 
     */
    public Integer forkSource() {
        return this.forkSource;
    }
    /**
     * @return The primary host for the Managed Database.
     * 
     */
    public String hostPrimary() {
        return this.hostPrimary;
    }
    /**
     * @return The secondary/private host for the managed database.
     * 
     */
    public String hostSecondary() {
        return this.hostSecondary;
    }
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
    public Map<String,String> members() {
        return this.members;
    }
    public String oldestRestoreTime() {
        return this.oldestRestoreTime;
    }
    public List<GetDatabasePostgresqlV2PendingUpdate> pendingUpdates() {
        return this.pendingUpdates;
    }
    /**
     * @return The back-end platform for relational databases used by the service.
     * 
     */
    public String platform() {
        return this.platform;
    }
    /**
     * @return The access port for this Managed Database.
     * 
     */
    public Integer port() {
        return this.port;
    }
    /**
     * @return The region to use for the Managed Database.
     * 
     */
    public String region() {
        return this.region;
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
     * @return Whether this Managed Database is suspended.
     * 
     */
    public Boolean suspended() {
        return this.suspended;
    }
    /**
     * @return The Linode Instance type used for the nodes of the Managed Database.
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
    public GetDatabasePostgresqlV2Updates updates() {
        return this.updates;
    }
    /**
     * @return The Managed Database engine version. (e.g. `13.2`)
     * 
     */
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatabasePostgresqlV2Result defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> allowLists;
        private String caCert;
        private Integer clusterSize;
        private String created;
        private Boolean encrypted;
        private String engine;
        private String engineId;
        private String forkRestoreTime;
        private Integer forkSource;
        private String hostPrimary;
        private String hostSecondary;
        private String id;
        private String label;
        private Map<String,String> members;
        private String oldestRestoreTime;
        private List<GetDatabasePostgresqlV2PendingUpdate> pendingUpdates;
        private String platform;
        private Integer port;
        private String region;
        private String rootPassword;
        private String rootUsername;
        private Boolean sslConnection;
        private String status;
        private Boolean suspended;
        private String type;
        private String updated;
        private GetDatabasePostgresqlV2Updates updates;
        private String version;
        public Builder() {}
        public Builder(GetDatabasePostgresqlV2Result defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowLists = defaults.allowLists;
    	      this.caCert = defaults.caCert;
    	      this.clusterSize = defaults.clusterSize;
    	      this.created = defaults.created;
    	      this.encrypted = defaults.encrypted;
    	      this.engine = defaults.engine;
    	      this.engineId = defaults.engineId;
    	      this.forkRestoreTime = defaults.forkRestoreTime;
    	      this.forkSource = defaults.forkSource;
    	      this.hostPrimary = defaults.hostPrimary;
    	      this.hostSecondary = defaults.hostSecondary;
    	      this.id = defaults.id;
    	      this.label = defaults.label;
    	      this.members = defaults.members;
    	      this.oldestRestoreTime = defaults.oldestRestoreTime;
    	      this.pendingUpdates = defaults.pendingUpdates;
    	      this.platform = defaults.platform;
    	      this.port = defaults.port;
    	      this.region = defaults.region;
    	      this.rootPassword = defaults.rootPassword;
    	      this.rootUsername = defaults.rootUsername;
    	      this.sslConnection = defaults.sslConnection;
    	      this.status = defaults.status;
    	      this.suspended = defaults.suspended;
    	      this.type = defaults.type;
    	      this.updated = defaults.updated;
    	      this.updates = defaults.updates;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder allowLists(List<String> allowLists) {
            if (allowLists == null) {
              throw new MissingRequiredPropertyException("GetDatabasePostgresqlV2Result", "allowLists");
            }
            this.allowLists = allowLists;
            return this;
        }
        public Builder allowLists(String... allowLists) {
            return allowLists(List.of(allowLists));
        }
        @CustomType.Setter
        public Builder caCert(String caCert) {
            if (caCert == null) {
              throw new MissingRequiredPropertyException("GetDatabasePostgresqlV2Result", "caCert");
            }
            this.caCert = caCert;
            return this;
        }
        @CustomType.Setter
        public Builder clusterSize(Integer clusterSize) {
            if (clusterSize == null) {
              throw new MissingRequiredPropertyException("GetDatabasePostgresqlV2Result", "clusterSize");
            }
            this.clusterSize = clusterSize;
            return this;
        }
        @CustomType.Setter
        public Builder created(String created) {
            if (created == null) {
              throw new MissingRequiredPropertyException("GetDatabasePostgresqlV2Result", "created");
            }
            this.created = created;
            return this;
        }
        @CustomType.Setter
        public Builder encrypted(Boolean encrypted) {
            if (encrypted == null) {
              throw new MissingRequiredPropertyException("GetDatabasePostgresqlV2Result", "encrypted");
            }
            this.encrypted = encrypted;
            return this;
        }
        @CustomType.Setter
        public Builder engine(String engine) {
            if (engine == null) {
              throw new MissingRequiredPropertyException("GetDatabasePostgresqlV2Result", "engine");
            }
            this.engine = engine;
            return this;
        }
        @CustomType.Setter
        public Builder engineId(String engineId) {
            if (engineId == null) {
              throw new MissingRequiredPropertyException("GetDatabasePostgresqlV2Result", "engineId");
            }
            this.engineId = engineId;
            return this;
        }
        @CustomType.Setter
        public Builder forkRestoreTime(String forkRestoreTime) {
            if (forkRestoreTime == null) {
              throw new MissingRequiredPropertyException("GetDatabasePostgresqlV2Result", "forkRestoreTime");
            }
            this.forkRestoreTime = forkRestoreTime;
            return this;
        }
        @CustomType.Setter
        public Builder forkSource(Integer forkSource) {
            if (forkSource == null) {
              throw new MissingRequiredPropertyException("GetDatabasePostgresqlV2Result", "forkSource");
            }
            this.forkSource = forkSource;
            return this;
        }
        @CustomType.Setter
        public Builder hostPrimary(String hostPrimary) {
            if (hostPrimary == null) {
              throw new MissingRequiredPropertyException("GetDatabasePostgresqlV2Result", "hostPrimary");
            }
            this.hostPrimary = hostPrimary;
            return this;
        }
        @CustomType.Setter
        public Builder hostSecondary(String hostSecondary) {
            if (hostSecondary == null) {
              throw new MissingRequiredPropertyException("GetDatabasePostgresqlV2Result", "hostSecondary");
            }
            this.hostSecondary = hostSecondary;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetDatabasePostgresqlV2Result", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder label(String label) {
            if (label == null) {
              throw new MissingRequiredPropertyException("GetDatabasePostgresqlV2Result", "label");
            }
            this.label = label;
            return this;
        }
        @CustomType.Setter
        public Builder members(Map<String,String> members) {
            if (members == null) {
              throw new MissingRequiredPropertyException("GetDatabasePostgresqlV2Result", "members");
            }
            this.members = members;
            return this;
        }
        @CustomType.Setter
        public Builder oldestRestoreTime(String oldestRestoreTime) {
            if (oldestRestoreTime == null) {
              throw new MissingRequiredPropertyException("GetDatabasePostgresqlV2Result", "oldestRestoreTime");
            }
            this.oldestRestoreTime = oldestRestoreTime;
            return this;
        }
        @CustomType.Setter
        public Builder pendingUpdates(List<GetDatabasePostgresqlV2PendingUpdate> pendingUpdates) {
            if (pendingUpdates == null) {
              throw new MissingRequiredPropertyException("GetDatabasePostgresqlV2Result", "pendingUpdates");
            }
            this.pendingUpdates = pendingUpdates;
            return this;
        }
        public Builder pendingUpdates(GetDatabasePostgresqlV2PendingUpdate... pendingUpdates) {
            return pendingUpdates(List.of(pendingUpdates));
        }
        @CustomType.Setter
        public Builder platform(String platform) {
            if (platform == null) {
              throw new MissingRequiredPropertyException("GetDatabasePostgresqlV2Result", "platform");
            }
            this.platform = platform;
            return this;
        }
        @CustomType.Setter
        public Builder port(Integer port) {
            if (port == null) {
              throw new MissingRequiredPropertyException("GetDatabasePostgresqlV2Result", "port");
            }
            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder region(String region) {
            if (region == null) {
              throw new MissingRequiredPropertyException("GetDatabasePostgresqlV2Result", "region");
            }
            this.region = region;
            return this;
        }
        @CustomType.Setter
        public Builder rootPassword(String rootPassword) {
            if (rootPassword == null) {
              throw new MissingRequiredPropertyException("GetDatabasePostgresqlV2Result", "rootPassword");
            }
            this.rootPassword = rootPassword;
            return this;
        }
        @CustomType.Setter
        public Builder rootUsername(String rootUsername) {
            if (rootUsername == null) {
              throw new MissingRequiredPropertyException("GetDatabasePostgresqlV2Result", "rootUsername");
            }
            this.rootUsername = rootUsername;
            return this;
        }
        @CustomType.Setter
        public Builder sslConnection(Boolean sslConnection) {
            if (sslConnection == null) {
              throw new MissingRequiredPropertyException("GetDatabasePostgresqlV2Result", "sslConnection");
            }
            this.sslConnection = sslConnection;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetDatabasePostgresqlV2Result", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder suspended(Boolean suspended) {
            if (suspended == null) {
              throw new MissingRequiredPropertyException("GetDatabasePostgresqlV2Result", "suspended");
            }
            this.suspended = suspended;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetDatabasePostgresqlV2Result", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder updated(String updated) {
            if (updated == null) {
              throw new MissingRequiredPropertyException("GetDatabasePostgresqlV2Result", "updated");
            }
            this.updated = updated;
            return this;
        }
        @CustomType.Setter
        public Builder updates(GetDatabasePostgresqlV2Updates updates) {
            if (updates == null) {
              throw new MissingRequiredPropertyException("GetDatabasePostgresqlV2Result", "updates");
            }
            this.updates = updates;
            return this;
        }
        @CustomType.Setter
        public Builder version(String version) {
            if (version == null) {
              throw new MissingRequiredPropertyException("GetDatabasePostgresqlV2Result", "version");
            }
            this.version = version;
            return this;
        }
        public GetDatabasePostgresqlV2Result build() {
            final var _resultValue = new GetDatabasePostgresqlV2Result();
            _resultValue.allowLists = allowLists;
            _resultValue.caCert = caCert;
            _resultValue.clusterSize = clusterSize;
            _resultValue.created = created;
            _resultValue.encrypted = encrypted;
            _resultValue.engine = engine;
            _resultValue.engineId = engineId;
            _resultValue.forkRestoreTime = forkRestoreTime;
            _resultValue.forkSource = forkSource;
            _resultValue.hostPrimary = hostPrimary;
            _resultValue.hostSecondary = hostSecondary;
            _resultValue.id = id;
            _resultValue.label = label;
            _resultValue.members = members;
            _resultValue.oldestRestoreTime = oldestRestoreTime;
            _resultValue.pendingUpdates = pendingUpdates;
            _resultValue.platform = platform;
            _resultValue.port = port;
            _resultValue.region = region;
            _resultValue.rootPassword = rootPassword;
            _resultValue.rootUsername = rootUsername;
            _resultValue.sslConnection = sslConnection;
            _resultValue.status = status;
            _resultValue.suspended = suspended;
            _resultValue.type = type;
            _resultValue.updated = updated;
            _resultValue.updates = updates;
            _resultValue.version = version;
            return _resultValue;
        }
    }
}
