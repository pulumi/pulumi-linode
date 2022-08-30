// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDatabaseMysqlBackupsBackup {
    /**
     * @return A time value given in a combined date and time format that represents when the database backup was created.
     * 
     */
    private String created;
    /**
     * @return The ID of the database backup object.
     * 
     */
    private Integer id;
    /**
     * @return The database backup’s label, for display purposes only.
     * 
     */
    private String label;
    /**
     * @return The type of database backup, determined by how the backup was created.
     * 
     */
    private String type;

    private GetDatabaseMysqlBackupsBackup() {}
    /**
     * @return A time value given in a combined date and time format that represents when the database backup was created.
     * 
     */
    public String created() {
        return this.created;
    }
    /**
     * @return The ID of the database backup object.
     * 
     */
    public Integer id() {
        return this.id;
    }
    /**
     * @return The database backup’s label, for display purposes only.
     * 
     */
    public String label() {
        return this.label;
    }
    /**
     * @return The type of database backup, determined by how the backup was created.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatabaseMysqlBackupsBackup defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String created;
        private Integer id;
        private String label;
        private String type;
        public Builder() {}
        public Builder(GetDatabaseMysqlBackupsBackup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.created = defaults.created;
    	      this.id = defaults.id;
    	      this.label = defaults.label;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder created(String created) {
            this.created = Objects.requireNonNull(created);
            return this;
        }
        @CustomType.Setter
        public Builder id(Integer id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder label(String label) {
            this.label = Objects.requireNonNull(label);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetDatabaseMysqlBackupsBackup build() {
            final var o = new GetDatabaseMysqlBackupsBackup();
            o.created = created;
            o.id = id;
            o.label = label;
            o.type = type;
            return o;
        }
    }
}
