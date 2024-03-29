// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.linode.inputs.GetDatabaseBackupsBackupArgs;
import com.pulumi.linode.inputs.GetDatabaseBackupsFilterArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDatabaseBackupsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDatabaseBackupsArgs Empty = new GetDatabaseBackupsArgs();

    @Import(name="backups")
    private @Nullable Output<List<GetDatabaseBackupsBackupArgs>> backups;

    public Optional<Output<List<GetDatabaseBackupsBackupArgs>>> backups() {
        return Optional.ofNullable(this.backups);
    }

    /**
     * The ID of the database to retrieve backups for.
     * 
     */
    @Import(name="databaseId", required=true)
    private Output<Integer> databaseId;

    /**
     * @return The ID of the database to retrieve backups for.
     * 
     */
    public Output<Integer> databaseId() {
        return this.databaseId;
    }

    /**
     * The type of the database to retrieve backups for. (`mysql`, `postgresql`)
     * 
     */
    @Import(name="databaseType", required=true)
    private Output<String> databaseType;

    /**
     * @return The type of the database to retrieve backups for. (`mysql`, `postgresql`)
     * 
     */
    public Output<String> databaseType() {
        return this.databaseType;
    }

    @Import(name="filters")
    private @Nullable Output<List<GetDatabaseBackupsFilterArgs>> filters;

    public Optional<Output<List<GetDatabaseBackupsFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * If true, only the latest backup will be returned.
     * 
     * * `filter` - (Optional) A set of filters used to select database backups that meet certain requirements.
     * 
     */
    @Import(name="latest")
    private @Nullable Output<Boolean> latest;

    /**
     * @return If true, only the latest backup will be returned.
     * 
     * * `filter` - (Optional) A set of filters used to select database backups that meet certain requirements.
     * 
     */
    public Optional<Output<Boolean>> latest() {
        return Optional.ofNullable(this.latest);
    }

    /**
     * The order in which results should be returned. (`asc`, `desc`; default `asc`)
     * 
     */
    @Import(name="order")
    private @Nullable Output<String> order;

    /**
     * @return The order in which results should be returned. (`asc`, `desc`; default `asc`)
     * 
     */
    public Optional<Output<String>> order() {
        return Optional.ofNullable(this.order);
    }

    /**
     * The attribute to order the results by. (`created`)
     * 
     */
    @Import(name="orderBy")
    private @Nullable Output<String> orderBy;

    /**
     * @return The attribute to order the results by. (`created`)
     * 
     */
    public Optional<Output<String>> orderBy() {
        return Optional.ofNullable(this.orderBy);
    }

    private GetDatabaseBackupsArgs() {}

    private GetDatabaseBackupsArgs(GetDatabaseBackupsArgs $) {
        this.backups = $.backups;
        this.databaseId = $.databaseId;
        this.databaseType = $.databaseType;
        this.filters = $.filters;
        this.latest = $.latest;
        this.order = $.order;
        this.orderBy = $.orderBy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDatabaseBackupsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDatabaseBackupsArgs $;

        public Builder() {
            $ = new GetDatabaseBackupsArgs();
        }

        public Builder(GetDatabaseBackupsArgs defaults) {
            $ = new GetDatabaseBackupsArgs(Objects.requireNonNull(defaults));
        }

        public Builder backups(@Nullable Output<List<GetDatabaseBackupsBackupArgs>> backups) {
            $.backups = backups;
            return this;
        }

        public Builder backups(List<GetDatabaseBackupsBackupArgs> backups) {
            return backups(Output.of(backups));
        }

        public Builder backups(GetDatabaseBackupsBackupArgs... backups) {
            return backups(List.of(backups));
        }

        /**
         * @param databaseId The ID of the database to retrieve backups for.
         * 
         * @return builder
         * 
         */
        public Builder databaseId(Output<Integer> databaseId) {
            $.databaseId = databaseId;
            return this;
        }

        /**
         * @param databaseId The ID of the database to retrieve backups for.
         * 
         * @return builder
         * 
         */
        public Builder databaseId(Integer databaseId) {
            return databaseId(Output.of(databaseId));
        }

        /**
         * @param databaseType The type of the database to retrieve backups for. (`mysql`, `postgresql`)
         * 
         * @return builder
         * 
         */
        public Builder databaseType(Output<String> databaseType) {
            $.databaseType = databaseType;
            return this;
        }

        /**
         * @param databaseType The type of the database to retrieve backups for. (`mysql`, `postgresql`)
         * 
         * @return builder
         * 
         */
        public Builder databaseType(String databaseType) {
            return databaseType(Output.of(databaseType));
        }

        public Builder filters(@Nullable Output<List<GetDatabaseBackupsFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(List<GetDatabaseBackupsFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        public Builder filters(GetDatabaseBackupsFilterArgs... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param latest If true, only the latest backup will be returned.
         * 
         * * `filter` - (Optional) A set of filters used to select database backups that meet certain requirements.
         * 
         * @return builder
         * 
         */
        public Builder latest(@Nullable Output<Boolean> latest) {
            $.latest = latest;
            return this;
        }

        /**
         * @param latest If true, only the latest backup will be returned.
         * 
         * * `filter` - (Optional) A set of filters used to select database backups that meet certain requirements.
         * 
         * @return builder
         * 
         */
        public Builder latest(Boolean latest) {
            return latest(Output.of(latest));
        }

        /**
         * @param order The order in which results should be returned. (`asc`, `desc`; default `asc`)
         * 
         * @return builder
         * 
         */
        public Builder order(@Nullable Output<String> order) {
            $.order = order;
            return this;
        }

        /**
         * @param order The order in which results should be returned. (`asc`, `desc`; default `asc`)
         * 
         * @return builder
         * 
         */
        public Builder order(String order) {
            return order(Output.of(order));
        }

        /**
         * @param orderBy The attribute to order the results by. (`created`)
         * 
         * @return builder
         * 
         */
        public Builder orderBy(@Nullable Output<String> orderBy) {
            $.orderBy = orderBy;
            return this;
        }

        /**
         * @param orderBy The attribute to order the results by. (`created`)
         * 
         * @return builder
         * 
         */
        public Builder orderBy(String orderBy) {
            return orderBy(Output.of(orderBy));
        }

        public GetDatabaseBackupsArgs build() {
            if ($.databaseId == null) {
                throw new MissingRequiredPropertyException("GetDatabaseBackupsArgs", "databaseId");
            }
            if ($.databaseType == null) {
                throw new MissingRequiredPropertyException("GetDatabaseBackupsArgs", "databaseType");
            }
            return $;
        }
    }

}
