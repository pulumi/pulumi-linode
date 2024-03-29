// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDatabasesDatabase {
    /**
     * @return A list of IP addresses that can access the Managed Database.
     * 
     */
    private List<String> allowLists;
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
    /**
     * @return Whether the Managed Databases is encrypted.
     * 
     */
    private Boolean encrypted;
    /**
     * @return The Managed Database engine.
     * 
     */
    private String engine;
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
     * @return The ID of the Managed Database.
     * 
     */
    private Integer id;
    /**
     * @return he API route for the database instance.
     * 
     */
    private String instanceUri;
    /**
     * @return A unique, user-defined string referring to the Managed Database.
     * 
     */
    private String label;
    /**
     * @return The region to use for the Managed Database.
     * 
     */
    private String region;
    /**
     * @return The replication method used for the Managed Database.
     * 
     */
    private String replicationType;
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
    /**
     * @return The Managed Database engine version.
     * 
     */
    private String version;

    private GetDatabasesDatabase() {}
    /**
     * @return A list of IP addresses that can access the Managed Database.
     * 
     */
    public List<String> allowLists() {
        return this.allowLists;
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
    /**
     * @return Whether the Managed Databases is encrypted.
     * 
     */
    public Boolean encrypted() {
        return this.encrypted;
    }
    /**
     * @return The Managed Database engine.
     * 
     */
    public String engine() {
        return this.engine;
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
     * @return The ID of the Managed Database.
     * 
     */
    public Integer id() {
        return this.id;
    }
    /**
     * @return he API route for the database instance.
     * 
     */
    public String instanceUri() {
        return this.instanceUri;
    }
    /**
     * @return A unique, user-defined string referring to the Managed Database.
     * 
     */
    public String label() {
        return this.label;
    }
    /**
     * @return The region to use for the Managed Database.
     * 
     */
    public String region() {
        return this.region;
    }
    /**
     * @return The replication method used for the Managed Database.
     * 
     */
    public String replicationType() {
        return this.replicationType;
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
    /**
     * @return The Managed Database engine version.
     * 
     */
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatabasesDatabase defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> allowLists;
        private Integer clusterSize;
        private String created;
        private Boolean encrypted;
        private String engine;
        private String hostPrimary;
        private String hostSecondary;
        private Integer id;
        private String instanceUri;
        private String label;
        private String region;
        private String replicationType;
        private Boolean sslConnection;
        private String status;
        private String type;
        private String updated;
        private String version;
        public Builder() {}
        public Builder(GetDatabasesDatabase defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowLists = defaults.allowLists;
    	      this.clusterSize = defaults.clusterSize;
    	      this.created = defaults.created;
    	      this.encrypted = defaults.encrypted;
    	      this.engine = defaults.engine;
    	      this.hostPrimary = defaults.hostPrimary;
    	      this.hostSecondary = defaults.hostSecondary;
    	      this.id = defaults.id;
    	      this.instanceUri = defaults.instanceUri;
    	      this.label = defaults.label;
    	      this.region = defaults.region;
    	      this.replicationType = defaults.replicationType;
    	      this.sslConnection = defaults.sslConnection;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
    	      this.updated = defaults.updated;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder allowLists(List<String> allowLists) {
            if (allowLists == null) {
              throw new MissingRequiredPropertyException("GetDatabasesDatabase", "allowLists");
            }
            this.allowLists = allowLists;
            return this;
        }
        public Builder allowLists(String... allowLists) {
            return allowLists(List.of(allowLists));
        }
        @CustomType.Setter
        public Builder clusterSize(Integer clusterSize) {
            if (clusterSize == null) {
              throw new MissingRequiredPropertyException("GetDatabasesDatabase", "clusterSize");
            }
            this.clusterSize = clusterSize;
            return this;
        }
        @CustomType.Setter
        public Builder created(String created) {
            if (created == null) {
              throw new MissingRequiredPropertyException("GetDatabasesDatabase", "created");
            }
            this.created = created;
            return this;
        }
        @CustomType.Setter
        public Builder encrypted(Boolean encrypted) {
            if (encrypted == null) {
              throw new MissingRequiredPropertyException("GetDatabasesDatabase", "encrypted");
            }
            this.encrypted = encrypted;
            return this;
        }
        @CustomType.Setter
        public Builder engine(String engine) {
            if (engine == null) {
              throw new MissingRequiredPropertyException("GetDatabasesDatabase", "engine");
            }
            this.engine = engine;
            return this;
        }
        @CustomType.Setter
        public Builder hostPrimary(String hostPrimary) {
            if (hostPrimary == null) {
              throw new MissingRequiredPropertyException("GetDatabasesDatabase", "hostPrimary");
            }
            this.hostPrimary = hostPrimary;
            return this;
        }
        @CustomType.Setter
        public Builder hostSecondary(String hostSecondary) {
            if (hostSecondary == null) {
              throw new MissingRequiredPropertyException("GetDatabasesDatabase", "hostSecondary");
            }
            this.hostSecondary = hostSecondary;
            return this;
        }
        @CustomType.Setter
        public Builder id(Integer id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetDatabasesDatabase", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder instanceUri(String instanceUri) {
            if (instanceUri == null) {
              throw new MissingRequiredPropertyException("GetDatabasesDatabase", "instanceUri");
            }
            this.instanceUri = instanceUri;
            return this;
        }
        @CustomType.Setter
        public Builder label(String label) {
            if (label == null) {
              throw new MissingRequiredPropertyException("GetDatabasesDatabase", "label");
            }
            this.label = label;
            return this;
        }
        @CustomType.Setter
        public Builder region(String region) {
            if (region == null) {
              throw new MissingRequiredPropertyException("GetDatabasesDatabase", "region");
            }
            this.region = region;
            return this;
        }
        @CustomType.Setter
        public Builder replicationType(String replicationType) {
            if (replicationType == null) {
              throw new MissingRequiredPropertyException("GetDatabasesDatabase", "replicationType");
            }
            this.replicationType = replicationType;
            return this;
        }
        @CustomType.Setter
        public Builder sslConnection(Boolean sslConnection) {
            if (sslConnection == null) {
              throw new MissingRequiredPropertyException("GetDatabasesDatabase", "sslConnection");
            }
            this.sslConnection = sslConnection;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetDatabasesDatabase", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetDatabasesDatabase", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder updated(String updated) {
            if (updated == null) {
              throw new MissingRequiredPropertyException("GetDatabasesDatabase", "updated");
            }
            this.updated = updated;
            return this;
        }
        @CustomType.Setter
        public Builder version(String version) {
            if (version == null) {
              throw new MissingRequiredPropertyException("GetDatabasesDatabase", "version");
            }
            this.version = version;
            return this;
        }
        public GetDatabasesDatabase build() {
            final var _resultValue = new GetDatabasesDatabase();
            _resultValue.allowLists = allowLists;
            _resultValue.clusterSize = clusterSize;
            _resultValue.created = created;
            _resultValue.encrypted = encrypted;
            _resultValue.engine = engine;
            _resultValue.hostPrimary = hostPrimary;
            _resultValue.hostSecondary = hostSecondary;
            _resultValue.id = id;
            _resultValue.instanceUri = instanceUri;
            _resultValue.label = label;
            _resultValue.region = region;
            _resultValue.replicationType = replicationType;
            _resultValue.sslConnection = sslConnection;
            _resultValue.status = status;
            _resultValue.type = type;
            _resultValue.updated = updated;
            _resultValue.version = version;
            return _resultValue;
        }
    }
}
