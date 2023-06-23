// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetDatabaseBackupsBackup extends com.pulumi.resources.InvokeArgs {

    public static final GetDatabaseBackupsBackup Empty = new GetDatabaseBackupsBackup();

    /**
     * A time value given in a combined date and time format that represents when the database backup was created.
     * 
     */
    @Import(name="created", required=true)
    private String created;

    /**
     * @return A time value given in a combined date and time format that represents when the database backup was created.
     * 
     */
    public String created() {
        return this.created;
    }

    /**
     * The ID of the database backup object.
     * 
     */
    @Import(name="id", required=true)
    private Integer id;

    /**
     * @return The ID of the database backup object.
     * 
     */
    public Integer id() {
        return this.id;
    }

    /**
     * The database backup’s label, for display purposes only.
     * 
     */
    @Import(name="label", required=true)
    private String label;

    /**
     * @return The database backup’s label, for display purposes only.
     * 
     */
    public String label() {
        return this.label;
    }

    /**
     * The type of database backup, determined by how the backup was created.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return The type of database backup, determined by how the backup was created.
     * 
     */
    public String type() {
        return this.type;
    }

    private GetDatabaseBackupsBackup() {}

    private GetDatabaseBackupsBackup(GetDatabaseBackupsBackup $) {
        this.created = $.created;
        this.id = $.id;
        this.label = $.label;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDatabaseBackupsBackup defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDatabaseBackupsBackup $;

        public Builder() {
            $ = new GetDatabaseBackupsBackup();
        }

        public Builder(GetDatabaseBackupsBackup defaults) {
            $ = new GetDatabaseBackupsBackup(Objects.requireNonNull(defaults));
        }

        /**
         * @param created A time value given in a combined date and time format that represents when the database backup was created.
         * 
         * @return builder
         * 
         */
        public Builder created(String created) {
            $.created = created;
            return this;
        }

        /**
         * @param id The ID of the database backup object.
         * 
         * @return builder
         * 
         */
        public Builder id(Integer id) {
            $.id = id;
            return this;
        }

        /**
         * @param label The database backup’s label, for display purposes only.
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            $.label = label;
            return this;
        }

        /**
         * @param type The type of database backup, determined by how the backup was created.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public GetDatabaseBackupsBackup build() {
            $.created = Objects.requireNonNull($.created, "expected parameter 'created' to be non-null");
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.label = Objects.requireNonNull($.label, "expected parameter 'label' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
