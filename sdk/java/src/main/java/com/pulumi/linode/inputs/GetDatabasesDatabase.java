// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetDatabasesDatabase extends com.pulumi.resources.InvokeArgs {

    public static final GetDatabasesDatabase Empty = new GetDatabasesDatabase();

    /**
     * A list of IP addresses that can access the Managed Database.
     * 
     */
    @Import(name="allowLists", required=true)
    private List<String> allowLists;

    /**
     * @return A list of IP addresses that can access the Managed Database.
     * 
     */
    public List<String> allowLists() {
        return this.allowLists;
    }

    /**
     * The number of Linode Instance nodes deployed to the Managed Database.
     * 
     */
    @Import(name="clusterSize", required=true)
    private Integer clusterSize;

    /**
     * @return The number of Linode Instance nodes deployed to the Managed Database.
     * 
     */
    public Integer clusterSize() {
        return this.clusterSize;
    }

    /**
     * When this Managed Database was created.
     * 
     */
    @Import(name="created", required=true)
    private String created;

    /**
     * @return When this Managed Database was created.
     * 
     */
    public String created() {
        return this.created;
    }

    /**
     * Whether the Managed Databases is encrypted.
     * 
     */
    @Import(name="encrypted", required=true)
    private Boolean encrypted;

    /**
     * @return Whether the Managed Databases is encrypted.
     * 
     */
    public Boolean encrypted() {
        return this.encrypted;
    }

    /**
     * The Managed Database engine.
     * 
     */
    @Import(name="engine", required=true)
    private String engine;

    /**
     * @return The Managed Database engine.
     * 
     */
    public String engine() {
        return this.engine;
    }

    /**
     * The primary host for the Managed Database.
     * 
     */
    @Import(name="hostPrimary", required=true)
    private String hostPrimary;

    /**
     * @return The primary host for the Managed Database.
     * 
     */
    public String hostPrimary() {
        return this.hostPrimary;
    }

    /**
     * The secondary/private network host for the Managed Database.
     * 
     */
    @Import(name="hostSecondary", required=true)
    private String hostSecondary;

    /**
     * @return The secondary/private network host for the Managed Database.
     * 
     */
    public String hostSecondary() {
        return this.hostSecondary;
    }

    /**
     * The ID of the Managed Database.
     * 
     */
    @Import(name="id", required=true)
    private Integer id;

    /**
     * @return The ID of the Managed Database.
     * 
     */
    public Integer id() {
        return this.id;
    }

    @Import(name="instanceUri", required=true)
    private String instanceUri;

    public String instanceUri() {
        return this.instanceUri;
    }

    /**
     * A unique, user-defined string referring to the Managed Database.
     * 
     */
    @Import(name="label", required=true)
    private String label;

    /**
     * @return A unique, user-defined string referring to the Managed Database.
     * 
     */
    public String label() {
        return this.label;
    }

    /**
     * The region to use for the Managed Database.
     * 
     */
    @Import(name="region", required=true)
    private String region;

    /**
     * @return The region to use for the Managed Database.
     * 
     */
    public String region() {
        return this.region;
    }

    /**
     * The replication method used for the Managed Database.
     * 
     */
    @Import(name="replicationType", required=true)
    private String replicationType;

    /**
     * @return The replication method used for the Managed Database.
     * 
     */
    public String replicationType() {
        return this.replicationType;
    }

    /**
     * Whether to require SSL credentials to establish a connection to the Managed Database.
     * 
     */
    @Import(name="sslConnection", required=true)
    private Boolean sslConnection;

    /**
     * @return Whether to require SSL credentials to establish a connection to the Managed Database.
     * 
     */
    public Boolean sslConnection() {
        return this.sslConnection;
    }

    /**
     * The operating status of the Managed Database.
     * 
     */
    @Import(name="status", required=true)
    private String status;

    /**
     * @return The operating status of the Managed Database.
     * 
     */
    public String status() {
        return this.status;
    }

    /**
     * The Linode Instance type used for the nodes of the  Managed Database instance.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return The Linode Instance type used for the nodes of the  Managed Database instance.
     * 
     */
    public String type() {
        return this.type;
    }

    /**
     * When this Managed Database was last updated.
     * 
     */
    @Import(name="updated", required=true)
    private String updated;

    /**
     * @return When this Managed Database was last updated.
     * 
     */
    public String updated() {
        return this.updated;
    }

    /**
     * The Managed Database engine version.
     * 
     */
    @Import(name="version", required=true)
    private String version;

    /**
     * @return The Managed Database engine version.
     * 
     */
    public String version() {
        return this.version;
    }

    private GetDatabasesDatabase() {}

    private GetDatabasesDatabase(GetDatabasesDatabase $) {
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
    public static Builder builder(GetDatabasesDatabase defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDatabasesDatabase $;

        public Builder() {
            $ = new GetDatabasesDatabase();
        }

        public Builder(GetDatabasesDatabase defaults) {
            $ = new GetDatabasesDatabase(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowLists A list of IP addresses that can access the Managed Database.
         * 
         * @return builder
         * 
         */
        public Builder allowLists(List<String> allowLists) {
            $.allowLists = allowLists;
            return this;
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
        public Builder clusterSize(Integer clusterSize) {
            $.clusterSize = clusterSize;
            return this;
        }

        /**
         * @param created When this Managed Database was created.
         * 
         * @return builder
         * 
         */
        public Builder created(String created) {
            $.created = created;
            return this;
        }

        /**
         * @param encrypted Whether the Managed Databases is encrypted.
         * 
         * @return builder
         * 
         */
        public Builder encrypted(Boolean encrypted) {
            $.encrypted = encrypted;
            return this;
        }

        /**
         * @param engine The Managed Database engine.
         * 
         * @return builder
         * 
         */
        public Builder engine(String engine) {
            $.engine = engine;
            return this;
        }

        /**
         * @param hostPrimary The primary host for the Managed Database.
         * 
         * @return builder
         * 
         */
        public Builder hostPrimary(String hostPrimary) {
            $.hostPrimary = hostPrimary;
            return this;
        }

        /**
         * @param hostSecondary The secondary/private network host for the Managed Database.
         * 
         * @return builder
         * 
         */
        public Builder hostSecondary(String hostSecondary) {
            $.hostSecondary = hostSecondary;
            return this;
        }

        /**
         * @param id The ID of the Managed Database.
         * 
         * @return builder
         * 
         */
        public Builder id(Integer id) {
            $.id = id;
            return this;
        }

        public Builder instanceUri(String instanceUri) {
            $.instanceUri = instanceUri;
            return this;
        }

        /**
         * @param label A unique, user-defined string referring to the Managed Database.
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            $.label = label;
            return this;
        }

        /**
         * @param region The region to use for the Managed Database.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            $.region = region;
            return this;
        }

        /**
         * @param replicationType The replication method used for the Managed Database.
         * 
         * @return builder
         * 
         */
        public Builder replicationType(String replicationType) {
            $.replicationType = replicationType;
            return this;
        }

        /**
         * @param sslConnection Whether to require SSL credentials to establish a connection to the Managed Database.
         * 
         * @return builder
         * 
         */
        public Builder sslConnection(Boolean sslConnection) {
            $.sslConnection = sslConnection;
            return this;
        }

        /**
         * @param status The operating status of the Managed Database.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            $.status = status;
            return this;
        }

        /**
         * @param type The Linode Instance type used for the nodes of the  Managed Database instance.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        /**
         * @param updated When this Managed Database was last updated.
         * 
         * @return builder
         * 
         */
        public Builder updated(String updated) {
            $.updated = updated;
            return this;
        }

        /**
         * @param version The Managed Database engine version.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            $.version = version;
            return this;
        }

        public GetDatabasesDatabase build() {
            if ($.allowLists == null) {
                throw new MissingRequiredPropertyException("GetDatabasesDatabase", "allowLists");
            }
            if ($.clusterSize == null) {
                throw new MissingRequiredPropertyException("GetDatabasesDatabase", "clusterSize");
            }
            if ($.created == null) {
                throw new MissingRequiredPropertyException("GetDatabasesDatabase", "created");
            }
            if ($.encrypted == null) {
                throw new MissingRequiredPropertyException("GetDatabasesDatabase", "encrypted");
            }
            if ($.engine == null) {
                throw new MissingRequiredPropertyException("GetDatabasesDatabase", "engine");
            }
            if ($.hostPrimary == null) {
                throw new MissingRequiredPropertyException("GetDatabasesDatabase", "hostPrimary");
            }
            if ($.hostSecondary == null) {
                throw new MissingRequiredPropertyException("GetDatabasesDatabase", "hostSecondary");
            }
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetDatabasesDatabase", "id");
            }
            if ($.instanceUri == null) {
                throw new MissingRequiredPropertyException("GetDatabasesDatabase", "instanceUri");
            }
            if ($.label == null) {
                throw new MissingRequiredPropertyException("GetDatabasesDatabase", "label");
            }
            if ($.region == null) {
                throw new MissingRequiredPropertyException("GetDatabasesDatabase", "region");
            }
            if ($.replicationType == null) {
                throw new MissingRequiredPropertyException("GetDatabasesDatabase", "replicationType");
            }
            if ($.sslConnection == null) {
                throw new MissingRequiredPropertyException("GetDatabasesDatabase", "sslConnection");
            }
            if ($.status == null) {
                throw new MissingRequiredPropertyException("GetDatabasesDatabase", "status");
            }
            if ($.type == null) {
                throw new MissingRequiredPropertyException("GetDatabasesDatabase", "type");
            }
            if ($.updated == null) {
                throw new MissingRequiredPropertyException("GetDatabasesDatabase", "updated");
            }
            if ($.version == null) {
                throw new MissingRequiredPropertyException("GetDatabasesDatabase", "version");
            }
            return $;
        }
    }

}
