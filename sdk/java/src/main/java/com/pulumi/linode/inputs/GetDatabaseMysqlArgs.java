// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.linode.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDatabaseMysqlArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDatabaseMysqlArgs Empty = new GetDatabaseMysqlArgs();

    /**
     * The ID of the MySQL database. Deprecated: Use id instead.
     * 
     * @deprecated
     * Configure `id` instead. This attribute will be removed in the next major version of the provider.
     * 
     */
    @Deprecated /* Configure `id` instead. This attribute will be removed in the next major version of the provider. */
    @Import(name="databaseId")
    private @Nullable Output<Integer> databaseId;

    /**
     * @return The ID of the MySQL database. Deprecated: Use id instead.
     * 
     * @deprecated
     * Configure `id` instead. This attribute will be removed in the next major version of the provider.
     * 
     */
    @Deprecated /* Configure `id` instead. This attribute will be removed in the next major version of the provider. */
    public Optional<Output<Integer>> databaseId() {
        return Optional.ofNullable(this.databaseId);
    }

    /**
     * The ID of the MySQL database. Mutually exclusive with `database_id`.
     * 
     */
    @Import(name="id")
    private @Nullable Output<Integer> id;

    /**
     * @return The ID of the MySQL database. Mutually exclusive with `database_id`.
     * 
     */
    public Optional<Output<Integer>> id() {
        return Optional.ofNullable(this.id);
    }

    private GetDatabaseMysqlArgs() {}

    private GetDatabaseMysqlArgs(GetDatabaseMysqlArgs $) {
        this.databaseId = $.databaseId;
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDatabaseMysqlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDatabaseMysqlArgs $;

        public Builder() {
            $ = new GetDatabaseMysqlArgs();
        }

        public Builder(GetDatabaseMysqlArgs defaults) {
            $ = new GetDatabaseMysqlArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param databaseId The ID of the MySQL database. Deprecated: Use id instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Configure `id` instead. This attribute will be removed in the next major version of the provider.
         * 
         */
        @Deprecated /* Configure `id` instead. This attribute will be removed in the next major version of the provider. */
        public Builder databaseId(@Nullable Output<Integer> databaseId) {
            $.databaseId = databaseId;
            return this;
        }

        /**
         * @param databaseId The ID of the MySQL database. Deprecated: Use id instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Configure `id` instead. This attribute will be removed in the next major version of the provider.
         * 
         */
        @Deprecated /* Configure `id` instead. This attribute will be removed in the next major version of the provider. */
        public Builder databaseId(Integer databaseId) {
            return databaseId(Output.of(databaseId));
        }

        /**
         * @param id The ID of the MySQL database. Mutually exclusive with `database_id`.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<Integer> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of the MySQL database. Mutually exclusive with `database_id`.
         * 
         * @return builder
         * 
         */
        public Builder id(Integer id) {
            return id(Output.of(id));
        }

        public GetDatabaseMysqlArgs build() {
            return $;
        }
    }

}
