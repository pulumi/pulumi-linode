// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class DatabaseAccessControlsArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatabaseAccessControlsArgs Empty = new DatabaseAccessControlsArgs();

    /**
     * A list of IP addresses that can access the Managed Database. Each item can be a single IP address or a range in CIDR format.
     * 
     */
    @Import(name="allowLists", required=true)
    private Output<List<String>> allowLists;

    /**
     * @return A list of IP addresses that can access the Managed Database. Each item can be a single IP address or a range in CIDR format.
     * 
     */
    public Output<List<String>> allowLists() {
        return this.allowLists;
    }

    /**
     * The unique ID of the target database.
     * 
     */
    @Import(name="databaseId", required=true)
    private Output<Integer> databaseId;

    /**
     * @return The unique ID of the target database.
     * 
     */
    public Output<Integer> databaseId() {
        return this.databaseId;
    }

    /**
     * The unique type of the target database. (`mysql`, `mongodb`, `postgresql`)
     * 
     */
    @Import(name="databaseType", required=true)
    private Output<String> databaseType;

    /**
     * @return The unique type of the target database. (`mysql`, `mongodb`, `postgresql`)
     * 
     */
    public Output<String> databaseType() {
        return this.databaseType;
    }

    private DatabaseAccessControlsArgs() {}

    private DatabaseAccessControlsArgs(DatabaseAccessControlsArgs $) {
        this.allowLists = $.allowLists;
        this.databaseId = $.databaseId;
        this.databaseType = $.databaseType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatabaseAccessControlsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatabaseAccessControlsArgs $;

        public Builder() {
            $ = new DatabaseAccessControlsArgs();
        }

        public Builder(DatabaseAccessControlsArgs defaults) {
            $ = new DatabaseAccessControlsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowLists A list of IP addresses that can access the Managed Database. Each item can be a single IP address or a range in CIDR format.
         * 
         * @return builder
         * 
         */
        public Builder allowLists(Output<List<String>> allowLists) {
            $.allowLists = allowLists;
            return this;
        }

        /**
         * @param allowLists A list of IP addresses that can access the Managed Database. Each item can be a single IP address or a range in CIDR format.
         * 
         * @return builder
         * 
         */
        public Builder allowLists(List<String> allowLists) {
            return allowLists(Output.of(allowLists));
        }

        /**
         * @param allowLists A list of IP addresses that can access the Managed Database. Each item can be a single IP address or a range in CIDR format.
         * 
         * @return builder
         * 
         */
        public Builder allowLists(String... allowLists) {
            return allowLists(List.of(allowLists));
        }

        /**
         * @param databaseId The unique ID of the target database.
         * 
         * @return builder
         * 
         */
        public Builder databaseId(Output<Integer> databaseId) {
            $.databaseId = databaseId;
            return this;
        }

        /**
         * @param databaseId The unique ID of the target database.
         * 
         * @return builder
         * 
         */
        public Builder databaseId(Integer databaseId) {
            return databaseId(Output.of(databaseId));
        }

        /**
         * @param databaseType The unique type of the target database. (`mysql`, `mongodb`, `postgresql`)
         * 
         * @return builder
         * 
         */
        public Builder databaseType(Output<String> databaseType) {
            $.databaseType = databaseType;
            return this;
        }

        /**
         * @param databaseType The unique type of the target database. (`mysql`, `mongodb`, `postgresql`)
         * 
         * @return builder
         * 
         */
        public Builder databaseType(String databaseType) {
            return databaseType(Output.of(databaseType));
        }

        public DatabaseAccessControlsArgs build() {
            if ($.allowLists == null) {
                throw new MissingRequiredPropertyException("DatabaseAccessControlsArgs", "allowLists");
            }
            if ($.databaseId == null) {
                throw new MissingRequiredPropertyException("DatabaseAccessControlsArgs", "databaseId");
            }
            if ($.databaseType == null) {
                throw new MissingRequiredPropertyException("DatabaseAccessControlsArgs", "databaseType");
            }
            return $;
        }
    }

}
